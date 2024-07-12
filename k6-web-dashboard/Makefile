.PHONY:echo-run
echo-run:
	docker run -p 5678:5678 --name http_echo --rm -d hashicorp/http-echo:1.0.0

.PHONY:echo-stop
echo-stop:
	docker stop http_echo

.PHONY:k6
k6:
	docker run \
	--rm \
	--add-host host.docker.internal:host-gateway \
	-v ./:/k6-dir \
	-p 5665:5665 \
	-e K6_WEB_DASHBOARD=true \
	-e K6_WEB_DASHBOARD_EXPORT=/k6-dir/report.html \
	-e K6_WEB_DASHBOARD_PERIOD=1s \
	grafana/k6:0.52.0 run /k6-dir/script.js
