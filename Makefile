run-prometheus:
	docker run -d --name=prometheus -p 9090:9090 -v $(shell pwd)/prometheus/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml

run-grafana:
	docker run -d --name=grafana -p 3000:3000 grafana/grafana
