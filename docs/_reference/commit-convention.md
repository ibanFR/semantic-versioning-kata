---
title: Commit Message Convention
---

# Commit Message Convention
{: .no_toc }

This repository uses a standardized Commit Message Convention to communicate changes to the LiftButton software.
{: .fs-6 .fw-300 }

The team follows a standardized **Commit Message Convention** to ensure clarity and consistency in our versioning and
release process.

## Table of Contents
{: .no_toc .text-delta }

1. TOC
{:toc}

## Commit Message Format

Each commit message should adhere to the following format:

```
<header>
<BLANK LINE>
<optional body>
<BLANK LINE>
<optional footer>
```
## Commit Message Header

The commit message header must conform to the following format:

```
<type>: <summary>
  │         │
  │         └─⫸ Summary in present tense. Not capitalized. No period at the end.
  │       
  └─⫸ Commit Type: build|ci|docs|feat|fix|refactor|test
```


## Commit Message Type

Must be one of the following types:

| Type         | Description                                                                                                |
|--------------|------------------------------------------------------------------------------------------------------------|
| **feat**     | A new feature                                                                                              |
| **fix**      | A bug fix                                                                                                  |
| **refactor** | A behavior preserving change (neither fixes a bug nor adds a feature)                                      |
| **test**     | Adding new tests or refactoring existing ones                                                              |
| **docs**     | Documentation only changes                                                                                 |
| **build**    | Changes that affect the build system or external dependencies (`pom.xml`,`.sln`,`.csproj` etc)             |
| **ci**       | Changes to our CI configuration files and scripts (`java.yml`, `updateVersion.sh`, `.releaserc.json`, etc) |


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
