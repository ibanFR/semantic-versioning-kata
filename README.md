# Semantic Versioning Kata

Use [SemVer](https://semver.org/) specification to automate the release of your software while solving the Lift Button kata.

### Commit message format

The commit message must be in the following format:

```
<type>: <subject>
<BLANK LINE>
<optional body>
<BLANK LINE>
<optional footer>
```

### Commit message types

Must be one of the following:

| Type         | Description                                                                             |
|--------------|-----------------------------------------------------------------------------------------|
| **feat**     | A new feature                                                                           |
| **fix**      | A bug fix                                                                               |
| **refactor** | A code change that neither fixes a bug nor adds a feature                               |
| **test**     | Adding missing tests or correcting existing tests                                       |
| **docs**     | Documentation only changes                                                              |
| **build**    | Changes that affect the build system or external dependencies (pom.xml, etc)            |
| **ci**       | Changes to our CI configuration files and scripts (examples: Github Actions, SauceLabs) |

## Automate Release process

Automate the release process using [GitHub Actions](https://github.com/ibanFR/semantic-versioning-kata/actions) and
[Semantic Release](https://semantic-release.gitbook.io/semantic-release). This will allow you to automatically create a
release when you push to the main branch.

## Lift Button - PART ONE

You have been provided with an initial TEST LIST for the Lift Button kata:

```java
//TEST LIST
//[] - doors should be OPEN when Lift is created
//[] - should CLOSE the lift doors
//[] - should switch lights ON when button is pressed
//[] - should OPEN the lift doors when lift arrives
//[] - should switch OFF the lights when doors OPEN/lift arrives
//[] - lights should be ON when button is pressed AND doors are CLOSED
//[] - lights should be OFF when button is pressed AND doors are OPEN
```

Use commit messages to increment the versions of your software while solving the Lift Button kata.
See [Lift Button](src/test/java/com/ibanfr/liftbutton/readme.md) for the full details of the kata.

## Lift Button - PART TWO
Force a BREAKING CHANGE




