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

import com.bydan.erp.nomina.util.ParametroNomiConstantesFunciones;
import com.bydan.erp.nomina.util.ParametroNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.ParametroNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.ParametroNomiBean;
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
public class ParametroNomiBeanSwingJInternalFrame extends ParametroNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ParametroNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ParametroNomi> parametronomiValidator = new ClassValidator<ParametroNomi>(ParametroNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ParametroNomi parametronomi;	
	public ParametroNomi parametronomiAux;
	public ParametroNomi parametronomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ParametroNomi parametronomiTotales;
	public Long idParametroNomiActual;
	public Long iIdNuevoParametroNomi=0L;
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
	
	public Boolean isPermisoTodoParametroNomi;
	public Boolean isPermisoNuevoParametroNomi;
	public Boolean isPermisoActualizarParametroNomi;
	public Boolean isPermisoActualizarOriginalParametroNomi;
	public Boolean isPermisoEliminarParametroNomi;
	public Boolean isPermisoGuardarCambiosParametroNomi;
	public Boolean isPermisoConsultaParametroNomi;
	public Boolean isPermisoBusquedaParametroNomi;
	public Boolean isPermisoReporteParametroNomi;
	public Boolean isPermisoPaginacionMedioParametroNomi;
	public Boolean isPermisoPaginacionAltoParametroNomi;
	public Boolean isPermisoPaginacionTodoParametroNomi;
	public Boolean isPermisoCopiarParametroNomi;
	public Boolean isPermisoVerFormParametroNomi;
	public Boolean isPermisoDuplicarParametroNomi;
	public Boolean isPermisoOrdenParametroNomi;
	
	
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
	
	public ParametroNomiParameterReturnGeneral parametronomiReturnGeneral;
	public ParametroNomiParameterReturnGeneral parametronomiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoParametroNomi=false;
	public Boolean esParaAccionDesdeFormularioParametroNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ParametroNomiSessionBeanAdditional parametronomiSessionBeanAdditional=null;
	
	public ParametroNomiSessionBeanAdditional getParametroNomiSessionBeanAdditional() {
		return this.parametronomiSessionBeanAdditional;
	}
	
	public void setParametroNomiSessionBeanAdditional(ParametroNomiSessionBeanAdditional parametronomiSessionBeanAdditional) {
		try {
			this.parametronomiSessionBeanAdditional=parametronomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ParametroNomiBeanSwingJInternalFrameAdditional parametronomiBeanSwingJInternalFrameAdditional=null;
	//public class ParametroNomiBeanSwingJInternalFrame
	
	public ParametroNomiBeanSwingJInternalFrameAdditional getParametroNomiBeanSwingJInternalFrameAdditional() {
		return this.parametronomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setParametroNomiBeanSwingJInternalFrameAdditional(ParametroNomiBeanSwingJInternalFrameAdditional parametronomiBeanSwingJInternalFrameAdditional) {
		try {
			this.parametronomiBeanSwingJInternalFrameAdditional=parametronomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ParametroNomiLogic parametronomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ParametroNomi parametronomiBean;
	public ParametroNomiConstantesFunciones parametronomiConstantesFunciones;
	//public ParametroNomiParameterReturnGeneral parametronomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<ParametroNomi> parametronomis;	
	//public List<ParametroNomi> parametronomisEliminados;
	//public List<ParametroNomi> parametronomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoParametroNomi=false;
	public Boolean isVisibilidadCeldaDuplicarParametroNomi=true;
	public Boolean isVisibilidadCeldaCopiarParametroNomi=true;
	public Boolean isVisibilidadCeldaVerFormParametroNomi=true;
	public Boolean isVisibilidadCeldaOrdenParametroNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
	public Boolean isVisibilidadCeldaModificarParametroNomi=false;
	public Boolean isVisibilidadCeldaActualizarParametroNomi=false;
	public Boolean isVisibilidadCeldaEliminarParametroNomi=false;
	public Boolean isVisibilidadCeldaCancelarParametroNomi=false;
	public Boolean isVisibilidadCeldaGuardarParametroNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosParametroNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoParametroNomi() {
		return this.iIdNuevoParametroNomi;
	}

	public void setiIdNuevoParametroNomi(Long iIdNuevoParametroNomi) {
		this.iIdNuevoParametroNomi = iIdNuevoParametroNomi;
	}
	
	public Long getidParametroNomiActual() {
		return this.idParametroNomiActual;
	}

	public void setidParametroNomiActual(Long idParametroNomiActual) {
		this.idParametroNomiActual = idParametroNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ParametroNomi getparametronomi() {
		return this.parametronomi;
	}

	public void setparametronomi(ParametroNomi parametronomi) {
		this.parametronomi = parametronomi;
	}
	
	public ParametroNomi getparametronomiAux() {
		return this.parametronomiAux;
	}

	public void setparametronomiAux(ParametroNomi parametronomiAux) {
		this.parametronomiAux = parametronomiAux;
	}				
	
	public ParametroNomi getparametronomiAnterior() {
		return this.parametronomiAnterior;
	}

	public void setparametronomiAnterior(ParametroNomi parametronomiAnterior) {
		this.parametronomiAnterior = parametronomiAnterior;
	}	
	
	public ParametroNomi getparametronomiTotales() {
		return this.parametronomiTotales;
	}

	public void setparametronomiTotales(ParametroNomi parametronomiTotales) {
		this.parametronomiTotales = parametronomiTotales;
	}	
	
	public ParametroNomi getparametronomiBean() {
		return this.parametronomiBean;
	}

	public void setparametronomiBean(ParametroNomi parametronomiBean) {
		this.parametronomiBean = parametronomiBean;
	}	
	
	public ParametroNomiParameterReturnGeneral getparametronomiReturnGeneral() {
		return this.parametronomiReturnGeneral;
	}

	public void setparametronomiReturnGeneral(ParametroNomiParameterReturnGeneral parametronomiReturnGeneral) {
		this.parametronomiReturnGeneral = parametronomiReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ParametroNomiLogic getParametroNomiLogic()	{		
		return parametronomiLogic;
	}

	public void setParametroNomiLogic(ParametroNomiLogic parametronomiLogic) {
		this.parametronomiLogic = parametronomiLogic;
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
	
	public Boolean getIsEsNuevoParametroNomi() {
		return isEsNuevoParametroNomi;
	}

	public void setIsEsNuevoParametroNomi(Boolean isEsNuevoParametroNomi) {
		this.isEsNuevoParametroNomi = isEsNuevoParametroNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioParametroNomi() {
		return esParaAccionDesdeFormularioParametroNomi;
	}
	
	public void setEsParaAccionDesdeFormularioParametroNomi(Boolean esParaAccionDesdeFormularioParametroNomi) {
		this.esParaAccionDesdeFormularioParametroNomi = esParaAccionDesdeFormularioParametroNomi;
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

			if(this.parametronomiSessionBean==null) {
				this.parametronomiSessionBean=new ParametroNomiSessionBean();
			}

			if(!this.parametronomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(parametronomiSessionBean.getlidEmpresaActual());
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

					if(this.parametronomi!=null) {
						this.parametronomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormParametroNomi!=null) {
						this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaParametroNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormParametroNomi!=null) {
						if(this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaParametroNomiGenerico)throws Exception
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
				jComboBoxid_empresaParametroNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaParametroNomiGenerico!=null && jComboBoxid_empresaParametroNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaParametroNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ParametroNomi parametronomi,JComboBox jComboBoxid_empresaParametroNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaParametroNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaParametroNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				parametronomi.setid_empresa(empresaAux.getId());
				parametronomi.setempresa_descripcion(ParametroNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				parametronomi.setEmpresa(empresaAux);			}
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

					if(!ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormParametroNomi!=null) { 
							this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormParametroNomi!=null) { 
					}

					if(!ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormParametroNomi!=null) {
							this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormParametroNomi!=null) {
							this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesParametroNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ParametroNomiConstantesFunciones.refrescarForeignKeysDescripcionesParametroNomi(this.parametronomiLogic.getParametroNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ParametroNomiConstantesFunciones.refrescarForeignKeysDescripcionesParametroNomi(this.parametronomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//parametronomiLogic.setParametroNomis(this.parametronomis);
			parametronomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ParametroNomiParameterReturnGeneral getParametroNomiParameterGeneral() {
		return this.parametronomiParameterGeneral;
	}
	
	public void setParametroNomiParameterGeneral(ParametroNomiParameterReturnGeneral parametronomiParameterGeneral) {
		this.parametronomiParameterGeneral = parametronomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoParametroNomi() {
		return isPermisoTodoParametroNomi;
	}

	public void setIsPermisoTodoParametroNomi(Boolean isPermisoTodoParametroNomi) {
		this.isPermisoTodoParametroNomi = isPermisoTodoParametroNomi;
	}

	public Boolean getIsPermisoNuevoParametroNomi() {
		return isPermisoNuevoParametroNomi;
	}

	public void setIsPermisoNuevoParametroNomi(Boolean isPermisoNuevoParametroNomi) {
		this.isPermisoNuevoParametroNomi = isPermisoNuevoParametroNomi;
	}

	public Boolean getIsPermisoActualizarParametroNomi() {
		return isPermisoActualizarParametroNomi;
	}

	public void setIsPermisoActualizarParametroNomi(Boolean isPermisoActualizarParametroNomi) {
		this.isPermisoActualizarParametroNomi = isPermisoActualizarParametroNomi;
	}

	public Boolean getIsPermisoEliminarParametroNomi() {
		return isPermisoEliminarParametroNomi;
	}

	public void setIsPermisoEliminarParametroNomi(Boolean isPermisoEliminarParametroNomi) {
		this.isPermisoEliminarParametroNomi = isPermisoEliminarParametroNomi;
	}

	public Boolean getIsPermisoGuardarCambiosParametroNomi() {
		return isPermisoGuardarCambiosParametroNomi;
	}

	public void setIsPermisoGuardarCambiosParametroNomi(Boolean isPermisoGuardarCambiosParametroNomi) {
		this.isPermisoGuardarCambiosParametroNomi = isPermisoGuardarCambiosParametroNomi;
	}
	
	public Boolean getIsPermisoConsultaParametroNomi() {
		return isPermisoConsultaParametroNomi;
	}

	public void setIsPermisoConsultaParametroNomi(Boolean isPermisoConsultaParametroNomi) {
		this.isPermisoConsultaParametroNomi = isPermisoConsultaParametroNomi;
	}

	public Boolean getIsPermisoBusquedaParametroNomi() {
		return isPermisoBusquedaParametroNomi;
	}

	public void setIsPermisoBusquedaParametroNomi(Boolean isPermisoBusquedaParametroNomi) {
		this.isPermisoBusquedaParametroNomi = isPermisoBusquedaParametroNomi;
	}

	public Boolean getIsPermisoReporteParametroNomi() {
		return isPermisoReporteParametroNomi;
	}

	public void setIsPermisoReporteParametroNomi(Boolean isPermisoReporteParametroNomi) {
		this.isPermisoReporteParametroNomi = isPermisoReporteParametroNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioParametroNomi() {
		return isPermisoPaginacionMedioParametroNomi;
	}

	public void setIsPermisoPaginacionMedioParametroNomi(Boolean isPermisoPaginacionMedioParametroNomi) {
		this.isPermisoPaginacionMedioParametroNomi = isPermisoPaginacionMedioParametroNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoParametroNomi() {
		return isPermisoPaginacionTodoParametroNomi;
	}

	public void setIsPermisoPaginacionTodoParametroNomi(Boolean isPermisoPaginacionTodoParametroNomi) {
		this.isPermisoPaginacionTodoParametroNomi = isPermisoPaginacionTodoParametroNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoParametroNomi() {
		return isPermisoPaginacionAltoParametroNomi;
	}

	public void setIsPermisoPaginacionAltoParametroNomi(Boolean isPermisoPaginacionAltoParametroNomi) {
		this.isPermisoPaginacionAltoParametroNomi = isPermisoPaginacionAltoParametroNomi;
	}
	
	public Boolean getIsPermisoCopiarParametroNomi() {
		return isPermisoCopiarParametroNomi;
	}

	public void setIsPermisoCopiarParametroNomi(Boolean isPermisoCopiarParametroNomi) {
		this.isPermisoCopiarParametroNomi = isPermisoCopiarParametroNomi;
	}
	
	public Boolean getIsPermisoVerFormParametroNomi() {
		return isPermisoVerFormParametroNomi;
	}

	public void setIsPermisoVerFormParametroNomi(Boolean isPermisoVerFormParametroNomi) {
		this.isPermisoVerFormParametroNomi = isPermisoVerFormParametroNomi;
	}
	
	public Boolean getIsPermisoDuplicarParametroNomi() {
		return isPermisoDuplicarParametroNomi;
	}

	public void setIsPermisoDuplicarParametroNomi(Boolean isPermisoDuplicarParametroNomi) {
		this.isPermisoDuplicarParametroNomi = isPermisoDuplicarParametroNomi;
	}
	
	public Boolean getIsPermisoOrdenParametroNomi() {
		return isPermisoOrdenParametroNomi;
	}

	public void setIsPermisoOrdenParametroNomi(Boolean isPermisoOrdenParametroNomi) {
		this.isPermisoOrdenParametroNomi = isPermisoOrdenParametroNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoParametroNomi() {
		return isVisibilidadCeldaNuevoParametroNomi;
	}

	public void setIsVisibilidadCeldaNuevoParametroNomi(Boolean isVisibilidadCeldaNuevoParametroNomi) {
		this.isVisibilidadCeldaNuevoParametroNomi = isVisibilidadCeldaNuevoParametroNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarParametroNomi() {
		return isVisibilidadCeldaDuplicarParametroNomi;
	}

	public void setIsVisibilidadCeldaDuplicarParametroNomi(Boolean isVisibilidadCeldaDuplicarParametroNomi) {
		this.isVisibilidadCeldaDuplicarParametroNomi = isVisibilidadCeldaDuplicarParametroNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarParametroNomi() {
		return isVisibilidadCeldaCopiarParametroNomi;
	}

	public void setIsVisibilidadCeldaCopiarParametroNomi(Boolean isVisibilidadCeldaCopiarParametroNomi) {
		this.isVisibilidadCeldaCopiarParametroNomi = isVisibilidadCeldaCopiarParametroNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormParametroNomi() {
		return isVisibilidadCeldaVerFormParametroNomi;
	}

	public void setIsVisibilidadCeldaVerFormParametroNomi(Boolean isVisibilidadCeldaVerFormParametroNomi) {
		this.isVisibilidadCeldaVerFormParametroNomi = isVisibilidadCeldaVerFormParametroNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenParametroNomi() {
		return isVisibilidadCeldaOrdenParametroNomi;
	}

	public void setIsVisibilidadCeldaOrdenParametroNomi(Boolean isVisibilidadCeldaOrdenParametroNomi) {
		this.isVisibilidadCeldaOrdenParametroNomi = isVisibilidadCeldaOrdenParametroNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesParametroNomi() {
		return isVisibilidadCeldaNuevoRelacionesParametroNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesParametroNomi(Boolean isVisibilidadCeldaNuevoRelacionesParametroNomi) {
		this.isVisibilidadCeldaNuevoRelacionesParametroNomi = isVisibilidadCeldaNuevoRelacionesParametroNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarParametroNomi() {
		return isVisibilidadCeldaModificarParametroNomi;
	}

	public void setIsVisibilidadCeldaModificarParametroNomi(Boolean isVisibilidadCeldaModificarParametroNomi) {
		this.isVisibilidadCeldaModificarParametroNomi = isVisibilidadCeldaModificarParametroNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarParametroNomi() {
		return isVisibilidadCeldaActualizarParametroNomi;
	}

	public void setIsVisibilidadCeldaActualizarParametroNomi(Boolean isVisibilidadCeldaActualizarParametroNomi) {
		this.isVisibilidadCeldaActualizarParametroNomi = isVisibilidadCeldaActualizarParametroNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarParametroNomi() {
		return isVisibilidadCeldaEliminarParametroNomi;
	}

	public void setIsVisibilidadCeldaEliminarParametroNomi(Boolean isVisibilidadCeldaEliminarParametroNomi) {
		this.isVisibilidadCeldaEliminarParametroNomi = isVisibilidadCeldaEliminarParametroNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarParametroNomi() {
		return isVisibilidadCeldaCancelarParametroNomi;
	}

	public void setIsVisibilidadCeldaCancelarParametroNomi(Boolean isVisibilidadCeldaCancelarParametroNomi) {
		this.isVisibilidadCeldaCancelarParametroNomi = isVisibilidadCeldaCancelarParametroNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarParametroNomi() {
		return isVisibilidadCeldaGuardarParametroNomi;
	}

	public void setIsVisibilidadCeldaGuardarParametroNomi(Boolean isVisibilidadCeldaGuardarParametroNomi) {
		this.isVisibilidadCeldaGuardarParametroNomi = isVisibilidadCeldaGuardarParametroNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosParametroNomi() {
		return isVisibilidadCeldaGuardarCambiosParametroNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosParametroNomi(Boolean isVisibilidadCeldaGuardarCambiosParametroNomi) {
		this.isVisibilidadCeldaGuardarCambiosParametroNomi = isVisibilidadCeldaGuardarCambiosParametroNomi;
	}
		
	public ParametroNomiSessionBean getparametronomiSessionBean() {
		return this.parametronomiSessionBean;
	}
	
	public void setparametronomiSessionBean(ParametroNomiSessionBean parametronomiSessionBean) {
		this.parametronomiSessionBean=parametronomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysParametroNomi(ParametroNomi parametronomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(parametronomi,null);
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
	
	public void bugActualizarReferenciaActual(ParametroNomi parametronomi,ParametroNomi parametronomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalParametroNomi(parametronomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		parametronomiAux.setId(parametronomi.getId());
		parametronomiAux.setVersionRow(parametronomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessParametroNomi();
		
			int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = parametronomiValidator.getInvalidValues(this.parametronomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			parametronomiLogic.setDatosCliente(datosCliente);
			parametronomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				parametronomiAux=new  ParametroNomi();
				
				parametronomiAux.setIsNew(true);
				parametronomiAux.setIsChanged(true);
				
				parametronomiAux.setParametroNomiOriginal(this.parametronomi);
				
				parametronomiAux.setId(this.parametronomi.getId());	
				parametronomiAux.setVersionRow(this.parametronomi.getVersionRow());	
				parametronomiAux.setid_empresa(this.parametronomi.getid_empresa());	
				parametronomiAux.setcodigo(this.parametronomi.getcodigo());	
				parametronomiAux.setnombre(this.parametronomi.getnombre());	
				parametronomiAux.setvalor(this.parametronomi.getvalor());	
				parametronomiAux.setdescripcion(this.parametronomi.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametronomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(parametronomiAux,parametronomiLogic.getParametroNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametronomiAux,parametronomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.parametronomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametronomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametronomiLogic.saveParametroNomis();//WithConnection
						//parametronomiLogic.getSetVersionRowParametroNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametronomi,parametronomiAux);
					
					this.refrescarForeignKeysDescripcionesParametroNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametronomiLogic.saveParametroNomiRelaciones(parametronomiAux);//WithConnection
								//parametronomiLogic.getSetVersionRowParametroNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametronomi,parametronomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametronomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametronomiAux,parametronomiLogic.getParametroNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametronomiAux,parametronomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametronomi,parametronomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				parametronomiAux=new  ParametroNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.parametronomiSessionBean.getEsGuardarRelacionado() 
					|| (this.parametronomiSessionBean.getEsGuardarRelacionado() && this.parametronomi.getId()>=0)) {
						
					parametronomiAux.setIsNew(false);
				}
				
				parametronomiAux.setIsDeleted(false);
			
				parametronomiAux.setId(this.parametronomi.getId());	
				parametronomiAux.setVersionRow(this.parametronomi.getVersionRow());	
				parametronomiAux.setid_empresa(this.parametronomi.getid_empresa());	
				parametronomiAux.setcodigo(this.parametronomi.getcodigo());	
				parametronomiAux.setnombre(this.parametronomi.getnombre());	
				parametronomiAux.setvalor(this.parametronomi.getvalor());	
				parametronomiAux.setdescripcion(this.parametronomi.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametronomiAux,parametronomiLogic.getParametroNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametronomiAux,parametronomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.parametronomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametronomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametronomiLogic.saveParametroNomis();//WithConnection
						//parametronomiLogic.getSetVersionRowParametroNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.parametronomi,parametronomiAux);
					
					this.refrescarForeignKeysDescripcionesParametroNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametronomiLogic.saveParametroNomiRelaciones(parametronomiAux);//WithConnection
								//parametronomiLogic.getSetVersionRowParametroNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.parametronomi,parametronomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.parametronomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(parametronomiAux,parametronomiLogic.getParametroNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(parametronomiAux,parametronomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.parametronomi,parametronomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				parametronomiAux=new  ParametroNomi();
				
				parametronomiAux.setIsNew(false);
				parametronomiAux.setIsChanged(false);
				
				parametronomiAux.setIsDeleted(true);
				
				parametronomiAux.setId(this.parametronomi.getId());	
				parametronomiAux.setVersionRow(this.parametronomi.getVersionRow());	
				parametronomiAux.setid_empresa(this.parametronomi.getid_empresa());	
				parametronomiAux.setcodigo(this.parametronomi.getcodigo());	
				parametronomiAux.setnombre(this.parametronomi.getnombre());	
				parametronomiAux.setvalor(this.parametronomi.getvalor());	
				parametronomiAux.setdescripcion(this.parametronomi.getdescripcion());	
				
				if(this.parametronomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.parametronomiAux.getId()>=0) {	
						this.parametronomisEliminados.add(parametronomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(parametronomiAux,parametronomiLogic.getParametroNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametronomiAux,parametronomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.parametronomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.parametronomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametronomiLogic.saveParametroNomis();//WithConnection
						//parametronomiLogic.getSetVersionRowParametroNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								parametronomiLogic.saveParametroNomiRelaciones(parametronomiAux);//WithConnection
								//parametronomiLogic.getSetVersionRowParametroNomis();//WithConnection
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
							if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.parametronomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(parametronomiAux,parametronomiLogic.getParametroNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(parametronomiAux,parametronomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.getParametroNomis().addAll(this.parametronomisEliminados);
					
					parametronomiLogic.saveParametroNomis();//WithConnection
					//parametronomiLogic.getSetVersionRowParametroNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesParametroNomi();
				
				this.parametronomisEliminados= new ArrayList<ParametroNomi>();		
			}
			
			if(this.parametronomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Parametro Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.parametronomi=parametronomiAux;
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
      		//this.finishProcessParametroNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(ParametroNomi parametronomiLocal) throws Exception {
		
		if(this.parametronomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ParametroNomi parametronomiLocal) throws Exception {	
		if(this.parametronomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				parametronomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarParametroNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = parametronomiValidator.getInvalidValues(this.parametronomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ParametroNomi parametronomi,List<ParametroNomi> parametronomis) throws Exception {
		try	{		
			ParametroNomiConstantesFunciones.actualizarLista(parametronomi,parametronomis,this.parametronomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ParametroNomi parametronomi,List<ParametroNomi> parametronomis) throws Exception {
		try	{			
			ParametroNomiConstantesFunciones.actualizarSelectedLista(parametronomi,parametronomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ParametroNomi> parametronomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				parametronomisLocal=this.parametronomiLogic.getParametroNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				parametronomisLocal=this.parametronomis;
			}
			//ARCHITECTURE
		
			for(ParametroNomi parametronomiLocal:parametronomisLocal) {
				if(this.permiteMantenimiento(parametronomiLocal) && parametronomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ParametroNomiConstantesFunciones.getParametroNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ParametroNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabelid_empresaParametroNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroNomiConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabelcodigoParametroNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroNomiConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabelnombreParametroNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroNomiConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabelvalorParametroNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ParametroNomiConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabeldescripcionParametroNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroNomi.jLabelid_empresaParametroNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroNomi.jLabelcodigoParametroNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroNomi.jLabelnombreParametroNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroNomi.jLabelvalorParametroNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormParametroNomi.jLabeldescripcionParametroNomi,"");
		
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
		this.iIdNuevoParametroNomi--;	
		
		
		this.parametronomiAux=new ParametroNomi();
		
		this.parametronomiAux.setId(this.iIdNuevoParametroNomi);
		this.parametronomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.parametronomiLogic.getParametroNomis().add(this.parametronomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.parametronomis.add(this.parametronomiAux);
		}
		//ARCHITECTURE
		
		this.parametronomi=this.parametronomiAux;
		
		if(ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioParametroNomi(this.parametronomi);
			this.setVariablesObjetoActualToFormularioForeignKeyParametroNomi(this.parametronomi);
		}
				
		//this.setDefaultControlesParametroNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyParametroNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyParametroNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroNomi(this.parametronomiBean,this.parametronomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ParametroNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
			classes=ParametroNomiConstantesFunciones.getClassesRelationshipsOfParametroNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.parametronomiReturnGeneral=parametronomiLogic.procesarEventosParametroNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametronomiLogic.getParametroNomis(),this.parametronomi,this.parametronomiParameterGeneral,this.isEsNuevoParametroNomi,classes);//this.parametronomiLogic.getParametroNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanParametroNomi(this.parametronomiReturnGeneral,this.parametronomiBean,false);
		
		if(this.parametronomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyParametroNomi(this.parametronomiReturnGeneral.getParametroNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioParametroNomi(this.parametronomiReturnGeneral.getParametroNomi());
		}
		
		if(this.parametronomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioParametroNomi(this.parametronomiReturnGeneral.getParametroNomi(),classes);//this.parametronomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyParametroNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyParametroNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroNomiBeanSwingJInternalFrameAdditional.RecargarFormParametroNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingParametroNomi(false);
						
			if(parametronomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroNomi();
			}
			
			this.actualizarVisualTableDatosParametroNomi();
			
			this.jTableDatosParametroNomi.setRowSelectionInterval(this.getIndiceNuevoParametroNomi(), this.getIndiceNuevoParametroNomi());
			
			this.seleccionarFilaTablaParametroNomiActual();
						
			this.actualizarEstadoCeldasBotonesParametroNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesParametroNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormParametroNomi.jTextFieldcodigoParametroNomi.setEnabled(isHabilitar && this.parametronomiConstantesFunciones.activarcodigoParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jTextAreanombreParametroNomi.setEnabled(isHabilitar && this.parametronomiConstantesFunciones.activarnombreParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jTextFieldvalorParametroNomi.setEnabled(isHabilitar && this.parametronomiConstantesFunciones.activarvalorParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jTextAreadescripcionParametroNomi.setEnabled(isHabilitar && this.parametronomiConstantesFunciones.activardescripcionParametroNomi);	
		//
		this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setEnabled(isHabilitar && this.parametronomiConstantesFunciones.activarid_empresaParametroNomi);
	};
	
	public void setDefaultControlesParametroNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoParametroNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.parametronomiSessionBean.setConGuardarRelaciones(true);			
			this.parametronomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.setVisible(true);
			
					
		} else {
			//this.parametronomiSessionBean.setConGuardarRelaciones(false);			
			this.parametronomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoParametroNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
				if(parametronomiAux.getId().equals(this.iIdNuevoParametroNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroNomi parametronomiAux:this.parametronomis) {
				if(parametronomiAux.getId().equals(this.iIdNuevoParametroNomi)) {
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
	
	public int getIndiceActualParametroNomi(ParametroNomi parametronomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
				if(parametronomiAux.getId().equals(parametronomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroNomi parametronomiAux:this.parametronomis) {
				if(parametronomiAux.getId().equals(parametronomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalParametroNomi(ParametroNomi parametronomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
				if(parametronomiAux.getParametroNomiOriginal().getId().equals(parametronomiOriginal.getId())) {
					existe=true;
					parametronomiOriginal.setId(parametronomiAux.getId());
					parametronomiOriginal.setVersionRow(parametronomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroNomi parametronomiAux:this.parametronomis) {
				if(parametronomiAux.getParametroNomiOriginal().getId().equals(parametronomiOriginal.getId())) {
					existe=true;
					parametronomiOriginal.setId(parametronomiAux.getId());
					parametronomiOriginal.setVersionRow(parametronomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosParametroNomi(Boolean esParaCancelar) throws Exception {
		parametronomisAux=new ArrayList<ParametroNomi>();
		parametronomiAux=new ParametroNomi();
		
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
					if(parametronomiAux.getId()<0) {
						parametronomisAux.add(parametronomiAux);
					}		
				}
				this.iIdNuevoParametroNomi=0L;
				this.parametronomiLogic.getParametroNomis().removeAll(parametronomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroNomi parametronomiAux:this.parametronomis) {
					if(parametronomiAux.getId()<0) {
						parametronomisAux.add(parametronomiAux);
					}		
				}
				this.iIdNuevoParametroNomi=0L;
				this.parametronomis.removeAll(parametronomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoParametroNomi 
					&& this.parametronomiLogic.getParametroNomis().size()>0
					) {
					parametronomiAux=this.parametronomiLogic.getParametroNomis().get(this.parametronomiLogic.getParametroNomis().size() - 1);
				
					if(parametronomiAux.getId()<0) {
						this.parametronomiLogic.getParametroNomis().remove(parametronomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoParametroNomi && this.parametronomis.size()>0) {
					parametronomiAux=this.parametronomis.get(this.parametronomis.size() - 1);
				
					if(parametronomiAux.getId()<0) {
						this.parametronomis.remove(parametronomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoParametroNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(parametronomi.getId()<0) {
				this.parametronomiLogic.getParametroNomis().remove(this.parametronomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(parametronomi.getId()<0) {
				this.parametronomis.remove(this.parametronomi);
			}
		}			
	}
	
	public void setEstadosInicialesParametroNomi(List<ParametroNomi> parametronomisAux) throws Exception {
		ParametroNomiConstantesFunciones.setEstadosInicialesParametroNomi(parametronomisAux);
	}
	
	public void setEstadosInicialesParametroNomi(ParametroNomi parametronomiAux) throws Exception {
		ParametroNomiConstantesFunciones.setEstadosInicialesParametroNomi(parametronomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarParametroNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesParametroNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarParametroNomiActual()) {
				if(!this.isEsNuevoParametroNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesParametroNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoParametroNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarParametroNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Parametro Nomi ?", "MANTENIMIENTO DE Parametro Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesParametroNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ParametroNomi parametronomi) throws Exception {
		ParametroNomiConstantesFunciones.seleccionarAsignar(this.parametronomi,parametronomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarParametroNomi=this.isPermisoActualizarOriginalParametroNomi;
			
			
			this.seleccionarAsignar(parametronomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ParametroNomiConstantesFunciones.quitarEspaciosParametroNomi(this.parametronomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesParametroNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.parametronomiSessionBean.setsFuncionBusquedaRapida(this.parametronomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoParametroNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosParametroNomi(esParaCancelar);				
				this.cancelarNuevoParametroNomi(esParaCancelar);								
			}
			
			this.parametronomi=new ParametroNomi();
			
			this.inicializarParametroNomi();
			
			this.actualizarEstadoCeldasBotonesParametroNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarParametroNomi() throws Exception {
		try {
			ParametroNomiConstantesFunciones.inicializarParametroNomi(this.parametronomi);
			
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
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.parametronomiLogic.getParametroNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteParametroNomis(String sAccionBusqueda,List<ParametroNomi> parametronomisParaReportes) throws Exception {
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
					sPathReporteFinal="ParametroNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ParametroNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ParametroNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ParametroNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Parametro Nomis");		
		parameters.put("busquedapor", ParametroNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceParametroNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ParametroNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ParametroNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceParametroNomi=new JRBeanArrayDataSource(ParametroNomiJInternalFrame.TraerParametroNomiBeans(parametronomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceParametroNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ParametroNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ParametroNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ParametroNomiBean.TraerParametroNomiBeans(parametronomisParaReportes).toArray()));
							
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
				this.generarExcelReporteParametroNomis(sAccionBusqueda,sTipoArchivoReporte,parametronomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalParametroNomis(sAccionBusqueda,sTipoArchivoReporte,parametronomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoParametroNomiActionPerformed(null);
					//this.generarExcelReporteParametroNomis(sAccionBusqueda,sTipoArchivoReporte,parametronomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalParametroNomis(sAccionBusqueda,sTipoArchivoReporte,parametronomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesParametroNomis(sAccionBusqueda,sTipoArchivoReporte,parametronomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesParametroNomis(sAccionBusqueda,sTipoArchivoReporte,parametronomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteParametroNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroNomi> parametronomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametronomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ParametroNomi parametronomi : parametronomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ParametroNomiConstantesFunciones.generarExcelReporteDataParametroNomi("NORMAL",row,workbook,parametronomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderParametroNomi(String sTipo,Row row,Workbook workbook) {
		
		ParametroNomiConstantesFunciones.generarExcelReporteHeaderParametroNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalParametroNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroNomi> parametronomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametronomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ParametroNomi parametronomi : parametronomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ParametroNomiConstantesFunciones.getParametroNomiDescripcion(parametronomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametronomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroNomiConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametronomi.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroNomiConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametronomi.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroNomiConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametronomi.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ParametroNomiConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(parametronomi.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesParametroNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<ParametroNomi> parametronomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ParametroNomi> parametronomisRespaldo=null;
		
		classes=ParametroNomiConstantesFunciones.getClassesRelationshipsOfParametroNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.parametronomiLogic.setDatosCliente(this.datosCliente);
		this.parametronomiLogic.setDatosDeep(this.datosDeep);
		this.parametronomiLogic.setIsConDeep(true);
		
		parametronomisRespaldo=this.parametronomiLogic.getParametroNomis();
		
		this.parametronomiLogic.setParametroNomis(parametronomisParaReportes);	
		this.parametronomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		parametronomisParaReportes=this.parametronomiLogic.getParametroNomis();
		this.parametronomiLogic.setParametroNomis(parametronomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametronomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ParametroNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderParametroNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ParametroNomi parametronomi : parametronomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderParametroNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ParametroNomiConstantesFunciones.generarExcelReporteDataParametroNomi("NORMAL",row,workbook,parametronomi,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ParametroNomiConstantesFunciones.getParametroNomiDescripcion(parametronomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoParametroNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessParametroNomi() throws Exception {		
		this.startProcessParametroNomi(true);
	}
	
	public void startProcessParametroNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasParametroNomi ,this.jPanelParametrosReportesParametroNomi, this.jScrollPanelDatosParametroNomi,this.jPanelPaginacionParametroNomi, this.jScrollPanelDatosEdicionParametroNomi, this.jPanelAccionesParametroNomi,this.jPanelAccionesFormularioParametroNomi,this.jmenuBarParametroNomi,this.jmenuBarDetalleParametroNomi,this.jTtoolBarParametroNomi,this.jTtoolBarDetalleParametroNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroNomi=this.jTabbedPaneBusquedasParametroNomi; 
		
		final JPanel jPanelParametrosReportesParametroNomi=this.jPanelParametrosReportesParametroNomi;
		//final JScrollPane jScrollPanelDatosParametroNomi=this.jScrollPanelDatosParametroNomi;
		final JTable jTableDatosParametroNomi=this.jTableDatosParametroNomi;		
		final JPanel jPanelPaginacionParametroNomi=this.jPanelPaginacionParametroNomi;
		//final JScrollPane jScrollPanelDatosEdicionParametroNomi=this.jScrollPanelDatosEdicionParametroNomi;
		final JPanel jPanelAccionesParametroNomi=this.jPanelAccionesParametroNomi;
		
		JPanel jPanelCamposAuxiliarParametroNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarParametroNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			jPanelCamposAuxiliarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jPanelCamposParametroNomi;
			jPanelAccionesFormularioAuxiliarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jPanelAccionesFormularioParametroNomi;
		}
		
		final JPanel jPanelCamposParametroNomi=jPanelCamposAuxiliarParametroNomi;
		final JPanel jPanelAccionesFormularioParametroNomi=jPanelAccionesFormularioAuxiliarParametroNomi;
		
		
		final JMenuBar jmenuBarParametroNomi=this.jmenuBarParametroNomi;
		final JToolBar jTtoolBarParametroNomi=this.jTtoolBarParametroNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarParametroNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			jmenuBarDetalleAuxiliarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jmenuBarDetalleParametroNomi;
			jTtoolBarDetalleAuxiliarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jTtoolBarDetalleParametroNomi;
		}
		
		final JMenuBar jmenuBarDetalleParametroNomi=jmenuBarDetalleAuxiliarParametroNomi;
		final JToolBar jTtoolBarDetalleParametroNomi=jTtoolBarDetalleAuxiliarParametroNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroNomi;
			processRunnable.jTableDatos=jTableDatosParametroNomi;
			processRunnable.jPanelCampos=jPanelCamposParametroNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroNomi;
			processRunnable.jPanelAcciones=jPanelAccionesParametroNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroNomi;
			
			
			processRunnable.jmenuBar=jmenuBarParametroNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroNomi;
			processRunnable.jTtoolBar=jTtoolBarParametroNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroNomi ,jPanelParametrosReportesParametroNomi,jTableDatosParametroNomi, /*jScrollPanelDatosParametroNomi,*/jPanelCamposParametroNomi,jPanelPaginacionParametroNomi, /*jScrollPanelDatosEdicionParametroNomi,*/ jPanelAccionesParametroNomi,jPanelAccionesFormularioParametroNomi,jmenuBarParametroNomi,jmenuBarDetalleParametroNomi,jTtoolBarParametroNomi,jTtoolBarDetalleParametroNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasParametroNomi ,jPanelParametrosReportesParametroNomi, jScrollPanelDatosParametroNomi,jPanelPaginacionParametroNomi, jScrollPanelDatosEdicionParametroNomi, jPanelAccionesParametroNomi,jPanelAccionesFormularioParametroNomi,jmenuBarParametroNomi,jmenuBarDetalleParametroNomi,jTtoolBarParametroNomi,jTtoolBarDetalleParametroNomi);
						
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
	
	public void finishProcessParametroNomi() {// throws Exception 
		this.finishProcessParametroNomi(true);
	}
	
	public void finishProcessParametroNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasParametroNomi ,this.jPanelParametrosReportesParametroNomi, this.jScrollPanelDatosParametroNomi,this.jPanelPaginacionParametroNomi, this.jScrollPanelDatosEdicionParametroNomi, this.jPanelAccionesParametroNomi,this.jPanelAccionesFormularioParametroNomi,this.jmenuBarParametroNomi,this.jmenuBarDetalleParametroNomi,this.jTtoolBarParametroNomi,this.jTtoolBarDetalleParametroNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasParametroNomi=this.jTabbedPaneBusquedasParametroNomi; 
		
		final JPanel jPanelParametrosReportesParametroNomi=this.jPanelParametrosReportesParametroNomi;
		//final JScrollPane jScrollPanelDatosParametroNomi=this.jScrollPanelDatosParametroNomi;
		final JTable jTableDatosParametroNomi=this.jTableDatosParametroNomi;		
		final JPanel jPanelPaginacionParametroNomi=this.jPanelPaginacionParametroNomi;
		//final JScrollPane jScrollPanelDatosEdicionParametroNomi=this.jScrollPanelDatosEdicionParametroNomi;
		final JPanel jPanelAccionesParametroNomi=this.jPanelAccionesParametroNomi;
		
		JPanel jPanelCamposAuxiliarParametroNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarParametroNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			jPanelCamposAuxiliarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jPanelCamposParametroNomi;
			jPanelAccionesFormularioAuxiliarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jPanelAccionesFormularioParametroNomi;
		}
		
		final JPanel jPanelCamposParametroNomi=jPanelCamposAuxiliarParametroNomi;
		final JPanel jPanelAccionesFormularioParametroNomi=jPanelAccionesFormularioAuxiliarParametroNomi;
		
		
		final JMenuBar jmenuBarParametroNomi=this.jmenuBarParametroNomi;		
		final JToolBar jTtoolBarParametroNomi=this.jTtoolBarParametroNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarParametroNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarParametroNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			jmenuBarDetalleAuxiliarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jmenuBarDetalleParametroNomi;
			jTtoolBarDetalleAuxiliarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jTtoolBarDetalleParametroNomi;		
		}
		
		final JMenuBar jmenuBarDetalleParametroNomi=jmenuBarDetalleAuxiliarParametroNomi;
		final JToolBar jTtoolBarDetalleParametroNomi=jTtoolBarDetalleAuxiliarParametroNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasParametroNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesParametroNomi;
			processRunnable.jTableDatos=jTableDatosParametroNomi;
			processRunnable.jPanelCampos=jPanelCamposParametroNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionParametroNomi;
			processRunnable.jPanelAcciones=jPanelAccionesParametroNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioParametroNomi;
			
			
			processRunnable.jmenuBar=jmenuBarParametroNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleParametroNomi;
			processRunnable.jTtoolBar=jTtoolBarParametroNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleParametroNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasParametroNomi ,jPanelParametrosReportesParametroNomi, jTableDatosParametroNomi,/*jScrollPanelDatosParametroNomi,*/jPanelCamposParametroNomi,jPanelPaginacionParametroNomi, /*jScrollPanelDatosEdicionParametroNomi,*/ jPanelAccionesParametroNomi,jPanelAccionesFormularioParametroNomi,jmenuBarParametroNomi,jmenuBarDetalleParametroNomi,jTtoolBarParametroNomi,jTtoolBarDetalleParametroNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesParametroNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarParametroNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuParametroNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarParametroNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarParametroNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleParametroNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuParametroNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarParametroNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleParametroNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.parametronomiConstantesFunciones.getsFinalQueryParametroNomi();
		String  finalQueryPaginacionTodos=this.parametronomiConstantesFunciones.getsFinalQueryParametroNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ParametroNomiConstantesFunciones.getArrayColumnasGlobalesNoParametroNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ParametroNomiConstantesFunciones.getArrayColumnasGlobalesParametroNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ParametroNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.parametronomisEliminados= new ArrayList<ParametroNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessParametroNomi();
		
				///*ParametroNomiSessionBean*/this.parametronomiSessionBean=new ParametroNomiSessionBean();
			
			if(this.parametronomiSessionBean==null) {
				this.parametronomiSessionBean=new ParametroNomiSessionBean();
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
					this.iNumeroPaginacion=ParametroNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ParametroNomiConstantesFunciones.getClassesForeignKeysOfParametroNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/parametronomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			parametronomisAux= new ArrayList<ParametroNomi>();
			
				
			parametronomiLogic.setDatosCliente(this.datosCliente);
			parametronomiLogic.setDatosDeep(this.datosDeep);
			parametronomiLogic.setIsConDeep(true);
			
			
			parametronomiLogic.getParametroNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					parametronomiLogic.getTodosParametroNomis(finalQueryGlobal,pagination);
					
					//parametronomiLogic.getTodosParametroNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(parametronomiLogic.getParametroNomis()==null|| parametronomiLogic.getParametroNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametronomisAux= new ArrayList<ParametroNomi>();
							parametronomisAux.addAll(parametronomiLogic.getParametroNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametronomisAux= new ArrayList<ParametroNomi>();
							parametronomisAux.addAll(parametronomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametronomiLogic.getTodosParametroNomis(finalQueryGlobal+"",this.pagination);												
							
							//parametronomiLogic.getTodosParametroNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteParametroNomis("Todos",parametronomiLogic.getParametroNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							parametronomiLogic.setParametroNomis(new ArrayList<ParametroNomi>());					
							parametronomiLogic.getParametroNomis().addAll(parametronomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametronomis=new ArrayList<ParametroNomi>();
							parametronomis.addAll(parametronomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idParametroNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idParametroNomi=this.idActual;
				
				} else if(this.idParametroNomiActual!=null && this.idParametroNomiActual!=0L) {
					idParametroNomi=idParametroNomiActual;
				}
				
					
				this.sDetalleReporte=ParametroNomiConstantesFunciones.getDetalleIndicePorId(idParametroNomi);
				
				this.parametronomis=new ArrayList<ParametroNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					parametronomiLogic.getEntity(idParametroNomi);
					
					//parametronomiLogic.getEntityWithConnection(idParametroNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametronomiLogic.setParametroNomis(new ArrayList<ParametroNomi>());
					parametronomiLogic.getParametroNomis().add(parametronomiLogic.getParametroNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametronomis=new ArrayList<ParametroNomi>();
					this.parametronomis.add(parametronomi);
				}
				
				if(parametronomiLogic.getParametroNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ParametroNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					parametronomiLogic.getParametroNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=parametronomiLogic.getParametroNomis()==null||parametronomiLogic.getParametroNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=parametronomis==null|| parametronomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						parametronomisAux=new ArrayList<ParametroNomi>();
						parametronomisAux.addAll(parametronomiLogic.getParametroNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametronomisAux=new ArrayList<ParametroNomi>();
							parametronomisAux.addAll(parametronomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							parametronomiLogic.getParametroNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ParametroNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ParametroNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteParametroNomis("FK_IdEmpresa",parametronomiLogic.getParametroNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteParametroNomis("FK_IdEmpresa",parametronomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						parametronomiLogic.setParametroNomis(new ArrayList<ParametroNomi>());
						parametronomiLogic.getParametroNomis().addAll(parametronomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametronomis=new ArrayList<ParametroNomi>();
							parametronomis.addAll(parametronomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesParametroNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessParametroNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametronomiLogic.getParametroNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametronomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=parametronomiLogic.getParametroNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=parametronomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ParametroNomi parametronomi) {
		Boolean permite=true;
		
		if(this.parametronomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ParametroNomiConstantesFunciones.getOrderByListaParametroNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ParametroNomiConstantesFunciones.getOrderByListaParametroNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroNomi parametronomi:parametronomiLogic.getParametroNomis()) {
				if(parametronomi.getsType().equals(Constantes2.S_TOTALES)) {
					parametronomiTotales=parametronomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroNomi parametronomi:this.parametronomis) {
				if(parametronomi.getsType().equals(Constantes2.S_TOTALES)) {
					parametronomiTotales=parametronomi;
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
			this.parametronomiAux=new ParametroNomi();
			this.parametronomiAux.setsType(Constantes2.S_TOTALES);
			this.parametronomiAux.setIsNew(false);
			this.parametronomiAux.setIsChanged(false);
			this.parametronomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ParametroNomiConstantesFunciones.TotalizarValoresFilaParametroNomi(this.parametronomiLogic.getParametroNomis(),this.parametronomiAux);
				
				this.parametronomiLogic.getParametroNomis().add(this.parametronomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ParametroNomiConstantesFunciones.TotalizarValoresFilaParametroNomi(this.parametronomis,this.parametronomiAux);
				
				this.parametronomis.add(this.parametronomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		parametronomiTotales=new ParametroNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametronomiLogic.getParametroNomis().remove(parametronomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.parametronomis.remove(parametronomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		parametronomiTotales=new ParametroNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ParametroNomi parametronomi:parametronomiLogic.getParametroNomis()) {
				if(parametronomi.getsType().equals(Constantes2.S_TOTALES)) {
					parametronomiTotales=parametronomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroNomiConstantesFunciones.TotalizarValoresFilaParametroNomi(this.parametronomiLogic.getParametroNomis(),parametronomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ParametroNomi parametronomi:this.parametronomis) {
				if(parametronomi.getsType().equals(Constantes2.S_TOTALES)) {
					parametronomiTotales=parametronomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ParametroNomiConstantesFunciones.TotalizarValoresFilaParametroNomi(this.parametronomis,parametronomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getParametroNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getParametroNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametronomiLogic.getParametroNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosParametroNomi() {
		this.isPermisoTodoParametroNomi=false;
		this.isPermisoNuevoParametroNomi=false;
		this.isPermisoActualizarParametroNomi=false;
		this.isPermisoActualizarOriginalParametroNomi=false;
		this.isPermisoEliminarParametroNomi=false;
		this.isPermisoGuardarCambiosParametroNomi=false;
		this.isPermisoConsultaParametroNomi=false;
		this.isPermisoBusquedaParametroNomi=false;
		this.isPermisoReporteParametroNomi=false;		
		this.isPermisoOrdenParametroNomi=false;		
		this.isPermisoPaginacionMedioParametroNomi=false;		
		this.isPermisoPaginacionAltoParametroNomi=false;
		this.isPermisoPaginacionTodoParametroNomi=false;
		this.isPermisoCopiarParametroNomi=false;		
		this.isPermisoVerFormParametroNomi=false;		
		this.isPermisoDuplicarParametroNomi=false;		
		this.isPermisoOrdenParametroNomi=false;		
	}
	
	public void setPermisosUsuarioParametroNomi(Boolean isPermiso) {
		this.isPermisoTodoParametroNomi=isPermiso;
		this.isPermisoNuevoParametroNomi=isPermiso;
		this.isPermisoActualizarParametroNomi=isPermiso;
		this.isPermisoActualizarOriginalParametroNomi=isPermiso;
		this.isPermisoEliminarParametroNomi=isPermiso;
		this.isPermisoGuardarCambiosParametroNomi=isPermiso;
		this.isPermisoConsultaParametroNomi=isPermiso;
		this.isPermisoBusquedaParametroNomi=isPermiso;
		this.isPermisoReporteParametroNomi=isPermiso;
		this.isPermisoOrdenParametroNomi=isPermiso;		
		this.isPermisoPaginacionMedioParametroNomi=isPermiso;		
		this.isPermisoPaginacionAltoParametroNomi=isPermiso;		
		this.isPermisoPaginacionTodoParametroNomi=isPermiso;		
		this.isPermisoCopiarParametroNomi=isPermiso;		
		this.isPermisoVerFormParametroNomi=isPermiso;		
		this.isPermisoDuplicarParametroNomi=isPermiso;
		this.isPermisoOrdenParametroNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioParametroNomi(Boolean isPermiso) {
		//this.isPermisoTodoParametroNomi=isPermiso;
		this.isPermisoNuevoParametroNomi=isPermiso;
		this.isPermisoActualizarParametroNomi=isPermiso;
		this.isPermisoActualizarOriginalParametroNomi=isPermiso;
		this.isPermisoEliminarParametroNomi=isPermiso;
		this.isPermisoGuardarCambiosParametroNomi=isPermiso;
		//this.isPermisoConsultaParametroNomi=isPermiso;
		//this.isPermisoBusquedaParametroNomi=isPermiso;
		//this.isPermisoReporteParametroNomi=isPermiso;
		//this.isPermisoOrdenParametroNomi=isPermiso;		
		//this.isPermisoPaginacionMedioParametroNomi=isPermiso;		
		//this.isPermisoPaginacionAltoParametroNomi=isPermiso;		
		//this.isPermisoPaginacionTodoParametroNomi=isPermiso;		
		//this.isPermisoCopiarParametroNomi=isPermiso;		
		//this.isPermisoDuplicarParametroNomi=isPermiso;
		//this.isPermisoOrdenParametroNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioParametroNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ParametroNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebParametroNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioParametroNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioParametroNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionParametroNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioParametroNomiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioParametroNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ParametroNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.parametronomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ParametroNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoParametroNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarParametroNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalParametroNomi=this.isPermisoActualizarParametroNomi;
			this.isPermisoEliminarParametroNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosParametroNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaParametroNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaParametroNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoParametroNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteParametroNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioParametroNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoParametroNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoParametroNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarParametroNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormParametroNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarParametroNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenParametroNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.parametronomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosParametroNomi.setToolTipText(this.jTableDatosParametroNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioParametroNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioParametroNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ParametroNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ParametroNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioParametroNomi() throws Exception {
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
	public void inicializarCombosForeignKeyParametroNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyParametroNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ParametroNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyParametroNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyParametroNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ParametroNomiParameterReturnGeneral parametronomiReturnGeneral=new ParametroNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.parametronomiConstantesFunciones.cargarid_empresaParametroNomi)
					 || (this.esRecargarFks && this.parametronomiConstantesFunciones.cargarid_empresaParametroNomi)) {

					if(!this.parametronomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+parametronomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				parametronomiReturnGeneral=parametronomiLogic.cargarCombosLoteForeignKeyParametroNomi(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=parametronomiReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyParametroNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.parametronomiSessionBean==null) {
				this.parametronomiSessionBean=new ParametroNomiSessionBean();
			}

			if(!this.parametronomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyParametroNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyParametroNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyParametroNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyParametroNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyParametroNomi(ParametroNomi parametronomi)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyParametroNomi(ParametroNomi parametronomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyParametroNomi()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyParametroNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyParametroNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyParametroNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroParametroNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyParametroNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyParametroNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyParametroNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi!=null && this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public ParametroNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ParametroNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ParametroNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.parametronomiSessionBean=new ParametroNomiSessionBean(); 
		this.parametronomiConstantesFunciones=new ParametroNomiConstantesFunciones(); 
		this.parametronomiBean=new ParametroNomi();//(this.parametronomiConstantesFunciones); 		
		this.parametronomiReturnGeneral=new ParametroNomiParameterReturnGeneral(); 
		
		this.parametronomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametronomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ParametroNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ParametroNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ParametroNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessParametroNomi(true);
			
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
			
			this.parametronomiConstantesFunciones=new ParametroNomiConstantesFunciones(); 
			this.parametronomiBean=new ParametroNomi();//this.parametronomiConstantesFunciones); 			
			this.parametronomiReturnGeneral=new ParametroNomiParameterReturnGeneral(); 
		
			ParametroNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.parametronomi=new ParametroNomi();
			this.parametronomis = new ArrayList<ParametroNomi>();
			this.parametronomisAux = new ArrayList<ParametroNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic=new ParametroNomiLogic();
				this.parametronomiLogic.getNewConnexionToDeep("");
			}
			
			//this.parametronomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.parametronomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormParametroNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroNomi);	
					}
					
					if(this.jInternalFrameImportacionParametroNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByParametroNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByParametroNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormParametroNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroNomi);
				this.jInternalFrameDetalleFormParametroNomi.setVisible(false);
				this.jInternalFrameDetalleFormParametroNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroNomi);
					this.jInternalFrameReporteDinamicoParametroNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoParametroNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionParametroNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionParametroNomi);
					this.jInternalFrameImportacionParametroNomi.setVisible(false);
					this.jInternalFrameImportacionParametroNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByParametroNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByParametroNomi);
					this.jInternalFrameOrderByParametroNomi.setVisible(false);
					this.jInternalFrameOrderByParametroNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idParametroNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ParametroNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.parametronomiReturnGeneral=new ParametroNomiParameterReturnGeneral();
			
			this.parametronomiParameterGeneral=new ParametroNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.parametronomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ParametroNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.parametronomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametronomiSessionBean.getEsGuardarRelacionado(),this.parametronomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ParametroNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.parametronomiSessionBean.getEsGuardarRelacionado(),this.parametronomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoParametroNomi=false;
			this.isVisibilidadCeldaDuplicarParametroNomi=true;
			this.isVisibilidadCeldaCopiarParametroNomi=true;
			this.isVisibilidadCeldaVerFormParametroNomi=true;
			this.isVisibilidadCeldaOrdenParametroNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
			this.isVisibilidadCeldaModificarParametroNomi=false;
			this.isVisibilidadCeldaActualizarParametroNomi=false;
			this.isVisibilidadCeldaEliminarParametroNomi=false;
			this.isVisibilidadCeldaCancelarParametroNomi=false;
			this.isVisibilidadCeldaGuardarParametroNomi=false;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesParametroNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosParametroNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioParametroNomi(false);
			
			this.setPermisosUsuarioParametroNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametronomiSessionBean.getEsGuardarRelacionado() 
				|| (this.parametronomiSessionBean.getEsGuardarRelacionado() && this.parametronomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioParametroNomiClasesRelacionadas();
			}
			
			if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioParametroNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosParametroNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualParametroNomi();
			}
			
			if(!this.isPermisoBusquedaParametroNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasParametroNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioParametroNomi,this.isPermisoPaginacionMedioParametroNomi,this.isPermisoPaginacionTodoParametroNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ParametroNomiConstantesFunciones.getTiposSeleccionarParametroNomi());
				
				this.tiposColumnasSelect=ParametroNomiConstantesFunciones.getTiposSeleccionarParametroNomi(true);
				
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
			//if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioParametroNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioParametroNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioParametroNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroNomi() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				parametronomiImplementable= (ParametroNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				parametronomiImplementableHome= (ParametroNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ParametroNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.parametronomis= new ArrayList<ParametroNomi>();
			this.parametronomisEliminados= new ArrayList<ParametroNomi>();
						
			this.isEsNuevoParametroNomi=false;
			this.esParaAccionDesdeFormularioParametroNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyParametroNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroParametroNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ParametroNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ParametroNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesParametroNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingParametroNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormParametroNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioParametroNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioParametroNomi();
			}
			
			ParametroNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasParametroNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasParametroNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasParametroNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessParametroNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ParametroNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectParametroNomi() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesParametroNomi")) {
				iIndex=this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessParametroNomi();	
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
	
	public void cargarCombosForeignKeyParametroNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyParametroNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyParametroNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyParametroNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyParametroNomi();
		
		this.cargarCombosFrameForeignKeyParametroNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyParametroNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyParametroNomi();
		}
	}
	
	
	
	public void jButtonNuevoParametroNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
			
			if(jTableDatosParametroNomi.getRowCount()>=1) {
				jTableDatosParametroNomi.removeRowSelectionInterval(0, jTableDatosParametroNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoParametroNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoParametroNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesParametroNomi(true);			
			//this.parametronomi=new ParametroNomi();
			//this.parametronomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroNomi() ;
			
			if(ParametroNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.parametronomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);				
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
			if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ParametroNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarParametroNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosParametroNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosParametroNomi.getSelectedRows().length;			
			}
			
			parametronomisSeleccionados=this.getParametroNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoParametroNomi--;			
				//ParametroNomi parametronomiAux= new ParametroNomi();			
				//parametronomiAux.setId(this.iIdNuevoParametroNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ParametroNomi parametronomiOrigen=new ParametroNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ParametroNomi parametronomiOrigen : parametronomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							parametronomiOrigen =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							parametronomiOrigen =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaParametroNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.parametronomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosParametroNomi(parametronomiOrigen,this.parametronomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametronomiLogic.getParametroNomis().add(this.parametronomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametronomis.add(this.parametronomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaParametroNomi(false);
				
				this.jTableDatosParametroNomi.setRowSelectionInterval(this.getIndiceNuevoParametroNomi(), this.getIndiceNuevoParametroNomi());
				
				int iLastRow =  this.jTableDatosParametroNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();									
		
			ParametroNomi parametronomiOrigen=new ParametroNomi();
			ParametroNomi parametronomiDestino=new ParametroNomi();
				
			parametronomisSeleccionados=this.getParametroNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosParametroNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || parametronomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosParametroNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametronomiOrigen =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametronomiOrigen =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						parametronomiDestino =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						parametronomiDestino =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				parametronomiOrigen =parametronomisSeleccionados.get(0);
				parametronomiDestino =parametronomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosParametroNomi(parametronomiOrigen,parametronomiDestino,true,false);
				
				parametronomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(parametronomiDestino,parametronomiLogic.getParametroNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(parametronomiDestino,parametronomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaParametroNomi(false);
				
				//this.jTableDatosParametroNomi.setRowSelectionInterval(this.getIndiceNuevoParametroNomi(), this.getIndiceNuevoParametroNomi());
				
				int iLastRow =  this.jTableDatosParametroNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosParametroNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosParametroNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormParametroNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesParametroNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasParametroNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesParametroNomi.setVisible(!isVisible);
			this.jPanelPaginacionParametroNomi.setVisible(!isVisible);
			this.jPanelAccionesParametroNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameParametroNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoParametroNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionParametroNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByParametroNomi();
			
			this.abrirFrameOrderByParametroNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByParametroNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleParametroNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormParametroNomi.isMaximum()) {
					this.jInternalFrameDetalleFormParametroNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormParametroNomi.setSize(this.jInternalFrameDetalleFormParametroNomi.iWidthFormulario,this.jInternalFrameDetalleFormParametroNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormParametroNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormParametroNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormParametroNomi.isMaximum()) {
						this.jInternalFrameDetalleFormParametroNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormParametroNomi.jContentPaneDetalleParametroNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormParametroNomi.jContentPaneDetalleParametroNomi.getWidth(),ParametroNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormParametroNomi.jContentPaneDetalleParametroNomi.getWidth(),ParametroNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormParametroNomi.jContentPaneDetalleParametroNomi.getWidth(),ParametroNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormParametroNomi.setVisible(true);
	        this.jInternalFrameDetalleFormParametroNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByParametroNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByParametroNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByParametroNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroNomi,false,this);
				} else {
					this.jInternalFrameOrderByParametroNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByParametroNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByParametroNomi);
				this.jInternalFrameOrderByParametroNomi.setVisible(false);
				this.jInternalFrameOrderByParametroNomi.setSelected(false);
				
				this.jInternalFrameOrderByParametroNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroNomi"));
				
				this.inicializarActualizarBindingTablaOrderByParametroNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionParametroNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionParametroNomi==null) {
				
				this.jInternalFrameImportacionParametroNomi=new ImportacionJInternalFrame(ParametroNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionParametroNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionParametroNomi);
				this.jInternalFrameImportacionParametroNomi.setVisible(false);
				this.jInternalFrameImportacionParametroNomi.setSelected(false);


				this.jInternalFrameImportacionParametroNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroNomi"));
				this.jInternalFrameImportacionParametroNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroNomi"));
				this.jInternalFrameImportacionParametroNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoParametroNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoParametroNomi==null) {
				this.jInternalFrameReporteDinamicoParametroNomi=new ReporteDinamicoJInternalFrame(ParametroNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoParametroNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoParametroNomi);
				this.jInternalFrameReporteDinamicoParametroNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoParametroNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoParametroNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroNomi"));
				this.jInternalFrameReporteDinamicoParametroNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroNomi"));
				this.jInternalFrameReporteDinamicoParametroNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleParametroNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormParametroNomi);
			
	       	this.jInternalFrameDetalleFormParametroNomi.setVisible(false);
	        this.jInternalFrameDetalleFormParametroNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormParametroNomi.dispose();
			//this.jInternalFrameDetalleFormParametroNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoParametroNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoParametroNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoParametroNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionParametroNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionParametroNomi.setVisible(true);
	        this.jInternalFrameImportacionParametroNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByParametroNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByParametroNomi.setVisible(true);
	        this.jInternalFrameOrderByParametroNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByParametroNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByParametroNomi.setVisible(false);
	        this.jInternalFrameOrderByParametroNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoParametroNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoParametroNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoParametroNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionParametroNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionParametroNomi.setVisible(false);
	        this.jInternalFrameImportacionParametroNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarParametroNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarParametroNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesParametroNomi(true);
			//this.isEsNuevoParametroNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesParametroNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroNomi(false) ;
			
			if(parametronomiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ParametroNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaParametroNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarParametroNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesParametroNomi(true);
			//this.isEsNuevoParametroNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.parametronomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesParametroNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesParametroNomi(false) ;
			
			if(ParametroNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleParametroNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesParametroNomi(false);
			
			//if(!this.isEsNuevoParametroNomi) {								
				int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
				
			}
			
			if(this.permiteMantenimiento(this.parametronomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoParametroNomi=true;
					this.inicializarActualizarBindingTablaParametroNomi(false);
					this.isEsNuevoParametroNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoParametroNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoParametroNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroNomi(false);
				
				this.habilitarDeshabilitarControlesParametroNomi(false);
			
												
				
				if(ParametroNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleParametroNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoParametroNomiActionPerformed(evt,parametronomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualParametroNomi(this.parametronomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosParametroNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,parametronomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.parametronomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarParametroNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				this.parametronomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				this.parametronomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.parametronomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ParametroNomiModel) this.jTableDatosParametroNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoParametroNomi=true;
				this.inicializarActualizarBindingTablaParametroNomi(false);
				this.isEsNuevoParametroNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesParametroNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroNomi(false);
				
				this.habilitarDeshabilitarControlesParametroNomi(false);
				
				
				
				if(ParametroNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleParametroNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarParametroNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosParametroNomi.getRowCount()>=1) {
				jTableDatosParametroNomi.removeRowSelectionInterval(0, jTableDatosParametroNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesParametroNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaParametroNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesParametroNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualParametroNomi(false) ;
			
			this.isEsNuevoParametroNomi=false;
			
			if(ParametroNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleParametroNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosParametroNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingParametroNomi(false);
				
				//SI ES MANUAL
				if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualParametroNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosParametroNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoParametroNomi--;			
			//ParametroNomi parametronomiAux= new ParametroNomi();			
			//parametronomiAux.setId(this.iIdNuevoParametroNomi);
			
			if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaParametroNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
			
			this.parametronomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.parametronomiLogic.getParametroNomis().add(this.parametronomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.parametronomis.add(this.parametronomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaParametroNomi(false);
			
			this.jTableDatosParametroNomi.setRowSelectionInterval(this.getIndiceNuevoParametroNomi(), this.getIndiceNuevoParametroNomi());
			
			int iLastRow =  this.jTableDatosParametroNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosParametroNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosParametroNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaParametroNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionParametroNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametroNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroNomi(false);
			
			//SI ES MANUAL
			if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroNomi();
			}
			
			//this.abrirFrameTreeParametroNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionParametroNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Parametro NomiS ?", "MANTENIMIENTO DE Parametro Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionParametroNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralParametroNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.parametronomiReturnGeneral=parametronomiLogic.procesarImportacionParametroNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.parametronomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarParametroNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionParametroNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionParametroNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionParametroNomi.setFileImportacion(this.jInternalFrameImportacionParametroNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionParametroNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionParametroNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionParametroNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionParametroNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoParametroNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		

		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ParametroNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ParametroNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteParametroNomis("Todos",parametronomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroNomiConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroNomiConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroNomiConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ParametroNomiConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoParametroNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ParametroNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ParametroNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case ParametroNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case ParametroNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ParametroNomiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ParametroNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ParametroNomiConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case ParametroNomiConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case ParametroNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ParametroNomiConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ParametroNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ParametroNomiConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case ParametroNomiConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case ParametroNomiConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ParametroNomiConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoParametroNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametronomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ParametroNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ParametroNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ParametroNomi parametronomi:parametronomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametronomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroNomiConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(ParametroNomi parametronomi:parametronomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametronomi.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroNomiConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(ParametroNomi parametronomi:parametronomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametronomi.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroNomiConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ParametroNomi parametronomi:parametronomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametronomi.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ParametroNomiConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(ParametroNomi parametronomi:parametronomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(parametronomi.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelParametroNomi(row);				
			//	iRow++;
			//}				
			
			//for(ParametroNomi parametronomiAux:parametronomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelParametroNomi(parametronomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.parametronomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroNomi(false);
			
			//SI ES MANUAL
			if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualParametroNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresParametroNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroNomi(false);
			
			//SI ES MANUAL
			if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesParametroNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingParametroNomi(false);
			
			//SI ES MANUAL
			if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualParametroNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaParametroNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosParametroNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosParametroNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosParametroNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosParametroNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosParametroNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosParametroNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosParametroNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingParametroNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingParametroNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingParametroNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaParametroNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesParametroNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasParametroNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesParametroNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualParametroNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaParametroNomi();
		
		this.inicializarActualizarBindingBotonesManualParametroNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualParametroNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesParametroNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualParametroNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualParametroNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosParametroNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosParametroNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteParametroNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormParametroNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormParametroNomi.jCheckBoxPostAccionNuevoParametroNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormParametroNomi.jCheckBoxPostAccionSinCerrarParametroNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormParametroNomi.jCheckBoxPostAccionSinMensajeParametroNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosParametroNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosParametroNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteParametroNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormParametroNomi!=null) {
				this.jInternalFrameDetalleFormParametroNomi.jCheckBoxPostAccionNuevoParametroNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormParametroNomi.jCheckBoxPostAccionSinCerrarParametroNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormParametroNomi.jCheckBoxPostAccionSinMensajeParametroNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionParametroNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionParametroNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesParametroNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesParametroNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesParametroNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarParametroNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesParametroNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesParametroNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralParametroNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesParametroNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualParametroNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesParametroNomi() throws Exception {
		try	{
			if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualParametroNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesParametroNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesParametroNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesParametroNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesParametroNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesParametroNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesParametroNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionParametroNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionParametroNomi.addItem(reporte);
			}
			
			
			if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionParametroNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionParametroNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesParametroNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesParametroNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesParametroNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesParametroNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarParametroNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarParametroNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarParametroNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualParametroNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
				this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
				this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoParametroNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoParametroNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoParametroNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoParametroNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualParametroNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasParametroNomi(Boolean esInicializar) throws Exception {				
		if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualParametroNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaParametroNomi() throws Exception {
		this.inicializarActualizarBindingTablaParametroNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByParametroNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosParametroNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaParametroNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=parametronomiLogic.getParametroNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=parametronomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosParametroNomi.setModel(new ParametroNomiModel(this.parametronomiLogic.getParametroNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosParametroNomi.setModel(new ParametroNomiModel(this.parametronomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByParametroNomi!=null && this.jInternalFrameOrderByParametroNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByParametroNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosParametroNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO,parametronomiConstantesFunciones.resaltarSeleccionarParametroNomi,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ParametroNomiConstantesFunciones.SCLASSWEBTITULO,parametronomiConstantesFunciones.resaltarSeleccionarParametroNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosParametroNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,ParametroNomiConstantesFunciones.LABEL_ID));

		if(this.parametronomiConstantesFunciones.mostraridParametroNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.parametronomiConstantesFunciones.resaltaridParametroNomi,this.parametronomiConstantesFunciones.activaridParametroNomi,this,true,"idParametroNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametronomiConstantesFunciones.resaltaridParametroNomi,this.parametronomiConstantesFunciones.activaridParametroNomi,this,true,"idParametroNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,ParametroNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.parametronomiConstantesFunciones.mostrarid_empresaParametroNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.parametronomiConstantesFunciones.resaltarid_empresaParametroNomi,this,this.parametronomiConstantesFunciones.activarid_empresaParametroNomi));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.parametronomiConstantesFunciones.resaltarid_empresaParametroNomi,this,this.parametronomiConstantesFunciones.activarid_empresaParametroNomi,false,"id_empresaParametroNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,ParametroNomiConstantesFunciones.LABEL_CODIGO));

		if(this.parametronomiConstantesFunciones.mostrarcodigoParametroNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroNomiConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametronomiConstantesFunciones.resaltarcodigoParametroNomi,this.parametronomiConstantesFunciones.activarcodigoParametroNomi,this,true,"codigoParametroNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametronomiConstantesFunciones.resaltarcodigoParametroNomi,this.parametronomiConstantesFunciones.activarcodigoParametroNomi,this,true,"codigoParametroNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,ParametroNomiConstantesFunciones.LABEL_NOMBRE));

		if(this.parametronomiConstantesFunciones.mostrarnombreParametroNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroNomiConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametronomiConstantesFunciones.resaltarnombreParametroNomi,this.parametronomiConstantesFunciones.activarnombreParametroNomi,this,true,"nombreParametroNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametronomiConstantesFunciones.resaltarnombreParametroNomi,this.parametronomiConstantesFunciones.activarnombreParametroNomi,this,true,"nombreParametroNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,ParametroNomiConstantesFunciones.LABEL_VALOR));

		if(this.parametronomiConstantesFunciones.mostrarvalorParametroNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroNomiConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametronomiConstantesFunciones.resaltarvalorParametroNomi,this.parametronomiConstantesFunciones.activarvalorParametroNomi,this,true,"valorParametroNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametronomiConstantesFunciones.resaltarvalorParametroNomi,this.parametronomiConstantesFunciones.activarvalorParametroNomi,this,true,"valorParametroNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosParametroNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,ParametroNomiConstantesFunciones.LABEL_DESCRIPCION));

		if(this.parametronomiConstantesFunciones.mostrardescripcionParametroNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ParametroNomiConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.parametronomiConstantesFunciones.resaltardescripcionParametroNomi,this.parametronomiConstantesFunciones.activardescripcionParametroNomi,this,true,"descripcionParametroNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.parametronomiConstantesFunciones.resaltardescripcionParametroNomi,this.parametronomiConstantesFunciones.activardescripcionParametroNomi,this,true,"descripcionParametroNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ParametroNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.parametronomiSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametronomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametronomiSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.parametronomiSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.parametronomiSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosParametroNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarParametroNomi && this.isPermisoGuardarCambiosParametroNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.parametronomiSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.parametronomiSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosParametroNomi.addColumn(tableColumn);
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
			
			this.jTableDatosParametroNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroNomi && this.isPermisoGuardarCambiosParametroNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarParametroNomi && this.isPermisoGuardarCambiosParametroNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosParametroNomi.moveColumn(this.jTableDatosParametroNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosParametroNomi.moveColumn(this.jTableDatosParametroNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosParametroNomi.moveColumn(this.jTableDatosParametroNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosParametroNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosParametroNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosParametroNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosParametroNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosParametroNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosParametroNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosParametroNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosParametroNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=parametronomiLogic.getParametroNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=parametronomis.size()-1;
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
		//this.jTableDatosParametroNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosParametroNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosParametroNomi();
			
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
				
				//this.isEsNuevoParametroNomi=false;
					
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
				if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormParametroNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.parametronomi.getsType().equals("DUPLICADO")
				   || this.parametronomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoParametroNomi=true;
				
				} else {
					this.isEsNuevoParametroNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.parametronomiSessionBean.getEsGuardarRelacionado()) {
					if(this.parametronomi.getId()>=0 && !this.parametronomi.getIsNew()) {						
						this.isEsNuevoParametroNomi=false;
						
					} else {
						this.isEsNuevoParametroNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoParametroNomi(esRelaciones);						
				
				this.seleccionarParametroNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.parametronomi.getId()<0) {
					this.isEsNuevoParametroNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarParametroNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarParametroNomi(evt,rowIndex);
				}	
				
				if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ParametroNomi: " + this.dDif); 
					}
				}								
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarParametroNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.parametronomi)) {
					if(this.parametronomi.getId()>0) {
						this.parametronomi.setIsDeleted(true);
						
						this.parametronomisEliminados.add(this.parametronomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.parametronomiLogic.getParametroNomis().remove(this.parametronomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.parametronomis.remove(this.parametronomi);				
					}
					
					
					((ParametroNomiModel) this.jTableDatosParametroNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaParametroNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarParametroNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoParametroNomi) {
			
			if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosParametroNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosParametroNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioParametroNomi(this.parametronomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.parametronomiConstantesFunciones.cargarid_empresaParametroNomi || this.parametronomiConstantesFunciones.event_dependid_empresaParametroNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.parametronomi.getid_empresa());
									//this.inicializarActualizarBindingParametroNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(parametronomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(parametronomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.parametronomi.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesParametroNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesParametroNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualParametroNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroNomi(ParametroNomi parametronomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoParametroNomi(parametronomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoParametroNomi(ParametroNomi parametronomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioParametroNomi(parametronomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyParametroNomi(parametronomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyParametroNomi(parametronomi);
	}
	
	public void setVariablesObjetoActualToFormularioParametroNomi(ParametroNomi parametronomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.setText(parametronomi.getId().toString());
			this.jInternalFrameDetalleFormParametroNomi.jTextFieldcodigoParametroNomi.setText(parametronomi.getcodigo());
			this.jInternalFrameDetalleFormParametroNomi.jTextAreanombreParametroNomi.setText(parametronomi.getnombre());
			this.jInternalFrameDetalleFormParametroNomi.jTextFieldvalorParametroNomi.setText(parametronomi.getvalor());
			this.jInternalFrameDetalleFormParametroNomi.jTextAreadescripcionParametroNomi.setText(parametronomi.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ParametroNomi parametronomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,parametronomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ParametroNomi parametronomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				parametronomiLocal=this.parametronomi;
			} else {
				parametronomiLocal=this.parametronomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(parametronomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoParametroNomi(parametronomiLocal,true);
					
					if(parametronomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(parametronomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.parametronomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(parametronomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoParametroNomi(ParametroNomi parametronomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroNomi(parametronomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(parametronomi);
	}
	
	public void setVariablesFormularioToObjetoActualParametroNomi(ParametroNomi parametronomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualParametroNomi(parametronomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualParametroNomi(ParametroNomi parametronomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.getText()==null || this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.getText()=="" || this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.setText("0");
			}

			if(conColumnasBase) {parametronomi.setId(Long.parseLong(this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabelIdParametroNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametronomi.setcodigo(this.jInternalFrameDetalleFormParametroNomi.jTextFieldcodigoParametroNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroNomiConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabelcodigoParametroNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametronomi.setnombre(this.jInternalFrameDetalleFormParametroNomi.jTextAreanombreParametroNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroNomiConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabelnombreParametroNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametronomi.setvalor(this.jInternalFrameDetalleFormParametroNomi.jTextFieldvalorParametroNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroNomiConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabelvalorParametroNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			parametronomi.setdescripcion(this.jInternalFrameDetalleFormParametroNomi.jTextAreadescripcionParametroNomi.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ParametroNomiConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormParametroNomi.jLabeldescripcionParametroNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualParametroNomi(ParametroNomi parametronomiBean,ParametroNomi parametronomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosParametroNomi(ParametroNomi parametronomiOrigen,ParametroNomi parametronomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametronomiOrigen.getId()!=null && !parametronomiOrigen.getId().equals(0L))) {parametronomi.setId(parametronomiOrigen.getId());}}
			if(conDefault || (!conDefault && parametronomiOrigen.getcodigo()!=null && !parametronomiOrigen.getcodigo().equals(""))) {parametronomi.setcodigo(parametronomiOrigen.getcodigo());}
			if(conDefault || (!conDefault && parametronomiOrigen.getnombre()!=null && !parametronomiOrigen.getnombre().equals(""))) {parametronomi.setnombre(parametronomiOrigen.getnombre());}
			if(conDefault || (!conDefault && parametronomiOrigen.getvalor()!=null && !parametronomiOrigen.getvalor().equals(""))) {parametronomi.setvalor(parametronomiOrigen.getvalor());}
			if(conDefault || (!conDefault && parametronomiOrigen.getdescripcion()!=null && !parametronomiOrigen.getdescripcion().equals(""))) {parametronomi.setdescripcion(parametronomiOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroNomi(ParametroNomi parametronomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.setText(parametronomi.getId().toString());
			this.jInternalFrameDetalleFormParametroNomi.jTextFieldcodigoParametroNomi.setText(parametronomi.getcodigo());
			this.jInternalFrameDetalleFormParametroNomi.jTextAreanombreParametroNomi.setText(parametronomi.getnombre());
			this.jInternalFrameDetalleFormParametroNomi.jTextFieldvalorParametroNomi.setText(parametronomi.getvalor());
			this.jInternalFrameDetalleFormParametroNomi.jTextAreadescripcionParametroNomi.setText(parametronomi.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioParametroNomi(ParametroNomiBean parametronomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.setText(parametronomiBean.getId().toString());
			this.jInternalFrameDetalleFormParametroNomi.jTextFieldcodigoParametroNomi.setText(parametronomiBean.getcodigo());
			this.jInternalFrameDetalleFormParametroNomi.jTextAreanombreParametroNomi.setText(parametronomiBean.getnombre());
			this.jInternalFrameDetalleFormParametroNomi.jTextFieldvalorParametroNomi.setText(parametronomiBean.getvalor());
			this.jInternalFrameDetalleFormParametroNomi.jTextAreadescripcionParametroNomi.setText(parametronomiBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanParametroNomi(ParametroNomiParameterReturnGeneral parametronomiReturnGeneral,ParametroNomiBean parametronomiBean,Boolean conDefault) throws Exception { 
		try {
			ParametroNomi parametronomiLocal=new ParametroNomi();
			
			parametronomiLocal=parametronomiReturnGeneral.getParametroNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && parametronomiLocal.getId()!=null && !parametronomiLocal.getId().equals(0L))) {parametronomiBean.setId(parametronomiLocal.getId());}}
			if(conDefault || (!conDefault && parametronomiLocal.getcodigo()!=null && !parametronomiLocal.getcodigo().equals(""))) {parametronomiBean.setcodigo(parametronomiLocal.getcodigo());}
			if(conDefault || (!conDefault && parametronomiLocal.getnombre()!=null && !parametronomiLocal.getnombre().equals(""))) {parametronomiBean.setnombre(parametronomiLocal.getnombre());}
			if(conDefault || (!conDefault && parametronomiLocal.getvalor()!=null && !parametronomiLocal.getvalor().equals(""))) {parametronomiBean.setvalor(parametronomiLocal.getvalor());}
			if(conDefault || (!conDefault && parametronomiLocal.getdescripcion()!=null && !parametronomiLocal.getdescripcion().equals(""))) {parametronomiBean.setdescripcion(parametronomiLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxParametroNomiGenerico(Long idParametroNomiSeleccionado,JComboBox jComboBoxParametroNomi,List<ParametroNomi> parametronomisLocal)throws Exception {
		try {
			ParametroNomi  parametronomiTemp=null;

			for(ParametroNomi parametronomiAux:parametronomisLocal) {
				if(parametronomiAux.getId()!=null && parametronomiAux.getId().equals(idParametroNomiSeleccionado)) {
					parametronomiTemp=parametronomiAux;
					break;
				}
			}

			jComboBoxParametroNomi.setSelectedItem(parametronomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxParametroNomiGenerico(JComboBox jComboBoxParametroNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxParametroNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxParametroNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxParametroNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxParametroNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxParametroNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametronomi=(ParametroNomi) parametronomiLogic.getParametroNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametronomi =(ParametroNomi) parametronomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!parametronomi.getIsNew() && !parametronomi.getIsChanged() && !parametronomi.getIsDeleted()) {
				sDescripcion=parametronomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=parametronomi.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ParametroNomi parametronomiRow=new ParametroNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametronomiRow=(ParametroNomi) parametronomiLogic.getParametroNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			parametronomiRow=(ParametroNomi) parametronomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualParametroNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoParametroNomi.setVisible((this.isVisibilidadCeldaNuevoParametroNomi && this.isPermisoNuevoParametroNomi));			
			this.jButtonDuplicarParametroNomi.setVisible((this.isVisibilidadCeldaDuplicarParametroNomi && this.isPermisoDuplicarParametroNomi));			
			this.jButtonCopiarParametroNomi.setVisible((this.isVisibilidadCeldaCopiarParametroNomi && this.isPermisoCopiarParametroNomi));
			this.jButtonVerFormParametroNomi.setVisible((this.isVisibilidadCeldaVerFormParametroNomi && this.isPermisoVerFormParametroNomi));
			
			this.jButtonAbrirOrderByParametroNomi.setVisible((this.isVisibilidadCeldaOrdenParametroNomi && this.isPermisoOrdenParametroNomi));			
			
			this.jButtonNuevoRelacionesParametroNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroNomi && this.isPermisoNuevoParametroNomi));			
			this.jButtonNuevoGuardarCambiosParametroNomi.setVisible((this.isVisibilidadCeldaNuevoParametroNomi && this.isPermisoNuevoParametroNomi && this.isPermisoGuardarCambiosParametroNomi));
			
			if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonModificarParametroNomi.setVisible((this.isVisibilidadCeldaModificarParametroNomi && this.isPermisoActualizarParametroNomi));	
			this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarParametroNomi.setVisible((this.isVisibilidadCeldaActualizarParametroNomi && this.isPermisoActualizarParametroNomi));	
			this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarParametroNomi.setVisible((this.isVisibilidadCeldaEliminarParametroNomi && this.isPermisoEliminarParametroNomi));
			this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarParametroNomi.setVisible(this.isVisibilidadCeldaCancelarParametroNomi);							
			this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosParametroNomi.setVisible((this.isVisibilidadCeldaGuardarParametroNomi && this.isPermisoGuardarCambiosParametroNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaParametroNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroNomi && this.isPermisoGuardarCambiosParametroNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarParametroNomi.setVisible((this.isVisibilidadCeldaNuevoParametroNomi && this.isPermisoNuevoParametroNomi));						
			this.jButtonDuplicarToolBarParametroNomi.setVisible((this.isVisibilidadCeldaDuplicarParametroNomi && this.isPermisoDuplicarParametroNomi));						
			this.jButtonCopiarToolBarParametroNomi.setVisible((this.isVisibilidadCeldaCopiarParametroNomi && this.isPermisoCopiarParametroNomi));			
			this.jButtonVerFormToolBarParametroNomi.setVisible((this.isVisibilidadCeldaVerFormParametroNomi && this.isPermisoVerFormParametroNomi));			
			this.jButtonAbrirOrderByToolBarParametroNomi.setVisible((this.isVisibilidadCeldaOrdenParametroNomi && this.isPermisoOrdenParametroNomi));
			this.jButtonNuevoRelacionesToolBarParametroNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroNomi && this.isPermisoNuevoParametroNomi));			
			this.jButtonNuevoGuardarCambiosToolBarParametroNomi.setVisible((this.isVisibilidadCeldaNuevoParametroNomi && this.isPermisoNuevoParametroNomi && this.isPermisoGuardarCambiosParametroNomi));			
			
			if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonModificarToolBarParametroNomi.setVisible((this.isVisibilidadCeldaModificarParametroNomi && this.isPermisoActualizarParametroNomi));	
			this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarToolBarParametroNomi.setVisible((this.isVisibilidadCeldaActualizarParametroNomi  && this.isPermisoActualizarParametroNomi));	
			this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarToolBarParametroNomi.setVisible((this.isVisibilidadCeldaEliminarParametroNomi && this.isPermisoEliminarParametroNomi));
			this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarToolBarParametroNomi.setVisible(this.isVisibilidadCeldaCancelarParametroNomi);				
			this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosToolBarParametroNomi.setVisible((this.isVisibilidadCeldaGuardarParametroNomi && this.isPermisoGuardarCambiosParametroNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarParametroNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroNomi && this.isPermisoGuardarCambiosParametroNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoParametroNomi.setVisible((this.isVisibilidadCeldaNuevoParametroNomi && this.isPermisoNuevoParametroNomi));			
			this.jMenuItemDuplicarParametroNomi.setVisible((this.isVisibilidadCeldaDuplicarParametroNomi && this.isPermisoDuplicarParametroNomi));			
			this.jMenuItemCopiarParametroNomi.setVisible((this.isVisibilidadCeldaCopiarParametroNomi && this.isPermisoCopiarParametroNomi));			
			this.jMenuItemVerFormParametroNomi.setVisible((this.isVisibilidadCeldaVerFormParametroNomi && this.isPermisoVerFormParametroNomi));			
			this.jMenuItemAbrirOrderByParametroNomi.setVisible((this.isVisibilidadCeldaOrdenParametroNomi && this.isPermisoOrdenParametroNomi));			
			//this.jMenuItemMostrarOcultarParametroNomi.setVisible((this.isVisibilidadCeldaOrdenParametroNomi && this.isPermisoOrdenParametroNomi));
			this.jMenuItemDetalleAbrirOrderByParametroNomi.setVisible((this.isVisibilidadCeldaOrdenParametroNomi && this.isPermisoOrdenParametroNomi));			
			//this.jMenuItemDetalleMostrarOcultarParametroNomi.setVisible((this.isVisibilidadCeldaOrdenParametroNomi && this.isPermisoOrdenParametroNomi));			
			this.jMenuItemNuevoRelacionesParametroNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesParametroNomi && this.isPermisoNuevoParametroNomi));			
			this.jMenuItemNuevoGuardarCambiosParametroNomi.setVisible((this.isVisibilidadCeldaNuevoParametroNomi && this.isPermisoNuevoParametroNomi && this.isPermisoGuardarCambiosParametroNomi));									
			
			if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemModificarParametroNomi.setVisible((this.isVisibilidadCeldaModificarParametroNomi && this.isPermisoActualizarParametroNomi));	
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemActualizarParametroNomi.setVisible((this.isVisibilidadCeldaActualizarParametroNomi && this.isPermisoActualizarParametroNomi));	
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemEliminarParametroNomi.setVisible((this.isVisibilidadCeldaEliminarParametroNomi && this.isPermisoEliminarParametroNomi));
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemCancelarParametroNomi.setVisible(this.isVisibilidadCeldaCancelarParametroNomi);				
			}
			
			this.jMenuItemGuardarCambiosParametroNomi.setVisible((this.isVisibilidadCeldaGuardarParametroNomi && this.isPermisoGuardarCambiosParametroNomi));						
			this.jMenuItemGuardarCambiosTablaParametroNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosParametroNomi && this.isPermisoGuardarCambiosParametroNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoParametroNomi=this.jButtonNuevoParametroNomi.isVisible();
			this.isVisibilidadCeldaDuplicarParametroNomi=this.jButtonDuplicarParametroNomi.isVisible();
			this.isVisibilidadCeldaCopiarParametroNomi=this.jButtonCopiarParametroNomi.isVisible();
			this.isVisibilidadCeldaVerFormParametroNomi=this.jButtonVerFormParametroNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenParametroNomi=this.jButtonAbrirOrderByParametroNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=this.jButtonNuevoRelacionesParametroNomi.isVisible();
			this.isVisibilidadCeldaModificarParametroNomi=this.jButtonModificarParametroNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			this.isVisibilidadCeldaActualizarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarParametroNomi.isVisible();
			this.isVisibilidadCeldaEliminarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarParametroNomi.isVisible();
			this.isVisibilidadCeldaCancelarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarParametroNomi.isVisible();
			this.isVisibilidadCeldaGuardarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosParametroNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=this.jButtonGuardarCambiosTablaParametroNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoParametroNomi=this.jButtonNuevoToolBarParametroNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=this.jButtonNuevoRelacionesToolBarParametroNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			this.isVisibilidadCeldaModificarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jButtonModificarToolBarParametroNomi.isVisible();
			this.isVisibilidadCeldaActualizarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarToolBarParametroNomi.isVisible();
			this.isVisibilidadCeldaEliminarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarToolBarParametroNomi.isVisible();
			this.isVisibilidadCeldaCancelarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarToolBarParametroNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroNomi=this.jButtonGuardarCambiosToolBarParametroNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=this.jButtonGuardarCambiosTablaToolBarParametroNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoParametroNomi=this.jMenuItemNuevoParametroNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=this.jMenuItemNuevoRelacionesParametroNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			this.isVisibilidadCeldaModificarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jMenuItemModificarParametroNomi.isVisible();
			this.isVisibilidadCeldaActualizarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jMenuItemActualizarParametroNomi.isVisible();
			this.isVisibilidadCeldaEliminarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jMenuItemEliminarParametroNomi.isVisible();
			this.isVisibilidadCeldaCancelarParametroNomi=this.jInternalFrameDetalleFormParametroNomi.jMenuItemCancelarParametroNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarParametroNomi=this.jMenuItemGuardarCambiosParametroNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=this.jMenuItemGuardarCambiosTablaParametroNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesParametroNomi(Boolean esInicializar) {
		if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
				//if(this.parametronomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesParametroNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualParametroNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualParametroNomi() {
		this.jButtonNuevoParametroNomi.setVisible(this.isPermisoNuevoParametroNomi);			
		this.jButtonDuplicarParametroNomi.setVisible(this.isPermisoDuplicarParametroNomi);			
		this.jButtonCopiarParametroNomi.setVisible(this.isPermisoCopiarParametroNomi);			
		this.jButtonVerFormParametroNomi.setVisible(this.isPermisoVerFormParametroNomi);			
		
		this.jButtonAbrirOrderByParametroNomi.setVisible(this.isPermisoOrdenParametroNomi);					
		
		this.jButtonNuevoRelacionesParametroNomi.setVisible(this.isPermisoNuevoParametroNomi);			
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonModificarParametroNomi.setVisible(this.isPermisoActualizarParametroNomi);	
			this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarParametroNomi.setVisible(this.isPermisoActualizarParametroNomi);	
			this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarParametroNomi.setVisible(this.isPermisoEliminarParametroNomi);
			this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarParametroNomi.setVisible(this.isVisibilidadCeldaCancelarParametroNomi);						
			this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosParametroNomi.setVisible(this.isPermisoGuardarCambiosParametroNomi);							
		}
		
		this.jButtonGuardarCambiosTablaParametroNomi.setVisible(this.isPermisoActualizarParametroNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroNomi() {
		this.jInternalFrameDetalleFormParametroNomi.jButtonModificarParametroNomi.setVisible(this.isPermisoActualizarParametroNomi);	
		this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarParametroNomi.setVisible(this.isPermisoActualizarParametroNomi);	
		this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarParametroNomi.setVisible(this.isPermisoEliminarParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarParametroNomi.setVisible(this.isVisibilidadCeldaCancelarParametroNomi);							
		this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosParametroNomi.setVisible((this.isVisibilidadCeldaGuardarParametroNomi && this.isPermisoGuardarCambiosParametroNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosParametroNomi() {
		if(ParametroNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualParametroNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesParametroNomi() {
	}
	
	public void jTableDatosParametroNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarParametroNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidParametroNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroNomi(this.getparametronomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametronomi==null) {
						this.parametronomi = new ParametroNomi();
					}

					this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
				}

				if(this.parametronomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.parametronomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaParametroNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebParametroNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosParametroNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosParametroNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualParametroNomi(this.getparametronomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.parametronomiLogic.getConnexion());

				if(this.parametronomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.parametronomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderParametroNomi=(TitledBorder)this.jScrollPanelDatosParametroNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderParametroNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaParametroNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroNomi(this.getparametronomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametronomi==null) {
						this.parametronomi = new ParametroNomi();
					}

					this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
				}

				if(this.parametronomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.parametronomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoParametroNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroNomi(this.getparametronomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametronomi==null) {
						this.parametronomi = new ParametroNomi();
					}

					this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
				}

				if(this.parametronomi.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.parametronomi.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreParametroNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroNomi(this.getparametronomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametronomi==null) {
						this.parametronomi = new ParametroNomi();
					}

					this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
				}

				if(this.parametronomi.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.parametronomi.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorParametroNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroNomi(this.getparametronomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametronomi==null) {
						this.parametronomi = new ParametroNomi();
					}

					this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
				}

				if(this.parametronomi.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor like '%"+this.parametronomi.getvalor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionParametroNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualParametroNomi(this.getparametronomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.parametronomi==null) {
						this.parametronomi = new ParametroNomi();
					}

					this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);
				}

				if(this.parametronomi.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.parametronomi.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingParametroNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaParametroNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingParametroNomi(false,false);

			this.getParametroNomisFK_IdEmpresa();

			this.inicializarActualizarBindingParametroNomi(false);

			//if(ParametroNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingParametroNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.parametronomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameParametroNomi() {
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
			this.jInternalFrameDetalleFormParametroNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormParametroNomi.dispose();
			this.jInternalFrameDetalleFormParametroNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
			this.jInternalFrameReporteDinamicoParametroNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoParametroNomi.dispose();
			this.jInternalFrameReporteDinamicoParametroNomi=null;
		}
		
		if(this.jInternalFrameImportacionParametroNomi!=null) {
			this.jInternalFrameImportacionParametroNomi.setVisible(false);	    			
			this.jInternalFrameImportacionParametroNomi.dispose();
			this.jInternalFrameImportacionParametroNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessParametroNomi();
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoParametroNomi")) {
				jButtonNuevoParametroNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarParametroNomi")) {
				jButtonDuplicarParametroNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarParametroNomi")) {
				jButtonCopiarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormParametroNomi")) {
				jButtonVerFormParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarParametroNomi")) {
				jButtonNuevoParametroNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarParametroNomi")) {
				jButtonDuplicarParametroNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoParametroNomi")) {
				jButtonNuevoParametroNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarParametroNomi")) {
				jButtonDuplicarParametroNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesParametroNomi")) {
				jButtonNuevoParametroNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarParametroNomi")) {
				jButtonNuevoParametroNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesParametroNomi")) {
				jButtonNuevoParametroNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarParametroNomi")) {
				jButtonModificarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarParametroNomi")) {
				jButtonModificarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarParametroNomi")) {
				jButtonModificarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarParametroNomi")) {
				jButtonActualizarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarParametroNomi")) {
				jButtonActualizarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarParametroNomi")) {
				jButtonActualizarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarParametroNomi")) {
				jButtonEliminarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarParametroNomi")) {
				jButtonEliminarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarParametroNomi")) {
				jButtonEliminarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarParametroNomi")) {
				jButtonCancelarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarParametroNomi")) {
				jButtonCancelarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarParametroNomi")) {
				jButtonCancelarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarParametroNomi")) {
				jButtonCerrarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarParametroNomi")) {
				jButtonCerrarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarParametroNomi")) {
				jButtonCerrarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarParametroNomi")) {
				jButtonMostrarOcultarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarParametroNomi")) {
				jButtonCancelarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosParametroNomi")) {
				jButtonGuardarCambiosParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarParametroNomi")) {
				jButtonGuardarCambiosParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarParametroNomi")) {
				jButtonCopiarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarParametroNomi")) {
				jButtonVerFormParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosParametroNomi")) {
				jButtonGuardarCambiosParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarParametroNomi")) {
				jButtonCopiarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormParametroNomi")) {
				jButtonVerFormParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaParametroNomi")) {
				jButtonGuardarCambiosParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarParametroNomi")) {
				jButtonGuardarCambiosParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaParametroNomi")) {
				jButtonGuardarCambiosParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionParametroNomi")) {
				jButtonRecargarInformacionParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarParametroNomi")) {
				jButtonRecargarInformacionParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionParametroNomi")) {
				jButtonRecargarInformacionParametroNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresParametroNomi")) {
				jButtonAnterioresParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarParametroNomi")) {
				jButtonAnterioresParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreParametroNomi")) {
				jButtonAnterioresParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesParametroNomi")) {
				jButtonSiguientesParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarParametroNomi")) {
				jButtonSiguientesParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesParametroNomi")) {
				jButtonSiguientesParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByParametroNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByParametroNomi")) {
				jButtonAbrirOrderByParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarParametroNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarParametroNomi")) {
				jButtonMostrarOcultarParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosParametroNomi")) {
				jButtonNuevoGuardarCambiosParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarParametroNomi")) {
				jButtonNuevoGuardarCambiosParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosParametroNomi")) {
				jButtonNuevoGuardarCambiosParametroNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoParametroNomi")) {
				jButtonCerrarReporteDinamicoParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoParametroNomi")) {
				jButtonGenerarReporteDinamicoParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoParametroNomi")) {
				
				jButtonGenerarExcelReporteDinamicoParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionParametroNomi")) {
				jButtonCerrarImportacionParametroNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionParametroNomi")) {
				
				jButtonGenerarImportacionParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionParametroNomi")) {
				
				jButtonAbrirImportacionParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesParametroNomi")) {
				jComboBoxTiposAccionesParametroNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesParametroNomi")) {
				jComboBoxTiposRelacionesParametroNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioParametroNomi")) {
				jComboBoxTiposAccionesParametroNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarParametroNomi")) {
				
				jComboBoxTiposSeleccionarParametroNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralParametroNomi")) {
				jTextFieldValorCampoGeneralParametroNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByParametroNomi")) {
				jButtonAbrirOrderByParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarParametroNomi")) {
				jButtonAbrirOrderByParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByParametroNomi")) {
				jButtonCerrarOrderByParametroNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroNomiBusqueda")) {
				this.jButtonidParametroNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroNomiUpdate")) {
				this.jButtonid_empresaParametroNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroNomiBusqueda")) {
				this.jButtonid_empresaParametroNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParametroNomiBusqueda")) {
				this.jButtoncodigoParametroNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreParametroNomiBusqueda")) {
				this.jButtonnombreParametroNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorParametroNomiBusqueda")) {
				this.jButtonvalorParametroNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroNomiBusqueda")) {
				this.jButtondescripcionParametroNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessParametroNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				


				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ParametroNomi parametronomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				parametronomiLocal=this.parametronomi;
			} else {
				parametronomiLocal=this.parametronomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
							
				
				


				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
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
			
			


			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
								
						
				


				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
								
				
				


				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
							
				
				


				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametronomiAnterior =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametronomiAnterior =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
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
			
			


			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
								
				
				


				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosParametroNomi")) {
					jCheckBoxSeleccionarTodosParametroNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosParametroNomi")) {
					jCheckBoxSeleccionadosParametroNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarParametroNomi")) {
					
				}
				
				


				
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
												
				
				


				
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.parametronomiAnterior =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.parametronomiAnterior =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
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
			
			


			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaParametroNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.parametronomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.parametronomi);
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
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
				
				


				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ParametroNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ParametroNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaParametroNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.parametronomiAnterior =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarParametroNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosParametroNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosParametroNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.parametronomi =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.parametronomi =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.parametronomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarParametroNomi")) {
				
				}
				
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarParametroNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosParametroNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarParametroNomi")) {
			
			}
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessParametroNomi();
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
			if(sTipo.equals("NuevoParametroNomi")) {
				jButtonNuevoParametroNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarParametroNomi")) {
				jButtonDuplicarParametroNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarParametroNomi")) {
				jButtonCopiarParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormParametroNomi")) {
				jButtonVerFormParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesParametroNomi")) {
				jButtonNuevoParametroNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarParametroNomi")) {
				jButtonModificarParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarParametroNomi")) {
				jButtonActualizarParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarParametroNomi")) {
				jButtonEliminarParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaParametroNomi")) {
				jButtonGuardarCambiosParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarParametroNomi")) {
				jButtonCancelarParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarParametroNomi")) {
				jButtonCerrarParametroNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosParametroNomi")) {
				jButtonGuardarCambiosParametroNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosParametroNomi")) {
				jButtonNuevoGuardarCambiosParametroNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByParametroNomi")) {
				jButtonAbrirOrderByParametroNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionParametroNomi")) {
				jButtonRecargarInformacionParametroNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresParametroNomi")) {
				jButtonAnterioresParametroNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesParametroNomi")) {
				jButtonSiguientesParametroNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idParametroNomiBusqueda")) {
				this.jButtonidParametroNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaParametroNomiUpdate")) {
				this.jButtonid_empresaParametroNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaParametroNomiBusqueda")) {
				this.jButtonid_empresaParametroNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoParametroNomiBusqueda")) {
				this.jButtoncodigoParametroNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreParametroNomiBusqueda")) {
				this.jButtonnombreParametroNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorParametroNomiBusqueda")) {
				this.jButtonvalorParametroNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionParametroNomiBusqueda")) {
				this.jButtondescripcionParametroNomiBusquedaActionPerformed(evt);
			}
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessParametroNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameParametroNomi")) {
				closingInternalFrameParametroNomi();
				
			} else if(sTipo.equals("jButtonCancelarParametroNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormParametroNomi = (JInternalFrameBase)evt.getSource();
	            	
	            ParametroNomiBeanSwingJInternalFrame jInternalFrameParent=(ParametroNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarParametroNomiActionPerformed(null);
			}
			
			ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.parametronomi,new Object(),this.parametronomiParameterGeneral,this.parametronomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormParametroNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormParametroNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormParametroNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.parametronomi)) {
			if(!esControlTabla) {
				if(ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);			
				}
				
				if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualParametroNomi(this.parametronomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametronomiReturnGeneral=parametronomiLogic.procesarEventosParametroNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametronomiLogic.getParametroNomis(),this.parametronomi,this.parametronomiParameterGeneral,this.isEsNuevoParametroNomi,classes);//this.parametronomiLogic.getParametroNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanParametroNomi(this.parametronomiReturnGeneral,this.parametronomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanParametroNomi(classes,this.parametronomiReturnGeneral,this.parametronomiBean,false);
					}
						
					if(this.parametronomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyParametroNomi(this.parametronomiReturnGeneral.getParametroNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioParametroNomi(this.parametronomiReturnGeneral.getParametroNomi());	
					}
						
					if(this.parametronomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioParametroNomi(this.parametronomiReturnGeneral.getParametroNomi(),classes);//this.parametronomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioParametroNomi(this.parametronomi,classes);//this.parametronomiBean);									
				}
			
				if(ParametroNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualParametroNomi(this.parametronomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysParametroNomi(this.parametronomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.parametronomiAnterior!=null) {
						this.parametronomi=this.parametronomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.parametronomiReturnGeneral=parametronomiLogic.procesarEventosParametroNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametronomiLogic.getParametroNomis(),this.parametronomi,this.parametronomiParameterGeneral,this.isEsNuevoParametroNomi,classes);//this.parametronomiLogic.getParametroNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.parametronomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.parametronomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.parametronomiReturnGeneral.getParametroNomi(),parametronomiLogic.getParametroNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.parametronomiReturnGeneral.getParametroNomi(),this.parametronomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosParametroNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosParametroNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosParametroNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosParametroNomi() throws Exception {
		
		ParametroNomiModel parametronomiModel=(ParametroNomiModel)this.jTableDatosParametroNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			parametronomiModel.parametronomis=this.parametronomiLogic.getParametroNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			parametronomiModel.parametronomis=this.parametronomis;
		}
		
		
		((ParametroNomiModel) this.jTableDatosParametroNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaParametroNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getparametronomiAnterior(),this.parametronomiLogic.getParametroNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getparametronomiAnterior(),this.parametronomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosParametroNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioParametroNomi(ParametroNomi parametronomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
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
										
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametronomi,new Object(),generalEntityParameterGeneral,this.parametronomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.parametronomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ParametroNomiConstantesFunciones.getClassesRelationshipsOfParametroNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ParametroNomiConstantesFunciones.getClassesRelationshipsFromStringsOfParametroNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormParametroNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ParametroNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.parametronomi,new Object(),generalEntityParameterGeneral,this.parametronomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioParametroNomi(ParametroNomiBean parametronomiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanParametroNomi(ArrayList<Classe> classes,ParametroNomiReturnGeneral parametronomiReturnGeneral,ParametroNomiBean parametronomiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualParametroNomi(ParametroNomi parametronomi,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.parametronomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormParametroNomi = new ParametroNomiDetalleFormJInternalFrame(jDesktopPane,this.parametronomiSessionBean.getConGuardarRelaciones(),this.parametronomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.setVisible(false);
		this.jInternalFrameDetalleFormParametroNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormParametroNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormParametroNomi.parametronomiLogic=this.parametronomiLogic;
		
		this.cargarCombosFrameForeignKeyParametroNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleParametroNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleParametroNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyParametroNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyParametroNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormParametroNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroNomi"));
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonModificarParametroNomi.addActionListener(new ButtonActionListener(this,"ModificarParametroNomi"));

		
		this.jInternalFrameDetalleFormParametroNomi.jButtonModificarToolBarParametroNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroNomi"));
					
		this.jInternalFrameDetalleFormParametroNomi.jMenuItemModificarParametroNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroNomi"));		
		
		
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarParametroNomi.addActionListener (new ButtonActionListener(this,"ActualizarParametroNomi"));
		
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarToolBarParametroNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroNomi"));
						
		this.jInternalFrameDetalleFormParametroNomi.jMenuItemActualizarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroNomi"));		
		
		
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarParametroNomi.addActionListener (new ButtonActionListener(this,"EliminarParametroNomi"));
		
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroNomi"));
								
		this.jInternalFrameDetalleFormParametroNomi.jMenuItemEliminarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroNomi"));		
		
		
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarParametroNomi.addActionListener (new ButtonActionListener(this,"CancelarParametroNomi"));
		
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroNomi"));
					
		this.jInternalFrameDetalleFormParametroNomi.jMenuItemCancelarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormParametroNomi.jMenuItemDetalleCerrarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroNomi"));		
		
		
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroNomi"));
		
		
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroNomi"));
		
		
		
		this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonidParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"idParametroNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroNomi.jButtonid_empresaParametroNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonid_empresaParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtoncodigoParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonnombreParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonvalorParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtondescripcionParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameParametroNomi"));
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarParametroNomi"));
		}
		
		this.jTableDatosParametroNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarParametroNomi"));
		
		this.jTableDatosParametroNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarParametroNomi"));
		
		this.jButtonNuevoParametroNomi.addActionListener(new ButtonActionListener(this,"NuevoParametroNomi"));
		
		this.jButtonDuplicarParametroNomi.addActionListener(new ButtonActionListener(this,"DuplicarParametroNomi"));
		
		this.jButtonCopiarParametroNomi.addActionListener(new ButtonActionListener(this,"CopiarParametroNomi"));
		
		this.jButtonVerFormParametroNomi.addActionListener(new ButtonActionListener(this,"VerFormParametroNomi"));
		
		
		this.jButtonNuevoToolBarParametroNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarParametroNomi"));
			
		this.jButtonDuplicarToolBarParametroNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarParametroNomi"));
			
		this.jMenuItemNuevoParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoParametroNomi"));
			
		this.jMenuItemDuplicarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarParametroNomi"));		
		
		
		this.jButtonNuevoRelacionesParametroNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesParametroNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarParametroNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarParametroNomi"));
			
		this.jMenuItemNuevoRelacionesParametroNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesParametroNomi"));		
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonModificarParametroNomi.addActionListener(new ButtonActionListener(this,"ModificarParametroNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonModificarToolBarParametroNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarParametroNomi"));
			
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemModificarParametroNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarParametroNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarParametroNomi.addActionListener (new ButtonActionListener(this,"ActualizarParametroNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonActualizarToolBarParametroNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarParametroNomi"));
				
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemActualizarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarParametroNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarParametroNomi.addActionListener (new ButtonActionListener(this,"EliminarParametroNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonEliminarToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarParametroNomi"));
						
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemEliminarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarParametroNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarParametroNomi.addActionListener (new ButtonActionListener(this,"CancelarParametroNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonCancelarToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarParametroNomi"));
			
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemCancelarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarParametroNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarParametroNomi"));		
		
		
		this.jButtonCerrarParametroNomi.addActionListener (new ButtonActionListener(this,"CerrarParametroNomi"));
		
		
		this.jButtonCerrarToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarParametroNomi"));
			
		this.jMenuItemCerrarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarParametroNomi"));
			
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jMenuItemDetalleCerrarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarParametroNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosParametroNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosParametroNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarParametroNomi"));
		}
		
		this.jButtonCopiarToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarParametroNomi"));
			
		this.jButtonVerFormToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarParametroNomi"));
		
		this.jMenuItemGuardarCambiosParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosParametroNomi"));
			
		this.jMenuItemCopiarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarParametroNomi"));		
		
		this.jMenuItemVerFormParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormParametroNomi"));		
		
		
		this.jButtonGuardarCambiosTablaParametroNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarParametroNomi"));
			
		this.jMenuItemGuardarCambiosTablaParametroNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaParametroNomi"));		
		
		
		
		this.jButtonRecargarInformacionParametroNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionParametroNomi"));
					
		this.jButtonRecargarInformacionToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarParametroNomi"));
		
		this.jMenuItemRecargarInformacionParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionParametroNomi"));		
		
		
		
		this.jButtonAnterioresParametroNomi.addActionListener (new ButtonActionListener(this,"AnterioresParametroNomi"));
		
		
		this.jButtonAnterioresToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarParametroNomi"));
		
		this.jMenuItemAnterioresParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresParametroNomi"));		
		
		
		this.jButtonSiguientesParametroNomi.addActionListener (new ButtonActionListener(this,"SiguientesParametroNomi"));
		
		
		this.jButtonSiguientesToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarParametroNomi"));
			
		this.jMenuItemSiguientesParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesParametroNomi"));
			
		this.jMenuItemAbrirOrderByParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByParametroNomi"));
			
		this.jMenuItemMostrarOcultarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarParametroNomi"));
			
		this.jMenuItemDetalleAbrirOrderByParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByParametroNomi"));
			
		this.jMenuItemDetalleMostarOcultarParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarParametroNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosParametroNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosParametroNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarParametroNomi"));
			
		this.jMenuItemNuevoGuardarCambiosParametroNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosParametroNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosParametroNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosParametroNomi"));

		this.jCheckBoxSeleccionadosParametroNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosParametroNomi"));
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioParametroNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesParametroNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesParametroNomi"));
			
		this.jComboBoxTiposAccionesParametroNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesParametroNomi"));
					
		this.jComboBoxTiposSeleccionarParametroNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarParametroNomi"));
			
		this.jTextFieldValorCampoGeneralParametroNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralParametroNomi"));		
		
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonidParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"idParametroNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroNomi.jButtonid_empresaParametroNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonid_empresaParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtoncodigoParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonnombreParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonvalorParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtondescripcionParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoParametroNomi!=null) {
				this.jInternalFrameReporteDinamicoParametroNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroNomi"));
				this.jInternalFrameReporteDinamicoParametroNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroNomi"));
				this.jInternalFrameReporteDinamicoParametroNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoParametroNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoParametroNomi"));				
			//this.jButtonGenerarReporteDinamicoParametroNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoParametroNomi"));
			//this.jButtonGenerarExcelReporteDinamicoParametroNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoParametroNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionParametroNomi!=null) {
				this.jInternalFrameImportacionParametroNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionParametroNomi"));
				this.jInternalFrameImportacionParametroNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionParametroNomi"));
				this.jInternalFrameImportacionParametroNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionParametroNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByParametroNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByParametroNomi"));
			
			this.jButtonAbrirOrderByToolBarParametroNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarParametroNomi"));			
			
			if(this.jInternalFrameOrderByParametroNomi!=null) {
				this.jInternalFrameOrderByParametroNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByParametroNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormParametroNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormParametroNomi.jTabbedPaneRelacionesParametroNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesParametroNomi"));
		
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
            		closingInternalFrameParametroNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormParametroNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormParametroNomi = (JInternalFrameBase)event.getSource();
	            	
	            ParametroNomiBeanSwingJInternalFrame jInternalFrameParent=(ParametroNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormParametroNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarParametroNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosParametroNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosParametroNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosParametroNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosParametroNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoParametroNomi";
		inputMap = this.jButtonNuevoParametroNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoParametroNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoParametroNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesParametroNomi";
		inputMap = this.jButtonNuevoRelacionesParametroNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesParametroNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoParametroNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarParametroNomi";
		inputMap = this.jButtonModificarParametroNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarParametroNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarParametroNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarParametroNomi";
		inputMap = this.jButtonActualizarParametroNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarParametroNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarParametroNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarParametroNomi";
		inputMap = this.jButtonEliminarParametroNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarParametroNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarParametroNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarParametroNomi";
		inputMap = this.jButtonCancelarParametroNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarParametroNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarParametroNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarParametroNomi";
		inputMap = this.jButtonCerrarParametroNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarParametroNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarParametroNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosParametroNomi";
		inputMap = this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosParametroNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormParametroNomi.jButtonGuardarCambiosParametroNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosParametroNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosParametroNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosParametroNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesParametroNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesParametroNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarParametroNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarParametroNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralParametroNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralParametroNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonidParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"idParametroNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormParametroNomi.jButtonid_empresaParametroNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaParametroNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonid_empresaParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtoncodigoParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"codigoParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonnombreParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"nombreParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtonvalorParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorParametroNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormParametroNomi.jButtondescripcionParametroNomiBusqueda.addActionListener(new ButtonActionListener(this,"descripcionParametroNomiBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionParametroNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionParametroNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarParametroNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarParametroNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosParametroNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
					parametronomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroNomi parametronomiAux:parametronomis) {
					parametronomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosParametroNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
						parametronomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroNomi parametronomiAux:parametronomis) {
						parametronomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroNomi parametronomiAux:parametronomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaParametroNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosParametroNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingParametroNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosParametroNomi.getSelectedRows();
			
			ParametroNomi parametronomiLocal=new ParametroNomi();
			
			//this.seleccionarTodosParametroNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					parametronomiLocal =(ParametroNomi) this.parametronomiLogic.getParametroNomis().toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					parametronomiLocal =(ParametroNomi) this.parametronomis.toArray()[this.jTableDatosParametroNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				parametronomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
						parametronomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ParametroNomi parametronomiAux:parametronomis) {
						parametronomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaParametroNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosParametroNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosParametroNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosParametroNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualParametroNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarParametroNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralParametroNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingParametroNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralParametroNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ParametroNomi parametronomiAux:this.parametronomiLogic.getParametroNomis()) {
				
						if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							parametronomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							parametronomiAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							parametronomiAux.setvalor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametronomiAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroNomi parametronomiAux:parametronomis) {
					
						if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							parametronomiAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							parametronomiAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							parametronomiAux.setvalor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							parametronomiAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaParametroNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesParametroNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingParametroNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioParametroNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesParametroNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteParametroNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessParametroNomi(conSplash);
				
					this.generarReporteParametroNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoParametroNomisSeleccionados();
				//this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoParametroNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroNomi();
				
				this.exportarParametroNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionParametroNomis();
				//this.importarParametroNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessParametroNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelParametroNomisSeleccionados();
				//this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Parametro Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessParametroNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoParametroNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyParametroNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(ParametroNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteParametroNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessParametroNomi(conSplash);
					
						//this.actualizarParametrosGeneralParametroNomi();
						
						this.generarReporteProcesoAccionParametroNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ParametroNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Parametro NomiS SELECCIONADOS?", "MANTENIMIENTO DE Parametro Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessParametroNomi();
				
						this.actualizarParametrosGeneralParametroNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.parametronomiReturnGeneral=parametronomiLogic.procesarAccionParametroNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.parametronomiLogic.getParametroNomis(),this.parametronomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarParametroNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralParametroNomi();
					
					ParametroNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarParametroNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesParametroNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormParametroNomi.jComboBoxTiposAccionesFormularioParametroNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessParametroNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesParametroNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessParametroNomi();
			
			if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		
			ParametroNomi parametronomi=new ParametroNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingParametroNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesParametroNomi.getSelectedItem();
			
			
			
			
			parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(parametronomisSeleccionados.size()==1) {
				for(ParametroNomi parametronomiAux:parametronomisSeleccionados) {
					parametronomi=parametronomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessParametroNomi();
			
      		//this.finishProcessParametroNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarParametroNomiReturnGeneral() throws Exception {
		if(this.parametronomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.parametronomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.parametronomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.parametronomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.parametronomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.parametronomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingParametroNomi(false);
		}
		
		if(this.parametronomiReturnGeneral.getConRetornoLista() || this.parametronomiReturnGeneral.getConRetornoObjeto()) {
			if(this.parametronomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametronomiLogic.setParametroNomis(this.parametronomiReturnGeneral.getParametroNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.parametronomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.parametronomiLogic.setParametroNomi(this.parametronomiReturnGeneral.getParametroNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingParametroNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralParametroNomi() throws Exception {
		
		
	}
	
	public ArrayList<ParametroNomi> getParametroNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioParametroNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ParametroNomi parametronomiAux:parametronomiLogic.getParametroNomis()) {
					if(parametronomiAux.getIsSelected()) {
						parametronomisSeleccionados.add(parametronomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ParametroNomi parametronomiAux:this.parametronomis) {
					if(parametronomiAux.getIsSelected()) {
						parametronomisSeleccionados.add(parametronomiAux);				
					}
				}
			}
			
			if(parametronomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						parametronomisSeleccionados.addAll(this.parametronomiLogic.getParametroNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						parametronomisSeleccionados.addAll(this.parametronomis);				
					}
				}
			}
		} else {
			parametronomisSeleccionados.add(this.parametronomi);
		}
		
		return parametronomisSeleccionados;
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
	
	public void generarReporteParametroNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalParametroNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoParametroNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoParametroNomisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Parametro Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesParametroNomisSeleccionados() throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteParametroNomis("Todos",parametronomisSeleccionados);
		
	}	
	
	public void generarReporteNormalParametroNomisSeleccionados() throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteParametroNomis("Todos",parametronomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionParametroNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteParametroNomis("Todos",parametronomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoParametroNomisSeleccionados() throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoParametroNomi();
		
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoParametroNomi();
		
		
		//this.generarReporteParametroNomis("Todos",parametronomisSeleccionados ,parametronomiImplementable,parametronomiImplementableHome);
	}
	
	public void mostrarImportacionParametroNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionParametroNomi();
		
		this.abrirFrameImportacionParametroNomi();		
		
			
		//this.generarReporteParametroNomis("Todos",parametronomisSeleccionados ,parametronomiImplementable,parametronomiImplementableHome);
	}
	
	public void importarParametroNomis() throws Exception {		
	
	}
	
	public void exportarParametroNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelParametroNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoParametroNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlParametroNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Parametro Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoParametroNomisSeleccionados() throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametronomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarParametroNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ParametroNomi parametronomiAux:parametronomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarParametroNomi(parametronomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//parametronomiAux.setsDetalleGeneralEntityReporte(parametronomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarParametroNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ParametroNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroNomiConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroNomiConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroNomiConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ParametroNomiConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarParametroNomi(ParametroNomi parametronomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=parametronomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=parametronomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametronomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametronomi.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametronomi.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametronomi.getvalor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=parametronomi.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelParametroNomisSeleccionados() throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametronomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ParametroNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelParametroNomi(row);				
				iRow++;
			}				
			
			for(ParametroNomi parametronomiAux:parametronomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelParametroNomi(parametronomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlParametroNomisSeleccionados() throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();		
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"parametronomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("parametronomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("parametronomi");
			//elementRoot.appendChild(element);
		
			for(ParametroNomi parametronomiAux:parametronomisSeleccionados) {
				element = document.createElement("parametronomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlParametroNomi(parametronomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Parametro Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelParametroNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ParametroNomiConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelParametroNomi(ParametroNomi parametronomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(parametronomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(parametronomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(parametronomi.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(parametronomi.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(parametronomi.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(parametronomi.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlParametroNomi(ParametroNomi parametronomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ParametroNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(parametronomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ParametroNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(parametronomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ParametroNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(parametronomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(ParametroNomiConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(parametronomi.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(ParametroNomiConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(parametronomi.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementvalor = document.createElement(ParametroNomiConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(parametronomi.getvalor().trim()));
		element.appendChild(elementvalor);

		Element elementdescripcion = document.createElement(ParametroNomiConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(parametronomi.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoParametroNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ParametroNomi> parametronomisSeleccionados=new ArrayList<ParametroNomi>();
		
		parametronomisSeleccionados=this.getParametroNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoParametroNomi(parametronomisSeleccionados);
		
		this.generarReporteParametroNomis("Todos",parametronomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoParametroNomi(ArrayList<ParametroNomi> parametronomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ParametroNomi parametronomiAux:parametronomisSeleccionados) {
				parametronomiAux.setsDetalleGeneralEntityReporte(parametronomiAux.toString());
			
				if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					parametronomiAux.setsDescripcionGeneralEntityReporte1(parametronomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					parametronomiAux.setsDescripcionGeneralEntityReporte1(parametronomiAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					parametronomiAux.setsDescripcionGeneralEntityReporte1(parametronomiAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_VALOR)) {
					existe=true;
					parametronomiAux.setsDescripcionGeneralEntityReporte1(parametronomiAux.getvalor());
				}
				 else if(sTipoSeleccionar.equals(ParametroNomiConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					parametronomiAux.setsDescripcionGeneralEntityReporte1(parametronomiAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ParametroNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesParametroNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoParametroNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesParametroNomi=true;
				this.isVisibilidadCeldaGuardarCambiosParametroNomi=true;
			}
			
			this.isVisibilidadCeldaModificarParametroNomi=false;
			this.isVisibilidadCeldaActualizarParametroNomi=false;
			this.isVisibilidadCeldaEliminarParametroNomi=false;
			this.isVisibilidadCeldaCancelarParametroNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoParametroNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=false;
			this.isVisibilidadCeldaModificarParametroNomi=false;
			this.isVisibilidadCeldaActualizarParametroNomi=true;
			this.isVisibilidadCeldaEliminarParametroNomi=false;
			this.isVisibilidadCeldaCancelarParametroNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoParametroNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=false;
			this.isVisibilidadCeldaModificarParametroNomi=false;
			this.isVisibilidadCeldaActualizarParametroNomi=true;
			this.isVisibilidadCeldaEliminarParametroNomi=true;
			this.isVisibilidadCeldaCancelarParametroNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoParametroNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=false;
			this.isVisibilidadCeldaModificarParametroNomi=false;
			this.isVisibilidadCeldaActualizarParametroNomi=true;
			this.isVisibilidadCeldaEliminarParametroNomi=false;
			this.isVisibilidadCeldaCancelarParametroNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoParametroNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=true;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=true;
			this.isVisibilidadCeldaModificarParametroNomi=false;
			this.isVisibilidadCeldaActualizarParametroNomi=false;
			this.isVisibilidadCeldaEliminarParametroNomi=false;
			this.isVisibilidadCeldaCancelarParametroNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoParametroNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=false;
			this.isVisibilidadCeldaActualizarParametroNomi=false;
			this.isVisibilidadCeldaEliminarParametroNomi=false;
			this.isVisibilidadCeldaCancelarParametroNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoParametroNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=false;
			this.isVisibilidadCeldaModificarParametroNomi=true;
			this.isVisibilidadCeldaActualizarParametroNomi=false;
			this.isVisibilidadCeldaEliminarParametroNomi=false;
			this.isVisibilidadCeldaCancelarParametroNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarParametroNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ParametroNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoParametroNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=true;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=true;
		} else {
			this.actualizarEstadoPanelsParametroNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarParametroNomi=false;
			//this.isVisibilidadCeldaVerFormParametroNomi=false;
			this.isVisibilidadCeldaDuplicarParametroNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!parametronomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoParametroNomi=false;
			this.isVisibilidadCeldaGuardarCambiosParametroNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(parametronomiSessionBean.getEsGuardarRelacionado()) {
			if(!parametronomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;												
			}
			
			this.jButtonCerrarParametroNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesParametroNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.parametronomi)) {
			this.isVisibilidadCeldaActualizarParametroNomi=false;
			this.isVisibilidadCeldaEliminarParametroNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesParametroNomi() {
	}
	
	public void actualizarEstadoPanelsParametroNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionParametroNomi!=null) {
				this.jScrollPanelDatosEdicionParametroNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroNomi!=null) {
				this.jTabbedPaneBusquedasParametroNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroNomi!=null) {
				this.jScrollPanelDatosParametroNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroNomi!=null) {
				this.jPanelPaginacionParametroNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionParametroNomi!=null) {
				this.jScrollPanelDatosEdicionParametroNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroNomi!=null) {
				this.jTabbedPaneBusquedasParametroNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosParametroNomi!=null) {
				this.jScrollPanelDatosParametroNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroNomi!=null) {
				this.jPanelPaginacionParametroNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionParametroNomi!=null) {
				this.jScrollPanelDatosEdicionParametroNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroNomi!=null) {
				this.jTabbedPaneBusquedasParametroNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroNomi!=null) {
				this.jScrollPanelDatosParametroNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroNomi!=null) {
				this.jPanelPaginacionParametroNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionParametroNomi!=null) {
				this.jScrollPanelDatosEdicionParametroNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroNomi!=null) {
				this.jTabbedPaneBusquedasParametroNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosParametroNomi!=null) {
				this.jScrollPanelDatosParametroNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionParametroNomi!=null) {
				this.jPanelPaginacionParametroNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionParametroNomi!=null) {
				this.jScrollPanelDatosEdicionParametroNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroNomi!=null) {
				this.jTabbedPaneBusquedasParametroNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroNomi!=null) {
				this.jScrollPanelDatosParametroNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroNomi!=null) {
				this.jPanelPaginacionParametroNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionParametroNomi!=null) {
				this.jScrollPanelDatosEdicionParametroNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroNomi!=null) {
				this.jTabbedPaneBusquedasParametroNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroNomi!=null) {
				this.jScrollPanelDatosParametroNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroNomi!=null) {
				this.jPanelPaginacionParametroNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionParametroNomi!=null) {
				this.jScrollPanelDatosEdicionParametroNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroNomi!=null) {
				this.jTabbedPaneBusquedasParametroNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosParametroNomi!=null) {
				this.jScrollPanelDatosParametroNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionParametroNomi!=null) {
				this.jPanelPaginacionParametroNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasParametroNomi!=null) {
					this.jTabbedPaneBusquedasParametroNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.parametronomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasParametroNomi!=null) {
				this.jTabbedPaneBusquedasParametroNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesParametroNomi!=null) {
				this.jPanelParametrosReportesParametroNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ParametroNomiSessionBean parametronomiSessionBean=new ParametroNomiSessionBean();
		
		if(this.parametronomiSessionBean==null) {
			this.parametronomiSessionBean=new ParametroNomiSessionBean();
		}
		
		this.parametronomiSessionBean.setsUltimaBusquedaParametroNomi(this.getsAccionBusqueda());
		this.parametronomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.parametronomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			parametronomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ParametroNomiSessionBean parametronomiSessionBean=new ParametroNomiSessionBean();
		
		if(this.parametronomiSessionBean==null) {
			this.parametronomiSessionBean=new ParametroNomiSessionBean();
		}
		
		if(this.parametronomiSessionBean.getsUltimaBusquedaParametroNomi()!=null&&!this.parametronomiSessionBean.getsUltimaBusquedaParametroNomi().equals("")) {
			this.setsAccionBusqueda(parametronomiSessionBean.getsUltimaBusquedaParametroNomi());
			this.setiNumeroPaginacion(parametronomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(parametronomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(parametronomiSessionBean.getid_empresa());
				parametronomiSessionBean.setid_empresa(-1L);
			}
		}
		
		this.parametronomiSessionBean.setsUltimaBusquedaParametroNomi("");
		this.parametronomiSessionBean.setiNumeroPaginacion(ParametroNomiConstantesFunciones.INUMEROPAGINACION);
		this.parametronomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaParametroNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioParametroNomi() {
		this.updateBorderResaltarBusquedasFormularioParametroNomi();
		this.updateVisibilidadBusquedasFormularioParametroNomi();
		this.updateHabilitarBusquedasFormularioParametroNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioParametroNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasParametroNomi.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioParametroNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasParametroNomi.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioParametroNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasParametroNomi.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaParametroNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarParametroNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioParametroNomi() throws Exception {

		if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioParametroNomi();
		this.updateVisibilidadResaltarControlesFormularioParametroNomi();
		this.updateHabilitarResaltarControlesFormularioParametroNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioParametroNomi() throws Exception {
		if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.parametronomiConstantesFunciones.resaltaridParametroNomi!=null && this.jInternalFrameDetalleFormParametroNomi!=null) {this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.setBorder(this.parametronomiConstantesFunciones.resaltaridParametroNomi);}
		if(this.parametronomiConstantesFunciones.resaltarid_empresaParametroNomi!=null && this.jInternalFrameDetalleFormParametroNomi!=null) {this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setBorder(this.parametronomiConstantesFunciones.resaltarid_empresaParametroNomi);}
		if(this.parametronomiConstantesFunciones.resaltarcodigoParametroNomi!=null && this.jInternalFrameDetalleFormParametroNomi!=null) {this.jInternalFrameDetalleFormParametroNomi.jTextFieldcodigoParametroNomi.setBorder(this.parametronomiConstantesFunciones.resaltarcodigoParametroNomi);}
		if(this.parametronomiConstantesFunciones.resaltarnombreParametroNomi!=null && this.jInternalFrameDetalleFormParametroNomi!=null) {this.jInternalFrameDetalleFormParametroNomi.jTextAreanombreParametroNomi.setBorder(this.parametronomiConstantesFunciones.resaltarnombreParametroNomi);}
		if(this.parametronomiConstantesFunciones.resaltarvalorParametroNomi!=null && this.jInternalFrameDetalleFormParametroNomi!=null) {this.jInternalFrameDetalleFormParametroNomi.jTextFieldvalorParametroNomi.setBorder(this.parametronomiConstantesFunciones.resaltarvalorParametroNomi);}
		if(this.parametronomiConstantesFunciones.resaltardescripcionParametroNomi!=null && this.jInternalFrameDetalleFormParametroNomi!=null) {this.jInternalFrameDetalleFormParametroNomi.jTextAreadescripcionParametroNomi.setBorder(this.parametronomiConstantesFunciones.resaltardescripcionParametroNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioParametroNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
	
		//this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostraridParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jPanelidParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostraridParametroNomi);
		//this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrarid_empresaParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jPanelid_empresaParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrarid_empresaParametroNomi);
		//this.jInternalFrameDetalleFormParametroNomi.jTextFieldcodigoParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrarcodigoParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jPanelcodigoParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrarcodigoParametroNomi);
		//this.jInternalFrameDetalleFormParametroNomi.jTextAreanombreParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrarnombreParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jPanelnombreParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrarnombreParametroNomi);
		//this.jInternalFrameDetalleFormParametroNomi.jTextFieldvalorParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrarvalorParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jPanelvalorParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrarvalorParametroNomi);
		//this.jInternalFrameDetalleFormParametroNomi.jTextAreadescripcionParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrardescripcionParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jPaneldescripcionParametroNomi.setVisible(this.parametronomiConstantesFunciones.mostrardescripcionParametroNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioParametroNomi() throws Exception {
		if(this.jInternalFrameDetalleFormParametroNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormParametroNomi!=null) {
	
		this.jInternalFrameDetalleFormParametroNomi.jLabelidParametroNomi.setEnabled(this.parametronomiConstantesFunciones.activaridParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jComboBoxid_empresaParametroNomi.setEnabled(this.parametronomiConstantesFunciones.activarid_empresaParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jTextFieldcodigoParametroNomi.setEnabled(this.parametronomiConstantesFunciones.activarcodigoParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jTextAreanombreParametroNomi.setEnabled(this.parametronomiConstantesFunciones.activarnombreParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jTextFieldvalorParametroNomi.setEnabled(this.parametronomiConstantesFunciones.activarvalorParametroNomi);
		this.jInternalFrameDetalleFormParametroNomi.jTextAreadescripcionParametroNomi.setEnabled(this.parametronomiConstantesFunciones.activardescripcionParametroNomi);
		}
	}
	
		
}