/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.ssp.service;

import org.jasig.ssp.model.Template;
import org.jasig.ssp.model.TemplateCourse;
import org.jasig.ssp.model.TemplateElectiveCourse;
import org.jasig.ssp.transferobject.TemplateOutputTO;
import org.jasig.ssp.transferobject.TemplateSearchTO;
import org.jasig.ssp.transferobject.TemplateTO;
import org.jasig.ssp.transferobject.reference.MessageTemplatePlanTemplatePrintParamsTO;
import org.jasig.ssp.util.sort.PagingWrapper;
import org.jasig.ssp.util.sort.SortingAndPaging;

import java.util.List;
import java.util.UUID;

public interface TemplateService extends AbstractPlanService<Template,TemplateTO,
TemplateOutputTO , MessageTemplatePlanTemplatePrintParamsTO> {

	PagingWrapper<Template> getAll(SortingAndPaging createForSingleSortWithPaging,
			TemplateSearchTO searchTO);

	TemplateCourse getTemplateCourse(UUID id) throws ObjectNotFoundException;

	void updateTemplateCourseElective(TemplateElectiveCourse templateElectiveCourse);

	void removeTemplaceCourseElective(TemplateElectiveCourse templateElectiveCourse);

	List<TemplateCourse> getUniqueTemplateCourseList(UUID id);
}