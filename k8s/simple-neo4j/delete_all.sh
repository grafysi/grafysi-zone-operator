#!/bin/bash
set -o errexit
kubectl delete -f service.yml
kubectl delete -f statefulset.yml
kubectl delete -f custom-configmap.yml
kubectl delete -f default-configmap.yml
kubectl delete -f server-logs-config.yml
kubectl delete -f user-logs-config.yml
kubectl delete -f auth-config.yml
