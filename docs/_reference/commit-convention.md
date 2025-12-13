---
title: Commit Message Convention
---

# Commit Message Convention

The team follows a standardized commit message convention to ensure clarity and consistency in our versioning and
release process.
{: .fs-6 .fw-300 }

Each commit message should adhere to the following format:

| Type         | Description                                                                               |
|--------------|-------------------------------------------------------------------------------------------|
| **feat**     | A new feature                                                                             |
| **fix**      | A bug fix                                                                                 |
| **refactor** | A behavior preserving change (neither fixes a bug nor adds a feature)                     |
| **test**     | Adding new tests or refactoring existing ones                                             |
| **docs**     | Documentation only changes                                                                |
| **build**    | Changes that affect the build system or external dependencies (`pom.xml`, etc)            |
| **ci**       | Changes to our CI configuration files and scripts (`release.yml`, `.releaserc.json`, etc) |

## Initial release

Start by making your first commit with the code for the first feature . For example:

```
feat: first feature for your software
```

## Releasing a new feature

When you want to release a new feature, simply make a commit to `main` with the message:

```
feat: add new user authentication module
```

## Releasing a bug fix

When you want to release a bug fix, simply make a commit to `main` with the message:

```
fix: correct typo in user interface
```

## Releasing a BREAKING CHANGE

If your change introduces a breaking change, make a commit to `main` with the appropriate type and include a
`BREAKING CHANGE:` section in the commit message body or footer. For example:

```
feat: lift doors are open on lift creation

BREAKING CHANGE: Lift doors now remain open when the lift is initialized.
Users must update their code to accommodate this new behavior.
A new method 'closeDoors()' has been added to manually close the doors after lift creation.
```
