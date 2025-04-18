# Configuration

## GitHub Actions Configuration
- https://docs.github.com/en/actions/security-for-github-actions/security-guides/using-secrets-in-github-actions

## Semantic Release CI Configuration
- https://semantic-release.gitbook.io/semantic-release/recipes/ci-configurations/github-actions

## Reset history to previous commit

- Find the commit hash:
```shell
git log
```
- Reset to the previous commit:
```shell
git reset --hard 1d8d505efffa299ab123a9a0447e6a2f27278f0e
```
- Force push to remote
```shell
git push origin HEAD --force
```
