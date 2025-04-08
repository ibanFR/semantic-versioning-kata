# Semantic Versioning Kata

Use SemVer to version your code and automate the release process for the Lift Button kata.

## Lift Button

You have been provided with an initial TEST LIST for the Lift Button code kata:

```
    //TEST LIST
    // [] - doors should be CLOSED when lift is created
    // [] - lights should be OFF when lift is created
    // [] - should OPEN the lift doors
    // [] - press button when lift doors CLOSED: light should turn ON
    // [] - press button when light already ON and doors CLOSED: light should stay ON
    // [] - when doors OPEN light should turn OFF
    // [] - press button when lift doors OPEN: light should be OFF
```

See [Lift Button](src/test/java/ie/etu/liftbutton/readme.md) for the full kata description.

## Semantic Versioning

Use commit messages to increment the versions of your software while solving the Lift Button code kata.

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

Check GitHub Actions to verify automated releases created by your commit messages.


