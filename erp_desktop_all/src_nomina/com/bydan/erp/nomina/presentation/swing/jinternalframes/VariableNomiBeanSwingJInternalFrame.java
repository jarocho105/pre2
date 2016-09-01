/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.nomina.util.VariableNomiConstantesFunciones;
import com.bydan.erp.nomina.util.VariableNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.VariableNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.VariableNomiBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VariableNomiBeanSwingJInternalFrame extends VariableNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VariableNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VariableNomi> variablenomiValidator = new ClassValidator<VariableNomi>(VariableNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VariableNomi variablenomi;	
	public VariableNomi variablenomiAux;
	public VariableNomi variablenomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VariableNomi variablenomiTotales;
	public Long idVariableNomiActual;
	public Long iIdNuevoVariableNomi=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

	public String sFinalQueryComboTipoVariableNomi="";

	public List<TipoVariableNomi> tipovariablenomisForeignKey;

	public List<TipoVariableNomi> gettipovariablenomisForeignKey() {
		return tipovariablenomisForeignKey;
	}

	public void settipovariablenomisForeignKey(List<TipoVariableNomi> tipovariablenomisForeignKey) {
		this.tipovariablenomisForeignKey = tipovariablenomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoVariableNomi tipovariablenomiForeignKey;

	public TipoVariableNomi gettipovariablenomiForeignKey() {
		return tipovariablenomiForeignKey;
	}

	public void settipovariablenomiForeignKey(TipoVariableNomi tipovariablenomiForeignKey) {
		this.tipovariablenomiForeignKey = tipovariablenomiForeignKey;
	}

	public String sFinalQueryComboTipoValorVariableNomi="";

	public List<TipoValorVariableNomi> tipovalorvariablenomisForeignKey;

	public List<TipoValorVariableNomi> gettipovalorvariablenomisForeignKey() {
		return tipovalorvariablenomisForeignKey;
	}

	public void settipovalorvariablenomisForeignKey(List<TipoValorVariableNomi> tipovalorvariablenomisForeignKey) {
		this.tipovalorvariablenomisForeignKey = tipovalorvariablenomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoValorVariableNomi tipovalorvariablenomiForeignKey;

	public TipoValorVariableNomi gettipovalorvariablenomiForeignKey() {
		return tipovalorvariablenomiForeignKey;
	}

	public void settipovalorvariablenomiForeignKey(TipoValorVariableNomi tipovalorvariablenomiForeignKey) {
		this.tipovalorvariablenomiForeignKey = tipovalorvariablenomiForeignKey;
	}

		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoVariableNomi;
	public Boolean isPermisoNuevoVariableNomi;
	public Boolean isPermisoActualizarVariableNomi;
	public Boolean isPermisoActualizarOriginalVariableNomi;
	public Boolean isPermisoEliminarVariableNomi;
	public Boolean isPermisoGuardarCambiosVariableNomi;
	public Boolean isPermisoConsultaVariableNomi;
	public Boolean isPermisoBusquedaVariableNomi;
	public Boolean isPermisoReporteVariableNomi;
	public Boolean isPermisoPaginacionMedioVariableNomi;
	public Boolean isPermisoPaginacionAltoVariableNomi;
	public Boolean isPermisoPaginacionTodoVariableNomi;
	public Boolean isPermisoCopiarVariableNomi;
	public Boolean isPermisoVerFormVariableNomi;
	public Boolean isPermisoDuplicarVariableNomi;
	public Boolean isPermisoOrdenVariableNomi;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public VariableNomiParameterReturnGeneral variablenomiReturnGeneral;
	public VariableNomiParameterReturnGeneral variablenomiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVariableNomi=false;
	public Boolean esParaAccionDesdeFormularioVariableNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VariableNomiSessionBeanAdditional variablenomiSessionBeanAdditional=null;
	
	public VariableNomiSessionBeanAdditional getVariableNomiSessionBeanAdditional() {
		return this.variablenomiSessionBeanAdditional;
	}
	
	public void setVariableNomiSessionBeanAdditional(VariableNomiSessionBeanAdditional variablenomiSessionBeanAdditional) {
		try {
			this.variablenomiSessionBeanAdditional=variablenomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VariableNomiBeanSwingJInternalFrameAdditional variablenomiBeanSwingJInternalFrameAdditional=null;
	//public class VariableNomiBeanSwingJInternalFrame
	
	public VariableNomiBeanSwingJInternalFrameAdditional getVariableNomiBeanSwingJInternalFrameAdditional() {
		return this.variablenomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setVariableNomiBeanSwingJInternalFrameAdditional(VariableNomiBeanSwingJInternalFrameAdditional variablenomiBeanSwingJInternalFrameAdditional) {
		try {
			this.variablenomiBeanSwingJInternalFrameAdditional=variablenomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VariableNomiLogic variablenomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VariableNomi variablenomiBean;
	public VariableNomiConstantesFunciones variablenomiConstantesFunciones;
	//public VariableNomiParameterReturnGeneral variablenomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public ModuloLogic moduloLogic;
	public TipoVariableNomiLogic tipovariablenomiLogic;
	public TipoValorVariableNomiLogic tipovalorvariablenomiLogic;
	
	//PARAMETROS
	
	
	//public List<VariableNomi> variablenomis;	
	//public List<VariableNomi> variablenomisEliminados;
	//public List<VariableNomi> variablenomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVariableNomi=false;
	public Boolean isVisibilidadCeldaDuplicarVariableNomi=true;
	public Boolean isVisibilidadCeldaCopiarVariableNomi=true;
	public Boolean isVisibilidadCeldaVerFormVariableNomi=true;
	public Boolean isVisibilidadCeldaOrdenVariableNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
	public Boolean isVisibilidadCeldaModificarVariableNomi=false;
	public Boolean isVisibilidadCeldaActualizarVariableNomi=false;
	public Boolean isVisibilidadCeldaEliminarVariableNomi=false;
	public Boolean isVisibilidadCeldaCancelarVariableNomi=false;
	public Boolean isVisibilidadCeldaGuardarVariableNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVariableNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	public Boolean isVisibilidadFK_IdTipoValorVariableNomi=false;
	public Boolean isVisibilidadFK_IdTipoVariableNomi=false;
	
	public Long getiIdNuevoVariableNomi() {
		return this.iIdNuevoVariableNomi;
	}

	public void setiIdNuevoVariableNomi(Long iIdNuevoVariableNomi) {
		this.iIdNuevoVariableNomi = iIdNuevoVariableNomi;
	}
	
	public Long getidVariableNomiActual() {
		return this.idVariableNomiActual;
	}

	public void setidVariableNomiActual(Long idVariableNomiActual) {
		this.idVariableNomiActual = idVariableNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VariableNomi getvariablenomi() {
		return this.variablenomi;
	}

	public void setvariablenomi(VariableNomi variablenomi) {
		this.variablenomi = variablenomi;
	}
	
	public VariableNomi getvariablenomiAux() {
		return this.variablenomiAux;
	}

	public void setvariablenomiAux(VariableNomi variablenomiAux) {
		this.variablenomiAux = variablenomiAux;
	}				
	
	public VariableNomi getvariablenomiAnterior() {
		return this.variablenomiAnterior;
	}

	public void setvariablenomiAnterior(VariableNomi variablenomiAnterior) {
		this.variablenomiAnterior = variablenomiAnterior;
	}	
	
	public VariableNomi getvariablenomiTotales() {
		return this.variablenomiTotales;
	}

	public void setvariablenomiTotales(VariableNomi variablenomiTotales) {
		this.variablenomiTotales = variablenomiTotales;
	}	
	
	public VariableNomi getvariablenomiBean() {
		return this.variablenomiBean;
	}

	public void setvariablenomiBean(VariableNomi variablenomiBean) {
		this.variablenomiBean = variablenomiBean;
	}	
	
	public VariableNomiParameterReturnGeneral getvariablenomiReturnGeneral() {
		return this.variablenomiReturnGeneral;
	}

	public void setvariablenomiReturnGeneral(VariableNomiParameterReturnGeneral variablenomiReturnGeneral) {
		this.variablenomiReturnGeneral = variablenomiReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

	public Long id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi=-1L;

	public Long getid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi() {
		return this.id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi;
	}

	public void setid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi(Long id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi) {
		this.id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi = id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi;
	}

	public Long id_tipo_variable_nomiFK_IdTipoVariableNomi=-1L;

	public Long getid_tipo_variable_nomiFK_IdTipoVariableNomi() {
		return this.id_tipo_variable_nomiFK_IdTipoVariableNomi;
	}

	public void setid_tipo_variable_nomiFK_IdTipoVariableNomi(Long id_tipo_variable_nomiFK_IdTipoVariableNomi) {
		this.id_tipo_variable_nomiFK_IdTipoVariableNomi = id_tipo_variable_nomiFK_IdTipoVariableNomi;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VariableNomiLogic getVariableNomiLogic()	{		
		return variablenomiLogic;
	}

	public void setVariableNomiLogic(VariableNomiLogic variablenomiLogic) {
		this.variablenomiLogic = variablenomiLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoVariableNomi() {
		return isEsNuevoVariableNomi;
	}

	public void setIsEsNuevoVariableNomi(Boolean isEsNuevoVariableNomi) {
		this.isEsNuevoVariableNomi = isEsNuevoVariableNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioVariableNomi() {
		return esParaAccionDesdeFormularioVariableNomi;
	}
	
	public void setEsParaAccionDesdeFormularioVariableNomi(Boolean esParaAccionDesdeFormularioVariableNomi) {
		this.esParaAccionDesdeFormularioVariableNomi = esParaAccionDesdeFormularioVariableNomi;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.variablenomiSessionBean==null) {
				this.variablenomiSessionBean=new VariableNomiSessionBean();
			}

			if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(variablenomiSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.variablenomiSessionBean==null) {
				this.variablenomiSessionBean=new VariableNomiSessionBean();
			}

			if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(variablenomiSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoVariableNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipovariablenomisForeignKey=new ArrayList<TipoVariableNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoVariableNomiLogic tipovariablenomiLogic=new TipoVariableNomiLogic();

			//tipovariablenomiLogic.getTipoVariableNomiDataAccess().setIsForForeingKeyData(true);

			if(this.variablenomiSessionBean==null) {
				this.variablenomiSessionBean=new VariableNomiSessionBean();
			}

			if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoVariableNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipovariablenomiLogic.getTipoVariableNomiDataAccess().setIsForForeingKeyData(true);

					tipovariablenomiLogic.getTodosTipoVariableNomisWithConnection(sFinalQuery,new Pagination());

					this.tipovariablenomisForeignKey=tipovariablenomiLogic.getTipoVariableNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoVariableNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovariablenomiLogic.getEntityWithConnection(variablenomiSessionBean.getlidTipoVariableNomiActual());
					this.tipovariablenomisForeignKey.add(tipovariablenomiLogic.getTipoVariableNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoValorVariableNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipovalorvariablenomisForeignKey=new ArrayList<TipoValorVariableNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoValorVariableNomiLogic tipovalorvariablenomiLogic=new TipoValorVariableNomiLogic();

			//tipovalorvariablenomiLogic.getTipoValorVariableNomiDataAccess().setIsForForeingKeyData(true);

			if(this.variablenomiSessionBean==null) {
				this.variablenomiSessionBean=new VariableNomiSessionBean();
			}

			if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoValorVariableNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipovalorvariablenomiLogic.getTipoValorVariableNomiDataAccess().setIsForForeingKeyData(true);

					tipovalorvariablenomiLogic.getTodosTipoValorVariableNomisWithConnection(sFinalQuery,new Pagination());

					this.tipovalorvariablenomisForeignKey=tipovalorvariablenomiLogic.getTipoValorVariableNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoValorVariableNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipovalorvariablenomiLogic.getEntityWithConnection(variablenomiSessionBean.getlidTipoValorVariableNomiActual());
					this.tipovalorvariablenomisForeignKey.add(tipovalorvariablenomiLogic.getTipoValorVariableNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.variablenomi!=null) {
						this.variablenomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVariableNomi!=null) {
						this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVariableNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVariableNomi!=null) {
						if(this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVariableNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaVariableNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVariableNomiGenerico!=null && jComboBoxid_empresaVariableNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaVariableNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.variablenomi!=null) {
						this.variablenomi.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormVariableNomi!=null) {
						this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloVariableNomi.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormVariableNomi!=null) {
						if(this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloVariableNomiGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloVariableNomiGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloVariableNomiGenerico!=null && jComboBoxid_moduloVariableNomiGenerico.getItemCount()>0) {
					jComboBoxid_moduloVariableNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoVariableNomiForeignKey(Long idTipoVariableNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoVariableNomi  tipovariablenomiTemp=null;

			for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisForeignKey) {
				if(tipovariablenomiAux.getId()!=null && tipovariablenomiAux.getId().equals(idTipoVariableNomiSeleccionado)) {
					tipovariablenomiTemp=tipovariablenomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipovariablenomiTemp!=null) {

					if(this.variablenomi!=null) {
						this.variablenomi.setTipoVariableNomi(tipovariablenomiTemp);
					}

					if(this.jInternalFrameDetalleFormVariableNomi!=null) {
						this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setSelectedItem(tipovariablenomiTemp);
					}
				} else {
					//jComboBoxid_tipo_variable_nomiVariableNomi.setSelectedItem(tipovariablenomiTemp);
					if(this.jInternalFrameDetalleFormVariableNomi!=null) {
						if(this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoVariableNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipovariablenomiTemp!=null && jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi!=null) {
						jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setSelectedItem(tipovariablenomiTemp);
					} else {
						if(jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi!=null) {
							//jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setSelectedItem(tipovariablenomiTemp);
							if(jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.getItemCount()>0) {
								jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoVariableNomiForeignKeyDescripcion(Long idTipoVariableNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoVariableNomi  tipovariablenomiTemp=null;

			for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisForeignKey) {
				if(tipovariablenomiAux.getId()!=null && tipovariablenomiAux.getId().equals(idTipoVariableNomiSeleccionado)) {
					tipovariablenomiTemp=tipovariablenomiAux;
					break;
				}
			}


			sDescripcion=TipoVariableNomiConstantesFunciones.getTipoVariableNomiDescripcion(tipovariablenomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoVariableNomiForeignKeyGenerico(Long idTipoVariableNomiSeleccionado,JComboBox jComboBoxid_tipo_variable_nomiVariableNomiGenerico)throws Exception
	{
		try
		{
			TipoVariableNomi  tipovariablenomiTemp=null;

			for(TipoVariableNomi tipovariablenomiAux:tipovariablenomisForeignKey) {
				if(tipovariablenomiAux.getId()!=null && tipovariablenomiAux.getId().equals(idTipoVariableNomiSeleccionado)) {
					tipovariablenomiTemp=tipovariablenomiAux;
					break;
				}
			}

			if(tipovariablenomiTemp!=null) {
				jComboBoxid_tipo_variable_nomiVariableNomiGenerico.setSelectedItem(tipovariablenomiTemp);
			} else {
				if(jComboBoxid_tipo_variable_nomiVariableNomiGenerico!=null && jComboBoxid_tipo_variable_nomiVariableNomiGenerico.getItemCount()>0) {
					jComboBoxid_tipo_variable_nomiVariableNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoValorVariableNomiForeignKey(Long idTipoValorVariableNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoValorVariableNomi  tipovalorvariablenomiTemp=null;

			for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisForeignKey) {
				if(tipovalorvariablenomiAux.getId()!=null && tipovalorvariablenomiAux.getId().equals(idTipoValorVariableNomiSeleccionado)) {
					tipovalorvariablenomiTemp=tipovalorvariablenomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipovalorvariablenomiTemp!=null) {

					if(this.variablenomi!=null) {
						this.variablenomi.setTipoValorVariableNomi(tipovalorvariablenomiTemp);
					}

					if(this.jInternalFrameDetalleFormVariableNomi!=null) {
						this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setSelectedItem(tipovalorvariablenomiTemp);
					}
				} else {
					//jComboBoxid_tipo_valor_variable_nomiVariableNomi.setSelectedItem(tipovalorvariablenomiTemp);
					if(this.jInternalFrameDetalleFormVariableNomi!=null) {
						if(this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoValorVariableNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipovalorvariablenomiTemp!=null && jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi!=null) {
						jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setSelectedItem(tipovalorvariablenomiTemp);
					} else {
						if(jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi!=null) {
							//jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setSelectedItem(tipovalorvariablenomiTemp);
							if(jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.getItemCount()>0) {
								jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoValorVariableNomiForeignKeyDescripcion(Long idTipoValorVariableNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoValorVariableNomi  tipovalorvariablenomiTemp=null;

			for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisForeignKey) {
				if(tipovalorvariablenomiAux.getId()!=null && tipovalorvariablenomiAux.getId().equals(idTipoValorVariableNomiSeleccionado)) {
					tipovalorvariablenomiTemp=tipovalorvariablenomiAux;
					break;
				}
			}


			sDescripcion=TipoValorVariableNomiConstantesFunciones.getTipoValorVariableNomiDescripcion(tipovalorvariablenomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoValorVariableNomiForeignKeyGenerico(Long idTipoValorVariableNomiSeleccionado,JComboBox jComboBoxid_tipo_valor_variable_nomiVariableNomiGenerico)throws Exception
	{
		try
		{
			TipoValorVariableNomi  tipovalorvariablenomiTemp=null;

			for(TipoValorVariableNomi tipovalorvariablenomiAux:tipovalorvariablenomisForeignKey) {
				if(tipovalorvariablenomiAux.getId()!=null && tipovalorvariablenomiAux.getId().equals(idTipoValorVariableNomiSeleccionado)) {
					tipovalorvariablenomiTemp=tipovalorvariablenomiAux;
					break;
				}
			}

			if(tipovalorvariablenomiTemp!=null) {
				jComboBoxid_tipo_valor_variable_nomiVariableNomiGenerico.setSelectedItem(tipovalorvariablenomiTemp);
			} else {
				if(jComboBoxid_tipo_valor_variable_nomiVariableNomiGenerico!=null && jComboBoxid_tipo_valor_variable_nomiVariableNomiGenerico.getItemCount()>0) {
					jComboBoxid_tipo_valor_variable_nomiVariableNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VariableNomi variablenomi,JComboBox jComboBoxid_empresaVariableNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVariableNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVariableNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				variablenomi.setid_empresa(empresaAux.getId());
				variablenomi.setempresa_descripcion(VariableNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				variablenomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(VariableNomi variablenomi,JComboBox jComboBoxid_moduloVariableNomiGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloVariableNomiGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloVariableNomiGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				variablenomi.setid_modulo(moduloAux.getId());
				variablenomi.setmodulo_descripcion(VariableNomiConstantesFunciones.getModuloDescripcion(moduloAux));
				variablenomi.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoVariableNomiForeignKey(VariableNomi variablenomi,JComboBox jComboBoxid_tipo_variable_nomiVariableNomiGenerico)throws Exception
	{
		try
		{
			TipoVariableNomi  tipovariablenomiAux=new TipoVariableNomi();

			if(jComboBoxid_tipo_variable_nomiVariableNomiGenerico==null) {
				tipovariablenomiAux=(TipoVariableNomi)this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.getSelectedItem();
			} else {
				tipovariablenomiAux=(TipoVariableNomi)jComboBoxid_tipo_variable_nomiVariableNomiGenerico.getSelectedItem();
			}

			if(tipovariablenomiAux!=null && tipovariablenomiAux.getId()!=null) {
				variablenomi.setid_tipo_variable_nomi(tipovariablenomiAux.getId());
				variablenomi.settipovariablenomi_descripcion(VariableNomiConstantesFunciones.getTipoVariableNomiDescripcion(tipovariablenomiAux));
				variablenomi.setTipoVariableNomi(tipovariablenomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoValorVariableNomiForeignKey(VariableNomi variablenomi,JComboBox jComboBoxid_tipo_valor_variable_nomiVariableNomiGenerico)throws Exception
	{
		try
		{
			TipoValorVariableNomi  tipovalorvariablenomiAux=new TipoValorVariableNomi();

			if(jComboBoxid_tipo_valor_variable_nomiVariableNomiGenerico==null) {
				tipovalorvariablenomiAux=(TipoValorVariableNomi)this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.getSelectedItem();
			} else {
				tipovalorvariablenomiAux=(TipoValorVariableNomi)jComboBoxid_tipo_valor_variable_nomiVariableNomiGenerico.getSelectedItem();
			}

			if(tipovalorvariablenomiAux!=null && tipovalorvariablenomiAux.getId()!=null) {
				variablenomi.setid_tipo_valor_variable_nomi(tipovalorvariablenomiAux.getId());
				variablenomi.settipovalorvariablenomi_descripcion(VariableNomiConstantesFunciones.getTipoValorVariableNomiDescripcion(tipovalorvariablenomiAux));
				variablenomi.setTipoValorVariableNomi(tipovalorvariablenomiAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) { 
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVariableNomi!=null) { 
					}

					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) { 
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVariableNomi!=null) { 
					}

					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoVariableNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoVariableNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) { 
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.removeAllItems();

							for(TipoVariableNomi tipovariablenomi:this.tipovariablenomisForeignKey) {
								this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.addItem(tipovariablenomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVariableNomi!=null) { 
					}

					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoVariableNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.removeAllItems();

							for(TipoVariableNomi tipovariablenomi:this.tipovariablenomisForeignKey) {
								this.jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.addItem(tipovariablenomi);
							}
						}

						if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoValorVariableNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoValorVariableNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) { 
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.removeAllItems();

							for(TipoValorVariableNomi tipovalorvariablenomi:this.tipovalorvariablenomisForeignKey) {
								this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.addItem(tipovalorvariablenomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVariableNomi!=null) { 
					}

					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoValorVariableNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.removeAllItems();

							for(TipoValorVariableNomi tipovalorvariablenomi:this.tipovalorvariablenomisForeignKey) {
								this.jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.addItem(tipovalorvariablenomi);
							}
						}

						if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoVariableNomiForeignKey(TipoVariableNomi tipovariablenomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setSelectedItem(tipovariablenomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setSelectedItem(tipovariablenomi);
						} else {
							this.jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoValorVariableNomiForeignKey(TipoValorVariableNomi tipovalorvariablenomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setSelectedItem(tipovalorvariablenomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormVariableNomi!=null) {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setSelectedItem(tipovalorvariablenomi);
						} else {
							this.jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVariableNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VariableNomiConstantesFunciones.refrescarForeignKeysDescripcionesVariableNomi(this.variablenomiLogic.getVariableNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VariableNomiConstantesFunciones.refrescarForeignKeysDescripcionesVariableNomi(this.variablenomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Modulo.class));
		classes.add(new Classe(TipoVariableNomi.class));
		classes.add(new Classe(TipoValorVariableNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//variablenomiLogic.setVariableNomis(this.variablenomis);
			variablenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public VariableNomiParameterReturnGeneral getVariableNomiParameterGeneral() {
		return this.variablenomiParameterGeneral;
	}
	
	public void setVariableNomiParameterGeneral(VariableNomiParameterReturnGeneral variablenomiParameterGeneral) {
		this.variablenomiParameterGeneral = variablenomiParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoVariableNomi() {
		return isPermisoTodoVariableNomi;
	}

	public void setIsPermisoTodoVariableNomi(Boolean isPermisoTodoVariableNomi) {
		this.isPermisoTodoVariableNomi = isPermisoTodoVariableNomi;
	}

	public Boolean getIsPermisoNuevoVariableNomi() {
		return isPermisoNuevoVariableNomi;
	}

	public void setIsPermisoNuevoVariableNomi(Boolean isPermisoNuevoVariableNomi) {
		this.isPermisoNuevoVariableNomi = isPermisoNuevoVariableNomi;
	}

	public Boolean getIsPermisoActualizarVariableNomi() {
		return isPermisoActualizarVariableNomi;
	}

	public void setIsPermisoActualizarVariableNomi(Boolean isPermisoActualizarVariableNomi) {
		this.isPermisoActualizarVariableNomi = isPermisoActualizarVariableNomi;
	}

	public Boolean getIsPermisoEliminarVariableNomi() {
		return isPermisoEliminarVariableNomi;
	}

	public void setIsPermisoEliminarVariableNomi(Boolean isPermisoEliminarVariableNomi) {
		this.isPermisoEliminarVariableNomi = isPermisoEliminarVariableNomi;
	}

	public Boolean getIsPermisoGuardarCambiosVariableNomi() {
		return isPermisoGuardarCambiosVariableNomi;
	}

	public void setIsPermisoGuardarCambiosVariableNomi(Boolean isPermisoGuardarCambiosVariableNomi) {
		this.isPermisoGuardarCambiosVariableNomi = isPermisoGuardarCambiosVariableNomi;
	}
	
	public Boolean getIsPermisoConsultaVariableNomi() {
		return isPermisoConsultaVariableNomi;
	}

	public void setIsPermisoConsultaVariableNomi(Boolean isPermisoConsultaVariableNomi) {
		this.isPermisoConsultaVariableNomi = isPermisoConsultaVariableNomi;
	}

	public Boolean getIsPermisoBusquedaVariableNomi() {
		return isPermisoBusquedaVariableNomi;
	}

	public void setIsPermisoBusquedaVariableNomi(Boolean isPermisoBusquedaVariableNomi) {
		this.isPermisoBusquedaVariableNomi = isPermisoBusquedaVariableNomi;
	}

	public Boolean getIsPermisoReporteVariableNomi() {
		return isPermisoReporteVariableNomi;
	}

	public void setIsPermisoReporteVariableNomi(Boolean isPermisoReporteVariableNomi) {
		this.isPermisoReporteVariableNomi = isPermisoReporteVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioVariableNomi() {
		return isPermisoPaginacionMedioVariableNomi;
	}

	public void setIsPermisoPaginacionMedioVariableNomi(Boolean isPermisoPaginacionMedioVariableNomi) {
		this.isPermisoPaginacionMedioVariableNomi = isPermisoPaginacionMedioVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoVariableNomi() {
		return isPermisoPaginacionTodoVariableNomi;
	}

	public void setIsPermisoPaginacionTodoVariableNomi(Boolean isPermisoPaginacionTodoVariableNomi) {
		this.isPermisoPaginacionTodoVariableNomi = isPermisoPaginacionTodoVariableNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoVariableNomi() {
		return isPermisoPaginacionAltoVariableNomi;
	}

	public void setIsPermisoPaginacionAltoVariableNomi(Boolean isPermisoPaginacionAltoVariableNomi) {
		this.isPermisoPaginacionAltoVariableNomi = isPermisoPaginacionAltoVariableNomi;
	}
	
	public Boolean getIsPermisoCopiarVariableNomi() {
		return isPermisoCopiarVariableNomi;
	}

	public void setIsPermisoCopiarVariableNomi(Boolean isPermisoCopiarVariableNomi) {
		this.isPermisoCopiarVariableNomi = isPermisoCopiarVariableNomi;
	}
	
	public Boolean getIsPermisoVerFormVariableNomi() {
		return isPermisoVerFormVariableNomi;
	}

	public void setIsPermisoVerFormVariableNomi(Boolean isPermisoVerFormVariableNomi) {
		this.isPermisoVerFormVariableNomi = isPermisoVerFormVariableNomi;
	}
	
	public Boolean getIsPermisoDuplicarVariableNomi() {
		return isPermisoDuplicarVariableNomi;
	}

	public void setIsPermisoDuplicarVariableNomi(Boolean isPermisoDuplicarVariableNomi) {
		this.isPermisoDuplicarVariableNomi = isPermisoDuplicarVariableNomi;
	}
	
	public Boolean getIsPermisoOrdenVariableNomi() {
		return isPermisoOrdenVariableNomi;
	}

	public void setIsPermisoOrdenVariableNomi(Boolean isPermisoOrdenVariableNomi) {
		this.isPermisoOrdenVariableNomi = isPermisoOrdenVariableNomi;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoVariableNomi() {
		return isVisibilidadCeldaNuevoVariableNomi;
	}

	public void setIsVisibilidadCeldaNuevoVariableNomi(Boolean isVisibilidadCeldaNuevoVariableNomi) {
		this.isVisibilidadCeldaNuevoVariableNomi = isVisibilidadCeldaNuevoVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVariableNomi() {
		return isVisibilidadCeldaDuplicarVariableNomi;
	}

	public void setIsVisibilidadCeldaDuplicarVariableNomi(Boolean isVisibilidadCeldaDuplicarVariableNomi) {
		this.isVisibilidadCeldaDuplicarVariableNomi = isVisibilidadCeldaDuplicarVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVariableNomi() {
		return isVisibilidadCeldaCopiarVariableNomi;
	}

	public void setIsVisibilidadCeldaCopiarVariableNomi(Boolean isVisibilidadCeldaCopiarVariableNomi) {
		this.isVisibilidadCeldaCopiarVariableNomi = isVisibilidadCeldaCopiarVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVariableNomi() {
		return isVisibilidadCeldaVerFormVariableNomi;
	}

	public void setIsVisibilidadCeldaVerFormVariableNomi(Boolean isVisibilidadCeldaVerFormVariableNomi) {
		this.isVisibilidadCeldaVerFormVariableNomi = isVisibilidadCeldaVerFormVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVariableNomi() {
		return isVisibilidadCeldaOrdenVariableNomi;
	}

	public void setIsVisibilidadCeldaOrdenVariableNomi(Boolean isVisibilidadCeldaOrdenVariableNomi) {
		this.isVisibilidadCeldaOrdenVariableNomi = isVisibilidadCeldaOrdenVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVariableNomi() {
		return isVisibilidadCeldaNuevoRelacionesVariableNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVariableNomi(Boolean isVisibilidadCeldaNuevoRelacionesVariableNomi) {
		this.isVisibilidadCeldaNuevoRelacionesVariableNomi = isVisibilidadCeldaNuevoRelacionesVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVariableNomi() {
		return isVisibilidadCeldaModificarVariableNomi;
	}

	public void setIsVisibilidadCeldaModificarVariableNomi(Boolean isVisibilidadCeldaModificarVariableNomi) {
		this.isVisibilidadCeldaModificarVariableNomi = isVisibilidadCeldaModificarVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVariableNomi() {
		return isVisibilidadCeldaActualizarVariableNomi;
	}

	public void setIsVisibilidadCeldaActualizarVariableNomi(Boolean isVisibilidadCeldaActualizarVariableNomi) {
		this.isVisibilidadCeldaActualizarVariableNomi = isVisibilidadCeldaActualizarVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarVariableNomi() {
		return isVisibilidadCeldaEliminarVariableNomi;
	}

	public void setIsVisibilidadCeldaEliminarVariableNomi(Boolean isVisibilidadCeldaEliminarVariableNomi) {
		this.isVisibilidadCeldaEliminarVariableNomi = isVisibilidadCeldaEliminarVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarVariableNomi() {
		return isVisibilidadCeldaCancelarVariableNomi;
	}

	public void setIsVisibilidadCeldaCancelarVariableNomi(Boolean isVisibilidadCeldaCancelarVariableNomi) {
		this.isVisibilidadCeldaCancelarVariableNomi = isVisibilidadCeldaCancelarVariableNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarVariableNomi() {
		return isVisibilidadCeldaGuardarVariableNomi;
	}

	public void setIsVisibilidadCeldaGuardarVariableNomi(Boolean isVisibilidadCeldaGuardarVariableNomi) {
		this.isVisibilidadCeldaGuardarVariableNomi = isVisibilidadCeldaGuardarVariableNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVariableNomi() {
		return isVisibilidadCeldaGuardarCambiosVariableNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVariableNomi(Boolean isVisibilidadCeldaGuardarCambiosVariableNomi) {
		this.isVisibilidadCeldaGuardarCambiosVariableNomi = isVisibilidadCeldaGuardarCambiosVariableNomi;
	}
		
	public VariableNomiSessionBean getvariablenomiSessionBean() {
		return this.variablenomiSessionBean;
	}
	
	public void setvariablenomiSessionBean(VariableNomiSessionBean variablenomiSessionBean) {
		this.variablenomiSessionBean=variablenomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	public Boolean getisVisibilidadFK_IdTipoValorVariableNomi() {
		return this.isVisibilidadFK_IdTipoValorVariableNomi;
	}

	public void setisVisibilidadFK_IdTipoValorVariableNomi(Boolean isVisibilidadFK_IdTipoValorVariableNomi) {
		this.isVisibilidadFK_IdTipoValorVariableNomi=isVisibilidadFK_IdTipoValorVariableNomi;
	}

	public Boolean getisVisibilidadFK_IdTipoVariableNomi() {
		return this.isVisibilidadFK_IdTipoVariableNomi;
	}

	public void setisVisibilidadFK_IdTipoVariableNomi(Boolean isVisibilidadFK_IdTipoVariableNomi) {
		this.isVisibilidadFK_IdTipoVariableNomi=isVisibilidadFK_IdTipoVariableNomi;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVariableNomi(VariableNomi variablenomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(variablenomi,null);
				this.setActualParaGuardarModuloForeignKey(variablenomi,null);
				this.setActualParaGuardarTipoVariableNomiForeignKey(variablenomi,null);
				this.setActualParaGuardarTipoValorVariableNomiForeignKey(variablenomi,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(VariableNomi variablenomi,VariableNomi variablenomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVariableNomi(variablenomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		variablenomiAux.setId(variablenomi.getId());
		variablenomiAux.setVersionRow(variablenomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVariableNomi();
		
			int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = variablenomiValidator.getInvalidValues(this.variablenomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			variablenomiLogic.setDatosCliente(datosCliente);
			variablenomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				variablenomiAux=new  VariableNomi();
				
				variablenomiAux.setIsNew(true);
				variablenomiAux.setIsChanged(true);
				
				variablenomiAux.setVariableNomiOriginal(this.variablenomi);
				
				variablenomiAux.setId(this.variablenomi.getId());	
				variablenomiAux.setVersionRow(this.variablenomi.getVersionRow());	
				variablenomiAux.setid_empresa(this.variablenomi.getid_empresa());	
				variablenomiAux.setid_modulo(this.variablenomi.getid_modulo());	
				variablenomiAux.setid_tipo_variable_nomi(this.variablenomi.getid_tipo_variable_nomi());	
				variablenomiAux.setid_tipo_valor_variable_nomi(this.variablenomi.getid_tipo_valor_variable_nomi());	
				variablenomiAux.setcodigo(this.variablenomi.getcodigo());	
				variablenomiAux.setnombre(this.variablenomi.getnombre());	
				variablenomiAux.setsql1(this.variablenomi.getsql1());	
				variablenomiAux.setsql2(this.variablenomi.getsql2());	
				variablenomiAux.setsql3(this.variablenomi.getsql3());	
				variablenomiAux.setvalor(this.variablenomi.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.variablenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(variablenomiAux,variablenomiLogic.getVariableNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(variablenomiAux,variablenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.variablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.variablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiLogic.saveVariableNomis();//WithConnection
						//variablenomiLogic.getSetVersionRowVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.variablenomi,variablenomiAux);
					
					this.refrescarForeignKeysDescripcionesVariableNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								variablenomiLogic.saveVariableNomiRelaciones(variablenomiAux);//WithConnection
								//variablenomiLogic.getSetVersionRowVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.variablenomi,variablenomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.variablenomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(variablenomiAux,variablenomiLogic.getVariableNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(variablenomiAux,variablenomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.variablenomi,variablenomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				variablenomiAux=new  VariableNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.variablenomiSessionBean.getEsGuardarRelacionado() 
					|| (this.variablenomiSessionBean.getEsGuardarRelacionado() && this.variablenomi.getId()>=0)) {
						
					variablenomiAux.setIsNew(false);
				}
				
				variablenomiAux.setIsDeleted(false);
			
				variablenomiAux.setId(this.variablenomi.getId());	
				variablenomiAux.setVersionRow(this.variablenomi.getVersionRow());	
				variablenomiAux.setid_empresa(this.variablenomi.getid_empresa());	
				variablenomiAux.setid_modulo(this.variablenomi.getid_modulo());	
				variablenomiAux.setid_tipo_variable_nomi(this.variablenomi.getid_tipo_variable_nomi());	
				variablenomiAux.setid_tipo_valor_variable_nomi(this.variablenomi.getid_tipo_valor_variable_nomi());	
				variablenomiAux.setcodigo(this.variablenomi.getcodigo());	
				variablenomiAux.setnombre(this.variablenomi.getnombre());	
				variablenomiAux.setsql1(this.variablenomi.getsql1());	
				variablenomiAux.setsql2(this.variablenomi.getsql2());	
				variablenomiAux.setsql3(this.variablenomi.getsql3());	
				variablenomiAux.setvalor(this.variablenomi.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(variablenomiAux,variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(variablenomiAux,variablenomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.variablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.variablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiLogic.saveVariableNomis();//WithConnection
						//variablenomiLogic.getSetVersionRowVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.variablenomi,variablenomiAux);
					
					this.refrescarForeignKeysDescripcionesVariableNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								variablenomiLogic.saveVariableNomiRelaciones(variablenomiAux);//WithConnection
								//variablenomiLogic.getSetVersionRowVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.variablenomi,variablenomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.variablenomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(variablenomiAux,variablenomiLogic.getVariableNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(variablenomiAux,variablenomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.variablenomi,variablenomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				variablenomiAux=new  VariableNomi();
				
				variablenomiAux.setIsNew(false);
				variablenomiAux.setIsChanged(false);
				
				variablenomiAux.setIsDeleted(true);
				
				variablenomiAux.setId(this.variablenomi.getId());	
				variablenomiAux.setVersionRow(this.variablenomi.getVersionRow());	
				variablenomiAux.setid_empresa(this.variablenomi.getid_empresa());	
				variablenomiAux.setid_modulo(this.variablenomi.getid_modulo());	
				variablenomiAux.setid_tipo_variable_nomi(this.variablenomi.getid_tipo_variable_nomi());	
				variablenomiAux.setid_tipo_valor_variable_nomi(this.variablenomi.getid_tipo_valor_variable_nomi());	
				variablenomiAux.setcodigo(this.variablenomi.getcodigo());	
				variablenomiAux.setnombre(this.variablenomi.getnombre());	
				variablenomiAux.setsql1(this.variablenomi.getsql1());	
				variablenomiAux.setsql2(this.variablenomi.getsql2());	
				variablenomiAux.setsql3(this.variablenomi.getsql3());	
				variablenomiAux.setvalor(this.variablenomi.getvalor());	
				
				if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.variablenomiAux.getId()>=0) {	
						this.variablenomisEliminados.add(variablenomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(variablenomiAux,variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(variablenomiAux,variablenomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.variablenomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.variablenomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiLogic.saveVariableNomis();//WithConnection
						//variablenomiLogic.getSetVersionRowVariableNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								variablenomiLogic.saveVariableNomiRelaciones(variablenomiAux);//WithConnection
								//variablenomiLogic.getSetVersionRowVariableNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.variablenomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(variablenomiAux,variablenomiLogic.getVariableNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(variablenomiAux,variablenomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getVariableNomis().addAll(this.variablenomisEliminados);
					
					variablenomiLogic.saveVariableNomis();//WithConnection
					//variablenomiLogic.getSetVersionRowVariableNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVariableNomi();
				
				this.variablenomisEliminados= new ArrayList<VariableNomi>();		
			}
			
			if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Variable Nomina GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.variablenomi=variablenomiAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessVariableNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(VariableNomi variablenomiLocal) throws Exception {
		
		if(this.variablenomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VariableNomi variablenomiLocal) throws Exception {	
		if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				variablenomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				variablenomiLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoVariableNomiDetalleFormJInternalFrame.class)) {
				TipoVariableNomiBeanSwingJInternalFrame tipovariablenomiBeanSwingJInternalFrameLocal=(TipoVariableNomiBeanSwingJInternalFrame) ((TipoVariableNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipovariablenomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoVariableNomi(tipovariablenomiBeanSwingJInternalFrameLocal.gettipovariablenomi(),true);
				tipovariablenomiBeanSwingJInternalFrameLocal.actualizarLista(tipovariablenomiBeanSwingJInternalFrameLocal.tipovariablenomi,this.tipovariablenomisForeignKey);

				tipovariablenomiBeanSwingJInternalFrameLocal.actualizarRelaciones(tipovariablenomiBeanSwingJInternalFrameLocal.tipovariablenomi);

				variablenomiLocal.setTipoVariableNomi(tipovariablenomiBeanSwingJInternalFrameLocal.tipovariablenomi);

				this.addItemDefectoCombosForeignKeyTipoVariableNomi();
				this.cargarCombosFrameTipoVariableNomisForeignKey("Formulario");
				this.setActualTipoVariableNomiForeignKey(tipovariablenomiBeanSwingJInternalFrameLocal.tipovariablenomi.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoValorVariableNomiDetalleFormJInternalFrame.class)) {
				TipoValorVariableNomiBeanSwingJInternalFrame tipovalorvariablenomiBeanSwingJInternalFrameLocal=(TipoValorVariableNomiBeanSwingJInternalFrame) ((TipoValorVariableNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipovalorvariablenomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoValorVariableNomi(tipovalorvariablenomiBeanSwingJInternalFrameLocal.gettipovalorvariablenomi(),true);
				tipovalorvariablenomiBeanSwingJInternalFrameLocal.actualizarLista(tipovalorvariablenomiBeanSwingJInternalFrameLocal.tipovalorvariablenomi,this.tipovalorvariablenomisForeignKey);

				tipovalorvariablenomiBeanSwingJInternalFrameLocal.actualizarRelaciones(tipovalorvariablenomiBeanSwingJInternalFrameLocal.tipovalorvariablenomi);

				variablenomiLocal.setTipoValorVariableNomi(tipovalorvariablenomiBeanSwingJInternalFrameLocal.tipovalorvariablenomi);

				this.addItemDefectoCombosForeignKeyTipoValorVariableNomi();
				this.cargarCombosFrameTipoValorVariableNomisForeignKey("Formulario");
				this.setActualTipoValorVariableNomiForeignKey(tipovalorvariablenomiBeanSwingJInternalFrameLocal.tipovalorvariablenomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVariableNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = variablenomiValidator.getInvalidValues(this.variablenomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VariableNomi variablenomi,List<VariableNomi> variablenomis) throws Exception {
		try	{		
			VariableNomiConstantesFunciones.actualizarLista(variablenomi,variablenomis,this.variablenomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VariableNomi variablenomi,List<VariableNomi> variablenomis) throws Exception {
		try	{			
			VariableNomiConstantesFunciones.actualizarSelectedLista(variablenomi,variablenomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VariableNomi> variablenomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				variablenomisLocal=this.variablenomiLogic.getVariableNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				variablenomisLocal=this.variablenomis;
			}
			//ARCHITECTURE
		
			for(VariableNomi variablenomiLocal:variablenomisLocal) {
				if(this.permiteMantenimiento(variablenomiLocal) && variablenomiLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+VariableNomiConstantesFunciones.getVariableNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelid_empresaVariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelid_moduloVariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.IDTIPOVARIABLENOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelid_tipo_variable_nomiVariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.IDTIPOVALORVARIABLENOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelid_tipo_valor_variable_nomiVariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelcodigoVariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelnombreVariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.SQL1)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelsql1VariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.SQL2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelsql2VariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.SQL3)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelsql3VariableNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VariableNomiConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelvalorVariableNomi,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelid_empresaVariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelid_moduloVariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelid_tipo_variable_nomiVariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelid_tipo_valor_variable_nomiVariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelcodigoVariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelnombreVariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelsql1VariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelsql2VariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelsql3VariableNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVariableNomi.jLabelvalorVariableNomi,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoVariableNomi--;	
		
		
		this.variablenomiAux=new VariableNomi();
		
		this.variablenomiAux.setId(this.iIdNuevoVariableNomi);
		this.variablenomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.variablenomiLogic.getVariableNomis().add(this.variablenomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.variablenomis.add(this.variablenomiAux);
		}
		//ARCHITECTURE
		
		this.variablenomi=this.variablenomiAux;
		
		if(VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVariableNomi(this.variablenomi);
			this.setVariablesObjetoActualToFormularioForeignKeyVariableNomi(this.variablenomi);
		}
				
		//this.setDefaultControlesVariableNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVariableNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVariableNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVariableNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVariableNomi(this.variablenomiBean,this.variablenomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VariableNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
			classes=VariableNomiConstantesFunciones.getClassesRelationshipsOfVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.variablenomiReturnGeneral=variablenomiLogic.procesarEventosVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.variablenomiLogic.getVariableNomis(),this.variablenomi,this.variablenomiParameterGeneral,this.isEsNuevoVariableNomi,classes);//this.variablenomiLogic.getVariableNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVariableNomi(this.variablenomiReturnGeneral,this.variablenomiBean,false);
		
		if(this.variablenomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVariableNomi(this.variablenomiReturnGeneral.getVariableNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVariableNomi(this.variablenomiReturnGeneral.getVariableNomi());
		}
		
		if(this.variablenomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVariableNomi(this.variablenomiReturnGeneral.getVariableNomi(),classes);//this.variablenomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVariableNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVariableNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VariableNomiBeanSwingJInternalFrameAdditional.RecargarFormVariableNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVariableNomi(false);
						
			if(variablenomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVariableNomi();
			}
			
			this.actualizarVisualTableDatosVariableNomi();
			
			this.jTableDatosVariableNomi.setRowSelectionInterval(this.getIndiceNuevoVariableNomi(), this.getIndiceNuevoVariableNomi());
			
			this.seleccionarFilaTablaVariableNomiActual();
						
			this.actualizarEstadoCeldasBotonesVariableNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVariableNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVariableNomi.jTextFieldcodigoVariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarcodigoVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextAreanombreVariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarnombreVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextAreasql1VariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarsql1VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextAreasql2VariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarsql2VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextAreasql3VariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarsql3VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextFieldvalorVariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarvalorVariableNomi);	
		//
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarid_empresaVariableNomi);//
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarid_moduloVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarid_tipo_variable_nomiVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setEnabled(isHabilitar && this.variablenomiConstantesFunciones.activarid_tipo_valor_variable_nomiVariableNomi);
	};
	
	public void setDefaultControlesVariableNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVariableNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.variablenomiSessionBean.setConGuardarRelaciones(true);			
			this.variablenomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.setVisible(true);
			
					
		} else {
			//this.variablenomiSessionBean.setConGuardarRelaciones(false);			
			this.variablenomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVariableNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
				if(variablenomiAux.getId().equals(this.iIdNuevoVariableNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VariableNomi variablenomiAux:this.variablenomis) {
				if(variablenomiAux.getId().equals(this.iIdNuevoVariableNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualVariableNomi(VariableNomi variablenomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
				if(variablenomiAux.getId().equals(variablenomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VariableNomi variablenomiAux:this.variablenomis) {
				if(variablenomiAux.getId().equals(variablenomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalVariableNomi(VariableNomi variablenomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
				if(variablenomiAux.getVariableNomiOriginal().getId().equals(variablenomiOriginal.getId())) {
					existe=true;
					variablenomiOriginal.setId(variablenomiAux.getId());
					variablenomiOriginal.setVersionRow(variablenomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VariableNomi variablenomiAux:this.variablenomis) {
				if(variablenomiAux.getVariableNomiOriginal().getId().equals(variablenomiOriginal.getId())) {
					existe=true;
					variablenomiOriginal.setId(variablenomiAux.getId());
					variablenomiOriginal.setVersionRow(variablenomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVariableNomi(Boolean esParaCancelar) throws Exception {
		variablenomisAux=new ArrayList<VariableNomi>();
		variablenomiAux=new VariableNomi();
		
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
					if(variablenomiAux.getId()<0) {
						variablenomisAux.add(variablenomiAux);
					}		
				}
				this.iIdNuevoVariableNomi=0L;
				this.variablenomiLogic.getVariableNomis().removeAll(variablenomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VariableNomi variablenomiAux:this.variablenomis) {
					if(variablenomiAux.getId()<0) {
						variablenomisAux.add(variablenomiAux);
					}		
				}
				this.iIdNuevoVariableNomi=0L;
				this.variablenomis.removeAll(variablenomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVariableNomi 
					&& this.variablenomiLogic.getVariableNomis().size()>0
					) {
					variablenomiAux=this.variablenomiLogic.getVariableNomis().get(this.variablenomiLogic.getVariableNomis().size() - 1);
				
					if(variablenomiAux.getId()<0) {
						this.variablenomiLogic.getVariableNomis().remove(variablenomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVariableNomi && this.variablenomis.size()>0) {
					variablenomiAux=this.variablenomis.get(this.variablenomis.size() - 1);
				
					if(variablenomiAux.getId()<0) {
						this.variablenomis.remove(variablenomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVariableNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(variablenomi.getId()<0) {
				this.variablenomiLogic.getVariableNomis().remove(this.variablenomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(variablenomi.getId()<0) {
				this.variablenomis.remove(this.variablenomi);
			}
		}			
	}
	
	public void setEstadosInicialesVariableNomi(List<VariableNomi> variablenomisAux) throws Exception {
		VariableNomiConstantesFunciones.setEstadosInicialesVariableNomi(variablenomisAux);
	}
	
	public void setEstadosInicialesVariableNomi(VariableNomi variablenomiAux) throws Exception {
		VariableNomiConstantesFunciones.setEstadosInicialesVariableNomi(variablenomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVariableNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVariableNomiActual()) {
				if(!this.isEsNuevoVariableNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVariableNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVariableNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Variable Nomina ?", "MANTENIMIENTO DE Variable Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VariableNomi variablenomi) throws Exception {
		VariableNomiConstantesFunciones.seleccionarAsignar(this.variablenomi,variablenomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVariableNomi=this.isPermisoActualizarOriginalVariableNomi;
			
			
			this.seleccionarAsignar(variablenomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VariableNomiConstantesFunciones.quitarEspaciosVariableNomi(this.variablenomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.variablenomiSessionBean.setsFuncionBusquedaRapida(this.variablenomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVariableNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVariableNomi(esParaCancelar);				
				this.cancelarNuevoVariableNomi(esParaCancelar);								
			}
			
			this.variablenomi=new VariableNomi();
			
			this.inicializarVariableNomi();
			
			this.actualizarEstadoCeldasBotonesVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVariableNomi() throws Exception {
		try {
			VariableNomiConstantesFunciones.inicializarVariableNomi(this.variablenomi);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.variablenomiLogic.getVariableNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVariableNomis(String sAccionBusqueda,List<VariableNomi> variablenomisParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="VariableNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VariableNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VariableNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VariableNomi"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Variable Nominas");		
		parameters.put("busquedapor", VariableNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVariableNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VariableNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVariableNomi=new JRBeanArrayDataSource(VariableNomiJInternalFrame.TraerVariableNomiBeans(variablenomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVariableNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VariableNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VariableNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VariableNomiBean.TraerVariableNomiBeans(variablenomisParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteVariableNomis(sAccionBusqueda,sTipoArchivoReporte,variablenomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVariableNomis(sAccionBusqueda,sTipoArchivoReporte,variablenomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVariableNomiActionPerformed(null);
					//this.generarExcelReporteVariableNomis(sAccionBusqueda,sTipoArchivoReporte,variablenomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVariableNomis(sAccionBusqueda,sTipoArchivoReporte,variablenomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVariableNomis(sAccionBusqueda,sTipoArchivoReporte,variablenomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVariableNomis(sAccionBusqueda,sTipoArchivoReporte,variablenomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<VariableNomi> variablenomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"variablenomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VariableNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVariableNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VariableNomi variablenomi : variablenomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VariableNomiConstantesFunciones.generarExcelReporteDataVariableNomi("NORMAL",row,workbook,variablenomi,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVariableNomi(String sTipo,Row row,Workbook workbook) {
		
		VariableNomiConstantesFunciones.generarExcelReporteHeaderVariableNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<VariableNomi> variablenomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"variablenomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VariableNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VariableNomi variablenomi : variablenomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VariableNomiConstantesFunciones.getVariableNomiDescripcion(variablenomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.gettipovariablenomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.gettipovalorvariablenomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_SQL1))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL1);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.getsql1());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_SQL2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.getsql2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_SQL3))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL3);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.getsql3());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VariableNomiConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VariableNomiConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(variablenomi.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVariableNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<VariableNomi> variablenomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VariableNomi> variablenomisRespaldo=null;
		
		classes=VariableNomiConstantesFunciones.getClassesRelationshipsOfVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.variablenomiLogic.setDatosCliente(this.datosCliente);
		this.variablenomiLogic.setDatosDeep(this.datosDeep);
		this.variablenomiLogic.setIsConDeep(true);
		
		variablenomisRespaldo=this.variablenomiLogic.getVariableNomis();
		
		this.variablenomiLogic.setVariableNomis(variablenomisParaReportes);	
		this.variablenomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		variablenomisParaReportes=this.variablenomiLogic.getVariableNomis();
		this.variablenomiLogic.setVariableNomis(variablenomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"variablenomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VariableNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVariableNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VariableNomi variablenomi : variablenomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVariableNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VariableNomiConstantesFunciones.generarExcelReporteDataVariableNomi("NORMAL",row,workbook,variablenomi,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VariableNomiConstantesFunciones.getVariableNomiDescripcion(variablenomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVariableNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVariableNomi() throws Exception {		
		this.startProcessVariableNomi(true);
	}
	
	public void startProcessVariableNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVariableNomi ,this.jPanelParametrosReportesVariableNomi, this.jScrollPanelDatosVariableNomi,this.jPanelPaginacionVariableNomi, this.jScrollPanelDatosEdicionVariableNomi, this.jPanelAccionesVariableNomi,this.jPanelAccionesFormularioVariableNomi,this.jmenuBarVariableNomi,this.jmenuBarDetalleVariableNomi,this.jTtoolBarVariableNomi,this.jTtoolBarDetalleVariableNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasVariableNomi=this.jTabbedPaneBusquedasVariableNomi; 
		
		final JPanel jPanelParametrosReportesVariableNomi=this.jPanelParametrosReportesVariableNomi;
		//final JScrollPane jScrollPanelDatosVariableNomi=this.jScrollPanelDatosVariableNomi;
		final JTable jTableDatosVariableNomi=this.jTableDatosVariableNomi;		
		final JPanel jPanelPaginacionVariableNomi=this.jPanelPaginacionVariableNomi;
		//final JScrollPane jScrollPanelDatosEdicionVariableNomi=this.jScrollPanelDatosEdicionVariableNomi;
		final JPanel jPanelAccionesVariableNomi=this.jPanelAccionesVariableNomi;
		
		JPanel jPanelCamposAuxiliarVariableNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVariableNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			jPanelCamposAuxiliarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jPanelCamposVariableNomi;
			jPanelAccionesFormularioAuxiliarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jPanelAccionesFormularioVariableNomi;
		}
		
		final JPanel jPanelCamposVariableNomi=jPanelCamposAuxiliarVariableNomi;
		final JPanel jPanelAccionesFormularioVariableNomi=jPanelAccionesFormularioAuxiliarVariableNomi;
		
		
		final JMenuBar jmenuBarVariableNomi=this.jmenuBarVariableNomi;
		final JToolBar jTtoolBarVariableNomi=this.jTtoolBarVariableNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVariableNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVariableNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			jmenuBarDetalleAuxiliarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jmenuBarDetalleVariableNomi;
			jTtoolBarDetalleAuxiliarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jTtoolBarDetalleVariableNomi;
		}
		
		final JMenuBar jmenuBarDetalleVariableNomi=jmenuBarDetalleAuxiliarVariableNomi;
		final JToolBar jTtoolBarDetalleVariableNomi=jTtoolBarDetalleAuxiliarVariableNomi;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVariableNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVariableNomi;
			processRunnable.jTableDatos=jTableDatosVariableNomi;
			processRunnable.jPanelCampos=jPanelCamposVariableNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionVariableNomi;
			processRunnable.jPanelAcciones=jPanelAccionesVariableNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVariableNomi;
			
			
			processRunnable.jmenuBar=jmenuBarVariableNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVariableNomi;
			processRunnable.jTtoolBar=jTtoolBarVariableNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVariableNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVariableNomi ,jPanelParametrosReportesVariableNomi,jTableDatosVariableNomi, /*jScrollPanelDatosVariableNomi,*/jPanelCamposVariableNomi,jPanelPaginacionVariableNomi, /*jScrollPanelDatosEdicionVariableNomi,*/ jPanelAccionesVariableNomi,jPanelAccionesFormularioVariableNomi,jmenuBarVariableNomi,jmenuBarDetalleVariableNomi,jTtoolBarVariableNomi,jTtoolBarDetalleVariableNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVariableNomi ,jPanelParametrosReportesVariableNomi, jScrollPanelDatosVariableNomi,jPanelPaginacionVariableNomi, jScrollPanelDatosEdicionVariableNomi, jPanelAccionesVariableNomi,jPanelAccionesFormularioVariableNomi,jmenuBarVariableNomi,jmenuBarDetalleVariableNomi,jTtoolBarVariableNomi,jTtoolBarDetalleVariableNomi);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessVariableNomi() {// throws Exception 
		this.finishProcessVariableNomi(true);
	}
	
	public void finishProcessVariableNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVariableNomi ,this.jPanelParametrosReportesVariableNomi, this.jScrollPanelDatosVariableNomi,this.jPanelPaginacionVariableNomi, this.jScrollPanelDatosEdicionVariableNomi, this.jPanelAccionesVariableNomi,this.jPanelAccionesFormularioVariableNomi,this.jmenuBarVariableNomi,this.jmenuBarDetalleVariableNomi,this.jTtoolBarVariableNomi,this.jTtoolBarDetalleVariableNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasVariableNomi=this.jTabbedPaneBusquedasVariableNomi; 
		
		final JPanel jPanelParametrosReportesVariableNomi=this.jPanelParametrosReportesVariableNomi;
		//final JScrollPane jScrollPanelDatosVariableNomi=this.jScrollPanelDatosVariableNomi;
		final JTable jTableDatosVariableNomi=this.jTableDatosVariableNomi;		
		final JPanel jPanelPaginacionVariableNomi=this.jPanelPaginacionVariableNomi;
		//final JScrollPane jScrollPanelDatosEdicionVariableNomi=this.jScrollPanelDatosEdicionVariableNomi;
		final JPanel jPanelAccionesVariableNomi=this.jPanelAccionesVariableNomi;
		
		JPanel jPanelCamposAuxiliarVariableNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVariableNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			jPanelCamposAuxiliarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jPanelCamposVariableNomi;
			jPanelAccionesFormularioAuxiliarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jPanelAccionesFormularioVariableNomi;
		}
		
		final JPanel jPanelCamposVariableNomi=jPanelCamposAuxiliarVariableNomi;
		final JPanel jPanelAccionesFormularioVariableNomi=jPanelAccionesFormularioAuxiliarVariableNomi;
		
		
		final JMenuBar jmenuBarVariableNomi=this.jmenuBarVariableNomi;		
		final JToolBar jTtoolBarVariableNomi=this.jTtoolBarVariableNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarVariableNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVariableNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			jmenuBarDetalleAuxiliarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jmenuBarDetalleVariableNomi;
			jTtoolBarDetalleAuxiliarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jTtoolBarDetalleVariableNomi;		
		}
		
		final JMenuBar jmenuBarDetalleVariableNomi=jmenuBarDetalleAuxiliarVariableNomi;
		final JToolBar jTtoolBarDetalleVariableNomi=jTtoolBarDetalleAuxiliarVariableNomi;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVariableNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVariableNomi;
			processRunnable.jTableDatos=jTableDatosVariableNomi;
			processRunnable.jPanelCampos=jPanelCamposVariableNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionVariableNomi;
			processRunnable.jPanelAcciones=jPanelAccionesVariableNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVariableNomi;
			
			
			processRunnable.jmenuBar=jmenuBarVariableNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVariableNomi;
			processRunnable.jTtoolBar=jTtoolBarVariableNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVariableNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVariableNomi ,jPanelParametrosReportesVariableNomi, jTableDatosVariableNomi,/*jScrollPanelDatosVariableNomi,*/jPanelCamposVariableNomi,jPanelPaginacionVariableNomi, /*jScrollPanelDatosEdicionVariableNomi,*/ jPanelAccionesVariableNomi,jPanelAccionesFormularioVariableNomi,jmenuBarVariableNomi,jmenuBarDetalleVariableNomi,jTtoolBarVariableNomi,jTtoolBarDetalleVariableNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVariableNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVariableNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVariableNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVariableNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVariableNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVariableNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVariableNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.variablenomiConstantesFunciones.getsFinalQueryVariableNomi();
		String  finalQueryPaginacionTodos=this.variablenomiConstantesFunciones.getsFinalQueryVariableNomi();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=VariableNomiConstantesFunciones.getArrayColumnasGlobalesNoVariableNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VariableNomiConstantesFunciones.getArrayColumnasGlobalesVariableNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VariableNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.variablenomisEliminados= new ArrayList<VariableNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVariableNomi();
		
				///*VariableNomiSessionBean*/this.variablenomiSessionBean=new VariableNomiSessionBean();
			
			if(this.variablenomiSessionBean==null) {
				this.variablenomiSessionBean=new VariableNomiSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=VariableNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VariableNomiConstantesFunciones.getClassesForeignKeysOfVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/variablenomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			variablenomisAux= new ArrayList<VariableNomi>();
			
				
			variablenomiLogic.setDatosCliente(this.datosCliente);
			variablenomiLogic.setDatosDeep(this.datosDeep);
			variablenomiLogic.setIsConDeep(true);
			
			
			variablenomiLogic.getVariableNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					variablenomiLogic.getTodosVariableNomis(finalQueryGlobal,pagination);
					
					//variablenomiLogic.getTodosVariableNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(variablenomiLogic.getVariableNomis()==null|| variablenomiLogic.getVariableNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							variablenomisAux= new ArrayList<VariableNomi>();
							variablenomisAux.addAll(variablenomiLogic.getVariableNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomisAux= new ArrayList<VariableNomi>();
							variablenomisAux.addAll(variablenomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							variablenomiLogic.getTodosVariableNomis(finalQueryGlobal+"",this.pagination);												
							
							//variablenomiLogic.getTodosVariableNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVariableNomis("Todos",variablenomiLogic.getVariableNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());					
							variablenomiLogic.getVariableNomis().addAll(variablenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomis=new ArrayList<VariableNomi>();
							variablenomis.addAll(variablenomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVariableNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVariableNomi=this.idActual;
				
				} else if(this.idVariableNomiActual!=null && this.idVariableNomiActual!=0L) {
					idVariableNomi=idVariableNomiActual;
				}
				
					
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndicePorId(idVariableNomi);
				
				this.variablenomis=new ArrayList<VariableNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					variablenomiLogic.getEntity(idVariableNomi);
					
					//variablenomiLogic.getEntityWithConnection(idVariableNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
					variablenomiLogic.getVariableNomis().add(variablenomiLogic.getVariableNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.variablenomis=new ArrayList<VariableNomi>();
					this.variablenomis.add(variablenomi);
				}
				
				if(variablenomiLogic.getVariableNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					variablenomiLogic.getVariableNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=variablenomiLogic.getVariableNomis()==null||variablenomiLogic.getVariableNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=variablenomis==null|| variablenomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomisAux=new ArrayList<VariableNomi>();
						variablenomisAux.addAll(variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomisAux=new ArrayList<VariableNomi>();
							variablenomisAux.addAll(variablenomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							variablenomiLogic.getVariableNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVariableNomis("FK_IdEmpresa",variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVariableNomis("FK_IdEmpresa",variablenomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
						variablenomiLogic.getVariableNomis().addAll(variablenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomis=new ArrayList<VariableNomi>();
							variablenomis.addAll(variablenomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					variablenomiLogic.getVariableNomisFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=variablenomiLogic.getVariableNomis()==null||variablenomiLogic.getVariableNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=variablenomis==null|| variablenomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomisAux=new ArrayList<VariableNomi>();
						variablenomisAux.addAll(variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomisAux=new ArrayList<VariableNomi>();
							variablenomisAux.addAll(variablenomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							variablenomiLogic.getVariableNomisFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVariableNomis("FK_IdModulo",variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVariableNomis("FK_IdModulo",variablenomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
						variablenomiLogic.getVariableNomis().addAll(variablenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomis=new ArrayList<VariableNomi>();
							variablenomis.addAll(variablenomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoValorVariableNomi")) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoValorVariableNomi(id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					variablenomiLogic.getVariableNomisFK_IdTipoValorVariableNomi(finalQueryGlobal,pagination,id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoValorVariableNomi(id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoValorVariableNomi(id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=variablenomiLogic.getVariableNomis()==null||variablenomiLogic.getVariableNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=variablenomis==null|| variablenomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomisAux=new ArrayList<VariableNomi>();
						variablenomisAux.addAll(variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomisAux=new ArrayList<VariableNomi>();
							variablenomisAux.addAll(variablenomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							variablenomiLogic.getVariableNomisFK_IdTipoValorVariableNomi(finalQueryGlobal,pagination,id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoValorVariableNomi(id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoValorVariableNomi(id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVariableNomis("FK_IdTipoValorVariableNomi",variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVariableNomis("FK_IdTipoValorVariableNomi",variablenomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
						variablenomiLogic.getVariableNomis().addAll(variablenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomis=new ArrayList<VariableNomi>();
							variablenomis.addAll(variablenomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoVariableNomi")) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoVariableNomi(id_tipo_variable_nomiFK_IdTipoVariableNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					variablenomiLogic.getVariableNomisFK_IdTipoVariableNomi(finalQueryGlobal,pagination,id_tipo_variable_nomiFK_IdTipoVariableNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoVariableNomi(id_tipo_variable_nomiFK_IdTipoVariableNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoVariableNomi(id_tipo_variable_nomiFK_IdTipoVariableNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=variablenomiLogic.getVariableNomis()==null||variablenomiLogic.getVariableNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=variablenomis==null|| variablenomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomisAux=new ArrayList<VariableNomi>();
						variablenomisAux.addAll(variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomisAux=new ArrayList<VariableNomi>();
							variablenomisAux.addAll(variablenomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							variablenomiLogic.getVariableNomisFK_IdTipoVariableNomi(finalQueryGlobal,pagination,id_tipo_variable_nomiFK_IdTipoVariableNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoVariableNomi(id_tipo_variable_nomiFK_IdTipoVariableNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VariableNomiConstantesFunciones.getDetalleIndiceFK_IdTipoVariableNomi(id_tipo_variable_nomiFK_IdTipoVariableNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVariableNomis("FK_IdTipoVariableNomi",variablenomiLogic.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVariableNomis("FK_IdTipoVariableNomi",variablenomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiLogic.setVariableNomis(new ArrayList<VariableNomi>());
						variablenomiLogic.getVariableNomis().addAll(variablenomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomis=new ArrayList<VariableNomi>();
							variablenomis.addAll(variablenomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVariableNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVariableNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=variablenomiLogic.getVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=variablenomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=variablenomiLogic.getVariableNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=variablenomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VariableNomi variablenomi) {
		Boolean permite=true;
		
		if(this.variablenomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VariableNomiConstantesFunciones.getOrderByListaVariableNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VariableNomiConstantesFunciones.getOrderByListaVariableNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VariableNomi variablenomi:variablenomiLogic.getVariableNomis()) {
				if(variablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					variablenomiTotales=variablenomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VariableNomi variablenomi:this.variablenomis) {
				if(variablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					variablenomiTotales=variablenomi;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.variablenomiAux=new VariableNomi();
			this.variablenomiAux.setsType(Constantes2.S_TOTALES);
			this.variablenomiAux.setIsNew(false);
			this.variablenomiAux.setIsChanged(false);
			this.variablenomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VariableNomiConstantesFunciones.TotalizarValoresFilaVariableNomi(this.variablenomiLogic.getVariableNomis(),this.variablenomiAux);
				
				this.variablenomiLogic.getVariableNomis().add(this.variablenomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VariableNomiConstantesFunciones.TotalizarValoresFilaVariableNomi(this.variablenomis,this.variablenomiAux);
				
				this.variablenomis.add(this.variablenomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		variablenomiTotales=new VariableNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.variablenomiLogic.getVariableNomis().remove(variablenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.variablenomis.remove(variablenomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		variablenomiTotales=new VariableNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VariableNomi variablenomi:variablenomiLogic.getVariableNomis()) {
				if(variablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					variablenomiTotales=variablenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VariableNomiConstantesFunciones.TotalizarValoresFilaVariableNomi(this.variablenomiLogic.getVariableNomis(),variablenomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VariableNomi variablenomi:this.variablenomis) {
				if(variablenomi.getsType().equals(Constantes2.S_TOTALES)) {
					variablenomiTotales=variablenomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VariableNomiConstantesFunciones.TotalizarValoresFilaVariableNomi(this.variablenomis,variablenomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVariableNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVariableNomisFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVariableNomisFK_IdTipoValorVariableNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoValorVariableNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVariableNomisFK_IdTipoVariableNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoVariableNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVariableNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					variablenomiLogic.getVariableNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVariableNomisFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					variablenomiLogic.getVariableNomisFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVariableNomisFK_IdTipoValorVariableNomi(String sFinalQuery,Long id_tipo_valor_variable_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					variablenomiLogic.getVariableNomisFK_IdTipoValorVariableNomi(sFinalQuery,this.pagination,id_tipo_valor_variable_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVariableNomisFK_IdTipoVariableNomi(String sFinalQuery,Long id_tipo_variable_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					variablenomiLogic.getVariableNomisFK_IdTipoVariableNomi(sFinalQuery,this.pagination,id_tipo_variable_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosVariableNomi() {
		this.isPermisoTodoVariableNomi=false;
		this.isPermisoNuevoVariableNomi=false;
		this.isPermisoActualizarVariableNomi=false;
		this.isPermisoActualizarOriginalVariableNomi=false;
		this.isPermisoEliminarVariableNomi=false;
		this.isPermisoGuardarCambiosVariableNomi=false;
		this.isPermisoConsultaVariableNomi=false;
		this.isPermisoBusquedaVariableNomi=false;
		this.isPermisoReporteVariableNomi=false;		
		this.isPermisoOrdenVariableNomi=false;		
		this.isPermisoPaginacionMedioVariableNomi=false;		
		this.isPermisoPaginacionAltoVariableNomi=false;
		this.isPermisoPaginacionTodoVariableNomi=false;
		this.isPermisoCopiarVariableNomi=false;		
		this.isPermisoVerFormVariableNomi=false;		
		this.isPermisoDuplicarVariableNomi=false;		
		this.isPermisoOrdenVariableNomi=false;		
	}
	
	public void setPermisosUsuarioVariableNomi(Boolean isPermiso) {
		this.isPermisoTodoVariableNomi=isPermiso;
		this.isPermisoNuevoVariableNomi=isPermiso;
		this.isPermisoActualizarVariableNomi=isPermiso;
		this.isPermisoActualizarOriginalVariableNomi=isPermiso;
		this.isPermisoEliminarVariableNomi=isPermiso;
		this.isPermisoGuardarCambiosVariableNomi=isPermiso;
		this.isPermisoConsultaVariableNomi=isPermiso;
		this.isPermisoBusquedaVariableNomi=isPermiso;
		this.isPermisoReporteVariableNomi=isPermiso;
		this.isPermisoOrdenVariableNomi=isPermiso;		
		this.isPermisoPaginacionMedioVariableNomi=isPermiso;		
		this.isPermisoPaginacionAltoVariableNomi=isPermiso;		
		this.isPermisoPaginacionTodoVariableNomi=isPermiso;		
		this.isPermisoCopiarVariableNomi=isPermiso;		
		this.isPermisoVerFormVariableNomi=isPermiso;		
		this.isPermisoDuplicarVariableNomi=isPermiso;
		this.isPermisoOrdenVariableNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVariableNomi(Boolean isPermiso) {
		//this.isPermisoTodoVariableNomi=isPermiso;
		this.isPermisoNuevoVariableNomi=isPermiso;
		this.isPermisoActualizarVariableNomi=isPermiso;
		this.isPermisoActualizarOriginalVariableNomi=isPermiso;
		this.isPermisoEliminarVariableNomi=isPermiso;
		this.isPermisoGuardarCambiosVariableNomi=isPermiso;
		//this.isPermisoConsultaVariableNomi=isPermiso;
		//this.isPermisoBusquedaVariableNomi=isPermiso;
		//this.isPermisoReporteVariableNomi=isPermiso;
		//this.isPermisoOrdenVariableNomi=isPermiso;		
		//this.isPermisoPaginacionMedioVariableNomi=isPermiso;		
		//this.isPermisoPaginacionAltoVariableNomi=isPermiso;		
		//this.isPermisoPaginacionTodoVariableNomi=isPermiso;		
		//this.isPermisoCopiarVariableNomi=isPermiso;		
		//this.isPermisoDuplicarVariableNomi=isPermiso;
		//this.isPermisoOrdenVariableNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVariableNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebVariableNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVariableNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVariableNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVariableNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVariableNomiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVariableNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VariableNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVariableNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVariableNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVariableNomi=this.isPermisoActualizarVariableNomi;
			this.isPermisoEliminarVariableNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVariableNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVariableNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVariableNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVariableNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVariableNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVariableNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVariableNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVariableNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVariableNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVariableNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVariableNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVariableNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVariableNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVariableNomi.setToolTipText(this.jTableDatosVariableNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVariableNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVariableNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(VariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioVariableNomi() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyVariableNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.modulosForeignKey=new ArrayList();
				this.tipovariablenomisForeignKey=new ArrayList();
				this.tipovalorvariablenomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVariableNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VariableNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVariableNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoVariableNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoValorVariableNomiListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoVariableNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipovariablenomisForeignKey==null||this.tipovariablenomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoVariableNomiConstantesFunciones.getArrayColumnasGlobalesTipoVariableNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoVariableNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoVariableNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoVariableNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoValorVariableNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipovalorvariablenomisForeignKey==null||this.tipovalorvariablenomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoValorVariableNomiConstantesFunciones.getArrayColumnasGlobalesTipoValorVariableNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValorVariableNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoValorVariableNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoValorVariableNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyVariableNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VariableNomiParameterReturnGeneral variablenomiReturnGeneral=new VariableNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.variablenomiConstantesFunciones.cargarid_empresaVariableNomi)
					 || (this.esRecargarFks && this.variablenomiConstantesFunciones.cargarid_empresaVariableNomi)) {

					if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+variablenomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.variablenomiConstantesFunciones.cargarid_moduloVariableNomi)
					 || (this.esRecargarFks && this.variablenomiConstantesFunciones.cargarid_moduloVariableNomi)) {

					if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+variablenomiSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}


				String finalQueryGlobalTipoVariableNomi="";

				if(((this.tipovariablenomisForeignKey==null||this.tipovariablenomisForeignKey.size()<=0) && this.variablenomiConstantesFunciones.cargarid_tipo_variable_nomiVariableNomi)
					 || (this.esRecargarFks && this.variablenomiConstantesFunciones.cargarid_tipo_variable_nomiVariableNomi)) {

					if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoVariableNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoVariableNomiConstantesFunciones.getArrayColumnasGlobalesTipoVariableNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoVariableNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoVariableNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoVariableNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoVariableNomi, "");
						finalQueryGlobalTipoVariableNomi+=TipoVariableNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoVariableNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoVariableNomi=" WHERE " + ConstantesSql.ID + "="+variablenomiSessionBean.getlidTipoVariableNomiActual();
					}
				} else {
					finalQueryGlobalTipoVariableNomi="NONE";
				}


				String finalQueryGlobalTipoValorVariableNomi="";

				if(((this.tipovalorvariablenomisForeignKey==null||this.tipovalorvariablenomisForeignKey.size()<=0) && this.variablenomiConstantesFunciones.cargarid_tipo_valor_variable_nomiVariableNomi)
					 || (this.esRecargarFks && this.variablenomiConstantesFunciones.cargarid_tipo_valor_variable_nomiVariableNomi)) {

					if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoValorVariableNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoValorVariableNomiConstantesFunciones.getArrayColumnasGlobalesTipoValorVariableNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoValorVariableNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoValorVariableNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoValorVariableNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoValorVariableNomi, "");
						finalQueryGlobalTipoValorVariableNomi+=TipoValorVariableNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoValorVariableNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoValorVariableNomi=" WHERE " + ConstantesSql.ID + "="+variablenomiSessionBean.getlidTipoValorVariableNomiActual();
					}
				} else {
					finalQueryGlobalTipoValorVariableNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				variablenomiReturnGeneral=variablenomiLogic.cargarCombosLoteForeignKeyVariableNomi(finalQueryGlobalEmpresa,finalQueryGlobalModulo,finalQueryGlobalTipoVariableNomi,finalQueryGlobalTipoValorVariableNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=variablenomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=variablenomiReturnGeneral.getmodulosForeignKey();
			}

			if(!finalQueryGlobalTipoVariableNomi.equals("NONE")) {
				this.tipovariablenomisForeignKey=variablenomiReturnGeneral.gettipovariablenomisForeignKey();
			}

			if(!finalQueryGlobalTipoValorVariableNomi.equals("NONE")) {
				this.tipovalorvariablenomisForeignKey=variablenomiReturnGeneral.gettipovalorvariablenomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVariableNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyModulo();
			this.addItemDefectoCombosForeignKeyTipoVariableNomi();
			this.addItemDefectoCombosForeignKeyTipoValorVariableNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.variablenomiSessionBean==null) {
				this.variablenomiSessionBean=new VariableNomiSessionBean();
			}

			if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {

			if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoVariableNomi()throws Exception {
		try {

			if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoVariableNomi()) {
				TipoVariableNomi tipovariablenomi=new TipoVariableNomi();
				TipoVariableNomiConstantesFunciones.setTipoVariableNomiDescripcion(tipovariablenomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipovariablenomi.setId(null);

				if(!TipoVariableNomiConstantesFunciones.ExisteEnLista(this.tipovariablenomisForeignKey,tipovariablenomi,true)) {

					this.tipovariablenomisForeignKey.add(0,tipovariablenomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoValorVariableNomi()throws Exception {
		try {

			if(!this.variablenomiSessionBean.getisBusquedaDesdeForeignKeySesionTipoValorVariableNomi()) {
				TipoValorVariableNomi tipovalorvariablenomi=new TipoValorVariableNomi();
				TipoValorVariableNomiConstantesFunciones.setTipoValorVariableNomiDescripcion(tipovalorvariablenomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipovalorvariablenomi.setId(null);

				if(!TipoValorVariableNomiConstantesFunciones.ExisteEnLista(this.tipovalorvariablenomisForeignKey,tipovalorvariablenomi,true)) {

					this.tipovalorvariablenomisForeignKey.add(0,tipovalorvariablenomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVariableNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVariableNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVariableNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualModuloForeignKey(this.moduloActual.getId(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVariableNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVariableNomi(VariableNomi variablenomi)throws Exception {	
		try {
			
			this.setActualTipoVariableNomiForeignKey(variablenomi.getid_tipo_variable_nomi(),false,"Formulario");
			this.setActualTipoValorVariableNomiForeignKey(variablenomi.getid_tipo_valor_variable_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVariableNomi(VariableNomi variablenomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVariableNomi()throws Exception {	
		try {
			
			this.setActualTipoVariableNomiForeignKey(this.variablenomiConstantesFunciones.getid_tipo_variable_nomi(),false,"Formulario");
			this.setActualTipoValorVariableNomiForeignKey(this.variablenomiConstantesFunciones.getid_tipo_valor_variable_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVariableNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVariableNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVariableNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVariableNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVariableNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameModulosForeignKey("Todos");
			this.cargarCombosFrameTipoVariableNomisForeignKey("Todos");
			this.cargarCombosFrameTipoValorVariableNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVariableNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoVariableNomisForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoValorVariableNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVariableNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public VariableNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VariableNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VariableNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.variablenomiSessionBean=new VariableNomiSessionBean(); 
		this.variablenomiConstantesFunciones=new VariableNomiConstantesFunciones(); 
		this.variablenomiBean=new VariableNomi();//(this.variablenomiConstantesFunciones); 		
		this.variablenomiReturnGeneral=new VariableNomiParameterReturnGeneral(); 
		
		this.variablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.variablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VariableNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVariableNomi(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.variablenomiConstantesFunciones=new VariableNomiConstantesFunciones(); 
			this.variablenomiBean=new VariableNomi();//this.variablenomiConstantesFunciones); 			
			this.variablenomiReturnGeneral=new VariableNomiParameterReturnGeneral(); 
		
			VariableNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Variable Nomina Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.variablenomi=new VariableNomi();
			this.variablenomis = new ArrayList<VariableNomi>();
			this.variablenomisAux = new ArrayList<VariableNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic=new VariableNomiLogic();
				this.variablenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.variablenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.variablenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVariableNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVariableNomi);	
					}
					
					if(this.jInternalFrameImportacionVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVariableNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVariableNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVariableNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVariableNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVariableNomi);
				this.jInternalFrameDetalleFormVariableNomi.setVisible(false);
				this.jInternalFrameDetalleFormVariableNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVariableNomi);
					this.jInternalFrameReporteDinamicoVariableNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoVariableNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVariableNomi);
					this.jInternalFrameImportacionVariableNomi.setVisible(false);
					this.jInternalFrameImportacionVariableNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVariableNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVariableNomi);
					this.jInternalFrameOrderByVariableNomi.setVisible(false);
					this.jInternalFrameOrderByVariableNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVariableNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VariableNomiConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.variablenomiReturnGeneral=new VariableNomiParameterReturnGeneral();
			
			this.variablenomiParameterGeneral=new VariableNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.variablenomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(VariableNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VariableNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.variablenomiSessionBean.getEsGuardarRelacionado(),this.variablenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VariableNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.variablenomiSessionBean.getEsGuardarRelacionado(),this.variablenomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoVariableNomi=false;
			this.isVisibilidadCeldaDuplicarVariableNomi=true;
			this.isVisibilidadCeldaCopiarVariableNomi=true;
			this.isVisibilidadCeldaVerFormVariableNomi=true;
			this.isVisibilidadCeldaOrdenVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
			this.isVisibilidadCeldaModificarVariableNomi=false;
			this.isVisibilidadCeldaActualizarVariableNomi=false;
			this.isVisibilidadCeldaEliminarVariableNomi=false;
			this.isVisibilidadCeldaCancelarVariableNomi=false;
			this.isVisibilidadCeldaGuardarVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdModulo=true;
			this.isVisibilidadFK_IdTipoValorVariableNomi=true;
			this.isVisibilidadFK_IdTipoVariableNomi=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVariableNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVariableNomi(false);
			
			this.setPermisosUsuarioVariableNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.variablenomiSessionBean.getEsGuardarRelacionado() 
				|| (this.variablenomiSessionBean.getEsGuardarRelacionado() && this.variablenomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVariableNomiClasesRelacionadas();
			}
			
			if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVariableNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVariableNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVariableNomi();
			}
			
			if(!this.isPermisoBusquedaVariableNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVariableNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVariableNomi,this.isPermisoPaginacionMedioVariableNomi,this.isPermisoPaginacionTodoVariableNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VariableNomiConstantesFunciones.getTiposSeleccionarVariableNomi());
				
				this.tiposColumnasSelect=VariableNomiConstantesFunciones.getTiposSeleccionarVariableNomi(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVariableNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioVariableNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioVariableNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVariableNomi() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.moduloLogic=new ModuloLogic();
			this.tipovariablenomiLogic=new TipoVariableNomiLogic();
			this.tipovalorvariablenomiLogic=new TipoValorVariableNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				variablenomiImplementable= (VariableNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VariableNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				variablenomiImplementableHome= (VariableNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VariableNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.variablenomis= new ArrayList<VariableNomi>();
			this.variablenomisEliminados= new ArrayList<VariableNomi>();
						
			this.isEsNuevoVariableNomi=false;
			this.esParaAccionDesdeFormularioVariableNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			this.tipovariablenomisForeignKey=new ArrayList<TipoVariableNomi>() ;
			this.tipovalorvariablenomisForeignKey=new ArrayList<TipoValorVariableNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVariableNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVariableNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VariableNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VariableNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVariableNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVariableNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVariableNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVariableNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVariableNomi();
			}
			
			VariableNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVariableNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVariableNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVariableNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVariableNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VariableNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVariableNomi() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVariableNomi")) {
				iIndex=this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVariableNomi();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyVariableNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVariableNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVariableNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVariableNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVariableNomi();
		
		this.cargarCombosFrameForeignKeyVariableNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVariableNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVariableNomi();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoVariableNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoVariableNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoVariableNomi();
				this.cargarCombosFrameTipoVariableNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoVariableNomi(this.tipovariablenomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoValorVariableNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoValorVariableNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoValorVariableNomi();
				this.cargarCombosFrameTipoValorVariableNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoValorVariableNomi(this.tipovalorvariablenomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVariableNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			
			if(jTableDatosVariableNomi.getRowCount()>=1) {
				jTableDatosVariableNomi.removeRowSelectionInterval(0, jTableDatosVariableNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoVariableNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVariableNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVariableNomi(true);			
			//this.variablenomi=new VariableNomi();
			//this.variablenomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVariableNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVariableNomi() ;
			
			if(VariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVariableNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.variablenomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);				
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VariableNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVariableNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVariableNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVariableNomi.getSelectedRows().length;			
			}
			
			variablenomisSeleccionados=this.getVariableNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVariableNomi--;			
				//VariableNomi variablenomiAux= new VariableNomi();			
				//variablenomiAux.setId(this.iIdNuevoVariableNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VariableNomi variablenomiOrigen=new VariableNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VariableNomi variablenomiOrigen : variablenomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							variablenomiOrigen =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							variablenomiOrigen =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVariableNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.variablenomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVariableNomi(variablenomiOrigen,this.variablenomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.variablenomiLogic.getVariableNomis().add(this.variablenomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.variablenomis.add(this.variablenomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVariableNomi(false);
				
				this.jTableDatosVariableNomi.setRowSelectionInterval(this.getIndiceNuevoVariableNomi(), this.getIndiceNuevoVariableNomi());
				
				int iLastRow =  this.jTableDatosVariableNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVariableNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVariableNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVariableNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();									
		
			VariableNomi variablenomiOrigen=new VariableNomi();
			VariableNomi variablenomiDestino=new VariableNomi();
				
			variablenomisSeleccionados=this.getVariableNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVariableNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || variablenomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVariableNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiOrigen =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						variablenomiOrigen =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						variablenomiDestino =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						variablenomiDestino =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				variablenomiOrigen =variablenomisSeleccionados.get(0);
				variablenomiDestino =variablenomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVariableNomi(variablenomiOrigen,variablenomiDestino,true,false);
				
				variablenomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(variablenomiDestino,variablenomiLogic.getVariableNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(variablenomiDestino,variablenomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVariableNomi(false);
				
				//this.jTableDatosVariableNomi.setRowSelectionInterval(this.getIndiceNuevoVariableNomi(), this.getIndiceNuevoVariableNomi());
				
				int iLastRow =  this.jTableDatosVariableNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVariableNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVariableNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVariableNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVariableNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVariableNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVariableNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVariableNomi.setVisible(!isVisible);
			this.jPanelPaginacionVariableNomi.setVisible(!isVisible);
			this.jPanelAccionesVariableNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVariableNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVariableNomi();
			
			this.abrirFrameOrderByVariableNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVariableNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVariableNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVariableNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVariableNomi.isMaximum()) {
					this.jInternalFrameDetalleFormVariableNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVariableNomi.setSize(this.jInternalFrameDetalleFormVariableNomi.iWidthFormulario,this.jInternalFrameDetalleFormVariableNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVariableNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVariableNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVariableNomi.isMaximum()) {
						this.jInternalFrameDetalleFormVariableNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVariableNomi.jContentPaneDetalleVariableNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVariableNomi.jContentPaneDetalleVariableNomi.getWidth(),VariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVariableNomi.jContentPaneDetalleVariableNomi.getWidth(),VariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVariableNomi.jContentPaneDetalleVariableNomi.getWidth(),VariableNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVariableNomi.setVisible(true);
	        this.jInternalFrameDetalleFormVariableNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVariableNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVariableNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVariableNomi,false,this);
				} else {
					this.jInternalFrameOrderByVariableNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVariableNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVariableNomi);
				this.jInternalFrameOrderByVariableNomi.setVisible(false);
				this.jInternalFrameOrderByVariableNomi.setSelected(false);
				
				this.jInternalFrameOrderByVariableNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVariableNomi"));
				
				this.inicializarActualizarBindingTablaOrderByVariableNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVariableNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVariableNomi==null) {
				
				this.jInternalFrameImportacionVariableNomi=new ImportacionJInternalFrame(VariableNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVariableNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVariableNomi);
				this.jInternalFrameImportacionVariableNomi.setVisible(false);
				this.jInternalFrameImportacionVariableNomi.setSelected(false);


				this.jInternalFrameImportacionVariableNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVariableNomi"));
				this.jInternalFrameImportacionVariableNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVariableNomi"));
				this.jInternalFrameImportacionVariableNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVariableNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVariableNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVariableNomi==null) {
				this.jInternalFrameReporteDinamicoVariableNomi=new ReporteDinamicoJInternalFrame(VariableNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVariableNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVariableNomi);
				this.jInternalFrameReporteDinamicoVariableNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoVariableNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVariableNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVariableNomi"));
				this.jInternalFrameReporteDinamicoVariableNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVariableNomi"));
				this.jInternalFrameReporteDinamicoVariableNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVariableNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVariableNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVariableNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVariableNomi);
			
	       	this.jInternalFrameDetalleFormVariableNomi.setVisible(false);
	        this.jInternalFrameDetalleFormVariableNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormVariableNomi.dispose();
			//this.jInternalFrameDetalleFormVariableNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVariableNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVariableNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVariableNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVariableNomi.setVisible(true);
	        this.jInternalFrameImportacionVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVariableNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVariableNomi.setVisible(true);
	        this.jInternalFrameOrderByVariableNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVariableNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVariableNomi.setVisible(false);
	        this.jInternalFrameOrderByVariableNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVariableNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVariableNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoVariableNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVariableNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVariableNomi.setVisible(false);
	        this.jInternalFrameImportacionVariableNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVariableNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVariableNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVariableNomi(true);
			//this.isEsNuevoVariableNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVariableNomi(false) ;
			
			if(variablenomiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVariableNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVariableNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVariableNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVariableNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVariableNomi(true);
			//this.isEsNuevoVariableNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.variablenomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVariableNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVariableNomi(false) ;
			
			if(VariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVariableNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVariableNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoVariableNomi(List<TipoVariableNomi> tipovariablenomisForeignKey)throws Exception{
		TableColumn tableColumnTipoVariableNomi=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI));
		TableCellEditor tableCellEditorTipoVariableNomi =tableColumnTipoVariableNomi.getCellEditor();

		TipoVariableNomiTableCell tipovariablenomiTableCellFk=(TipoVariableNomiTableCell)tableCellEditorTipoVariableNomi;

		if(tipovariablenomiTableCellFk!=null) {
			tipovariablenomiTableCellFk.settipovariablenomisForeignKey(tipovariablenomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVariableNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipovariablenomiTableCellFk.setRowActual(intSelectedRow);
			//tipovariablenomiTableCellFk.settipovariablenomisForeignKeyActual(tipovariablenomisForeignKey);
		//}


		if(tipovariablenomiTableCellFk!=null) {
			tipovariablenomiTableCellFk.RecargarTipoVariableNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoValorVariableNomi(List<TipoValorVariableNomi> tipovalorvariablenomisForeignKey)throws Exception{
		TableColumn tableColumnTipoValorVariableNomi=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI));
		TableCellEditor tableCellEditorTipoValorVariableNomi =tableColumnTipoValorVariableNomi.getCellEditor();

		TipoValorVariableNomiTableCell tipovalorvariablenomiTableCellFk=(TipoValorVariableNomiTableCell)tableCellEditorTipoValorVariableNomi;

		if(tipovalorvariablenomiTableCellFk!=null) {
			tipovalorvariablenomiTableCellFk.settipovalorvariablenomisForeignKey(tipovalorvariablenomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVariableNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipovalorvariablenomiTableCellFk.setRowActual(intSelectedRow);
			//tipovalorvariablenomiTableCellFk.settipovalorvariablenomisForeignKeyActual(tipovalorvariablenomisForeignKey);
		//}


		if(tipovalorvariablenomiTableCellFk!=null) {
			tipovalorvariablenomiTableCellFk.RecargarTipoValorVariableNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVariableNomi(false);
			
			//if(!this.isEsNuevoVariableNomi) {								
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				
			}
			
			if(this.permiteMantenimiento(this.variablenomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVariableNomi=true;
					this.inicializarActualizarBindingTablaVariableNomi(false);
					this.isEsNuevoVariableNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVariableNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVariableNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVariableNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVariableNomi(false);
				
				this.habilitarDeshabilitarControlesVariableNomi(false);
			
												
				
				if(VariableNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVariableNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVariableNomiActionPerformed(evt,variablenomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVariableNomi(this.variablenomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVariableNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,variablenomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.variablenomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVariableNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				this.variablenomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				this.variablenomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.variablenomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VariableNomiModel) this.jTableDatosVariableNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVariableNomi=true;
				this.inicializarActualizarBindingTablaVariableNomi(false);
				this.isEsNuevoVariableNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVariableNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVariableNomi(false);
				
				this.habilitarDeshabilitarControlesVariableNomi(false);
				
				
				
				if(VariableNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVariableNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVariableNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVariableNomi.getRowCount()>=1) {
				jTableDatosVariableNomi.removeRowSelectionInterval(0, jTableDatosVariableNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVariableNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVariableNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVariableNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVariableNomi(false) ;
			
			this.isEsNuevoVariableNomi=false;
			
			if(VariableNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVariableNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVariableNomi(false);
				
				//SI ES MANUAL
				if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVariableNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVariableNomi--;			
			//VariableNomi variablenomiAux= new VariableNomi();			
			//variablenomiAux.setId(this.iIdNuevoVariableNomi);
			
			if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVariableNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
			
			this.variablenomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.variablenomiLogic.getVariableNomis().add(this.variablenomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.variablenomis.add(this.variablenomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVariableNomi(false);
			
			this.jTableDatosVariableNomi.setRowSelectionInterval(this.getIndiceNuevoVariableNomi(), this.getIndiceNuevoVariableNomi());
			
			int iLastRow =  this.jTableDatosVariableNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVariableNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVariableNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVariableNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVariableNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVariableNomi(false);
			
			//SI ES MANUAL
			if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVariableNomi();
			}
			
			//this.abrirFrameTreeVariableNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVariableNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Variable NominaS ?", "MANTENIMIENTO DE Variable Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVariableNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVariableNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.variablenomiReturnGeneral=variablenomiLogic.procesarImportacionVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.variablenomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVariableNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVariableNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVariableNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVariableNomi.setFileImportacion(this.jInternalFrameImportacionVariableNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVariableNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVariableNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVariableNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVariableNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		

		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VariableNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VariableNomiBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteVariableNomis("Todos",variablenomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VariableNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoVariableNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoVariableNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoVariableNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoVariableNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoValorVariableNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoValorVariableNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoValorVariableNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoValorVariableNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_SQL1:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_l1_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_l1_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_l1_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_l1_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_SQL2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_l2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_l2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_l2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_l2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_SQL3:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_l3_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_l3_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_l3_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_l3_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VariableNomiConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoVariableNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VariableNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VariableNomiConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI:
					sNombreCampoCategoria="id_tipo_variable_nomi";
					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI:
					sNombreCampoCategoria="id_tipo_valor_variable_nomi";
					break;

				case VariableNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case VariableNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL1:
					sNombreCampoCategoria="sql1";
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL2:
					sNombreCampoCategoria="sql2";
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL3:
					sNombreCampoCategoria="sql3";
					break;

				case VariableNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VariableNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VariableNomiConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI:
					sNombreCampoCategoriaValor="id_tipo_variable_nomi";
					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI:
					sNombreCampoCategoriaValor="id_tipo_valor_variable_nomi";
					break;

				case VariableNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case VariableNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL1:
					sNombreCampoCategoriaValor="sql1";
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL2:
					sNombreCampoCategoriaValor="sql2";
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL3:
					sNombreCampoCategoriaValor="sql3";
					break;

				case VariableNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VariableNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VariableNomiConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Variable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_variable_nomi");
					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Valor Variable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_valor_variable_nomi");
					break;

				case VariableNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case VariableNomiConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL1:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sql1",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sql1");
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sql2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sql2");
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL3:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sql3",sNombreCampoCategoria,sNombreCampoCategoriaValor,"sql3");
					break;

				case VariableNomiConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoVariableNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"variablenomi";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("VariableNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VariableNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.gettipovariablenomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.gettipovalorvariablenomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL1:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL1);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.getsql1());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL2);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.getsql2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_SQL3:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL3);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.getsql3());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VariableNomiConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VariableNomiConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(VariableNomi variablenomi:variablenomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(variablenomi.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelVariableNomi(row);				
			//	iRow++;
			//}				
			
			//for(VariableNomi variablenomiAux:variablenomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVariableNomi(variablenomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVariableNomi(false);
			
			//SI ES MANUAL
			if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVariableNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVariableNomi(false);
			
			//SI ES MANUAL
			if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVariableNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVariableNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVariableNomi(false);
			
			//SI ES MANUAL
			if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVariableNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVariableNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVariableNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVariableNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVariableNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVariableNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVariableNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosVariableNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosVariableNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVariableNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVariableNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVariableNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVariableNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVariableNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVariableNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVariableNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVariableNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VariableNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVariableNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVariableNomi();
		
		this.inicializarActualizarBindingBotonesManualVariableNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVariableNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVariableNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVariableNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVariableNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVariableNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVariableNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVariableNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVariableNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVariableNomi.jCheckBoxPostAccionNuevoVariableNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVariableNomi.jCheckBoxPostAccionSinCerrarVariableNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVariableNomi.jCheckBoxPostAccionSinMensajeVariableNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVariableNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVariableNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVariableNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVariableNomi!=null) {
				this.jInternalFrameDetalleFormVariableNomi.jCheckBoxPostAccionNuevoVariableNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVariableNomi.jCheckBoxPostAccionSinCerrarVariableNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVariableNomi.jCheckBoxPostAccionSinMensajeVariableNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVariableNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVariableNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVariableNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVariableNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVariableNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVariableNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVariableNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVariableNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVariableNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVariableNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVariableNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVariableNomi() throws Exception {
		try	{
			if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVariableNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVariableNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVariableNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVariableNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVariableNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVariableNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVariableNomi.addItem(reporte);
			}
			
			
			if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVariableNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVariableNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVariableNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVariableNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVariableNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVariableNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVariableNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVariableNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVariableNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVariableNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVariableNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVariableNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VariableNomiConstantesFunciones.getTiposSeleccionarVariableNomi(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VariableNomiConstantesFunciones.getTiposSeleccionarVariableNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VariableNomiConstantesFunciones.getTiposSeleccionarVariableNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVariableNomi.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVariableNomi.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVariableNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.getSelectedItem()!=null){this.id_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi=((TipoValorVariableNomi)this.jComboBoxid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomiVariableNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.getSelectedItem()!=null){this.id_tipo_variable_nomiFK_IdTipoVariableNomi=((TipoVariableNomi)this.jComboBoxid_tipo_variable_nomiFK_IdTipoVariableNomiVariableNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVariableNomi(Boolean esInicializar) throws Exception {				
		if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVariableNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVariableNomi() throws Exception {
		this.inicializarActualizarBindingTablaVariableNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVariableNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVariableNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVariableNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=variablenomiLogic.getVariableNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=variablenomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVariableNomi.setModel(new VariableNomiModel(this.variablenomiLogic.getVariableNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVariableNomi.setModel(new VariableNomiModel(this.variablenomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVariableNomi!=null && this.jInternalFrameOrderByVariableNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVariableNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VariableNomiConstantesFunciones.SCLASSWEBTITULO,variablenomiConstantesFunciones.resaltarSeleccionarVariableNomi,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VariableNomiConstantesFunciones.SCLASSWEBTITULO,variablenomiConstantesFunciones.resaltarSeleccionarVariableNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_ID));

		if(this.variablenomiConstantesFunciones.mostraridVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.variablenomiConstantesFunciones.resaltaridVariableNomi,this.variablenomiConstantesFunciones.activaridVariableNomi,iSizeTabla,this,true,"idVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.variablenomiConstantesFunciones.resaltaridVariableNomi,this.variablenomiConstantesFunciones.activaridVariableNomi,this,true,"idVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.variablenomiConstantesFunciones.mostrarid_empresaVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.variablenomiConstantesFunciones.resaltarid_empresaVariableNomi,this,this.variablenomiConstantesFunciones.activarid_empresaVariableNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.variablenomiConstantesFunciones.resaltarid_empresaVariableNomi,this,this.variablenomiConstantesFunciones.activarid_empresaVariableNomi,false,"id_empresaVariableNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_IDMODULO));

		if(this.variablenomiConstantesFunciones.mostrarid_moduloVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.variablenomiConstantesFunciones.resaltarid_moduloVariableNomi,this,this.variablenomiConstantesFunciones.activarid_moduloVariableNomi,iSizeTabla));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.variablenomiConstantesFunciones.resaltarid_moduloVariableNomi,this,this.variablenomiConstantesFunciones.activarid_moduloVariableNomi,false,"id_moduloVariableNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI));

		if(this.variablenomiConstantesFunciones.mostrarid_tipo_variable_nomiVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoVariableNomiTableCell(this.tipovariablenomisForeignKey,this.variablenomiConstantesFunciones.resaltarid_tipo_variable_nomiVariableNomi,this,this.variablenomiConstantesFunciones.activarid_tipo_variable_nomiVariableNomi,iSizeTabla));
			tableColumn.setCellEditor(new TipoVariableNomiTableCell(this.tipovariablenomisForeignKey,this.variablenomiConstantesFunciones.resaltarid_tipo_variable_nomiVariableNomi,this,this.variablenomiConstantesFunciones.activarid_tipo_variable_nomiVariableNomi,true,"id_tipo_variable_nomiVariableNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI));

		if(this.variablenomiConstantesFunciones.mostrarid_tipo_valor_variable_nomiVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoValorVariableNomiTableCell(this.tipovalorvariablenomisForeignKey,this.variablenomiConstantesFunciones.resaltarid_tipo_valor_variable_nomiVariableNomi,this,this.variablenomiConstantesFunciones.activarid_tipo_valor_variable_nomiVariableNomi,iSizeTabla));
			tableColumn.setCellEditor(new TipoValorVariableNomiTableCell(this.tipovalorvariablenomisForeignKey,this.variablenomiConstantesFunciones.resaltarid_tipo_valor_variable_nomiVariableNomi,this,this.variablenomiConstantesFunciones.activarid_tipo_valor_variable_nomiVariableNomi,true,"id_tipo_valor_variable_nomiVariableNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_CODIGO));

		if(this.variablenomiConstantesFunciones.mostrarcodigoVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.variablenomiConstantesFunciones.resaltarcodigoVariableNomi,this.variablenomiConstantesFunciones.activarcodigoVariableNomi,iSizeTabla,this,true,"codigoVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.variablenomiConstantesFunciones.resaltarcodigoVariableNomi,this.variablenomiConstantesFunciones.activarcodigoVariableNomi,this,true,"codigoVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.variablenomiConstantesFunciones.mostrarnombreVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.variablenomiConstantesFunciones.resaltarnombreVariableNomi,this.variablenomiConstantesFunciones.activarnombreVariableNomi,iSizeTabla,this,true,"nombreVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.variablenomiConstantesFunciones.resaltarnombreVariableNomi,this.variablenomiConstantesFunciones.activarnombreVariableNomi,this,true,"nombreVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_SQL1));

		if(this.variablenomiConstantesFunciones.mostrarsql1VariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_SQL1,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.variablenomiConstantesFunciones.resaltarsql1VariableNomi,this.variablenomiConstantesFunciones.activarsql1VariableNomi,iSizeTabla,this,true,"sql1VariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.variablenomiConstantesFunciones.resaltarsql1VariableNomi,this.variablenomiConstantesFunciones.activarsql1VariableNomi,this,true,"sql1VariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_SQL2));

		if(this.variablenomiConstantesFunciones.mostrarsql2VariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_SQL2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.variablenomiConstantesFunciones.resaltarsql2VariableNomi,this.variablenomiConstantesFunciones.activarsql2VariableNomi,iSizeTabla,this,true,"sql2VariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.variablenomiConstantesFunciones.resaltarsql2VariableNomi,this.variablenomiConstantesFunciones.activarsql2VariableNomi,this,true,"sql2VariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_SQL3));

		if(this.variablenomiConstantesFunciones.mostrarsql3VariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_SQL3,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.variablenomiConstantesFunciones.resaltarsql3VariableNomi,this.variablenomiConstantesFunciones.activarsql3VariableNomi,iSizeTabla,this,true,"sql3VariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.variablenomiConstantesFunciones.resaltarsql3VariableNomi,this.variablenomiConstantesFunciones.activarsql3VariableNomi,this,true,"sql3VariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,VariableNomiConstantesFunciones.LABEL_VALOR));

		if(this.variablenomiConstantesFunciones.mostrarvalorVariableNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VariableNomiConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.variablenomiConstantesFunciones.resaltarvalorVariableNomi,this.variablenomiConstantesFunciones.activarvalorVariableNomi,iSizeTabla,this,true,"valorVariableNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.variablenomiConstantesFunciones.resaltarvalorVariableNomi,this.variablenomiConstantesFunciones.activarvalorVariableNomi,this,true,"valorVariableNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VariableNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.variablenomiSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.variablenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.variablenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVariableNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.variablenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.variablenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVariableNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVariableNomi && this.isPermisoGuardarCambiosVariableNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.variablenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.variablenomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVariableNomi.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosVariableNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVariableNomi && this.isPermisoGuardarCambiosVariableNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVariableNomi && this.isPermisoGuardarCambiosVariableNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVariableNomi.moveColumn(this.jTableDatosVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVariableNomi.moveColumn(this.jTableDatosVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVariableNomi.moveColumn(this.jTableDatosVariableNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVariableNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVariableNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVariableNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVariableNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVariableNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVariableNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVariableNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVariableNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=variablenomiLogic.getVariableNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=variablenomis.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosVariableNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVariableNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVariableNomi();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoVariableNomi=false;
					
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
				if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVariableNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVariableNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVariableNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.variablenomi.getsType().equals("DUPLICADO")
				   || this.variablenomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVariableNomi=true;
				
				} else {
					this.isEsNuevoVariableNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.variablenomiSessionBean.getEsGuardarRelacionado()) {
					if(this.variablenomi.getId()>=0 && !this.variablenomi.getIsNew()) {						
						this.isEsNuevoVariableNomi=false;
						
					} else {
						this.isEsNuevoVariableNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVariableNomi(esRelaciones);						
				
				this.seleccionarVariableNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.variablenomi.getId()<0) {
					this.isEsNuevoVariableNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVariableNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVariableNomi(evt,rowIndex);
				}	
				
				if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VariableNomi: " + this.dDif); 
					}
				}								
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVariableNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.variablenomi)) {
					if(this.variablenomi.getId()>0) {
						this.variablenomi.setIsDeleted(true);
						
						this.variablenomisEliminados.add(this.variablenomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.variablenomiLogic.getVariableNomis().remove(this.variablenomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.variablenomis.remove(this.variablenomi);				
					}
					
					
					((VariableNomiModel) this.jTableDatosVariableNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVariableNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVariableNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVariableNomi) {
			
			if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVariableNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVariableNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVariableNomi(this.variablenomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.variablenomiConstantesFunciones.cargarid_empresaVariableNomi || this.variablenomiConstantesFunciones.event_dependid_empresaVariableNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.variablenomi.getid_empresa());
									//this.inicializarActualizarBindingVariableNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(variablenomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(variablenomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.variablenomi.getid_empresa(),false,"Formulario");

					//Modulo
					if(!this.variablenomiConstantesFunciones.cargarid_moduloVariableNomi || this.variablenomiConstantesFunciones.event_dependid_moduloVariableNomi) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.variablenomi.getid_modulo());
									//this.inicializarActualizarBindingVariableNomi(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(variablenomi.getModulo()!=null) {
							this.modulosForeignKey.add(variablenomi.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.variablenomi.getid_modulo(),false,"Formulario");

					//TipoVariableNomi
					if(!this.variablenomiConstantesFunciones.cargarid_tipo_variable_nomiVariableNomi || this.variablenomiConstantesFunciones.event_dependid_tipo_variable_nomiVariableNomi) {
						//this.cargarCombosTipoVariableNomisForeignKeyLista(" where id="+this.variablenomi.getid_tipo_variable_nomi());
									//this.inicializarActualizarBindingVariableNomi(false,false);
						this.tipovariablenomisForeignKey=new ArrayList<TipoVariableNomi>();

						if(variablenomi.getTipoVariableNomi()!=null) {
							this.tipovariablenomisForeignKey.add(variablenomi.getTipoVariableNomi());
						}

						this.addItemDefectoCombosForeignKeyTipoVariableNomi();
						this.cargarCombosFrameTipoVariableNomisForeignKey("Todos");
					}
					this.setActualTipoVariableNomiForeignKey(this.variablenomi.getid_tipo_variable_nomi(),false,"Formulario");

					//TipoValorVariableNomi
					if(!this.variablenomiConstantesFunciones.cargarid_tipo_valor_variable_nomiVariableNomi || this.variablenomiConstantesFunciones.event_dependid_tipo_valor_variable_nomiVariableNomi) {
						//this.cargarCombosTipoValorVariableNomisForeignKeyLista(" where id="+this.variablenomi.getid_tipo_valor_variable_nomi());
									//this.inicializarActualizarBindingVariableNomi(false,false);
						this.tipovalorvariablenomisForeignKey=new ArrayList<TipoValorVariableNomi>();

						if(variablenomi.getTipoValorVariableNomi()!=null) {
							this.tipovalorvariablenomisForeignKey.add(variablenomi.getTipoValorVariableNomi());
						}

						this.addItemDefectoCombosForeignKeyTipoValorVariableNomi();
						this.cargarCombosFrameTipoValorVariableNomisForeignKey("Todos");
					}
					this.setActualTipoValorVariableNomiForeignKey(this.variablenomi.getid_tipo_valor_variable_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVariableNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVariableNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVariableNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVariableNomi(VariableNomi variablenomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVariableNomi(variablenomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVariableNomi(VariableNomi variablenomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVariableNomi(variablenomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVariableNomi(variablenomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVariableNomi(variablenomi);
	}
	
	public void setVariablesObjetoActualToFormularioVariableNomi(VariableNomi variablenomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.setText(variablenomi.getId().toString());
			this.jInternalFrameDetalleFormVariableNomi.jTextFieldcodigoVariableNomi.setText(variablenomi.getcodigo());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreanombreVariableNomi.setText(variablenomi.getnombre());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql1VariableNomi.setText(variablenomi.getsql1());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql2VariableNomi.setText(variablenomi.getsql2());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql3VariableNomi.setText(variablenomi.getsql3());
			this.jInternalFrameDetalleFormVariableNomi.jTextFieldvalorVariableNomi.setText(variablenomi.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VariableNomi variablenomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,variablenomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VariableNomi variablenomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				variablenomiLocal=this.variablenomi;
			} else {
				variablenomiLocal=this.variablenomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(variablenomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVariableNomi(variablenomiLocal,true);
					
					if(variablenomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(variablenomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(variablenomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVariableNomi(VariableNomi variablenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVariableNomi(variablenomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(variablenomi);
	}
	
	public void setVariablesFormularioToObjetoActualVariableNomi(VariableNomi variablenomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVariableNomi(variablenomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVariableNomi(VariableNomi variablenomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.getText()==null || this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.getText()=="" || this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.setText("0");
			}

			if(conColumnasBase) {variablenomi.setId(Long.parseLong(this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VariableNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelIdVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			variablenomi.setcodigo(this.jInternalFrameDetalleFormVariableNomi.jTextFieldcodigoVariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VariableNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelcodigoVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			variablenomi.setnombre(this.jInternalFrameDetalleFormVariableNomi.jTextAreanombreVariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VariableNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelnombreVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			variablenomi.setsql1(this.jInternalFrameDetalleFormVariableNomi.jTextAreasql1VariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VariableNomiConstantesFunciones.LABEL_SQL1+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelsql1VariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			variablenomi.setsql2(this.jInternalFrameDetalleFormVariableNomi.jTextAreasql2VariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VariableNomiConstantesFunciones.LABEL_SQL2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelsql2VariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			variablenomi.setsql3(this.jInternalFrameDetalleFormVariableNomi.jTextAreasql3VariableNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VariableNomiConstantesFunciones.LABEL_SQL3+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelsql3VariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			variablenomi.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormVariableNomi.jTextFieldvalorVariableNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VariableNomiConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVariableNomi.jLabelvalorVariableNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVariableNomi(VariableNomi variablenomiBean,VariableNomi variablenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && variablenomiBean.getid_tipo_variable_nomi()!=null && !variablenomiBean.getid_tipo_variable_nomi().equals(-1L))) {variablenomi.setid_tipo_variable_nomi(variablenomiBean.getid_tipo_variable_nomi());}
			if(conDefault || (!conDefault && variablenomiBean.getid_tipo_valor_variable_nomi()!=null && !variablenomiBean.getid_tipo_valor_variable_nomi().equals(-1L))) {variablenomi.setid_tipo_valor_variable_nomi(variablenomiBean.getid_tipo_valor_variable_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVariableNomi(VariableNomi variablenomiOrigen,VariableNomi variablenomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && variablenomiOrigen.getId()!=null && !variablenomiOrigen.getId().equals(0L))) {variablenomi.setId(variablenomiOrigen.getId());}}
			if(conDefault || (!conDefault && variablenomiOrigen.getid_tipo_variable_nomi()!=null && !variablenomiOrigen.getid_tipo_variable_nomi().equals(-1L))) {variablenomi.setid_tipo_variable_nomi(variablenomiOrigen.getid_tipo_variable_nomi());}
			if(conDefault || (!conDefault && variablenomiOrigen.getid_tipo_valor_variable_nomi()!=null && !variablenomiOrigen.getid_tipo_valor_variable_nomi().equals(-1L))) {variablenomi.setid_tipo_valor_variable_nomi(variablenomiOrigen.getid_tipo_valor_variable_nomi());}
			if(conDefault || (!conDefault && variablenomiOrigen.getcodigo()!=null && !variablenomiOrigen.getcodigo().equals(""))) {variablenomi.setcodigo(variablenomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && variablenomiOrigen.getnombre()!=null && !variablenomiOrigen.getnombre().equals(""))) {variablenomi.setnombre(variablenomiOrigen.getnombre());}
			if(conDefault || (!conDefault && variablenomiOrigen.getsql1()!=null && !variablenomiOrigen.getsql1().equals(""))) {variablenomi.setsql1(variablenomiOrigen.getsql1());}
			if(conDefault || (!conDefault && variablenomiOrigen.getsql2()!=null && !variablenomiOrigen.getsql2().equals(""))) {variablenomi.setsql2(variablenomiOrigen.getsql2());}
			if(conDefault || (!conDefault && variablenomiOrigen.getsql3()!=null && !variablenomiOrigen.getsql3().equals(""))) {variablenomi.setsql3(variablenomiOrigen.getsql3());}
			if(conDefault || (!conDefault && variablenomiOrigen.getvalor()!=null && !variablenomiOrigen.getvalor().equals(0.0))) {variablenomi.setvalor(variablenomiOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVariableNomi(VariableNomi variablenomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.setText(variablenomi.getId().toString());
			this.jInternalFrameDetalleFormVariableNomi.jTextFieldcodigoVariableNomi.setText(variablenomi.getcodigo());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreanombreVariableNomi.setText(variablenomi.getnombre());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql1VariableNomi.setText(variablenomi.getsql1());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql2VariableNomi.setText(variablenomi.getsql2());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql3VariableNomi.setText(variablenomi.getsql3());
			this.jInternalFrameDetalleFormVariableNomi.jTextFieldvalorVariableNomi.setText(variablenomi.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVariableNomi(VariableNomiBean variablenomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.setText(variablenomiBean.getId().toString());
			this.jInternalFrameDetalleFormVariableNomi.jTextFieldcodigoVariableNomi.setText(variablenomiBean.getcodigo());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreanombreVariableNomi.setText(variablenomiBean.getnombre());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql1VariableNomi.setText(variablenomiBean.getsql1());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql2VariableNomi.setText(variablenomiBean.getsql2());
			this.jInternalFrameDetalleFormVariableNomi.jTextAreasql3VariableNomi.setText(variablenomiBean.getsql3());
			this.jInternalFrameDetalleFormVariableNomi.jTextFieldvalorVariableNomi.setText(variablenomiBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVariableNomi(VariableNomiParameterReturnGeneral variablenomiReturnGeneral,VariableNomiBean variablenomiBean,Boolean conDefault) throws Exception { 
		try {
			VariableNomi variablenomiLocal=new VariableNomi();
			
			variablenomiLocal=variablenomiReturnGeneral.getVariableNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && variablenomiLocal.getId()!=null && !variablenomiLocal.getId().equals(0L))) {variablenomiBean.setId(variablenomiLocal.getId());}}
			if(conDefault || (!conDefault && variablenomiLocal.getid_tipo_variable_nomi()!=null && !variablenomiLocal.getid_tipo_variable_nomi().equals(-1L))) {variablenomiBean.setid_tipo_variable_nomi(variablenomiLocal.getid_tipo_variable_nomi());}
			if(conDefault || (!conDefault && variablenomiLocal.getid_tipo_valor_variable_nomi()!=null && !variablenomiLocal.getid_tipo_valor_variable_nomi().equals(-1L))) {variablenomiBean.setid_tipo_valor_variable_nomi(variablenomiLocal.getid_tipo_valor_variable_nomi());}
			if(conDefault || (!conDefault && variablenomiLocal.getcodigo()!=null && !variablenomiLocal.getcodigo().equals(""))) {variablenomiBean.setcodigo(variablenomiLocal.getcodigo());}
			if(conDefault || (!conDefault && variablenomiLocal.getnombre()!=null && !variablenomiLocal.getnombre().equals(""))) {variablenomiBean.setnombre(variablenomiLocal.getnombre());}
			if(conDefault || (!conDefault && variablenomiLocal.getsql1()!=null && !variablenomiLocal.getsql1().equals(""))) {variablenomiBean.setsql1(variablenomiLocal.getsql1());}
			if(conDefault || (!conDefault && variablenomiLocal.getsql2()!=null && !variablenomiLocal.getsql2().equals(""))) {variablenomiBean.setsql2(variablenomiLocal.getsql2());}
			if(conDefault || (!conDefault && variablenomiLocal.getsql3()!=null && !variablenomiLocal.getsql3().equals(""))) {variablenomiBean.setsql3(variablenomiLocal.getsql3());}
			if(conDefault || (!conDefault && variablenomiLocal.getvalor()!=null && !variablenomiLocal.getvalor().equals(0.0))) {variablenomiBean.setvalor(variablenomiLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVariableNomiGenerico(Long idVariableNomiSeleccionado,JComboBox jComboBoxVariableNomi,List<VariableNomi> variablenomisLocal)throws Exception {
		try {
			VariableNomi  variablenomiTemp=null;

			for(VariableNomi variablenomiAux:variablenomisLocal) {
				if(variablenomiAux.getId()!=null && variablenomiAux.getId().equals(idVariableNomiSeleccionado)) {
					variablenomiTemp=variablenomiAux;
					break;
				}
			}

			jComboBoxVariableNomi.setSelectedItem(variablenomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVariableNomiGenerico(JComboBox jComboBoxVariableNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVariableNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVariableNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVariableNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVariableNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVariableNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVariableNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			variablenomi=(VariableNomi) variablenomiLogic.getVariableNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			variablenomi =(VariableNomi) variablenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!variablenomi.getIsNew() && !variablenomi.getIsChanged() && !variablenomi.getIsDeleted()) {
				sDescripcion=variablenomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=variablenomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!variablenomi.getIsNew() && !variablenomi.getIsChanged() && !variablenomi.getIsDeleted()) {
				sDescripcion=variablenomi.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=variablenomi.getmodulo_descripcion();
			}
		}

		if(sTipo.equals("TipoVariableNomi")) {
			//sDescripcion=this.getActualTipoVariableNomiForeignKeyDescripcion((Long)value);
			if(!variablenomi.getIsNew() && !variablenomi.getIsChanged() && !variablenomi.getIsDeleted()) {
				sDescripcion=variablenomi.gettipovariablenomi_descripcion();
			} else {
				//sDescripcion=this.getActualTipoVariableNomiForeignKeyDescripcion((Long)value);
				sDescripcion=variablenomi.gettipovariablenomi_descripcion();
			}
		}

		if(sTipo.equals("TipoValorVariableNomi")) {
			//sDescripcion=this.getActualTipoValorVariableNomiForeignKeyDescripcion((Long)value);
			if(!variablenomi.getIsNew() && !variablenomi.getIsChanged() && !variablenomi.getIsDeleted()) {
				sDescripcion=variablenomi.gettipovalorvariablenomi_descripcion();
			} else {
				//sDescripcion=this.getActualTipoValorVariableNomiForeignKeyDescripcion((Long)value);
				sDescripcion=variablenomi.gettipovalorvariablenomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VariableNomi variablenomiRow=new VariableNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			variablenomiRow=(VariableNomi) variablenomiLogic.getVariableNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			variablenomiRow=(VariableNomi) variablenomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVariableNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoVariableNomi && this.isPermisoNuevoVariableNomi));			
			this.jButtonDuplicarVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarVariableNomi && this.isPermisoDuplicarVariableNomi));			
			this.jButtonCopiarVariableNomi.setVisible((this.isVisibilidadCeldaCopiarVariableNomi && this.isPermisoCopiarVariableNomi));
			this.jButtonVerFormVariableNomi.setVisible((this.isVisibilidadCeldaVerFormVariableNomi && this.isPermisoVerFormVariableNomi));
			
			this.jButtonAbrirOrderByVariableNomi.setVisible((this.isVisibilidadCeldaOrdenVariableNomi && this.isPermisoOrdenVariableNomi));			
			
			this.jButtonNuevoRelacionesVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesVariableNomi && this.isPermisoNuevoVariableNomi));			
			this.jButtonNuevoGuardarCambiosVariableNomi.setVisible((this.isVisibilidadCeldaNuevoVariableNomi && this.isPermisoNuevoVariableNomi && this.isPermisoGuardarCambiosVariableNomi));
			
			if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonModificarVariableNomi.setVisible((this.isVisibilidadCeldaModificarVariableNomi && this.isPermisoActualizarVariableNomi));	
			this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarVariableNomi.setVisible((this.isVisibilidadCeldaActualizarVariableNomi && this.isPermisoActualizarVariableNomi));	
			this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarVariableNomi.setVisible((this.isVisibilidadCeldaEliminarVariableNomi && this.isPermisoEliminarVariableNomi));
			this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarVariableNomi.setVisible(this.isVisibilidadCeldaCancelarVariableNomi);							
			this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosVariableNomi.setVisible((this.isVisibilidadCeldaGuardarVariableNomi && this.isPermisoGuardarCambiosVariableNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosVariableNomi && this.isPermisoGuardarCambiosVariableNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVariableNomi.setVisible((this.isVisibilidadCeldaNuevoVariableNomi && this.isPermisoNuevoVariableNomi));						
			this.jButtonDuplicarToolBarVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarVariableNomi && this.isPermisoDuplicarVariableNomi));						
			this.jButtonCopiarToolBarVariableNomi.setVisible((this.isVisibilidadCeldaCopiarVariableNomi && this.isPermisoCopiarVariableNomi));			
			this.jButtonVerFormToolBarVariableNomi.setVisible((this.isVisibilidadCeldaVerFormVariableNomi && this.isPermisoVerFormVariableNomi));			
			this.jButtonAbrirOrderByToolBarVariableNomi.setVisible((this.isVisibilidadCeldaOrdenVariableNomi && this.isPermisoOrdenVariableNomi));
			this.jButtonNuevoRelacionesToolBarVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesVariableNomi && this.isPermisoNuevoVariableNomi));			
			this.jButtonNuevoGuardarCambiosToolBarVariableNomi.setVisible((this.isVisibilidadCeldaNuevoVariableNomi && this.isPermisoNuevoVariableNomi && this.isPermisoGuardarCambiosVariableNomi));			
			
			if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonModificarToolBarVariableNomi.setVisible((this.isVisibilidadCeldaModificarVariableNomi && this.isPermisoActualizarVariableNomi));	
			this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarToolBarVariableNomi.setVisible((this.isVisibilidadCeldaActualizarVariableNomi  && this.isPermisoActualizarVariableNomi));	
			this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarToolBarVariableNomi.setVisible((this.isVisibilidadCeldaEliminarVariableNomi && this.isPermisoEliminarVariableNomi));
			this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarToolBarVariableNomi.setVisible(this.isVisibilidadCeldaCancelarVariableNomi);				
			this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosToolBarVariableNomi.setVisible((this.isVisibilidadCeldaGuardarVariableNomi && this.isPermisoGuardarCambiosVariableNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosVariableNomi && this.isPermisoGuardarCambiosVariableNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVariableNomi.setVisible((this.isVisibilidadCeldaNuevoVariableNomi && this.isPermisoNuevoVariableNomi));			
			this.jMenuItemDuplicarVariableNomi.setVisible((this.isVisibilidadCeldaDuplicarVariableNomi && this.isPermisoDuplicarVariableNomi));			
			this.jMenuItemCopiarVariableNomi.setVisible((this.isVisibilidadCeldaCopiarVariableNomi && this.isPermisoCopiarVariableNomi));			
			this.jMenuItemVerFormVariableNomi.setVisible((this.isVisibilidadCeldaVerFormVariableNomi && this.isPermisoVerFormVariableNomi));			
			this.jMenuItemAbrirOrderByVariableNomi.setVisible((this.isVisibilidadCeldaOrdenVariableNomi && this.isPermisoOrdenVariableNomi));			
			//this.jMenuItemMostrarOcultarVariableNomi.setVisible((this.isVisibilidadCeldaOrdenVariableNomi && this.isPermisoOrdenVariableNomi));
			this.jMenuItemDetalleAbrirOrderByVariableNomi.setVisible((this.isVisibilidadCeldaOrdenVariableNomi && this.isPermisoOrdenVariableNomi));			
			//this.jMenuItemDetalleMostrarOcultarVariableNomi.setVisible((this.isVisibilidadCeldaOrdenVariableNomi && this.isPermisoOrdenVariableNomi));			
			this.jMenuItemNuevoRelacionesVariableNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesVariableNomi && this.isPermisoNuevoVariableNomi));			
			this.jMenuItemNuevoGuardarCambiosVariableNomi.setVisible((this.isVisibilidadCeldaNuevoVariableNomi && this.isPermisoNuevoVariableNomi && this.isPermisoGuardarCambiosVariableNomi));									
			
			if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemModificarVariableNomi.setVisible((this.isVisibilidadCeldaModificarVariableNomi && this.isPermisoActualizarVariableNomi));	
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemActualizarVariableNomi.setVisible((this.isVisibilidadCeldaActualizarVariableNomi && this.isPermisoActualizarVariableNomi));	
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemEliminarVariableNomi.setVisible((this.isVisibilidadCeldaEliminarVariableNomi && this.isPermisoEliminarVariableNomi));
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemCancelarVariableNomi.setVisible(this.isVisibilidadCeldaCancelarVariableNomi);				
			}
			
			this.jMenuItemGuardarCambiosVariableNomi.setVisible((this.isVisibilidadCeldaGuardarVariableNomi && this.isPermisoGuardarCambiosVariableNomi));						
			this.jMenuItemGuardarCambiosTablaVariableNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosVariableNomi && this.isPermisoGuardarCambiosVariableNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVariableNomi=this.jButtonNuevoVariableNomi.isVisible();
			this.isVisibilidadCeldaDuplicarVariableNomi=this.jButtonDuplicarVariableNomi.isVisible();
			this.isVisibilidadCeldaCopiarVariableNomi=this.jButtonCopiarVariableNomi.isVisible();
			this.isVisibilidadCeldaVerFormVariableNomi=this.jButtonVerFormVariableNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenVariableNomi=this.jButtonAbrirOrderByVariableNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=this.jButtonNuevoRelacionesVariableNomi.isVisible();
			this.isVisibilidadCeldaModificarVariableNomi=this.jButtonModificarVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			this.isVisibilidadCeldaActualizarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosVariableNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=this.jButtonGuardarCambiosTablaVariableNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVariableNomi=this.jButtonNuevoToolBarVariableNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=this.jButtonNuevoRelacionesToolBarVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			this.isVisibilidadCeldaModificarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jButtonModificarToolBarVariableNomi.isVisible();
			this.isVisibilidadCeldaActualizarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarToolBarVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarToolBarVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarToolBarVariableNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVariableNomi=this.jButtonGuardarCambiosToolBarVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=this.jButtonGuardarCambiosTablaToolBarVariableNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVariableNomi=this.jMenuItemNuevoVariableNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=this.jMenuItemNuevoRelacionesVariableNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			this.isVisibilidadCeldaModificarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jMenuItemModificarVariableNomi.isVisible();
			this.isVisibilidadCeldaActualizarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jMenuItemActualizarVariableNomi.isVisible();
			this.isVisibilidadCeldaEliminarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jMenuItemEliminarVariableNomi.isVisible();
			this.isVisibilidadCeldaCancelarVariableNomi=this.jInternalFrameDetalleFormVariableNomi.jMenuItemCancelarVariableNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVariableNomi=this.jMenuItemGuardarCambiosVariableNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=this.jMenuItemGuardarCambiosTablaVariableNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVariableNomi(Boolean esInicializar) {
		if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
				//if(this.variablenomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVariableNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualVariableNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVariableNomi() {
		this.jButtonNuevoVariableNomi.setVisible(this.isPermisoNuevoVariableNomi);			
		this.jButtonDuplicarVariableNomi.setVisible(this.isPermisoDuplicarVariableNomi);			
		this.jButtonCopiarVariableNomi.setVisible(this.isPermisoCopiarVariableNomi);			
		this.jButtonVerFormVariableNomi.setVisible(this.isPermisoVerFormVariableNomi);			
		
		this.jButtonAbrirOrderByVariableNomi.setVisible(this.isPermisoOrdenVariableNomi);					
		
		this.jButtonNuevoRelacionesVariableNomi.setVisible(this.isPermisoNuevoVariableNomi);			
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonModificarVariableNomi.setVisible(this.isPermisoActualizarVariableNomi);	
			this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarVariableNomi.setVisible(this.isPermisoActualizarVariableNomi);	
			this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarVariableNomi.setVisible(this.isPermisoEliminarVariableNomi);
			this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarVariableNomi.setVisible(this.isVisibilidadCeldaCancelarVariableNomi);						
			this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosVariableNomi.setVisible(this.isPermisoGuardarCambiosVariableNomi);							
		}
		
		this.jButtonGuardarCambiosTablaVariableNomi.setVisible(this.isPermisoActualizarVariableNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVariableNomi() {
		this.jInternalFrameDetalleFormVariableNomi.jButtonModificarVariableNomi.setVisible(this.isPermisoActualizarVariableNomi);	
		this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarVariableNomi.setVisible(this.isPermisoActualizarVariableNomi);	
		this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarVariableNomi.setVisible(this.isPermisoEliminarVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarVariableNomi.setVisible(this.isVisibilidadCeldaCancelarVariableNomi);							
		this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosVariableNomi.setVisible((this.isVisibilidadCeldaGuardarVariableNomi && this.isPermisoGuardarCambiosVariableNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVariableNomi() {
		if(VariableNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVariableNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVariableNomi() {
	}
	
	public void jTableDatosVariableNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVariableNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.variablenomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVariableNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVariableNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVariableNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVariableNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.variablenomiLogic.getConnexion());

				if(this.variablenomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.variablenomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVariableNomi=(TitledBorder)this.jScrollPanelDatosVariableNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVariableNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.variablenomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloVariableNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebVariableNomi(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVariableNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVariableNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.variablenomiLogic.getConnexion());

				if(this.variablenomi.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.variablenomi.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVariableNomi=(TitledBorder)this.jScrollPanelDatosVariableNomi.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderVariableNomi.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.variablenomi.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_variable_nomiVariableNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovariablenomi=true;

			idTienePermisotipovariablenomi=this.tienePermisosUsuarioEnPaginaWebVariableNomi(TipoVariableNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovariablenomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVariableNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVariableNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);

				this.tipovariablenomiBeanSwingJInternalFrame=new TipoVariableNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipovariablenomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipovariablenomiBeanSwingJInternalFrame.getTipoVariableNomiLogic().setConnexion(this.variablenomiLogic.getConnexion());

				if(this.variablenomi.getid_tipo_variable_nomi()!=null) {
					this.tipovariablenomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipovariablenomiBeanSwingJInternalFrame.setIdActual(this.variablenomi.getid_tipo_variable_nomi());
					this.tipovariablenomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipovariablenomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipovariablenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoVariableNomi();
				}

				JInternalFrameBase jinternalFrame =this.tipovariablenomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVariableNomi=(TitledBorder)this.jScrollPanelDatosVariableNomi.getBorder();
				TitledBorder titledBordertipovariablenomi=(TitledBorder)this.tipovariablenomiBeanSwingJInternalFrame.jScrollPanelDatosTipoVariableNomi.getBorder();

				titledBordertipovariablenomi.setTitle(titledBorderVariableNomi.getTitle() + " -> Tipo Variable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_variable_nomiVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getid_tipo_variable_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_variable_nomi = "+this.variablenomi.getid_tipo_variable_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_valor_variable_nomiVariableNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipovalorvariablenomi=true;

			idTienePermisotipovalorvariablenomi=this.tienePermisosUsuarioEnPaginaWebVariableNomi(TipoValorVariableNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisotipovalorvariablenomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVariableNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVariableNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);

				this.tipovalorvariablenomiBeanSwingJInternalFrame=new TipoValorVariableNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipovalorvariablenomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipovalorvariablenomiBeanSwingJInternalFrame.getTipoValorVariableNomiLogic().setConnexion(this.variablenomiLogic.getConnexion());

				if(this.variablenomi.getid_tipo_valor_variable_nomi()!=null) {
					this.tipovalorvariablenomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipovalorvariablenomiBeanSwingJInternalFrame.setIdActual(this.variablenomi.getid_tipo_valor_variable_nomi());
					this.tipovalorvariablenomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipovalorvariablenomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipovalorvariablenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoValorVariableNomi();
				}

				JInternalFrameBase jinternalFrame =this.tipovalorvariablenomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVariableNomi=(TitledBorder)this.jScrollPanelDatosVariableNomi.getBorder();
				TitledBorder titledBordertipovalorvariablenomi=(TitledBorder)this.tipovalorvariablenomiBeanSwingJInternalFrame.jScrollPanelDatosTipoValorVariableNomi.getBorder();

				titledBordertipovalorvariablenomi.setTitle(titledBorderVariableNomi.getTitle() + " -> Tipo Valor Variable");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_valor_variable_nomiVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getid_tipo_valor_variable_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_valor_variable_nomi = "+this.variablenomi.getid_tipo_valor_variable_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.variablenomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.variablenomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsql1VariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getsql1()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sql1 like '%"+this.variablenomi.getsql1()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsql2VariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getsql2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sql2 like '%"+this.variablenomi.getsql2()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsql3VariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getsql3()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where sql3 like '%"+this.variablenomi.getsql3()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorVariableNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.getvariablenomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.variablenomi==null) {
						this.variablenomi = new VariableNomi();
					}

					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);
				}

				if(this.variablenomi.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.variablenomi.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVariableNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaVariableNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVariableNomi(false,false);

			this.getVariableNomisFK_IdEmpresa();

			this.inicializarActualizarBindingVariableNomi(false);

			//if(VariableNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVariableNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloVariableNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVariableNomi(false,false);

			this.getVariableNomisFK_IdModulo();

			this.inicializarActualizarBindingVariableNomi(false);

			//if(VariableNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVariableNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoValorVariableNomiVariableNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVariableNomi(false,false);

			this.getVariableNomisFK_IdTipoValorVariableNomi();

			this.inicializarActualizarBindingVariableNomi(false);

			//if(VariableNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVariableNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoVariableNomiVariableNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVariableNomi(false,false);

			this.getVariableNomisFK_IdTipoVariableNomi();

			this.inicializarActualizarBindingVariableNomi(false);

			//if(VariableNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVariableNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.variablenomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVariableNomi() {
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
			this.jInternalFrameDetalleFormVariableNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormVariableNomi.dispose();
			this.jInternalFrameDetalleFormVariableNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
			this.jInternalFrameReporteDinamicoVariableNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVariableNomi.dispose();
			this.jInternalFrameReporteDinamicoVariableNomi=null;
		}
		
		if(this.jInternalFrameImportacionVariableNomi!=null) {
			this.jInternalFrameImportacionVariableNomi.setVisible(false);	    			
			this.jInternalFrameImportacionVariableNomi.dispose();
			this.jInternalFrameImportacionVariableNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVariableNomi();
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoVariableNomi")) {
				jButtonNuevoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVariableNomi")) {
				jButtonDuplicarVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVariableNomi")) {
				jButtonCopiarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormVariableNomi")) {
				jButtonVerFormVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVariableNomi")) {
				jButtonNuevoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVariableNomi")) {
				jButtonDuplicarVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVariableNomi")) {
				jButtonNuevoVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVariableNomi")) {
				jButtonDuplicarVariableNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVariableNomi")) {
				jButtonNuevoVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVariableNomi")) {
				jButtonNuevoVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVariableNomi")) {
				jButtonNuevoVariableNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVariableNomi")) {
				jButtonModificarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVariableNomi")) {
				jButtonModificarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVariableNomi")) {
				jButtonModificarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVariableNomi")) {
				jButtonActualizarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVariableNomi")) {
				jButtonActualizarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVariableNomi")) {
				jButtonActualizarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarVariableNomi")) {
				jButtonEliminarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVariableNomi")) {
				jButtonEliminarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVariableNomi")) {
				jButtonEliminarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarVariableNomi")) {
				jButtonCancelarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVariableNomi")) {
				jButtonCancelarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVariableNomi")) {
				jButtonCancelarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarVariableNomi")) {
				jButtonCerrarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVariableNomi")) {
				jButtonCerrarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVariableNomi")) {
				jButtonCerrarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVariableNomi")) {
				jButtonMostrarOcultarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVariableNomi")) {
				jButtonCancelarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVariableNomi")) {
				jButtonGuardarCambiosVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVariableNomi")) {
				jButtonGuardarCambiosVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVariableNomi")) {
				jButtonCopiarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVariableNomi")) {
				jButtonVerFormVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVariableNomi")) {
				jButtonGuardarCambiosVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVariableNomi")) {
				jButtonCopiarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVariableNomi")) {
				jButtonVerFormVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVariableNomi")) {
				jButtonGuardarCambiosVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVariableNomi")) {
				jButtonGuardarCambiosVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVariableNomi")) {
				jButtonGuardarCambiosVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVariableNomi")) {
				jButtonRecargarInformacionVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVariableNomi")) {
				jButtonRecargarInformacionVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVariableNomi")) {
				jButtonRecargarInformacionVariableNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVariableNomi")) {
				jButtonAnterioresVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVariableNomi")) {
				jButtonAnterioresVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVariableNomi")) {
				jButtonAnterioresVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVariableNomi")) {
				jButtonSiguientesVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVariableNomi")) {
				jButtonSiguientesVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVariableNomi")) {
				jButtonSiguientesVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVariableNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByVariableNomi")) {
				jButtonAbrirOrderByVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVariableNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarVariableNomi")) {
				jButtonMostrarOcultarVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVariableNomi")) {
				jButtonNuevoGuardarCambiosVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVariableNomi")) {
				jButtonNuevoGuardarCambiosVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVariableNomi")) {
				jButtonNuevoGuardarCambiosVariableNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVariableNomi")) {
				jButtonCerrarReporteDinamicoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVariableNomi")) {
				jButtonGenerarReporteDinamicoVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVariableNomi")) {
				
				jButtonGenerarExcelReporteDinamicoVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVariableNomi")) {
				jButtonCerrarImportacionVariableNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVariableNomi")) {
				
				jButtonGenerarImportacionVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVariableNomi")) {
				
				jButtonAbrirImportacionVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVariableNomi")) {
				jComboBoxTiposAccionesVariableNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVariableNomi")) {
				jComboBoxTiposRelacionesVariableNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVariableNomi")) {
				jComboBoxTiposAccionesVariableNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVariableNomi")) {
				
				jComboBoxTiposSeleccionarVariableNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVariableNomi")) {
				jTextFieldValorCampoGeneralVariableNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVariableNomi")) {
				jButtonAbrirOrderByVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVariableNomi")) {
				jButtonAbrirOrderByVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVariableNomi")) {
				jButtonCerrarOrderByVariableNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVariableNomiBusqueda")) {
				this.jButtonidVariableNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVariableNomiUpdate")) {
				this.jButtonid_empresaVariableNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVariableNomiBusqueda")) {
				this.jButtonid_empresaVariableNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloVariableNomiUpdate")) {
				this.jButtonid_moduloVariableNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloVariableNomiBusqueda")) {
				this.jButtonid_moduloVariableNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_variable_nomiVariableNomiUpdate")) {
				this.jButtonid_tipo_variable_nomiVariableNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_variable_nomiVariableNomiBusqueda")) {
				this.jButtonid_tipo_variable_nomiVariableNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valor_variable_nomiVariableNomiUpdate")) {
				this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valor_variable_nomiVariableNomiBusqueda")) {
				this.jButtonid_tipo_valor_variable_nomiVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoVariableNomiBusqueda")) {
				this.jButtoncodigoVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreVariableNomiBusqueda")) {
				this.jButtonnombreVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sql1VariableNomiBusqueda")) {
				this.jButtonsql1VariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sql2VariableNomiBusqueda")) {
				this.jButtonsql2VariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sql3VariableNomiBusqueda")) {
				this.jButtonsql3VariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorVariableNomiBusqueda")) {
				this.jButtonvalorVariableNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTipoValorVariableNomiVariableNomi")) {
				this.jButtonFK_IdTipoValorVariableNomiVariableNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoVariableNomiVariableNomi")) {
				this.jButtonFK_IdTipoVariableNomiVariableNomiActionPerformed(evt);
			}
			
			;
			
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVariableNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVariableNomiActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				


				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VariableNomi variablenomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				variablenomiLocal=this.variablenomi;
			} else {
				variablenomiLocal=this.variablenomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
							
				
				


				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVariableNomiActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
								
						
				


				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
								
				
				


				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVariableNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
							
				
				


				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVariableNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomiAnterior =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.variablenomiAnterior =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVariableNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
								
				
				


				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVariableNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVariableNomiActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVariableNomi")) {
					jCheckBoxSeleccionarTodosVariableNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVariableNomi")) {
					jCheckBoxSeleccionadosVariableNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVariableNomi")) {
					
				}
				
				


				
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
												
				
				


				
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVariableNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.variablenomiAnterior =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.variablenomiAnterior =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVariableNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVariableNomiActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.variablenomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.variablenomi);
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VariableNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VariableNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVariableNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.variablenomiAnterior =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVariableNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVariableNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVariableNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.variablenomi =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.variablenomi =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.variablenomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVariableNomi")) {
				
				}
				
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVariableNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVariableNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVariableNomi")) {
			
			}
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVariableNomi();
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			if(sTipo.equals("NuevoVariableNomi")) {
				jButtonNuevoVariableNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVariableNomi")) {
				jButtonDuplicarVariableNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVariableNomi")) {
				jButtonCopiarVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVariableNomi")) {
				jButtonVerFormVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVariableNomi")) {
				jButtonNuevoVariableNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVariableNomi")) {
				jButtonModificarVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVariableNomi")) {
				jButtonActualizarVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVariableNomi")) {
				jButtonEliminarVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVariableNomi")) {
				jButtonGuardarCambiosVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVariableNomi")) {
				jButtonCancelarVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVariableNomi")) {
				jButtonCerrarVariableNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVariableNomi")) {
				jButtonGuardarCambiosVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVariableNomi")) {
				jButtonNuevoGuardarCambiosVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVariableNomi")) {
				jButtonAbrirOrderByVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVariableNomi")) {
				jButtonRecargarInformacionVariableNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVariableNomi")) {
				jButtonAnterioresVariableNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVariableNomi")) {
				jButtonSiguientesVariableNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVariableNomiBusqueda")) {
				this.jButtonidVariableNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVariableNomiUpdate")) {
				this.jButtonid_empresaVariableNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVariableNomiBusqueda")) {
				this.jButtonid_empresaVariableNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloVariableNomiUpdate")) {
				this.jButtonid_moduloVariableNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloVariableNomiBusqueda")) {
				this.jButtonid_moduloVariableNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_variable_nomiVariableNomiUpdate")) {
				this.jButtonid_tipo_variable_nomiVariableNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_variable_nomiVariableNomiBusqueda")) {
				this.jButtonid_tipo_variable_nomiVariableNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_valor_variable_nomiVariableNomiUpdate")) {
				this.jButtonid_tipo_valor_variable_nomiVariableNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_valor_variable_nomiVariableNomiBusqueda")) {
				this.jButtonid_tipo_valor_variable_nomiVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoVariableNomiBusqueda")) {
				this.jButtoncodigoVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreVariableNomiBusqueda")) {
				this.jButtonnombreVariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sql1VariableNomiBusqueda")) {
				this.jButtonsql1VariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sql2VariableNomiBusqueda")) {
				this.jButtonsql2VariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("sql3VariableNomiBusqueda")) {
				this.jButtonsql3VariableNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorVariableNomiBusqueda")) {
				this.jButtonvalorVariableNomiBusquedaActionPerformed(evt);
			}
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVariableNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVariableNomi")) {
				closingInternalFrameVariableNomi();
				
			} else if(sTipo.equals("jButtonCancelarVariableNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormVariableNomi = (JInternalFrameBase)evt.getSource();
	            	
	            VariableNomiBeanSwingJInternalFrame jInternalFrameParent=(VariableNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormVariableNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVariableNomiActionPerformed(null);
			}
			
			VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.variablenomi,new Object(),this.variablenomiParameterGeneral,this.variablenomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVariableNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVariableNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVariableNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.variablenomi)) {
			if(!esControlTabla) {
				if(VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);			
				}
				
				if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVariableNomi(this.variablenomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.variablenomiReturnGeneral=variablenomiLogic.procesarEventosVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.variablenomiLogic.getVariableNomis(),this.variablenomi,this.variablenomiParameterGeneral,this.isEsNuevoVariableNomi,classes);//this.variablenomiLogic.getVariableNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVariableNomi(this.variablenomiReturnGeneral,this.variablenomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVariableNomi(classes,this.variablenomiReturnGeneral,this.variablenomiBean,false);
					}
						
					if(this.variablenomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVariableNomi(this.variablenomiReturnGeneral.getVariableNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVariableNomi(this.variablenomiReturnGeneral.getVariableNomi());	
					}
						
					if(this.variablenomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVariableNomi(this.variablenomiReturnGeneral.getVariableNomi(),classes);//this.variablenomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVariableNomi(this.variablenomi,classes);//this.variablenomiBean);									
				}
			
				if(VariableNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVariableNomi(this.variablenomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVariableNomi(this.variablenomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.variablenomiAnterior!=null) {
						this.variablenomi=this.variablenomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.variablenomiReturnGeneral=variablenomiLogic.procesarEventosVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.variablenomiLogic.getVariableNomis(),this.variablenomi,this.variablenomiParameterGeneral,this.isEsNuevoVariableNomi,classes);//this.variablenomiLogic.getVariableNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.variablenomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.variablenomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.variablenomiReturnGeneral.getVariableNomi(),variablenomiLogic.getVariableNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.variablenomiReturnGeneral.getVariableNomi(),this.variablenomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVariableNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosVariableNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVariableNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosVariableNomi() throws Exception {
		
		VariableNomiModel variablenomiModel=(VariableNomiModel)this.jTableDatosVariableNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			variablenomiModel.variablenomis=this.variablenomiLogic.getVariableNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			variablenomiModel.variablenomis=this.variablenomis;
		}
		
		
		((VariableNomiModel) this.jTableDatosVariableNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVariableNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvariablenomiAnterior(),this.variablenomiLogic.getVariableNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvariablenomiAnterior(),this.variablenomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVariableNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVariableNomi(VariableNomi variablenomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.variablenomi,new Object(),generalEntityParameterGeneral,this.variablenomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.variablenomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VariableNomiConstantesFunciones.getClassesRelationshipsOfVariableNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VariableNomiConstantesFunciones.getClassesRelationshipsFromStringsOfVariableNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVariableNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VariableNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.variablenomi,new Object(),generalEntityParameterGeneral,this.variablenomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVariableNomi(VariableNomiBean variablenomiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVariableNomi(ArrayList<Classe> classes,VariableNomiReturnGeneral variablenomiReturnGeneral,VariableNomiBean variablenomiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVariableNomi(VariableNomi variablenomi,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.variablenomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVariableNomi = new VariableNomiDetalleFormJInternalFrame(jDesktopPane,this.variablenomiSessionBean.getConGuardarRelaciones(),this.variablenomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.setVisible(false);
		this.jInternalFrameDetalleFormVariableNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormVariableNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVariableNomi.variablenomiLogic=this.variablenomiLogic;
		
		this.cargarCombosFrameForeignKeyVariableNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVariableNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVariableNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVariableNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVariableNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVariableNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVariableNomi"));
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonModificarVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarVariableNomi"));

		
		this.jInternalFrameDetalleFormVariableNomi.jButtonModificarToolBarVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarVariableNomi"));
					
		this.jInternalFrameDetalleFormVariableNomi.jMenuItemModificarVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarVariableNomi.addActionListener (new ButtonActionListener(this,"ActualizarVariableNomi"));
		
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarToolBarVariableNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVariableNomi"));
						
		this.jInternalFrameDetalleFormVariableNomi.jMenuItemActualizarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarVariableNomi"));
		
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarVariableNomi"));
								
		this.jInternalFrameDetalleFormVariableNomi.jMenuItemEliminarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarVariableNomi"));
		
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarVariableNomi"));
					
		this.jInternalFrameDetalleFormVariableNomi.jMenuItemCancelarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVariableNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVariableNomi.jMenuItemDetalleCerrarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVariableNomi"));		
		
		
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVariableNomi"));
		
		
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVariableNomi"));
		
		
		
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVariableNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonidVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_empresaVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_empresaVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_moduloVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_moduloVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_moduloVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_variable_nomiVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_variable_nomiVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_variable_nomiVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_variable_nomiVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valor_variable_nomiVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valor_variable_nomiVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtoncodigoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonnombreVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql1VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql1VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql2VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql2VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql3VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql3VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonvalorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorVariableNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVariableNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVariableNomi"));
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVariableNomi"));
		}
		
		this.jTableDatosVariableNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVariableNomi"));
		
		this.jTableDatosVariableNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVariableNomi"));
		
		this.jButtonNuevoVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoVariableNomi"));
		
		this.jButtonDuplicarVariableNomi.addActionListener(new ButtonActionListener(this,"DuplicarVariableNomi"));
		
		this.jButtonCopiarVariableNomi.addActionListener(new ButtonActionListener(this,"CopiarVariableNomi"));
		
		this.jButtonVerFormVariableNomi.addActionListener(new ButtonActionListener(this,"VerFormVariableNomi"));
		
		
		this.jButtonNuevoToolBarVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarVariableNomi"));
			
		this.jButtonDuplicarToolBarVariableNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVariableNomi"));
			
		this.jMenuItemNuevoVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVariableNomi"));
			
		this.jMenuItemDuplicarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVariableNomi"));		
		
		
		this.jButtonNuevoRelacionesVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVariableNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarVariableNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVariableNomi"));
			
		this.jMenuItemNuevoRelacionesVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVariableNomi"));		
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonModificarVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonModificarToolBarVariableNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarVariableNomi"));
			
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemModificarVariableNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarVariableNomi.addActionListener (new ButtonActionListener(this,"ActualizarVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonActualizarToolBarVariableNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVariableNomi"));
				
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemActualizarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonEliminarToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarVariableNomi"));
						
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemEliminarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonCancelarToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarVariableNomi"));
			
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemCancelarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVariableNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVariableNomi"));		
		
		
		this.jButtonCerrarVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarVariableNomi"));
		
		
		this.jButtonCerrarToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarVariableNomi"));
			
		this.jMenuItemCerrarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVariableNomi"));
			
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jMenuItemDetalleCerrarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVariableNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosVariableNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVariableNomi"));
		}
		
		this.jButtonCopiarToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarVariableNomi"));
			
		this.jButtonVerFormToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarVariableNomi"));
		
		this.jMenuItemGuardarCambiosVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVariableNomi"));
			
		this.jMenuItemCopiarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVariableNomi"));		
		
		this.jMenuItemVerFormVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVariableNomi"));		
		
		
		this.jButtonGuardarCambiosTablaVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVariableNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVariableNomi"));
			
		this.jMenuItemGuardarCambiosTablaVariableNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVariableNomi"));		
		
		
		
		this.jButtonRecargarInformacionVariableNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionVariableNomi"));
					
		this.jButtonRecargarInformacionToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVariableNomi"));
		
		this.jMenuItemRecargarInformacionVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVariableNomi"));		
		
		
		
		this.jButtonAnterioresVariableNomi.addActionListener (new ButtonActionListener(this,"AnterioresVariableNomi"));
		
		
		this.jButtonAnterioresToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVariableNomi"));
		
		this.jMenuItemAnterioresVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVariableNomi"));		
		
		
		this.jButtonSiguientesVariableNomi.addActionListener (new ButtonActionListener(this,"SiguientesVariableNomi"));
		
		
		this.jButtonSiguientesToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVariableNomi"));
			
		this.jMenuItemSiguientesVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVariableNomi"));
			
		this.jMenuItemAbrirOrderByVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVariableNomi"));
			
		this.jMenuItemMostrarOcultarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVariableNomi"));
			
		this.jMenuItemDetalleAbrirOrderByVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVariableNomi"));
			
		this.jMenuItemDetalleMostarOcultarVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVariableNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVariableNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVariableNomi"));
			
		this.jMenuItemNuevoGuardarCambiosVariableNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVariableNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVariableNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVariableNomi"));

		this.jCheckBoxSeleccionadosVariableNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVariableNomi"));
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVariableNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesVariableNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesVariableNomi"));
			
		this.jComboBoxTiposAccionesVariableNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesVariableNomi"));
					
		this.jComboBoxTiposSeleccionarVariableNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVariableNomi"));
			
		this.jTextFieldValorCampoGeneralVariableNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVariableNomi"));		
		
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonidVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_empresaVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_empresaVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_moduloVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_moduloVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_moduloVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_variable_nomiVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_variable_nomiVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_variable_nomiVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_variable_nomiVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valor_variable_nomiVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valor_variable_nomiVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtoncodigoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonnombreVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql1VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql1VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql2VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql2VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql3VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql3VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonvalorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorVariableNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTipoValorVariableNomiVariableNomi.addActionListener(new ButtonActionListener(this,"FK_IdTipoValorVariableNomiVariableNomi"));

			this.jButtonFK_IdTipoVariableNomiVariableNomi.addActionListener(new ButtonActionListener(this,"FK_IdTipoVariableNomiVariableNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVariableNomi!=null) {
				this.jInternalFrameReporteDinamicoVariableNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVariableNomi"));
				this.jInternalFrameReporteDinamicoVariableNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVariableNomi"));
				this.jInternalFrameReporteDinamicoVariableNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVariableNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoVariableNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVariableNomi"));				
			//this.jButtonGenerarReporteDinamicoVariableNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVariableNomi"));
			//this.jButtonGenerarExcelReporteDinamicoVariableNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVariableNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVariableNomi!=null) {
				this.jInternalFrameImportacionVariableNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVariableNomi"));
				this.jInternalFrameImportacionVariableNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVariableNomi"));
				this.jInternalFrameImportacionVariableNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVariableNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVariableNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByVariableNomi"));
			
			this.jButtonAbrirOrderByToolBarVariableNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVariableNomi"));			
			
			if(this.jInternalFrameOrderByVariableNomi!=null) {
				this.jInternalFrameOrderByVariableNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVariableNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVariableNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVariableNomi.jTabbedPaneRelacionesVariableNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVariableNomi"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameVariableNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVariableNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVariableNomi = (JInternalFrameBase)event.getSource();
	            	
	            VariableNomiBeanSwingJInternalFrame jInternalFrameParent=(VariableNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormVariableNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVariableNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVariableNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVariableNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVariableNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVariableNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVariableNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVariableNomi";
		inputMap = this.jButtonNuevoVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVariableNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVariableNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVariableNomi";
		inputMap = this.jButtonNuevoRelacionesVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVariableNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVariableNomi";
		inputMap = this.jButtonModificarVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVariableNomi";
		inputMap = this.jButtonActualizarVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVariableNomi";
		inputMap = this.jButtonEliminarVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVariableNomi";
		inputMap = this.jButtonCancelarVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVariableNomi";
		inputMap = this.jButtonCerrarVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVariableNomi";
		inputMap = this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosVariableNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVariableNomi.jButtonGuardarCambiosVariableNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVariableNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVariableNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVariableNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVariableNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVariableNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonidVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"idVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_empresaVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_empresaVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_moduloVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_moduloVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_moduloVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_variable_nomiVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_variable_nomiVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_variable_nomiVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_variable_nomiVariableNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_valor_variable_nomiVariableNomiUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_valor_variable_nomiVariableNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonid_tipo_valor_variable_nomiVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_valor_variable_nomiVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtoncodigoVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonnombreVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreVariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql1VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql1VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql2VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql2VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonsql3VariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"sql3VariableNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVariableNomi.jButtonvalorVariableNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorVariableNomiBusqueda"));
		
		
		this.jButtonFK_IdTipoValorVariableNomiVariableNomi.addActionListener(new ButtonActionListener(this,"FK_IdTipoValorVariableNomiVariableNomi"));

		this.jButtonFK_IdTipoVariableNomiVariableNomi.addActionListener(new ButtonActionListener(this,"FK_IdTipoVariableNomiVariableNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVariableNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVariableNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVariableNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVariableNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVariableNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
					variablenomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VariableNomi variablenomiAux:variablenomis) {
					variablenomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVariableNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVariableNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
						variablenomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VariableNomi variablenomiAux:variablenomis) {
						variablenomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VariableNomi variablenomiAux:variablenomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVariableNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVariableNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVariableNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVariableNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVariableNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVariableNomi.getSelectedRows();
			
			VariableNomi variablenomiLocal=new VariableNomi();
			
			//this.seleccionarTodosVariableNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					variablenomiLocal =(VariableNomi) this.variablenomiLogic.getVariableNomis().toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					variablenomiLocal =(VariableNomi) this.variablenomis.toArray()[this.jTableDatosVariableNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				variablenomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
						variablenomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VariableNomi variablenomiAux:variablenomis) {
						variablenomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVariableNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVariableNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVariableNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVariableNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVariableNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVariableNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVariableNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVariableNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVariableNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VariableNomi variablenomiAux:this.variablenomiLogic.getVariableNomis()) {
				
						if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							variablenomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							variablenomiAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL1)) {
							existe=true;
							variablenomiAux.setsql1(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL2)) {
							existe=true;
							variablenomiAux.setsql2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL3)) {
							existe=true;
							variablenomiAux.setsql3(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							variablenomiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VariableNomi variablenomiAux:variablenomis) {
					
						if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							variablenomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							variablenomiAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL1)) {
							existe=true;
							variablenomiAux.setsql1(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL2)) {
							existe=true;
							variablenomiAux.setsql2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL3)) {
							existe=true;
							variablenomiAux.setsql3(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							variablenomiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVariableNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVariableNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVariableNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVariableNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVariableNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVariableNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessVariableNomi(conSplash);
				
					this.generarReporteVariableNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVariableNomisSeleccionados();
				//this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVariableNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVariableNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVariableNomi();
				
				this.exportarVariableNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVariableNomis();
				//this.importarVariableNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVariableNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVariableNomisSeleccionados();
				//this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Variable Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVariableNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVariableNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVariableNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(VariableNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVariableNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVariableNomi(conSplash);
					
						//this.actualizarParametrosGeneralVariableNomi();
						
						this.generarReporteProcesoAccionVariableNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VariableNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Variable NominaS SELECCIONADOS?", "MANTENIMIENTO DE Variable Nomina", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVariableNomi();
				
						this.actualizarParametrosGeneralVariableNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.variablenomiReturnGeneral=variablenomiLogic.procesarAccionVariableNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.variablenomiLogic.getVariableNomis(),this.variablenomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVariableNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVariableNomi();
					
					VariableNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVariableNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVariableNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVariableNomi.jComboBoxTiposAccionesFormularioVariableNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVariableNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVariableNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVariableNomi();
			
			if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		
			VariableNomi variablenomi=new VariableNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVariableNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVariableNomi.getSelectedItem();
			
			
			
			
			variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(variablenomisSeleccionados.size()==1) {
				for(VariableNomi variablenomiAux:variablenomisSeleccionados) {
					variablenomi=variablenomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVariableNomi();
			
      		//this.finishProcessVariableNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVariableNomiReturnGeneral() throws Exception {
		if(this.variablenomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.variablenomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.variablenomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.variablenomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.variablenomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.variablenomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVariableNomi(false);
		}
		
		if(this.variablenomiReturnGeneral.getConRetornoLista() || this.variablenomiReturnGeneral.getConRetornoObjeto()) {
			if(this.variablenomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.variablenomiLogic.setVariableNomis(this.variablenomiReturnGeneral.getVariableNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.variablenomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.variablenomiLogic.setVariableNomi(this.variablenomiReturnGeneral.getVariableNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVariableNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralVariableNomi() throws Exception {
		
		
	}
	
	public ArrayList<VariableNomi> getVariableNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVariableNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VariableNomi variablenomiAux:variablenomiLogic.getVariableNomis()) {
					if(variablenomiAux.getIsSelected()) {
						variablenomisSeleccionados.add(variablenomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VariableNomi variablenomiAux:this.variablenomis) {
					if(variablenomiAux.getIsSelected()) {
						variablenomisSeleccionados.add(variablenomiAux);				
					}
				}
			}
			
			if(variablenomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						variablenomisSeleccionados.addAll(this.variablenomiLogic.getVariableNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						variablenomisSeleccionados.addAll(this.variablenomis);				
					}
				}
			}
		} else {
			variablenomisSeleccionados.add(this.variablenomi);
		}
		
		return variablenomisSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteVariableNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVariableNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVariableNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVariableNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVariableNomisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Variable Nomina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVariableNomisSeleccionados() throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVariableNomis("Todos",variablenomisSeleccionados);
		
	}	
	
	public void generarReporteNormalVariableNomisSeleccionados() throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVariableNomis("Todos",variablenomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVariableNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVariableNomis("Todos",variablenomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVariableNomisSeleccionados() throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVariableNomi();
		
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVariableNomi();
		
		
		//this.generarReporteVariableNomis("Todos",variablenomisSeleccionados ,variablenomiImplementable,variablenomiImplementableHome);
	}
	
	public void mostrarImportacionVariableNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVariableNomi();
		
		this.abrirFrameImportacionVariableNomi();		
		
			
		//this.generarReporteVariableNomis("Todos",variablenomisSeleccionados ,variablenomiImplementable,variablenomiImplementableHome);
	}
	
	public void importarVariableNomis() throws Exception {		
	
	}
	
	public void exportarVariableNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVariableNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVariableNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVariableNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Variable Nomina",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVariableNomisSeleccionados() throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"variablenomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVariableNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VariableNomi variablenomiAux:variablenomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVariableNomi(variablenomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//variablenomiAux.setsDetalleGeneralEntityReporte(variablenomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVariableNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_SQL1;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_SQL2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_SQL3;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VariableNomiConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVariableNomi(VariableNomi variablenomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=variablenomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.gettipovariablenomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.gettipovalorvariablenomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getsql1();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getsql2();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getsql3();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=variablenomi.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVariableNomisSeleccionados() throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"variablenomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VariableNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVariableNomi(row);				
				iRow++;
			}				
			
			for(VariableNomi variablenomiAux:variablenomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVariableNomi(variablenomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVariableNomisSeleccionados() throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();		
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"variablenomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("variablenomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("variablenomi");
			//elementRoot.appendChild(element);
		
			for(VariableNomi variablenomiAux:variablenomisSeleccionados) {
				element = document.createElement("variablenomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVariableNomi(variablenomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Variable Nomina",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVariableNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL1);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL2);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_SQL3);
		cell = row.createCell(iColumn++);cell.setCellValue(VariableNomiConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVariableNomi(VariableNomi variablenomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.gettipovariablenomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.gettipovalorvariablenomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getsql1());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getsql2());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getsql3());
		cell = row.createCell(iColumn++);cell.setCellValue(variablenomi.getvalor());				
	}
	
	public void setFilaDatosExportarXmlVariableNomi(VariableNomi variablenomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VariableNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(variablenomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VariableNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(variablenomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VariableNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(variablenomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementmodulo_descripcion = document.createElement(VariableNomiConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(variablenomi.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementtipovariablenomi_descripcion = document.createElement(VariableNomiConstantesFunciones.IDTIPOVARIABLENOMI);
		elementtipovariablenomi_descripcion.appendChild(document.createTextNode(variablenomi.gettipovariablenomi_descripcion()));
		element.appendChild(elementtipovariablenomi_descripcion);

		Element elementtipovalorvariablenomi_descripcion = document.createElement(VariableNomiConstantesFunciones.IDTIPOVALORVARIABLENOMI);
		elementtipovalorvariablenomi_descripcion.appendChild(document.createTextNode(variablenomi.gettipovalorvariablenomi_descripcion()));
		element.appendChild(elementtipovalorvariablenomi_descripcion);

		Element elementcodigo = document.createElement(VariableNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(variablenomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(VariableNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(variablenomi.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsql1 = document.createElement(VariableNomiConstantesFunciones.SQL1);
		elementsql1.appendChild(document.createTextNode(variablenomi.getsql1().trim()));
		element.appendChild(elementsql1);

		Element elementsql2 = document.createElement(VariableNomiConstantesFunciones.SQL2);
		elementsql2.appendChild(document.createTextNode(variablenomi.getsql2().trim()));
		element.appendChild(elementsql2);

		Element elementsql3 = document.createElement(VariableNomiConstantesFunciones.SQL3);
		elementsql3.appendChild(document.createTextNode(variablenomi.getsql3().trim()));
		element.appendChild(elementsql3);

		Element elementvalor = document.createElement(VariableNomiConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(variablenomi.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoVariableNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VariableNomi> variablenomisSeleccionados=new ArrayList<VariableNomi>();
		
		variablenomisSeleccionados=this.getVariableNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoVariableNomi(variablenomisSeleccionados);
		
		this.generarReporteVariableNomis("Todos",variablenomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVariableNomi(ArrayList<VariableNomi> variablenomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VariableNomi variablenomiAux:variablenomisSeleccionados) {
				variablenomiAux.setsDetalleGeneralEntityReporte(variablenomiAux.toString());
			
				if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_IDTIPOVARIABLENOMI)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.gettipovariablenomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_IDTIPOVALORVARIABLENOMI)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.gettipovalorvariablenomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL1)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.getsql1());
				}
				 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL2)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.getsql2());
				}
				 else if(sTipoSeleccionar.equals(VariableNomiConstantesFunciones.LABEL_SQL3)) {
					existe=true;
					variablenomiAux.setsDescripcionGeneralEntityReporte1(variablenomiAux.getsql3());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VariableNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVariableNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVariableNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesVariableNomi=true;
				this.isVisibilidadCeldaGuardarCambiosVariableNomi=true;
			}
			
			this.isVisibilidadCeldaModificarVariableNomi=false;
			this.isVisibilidadCeldaActualizarVariableNomi=false;
			this.isVisibilidadCeldaEliminarVariableNomi=false;
			this.isVisibilidadCeldaCancelarVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=false;
			this.isVisibilidadCeldaModificarVariableNomi=false;
			this.isVisibilidadCeldaActualizarVariableNomi=true;
			this.isVisibilidadCeldaEliminarVariableNomi=false;
			this.isVisibilidadCeldaCancelarVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=false;
			this.isVisibilidadCeldaModificarVariableNomi=false;
			this.isVisibilidadCeldaActualizarVariableNomi=true;
			this.isVisibilidadCeldaEliminarVariableNomi=true;
			this.isVisibilidadCeldaCancelarVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=false;
			this.isVisibilidadCeldaModificarVariableNomi=false;
			this.isVisibilidadCeldaActualizarVariableNomi=true;
			this.isVisibilidadCeldaEliminarVariableNomi=false;
			this.isVisibilidadCeldaCancelarVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=true;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=true;
			this.isVisibilidadCeldaModificarVariableNomi=false;
			this.isVisibilidadCeldaActualizarVariableNomi=false;
			this.isVisibilidadCeldaEliminarVariableNomi=false;
			this.isVisibilidadCeldaCancelarVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVariableNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=false;
			this.isVisibilidadCeldaActualizarVariableNomi=false;
			this.isVisibilidadCeldaEliminarVariableNomi=false;
			this.isVisibilidadCeldaCancelarVariableNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVariableNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=false;
			this.isVisibilidadCeldaModificarVariableNomi=true;
			this.isVisibilidadCeldaActualizarVariableNomi=false;
			this.isVisibilidadCeldaEliminarVariableNomi=false;
			this.isVisibilidadCeldaCancelarVariableNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarVariableNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VariableNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVariableNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=true;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=true;
		} else {
			this.actualizarEstadoPanelsVariableNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVariableNomi=false;
			//this.isVisibilidadCeldaVerFormVariableNomi=false;
			this.isVisibilidadCeldaDuplicarVariableNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!variablenomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoVariableNomi=false;
			this.isVisibilidadCeldaGuardarCambiosVariableNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(variablenomiSessionBean.getEsGuardarRelacionado()) {
			if(!variablenomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;												
			}
			
			this.jButtonCerrarVariableNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVariableNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.variablenomi)) {
			this.isVisibilidadCeldaActualizarVariableNomi=false;
			this.isVisibilidadCeldaEliminarVariableNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVariableNomi() {
	}
	
	public void actualizarEstadoPanelsVariableNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVariableNomi!=null) {
				this.jScrollPanelDatosEdicionVariableNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVariableNomi!=null) {
				this.jTabbedPaneBusquedasVariableNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVariableNomi!=null) {
				this.jScrollPanelDatosVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionVariableNomi!=null) {
				this.jPanelPaginacionVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVariableNomi!=null) {
				this.jScrollPanelDatosEdicionVariableNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVariableNomi!=null) {
				this.jTabbedPaneBusquedasVariableNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVariableNomi!=null) {
				this.jScrollPanelDatosVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionVariableNomi!=null) {
				this.jPanelPaginacionVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVariableNomi!=null) {
				this.jScrollPanelDatosEdicionVariableNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVariableNomi!=null) {
				this.jTabbedPaneBusquedasVariableNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVariableNomi!=null) {
				this.jScrollPanelDatosVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionVariableNomi!=null) {
				this.jPanelPaginacionVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVariableNomi!=null) {
				this.jScrollPanelDatosEdicionVariableNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVariableNomi!=null) {
				this.jTabbedPaneBusquedasVariableNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVariableNomi!=null) {
				this.jScrollPanelDatosVariableNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionVariableNomi!=null) {
				this.jPanelPaginacionVariableNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVariableNomi!=null) {
				this.jScrollPanelDatosEdicionVariableNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVariableNomi!=null) {
				this.jTabbedPaneBusquedasVariableNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVariableNomi!=null) {
				this.jScrollPanelDatosVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionVariableNomi!=null) {
				this.jPanelPaginacionVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVariableNomi!=null) {
				this.jScrollPanelDatosEdicionVariableNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVariableNomi!=null) {
				this.jTabbedPaneBusquedasVariableNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVariableNomi!=null) {
				this.jScrollPanelDatosVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionVariableNomi!=null) {
				this.jPanelPaginacionVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVariableNomi!=null) {
				this.jScrollPanelDatosEdicionVariableNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVariableNomi!=null) {
				this.jTabbedPaneBusquedasVariableNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVariableNomi!=null) {
				this.jScrollPanelDatosVariableNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionVariableNomi!=null) {
				this.jPanelPaginacionVariableNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVariableNomi!=null) {
					this.jTabbedPaneBusquedasVariableNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.variablenomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVariableNomi!=null) {
				this.jTabbedPaneBusquedasVariableNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVariableNomi!=null) {
				this.jPanelParametrosReportesVariableNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTipoValorVariableNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoValorVariableNomi) {this.jTabbedPaneBusquedasVariableNomi.remove(jPanelFK_IdTipoValorVariableNomiVariableNomi);}

			this.isVisibilidadFK_IdTipoVariableNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoVariableNomi) {this.jTabbedPaneBusquedasVariableNomi.remove(jPanelFK_IdTipoVariableNomiVariableNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadFK_IdTipoValorVariableNomi=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoValorVariableNomi) {this.jTabbedPaneBusquedasVariableNomi.remove(jPanelFK_IdTipoValorVariableNomiVariableNomi);}

			this.isVisibilidadFK_IdTipoVariableNomi=isParaModuloNegation;
			if(!this.isVisibilidadFK_IdTipoVariableNomi) {this.jTabbedPaneBusquedasVariableNomi.remove(jPanelFK_IdTipoVariableNomiVariableNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoVariableNomi(Boolean isParaTipoVariableNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoVariableNomiNegation=!isParaTipoVariableNomi;

			this.isVisibilidadFK_IdTipoValorVariableNomi=isParaTipoVariableNomiNegation;
			if(!this.isVisibilidadFK_IdTipoValorVariableNomi) {this.jTabbedPaneBusquedasVariableNomi.remove(jPanelFK_IdTipoValorVariableNomiVariableNomi);}

			this.isVisibilidadFK_IdTipoVariableNomi=isParaTipoVariableNomi;
			if(!this.isVisibilidadFK_IdTipoVariableNomi) {this.jTabbedPaneBusquedasVariableNomi.remove(jPanelFK_IdTipoVariableNomiVariableNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoValorVariableNomi(Boolean isParaTipoValorVariableNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoValorVariableNomiNegation=!isParaTipoValorVariableNomi;

			this.isVisibilidadFK_IdTipoValorVariableNomi=isParaTipoValorVariableNomi;
			if(!this.isVisibilidadFK_IdTipoValorVariableNomi) {this.jTabbedPaneBusquedasVariableNomi.remove(jPanelFK_IdTipoValorVariableNomiVariableNomi);}

			this.isVisibilidadFK_IdTipoVariableNomi=isParaTipoValorVariableNomiNegation;
			if(!this.isVisibilidadFK_IdTipoVariableNomi) {this.jTabbedPaneBusquedasVariableNomi.remove(jPanelFK_IdTipoVariableNomiVariableNomi);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VariableNomiSessionBean variablenomiSessionBean=new VariableNomiSessionBean();
		
		if(this.variablenomiSessionBean==null) {
			this.variablenomiSessionBean=new VariableNomiSessionBean();
		}
		
		this.variablenomiSessionBean.setsUltimaBusquedaVariableNomi(this.getsAccionBusqueda());
		this.variablenomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.variablenomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			variablenomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			variablenomiSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoValorVariableNomi")) {
			variablenomiSessionBean.setid_tipo_valor_variable_nomi(this.getid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoVariableNomi")) {
			variablenomiSessionBean.setid_tipo_variable_nomi(this.getid_tipo_variable_nomiFK_IdTipoVariableNomi());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VariableNomiSessionBean variablenomiSessionBean=new VariableNomiSessionBean();
		
		if(this.variablenomiSessionBean==null) {
			this.variablenomiSessionBean=new VariableNomiSessionBean();
		}
		
		if(this.variablenomiSessionBean.getsUltimaBusquedaVariableNomi()!=null&&!this.variablenomiSessionBean.getsUltimaBusquedaVariableNomi().equals("")) {
			this.setsAccionBusqueda(variablenomiSessionBean.getsUltimaBusquedaVariableNomi());
			this.setiNumeroPaginacion(variablenomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(variablenomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(variablenomiSessionBean.getid_empresa());
				variablenomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(variablenomiSessionBean.getid_modulo());
				variablenomiSessionBean.setid_modulo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoValorVariableNomi")) {
				this.setid_tipo_valor_variable_nomiFK_IdTipoValorVariableNomi(variablenomiSessionBean.getid_tipo_valor_variable_nomi());
				variablenomiSessionBean.setid_tipo_valor_variable_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoVariableNomi")) {
				this.setid_tipo_variable_nomiFK_IdTipoVariableNomi(variablenomiSessionBean.getid_tipo_variable_nomi());
				variablenomiSessionBean.setid_tipo_variable_nomi(-1L);
			}
		}
		
		this.variablenomiSessionBean.setsUltimaBusquedaVariableNomi("");
		this.variablenomiSessionBean.setiNumeroPaginacion(VariableNomiConstantesFunciones.INUMEROPAGINACION);
		this.variablenomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVariableNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVariableNomi() {
		this.updateBorderResaltarBusquedasFormularioVariableNomi();
		this.updateVisibilidadBusquedasFormularioVariableNomi();
		this.updateHabilitarBusquedasFormularioVariableNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioVariableNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVariableNomi.getComponents().length>0) {
	

		if(this.variablenomiConstantesFunciones.resaltarFK_IdTipoValorVariableNomiVariableNomi!=null) {
			index= this.jTabbedPaneBusquedasVariableNomi.indexOfComponent(this.jPanelFK_IdTipoValorVariableNomiVariableNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVariableNomi.getComponent(index);
				jPanel.setBorder(this.variablenomiConstantesFunciones.resaltarFK_IdTipoValorVariableNomiVariableNomi);
			}
		}

		if(this.variablenomiConstantesFunciones.resaltarFK_IdTipoVariableNomiVariableNomi!=null) {
			index= this.jTabbedPaneBusquedasVariableNomi.indexOfComponent(this.jPanelFK_IdTipoVariableNomiVariableNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVariableNomi.getComponent(index);
				jPanel.setBorder(this.variablenomiConstantesFunciones.resaltarFK_IdTipoVariableNomiVariableNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVariableNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVariableNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVariableNomi.indexOfComponent(this.jPanelFK_IdTipoValorVariableNomiVariableNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVariableNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.variablenomiConstantesFunciones.mostrarFK_IdTipoValorVariableNomiVariableNomi);
			if(!this.variablenomiConstantesFunciones.mostrarFK_IdTipoValorVariableNomiVariableNomi && index>-1) {
				this.jTabbedPaneBusquedasVariableNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasVariableNomi.indexOfComponent(this.jPanelFK_IdTipoVariableNomiVariableNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVariableNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.variablenomiConstantesFunciones.mostrarFK_IdTipoVariableNomiVariableNomi);
			if(!this.variablenomiConstantesFunciones.mostrarFK_IdTipoVariableNomiVariableNomi && index>-1) {
				this.jTabbedPaneBusquedasVariableNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVariableNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVariableNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVariableNomi.indexOfComponent(this.jPanelFK_IdTipoValorVariableNomiVariableNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVariableNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.variablenomiConstantesFunciones.activarFK_IdTipoValorVariableNomiVariableNomi);
				this.jTabbedPaneBusquedasVariableNomi.setEnabledAt(index,this.variablenomiConstantesFunciones.activarFK_IdTipoValorVariableNomiVariableNomi);
			}

			index= this.jTabbedPaneBusquedasVariableNomi.indexOfComponent(this.jPanelFK_IdTipoVariableNomiVariableNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVariableNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.variablenomiConstantesFunciones.activarFK_IdTipoVariableNomiVariableNomi);
				this.jTabbedPaneBusquedasVariableNomi.setEnabledAt(index,this.variablenomiConstantesFunciones.activarFK_IdTipoVariableNomiVariableNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVariableNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTipoValorVariableNomi")) {
			index= this.jTabbedPaneBusquedasVariableNomi.indexOfComponent(this.jPanelFK_IdTipoValorVariableNomiVariableNomi);

			this.jTabbedPaneBusquedasVariableNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVariableNomi.getComponent(index);

			this.variablenomiConstantesFunciones.setResaltarFK_IdTipoValorVariableNomiVariableNomi(resaltar);

			jPanel.setBorder(this.variablenomiConstantesFunciones.resaltarFK_IdTipoValorVariableNomiVariableNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoVariableNomi")) {
			index= this.jTabbedPaneBusquedasVariableNomi.indexOfComponent(this.jPanelFK_IdTipoVariableNomiVariableNomi);

			this.jTabbedPaneBusquedasVariableNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVariableNomi.getComponent(index);

			this.variablenomiConstantesFunciones.setResaltarFK_IdTipoVariableNomiVariableNomi(resaltar);

			jPanel.setBorder(this.variablenomiConstantesFunciones.resaltarFK_IdTipoVariableNomiVariableNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVariableNomi.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioVariableNomi() throws Exception {

		if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVariableNomi();
		this.updateVisibilidadResaltarControlesFormularioVariableNomi();
		this.updateHabilitarResaltarControlesFormularioVariableNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioVariableNomi() throws Exception {
		if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.variablenomiConstantesFunciones.resaltaridVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltaridVariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarid_empresaVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarid_empresaVariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarid_moduloVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarid_moduloVariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarid_tipo_variable_nomiVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarid_tipo_variable_nomiVariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarid_tipo_valor_variable_nomiVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarid_tipo_valor_variable_nomiVariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarcodigoVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jTextFieldcodigoVariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarcodigoVariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarnombreVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jTextAreanombreVariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarnombreVariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarsql1VariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jTextAreasql1VariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarsql1VariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarsql2VariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jTextAreasql2VariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarsql2VariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarsql3VariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jTextAreasql3VariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarsql3VariableNomi);}
		if(this.variablenomiConstantesFunciones.resaltarvalorVariableNomi!=null && this.jInternalFrameDetalleFormVariableNomi!=null) {this.jInternalFrameDetalleFormVariableNomi.jTextFieldvalorVariableNomi.setBorder(this.variablenomiConstantesFunciones.resaltarvalorVariableNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVariableNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
	
		//this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostraridVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelidVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostraridVariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarid_empresaVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelid_empresaVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarid_empresaVariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarid_moduloVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelid_moduloVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarid_moduloVariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarid_tipo_variable_nomiVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelid_tipo_variable_nomiVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarid_tipo_variable_nomiVariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarid_tipo_valor_variable_nomiVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelid_tipo_valor_variable_nomiVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarid_tipo_valor_variable_nomiVariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jTextFieldcodigoVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarcodigoVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelcodigoVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarcodigoVariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jTextAreanombreVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarnombreVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelnombreVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarnombreVariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jTextAreasql1VariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarsql1VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelsql1VariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarsql1VariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jTextAreasql2VariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarsql2VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelsql2VariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarsql2VariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jTextAreasql3VariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarsql3VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelsql3VariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarsql3VariableNomi);
		//this.jInternalFrameDetalleFormVariableNomi.jTextFieldvalorVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarvalorVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jPanelvalorVariableNomi.setVisible(this.variablenomiConstantesFunciones.mostrarvalorVariableNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVariableNomi() throws Exception {
		if(this.jInternalFrameDetalleFormVariableNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVariableNomi!=null) {
	
		this.jInternalFrameDetalleFormVariableNomi.jLabelidVariableNomi.setEnabled(this.variablenomiConstantesFunciones.activaridVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_empresaVariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarid_empresaVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_moduloVariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarid_moduloVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_variable_nomiVariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarid_tipo_variable_nomiVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jComboBoxid_tipo_valor_variable_nomiVariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarid_tipo_valor_variable_nomiVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextFieldcodigoVariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarcodigoVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextAreanombreVariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarnombreVariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextAreasql1VariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarsql1VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextAreasql2VariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarsql2VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextAreasql3VariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarsql3VariableNomi);
		this.jInternalFrameDetalleFormVariableNomi.jTextFieldvalorVariableNomi.setEnabled(this.variablenomiConstantesFunciones.activarvalorVariableNomi);
		}
	}
	
		
}