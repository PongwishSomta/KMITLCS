FROM python

WORKDIR /usr/src/app

COPY . .

RUN pip install mysql

CMD [ "python", "./db.py" ]