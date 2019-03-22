# gitignoreDemo
Figuring out how on earth to configure dat gitignore!

## How To Use This Repo
Each branch is a different scenario with a .gitignore configured for that scenario. Read the branch names carefully to see if the scenario fits your needs!

## Things to Note
Some things to be aware of...

### These GitIgnore Files Are Designed to be Lightweight and Are Not Comprehensive
I created each .gitignore by 
- creating the project(s) specified in the branch name in the conditions specified 
- adding all files with only .DS_Store in the .gitignore
- identifying files/folders that did not belong in source control
- adding those files extensions/folder names to the .gitignore
- removing the unnecessary files from the git cache
- verifying that they are properly ignored

This means I thin-sliced the .gitignore--I only ignored the files that needed to be ignored NOW, rather than trying to cover all possible scenarios (which is what gitignore.io does for us).

### Project Types in This Repo
- Java using Gradle with IntelliJ
- Java using Maven with IntelliJ
- .NET Core with Rider

If your project is created using a non-JetBrains IDE, you will likely need to ignore different/additional files.

### Extra GitIgnore Files from "Helpful" IDEs

Some project templates (notably the Rider "ASP.NET Core with React") will create .gitignore files. If you plan to make the top-level .gitignore comprehensive (which is how this repo is set up) you will want to delete all other .gitignore files.
