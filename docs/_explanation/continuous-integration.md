---
title: Continuous Integration
---

# Continuous Integration

This project uses GitHub Actions for Continuous Integration and Continuous Deployment (CI/CD).

## Release workflow

The `.github/workflows/release.yml` workflow is configured to automate the release process for the project when changes
are pushed to the `main` branch.

It checks out the code, runs Maven tests, and then uses `semantic-release` to publish a new release
to GitHub. 

It uses appropriate permissions for contents, issues, pull requests, and OIDC for provenance.

## Pages workflow

The `.github/workflows/pages.yml` workflow is configured to automatically build and deploy the site documentation to
GitHub Pages whenever changes are pushed to the `main` branch.

[Using secrets in GitHub Actions]: https://docs.github.com/en/actions/security-for-github-actions/security-guides/using-secrets-in-github-actions


