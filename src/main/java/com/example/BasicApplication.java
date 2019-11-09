package com.example;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

public class BasicApplication extends Application<Configuration> {
	public static void main(String[] args) throws Exception {
		new BasicApplication().run(args);
	}

	@Override
	public String getName() {
		return "dropwizard-issue-3017";
	}

	@Override
	public void run(Configuration configuration, Environment environment) {
		environment.jersey().register(BasicResource.class);
	}

	@Path("/test")
	public static class BasicResource {
		@GET
		public Response getBase() {
			return Response.ok("Hello World!").build();
		}
	}
}
