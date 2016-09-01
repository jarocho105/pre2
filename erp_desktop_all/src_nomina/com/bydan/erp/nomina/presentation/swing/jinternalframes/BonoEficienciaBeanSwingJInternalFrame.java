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

import com.bydan.erp.nomina.util.BonoEficienciaConstantesFunciones;
import com.bydan.erp.nomina.util.BonoEficienciaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.BonoEficienciaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.BonoEficienciaBean;
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
public class BonoEficienciaBeanSwingJInternalFrame extends BonoEficienciaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BonoEficienciaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<BonoEficiencia> bonoeficienciaValidator = new ClassValidator<BonoEficiencia>(BonoEficiencia.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public BonoEficiencia bonoeficiencia;	
	public BonoEficiencia bonoeficienciaAux;
	public BonoEficiencia bonoeficienciaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public BonoEficiencia bonoeficienciaTotales;
	public Long idBonoEficienciaActual;
	public Long iIdNuevoBonoEficiencia=0L;
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
	
	public Boolean isPermisoTodoBonoEficiencia;
	public Boolean isPermisoNuevoBonoEficiencia;
	public Boolean isPermisoActualizarBonoEficiencia;
	public Boolean isPermisoActualizarOriginalBonoEficiencia;
	public Boolean isPermisoEliminarBonoEficiencia;
	public Boolean isPermisoGuardarCambiosBonoEficiencia;
	public Boolean isPermisoConsultaBonoEficiencia;
	public Boolean isPermisoBusquedaBonoEficiencia;
	public Boolean isPermisoReporteBonoEficiencia;
	public Boolean isPermisoPaginacionMedioBonoEficiencia;
	public Boolean isPermisoPaginacionAltoBonoEficiencia;
	public Boolean isPermisoPaginacionTodoBonoEficiencia;
	public Boolean isPermisoCopiarBonoEficiencia;
	public Boolean isPermisoVerFormBonoEficiencia;
	public Boolean isPermisoDuplicarBonoEficiencia;
	public Boolean isPermisoOrdenBonoEficiencia;
	
	
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
	
	public BonoEficienciaParameterReturnGeneral bonoeficienciaReturnGeneral;
	public BonoEficienciaParameterReturnGeneral bonoeficienciaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBonoEficiencia=false;
	public Boolean esParaAccionDesdeFormularioBonoEficiencia=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BonoEficienciaSessionBeanAdditional bonoeficienciaSessionBeanAdditional=null;
	
	public BonoEficienciaSessionBeanAdditional getBonoEficienciaSessionBeanAdditional() {
		return this.bonoeficienciaSessionBeanAdditional;
	}
	
	public void setBonoEficienciaSessionBeanAdditional(BonoEficienciaSessionBeanAdditional bonoeficienciaSessionBeanAdditional) {
		try {
			this.bonoeficienciaSessionBeanAdditional=bonoeficienciaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BonoEficienciaBeanSwingJInternalFrameAdditional bonoeficienciaBeanSwingJInternalFrameAdditional=null;
	//public class BonoEficienciaBeanSwingJInternalFrame
	
	public BonoEficienciaBeanSwingJInternalFrameAdditional getBonoEficienciaBeanSwingJInternalFrameAdditional() {
		return this.bonoeficienciaBeanSwingJInternalFrameAdditional;
	}
	
	public void setBonoEficienciaBeanSwingJInternalFrameAdditional(BonoEficienciaBeanSwingJInternalFrameAdditional bonoeficienciaBeanSwingJInternalFrameAdditional) {
		try {
			this.bonoeficienciaBeanSwingJInternalFrameAdditional=bonoeficienciaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BonoEficienciaLogic bonoeficienciaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public BonoEficiencia bonoeficienciaBean;
	public BonoEficienciaConstantesFunciones bonoeficienciaConstantesFunciones;
	//public BonoEficienciaParameterReturnGeneral bonoeficienciaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<BonoEficiencia> bonoeficiencias;	
	//public List<BonoEficiencia> bonoeficienciasEliminados;
	//public List<BonoEficiencia> bonoeficienciasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBonoEficiencia=false;
	public Boolean isVisibilidadCeldaDuplicarBonoEficiencia=true;
	public Boolean isVisibilidadCeldaCopiarBonoEficiencia=true;
	public Boolean isVisibilidadCeldaVerFormBonoEficiencia=true;
	public Boolean isVisibilidadCeldaOrdenBonoEficiencia=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
	public Boolean isVisibilidadCeldaModificarBonoEficiencia=false;
	public Boolean isVisibilidadCeldaActualizarBonoEficiencia=false;
	public Boolean isVisibilidadCeldaEliminarBonoEficiencia=false;
	public Boolean isVisibilidadCeldaCancelarBonoEficiencia=false;
	public Boolean isVisibilidadCeldaGuardarBonoEficiencia=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBonoEficiencia=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoBonoEficiencia() {
		return this.iIdNuevoBonoEficiencia;
	}

	public void setiIdNuevoBonoEficiencia(Long iIdNuevoBonoEficiencia) {
		this.iIdNuevoBonoEficiencia = iIdNuevoBonoEficiencia;
	}
	
	public Long getidBonoEficienciaActual() {
		return this.idBonoEficienciaActual;
	}

	public void setidBonoEficienciaActual(Long idBonoEficienciaActual) {
		this.idBonoEficienciaActual = idBonoEficienciaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public BonoEficiencia getbonoeficiencia() {
		return this.bonoeficiencia;
	}

	public void setbonoeficiencia(BonoEficiencia bonoeficiencia) {
		this.bonoeficiencia = bonoeficiencia;
	}
	
	public BonoEficiencia getbonoeficienciaAux() {
		return this.bonoeficienciaAux;
	}

	public void setbonoeficienciaAux(BonoEficiencia bonoeficienciaAux) {
		this.bonoeficienciaAux = bonoeficienciaAux;
	}				
	
	public BonoEficiencia getbonoeficienciaAnterior() {
		return this.bonoeficienciaAnterior;
	}

	public void setbonoeficienciaAnterior(BonoEficiencia bonoeficienciaAnterior) {
		this.bonoeficienciaAnterior = bonoeficienciaAnterior;
	}	
	
	public BonoEficiencia getbonoeficienciaTotales() {
		return this.bonoeficienciaTotales;
	}

	public void setbonoeficienciaTotales(BonoEficiencia bonoeficienciaTotales) {
		this.bonoeficienciaTotales = bonoeficienciaTotales;
	}	
	
	public BonoEficiencia getbonoeficienciaBean() {
		return this.bonoeficienciaBean;
	}

	public void setbonoeficienciaBean(BonoEficiencia bonoeficienciaBean) {
		this.bonoeficienciaBean = bonoeficienciaBean;
	}	
	
	public BonoEficienciaParameterReturnGeneral getbonoeficienciaReturnGeneral() {
		return this.bonoeficienciaReturnGeneral;
	}

	public void setbonoeficienciaReturnGeneral(BonoEficienciaParameterReturnGeneral bonoeficienciaReturnGeneral) {
		this.bonoeficienciaReturnGeneral = bonoeficienciaReturnGeneral;
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
	
	
	public BonoEficienciaLogic getBonoEficienciaLogic()	{		
		return bonoeficienciaLogic;
	}

	public void setBonoEficienciaLogic(BonoEficienciaLogic bonoeficienciaLogic) {
		this.bonoeficienciaLogic = bonoeficienciaLogic;
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
	
	public Boolean getIsEsNuevoBonoEficiencia() {
		return isEsNuevoBonoEficiencia;
	}

	public void setIsEsNuevoBonoEficiencia(Boolean isEsNuevoBonoEficiencia) {
		this.isEsNuevoBonoEficiencia = isEsNuevoBonoEficiencia;
	}

	public Boolean getEsParaAccionDesdeFormularioBonoEficiencia() {
		return esParaAccionDesdeFormularioBonoEficiencia;
	}
	
	public void setEsParaAccionDesdeFormularioBonoEficiencia(Boolean esParaAccionDesdeFormularioBonoEficiencia) {
		this.esParaAccionDesdeFormularioBonoEficiencia = esParaAccionDesdeFormularioBonoEficiencia;
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

			if(this.bonoeficienciaSessionBean==null) {
				this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
			}

			if(!this.bonoeficienciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(bonoeficienciaSessionBean.getlidEmpresaActual());
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

					if(this.bonoeficiencia!=null) {
						this.bonoeficiencia.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
						this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBonoEficiencia.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
						if(this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.getItemCount()>0) {
							this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBonoEficienciaGenerico)throws Exception
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
				jComboBoxid_empresaBonoEficienciaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBonoEficienciaGenerico!=null && jComboBoxid_empresaBonoEficienciaGenerico.getItemCount()>0) {
					jComboBoxid_empresaBonoEficienciaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(BonoEficiencia bonoeficiencia,JComboBox jComboBoxid_empresaBonoEficienciaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBonoEficienciaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBonoEficienciaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				bonoeficiencia.setid_empresa(empresaAux.getId());
				bonoeficiencia.setempresa_descripcion(BonoEficienciaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				bonoeficiencia.setEmpresa(empresaAux);			}
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

					if(!BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { 
							this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { 
					}

					if(!BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
							this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
							this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesBonoEficiencia() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			BonoEficienciaConstantesFunciones.refrescarForeignKeysDescripcionesBonoEficiencia(this.bonoeficienciaLogic.getBonoEficiencias());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			BonoEficienciaConstantesFunciones.refrescarForeignKeysDescripcionesBonoEficiencia(this.bonoeficiencias);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//bonoeficienciaLogic.setBonoEficiencias(this.bonoeficiencias);
			bonoeficienciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public BonoEficienciaParameterReturnGeneral getBonoEficienciaParameterGeneral() {
		return this.bonoeficienciaParameterGeneral;
	}
	
	public void setBonoEficienciaParameterGeneral(BonoEficienciaParameterReturnGeneral bonoeficienciaParameterGeneral) {
		this.bonoeficienciaParameterGeneral = bonoeficienciaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBonoEficiencia() {
		return isPermisoTodoBonoEficiencia;
	}

	public void setIsPermisoTodoBonoEficiencia(Boolean isPermisoTodoBonoEficiencia) {
		this.isPermisoTodoBonoEficiencia = isPermisoTodoBonoEficiencia;
	}

	public Boolean getIsPermisoNuevoBonoEficiencia() {
		return isPermisoNuevoBonoEficiencia;
	}

	public void setIsPermisoNuevoBonoEficiencia(Boolean isPermisoNuevoBonoEficiencia) {
		this.isPermisoNuevoBonoEficiencia = isPermisoNuevoBonoEficiencia;
	}

	public Boolean getIsPermisoActualizarBonoEficiencia() {
		return isPermisoActualizarBonoEficiencia;
	}

	public void setIsPermisoActualizarBonoEficiencia(Boolean isPermisoActualizarBonoEficiencia) {
		this.isPermisoActualizarBonoEficiencia = isPermisoActualizarBonoEficiencia;
	}

	public Boolean getIsPermisoEliminarBonoEficiencia() {
		return isPermisoEliminarBonoEficiencia;
	}

	public void setIsPermisoEliminarBonoEficiencia(Boolean isPermisoEliminarBonoEficiencia) {
		this.isPermisoEliminarBonoEficiencia = isPermisoEliminarBonoEficiencia;
	}

	public Boolean getIsPermisoGuardarCambiosBonoEficiencia() {
		return isPermisoGuardarCambiosBonoEficiencia;
	}

	public void setIsPermisoGuardarCambiosBonoEficiencia(Boolean isPermisoGuardarCambiosBonoEficiencia) {
		this.isPermisoGuardarCambiosBonoEficiencia = isPermisoGuardarCambiosBonoEficiencia;
	}
	
	public Boolean getIsPermisoConsultaBonoEficiencia() {
		return isPermisoConsultaBonoEficiencia;
	}

	public void setIsPermisoConsultaBonoEficiencia(Boolean isPermisoConsultaBonoEficiencia) {
		this.isPermisoConsultaBonoEficiencia = isPermisoConsultaBonoEficiencia;
	}

	public Boolean getIsPermisoBusquedaBonoEficiencia() {
		return isPermisoBusquedaBonoEficiencia;
	}

	public void setIsPermisoBusquedaBonoEficiencia(Boolean isPermisoBusquedaBonoEficiencia) {
		this.isPermisoBusquedaBonoEficiencia = isPermisoBusquedaBonoEficiencia;
	}

	public Boolean getIsPermisoReporteBonoEficiencia() {
		return isPermisoReporteBonoEficiencia;
	}

	public void setIsPermisoReporteBonoEficiencia(Boolean isPermisoReporteBonoEficiencia) {
		this.isPermisoReporteBonoEficiencia = isPermisoReporteBonoEficiencia;
	}
	
	public Boolean getIsPermisoPaginacionMedioBonoEficiencia() {
		return isPermisoPaginacionMedioBonoEficiencia;
	}

	public void setIsPermisoPaginacionMedioBonoEficiencia(Boolean isPermisoPaginacionMedioBonoEficiencia) {
		this.isPermisoPaginacionMedioBonoEficiencia = isPermisoPaginacionMedioBonoEficiencia;
	}
	
	public Boolean getIsPermisoPaginacionTodoBonoEficiencia() {
		return isPermisoPaginacionTodoBonoEficiencia;
	}

	public void setIsPermisoPaginacionTodoBonoEficiencia(Boolean isPermisoPaginacionTodoBonoEficiencia) {
		this.isPermisoPaginacionTodoBonoEficiencia = isPermisoPaginacionTodoBonoEficiencia;
	}
	
	public Boolean getIsPermisoPaginacionAltoBonoEficiencia() {
		return isPermisoPaginacionAltoBonoEficiencia;
	}

	public void setIsPermisoPaginacionAltoBonoEficiencia(Boolean isPermisoPaginacionAltoBonoEficiencia) {
		this.isPermisoPaginacionAltoBonoEficiencia = isPermisoPaginacionAltoBonoEficiencia;
	}
	
	public Boolean getIsPermisoCopiarBonoEficiencia() {
		return isPermisoCopiarBonoEficiencia;
	}

	public void setIsPermisoCopiarBonoEficiencia(Boolean isPermisoCopiarBonoEficiencia) {
		this.isPermisoCopiarBonoEficiencia = isPermisoCopiarBonoEficiencia;
	}
	
	public Boolean getIsPermisoVerFormBonoEficiencia() {
		return isPermisoVerFormBonoEficiencia;
	}

	public void setIsPermisoVerFormBonoEficiencia(Boolean isPermisoVerFormBonoEficiencia) {
		this.isPermisoVerFormBonoEficiencia = isPermisoVerFormBonoEficiencia;
	}
	
	public Boolean getIsPermisoDuplicarBonoEficiencia() {
		return isPermisoDuplicarBonoEficiencia;
	}

	public void setIsPermisoDuplicarBonoEficiencia(Boolean isPermisoDuplicarBonoEficiencia) {
		this.isPermisoDuplicarBonoEficiencia = isPermisoDuplicarBonoEficiencia;
	}
	
	public Boolean getIsPermisoOrdenBonoEficiencia() {
		return isPermisoOrdenBonoEficiencia;
	}

	public void setIsPermisoOrdenBonoEficiencia(Boolean isPermisoOrdenBonoEficiencia) {
		this.isPermisoOrdenBonoEficiencia = isPermisoOrdenBonoEficiencia;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBonoEficiencia() {
		return isVisibilidadCeldaNuevoBonoEficiencia;
	}

	public void setIsVisibilidadCeldaNuevoBonoEficiencia(Boolean isVisibilidadCeldaNuevoBonoEficiencia) {
		this.isVisibilidadCeldaNuevoBonoEficiencia = isVisibilidadCeldaNuevoBonoEficiencia;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBonoEficiencia() {
		return isVisibilidadCeldaDuplicarBonoEficiencia;
	}

	public void setIsVisibilidadCeldaDuplicarBonoEficiencia(Boolean isVisibilidadCeldaDuplicarBonoEficiencia) {
		this.isVisibilidadCeldaDuplicarBonoEficiencia = isVisibilidadCeldaDuplicarBonoEficiencia;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBonoEficiencia() {
		return isVisibilidadCeldaCopiarBonoEficiencia;
	}

	public void setIsVisibilidadCeldaCopiarBonoEficiencia(Boolean isVisibilidadCeldaCopiarBonoEficiencia) {
		this.isVisibilidadCeldaCopiarBonoEficiencia = isVisibilidadCeldaCopiarBonoEficiencia;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBonoEficiencia() {
		return isVisibilidadCeldaVerFormBonoEficiencia;
	}

	public void setIsVisibilidadCeldaVerFormBonoEficiencia(Boolean isVisibilidadCeldaVerFormBonoEficiencia) {
		this.isVisibilidadCeldaVerFormBonoEficiencia = isVisibilidadCeldaVerFormBonoEficiencia;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBonoEficiencia() {
		return isVisibilidadCeldaOrdenBonoEficiencia;
	}

	public void setIsVisibilidadCeldaOrdenBonoEficiencia(Boolean isVisibilidadCeldaOrdenBonoEficiencia) {
		this.isVisibilidadCeldaOrdenBonoEficiencia = isVisibilidadCeldaOrdenBonoEficiencia;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBonoEficiencia() {
		return isVisibilidadCeldaNuevoRelacionesBonoEficiencia;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBonoEficiencia(Boolean isVisibilidadCeldaNuevoRelacionesBonoEficiencia) {
		this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia = isVisibilidadCeldaNuevoRelacionesBonoEficiencia;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBonoEficiencia() {
		return isVisibilidadCeldaModificarBonoEficiencia;
	}

	public void setIsVisibilidadCeldaModificarBonoEficiencia(Boolean isVisibilidadCeldaModificarBonoEficiencia) {
		this.isVisibilidadCeldaModificarBonoEficiencia = isVisibilidadCeldaModificarBonoEficiencia;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBonoEficiencia() {
		return isVisibilidadCeldaActualizarBonoEficiencia;
	}

	public void setIsVisibilidadCeldaActualizarBonoEficiencia(Boolean isVisibilidadCeldaActualizarBonoEficiencia) {
		this.isVisibilidadCeldaActualizarBonoEficiencia = isVisibilidadCeldaActualizarBonoEficiencia;
	}

	public Boolean getIsVisibilidadCeldaEliminarBonoEficiencia() {
		return isVisibilidadCeldaEliminarBonoEficiencia;
	}

	public void setIsVisibilidadCeldaEliminarBonoEficiencia(Boolean isVisibilidadCeldaEliminarBonoEficiencia) {
		this.isVisibilidadCeldaEliminarBonoEficiencia = isVisibilidadCeldaEliminarBonoEficiencia;
	}

	public Boolean getIsVisibilidadCeldaCancelarBonoEficiencia() {
		return isVisibilidadCeldaCancelarBonoEficiencia;
	}

	public void setIsVisibilidadCeldaCancelarBonoEficiencia(Boolean isVisibilidadCeldaCancelarBonoEficiencia) {
		this.isVisibilidadCeldaCancelarBonoEficiencia = isVisibilidadCeldaCancelarBonoEficiencia;
	}

	public Boolean getIsVisibilidadCeldaGuardarBonoEficiencia() {
		return isVisibilidadCeldaGuardarBonoEficiencia;
	}

	public void setIsVisibilidadCeldaGuardarBonoEficiencia(Boolean isVisibilidadCeldaGuardarBonoEficiencia) {
		this.isVisibilidadCeldaGuardarBonoEficiencia = isVisibilidadCeldaGuardarBonoEficiencia;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBonoEficiencia() {
		return isVisibilidadCeldaGuardarCambiosBonoEficiencia;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBonoEficiencia(Boolean isVisibilidadCeldaGuardarCambiosBonoEficiencia) {
		this.isVisibilidadCeldaGuardarCambiosBonoEficiencia = isVisibilidadCeldaGuardarCambiosBonoEficiencia;
	}
		
	public BonoEficienciaSessionBean getbonoeficienciaSessionBean() {
		return this.bonoeficienciaSessionBean;
	}
	
	public void setbonoeficienciaSessionBean(BonoEficienciaSessionBean bonoeficienciaSessionBean) {
		this.bonoeficienciaSessionBean=bonoeficienciaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(BonoEficiencia bonoeficiencia)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(bonoeficiencia,null);
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
	
	public void bugActualizarReferenciaActual(BonoEficiencia bonoeficiencia,BonoEficiencia bonoeficienciaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBonoEficiencia(bonoeficiencia);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		bonoeficienciaAux.setId(bonoeficiencia.getId());
		bonoeficienciaAux.setVersionRow(bonoeficiencia.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessBonoEficiencia();
		
			int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = bonoeficienciaValidator.getInvalidValues(this.bonoeficiencia);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			bonoeficienciaLogic.setDatosCliente(datosCliente);
			bonoeficienciaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				bonoeficienciaAux=new  BonoEficiencia();
				
				bonoeficienciaAux.setIsNew(true);
				bonoeficienciaAux.setIsChanged(true);
				
				bonoeficienciaAux.setBonoEficienciaOriginal(this.bonoeficiencia);
				
				bonoeficienciaAux.setId(this.bonoeficiencia.getId());	
				bonoeficienciaAux.setVersionRow(this.bonoeficiencia.getVersionRow());	
				bonoeficienciaAux.setid_empresa(this.bonoeficiencia.getid_empresa());	
				bonoeficienciaAux.setdias(this.bonoeficiencia.getdias());	
				bonoeficienciaAux.setvalor(this.bonoeficiencia.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bonoeficienciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(bonoeficienciaAux,bonoeficienciaLogic.getBonoEficiencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bonoeficienciaAux,bonoeficiencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bonoeficienciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bonoeficienciaLogic.saveBonoEficiencias();//WithConnection
						//bonoeficienciaLogic.getSetVersionRowBonoEficiencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bonoeficiencia,bonoeficienciaAux);
					
					this.refrescarForeignKeysDescripcionesBonoEficiencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bonoeficienciaLogic.saveBonoEficienciaRelaciones(bonoeficienciaAux);//WithConnection
								//bonoeficienciaLogic.getSetVersionRowBonoEficiencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bonoeficiencia,bonoeficienciaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bonoeficienciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bonoeficienciaAux,bonoeficienciaLogic.getBonoEficiencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bonoeficienciaAux,bonoeficiencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bonoeficiencia,bonoeficienciaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				bonoeficienciaAux=new  BonoEficiencia();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado() 
					|| (this.bonoeficienciaSessionBean.getEsGuardarRelacionado() && this.bonoeficiencia.getId()>=0)) {
						
					bonoeficienciaAux.setIsNew(false);
				}
				
				bonoeficienciaAux.setIsDeleted(false);
			
				bonoeficienciaAux.setId(this.bonoeficiencia.getId());	
				bonoeficienciaAux.setVersionRow(this.bonoeficiencia.getVersionRow());	
				bonoeficienciaAux.setid_empresa(this.bonoeficiencia.getid_empresa());	
				bonoeficienciaAux.setdias(this.bonoeficiencia.getdias());	
				bonoeficienciaAux.setvalor(this.bonoeficiencia.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bonoeficienciaAux,bonoeficienciaLogic.getBonoEficiencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bonoeficienciaAux,bonoeficiencias);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bonoeficienciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bonoeficienciaLogic.saveBonoEficiencias();//WithConnection
						//bonoeficienciaLogic.getSetVersionRowBonoEficiencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.bonoeficiencia,bonoeficienciaAux);
					
					this.refrescarForeignKeysDescripcionesBonoEficiencia();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bonoeficienciaLogic.saveBonoEficienciaRelaciones(bonoeficienciaAux);//WithConnection
								//bonoeficienciaLogic.getSetVersionRowBonoEficiencias();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.bonoeficiencia,bonoeficienciaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.bonoeficienciaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(bonoeficienciaAux,bonoeficienciaLogic.getBonoEficiencias());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(bonoeficienciaAux,bonoeficiencias);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.bonoeficiencia,bonoeficienciaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				bonoeficienciaAux=new  BonoEficiencia();
				
				bonoeficienciaAux.setIsNew(false);
				bonoeficienciaAux.setIsChanged(false);
				
				bonoeficienciaAux.setIsDeleted(true);
				
				bonoeficienciaAux.setId(this.bonoeficiencia.getId());	
				bonoeficienciaAux.setVersionRow(this.bonoeficiencia.getVersionRow());	
				bonoeficienciaAux.setid_empresa(this.bonoeficiencia.getid_empresa());	
				bonoeficienciaAux.setdias(this.bonoeficiencia.getdias());	
				bonoeficienciaAux.setvalor(this.bonoeficiencia.getvalor());	
				
				if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.bonoeficienciaAux.getId()>=0) {	
						this.bonoeficienciasEliminados.add(bonoeficienciaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(bonoeficienciaAux,bonoeficienciaLogic.getBonoEficiencias());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bonoeficienciaAux,bonoeficiencias);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.bonoeficienciaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bonoeficienciaLogic.saveBonoEficiencias();//WithConnection
						//bonoeficienciaLogic.getSetVersionRowBonoEficiencias();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								bonoeficienciaLogic.saveBonoEficienciaRelaciones(bonoeficienciaAux);//WithConnection
								//bonoeficienciaLogic.getSetVersionRowBonoEficiencias();//WithConnection
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
							if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.bonoeficienciaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(bonoeficienciaAux,bonoeficienciaLogic.getBonoEficiencias());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(bonoeficienciaAux,bonoeficiencias);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.getBonoEficiencias().addAll(this.bonoeficienciasEliminados);
					
					bonoeficienciaLogic.saveBonoEficiencias();//WithConnection
					//bonoeficienciaLogic.getSetVersionRowBonoEficiencias();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesBonoEficiencia();
				
				this.bonoeficienciasEliminados= new ArrayList<BonoEficiencia>();		
			}
			
			if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Bono Eficiencia GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.bonoeficiencia=bonoeficienciaAux;
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
      		//this.finishProcessBonoEficiencia();
      	}
		
	}	
	
	public void actualizarRelaciones(BonoEficiencia bonoeficienciaLocal) throws Exception {
		
		if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(BonoEficiencia bonoeficienciaLocal) throws Exception {	
		if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				bonoeficienciaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBonoEficienciaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = bonoeficienciaValidator.getInvalidValues(this.bonoeficiencia);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(BonoEficiencia bonoeficiencia,List<BonoEficiencia> bonoeficiencias) throws Exception {
		try	{		
			BonoEficienciaConstantesFunciones.actualizarLista(bonoeficiencia,bonoeficiencias,this.bonoeficienciaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(BonoEficiencia bonoeficiencia,List<BonoEficiencia> bonoeficiencias) throws Exception {
		try	{			
			BonoEficienciaConstantesFunciones.actualizarSelectedLista(bonoeficiencia,bonoeficiencias);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<BonoEficiencia> bonoeficienciasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				bonoeficienciasLocal=this.bonoeficienciaLogic.getBonoEficiencias();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				bonoeficienciasLocal=this.bonoeficiencias;
			}
			//ARCHITECTURE
		
			for(BonoEficiencia bonoeficienciaLocal:bonoeficienciasLocal) {
				if(this.permiteMantenimiento(bonoeficienciaLocal) && bonoeficienciaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BonoEficienciaConstantesFunciones.getBonoEficienciaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BonoEficienciaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBonoEficiencia.jLabelid_empresaBonoEficiencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BonoEficienciaConstantesFunciones.DIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBonoEficiencia.jLabeldiasBonoEficiencia,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BonoEficienciaConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBonoEficiencia.jLabelvalorBonoEficiencia,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBonoEficiencia.jLabelid_empresaBonoEficiencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBonoEficiencia.jLabeldiasBonoEficiencia,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBonoEficiencia.jLabelvalorBonoEficiencia,"");
		
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
		this.iIdNuevoBonoEficiencia--;	
		
		
		this.bonoeficienciaAux=new BonoEficiencia();
		
		this.bonoeficienciaAux.setId(this.iIdNuevoBonoEficiencia);
		this.bonoeficienciaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bonoeficienciaLogic.getBonoEficiencias().add(this.bonoeficienciaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.bonoeficiencias.add(this.bonoeficienciaAux);
		}
		//ARCHITECTURE
		
		this.bonoeficiencia=this.bonoeficienciaAux;
		
		if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBonoEficiencia(this.bonoeficiencia);
			this.setVariablesObjetoActualToFormularioForeignKeyBonoEficiencia(this.bonoeficiencia);
		}
				
		//this.setDefaultControlesBonoEficiencia();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBonoEficiencia();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBonoEficiencia();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBonoEficiencia();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBonoEficiencia(this.bonoeficienciaBean,this.bonoeficiencia,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(BonoEficienciaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
			classes=BonoEficienciaConstantesFunciones.getClassesRelationshipsOfBonoEficiencia(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.bonoeficienciaReturnGeneral=bonoeficienciaLogic.procesarEventosBonoEficienciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bonoeficienciaLogic.getBonoEficiencias(),this.bonoeficiencia,this.bonoeficienciaParameterGeneral,this.isEsNuevoBonoEficiencia,classes);//this.bonoeficienciaLogic.getBonoEficiencia()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBonoEficiencia(this.bonoeficienciaReturnGeneral,this.bonoeficienciaBean,false);
		
		if(this.bonoeficienciaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBonoEficiencia(this.bonoeficienciaReturnGeneral.getBonoEficiencia());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBonoEficiencia(this.bonoeficienciaReturnGeneral.getBonoEficiencia());
		}
		
		if(this.bonoeficienciaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBonoEficiencia(this.bonoeficienciaReturnGeneral.getBonoEficiencia(),classes);//this.bonoeficienciaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBonoEficiencia();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBonoEficiencia();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.RecargarFormBonoEficiencia(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBonoEficiencia(false);
						
			if(bonoeficienciaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBonoEficiencia();
			}
			
			this.actualizarVisualTableDatosBonoEficiencia();
			
			this.jTableDatosBonoEficiencia.setRowSelectionInterval(this.getIndiceNuevoBonoEficiencia(), this.getIndiceNuevoBonoEficiencia());
			
			this.seleccionarFilaTablaBonoEficienciaActual();
						
			this.actualizarEstadoCeldasBotonesBonoEficiencia("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBonoEficiencia(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBonoEficiencia.jTextFielddiasBonoEficiencia.setEnabled(isHabilitar && this.bonoeficienciaConstantesFunciones.activardiasBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jTextFieldvalorBonoEficiencia.setEnabled(isHabilitar && this.bonoeficienciaConstantesFunciones.activarvalorBonoEficiencia);	
		//
		this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setEnabled(isHabilitar && this.bonoeficienciaConstantesFunciones.activarid_empresaBonoEficiencia);
	};
	
	public void setDefaultControlesBonoEficiencia() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBonoEficiencia(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.bonoeficienciaSessionBean.setConGuardarRelaciones(true);			
			this.bonoeficienciaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.setVisible(true);
			
					
		} else {
			//this.bonoeficienciaSessionBean.setConGuardarRelaciones(false);			
			this.bonoeficienciaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBonoEficiencia() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
				if(bonoeficienciaAux.getId().equals(this.iIdNuevoBonoEficiencia)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BonoEficiencia bonoeficienciaAux:this.bonoeficiencias) {
				if(bonoeficienciaAux.getId().equals(this.iIdNuevoBonoEficiencia)) {
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
	
	public int getIndiceActualBonoEficiencia(BonoEficiencia bonoeficiencia,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
				if(bonoeficienciaAux.getId().equals(bonoeficiencia.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BonoEficiencia bonoeficienciaAux:this.bonoeficiencias) {
				if(bonoeficienciaAux.getId().equals(bonoeficiencia.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBonoEficiencia(BonoEficiencia bonoeficienciaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
				if(bonoeficienciaAux.getBonoEficienciaOriginal().getId().equals(bonoeficienciaOriginal.getId())) {
					existe=true;
					bonoeficienciaOriginal.setId(bonoeficienciaAux.getId());
					bonoeficienciaOriginal.setVersionRow(bonoeficienciaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BonoEficiencia bonoeficienciaAux:this.bonoeficiencias) {
				if(bonoeficienciaAux.getBonoEficienciaOriginal().getId().equals(bonoeficienciaOriginal.getId())) {
					existe=true;
					bonoeficienciaOriginal.setId(bonoeficienciaAux.getId());
					bonoeficienciaOriginal.setVersionRow(bonoeficienciaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBonoEficiencia(Boolean esParaCancelar) throws Exception {
		bonoeficienciasAux=new ArrayList<BonoEficiencia>();
		bonoeficienciaAux=new BonoEficiencia();
		
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
					if(bonoeficienciaAux.getId()<0) {
						bonoeficienciasAux.add(bonoeficienciaAux);
					}		
				}
				this.iIdNuevoBonoEficiencia=0L;
				this.bonoeficienciaLogic.getBonoEficiencias().removeAll(bonoeficienciasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BonoEficiencia bonoeficienciaAux:this.bonoeficiencias) {
					if(bonoeficienciaAux.getId()<0) {
						bonoeficienciasAux.add(bonoeficienciaAux);
					}		
				}
				this.iIdNuevoBonoEficiencia=0L;
				this.bonoeficiencias.removeAll(bonoeficienciasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBonoEficiencia 
					&& this.bonoeficienciaLogic.getBonoEficiencias().size()>0
					) {
					bonoeficienciaAux=this.bonoeficienciaLogic.getBonoEficiencias().get(this.bonoeficienciaLogic.getBonoEficiencias().size() - 1);
				
					if(bonoeficienciaAux.getId()<0) {
						this.bonoeficienciaLogic.getBonoEficiencias().remove(bonoeficienciaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBonoEficiencia && this.bonoeficiencias.size()>0) {
					bonoeficienciaAux=this.bonoeficiencias.get(this.bonoeficiencias.size() - 1);
				
					if(bonoeficienciaAux.getId()<0) {
						this.bonoeficiencias.remove(bonoeficienciaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBonoEficiencia(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(bonoeficiencia.getId()<0) {
				this.bonoeficienciaLogic.getBonoEficiencias().remove(this.bonoeficiencia);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(bonoeficiencia.getId()<0) {
				this.bonoeficiencias.remove(this.bonoeficiencia);
			}
		}			
	}
	
	public void setEstadosInicialesBonoEficiencia(List<BonoEficiencia> bonoeficienciasAux) throws Exception {
		BonoEficienciaConstantesFunciones.setEstadosInicialesBonoEficiencia(bonoeficienciasAux);
	}
	
	public void setEstadosInicialesBonoEficiencia(BonoEficiencia bonoeficienciaAux) throws Exception {
		BonoEficienciaConstantesFunciones.setEstadosInicialesBonoEficiencia(bonoeficienciaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBonoEficienciaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBonoEficiencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBonoEficienciaActual()) {
				if(!this.isEsNuevoBonoEficiencia) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBonoEficiencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBonoEficiencia=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBonoEficienciaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Bono Eficiencia ?", "MANTENIMIENTO DE Bono Eficiencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBonoEficiencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(BonoEficiencia bonoeficiencia) throws Exception {
		BonoEficienciaConstantesFunciones.seleccionarAsignar(this.bonoeficiencia,bonoeficiencia);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBonoEficiencia=this.isPermisoActualizarOriginalBonoEficiencia;
			
			
			this.seleccionarAsignar(bonoeficiencia);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BonoEficienciaConstantesFunciones.quitarEspaciosBonoEficiencia(this.bonoeficiencia,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesBonoEficiencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.bonoeficienciaSessionBean.setsFuncionBusquedaRapida(this.bonoeficienciaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBonoEficiencia) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBonoEficiencia(esParaCancelar);				
				this.cancelarNuevoBonoEficiencia(esParaCancelar);								
			}
			
			this.bonoeficiencia=new BonoEficiencia();
			
			this.inicializarBonoEficiencia();
			
			this.actualizarEstadoCeldasBotonesBonoEficiencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBonoEficiencia() throws Exception {
		try {
			BonoEficienciaConstantesFunciones.inicializarBonoEficiencia(this.bonoeficiencia);
			
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
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.bonoeficienciaLogic.getBonoEficiencias().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBonoEficiencias(String sAccionBusqueda,List<BonoEficiencia> bonoeficienciasParaReportes) throws Exception {
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
					sPathReporteFinal="BonoEficiencia"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BonoEficienciaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BonoEficienciaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="BonoEficiencia"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Bono Eficiencias");		
		parameters.put("busquedapor", BonoEficienciaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBonoEficiencia=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BonoEficienciaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BonoEficienciaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBonoEficiencia=new JRBeanArrayDataSource(BonoEficienciaJInternalFrame.TraerBonoEficienciaBeans(bonoeficienciasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBonoEficiencia);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BonoEficienciaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BonoEficienciaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BonoEficienciaBean.TraerBonoEficienciaBeans(bonoeficienciasParaReportes).toArray()));
							
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
				this.generarExcelReporteBonoEficiencias(sAccionBusqueda,sTipoArchivoReporte,bonoeficienciasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBonoEficiencias(sAccionBusqueda,sTipoArchivoReporte,bonoeficienciasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBonoEficienciaActionPerformed(null);
					//this.generarExcelReporteBonoEficiencias(sAccionBusqueda,sTipoArchivoReporte,bonoeficienciasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBonoEficiencias(sAccionBusqueda,sTipoArchivoReporte,bonoeficienciasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBonoEficiencias(sAccionBusqueda,sTipoArchivoReporte,bonoeficienciasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBonoEficiencias(sAccionBusqueda,sTipoArchivoReporte,bonoeficienciasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBonoEficiencias(String sAccionBusqueda,String sTipoArchivoReporte,List<BonoEficiencia> bonoeficienciasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bonoeficiencia";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BonoEficiencias");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBonoEficiencia("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(BonoEficiencia bonoeficiencia : bonoeficienciasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BonoEficienciaConstantesFunciones.generarExcelReporteDataBonoEficiencia("NORMAL",row,workbook,bonoeficiencia,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBonoEficiencia(String sTipo,Row row,Workbook workbook) {
		
		BonoEficienciaConstantesFunciones.generarExcelReporteHeaderBonoEficiencia(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBonoEficiencias(String sAccionBusqueda,String sTipoArchivoReporte,List<BonoEficiencia> bonoeficienciasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bonoeficiencia_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BonoEficiencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(BonoEficiencia bonoeficiencia : bonoeficienciasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BonoEficienciaConstantesFunciones.getBonoEficienciaDescripcion(bonoeficiencia));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bonoeficiencia.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BonoEficienciaConstantesFunciones.LABEL_DIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_DIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bonoeficiencia.getdias());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BonoEficienciaConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bonoeficiencia.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBonoEficiencias(String sAccionBusqueda,String sTipoArchivoReporte,List<BonoEficiencia> bonoeficienciasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<BonoEficiencia> bonoeficienciasRespaldo=null;
		
		classes=BonoEficienciaConstantesFunciones.getClassesRelationshipsOfBonoEficiencia(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.bonoeficienciaLogic.setDatosCliente(this.datosCliente);
		this.bonoeficienciaLogic.setDatosDeep(this.datosDeep);
		this.bonoeficienciaLogic.setIsConDeep(true);
		
		bonoeficienciasRespaldo=this.bonoeficienciaLogic.getBonoEficiencias();
		
		this.bonoeficienciaLogic.setBonoEficiencias(bonoeficienciasParaReportes);	
		this.bonoeficienciaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		bonoeficienciasParaReportes=this.bonoeficienciaLogic.getBonoEficiencias();
		this.bonoeficienciaLogic.setBonoEficiencias(bonoeficienciasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bonoeficiencia_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BonoEficiencias");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBonoEficiencia("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(BonoEficiencia bonoeficiencia : bonoeficienciasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBonoEficiencia("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BonoEficienciaConstantesFunciones.generarExcelReporteDataBonoEficiencia("NORMAL",row,workbook,bonoeficiencia,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BonoEficienciaConstantesFunciones.getBonoEficienciaDescripcion(bonoeficiencia));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBonoEficiencia.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBonoEficiencia() throws Exception {		
		this.startProcessBonoEficiencia(true);
	}
	
	public void startProcessBonoEficiencia(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBonoEficiencia ,this.jPanelParametrosReportesBonoEficiencia, this.jScrollPanelDatosBonoEficiencia,this.jPanelPaginacionBonoEficiencia, this.jScrollPanelDatosEdicionBonoEficiencia, this.jPanelAccionesBonoEficiencia,this.jPanelAccionesFormularioBonoEficiencia,this.jmenuBarBonoEficiencia,this.jmenuBarDetalleBonoEficiencia,this.jTtoolBarBonoEficiencia,this.jTtoolBarDetalleBonoEficiencia);		
		
		final JTabbedPane jTabbedPaneBusquedasBonoEficiencia=this.jTabbedPaneBusquedasBonoEficiencia; 
		
		final JPanel jPanelParametrosReportesBonoEficiencia=this.jPanelParametrosReportesBonoEficiencia;
		//final JScrollPane jScrollPanelDatosBonoEficiencia=this.jScrollPanelDatosBonoEficiencia;
		final JTable jTableDatosBonoEficiencia=this.jTableDatosBonoEficiencia;		
		final JPanel jPanelPaginacionBonoEficiencia=this.jPanelPaginacionBonoEficiencia;
		//final JScrollPane jScrollPanelDatosEdicionBonoEficiencia=this.jScrollPanelDatosEdicionBonoEficiencia;
		final JPanel jPanelAccionesBonoEficiencia=this.jPanelAccionesBonoEficiencia;
		
		JPanel jPanelCamposAuxiliarBonoEficiencia=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBonoEficiencia=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			jPanelCamposAuxiliarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jPanelCamposBonoEficiencia;
			jPanelAccionesFormularioAuxiliarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jPanelAccionesFormularioBonoEficiencia;
		}
		
		final JPanel jPanelCamposBonoEficiencia=jPanelCamposAuxiliarBonoEficiencia;
		final JPanel jPanelAccionesFormularioBonoEficiencia=jPanelAccionesFormularioAuxiliarBonoEficiencia;
		
		
		final JMenuBar jmenuBarBonoEficiencia=this.jmenuBarBonoEficiencia;
		final JToolBar jTtoolBarBonoEficiencia=this.jTtoolBarBonoEficiencia;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBonoEficiencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBonoEficiencia=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			jmenuBarDetalleAuxiliarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jmenuBarDetalleBonoEficiencia;
			jTtoolBarDetalleAuxiliarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jTtoolBarDetalleBonoEficiencia;
		}
		
		final JMenuBar jmenuBarDetalleBonoEficiencia=jmenuBarDetalleAuxiliarBonoEficiencia;
		final JToolBar jTtoolBarDetalleBonoEficiencia=jTtoolBarDetalleAuxiliarBonoEficiencia;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBonoEficiencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBonoEficiencia;
			processRunnable.jTableDatos=jTableDatosBonoEficiencia;
			processRunnable.jPanelCampos=jPanelCamposBonoEficiencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionBonoEficiencia;
			processRunnable.jPanelAcciones=jPanelAccionesBonoEficiencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBonoEficiencia;
			
			
			processRunnable.jmenuBar=jmenuBarBonoEficiencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBonoEficiencia;
			processRunnable.jTtoolBar=jTtoolBarBonoEficiencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBonoEficiencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBonoEficiencia ,jPanelParametrosReportesBonoEficiencia,jTableDatosBonoEficiencia, /*jScrollPanelDatosBonoEficiencia,*/jPanelCamposBonoEficiencia,jPanelPaginacionBonoEficiencia, /*jScrollPanelDatosEdicionBonoEficiencia,*/ jPanelAccionesBonoEficiencia,jPanelAccionesFormularioBonoEficiencia,jmenuBarBonoEficiencia,jmenuBarDetalleBonoEficiencia,jTtoolBarBonoEficiencia,jTtoolBarDetalleBonoEficiencia);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBonoEficiencia ,jPanelParametrosReportesBonoEficiencia, jScrollPanelDatosBonoEficiencia,jPanelPaginacionBonoEficiencia, jScrollPanelDatosEdicionBonoEficiencia, jPanelAccionesBonoEficiencia,jPanelAccionesFormularioBonoEficiencia,jmenuBarBonoEficiencia,jmenuBarDetalleBonoEficiencia,jTtoolBarBonoEficiencia,jTtoolBarDetalleBonoEficiencia);
						
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
	
	public void finishProcessBonoEficiencia() {// throws Exception 
		this.finishProcessBonoEficiencia(true);
	}
	
	public void finishProcessBonoEficiencia(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBonoEficiencia ,this.jPanelParametrosReportesBonoEficiencia, this.jScrollPanelDatosBonoEficiencia,this.jPanelPaginacionBonoEficiencia, this.jScrollPanelDatosEdicionBonoEficiencia, this.jPanelAccionesBonoEficiencia,this.jPanelAccionesFormularioBonoEficiencia,this.jmenuBarBonoEficiencia,this.jmenuBarDetalleBonoEficiencia,this.jTtoolBarBonoEficiencia,this.jTtoolBarDetalleBonoEficiencia);		
		
		final JTabbedPane jTabbedPaneBusquedasBonoEficiencia=this.jTabbedPaneBusquedasBonoEficiencia; 
		
		final JPanel jPanelParametrosReportesBonoEficiencia=this.jPanelParametrosReportesBonoEficiencia;
		//final JScrollPane jScrollPanelDatosBonoEficiencia=this.jScrollPanelDatosBonoEficiencia;
		final JTable jTableDatosBonoEficiencia=this.jTableDatosBonoEficiencia;		
		final JPanel jPanelPaginacionBonoEficiencia=this.jPanelPaginacionBonoEficiencia;
		//final JScrollPane jScrollPanelDatosEdicionBonoEficiencia=this.jScrollPanelDatosEdicionBonoEficiencia;
		final JPanel jPanelAccionesBonoEficiencia=this.jPanelAccionesBonoEficiencia;
		
		JPanel jPanelCamposAuxiliarBonoEficiencia=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBonoEficiencia=new JPanel();
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			jPanelCamposAuxiliarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jPanelCamposBonoEficiencia;
			jPanelAccionesFormularioAuxiliarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jPanelAccionesFormularioBonoEficiencia;
		}
		
		final JPanel jPanelCamposBonoEficiencia=jPanelCamposAuxiliarBonoEficiencia;
		final JPanel jPanelAccionesFormularioBonoEficiencia=jPanelAccionesFormularioAuxiliarBonoEficiencia;
		
		
		final JMenuBar jmenuBarBonoEficiencia=this.jmenuBarBonoEficiencia;		
		final JToolBar jTtoolBarBonoEficiencia=this.jTtoolBarBonoEficiencia;
				
		JMenuBar jmenuBarDetalleAuxiliarBonoEficiencia=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBonoEficiencia=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			jmenuBarDetalleAuxiliarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jmenuBarDetalleBonoEficiencia;
			jTtoolBarDetalleAuxiliarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jTtoolBarDetalleBonoEficiencia;		
		}
		
		final JMenuBar jmenuBarDetalleBonoEficiencia=jmenuBarDetalleAuxiliarBonoEficiencia;
		final JToolBar jTtoolBarDetalleBonoEficiencia=jTtoolBarDetalleAuxiliarBonoEficiencia;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBonoEficiencia;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBonoEficiencia;
			processRunnable.jTableDatos=jTableDatosBonoEficiencia;
			processRunnable.jPanelCampos=jPanelCamposBonoEficiencia;
			processRunnable.jPanelPaginacion=jPanelPaginacionBonoEficiencia;
			processRunnable.jPanelAcciones=jPanelAccionesBonoEficiencia;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBonoEficiencia;
			
			
			processRunnable.jmenuBar=jmenuBarBonoEficiencia;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBonoEficiencia;
			processRunnable.jTtoolBar=jTtoolBarBonoEficiencia;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBonoEficiencia;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBonoEficiencia ,jPanelParametrosReportesBonoEficiencia, jTableDatosBonoEficiencia,/*jScrollPanelDatosBonoEficiencia,*/jPanelCamposBonoEficiencia,jPanelPaginacionBonoEficiencia, /*jScrollPanelDatosEdicionBonoEficiencia,*/ jPanelAccionesBonoEficiencia,jPanelAccionesFormularioBonoEficiencia,jmenuBarBonoEficiencia,jmenuBarDetalleBonoEficiencia,jTtoolBarBonoEficiencia,jTtoolBarDetalleBonoEficiencia));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBonoEficiencia(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBonoEficiencia(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBonoEficiencia(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBonoEficiencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBonoEficiencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBonoEficiencia,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBonoEficiencia(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBonoEficiencia,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBonoEficiencia,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.bonoeficienciaConstantesFunciones.getsFinalQueryBonoEficiencia();
		String  finalQueryPaginacionTodos=this.bonoeficienciaConstantesFunciones.getsFinalQueryBonoEficiencia();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BonoEficienciaConstantesFunciones.getArrayColumnasGlobalesNoBonoEficiencia(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BonoEficienciaConstantesFunciones.getArrayColumnasGlobalesBonoEficiencia(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BonoEficienciaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.bonoeficienciasEliminados= new ArrayList<BonoEficiencia>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBonoEficiencia();
		
				///*BonoEficienciaSessionBean*/this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
			
			if(this.bonoeficienciaSessionBean==null) {
				this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
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
					this.iNumeroPaginacion=BonoEficienciaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BonoEficienciaConstantesFunciones.getClassesForeignKeysOfBonoEficiencia(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/bonoeficiencia."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			bonoeficienciasAux= new ArrayList<BonoEficiencia>();
			
				
			bonoeficienciaLogic.setDatosCliente(this.datosCliente);
			bonoeficienciaLogic.setDatosDeep(this.datosDeep);
			bonoeficienciaLogic.setIsConDeep(true);
			
			
			bonoeficienciaLogic.getBonoEficienciaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					bonoeficienciaLogic.getTodosBonoEficiencias(finalQueryGlobal,pagination);
					
					//bonoeficienciaLogic.getTodosBonoEficienciasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(bonoeficienciaLogic.getBonoEficiencias()==null|| bonoeficienciaLogic.getBonoEficiencias().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bonoeficienciasAux= new ArrayList<BonoEficiencia>();
							bonoeficienciasAux.addAll(bonoeficienciaLogic.getBonoEficiencias());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bonoeficienciasAux= new ArrayList<BonoEficiencia>();
							bonoeficienciasAux.addAll(bonoeficiencias);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bonoeficienciaLogic.getTodosBonoEficiencias(finalQueryGlobal+"",this.pagination);												
							
							//bonoeficienciaLogic.getTodosBonoEficienciasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteBonoEficiencias("Todos",bonoeficienciaLogic.getBonoEficiencias() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							bonoeficienciaLogic.setBonoEficiencias(new ArrayList<BonoEficiencia>());					
							bonoeficienciaLogic.getBonoEficiencias().addAll(bonoeficienciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bonoeficiencias=new ArrayList<BonoEficiencia>();
							bonoeficiencias.addAll(bonoeficienciasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idBonoEficiencia=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idBonoEficiencia=this.idActual;
				
				} else if(this.idBonoEficienciaActual!=null && this.idBonoEficienciaActual!=0L) {
					idBonoEficiencia=idBonoEficienciaActual;
				}
				
					
				this.sDetalleReporte=BonoEficienciaConstantesFunciones.getDetalleIndicePorId(idBonoEficiencia);
				
				this.bonoeficiencias=new ArrayList<BonoEficiencia>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					bonoeficienciaLogic.getEntity(idBonoEficiencia);
					
					//bonoeficienciaLogic.getEntityWithConnection(idBonoEficiencia);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bonoeficienciaLogic.setBonoEficiencias(new ArrayList<BonoEficiencia>());
					bonoeficienciaLogic.getBonoEficiencias().add(bonoeficienciaLogic.getBonoEficiencia());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bonoeficiencias=new ArrayList<BonoEficiencia>();
					this.bonoeficiencias.add(bonoeficiencia);
				}
				
				if(bonoeficienciaLogic.getBonoEficiencia()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=BonoEficienciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bonoeficienciaLogic.getBonoEficienciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BonoEficienciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BonoEficienciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bonoeficienciaLogic.getBonoEficiencias()==null||bonoeficienciaLogic.getBonoEficiencias().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bonoeficiencias==null|| bonoeficiencias.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bonoeficienciasAux=new ArrayList<BonoEficiencia>();
						bonoeficienciasAux.addAll(bonoeficienciaLogic.getBonoEficiencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bonoeficienciasAux=new ArrayList<BonoEficiencia>();
							bonoeficienciasAux.addAll(bonoeficiencias);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bonoeficienciaLogic.getBonoEficienciasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BonoEficienciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BonoEficienciaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBonoEficiencias("FK_IdEmpresa",bonoeficienciaLogic.getBonoEficiencias());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBonoEficiencias("FK_IdEmpresa",bonoeficiencias);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bonoeficienciaLogic.setBonoEficiencias(new ArrayList<BonoEficiencia>());
						bonoeficienciaLogic.getBonoEficiencias().addAll(bonoeficienciasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bonoeficiencias=new ArrayList<BonoEficiencia>();
							bonoeficiencias.addAll(bonoeficienciasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBonoEficiencia();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBonoEficiencia();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bonoeficienciaLogic.getBonoEficiencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bonoeficiencias.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bonoeficienciaLogic.getBonoEficiencias().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bonoeficiencias.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(BonoEficiencia bonoeficiencia) {
		Boolean permite=true;
		
		if(this.bonoeficiencia.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BonoEficienciaConstantesFunciones.getOrderByListaBonoEficiencia();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BonoEficienciaConstantesFunciones.getOrderByListaBonoEficiencia();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BonoEficiencia bonoeficiencia:bonoeficienciaLogic.getBonoEficiencias()) {
				if(bonoeficiencia.getsType().equals(Constantes2.S_TOTALES)) {
					bonoeficienciaTotales=bonoeficiencia;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BonoEficiencia bonoeficiencia:this.bonoeficiencias) {
				if(bonoeficiencia.getsType().equals(Constantes2.S_TOTALES)) {
					bonoeficienciaTotales=bonoeficiencia;
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
			this.bonoeficienciaAux=new BonoEficiencia();
			this.bonoeficienciaAux.setsType(Constantes2.S_TOTALES);
			this.bonoeficienciaAux.setIsNew(false);
			this.bonoeficienciaAux.setIsChanged(false);
			this.bonoeficienciaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				BonoEficienciaConstantesFunciones.TotalizarValoresFilaBonoEficiencia(this.bonoeficienciaLogic.getBonoEficiencias(),this.bonoeficienciaAux);
				
				this.bonoeficienciaLogic.getBonoEficiencias().add(this.bonoeficienciaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BonoEficienciaConstantesFunciones.TotalizarValoresFilaBonoEficiencia(this.bonoeficiencias,this.bonoeficienciaAux);
				
				this.bonoeficiencias.add(this.bonoeficienciaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		bonoeficienciaTotales=new BonoEficiencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bonoeficienciaLogic.getBonoEficiencias().remove(bonoeficienciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bonoeficiencias.remove(bonoeficienciaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		bonoeficienciaTotales=new BonoEficiencia();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BonoEficiencia bonoeficiencia:bonoeficienciaLogic.getBonoEficiencias()) {
				if(bonoeficiencia.getsType().equals(Constantes2.S_TOTALES)) {
					bonoeficienciaTotales=bonoeficiencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BonoEficienciaConstantesFunciones.TotalizarValoresFilaBonoEficiencia(this.bonoeficienciaLogic.getBonoEficiencias(),bonoeficienciaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BonoEficiencia bonoeficiencia:this.bonoeficiencias) {
				if(bonoeficiencia.getsType().equals(Constantes2.S_TOTALES)) {
					bonoeficienciaTotales=bonoeficiencia;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BonoEficienciaConstantesFunciones.TotalizarValoresFilaBonoEficiencia(this.bonoeficiencias,bonoeficienciaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBonoEficienciasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBonoEficienciasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bonoeficienciaLogic.getBonoEficienciasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosBonoEficiencia() {
		this.isPermisoTodoBonoEficiencia=false;
		this.isPermisoNuevoBonoEficiencia=false;
		this.isPermisoActualizarBonoEficiencia=false;
		this.isPermisoActualizarOriginalBonoEficiencia=false;
		this.isPermisoEliminarBonoEficiencia=false;
		this.isPermisoGuardarCambiosBonoEficiencia=false;
		this.isPermisoConsultaBonoEficiencia=false;
		this.isPermisoBusquedaBonoEficiencia=false;
		this.isPermisoReporteBonoEficiencia=false;		
		this.isPermisoOrdenBonoEficiencia=false;		
		this.isPermisoPaginacionMedioBonoEficiencia=false;		
		this.isPermisoPaginacionAltoBonoEficiencia=false;
		this.isPermisoPaginacionTodoBonoEficiencia=false;
		this.isPermisoCopiarBonoEficiencia=false;		
		this.isPermisoVerFormBonoEficiencia=false;		
		this.isPermisoDuplicarBonoEficiencia=false;		
		this.isPermisoOrdenBonoEficiencia=false;		
	}
	
	public void setPermisosUsuarioBonoEficiencia(Boolean isPermiso) {
		this.isPermisoTodoBonoEficiencia=isPermiso;
		this.isPermisoNuevoBonoEficiencia=isPermiso;
		this.isPermisoActualizarBonoEficiencia=isPermiso;
		this.isPermisoActualizarOriginalBonoEficiencia=isPermiso;
		this.isPermisoEliminarBonoEficiencia=isPermiso;
		this.isPermisoGuardarCambiosBonoEficiencia=isPermiso;
		this.isPermisoConsultaBonoEficiencia=isPermiso;
		this.isPermisoBusquedaBonoEficiencia=isPermiso;
		this.isPermisoReporteBonoEficiencia=isPermiso;
		this.isPermisoOrdenBonoEficiencia=isPermiso;		
		this.isPermisoPaginacionMedioBonoEficiencia=isPermiso;		
		this.isPermisoPaginacionAltoBonoEficiencia=isPermiso;		
		this.isPermisoPaginacionTodoBonoEficiencia=isPermiso;		
		this.isPermisoCopiarBonoEficiencia=isPermiso;		
		this.isPermisoVerFormBonoEficiencia=isPermiso;		
		this.isPermisoDuplicarBonoEficiencia=isPermiso;
		this.isPermisoOrdenBonoEficiencia=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBonoEficiencia(Boolean isPermiso) {
		//this.isPermisoTodoBonoEficiencia=isPermiso;
		this.isPermisoNuevoBonoEficiencia=isPermiso;
		this.isPermisoActualizarBonoEficiencia=isPermiso;
		this.isPermisoActualizarOriginalBonoEficiencia=isPermiso;
		this.isPermisoEliminarBonoEficiencia=isPermiso;
		this.isPermisoGuardarCambiosBonoEficiencia=isPermiso;
		//this.isPermisoConsultaBonoEficiencia=isPermiso;
		//this.isPermisoBusquedaBonoEficiencia=isPermiso;
		//this.isPermisoReporteBonoEficiencia=isPermiso;
		//this.isPermisoOrdenBonoEficiencia=isPermiso;		
		//this.isPermisoPaginacionMedioBonoEficiencia=isPermiso;		
		//this.isPermisoPaginacionAltoBonoEficiencia=isPermiso;		
		//this.isPermisoPaginacionTodoBonoEficiencia=isPermiso;		
		//this.isPermisoCopiarBonoEficiencia=isPermiso;		
		//this.isPermisoDuplicarBonoEficiencia=isPermiso;
		//this.isPermisoOrdenBonoEficiencia=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBonoEficienciaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BonoEficienciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebBonoEficiencia(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBonoEficienciaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBonoEficienciaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBonoEficienciaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBonoEficienciaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBonoEficiencia() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BonoEficienciaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BonoEficienciaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBonoEficiencia=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBonoEficiencia=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBonoEficiencia=this.isPermisoActualizarBonoEficiencia;
			this.isPermisoEliminarBonoEficiencia=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBonoEficiencia=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBonoEficiencia=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBonoEficiencia=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBonoEficiencia=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBonoEficiencia=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBonoEficiencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBonoEficiencia=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBonoEficiencia=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBonoEficiencia=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBonoEficiencia=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBonoEficiencia=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBonoEficiencia=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBonoEficiencia=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBonoEficiencia.setToolTipText(this.jTableDatosBonoEficiencia.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBonoEficiencia(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBonoEficiencia(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BonoEficienciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BonoEficienciaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBonoEficiencia() throws Exception {
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
	public void inicializarCombosForeignKeyBonoEficienciaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBonoEficienciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BonoEficienciaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyBonoEficienciaListas(false);
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
	
	public void cargarCombosLoteForeignKeyBonoEficienciaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			BonoEficienciaParameterReturnGeneral bonoeficienciaReturnGeneral=new BonoEficienciaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.bonoeficienciaConstantesFunciones.cargarid_empresaBonoEficiencia)
					 || (this.esRecargarFks && this.bonoeficienciaConstantesFunciones.cargarid_empresaBonoEficiencia)) {

					if(!this.bonoeficienciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+bonoeficienciaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				bonoeficienciaReturnGeneral=bonoeficienciaLogic.cargarCombosLoteForeignKeyBonoEficiencia(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=bonoeficienciaReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyBonoEficiencia()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.bonoeficienciaSessionBean==null) {
				this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
			}

			if(!this.bonoeficienciaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyBonoEficiencia()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBonoEficiencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBonoEficiencia()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBonoEficiencia();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBonoEficiencia(BonoEficiencia bonoeficiencia)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBonoEficiencia(BonoEficiencia bonoeficiencia,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBonoEficiencia()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBonoEficiencia()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBonoEficiencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBonoEficiencia()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBonoEficiencia()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBonoEficiencia()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBonoEficiencia(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBonoEficiencia()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia!=null && this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.getItemCount()>0) {
				this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public BonoEficienciaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BonoEficienciaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BonoEficienciaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean(); 
		this.bonoeficienciaConstantesFunciones=new BonoEficienciaConstantesFunciones(); 
		this.bonoeficienciaBean=new BonoEficiencia();//(this.bonoeficienciaConstantesFunciones); 		
		this.bonoeficienciaReturnGeneral=new BonoEficienciaParameterReturnGeneral(); 
		
		this.bonoeficienciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bonoeficienciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BonoEficienciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BonoEficienciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BonoEficienciaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBonoEficiencia(true);
			
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
			
			this.bonoeficienciaConstantesFunciones=new BonoEficienciaConstantesFunciones(); 
			this.bonoeficienciaBean=new BonoEficiencia();//this.bonoeficienciaConstantesFunciones); 			
			this.bonoeficienciaReturnGeneral=new BonoEficienciaParameterReturnGeneral(); 
		
			BonoEficienciaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bono Eficiencia Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.bonoeficiencia=new BonoEficiencia();
			this.bonoeficiencias = new ArrayList<BonoEficiencia>();
			this.bonoeficienciasAux = new ArrayList<BonoEficiencia>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic=new BonoEficienciaLogic();
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}
			
			//this.bonoeficienciaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.bonoeficienciaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBonoEficiencia);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBonoEficiencia);	
					}
					
					if(this.jInternalFrameImportacionBonoEficiencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBonoEficiencia);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBonoEficiencia!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBonoEficiencia);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBonoEficiencia);
				this.jInternalFrameDetalleFormBonoEficiencia.setVisible(false);
				this.jInternalFrameDetalleFormBonoEficiencia.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBonoEficiencia);
					this.jInternalFrameReporteDinamicoBonoEficiencia.setVisible(false);
					this.jInternalFrameReporteDinamicoBonoEficiencia.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBonoEficiencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBonoEficiencia);
					this.jInternalFrameImportacionBonoEficiencia.setVisible(false);
					this.jInternalFrameImportacionBonoEficiencia.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBonoEficiencia!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBonoEficiencia);
					this.jInternalFrameOrderByBonoEficiencia.setVisible(false);
					this.jInternalFrameOrderByBonoEficiencia.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBonoEficienciaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BonoEficienciaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.bonoeficienciaReturnGeneral=new BonoEficienciaParameterReturnGeneral();
			
			this.bonoeficienciaParameterGeneral=new BonoEficienciaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.bonoeficienciaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BonoEficienciaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BonoEficienciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),this.bonoeficienciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BonoEficienciaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),this.bonoeficienciaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBonoEficiencia=false;
			this.isVisibilidadCeldaDuplicarBonoEficiencia=true;
			this.isVisibilidadCeldaCopiarBonoEficiencia=true;
			this.isVisibilidadCeldaVerFormBonoEficiencia=true;
			this.isVisibilidadCeldaOrdenBonoEficiencia=true;
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
			this.isVisibilidadCeldaModificarBonoEficiencia=false;
			this.isVisibilidadCeldaActualizarBonoEficiencia=false;
			this.isVisibilidadCeldaEliminarBonoEficiencia=false;
			this.isVisibilidadCeldaCancelarBonoEficiencia=false;
			this.isVisibilidadCeldaGuardarBonoEficiencia=false;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBonoEficiencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBonoEficiencia();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBonoEficiencia(false);
			
			this.setPermisosUsuarioBonoEficiencia();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado() 
				|| (this.bonoeficienciaSessionBean.getEsGuardarRelacionado() && this.bonoeficienciaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBonoEficienciaClasesRelacionadas();
			}
			
			if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBonoEficienciaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBonoEficiencia();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBonoEficiencia();
			}
			
			if(!this.isPermisoBusquedaBonoEficiencia) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioBonoEficiencia,this.isPermisoPaginacionMedioBonoEficiencia,this.isPermisoPaginacionTodoBonoEficiencia);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BonoEficienciaConstantesFunciones.getTiposSeleccionarBonoEficiencia());
				
				this.tiposColumnasSelect=BonoEficienciaConstantesFunciones.getTiposSeleccionarBonoEficiencia(true);
				
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
			//if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBonoEficiencia();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioBonoEficiencia(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioBonoEficiencia(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBonoEficiencia() ;
			
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
				bonoeficienciaImplementable= (BonoEficienciaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BonoEficienciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				bonoeficienciaImplementableHome= (BonoEficienciaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BonoEficienciaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.bonoeficiencias= new ArrayList<BonoEficiencia>();
			this.bonoeficienciasEliminados= new ArrayList<BonoEficiencia>();
						
			this.isEsNuevoBonoEficiencia=false;
			this.esParaAccionDesdeFormularioBonoEficiencia=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBonoEficiencia(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBonoEficiencia();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BonoEficienciaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BonoEficienciaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBonoEficiencia("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBonoEficiencia(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBonoEficiencia();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBonoEficiencia();
			}
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBonoEficiencia.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBonoEficiencia.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBonoEficiencia.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBonoEficiencia(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga BonoEficiencia: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBonoEficiencia() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBonoEficiencia")) {
				iIndex=this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBonoEficiencia();	
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
	
	public void cargarCombosForeignKeyBonoEficiencia(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBonoEficiencia(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBonoEficiencia(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBonoEficienciaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBonoEficiencia();
		
		this.cargarCombosFrameForeignKeyBonoEficiencia();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBonoEficiencia();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBonoEficiencia();
		}
	}
	
	
	
	public void jButtonNuevoBonoEficienciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
			
			if(jTableDatosBonoEficiencia.getRowCount()>=1) {
				jTableDatosBonoEficiencia.removeRowSelectionInterval(0, jTableDatosBonoEficiencia.getRowCount()-1);						
			}
			
			this.isEsNuevoBonoEficiencia=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBonoEficiencia(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBonoEficiencia(true);			
			//this.bonoeficiencia=new BonoEficiencia();
			//this.bonoeficiencia.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBonoEficiencia(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBonoEficiencia() ;
			
			if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBonoEficiencia(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.bonoeficiencia);	
			this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);				
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
			if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar BonoEficiencia: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBonoEficienciaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBonoEficiencia.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBonoEficiencia.getSelectedRows().length;			
			}
			
			bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBonoEficiencia--;			
				//BonoEficiencia bonoeficienciaAux= new BonoEficiencia();			
				//bonoeficienciaAux.setId(this.iIdNuevoBonoEficiencia);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//BonoEficiencia bonoeficienciaOrigen=new BonoEficiencia();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(BonoEficiencia bonoeficienciaOrigen : bonoeficienciasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							bonoeficienciaOrigen =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bonoeficienciaOrigen =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBonoEficiencia();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.bonoeficiencia.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBonoEficiencia(bonoeficienciaOrigen,this.bonoeficiencia,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bonoeficienciaLogic.getBonoEficiencias().add(this.bonoeficienciaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bonoeficiencias.add(this.bonoeficienciaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBonoEficiencia(false);
				
				this.jTableDatosBonoEficiencia.setRowSelectionInterval(this.getIndiceNuevoBonoEficiencia(), this.getIndiceNuevoBonoEficiencia());
				
				int iLastRow =  this.jTableDatosBonoEficiencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBonoEficiencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBonoEficiencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBonoEficiencia(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();									
		
			BonoEficiencia bonoeficienciaOrigen=new BonoEficiencia();
			BonoEficiencia bonoeficienciaDestino=new BonoEficiencia();
				
			bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBonoEficiencia.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || bonoeficienciasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBonoEficiencia.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bonoeficienciaOrigen =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bonoeficienciaOrigen =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bonoeficienciaDestino =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bonoeficienciaDestino =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				bonoeficienciaOrigen =bonoeficienciasSeleccionados.get(0);
				bonoeficienciaDestino =bonoeficienciasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBonoEficiencia(bonoeficienciaOrigen,bonoeficienciaDestino,true,false);
				
				bonoeficienciaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bonoeficienciaDestino,bonoeficienciaLogic.getBonoEficiencias());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bonoeficienciaDestino,bonoeficiencias);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBonoEficiencia(false);
				
				//this.jTableDatosBonoEficiencia.setRowSelectionInterval(this.getIndiceNuevoBonoEficiencia(), this.getIndiceNuevoBonoEficiencia());
				
				int iLastRow =  this.jTableDatosBonoEficiencia.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBonoEficiencia.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBonoEficiencia.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBonoEficiencia(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBonoEficiencia.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBonoEficiencia.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBonoEficiencia.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBonoEficiencia.setVisible(!isVisible);
			this.jPanelPaginacionBonoEficiencia.setVisible(!isVisible);
			this.jPanelAccionesBonoEficiencia.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBonoEficiencia();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBonoEficiencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBonoEficiencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBonoEficiencia();
			
			this.abrirFrameOrderByBonoEficiencia();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBonoEficiencia();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBonoEficiencia(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBonoEficiencia);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBonoEficiencia.isMaximum()) {
					this.jInternalFrameDetalleFormBonoEficiencia.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBonoEficiencia.setSize(this.jInternalFrameDetalleFormBonoEficiencia.iWidthFormulario,this.jInternalFrameDetalleFormBonoEficiencia.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBonoEficiencia.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBonoEficiencia.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBonoEficiencia.isMaximum()) {
						this.jInternalFrameDetalleFormBonoEficiencia.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBonoEficiencia.jContentPaneDetalleBonoEficiencia.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBonoEficiencia.jContentPaneDetalleBonoEficiencia.getWidth(),BonoEficienciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBonoEficiencia.jContentPaneDetalleBonoEficiencia.getWidth(),BonoEficienciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBonoEficiencia.jContentPaneDetalleBonoEficiencia.getWidth(),BonoEficienciaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBonoEficiencia.setVisible(true);
	        this.jInternalFrameDetalleFormBonoEficiencia.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBonoEficiencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBonoEficiencia==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBonoEficiencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBonoEficiencia,false,this);
				} else {
					this.jInternalFrameOrderByBonoEficiencia=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBonoEficiencia,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBonoEficiencia);
				this.jInternalFrameOrderByBonoEficiencia.setVisible(false);
				this.jInternalFrameOrderByBonoEficiencia.setSelected(false);
				
				this.jInternalFrameOrderByBonoEficiencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBonoEficiencia"));
				
				this.inicializarActualizarBindingTablaOrderByBonoEficiencia();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBonoEficiencia() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBonoEficiencia==null) {
				
				this.jInternalFrameImportacionBonoEficiencia=new ImportacionJInternalFrame(BonoEficienciaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBonoEficiencia);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBonoEficiencia);
				this.jInternalFrameImportacionBonoEficiencia.setVisible(false);
				this.jInternalFrameImportacionBonoEficiencia.setSelected(false);


				this.jInternalFrameImportacionBonoEficiencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBonoEficiencia"));
				this.jInternalFrameImportacionBonoEficiencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBonoEficiencia"));
				this.jInternalFrameImportacionBonoEficiencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBonoEficiencia"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBonoEficiencia() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBonoEficiencia==null) {
				this.jInternalFrameReporteDinamicoBonoEficiencia=new ReporteDinamicoJInternalFrame(BonoEficienciaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBonoEficiencia);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBonoEficiencia);
				this.jInternalFrameReporteDinamicoBonoEficiencia.setVisible(false);
				this.jInternalFrameReporteDinamicoBonoEficiencia.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBonoEficiencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBonoEficiencia"));
				this.jInternalFrameReporteDinamicoBonoEficiencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBonoEficiencia"));
				this.jInternalFrameReporteDinamicoBonoEficiencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBonoEficiencia"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBonoEficiencia();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBonoEficiencia() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBonoEficiencia);
			
	       	this.jInternalFrameDetalleFormBonoEficiencia.setVisible(false);
	        this.jInternalFrameDetalleFormBonoEficiencia.setSelected(false);
			
			//this.jInternalFrameDetalleFormBonoEficiencia.dispose();
			//this.jInternalFrameDetalleFormBonoEficiencia=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBonoEficiencia() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBonoEficiencia.setVisible(true);
	        this.jInternalFrameReporteDinamicoBonoEficiencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBonoEficiencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBonoEficiencia.setVisible(true);
	        this.jInternalFrameImportacionBonoEficiencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBonoEficiencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBonoEficiencia.setVisible(true);
	        this.jInternalFrameOrderByBonoEficiencia.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBonoEficiencia() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBonoEficiencia.setVisible(false);
	        this.jInternalFrameOrderByBonoEficiencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBonoEficiencia() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBonoEficiencia.setVisible(false);
	        this.jInternalFrameReporteDinamicoBonoEficiencia.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBonoEficiencia() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBonoEficiencia.setVisible(false);
	        this.jInternalFrameImportacionBonoEficiencia.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBonoEficiencia(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBonoEficiencia(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBonoEficiencia(true);
			//this.isEsNuevoBonoEficiencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBonoEficiencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBonoEficiencia(false) ;
			
			if(bonoeficienciaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBonoEficiencia(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBonoEficiencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBonoEficienciaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBonoEficiencia(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBonoEficiencia(true);
			//this.isEsNuevoBonoEficiencia=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.bonoeficiencia.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBonoEficiencia("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBonoEficiencia(false) ;
			
			if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBonoEficiencia(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBonoEficiencia(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBonoEficiencia(false);
			
			//if(!this.isEsNuevoBonoEficiencia) {								
				int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
				
			}
			
			if(this.permiteMantenimiento(this.bonoeficiencia)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBonoEficiencia=true;
					this.inicializarActualizarBindingTablaBonoEficiencia(false);
					this.isEsNuevoBonoEficiencia=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBonoEficiencia=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBonoEficiencia=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBonoEficiencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBonoEficiencia(false);
				
				this.habilitarDeshabilitarControlesBonoEficiencia(false);
			
												
				
				if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBonoEficiencia();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBonoEficienciaActionPerformed(evt,bonoeficienciaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBonoEficiencia(this.bonoeficiencia,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBonoEficiencia.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,bonoeficienciaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.bonoeficiencia.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				this.bonoeficiencia.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				this.bonoeficiencia.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.bonoeficiencia)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BonoEficienciaModel) this.jTableDatosBonoEficiencia.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBonoEficiencia=true;
				this.inicializarActualizarBindingTablaBonoEficiencia(false);
				this.isEsNuevoBonoEficiencia=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBonoEficiencia(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBonoEficiencia(false);
				
				this.habilitarDeshabilitarControlesBonoEficiencia(false);
				
				
				
				if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBonoEficiencia();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBonoEficiencia.getRowCount()>=1) {
				jTableDatosBonoEficiencia.removeRowSelectionInterval(0, jTableDatosBonoEficiencia.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBonoEficiencia(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBonoEficiencia(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBonoEficiencia(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBonoEficiencia(false) ;
			
			this.isEsNuevoBonoEficiencia=false;
			
			if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBonoEficiencia();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBonoEficiencia(false);
				
				//SI ES MANUAL
				if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBonoEficiencia();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBonoEficiencia--;			
			//BonoEficiencia bonoeficienciaAux= new BonoEficiencia();			
			//bonoeficienciaAux.setId(this.iIdNuevoBonoEficiencia);
			
			if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBonoEficiencia();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
			
			this.bonoeficiencia.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.bonoeficienciaLogic.getBonoEficiencias().add(this.bonoeficienciaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.bonoeficiencias.add(this.bonoeficienciaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBonoEficiencia(false);
			
			this.jTableDatosBonoEficiencia.setRowSelectionInterval(this.getIndiceNuevoBonoEficiencia(), this.getIndiceNuevoBonoEficiencia());
			
			int iLastRow =  this.jTableDatosBonoEficiencia.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBonoEficiencia.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBonoEficiencia.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBonoEficiencia(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBonoEficiencia(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBonoEficiencia(false);
			
			//SI ES MANUAL
			if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBonoEficiencia();
			}
			
			//this.abrirFrameTreeBonoEficiencia();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Bono EficienciaS ?", "MANTENIMIENTO DE Bono Eficiencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionBonoEficiencia.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralBonoEficiencia();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.bonoeficienciaReturnGeneral=bonoeficienciaLogic.procesarImportacionBonoEficienciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.bonoeficienciaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarBonoEficienciaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBonoEficiencia.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBonoEficiencia.setFileImportacion(this.jInternalFrameImportacionBonoEficiencia.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBonoEficiencia.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBonoEficiencia.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBonoEficiencia.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBonoEficiencia.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		

		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BonoEficienciaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BonoEficienciaBaseDesign.jrxml";
			
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
			
			this.generarReporteBonoEficiencias("Todos",bonoeficienciasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BonoEficienciaConstantesFunciones.LABEL_DIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_as_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_as_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_as_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_as_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BonoEficienciaConstantesFunciones.LABEL_VALOR:
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
		
		if(this.jInternalFrameReporteDinamicoBonoEficiencia.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case BonoEficienciaConstantesFunciones.LABEL_DIAS:
					sNombreCampoCategoria="dias";
					break;

				case BonoEficienciaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case BonoEficienciaConstantesFunciones.LABEL_DIAS:
					sNombreCampoCategoriaValor="dias";
					break;

				case BonoEficienciaConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case BonoEficienciaConstantesFunciones.LABEL_DIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"dias");
					break;

				case BonoEficienciaConstantesFunciones.LABEL_VALOR:
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
	
	public void jButtonGenerarExcelReporteDinamicoBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bonoeficiencia";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("BonoEficiencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(BonoEficiencia bonoeficiencia:bonoeficienciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bonoeficiencia.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BonoEficienciaConstantesFunciones.LABEL_DIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_DIAS);
					iRow++;

					for(BonoEficiencia bonoeficiencia:bonoeficienciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bonoeficiencia.getdias());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BonoEficienciaConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(BonoEficiencia bonoeficiencia:bonoeficienciasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bonoeficiencia.getvalor());
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
			//	this.getFilaCabeceraExportarExcelBonoEficiencia(row);				
			//	iRow++;
			//}				
			
			//for(BonoEficiencia bonoeficienciaAux:bonoeficienciasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBonoEficiencia(bonoeficienciaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
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
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBonoEficiencia(false);
			
			//SI ES MANUAL
			if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBonoEficiencia();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBonoEficiencia(false);
			
			//SI ES MANUAL
			if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBonoEficiencia();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBonoEficiencia(false);
			
			//SI ES MANUAL
			if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBonoEficiencia();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBonoEficiencia() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBonoEficiencia.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBonoEficiencia.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBonoEficiencia.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBonoEficiencia.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBonoEficiencia.setMinimumSize(dimensionMinimum);
		this.jTableDatosBonoEficiencia.setMaximumSize(dimensionMaximum);
		this.jTableDatosBonoEficiencia.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBonoEficiencia(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBonoEficiencia(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBonoEficiencia(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBonoEficiencia(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBonoEficiencia(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBonoEficiencia(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBonoEficiencia(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBonoEficiencia(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBonoEficiencia() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBonoEficiencia();
		
		this.inicializarActualizarBindingBotonesManualBonoEficiencia(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBonoEficiencia();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBonoEficiencia() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBonoEficiencia(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBonoEficiencia(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBonoEficiencia.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBonoEficiencia.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBonoEficiencia.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBonoEficiencia.jCheckBoxPostAccionNuevoBonoEficiencia.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBonoEficiencia.jCheckBoxPostAccionSinCerrarBonoEficiencia.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBonoEficiencia.jCheckBoxPostAccionSinMensajeBonoEficiencia.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBonoEficiencia.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBonoEficiencia.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBonoEficiencia.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
				this.jInternalFrameDetalleFormBonoEficiencia.jCheckBoxPostAccionNuevoBonoEficiencia.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBonoEficiencia.jCheckBoxPostAccionSinCerrarBonoEficiencia.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBonoEficiencia.jCheckBoxPostAccionSinMensajeBonoEficiencia.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBonoEficiencia.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBonoEficiencia.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBonoEficiencia.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBonoEficiencia.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBonoEficiencia.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBonoEficiencia.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBonoEficiencia.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBonoEficiencia.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBonoEficiencia.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBonoEficiencia(Boolean esInicializar) throws Exception {
		try	{	
			if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBonoEficiencia(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBonoEficiencia() throws Exception {
		try	{
			if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBonoEficiencia();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBonoEficiencia() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBonoEficiencia() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBonoEficiencia.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBonoEficiencia.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBonoEficiencia.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBonoEficiencia.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBonoEficiencia.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBonoEficiencia.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBonoEficiencia.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBonoEficiencia.addItem(reporte);
			}
			
			
			if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBonoEficiencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBonoEficiencia.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBonoEficiencia.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBonoEficiencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBonoEficiencia.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBonoEficiencia.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBonoEficiencia.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBonoEficiencia.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBonoEficiencia.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBonoEficiencia();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBonoEficiencia() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
				this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
				this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
				
				if(this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBonoEficiencia.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=BonoEficienciaConstantesFunciones.getTiposSeleccionarBonoEficiencia(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=BonoEficienciaConstantesFunciones.getTiposSeleccionarBonoEficiencia(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=BonoEficienciaConstantesFunciones.getTiposSeleccionarBonoEficiencia(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoBonoEficiencia.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBonoEficiencia()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBonoEficiencia(Boolean esInicializar) throws Exception {				
		if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBonoEficiencia();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBonoEficiencia() throws Exception {
		this.inicializarActualizarBindingTablaBonoEficiencia(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBonoEficiencia() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BonoEficienciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BonoEficienciaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBonoEficienciaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBonoEficienciaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BonoEficienciaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BonoEficienciaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBonoEficiencia(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=bonoeficienciaLogic.getBonoEficiencias().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=bonoeficiencias.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBonoEficiencia.setModel(new BonoEficienciaModel(this.bonoeficienciaLogic.getBonoEficiencias(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBonoEficiencia.setModel(new BonoEficienciaModel(this.bonoeficiencias,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBonoEficiencia!=null && this.jInternalFrameOrderByBonoEficiencia.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBonoEficiencia();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBonoEficiencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBonoEficiencia,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BonoEficienciaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO,bonoeficienciaConstantesFunciones.resaltarSeleccionarBonoEficiencia,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BonoEficienciaConstantesFunciones.SCLASSWEBTITULO,bonoeficienciaConstantesFunciones.resaltarSeleccionarBonoEficiencia,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBonoEficiencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBonoEficiencia,BonoEficienciaConstantesFunciones.LABEL_ID));

		if(this.bonoeficienciaConstantesFunciones.mostraridBonoEficiencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BonoEficienciaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bonoeficienciaConstantesFunciones.resaltaridBonoEficiencia,this.bonoeficienciaConstantesFunciones.activaridBonoEficiencia,iSizeTabla,this,true,"idBonoEficiencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bonoeficienciaConstantesFunciones.resaltaridBonoEficiencia,this.bonoeficienciaConstantesFunciones.activaridBonoEficiencia,this,true,"idBonoEficiencia","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBonoEficiencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBonoEficiencia,BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.bonoeficienciaConstantesFunciones.mostrarid_empresaBonoEficiencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.bonoeficienciaConstantesFunciones.resaltarid_empresaBonoEficiencia,this,this.bonoeficienciaConstantesFunciones.activarid_empresaBonoEficiencia,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.bonoeficienciaConstantesFunciones.resaltarid_empresaBonoEficiencia,this,this.bonoeficienciaConstantesFunciones.activarid_empresaBonoEficiencia,false,"id_empresaBonoEficiencia","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BonoEficienciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBonoEficiencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBonoEficiencia,BonoEficienciaConstantesFunciones.LABEL_DIAS));

		if(this.bonoeficienciaConstantesFunciones.mostrardiasBonoEficiencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BonoEficienciaConstantesFunciones.LABEL_DIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bonoeficienciaConstantesFunciones.resaltardiasBonoEficiencia,this.bonoeficienciaConstantesFunciones.activardiasBonoEficiencia,iSizeTabla,this,true,"diasBonoEficiencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bonoeficienciaConstantesFunciones.resaltardiasBonoEficiencia,this.bonoeficienciaConstantesFunciones.activardiasBonoEficiencia,this,true,"diasBonoEficiencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BonoEficienciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBonoEficiencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBonoEficiencia,BonoEficienciaConstantesFunciones.LABEL_VALOR));

		if(this.bonoeficienciaConstantesFunciones.mostrarvalorBonoEficiencia && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BonoEficienciaConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bonoeficienciaConstantesFunciones.resaltarvalorBonoEficiencia,this.bonoeficienciaConstantesFunciones.activarvalorBonoEficiencia,iSizeTabla,this,true,"valorBonoEficiencia","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bonoeficienciaConstantesFunciones.resaltarvalorBonoEficiencia,this.bonoeficienciaConstantesFunciones.activarvalorBonoEficiencia,this,true,"valorBonoEficiencia","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BonoEficienciaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBonoEficiencia.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBonoEficiencia.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBonoEficiencia.addColumn(tableColumn);
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
			
			this.jTableDatosBonoEficiencia.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBonoEficiencia.moveColumn(this.jTableDatosBonoEficiencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBonoEficiencia.moveColumn(this.jTableDatosBonoEficiencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBonoEficiencia.moveColumn(this.jTableDatosBonoEficiencia.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBonoEficiencia.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBonoEficiencia.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBonoEficiencia,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBonoEficiencia.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBonoEficiencia.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBonoEficiencia.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBonoEficiencia.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBonoEficiencia.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=bonoeficienciaLogic.getBonoEficiencias().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=bonoeficiencias.size()-1;
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
		//this.jTableDatosBonoEficiencia.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBonoEficiencia.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBonoEficiencia();
			
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
				
				//this.isEsNuevoBonoEficiencia=false;
					
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
				if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBonoEficiencia==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBonoEficiencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBonoEficiencia.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.bonoeficiencia.getsType().equals("DUPLICADO")
				   || this.bonoeficiencia.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBonoEficiencia=true;
				
				} else {
					this.isEsNuevoBonoEficiencia=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
					if(this.bonoeficiencia.getId()>=0 && !this.bonoeficiencia.getIsNew()) {						
						this.isEsNuevoBonoEficiencia=false;
						
					} else {
						this.isEsNuevoBonoEficiencia=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBonoEficiencia(esRelaciones);						
				
				this.seleccionarBonoEficiencia(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.bonoeficiencia.getId()<0) {
					this.isEsNuevoBonoEficiencia=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBonoEficiencia(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBonoEficiencia(evt,rowIndex);
				}	
				
				if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion BonoEficiencia: " + this.dDif); 
					}
				}								
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBonoEficiencia(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.bonoeficiencia)) {
					if(this.bonoeficiencia.getId()>0) {
						this.bonoeficiencia.setIsDeleted(true);
						
						this.bonoeficienciasEliminados.add(this.bonoeficiencia);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bonoeficienciaLogic.getBonoEficiencias().remove(this.bonoeficiencia);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bonoeficiencias.remove(this.bonoeficiencia);				
					}
					
					
					((BonoEficienciaModel) this.jTableDatosBonoEficiencia.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBonoEficiencia(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBonoEficiencia(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBonoEficiencia) {
			
			if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBonoEficiencia.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBonoEficiencia.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBonoEficiencia(this.bonoeficiencia);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.bonoeficienciaConstantesFunciones.cargarid_empresaBonoEficiencia || this.bonoeficienciaConstantesFunciones.event_dependid_empresaBonoEficiencia) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.bonoeficiencia.getid_empresa());
									//this.inicializarActualizarBindingBonoEficiencia(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(bonoeficiencia.getEmpresa()!=null) {
							this.empresasForeignKey.add(bonoeficiencia.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.bonoeficiencia.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBonoEficiencia("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBonoEficiencia(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBonoEficiencia() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBonoEficiencia(BonoEficiencia bonoeficiencia) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBonoEficiencia(bonoeficiencia,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBonoEficiencia(BonoEficiencia bonoeficiencia,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBonoEficiencia(bonoeficiencia);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBonoEficiencia(bonoeficiencia,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBonoEficiencia(bonoeficiencia);
	}
	
	public void setVariablesObjetoActualToFormularioBonoEficiencia(BonoEficiencia bonoeficiencia) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.setText(bonoeficiencia.getId().toString());
			this.jInternalFrameDetalleFormBonoEficiencia.jTextFielddiasBonoEficiencia.setText(bonoeficiencia.getdias().toString());
			this.jInternalFrameDetalleFormBonoEficiencia.jTextFieldvalorBonoEficiencia.setText(bonoeficiencia.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,BonoEficiencia bonoeficienciaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,bonoeficienciaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,BonoEficiencia bonoeficienciaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				bonoeficienciaLocal=this.bonoeficiencia;
			} else {
				bonoeficienciaLocal=this.bonoeficienciaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(bonoeficienciaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBonoEficiencia(bonoeficienciaLocal,true);
					
					if(bonoeficienciaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(bonoeficienciaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(bonoeficienciaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBonoEficiencia(BonoEficiencia bonoeficiencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBonoEficiencia(bonoeficiencia,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(bonoeficiencia);
	}
	
	public void setVariablesFormularioToObjetoActualBonoEficiencia(BonoEficiencia bonoeficiencia,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBonoEficiencia(bonoeficiencia,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBonoEficiencia(BonoEficiencia bonoeficiencia,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.getText()==null || this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.getText()=="" || this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.getText()=="Id") {
				this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.setText("0");
			}

			if(conColumnasBase) {bonoeficiencia.setId(Long.parseLong(this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BonoEficienciaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBonoEficiencia.jLabelIdBonoEficiencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bonoeficiencia.setdias(Integer.parseInt(this.jInternalFrameDetalleFormBonoEficiencia.jTextFielddiasBonoEficiencia.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BonoEficienciaConstantesFunciones.LABEL_DIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBonoEficiencia.jLabeldiasBonoEficiencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bonoeficiencia.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormBonoEficiencia.jTextFieldvalorBonoEficiencia.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BonoEficienciaConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBonoEficiencia.jLabelvalorBonoEficiencia,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBonoEficiencia(BonoEficiencia bonoeficienciaBean,BonoEficiencia bonoeficiencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBonoEficiencia(BonoEficiencia bonoeficienciaOrigen,BonoEficiencia bonoeficiencia,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bonoeficienciaOrigen.getId()!=null && !bonoeficienciaOrigen.getId().equals(0L))) {bonoeficiencia.setId(bonoeficienciaOrigen.getId());}}
			if(conDefault || (!conDefault && bonoeficienciaOrigen.getdias()!=null && !bonoeficienciaOrigen.getdias().equals(0))) {bonoeficiencia.setdias(bonoeficienciaOrigen.getdias());}
			if(conDefault || (!conDefault && bonoeficienciaOrigen.getvalor()!=null && !bonoeficienciaOrigen.getvalor().equals(0.0))) {bonoeficiencia.setvalor(bonoeficienciaOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBonoEficiencia(BonoEficiencia bonoeficiencia) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.setText(bonoeficiencia.getId().toString());
			this.jInternalFrameDetalleFormBonoEficiencia.jTextFielddiasBonoEficiencia.setText(bonoeficiencia.getdias().toString());
			this.jInternalFrameDetalleFormBonoEficiencia.jTextFieldvalorBonoEficiencia.setText(bonoeficiencia.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBonoEficiencia(BonoEficienciaBean bonoeficienciaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.setText(bonoeficienciaBean.getId().toString());
			this.jInternalFrameDetalleFormBonoEficiencia.jTextFielddiasBonoEficiencia.setText(bonoeficienciaBean.getdias().toString());
			this.jInternalFrameDetalleFormBonoEficiencia.jTextFieldvalorBonoEficiencia.setText(bonoeficienciaBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBonoEficiencia(BonoEficienciaParameterReturnGeneral bonoeficienciaReturnGeneral,BonoEficienciaBean bonoeficienciaBean,Boolean conDefault) throws Exception { 
		try {
			BonoEficiencia bonoeficienciaLocal=new BonoEficiencia();
			
			bonoeficienciaLocal=bonoeficienciaReturnGeneral.getBonoEficiencia();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bonoeficienciaLocal.getId()!=null && !bonoeficienciaLocal.getId().equals(0L))) {bonoeficienciaBean.setId(bonoeficienciaLocal.getId());}}
			if(conDefault || (!conDefault && bonoeficienciaLocal.getdias()!=null && !bonoeficienciaLocal.getdias().equals(0))) {bonoeficienciaBean.setdias(bonoeficienciaLocal.getdias());}
			if(conDefault || (!conDefault && bonoeficienciaLocal.getvalor()!=null && !bonoeficienciaLocal.getvalor().equals(0.0))) {bonoeficienciaBean.setvalor(bonoeficienciaLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBonoEficienciaGenerico(Long idBonoEficienciaSeleccionado,JComboBox jComboBoxBonoEficiencia,List<BonoEficiencia> bonoeficienciasLocal)throws Exception {
		try {
			BonoEficiencia  bonoeficienciaTemp=null;

			for(BonoEficiencia bonoeficienciaAux:bonoeficienciasLocal) {
				if(bonoeficienciaAux.getId()!=null && bonoeficienciaAux.getId().equals(idBonoEficienciaSeleccionado)) {
					bonoeficienciaTemp=bonoeficienciaAux;
					break;
				}
			}

			jComboBoxBonoEficiencia.setSelectedItem(bonoeficienciaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBonoEficienciaGenerico(JComboBox jComboBoxBonoEficiencia,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBonoEficiencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBonoEficiencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBonoEficiencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBonoEficiencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBonoEficiencia.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBonoEficiencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBonoEficiencia.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBonoEficiencia.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBonoEficiencia.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBonoEficiencia.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bonoeficiencia=(BonoEficiencia) bonoeficienciaLogic.getBonoEficiencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bonoeficiencia =(BonoEficiencia) bonoeficiencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!bonoeficiencia.getIsNew() && !bonoeficiencia.getIsChanged() && !bonoeficiencia.getIsDeleted()) {
				sDescripcion=bonoeficiencia.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=bonoeficiencia.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		BonoEficiencia bonoeficienciaRow=new BonoEficiencia();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bonoeficienciaRow=(BonoEficiencia) bonoeficienciaLogic.getBonoEficiencias().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bonoeficienciaRow=(BonoEficiencia) bonoeficiencias.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBonoEficiencia(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoBonoEficiencia && this.isPermisoNuevoBonoEficiencia));			
			this.jButtonDuplicarBonoEficiencia.setVisible((this.isVisibilidadCeldaDuplicarBonoEficiencia && this.isPermisoDuplicarBonoEficiencia));			
			this.jButtonCopiarBonoEficiencia.setVisible((this.isVisibilidadCeldaCopiarBonoEficiencia && this.isPermisoCopiarBonoEficiencia));
			this.jButtonVerFormBonoEficiencia.setVisible((this.isVisibilidadCeldaVerFormBonoEficiencia && this.isPermisoVerFormBonoEficiencia));
			
			this.jButtonAbrirOrderByBonoEficiencia.setVisible((this.isVisibilidadCeldaOrdenBonoEficiencia && this.isPermisoOrdenBonoEficiencia));			
			
			this.jButtonNuevoRelacionesBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia && this.isPermisoNuevoBonoEficiencia));			
			this.jButtonNuevoGuardarCambiosBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoBonoEficiencia && this.isPermisoNuevoBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));
			
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarBonoEficiencia.setVisible((this.isVisibilidadCeldaModificarBonoEficiencia && this.isPermisoActualizarBonoEficiencia));	
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarBonoEficiencia.setVisible((this.isVisibilidadCeldaActualizarBonoEficiencia && this.isPermisoActualizarBonoEficiencia));	
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarBonoEficiencia.setVisible((this.isVisibilidadCeldaEliminarBonoEficiencia && this.isPermisoEliminarBonoEficiencia));
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarBonoEficiencia.setVisible(this.isVisibilidadCeldaCancelarBonoEficiencia);							
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosBonoEficiencia.setVisible((this.isVisibilidadCeldaGuardarBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));			
			
			}
						
			this.jButtonGuardarCambiosTablaBonoEficiencia.setVisible((this.isVisibilidadCeldaGuardarCambiosBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoBonoEficiencia && this.isPermisoNuevoBonoEficiencia));						
			this.jButtonDuplicarToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaDuplicarBonoEficiencia && this.isPermisoDuplicarBonoEficiencia));						
			this.jButtonCopiarToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaCopiarBonoEficiencia && this.isPermisoCopiarBonoEficiencia));			
			this.jButtonVerFormToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaVerFormBonoEficiencia && this.isPermisoVerFormBonoEficiencia));			
			this.jButtonAbrirOrderByToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaOrdenBonoEficiencia && this.isPermisoOrdenBonoEficiencia));
			this.jButtonNuevoRelacionesToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia && this.isPermisoNuevoBonoEficiencia));			
			this.jButtonNuevoGuardarCambiosToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoBonoEficiencia && this.isPermisoNuevoBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));			
			
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaModificarBonoEficiencia && this.isPermisoActualizarBonoEficiencia));	
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaActualizarBonoEficiencia  && this.isPermisoActualizarBonoEficiencia));	
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaEliminarBonoEficiencia && this.isPermisoEliminarBonoEficiencia));
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarToolBarBonoEficiencia.setVisible(this.isVisibilidadCeldaCancelarBonoEficiencia);				
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaGuardarBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBonoEficiencia.setVisible((this.isVisibilidadCeldaGuardarCambiosBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoBonoEficiencia && this.isPermisoNuevoBonoEficiencia));			
			this.jMenuItemDuplicarBonoEficiencia.setVisible((this.isVisibilidadCeldaDuplicarBonoEficiencia && this.isPermisoDuplicarBonoEficiencia));			
			this.jMenuItemCopiarBonoEficiencia.setVisible((this.isVisibilidadCeldaCopiarBonoEficiencia && this.isPermisoCopiarBonoEficiencia));			
			this.jMenuItemVerFormBonoEficiencia.setVisible((this.isVisibilidadCeldaVerFormBonoEficiencia && this.isPermisoVerFormBonoEficiencia));			
			this.jMenuItemAbrirOrderByBonoEficiencia.setVisible((this.isVisibilidadCeldaOrdenBonoEficiencia && this.isPermisoOrdenBonoEficiencia));			
			//this.jMenuItemMostrarOcultarBonoEficiencia.setVisible((this.isVisibilidadCeldaOrdenBonoEficiencia && this.isPermisoOrdenBonoEficiencia));
			this.jMenuItemDetalleAbrirOrderByBonoEficiencia.setVisible((this.isVisibilidadCeldaOrdenBonoEficiencia && this.isPermisoOrdenBonoEficiencia));			
			//this.jMenuItemDetalleMostrarOcultarBonoEficiencia.setVisible((this.isVisibilidadCeldaOrdenBonoEficiencia && this.isPermisoOrdenBonoEficiencia));			
			this.jMenuItemNuevoRelacionesBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia && this.isPermisoNuevoBonoEficiencia));			
			this.jMenuItemNuevoGuardarCambiosBonoEficiencia.setVisible((this.isVisibilidadCeldaNuevoBonoEficiencia && this.isPermisoNuevoBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));									
			
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemModificarBonoEficiencia.setVisible((this.isVisibilidadCeldaModificarBonoEficiencia && this.isPermisoActualizarBonoEficiencia));	
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemActualizarBonoEficiencia.setVisible((this.isVisibilidadCeldaActualizarBonoEficiencia && this.isPermisoActualizarBonoEficiencia));	
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemEliminarBonoEficiencia.setVisible((this.isVisibilidadCeldaEliminarBonoEficiencia && this.isPermisoEliminarBonoEficiencia));
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemCancelarBonoEficiencia.setVisible(this.isVisibilidadCeldaCancelarBonoEficiencia);				
			}
			
			this.jMenuItemGuardarCambiosBonoEficiencia.setVisible((this.isVisibilidadCeldaGuardarBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));						
			this.jMenuItemGuardarCambiosTablaBonoEficiencia.setVisible((this.isVisibilidadCeldaGuardarCambiosBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBonoEficiencia=this.jButtonNuevoBonoEficiencia.isVisible();
			this.isVisibilidadCeldaDuplicarBonoEficiencia=this.jButtonDuplicarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaCopiarBonoEficiencia=this.jButtonCopiarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaVerFormBonoEficiencia=this.jButtonVerFormBonoEficiencia.isVisible();
			
			this.isVisibilidadCeldaOrdenBonoEficiencia=this.jButtonAbrirOrderByBonoEficiencia.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=this.jButtonNuevoRelacionesBonoEficiencia.isVisible();
			this.isVisibilidadCeldaModificarBonoEficiencia=this.jButtonModificarBonoEficiencia.isVisible();
			
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			this.isVisibilidadCeldaActualizarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaEliminarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaCancelarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaGuardarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosBonoEficiencia.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=this.jButtonGuardarCambiosTablaBonoEficiencia.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBonoEficiencia=this.jButtonNuevoToolBarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=this.jButtonNuevoRelacionesToolBarBonoEficiencia.isVisible();
			
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			this.isVisibilidadCeldaModificarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarToolBarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaActualizarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarToolBarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaEliminarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarToolBarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaCancelarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarToolBarBonoEficiencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBonoEficiencia=this.jButtonGuardarCambiosToolBarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=this.jButtonGuardarCambiosTablaToolBarBonoEficiencia.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBonoEficiencia=this.jMenuItemNuevoBonoEficiencia.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=this.jMenuItemNuevoRelacionesBonoEficiencia.isVisible();
			
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			this.isVisibilidadCeldaModificarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemModificarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaActualizarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemActualizarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaEliminarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemEliminarBonoEficiencia.isVisible();
			this.isVisibilidadCeldaCancelarBonoEficiencia=this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemCancelarBonoEficiencia.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBonoEficiencia=this.jMenuItemGuardarCambiosBonoEficiencia.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=this.jMenuItemGuardarCambiosTablaBonoEficiencia.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBonoEficiencia(Boolean esInicializar) {
		if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
				//if(this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBonoEficiencia();
			}
			
			this.inicializarActualizarBindingBotonesManualBonoEficiencia(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBonoEficiencia() {
		this.jButtonNuevoBonoEficiencia.setVisible(this.isPermisoNuevoBonoEficiencia);			
		this.jButtonDuplicarBonoEficiencia.setVisible(this.isPermisoDuplicarBonoEficiencia);			
		this.jButtonCopiarBonoEficiencia.setVisible(this.isPermisoCopiarBonoEficiencia);			
		this.jButtonVerFormBonoEficiencia.setVisible(this.isPermisoVerFormBonoEficiencia);			
		
		this.jButtonAbrirOrderByBonoEficiencia.setVisible(this.isPermisoOrdenBonoEficiencia);					
		
		this.jButtonNuevoRelacionesBonoEficiencia.setVisible(this.isPermisoNuevoBonoEficiencia);			
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarBonoEficiencia.setVisible(this.isPermisoActualizarBonoEficiencia);	
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarBonoEficiencia.setVisible(this.isPermisoActualizarBonoEficiencia);	
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarBonoEficiencia.setVisible(this.isPermisoEliminarBonoEficiencia);
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarBonoEficiencia.setVisible(this.isVisibilidadCeldaCancelarBonoEficiencia);						
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosBonoEficiencia.setVisible(this.isPermisoGuardarCambiosBonoEficiencia);							
		}
		
		this.jButtonGuardarCambiosTablaBonoEficiencia.setVisible(this.isPermisoActualizarBonoEficiencia);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBonoEficiencia() {
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarBonoEficiencia.setVisible(this.isPermisoActualizarBonoEficiencia);	
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarBonoEficiencia.setVisible(this.isPermisoActualizarBonoEficiencia);	
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarBonoEficiencia.setVisible(this.isPermisoEliminarBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarBonoEficiencia.setVisible(this.isVisibilidadCeldaCancelarBonoEficiencia);							
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosBonoEficiencia.setVisible((this.isVisibilidadCeldaGuardarBonoEficiencia && this.isPermisoGuardarCambiosBonoEficiencia));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBonoEficiencia() {
		if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBonoEficiencia();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBonoEficiencia() {
	}
	
	public void jTableDatosBonoEficienciaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBonoEficiencia(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBonoEficienciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.getbonoeficiencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bonoeficiencia==null) {
						this.bonoeficiencia = new BonoEficiencia();
					}

					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
				}

				if(this.bonoeficiencia.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.bonoeficiencia.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBonoEficiencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBonoEficienciaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBonoEficiencia(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBonoEficiencia.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBonoEficiencia.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBonoEficiencia(this.getbonoeficiencia(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.bonoeficienciaLogic.getConnexion());

				if(this.bonoeficiencia.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.bonoeficiencia.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBonoEficiencia=(TitledBorder)this.jScrollPanelDatosBonoEficiencia.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBonoEficiencia.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBonoEficienciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.getbonoeficiencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bonoeficiencia==null) {
						this.bonoeficiencia = new BonoEficiencia();
					}

					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
				}

				if(this.bonoeficiencia.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.bonoeficiencia.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBonoEficiencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondiasBonoEficienciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.getbonoeficiencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bonoeficiencia==null) {
						this.bonoeficiencia = new BonoEficiencia();
					}

					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
				}

				if(this.bonoeficiencia.getdias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where dias = "+this.bonoeficiencia.getdias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBonoEficiencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorBonoEficienciaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.getbonoeficiencia(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bonoeficiencia==null) {
						this.bonoeficiencia = new BonoEficiencia();
					}

					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);
				}

				if(this.bonoeficiencia.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.bonoeficiencia.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBonoEficiencia(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaBonoEficienciaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBonoEficiencia(false,false);

			this.getBonoEficienciasFK_IdEmpresa();

			this.inicializarActualizarBindingBonoEficiencia(false);

			//if(BonoEficienciaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBonoEficiencia(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bonoeficienciaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBonoEficiencia() {
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
			this.jInternalFrameDetalleFormBonoEficiencia.setVisible(false);	    			
			this.jInternalFrameDetalleFormBonoEficiencia.dispose();
			this.jInternalFrameDetalleFormBonoEficiencia=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
			this.jInternalFrameReporteDinamicoBonoEficiencia.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBonoEficiencia.dispose();
			this.jInternalFrameReporteDinamicoBonoEficiencia=null;
		}
		
		if(this.jInternalFrameImportacionBonoEficiencia!=null) {
			this.jInternalFrameImportacionBonoEficiencia.setVisible(false);	    			
			this.jInternalFrameImportacionBonoEficiencia.dispose();
			this.jInternalFrameImportacionBonoEficiencia=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBonoEficiencia();
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
			
			if(sTipo.equals("NuevoBonoEficiencia")) {
				jButtonNuevoBonoEficienciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBonoEficiencia")) {
				jButtonDuplicarBonoEficienciaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBonoEficiencia")) {
				jButtonCopiarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormBonoEficiencia")) {
				jButtonVerFormBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBonoEficiencia")) {
				jButtonNuevoBonoEficienciaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBonoEficiencia")) {
				jButtonDuplicarBonoEficienciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBonoEficiencia")) {
				jButtonNuevoBonoEficienciaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBonoEficiencia")) {
				jButtonDuplicarBonoEficienciaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBonoEficiencia")) {
				jButtonNuevoBonoEficienciaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBonoEficiencia")) {
				jButtonNuevoBonoEficienciaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBonoEficiencia")) {
				jButtonNuevoBonoEficienciaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBonoEficiencia")) {
				jButtonModificarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBonoEficiencia")) {
				jButtonModificarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBonoEficiencia")) {
				jButtonModificarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBonoEficiencia")) {
				jButtonActualizarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBonoEficiencia")) {
				jButtonActualizarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBonoEficiencia")) {
				jButtonActualizarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarBonoEficiencia")) {
				jButtonEliminarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBonoEficiencia")) {
				jButtonEliminarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBonoEficiencia")) {
				jButtonEliminarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarBonoEficiencia")) {
				jButtonCancelarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBonoEficiencia")) {
				jButtonCancelarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBonoEficiencia")) {
				jButtonCancelarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarBonoEficiencia")) {
				jButtonCerrarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBonoEficiencia")) {
				jButtonCerrarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBonoEficiencia")) {
				jButtonCerrarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBonoEficiencia")) {
				jButtonMostrarOcultarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBonoEficiencia")) {
				jButtonCancelarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBonoEficiencia")) {
				jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBonoEficiencia")) {
				jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBonoEficiencia")) {
				jButtonCopiarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBonoEficiencia")) {
				jButtonVerFormBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBonoEficiencia")) {
				jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBonoEficiencia")) {
				jButtonCopiarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBonoEficiencia")) {
				jButtonVerFormBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBonoEficiencia")) {
				jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBonoEficiencia")) {
				jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBonoEficiencia")) {
				jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBonoEficiencia")) {
				jButtonRecargarInformacionBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBonoEficiencia")) {
				jButtonRecargarInformacionBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBonoEficiencia")) {
				jButtonRecargarInformacionBonoEficienciaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBonoEficiencia")) {
				jButtonAnterioresBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBonoEficiencia")) {
				jButtonAnterioresBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBonoEficiencia")) {
				jButtonAnterioresBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBonoEficiencia")) {
				jButtonSiguientesBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBonoEficiencia")) {
				jButtonSiguientesBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBonoEficiencia")) {
				jButtonSiguientesBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBonoEficiencia") || sTipo.equals("MenuItemDetalleAbrirOrderByBonoEficiencia")) {
				jButtonAbrirOrderByBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBonoEficiencia") || sTipo.equals("MenuItemDetalleMostrarOcultarBonoEficiencia")) {
				jButtonMostrarOcultarBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBonoEficiencia")) {
				jButtonNuevoGuardarCambiosBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBonoEficiencia")) {
				jButtonNuevoGuardarCambiosBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBonoEficiencia")) {
				jButtonNuevoGuardarCambiosBonoEficienciaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBonoEficiencia")) {
				jButtonCerrarReporteDinamicoBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBonoEficiencia")) {
				jButtonGenerarReporteDinamicoBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBonoEficiencia")) {
				
				jButtonGenerarExcelReporteDinamicoBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBonoEficiencia")) {
				jButtonCerrarImportacionBonoEficienciaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBonoEficiencia")) {
				
				jButtonGenerarImportacionBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBonoEficiencia")) {
				
				jButtonAbrirImportacionBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBonoEficiencia")) {
				jComboBoxTiposAccionesBonoEficienciaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBonoEficiencia")) {
				jComboBoxTiposRelacionesBonoEficienciaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBonoEficiencia")) {
				jComboBoxTiposAccionesBonoEficienciaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBonoEficiencia")) {
				
				jComboBoxTiposSeleccionarBonoEficienciaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBonoEficiencia")) {
				jTextFieldValorCampoGeneralBonoEficienciaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBonoEficiencia")) {
				jButtonAbrirOrderByBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBonoEficiencia")) {
				jButtonAbrirOrderByBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBonoEficiencia")) {
				jButtonCerrarOrderByBonoEficienciaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBonoEficienciaBusqueda")) {
				this.jButtonidBonoEficienciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBonoEficienciaUpdate")) {
				this.jButtonid_empresaBonoEficienciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBonoEficienciaBusqueda")) {
				this.jButtonid_empresaBonoEficienciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diasBonoEficienciaBusqueda")) {
				this.jButtondiasBonoEficienciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorBonoEficienciaBusqueda")) {
				this.jButtonvalorBonoEficienciaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBonoEficiencia();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBonoEficienciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				


				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			BonoEficiencia bonoeficienciaLocal=null;
			
			if(!this.getEsControlTabla()) {
				bonoeficienciaLocal=this.bonoeficiencia;
			} else {
				bonoeficienciaLocal=this.bonoeficienciaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
							
				
				


				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBonoEficienciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
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
			
			


			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBonoEficienciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
								
						
				


				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
								
				
				


				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBonoEficienciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBonoEficienciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBonoEficienciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
							
				
				


				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBonoEficienciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
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
			
			


			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBonoEficienciaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
								
				
				


				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBonoEficienciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBonoEficienciaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBonoEficienciaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBonoEficiencia")) {
					jCheckBoxSeleccionarTodosBonoEficienciaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBonoEficiencia")) {
					jCheckBoxSeleccionadosBonoEficienciaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBonoEficiencia")) {
					
				}
				
				


				
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
												
				
				


				
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBonoEficienciaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBonoEficienciaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
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
			
			


			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBonoEficienciaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bonoeficiencia);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bonoeficiencia);
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
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
				
				


				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BonoEficiencia.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BonoEficiencia.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBonoEficienciaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bonoeficienciaAnterior =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBonoEficiencia")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBonoEficienciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBonoEficiencia.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.bonoeficiencia =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.bonoeficiencia =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.bonoeficiencia);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBonoEficiencia")) {
				
				}
				
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBonoEficiencia")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBonoEficiencia.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBonoEficiencia")) {
			
			}
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBonoEficiencia();
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
			if(sTipo.equals("NuevoBonoEficiencia")) {
				jButtonNuevoBonoEficienciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBonoEficiencia")) {
				jButtonDuplicarBonoEficienciaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBonoEficiencia")) {
				jButtonCopiarBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBonoEficiencia")) {
				jButtonVerFormBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBonoEficiencia")) {
				jButtonNuevoBonoEficienciaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBonoEficiencia")) {
				jButtonModificarBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBonoEficiencia")) {
				jButtonActualizarBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBonoEficiencia")) {
				jButtonEliminarBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBonoEficiencia")) {
				jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBonoEficiencia")) {
				jButtonCancelarBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBonoEficiencia")) {
				jButtonCerrarBonoEficienciaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBonoEficiencia")) {
				jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBonoEficiencia")) {
				jButtonNuevoGuardarCambiosBonoEficienciaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBonoEficiencia")) {
				jButtonAbrirOrderByBonoEficienciaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBonoEficiencia")) {
				jButtonRecargarInformacionBonoEficienciaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBonoEficiencia")) {
				jButtonAnterioresBonoEficienciaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBonoEficiencia")) {
				jButtonSiguientesBonoEficienciaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBonoEficienciaBusqueda")) {
				this.jButtonidBonoEficienciaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBonoEficienciaUpdate")) {
				this.jButtonid_empresaBonoEficienciaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBonoEficienciaBusqueda")) {
				this.jButtonid_empresaBonoEficienciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("diasBonoEficienciaBusqueda")) {
				this.jButtondiasBonoEficienciaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorBonoEficienciaBusqueda")) {
				this.jButtonvalorBonoEficienciaBusquedaActionPerformed(evt);
			}
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBonoEficiencia();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBonoEficiencia")) {
				closingInternalFrameBonoEficiencia();
				
			} else if(sTipo.equals("jButtonCancelarBonoEficiencia")) {
				JInternalFrameBase jInternalFrameDetalleFormBonoEficiencia = (JInternalFrameBase)evt.getSource();
	            	
	            BonoEficienciaBeanSwingJInternalFrame jInternalFrameParent=(BonoEficienciaBeanSwingJInternalFrame)jInternalFrameDetalleFormBonoEficiencia.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBonoEficienciaActionPerformed(null);
			}
			
			BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bonoeficiencia,new Object(),this.bonoeficienciaParameterGeneral,this.bonoeficienciaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBonoEficiencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBonoEficiencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBonoEficiencia(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.bonoeficiencia)) {
			if(!esControlTabla) {
				if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);			
				}
				
				if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBonoEficiencia(this.bonoeficiencia,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bonoeficienciaReturnGeneral=bonoeficienciaLogic.procesarEventosBonoEficienciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bonoeficienciaLogic.getBonoEficiencias(),this.bonoeficiencia,this.bonoeficienciaParameterGeneral,this.isEsNuevoBonoEficiencia,classes);//this.bonoeficienciaLogic.getBonoEficiencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBonoEficiencia(this.bonoeficienciaReturnGeneral,this.bonoeficienciaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBonoEficiencia(classes,this.bonoeficienciaReturnGeneral,this.bonoeficienciaBean,false);
					}
						
					if(this.bonoeficienciaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBonoEficiencia(this.bonoeficienciaReturnGeneral.getBonoEficiencia());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBonoEficiencia(this.bonoeficienciaReturnGeneral.getBonoEficiencia());	
					}
						
					if(this.bonoeficienciaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBonoEficiencia(this.bonoeficienciaReturnGeneral.getBonoEficiencia(),classes);//this.bonoeficienciaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBonoEficiencia(this.bonoeficiencia,classes);//this.bonoeficienciaBean);									
				}
			
				if(BonoEficienciaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBonoEficiencia(this.bonoeficiencia,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBonoEficiencia(this.bonoeficiencia);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.bonoeficienciaAnterior!=null) {
						this.bonoeficiencia=this.bonoeficienciaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.bonoeficienciaReturnGeneral=bonoeficienciaLogic.procesarEventosBonoEficienciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bonoeficienciaLogic.getBonoEficiencias(),this.bonoeficiencia,this.bonoeficienciaParameterGeneral,this.isEsNuevoBonoEficiencia,classes);//this.bonoeficienciaLogic.getBonoEficiencia()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bonoeficienciaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bonoeficienciaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.bonoeficienciaReturnGeneral.getBonoEficiencia(),bonoeficienciaLogic.getBonoEficiencias());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.bonoeficienciaReturnGeneral.getBonoEficiencia(),this.bonoeficiencias);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBonoEficiencia.repaint();
				
				//((AbstractTableModel) this.jTableDatosBonoEficiencia.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBonoEficiencia();
			}
		}
	}
	
	public void actualizarVisualTableDatosBonoEficiencia() throws Exception {
		
		BonoEficienciaModel bonoeficienciaModel=(BonoEficienciaModel)this.jTableDatosBonoEficiencia.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bonoeficienciaModel.bonoeficiencias=this.bonoeficienciaLogic.getBonoEficiencias();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			bonoeficienciaModel.bonoeficiencias=this.bonoeficiencias;
		}
		
		
		((BonoEficienciaModel) this.jTableDatosBonoEficiencia.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBonoEficiencia() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbonoeficienciaAnterior(),this.bonoeficienciaLogic.getBonoEficiencias());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbonoeficienciaAnterior(),this.bonoeficiencias);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBonoEficiencia();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBonoEficiencia(BonoEficiencia bonoeficiencia,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
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
										
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bonoeficiencia,new Object(),generalEntityParameterGeneral,this.bonoeficienciaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.bonoeficienciaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BonoEficienciaConstantesFunciones.getClassesRelationshipsOfBonoEficiencia(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BonoEficienciaConstantesFunciones.getClassesRelationshipsFromStringsOfBonoEficiencia(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBonoEficiencia(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BonoEficienciaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bonoeficiencia,new Object(),generalEntityParameterGeneral,this.bonoeficienciaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBonoEficiencia(BonoEficienciaBean bonoeficienciaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBonoEficiencia(ArrayList<Classe> classes,BonoEficienciaReturnGeneral bonoeficienciaReturnGeneral,BonoEficienciaBean bonoeficienciaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBonoEficiencia(BonoEficiencia bonoeficiencia,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.bonoeficiencia)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBonoEficiencia = new BonoEficienciaDetalleFormJInternalFrame(jDesktopPane,this.bonoeficienciaSessionBean.getConGuardarRelaciones(),this.bonoeficienciaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.setVisible(false);
		this.jInternalFrameDetalleFormBonoEficiencia.setSelected(false);						
		
		this.jInternalFrameDetalleFormBonoEficiencia.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBonoEficiencia.bonoeficienciaLogic=this.bonoeficienciaLogic;
		
		this.cargarCombosFrameForeignKeyBonoEficiencia("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBonoEficiencia();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBonoEficiencia();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBonoEficiencia("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBonoEficiencia();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBonoEficiencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBonoEficiencia"));
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarBonoEficiencia.addActionListener(new ButtonActionListener(this,"ModificarBonoEficiencia"));

		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarToolBarBonoEficiencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarBonoEficiencia"));
					
		this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemModificarBonoEficiencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarBonoEficiencia"));		
		
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarBonoEficiencia.addActionListener (new ButtonActionListener(this,"ActualizarBonoEficiencia"));
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarToolBarBonoEficiencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBonoEficiencia"));
						
		this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemActualizarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBonoEficiencia"));		
		
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarBonoEficiencia.addActionListener (new ButtonActionListener(this,"EliminarBonoEficiencia"));
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarBonoEficiencia"));
								
		this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemEliminarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBonoEficiencia"));		
		
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarBonoEficiencia.addActionListener (new ButtonActionListener(this,"CancelarBonoEficiencia"));
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarBonoEficiencia"));
					
		this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemCancelarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBonoEficiencia"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemDetalleCerrarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBonoEficiencia"));		
		
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBonoEficiencia"));
		
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBonoEficiencia"));
		
		
		
		this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBonoEficiencia"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonidBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"idBonoEficienciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonid_empresaBonoEficienciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBonoEficienciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonid_empresaBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBonoEficienciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtondiasBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"diasBonoEficienciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonvalorBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"valorBonoEficienciaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBonoEficiencia"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBonoEficiencia"));
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBonoEficiencia"));
		}
		
		this.jTableDatosBonoEficiencia.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBonoEficiencia"));
		
		this.jTableDatosBonoEficiencia.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBonoEficiencia"));
		
		this.jButtonNuevoBonoEficiencia.addActionListener(new ButtonActionListener(this,"NuevoBonoEficiencia"));
		
		this.jButtonDuplicarBonoEficiencia.addActionListener(new ButtonActionListener(this,"DuplicarBonoEficiencia"));
		
		this.jButtonCopiarBonoEficiencia.addActionListener(new ButtonActionListener(this,"CopiarBonoEficiencia"));
		
		this.jButtonVerFormBonoEficiencia.addActionListener(new ButtonActionListener(this,"VerFormBonoEficiencia"));
		
		
		this.jButtonNuevoToolBarBonoEficiencia.addActionListener(new ButtonActionListener(this,"NuevoToolBarBonoEficiencia"));
			
		this.jButtonDuplicarToolBarBonoEficiencia.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBonoEficiencia"));
			
		this.jMenuItemNuevoBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBonoEficiencia"));
			
		this.jMenuItemDuplicarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBonoEficiencia"));		
		
		
		this.jButtonNuevoRelacionesBonoEficiencia.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBonoEficiencia"));
		
		
		this.jButtonNuevoRelacionesToolBarBonoEficiencia.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBonoEficiencia"));
			
		this.jMenuItemNuevoRelacionesBonoEficiencia.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBonoEficiencia"));		
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarBonoEficiencia.addActionListener(new ButtonActionListener(this,"ModificarBonoEficiencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonModificarToolBarBonoEficiencia.addActionListener(new ButtonActionListener(this,"ModificarToolBarBonoEficiencia"));
			
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemModificarBonoEficiencia.addActionListener(new ButtonActionListener(this,"MenuItemModificarBonoEficiencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarBonoEficiencia.addActionListener (new ButtonActionListener(this,"ActualizarBonoEficiencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonActualizarToolBarBonoEficiencia.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBonoEficiencia"));
				
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemActualizarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBonoEficiencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarBonoEficiencia.addActionListener (new ButtonActionListener(this,"EliminarBonoEficiencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonEliminarToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"EliminarToolBarBonoEficiencia"));
						
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemEliminarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBonoEficiencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarBonoEficiencia.addActionListener (new ButtonActionListener(this,"CancelarBonoEficiencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonCancelarToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"CancelarToolBarBonoEficiencia"));
			
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemCancelarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBonoEficiencia"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBonoEficiencia"));		
		
		
		this.jButtonCerrarBonoEficiencia.addActionListener (new ButtonActionListener(this,"CerrarBonoEficiencia"));
		
		
		this.jButtonCerrarToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"CerrarToolBarBonoEficiencia"));
			
		this.jMenuItemCerrarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBonoEficiencia"));
			
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jMenuItemDetalleCerrarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBonoEficiencia"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosBonoEficiencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosBonoEficiencia"));
		}
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBonoEficiencia"));
		}
		
		this.jButtonCopiarToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"CopiarToolBarBonoEficiencia"));
			
		this.jButtonVerFormToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"VerFormToolBarBonoEficiencia"));
		
		this.jMenuItemGuardarCambiosBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBonoEficiencia"));
			
		this.jMenuItemCopiarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBonoEficiencia"));		
		
		this.jMenuItemVerFormBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBonoEficiencia"));		
		
		
		this.jButtonGuardarCambiosTablaBonoEficiencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBonoEficiencia"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBonoEficiencia"));
			
		this.jMenuItemGuardarCambiosTablaBonoEficiencia.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBonoEficiencia"));		
		
		
		
		this.jButtonRecargarInformacionBonoEficiencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionBonoEficiencia"));
					
		this.jButtonRecargarInformacionToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBonoEficiencia"));
		
		this.jMenuItemRecargarInformacionBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBonoEficiencia"));		
		
		
		
		this.jButtonAnterioresBonoEficiencia.addActionListener (new ButtonActionListener(this,"AnterioresBonoEficiencia"));
		
		
		this.jButtonAnterioresToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBonoEficiencia"));
		
		this.jMenuItemAnterioresBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBonoEficiencia"));		
		
		
		this.jButtonSiguientesBonoEficiencia.addActionListener (new ButtonActionListener(this,"SiguientesBonoEficiencia"));
		
		
		this.jButtonSiguientesToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBonoEficiencia"));
			
		this.jMenuItemSiguientesBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBonoEficiencia"));
			
		this.jMenuItemAbrirOrderByBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBonoEficiencia"));
			
		this.jMenuItemMostrarOcultarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBonoEficiencia"));
			
		this.jMenuItemDetalleAbrirOrderByBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBonoEficiencia"));
			
		this.jMenuItemDetalleMostarOcultarBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBonoEficiencia"));		
		
		
		this.jButtonNuevoGuardarCambiosBonoEficiencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBonoEficiencia"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBonoEficiencia"));
			
		this.jMenuItemNuevoGuardarCambiosBonoEficiencia.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBonoEficiencia"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBonoEficiencia.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBonoEficiencia"));

		this.jCheckBoxSeleccionadosBonoEficiencia.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBonoEficiencia"));
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBonoEficiencia"));
		}
		
		
		this.jComboBoxTiposRelacionesBonoEficiencia.addActionListener (new ButtonActionListener(this,"TiposRelacionesBonoEficiencia"));
			
		this.jComboBoxTiposAccionesBonoEficiencia.addActionListener (new ButtonActionListener(this,"TiposAccionesBonoEficiencia"));
					
		this.jComboBoxTiposSeleccionarBonoEficiencia.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBonoEficiencia"));
			
		this.jTextFieldValorCampoGeneralBonoEficiencia.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBonoEficiencia"));		
		
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonidBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"idBonoEficienciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonid_empresaBonoEficienciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBonoEficienciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonid_empresaBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBonoEficienciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtondiasBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"diasBonoEficienciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonvalorBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"valorBonoEficienciaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBonoEficiencia!=null) {
				this.jInternalFrameReporteDinamicoBonoEficiencia.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBonoEficiencia"));
				this.jInternalFrameReporteDinamicoBonoEficiencia.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBonoEficiencia"));
				this.jInternalFrameReporteDinamicoBonoEficiencia.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBonoEficiencia"));
			}
			
			//this.jButtonCerrarReporteDinamicoBonoEficiencia.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBonoEficiencia"));				
			//this.jButtonGenerarReporteDinamicoBonoEficiencia.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBonoEficiencia"));
			//this.jButtonGenerarExcelReporteDinamicoBonoEficiencia.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBonoEficiencia"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBonoEficiencia!=null) {
				this.jInternalFrameImportacionBonoEficiencia.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBonoEficiencia"));
				this.jInternalFrameImportacionBonoEficiencia.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBonoEficiencia"));
				this.jInternalFrameImportacionBonoEficiencia.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBonoEficiencia"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBonoEficiencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByBonoEficiencia"));
			
			this.jButtonAbrirOrderByToolBarBonoEficiencia.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBonoEficiencia"));			
			
			if(this.jInternalFrameOrderByBonoEficiencia!=null) {
				this.jInternalFrameOrderByBonoEficiencia.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBonoEficiencia"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBonoEficiencia.jTabbedPaneRelacionesBonoEficiencia.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBonoEficiencia"));
		
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
            		closingInternalFrameBonoEficiencia();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBonoEficiencia.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBonoEficiencia = (JInternalFrameBase)event.getSource();
	            	
	            BonoEficienciaBeanSwingJInternalFrame jInternalFrameParent=(BonoEficienciaBeanSwingJInternalFrame)jInternalFrameDetalleFormBonoEficiencia.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBonoEficienciaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBonoEficiencia.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBonoEficienciaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBonoEficiencia.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBonoEficiencia.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBonoEficienciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBonoEficienciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBonoEficienciaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBonoEficiencia";
		inputMap = this.jButtonNuevoBonoEficiencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBonoEficiencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBonoEficienciaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBonoEficienciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBonoEficienciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBonoEficienciaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBonoEficiencia";
		inputMap = this.jButtonNuevoRelacionesBonoEficiencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBonoEficiencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBonoEficienciaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBonoEficiencia";
		inputMap = this.jButtonModificarBonoEficiencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBonoEficiencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBonoEficienciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBonoEficiencia";
		inputMap = this.jButtonActualizarBonoEficiencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBonoEficiencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBonoEficienciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBonoEficiencia";
		inputMap = this.jButtonEliminarBonoEficiencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBonoEficiencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBonoEficienciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBonoEficiencia";
		inputMap = this.jButtonCancelarBonoEficiencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBonoEficiencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBonoEficienciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBonoEficiencia";
		inputMap = this.jButtonCerrarBonoEficiencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBonoEficiencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBonoEficienciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBonoEficiencia";
		inputMap = this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosBonoEficiencia.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonGuardarCambiosBonoEficiencia.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBonoEficienciaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBonoEficiencia.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBonoEficienciaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBonoEficiencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBonoEficienciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBonoEficiencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBonoEficienciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBonoEficiencia.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBonoEficienciaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonidBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"idBonoEficienciaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonid_empresaBonoEficienciaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBonoEficienciaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonid_empresaBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBonoEficienciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtondiasBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"diasBonoEficienciaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBonoEficiencia.jButtonvalorBonoEficienciaBusqueda.addActionListener(new ButtonActionListener(this,"valorBonoEficienciaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBonoEficiencia.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBonoEficienciaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBonoEficienciaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBonoEficiencia.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBonoEficiencia(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
					bonoeficienciaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BonoEficiencia bonoeficienciaAux:bonoeficiencias) {
					bonoeficienciaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBonoEficienciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBonoEficiencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
						bonoeficienciaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BonoEficiencia bonoeficienciaAux:bonoeficiencias) {
						bonoeficienciaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BonoEficiencia bonoeficienciaAux:bonoeficiencias) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBonoEficiencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBonoEficiencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBonoEficiencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBonoEficiencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBonoEficienciaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBonoEficiencia(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBonoEficiencia.getSelectedRows();
			
			BonoEficiencia bonoeficienciaLocal=new BonoEficiencia();
			
			//this.seleccionarTodosBonoEficiencia(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bonoeficienciaLocal =(BonoEficiencia) this.bonoeficienciaLogic.getBonoEficiencias().toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					bonoeficienciaLocal =(BonoEficiencia) this.bonoeficiencias.toArray()[this.jTableDatosBonoEficiencia.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				bonoeficienciaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
						bonoeficienciaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BonoEficiencia bonoeficienciaAux:bonoeficiencias) {
						bonoeficienciaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBonoEficiencia(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBonoEficiencia.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBonoEficiencia.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBonoEficiencia,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBonoEficienciaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBonoEficienciaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBonoEficienciaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBonoEficiencia(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBonoEficiencia.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BonoEficiencia bonoeficienciaAux:this.bonoeficienciaLogic.getBonoEficiencias()) {
				
						if(sTipoSeleccionar.equals(BonoEficienciaConstantesFunciones.LABEL_DIAS)) {
							existe=true;
							bonoeficienciaAux.setdias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BonoEficienciaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							bonoeficienciaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BonoEficiencia bonoeficienciaAux:bonoeficiencias) {
					
						if(sTipoSeleccionar.equals(BonoEficienciaConstantesFunciones.LABEL_DIAS)) {
							existe=true;
							bonoeficienciaAux.setdias(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BonoEficienciaConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							bonoeficienciaAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBonoEficiencia(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBonoEficienciaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBonoEficiencia(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBonoEficiencia=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBonoEficiencia.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBonoEficiencia) {				
					conSplash=true;//false;										
					
					//this.startProcessBonoEficiencia(conSplash);
				
					this.generarReporteBonoEficienciasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBonoEficienciasSeleccionados();
				//this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBonoEficienciasSeleccionados(false);
				//this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBonoEficienciasSeleccionados(true);
				//this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBonoEficiencia();
				
				this.exportarBonoEficienciasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBonoEficiencias();
				//this.importarBonoEficiencias();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBonoEficiencia();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBonoEficienciasSeleccionados();
				//this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Bono Eficiencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBonoEficiencia();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBonoEficiencia)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBonoEficiencia(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.setSelectedIndex(0);					
				}	
			} 			
			else if(BonoEficienciaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBonoEficiencia) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBonoEficiencia(conSplash);
					
						//this.actualizarParametrosGeneralBonoEficiencia();
						
						this.generarReporteProcesoAccionBonoEficienciasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BonoEficienciaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Bono EficienciaS SELECCIONADOS?", "MANTENIMIENTO DE Bono Eficiencia", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBonoEficiencia();
				
						this.actualizarParametrosGeneralBonoEficiencia();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.bonoeficienciaReturnGeneral=bonoeficienciaLogic.procesarAccionBonoEficienciasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.bonoeficienciaLogic.getBonoEficiencias(),this.bonoeficienciaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBonoEficienciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBonoEficiencia();
					
					BonoEficienciaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBonoEficienciaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBonoEficiencia.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxTiposAccionesFormularioBonoEficiencia.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBonoEficiencia(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBonoEficienciaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBonoEficiencia();
			
			if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		
			BonoEficiencia bonoeficiencia=new BonoEficiencia();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBonoEficiencia(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBonoEficiencia.getSelectedItem();
			
			
			
			
			bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
			//this.sTipoAccion;
			
			if(bonoeficienciasSeleccionados.size()==1) {
				for(BonoEficiencia bonoeficienciaAux:bonoeficienciasSeleccionados) {
					bonoeficiencia=bonoeficienciaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBonoEficiencia();
			
      		//this.finishProcessBonoEficiencia(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBonoEficienciaReturnGeneral() throws Exception {
		if(this.bonoeficienciaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.bonoeficienciaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.bonoeficienciaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.bonoeficienciaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.bonoeficienciaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.bonoeficienciaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBonoEficiencia(false);
		}
		
		if(this.bonoeficienciaReturnGeneral.getConRetornoLista() || this.bonoeficienciaReturnGeneral.getConRetornoObjeto()) {
			if(this.bonoeficienciaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bonoeficienciaLogic.setBonoEficiencias(this.bonoeficienciaReturnGeneral.getBonoEficiencias());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.bonoeficienciaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bonoeficienciaLogic.setBonoEficiencia(this.bonoeficienciaReturnGeneral.getBonoEficiencia());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingBonoEficiencia(false);
		}
	}
	
	public void actualizarParametrosGeneralBonoEficiencia() throws Exception {
		
		
	}
	
	public ArrayList<BonoEficiencia> getBonoEficienciasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBonoEficiencia) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(BonoEficiencia bonoeficienciaAux:bonoeficienciaLogic.getBonoEficiencias()) {
					if(bonoeficienciaAux.getIsSelected()) {
						bonoeficienciasSeleccionados.add(bonoeficienciaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BonoEficiencia bonoeficienciaAux:this.bonoeficiencias) {
					if(bonoeficienciaAux.getIsSelected()) {
						bonoeficienciasSeleccionados.add(bonoeficienciaAux);				
					}
				}
			}
			
			if(bonoeficienciasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						bonoeficienciasSeleccionados.addAll(this.bonoeficienciaLogic.getBonoEficiencias());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						bonoeficienciasSeleccionados.addAll(this.bonoeficiencias);				
					}
				}
			}
		} else {
			bonoeficienciasSeleccionados.add(this.bonoeficiencia);
		}
		
		return bonoeficienciasSeleccionados;
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
	
	public void generarReporteBonoEficienciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBonoEficienciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBonoEficienciasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBonoEficienciasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBonoEficienciasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Bono Eficiencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBonoEficienciasSeleccionados() throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBonoEficiencias("Todos",bonoeficienciasSeleccionados);
		
	}	
	
	public void generarReporteNormalBonoEficienciasSeleccionados() throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBonoEficiencias("Todos",bonoeficienciasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBonoEficienciasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBonoEficiencias("Todos",bonoeficienciasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBonoEficienciasSeleccionados() throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBonoEficiencia();
		
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBonoEficiencia();
		
		
		//this.generarReporteBonoEficiencias("Todos",bonoeficienciasSeleccionados ,bonoeficienciaImplementable,bonoeficienciaImplementableHome);
	}
	
	public void mostrarImportacionBonoEficiencias() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBonoEficiencia();
		
		this.abrirFrameImportacionBonoEficiencia();		
		
			
		//this.generarReporteBonoEficiencias("Todos",bonoeficienciasSeleccionados ,bonoeficienciaImplementable,bonoeficienciaImplementableHome);
	}
	
	public void importarBonoEficiencias() throws Exception {		
	
	}
	
	public void exportarBonoEficienciasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBonoEficienciasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBonoEficienciasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBonoEficienciasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Bono Eficiencia",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBonoEficienciasSeleccionados() throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bonoeficiencia."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBonoEficiencia(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(BonoEficiencia bonoeficienciaAux:bonoeficienciasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBonoEficiencia(bonoeficienciaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//bonoeficienciaAux.setsDetalleGeneralEntityReporte(bonoeficienciaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBonoEficiencia(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BonoEficienciaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BonoEficienciaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BonoEficienciaConstantesFunciones.LABEL_DIAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BonoEficienciaConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBonoEficiencia(BonoEficiencia bonoeficiencia,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=bonoeficiencia.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=bonoeficiencia.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=bonoeficiencia.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bonoeficiencia.getdias().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bonoeficiencia.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBonoEficienciasSeleccionados() throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bonoeficiencia.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("BonoEficiencias");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBonoEficiencia(row);				
				iRow++;
			}				
			
			for(BonoEficiencia bonoeficienciaAux:bonoeficienciasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBonoEficiencia(bonoeficienciaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBonoEficienciasSeleccionados() throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();		
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bonoeficiencia.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("bonoeficiencias");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("bonoeficiencia");
			//elementRoot.appendChild(element);
		
			for(BonoEficiencia bonoeficienciaAux:bonoeficienciasSeleccionados) {
				element = document.createElement("bonoeficiencia");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBonoEficiencia(bonoeficienciaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bono Eficiencia",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBonoEficiencia(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_DIAS);
		cell = row.createCell(iColumn++);cell.setCellValue(BonoEficienciaConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBonoEficiencia(BonoEficiencia bonoeficiencia,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(bonoeficiencia.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(bonoeficiencia.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bonoeficiencia.getdias());
		cell = row.createCell(iColumn++);cell.setCellValue(bonoeficiencia.getvalor());				
	}
	
	public void setFilaDatosExportarXmlBonoEficiencia(BonoEficiencia bonoeficiencia,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BonoEficienciaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(bonoeficiencia.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BonoEficienciaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(bonoeficiencia.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(BonoEficienciaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(bonoeficiencia.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementdias = document.createElement(BonoEficienciaConstantesFunciones.DIAS);
		elementdias.appendChild(document.createTextNode(bonoeficiencia.getdias().toString().trim()));
		element.appendChild(elementdias);

		Element elementvalor = document.createElement(BonoEficienciaConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(bonoeficiencia.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoBonoEficienciasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<BonoEficiencia> bonoeficienciasSeleccionados=new ArrayList<BonoEficiencia>();
		
		bonoeficienciasSeleccionados=this.getBonoEficienciasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBonoEficiencia(bonoeficienciasSeleccionados);
		
		this.generarReporteBonoEficiencias("Todos",bonoeficienciasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBonoEficiencia(ArrayList<BonoEficiencia> bonoeficienciasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(BonoEficiencia bonoeficienciaAux:bonoeficienciasSeleccionados) {
				bonoeficienciaAux.setsDetalleGeneralEntityReporte(bonoeficienciaAux.toString());
			
				if(sTipoSeleccionar.equals(BonoEficienciaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					bonoeficienciaAux.setsDescripcionGeneralEntityReporte1(bonoeficienciaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BonoEficienciaConstantesFunciones.LABEL_DIAS)) {
					existe=true;
					bonoeficienciaAux.setsDescripcionGeneralEntityReporte1(bonoeficienciaAux.getdias().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BonoEficienciaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBonoEficiencia(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBonoEficiencia=true;
				this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=true;
				this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=true;
			}
			
			this.isVisibilidadCeldaModificarBonoEficiencia=false;
			this.isVisibilidadCeldaActualizarBonoEficiencia=false;
			this.isVisibilidadCeldaEliminarBonoEficiencia=false;
			this.isVisibilidadCeldaCancelarBonoEficiencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBonoEficiencia=true;
				} else {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBonoEficiencia=false;
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=false;
			this.isVisibilidadCeldaModificarBonoEficiencia=false;
			this.isVisibilidadCeldaActualizarBonoEficiencia=true;
			this.isVisibilidadCeldaEliminarBonoEficiencia=false;
			this.isVisibilidadCeldaCancelarBonoEficiencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBonoEficiencia=true;
				} else {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBonoEficiencia=false;
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=false;
			this.isVisibilidadCeldaModificarBonoEficiencia=false;
			this.isVisibilidadCeldaActualizarBonoEficiencia=true;
			this.isVisibilidadCeldaEliminarBonoEficiencia=true;
			this.isVisibilidadCeldaCancelarBonoEficiencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBonoEficiencia=true;
				} else {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBonoEficiencia=false;
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=false;
			this.isVisibilidadCeldaModificarBonoEficiencia=false;
			this.isVisibilidadCeldaActualizarBonoEficiencia=true;
			this.isVisibilidadCeldaEliminarBonoEficiencia=false;
			this.isVisibilidadCeldaCancelarBonoEficiencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				} else {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBonoEficiencia=true;
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=true;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=true;
			this.isVisibilidadCeldaModificarBonoEficiencia=false;
			this.isVisibilidadCeldaActualizarBonoEficiencia=false;
			this.isVisibilidadCeldaEliminarBonoEficiencia=false;
			this.isVisibilidadCeldaCancelarBonoEficiencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBonoEficiencia=true;
				} else {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBonoEficiencia=false;
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=false;
			this.isVisibilidadCeldaActualizarBonoEficiencia=false;
			this.isVisibilidadCeldaEliminarBonoEficiencia=false;
			this.isVisibilidadCeldaCancelarBonoEficiencia=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				} else {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBonoEficiencia=false;
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=false;
			this.isVisibilidadCeldaModificarBonoEficiencia=true;
			this.isVisibilidadCeldaActualizarBonoEficiencia=false;
			this.isVisibilidadCeldaEliminarBonoEficiencia=false;
			this.isVisibilidadCeldaCancelarBonoEficiencia=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				} else {
					this.isVisibilidadCeldaGuardarBonoEficiencia=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BonoEficienciaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBonoEficiencia=true;
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=true;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=true;
		} else {
			this.actualizarEstadoPanelsBonoEficiencia(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBonoEficiencia=false;
			//this.isVisibilidadCeldaVerFormBonoEficiencia=false;
			this.isVisibilidadCeldaDuplicarBonoEficiencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!bonoeficienciaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
		} else {
			this.isVisibilidadCeldaNuevoBonoEficiencia=false;
			this.isVisibilidadCeldaGuardarCambiosBonoEficiencia=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			if(!bonoeficienciaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;												
			}
			
			this.jButtonCerrarBonoEficiencia.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBonoEficiencia=false;
		}
		
		if(!this.permiteMantenimiento(this.bonoeficiencia)) {
			this.isVisibilidadCeldaActualizarBonoEficiencia=false;
			this.isVisibilidadCeldaEliminarBonoEficiencia=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBonoEficiencia() {
	}
	
	public void actualizarEstadoPanelsBonoEficiencia(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBonoEficiencia!=null) {
				this.jScrollPanelDatosEdicionBonoEficiencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBonoEficiencia!=null) {
				this.jScrollPanelDatosBonoEficiencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionBonoEficiencia!=null) {
				this.jPanelPaginacionBonoEficiencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBonoEficiencia!=null) {
				this.jScrollPanelDatosEdicionBonoEficiencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBonoEficiencia!=null) {
				this.jScrollPanelDatosBonoEficiencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionBonoEficiencia!=null) {
				this.jPanelPaginacionBonoEficiencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBonoEficiencia!=null) {
				this.jScrollPanelDatosEdicionBonoEficiencia.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBonoEficiencia!=null) {
				this.jScrollPanelDatosBonoEficiencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionBonoEficiencia!=null) {
				this.jPanelPaginacionBonoEficiencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBonoEficiencia!=null) {
				this.jScrollPanelDatosEdicionBonoEficiencia.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBonoEficiencia!=null) {
				this.jScrollPanelDatosBonoEficiencia.setVisible(false);
			}
			
			if(this.jPanelPaginacionBonoEficiencia!=null) {
				this.jPanelPaginacionBonoEficiencia.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBonoEficiencia!=null) {
				this.jScrollPanelDatosEdicionBonoEficiencia.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBonoEficiencia!=null) {
				this.jScrollPanelDatosBonoEficiencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionBonoEficiencia!=null) {
				this.jPanelPaginacionBonoEficiencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBonoEficiencia!=null) {
				this.jScrollPanelDatosEdicionBonoEficiencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBonoEficiencia!=null) {
				this.jScrollPanelDatosBonoEficiencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionBonoEficiencia!=null) {
				this.jPanelPaginacionBonoEficiencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBonoEficiencia!=null) {
				this.jScrollPanelDatosEdicionBonoEficiencia.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBonoEficiencia!=null) {
				this.jScrollPanelDatosBonoEficiencia.setVisible(true);
			}
			
			if(this.jPanelPaginacionBonoEficiencia!=null) {
				this.jPanelPaginacionBonoEficiencia.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
					this.jTabbedPaneBusquedasBonoEficiencia.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.bonoeficienciaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBonoEficiencia!=null) {
				this.jTabbedPaneBusquedasBonoEficiencia.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBonoEficiencia!=null) {
				this.jPanelParametrosReportesBonoEficiencia.setVisible(true);
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
		
		//BonoEficienciaSessionBean bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
		
		if(this.bonoeficienciaSessionBean==null) {
			this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
		}
		
		this.bonoeficienciaSessionBean.setsUltimaBusquedaBonoEficiencia(this.getsAccionBusqueda());
		this.bonoeficienciaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.bonoeficienciaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			bonoeficienciaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//BonoEficienciaSessionBean bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
		
		if(this.bonoeficienciaSessionBean==null) {
			this.bonoeficienciaSessionBean=new BonoEficienciaSessionBean();
		}
		
		if(this.bonoeficienciaSessionBean.getsUltimaBusquedaBonoEficiencia()!=null&&!this.bonoeficienciaSessionBean.getsUltimaBusquedaBonoEficiencia().equals("")) {
			this.setsAccionBusqueda(bonoeficienciaSessionBean.getsUltimaBusquedaBonoEficiencia());
			this.setiNumeroPaginacion(bonoeficienciaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(bonoeficienciaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(bonoeficienciaSessionBean.getid_empresa());
				bonoeficienciaSessionBean.setid_empresa(-1L);
			}
		}
		
		this.bonoeficienciaSessionBean.setsUltimaBusquedaBonoEficiencia("");
		this.bonoeficienciaSessionBean.setiNumeroPaginacion(BonoEficienciaConstantesFunciones.INUMEROPAGINACION);
		this.bonoeficienciaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBonoEficiencia(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBonoEficiencia() {
		this.updateBorderResaltarBusquedasFormularioBonoEficiencia();
		this.updateVisibilidadBusquedasFormularioBonoEficiencia();
		this.updateHabilitarBusquedasFormularioBonoEficiencia();
	}
	
	public void updateBorderResaltarBusquedasFormularioBonoEficiencia() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBonoEficiencia.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBonoEficiencia() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBonoEficiencia.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBonoEficiencia() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBonoEficiencia.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBonoEficiencia(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarBonoEficiencia.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioBonoEficiencia() throws Exception {

		if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBonoEficiencia();
		this.updateVisibilidadResaltarControlesFormularioBonoEficiencia();
		this.updateHabilitarResaltarControlesFormularioBonoEficiencia();
		
	}
	
	public void updateBorderResaltarControlesFormularioBonoEficiencia() throws Exception {
		if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.bonoeficienciaConstantesFunciones.resaltaridBonoEficiencia!=null && this.jInternalFrameDetalleFormBonoEficiencia!=null) {this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.setBorder(this.bonoeficienciaConstantesFunciones.resaltaridBonoEficiencia);}
		if(this.bonoeficienciaConstantesFunciones.resaltarid_empresaBonoEficiencia!=null && this.jInternalFrameDetalleFormBonoEficiencia!=null) {this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setBorder(this.bonoeficienciaConstantesFunciones.resaltarid_empresaBonoEficiencia);}
		if(this.bonoeficienciaConstantesFunciones.resaltardiasBonoEficiencia!=null && this.jInternalFrameDetalleFormBonoEficiencia!=null) {this.jInternalFrameDetalleFormBonoEficiencia.jTextFielddiasBonoEficiencia.setBorder(this.bonoeficienciaConstantesFunciones.resaltardiasBonoEficiencia);}
		if(this.bonoeficienciaConstantesFunciones.resaltarvalorBonoEficiencia!=null && this.jInternalFrameDetalleFormBonoEficiencia!=null) {this.jInternalFrameDetalleFormBonoEficiencia.jTextFieldvalorBonoEficiencia.setBorder(this.bonoeficienciaConstantesFunciones.resaltarvalorBonoEficiencia);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBonoEficiencia() throws Exception {		
		if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
	
		//this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.setVisible(this.bonoeficienciaConstantesFunciones.mostraridBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jPanelidBonoEficiencia.setVisible(this.bonoeficienciaConstantesFunciones.mostraridBonoEficiencia);
		//this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setVisible(this.bonoeficienciaConstantesFunciones.mostrarid_empresaBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jPanelid_empresaBonoEficiencia.setVisible(this.bonoeficienciaConstantesFunciones.mostrarid_empresaBonoEficiencia);
		//this.jInternalFrameDetalleFormBonoEficiencia.jTextFielddiasBonoEficiencia.setVisible(this.bonoeficienciaConstantesFunciones.mostrardiasBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jPaneldiasBonoEficiencia.setVisible(this.bonoeficienciaConstantesFunciones.mostrardiasBonoEficiencia);
		//this.jInternalFrameDetalleFormBonoEficiencia.jTextFieldvalorBonoEficiencia.setVisible(this.bonoeficienciaConstantesFunciones.mostrarvalorBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jPanelvalorBonoEficiencia.setVisible(this.bonoeficienciaConstantesFunciones.mostrarvalorBonoEficiencia);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBonoEficiencia() throws Exception {
		if(this.jInternalFrameDetalleFormBonoEficiencia==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBonoEficiencia!=null) {
	
		this.jInternalFrameDetalleFormBonoEficiencia.jLabelidBonoEficiencia.setEnabled(this.bonoeficienciaConstantesFunciones.activaridBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jComboBoxid_empresaBonoEficiencia.setEnabled(this.bonoeficienciaConstantesFunciones.activarid_empresaBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jTextFielddiasBonoEficiencia.setEnabled(this.bonoeficienciaConstantesFunciones.activardiasBonoEficiencia);
		this.jInternalFrameDetalleFormBonoEficiencia.jTextFieldvalorBonoEficiencia.setEnabled(this.bonoeficienciaConstantesFunciones.activarvalorBonoEficiencia);
		}
	}
	
		
}