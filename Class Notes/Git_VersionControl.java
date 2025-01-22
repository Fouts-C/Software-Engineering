/*  

*Git & Version Control*

- Version Control System:
    -A tool that manages changes to your code. It tracks of every modification
    -collaborate with others & see who made specific changes EX: Git

Git commands:

git.init -> initializes an empty repository

git remote add origin https://github.com/your-username/your-repo.git


Create File:
echo hello > file1.txt
echo hi > file2.txt

Adding Files:
git add "Class Notes/Git_VersionControl.java"
git add "Class Notes/"
git add file1.txt

Git Steps:
git status 
git commit -m "initial commit"
git branch -M main
git push -u origin remote

Branching:
git checkout -b <branch-name>
git push -u origin <branch-name>
git fetch
git branch -a [should then show the branch]
# branch you want to work on
git checkout <branch-name>

Merging a branch into main:
git checkout main
git merge <branch-name>

-Should go to GitHub project, make a pull request

Archiving Branches: 
- Sometimes we don't want to delete files even though they are not used they can be recovered

git tag archive/<branchname> <branchname>   #saves this current branch under the tag archive/<branchname>
git branch -D <branchname>                  #deletes the branch locally
git branch -d -r origin/<branchname>        #deletes the remote branch locally
git push --tags                             #pushes the archive/<branchname> tag to GitHub
git push origin :<branchname>               #deletes the branch on github

Restoring archived branch
git checkout -b <branchname> archive/<branchname> 


*/