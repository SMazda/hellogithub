#coding:utf-8

import speech_recognition as sr
from datetime import datetime

#文字起こしファイルのファイル名を日付のtxtファイルとする
filename = datetime.now().strftime('%Y%m%d_%H:%M:%S')
txt =filename +".txt"

with open(txt, 'w') as f: #txtファイルの新規作成 
    f.write(filename + "\n") #最初の一行目にはfilenameを記載

r = sr.Recognizer()
with sr.AudioFile('voicedata.wav') as src:
    audio = r.record(src) #音声データ(.wav)を読み取り,audioに格納

print(r.recognize_google(audio, language='ja-JP')) #audioをインポートしたapiによって解析

with open(txt,'a') as f: #ファイルの末尾にまとめて追記
    f.write("\n" + r.recognize_google(audio, language='ja-JP'))
