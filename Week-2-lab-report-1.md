# Lab Report 1 :

## Installation:
Install VScode by clicking the download button, and follow the instruction of the installation. 

![Image](Vscode1.png)
 
 ## Remotely connecting:
 ![Image](ssh.png) 

As shown by the screenshot above, remotely connecting to ucsd ieng6 server by commanding `ssh cs15lsp22amk@ucsd.edu`. Though now I don't need to type in my password on my current laptop, other devices which didn't apply keygen for my account need to type in the password to access the account. The screenshot below shows how I was able to do so.


## Keyword specification:
The following screenshot shows the output of the commands introduced below.
![Image](Commands.png)

`ls`: stands for *list files* present in the current directory.   
`ls -at`: list files(including ones with hidden directory) according to their modification time.   
`ls -lat`: list files(including ones with hidden directory) in long format according to their modification time.   
`cd`: stands for *change directory*, and it is the only way to navigate to a directory for admins.

## Moving files with scp:

![Image](scp.png)  

Moving files with scp by calling `scp` with the filename and the account name. In this screenshot, I was copying WhereAmI.java to my course specific folder, `cs15lsp22amk@ieng6.ucsd.edu`, using `scp`. Then, password is likely to be needed for the copying.  

## Setting up ssh:
![Image](key.png)

In the screenshot, I typed `ssh-keygen` first in the  terminal to set up the `ssh`. Then, I entered a file directory to where the key saves locally. Typed `y` and created a paraphrase to proceed overwrite. At last, I secured copy the public key from locally to the folder in class server. Once this was done, password was not needed for future `ssh` and `scp` from my laptop to the server.  

## Optimization
![Image](optimize.png)

According to the screenshot, less keystrokes/mouseclicks are needed when we can write several commands in the same line and and separate them by using semicolons. Also, up click is also useful for optimization when we need many repetitive commands.
