#!/usr/bin/env python

import requests
import urllib.request
from bs4 import BeautifulSoup

contenturl = "http://www.bank.gov.ua/control/en/curmetal/detail/currency?period=daily"
soup = BeautifulSoup(urllib2.urlopen(contenturl).read())

table = soup.find('div', attrs={'class': 'content'})

print ("Repository Name:%s, Last Change:%s" % \
       (cols[0].text.strip(), cols[3].text.strip()))


print ("Repository Name:%s, Last Change:%s" % (cols[0].text.strip(), cols[4].text.strip()))
