package net.sourceforge.pmd.ui.nls;

/**
 * Convenient class to hold PMD Constants
 * @author phherlin
 * @version $Revision$
 * 
 * $Log$
 * Revision 1.1  2006/05/22 21:23:55  phherlin
 * Refactor the plug-in architecture to better support future evolutions
 *
 * Revision 1.15  2006/05/07 12:01:50  phherlin
 * Add the possibility to use the PMD violation review style
 *
 * Revision 1.14  2006/05/02 20:10:49  phherlin
 * Limit the number of reported violations per file and per rule
 *
 * Revision 1.13  2006/04/26 21:16:28  phherlin
 * Add the include derived files option
 *
 * Revision 1.12  2005/10/24 22:36:42  phherlin
 * Integrating Sebastian Raffel's work
 *
 * Revision 1.11  2003/11/30 22:57:43  phherlin
 * Merging from eclipse-v2 development branch
 *
 * Revision 1.9.2.5  2003/11/07 14:33:57  phherlin
 * Implementing the "project ruleset" feature
 *
 * Revision 1.9.2.4  2003/11/05 13:11:47  phherlin
 * Add the Quick fix menu item to the violations view
 *
 * Revision 1.9.2.3  2003/11/04 13:26:38  phherlin
 * Implement the working set feature (working set filtering)
 *
 * Revision 1.9.2.2  2003/10/31 16:53:54  phherlin
 * Implementing lazy check feature
 *
 * Revision 1.9.2.1  2003/10/29 14:26:05  phherlin
 * Refactoring JDK 1.3 compatibility feature. Now use the compiler compliance option.
 *
 * Revision 1.9  2003/09/29 22:38:09  phherlin
 * Adding and implementing "JDK13 compatibility" property.
 *
 * Revision 1.8  2003/08/14 16:10:41  phherlin
 * Implementing Review feature (RFE#787086)
 *
 * Revision 1.7  2003/08/11 21:58:06  phherlin
 * Adding a label for the default package
 *
 * Revision 1.6  2003/07/07 19:23:59  phherlin
 * Adding PMD violations view
 *
 * Revision 1.5  2003/07/01 20:22:16  phherlin
 * Make rules selectable from projects
 *
 * Revision 1.4  2003/06/30 22:00:53  phherlin
 * Adding clearer monitor message when visiting files
 *
 * Revision 1.3  2003/06/30 20:16:06  phherlin
 * Redesigning plugin configuration
 *
 */
public class StringKeys {
    public static final String MSGKEY_PROPERTY_BUTTON_ENABLE = "property.button.enable";
    public static final String MSGKEY_PROPERTY_LABEL_SELECT_RULE = "property.label.select_rule";
    public static final String MSGKEY_PROPERTY_BUTTON_SELECT_WORKINGSET = "property.button.select_workingset";
    public static final String MSGKEY_PROPERTY_BUTTON_DESELECT_WORKINGSET = "property.button.deselect_workingset";
    public static final String MSGKEY_PROPERTY_LABEL_NO_WORKINGSET = "property.label.no_workingset";
    public static final String MSGKEY_PROPERTY_LABEL_SELECTED_WORKINGSET = "property.label.selected_workingset";
    public static final String MSGKEY_PROPERTY_BUTTON_STORE_RULESET_PROJECT = "property.button.store_ruleset_project";
    public static final String MSGKEY_PROPERTY_BUTTON_INCLUDE_DERIVED_FILES = "property.button.include_derived_files";
    
    public static final String MSGKEY_PREF_GENERAL_HEADER = "preference.pmd.header";
    public static final String MSGKEY_PREF_GENERAL_TITLE = "preference.pmd.title";
    public static final String MSGKEY_PREF_GENERAL_LABEL_ADDCOMMENT = "preference.pmd.label.addcomment";
    public static final String MSGKEY_PREF_GENERAL_LABEL_SAMPLE = "preference.pmd.label.sample";
    public static final String MSGKEY_PREF_GENERAL_TOOLTIP_ADDCOMMENT = "preference.pmd.tooltip.addcomment";
    public static final String MSGKEY_PREF_GENERAL_MESSAGE_INCORRECT_FORMAT ="preference.pmd.message.incorrect_format";
    public static final String MSGKEY_PREF_GENERAL_GROUP_REVIEW = "preference.pmd.group.review";
    public static final String MSGKEY_PREF_GENERAL_GROUP_GENERAL = "preference.pmd.group.general";
    public static final String MSGKEY_PREF_GENERAL_LABEL_SHOW_PERSPECTIVE = "preference.pmd.label.perspective_on_check";
    public static final String MSGKEY_PREF_GENERAL_LABEL_USE_DFA = "preference.pmd.label.use_dfa";
    public static final String MSGKEY_PREF_GENERAL_LABEL_MAX_VIOLATIONS_PFPR = "preference.pmd.label.max_violations_pfpr";
    public static final String MSGKEY_PREF_GENERAL_TOOLTIP_MAX_VIOLATIONS_PFPR = "preference.pmd.tooltip.max_violations_pfpr";
    public static final String MSGKEY_PREF_GENERAL_MESSAGE_INVALID_NUMERIC_VALUE ="preference.pmd.message.invalid_numeric_value";
    public static final String MSGKEY_PREF_GENERAL_REVIEW_PMD_STYLE = "preference.pmd.label.review_pmd_style";
    public static final String MSGKEY_PREF_GENERAL_GROUP_LOGGING = "preference.pmd.group.logging";
    public static final String MSGKEY_PREF_GENERAL_LABEL_LOG_FILE_NAME = "preference.pmd.label.log_file_name";
    public static final String MSGKEY_PREF_GENERAL_TOOLTIP_LOG_FILE_NAME = "preference.pmd.tooltip.log_file_name";
    public static final String MSGKEY_PREF_GENERAL_BUTTON_BROWSE = "preference.pmd.button.browse";
    public static final String MSGKEY_PREF_GENERAL_DIALOG_BROWSE = "preference.pmd.dialog.browse";
    public static final String MSGKEY_PREF_GENERAL_LABEL_LOG_LEVEL = "preference.pmd.label.log_level";
    
    public static final String MSGKEY_PREF_RULESET_TITLE = "preference.ruleset.title";
    public static final String MSGKEY_PREF_RULESET_LIST = "preference.ruleset.list";
    public static final String MSGKEY_PREF_RULESET_ADD = "preference.ruleset.add";
    public static final String MSGKEY_PREF_RULESET_REMOVE = "preference.ruleset.remove";
    public static final String MSGKEY_PREF_RULESET_LABEL_RULETABLE = "preference.ruleset.label.ruletable";
    public static final String MSGKEY_PREF_RULESET_LABEL_RULEPROPSTABLE = "preference.ruleset.label.rulepropstable";
    public static final String MSGKEY_PREF_RULESET_COLUMN_NAME = "preference.ruleset.column.name";
    public static final String MSGKEY_PREF_RULESET_COLUMN_PRIORITY = "preference.ruleset.column.priority";
    public static final String MSGKEY_PREF_RULESET_COLUMN_DESCRIPTION = "preference.ruleset.column.description";
    public static final String MSGKEY_PREF_RULESET_COLUMN_PROPERTY = "preference.ruleset.column.property";
    public static final String MSGKEY_PREF_RULESET_COLUMN_VALUE = "preference.ruleset.column.value";
    public static final String MSGKEY_PREF_RULESET_BUTTON_ADDRULE = "preference.ruleset.button.addrule";
    public static final String MSGKEY_PREF_RULESET_BUTTON_REMOVERULE = "preference.ruleset.button.removerule";
    public static final String MSGKEY_PREF_RULESET_BUTTON_EDITRULE = "preference.ruleset.button.editrule";
    public static final String MSGKEY_PREF_RULESET_BUTTON_IMPORTRULESET = "preference.ruleset.button.importruleset";
    public static final String MSGKEY_PREF_RULESET_BUTTON_EXPORTRULESET = "preference.ruleset.button.exportruleset";
    public static final String MSGKEY_PREF_RULESET_BUTTON_CLEARALL = "preference.ruleset.button.clearall";
    public static final String MSGKEY_PREF_RULESET_BUTTON_ADDPROPERTY = "preference.ruleset.button.addproperty";
    public static final String MSGKEY_PREF_RULESET_DIALOG_TITLE = "preference.ruleset.dialog.title";
    public static final String MSGKEY_PREF_RULESET_DIALOG_RULESET_DESCRIPTION = "preference.ruleset.dialog.ruleset_description";
    public static final String MSGKEY_PREF_RULESET_DIALOG_PROPERTY_NAME = "preference.ruleset.dialog.property_name";
    
    public static final String MSGKEY_PREF_RULESETSELECTION_LABEL_ENTER_RULESET = "preference.rulesetselection.label.enter_ruleset";
    public static final String MSGKEY_PREF_RULESETSELECTION_TOOLTIP_RULESET = "preference.rulesetselection.tooltip.ruleset";
    public static final String MSGKEY_PREF_RULESETSELECTION_BUTTON_BROWSE = "preference.rulesetselection.button.browse";
    
    public static final String MSGKEY_PREF_RULEEDIT_LABEL_NAME = "preference.ruleedit.label.name";
    public static final String MSGKEY_PREF_RULEEDIT_LABEL_IMPLEMENTATION_CLASS = "preference.ruleedit.label.implementation_class";
    public static final String MSGKEY_PREF_RULEEDIT_LABEL_MESSAGE = "preference.ruleedit.label.message";
    public static final String MSGKEY_PREF_RULEEDIT_LABEL_DESCRIPTION = "preference.ruleedit.label.description";
    public static final String MSGKEY_PREF_RULEEDIT_LABEL_EXAMPLE = "preference.ruleedit.label.example";
    public static final String MSGKEY_PREF_RULEEDIT_BUTTON_XPATH_RULE = "preference.ruleedit.button.xpath_rule";

    public static final String MSGKEY_PREF_CPD_TITLE = "preference.cpd.title";
    public static final String MSGKEY_PREF_CPD_TILESIZE = "preference.cpd.tilesize";
    
    public static final String MSGKEY_VIEW_OUTLINE_DEFAULT_TEXT = "view.outline.default_text";
    public static final String MSGKEY_VIEW_OUTLINE_COLUMN_MESSAGE = "view.outline.column_message";
    public static final String MSGKEY_VIEW_OUTLINE_COLUMN_LINE = "view.outline.column_line";
    public static final String MSGKEY_VIEW_OVERVIEW_COLUMN_ELEMENT = "view.overview.column_element";
    public static final String MSGKEY_VIEW_OVERVIEW_COLUMN_VIO_TOTAL = "view.overview.column_vio_total";
    public static final String MSGKEY_VIEW_OVERVIEW_COLUMN_VIO_LOC = "view.overview.column_vio_loc";
    public static final String MSGKEY_VIEW_OVERVIEW_COLUMN_VIO_METHOD = "view.overview.column_vio_method";
    public static final String MSGKEY_VIEW_OVERVIEW_COLUMN_PROJECT = "view.overview.column_project";
    public static final String MSGKEY_VIEW_DATAFLOW_DEFAULT_TEXT = "view.dataflow.default_text";
    public static final String MSGKEY_VIEW_DATAFLOW_GRAPH_COLUMN_LINE = "view.dataflow.graph.column_line";
    public static final String MSGKEY_VIEW_DATAFLOW_GRAPH_COLUMN_GRAPH = "view.dataflow.graph.column_graph";
    public static final String MSGKEY_VIEW_DATAFLOW_GRAPH_COLUMN_NEXT = "view.dataflow.graph.column_nextnodes";
    public static final String MSGKEY_VIEW_DATAFLOW_GRAPH_COLUMN_VALUES = "view.dataflow.graph.column_values";
    public static final String MSGKEY_VIEW_DATAFLOW_GRAPH_COLUMN_CODE = "view.dataflow.graph.column_code";
    public static final String MSGKEY_VIEW_DATAFLOW_SWITCHBUTTON_SHOW = "view.dataflow.switchbutton.show";
    public static final String MSGKEY_VIEW_DATAFLOW_SWITCHBUTTON_HIDE = "view.dataflow.switchbutton.hide";
    public static final String MSGKEY_VIEW_DATAFLOW_TABLE_COLUMN_TYPE = "view.dataflow.table.column_type";
    public static final String MSGKEY_VIEW_DATAFLOW_TABLE_COLUMN_LINE = "view.dataflow.table.column_line";
    public static final String MSGKEY_VIEW_DATAFLOW_TABLE_COLUMN_VARIABLE = "view.dataflow.table.column_variable";

    public static final String MSGKEY_VIEW_FILTER_PRIORITY_1 = "view.filter.priority.1";
    public static final String MSGKEY_VIEW_FILTER_PRIORITY_2 = "view.filter.priority.2";
    public static final String MSGKEY_VIEW_FILTER_PRIORITY_3 = "view.filter.priority.3";
    public static final String MSGKEY_VIEW_FILTER_PRIORITY_4 = "view.filter.priority.4";
    public static final String MSGKEY_VIEW_FILTER_PRIORITY_5 = "view.filter.priority.5";
    public static final String MSGKEY_VIEW_FILTER_PROJECT_PREFIX = "view.filter.project_prefix";
    
    public static final String MSGKEY_VIEW_ACTION_CURRENT_PROJECT = "view.action.current_project";
    
    public static final String MSGKEY_VIEW_TOOLTIP_FILTER_PRIORITY_1 = "view.tooltip.filter.priority.1";
    public static final String MSGKEY_VIEW_TOOLTIP_FILTER_PRIORITY_2 = "view.tooltip.filter.priority.2";
    public static final String MSGKEY_VIEW_TOOLTIP_FILTER_PRIORITY_3 = "view.tooltip.filter.priority.3";
    public static final String MSGKEY_VIEW_TOOLTIP_FILTER_PRIORITY_4 = "view.tooltip.filter.priority.4";
    public static final String MSGKEY_VIEW_TOOLTIP_FILTER_PRIORITY_5 = "view.tooltip.filter.priority.5";
    public static final String MSGKEY_VIEW_TOOLTIP_PACKAGES_FILES = "view.tooltip.packages_files";
    public static final String MSGKEY_VIEW_TOOLTIP_COLLAPSE_ALL = "view.tooltip.collapse_all";
        
    public static final String MSGKEY_VIEW_COLUMN_MESSAGE = "view.column.message";
    public static final String MSGKEY_VIEW_COLUMN_RULE = "view.column.rule";
    public static final String MSGKEY_VIEW_COLUMN_CLASS = "view.column.class";
    public static final String MSGKEY_VIEW_COLUMN_PACKAGE = "view.column.package";
    public static final String MSGKEY_VIEW_COLUMN_PROJECT = "view.column.project";
    public static final String MSGKEY_VIEW_COLUMN_LOCATION = "view.column.location";
    public static final String MSGKEY_VIEW_TOOLTIP_PROJECT = "view.tooltip.project";
    public static final String MSGKEY_VIEW_TOOLTIP_FILE = "view.tooltip.file";
    public static final String MSGKEY_VIEW_TOOLTIP_ERRORHIGH_FILTER = "view.tooltip.errorhigh_filter";
    public static final String MSGKEY_VIEW_TOOLTIP_ERROR_FILTER = "view.tooltip.error_filter";
    public static final String MSGKEY_VIEW_TOOLTIP_WARNINGHIGH_FILTER = "view.tooltip.warninghigh_filter";
    public static final String MSGKEY_VIEW_TOOLTIP_WARNING_FILTER = "view.tooltip.warning_filter";
    public static final String MSGKEY_VIEW_TOOLTIP_INFORMATION_FILTER = "view.tooltip.information_filter";
    public static final String MSGKEY_VIEW_TOOLTIP_SHOW_RULE = "view.tooltip.show_rule";
    public static final String MSGKEY_VIEW_TOOLTIP_REMOVE_VIOLATION = "view.tooltip.remove_violation";
    public static final String MSGKEY_VIEW_TOOLTIP_REVIEW = "view.tooltip.review";
    public static final String MSGKEY_VIEW_TOOLTIP_QUICKFIX = "view.tooltip.quickfix";
    public static final String MSGKEY_VIEW_ACTION_PROJECT = "view.action.project";
    public static final String MSGKEY_VIEW_ACTION_FILE = "view.action.file";
    public static final String MSGKEY_VIEW_ACTION_ERRORHIGH = "view.action.errorhigh";
    public static final String MSGKEY_VIEW_ACTION_ERROR = "view.action.error";
    public static final String MSGKEY_VIEW_ACTION_WARNINGHIGH = "view.action.warninghigh";
    public static final String MSGKEY_VIEW_ACTION_WARNING = "view.action.warning";
    public static final String MSGKEY_VIEW_ACTION_INFORMATION = "view.action.information";
    public static final String MSGKEY_VIEW_ACTION_SHOW_RULE = "view.action.show_rule";
    public static final String MSGKEY_VIEW_ACTION_REMOVE_VIOLATION = "view.action.remove_violation";
    public static final String MSGKEY_VIEW_ACTION_REVIEW = "view.action.review";
    public static final String MSGKEY_VIEW_ACTION_QUICKFIX = "view.action.quickfix";
    public static final String MSGKEY_VIEW_MENU_RESOURCE_FILTER = "view.menu.resource_filter";
    public static final String MSGKEY_VIEW_MENU_PRIORITY_FILTER = "view.menu.priority_filter";
    public static final String MSGKEY_VIEW_DEFAULT_PACKAGE = "view.default_package";
    
    public static final String MSGKEY_ERROR_TITLE = "message.error.title";
    public static final String MSGKEY_ERROR_CORE_EXCEPTION = "message.error.core_exception";
    public static final String MSGKEY_ERROR_PMD_EXCEPTION = "message.error.pmd_exception";
    public static final String MSGKEY_ERROR_IO_EXCEPTION = "message.error.io_exception";
    public static final String MSGKEY_ERROR_JAVAMODEL_EXCEPTION = "message.error.javamodel_exception";
    public static final String MSGKEY_ERROR_INVOCATIONTARGET_EXCEPTION = "message.error.invocationtarget_exception";
    public static final String MSGKEY_ERROR_INTERRUPTED_EXCEPTION = "message.error.interrupted_exception";
    public static final String MSGKEY_ERROR_RUNTIME_EXCEPTION = "message.error.runtime_exception";    
    public static final String MSGKEY_ERROR_RULESET_NOT_FOUND = "message.error.ruleset_not_found";
    public static final String MSGKEY_ERROR_IMPORTING_RULESET = "message.error.importing_ruleset";
    public static final String MSGKEY_ERROR_EXPORTING_RULESET = "message.error.exporting_ruleset";
    public static final String MSGKEY_ERROR_READING_PREFERENCE = "message.error.reading_preference";
    public static final String MSGKEY_ERROR_WRITING_PREFERENCE = "message.error.writing_preference";
    public static final String MSGKEY_ERROR_STORING_PROPERTY = "message.error.storing_property";
    public static final String MSGKEY_ERROR_FIND_MARKER = "message.error.find_marker";
    public static final String MSGKEY_ERROR_LOADING_RULESET = "message.error.loading_ruleset";
    public static final String MSGKEY_ERROR_VIEW_EXCEPTION = "message.error.view_exception";
    public static final String MSGKEY_ERROR_FILE_NOT_FOUND = "message.error.file_not_found";
    
    public static final String MSGKEY_QUESTION_TITLE = "message.question.title";
    public static final String MSGKEY_QUESTION_RULES_CHANGED = "message.question.rules_changed";
    public static final String MSGKEY_QUESTION_REBUILD_PROJECT = "message.question.rebuild_project";
    public static final String MSGKEY_QUESTION_CREATE_RULESET_FILE = "message.question.create_ruleset_file";
    
    public static final String MSGKEY_CONFIRM_TITLE = "message.confirm.title";
    public static final String MSGKEY_CONFIRM_RULESET_EXISTS = "message.confirm.ruleset_exists";
    public static final String MSGKEY_CONFIRM_CLEAR_RULESET = "message.confirm.clear_ruleset";
    public static final String MSGKEY_CONFIRM_REVIEW_MULTIPLE_MARKERS = "message.confirm.review_multiple_markers";
    
    public static final String MSGKEY_INFORMATION_TITLE = "message.information.title";
    public static final String MSGKEY_INFORMATION_RULESET_EXPORTED = "message.information.ruleset_exported";
    
    public static final String MSGKEY_WARNING_TITLE = "message.warning.title";
    public static final String MSGKEY_WARNING_NAME_MANDATORY = "message.warning.name_mandatory";
    public static final String MSGKEY_WARNING_MESSAGE_MANDATORY = "message.warning.message_mandatory";
    public static final String MSGKEY_WARNING_CLASS_INVALID = "message.warning.class_invalid";
    
    public static final String MSGKEY_PRIORITY_ERROR_HIGH   = "priority.error_high";
    public static final String MSGKEY_PRIORITY_ERROR        = "priority.error";
    public static final String MSGKEY_PRIORITY_WARNING_HIGH = "priority.warning_high";
    public static final String MSGKEY_PRIORITY_WARNING      = "priority.warning";
    public static final String MSGKEY_PRIORITY_INFORMATION  = "priority.information";
    
    public static final String MSGKEY_MONITOR_JOB_TITLE = "monitor.job_title";
    public static final String MSGKEY_MONITOR_CHECKING_FILE = "monitor.checking_file";
    public static final String MSGKEY_PMD_PROCESSING = "monitor.begintask";
    public static final String MSGKEY_MONITOR_UPDATING_PROJECTS = "monitor.updating_projects";
    public static final String MSGKEY_MONITOR_REVIEW = "monitor.review";
    public static final String MSGKEY_MONITOR_REMOVE_REVIEWS = "monitor.remove_reviews";
    
    /**
     * This class is not meant to be instanciated
     *
     */
    private StringKeys() {
        super();
    }
    
}