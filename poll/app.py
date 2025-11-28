from flask import Flask
import redis

app = Flask(__name__)

@app.route('/')
def hello():
    return 'Poll app is running!'

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=80)
