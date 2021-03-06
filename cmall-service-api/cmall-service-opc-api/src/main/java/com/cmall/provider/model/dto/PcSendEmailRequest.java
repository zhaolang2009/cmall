
package com.cmall.provider.model.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

/**
 * The class Pc send email request.
 *
 */
@Data
public class PcSendEmailRequest implements Serializable {

	private static final long serialVersionUID = 8391763073747981998L;
	private String text;
	private String subject;
	private Set<String> to;
}
