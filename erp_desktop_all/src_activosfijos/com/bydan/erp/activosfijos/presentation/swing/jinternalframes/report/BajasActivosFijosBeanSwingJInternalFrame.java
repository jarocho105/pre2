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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.activosfijos.util.BajasActivosFijosConstantesFunciones;
import com.bydan.erp.activosfijos.util.report.BajasActivosFijosParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.report.BajasActivosFijosParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.report.BajasActivosFijosBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.activosfijos.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.activosfijos.util.*;

import com.bydan.erp.activosfijos.util.report.*;
import com.bydan.erp.activosfijos.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.report.*;
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

//import org.hibernate.collection.PersistentBag;

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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.report.*;

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
public class BajasActivosFijosBeanSwingJInternalFrame extends BajasActivosFijosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(BajasActivosFijosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<BajasActivosFijos> bajasactivosfijosValidator = new ClassValidator<BajasActivosFijos>(BajasActivosFijos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public BajasActivosFijos bajasactivosfijos;	
	public BajasActivosFijos bajasactivosfijosAux;
	public BajasActivosFijos bajasactivosfijosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public BajasActivosFijos bajasactivosfijosTotales;
	public Long idBajasActivosFijosActual;
	public Long iIdNuevoBajasActivosFijos=0L;
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
	
	public Boolean isPermisoTodoBajasActivosFijos;
	public Boolean isPermisoNuevoBajasActivosFijos;
	public Boolean isPermisoActualizarBajasActivosFijos;
	public Boolean isPermisoActualizarOriginalBajasActivosFijos;
	public Boolean isPermisoEliminarBajasActivosFijos;
	public Boolean isPermisoGuardarCambiosBajasActivosFijos;
	public Boolean isPermisoConsultaBajasActivosFijos;
	public Boolean isPermisoBusquedaBajasActivosFijos;
	public Boolean isPermisoReporteBajasActivosFijos;
	public Boolean isPermisoPaginacionMedioBajasActivosFijos;
	public Boolean isPermisoPaginacionAltoBajasActivosFijos;
	public Boolean isPermisoPaginacionTodoBajasActivosFijos;
	public Boolean isPermisoCopiarBajasActivosFijos;
	public Boolean isPermisoVerFormBajasActivosFijos;
	public Boolean isPermisoDuplicarBajasActivosFijos;
	public Boolean isPermisoOrdenBajasActivosFijos;
	
	
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
	
	public BajasActivosFijosParameterReturnGeneral bajasactivosfijosReturnGeneral;
	public BajasActivosFijosParameterReturnGeneral bajasactivosfijosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoBajasActivosFijos=false;
	public Boolean esParaAccionDesdeFormularioBajasActivosFijos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected BajasActivosFijosSessionBeanAdditional bajasactivosfijosSessionBeanAdditional=null;
	
	public BajasActivosFijosSessionBeanAdditional getBajasActivosFijosSessionBeanAdditional() {
		return this.bajasactivosfijosSessionBeanAdditional;
	}
	
	public void setBajasActivosFijosSessionBeanAdditional(BajasActivosFijosSessionBeanAdditional bajasactivosfijosSessionBeanAdditional) {
		try {
			this.bajasactivosfijosSessionBeanAdditional=bajasactivosfijosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected BajasActivosFijosBeanSwingJInternalFrameAdditional bajasactivosfijosBeanSwingJInternalFrameAdditional=null;
	//public class BajasActivosFijosBeanSwingJInternalFrame
	
	public BajasActivosFijosBeanSwingJInternalFrameAdditional getBajasActivosFijosBeanSwingJInternalFrameAdditional() {
		return this.bajasactivosfijosBeanSwingJInternalFrameAdditional;
	}
	
	public void setBajasActivosFijosBeanSwingJInternalFrameAdditional(BajasActivosFijosBeanSwingJInternalFrameAdditional bajasactivosfijosBeanSwingJInternalFrameAdditional) {
		try {
			this.bajasactivosfijosBeanSwingJInternalFrameAdditional=bajasactivosfijosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public BajasActivosFijosLogic bajasactivosfijosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public BajasActivosFijos bajasactivosfijosBean;
	public BajasActivosFijosConstantesFunciones bajasactivosfijosConstantesFunciones;
	//public BajasActivosFijosParameterReturnGeneral bajasactivosfijosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<BajasActivosFijos> bajasactivosfijoss;	
	//public List<BajasActivosFijos> bajasactivosfijossEliminados;
	//public List<BajasActivosFijos> bajasactivosfijossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoBajasActivosFijos=false;
	public Boolean isVisibilidadCeldaDuplicarBajasActivosFijos=true;
	public Boolean isVisibilidadCeldaCopiarBajasActivosFijos=true;
	public Boolean isVisibilidadCeldaVerFormBajasActivosFijos=true;
	public Boolean isVisibilidadCeldaOrdenBajasActivosFijos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
	public Boolean isVisibilidadCeldaModificarBajasActivosFijos=false;
	public Boolean isVisibilidadCeldaActualizarBajasActivosFijos=false;
	public Boolean isVisibilidadCeldaEliminarBajasActivosFijos=false;
	public Boolean isVisibilidadCeldaCancelarBajasActivosFijos=false;
	public Boolean isVisibilidadCeldaGuardarBajasActivosFijos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;	
	
	
	public Boolean isVisibilidadBusquedaBajasActivosFijos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoBajasActivosFijos() {
		return this.iIdNuevoBajasActivosFijos;
	}

	public void setiIdNuevoBajasActivosFijos(Long iIdNuevoBajasActivosFijos) {
		this.iIdNuevoBajasActivosFijos = iIdNuevoBajasActivosFijos;
	}
	
	public Long getidBajasActivosFijosActual() {
		return this.idBajasActivosFijosActual;
	}

	public void setidBajasActivosFijosActual(Long idBajasActivosFijosActual) {
		this.idBajasActivosFijosActual = idBajasActivosFijosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public BajasActivosFijos getbajasactivosfijos() {
		return this.bajasactivosfijos;
	}

	public void setbajasactivosfijos(BajasActivosFijos bajasactivosfijos) {
		this.bajasactivosfijos = bajasactivosfijos;
	}
	
	public BajasActivosFijos getbajasactivosfijosAux() {
		return this.bajasactivosfijosAux;
	}

	public void setbajasactivosfijosAux(BajasActivosFijos bajasactivosfijosAux) {
		this.bajasactivosfijosAux = bajasactivosfijosAux;
	}				
	
	public BajasActivosFijos getbajasactivosfijosAnterior() {
		return this.bajasactivosfijosAnterior;
	}

	public void setbajasactivosfijosAnterior(BajasActivosFijos bajasactivosfijosAnterior) {
		this.bajasactivosfijosAnterior = bajasactivosfijosAnterior;
	}	
	
	public BajasActivosFijos getbajasactivosfijosTotales() {
		return this.bajasactivosfijosTotales;
	}

	public void setbajasactivosfijosTotales(BajasActivosFijos bajasactivosfijosTotales) {
		this.bajasactivosfijosTotales = bajasactivosfijosTotales;
	}	
	
	public BajasActivosFijos getbajasactivosfijosBean() {
		return this.bajasactivosfijosBean;
	}

	public void setbajasactivosfijosBean(BajasActivosFijos bajasactivosfijosBean) {
		this.bajasactivosfijosBean = bajasactivosfijosBean;
	}	
	
	public BajasActivosFijosParameterReturnGeneral getbajasactivosfijosReturnGeneral() {
		return this.bajasactivosfijosReturnGeneral;
	}

	public void setbajasactivosfijosReturnGeneral(BajasActivosFijosParameterReturnGeneral bajasactivosfijosReturnGeneral) {
		this.bajasactivosfijosReturnGeneral = bajasactivosfijosReturnGeneral;
	}	
	
	
	public Long idBusquedaBajasActivosFijos=0L;

	public Long getidBusquedaBajasActivosFijos() {
		return this.idBusquedaBajasActivosFijos;
	}

	public void setidBusquedaBajasActivosFijos(Long idBusquedaBajasActivosFijos) {
		this.idBusquedaBajasActivosFijos = idBusquedaBajasActivosFijos;
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
	
	
	public BajasActivosFijosLogic getBajasActivosFijosLogic()	{		
		return bajasactivosfijosLogic;
	}

	public void setBajasActivosFijosLogic(BajasActivosFijosLogic bajasactivosfijosLogic) {
		this.bajasactivosfijosLogic = bajasactivosfijosLogic;
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
	
	public Boolean getIsEsNuevoBajasActivosFijos() {
		return isEsNuevoBajasActivosFijos;
	}

	public void setIsEsNuevoBajasActivosFijos(Boolean isEsNuevoBajasActivosFijos) {
		this.isEsNuevoBajasActivosFijos = isEsNuevoBajasActivosFijos;
	}

	public Boolean getEsParaAccionDesdeFormularioBajasActivosFijos() {
		return esParaAccionDesdeFormularioBajasActivosFijos;
	}
	
	public void setEsParaAccionDesdeFormularioBajasActivosFijos(Boolean esParaAccionDesdeFormularioBajasActivosFijos) {
		this.esParaAccionDesdeFormularioBajasActivosFijos = esParaAccionDesdeFormularioBajasActivosFijos;
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

			if(this.bajasactivosfijosSessionBean==null) {
				this.bajasactivosfijosSessionBean=new BajasActivosFijosSessionBean();
			}

			if(!this.bajasactivosfijosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(bajasactivosfijosSessionBean.getlidEmpresaActual());
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

					if(this.bajasactivosfijos!=null) {
						this.bajasactivosfijos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
						this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaBajasActivosFijos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
						if(this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.getItemCount()>0) {
							this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaBajasActivosFijosGenerico)throws Exception
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
				jComboBoxid_empresaBajasActivosFijosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaBajasActivosFijosGenerico!=null && jComboBoxid_empresaBajasActivosFijosGenerico.getItemCount()>0) {
					jComboBoxid_empresaBajasActivosFijosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(BajasActivosFijos bajasactivosfijos,JComboBox jComboBoxid_empresaBajasActivosFijosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaBajasActivosFijosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaBajasActivosFijosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				bajasactivosfijos.setid_empresa(empresaAux.getId());
				bajasactivosfijos.setempresa_descripcion(BajasActivosFijosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				bajasactivosfijos.setEmpresa(empresaAux);			}
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

					if(!BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { 
							this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { 
					}

					if(!BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
							this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
							this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesBajasActivosFijos() throws Exception {
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
		
	public BajasActivosFijosParameterReturnGeneral getBajasActivosFijosParameterGeneral() {
		return this.bajasactivosfijosParameterGeneral;
	}
	
	public void setBajasActivosFijosParameterGeneral(BajasActivosFijosParameterReturnGeneral bajasactivosfijosParameterGeneral) {
		this.bajasactivosfijosParameterGeneral = bajasactivosfijosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoBajasActivosFijos() {
		return isPermisoTodoBajasActivosFijos;
	}

	public void setIsPermisoTodoBajasActivosFijos(Boolean isPermisoTodoBajasActivosFijos) {
		this.isPermisoTodoBajasActivosFijos = isPermisoTodoBajasActivosFijos;
	}

	public Boolean getIsPermisoNuevoBajasActivosFijos() {
		return isPermisoNuevoBajasActivosFijos;
	}

	public void setIsPermisoNuevoBajasActivosFijos(Boolean isPermisoNuevoBajasActivosFijos) {
		this.isPermisoNuevoBajasActivosFijos = isPermisoNuevoBajasActivosFijos;
	}

	public Boolean getIsPermisoActualizarBajasActivosFijos() {
		return isPermisoActualizarBajasActivosFijos;
	}

	public void setIsPermisoActualizarBajasActivosFijos(Boolean isPermisoActualizarBajasActivosFijos) {
		this.isPermisoActualizarBajasActivosFijos = isPermisoActualizarBajasActivosFijos;
	}

	public Boolean getIsPermisoEliminarBajasActivosFijos() {
		return isPermisoEliminarBajasActivosFijos;
	}

	public void setIsPermisoEliminarBajasActivosFijos(Boolean isPermisoEliminarBajasActivosFijos) {
		this.isPermisoEliminarBajasActivosFijos = isPermisoEliminarBajasActivosFijos;
	}

	public Boolean getIsPermisoGuardarCambiosBajasActivosFijos() {
		return isPermisoGuardarCambiosBajasActivosFijos;
	}

	public void setIsPermisoGuardarCambiosBajasActivosFijos(Boolean isPermisoGuardarCambiosBajasActivosFijos) {
		this.isPermisoGuardarCambiosBajasActivosFijos = isPermisoGuardarCambiosBajasActivosFijos;
	}
	
	public Boolean getIsPermisoConsultaBajasActivosFijos() {
		return isPermisoConsultaBajasActivosFijos;
	}

	public void setIsPermisoConsultaBajasActivosFijos(Boolean isPermisoConsultaBajasActivosFijos) {
		this.isPermisoConsultaBajasActivosFijos = isPermisoConsultaBajasActivosFijos;
	}

	public Boolean getIsPermisoBusquedaBajasActivosFijos() {
		return isPermisoBusquedaBajasActivosFijos;
	}

	public void setIsPermisoBusquedaBajasActivosFijos(Boolean isPermisoBusquedaBajasActivosFijos) {
		this.isPermisoBusquedaBajasActivosFijos = isPermisoBusquedaBajasActivosFijos;
	}

	public Boolean getIsPermisoReporteBajasActivosFijos() {
		return isPermisoReporteBajasActivosFijos;
	}

	public void setIsPermisoReporteBajasActivosFijos(Boolean isPermisoReporteBajasActivosFijos) {
		this.isPermisoReporteBajasActivosFijos = isPermisoReporteBajasActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionMedioBajasActivosFijos() {
		return isPermisoPaginacionMedioBajasActivosFijos;
	}

	public void setIsPermisoPaginacionMedioBajasActivosFijos(Boolean isPermisoPaginacionMedioBajasActivosFijos) {
		this.isPermisoPaginacionMedioBajasActivosFijos = isPermisoPaginacionMedioBajasActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionTodoBajasActivosFijos() {
		return isPermisoPaginacionTodoBajasActivosFijos;
	}

	public void setIsPermisoPaginacionTodoBajasActivosFijos(Boolean isPermisoPaginacionTodoBajasActivosFijos) {
		this.isPermisoPaginacionTodoBajasActivosFijos = isPermisoPaginacionTodoBajasActivosFijos;
	}
	
	public Boolean getIsPermisoPaginacionAltoBajasActivosFijos() {
		return isPermisoPaginacionAltoBajasActivosFijos;
	}

	public void setIsPermisoPaginacionAltoBajasActivosFijos(Boolean isPermisoPaginacionAltoBajasActivosFijos) {
		this.isPermisoPaginacionAltoBajasActivosFijos = isPermisoPaginacionAltoBajasActivosFijos;
	}
	
	public Boolean getIsPermisoCopiarBajasActivosFijos() {
		return isPermisoCopiarBajasActivosFijos;
	}

	public void setIsPermisoCopiarBajasActivosFijos(Boolean isPermisoCopiarBajasActivosFijos) {
		this.isPermisoCopiarBajasActivosFijos = isPermisoCopiarBajasActivosFijos;
	}
	
	public Boolean getIsPermisoVerFormBajasActivosFijos() {
		return isPermisoVerFormBajasActivosFijos;
	}

	public void setIsPermisoVerFormBajasActivosFijos(Boolean isPermisoVerFormBajasActivosFijos) {
		this.isPermisoVerFormBajasActivosFijos = isPermisoVerFormBajasActivosFijos;
	}
	
	public Boolean getIsPermisoDuplicarBajasActivosFijos() {
		return isPermisoDuplicarBajasActivosFijos;
	}

	public void setIsPermisoDuplicarBajasActivosFijos(Boolean isPermisoDuplicarBajasActivosFijos) {
		this.isPermisoDuplicarBajasActivosFijos = isPermisoDuplicarBajasActivosFijos;
	}
	
	public Boolean getIsPermisoOrdenBajasActivosFijos() {
		return isPermisoOrdenBajasActivosFijos;
	}

	public void setIsPermisoOrdenBajasActivosFijos(Boolean isPermisoOrdenBajasActivosFijos) {
		this.isPermisoOrdenBajasActivosFijos = isPermisoOrdenBajasActivosFijos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoBajasActivosFijos() {
		return isVisibilidadCeldaNuevoBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaNuevoBajasActivosFijos(Boolean isVisibilidadCeldaNuevoBajasActivosFijos) {
		this.isVisibilidadCeldaNuevoBajasActivosFijos = isVisibilidadCeldaNuevoBajasActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarBajasActivosFijos() {
		return isVisibilidadCeldaDuplicarBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaDuplicarBajasActivosFijos(Boolean isVisibilidadCeldaDuplicarBajasActivosFijos) {
		this.isVisibilidadCeldaDuplicarBajasActivosFijos = isVisibilidadCeldaDuplicarBajasActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarBajasActivosFijos() {
		return isVisibilidadCeldaCopiarBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaCopiarBajasActivosFijos(Boolean isVisibilidadCeldaCopiarBajasActivosFijos) {
		this.isVisibilidadCeldaCopiarBajasActivosFijos = isVisibilidadCeldaCopiarBajasActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormBajasActivosFijos() {
		return isVisibilidadCeldaVerFormBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaVerFormBajasActivosFijos(Boolean isVisibilidadCeldaVerFormBajasActivosFijos) {
		this.isVisibilidadCeldaVerFormBajasActivosFijos = isVisibilidadCeldaVerFormBajasActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenBajasActivosFijos() {
		return isVisibilidadCeldaOrdenBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaOrdenBajasActivosFijos(Boolean isVisibilidadCeldaOrdenBajasActivosFijos) {
		this.isVisibilidadCeldaOrdenBajasActivosFijos = isVisibilidadCeldaOrdenBajasActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesBajasActivosFijos() {
		return isVisibilidadCeldaNuevoRelacionesBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesBajasActivosFijos(Boolean isVisibilidadCeldaNuevoRelacionesBajasActivosFijos) {
		this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos = isVisibilidadCeldaNuevoRelacionesBajasActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarBajasActivosFijos() {
		return isVisibilidadCeldaModificarBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaModificarBajasActivosFijos(Boolean isVisibilidadCeldaModificarBajasActivosFijos) {
		this.isVisibilidadCeldaModificarBajasActivosFijos = isVisibilidadCeldaModificarBajasActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarBajasActivosFijos() {
		return isVisibilidadCeldaActualizarBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaActualizarBajasActivosFijos(Boolean isVisibilidadCeldaActualizarBajasActivosFijos) {
		this.isVisibilidadCeldaActualizarBajasActivosFijos = isVisibilidadCeldaActualizarBajasActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaEliminarBajasActivosFijos() {
		return isVisibilidadCeldaEliminarBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaEliminarBajasActivosFijos(Boolean isVisibilidadCeldaEliminarBajasActivosFijos) {
		this.isVisibilidadCeldaEliminarBajasActivosFijos = isVisibilidadCeldaEliminarBajasActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaCancelarBajasActivosFijos() {
		return isVisibilidadCeldaCancelarBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaCancelarBajasActivosFijos(Boolean isVisibilidadCeldaCancelarBajasActivosFijos) {
		this.isVisibilidadCeldaCancelarBajasActivosFijos = isVisibilidadCeldaCancelarBajasActivosFijos;
	}

	public Boolean getIsVisibilidadCeldaGuardarBajasActivosFijos() {
		return isVisibilidadCeldaGuardarBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaGuardarBajasActivosFijos(Boolean isVisibilidadCeldaGuardarBajasActivosFijos) {
		this.isVisibilidadCeldaGuardarBajasActivosFijos = isVisibilidadCeldaGuardarBajasActivosFijos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosBajasActivosFijos() {
		return isVisibilidadCeldaGuardarCambiosBajasActivosFijos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosBajasActivosFijos(Boolean isVisibilidadCeldaGuardarCambiosBajasActivosFijos) {
		this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos = isVisibilidadCeldaGuardarCambiosBajasActivosFijos;
	}
		
	public BajasActivosFijosSessionBean getbajasactivosfijosSessionBean() {
		return this.bajasactivosfijosSessionBean;
	}
	
	public void setbajasactivosfijosSessionBean(BajasActivosFijosSessionBean bajasactivosfijosSessionBean) {
		this.bajasactivosfijosSessionBean=bajasactivosfijosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaBajasActivosFijos() {
		return this.isVisibilidadBusquedaBajasActivosFijos;
	}

	public void setisVisibilidadBusquedaBajasActivosFijos(Boolean isVisibilidadBusquedaBajasActivosFijos) {
		this.isVisibilidadBusquedaBajasActivosFijos=isVisibilidadBusquedaBajasActivosFijos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(BajasActivosFijos bajasactivosfijos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(bajasactivosfijos,null);
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
	
	public void bugActualizarReferenciaActual(BajasActivosFijos bajasactivosfijos,BajasActivosFijos bajasactivosfijosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalBajasActivosFijos(bajasactivosfijos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		bajasactivosfijosAux.setId(bajasactivosfijos.getId());
		bajasactivosfijosAux.setVersionRow(bajasactivosfijos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(BajasActivosFijos bajasactivosfijosLocal) throws Exception {
		
		if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(BajasActivosFijos bajasactivosfijosLocal) throws Exception {	
		if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				bajasactivosfijosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarBajasActivosFijosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = bajasactivosfijosValidator.getInvalidValues(this.bajasactivosfijos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(BajasActivosFijos bajasactivosfijos,List<BajasActivosFijos> bajasactivosfijoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(BajasActivosFijos bajasactivosfijos,List<BajasActivosFijos> bajasactivosfijoss) throws Exception {
		try	{			
			BajasActivosFijosConstantesFunciones.actualizarSelectedLista(bajasactivosfijos,bajasactivosfijoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<BajasActivosFijos> bajasactivosfijossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				bajasactivosfijossLocal=this.bajasactivosfijosLogic.getBajasActivosFijoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				bajasactivosfijossLocal=this.bajasactivosfijoss;
			}
			//ARCHITECTURE
		
			for(BajasActivosFijos bajasactivosfijosLocal:bajasactivosfijossLocal) {
				if(this.permiteMantenimiento(bajasactivosfijosLocal) && bajasactivosfijosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+BajasActivosFijosConstantesFunciones.getBajasActivosFijosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.CODIGOSUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcodigo_sub_grupoBajasActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.NOMBRESUBGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombre_sub_grupoBajasActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.CODIGODETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcodigo_detalle_grupoBajasActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.NOMBREDETALLEGRUPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombre_detalle_grupoBajasActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.CLAVE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelclaveBajasActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombreBajasActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.FECHACOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelfecha_compraBajasActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.VIDAUTIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelvida_utilBajasActivosFijos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(BajasActivosFijosConstantesFunciones.COSTODECOMPRA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcosto_de_compraBajasActivosFijos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcodigo_sub_grupoBajasActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombre_sub_grupoBajasActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcodigo_detalle_grupoBajasActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombre_detalle_grupoBajasActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelclaveBajasActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombreBajasActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelfecha_compraBajasActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelvida_utilBajasActivosFijos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcosto_de_compraBajasActivosFijos,"");
		
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
		this.iIdNuevoBajasActivosFijos--;	
		
		
		this.bajasactivosfijosAux=new BajasActivosFijos();
		
		this.bajasactivosfijosAux.setId(this.iIdNuevoBajasActivosFijos);
		this.bajasactivosfijosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.bajasactivosfijosLogic.getBajasActivosFijoss().add(this.bajasactivosfijosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.bajasactivosfijoss.add(this.bajasactivosfijosAux);
		}
		//ARCHITECTURE
		
		this.bajasactivosfijos=this.bajasactivosfijosAux;
		
		if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioBajasActivosFijos(this.bajasactivosfijos);
			this.setVariablesObjetoActualToFormularioForeignKeyBajasActivosFijos(this.bajasactivosfijos);
		}
				
		//this.setDefaultControlesBajasActivosFijos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyBajasActivosFijos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyBajasActivosFijos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyBajasActivosFijos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBajasActivosFijos(this.bajasactivosfijosBean,this.bajasactivosfijos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanBajasActivosFijos(this.bajasactivosfijosReturnGeneral,this.bajasactivosfijosBean,false);
		
		if(this.bajasactivosfijosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyBajasActivosFijos(this.bajasactivosfijosReturnGeneral.getBajasActivosFijos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioBajasActivosFijos(this.bajasactivosfijosReturnGeneral.getBajasActivosFijos());
		}
		
		if(this.bajasactivosfijosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioBajasActivosFijos(this.bajasactivosfijosReturnGeneral.getBajasActivosFijos(),classes);//this.bajasactivosfijosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyBajasActivosFijos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyBajasActivosFijos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.RecargarFormBajasActivosFijos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingBajasActivosFijos(false);
						
			if(bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBajasActivosFijos();
			}
			
			this.actualizarVisualTableDatosBajasActivosFijos();
			
			this.jTableDatosBajasActivosFijos.setRowSelectionInterval(this.getIndiceNuevoBajasActivosFijos(), this.getIndiceNuevoBajasActivosFijos());
			
			this.seleccionarFilaTablaBajasActivosFijosActual();
						
			this.actualizarEstadoCeldasBotonesBajasActivosFijos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesBajasActivosFijos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_sub_grupoBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarcodigo_sub_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_sub_grupoBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarnombre_sub_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_detalle_grupoBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarcodigo_detalle_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_detalle_grupoBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarnombre_detalle_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldclaveBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarclaveBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombreBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarnombreBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jDateChooserfecha_compraBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarfecha_compraBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldvida_utilBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarvida_utilBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcosto_de_compraBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarcosto_de_compraBajasActivosFijos);	
		//
		this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setEnabled(isHabilitar && this.bajasactivosfijosConstantesFunciones.activarid_empresaBajasActivosFijos);
	};
	
	public void setDefaultControlesBajasActivosFijos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoBajasActivosFijos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.bajasactivosfijosSessionBean.setConGuardarRelaciones(true);			
			this.bajasactivosfijosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.setVisible(true);
			
					
		} else {
			//this.bajasactivosfijosSessionBean.setConGuardarRelaciones(false);			
			this.bajasactivosfijosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoBajasActivosFijos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
				if(bajasactivosfijosAux.getId().equals(this.iIdNuevoBajasActivosFijos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijoss) {
				if(bajasactivosfijosAux.getId().equals(this.iIdNuevoBajasActivosFijos)) {
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
	
	public int getIndiceActualBajasActivosFijos(BajasActivosFijos bajasactivosfijos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
				if(bajasactivosfijosAux.getId().equals(bajasactivosfijos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijoss) {
				if(bajasactivosfijosAux.getId().equals(bajasactivosfijos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalBajasActivosFijos(BajasActivosFijos bajasactivosfijosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
				if(bajasactivosfijosAux.getBajasActivosFijosOriginal().getId().equals(bajasactivosfijosOriginal.getId())) {
					existe=true;
					bajasactivosfijosOriginal.setId(bajasactivosfijosAux.getId());
					bajasactivosfijosOriginal.setVersionRow(bajasactivosfijosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijoss) {
				if(bajasactivosfijosAux.getBajasActivosFijosOriginal().getId().equals(bajasactivosfijosOriginal.getId())) {
					existe=true;
					bajasactivosfijosOriginal.setId(bajasactivosfijosAux.getId());
					bajasactivosfijosOriginal.setVersionRow(bajasactivosfijosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosBajasActivosFijos(Boolean esParaCancelar) throws Exception {
		bajasactivosfijossAux=new ArrayList<BajasActivosFijos>();
		bajasactivosfijosAux=new BajasActivosFijos();
		
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
					if(bajasactivosfijosAux.getId()<0) {
						bajasactivosfijossAux.add(bajasactivosfijosAux);
					}		
				}
				this.iIdNuevoBajasActivosFijos=0L;
				this.bajasactivosfijosLogic.getBajasActivosFijoss().removeAll(bajasactivosfijossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijoss) {
					if(bajasactivosfijosAux.getId()<0) {
						bajasactivosfijossAux.add(bajasactivosfijosAux);
					}		
				}
				this.iIdNuevoBajasActivosFijos=0L;
				this.bajasactivosfijoss.removeAll(bajasactivosfijossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoBajasActivosFijos 
					&& this.bajasactivosfijosLogic.getBajasActivosFijoss().size()>0
					) {
					bajasactivosfijosAux=this.bajasactivosfijosLogic.getBajasActivosFijoss().get(this.bajasactivosfijosLogic.getBajasActivosFijoss().size() - 1);
				
					if(bajasactivosfijosAux.getId()<0) {
						this.bajasactivosfijosLogic.getBajasActivosFijoss().remove(bajasactivosfijosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoBajasActivosFijos && this.bajasactivosfijoss.size()>0) {
					bajasactivosfijosAux=this.bajasactivosfijoss.get(this.bajasactivosfijoss.size() - 1);
				
					if(bajasactivosfijosAux.getId()<0) {
						this.bajasactivosfijoss.remove(bajasactivosfijosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoBajasActivosFijos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(bajasactivosfijos.getId()<0) {
				this.bajasactivosfijosLogic.getBajasActivosFijoss().remove(this.bajasactivosfijos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(bajasactivosfijos.getId()<0) {
				this.bajasactivosfijoss.remove(this.bajasactivosfijos);
			}
		}			
	}
	
	public void setEstadosInicialesBajasActivosFijos(List<BajasActivosFijos> bajasactivosfijossAux) throws Exception {
		BajasActivosFijosConstantesFunciones.setEstadosInicialesBajasActivosFijos(bajasactivosfijossAux);
	}
	
	public void setEstadosInicialesBajasActivosFijos(BajasActivosFijos bajasactivosfijosAux) throws Exception {
		BajasActivosFijosConstantesFunciones.setEstadosInicialesBajasActivosFijos(bajasactivosfijosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarBajasActivosFijosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesBajasActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarBajasActivosFijosActual()) {
				if(!this.isEsNuevoBajasActivosFijos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesBajasActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoBajasActivosFijos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarBajasActivosFijosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Bajas Activos Fijos ?", "MANTENIMIENTO DE Bajas Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesBajasActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(BajasActivosFijos bajasactivosfijos) throws Exception {
		BajasActivosFijosConstantesFunciones.seleccionarAsignar(this.bajasactivosfijos,bajasactivosfijos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarBajasActivosFijos=this.isPermisoActualizarOriginalBajasActivosFijos;
			
			
			this.seleccionarAsignar(bajasactivosfijos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesBajasActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.bajasactivosfijosSessionBean.setsFuncionBusquedaRapida(this.bajasactivosfijosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoBajasActivosFijos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosBajasActivosFijos(esParaCancelar);				
				this.cancelarNuevoBajasActivosFijos(esParaCancelar);								
			}
			
			this.bajasactivosfijos=new BajasActivosFijos();
			
			this.inicializarBajasActivosFijos();
			
			this.actualizarEstadoCeldasBotonesBajasActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarBajasActivosFijos() throws Exception {
		try {
			BajasActivosFijosConstantesFunciones.inicializarBajasActivosFijos(this.bajasactivosfijos);
			
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
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.bajasactivosfijosLogic.getBajasActivosFijoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteBajasActivosFijoss(String sAccionBusqueda,List<BajasActivosFijos> bajasactivosfijossParaReportes) throws Exception {
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
					sPathReporteFinal="BajasActivosFijos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="BajasActivosFijosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("BajasActivosFijosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="BajasActivosFijos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Bajas Activos Fijoses");		
		parameters.put("busquedapor", BajasActivosFijosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceBajasActivosFijos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			BajasActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			BajasActivosFijosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceBajasActivosFijos=new JRBeanArrayDataSource(BajasActivosFijosJInternalFrame.TraerBajasActivosFijosBeans(bajasactivosfijossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceBajasActivosFijos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+BajasActivosFijosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+BajasActivosFijosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(BajasActivosFijosBean.TraerBajasActivosFijosBeans(bajasactivosfijossParaReportes).toArray()));
							
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
				this.generarExcelReporteBajasActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,bajasactivosfijossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalBajasActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,bajasactivosfijossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoBajasActivosFijosActionPerformed(null);
					//this.generarExcelReporteBajasActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,bajasactivosfijossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalBajasActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,bajasactivosfijossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesBajasActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,bajasactivosfijossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesBajasActivosFijoss(sAccionBusqueda,sTipoArchivoReporte,bajasactivosfijossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteBajasActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<BajasActivosFijos> bajasactivosfijossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bajasactivosfijos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BajasActivosFijoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBajasActivosFijos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(BajasActivosFijos bajasactivosfijos : bajasactivosfijossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			BajasActivosFijosConstantesFunciones.generarExcelReporteDataBajasActivosFijos("NORMAL",row,workbook,bajasactivosfijos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderBajasActivosFijos(String sTipo,Row row,Workbook workbook) {
		
		BajasActivosFijosConstantesFunciones.generarExcelReporteHeaderBajasActivosFijos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalBajasActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<BajasActivosFijos> bajasactivosfijossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bajasactivosfijos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BajasActivosFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(BajasActivosFijos bajasactivosfijos : bajasactivosfijossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(BajasActivosFijosConstantesFunciones.getBajasActivosFijosDescripcion(bajasactivosfijos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getcodigo_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getnombre_sub_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getcodigo_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getnombre_detalle_grupo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_CLAVE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CLAVE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getclave());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getfecha_compra());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getvida_util());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(bajasactivosfijos.getcosto_de_compra());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesBajasActivosFijoss(String sAccionBusqueda,String sTipoArchivoReporte,List<BajasActivosFijos> bajasactivosfijossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<BajasActivosFijos> bajasactivosfijossRespaldo=null;
		
		classes=BajasActivosFijosConstantesFunciones.getClassesRelationshipsOfBajasActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.bajasactivosfijosLogic.setDatosCliente(this.datosCliente);
		this.bajasactivosfijosLogic.setDatosDeep(this.datosDeep);
		this.bajasactivosfijosLogic.setIsConDeep(true);
		
		bajasactivosfijossRespaldo=this.bajasactivosfijosLogic.getBajasActivosFijoss();
		
		this.bajasactivosfijosLogic.setBajasActivosFijoss(bajasactivosfijossParaReportes);	
		this.bajasactivosfijosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		bajasactivosfijossParaReportes=this.bajasactivosfijosLogic.getBajasActivosFijoss();
		this.bajasactivosfijosLogic.setBajasActivosFijoss(bajasactivosfijossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bajasactivosfijos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("BajasActivosFijoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderBajasActivosFijos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(BajasActivosFijos bajasactivosfijos : bajasactivosfijossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderBajasActivosFijos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			BajasActivosFijosConstantesFunciones.generarExcelReporteDataBajasActivosFijos("NORMAL",row,workbook,bajasactivosfijos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(BajasActivosFijosConstantesFunciones.getBajasActivosFijosDescripcion(bajasactivosfijos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessBajasActivosFijos() throws Exception {		
		this.startProcessBajasActivosFijos(true);
	}
	
	public void startProcessBajasActivosFijos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasBajasActivosFijos ,this.jPanelParametrosReportesBajasActivosFijos, this.jScrollPanelDatosBajasActivosFijos,this.jPanelPaginacionBajasActivosFijos, this.jScrollPanelDatosEdicionBajasActivosFijos, this.jPanelAccionesBajasActivosFijos,this.jPanelAccionesFormularioBajasActivosFijos,this.jmenuBarBajasActivosFijos,this.jmenuBarDetalleBajasActivosFijos,this.jTtoolBarBajasActivosFijos,this.jTtoolBarDetalleBajasActivosFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasBajasActivosFijos=this.jTabbedPaneBusquedasBajasActivosFijos; 
		
		final JPanel jPanelParametrosReportesBajasActivosFijos=this.jPanelParametrosReportesBajasActivosFijos;
		//final JScrollPane jScrollPanelDatosBajasActivosFijos=this.jScrollPanelDatosBajasActivosFijos;
		final JTable jTableDatosBajasActivosFijos=this.jTableDatosBajasActivosFijos;		
		final JPanel jPanelPaginacionBajasActivosFijos=this.jPanelPaginacionBajasActivosFijos;
		//final JScrollPane jScrollPanelDatosEdicionBajasActivosFijos=this.jScrollPanelDatosEdicionBajasActivosFijos;
		final JPanel jPanelAccionesBajasActivosFijos=this.jPanelAccionesBajasActivosFijos;
		
		JPanel jPanelCamposAuxiliarBajasActivosFijos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarBajasActivosFijos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			jPanelCamposAuxiliarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jPanelCamposBajasActivosFijos;
			jPanelAccionesFormularioAuxiliarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jPanelAccionesFormularioBajasActivosFijos;
		}
		
		final JPanel jPanelCamposBajasActivosFijos=jPanelCamposAuxiliarBajasActivosFijos;
		final JPanel jPanelAccionesFormularioBajasActivosFijos=jPanelAccionesFormularioAuxiliarBajasActivosFijos;
		
		
		final JMenuBar jmenuBarBajasActivosFijos=this.jmenuBarBajasActivosFijos;
		final JToolBar jTtoolBarBajasActivosFijos=this.jTtoolBarBajasActivosFijos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarBajasActivosFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBajasActivosFijos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			jmenuBarDetalleAuxiliarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jmenuBarDetalleBajasActivosFijos;
			jTtoolBarDetalleAuxiliarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jTtoolBarDetalleBajasActivosFijos;
		}
		
		final JMenuBar jmenuBarDetalleBajasActivosFijos=jmenuBarDetalleAuxiliarBajasActivosFijos;
		final JToolBar jTtoolBarDetalleBajasActivosFijos=jTtoolBarDetalleAuxiliarBajasActivosFijos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBajasActivosFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBajasActivosFijos;
			processRunnable.jTableDatos=jTableDatosBajasActivosFijos;
			processRunnable.jPanelCampos=jPanelCamposBajasActivosFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionBajasActivosFijos;
			processRunnable.jPanelAcciones=jPanelAccionesBajasActivosFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBajasActivosFijos;
			
			
			processRunnable.jmenuBar=jmenuBarBajasActivosFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBajasActivosFijos;
			processRunnable.jTtoolBar=jTtoolBarBajasActivosFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBajasActivosFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBajasActivosFijos ,jPanelParametrosReportesBajasActivosFijos,jTableDatosBajasActivosFijos, /*jScrollPanelDatosBajasActivosFijos,*/jPanelCamposBajasActivosFijos,jPanelPaginacionBajasActivosFijos, /*jScrollPanelDatosEdicionBajasActivosFijos,*/ jPanelAccionesBajasActivosFijos,jPanelAccionesFormularioBajasActivosFijos,jmenuBarBajasActivosFijos,jmenuBarDetalleBajasActivosFijos,jTtoolBarBajasActivosFijos,jTtoolBarDetalleBajasActivosFijos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasBajasActivosFijos ,jPanelParametrosReportesBajasActivosFijos, jScrollPanelDatosBajasActivosFijos,jPanelPaginacionBajasActivosFijos, jScrollPanelDatosEdicionBajasActivosFijos, jPanelAccionesBajasActivosFijos,jPanelAccionesFormularioBajasActivosFijos,jmenuBarBajasActivosFijos,jmenuBarDetalleBajasActivosFijos,jTtoolBarBajasActivosFijos,jTtoolBarDetalleBajasActivosFijos);
						
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
	
	public void finishProcessBajasActivosFijos() {// throws Exception 
		this.finishProcessBajasActivosFijos(true);
	}
	
	public void finishProcessBajasActivosFijos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasBajasActivosFijos ,this.jPanelParametrosReportesBajasActivosFijos, this.jScrollPanelDatosBajasActivosFijos,this.jPanelPaginacionBajasActivosFijos, this.jScrollPanelDatosEdicionBajasActivosFijos, this.jPanelAccionesBajasActivosFijos,this.jPanelAccionesFormularioBajasActivosFijos,this.jmenuBarBajasActivosFijos,this.jmenuBarDetalleBajasActivosFijos,this.jTtoolBarBajasActivosFijos,this.jTtoolBarDetalleBajasActivosFijos);		
		
		final JTabbedPane jTabbedPaneBusquedasBajasActivosFijos=this.jTabbedPaneBusquedasBajasActivosFijos; 
		
		final JPanel jPanelParametrosReportesBajasActivosFijos=this.jPanelParametrosReportesBajasActivosFijos;
		//final JScrollPane jScrollPanelDatosBajasActivosFijos=this.jScrollPanelDatosBajasActivosFijos;
		final JTable jTableDatosBajasActivosFijos=this.jTableDatosBajasActivosFijos;		
		final JPanel jPanelPaginacionBajasActivosFijos=this.jPanelPaginacionBajasActivosFijos;
		//final JScrollPane jScrollPanelDatosEdicionBajasActivosFijos=this.jScrollPanelDatosEdicionBajasActivosFijos;
		final JPanel jPanelAccionesBajasActivosFijos=this.jPanelAccionesBajasActivosFijos;
		
		JPanel jPanelCamposAuxiliarBajasActivosFijos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarBajasActivosFijos=new JPanel();
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			jPanelCamposAuxiliarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jPanelCamposBajasActivosFijos;
			jPanelAccionesFormularioAuxiliarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jPanelAccionesFormularioBajasActivosFijos;
		}
		
		final JPanel jPanelCamposBajasActivosFijos=jPanelCamposAuxiliarBajasActivosFijos;
		final JPanel jPanelAccionesFormularioBajasActivosFijos=jPanelAccionesFormularioAuxiliarBajasActivosFijos;
		
		
		final JMenuBar jmenuBarBajasActivosFijos=this.jmenuBarBajasActivosFijos;		
		final JToolBar jTtoolBarBajasActivosFijos=this.jTtoolBarBajasActivosFijos;
				
		JMenuBar jmenuBarDetalleAuxiliarBajasActivosFijos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarBajasActivosFijos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			jmenuBarDetalleAuxiliarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jmenuBarDetalleBajasActivosFijos;
			jTtoolBarDetalleAuxiliarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jTtoolBarDetalleBajasActivosFijos;		
		}
		
		final JMenuBar jmenuBarDetalleBajasActivosFijos=jmenuBarDetalleAuxiliarBajasActivosFijos;
		final JToolBar jTtoolBarDetalleBajasActivosFijos=jTtoolBarDetalleAuxiliarBajasActivosFijos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasBajasActivosFijos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesBajasActivosFijos;
			processRunnable.jTableDatos=jTableDatosBajasActivosFijos;
			processRunnable.jPanelCampos=jPanelCamposBajasActivosFijos;
			processRunnable.jPanelPaginacion=jPanelPaginacionBajasActivosFijos;
			processRunnable.jPanelAcciones=jPanelAccionesBajasActivosFijos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioBajasActivosFijos;
			
			
			processRunnable.jmenuBar=jmenuBarBajasActivosFijos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleBajasActivosFijos;
			processRunnable.jTtoolBar=jTtoolBarBajasActivosFijos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleBajasActivosFijos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasBajasActivosFijos ,jPanelParametrosReportesBajasActivosFijos, jTableDatosBajasActivosFijos,/*jScrollPanelDatosBajasActivosFijos,*/jPanelCamposBajasActivosFijos,jPanelPaginacionBajasActivosFijos, /*jScrollPanelDatosEdicionBajasActivosFijos,*/ jPanelAccionesBajasActivosFijos,jPanelAccionesFormularioBajasActivosFijos,jmenuBarBajasActivosFijos,jmenuBarDetalleBajasActivosFijos,jTtoolBarBajasActivosFijos,jTtoolBarDetalleBajasActivosFijos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesBajasActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarBajasActivosFijos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuBajasActivosFijos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarBajasActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarBajasActivosFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleBajasActivosFijos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuBajasActivosFijos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarBajasActivosFijos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleBajasActivosFijos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.bajasactivosfijosConstantesFunciones.getsFinalQueryBajasActivosFijos();
		String  finalQueryPaginacionTodos=this.bajasactivosfijosConstantesFunciones.getsFinalQueryBajasActivosFijos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=BajasActivosFijosConstantesFunciones.getArrayColumnasGlobalesNoBajasActivosFijos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=BajasActivosFijosConstantesFunciones.getArrayColumnasGlobalesBajasActivosFijos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,BajasActivosFijosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.bajasactivosfijossEliminados= new ArrayList<BajasActivosFijos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessBajasActivosFijos();
		
				///*BajasActivosFijosSessionBean*/this.bajasactivosfijosSessionBean=new BajasActivosFijosSessionBean();
			
			if(this.bajasactivosfijosSessionBean==null) {
				this.bajasactivosfijosSessionBean=new BajasActivosFijosSessionBean();
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
					this.iNumeroPaginacion=BajasActivosFijosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=BajasActivosFijosConstantesFunciones.getClassesForeignKeysOfBajasActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/bajasactivosfijos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			bajasactivosfijossAux= new ArrayList<BajasActivosFijos>();
			
				
			bajasactivosfijosLogic.setDatosCliente(this.datosCliente);
			bajasactivosfijosLogic.setDatosDeep(this.datosDeep);
			bajasactivosfijosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaBajasActivosFijos")) {
				this.sDetalleReporte=BajasActivosFijosConstantesFunciones.getDetalleIndiceBusquedaBajasActivosFijos(idBusquedaBajasActivosFijos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					bajasactivosfijosLogic.getBajasActivosFijossBusquedaBajasActivosFijos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaBajasActivosFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BajasActivosFijosConstantesFunciones.getDetalleIndiceBusquedaBajasActivosFijos(idBusquedaBajasActivosFijos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BajasActivosFijosConstantesFunciones.getDetalleIndiceBusquedaBajasActivosFijos(idBusquedaBajasActivosFijos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=bajasactivosfijosLogic.getBajasActivosFijoss()==null||bajasactivosfijosLogic.getBajasActivosFijoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=bajasactivosfijoss==null|| bajasactivosfijoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						bajasactivosfijossAux=new ArrayList<BajasActivosFijos>();
						bajasactivosfijossAux.addAll(bajasactivosfijosLogic.getBajasActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bajasactivosfijossAux=new ArrayList<BajasActivosFijos>();
							bajasactivosfijossAux.addAll(bajasactivosfijoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							bajasactivosfijosLogic.getBajasActivosFijossBusquedaBajasActivosFijos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,idBusquedaBajasActivosFijos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=BajasActivosFijosConstantesFunciones.getDetalleIndiceBusquedaBajasActivosFijos(idBusquedaBajasActivosFijos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=BajasActivosFijosConstantesFunciones.getDetalleIndiceBusquedaBajasActivosFijos(idBusquedaBajasActivosFijos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteBajasActivosFijoss("BusquedaBajasActivosFijos",bajasactivosfijosLogic.getBajasActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteBajasActivosFijoss("BusquedaBajasActivosFijos",bajasactivosfijoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						bajasactivosfijosLogic.setBajasActivosFijoss(new ArrayList<BajasActivosFijos>());
						bajasactivosfijosLogic.getBajasActivosFijoss().addAll(bajasactivosfijossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bajasactivosfijoss=new ArrayList<BajasActivosFijos>();
							bajasactivosfijoss.addAll(bajasactivosfijossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesBajasActivosFijos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessBajasActivosFijos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bajasactivosfijosLogic.getBajasActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bajasactivosfijoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=bajasactivosfijosLogic.getBajasActivosFijoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=bajasactivosfijoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(BajasActivosFijos bajasactivosfijos) {
		Boolean permite=true;
		
		if(this.bajasactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=BajasActivosFijosConstantesFunciones.getOrderByListaBajasActivosFijos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=BajasActivosFijosConstantesFunciones.getOrderByListaBajasActivosFijos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BajasActivosFijos bajasactivosfijos:bajasactivosfijosLogic.getBajasActivosFijoss()) {
				if(bajasactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					bajasactivosfijosTotales=bajasactivosfijos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BajasActivosFijos bajasactivosfijos:this.bajasactivosfijoss) {
				if(bajasactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					bajasactivosfijosTotales=bajasactivosfijos;
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
			this.bajasactivosfijosAux=new BajasActivosFijos();
			this.bajasactivosfijosAux.setsType(Constantes2.S_TOTALES);
			this.bajasactivosfijosAux.setIsNew(false);
			this.bajasactivosfijosAux.setIsChanged(false);
			this.bajasactivosfijosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//BajasActivosFijosConstantesFunciones.TotalizarValoresFilaBajasActivosFijos(this.bajasactivosfijosLogic.getBajasActivosFijoss(),this.bajasactivosfijosAux);
				
				//this.bajasactivosfijosLogic.getBajasActivosFijoss().add(this.bajasactivosfijosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				BajasActivosFijosConstantesFunciones.TotalizarValoresFilaBajasActivosFijos(this.bajasactivosfijoss,this.bajasactivosfijosAux);
				
				this.bajasactivosfijoss.add(this.bajasactivosfijosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		bajasactivosfijosTotales=new BajasActivosFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bajasactivosfijosLogic.getBajasActivosFijoss().remove(bajasactivosfijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.bajasactivosfijoss.remove(bajasactivosfijosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		bajasactivosfijosTotales=new BajasActivosFijos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(BajasActivosFijos bajasactivosfijos:bajasactivosfijosLogic.getBajasActivosFijoss()) {
				if(bajasactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					bajasactivosfijosTotales=bajasactivosfijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BajasActivosFijosConstantesFunciones.TotalizarValoresFilaBajasActivosFijos(this.bajasactivosfijosLogic.getBajasActivosFijoss(),bajasactivosfijosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(BajasActivosFijos bajasactivosfijos:this.bajasactivosfijoss) {
				if(bajasactivosfijos.getsType().equals(Constantes2.S_TOTALES)) {
					bajasactivosfijosTotales=bajasactivosfijos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				BajasActivosFijosConstantesFunciones.TotalizarValoresFilaBajasActivosFijos(this.bajasactivosfijoss,bajasactivosfijosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getBajasActivosFijossBusquedaBajasActivosFijos()throws Exception {
		try {
			sAccionBusqueda="BusquedaBajasActivosFijos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getBajasActivosFijossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getBajasActivosFijossBusquedaBajasActivosFijos(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bajasactivosfijosLogic.getBajasActivosFijossBusquedaBajasActivosFijos(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getBajasActivosFijossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//bajasactivosfijosLogic.getBajasActivosFijossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosBajasActivosFijos() {
		this.isPermisoTodoBajasActivosFijos=false;
		this.isPermisoNuevoBajasActivosFijos=false;
		this.isPermisoActualizarBajasActivosFijos=false;
		this.isPermisoActualizarOriginalBajasActivosFijos=false;
		this.isPermisoEliminarBajasActivosFijos=false;
		this.isPermisoGuardarCambiosBajasActivosFijos=false;
		this.isPermisoConsultaBajasActivosFijos=true;
		this.isPermisoBusquedaBajasActivosFijos=true;
		this.isPermisoReporteBajasActivosFijos=true;
		this.isPermisoOrdenBajasActivosFijos=false;		
		this.isPermisoPaginacionMedioBajasActivosFijos=false;		
		this.isPermisoPaginacionAltoBajasActivosFijos=false;		
		this.isPermisoPaginacionTodoBajasActivosFijos=false;		
		this.isPermisoCopiarBajasActivosFijos=false;		
		this.isPermisoVerFormBajasActivosFijos=false;		
		this.isPermisoDuplicarBajasActivosFijos=false;
		this.isPermisoOrdenBajasActivosFijos=false;
	}
	
	public void setPermisosUsuarioBajasActivosFijos(Boolean isPermiso) {
		this.isPermisoTodoBajasActivosFijos=isPermiso;
		this.isPermisoNuevoBajasActivosFijos=isPermiso;
		this.isPermisoActualizarBajasActivosFijos=isPermiso;
		this.isPermisoActualizarOriginalBajasActivosFijos=isPermiso;
		this.isPermisoEliminarBajasActivosFijos=isPermiso;
		this.isPermisoGuardarCambiosBajasActivosFijos=isPermiso;
		this.isPermisoConsultaBajasActivosFijos=isPermiso;
		this.isPermisoBusquedaBajasActivosFijos=isPermiso;
		this.isPermisoReporteBajasActivosFijos=isPermiso;
		this.isPermisoOrdenBajasActivosFijos=isPermiso;		
		this.isPermisoPaginacionMedioBajasActivosFijos=isPermiso;		
		this.isPermisoPaginacionAltoBajasActivosFijos=isPermiso;		
		this.isPermisoPaginacionTodoBajasActivosFijos=isPermiso;		
		this.isPermisoCopiarBajasActivosFijos=isPermiso;		
		this.isPermisoVerFormBajasActivosFijos=isPermiso;		
		this.isPermisoDuplicarBajasActivosFijos=isPermiso;
		this.isPermisoOrdenBajasActivosFijos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioBajasActivosFijos(Boolean isPermiso) {
		//this.isPermisoTodoBajasActivosFijos=isPermiso;
		this.isPermisoNuevoBajasActivosFijos=isPermiso;
		this.isPermisoActualizarBajasActivosFijos=isPermiso;
		this.isPermisoActualizarOriginalBajasActivosFijos=isPermiso;
		this.isPermisoEliminarBajasActivosFijos=isPermiso;
		this.isPermisoGuardarCambiosBajasActivosFijos=isPermiso;
		//this.isPermisoConsultaBajasActivosFijos=isPermiso;
		//this.isPermisoBusquedaBajasActivosFijos=isPermiso;
		//this.isPermisoReporteBajasActivosFijos=isPermiso;
		//this.isPermisoOrdenBajasActivosFijos=isPermiso;		
		//this.isPermisoPaginacionMedioBajasActivosFijos=isPermiso;		
		//this.isPermisoPaginacionAltoBajasActivosFijos=isPermiso;		
		//this.isPermisoPaginacionTodoBajasActivosFijos=isPermiso;		
		//this.isPermisoCopiarBajasActivosFijos=isPermiso;		
		//this.isPermisoDuplicarBajasActivosFijos=isPermiso;
		//this.isPermisoOrdenBajasActivosFijos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioBajasActivosFijosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(BajasActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebBajasActivosFijos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioBajasActivosFijosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioBajasActivosFijosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionBajasActivosFijosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioBajasActivosFijosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioBajasActivosFijos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(BajasActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, BajasActivosFijosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoBajasActivosFijos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarBajasActivosFijos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalBajasActivosFijos=this.isPermisoActualizarBajasActivosFijos;
			this.isPermisoEliminarBajasActivosFijos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosBajasActivosFijos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaBajasActivosFijos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaBajasActivosFijos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoBajasActivosFijos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteBajasActivosFijos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBajasActivosFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioBajasActivosFijos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoBajasActivosFijos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoBajasActivosFijos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarBajasActivosFijos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormBajasActivosFijos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarBajasActivosFijos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenBajasActivosFijos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosBajasActivosFijos.setToolTipText(this.jTableDatosBajasActivosFijos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioBajasActivosFijos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioBajasActivosFijos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(BajasActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(BajasActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioBajasActivosFijos() throws Exception {
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
	public void inicializarCombosForeignKeyBajasActivosFijosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyBajasActivosFijosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(BajasActivosFijosJInternalFrame.ISLOAD_FKLOTE) {
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
	
	
	public void addItemDefectoCombosTodosForeignKeyBajasActivosFijos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.bajasactivosfijosSessionBean==null) {
				this.bajasactivosfijosSessionBean=new BajasActivosFijosSessionBean();
			}

			if(!this.bajasactivosfijosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyBajasActivosFijos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyBajasActivosFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyBajasActivosFijos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyBajasActivosFijos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyBajasActivosFijos(BajasActivosFijos bajasactivosfijos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyBajasActivosFijos(BajasActivosFijos bajasactivosfijos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyBajasActivosFijos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyBajasActivosFijos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyBajasActivosFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyBajasActivosFijos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroBajasActivosFijos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyBajasActivosFijos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyBajasActivosFijos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyBajasActivosFijos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.getItemCount()>0) {
				this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public BajasActivosFijosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public BajasActivosFijosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public BajasActivosFijosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.bajasactivosfijosSessionBean=new BajasActivosFijosSessionBean(); 
		this.bajasactivosfijosConstantesFunciones=new BajasActivosFijosConstantesFunciones(); 
		this.bajasactivosfijosBean=new BajasActivosFijos();//(this.bajasactivosfijosConstantesFunciones); 		
		this.bajasactivosfijosReturnGeneral=new BajasActivosFijosParameterReturnGeneral(); 
		
		this.bajasactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.bajasactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public BajasActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public BajasActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public BajasActivosFijosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessBajasActivosFijos(true);
			
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
			
			this.bajasactivosfijosConstantesFunciones=new BajasActivosFijosConstantesFunciones(); 
			this.bajasactivosfijosBean=new BajasActivosFijos();//this.bajasactivosfijosConstantesFunciones); 			
			this.bajasactivosfijosReturnGeneral=new BajasActivosFijosParameterReturnGeneral(); 
		
			BajasActivosFijosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Bajas Activos Fijos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.bajasactivosfijos=new BajasActivosFijos();
			this.bajasactivosfijoss = new ArrayList<BajasActivosFijos>();
			this.bajasactivosfijossAux = new ArrayList<BajasActivosFijos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic=new BajasActivosFijosLogic();
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			//this.bajasactivosfijosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.bajasactivosfijosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormBajasActivosFijos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBajasActivosFijos);	
					}
					
					if(this.jInternalFrameImportacionBajasActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBajasActivosFijos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByBajasActivosFijos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByBajasActivosFijos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormBajasActivosFijos);
				this.jInternalFrameDetalleFormBajasActivosFijos.setVisible(false);
				this.jInternalFrameDetalleFormBajasActivosFijos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBajasActivosFijos);
					this.jInternalFrameReporteDinamicoBajasActivosFijos.setVisible(false);
					this.jInternalFrameReporteDinamicoBajasActivosFijos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionBajasActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionBajasActivosFijos);
					this.jInternalFrameImportacionBajasActivosFijos.setVisible(false);
					this.jInternalFrameImportacionBajasActivosFijos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByBajasActivosFijos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByBajasActivosFijos);
					this.jInternalFrameOrderByBajasActivosFijos.setVisible(false);
					this.jInternalFrameOrderByBajasActivosFijos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idBajasActivosFijosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=BajasActivosFijosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.bajasactivosfijosReturnGeneral=new BajasActivosFijosParameterReturnGeneral();
			
			this.bajasactivosfijosParameterGeneral=new BajasActivosFijosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.bajasactivosfijosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(BajasActivosFijosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BajasActivosFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),this.bajasactivosfijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,BajasActivosFijosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),this.bajasactivosfijosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoBajasActivosFijos=false;
			this.isVisibilidadCeldaDuplicarBajasActivosFijos=true;
			this.isVisibilidadCeldaCopiarBajasActivosFijos=true;
			this.isVisibilidadCeldaVerFormBajasActivosFijos=true;
			this.isVisibilidadCeldaOrdenBajasActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
			this.isVisibilidadCeldaModificarBajasActivosFijos=false;
			this.isVisibilidadCeldaActualizarBajasActivosFijos=false;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
			this.isVisibilidadCeldaCancelarBajasActivosFijos=false;
			this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;
			
			
			this.isVisibilidadBusquedaBajasActivosFijos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesBajasActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosBajasActivosFijos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioBajasActivosFijos(false);
			
			this.setPermisosUsuarioBajasActivosFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() 
				|| (this.bajasactivosfijosSessionBean.getEsGuardarRelacionado() && this.bajasactivosfijosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioBajasActivosFijosClasesRelacionadas();
			}
			
			if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioBajasActivosFijosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosBajasActivosFijos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualBajasActivosFijos();
			}
			
			if(!this.isPermisoBusquedaBajasActivosFijos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(BajasActivosFijosConstantesFunciones.getTiposSeleccionarBajasActivosFijos());
				
				this.tiposColumnasSelect=BajasActivosFijosConstantesFunciones.getTiposSeleccionarBajasActivosFijos(true);
				
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
			//if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioBajasActivosFijos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioBajasActivosFijos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioBajasActivosFijos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesBajasActivosFijos() ;
			
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
				bajasactivosfijosImplementable= (BajasActivosFijosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BajasActivosFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				bajasactivosfijosImplementableHome= (BajasActivosFijosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+BajasActivosFijosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.bajasactivosfijoss= new ArrayList<BajasActivosFijos>();
			this.bajasactivosfijossEliminados= new ArrayList<BajasActivosFijos>();
						
			this.isEsNuevoBajasActivosFijos=false;
			this.esParaAccionDesdeFormularioBajasActivosFijos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyBajasActivosFijos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroBajasActivosFijos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			BajasActivosFijosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=BajasActivosFijosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesBajasActivosFijos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingBajasActivosFijos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioBajasActivosFijos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioBajasActivosFijos();
			}
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasBajasActivosFijos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasBajasActivosFijos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasBajasActivosFijos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessBajasActivosFijos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga BajasActivosFijos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectBajasActivosFijos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesBajasActivosFijos")) {
				iIndex=this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessBajasActivosFijos();	
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
	
	public void cargarCombosForeignKeyBajasActivosFijos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyBajasActivosFijos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyBajasActivosFijos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyBajasActivosFijosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyBajasActivosFijos();
		
		this.cargarCombosFrameForeignKeyBajasActivosFijos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyBajasActivosFijos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyBajasActivosFijos();
		}
	}
	
	
	
	public void jButtonNuevoBajasActivosFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
			
			if(jTableDatosBajasActivosFijos.getRowCount()>=1) {
				jTableDatosBajasActivosFijos.removeRowSelectionInterval(0, jTableDatosBajasActivosFijos.getRowCount()-1);						
			}
			
			this.isEsNuevoBajasActivosFijos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoBajasActivosFijos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesBajasActivosFijos(true);			
			//this.bajasactivosfijos=new BajasActivosFijos();
			//this.bajasactivosfijos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBajasActivosFijos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBajasActivosFijos() ;
			
			if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBajasActivosFijos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.bajasactivosfijos);	
			this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);				
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
			if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar BajasActivosFijos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarBajasActivosFijosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosBajasActivosFijos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosBajasActivosFijos.getSelectedRows().length;			
			}
			
			bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoBajasActivosFijos--;			
				//BajasActivosFijos bajasactivosfijosAux= new BajasActivosFijos();			
				//bajasactivosfijosAux.setId(this.iIdNuevoBajasActivosFijos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//BajasActivosFijos bajasactivosfijosOrigen=new BajasActivosFijos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(BajasActivosFijos bajasactivosfijosOrigen : bajasactivosfijossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							bajasactivosfijosOrigen =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							bajasactivosfijosOrigen =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaBajasActivosFijos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.bajasactivosfijos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosBajasActivosFijos(bajasactivosfijosOrigen,this.bajasactivosfijos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bajasactivosfijosLogic.getBajasActivosFijoss().add(this.bajasactivosfijosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijoss.add(this.bajasactivosfijosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaBajasActivosFijos(false);
				
				this.jTableDatosBajasActivosFijos.setRowSelectionInterval(this.getIndiceNuevoBajasActivosFijos(), this.getIndiceNuevoBajasActivosFijos());
				
				int iLastRow =  this.jTableDatosBajasActivosFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBajasActivosFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBajasActivosFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBajasActivosFijos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();									
		
			BajasActivosFijos bajasactivosfijosOrigen=new BajasActivosFijos();
			BajasActivosFijos bajasactivosfijosDestino=new BajasActivosFijos();
				
			bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosBajasActivosFijos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || bajasactivosfijossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosBajasActivosFijos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bajasactivosfijosOrigen =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bajasactivosfijosOrigen =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						bajasactivosfijosDestino =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						bajasactivosfijosDestino =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				bajasactivosfijosOrigen =bajasactivosfijossSeleccionados.get(0);
				bajasactivosfijosDestino =bajasactivosfijossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosBajasActivosFijos(bajasactivosfijosOrigen,bajasactivosfijosDestino,true,false);
				
				bajasactivosfijosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(bajasactivosfijosDestino,bajasactivosfijosLogic.getBajasActivosFijoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(bajasactivosfijosDestino,bajasactivosfijoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaBajasActivosFijos(false);
				
				//this.jTableDatosBajasActivosFijos.setRowSelectionInterval(this.getIndiceNuevoBajasActivosFijos(), this.getIndiceNuevoBajasActivosFijos());
				
				int iLastRow =  this.jTableDatosBajasActivosFijos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosBajasActivosFijos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosBajasActivosFijos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaBajasActivosFijos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormBajasActivosFijos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesBajasActivosFijos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesBajasActivosFijos.setVisible(!isVisible);
			this.jPanelPaginacionBajasActivosFijos.setVisible(!isVisible);
			this.jPanelAccionesBajasActivosFijos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameBajasActivosFijos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoBajasActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionBajasActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByBajasActivosFijos();
			
			this.abrirFrameOrderByBajasActivosFijos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByBajasActivosFijos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleBajasActivosFijos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormBajasActivosFijos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormBajasActivosFijos.isMaximum()) {
					this.jInternalFrameDetalleFormBajasActivosFijos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormBajasActivosFijos.setSize(this.jInternalFrameDetalleFormBajasActivosFijos.iWidthFormulario,this.jInternalFrameDetalleFormBajasActivosFijos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormBajasActivosFijos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormBajasActivosFijos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormBajasActivosFijos.isMaximum()) {
						this.jInternalFrameDetalleFormBajasActivosFijos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormBajasActivosFijos.jContentPaneDetalleBajasActivosFijos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormBajasActivosFijos.jContentPaneDetalleBajasActivosFijos.getWidth(),BajasActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormBajasActivosFijos.jContentPaneDetalleBajasActivosFijos.getWidth(),BajasActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormBajasActivosFijos.jContentPaneDetalleBajasActivosFijos.getWidth(),BajasActivosFijosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormBajasActivosFijos.setVisible(true);
	        this.jInternalFrameDetalleFormBajasActivosFijos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByBajasActivosFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByBajasActivosFijos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByBajasActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBajasActivosFijos,false,this);
				} else {
					this.jInternalFrameOrderByBajasActivosFijos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByBajasActivosFijos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByBajasActivosFijos);
				this.jInternalFrameOrderByBajasActivosFijos.setVisible(false);
				this.jInternalFrameOrderByBajasActivosFijos.setSelected(false);
				
				this.jInternalFrameOrderByBajasActivosFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBajasActivosFijos"));
				
				this.inicializarActualizarBindingTablaOrderByBajasActivosFijos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionBajasActivosFijos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionBajasActivosFijos==null) {
				
				this.jInternalFrameImportacionBajasActivosFijos=new ImportacionJInternalFrame(BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionBajasActivosFijos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionBajasActivosFijos);
				this.jInternalFrameImportacionBajasActivosFijos.setVisible(false);
				this.jInternalFrameImportacionBajasActivosFijos.setSelected(false);


				this.jInternalFrameImportacionBajasActivosFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBajasActivosFijos"));
				this.jInternalFrameImportacionBajasActivosFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBajasActivosFijos"));
				this.jInternalFrameImportacionBajasActivosFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBajasActivosFijos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoBajasActivosFijos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoBajasActivosFijos==null) {
				this.jInternalFrameReporteDinamicoBajasActivosFijos=new ReporteDinamicoJInternalFrame(BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoBajasActivosFijos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoBajasActivosFijos);
				this.jInternalFrameReporteDinamicoBajasActivosFijos.setVisible(false);
				this.jInternalFrameReporteDinamicoBajasActivosFijos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoBajasActivosFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBajasActivosFijos"));
				this.jInternalFrameReporteDinamicoBajasActivosFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBajasActivosFijos"));
				this.jInternalFrameReporteDinamicoBajasActivosFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBajasActivosFijos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBajasActivosFijos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleBajasActivosFijos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormBajasActivosFijos);
			
	       	this.jInternalFrameDetalleFormBajasActivosFijos.setVisible(false);
	        this.jInternalFrameDetalleFormBajasActivosFijos.setSelected(false);
			
			//this.jInternalFrameDetalleFormBajasActivosFijos.dispose();
			//this.jInternalFrameDetalleFormBajasActivosFijos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoBajasActivosFijos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoBajasActivosFijos.setVisible(true);
	        this.jInternalFrameReporteDinamicoBajasActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionBajasActivosFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionBajasActivosFijos.setVisible(true);
	        this.jInternalFrameImportacionBajasActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByBajasActivosFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByBajasActivosFijos.setVisible(true);
	        this.jInternalFrameOrderByBajasActivosFijos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByBajasActivosFijos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByBajasActivosFijos.setVisible(false);
	        this.jInternalFrameOrderByBajasActivosFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoBajasActivosFijos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoBajasActivosFijos.setVisible(false);
	        this.jInternalFrameReporteDinamicoBajasActivosFijos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionBajasActivosFijos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionBajasActivosFijos.setVisible(false);
	        this.jInternalFrameImportacionBajasActivosFijos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarBajasActivosFijos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarBajasActivosFijos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesBajasActivosFijos(true);
			//this.isEsNuevoBajasActivosFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesBajasActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBajasActivosFijos(false) ;
			
			if(bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBajasActivosFijos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBajasActivosFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaBajasActivosFijosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarBajasActivosFijos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesBajasActivosFijos(true);
			//this.isEsNuevoBajasActivosFijos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.bajasactivosfijos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesBajasActivosFijos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesBajasActivosFijos(false) ;
			
			if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleBajasActivosFijos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBajasActivosFijos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesBajasActivosFijos(false);
			
			//if(!this.isEsNuevoBajasActivosFijos) {								
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				
			}
			
			if(this.permiteMantenimiento(this.bajasactivosfijos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoBajasActivosFijos=true;
					this.inicializarActualizarBindingTablaBajasActivosFijos(false);
					this.isEsNuevoBajasActivosFijos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoBajasActivosFijos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoBajasActivosFijos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBajasActivosFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBajasActivosFijos(false);
				
				this.habilitarDeshabilitarControlesBajasActivosFijos(false);
			
												
				
				if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleBajasActivosFijos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoBajasActivosFijosActionPerformed(evt,bajasactivosfijosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualBajasActivosFijos(this.bajasactivosfijos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosBajasActivosFijos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,bajasactivosfijosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.bajasactivosfijos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				this.bajasactivosfijos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				this.bajasactivosfijos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.bajasactivosfijos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((BajasActivosFijosModel) this.jTableDatosBajasActivosFijos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoBajasActivosFijos=true;
				this.inicializarActualizarBindingTablaBajasActivosFijos(false);
				this.isEsNuevoBajasActivosFijos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesBajasActivosFijos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBajasActivosFijos(false);
				
				this.habilitarDeshabilitarControlesBajasActivosFijos(false);
				
				
				
				if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleBajasActivosFijos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosBajasActivosFijos.getRowCount()>=1) {
				jTableDatosBajasActivosFijos.removeRowSelectionInterval(0, jTableDatosBajasActivosFijos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesBajasActivosFijos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaBajasActivosFijos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesBajasActivosFijos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualBajasActivosFijos(false) ;
			
			this.isEsNuevoBajasActivosFijos=false;
			
			if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleBajasActivosFijos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBajasActivosFijos(false);
				
				//SI ES MANUAL
				if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualBajasActivosFijos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoBajasActivosFijos--;			
			//BajasActivosFijos bajasactivosfijosAux= new BajasActivosFijos();			
			//bajasactivosfijosAux.setId(this.iIdNuevoBajasActivosFijos);
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaBajasActivosFijos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
			
			this.bajasactivosfijos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.bajasactivosfijosLogic.getBajasActivosFijoss().add(this.bajasactivosfijosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.bajasactivosfijoss.add(this.bajasactivosfijosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaBajasActivosFijos(false);
			
			this.jTableDatosBajasActivosFijos.setRowSelectionInterval(this.getIndiceNuevoBajasActivosFijos(), this.getIndiceNuevoBajasActivosFijos());
			
			int iLastRow =  this.jTableDatosBajasActivosFijos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosBajasActivosFijos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosBajasActivosFijos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaBajasActivosFijos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingBajasActivosFijos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBajasActivosFijos(false);
			
			//SI ES MANUAL
			if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBajasActivosFijos();
			}
			
			//this.abrirFrameTreeBajasActivosFijos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionBajasActivosFijos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionBajasActivosFijos.setFileImportacion(this.jInternalFrameImportacionBajasActivosFijos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionBajasActivosFijos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionBajasActivosFijos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionBajasActivosFijos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionBajasActivosFijos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		

		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("BajasActivosFijosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"BajasActivosFijosBaseDesign.jrxml";
			
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
			
			this.generarReporteBajasActivosFijoss("Todos",bajasactivosfijossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreSubGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreSubGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreSubGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreSubGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreDetalleGrupo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreDetalleGrupo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreDetalleGrupo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreDetalleGrupo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CLAVE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ave_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ave_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ave_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ave_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaCompra_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_daUtil_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_daUtil_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_daUtil_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_daUtil_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stoDeCompra_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stoDeCompra_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stoDeCompra_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stoDeCompra_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoBajasActivosFijos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoria="codigo_sub_grupo";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoria="nombre_sub_grupo";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoria="codigo_detalle_grupo";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoria="nombre_detalle_grupo";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoria="clave";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoria="fecha_compra";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoria="vida_util";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoria="costo_de_compra";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					sNombreCampoCategoriaValor="codigo_sub_grupo";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					sNombreCampoCategoriaValor="nombre_sub_grupo";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					sNombreCampoCategoriaValor="codigo_detalle_grupo";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					sNombreCampoCategoriaValor="nombre_detalle_grupo";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CLAVE:
					sNombreCampoCategoriaValor="clave";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					sNombreCampoCategoriaValor="fecha_compra";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					sNombreCampoCategoriaValor="vida_util";
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					sNombreCampoCategoriaValor="costo_de_compra";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_sub_grupo");
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Sub Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_sub_grupo");
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_detalle_grupo");
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Detalle Grupo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_detalle_grupo");
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CLAVE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Clave",sNombreCampoCategoria,sNombreCampoCategoriaValor,"clave");
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_compra");
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Va Util",sNombreCampoCategoria,sNombreCampoCategoriaValor,"vida_util");
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Costo Compra",sNombreCampoCategoria,sNombreCampoCategoriaValor,"costo_de_compra");
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
	
	public void jButtonGenerarExcelReporteDinamicoBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bajasactivosfijos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("BajasActivosFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getcodigo_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getnombre_sub_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getcodigo_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getnombre_detalle_grupo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_CLAVE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CLAVE);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getclave());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getfecha_compra());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getvida_util());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
					iRow++;

					for(BajasActivosFijos bajasactivosfijos:bajasactivosfijossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(bajasactivosfijos.getcosto_de_compra());
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
			//	this.getFilaCabeceraExportarExcelBajasActivosFijos(row);				
			//	iRow++;
			//}				
			
			//for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelBajasActivosFijos(bajasactivosfijosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
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
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBajasActivosFijos(false);
			
			//SI ES MANUAL
			if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualBajasActivosFijos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBajasActivosFijos(false);
			
			//SI ES MANUAL
			if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBajasActivosFijos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBajasActivosFijos(false);
			
			//SI ES MANUAL
			if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualBajasActivosFijos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaBajasActivosFijos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosBajasActivosFijos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosBajasActivosFijos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosBajasActivosFijos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosBajasActivosFijos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosBajasActivosFijos.setMinimumSize(dimensionMinimum);
		this.jTableDatosBajasActivosFijos.setMaximumSize(dimensionMaximum);
		this.jTableDatosBajasActivosFijos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingBajasActivosFijos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingBajasActivosFijos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingBajasActivosFijos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaBajasActivosFijos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesBajasActivosFijos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasBajasActivosFijos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBajasActivosFijos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesBajasActivosFijos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualBajasActivosFijos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaBajasActivosFijos();
		
		this.inicializarActualizarBindingBotonesManualBajasActivosFijos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualBajasActivosFijos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesBajasActivosFijos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualBajasActivosFijos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualBajasActivosFijos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosBajasActivosFijos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosBajasActivosFijos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteBajasActivosFijos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormBajasActivosFijos.jCheckBoxPostAccionNuevoBajasActivosFijos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormBajasActivosFijos.jCheckBoxPostAccionSinCerrarBajasActivosFijos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormBajasActivosFijos.jCheckBoxPostAccionSinMensajeBajasActivosFijos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosBajasActivosFijos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosBajasActivosFijos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteBajasActivosFijos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
				this.jInternalFrameDetalleFormBajasActivosFijos.jCheckBoxPostAccionNuevoBajasActivosFijos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormBajasActivosFijos.jCheckBoxPostAccionSinCerrarBajasActivosFijos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormBajasActivosFijos.jCheckBoxPostAccionSinMensajeBajasActivosFijos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionBajasActivosFijos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionBajasActivosFijos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesBajasActivosFijos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesBajasActivosFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesBajasActivosFijos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarBajasActivosFijos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesBajasActivosFijos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesBajasActivosFijos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralBajasActivosFijos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesBajasActivosFijos(Boolean esInicializar) throws Exception {
		try	{	
			if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualBajasActivosFijos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesBajasActivosFijos() throws Exception {
		try	{
			if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualBajasActivosFijos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBajasActivosFijos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualBajasActivosFijos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesBajasActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesBajasActivosFijos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesBajasActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesBajasActivosFijos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesBajasActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesBajasActivosFijos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionBajasActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionBajasActivosFijos.addItem(reporte);
			}
			
			
			if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionBajasActivosFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionBajasActivosFijos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesBajasActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesBajasActivosFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesBajasActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesBajasActivosFijos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarBajasActivosFijos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarBajasActivosFijos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarBajasActivosFijos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBajasActivosFijos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualBajasActivosFijos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
				
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=BajasActivosFijosConstantesFunciones.getTiposSeleccionarBajasActivosFijos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=BajasActivosFijosConstantesFunciones.getTiposSeleccionarBajasActivosFijos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=BajasActivosFijosConstantesFunciones.getTiposSeleccionarBajasActivosFijos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoBajasActivosFijos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualBajasActivosFijos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaBajasActivosFijos=Long.parseLong(this.jLabelidBajasActivosFijosBusquedaBajasActivosFijos.getText());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasBajasActivosFijos(Boolean esInicializar) throws Exception {				
		if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualBajasActivosFijos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaBajasActivosFijos() throws Exception {
		this.inicializarActualizarBindingTablaBajasActivosFijos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByBajasActivosFijos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosBajasActivosFijosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaBajasActivosFijos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=bajasactivosfijosLogic.getBajasActivosFijoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=bajasactivosfijoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosBajasActivosFijos.setModel(new BajasActivosFijosModel(this.bajasactivosfijosLogic.getBajasActivosFijoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosBajasActivosFijos.setModel(new BajasActivosFijosModel(this.bajasactivosfijoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByBajasActivosFijos!=null && this.jInternalFrameOrderByBajasActivosFijos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByBajasActivosFijos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO,bajasactivosfijosConstantesFunciones.resaltarSeleccionarBajasActivosFijos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+BajasActivosFijosConstantesFunciones.SCLASSWEBTITULO,bajasactivosfijosConstantesFunciones.resaltarSeleccionarBajasActivosFijos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_ID));

		if(this.bajasactivosfijosConstantesFunciones.mostraridBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bajasactivosfijosConstantesFunciones.resaltaridBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activaridBajasActivosFijos,iSizeTabla,this,true,"idBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltaridBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activaridBajasActivosFijos,this,true,"idBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO));

		if(this.bajasactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bajasactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarcodigo_sub_grupoBajasActivosFijos,iSizeTabla,this,true,"codigo_sub_grupoBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarcodigo_sub_grupoBajasActivosFijos,this,true,"codigo_sub_grupoBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO));

		if(this.bajasactivosfijosConstantesFunciones.mostrarnombre_sub_grupoBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bajasactivosfijosConstantesFunciones.resaltarnombre_sub_grupoBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarnombre_sub_grupoBajasActivosFijos,iSizeTabla,this,true,"nombre_sub_grupoBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarnombre_sub_grupoBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarnombre_sub_grupoBajasActivosFijos,this,true,"nombre_sub_grupoBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO));

		if(this.bajasactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bajasactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarcodigo_detalle_grupoBajasActivosFijos,iSizeTabla,this,true,"codigo_detalle_grupoBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarcodigo_detalle_grupoBajasActivosFijos,this,true,"codigo_detalle_grupoBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO));

		if(this.bajasactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bajasactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarnombre_detalle_grupoBajasActivosFijos,iSizeTabla,this,true,"nombre_detalle_grupoBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarnombre_detalle_grupoBajasActivosFijos,this,true,"nombre_detalle_grupoBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_CLAVE));

		if(this.bajasactivosfijosConstantesFunciones.mostrarclaveBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_CLAVE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bajasactivosfijosConstantesFunciones.resaltarclaveBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarclaveBajasActivosFijos,iSizeTabla,this,true,"claveBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarclaveBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarclaveBajasActivosFijos,this,true,"claveBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_NOMBRE));

		if(this.bajasactivosfijosConstantesFunciones.mostrarnombreBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.bajasactivosfijosConstantesFunciones.resaltarnombreBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarnombreBajasActivosFijos,iSizeTabla,this,true,"nombreBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarnombreBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarnombreBajasActivosFijos,this,true,"nombreBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA));

		if(this.bajasactivosfijosConstantesFunciones.mostrarfecha_compraBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.bajasactivosfijosConstantesFunciones.resaltarfecha_compraBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarfecha_compraBajasActivosFijos,iSizeTabla,this,true,"fecha_compraBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarfecha_compraBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarfecha_compraBajasActivosFijos,this,true,"fecha_compraBajasActivosFijos","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL));

		if(this.bajasactivosfijosConstantesFunciones.mostrarvida_utilBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bajasactivosfijosConstantesFunciones.resaltarvida_utilBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarvida_utilBajasActivosFijos,iSizeTabla,this,true,"vida_utilBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarvida_utilBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarvida_utilBajasActivosFijos,this,true,"vida_utilBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA));

		if(this.bajasactivosfijosConstantesFunciones.mostrarcosto_de_compraBajasActivosFijos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.bajasactivosfijosConstantesFunciones.resaltarcosto_de_compraBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarcosto_de_compraBajasActivosFijos,iSizeTabla,this,true,"costo_de_compraBajasActivosFijos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.bajasactivosfijosConstantesFunciones.resaltarcosto_de_compraBajasActivosFijos,this.bajasactivosfijosConstantesFunciones.activarcosto_de_compraBajasActivosFijos,this,true,"costo_de_compraBajasActivosFijos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new BajasActivosFijosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBajasActivosFijos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosBajasActivosFijos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosBajasActivosFijos.addColumn(tableColumn);
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
			
			this.jTableDatosBajasActivosFijos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosBajasActivosFijos.moveColumn(this.jTableDatosBajasActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosBajasActivosFijos.moveColumn(this.jTableDatosBajasActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosBajasActivosFijos.moveColumn(this.jTableDatosBajasActivosFijos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosBajasActivosFijos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosBajasActivosFijos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosBajasActivosFijos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosBajasActivosFijos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosBajasActivosFijos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosBajasActivosFijos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosBajasActivosFijos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=bajasactivosfijosLogic.getBajasActivosFijoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=bajasactivosfijoss.size()-1;
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
		//this.jTableDatosBajasActivosFijos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosBajasActivosFijos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosBajasActivosFijos();
			
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
				
				//this.isEsNuevoBajasActivosFijos=false;
					
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
				if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormBajasActivosFijos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBajasActivosFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBajasActivosFijos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.bajasactivosfijos.getsType().equals("DUPLICADO")
				   || this.bajasactivosfijos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoBajasActivosFijos=true;
				
				} else {
					this.isEsNuevoBajasActivosFijos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
					if(this.bajasactivosfijos.getId()>=0 && !this.bajasactivosfijos.getIsNew()) {						
						this.isEsNuevoBajasActivosFijos=false;
						
					} else {
						this.isEsNuevoBajasActivosFijos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoBajasActivosFijos(esRelaciones);						
				
				this.seleccionarBajasActivosFijos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.bajasactivosfijos.getId()<0) {
					this.isEsNuevoBajasActivosFijos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarBajasActivosFijos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarBajasActivosFijos(evt,rowIndex);
				}	
				
				if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion BajasActivosFijos: " + this.dDif); 
					}
				}								
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarBajasActivosFijos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.bajasactivosfijos)) {
					if(this.bajasactivosfijos.getId()>0) {
						this.bajasactivosfijos.setIsDeleted(true);
						
						this.bajasactivosfijossEliminados.add(this.bajasactivosfijos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.bajasactivosfijosLogic.getBajasActivosFijoss().remove(this.bajasactivosfijos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijoss.remove(this.bajasactivosfijos);				
					}
					
					
					((BajasActivosFijosModel) this.jTableDatosBajasActivosFijos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaBajasActivosFijos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarBajasActivosFijos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoBajasActivosFijos) {
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosBajasActivosFijos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosBajasActivosFijos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioBajasActivosFijos(this.bajasactivosfijos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesBajasActivosFijos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesBajasActivosFijos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualBajasActivosFijos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoBajasActivosFijos(BajasActivosFijos bajasactivosfijos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoBajasActivosFijos(bajasactivosfijos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoBajasActivosFijos(BajasActivosFijos bajasactivosfijos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioBajasActivosFijos(bajasactivosfijos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyBajasActivosFijos(bajasactivosfijos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyBajasActivosFijos(bajasactivosfijos);
	}
	
	public void setVariablesObjetoActualToFormularioBajasActivosFijos(BajasActivosFijos bajasactivosfijos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.setText(bajasactivosfijos.getId().toString());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_sub_grupoBajasActivosFijos.setText(bajasactivosfijos.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_sub_grupoBajasActivosFijos.setText(bajasactivosfijos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_detalle_grupoBajasActivosFijos.setText(bajasactivosfijos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_detalle_grupoBajasActivosFijos.setText(bajasactivosfijos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldclaveBajasActivosFijos.setText(bajasactivosfijos.getclave());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombreBajasActivosFijos.setText(bajasactivosfijos.getnombre());
			this.jInternalFrameDetalleFormBajasActivosFijos.jDateChooserfecha_compraBajasActivosFijos.setDate(bajasactivosfijos.getfecha_compra());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldvida_utilBajasActivosFijos.setText(bajasactivosfijos.getvida_util().toString());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcosto_de_compraBajasActivosFijos.setText(bajasactivosfijos.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,BajasActivosFijos bajasactivosfijosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,bajasactivosfijosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,BajasActivosFijos bajasactivosfijosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				bajasactivosfijosLocal=this.bajasactivosfijos;
			} else {
				bajasactivosfijosLocal=this.bajasactivosfijosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(bajasactivosfijosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoBajasActivosFijos(bajasactivosfijosLocal,true);
					
					if(bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(bajasactivosfijosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(bajasactivosfijosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoBajasActivosFijos(BajasActivosFijos bajasactivosfijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBajasActivosFijos(bajasactivosfijos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(bajasactivosfijos);
	}
	
	public void setVariablesFormularioToObjetoActualBajasActivosFijos(BajasActivosFijos bajasactivosfijos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualBajasActivosFijos(bajasactivosfijos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualBajasActivosFijos(BajasActivosFijos bajasactivosfijos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.getText()==null || this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.getText()=="" || this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.getText()=="Id") {
				this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.setText("0");
			}

			if(conColumnasBase) {bajasactivosfijos.setId(Long.parseLong(this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelIdBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setcodigo_sub_grupo(this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_sub_grupoBajasActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcodigo_sub_grupoBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setnombre_sub_grupo(this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_sub_grupoBajasActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombre_sub_grupoBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setcodigo_detalle_grupo(this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_detalle_grupoBajasActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcodigo_detalle_grupoBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setnombre_detalle_grupo(this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_detalle_grupoBajasActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombre_detalle_grupoBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setclave(this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldclaveBajasActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_CLAVE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelclaveBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setnombre(this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombreBajasActivosFijos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelnombreBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setfecha_compra(this.jInternalFrameDetalleFormBajasActivosFijos.jDateChooserfecha_compraBajasActivosFijos.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelfecha_compraBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setvida_util(Double.parseDouble(this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldvida_utilBajasActivosFijos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelvida_utilBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			bajasactivosfijos.setcosto_de_compra(Double.parseDouble(this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcosto_de_compraBajasActivosFijos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormBajasActivosFijos.jLabelcosto_de_compraBajasActivosFijos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualBajasActivosFijos(BajasActivosFijos bajasactivosfijosBean,BajasActivosFijos bajasactivosfijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosBajasActivosFijos(BajasActivosFijos bajasactivosfijosOrigen,BajasActivosFijos bajasactivosfijos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bajasactivosfijosOrigen.getId()!=null && !bajasactivosfijosOrigen.getId().equals(0L))) {bajasactivosfijos.setId(bajasactivosfijosOrigen.getId());}}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getcodigo_sub_grupo()!=null && !bajasactivosfijosOrigen.getcodigo_sub_grupo().equals(""))) {bajasactivosfijos.setcodigo_sub_grupo(bajasactivosfijosOrigen.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getnombre_sub_grupo()!=null && !bajasactivosfijosOrigen.getnombre_sub_grupo().equals(""))) {bajasactivosfijos.setnombre_sub_grupo(bajasactivosfijosOrigen.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getcodigo_detalle_grupo()!=null && !bajasactivosfijosOrigen.getcodigo_detalle_grupo().equals(""))) {bajasactivosfijos.setcodigo_detalle_grupo(bajasactivosfijosOrigen.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getnombre_detalle_grupo()!=null && !bajasactivosfijosOrigen.getnombre_detalle_grupo().equals(""))) {bajasactivosfijos.setnombre_detalle_grupo(bajasactivosfijosOrigen.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getclave()!=null && !bajasactivosfijosOrigen.getclave().equals(""))) {bajasactivosfijos.setclave(bajasactivosfijosOrigen.getclave());}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getnombre()!=null && !bajasactivosfijosOrigen.getnombre().equals(""))) {bajasactivosfijos.setnombre(bajasactivosfijosOrigen.getnombre());}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getfecha_compra()!=null && !bajasactivosfijosOrigen.getfecha_compra().equals(new Date()))) {bajasactivosfijos.setfecha_compra(bajasactivosfijosOrigen.getfecha_compra());}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getvida_util()!=null && !bajasactivosfijosOrigen.getvida_util().equals(0.0))) {bajasactivosfijos.setvida_util(bajasactivosfijosOrigen.getvida_util());}
			if(conDefault || (!conDefault && bajasactivosfijosOrigen.getcosto_de_compra()!=null && !bajasactivosfijosOrigen.getcosto_de_compra().equals(0.0))) {bajasactivosfijos.setcosto_de_compra(bajasactivosfijosOrigen.getcosto_de_compra());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBajasActivosFijos(BajasActivosFijos bajasactivosfijos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.setText(bajasactivosfijos.getId().toString());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_sub_grupoBajasActivosFijos.setText(bajasactivosfijos.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_sub_grupoBajasActivosFijos.setText(bajasactivosfijos.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_detalle_grupoBajasActivosFijos.setText(bajasactivosfijos.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_detalle_grupoBajasActivosFijos.setText(bajasactivosfijos.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldclaveBajasActivosFijos.setText(bajasactivosfijos.getclave());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombreBajasActivosFijos.setText(bajasactivosfijos.getnombre());
			this.jInternalFrameDetalleFormBajasActivosFijos.jDateChooserfecha_compraBajasActivosFijos.setDate(bajasactivosfijos.getfecha_compra());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldvida_utilBajasActivosFijos.setText(bajasactivosfijos.getvida_util().toString());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcosto_de_compraBajasActivosFijos.setText(bajasactivosfijos.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioBajasActivosFijos(BajasActivosFijosBean bajasactivosfijosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.setText(bajasactivosfijosBean.getId().toString());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_sub_grupoBajasActivosFijos.setText(bajasactivosfijosBean.getcodigo_sub_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_sub_grupoBajasActivosFijos.setText(bajasactivosfijosBean.getnombre_sub_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_detalle_grupoBajasActivosFijos.setText(bajasactivosfijosBean.getcodigo_detalle_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_detalle_grupoBajasActivosFijos.setText(bajasactivosfijosBean.getnombre_detalle_grupo());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldclaveBajasActivosFijos.setText(bajasactivosfijosBean.getclave());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombreBajasActivosFijos.setText(bajasactivosfijosBean.getnombre());
			this.jInternalFrameDetalleFormBajasActivosFijos.jDateChooserfecha_compraBajasActivosFijos.setDate(bajasactivosfijosBean.getfecha_compra());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldvida_utilBajasActivosFijos.setText(bajasactivosfijosBean.getvida_util().toString());
			this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcosto_de_compraBajasActivosFijos.setText(bajasactivosfijosBean.getcosto_de_compra().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanBajasActivosFijos(BajasActivosFijosParameterReturnGeneral bajasactivosfijosReturnGeneral,BajasActivosFijosBean bajasactivosfijosBean,Boolean conDefault) throws Exception { 
		try {
			BajasActivosFijos bajasactivosfijosLocal=new BajasActivosFijos();
			
			bajasactivosfijosLocal=bajasactivosfijosReturnGeneral.getBajasActivosFijos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && bajasactivosfijosLocal.getId()!=null && !bajasactivosfijosLocal.getId().equals(0L))) {bajasactivosfijosBean.setId(bajasactivosfijosLocal.getId());}}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getcodigo_sub_grupo()!=null && !bajasactivosfijosLocal.getcodigo_sub_grupo().equals(""))) {bajasactivosfijosBean.setcodigo_sub_grupo(bajasactivosfijosLocal.getcodigo_sub_grupo());}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getnombre_sub_grupo()!=null && !bajasactivosfijosLocal.getnombre_sub_grupo().equals(""))) {bajasactivosfijosBean.setnombre_sub_grupo(bajasactivosfijosLocal.getnombre_sub_grupo());}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getcodigo_detalle_grupo()!=null && !bajasactivosfijosLocal.getcodigo_detalle_grupo().equals(""))) {bajasactivosfijosBean.setcodigo_detalle_grupo(bajasactivosfijosLocal.getcodigo_detalle_grupo());}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getnombre_detalle_grupo()!=null && !bajasactivosfijosLocal.getnombre_detalle_grupo().equals(""))) {bajasactivosfijosBean.setnombre_detalle_grupo(bajasactivosfijosLocal.getnombre_detalle_grupo());}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getclave()!=null && !bajasactivosfijosLocal.getclave().equals(""))) {bajasactivosfijosBean.setclave(bajasactivosfijosLocal.getclave());}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getnombre()!=null && !bajasactivosfijosLocal.getnombre().equals(""))) {bajasactivosfijosBean.setnombre(bajasactivosfijosLocal.getnombre());}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getfecha_compra()!=null && !bajasactivosfijosLocal.getfecha_compra().equals(new Date()))) {bajasactivosfijosBean.setfecha_compra(bajasactivosfijosLocal.getfecha_compra());}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getvida_util()!=null && !bajasactivosfijosLocal.getvida_util().equals(0.0))) {bajasactivosfijosBean.setvida_util(bajasactivosfijosLocal.getvida_util());}
			if(conDefault || (!conDefault && bajasactivosfijosLocal.getcosto_de_compra()!=null && !bajasactivosfijosLocal.getcosto_de_compra().equals(0.0))) {bajasactivosfijosBean.setcosto_de_compra(bajasactivosfijosLocal.getcosto_de_compra());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxBajasActivosFijosGenerico(Long idBajasActivosFijosSeleccionado,JComboBox jComboBoxBajasActivosFijos,List<BajasActivosFijos> bajasactivosfijossLocal)throws Exception {
		try {
			BajasActivosFijos  bajasactivosfijosTemp=null;

			for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijossLocal) {
				if(bajasactivosfijosAux.getId()!=null && bajasactivosfijosAux.getId().equals(idBajasActivosFijosSeleccionado)) {
					bajasactivosfijosTemp=bajasactivosfijosAux;
					break;
				}
			}

			jComboBoxBajasActivosFijos.setSelectedItem(bajasactivosfijosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxBajasActivosFijosGenerico(JComboBox jComboBoxBajasActivosFijos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBajasActivosFijos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxBajasActivosFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxBajasActivosFijos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxBajasActivosFijos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxBajasActivosFijos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxBajasActivosFijos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bajasactivosfijos=(BajasActivosFijos) bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bajasactivosfijos =(BajasActivosFijos) bajasactivosfijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!bajasactivosfijos.getIsNew() && !bajasactivosfijos.getIsChanged() && !bajasactivosfijos.getIsDeleted()) {
				sDescripcion=bajasactivosfijos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=bajasactivosfijos.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		BajasActivosFijos bajasactivosfijosRow=new BajasActivosFijos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bajasactivosfijosRow=(BajasActivosFijos) bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			bajasactivosfijosRow=(BajasActivosFijos) bajasactivosfijoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualBajasActivosFijos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos));			
			this.jButtonDuplicarBajasActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarBajasActivosFijos && this.isPermisoDuplicarBajasActivosFijos));			
			this.jButtonCopiarBajasActivosFijos.setVisible((this.isVisibilidadCeldaCopiarBajasActivosFijos && this.isPermisoCopiarBajasActivosFijos));
			this.jButtonVerFormBajasActivosFijos.setVisible((this.isVisibilidadCeldaVerFormBajasActivosFijos && this.isPermisoVerFormBajasActivosFijos));
			
			this.jButtonAbrirOrderByBajasActivosFijos.setVisible((this.isVisibilidadCeldaOrdenBajasActivosFijos && this.isPermisoOrdenBajasActivosFijos));			
			
			this.jButtonNuevoRelacionesBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos));			
			this.jButtonNuevoGuardarCambiosBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarBajasActivosFijos.setVisible((this.isVisibilidadCeldaModificarBajasActivosFijos && this.isPermisoActualizarBajasActivosFijos));	
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarBajasActivosFijos.setVisible((this.isVisibilidadCeldaActualizarBajasActivosFijos && this.isPermisoActualizarBajasActivosFijos));	
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarBajasActivosFijos.setVisible((this.isVisibilidadCeldaEliminarBajasActivosFijos && this.isPermisoEliminarBajasActivosFijos));
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarBajasActivosFijos.setVisible(this.isVisibilidadCeldaCancelarBajasActivosFijos);							
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosBajasActivosFijos.setVisible((this.isVisibilidadCeldaGuardarBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));			
			
			}
						
			this.jButtonGuardarCambiosTablaBajasActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos));						
			this.jButtonDuplicarToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarBajasActivosFijos && this.isPermisoDuplicarBajasActivosFijos));						
			this.jButtonCopiarToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaCopiarBajasActivosFijos && this.isPermisoCopiarBajasActivosFijos));			
			this.jButtonVerFormToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaVerFormBajasActivosFijos && this.isPermisoVerFormBajasActivosFijos));			
			this.jButtonAbrirOrderByToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaOrdenBajasActivosFijos && this.isPermisoOrdenBajasActivosFijos));
			this.jButtonNuevoRelacionesToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos));			
			this.jButtonNuevoGuardarCambiosToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));			
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaModificarBajasActivosFijos && this.isPermisoActualizarBajasActivosFijos));	
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaActualizarBajasActivosFijos  && this.isPermisoActualizarBajasActivosFijos));	
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaEliminarBajasActivosFijos && this.isPermisoEliminarBajasActivosFijos));
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarToolBarBajasActivosFijos.setVisible(this.isVisibilidadCeldaCancelarBajasActivosFijos);				
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaGuardarBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarBajasActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos));			
			this.jMenuItemDuplicarBajasActivosFijos.setVisible((this.isVisibilidadCeldaDuplicarBajasActivosFijos && this.isPermisoDuplicarBajasActivosFijos));			
			this.jMenuItemCopiarBajasActivosFijos.setVisible((this.isVisibilidadCeldaCopiarBajasActivosFijos && this.isPermisoCopiarBajasActivosFijos));			
			this.jMenuItemVerFormBajasActivosFijos.setVisible((this.isVisibilidadCeldaVerFormBajasActivosFijos && this.isPermisoVerFormBajasActivosFijos));			
			this.jMenuItemAbrirOrderByBajasActivosFijos.setVisible((this.isVisibilidadCeldaOrdenBajasActivosFijos && this.isPermisoOrdenBajasActivosFijos));			
			//this.jMenuItemMostrarOcultarBajasActivosFijos.setVisible((this.isVisibilidadCeldaOrdenBajasActivosFijos && this.isPermisoOrdenBajasActivosFijos));
			this.jMenuItemDetalleAbrirOrderByBajasActivosFijos.setVisible((this.isVisibilidadCeldaOrdenBajasActivosFijos && this.isPermisoOrdenBajasActivosFijos));			
			//this.jMenuItemDetalleMostrarOcultarBajasActivosFijos.setVisible((this.isVisibilidadCeldaOrdenBajasActivosFijos && this.isPermisoOrdenBajasActivosFijos));			
			this.jMenuItemNuevoRelacionesBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos));			
			this.jMenuItemNuevoGuardarCambiosBajasActivosFijos.setVisible((this.isVisibilidadCeldaNuevoBajasActivosFijos && this.isPermisoNuevoBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));									
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemModificarBajasActivosFijos.setVisible((this.isVisibilidadCeldaModificarBajasActivosFijos && this.isPermisoActualizarBajasActivosFijos));	
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemActualizarBajasActivosFijos.setVisible((this.isVisibilidadCeldaActualizarBajasActivosFijos && this.isPermisoActualizarBajasActivosFijos));	
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemEliminarBajasActivosFijos.setVisible((this.isVisibilidadCeldaEliminarBajasActivosFijos && this.isPermisoEliminarBajasActivosFijos));
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemCancelarBajasActivosFijos.setVisible(this.isVisibilidadCeldaCancelarBajasActivosFijos);				
			}
			
			this.jMenuItemGuardarCambiosBajasActivosFijos.setVisible((this.isVisibilidadCeldaGuardarBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));						
			this.jMenuItemGuardarCambiosTablaBajasActivosFijos.setVisible((this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoBajasActivosFijos=this.jButtonNuevoBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaDuplicarBajasActivosFijos=this.jButtonDuplicarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaCopiarBajasActivosFijos=this.jButtonCopiarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaVerFormBajasActivosFijos=this.jButtonVerFormBajasActivosFijos.isVisible();
			
			this.isVisibilidadCeldaOrdenBajasActivosFijos=this.jButtonAbrirOrderByBajasActivosFijos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=this.jButtonNuevoRelacionesBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaModificarBajasActivosFijos=this.jButtonModificarBajasActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			this.isVisibilidadCeldaActualizarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosBajasActivosFijos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=this.jButtonGuardarCambiosTablaBajasActivosFijos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoBajasActivosFijos=this.jButtonNuevoToolBarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=this.jButtonNuevoRelacionesToolBarBajasActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			this.isVisibilidadCeldaModificarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarToolBarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaActualizarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarToolBarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarToolBarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarToolBarBajasActivosFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBajasActivosFijos=this.jButtonGuardarCambiosToolBarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=this.jButtonGuardarCambiosTablaToolBarBajasActivosFijos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoBajasActivosFijos=this.jMenuItemNuevoBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=this.jMenuItemNuevoRelacionesBajasActivosFijos.isVisible();
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			this.isVisibilidadCeldaModificarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemModificarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaActualizarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemActualizarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaEliminarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemEliminarBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaCancelarBajasActivosFijos=this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemCancelarBajasActivosFijos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarBajasActivosFijos=this.jMenuItemGuardarCambiosBajasActivosFijos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=this.jMenuItemGuardarCambiosTablaBajasActivosFijos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesBajasActivosFijos(Boolean esInicializar) {
		if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
				//if(this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesBajasActivosFijos();
			}
			
			this.inicializarActualizarBindingBotonesManualBajasActivosFijos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualBajasActivosFijos() {
		this.jButtonNuevoBajasActivosFijos.setVisible(this.isPermisoNuevoBajasActivosFijos);			
		this.jButtonDuplicarBajasActivosFijos.setVisible(this.isPermisoDuplicarBajasActivosFijos);			
		this.jButtonCopiarBajasActivosFijos.setVisible(this.isPermisoCopiarBajasActivosFijos);			
		this.jButtonVerFormBajasActivosFijos.setVisible(this.isPermisoVerFormBajasActivosFijos);			
		
		this.jButtonAbrirOrderByBajasActivosFijos.setVisible(this.isPermisoOrdenBajasActivosFijos);					
		
		this.jButtonNuevoRelacionesBajasActivosFijos.setVisible(this.isPermisoNuevoBajasActivosFijos);			
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarBajasActivosFijos.setVisible(this.isPermisoActualizarBajasActivosFijos);	
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarBajasActivosFijos.setVisible(this.isPermisoActualizarBajasActivosFijos);	
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarBajasActivosFijos.setVisible(this.isPermisoEliminarBajasActivosFijos);
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarBajasActivosFijos.setVisible(this.isVisibilidadCeldaCancelarBajasActivosFijos);						
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosBajasActivosFijos.setVisible(this.isPermisoGuardarCambiosBajasActivosFijos);							
		}
		
		this.jButtonGuardarCambiosTablaBajasActivosFijos.setVisible(this.isPermisoActualizarBajasActivosFijos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleBajasActivosFijos() {
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarBajasActivosFijos.setVisible(this.isPermisoActualizarBajasActivosFijos);	
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarBajasActivosFijos.setVisible(this.isPermisoActualizarBajasActivosFijos);	
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarBajasActivosFijos.setVisible(this.isPermisoEliminarBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarBajasActivosFijos.setVisible(this.isVisibilidadCeldaCancelarBajasActivosFijos);							
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosBajasActivosFijos.setVisible((this.isVisibilidadCeldaGuardarBajasActivosFijos && this.isPermisoGuardarCambiosBajasActivosFijos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosBajasActivosFijos() {
		if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualBajasActivosFijos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesBajasActivosFijos() {
	}
	
	public void jTableDatosBajasActivosFijosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarBajasActivosFijos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.bajasactivosfijos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaBajasActivosFijosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebBajasActivosFijos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosBajasActivosFijos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosBajasActivosFijos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.bajasactivosfijosLogic.getConnexion());

				if(this.bajasactivosfijos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.bajasactivosfijos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderBajasActivosFijos=(TitledBorder)this.jScrollPanelDatosBajasActivosFijos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderBajasActivosFijos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.bajasactivosfijos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_sub_grupoBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getcodigo_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_sub_grupo like '%"+this.bajasactivosfijos.getcodigo_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_sub_grupoBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getnombre_sub_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_sub_grupo like '%"+this.bajasactivosfijos.getnombre_sub_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_detalle_grupoBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getcodigo_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_detalle_grupo like '%"+this.bajasactivosfijos.getcodigo_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_detalle_grupoBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getnombre_detalle_grupo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_detalle_grupo like '%"+this.bajasactivosfijos.getnombre_detalle_grupo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonclaveBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getclave()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where clave like '%"+this.bajasactivosfijos.getclave()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.bajasactivosfijos.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_compraBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getfecha_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_compra = '"+Funciones2.getStringPostgresDate(this.bajasactivosfijos.getfecha_compra())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvida_utilBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getvida_util()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where vida_util = "+this.bajasactivosfijos.getvida_util().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncosto_de_compraBajasActivosFijosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.getbajasactivosfijos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.bajasactivosfijos==null) {
						this.bajasactivosfijos = new BajasActivosFijos();
					}

					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);
				}

				if(this.bajasactivosfijos.getcosto_de_compra()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where costo_de_compra = "+this.bajasactivosfijos.getcosto_de_compra().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingBajasActivosFijos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaBajasActivosFijosBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBajasActivosFijos(false,false);

			this.getBajasActivosFijossBusquedaBajasActivosFijos();

			this.inicializarActualizarBindingBajasActivosFijos(false);

			//if(BajasActivosFijosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBajasActivosFijos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaBajasActivosFijosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingBajasActivosFijos(false,false);

			this.getBajasActivosFijossFK_IdEmpresa();

			this.inicializarActualizarBindingBajasActivosFijos(false);

			//if(BajasActivosFijosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingBajasActivosFijos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.bajasactivosfijosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameBajasActivosFijos() {
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
			this.jInternalFrameDetalleFormBajasActivosFijos.setVisible(false);	    			
			this.jInternalFrameDetalleFormBajasActivosFijos.dispose();
			this.jInternalFrameDetalleFormBajasActivosFijos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
			this.jInternalFrameReporteDinamicoBajasActivosFijos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoBajasActivosFijos.dispose();
			this.jInternalFrameReporteDinamicoBajasActivosFijos=null;
		}
		
		if(this.jInternalFrameImportacionBajasActivosFijos!=null) {
			this.jInternalFrameImportacionBajasActivosFijos.setVisible(false);	    			
			this.jInternalFrameImportacionBajasActivosFijos.dispose();
			this.jInternalFrameImportacionBajasActivosFijos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessBajasActivosFijos();
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
			
			if(sTipo.equals("NuevoBajasActivosFijos")) {
				jButtonNuevoBajasActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarBajasActivosFijos")) {
				jButtonDuplicarBajasActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarBajasActivosFijos")) {
				jButtonCopiarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormBajasActivosFijos")) {
				jButtonVerFormBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarBajasActivosFijos")) {
				jButtonNuevoBajasActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarBajasActivosFijos")) {
				jButtonDuplicarBajasActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoBajasActivosFijos")) {
				jButtonNuevoBajasActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarBajasActivosFijos")) {
				jButtonDuplicarBajasActivosFijosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesBajasActivosFijos")) {
				jButtonNuevoBajasActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarBajasActivosFijos")) {
				jButtonNuevoBajasActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesBajasActivosFijos")) {
				jButtonNuevoBajasActivosFijosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarBajasActivosFijos")) {
				jButtonModificarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarBajasActivosFijos")) {
				jButtonModificarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarBajasActivosFijos")) {
				jButtonModificarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarBajasActivosFijos")) {
				jButtonActualizarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarBajasActivosFijos")) {
				jButtonActualizarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarBajasActivosFijos")) {
				jButtonActualizarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarBajasActivosFijos")) {
				jButtonEliminarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarBajasActivosFijos")) {
				jButtonEliminarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarBajasActivosFijos")) {
				jButtonEliminarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarBajasActivosFijos")) {
				jButtonCancelarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarBajasActivosFijos")) {
				jButtonCancelarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarBajasActivosFijos")) {
				jButtonCancelarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarBajasActivosFijos")) {
				jButtonCerrarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarBajasActivosFijos")) {
				jButtonCerrarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarBajasActivosFijos")) {
				jButtonCerrarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarBajasActivosFijos")) {
				jButtonMostrarOcultarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarBajasActivosFijos")) {
				jButtonCancelarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosBajasActivosFijos")) {
				jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarBajasActivosFijos")) {
				jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarBajasActivosFijos")) {
				jButtonCopiarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarBajasActivosFijos")) {
				jButtonVerFormBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosBajasActivosFijos")) {
				jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarBajasActivosFijos")) {
				jButtonCopiarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormBajasActivosFijos")) {
				jButtonVerFormBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaBajasActivosFijos")) {
				jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarBajasActivosFijos")) {
				jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaBajasActivosFijos")) {
				jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionBajasActivosFijos")) {
				jButtonRecargarInformacionBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarBajasActivosFijos")) {
				jButtonRecargarInformacionBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionBajasActivosFijos")) {
				jButtonRecargarInformacionBajasActivosFijosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresBajasActivosFijos")) {
				jButtonAnterioresBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarBajasActivosFijos")) {
				jButtonAnterioresBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreBajasActivosFijos")) {
				jButtonAnterioresBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesBajasActivosFijos")) {
				jButtonSiguientesBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarBajasActivosFijos")) {
				jButtonSiguientesBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesBajasActivosFijos")) {
				jButtonSiguientesBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByBajasActivosFijos") || sTipo.equals("MenuItemDetalleAbrirOrderByBajasActivosFijos")) {
				jButtonAbrirOrderByBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarBajasActivosFijos") || sTipo.equals("MenuItemDetalleMostrarOcultarBajasActivosFijos")) {
				jButtonMostrarOcultarBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosBajasActivosFijos")) {
				jButtonNuevoGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarBajasActivosFijos")) {
				jButtonNuevoGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosBajasActivosFijos")) {
				jButtonNuevoGuardarCambiosBajasActivosFijosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoBajasActivosFijos")) {
				jButtonCerrarReporteDinamicoBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoBajasActivosFijos")) {
				jButtonGenerarReporteDinamicoBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoBajasActivosFijos")) {
				
				jButtonGenerarExcelReporteDinamicoBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionBajasActivosFijos")) {
				jButtonCerrarImportacionBajasActivosFijosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionBajasActivosFijos")) {
				
				jButtonGenerarImportacionBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionBajasActivosFijos")) {
				
				jButtonAbrirImportacionBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesBajasActivosFijos")) {
				jComboBoxTiposAccionesBajasActivosFijosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesBajasActivosFijos")) {
				jComboBoxTiposRelacionesBajasActivosFijosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioBajasActivosFijos")) {
				jComboBoxTiposAccionesBajasActivosFijosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarBajasActivosFijos")) {
				
				jComboBoxTiposSeleccionarBajasActivosFijosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralBajasActivosFijos")) {
				jTextFieldValorCampoGeneralBajasActivosFijosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByBajasActivosFijos")) {
				jButtonAbrirOrderByBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarBajasActivosFijos")) {
				jButtonAbrirOrderByBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByBajasActivosFijos")) {
				jButtonCerrarOrderByBajasActivosFijosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBajasActivosFijosBusqueda")) {
				this.jButtonidBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBajasActivosFijosUpdate")) {
				this.jButtonid_empresaBajasActivosFijosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBajasActivosFijosBusqueda")) {
				this.jButtonid_empresaBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoBajasActivosFijosBusqueda")) {
				this.jButtoncodigo_sub_grupoBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoBajasActivosFijosBusqueda")) {
				this.jButtonnombre_sub_grupoBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoBajasActivosFijosBusqueda")) {
				this.jButtoncodigo_detalle_grupoBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoBajasActivosFijosBusqueda")) {
				this.jButtonnombre_detalle_grupoBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveBajasActivosFijosBusqueda")) {
				this.jButtonclaveBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreBajasActivosFijosBusqueda")) {
				this.jButtonnombreBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraBajasActivosFijosBusqueda")) {
				this.jButtonfecha_compraBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilBajasActivosFijosBusqueda")) {
				this.jButtonvida_utilBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraBajasActivosFijosBusqueda")) {
				this.jButtoncosto_de_compraBajasActivosFijosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaBajasActivosFijosBajasActivosFijos")) {
				this.jButtonBusquedaBajasActivosFijosBajasActivosFijosActionPerformed(evt);
			}
			
			;
			
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessBajasActivosFijos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBajasActivosFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				


				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			BajasActivosFijos bajasactivosfijosLocal=null;
			
			if(!this.getEsControlTabla()) {
				bajasactivosfijosLocal=this.bajasactivosfijos;
			} else {
				bajasactivosfijosLocal=this.bajasactivosfijosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
							
				
				


				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBajasActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
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
			
			


			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBajasActivosFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
								
						
				


				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
								
				
				


				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBajasActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBajasActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBajasActivosFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
							
				
				


				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBajasActivosFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
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
			
			


			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBajasActivosFijosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
								
				
				


				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBajasActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBajasActivosFijosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBajasActivosFijosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosBajasActivosFijos")) {
					jCheckBoxSeleccionarTodosBajasActivosFijosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosBajasActivosFijos")) {
					jCheckBoxSeleccionadosBajasActivosFijosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarBajasActivosFijos")) {
					
				}
				
				


				
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
												
				
				


				
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBajasActivosFijosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBajasActivosFijosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
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
			
			


			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaBajasActivosFijosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.bajasactivosfijos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.bajasactivosfijos);
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
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
				
				


				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(BajasActivosFijos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",BajasActivosFijos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaBajasActivosFijosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.bajasactivosfijosAnterior =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarBajasActivosFijos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosBajasActivosFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosBajasActivosFijos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.bajasactivosfijos =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.bajasactivosfijos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarBajasActivosFijos")) {
				
				}
				
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarBajasActivosFijos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosBajasActivosFijos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarBajasActivosFijos")) {
			
			}
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessBajasActivosFijos();
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
			if(sTipo.equals("NuevoBajasActivosFijos")) {
				jButtonNuevoBajasActivosFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarBajasActivosFijos")) {
				jButtonDuplicarBajasActivosFijosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarBajasActivosFijos")) {
				jButtonCopiarBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormBajasActivosFijos")) {
				jButtonVerFormBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesBajasActivosFijos")) {
				jButtonNuevoBajasActivosFijosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarBajasActivosFijos")) {
				jButtonModificarBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarBajasActivosFijos")) {
				jButtonActualizarBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarBajasActivosFijos")) {
				jButtonEliminarBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaBajasActivosFijos")) {
				jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarBajasActivosFijos")) {
				jButtonCancelarBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarBajasActivosFijos")) {
				jButtonCerrarBajasActivosFijosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosBajasActivosFijos")) {
				jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosBajasActivosFijos")) {
				jButtonNuevoGuardarCambiosBajasActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByBajasActivosFijos")) {
				jButtonAbrirOrderByBajasActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionBajasActivosFijos")) {
				jButtonRecargarInformacionBajasActivosFijosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresBajasActivosFijos")) {
				jButtonAnterioresBajasActivosFijosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesBajasActivosFijos")) {
				jButtonSiguientesBajasActivosFijosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idBajasActivosFijosBusqueda")) {
				this.jButtonidBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaBajasActivosFijosUpdate")) {
				this.jButtonid_empresaBajasActivosFijosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaBajasActivosFijosBusqueda")) {
				this.jButtonid_empresaBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_sub_grupoBajasActivosFijosBusqueda")) {
				this.jButtoncodigo_sub_grupoBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_sub_grupoBajasActivosFijosBusqueda")) {
				this.jButtonnombre_sub_grupoBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_detalle_grupoBajasActivosFijosBusqueda")) {
				this.jButtoncodigo_detalle_grupoBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_detalle_grupoBajasActivosFijosBusqueda")) {
				this.jButtonnombre_detalle_grupoBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("claveBajasActivosFijosBusqueda")) {
				this.jButtonclaveBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreBajasActivosFijosBusqueda")) {
				this.jButtonnombreBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_compraBajasActivosFijosBusqueda")) {
				this.jButtonfecha_compraBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("vida_utilBajasActivosFijosBusqueda")) {
				this.jButtonvida_utilBajasActivosFijosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("costo_de_compraBajasActivosFijosBusqueda")) {
				this.jButtoncosto_de_compraBajasActivosFijosBusquedaActionPerformed(evt);
			}
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessBajasActivosFijos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameBajasActivosFijos")) {
				closingInternalFrameBajasActivosFijos();
				
			} else if(sTipo.equals("jButtonCancelarBajasActivosFijos")) {
				JInternalFrameBase jInternalFrameDetalleFormBajasActivosFijos = (JInternalFrameBase)evt.getSource();
	            	
	            BajasActivosFijosBeanSwingJInternalFrame jInternalFrameParent=(BajasActivosFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormBajasActivosFijos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarBajasActivosFijosActionPerformed(null);
			}
			
			BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.bajasactivosfijos,new Object(),this.bajasactivosfijosParameterGeneral,this.bajasactivosfijosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormBajasActivosFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormBajasActivosFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormBajasActivosFijos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.bajasactivosfijos)) {
			if(!esControlTabla) {
				if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);			
				}
				
				if(this.bajasactivosfijosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualBajasActivosFijos(this.bajasactivosfijos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanBajasActivosFijos(this.bajasactivosfijosReturnGeneral,this.bajasactivosfijosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.bajasactivosfijosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanBajasActivosFijos(classes,this.bajasactivosfijosReturnGeneral,this.bajasactivosfijosBean,false);
					}
						
					if(this.bajasactivosfijosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyBajasActivosFijos(this.bajasactivosfijosReturnGeneral.getBajasActivosFijos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioBajasActivosFijos(this.bajasactivosfijosReturnGeneral.getBajasActivosFijos());	
					}
						
					if(this.bajasactivosfijosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioBajasActivosFijos(this.bajasactivosfijosReturnGeneral.getBajasActivosFijos(),classes);//this.bajasactivosfijosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioBajasActivosFijos(this.bajasactivosfijos,classes);//this.bajasactivosfijosBean);									
				}
			
				if(BajasActivosFijosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualBajasActivosFijos(this.bajasactivosfijos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysBajasActivosFijos(this.bajasactivosfijos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.bajasactivosfijosAnterior!=null) {
						this.bajasactivosfijos=this.bajasactivosfijosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.bajasactivosfijosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.bajasactivosfijosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.bajasactivosfijosReturnGeneral.getBajasActivosFijos(),bajasactivosfijosLogic.getBajasActivosFijoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.bajasactivosfijosReturnGeneral.getBajasActivosFijos(),this.bajasactivosfijoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosBajasActivosFijos.repaint();
				
				//((AbstractTableModel) this.jTableDatosBajasActivosFijos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosBajasActivosFijos();
			}
		}
	}
	
	public void actualizarVisualTableDatosBajasActivosFijos() throws Exception {
		
		BajasActivosFijosModel bajasactivosfijosModel=(BajasActivosFijosModel)this.jTableDatosBajasActivosFijos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			bajasactivosfijosModel.bajasactivosfijoss=this.bajasactivosfijosLogic.getBajasActivosFijoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			bajasactivosfijosModel.bajasactivosfijoss=this.bajasactivosfijoss;
		}
		
		
		((BajasActivosFijosModel) this.jTableDatosBajasActivosFijos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaBajasActivosFijos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getbajasactivosfijosAnterior(),this.bajasactivosfijosLogic.getBajasActivosFijoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getbajasactivosfijosAnterior(),this.bajasactivosfijoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosBajasActivosFijos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioBajasActivosFijos(BajasActivosFijos bajasactivosfijos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
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
										
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bajasactivosfijos,new Object(),generalEntityParameterGeneral,this.bajasactivosfijosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=BajasActivosFijosConstantesFunciones.getClassesRelationshipsOfBajasActivosFijos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=BajasActivosFijosConstantesFunciones.getClassesRelationshipsFromStringsOfBajasActivosFijos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormBajasActivosFijos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				BajasActivosFijosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.bajasactivosfijos,new Object(),generalEntityParameterGeneral,this.bajasactivosfijosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioBajasActivosFijos(BajasActivosFijosBean bajasactivosfijosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanBajasActivosFijos(ArrayList<Classe> classes,BajasActivosFijosReturnGeneral bajasactivosfijosReturnGeneral,BajasActivosFijosBean bajasactivosfijosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualBajasActivosFijos(BajasActivosFijos bajasactivosfijos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.bajasactivosfijos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormBajasActivosFijos = new BajasActivosFijosDetalleFormJInternalFrame(jDesktopPane,this.bajasactivosfijosSessionBean.getConGuardarRelaciones(),this.bajasactivosfijosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.setVisible(false);
		this.jInternalFrameDetalleFormBajasActivosFijos.setSelected(false);						
		
		this.jInternalFrameDetalleFormBajasActivosFijos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormBajasActivosFijos.bajasactivosfijosLogic=this.bajasactivosfijosLogic;
		
		this.cargarCombosFrameForeignKeyBajasActivosFijos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleBajasActivosFijos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleBajasActivosFijos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyBajasActivosFijos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyBajasActivosFijos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormBajasActivosFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBajasActivosFijos"));
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarBajasActivosFijos"));

		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarToolBarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarBajasActivosFijos"));
					
		this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemModificarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarBajasActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"ActualizarBajasActivosFijos"));
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarToolBarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBajasActivosFijos"));
						
		this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemActualizarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBajasActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarBajasActivosFijos"));
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarBajasActivosFijos"));
								
		this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemEliminarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBajasActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarBajasActivosFijos"));
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarBajasActivosFijos"));
					
		this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemCancelarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBajasActivosFijos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemDetalleCerrarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBajasActivosFijos"));		
		
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBajasActivosFijos"));
		
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBajasActivosFijos"));
		
		
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBajasActivosFijos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonidBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idBajasActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonid_empresaBajasActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBajasActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonid_empresaBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonclaveBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombreBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonfecha_compraBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonvida_utilBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncosto_de_compraBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraBajasActivosFijosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBajasActivosFijos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameBajasActivosFijos"));
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarBajasActivosFijos"));
		}
		
		this.jTableDatosBajasActivosFijos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarBajasActivosFijos"));
		
		this.jTableDatosBajasActivosFijos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarBajasActivosFijos"));
		
		this.jButtonNuevoBajasActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoBajasActivosFijos"));
		
		this.jButtonDuplicarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"DuplicarBajasActivosFijos"));
		
		this.jButtonCopiarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"CopiarBajasActivosFijos"));
		
		this.jButtonVerFormBajasActivosFijos.addActionListener(new ButtonActionListener(this,"VerFormBajasActivosFijos"));
		
		
		this.jButtonNuevoToolBarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoToolBarBajasActivosFijos"));
			
		this.jButtonDuplicarToolBarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarBajasActivosFijos"));
			
		this.jMenuItemNuevoBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoBajasActivosFijos"));
			
		this.jMenuItemDuplicarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarBajasActivosFijos"));		
		
		
		this.jButtonNuevoRelacionesBajasActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesBajasActivosFijos"));
		
		
		this.jButtonNuevoRelacionesToolBarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarBajasActivosFijos"));
			
		this.jMenuItemNuevoRelacionesBajasActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesBajasActivosFijos"));		
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarBajasActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonModificarToolBarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"ModificarToolBarBajasActivosFijos"));
			
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemModificarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"MenuItemModificarBajasActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"ActualizarBajasActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonActualizarToolBarBajasActivosFijos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarBajasActivosFijos"));
				
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemActualizarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarBajasActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarBajasActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonEliminarToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"EliminarToolBarBajasActivosFijos"));
						
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemEliminarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarBajasActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarBajasActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonCancelarToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"CancelarToolBarBajasActivosFijos"));
			
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemCancelarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarBajasActivosFijos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarBajasActivosFijos"));		
		
		
		this.jButtonCerrarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarBajasActivosFijos"));
		
		
		this.jButtonCerrarToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarToolBarBajasActivosFijos"));
			
		this.jMenuItemCerrarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarBajasActivosFijos"));
			
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jMenuItemDetalleCerrarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarBajasActivosFijos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosBajasActivosFijos"));
		}
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarBajasActivosFijos"));
		}
		
		this.jButtonCopiarToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"CopiarToolBarBajasActivosFijos"));
			
		this.jButtonVerFormToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"VerFormToolBarBajasActivosFijos"));
		
		this.jMenuItemGuardarCambiosBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosBajasActivosFijos"));
			
		this.jMenuItemCopiarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarBajasActivosFijos"));		
		
		this.jMenuItemVerFormBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormBajasActivosFijos"));		
		
		
		this.jButtonGuardarCambiosTablaBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBajasActivosFijos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarBajasActivosFijos"));
			
		this.jMenuItemGuardarCambiosTablaBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaBajasActivosFijos"));		
		
		
		
		this.jButtonRecargarInformacionBajasActivosFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionBajasActivosFijos"));
					
		this.jButtonRecargarInformacionToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarBajasActivosFijos"));
		
		this.jMenuItemRecargarInformacionBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionBajasActivosFijos"));		
		
		
		
		this.jButtonAnterioresBajasActivosFijos.addActionListener (new ButtonActionListener(this,"AnterioresBajasActivosFijos"));
		
		
		this.jButtonAnterioresToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarBajasActivosFijos"));
		
		this.jMenuItemAnterioresBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresBajasActivosFijos"));		
		
		
		this.jButtonSiguientesBajasActivosFijos.addActionListener (new ButtonActionListener(this,"SiguientesBajasActivosFijos"));
		
		
		this.jButtonSiguientesToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarBajasActivosFijos"));
			
		this.jMenuItemSiguientesBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesBajasActivosFijos"));
			
		this.jMenuItemAbrirOrderByBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByBajasActivosFijos"));
			
		this.jMenuItemMostrarOcultarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarBajasActivosFijos"));
			
		this.jMenuItemDetalleAbrirOrderByBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByBajasActivosFijos"));
			
		this.jMenuItemDetalleMostarOcultarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarBajasActivosFijos"));		
		
		
		this.jButtonNuevoGuardarCambiosBajasActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosBajasActivosFijos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarBajasActivosFijos"));
			
		this.jMenuItemNuevoGuardarCambiosBajasActivosFijos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosBajasActivosFijos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosBajasActivosFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosBajasActivosFijos"));

		this.jCheckBoxSeleccionadosBajasActivosFijos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosBajasActivosFijos"));
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioBajasActivosFijos"));
		}
		
		
		this.jComboBoxTiposRelacionesBajasActivosFijos.addActionListener (new ButtonActionListener(this,"TiposRelacionesBajasActivosFijos"));
			
		this.jComboBoxTiposAccionesBajasActivosFijos.addActionListener (new ButtonActionListener(this,"TiposAccionesBajasActivosFijos"));
					
		this.jComboBoxTiposSeleccionarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarBajasActivosFijos"));
			
		this.jTextFieldValorCampoGeneralBajasActivosFijos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralBajasActivosFijos"));		
		
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonidBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idBajasActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonid_empresaBajasActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBajasActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonid_empresaBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonclaveBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombreBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonfecha_compraBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonvida_utilBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncosto_de_compraBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraBajasActivosFijosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaBajasActivosFijosBajasActivosFijos.addActionListener(new ButtonActionListener(this,"BusquedaBajasActivosFijosBajasActivosFijos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoBajasActivosFijos!=null) {
				this.jInternalFrameReporteDinamicoBajasActivosFijos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBajasActivosFijos"));
				this.jInternalFrameReporteDinamicoBajasActivosFijos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBajasActivosFijos"));
				this.jInternalFrameReporteDinamicoBajasActivosFijos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBajasActivosFijos"));
			}
			
			//this.jButtonCerrarReporteDinamicoBajasActivosFijos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoBajasActivosFijos"));				
			//this.jButtonGenerarReporteDinamicoBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoBajasActivosFijos"));
			//this.jButtonGenerarExcelReporteDinamicoBajasActivosFijos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoBajasActivosFijos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionBajasActivosFijos!=null) {
				this.jInternalFrameImportacionBajasActivosFijos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionBajasActivosFijos"));
				this.jInternalFrameImportacionBajasActivosFijos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionBajasActivosFijos"));
				this.jInternalFrameImportacionBajasActivosFijos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionBajasActivosFijos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByBajasActivosFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByBajasActivosFijos"));
			
			this.jButtonAbrirOrderByToolBarBajasActivosFijos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarBajasActivosFijos"));			
			
			if(this.jInternalFrameOrderByBajasActivosFijos!=null) {
				this.jInternalFrameOrderByBajasActivosFijos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByBajasActivosFijos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormBajasActivosFijos.jTabbedPaneRelacionesBajasActivosFijos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesBajasActivosFijos"));
		
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
            		closingInternalFrameBajasActivosFijos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormBajasActivosFijos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormBajasActivosFijos = (JInternalFrameBase)event.getSource();
	            	
	            BajasActivosFijosBeanSwingJInternalFrame jInternalFrameParent=(BajasActivosFijosBeanSwingJInternalFrame)jInternalFrameDetalleFormBajasActivosFijos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarBajasActivosFijosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosBajasActivosFijos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosBajasActivosFijosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosBajasActivosFijos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosBajasActivosFijos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBajasActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBajasActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBajasActivosFijosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoBajasActivosFijos";
		inputMap = this.jButtonNuevoBajasActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoBajasActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBajasActivosFijosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBajasActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBajasActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoBajasActivosFijosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesBajasActivosFijos";
		inputMap = this.jButtonNuevoRelacionesBajasActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesBajasActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoBajasActivosFijosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarBajasActivosFijos";
		inputMap = this.jButtonModificarBajasActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarBajasActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarBajasActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarBajasActivosFijos";
		inputMap = this.jButtonActualizarBajasActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarBajasActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarBajasActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarBajasActivosFijos";
		inputMap = this.jButtonEliminarBajasActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarBajasActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarBajasActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarBajasActivosFijos";
		inputMap = this.jButtonCancelarBajasActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarBajasActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarBajasActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarBajasActivosFijos";
		inputMap = this.jButtonCerrarBajasActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarBajasActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarBajasActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosBajasActivosFijos";
		inputMap = this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosBajasActivosFijos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonGuardarCambiosBajasActivosFijos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosBajasActivosFijosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosBajasActivosFijos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosBajasActivosFijosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesBajasActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesBajasActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarBajasActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarBajasActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralBajasActivosFijos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralBajasActivosFijosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonidBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"idBajasActivosFijosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonid_empresaBajasActivosFijosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaBajasActivosFijosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonid_empresaBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncodigo_sub_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_sub_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombre_sub_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_sub_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncodigo_detalle_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"codigo_detalle_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombre_detalle_grupoBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_detalle_grupoBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonclaveBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"claveBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonnombreBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"nombreBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonfecha_compraBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_compraBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtonvida_utilBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"vida_utilBajasActivosFijosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormBajasActivosFijos.jButtoncosto_de_compraBajasActivosFijosBusqueda.addActionListener(new ButtonActionListener(this,"costo_de_compraBajasActivosFijosBusqueda"));
		
		
		this.jButtonBusquedaBajasActivosFijosBajasActivosFijos.addActionListener(new ButtonActionListener(this,"BusquedaBajasActivosFijosBajasActivosFijos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionBajasActivosFijos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionBajasActivosFijosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarBajasActivosFijosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarBajasActivosFijos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosBajasActivosFijos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
					bajasactivosfijosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijoss) {
					bajasactivosfijosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosBajasActivosFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBajasActivosFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
						bajasactivosfijosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijoss) {
						bajasactivosfijosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaBajasActivosFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBajasActivosFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBajasActivosFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosBajasActivosFijosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingBajasActivosFijos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosBajasActivosFijos.getSelectedRows();
			
			BajasActivosFijos bajasactivosfijosLocal=new BajasActivosFijos();
			
			//this.seleccionarTodosBajasActivosFijos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					bajasactivosfijosLocal =(BajasActivosFijos) this.bajasactivosfijosLogic.getBajasActivosFijoss().toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					bajasactivosfijosLocal =(BajasActivosFijos) this.bajasactivosfijoss.toArray()[this.jTableDatosBajasActivosFijos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				bajasactivosfijosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
						bajasactivosfijosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijoss) {
						bajasactivosfijosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaBajasActivosFijos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosBajasActivosFijos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosBajasActivosFijos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosBajasActivosFijos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualBajasActivosFijosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarBajasActivosFijosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralBajasActivosFijosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingBajasActivosFijos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralBajasActivosFijos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijosLogic.getBajasActivosFijoss()) {
				
						if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							bajasactivosfijosAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							bajasactivosfijosAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							bajasactivosfijosAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							bajasactivosfijosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							bajasactivosfijosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							bajasactivosfijosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							bajasactivosfijosAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							bajasactivosfijosAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							bajasactivosfijosAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijoss) {
					
						if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
							existe=true;
							bajasactivosfijosAux.setcodigo_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
							existe=true;
							bajasactivosfijosAux.setnombre_sub_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
							existe=true;
							bajasactivosfijosAux.setcodigo_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
							existe=true;
							bajasactivosfijosAux.setnombre_detalle_grupo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CLAVE)) {
							existe=true;
							bajasactivosfijosAux.setclave(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							bajasactivosfijosAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
							existe=true;
							bajasactivosfijosAux.setfecha_compra(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL)) {
							existe=true;
							bajasactivosfijosAux.setvida_util(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA)) {
							existe=true;
							bajasactivosfijosAux.setcosto_de_compra(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaBajasActivosFijos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesBajasActivosFijosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingBajasActivosFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioBajasActivosFijos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesBajasActivosFijos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteBajasActivosFijos) {				
					conSplash=true;//false;										
					
					//this.startProcessBajasActivosFijos(conSplash);
				
					this.generarReporteBajasActivosFijossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoBajasActivosFijossSeleccionados();
				//this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBajasActivosFijossSeleccionados(false);
				//this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoBajasActivosFijossSeleccionados(true);
				//this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBajasActivosFijos();
				
				this.exportarBajasActivosFijossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionBajasActivosFijoss();
				//this.importarBajasActivosFijoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessBajasActivosFijos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelBajasActivosFijossSeleccionados();
				//this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Bajas Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessBajasActivosFijos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoBajasActivosFijos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyBajasActivosFijos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.setSelectedIndex(0);					
				}	
			} 			
			else if(BajasActivosFijosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteBajasActivosFijos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessBajasActivosFijos(conSplash);
					
						//this.actualizarParametrosGeneralBajasActivosFijos();
						
						this.generarReporteProcesoAccionBajasActivosFijossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(BajasActivosFijosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Bajas Activos FijosES SELECCIONADOS?", "MANTENIMIENTO DE Bajas Activos Fijos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessBajasActivosFijos();
				
						this.actualizarParametrosGeneralBajasActivosFijos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.bajasactivosfijosReturnGeneral=bajasactivosfijosLogic.procesarAccionBajasActivosFijossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.bajasactivosfijosLogic.getBajasActivosFijoss(),this.bajasactivosfijosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarBajasActivosFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralBajasActivosFijos();
					
					BajasActivosFijosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarBajasActivosFijosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesBajasActivosFijos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxTiposAccionesFormularioBajasActivosFijos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessBajasActivosFijos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesBajasActivosFijosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessBajasActivosFijos();
			
			if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		
			BajasActivosFijos bajasactivosfijos=new BajasActivosFijos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingBajasActivosFijos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesBajasActivosFijos.getSelectedItem();
			
			
			
			
			bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
			//this.sTipoAccion;
			
			if(bajasactivosfijossSeleccionados.size()==1) {
				for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijossSeleccionados) {
					bajasactivosfijos=bajasactivosfijosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessBajasActivosFijos();
			
      		//this.finishProcessBajasActivosFijos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarBajasActivosFijosReturnGeneral() throws Exception {
		if(this.bajasactivosfijosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.bajasactivosfijosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.bajasactivosfijosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.bajasactivosfijosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.bajasactivosfijosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.bajasactivosfijosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingBajasActivosFijos(false);
		}
		
		if(this.bajasactivosfijosReturnGeneral.getConRetornoLista() || this.bajasactivosfijosReturnGeneral.getConRetornoObjeto()) {
			if(this.bajasactivosfijosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.bajasactivosfijosLogic.setBajasActivosFijoss(this.bajasactivosfijosReturnGeneral.getBajasActivosFijoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingBajasActivosFijos(false);
		}
	}
	
	public void actualizarParametrosGeneralBajasActivosFijos() throws Exception {
		
		
	}
	
	public ArrayList<BajasActivosFijos> getBajasActivosFijossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioBajasActivosFijos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijosLogic.getBajasActivosFijoss()) {
					if(bajasactivosfijosAux.getIsSelected()) {
						bajasactivosfijossSeleccionados.add(bajasactivosfijosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(BajasActivosFijos bajasactivosfijosAux:this.bajasactivosfijoss) {
					if(bajasactivosfijosAux.getIsSelected()) {
						bajasactivosfijossSeleccionados.add(bajasactivosfijosAux);				
					}
				}
			}
			
			if(bajasactivosfijossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						bajasactivosfijossSeleccionados.addAll(this.bajasactivosfijosLogic.getBajasActivosFijoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						bajasactivosfijossSeleccionados.addAll(this.bajasactivosfijoss);				
					}
				}
			}
		} else {
			bajasactivosfijossSeleccionados.add(this.bajasactivosfijos);
		}
		
		return bajasactivosfijossSeleccionados;
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
	
	public void generarReporteBajasActivosFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalBajasActivosFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoBajasActivosFijossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBajasActivosFijossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoBajasActivosFijossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Bajas Activos Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesBajasActivosFijossSeleccionados() throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteBajasActivosFijoss("Todos",bajasactivosfijossSeleccionados);
		
	}	
	
	public void generarReporteNormalBajasActivosFijossSeleccionados() throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteBajasActivosFijoss("Todos",bajasactivosfijossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionBajasActivosFijossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteBajasActivosFijoss("Todos",bajasactivosfijossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoBajasActivosFijossSeleccionados() throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoBajasActivosFijos();
		
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoBajasActivosFijos();
		
		
		//this.generarReporteBajasActivosFijoss("Todos",bajasactivosfijossSeleccionados ,bajasactivosfijosImplementable,bajasactivosfijosImplementableHome);
	}
	
	public void mostrarImportacionBajasActivosFijoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionBajasActivosFijos();
		
		this.abrirFrameImportacionBajasActivosFijos();		
		
			
		//this.generarReporteBajasActivosFijoss("Todos",bajasactivosfijossSeleccionados ,bajasactivosfijosImplementable,bajasactivosfijosImplementableHome);
	}
	
	public void importarBajasActivosFijoss() throws Exception {		
	
	}
	
	public void exportarBajasActivosFijossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelBajasActivosFijossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoBajasActivosFijossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlBajasActivosFijossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Bajas Activos Fijos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoBajasActivosFijossSeleccionados() throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bajasactivosfijos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarBajasActivosFijos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarBajasActivosFijos(bajasactivosfijosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//bajasactivosfijosAux.setsDetalleGeneralEntityReporte(bajasactivosfijosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarBajasActivosFijos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_CLAVE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarBajasActivosFijos(BajasActivosFijos bajasactivosfijos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=bajasactivosfijos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getcodigo_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getnombre_sub_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getcodigo_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getnombre_detalle_grupo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getclave();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getfecha_compra().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getvida_util().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=bajasactivosfijos.getcosto_de_compra().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelBajasActivosFijossSeleccionados() throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bajasactivosfijos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("BajasActivosFijoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelBajasActivosFijos(row);				
				iRow++;
			}				
			
			for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelBajasActivosFijos(bajasactivosfijosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlBajasActivosFijossSeleccionados() throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();		
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"bajasactivosfijos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("bajasactivosfijoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("bajasactivosfijos");
			//elementRoot.appendChild(element);
		
			for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijossSeleccionados) {
				element = document.createElement("bajasactivosfijos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlBajasActivosFijos(bajasactivosfijosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Bajas Activos Fijos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelBajasActivosFijos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_CLAVE);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_VIDAUTIL);
		cell = row.createCell(iColumn++);cell.setCellValue(BajasActivosFijosConstantesFunciones.LABEL_COSTODECOMPRA);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelBajasActivosFijos(BajasActivosFijos bajasactivosfijos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getcodigo_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getnombre_sub_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getcodigo_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getnombre_detalle_grupo());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getclave());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getfecha_compra());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getvida_util());
		cell = row.createCell(iColumn++);cell.setCellValue(bajasactivosfijos.getcosto_de_compra());				
	}
	
	public void setFilaDatosExportarXmlBajasActivosFijos(BajasActivosFijos bajasactivosfijos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(BajasActivosFijosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(bajasactivosfijos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(BajasActivosFijosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(bajasactivosfijos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(BajasActivosFijosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(bajasactivosfijos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo_sub_grupo = document.createElement(BajasActivosFijosConstantesFunciones.CODIGOSUBGRUPO);
		elementcodigo_sub_grupo.appendChild(document.createTextNode(bajasactivosfijos.getcodigo_sub_grupo().trim()));
		element.appendChild(elementcodigo_sub_grupo);

		Element elementnombre_sub_grupo = document.createElement(BajasActivosFijosConstantesFunciones.NOMBRESUBGRUPO);
		elementnombre_sub_grupo.appendChild(document.createTextNode(bajasactivosfijos.getnombre_sub_grupo().trim()));
		element.appendChild(elementnombre_sub_grupo);

		Element elementcodigo_detalle_grupo = document.createElement(BajasActivosFijosConstantesFunciones.CODIGODETALLEGRUPO);
		elementcodigo_detalle_grupo.appendChild(document.createTextNode(bajasactivosfijos.getcodigo_detalle_grupo().trim()));
		element.appendChild(elementcodigo_detalle_grupo);

		Element elementnombre_detalle_grupo = document.createElement(BajasActivosFijosConstantesFunciones.NOMBREDETALLEGRUPO);
		elementnombre_detalle_grupo.appendChild(document.createTextNode(bajasactivosfijos.getnombre_detalle_grupo().trim()));
		element.appendChild(elementnombre_detalle_grupo);

		Element elementclave = document.createElement(BajasActivosFijosConstantesFunciones.CLAVE);
		elementclave.appendChild(document.createTextNode(bajasactivosfijos.getclave().trim()));
		element.appendChild(elementclave);

		Element elementnombre = document.createElement(BajasActivosFijosConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(bajasactivosfijos.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_compra = document.createElement(BajasActivosFijosConstantesFunciones.FECHACOMPRA);
		elementfecha_compra.appendChild(document.createTextNode(bajasactivosfijos.getfecha_compra().toString().trim()));
		element.appendChild(elementfecha_compra);

		Element elementvida_util = document.createElement(BajasActivosFijosConstantesFunciones.VIDAUTIL);
		elementvida_util.appendChild(document.createTextNode(bajasactivosfijos.getvida_util().toString().trim()));
		element.appendChild(elementvida_util);

		Element elementcosto_de_compra = document.createElement(BajasActivosFijosConstantesFunciones.COSTODECOMPRA);
		elementcosto_de_compra.appendChild(document.createTextNode(bajasactivosfijos.getcosto_de_compra().toString().trim()));
		element.appendChild(elementcosto_de_compra);
	}
	
	public void generarReporteGroupGenericoBajasActivosFijossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados=new ArrayList<BajasActivosFijos>();
		
		bajasactivosfijossSeleccionados=this.getBajasActivosFijossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoBajasActivosFijos(bajasactivosfijossSeleccionados);
		
		this.generarReporteBajasActivosFijoss("Todos",bajasactivosfijossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoBajasActivosFijos(ArrayList<BajasActivosFijos> bajasactivosfijossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(BajasActivosFijos bajasactivosfijosAux:bajasactivosfijossSeleccionados) {
				bajasactivosfijosAux.setsDetalleGeneralEntityReporte(bajasactivosfijosAux.toString());
			
				if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					bajasactivosfijosAux.setsDescripcionGeneralEntityReporte1(bajasactivosfijosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CODIGOSUBGRUPO)) {
					existe=true;
					bajasactivosfijosAux.setsDescripcionGeneralEntityReporte1(bajasactivosfijosAux.getcodigo_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBRESUBGRUPO)) {
					existe=true;
					bajasactivosfijosAux.setsDescripcionGeneralEntityReporte1(bajasactivosfijosAux.getnombre_sub_grupo());
				}
				 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CODIGODETALLEGRUPO)) {
					existe=true;
					bajasactivosfijosAux.setsDescripcionGeneralEntityReporte1(bajasactivosfijosAux.getcodigo_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBREDETALLEGRUPO)) {
					existe=true;
					bajasactivosfijosAux.setsDescripcionGeneralEntityReporte1(bajasactivosfijosAux.getnombre_detalle_grupo());
				}
				 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_CLAVE)) {
					existe=true;
					bajasactivosfijosAux.setsDescripcionGeneralEntityReporte1(bajasactivosfijosAux.getclave());
				}
				 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					bajasactivosfijosAux.setsDescripcionGeneralEntityReporte1(bajasactivosfijosAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(BajasActivosFijosConstantesFunciones.LABEL_FECHACOMPRA)) {
					existe=true;
					bajasactivosfijosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(bajasactivosfijosAux.getfecha_compra()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,BajasActivosFijosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesBajasActivosFijos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoBajasActivosFijos=true;
				this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=true;
				this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=true;
			}
			
			this.isVisibilidadCeldaModificarBajasActivosFijos=false;
			this.isVisibilidadCeldaActualizarBajasActivosFijos=false;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
			this.isVisibilidadCeldaCancelarBajasActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoBajasActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;
			this.isVisibilidadCeldaModificarBajasActivosFijos=false;
			this.isVisibilidadCeldaActualizarBajasActivosFijos=true;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
			this.isVisibilidadCeldaCancelarBajasActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoBajasActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;
			this.isVisibilidadCeldaModificarBajasActivosFijos=false;
			this.isVisibilidadCeldaActualizarBajasActivosFijos=true;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=true;
			this.isVisibilidadCeldaCancelarBajasActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoBajasActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;
			this.isVisibilidadCeldaModificarBajasActivosFijos=false;
			this.isVisibilidadCeldaActualizarBajasActivosFijos=true;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
			this.isVisibilidadCeldaCancelarBajasActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoBajasActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=true;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=true;
			this.isVisibilidadCeldaModificarBajasActivosFijos=false;
			this.isVisibilidadCeldaActualizarBajasActivosFijos=false;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
			this.isVisibilidadCeldaCancelarBajasActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=true;
				} else {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoBajasActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;
			this.isVisibilidadCeldaActualizarBajasActivosFijos=false;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
			this.isVisibilidadCeldaCancelarBajasActivosFijos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoBajasActivosFijos=false;
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;
			this.isVisibilidadCeldaModificarBajasActivosFijos=true;
			this.isVisibilidadCeldaActualizarBajasActivosFijos=false;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
			this.isVisibilidadCeldaCancelarBajasActivosFijos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				} else {
					this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(BajasActivosFijosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoBajasActivosFijos=true;
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=true;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=true;
		} else {
			this.actualizarEstadoPanelsBajasActivosFijos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarBajasActivosFijos=false;
			//this.isVisibilidadCeldaVerFormBajasActivosFijos=false;
			this.isVisibilidadCeldaDuplicarBajasActivosFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!bajasactivosfijosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
		} else {
			this.isVisibilidadCeldaNuevoBajasActivosFijos=false;
			this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(!bajasactivosfijosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;												
			}
			
			this.jButtonCerrarBajasActivosFijos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
		}
		
		if(!this.permiteMantenimiento(this.bajasactivosfijos)) {
			this.isVisibilidadCeldaActualizarBajasActivosFijos=false;
			this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoBajasActivosFijos=false;
		this.isVisibilidadCeldaNuevoRelacionesBajasActivosFijos=false;
		this.isVisibilidadCeldaGuardarCambiosBajasActivosFijos=false;
		//this.isVisibilidadCeldaModificarBajasActivosFijos=true;
		this.isVisibilidadCeldaActualizarBajasActivosFijos=false;
		this.isVisibilidadCeldaEliminarBajasActivosFijos=false;
		//this.isVisibilidadCeldaCancelarBajasActivosFijos=true;			
		this.isVisibilidadCeldaGuardarBajasActivosFijos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesBajasActivosFijos() {
	}
	
	public void actualizarEstadoPanelsBajasActivosFijos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionBajasActivosFijos!=null) {
				this.jScrollPanelDatosEdicionBajasActivosFijos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBajasActivosFijos!=null) {
				this.jScrollPanelDatosBajasActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionBajasActivosFijos!=null) {
				this.jPanelPaginacionBajasActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionBajasActivosFijos!=null) {
				this.jScrollPanelDatosEdicionBajasActivosFijos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosBajasActivosFijos!=null) {
				this.jScrollPanelDatosBajasActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionBajasActivosFijos!=null) {
				this.jPanelPaginacionBajasActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionBajasActivosFijos!=null) {
				this.jScrollPanelDatosEdicionBajasActivosFijos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBajasActivosFijos!=null) {
				this.jScrollPanelDatosBajasActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionBajasActivosFijos!=null) {
				this.jPanelPaginacionBajasActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionBajasActivosFijos!=null) {
				this.jScrollPanelDatosEdicionBajasActivosFijos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosBajasActivosFijos!=null) {
				this.jScrollPanelDatosBajasActivosFijos.setVisible(false);
			}
			
			if(this.jPanelPaginacionBajasActivosFijos!=null) {
				this.jPanelPaginacionBajasActivosFijos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionBajasActivosFijos!=null) {
				this.jScrollPanelDatosEdicionBajasActivosFijos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBajasActivosFijos!=null) {
				this.jScrollPanelDatosBajasActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionBajasActivosFijos!=null) {
				this.jPanelPaginacionBajasActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionBajasActivosFijos!=null) {
				this.jScrollPanelDatosEdicionBajasActivosFijos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBajasActivosFijos!=null) {
				this.jScrollPanelDatosBajasActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionBajasActivosFijos!=null) {
				this.jPanelPaginacionBajasActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionBajasActivosFijos!=null) {
				this.jScrollPanelDatosEdicionBajasActivosFijos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosBajasActivosFijos!=null) {
				this.jScrollPanelDatosBajasActivosFijos.setVisible(true);
			}
			
			if(this.jPanelPaginacionBajasActivosFijos!=null) {
				this.jPanelPaginacionBajasActivosFijos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
					this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.bajasactivosfijosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasBajasActivosFijos!=null) {
				this.jTabbedPaneBusquedasBajasActivosFijos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesBajasActivosFijos!=null) {
				this.jPanelParametrosReportesBajasActivosFijos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaBajasActivosFijos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaBajasActivosFijos) {this.jTabbedPaneBusquedasBajasActivosFijos.remove(jPanelBusquedaBajasActivosFijosBajasActivosFijos);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaBajasActivosFijos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioBajasActivosFijos() {
		this.updateBorderResaltarBusquedasFormularioBajasActivosFijos();
		this.updateVisibilidadBusquedasFormularioBajasActivosFijos();
		this.updateHabilitarBusquedasFormularioBajasActivosFijos();
	}
	
	public void updateBorderResaltarBusquedasFormularioBajasActivosFijos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasBajasActivosFijos.getComponents().length>0) {
	

		if(this.bajasactivosfijosConstantesFunciones.resaltarBusquedaBajasActivosFijosBajasActivosFijos!=null) {
			index= this.jTabbedPaneBusquedasBajasActivosFijos.indexOfComponent(this.jPanelBusquedaBajasActivosFijosBajasActivosFijos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBajasActivosFijos.getComponent(index);
				jPanel.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarBusquedaBajasActivosFijosBajasActivosFijos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioBajasActivosFijos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasBajasActivosFijos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBajasActivosFijos.indexOfComponent(this.jPanelBusquedaBajasActivosFijosBajasActivosFijos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasBajasActivosFijos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarBusquedaBajasActivosFijosBajasActivosFijos);
			if(!this.bajasactivosfijosConstantesFunciones.mostrarBusquedaBajasActivosFijosBajasActivosFijos && index>-1) {
				this.jTabbedPaneBusquedasBajasActivosFijos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioBajasActivosFijos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasBajasActivosFijos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasBajasActivosFijos.indexOfComponent(this.jPanelBusquedaBajasActivosFijosBajasActivosFijos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasBajasActivosFijos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.bajasactivosfijosConstantesFunciones.activarBusquedaBajasActivosFijosBajasActivosFijos);
				this.jTabbedPaneBusquedasBajasActivosFijos.setEnabledAt(index,this.bajasactivosfijosConstantesFunciones.activarBusquedaBajasActivosFijosBajasActivosFijos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaBajasActivosFijos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaBajasActivosFijos")) {
			index= this.jTabbedPaneBusquedasBajasActivosFijos.indexOfComponent(this.jPanelBusquedaBajasActivosFijosBajasActivosFijos);

			this.jTabbedPaneBusquedasBajasActivosFijos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasBajasActivosFijos.getComponent(index);

			this.bajasactivosfijosConstantesFunciones.setResaltarBusquedaBajasActivosFijosBajasActivosFijos(resaltar);

			jPanel.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarBusquedaBajasActivosFijosBajasActivosFijos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarBajasActivosFijos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioBajasActivosFijos() throws Exception {

		if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioBajasActivosFijos();
		this.updateVisibilidadResaltarControlesFormularioBajasActivosFijos();
		this.updateHabilitarResaltarControlesFormularioBajasActivosFijos();
		
	}
	
	public void updateBorderResaltarControlesFormularioBajasActivosFijos() throws Exception {
		if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.bajasactivosfijosConstantesFunciones.resaltaridBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltaridBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarid_empresaBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarid_empresaBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_sub_grupoBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarcodigo_sub_grupoBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarnombre_sub_grupoBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_sub_grupoBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarnombre_sub_grupoBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_detalle_grupoBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarcodigo_detalle_grupoBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_detalle_grupoBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarnombre_detalle_grupoBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarclaveBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldclaveBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarclaveBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarnombreBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombreBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarnombreBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarfecha_compraBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jDateChooserfecha_compraBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarfecha_compraBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarvida_utilBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldvida_utilBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarvida_utilBajasActivosFijos);}
		if(this.bajasactivosfijosConstantesFunciones.resaltarcosto_de_compraBajasActivosFijos!=null && this.jInternalFrameDetalleFormBajasActivosFijos!=null) {this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcosto_de_compraBajasActivosFijos.setBorder(this.bajasactivosfijosConstantesFunciones.resaltarcosto_de_compraBajasActivosFijos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioBajasActivosFijos() throws Exception {		
		if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
	
		//this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostraridBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelidBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostraridBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarid_empresaBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelid_empresaBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarid_empresaBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_sub_grupoBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelcodigo_sub_grupoBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarcodigo_sub_grupoBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_sub_grupoBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarnombre_sub_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelnombre_sub_grupoBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarnombre_sub_grupoBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_detalle_grupoBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelcodigo_detalle_grupoBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarcodigo_detalle_grupoBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_detalle_grupoBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelnombre_detalle_grupoBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarnombre_detalle_grupoBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldclaveBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarclaveBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelclaveBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarclaveBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombreBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarnombreBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelnombreBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarnombreBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jDateChooserfecha_compraBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarfecha_compraBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelfecha_compraBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarfecha_compraBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldvida_utilBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarvida_utilBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelvida_utilBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarvida_utilBajasActivosFijos);
		//this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcosto_de_compraBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarcosto_de_compraBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jPanelcosto_de_compraBajasActivosFijos.setVisible(this.bajasactivosfijosConstantesFunciones.mostrarcosto_de_compraBajasActivosFijos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioBajasActivosFijos() throws Exception {
		if(this.jInternalFrameDetalleFormBajasActivosFijos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormBajasActivosFijos!=null) {
	
		this.jInternalFrameDetalleFormBajasActivosFijos.jLabelidBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activaridBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jComboBoxid_empresaBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarid_empresaBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_sub_grupoBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarcodigo_sub_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_sub_grupoBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarnombre_sub_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcodigo_detalle_grupoBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarcodigo_detalle_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombre_detalle_grupoBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarnombre_detalle_grupoBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldclaveBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarclaveBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextAreanombreBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarnombreBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jDateChooserfecha_compraBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarfecha_compraBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldvida_utilBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarvida_utilBajasActivosFijos);
		this.jInternalFrameDetalleFormBajasActivosFijos.jTextFieldcosto_de_compraBajasActivosFijos.setEnabled(this.bajasactivosfijosConstantesFunciones.activarcosto_de_compraBajasActivosFijos);
		}
	}
	
		
}