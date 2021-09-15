#!/usr/bin/bash
cd ~/nap-ca
gnome-terminal -- ./easyrsa revoke $1
sleep 10
gnome-terminal -- ./easyrsa gen-crl
