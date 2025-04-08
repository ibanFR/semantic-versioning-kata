# Semantic Versioning Kata

Use SemVer to version your code and automate the release process for the Lift Button kata.

## Semantic Versioning

Use commit messages to increment the versions of your software.

### Commit message format
- The commit message must be in the format of `type: subject`.

## Lift Button

See [Lift Button](src/test/java/ie/etu/liftbutton/readme.md) for the details of the kata.

You have been provided with an initial TEST LIST:

```java
    //TEST LIST
    // [] - doors should be CLOSED when lift is created
    // [] - lights should be OFF when lift is created
    // [] - should open the lift doors
    // [] - press button when lift doors CLOSED: light should turn ON
    // [] - press button when light already ON and doors CLOSED : light should stay ON
    // [] - when doors OPEN light should turn OFF
    // [] - press button when lift doors open: light should be OFF

```

## Semantic Release
Semantic Release is a tool for automating the versioning and package publishing process. It uses Semantic Versioning to determine
the next version number based on the commit messages in your repository. This allows for a more predictable release
process and helps to ensure that your code is always in a releasable state.

### Github Actions Configuration

- https://semantic-release.gitbook.io/semantic-release/recipes/ci-configurations/github-actions


