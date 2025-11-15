# How-to delete all releases from a GitHub repository

To reset the history of a GitHub repository and delete all releases, you can follow the steps below:

1. **Generate a Personal Access Token (PAT)**:
    - Go to your GitHub account settings.
    - Navigate to "Developer settings" > "Personal access tokens".
    - Click on "Generate new token", provide necessary permissions (at least `repo` scope), and generate the token. Make sure to copy it as you won't be able to see it again.

2. **Set the Personal Access Token as an environment variable**:

    ```shell
     export TOKEN="your_personal_access_token_here"
    ```

3. **Use GitHub API to delete all releases**:

    ```shell
    OWNER="ibanFR"
    REPO="semantic-versioning-kata"
    
    curl -s -H "Authorization: token $TOKEN" \
      "https://api.github.com/repos/$OWNER/$REPO/releases" \
    | grep '"id":' | awk '{print $2}' | tr -d ',' \
    | while read id; do
        echo "Deleting release $id"
        curl -s -X DELETE -H "Authorization: token $TOKEN" \
          "https://api.github.com/repos/$OWNER/$REPO/releases/$id"
      done
    ```

4. **Delete all tags associated with the releases**:

    ```shell
    OWNER="ibanFR"
    REPO="semantic-versioning-kata"
    
    curl -s -H "Authorization: token $TOKEN" \
    "https://api.github.com/repos/$OWNER/$REPO/tags" \
    | grep '"name":' \
    | awk -F '"' '{print $4}' \
    | while read tag; do
    echo "Deleting tag $tag"
    curl -s -X DELETE \
    -H "Authorization: token $TOKEN" \
    "https://api.github.com/repos/$OWNER/$REPO/git/refs/tags/$tag"
    done
   ```
     
