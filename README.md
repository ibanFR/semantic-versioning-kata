# Semantic Versioning Kata

Learn how to apply [Semantic Versioning (SemVer)](https://semver.org/) to automate software releases by working through
the Lift Button Kata.

This code kata will help you understand versioning principles and integrate them into your development workflow.

## Commit message format

Follow the [Conventional Commits](https://www.conventionalcommits.org/en/v1.0.0/) format for commit messages to ensure
proper versioning:

```conventionalcommit
<type>: <subject>
<BLANK LINE>
<optional body>
<BLANK LINE>
<optional footer>
```
For example:
```conventionalcommit
feat: add lights() method to Lift class to query the light status
```

### Commit message types

Use one of the following types to categorize your changes:

| Type         | Description                                                                    |
|--------------|--------------------------------------------------------------------------------|
| **feat**     | A new feature                                                                  |
| **fix**      | A bug fix                                                                      |
| **refactor** | A code change that neither fixes a bug nor adds a feature                      |
| **test**     | Adding missing tests or correcting existing tests                              |
| **docs**     | Documentation only changes                                                     |
| **build**    | Changes that affect the build system or external dependencies (`pom.xml`, etc) |
| **ci**       | Changes to our CI configuration files and scripts (`release.yml`, etc)         |
| **chore**    | Other changes that don’t modify src or test files                              |

## Automated Release process

New features and fixes are immediately available to the users after a commit is pushed to the main branch.

This repository uses [Semantic Release](https://semantic-release.gitbook.io/semantic-release) to analyze commit 
messages, automatically determine the next semantic version, and publish a new release.

## Lift Button - Initial releases

You have been provided with an initial TEST LIST for the Lift Button kata:

```java
//TEST LIST
//[] - doors should be CLOSED when Lift is created
//[] - should switch lights ON when button is pressed
//[] - should OPEN the lift doors when lift arrives
//[] - should switch OFF the lights when lift arrives
//[] - lights should be OFF when button is pressed AND doors are OPEN
```

Use the provided test list to guide your implementation. Write one test at a time and commit your changes using semantic
commit messages.

Check your [repository's releases and tags](https://docs.github.com/en/repositories/releasing-projects-on-github/viewing-your-repositorys-releases-and-tags) after every commit to the main branch.

Refer to [Lift Button](src/test/java/com/ibanfr/liftbutton/readme.md) for detailed requirements.

## Lift Button - Releasing a breaking change

Following the release of version 1.y.z, customers raised a safety concern: the lift doors should not be closed when the 
lift is initialized! As a result, they have requested a change so that the doors remain open upon lift creation.

 This change may require users of
version v.1.y.z to modify their code to accommodate the new behavior, so it's a breaking change.

Update the code to implement the new requirement and release a new version of the Lift Button.

### Commit message footer
Use the commit footer to include information about breaking changes. For example:
```
BREAKING CHANGE: <breaking change summary>
<BLANK LINE>
<breaking change description + migration instructions>
```




