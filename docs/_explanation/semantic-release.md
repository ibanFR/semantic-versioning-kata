---
title: Semantic Release
---

# Semantic Release

This repository uses [Semantic Release] to automate the release process of the LiftButton. 

Even though semantic-release is a Node CLI application, it can be used to manage releases for projects in any
programming language.

See [Can I use semantic-release to publish non-JavaScript packages?] in the semantic-release documentation for more details.

## Configuration

This repository is pre-configured to release on every commit added to the `main` branch if there are code changes
since the last release that affect the software functionalities.

The configuration for Semantic Release is located in a `.releaserc.json` file within each programming language 
folder of the repository.

For more information on how to customize the configuration, refer to [semantic-release usage configuration].

## Initial release

Start by making your first commit with the code for the first feature . For example:

```
feat: first feature for your software
```

## Releasing a bug fix

When you want to release a bug fix, simply make a commit to `main` with the message:

```
fix: correct typo in user interface
```

## Releasing a feature

When you want to release a new feature, simply make a commit to `main` with the message:

```
feat: add new user authentication module
```

[Semantic Release]: https://semantic-release.gitbook.io/semantic-release/
[Can I use semantic-release to publish non-JavaScript packages?]: https://semantic-release.gitbook.io/semantic-release/support/faq#can-i-use-semantic-release-to-publish-non-javascript-packages
[semantic-release usage configuration]: https://semantic-release.gitbook.io/semantic-release/usage/configuration
[CI configurations]: https://semantic-release.gitbook.io/semantic-release/recipes/ci-configurations/github-actions