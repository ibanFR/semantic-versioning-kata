# Git command reference

This document provides a reference for common Git commands and their usage.

## Set up user.name and user.email

Check your Git configuration to ensure that your `user.name` and `user.email` are set correctly. This is important for commit attribution.

```shell
git config --get user.name 
git config --get user.email 
```

```shell
git config --global user.email ibanFR@users.noreply.github.com 
```

## Reset remote history to a previous commit

Find the commit hash:
```shell
git log
```

Reset to the previous commit:
```shell
git reset --hard 5e2a7b7645c63746e6f76a8def90576c7665e021
```

Force push to remote:
```shell
git push origin HEAD --force
```

Enter Username and Password (Personal Access Token) when prompted:
```shell
Username for 'https://github.com': ibanFR
Password for 'https://ibanFR@github.com': 
Total 0 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/ibanFR/semantic-versioning-kata.git
 + 9cb8bb8...c5e64bb HEAD -> main (forced update)
```

## Reset local branch to match a remote behind the local branch 

Say that someone has change the history of the remote branch and you want to reset your local branch to match the remote branch. This will discard any local changes and set your branch to the state of the remote branch.

```shell
git fetch origin
git reset --hard origin/main
```