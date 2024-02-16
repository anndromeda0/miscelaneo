#!/bin/bash
#Generate BK
epochtime=$(date +%s)
filename="$epochtime"-bk.zip
echo $filename
zip -r $filename /home/.../Documents
#Put bk into ftp
host='1.1.1.1'
user=''
password=''
file='*.zip'
ftp -n $host <<END_SCRIPT
quote USER $user
quote PASS $password
binay
cd orion
put $file
quit
END_SCRIPT
#remove bk
rm /home/.../*.zip
echo "Success"
exit 0
