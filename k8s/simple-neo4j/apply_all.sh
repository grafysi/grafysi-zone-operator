#!/bin/bash
set -o errexit
kubectl apply -f custom-configmap.yml
kubectl apply -f default-configmap.yml
kubectl apply -f server-logs-config.yml
kubectl apply -f user-logs-config.yml
kubectl apply -f auth-config.yml
kubectl apply -f statefulset.yml
kubectl apply -f service.yml