# How-to reset remote branch to a previous commit

1. Find the commit hash:

    ```shell
    git log
    ```

2. Reset to the previous commit:
    
    ```shell
    git reset --hard 59e5056b4fe8c14665fa7949ab1e881ffcda3c97
    ```

3. Force push to remote:

    ```shell
    git push origin HEAD --force
    ```

4. Enter Username and Password (Personal Access Token) when prompted:
    
    ```shell
    Username for 'https://github.com': ibanFR
    Password for 'https://ibanFR@github.com': 
    Total 0 (delta 0), reused 0 (delta 0), pack-reused 0
    To https://github.com/ibanFR/semantic-versioning-kata.git
     + 9cb8bb8...c5e64bb HEAD -> main (forced update)
    ```