#!/usr/bin/bash
cd ~/nap-ca/
sudo cp ~/nap-ca/pki/issued/$1.crt ~/students/
sudo cp ~/nap-ca/pki/private/$1.key ~/students/
sudo cp /etc/openvpn/ta.key ~/students/
sudo cp ~/nap-ca/pki/ca.crt ~/students/
cp klient.conf ~/students
cd ~/students/
echo ' ' >> klient.conf
echo '<ca>' >> klient.conf
sudo cat ca.crt >> klient.conf
echo '</ca>' >> klient.conf
echo ' ' >> klient.conf
echo '<cert>' >> klient.conf
sudo cat $1.crt >> klient.conf
echo '</cert>' >> klient.conf
echo ' ' >> klient.conf
echo '<key>' >> klient.conf
sudo cat $1.key >> klient.conf
echo '</key>' >> klient.conf
echo ' ' >> klient.conf
echo 'key-direction 1' >> klient.conf
echo '<tls-auth>' >> klient.conf
sudo cat ta.key >> klient.conf
echo '</tls-auth>' >> klient.conf
mv ~/students/klient.conf ~/students/dopobrania/$1.ovpn

