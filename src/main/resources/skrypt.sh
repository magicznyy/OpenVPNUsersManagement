#!/usr/bin/bash
cd ~/nap-ca
gnome-terminal -- ./easyrsa gen-req $1 nopass
sleep 10
gnome-terminal -- ./easyrsa sign-req client $1
sleep 10
gnome-terminal -- openssl verify -CAfile pki/ca.crt pki/issued/$1.crt
sleep 10
cd /home/servervpn/Pulpit/OpenVPNUsersManagement-master/src/main/resources
gnome-terminal -- ./skrypt2.sh $1
