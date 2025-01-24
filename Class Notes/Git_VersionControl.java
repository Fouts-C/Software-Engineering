/*  

*Git & Version Control*

- Version Control System:
    -A tool that manages changes to your code. It tracks of every modification
    -collaborate with others & see who made specific changes EX: Git

Git commands:

git.init  #initializes an empty repository

git remote add origin https://github.com/your-username/your-repo.git


Create File:
echo hello > file1.txt
echo hi > file2.txt

Adding Files:
git add .  #Adds all the files to repo
git add "Class Notes/Git_VersionControl.java"
git add "Class Notes/"
git add file1.txt

Deleting Files:
git rm file1.txt
git commit -m "remove file1.txt"

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

Clone:
git clone "link"  #copying from github to local directory

Archiving Branches: 
- Sometimes we don't want to delete files even though they are not used they can be recovered

git tag archive/<branchname> <branchname>   #saves this current branch under the tag archive/<branchname>
git branch -D <branchname>                  #deletes the branch locally
git branch -d -r origin/<branchname>        #deletes the remote branch locally
git push --tags                             #pushes the archive/<branchname> tag to GitHub
git push origin :<branchname>               #deletes the branch on github

Restoring archived branch
git checkout -b <branchname> archive/<branchname> 


Snapshots & Deltas:
- Deltas in version control systems, which is particularly relevant when comparing how different systems store version history.

- Deltas work by storing only the differences (or "deltas") between versions of a file. Each version stores JUST the changes 
  made since the last version. (Traditional systems RCS/SVN use it to save space by not storing entire file copies)

- Snapshots refer to storing the entire state of the repository (or files) at each commit. 

- Git uses a snapshot-based approach. Every time you commit, Git stores a snapshot of what all your files look like at 
  that point. If a file hasn't changed, Git doesn't duplicate it; instead, it simply references the previous identical 
  file's state. This allows Git to quickly recreate any version of the repository without needing to recompute from deltas, 
making it both efficient and fast (branching & merging) 

Single Server:
- In system like single server it maintains all the versions (deltas) of the files

Distributed Users: 
- User in centralized systems check out files from the central server, making the fike available locally. You can see
  what others are working & make changes accordingly

Centralized Version Control System (CVS):
- A system where all version history is stored in a central server and users work on their local copies of files
- The central server ensures everyone works with the same data.

Distrubute Version Control System (DVCS):
- Git is a DVCS that helps track changes in files & facilitatez collab among developers unlike centralized system, Git allows
  every user to have a complete copy of the project repo.
- Changes can be pushed to & pulled from remote repositories like GitHub, GitLab, etc.

Locked Model: 
- In CVS a file can be lcoked by a user, meaning others cannot modify it until it is checked back in. 
- Git doesn't use file locking, instead it relies on branching and merging. Multiple users can work on the same file together.

Merge Model:
- CVS support merging but the process is cumbersome. First one user checks in their changes and subsequent users must merge 
 their changes with the existing one, resulting conflict as necessary. 
- Git has advanced tools for merging changes from multiple branches and resolving conflicts.
*/