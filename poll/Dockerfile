FROM python:3.9-alpine
WORKDIR /app
RUN pip install flask redis
COPY app.py .
CMD ["python", "app.py"]
