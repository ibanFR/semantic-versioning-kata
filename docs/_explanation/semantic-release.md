---
title: Semantic Release
nav_order: 2
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



[Semantic Release]: https://semantic-release.gitbook.io/semantic-release/
[Can I use semantic-release to publish non-JavaScript packages?]: https://semantic-release.gitbook.io/semantic-release/support/faq#can-i-use-semantic-release-to-publish-non-javascript-packages
[semantic-release usage configuration]: https://semantic-release.gitbook.io/semantic-release/usage/configuration
[CI configurations]: https://semantic-release.gitbook.io/semantic-release/recipes/ci-configurations/github-actions