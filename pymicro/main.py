import json
from flask import Flask,jsonify,request,abort

app = Flask(__name__)

data = [{
    "codigo":4567,
    "identificacion": "154569872",
    "nombres":"Ivan Lima",
    "direccion": "afuera",
    "perfil":"Online"
}]

@app.route('/clients', methods = ['GET'])
def returnclientes():
    if (request.method == 'GET'):
        return jsonify(data)


@app.route('/clients/<int:codigo>', methods = ['GET'])
def returncliente(codigo):
    if (request.method == 'GET'):
        for person in data:
            if(person.get("codigo") == codigo):
                return jsonify(person)
        abort (404)


@app.route('/clients', methods = ['POST'])
def addcliente():
    if (request.method == 'POST'):
        person = request.json
        data.append(person)
        return "OK"
    else:
        abort(440, "No valido")

if __name__ == "__main__":
    app.run(host='0.0.0.0', port=5000, debug=True)

