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

import com.bydan.erp.nomina.util.TipoRasgoPersonalConstantesFunciones;
import com.bydan.erp.nomina.util.TipoRasgoPersonalParameterReturnGeneral;
//import com.bydan.erp.nomina.util.TipoRasgoPersonalParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.TipoRasgoPersonalBean;
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
public class TipoRasgoPersonalBeanSwingJInternalFrame extends TipoRasgoPersonalJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoRasgoPersonalBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoRasgoPersonal> tiporasgopersonalValidator = new ClassValidator<TipoRasgoPersonal>(TipoRasgoPersonal.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoRasgoPersonal tiporasgopersonal;	
	public TipoRasgoPersonal tiporasgopersonalAux;
	public TipoRasgoPersonal tiporasgopersonalAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoRasgoPersonal tiporasgopersonalTotales;
	public Long idTipoRasgoPersonalActual;
	public Long iIdNuevoTipoRasgoPersonal=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosRasgoPersonal=false;

	public Boolean getIsTienePermisosRasgoPersonal() {
		return isTienePermisosRasgoPersonal;
	}

	public void setIsTienePermisosRasgoPersonal(Boolean isTienePermisosRasgoPersonal) {
		this.isTienePermisosRasgoPersonal= isTienePermisosRasgoPersonal;
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
	
	public Boolean isPermisoTodoTipoRasgoPersonal;
	public Boolean isPermisoNuevoTipoRasgoPersonal;
	public Boolean isPermisoActualizarTipoRasgoPersonal;
	public Boolean isPermisoActualizarOriginalTipoRasgoPersonal;
	public Boolean isPermisoEliminarTipoRasgoPersonal;
	public Boolean isPermisoGuardarCambiosTipoRasgoPersonal;
	public Boolean isPermisoConsultaTipoRasgoPersonal;
	public Boolean isPermisoBusquedaTipoRasgoPersonal;
	public Boolean isPermisoReporteTipoRasgoPersonal;
	public Boolean isPermisoPaginacionMedioTipoRasgoPersonal;
	public Boolean isPermisoPaginacionAltoTipoRasgoPersonal;
	public Boolean isPermisoPaginacionTodoTipoRasgoPersonal;
	public Boolean isPermisoCopiarTipoRasgoPersonal;
	public Boolean isPermisoVerFormTipoRasgoPersonal;
	public Boolean isPermisoDuplicarTipoRasgoPersonal;
	public Boolean isPermisoOrdenTipoRasgoPersonal;
	
	
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
	
	public TipoRasgoPersonalParameterReturnGeneral tiporasgopersonalReturnGeneral;
	public TipoRasgoPersonalParameterReturnGeneral tiporasgopersonalParameterGeneral;
	
	

	public RasgoPersonalLogic rasgopersonalLogic=null;

	public RasgoPersonalLogic getRasgoPersonalLogic() {
		return rasgopersonalLogic;
	}

	public void setRasgoPersonalLogic(RasgoPersonalLogic rasgopersonalLogic) {
		this.rasgopersonalLogic = rasgopersonalLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoRasgoPersonal=false;
	public Boolean esParaAccionDesdeFormularioTipoRasgoPersonal=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoRasgoPersonalSessionBeanAdditional tiporasgopersonalSessionBeanAdditional=null;
	
	public TipoRasgoPersonalSessionBeanAdditional getTipoRasgoPersonalSessionBeanAdditional() {
		return this.tiporasgopersonalSessionBeanAdditional;
	}
	
	public void setTipoRasgoPersonalSessionBeanAdditional(TipoRasgoPersonalSessionBeanAdditional tiporasgopersonalSessionBeanAdditional) {
		try {
			this.tiporasgopersonalSessionBeanAdditional=tiporasgopersonalSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoRasgoPersonalBeanSwingJInternalFrameAdditional tiporasgopersonalBeanSwingJInternalFrameAdditional=null;
	//public class TipoRasgoPersonalBeanSwingJInternalFrame
	
	public TipoRasgoPersonalBeanSwingJInternalFrameAdditional getTipoRasgoPersonalBeanSwingJInternalFrameAdditional() {
		return this.tiporasgopersonalBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoRasgoPersonalBeanSwingJInternalFrameAdditional(TipoRasgoPersonalBeanSwingJInternalFrameAdditional tiporasgopersonalBeanSwingJInternalFrameAdditional) {
		try {
			this.tiporasgopersonalBeanSwingJInternalFrameAdditional=tiporasgopersonalBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoRasgoPersonalLogic tiporasgopersonalLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoRasgoPersonal tiporasgopersonalBean;
	public TipoRasgoPersonalConstantesFunciones tiporasgopersonalConstantesFunciones;
	//public TipoRasgoPersonalParameterReturnGeneral tiporasgopersonalReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoRasgoPersonal> tiporasgopersonals;	
	//public List<TipoRasgoPersonal> tiporasgopersonalsEliminados;
	//public List<TipoRasgoPersonal> tiporasgopersonalsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
	public Boolean isVisibilidadCeldaDuplicarTipoRasgoPersonal=true;
	public Boolean isVisibilidadCeldaCopiarTipoRasgoPersonal=true;
	public Boolean isVisibilidadCeldaVerFormTipoRasgoPersonal=true;
	public Boolean isVisibilidadCeldaOrdenTipoRasgoPersonal=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
	public Boolean isVisibilidadCeldaModificarTipoRasgoPersonal=false;
	public Boolean isVisibilidadCeldaActualizarTipoRasgoPersonal=false;
	public Boolean isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
	public Boolean isVisibilidadCeldaCancelarTipoRasgoPersonal=false;
	public Boolean isVisibilidadCeldaGuardarTipoRasgoPersonal=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoRasgoPersonal() {
		return this.iIdNuevoTipoRasgoPersonal;
	}

	public void setiIdNuevoTipoRasgoPersonal(Long iIdNuevoTipoRasgoPersonal) {
		this.iIdNuevoTipoRasgoPersonal = iIdNuevoTipoRasgoPersonal;
	}
	
	public Long getidTipoRasgoPersonalActual() {
		return this.idTipoRasgoPersonalActual;
	}

	public void setidTipoRasgoPersonalActual(Long idTipoRasgoPersonalActual) {
		this.idTipoRasgoPersonalActual = idTipoRasgoPersonalActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoRasgoPersonal gettiporasgopersonal() {
		return this.tiporasgopersonal;
	}

	public void settiporasgopersonal(TipoRasgoPersonal tiporasgopersonal) {
		this.tiporasgopersonal = tiporasgopersonal;
	}
	
	public TipoRasgoPersonal gettiporasgopersonalAux() {
		return this.tiporasgopersonalAux;
	}

	public void settiporasgopersonalAux(TipoRasgoPersonal tiporasgopersonalAux) {
		this.tiporasgopersonalAux = tiporasgopersonalAux;
	}				
	
	public TipoRasgoPersonal gettiporasgopersonalAnterior() {
		return this.tiporasgopersonalAnterior;
	}

	public void settiporasgopersonalAnterior(TipoRasgoPersonal tiporasgopersonalAnterior) {
		this.tiporasgopersonalAnterior = tiporasgopersonalAnterior;
	}	
	
	public TipoRasgoPersonal gettiporasgopersonalTotales() {
		return this.tiporasgopersonalTotales;
	}

	public void settiporasgopersonalTotales(TipoRasgoPersonal tiporasgopersonalTotales) {
		this.tiporasgopersonalTotales = tiporasgopersonalTotales;
	}	
	
	public TipoRasgoPersonal gettiporasgopersonalBean() {
		return this.tiporasgopersonalBean;
	}

	public void settiporasgopersonalBean(TipoRasgoPersonal tiporasgopersonalBean) {
		this.tiporasgopersonalBean = tiporasgopersonalBean;
	}	
	
	public TipoRasgoPersonalParameterReturnGeneral gettiporasgopersonalReturnGeneral() {
		return this.tiporasgopersonalReturnGeneral;
	}

	public void settiporasgopersonalReturnGeneral(TipoRasgoPersonalParameterReturnGeneral tiporasgopersonalReturnGeneral) {
		this.tiporasgopersonalReturnGeneral = tiporasgopersonalReturnGeneral;
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
	
	
	public TipoRasgoPersonalLogic getTipoRasgoPersonalLogic()	{		
		return tiporasgopersonalLogic;
	}

	public void setTipoRasgoPersonalLogic(TipoRasgoPersonalLogic tiporasgopersonalLogic) {
		this.tiporasgopersonalLogic = tiporasgopersonalLogic;
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
	
	public Boolean getIsEsNuevoTipoRasgoPersonal() {
		return isEsNuevoTipoRasgoPersonal;
	}

	public void setIsEsNuevoTipoRasgoPersonal(Boolean isEsNuevoTipoRasgoPersonal) {
		this.isEsNuevoTipoRasgoPersonal = isEsNuevoTipoRasgoPersonal;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoRasgoPersonal() {
		return esParaAccionDesdeFormularioTipoRasgoPersonal;
	}
	
	public void setEsParaAccionDesdeFormularioTipoRasgoPersonal(Boolean esParaAccionDesdeFormularioTipoRasgoPersonal) {
		this.esParaAccionDesdeFormularioTipoRasgoPersonal = esParaAccionDesdeFormularioTipoRasgoPersonal;
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

			if(this.tiporasgopersonalSessionBean==null) {
				this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
			}

			if(!this.tiporasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tiporasgopersonalSessionBean.getlidEmpresaActual());
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

					if(this.tiporasgopersonal!=null) {
						this.tiporasgopersonal.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
						this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoRasgoPersonal.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
						if(this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoRasgoPersonalGenerico)throws Exception
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
				jComboBoxid_empresaTipoRasgoPersonalGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoRasgoPersonalGenerico!=null && jComboBoxid_empresaTipoRasgoPersonalGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoRasgoPersonalGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoRasgoPersonal tiporasgopersonal,JComboBox jComboBoxid_empresaTipoRasgoPersonalGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoRasgoPersonalGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoRasgoPersonalGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tiporasgopersonal.setid_empresa(empresaAux.getId());
				tiporasgopersonal.setempresa_descripcion(TipoRasgoPersonalConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tiporasgopersonal.setEmpresa(empresaAux);			}
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

					if(!TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { 
							this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { 
					}

					if(!TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
							this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
							this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoRasgoPersonal() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoRasgoPersonalConstantesFunciones.refrescarForeignKeysDescripcionesTipoRasgoPersonal(this.tiporasgopersonalLogic.getTipoRasgoPersonals());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoRasgoPersonalConstantesFunciones.refrescarForeignKeysDescripcionesTipoRasgoPersonal(this.tiporasgopersonals);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tiporasgopersonalLogic.setTipoRasgoPersonals(this.tiporasgopersonals);
			tiporasgopersonalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoRasgoPersonalParameterReturnGeneral getTipoRasgoPersonalParameterGeneral() {
		return this.tiporasgopersonalParameterGeneral;
	}
	
	public void setTipoRasgoPersonalParameterGeneral(TipoRasgoPersonalParameterReturnGeneral tiporasgopersonalParameterGeneral) {
		this.tiporasgopersonalParameterGeneral = tiporasgopersonalParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoRasgoPersonal() {
		return isPermisoTodoTipoRasgoPersonal;
	}

	public void setIsPermisoTodoTipoRasgoPersonal(Boolean isPermisoTodoTipoRasgoPersonal) {
		this.isPermisoTodoTipoRasgoPersonal = isPermisoTodoTipoRasgoPersonal;
	}

	public Boolean getIsPermisoNuevoTipoRasgoPersonal() {
		return isPermisoNuevoTipoRasgoPersonal;
	}

	public void setIsPermisoNuevoTipoRasgoPersonal(Boolean isPermisoNuevoTipoRasgoPersonal) {
		this.isPermisoNuevoTipoRasgoPersonal = isPermisoNuevoTipoRasgoPersonal;
	}

	public Boolean getIsPermisoActualizarTipoRasgoPersonal() {
		return isPermisoActualizarTipoRasgoPersonal;
	}

	public void setIsPermisoActualizarTipoRasgoPersonal(Boolean isPermisoActualizarTipoRasgoPersonal) {
		this.isPermisoActualizarTipoRasgoPersonal = isPermisoActualizarTipoRasgoPersonal;
	}

	public Boolean getIsPermisoEliminarTipoRasgoPersonal() {
		return isPermisoEliminarTipoRasgoPersonal;
	}

	public void setIsPermisoEliminarTipoRasgoPersonal(Boolean isPermisoEliminarTipoRasgoPersonal) {
		this.isPermisoEliminarTipoRasgoPersonal = isPermisoEliminarTipoRasgoPersonal;
	}

	public Boolean getIsPermisoGuardarCambiosTipoRasgoPersonal() {
		return isPermisoGuardarCambiosTipoRasgoPersonal;
	}

	public void setIsPermisoGuardarCambiosTipoRasgoPersonal(Boolean isPermisoGuardarCambiosTipoRasgoPersonal) {
		this.isPermisoGuardarCambiosTipoRasgoPersonal = isPermisoGuardarCambiosTipoRasgoPersonal;
	}
	
	public Boolean getIsPermisoConsultaTipoRasgoPersonal() {
		return isPermisoConsultaTipoRasgoPersonal;
	}

	public void setIsPermisoConsultaTipoRasgoPersonal(Boolean isPermisoConsultaTipoRasgoPersonal) {
		this.isPermisoConsultaTipoRasgoPersonal = isPermisoConsultaTipoRasgoPersonal;
	}

	public Boolean getIsPermisoBusquedaTipoRasgoPersonal() {
		return isPermisoBusquedaTipoRasgoPersonal;
	}

	public void setIsPermisoBusquedaTipoRasgoPersonal(Boolean isPermisoBusquedaTipoRasgoPersonal) {
		this.isPermisoBusquedaTipoRasgoPersonal = isPermisoBusquedaTipoRasgoPersonal;
	}

	public Boolean getIsPermisoReporteTipoRasgoPersonal() {
		return isPermisoReporteTipoRasgoPersonal;
	}

	public void setIsPermisoReporteTipoRasgoPersonal(Boolean isPermisoReporteTipoRasgoPersonal) {
		this.isPermisoReporteTipoRasgoPersonal = isPermisoReporteTipoRasgoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoRasgoPersonal() {
		return isPermisoPaginacionMedioTipoRasgoPersonal;
	}

	public void setIsPermisoPaginacionMedioTipoRasgoPersonal(Boolean isPermisoPaginacionMedioTipoRasgoPersonal) {
		this.isPermisoPaginacionMedioTipoRasgoPersonal = isPermisoPaginacionMedioTipoRasgoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoRasgoPersonal() {
		return isPermisoPaginacionTodoTipoRasgoPersonal;
	}

	public void setIsPermisoPaginacionTodoTipoRasgoPersonal(Boolean isPermisoPaginacionTodoTipoRasgoPersonal) {
		this.isPermisoPaginacionTodoTipoRasgoPersonal = isPermisoPaginacionTodoTipoRasgoPersonal;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoRasgoPersonal() {
		return isPermisoPaginacionAltoTipoRasgoPersonal;
	}

	public void setIsPermisoPaginacionAltoTipoRasgoPersonal(Boolean isPermisoPaginacionAltoTipoRasgoPersonal) {
		this.isPermisoPaginacionAltoTipoRasgoPersonal = isPermisoPaginacionAltoTipoRasgoPersonal;
	}
	
	public Boolean getIsPermisoCopiarTipoRasgoPersonal() {
		return isPermisoCopiarTipoRasgoPersonal;
	}

	public void setIsPermisoCopiarTipoRasgoPersonal(Boolean isPermisoCopiarTipoRasgoPersonal) {
		this.isPermisoCopiarTipoRasgoPersonal = isPermisoCopiarTipoRasgoPersonal;
	}
	
	public Boolean getIsPermisoVerFormTipoRasgoPersonal() {
		return isPermisoVerFormTipoRasgoPersonal;
	}

	public void setIsPermisoVerFormTipoRasgoPersonal(Boolean isPermisoVerFormTipoRasgoPersonal) {
		this.isPermisoVerFormTipoRasgoPersonal = isPermisoVerFormTipoRasgoPersonal;
	}
	
	public Boolean getIsPermisoDuplicarTipoRasgoPersonal() {
		return isPermisoDuplicarTipoRasgoPersonal;
	}

	public void setIsPermisoDuplicarTipoRasgoPersonal(Boolean isPermisoDuplicarTipoRasgoPersonal) {
		this.isPermisoDuplicarTipoRasgoPersonal = isPermisoDuplicarTipoRasgoPersonal;
	}
	
	public Boolean getIsPermisoOrdenTipoRasgoPersonal() {
		return isPermisoOrdenTipoRasgoPersonal;
	}

	public void setIsPermisoOrdenTipoRasgoPersonal(Boolean isPermisoOrdenTipoRasgoPersonal) {
		this.isPermisoOrdenTipoRasgoPersonal = isPermisoOrdenTipoRasgoPersonal;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoRasgoPersonal() {
		return isVisibilidadCeldaNuevoTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaNuevoTipoRasgoPersonal(Boolean isVisibilidadCeldaNuevoTipoRasgoPersonal) {
		this.isVisibilidadCeldaNuevoTipoRasgoPersonal = isVisibilidadCeldaNuevoTipoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoRasgoPersonal() {
		return isVisibilidadCeldaDuplicarTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaDuplicarTipoRasgoPersonal(Boolean isVisibilidadCeldaDuplicarTipoRasgoPersonal) {
		this.isVisibilidadCeldaDuplicarTipoRasgoPersonal = isVisibilidadCeldaDuplicarTipoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoRasgoPersonal() {
		return isVisibilidadCeldaCopiarTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaCopiarTipoRasgoPersonal(Boolean isVisibilidadCeldaCopiarTipoRasgoPersonal) {
		this.isVisibilidadCeldaCopiarTipoRasgoPersonal = isVisibilidadCeldaCopiarTipoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoRasgoPersonal() {
		return isVisibilidadCeldaVerFormTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaVerFormTipoRasgoPersonal(Boolean isVisibilidadCeldaVerFormTipoRasgoPersonal) {
		this.isVisibilidadCeldaVerFormTipoRasgoPersonal = isVisibilidadCeldaVerFormTipoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoRasgoPersonal() {
		return isVisibilidadCeldaOrdenTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaOrdenTipoRasgoPersonal(Boolean isVisibilidadCeldaOrdenTipoRasgoPersonal) {
		this.isVisibilidadCeldaOrdenTipoRasgoPersonal = isVisibilidadCeldaOrdenTipoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal() {
		return isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal(Boolean isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal) {
		this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal = isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoRasgoPersonal() {
		return isVisibilidadCeldaModificarTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaModificarTipoRasgoPersonal(Boolean isVisibilidadCeldaModificarTipoRasgoPersonal) {
		this.isVisibilidadCeldaModificarTipoRasgoPersonal = isVisibilidadCeldaModificarTipoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoRasgoPersonal() {
		return isVisibilidadCeldaActualizarTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaActualizarTipoRasgoPersonal(Boolean isVisibilidadCeldaActualizarTipoRasgoPersonal) {
		this.isVisibilidadCeldaActualizarTipoRasgoPersonal = isVisibilidadCeldaActualizarTipoRasgoPersonal;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoRasgoPersonal() {
		return isVisibilidadCeldaEliminarTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaEliminarTipoRasgoPersonal(Boolean isVisibilidadCeldaEliminarTipoRasgoPersonal) {
		this.isVisibilidadCeldaEliminarTipoRasgoPersonal = isVisibilidadCeldaEliminarTipoRasgoPersonal;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoRasgoPersonal() {
		return isVisibilidadCeldaCancelarTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaCancelarTipoRasgoPersonal(Boolean isVisibilidadCeldaCancelarTipoRasgoPersonal) {
		this.isVisibilidadCeldaCancelarTipoRasgoPersonal = isVisibilidadCeldaCancelarTipoRasgoPersonal;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoRasgoPersonal() {
		return isVisibilidadCeldaGuardarTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaGuardarTipoRasgoPersonal(Boolean isVisibilidadCeldaGuardarTipoRasgoPersonal) {
		this.isVisibilidadCeldaGuardarTipoRasgoPersonal = isVisibilidadCeldaGuardarTipoRasgoPersonal;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoRasgoPersonal() {
		return isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoRasgoPersonal(Boolean isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal) {
		this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal = isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal;
	}
		
	public TipoRasgoPersonalSessionBean gettiporasgopersonalSessionBean() {
		return this.tiporasgopersonalSessionBean;
	}
	
	public void settiporasgopersonalSessionBean(TipoRasgoPersonalSessionBean tiporasgopersonalSessionBean) {
		this.tiporasgopersonalSessionBean=tiporasgopersonalSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tiporasgopersonal,null);
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
	
	public void bugActualizarReferenciaActual(TipoRasgoPersonal tiporasgopersonal,TipoRasgoPersonal tiporasgopersonalAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoRasgoPersonal(tiporasgopersonal);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tiporasgopersonalAux.setId(tiporasgopersonal.getId());
		tiporasgopersonalAux.setVersionRow(tiporasgopersonal.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoRasgoPersonal();
		
			int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tiporasgopersonalValidator.getInvalidValues(this.tiporasgopersonal);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tiporasgopersonalLogic.setDatosCliente(datosCliente);
			tiporasgopersonalLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tiporasgopersonalAux=new  TipoRasgoPersonal();
				
				tiporasgopersonalAux.setIsNew(true);
				tiporasgopersonalAux.setIsChanged(true);
				
				tiporasgopersonalAux.setTipoRasgoPersonalOriginal(this.tiporasgopersonal);
				
				tiporasgopersonalAux.setId(this.tiporasgopersonal.getId());	
				tiporasgopersonalAux.setVersionRow(this.tiporasgopersonal.getVersionRow());	
				tiporasgopersonalAux.setid_empresa(this.tiporasgopersonal.getid_empresa());	
				tiporasgopersonalAux.setcodigo(this.tiporasgopersonal.getcodigo());	
				tiporasgopersonalAux.setnombre(this.tiporasgopersonal.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporasgopersonalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tiporasgopersonalAux,tiporasgopersonalLogic.getTipoRasgoPersonals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporasgopersonalAux,tiporasgopersonals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporasgopersonalLogic.saveTipoRasgoPersonals();//WithConnection
						//tiporasgopersonalLogic.getSetVersionRowTipoRasgoPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporasgopersonal,tiporasgopersonalAux);
					
					this.refrescarForeignKeysDescripcionesTipoRasgoPersonal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals().addAll(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonals.addAll(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporasgopersonalLogic.saveTipoRasgoPersonalRelaciones(tiporasgopersonalAux,this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals());//WithConnection
								//tiporasgopersonalLogic.getSetVersionRowTipoRasgoPersonals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporasgopersonal,tiporasgopersonalAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.setRasgoPersonals(new ArrayList<RasgoPersonal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonals= new ArrayList<RasgoPersonal>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporasgopersonalAux.setRasgoPersonals(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporasgopersonalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporasgopersonalAux,tiporasgopersonalLogic.getTipoRasgoPersonals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporasgopersonalAux,tiporasgopersonals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporasgopersonal,tiporasgopersonalAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tiporasgopersonalAux=new  TipoRasgoPersonal();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado() 
					|| (this.tiporasgopersonalSessionBean.getEsGuardarRelacionado() && this.tiporasgopersonal.getId()>=0)) {
						
					tiporasgopersonalAux.setIsNew(false);
				}
				
				tiporasgopersonalAux.setIsDeleted(false);
			
				tiporasgopersonalAux.setId(this.tiporasgopersonal.getId());	
				tiporasgopersonalAux.setVersionRow(this.tiporasgopersonal.getVersionRow());	
				tiporasgopersonalAux.setid_empresa(this.tiporasgopersonal.getid_empresa());	
				tiporasgopersonalAux.setcodigo(this.tiporasgopersonal.getcodigo());	
				tiporasgopersonalAux.setnombre(this.tiporasgopersonal.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporasgopersonalAux,tiporasgopersonalLogic.getTipoRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporasgopersonalAux,tiporasgopersonals);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporasgopersonalLogic.saveTipoRasgoPersonals();//WithConnection
						//tiporasgopersonalLogic.getSetVersionRowTipoRasgoPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tiporasgopersonal,tiporasgopersonalAux);
					
					this.refrescarForeignKeysDescripcionesTipoRasgoPersonal();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals().addAll(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonals.addAll(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporasgopersonalLogic.saveTipoRasgoPersonalRelaciones(tiporasgopersonalAux,this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals());//WithConnection
								//tiporasgopersonalLogic.getSetVersionRowTipoRasgoPersonals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tiporasgopersonal,tiporasgopersonalAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.setRasgoPersonals(new ArrayList<RasgoPersonal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonals= new ArrayList<RasgoPersonal>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporasgopersonalAux.setRasgoPersonals(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tiporasgopersonalSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tiporasgopersonalAux,tiporasgopersonalLogic.getTipoRasgoPersonals());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tiporasgopersonalAux,tiporasgopersonals);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tiporasgopersonal,tiporasgopersonalAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tiporasgopersonalAux=new  TipoRasgoPersonal();
				
				tiporasgopersonalAux.setIsNew(false);
				tiporasgopersonalAux.setIsChanged(false);
				
				tiporasgopersonalAux.setIsDeleted(true);
				
				tiporasgopersonalAux.setId(this.tiporasgopersonal.getId());	
				tiporasgopersonalAux.setVersionRow(this.tiporasgopersonal.getVersionRow());	
				tiporasgopersonalAux.setid_empresa(this.tiporasgopersonal.getid_empresa());	
				tiporasgopersonalAux.setcodigo(this.tiporasgopersonal.getcodigo());	
				tiporasgopersonalAux.setnombre(this.tiporasgopersonal.getnombre());	
				
				if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tiporasgopersonalAux.getId()>=0) {	
						this.tiporasgopersonalsEliminados.add(tiporasgopersonalAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tiporasgopersonalAux,tiporasgopersonalLogic.getTipoRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporasgopersonalAux,tiporasgopersonals);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporasgopersonalLogic.saveTipoRasgoPersonals();//WithConnection
						//tiporasgopersonalLogic.getSetVersionRowTipoRasgoPersonals();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals().addAll(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonals.addAll(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tiporasgopersonalLogic.saveTipoRasgoPersonalRelaciones(tiporasgopersonalAux,this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals());//WithConnection
								//tiporasgopersonalLogic.getSetVersionRowTipoRasgoPersonals();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.setRasgoPersonals(new ArrayList<RasgoPersonal>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonals= new ArrayList<RasgoPersonal>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.quitarFilaTotales();}
							tiporasgopersonalAux.setRasgoPersonals(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tiporasgopersonalSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tiporasgopersonalAux,tiporasgopersonalLogic.getTipoRasgoPersonals());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tiporasgopersonalAux,tiporasgopersonals);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.getTipoRasgoPersonals().addAll(this.tiporasgopersonalsEliminados);
					
					tiporasgopersonalLogic.saveTipoRasgoPersonals();//WithConnection
					//tiporasgopersonalLogic.getSetVersionRowTipoRasgoPersonals();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoRasgoPersonal();
				
				this.tiporasgopersonalsEliminados= new ArrayList<TipoRasgoPersonal>();		
			}
			
			if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Rasgo Personal GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tiporasgopersonal=tiporasgopersonalAux;
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
      		//this.finishProcessTipoRasgoPersonal();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoRasgoPersonal tiporasgopersonalLocal) throws Exception {
		
		if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tiporasgopersonalLocal.setRasgoPersonals(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals());
			
			} else {
			
				tiporasgopersonalLocal.setRasgoPersonals(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonals);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoRasgoPersonal tiporasgopersonalLocal) throws Exception {	
		if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tiporasgopersonalLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoRasgoPersonalActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tiporasgopersonalValidator.getInvalidValues(this.tiporasgopersonal);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoRasgoPersonal tiporasgopersonal,List<TipoRasgoPersonal> tiporasgopersonals) throws Exception {
		try	{		
			TipoRasgoPersonalConstantesFunciones.actualizarLista(tiporasgopersonal,tiporasgopersonals,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoRasgoPersonal tiporasgopersonal,List<TipoRasgoPersonal> tiporasgopersonals) throws Exception {
		try	{			
			TipoRasgoPersonalConstantesFunciones.actualizarSelectedLista(tiporasgopersonal,tiporasgopersonals);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoRasgoPersonal> tiporasgopersonalsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tiporasgopersonalsLocal=this.tiporasgopersonalLogic.getTipoRasgoPersonals();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tiporasgopersonalsLocal=this.tiporasgopersonals;
			}
			//ARCHITECTURE
		
			for(TipoRasgoPersonal tiporasgopersonalLocal:tiporasgopersonalsLocal) {
				if(this.permiteMantenimiento(tiporasgopersonalLocal) && tiporasgopersonalLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoRasgoPersonalConstantesFunciones.getTipoRasgoPersonalLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoRasgoPersonalConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelid_empresaTipoRasgoPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRasgoPersonalConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelcodigoTipoRasgoPersonal,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoRasgoPersonalConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelnombreTipoRasgoPersonal,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelid_empresaTipoRasgoPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelcodigoTipoRasgoPersonal,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelnombreTipoRasgoPersonal,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("RasgoPersonal")) {
			if(this.tiporasgopersonal==null) {
				this.tiporasgopersonal= new TipoRasgoPersonal();
			}

			if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoRasgoPersonal
				this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);

				this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.getrasgopersonal().setTipoRasgoPersonal(this.tiporasgopersonal);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoRasgoPersonal--;	
		
		
		this.tiporasgopersonalAux=new TipoRasgoPersonal();
		
		this.tiporasgopersonalAux.setId(this.iIdNuevoTipoRasgoPersonal);
		this.tiporasgopersonalAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tiporasgopersonalLogic.getTipoRasgoPersonals().add(this.tiporasgopersonalAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tiporasgopersonals.add(this.tiporasgopersonalAux);
		}
		//ARCHITECTURE
		
		this.tiporasgopersonal=this.tiporasgopersonalAux;
		
		if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoRasgoPersonal(this.tiporasgopersonal);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRasgoPersonal(this.tiporasgopersonal);
		}
				
		//this.setDefaultControlesTipoRasgoPersonal();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoRasgoPersonal();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoRasgoPersonal();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRasgoPersonal();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRasgoPersonal(this.tiporasgopersonalBean,this.tiporasgopersonal,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
			classes=TipoRasgoPersonalConstantesFunciones.getClassesRelationshipsOfTipoRasgoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tiporasgopersonalReturnGeneral=tiporasgopersonalLogic.procesarEventosTipoRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporasgopersonalLogic.getTipoRasgoPersonals(),this.tiporasgopersonal,this.tiporasgopersonalParameterGeneral,this.isEsNuevoTipoRasgoPersonal,classes);//this.tiporasgopersonalLogic.getTipoRasgoPersonal()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral,this.tiporasgopersonalBean,false);
		
		if(this.tiporasgopersonalReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal());
		}
		
		if(this.tiporasgopersonalReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal(),classes);//this.tiporasgopersonalBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoRasgoPersonal();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoRasgoPersonal();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.RecargarFormTipoRasgoPersonal(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoRasgoPersonal(false);
						
			if(tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.getEsGuardarRelacionado() && RasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRasgoPersonalActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRasgoPersonal();
			}
			
			this.actualizarVisualTableDatosTipoRasgoPersonal();
			
			this.jTableDatosTipoRasgoPersonal.setRowSelectionInterval(this.getIndiceNuevoTipoRasgoPersonal(), this.getIndiceNuevoTipoRasgoPersonal());
			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
						
			this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoRasgoPersonal(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextFieldcodigoTipoRasgoPersonal.setEnabled(isHabilitar && this.tiporasgopersonalConstantesFunciones.activarcodigoTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextAreanombreTipoRasgoPersonal.setEnabled(isHabilitar && this.tiporasgopersonalConstantesFunciones.activarnombreTipoRasgoPersonal);	
		//
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setEnabled(isHabilitar && this.tiporasgopersonalConstantesFunciones.activarid_empresaTipoRasgoPersonal);
	};
	
	public void setDefaultControlesTipoRasgoPersonal() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoRasgoPersonal(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tiporasgopersonalSessionBean.setConGuardarRelaciones(true);			
			this.tiporasgopersonalSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tiporasgopersonalSessionBean.setConGuardarRelaciones(false);			
			this.tiporasgopersonalSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoRasgoPersonal() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
				if(tiporasgopersonalAux.getId().equals(this.iIdNuevoTipoRasgoPersonal)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonals) {
				if(tiporasgopersonalAux.getId().equals(this.iIdNuevoTipoRasgoPersonal)) {
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
	
	public int getIndiceActualTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
				if(tiporasgopersonalAux.getId().equals(tiporasgopersonal.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonals) {
				if(tiporasgopersonalAux.getId().equals(tiporasgopersonal.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonalOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
				if(tiporasgopersonalAux.getTipoRasgoPersonalOriginal().getId().equals(tiporasgopersonalOriginal.getId())) {
					existe=true;
					tiporasgopersonalOriginal.setId(tiporasgopersonalAux.getId());
					tiporasgopersonalOriginal.setVersionRow(tiporasgopersonalAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonals) {
				if(tiporasgopersonalAux.getTipoRasgoPersonalOriginal().getId().equals(tiporasgopersonalOriginal.getId())) {
					existe=true;
					tiporasgopersonalOriginal.setId(tiporasgopersonalAux.getId());
					tiporasgopersonalOriginal.setVersionRow(tiporasgopersonalAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoRasgoPersonal(Boolean esParaCancelar) throws Exception {
		tiporasgopersonalsAux=new ArrayList<TipoRasgoPersonal>();
		tiporasgopersonalAux=new TipoRasgoPersonal();
		
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
					if(tiporasgopersonalAux.getId()<0) {
						tiporasgopersonalsAux.add(tiporasgopersonalAux);
					}		
				}
				this.iIdNuevoTipoRasgoPersonal=0L;
				this.tiporasgopersonalLogic.getTipoRasgoPersonals().removeAll(tiporasgopersonalsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonals) {
					if(tiporasgopersonalAux.getId()<0) {
						tiporasgopersonalsAux.add(tiporasgopersonalAux);
					}		
				}
				this.iIdNuevoTipoRasgoPersonal=0L;
				this.tiporasgopersonals.removeAll(tiporasgopersonalsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoRasgoPersonal 
					&& this.tiporasgopersonalLogic.getTipoRasgoPersonals().size()>0
					) {
					tiporasgopersonalAux=this.tiporasgopersonalLogic.getTipoRasgoPersonals().get(this.tiporasgopersonalLogic.getTipoRasgoPersonals().size() - 1);
				
					if(tiporasgopersonalAux.getId()<0) {
						this.tiporasgopersonalLogic.getTipoRasgoPersonals().remove(tiporasgopersonalAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoRasgoPersonal && this.tiporasgopersonals.size()>0) {
					tiporasgopersonalAux=this.tiporasgopersonals.get(this.tiporasgopersonals.size() - 1);
				
					if(tiporasgopersonalAux.getId()<0) {
						this.tiporasgopersonals.remove(tiporasgopersonalAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoRasgoPersonal(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tiporasgopersonal.getId()<0) {
				this.tiporasgopersonalLogic.getTipoRasgoPersonals().remove(this.tiporasgopersonal);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tiporasgopersonal.getId()<0) {
				this.tiporasgopersonals.remove(this.tiporasgopersonal);
			}
		}			
	}
	
	public void setEstadosInicialesTipoRasgoPersonal(List<TipoRasgoPersonal> tiporasgopersonalsAux) throws Exception {
		TipoRasgoPersonalConstantesFunciones.setEstadosInicialesTipoRasgoPersonal(tiporasgopersonalsAux);
	}
	
	public void setEstadosInicialesTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonalAux) throws Exception {
		TipoRasgoPersonalConstantesFunciones.setEstadosInicialesTipoRasgoPersonal(tiporasgopersonalAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoRasgoPersonalActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoRasgoPersonalActual()) {
				if(!this.isEsNuevoTipoRasgoPersonal) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoRasgoPersonal=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoRasgoPersonalActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Rasgo Personal ?", "MANTENIMIENTO DE Tipo Rasgo Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoRasgoPersonal tiporasgopersonal) throws Exception {
		TipoRasgoPersonalConstantesFunciones.seleccionarAsignar(this.tiporasgopersonal,tiporasgopersonal);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoRasgoPersonal=this.isPermisoActualizarOriginalTipoRasgoPersonal;
			
			
			this.seleccionarAsignar(tiporasgopersonal);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoRasgoPersonalConstantesFunciones.quitarEspaciosTipoRasgoPersonal(this.tiporasgopersonal,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tiporasgopersonalSessionBean.setsFuncionBusquedaRapida(this.tiporasgopersonalSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoRasgoPersonal) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoRasgoPersonal(esParaCancelar);				
				this.cancelarNuevoTipoRasgoPersonal(esParaCancelar);								
			}
			
			this.tiporasgopersonal=new TipoRasgoPersonal();
			
			this.inicializarTipoRasgoPersonal();
			
			this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoRasgoPersonal() throws Exception {
		try {
			TipoRasgoPersonalConstantesFunciones.inicializarTipoRasgoPersonal(this.tiporasgopersonal);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tiporasgopersonalLogic.getTipoRasgoPersonals().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoRasgoPersonals(String sAccionBusqueda,List<TipoRasgoPersonal> tiporasgopersonalsParaReportes) throws Exception {
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
					sPathReporteFinal="TipoRasgoPersonal"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoRasgoPersonalMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoRasgoPersonalMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoRasgoPersonal"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Rasgo Personales");		
		parameters.put("busquedapor", TipoRasgoPersonalConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(RasgoPersonal.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoRasgoPersonalLogic tiporasgopersonalLogicAuxiliar=new TipoRasgoPersonalLogic();
					tiporasgopersonalLogicAuxiliar.setDatosCliente(tiporasgopersonalLogic.getDatosCliente());				
					tiporasgopersonalLogicAuxiliar.setTipoRasgoPersonals(tiporasgopersonalsParaReportes);
					
					tiporasgopersonalLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoRasgoPersonalWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tiporasgopersonalsParaReportes=tiporasgopersonalLogicAuxiliar.getTipoRasgoPersonals();
					
					//tiporasgopersonalLogic.getNewConnexionToDeep();
					
					//for (TipoRasgoPersonal tiporasgopersonal:tiporasgopersonalsParaReportes) {
					//	tiporasgopersonalLogic.deepLoad(tiporasgopersonal, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tiporasgopersonalLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tiporasgopersonalLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileRasgoPersonal = AuxiliarReportes.class.getResourceAsStream("RasgoPersonalDetalleRelacionesDesign.jasper");
			parameters.put("subreport_rasgopersonal", reportFileRasgoPersonal);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoRasgoPersonal=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoRasgoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoRasgoPersonalConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoRasgoPersonal=new JRBeanArrayDataSource(TipoRasgoPersonalJInternalFrame.TraerTipoRasgoPersonalBeans(tiporasgopersonalsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoRasgoPersonal);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoRasgoPersonalConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoRasgoPersonalConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoRasgoPersonalBean.TraerTipoRasgoPersonalBeans(tiporasgopersonalsParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,tiporasgopersonalsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,tiporasgopersonalsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoRasgoPersonalActionPerformed(null);
					//this.generarExcelReporteTipoRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,tiporasgopersonalsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,tiporasgopersonalsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,tiporasgopersonalsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoRasgoPersonals(sAccionBusqueda,sTipoArchivoReporte,tiporasgopersonalsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoRasgoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRasgoPersonal> tiporasgopersonalsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporasgopersonal";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRasgoPersonals");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRasgoPersonal("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoRasgoPersonal tiporasgopersonal : tiporasgopersonalsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoRasgoPersonalConstantesFunciones.generarExcelReporteDataTipoRasgoPersonal("NORMAL",row,workbook,tiporasgopersonal,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoRasgoPersonal(String sTipo,Row row,Workbook workbook) {
		
		TipoRasgoPersonalConstantesFunciones.generarExcelReporteHeaderTipoRasgoPersonal(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoRasgoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRasgoPersonal> tiporasgopersonalsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporasgopersonal_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRasgoPersonals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoRasgoPersonal tiporasgopersonal : tiporasgopersonalsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoRasgoPersonalConstantesFunciones.getTipoRasgoPersonalDescripcion(tiporasgopersonal));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporasgopersonal.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporasgopersonal.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tiporasgopersonal.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoRasgoPersonals(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoRasgoPersonal> tiporasgopersonalsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoRasgoPersonal> tiporasgopersonalsRespaldo=null;
		
		classes=TipoRasgoPersonalConstantesFunciones.getClassesRelationshipsOfTipoRasgoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tiporasgopersonalLogic.setDatosCliente(this.datosCliente);
		this.tiporasgopersonalLogic.setDatosDeep(this.datosDeep);
		this.tiporasgopersonalLogic.setIsConDeep(true);
		
		tiporasgopersonalsRespaldo=this.tiporasgopersonalLogic.getTipoRasgoPersonals();
		
		this.tiporasgopersonalLogic.setTipoRasgoPersonals(tiporasgopersonalsParaReportes);	
		this.tiporasgopersonalLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tiporasgopersonalsParaReportes=this.tiporasgopersonalLogic.getTipoRasgoPersonals();
		this.tiporasgopersonalLogic.setTipoRasgoPersonals(tiporasgopersonalsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporasgopersonal_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoRasgoPersonals");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoRasgoPersonal("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoRasgoPersonal tiporasgopersonal : tiporasgopersonalsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoRasgoPersonal("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoRasgoPersonalConstantesFunciones.generarExcelReporteDataTipoRasgoPersonal("NORMAL",row,workbook,tiporasgopersonal,cellStyleDataAux);
		
			
			


				//RasgoPersonal
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(RasgoPersonalConstantesFunciones.SCLASSWEBTITULO))) {

				if(tiporasgopersonal.getRasgoPersonals()!=null && tiporasgopersonal.getRasgoPersonals().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					RasgoPersonalConstantesFunciones.generarExcelReporteHeaderRasgoPersonal("RELACIONADO",row,workbook);
				}

				if(tiporasgopersonal.getRasgoPersonals()!=null) {
					i2=0;
					for(RasgoPersonal rasgopersonal : tiporasgopersonal.getRasgoPersonals()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						RasgoPersonalConstantesFunciones.generarExcelReporteDataRasgoPersonal("RELACIONADO",row,workbook,rasgopersonal,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoRasgoPersonalConstantesFunciones.getTipoRasgoPersonalDescripcion(tiporasgopersonal));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoRasgoPersonal() throws Exception {		
		this.startProcessTipoRasgoPersonal(true);
	}
	
	public void startProcessTipoRasgoPersonal(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoRasgoPersonal ,this.jPanelParametrosReportesTipoRasgoPersonal, this.jScrollPanelDatosTipoRasgoPersonal,this.jPanelPaginacionTipoRasgoPersonal, this.jScrollPanelDatosEdicionTipoRasgoPersonal, this.jPanelAccionesTipoRasgoPersonal,this.jPanelAccionesFormularioTipoRasgoPersonal,this.jmenuBarTipoRasgoPersonal,this.jmenuBarDetalleTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,this.jTtoolBarDetalleTipoRasgoPersonal);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRasgoPersonal=this.jTabbedPaneBusquedasTipoRasgoPersonal; 
		
		final JPanel jPanelParametrosReportesTipoRasgoPersonal=this.jPanelParametrosReportesTipoRasgoPersonal;
		//final JScrollPane jScrollPanelDatosTipoRasgoPersonal=this.jScrollPanelDatosTipoRasgoPersonal;
		final JTable jTableDatosTipoRasgoPersonal=this.jTableDatosTipoRasgoPersonal;		
		final JPanel jPanelPaginacionTipoRasgoPersonal=this.jPanelPaginacionTipoRasgoPersonal;
		//final JScrollPane jScrollPanelDatosEdicionTipoRasgoPersonal=this.jScrollPanelDatosEdicionTipoRasgoPersonal;
		final JPanel jPanelAccionesTipoRasgoPersonal=this.jPanelAccionesTipoRasgoPersonal;
		
		JPanel jPanelCamposAuxiliarTipoRasgoPersonal=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoRasgoPersonal=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			jPanelCamposAuxiliarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jPanelCamposTipoRasgoPersonal;
			jPanelAccionesFormularioAuxiliarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jPanelAccionesFormularioTipoRasgoPersonal;
		}
		
		final JPanel jPanelCamposTipoRasgoPersonal=jPanelCamposAuxiliarTipoRasgoPersonal;
		final JPanel jPanelAccionesFormularioTipoRasgoPersonal=jPanelAccionesFormularioAuxiliarTipoRasgoPersonal;
		
		
		final JMenuBar jmenuBarTipoRasgoPersonal=this.jmenuBarTipoRasgoPersonal;
		final JToolBar jTtoolBarTipoRasgoPersonal=this.jTtoolBarTipoRasgoPersonal;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoRasgoPersonal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRasgoPersonal=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			jmenuBarDetalleAuxiliarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jmenuBarDetalleTipoRasgoPersonal;
			jTtoolBarDetalleAuxiliarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jTtoolBarDetalleTipoRasgoPersonal;
		}
		
		final JMenuBar jmenuBarDetalleTipoRasgoPersonal=jmenuBarDetalleAuxiliarTipoRasgoPersonal;
		final JToolBar jTtoolBarDetalleTipoRasgoPersonal=jTtoolBarDetalleAuxiliarTipoRasgoPersonal;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRasgoPersonal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRasgoPersonal;
			processRunnable.jTableDatos=jTableDatosTipoRasgoPersonal;
			processRunnable.jPanelCampos=jPanelCamposTipoRasgoPersonal;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRasgoPersonal;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRasgoPersonal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRasgoPersonal;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRasgoPersonal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRasgoPersonal;
			processRunnable.jTtoolBar=jTtoolBarTipoRasgoPersonal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRasgoPersonal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRasgoPersonal ,jPanelParametrosReportesTipoRasgoPersonal,jTableDatosTipoRasgoPersonal, /*jScrollPanelDatosTipoRasgoPersonal,*/jPanelCamposTipoRasgoPersonal,jPanelPaginacionTipoRasgoPersonal, /*jScrollPanelDatosEdicionTipoRasgoPersonal,*/ jPanelAccionesTipoRasgoPersonal,jPanelAccionesFormularioTipoRasgoPersonal,jmenuBarTipoRasgoPersonal,jmenuBarDetalleTipoRasgoPersonal,jTtoolBarTipoRasgoPersonal,jTtoolBarDetalleTipoRasgoPersonal);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoRasgoPersonal ,jPanelParametrosReportesTipoRasgoPersonal, jScrollPanelDatosTipoRasgoPersonal,jPanelPaginacionTipoRasgoPersonal, jScrollPanelDatosEdicionTipoRasgoPersonal, jPanelAccionesTipoRasgoPersonal,jPanelAccionesFormularioTipoRasgoPersonal,jmenuBarTipoRasgoPersonal,jmenuBarDetalleTipoRasgoPersonal,jTtoolBarTipoRasgoPersonal,jTtoolBarDetalleTipoRasgoPersonal);
						
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
	
	public void finishProcessTipoRasgoPersonal() {// throws Exception 
		this.finishProcessTipoRasgoPersonal(true);
	}
	
	public void finishProcessTipoRasgoPersonal(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoRasgoPersonal ,this.jPanelParametrosReportesTipoRasgoPersonal, this.jScrollPanelDatosTipoRasgoPersonal,this.jPanelPaginacionTipoRasgoPersonal, this.jScrollPanelDatosEdicionTipoRasgoPersonal, this.jPanelAccionesTipoRasgoPersonal,this.jPanelAccionesFormularioTipoRasgoPersonal,this.jmenuBarTipoRasgoPersonal,this.jmenuBarDetalleTipoRasgoPersonal,this.jTtoolBarTipoRasgoPersonal,this.jTtoolBarDetalleTipoRasgoPersonal);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoRasgoPersonal=this.jTabbedPaneBusquedasTipoRasgoPersonal; 
		
		final JPanel jPanelParametrosReportesTipoRasgoPersonal=this.jPanelParametrosReportesTipoRasgoPersonal;
		//final JScrollPane jScrollPanelDatosTipoRasgoPersonal=this.jScrollPanelDatosTipoRasgoPersonal;
		final JTable jTableDatosTipoRasgoPersonal=this.jTableDatosTipoRasgoPersonal;		
		final JPanel jPanelPaginacionTipoRasgoPersonal=this.jPanelPaginacionTipoRasgoPersonal;
		//final JScrollPane jScrollPanelDatosEdicionTipoRasgoPersonal=this.jScrollPanelDatosEdicionTipoRasgoPersonal;
		final JPanel jPanelAccionesTipoRasgoPersonal=this.jPanelAccionesTipoRasgoPersonal;
		
		JPanel jPanelCamposAuxiliarTipoRasgoPersonal=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoRasgoPersonal=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			jPanelCamposAuxiliarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jPanelCamposTipoRasgoPersonal;
			jPanelAccionesFormularioAuxiliarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jPanelAccionesFormularioTipoRasgoPersonal;
		}
		
		final JPanel jPanelCamposTipoRasgoPersonal=jPanelCamposAuxiliarTipoRasgoPersonal;
		final JPanel jPanelAccionesFormularioTipoRasgoPersonal=jPanelAccionesFormularioAuxiliarTipoRasgoPersonal;
		
		
		final JMenuBar jmenuBarTipoRasgoPersonal=this.jmenuBarTipoRasgoPersonal;		
		final JToolBar jTtoolBarTipoRasgoPersonal=this.jTtoolBarTipoRasgoPersonal;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoRasgoPersonal=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoRasgoPersonal=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			jmenuBarDetalleAuxiliarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jmenuBarDetalleTipoRasgoPersonal;
			jTtoolBarDetalleAuxiliarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jTtoolBarDetalleTipoRasgoPersonal;		
		}
		
		final JMenuBar jmenuBarDetalleTipoRasgoPersonal=jmenuBarDetalleAuxiliarTipoRasgoPersonal;
		final JToolBar jTtoolBarDetalleTipoRasgoPersonal=jTtoolBarDetalleAuxiliarTipoRasgoPersonal;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoRasgoPersonal;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoRasgoPersonal;
			processRunnable.jTableDatos=jTableDatosTipoRasgoPersonal;
			processRunnable.jPanelCampos=jPanelCamposTipoRasgoPersonal;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoRasgoPersonal;
			processRunnable.jPanelAcciones=jPanelAccionesTipoRasgoPersonal;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoRasgoPersonal;
			
			
			processRunnable.jmenuBar=jmenuBarTipoRasgoPersonal;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoRasgoPersonal;
			processRunnable.jTtoolBar=jTtoolBarTipoRasgoPersonal;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoRasgoPersonal;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoRasgoPersonal ,jPanelParametrosReportesTipoRasgoPersonal, jTableDatosTipoRasgoPersonal,/*jScrollPanelDatosTipoRasgoPersonal,*/jPanelCamposTipoRasgoPersonal,jPanelPaginacionTipoRasgoPersonal, /*jScrollPanelDatosEdicionTipoRasgoPersonal,*/ jPanelAccionesTipoRasgoPersonal,jPanelAccionesFormularioTipoRasgoPersonal,jmenuBarTipoRasgoPersonal,jmenuBarDetalleTipoRasgoPersonal,jTtoolBarTipoRasgoPersonal,jTtoolBarDetalleTipoRasgoPersonal));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoRasgoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoRasgoPersonal(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoRasgoPersonal(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoRasgoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoRasgoPersonal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoRasgoPersonal,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoRasgoPersonal(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoRasgoPersonal,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoRasgoPersonal,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tiporasgopersonalConstantesFunciones.getsFinalQueryTipoRasgoPersonal();
		String  finalQueryPaginacionTodos=this.tiporasgopersonalConstantesFunciones.getsFinalQueryTipoRasgoPersonal();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoRasgoPersonalConstantesFunciones.getArrayColumnasGlobalesNoTipoRasgoPersonal(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoRasgoPersonalConstantesFunciones.getArrayColumnasGlobalesTipoRasgoPersonal(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoRasgoPersonalConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tiporasgopersonalsEliminados= new ArrayList<TipoRasgoPersonal>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoRasgoPersonal();
		
				///*TipoRasgoPersonalSessionBean*/this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
			
			if(this.tiporasgopersonalSessionBean==null) {
				this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
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
					this.iNumeroPaginacion=TipoRasgoPersonalConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoRasgoPersonalConstantesFunciones.getClassesForeignKeysOfTipoRasgoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tiporasgopersonal."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tiporasgopersonalsAux= new ArrayList<TipoRasgoPersonal>();
			
				
			tiporasgopersonalLogic.setDatosCliente(this.datosCliente);
			tiporasgopersonalLogic.setDatosDeep(this.datosDeep);
			tiporasgopersonalLogic.setIsConDeep(true);
			
			
			tiporasgopersonalLogic.getTipoRasgoPersonalDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tiporasgopersonalLogic.getTodosTipoRasgoPersonals(finalQueryGlobal,pagination);
					
					//tiporasgopersonalLogic.getTodosTipoRasgoPersonalsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tiporasgopersonalLogic.getTipoRasgoPersonals()==null|| tiporasgopersonalLogic.getTipoRasgoPersonals().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporasgopersonalsAux= new ArrayList<TipoRasgoPersonal>();
							tiporasgopersonalsAux.addAll(tiporasgopersonalLogic.getTipoRasgoPersonals());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporasgopersonalsAux= new ArrayList<TipoRasgoPersonal>();
							tiporasgopersonalsAux.addAll(tiporasgopersonals);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporasgopersonalLogic.getTodosTipoRasgoPersonals(finalQueryGlobal+"",this.pagination);												
							
							//tiporasgopersonalLogic.getTodosTipoRasgoPersonalsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoRasgoPersonals("Todos",tiporasgopersonalLogic.getTipoRasgoPersonals() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tiporasgopersonalLogic.setTipoRasgoPersonals(new ArrayList<TipoRasgoPersonal>());					
							tiporasgopersonalLogic.getTipoRasgoPersonals().addAll(tiporasgopersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporasgopersonals=new ArrayList<TipoRasgoPersonal>();
							tiporasgopersonals.addAll(tiporasgopersonalsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoRasgoPersonal=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoRasgoPersonal=this.idActual;
				
				} else if(this.idTipoRasgoPersonalActual!=null && this.idTipoRasgoPersonalActual!=0L) {
					idTipoRasgoPersonal=idTipoRasgoPersonalActual;
				}
				
					
				this.sDetalleReporte=TipoRasgoPersonalConstantesFunciones.getDetalleIndicePorId(idTipoRasgoPersonal);
				
				this.tiporasgopersonals=new ArrayList<TipoRasgoPersonal>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tiporasgopersonalLogic.getEntity(idTipoRasgoPersonal);
					
					//tiporasgopersonalLogic.getEntityWithConnection(idTipoRasgoPersonal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporasgopersonalLogic.setTipoRasgoPersonals(new ArrayList<TipoRasgoPersonal>());
					tiporasgopersonalLogic.getTipoRasgoPersonals().add(tiporasgopersonalLogic.getTipoRasgoPersonal());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporasgopersonals=new ArrayList<TipoRasgoPersonal>();
					this.tiporasgopersonals.add(tiporasgopersonal);
				}
				
				if(tiporasgopersonalLogic.getTipoRasgoPersonal()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoRasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tiporasgopersonalLogic.getTipoRasgoPersonalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tiporasgopersonalLogic.getTipoRasgoPersonals()==null||tiporasgopersonalLogic.getTipoRasgoPersonals().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tiporasgopersonals==null|| tiporasgopersonals.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporasgopersonalsAux=new ArrayList<TipoRasgoPersonal>();
						tiporasgopersonalsAux.addAll(tiporasgopersonalLogic.getTipoRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporasgopersonalsAux=new ArrayList<TipoRasgoPersonal>();
							tiporasgopersonalsAux.addAll(tiporasgopersonals);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tiporasgopersonalLogic.getTipoRasgoPersonalsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoRasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoRasgoPersonalConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoRasgoPersonals("FK_IdEmpresa",tiporasgopersonalLogic.getTipoRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoRasgoPersonals("FK_IdEmpresa",tiporasgopersonals);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporasgopersonalLogic.setTipoRasgoPersonals(new ArrayList<TipoRasgoPersonal>());
						tiporasgopersonalLogic.getTipoRasgoPersonals().addAll(tiporasgopersonalsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporasgopersonals=new ArrayList<TipoRasgoPersonal>();
							tiporasgopersonals.addAll(tiporasgopersonalsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoRasgoPersonal();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoRasgoPersonal();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporasgopersonalLogic.getTipoRasgoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporasgopersonals.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tiporasgopersonalLogic.getTipoRasgoPersonals().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tiporasgopersonals.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoRasgoPersonal tiporasgopersonal) {
		Boolean permite=true;
		
		if(this.tiporasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoRasgoPersonalConstantesFunciones.getOrderByListaTipoRasgoPersonal();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoRasgoPersonalConstantesFunciones.getOrderByListaTipoRasgoPersonal();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRasgoPersonal tiporasgopersonal:tiporasgopersonalLogic.getTipoRasgoPersonals()) {
				if(tiporasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					tiporasgopersonalTotales=tiporasgopersonal;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRasgoPersonal tiporasgopersonal:this.tiporasgopersonals) {
				if(tiporasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					tiporasgopersonalTotales=tiporasgopersonal;
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
			this.tiporasgopersonalAux=new TipoRasgoPersonal();
			this.tiporasgopersonalAux.setsType(Constantes2.S_TOTALES);
			this.tiporasgopersonalAux.setIsNew(false);
			this.tiporasgopersonalAux.setIsChanged(false);
			this.tiporasgopersonalAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoRasgoPersonalConstantesFunciones.TotalizarValoresFilaTipoRasgoPersonal(this.tiporasgopersonalLogic.getTipoRasgoPersonals(),this.tiporasgopersonalAux);
				
				this.tiporasgopersonalLogic.getTipoRasgoPersonals().add(this.tiporasgopersonalAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoRasgoPersonalConstantesFunciones.TotalizarValoresFilaTipoRasgoPersonal(this.tiporasgopersonals,this.tiporasgopersonalAux);
				
				this.tiporasgopersonals.add(this.tiporasgopersonalAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tiporasgopersonalTotales=new TipoRasgoPersonal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporasgopersonalLogic.getTipoRasgoPersonals().remove(tiporasgopersonalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tiporasgopersonals.remove(tiporasgopersonalTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tiporasgopersonalTotales=new TipoRasgoPersonal();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoRasgoPersonal tiporasgopersonal:tiporasgopersonalLogic.getTipoRasgoPersonals()) {
				if(tiporasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					tiporasgopersonalTotales=tiporasgopersonal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRasgoPersonalConstantesFunciones.TotalizarValoresFilaTipoRasgoPersonal(this.tiporasgopersonalLogic.getTipoRasgoPersonals(),tiporasgopersonalTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoRasgoPersonal tiporasgopersonal:this.tiporasgopersonals) {
				if(tiporasgopersonal.getsType().equals(Constantes2.S_TOTALES)) {
					tiporasgopersonalTotales=tiporasgopersonal;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoRasgoPersonalConstantesFunciones.TotalizarValoresFilaTipoRasgoPersonal(this.tiporasgopersonals,tiporasgopersonalTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoRasgoPersonalsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoRasgoPersonalsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporasgopersonalLogic.getTipoRasgoPersonalsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoRasgoPersonal() {
		this.isPermisoTodoTipoRasgoPersonal=false;
		this.isPermisoNuevoTipoRasgoPersonal=false;
		this.isPermisoActualizarTipoRasgoPersonal=false;
		this.isPermisoActualizarOriginalTipoRasgoPersonal=false;
		this.isPermisoEliminarTipoRasgoPersonal=false;
		this.isPermisoGuardarCambiosTipoRasgoPersonal=false;
		this.isPermisoConsultaTipoRasgoPersonal=false;
		this.isPermisoBusquedaTipoRasgoPersonal=false;
		this.isPermisoReporteTipoRasgoPersonal=false;		
		this.isPermisoOrdenTipoRasgoPersonal=false;		
		this.isPermisoPaginacionMedioTipoRasgoPersonal=false;		
		this.isPermisoPaginacionAltoTipoRasgoPersonal=false;
		this.isPermisoPaginacionTodoTipoRasgoPersonal=false;
		this.isPermisoCopiarTipoRasgoPersonal=false;		
		this.isPermisoVerFormTipoRasgoPersonal=false;		
		this.isPermisoDuplicarTipoRasgoPersonal=false;		
		this.isPermisoOrdenTipoRasgoPersonal=false;		
	}
	
	public void setPermisosUsuarioTipoRasgoPersonal(Boolean isPermiso) {
		this.isPermisoTodoTipoRasgoPersonal=isPermiso;
		this.isPermisoNuevoTipoRasgoPersonal=isPermiso;
		this.isPermisoActualizarTipoRasgoPersonal=isPermiso;
		this.isPermisoActualizarOriginalTipoRasgoPersonal=isPermiso;
		this.isPermisoEliminarTipoRasgoPersonal=isPermiso;
		this.isPermisoGuardarCambiosTipoRasgoPersonal=isPermiso;
		this.isPermisoConsultaTipoRasgoPersonal=isPermiso;
		this.isPermisoBusquedaTipoRasgoPersonal=isPermiso;
		this.isPermisoReporteTipoRasgoPersonal=isPermiso;
		this.isPermisoOrdenTipoRasgoPersonal=isPermiso;		
		this.isPermisoPaginacionMedioTipoRasgoPersonal=isPermiso;		
		this.isPermisoPaginacionAltoTipoRasgoPersonal=isPermiso;		
		this.isPermisoPaginacionTodoTipoRasgoPersonal=isPermiso;		
		this.isPermisoCopiarTipoRasgoPersonal=isPermiso;		
		this.isPermisoVerFormTipoRasgoPersonal=isPermiso;		
		this.isPermisoDuplicarTipoRasgoPersonal=isPermiso;
		this.isPermisoOrdenTipoRasgoPersonal=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoRasgoPersonal(Boolean isPermiso) {
		//this.isPermisoTodoTipoRasgoPersonal=isPermiso;
		this.isPermisoNuevoTipoRasgoPersonal=isPermiso;
		this.isPermisoActualizarTipoRasgoPersonal=isPermiso;
		this.isPermisoActualizarOriginalTipoRasgoPersonal=isPermiso;
		this.isPermisoEliminarTipoRasgoPersonal=isPermiso;
		this.isPermisoGuardarCambiosTipoRasgoPersonal=isPermiso;
		//this.isPermisoConsultaTipoRasgoPersonal=isPermiso;
		//this.isPermisoBusquedaTipoRasgoPersonal=isPermiso;
		//this.isPermisoReporteTipoRasgoPersonal=isPermiso;
		//this.isPermisoOrdenTipoRasgoPersonal=isPermiso;		
		//this.isPermisoPaginacionMedioTipoRasgoPersonal=isPermiso;		
		//this.isPermisoPaginacionAltoTipoRasgoPersonal=isPermiso;		
		//this.isPermisoPaginacionTodoTipoRasgoPersonal=isPermiso;		
		//this.isPermisoCopiarTipoRasgoPersonal=isPermiso;		
		//this.isPermisoDuplicarTipoRasgoPersonal=isPermiso;
		//this.isPermisoOrdenTipoRasgoPersonal=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoRasgoPersonalClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(RasgoPersonalConstantesFunciones.SNOMBREOPCION);
		
		if(TipoRasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosRasgoPersonal=false;
		this.isTienePermisosRasgoPersonal=this.verificarGetPermisosUsuarioOpcionTipoRasgoPersonalClaseRelacionada(this.opcionsRelacionadas,RasgoPersonalConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoRasgoPersonal(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoRasgoPersonalClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosRasgoPersonal=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoRasgoPersonalClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoRasgoPersonalClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoRasgoPersonalClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosRasgoPersonal && this.jInternalFrameDetalleFormTipoRasgoPersonal!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.remove(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoRasgoPersonal() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoRasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoRasgoPersonalConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoRasgoPersonal=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoRasgoPersonal=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoRasgoPersonal=this.isPermisoActualizarTipoRasgoPersonal;
			this.isPermisoEliminarTipoRasgoPersonal=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoRasgoPersonal=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoRasgoPersonal=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoRasgoPersonal=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoRasgoPersonal=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoRasgoPersonal=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRasgoPersonal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoRasgoPersonal=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoRasgoPersonal=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoRasgoPersonal=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoRasgoPersonal=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoRasgoPersonal=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoRasgoPersonal=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoRasgoPersonal=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoRasgoPersonal.setToolTipText(this.jTableDatosTipoRasgoPersonal.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoRasgoPersonal(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoRasgoPersonal(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoRasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoRasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoRasgoPersonal() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosRasgoPersonal && this.tiporasgopersonalConstantesFunciones.mostrarRasgoPersonalTipoRasgoPersonal && !TipoRasgoPersonalConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Rasgo Personal");
			reporte.setsDescripcion("Rasgo Personal");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyTipoRasgoPersonalListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoRasgoPersonalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoRasgoPersonalJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoRasgoPersonalListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoRasgoPersonalListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoRasgoPersonalParameterReturnGeneral tiporasgopersonalReturnGeneral=new TipoRasgoPersonalParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tiporasgopersonalConstantesFunciones.cargarid_empresaTipoRasgoPersonal)
					 || (this.esRecargarFks && this.tiporasgopersonalConstantesFunciones.cargarid_empresaTipoRasgoPersonal)) {

					if(!this.tiporasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tiporasgopersonalSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tiporasgopersonalReturnGeneral=tiporasgopersonalLogic.cargarCombosLoteForeignKeyTipoRasgoPersonal(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tiporasgopersonalReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoRasgoPersonal()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tiporasgopersonalSessionBean==null) {
				this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
			}

			if(!this.tiporasgopersonalSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoRasgoPersonal()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoRasgoPersonal(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoRasgoPersonal()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRasgoPersonal();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoRasgoPersonal()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoRasgoPersonal()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoRasgoPersonal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoRasgoPersonal()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoRasgoPersonal()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoRasgoPersonal()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoRasgoPersonal(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoRasgoPersonal()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoRasgoPersonalBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoRasgoPersonalBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoRasgoPersonalBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean(); 
		this.tiporasgopersonalConstantesFunciones=new TipoRasgoPersonalConstantesFunciones(); 
		this.tiporasgopersonalBean=new TipoRasgoPersonal();//(this.tiporasgopersonalConstantesFunciones); 		
		this.tiporasgopersonalReturnGeneral=new TipoRasgoPersonalParameterReturnGeneral(); 
		
		this.tiporasgopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tiporasgopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoRasgoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoRasgoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoRasgoPersonalBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoRasgoPersonal(true);
			
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
			
			this.tiporasgopersonalConstantesFunciones=new TipoRasgoPersonalConstantesFunciones(); 
			this.tiporasgopersonalBean=new TipoRasgoPersonal();//this.tiporasgopersonalConstantesFunciones); 			
			this.tiporasgopersonalReturnGeneral=new TipoRasgoPersonalParameterReturnGeneral(); 
		
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Rasgo Personal Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tiporasgopersonal=new TipoRasgoPersonal();
			this.tiporasgopersonals = new ArrayList<TipoRasgoPersonal>();
			this.tiporasgopersonalsAux = new ArrayList<TipoRasgoPersonal>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic=new TipoRasgoPersonalLogic();
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			//this.tiporasgopersonalSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tiporasgopersonalSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoRasgoPersonal);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRasgoPersonal);	
					}
					
					if(this.jInternalFrameImportacionTipoRasgoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRasgoPersonal);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoRasgoPersonal!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoRasgoPersonal);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRasgoPersonal);
				this.jInternalFrameDetalleFormTipoRasgoPersonal.setVisible(false);
				this.jInternalFrameDetalleFormTipoRasgoPersonal.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRasgoPersonal);
					this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoRasgoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoRasgoPersonal);
					this.jInternalFrameImportacionTipoRasgoPersonal.setVisible(false);
					this.jInternalFrameImportacionTipoRasgoPersonal.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoRasgoPersonal!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoRasgoPersonal);
					this.jInternalFrameOrderByTipoRasgoPersonal.setVisible(false);
					this.jInternalFrameOrderByTipoRasgoPersonal.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoRasgoPersonalActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoRasgoPersonalConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tiporasgopersonalReturnGeneral=new TipoRasgoPersonalParameterReturnGeneral();
			
			this.tiporasgopersonalParameterGeneral=new TipoRasgoPersonalParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tiporasgopersonalLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoRasgoPersonalJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(RasgoPersonalConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRasgoPersonalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado(),this.tiporasgopersonalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoRasgoPersonalConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado(),this.tiporasgopersonalSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
			this.isVisibilidadCeldaDuplicarTipoRasgoPersonal=true;
			this.isVisibilidadCeldaCopiarTipoRasgoPersonal=true;
			this.isVisibilidadCeldaVerFormTipoRasgoPersonal=true;
			this.isVisibilidadCeldaOrdenTipoRasgoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoRasgoPersonal();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoRasgoPersonal(false);
			
			this.setPermisosUsuarioTipoRasgoPersonal();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado() 
				|| (this.tiporasgopersonalSessionBean.getEsGuardarRelacionado() && this.tiporasgopersonalSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoRasgoPersonalClasesRelacionadas();
			}
			
			if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoRasgoPersonalClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoRasgoPersonal();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoRasgoPersonal();
			}
			
			if(!this.isPermisoBusquedaTipoRasgoPersonal) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoRasgoPersonal,this.isPermisoPaginacionMedioTipoRasgoPersonal,this.isPermisoPaginacionTodoTipoRasgoPersonal);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoRasgoPersonalConstantesFunciones.getTiposSeleccionarTipoRasgoPersonal());
				
				this.tiposColumnasSelect=TipoRasgoPersonalConstantesFunciones.getTiposSeleccionarTipoRasgoPersonal(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoRasgoPersonal();				
				//this.tiposRelacionesSelect=TipoRasgoPersonalConstantesFunciones.getTiposRelacionesTipoRasgoPersonal(true);
				
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
			//if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoRasgoPersonal();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoRasgoPersonal(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoRasgoPersonal(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRasgoPersonal() ;
			
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
			
			
			this.rasgopersonalLogic=new RasgoPersonalLogic(); 
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
				tiporasgopersonalImplementable= (TipoRasgoPersonalImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRasgoPersonalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tiporasgopersonalImplementableHome= (TipoRasgoPersonalImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoRasgoPersonalConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tiporasgopersonals= new ArrayList<TipoRasgoPersonal>();
			this.tiporasgopersonalsEliminados= new ArrayList<TipoRasgoPersonal>();
						
			this.isEsNuevoTipoRasgoPersonal=false;
			this.esParaAccionDesdeFormularioTipoRasgoPersonal=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoRasgoPersonal(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoRasgoPersonal();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoRasgoPersonalConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoRasgoPersonal(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoRasgoPersonal();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoRasgoPersonal();
			}
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoRasgoPersonal.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoRasgoPersonal.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoRasgoPersonal.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoRasgoPersonal(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoRasgoPersonal: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoRasgoPersonal() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoRasgoPersonal")) {
				iIndex=this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();	
				
				

				if(sTitle.equals("Rasgo Personales")) {
					if(!RasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoRasgoPersonal();

						this.cargarParteTabPanelRelacionadaRasgoPersonal(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoRasgoPersonal();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaRasgoPersonal(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoRasgoPersonal.cargarSessionConBeanSwingJInternalFrameRasgoPersonal(false,true,iIndex);
		this.jButtonRasgoPersonalActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaRasgoPersonal();

		//this.jTabbedPaneRelacionesTipoRasgoPersonal.updateUI();
		//this.jTabbedPaneRelacionesTipoRasgoPersonal.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoRasgoPersonal.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("RasgoPersonal")) {
				int row=this.jTableDatosTipoRasgoPersonal.getSelectedRow();
				jButtonRasgoPersonalActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Rasgo Personal")) {

					if(this.isTienePermisosRasgoPersonal && this.tiporasgopersonalConstantesFunciones.mostrarRasgoPersonalTipoRasgoPersonal && !TipoRasgoPersonalConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Rasgo Personales"+"("+RasgoPersonalConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Rasgo Personales");

						if(tiporasgopersonalConstantesFunciones.resaltarRasgoPersonalTipoRasgoPersonal!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tiporasgopersonalConstantesFunciones.resaltarRasgoPersonalTipoRasgoPersonal);
						}

						jmenuItem.setEnabled(this.tiporasgopersonalConstantesFunciones.activarRasgoPersonalTipoRasgoPersonal);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"RasgoPersonal"));

						

						this.jInternalFrameDetalleFormTipoRasgoPersonal.jmenuDetalleTipoRasgoPersonal.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoRasgoPersonal(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoRasgoPersonal(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoRasgoPersonal(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoRasgoPersonalListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoRasgoPersonal();
		
		this.cargarCombosFrameForeignKeyTipoRasgoPersonal();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoRasgoPersonal();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoRasgoPersonal();
		}
	}
	
	
	
	public void jButtonNuevoTipoRasgoPersonalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
			
			if(jTableDatosTipoRasgoPersonal.getRowCount()>=1) {
				jTableDatosTipoRasgoPersonal.removeRowSelectionInterval(0, jTableDatosTipoRasgoPersonal.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoRasgoPersonal=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoRasgoPersonal(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoRasgoPersonal(true);			
			//this.tiporasgopersonal=new TipoRasgoPersonal();
			//this.tiporasgopersonal.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRasgoPersonal(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal() ;
			
			if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRasgoPersonal(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tiporasgopersonal);	
			this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);				
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
			if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoRasgoPersonal: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoRasgoPersonalActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoRasgoPersonal.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoRasgoPersonal.getSelectedRows().length;			
			}
			
			tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoRasgoPersonal--;			
				//TipoRasgoPersonal tiporasgopersonalAux= new TipoRasgoPersonal();			
				//tiporasgopersonalAux.setId(this.iIdNuevoTipoRasgoPersonal);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoRasgoPersonal tiporasgopersonalOrigen=new TipoRasgoPersonal();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoRasgoPersonal tiporasgopersonalOrigen : tiporasgopersonalsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tiporasgopersonalOrigen =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tiporasgopersonalOrigen =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoRasgoPersonal();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tiporasgopersonal.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoRasgoPersonal(tiporasgopersonalOrigen,this.tiporasgopersonal,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporasgopersonalLogic.getTipoRasgoPersonals().add(this.tiporasgopersonalAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporasgopersonals.add(this.tiporasgopersonalAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
				
				this.jTableDatosTipoRasgoPersonal.setRowSelectionInterval(this.getIndiceNuevoTipoRasgoPersonal(), this.getIndiceNuevoTipoRasgoPersonal());
				
				int iLastRow =  this.jTableDatosTipoRasgoPersonal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRasgoPersonal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRasgoPersonal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();									
		
			TipoRasgoPersonal tiporasgopersonalOrigen=new TipoRasgoPersonal();
			TipoRasgoPersonal tiporasgopersonalDestino=new TipoRasgoPersonal();
				
			tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoRasgoPersonal.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tiporasgopersonalsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoRasgoPersonal.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporasgopersonalOrigen =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporasgopersonalOrigen =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tiporasgopersonalDestino =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tiporasgopersonalDestino =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tiporasgopersonalOrigen =tiporasgopersonalsSeleccionados.get(0);
				tiporasgopersonalDestino =tiporasgopersonalsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoRasgoPersonal(tiporasgopersonalOrigen,tiporasgopersonalDestino,true,false);
				
				tiporasgopersonalDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tiporasgopersonalDestino,tiporasgopersonalLogic.getTipoRasgoPersonals());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tiporasgopersonalDestino,tiporasgopersonals);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
				
				//this.jTableDatosTipoRasgoPersonal.setRowSelectionInterval(this.getIndiceNuevoTipoRasgoPersonal(), this.getIndiceNuevoTipoRasgoPersonal());
				
				int iLastRow =  this.jTableDatosTipoRasgoPersonal.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoRasgoPersonal.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoRasgoPersonal.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoRasgoPersonal.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoRasgoPersonal.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(!isVisible);
			this.jPanelPaginacionTipoRasgoPersonal.setVisible(!isVisible);
			this.jPanelAccionesTipoRasgoPersonal.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoRasgoPersonal();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoRasgoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoRasgoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoRasgoPersonal();
			
			this.abrirFrameOrderByTipoRasgoPersonal();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoRasgoPersonal();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoRasgoPersonal(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRasgoPersonal);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoRasgoPersonal.isMaximum()) {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoRasgoPersonal.setSize(this.jInternalFrameDetalleFormTipoRasgoPersonal.iWidthFormulario,this.jInternalFrameDetalleFormTipoRasgoPersonal.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoRasgoPersonal.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoRasgoPersonal.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoRasgoPersonal.isMaximum()) {
						this.jInternalFrameDetalleFormTipoRasgoPersonal.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoRasgoPersonal.jContentPaneDetalleTipoRasgoPersonal.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoRasgoPersonal.jContentPaneDetalleTipoRasgoPersonal.getWidth(),TipoRasgoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoRasgoPersonal.jContentPaneDetalleTipoRasgoPersonal.getWidth(),TipoRasgoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoRasgoPersonal.jContentPaneDetalleTipoRasgoPersonal.getWidth(),TipoRasgoPersonalConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(RasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaRasgoPersonal();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoRasgoPersonal.setVisible(true);
	        this.jInternalFrameDetalleFormTipoRasgoPersonal.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoRasgoPersonal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoRasgoPersonal==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoRasgoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRasgoPersonal,false,this);
				} else {
					this.jInternalFrameOrderByTipoRasgoPersonal=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoRasgoPersonal,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoRasgoPersonal);
				this.jInternalFrameOrderByTipoRasgoPersonal.setVisible(false);
				this.jInternalFrameOrderByTipoRasgoPersonal.setSelected(false);
				
				this.jInternalFrameOrderByTipoRasgoPersonal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRasgoPersonal"));
				
				this.inicializarActualizarBindingTablaOrderByTipoRasgoPersonal();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoRasgoPersonal() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoRasgoPersonal==null) {
				
				this.jInternalFrameImportacionTipoRasgoPersonal=new ImportacionJInternalFrame(TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoRasgoPersonal);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoRasgoPersonal);
				this.jInternalFrameImportacionTipoRasgoPersonal.setVisible(false);
				this.jInternalFrameImportacionTipoRasgoPersonal.setSelected(false);


				this.jInternalFrameImportacionTipoRasgoPersonal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRasgoPersonal"));
				this.jInternalFrameImportacionTipoRasgoPersonal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRasgoPersonal"));
				this.jInternalFrameImportacionTipoRasgoPersonal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRasgoPersonal"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoRasgoPersonal() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal==null) {
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal=new ReporteDinamicoJInternalFrame(TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoRasgoPersonal);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoRasgoPersonal);
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRasgoPersonal"));
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRasgoPersonal"));
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRasgoPersonal"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRasgoPersonal();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaRasgoPersonal() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.jScrollPanelDatosRasgoPersonal.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoRasgoPersonal.jContentPaneDetalleTipoRasgoPersonal.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.jScrollPanelDatosRasgoPersonal.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.jScrollPanelDatosRasgoPersonal.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.jScrollPanelDatosRasgoPersonal.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoRasgoPersonal() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoRasgoPersonal);
			
	       	this.jInternalFrameDetalleFormTipoRasgoPersonal.setVisible(false);
	        this.jInternalFrameDetalleFormTipoRasgoPersonal.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoRasgoPersonal.dispose();
			//this.jInternalFrameDetalleFormTipoRasgoPersonal=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoRasgoPersonal() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoRasgoPersonal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoRasgoPersonal.setVisible(true);
	        this.jInternalFrameImportacionTipoRasgoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoRasgoPersonal() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoRasgoPersonal.setVisible(true);
	        this.jInternalFrameOrderByTipoRasgoPersonal.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoRasgoPersonal() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoRasgoPersonal.setVisible(false);
	        this.jInternalFrameOrderByTipoRasgoPersonal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoRasgoPersonal() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoRasgoPersonal() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoRasgoPersonal.setVisible(false);
	        this.jInternalFrameImportacionTipoRasgoPersonal.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoRasgoPersonal(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoRasgoPersonal(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoRasgoPersonal(true);
			//this.isEsNuevoTipoRasgoPersonal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRasgoPersonal(false) ;
			
			if(tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.getEsGuardarRelacionado() && RasgoPersonalJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonRasgoPersonalActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRasgoPersonal(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoRasgoPersonalActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoRasgoPersonal(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoRasgoPersonal(true);
			//this.isEsNuevoTipoRasgoPersonal=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tiporasgopersonal.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoRasgoPersonal(false) ;
			
			if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoRasgoPersonal(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoRasgoPersonal(false);
			
			//if(!this.isEsNuevoTipoRasgoPersonal) {								
				int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
				
			}
			
			if(this.permiteMantenimiento(this.tiporasgopersonal)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoRasgoPersonal=true;
					this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
					this.isEsNuevoTipoRasgoPersonal=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoRasgoPersonal=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoRasgoPersonal=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRasgoPersonal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal(false);
				
				this.habilitarDeshabilitarControlesTipoRasgoPersonal(false);
			
												
				
				if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoRasgoPersonal();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoRasgoPersonalActionPerformed(evt,tiporasgopersonalSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoRasgoPersonal(this.tiporasgopersonal,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoRasgoPersonal.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tiporasgopersonalSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tiporasgopersonal.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				this.tiporasgopersonal.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				this.tiporasgopersonal.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tiporasgopersonal)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoRasgoPersonalModel) this.jTableDatosTipoRasgoPersonal.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoRasgoPersonal=true;
				this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
				this.isEsNuevoTipoRasgoPersonal=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoRasgoPersonal(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal(false);
				
				this.habilitarDeshabilitarControlesTipoRasgoPersonal(false);
				
				
				
				if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoRasgoPersonal();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoRasgoPersonal.getRowCount()>=1) {
				jTableDatosTipoRasgoPersonal.removeRowSelectionInterval(0, jTableDatosTipoRasgoPersonal.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoRasgoPersonal(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoRasgoPersonal(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal(false) ;
			
			this.isEsNuevoTipoRasgoPersonal=false;
			
			if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoRasgoPersonal();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoRasgoPersonal(false);
				
				//SI ES MANUAL
				if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoRasgoPersonal();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoRasgoPersonal--;			
			//TipoRasgoPersonal tiporasgopersonalAux= new TipoRasgoPersonal();			
			//tiporasgopersonalAux.setId(this.iIdNuevoTipoRasgoPersonal);
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoRasgoPersonal();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
			
			this.tiporasgopersonal.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tiporasgopersonalLogic.getTipoRasgoPersonals().add(this.tiporasgopersonalAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tiporasgopersonals.add(this.tiporasgopersonalAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
			
			this.jTableDatosTipoRasgoPersonal.setRowSelectionInterval(this.getIndiceNuevoTipoRasgoPersonal(), this.getIndiceNuevoTipoRasgoPersonal());
			
			int iLastRow =  this.jTableDatosTipoRasgoPersonal.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoRasgoPersonal.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoRasgoPersonal.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoRasgoPersonal(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRasgoPersonal(false);
			
			//SI ES MANUAL
			if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRasgoPersonal();
			}
			
			//this.abrirFrameTreeTipoRasgoPersonal();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Rasgo PersonalES ?", "MANTENIMIENTO DE Tipo Rasgo Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoRasgoPersonal.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoRasgoPersonal();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tiporasgopersonalReturnGeneral=tiporasgopersonalLogic.procesarImportacionTipoRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tiporasgopersonalParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoRasgoPersonalReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoRasgoPersonal.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoRasgoPersonal.setFileImportacion(this.jInternalFrameImportacionTipoRasgoPersonal.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoRasgoPersonal.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoRasgoPersonal.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoRasgoPersonal.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoRasgoPersonal.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		

		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoRasgoPersonalBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoRasgoPersonalBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoRasgoPersonals("Todos",tiporasgopersonalsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporasgopersonal";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoRasgoPersonals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoRasgoPersonal tiporasgopersonal:tiporasgopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporasgopersonal.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoRasgoPersonal tiporasgopersonal:tiporasgopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporasgopersonal.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoRasgoPersonal tiporasgopersonal:tiporasgopersonalsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tiporasgopersonal.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoRasgoPersonal(row);				
			//	iRow++;
			//}				
			
			//for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoRasgoPersonal(tiporasgopersonalAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
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
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRasgoPersonal(false);
			
			//SI ES MANUAL
			if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoRasgoPersonal();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRasgoPersonal(false);
			
			//SI ES MANUAL
			if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRasgoPersonal();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoRasgoPersonal(false);
			
			//SI ES MANUAL
			if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoRasgoPersonal();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoRasgoPersonal() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoRasgoPersonal.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoRasgoPersonal.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoRasgoPersonal.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoRasgoPersonal.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoRasgoPersonal.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoRasgoPersonal.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoRasgoPersonal.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoRasgoPersonal(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoRasgoPersonal(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoRasgoPersonal(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoRasgoPersonal(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoRasgoPersonal(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoRasgoPersonal(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRasgoPersonal(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoRasgoPersonal(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoRasgoPersonal() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoRasgoPersonal();
		
		this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRasgoPersonal();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoRasgoPersonal() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRasgoPersonal(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRasgoPersonal(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoRasgoPersonal.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoRasgoPersonal.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoRasgoPersonal.jCheckBoxPostAccionNuevoTipoRasgoPersonal.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoRasgoPersonal.jCheckBoxPostAccionSinCerrarTipoRasgoPersonal.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoRasgoPersonal.jCheckBoxPostAccionSinMensajeTipoRasgoPersonal.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoRasgoPersonal.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoRasgoPersonal.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
				this.jInternalFrameDetalleFormTipoRasgoPersonal.jCheckBoxPostAccionNuevoTipoRasgoPersonal.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoRasgoPersonal.jCheckBoxPostAccionSinCerrarTipoRasgoPersonal.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoRasgoPersonal.jCheckBoxPostAccionSinMensajeTipoRasgoPersonal.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoRasgoPersonal.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoRasgoPersonal.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoRasgoPersonal.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoRasgoPersonal.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoRasgoPersonal.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoRasgoPersonal.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoRasgoPersonal.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoRasgoPersonal.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoRasgoPersonal(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoRasgoPersonal(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoRasgoPersonal() throws Exception {
		try	{
			if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRasgoPersonal();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRasgoPersonal() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoRasgoPersonal() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoRasgoPersonal.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoRasgoPersonal.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoRasgoPersonal.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoRasgoPersonal.addItem(reporte);
			}
			
			
			if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoRasgoPersonal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoRasgoPersonal.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoRasgoPersonal.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoRasgoPersonal.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoRasgoPersonal.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoRasgoPersonal.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoRasgoPersonal.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRasgoPersonal();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoRasgoPersonal() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoRasgoPersonal()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoRasgoPersonal(Boolean esInicializar) throws Exception {				
		if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoRasgoPersonal();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoRasgoPersonal() throws Exception {
		this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoRasgoPersonal() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoRasgoPersonalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoRasgoPersonalPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoRasgoPersonalOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRasgoPersonalOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoRasgoPersonalPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoRasgoPersonalPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoRasgoPersonal(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tiporasgopersonalLogic.getTipoRasgoPersonals().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tiporasgopersonals.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoRasgoPersonal.setModel(new TipoRasgoPersonalModel(this.tiporasgopersonalLogic.getTipoRasgoPersonals(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoRasgoPersonal.setModel(new TipoRasgoPersonalModel(this.tiporasgopersonals,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoRasgoPersonal!=null && this.jInternalFrameOrderByTipoRasgoPersonal.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoRasgoPersonal();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRasgoPersonal,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoRasgoPersonalPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO,tiporasgopersonalConstantesFunciones.resaltarSeleccionarTipoRasgoPersonal,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoRasgoPersonalConstantesFunciones.SCLASSWEBTITULO,tiporasgopersonalConstantesFunciones.resaltarSeleccionarTipoRasgoPersonal,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRasgoPersonal,TipoRasgoPersonalConstantesFunciones.LABEL_ID));

		if(this.tiporasgopersonalConstantesFunciones.mostraridTipoRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRasgoPersonalConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tiporasgopersonalConstantesFunciones.resaltaridTipoRasgoPersonal,this.tiporasgopersonalConstantesFunciones.activaridTipoRasgoPersonal,this,true,"idTipoRasgoPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporasgopersonalConstantesFunciones.resaltaridTipoRasgoPersonal,this.tiporasgopersonalConstantesFunciones.activaridTipoRasgoPersonal,this,true,"idTipoRasgoPersonal","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRasgoPersonal,TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tiporasgopersonalConstantesFunciones.mostrarid_empresaTipoRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tiporasgopersonalConstantesFunciones.resaltarid_empresaTipoRasgoPersonal,this,this.tiporasgopersonalConstantesFunciones.activarid_empresaTipoRasgoPersonal));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tiporasgopersonalConstantesFunciones.resaltarid_empresaTipoRasgoPersonal,this,this.tiporasgopersonalConstantesFunciones.activarid_empresaTipoRasgoPersonal,false,"id_empresaTipoRasgoPersonal","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRasgoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRasgoPersonal,TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO));

		if(this.tiporasgopersonalConstantesFunciones.mostrarcodigoTipoRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporasgopersonalConstantesFunciones.resaltarcodigoTipoRasgoPersonal,this.tiporasgopersonalConstantesFunciones.activarcodigoTipoRasgoPersonal,this,true,"codigoTipoRasgoPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporasgopersonalConstantesFunciones.resaltarcodigoTipoRasgoPersonal,this.tiporasgopersonalConstantesFunciones.activarcodigoTipoRasgoPersonal,this,true,"codigoTipoRasgoPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRasgoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoRasgoPersonal,TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE));

		if(this.tiporasgopersonalConstantesFunciones.mostrarnombreTipoRasgoPersonal && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tiporasgopersonalConstantesFunciones.resaltarnombreTipoRasgoPersonal,this.tiporasgopersonalConstantesFunciones.activarnombreTipoRasgoPersonal,this,true,"nombreTipoRasgoPersonal","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tiporasgopersonalConstantesFunciones.resaltarnombreTipoRasgoPersonal,this.tiporasgopersonalConstantesFunciones.activarnombreTipoRasgoPersonal,this,true,"nombreTipoRasgoPersonal","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoRasgoPersonalPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosRasgoPersonal && this.tiporasgopersonalConstantesFunciones.mostrarRasgoPersonalTipoRasgoPersonal && !TipoRasgoPersonalConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Rasgo Personales");
				tableColumn.setHeaderValue("Rasgo Personales");
				tableColumn.setCellRenderer(new RasgoPersonalTableCell(tiporasgopersonalConstantesFunciones.resaltarRasgoPersonalTipoRasgoPersonal,this,this.tiporasgopersonalConstantesFunciones.activarRasgoPersonalTipoRasgoPersonal));
				tableColumn.setCellEditor(new RasgoPersonalTableCell(tiporasgopersonalConstantesFunciones.resaltarRasgoPersonalTipoRasgoPersonal,this,this.tiporasgopersonalConstantesFunciones.activarRasgoPersonalTipoRasgoPersonal));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoRasgoPersonal.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRasgoPersonal.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoRasgoPersonal.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoRasgoPersonal.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTipoRasgoPersonal.addColumn(tableColumn);
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
			
			this.jTableDatosTipoRasgoPersonal.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoRasgoPersonal.moveColumn(this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoRasgoPersonal.moveColumn(this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoRasgoPersonal.moveColumn(this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoRasgoPersonal.moveColumn(this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoRasgoPersonal.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoRasgoPersonal.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoRasgoPersonal,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoRasgoPersonal.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoRasgoPersonal.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoRasgoPersonal.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tiporasgopersonalLogic.getTipoRasgoPersonals().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tiporasgopersonals.size()-1;
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
		//this.jTableDatosTipoRasgoPersonal.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoRasgoPersonal.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoRasgoPersonal();
			
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
				
				//this.isEsNuevoTipoRasgoPersonal=false;
					
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
				if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRasgoPersonal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRasgoPersonal.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tiporasgopersonal.getsType().equals("DUPLICADO")
				   || this.tiporasgopersonal.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoRasgoPersonal=true;
				
				} else {
					this.isEsNuevoTipoRasgoPersonal=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
					if(this.tiporasgopersonal.getId()>=0 && !this.tiporasgopersonal.getIsNew()) {						
						this.isEsNuevoTipoRasgoPersonal=false;
						
					} else {
						this.isEsNuevoTipoRasgoPersonal=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoRasgoPersonal(esRelaciones);						
				
				this.seleccionarTipoRasgoPersonal(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tiporasgopersonal.getId()<0) {
					this.isEsNuevoTipoRasgoPersonal=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoRasgoPersonal(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoRasgoPersonal(evt,rowIndex);
				}	
				
				if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoRasgoPersonal: " + this.dDif); 
					}
				}								
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoRasgoPersonal(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tiporasgopersonal)) {
					if(this.tiporasgopersonal.getId()>0) {
						this.tiporasgopersonal.setIsDeleted(true);
						
						this.tiporasgopersonalsEliminados.add(this.tiporasgopersonal);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tiporasgopersonalLogic.getTipoRasgoPersonals().remove(this.tiporasgopersonal);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tiporasgopersonals.remove(this.tiporasgopersonal);				
					}
					
					
					((TipoRasgoPersonalModel) this.jTableDatosTipoRasgoPersonal.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoRasgoPersonal(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoRasgoPersonal) {
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoRasgoPersonal.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoRasgoPersonal.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoRasgoPersonal(this.tiporasgopersonal);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tiporasgopersonalConstantesFunciones.cargarid_empresaTipoRasgoPersonal || this.tiporasgopersonalConstantesFunciones.event_dependid_empresaTipoRasgoPersonal) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tiporasgopersonal.getid_empresa());
									//this.inicializarActualizarBindingTipoRasgoPersonal(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tiporasgopersonal.getEmpresa()!=null) {
							this.empresasForeignKey.add(tiporasgopersonal.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tiporasgopersonal.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoRasgoPersonal("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoRasgoPersonal(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoRasgoPersonal(tiporasgopersonal,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoRasgoPersonal(tiporasgopersonal);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoRasgoPersonal(tiporasgopersonal,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoRasgoPersonal(tiporasgopersonal);
	}
	
	public void setVariablesObjetoActualToFormularioTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.setText(tiporasgopersonal.getId().toString());
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextFieldcodigoTipoRasgoPersonal.setText(tiporasgopersonal.getcodigo());
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextAreanombreTipoRasgoPersonal.setText(tiporasgopersonal.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoRasgoPersonal tiporasgopersonalLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tiporasgopersonalLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoRasgoPersonal tiporasgopersonalLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tiporasgopersonalLocal=this.tiporasgopersonal;
			} else {
				tiporasgopersonalLocal=this.tiporasgopersonalAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tiporasgopersonalLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoRasgoPersonal(tiporasgopersonalLocal,true);
					
					if(tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tiporasgopersonalLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tiporasgopersonalLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(tiporasgopersonal,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(tiporasgopersonal);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(tiporasgopersonal,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.getText()==null || this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.getText()=="" || this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.setText("0");
			}

			if(conColumnasBase) {tiporasgopersonal.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRasgoPersonalConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelIdTipoRasgoPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporasgopersonal.setcodigo(this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextFieldcodigoTipoRasgoPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelcodigoTipoRasgoPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tiporasgopersonal.setnombre(this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextAreanombreTipoRasgoPersonal.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelnombreTipoRasgoPersonal,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonalBean,TipoRasgoPersonal tiporasgopersonal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonalOrigen,TipoRasgoPersonal tiporasgopersonal,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporasgopersonalOrigen.getId()!=null && !tiporasgopersonalOrigen.getId().equals(0L))) {tiporasgopersonal.setId(tiporasgopersonalOrigen.getId());}}
			if(conDefault || (!conDefault && tiporasgopersonalOrigen.getcodigo()!=null && !tiporasgopersonalOrigen.getcodigo().equals(""))) {tiporasgopersonal.setcodigo(tiporasgopersonalOrigen.getcodigo());}
			if(conDefault || (!conDefault && tiporasgopersonalOrigen.getnombre()!=null && !tiporasgopersonalOrigen.getnombre().equals(""))) {tiporasgopersonal.setnombre(tiporasgopersonalOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.setText(tiporasgopersonal.getId().toString());
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextFieldcodigoTipoRasgoPersonal.setText(tiporasgopersonal.getcodigo());
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextAreanombreTipoRasgoPersonal.setText(tiporasgopersonal.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoRasgoPersonal(TipoRasgoPersonalBean tiporasgopersonalBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.setText(tiporasgopersonalBean.getId().toString());
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextFieldcodigoTipoRasgoPersonal.setText(tiporasgopersonalBean.getcodigo());
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextAreanombreTipoRasgoPersonal.setText(tiporasgopersonalBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoRasgoPersonal(TipoRasgoPersonalParameterReturnGeneral tiporasgopersonalReturnGeneral,TipoRasgoPersonalBean tiporasgopersonalBean,Boolean conDefault) throws Exception { 
		try {
			TipoRasgoPersonal tiporasgopersonalLocal=new TipoRasgoPersonal();
			
			tiporasgopersonalLocal=tiporasgopersonalReturnGeneral.getTipoRasgoPersonal();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tiporasgopersonalLocal.getId()!=null && !tiporasgopersonalLocal.getId().equals(0L))) {tiporasgopersonalBean.setId(tiporasgopersonalLocal.getId());}}
			if(conDefault || (!conDefault && tiporasgopersonalLocal.getcodigo()!=null && !tiporasgopersonalLocal.getcodigo().equals(""))) {tiporasgopersonalBean.setcodigo(tiporasgopersonalLocal.getcodigo());}
			if(conDefault || (!conDefault && tiporasgopersonalLocal.getnombre()!=null && !tiporasgopersonalLocal.getnombre().equals(""))) {tiporasgopersonalBean.setnombre(tiporasgopersonalLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoRasgoPersonalGenerico(Long idTipoRasgoPersonalSeleccionado,JComboBox jComboBoxTipoRasgoPersonal,List<TipoRasgoPersonal> tiporasgopersonalsLocal)throws Exception {
		try {
			TipoRasgoPersonal  tiporasgopersonalTemp=null;

			for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsLocal) {
				if(tiporasgopersonalAux.getId()!=null && tiporasgopersonalAux.getId().equals(idTipoRasgoPersonalSeleccionado)) {
					tiporasgopersonalTemp=tiporasgopersonalAux;
					break;
				}
			}

			jComboBoxTipoRasgoPersonal.setSelectedItem(tiporasgopersonalTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoRasgoPersonalGenerico(JComboBox jComboBoxTipoRasgoPersonal,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRasgoPersonal.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoRasgoPersonal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoRasgoPersonal.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoRasgoPersonal.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoRasgoPersonal.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoRasgoPersonal.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("RasgoPersonal")) {
			jButtonRasgoPersonalActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporasgopersonal=(TipoRasgoPersonal) tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporasgopersonal =(TipoRasgoPersonal) tiporasgopersonals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tiporasgopersonal.getIsNew() && !tiporasgopersonal.getIsChanged() && !tiporasgopersonal.getIsDeleted()) {
				sDescripcion=tiporasgopersonal.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tiporasgopersonal.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoRasgoPersonal tiporasgopersonalRow=new TipoRasgoPersonal();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporasgopersonalRow=(TipoRasgoPersonal) tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tiporasgopersonalRow=(TipoRasgoPersonal) tiporasgopersonals.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonRasgoPersonalActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoRasgoPersonal tiporasgopersonal) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporasgopersonal = (TipoRasgoPersonal)this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tiporasgopersonal = (TipoRasgoPersonal)this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tiporasgopersonal!=null) {
						this.tiporasgopersonal = tiporasgopersonal;
					} else {
						this.tiporasgopersonal = new TipoRasgoPersonal();
					}
				}

				if(this.isTienePermisosRasgoPersonal && this.permiteMantenimiento(this.tiporasgopersonal)) {
					RasgoPersonalBeanSwingJInternalFrame rasgopersonalBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFramePopup=new RasgoPersonalBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						rasgopersonalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFramePopup;
					} else {
						rasgopersonalBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame;
					}

					List<TipoRasgoPersonal> tiporasgopersonals=new ArrayList<TipoRasgoPersonal>();
					tiporasgopersonals.add(this.tiporasgopersonal);
					if(!esRelacionado) {
						//rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.setConGuardarRelaciones(false);
						//rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					rasgopersonalBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoRasgoPersonal.cargarRasgoPersonalBeanSwingJInternalFrame(tiporasgopersonals,this.tiporasgopersonal,rasgopersonalBeanSwingJInternalFrame,/*conInicializar,*/rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.getConGuardarRelaciones(),rasgopersonalBeanSwingJInternalFrame.rasgopersonalSessionBean.getEsGuardarRelacionado());
					rasgopersonalBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						rasgopersonalBeanSwingJInternalFrame.actualizarEstadoPanelsRasgoPersonal("no_relacionado");

						rasgopersonalBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(RasgoPersonalConstantesFunciones.ITAMANIOFILATABLA + (RasgoPersonalConstantesFunciones.ITAMANIOFILATABLA/2));

						rasgopersonalBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoRasgoPersonal=(TitledBorder)this.jScrollPanelDatosTipoRasgoPersonal.getBorder();
						TitledBorder titledBorderRasgoPersonal=(TitledBorder)rasgopersonalBeanSwingJInternalFrame.jScrollPanelDatosRasgoPersonal.getBorder();

						titledBorderRasgoPersonal.setTitle(titledBorderTipoRasgoPersonal.getTitle() + " -> Rasgo Personal");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,rasgopersonalBeanSwingJInternalFrame);
						}

						rasgopersonalBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(rasgopersonalBeanSwingJInternalFrame);

						rasgopersonalBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Rasgo Personal",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoRasgoPersonal(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal));			
			this.jButtonDuplicarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaDuplicarTipoRasgoPersonal && this.isPermisoDuplicarTipoRasgoPersonal));			
			this.jButtonCopiarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaCopiarTipoRasgoPersonal && this.isPermisoCopiarTipoRasgoPersonal));
			this.jButtonVerFormTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaVerFormTipoRasgoPersonal && this.isPermisoVerFormTipoRasgoPersonal));
			
			this.jButtonAbrirOrderByTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoRasgoPersonal && this.isPermisoOrdenTipoRasgoPersonal));			
			
			this.jButtonNuevoRelacionesTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal));			
			this.jButtonNuevoGuardarCambiosTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaModificarTipoRasgoPersonal && this.isPermisoActualizarTipoRasgoPersonal));	
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaActualizarTipoRasgoPersonal && this.isPermisoActualizarTipoRasgoPersonal));	
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaEliminarTipoRasgoPersonal && this.isPermisoEliminarTipoRasgoPersonal));
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarTipoRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoRasgoPersonal);							
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal));						
			this.jButtonDuplicarToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaDuplicarTipoRasgoPersonal && this.isPermisoDuplicarTipoRasgoPersonal));						
			this.jButtonCopiarToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaCopiarTipoRasgoPersonal && this.isPermisoCopiarTipoRasgoPersonal));			
			this.jButtonVerFormToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaVerFormTipoRasgoPersonal && this.isPermisoVerFormTipoRasgoPersonal));			
			this.jButtonAbrirOrderByToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoRasgoPersonal && this.isPermisoOrdenTipoRasgoPersonal));
			this.jButtonNuevoRelacionesToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal));			
			this.jButtonNuevoGuardarCambiosToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));			
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaModificarTipoRasgoPersonal && this.isPermisoActualizarTipoRasgoPersonal));	
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaActualizarTipoRasgoPersonal  && this.isPermisoActualizarTipoRasgoPersonal));	
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaEliminarTipoRasgoPersonal && this.isPermisoEliminarTipoRasgoPersonal));
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarToolBarTipoRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoRasgoPersonal);				
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal));			
			this.jMenuItemDuplicarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaDuplicarTipoRasgoPersonal && this.isPermisoDuplicarTipoRasgoPersonal));			
			this.jMenuItemCopiarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaCopiarTipoRasgoPersonal && this.isPermisoCopiarTipoRasgoPersonal));			
			this.jMenuItemVerFormTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaVerFormTipoRasgoPersonal && this.isPermisoVerFormTipoRasgoPersonal));			
			this.jMenuItemAbrirOrderByTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoRasgoPersonal && this.isPermisoOrdenTipoRasgoPersonal));			
			//this.jMenuItemMostrarOcultarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoRasgoPersonal && this.isPermisoOrdenTipoRasgoPersonal));
			this.jMenuItemDetalleAbrirOrderByTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoRasgoPersonal && this.isPermisoOrdenTipoRasgoPersonal));			
			//this.jMenuItemDetalleMostrarOcultarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaOrdenTipoRasgoPersonal && this.isPermisoOrdenTipoRasgoPersonal));			
			this.jMenuItemNuevoRelacionesTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal));			
			this.jMenuItemNuevoGuardarCambiosTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaNuevoTipoRasgoPersonal && this.isPermisoNuevoTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));									
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemModificarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaModificarTipoRasgoPersonal && this.isPermisoActualizarTipoRasgoPersonal));	
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemActualizarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaActualizarTipoRasgoPersonal && this.isPermisoActualizarTipoRasgoPersonal));	
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemEliminarTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaEliminarTipoRasgoPersonal && this.isPermisoEliminarTipoRasgoPersonal));
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemCancelarTipoRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoRasgoPersonal);				
			}
			
			this.jMenuItemGuardarCambiosTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));						
			this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=this.jButtonNuevoTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaDuplicarTipoRasgoPersonal=this.jButtonDuplicarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaCopiarTipoRasgoPersonal=this.jButtonCopiarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaVerFormTipoRasgoPersonal=this.jButtonVerFormTipoRasgoPersonal.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoRasgoPersonal=this.jButtonAbrirOrderByTipoRasgoPersonal.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=this.jButtonNuevoRelacionesTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=this.jButtonModificarTipoRasgoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosTipoRasgoPersonal.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=this.jButtonGuardarCambiosTablaTipoRasgoPersonal.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=this.jButtonNuevoToolBarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=this.jButtonNuevoRelacionesToolBarTipoRasgoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarToolBarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarToolBarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarToolBarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarToolBarTipoRasgoPersonal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRasgoPersonal=this.jButtonGuardarCambiosToolBarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=this.jButtonGuardarCambiosTablaToolBarTipoRasgoPersonal.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=this.jMenuItemNuevoTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=this.jMenuItemNuevoRelacionesTipoRasgoPersonal.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemModificarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemActualizarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemEliminarTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemCancelarTipoRasgoPersonal.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoRasgoPersonal=this.jMenuItemGuardarCambiosTipoRasgoPersonal.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoRasgoPersonal(Boolean esInicializar) {
		if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
				//if(this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRasgoPersonal();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoRasgoPersonal(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoRasgoPersonal() {
		this.jButtonNuevoTipoRasgoPersonal.setVisible(this.isPermisoNuevoTipoRasgoPersonal);			
		this.jButtonDuplicarTipoRasgoPersonal.setVisible(this.isPermisoDuplicarTipoRasgoPersonal);			
		this.jButtonCopiarTipoRasgoPersonal.setVisible(this.isPermisoCopiarTipoRasgoPersonal);			
		this.jButtonVerFormTipoRasgoPersonal.setVisible(this.isPermisoVerFormTipoRasgoPersonal);			
		
		this.jButtonAbrirOrderByTipoRasgoPersonal.setVisible(this.isPermisoOrdenTipoRasgoPersonal);					
		
		this.jButtonNuevoRelacionesTipoRasgoPersonal.setVisible(this.isPermisoNuevoTipoRasgoPersonal);			
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarTipoRasgoPersonal.setVisible(this.isPermisoActualizarTipoRasgoPersonal);	
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarTipoRasgoPersonal.setVisible(this.isPermisoActualizarTipoRasgoPersonal);	
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarTipoRasgoPersonal.setVisible(this.isPermisoEliminarTipoRasgoPersonal);
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarTipoRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoRasgoPersonal);						
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosTipoRasgoPersonal.setVisible(this.isPermisoGuardarCambiosTipoRasgoPersonal);							
		}
		
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.setVisible(this.isPermisoActualizarTipoRasgoPersonal);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRasgoPersonal() {
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarTipoRasgoPersonal.setVisible(this.isPermisoActualizarTipoRasgoPersonal);	
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarTipoRasgoPersonal.setVisible(this.isPermisoActualizarTipoRasgoPersonal);	
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarTipoRasgoPersonal.setVisible(this.isPermisoEliminarTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarTipoRasgoPersonal.setVisible(this.isVisibilidadCeldaCancelarTipoRasgoPersonal);							
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosTipoRasgoPersonal.setVisible((this.isVisibilidadCeldaGuardarTipoRasgoPersonal && this.isPermisoGuardarCambiosTipoRasgoPersonal));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoRasgoPersonal() {
		if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoRasgoPersonal();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoRasgoPersonal() {
	}
	
	public void jTableDatosTipoRasgoPersonalListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoRasgoPersonal(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.gettiporasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporasgopersonal==null) {
						this.tiporasgopersonal = new TipoRasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
				}

				if(this.tiporasgopersonal.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tiporasgopersonal.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoRasgoPersonalUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoRasgoPersonal(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoRasgoPersonal.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoRasgoPersonal.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.gettiporasgopersonal(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tiporasgopersonalLogic.getConnexion());

				if(this.tiporasgopersonal.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tiporasgopersonal.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoRasgoPersonal=(TitledBorder)this.jScrollPanelDatosTipoRasgoPersonal.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoRasgoPersonal.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.gettiporasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporasgopersonal==null) {
						this.tiporasgopersonal = new TipoRasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
				}

				if(this.tiporasgopersonal.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tiporasgopersonal.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.gettiporasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporasgopersonal==null) {
						this.tiporasgopersonal = new TipoRasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
				}

				if(this.tiporasgopersonal.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tiporasgopersonal.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoRasgoPersonalBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.gettiporasgopersonal(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tiporasgopersonal==null) {
						this.tiporasgopersonal = new TipoRasgoPersonal();
					}

					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);
				}

				if(this.tiporasgopersonal.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tiporasgopersonal.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoRasgoPersonal(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoRasgoPersonalActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoRasgoPersonal(false,false);

			this.getTipoRasgoPersonalsFK_IdEmpresa();

			this.inicializarActualizarBindingTipoRasgoPersonal(false);

			//if(TipoRasgoPersonalBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoRasgoPersonal(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tiporasgopersonalLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoRasgoPersonal() {
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
		

		if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoRasgoPersonal.dispose();
			this.jInternalFrameDetalleFormTipoRasgoPersonal=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
			this.jInternalFrameReporteDinamicoTipoRasgoPersonal.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoRasgoPersonal.dispose();
			this.jInternalFrameReporteDinamicoTipoRasgoPersonal=null;
		}
		
		if(this.jInternalFrameImportacionTipoRasgoPersonal!=null) {
			this.jInternalFrameImportacionTipoRasgoPersonal.setVisible(false);	    			
			this.jInternalFrameImportacionTipoRasgoPersonal.dispose();
			this.jInternalFrameImportacionTipoRasgoPersonal=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoRasgoPersonal();
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoRasgoPersonal")) {
				jButtonNuevoTipoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoRasgoPersonal")) {
				jButtonDuplicarTipoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoRasgoPersonal")) {
				jButtonCopiarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoRasgoPersonal")) {
				jButtonVerFormTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoRasgoPersonal")) {
				jButtonNuevoTipoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoRasgoPersonal")) {
				jButtonDuplicarTipoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoRasgoPersonal")) {
				jButtonNuevoTipoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoRasgoPersonal")) {
				jButtonDuplicarTipoRasgoPersonalActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoRasgoPersonal")) {
				jButtonNuevoTipoRasgoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoRasgoPersonal")) {
				jButtonNuevoTipoRasgoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoRasgoPersonal")) {
				jButtonNuevoTipoRasgoPersonalActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoRasgoPersonal")) {
				jButtonModificarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoRasgoPersonal")) {
				jButtonModificarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoRasgoPersonal")) {
				jButtonModificarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoRasgoPersonal")) {
				jButtonActualizarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoRasgoPersonal")) {
				jButtonActualizarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoRasgoPersonal")) {
				jButtonActualizarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoRasgoPersonal")) {
				jButtonEliminarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoRasgoPersonal")) {
				jButtonEliminarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoRasgoPersonal")) {
				jButtonEliminarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoRasgoPersonal")) {
				jButtonCancelarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoRasgoPersonal")) {
				jButtonCancelarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoRasgoPersonal")) {
				jButtonCancelarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoRasgoPersonal")) {
				jButtonCerrarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoRasgoPersonal")) {
				jButtonCerrarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoRasgoPersonal")) {
				jButtonCerrarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoRasgoPersonal")) {
				jButtonMostrarOcultarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoRasgoPersonal")) {
				jButtonCancelarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoRasgoPersonal")) {
				jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoRasgoPersonal")) {
				jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoRasgoPersonal")) {
				jButtonCopiarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoRasgoPersonal")) {
				jButtonVerFormTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoRasgoPersonal")) {
				jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoRasgoPersonal")) {
				jButtonCopiarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoRasgoPersonal")) {
				jButtonVerFormTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoRasgoPersonal")) {
				jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoRasgoPersonal")) {
				jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoRasgoPersonal")) {
				jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoRasgoPersonal")) {
				jButtonRecargarInformacionTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoRasgoPersonal")) {
				jButtonRecargarInformacionTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoRasgoPersonal")) {
				jButtonRecargarInformacionTipoRasgoPersonalActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoRasgoPersonal")) {
				jButtonAnterioresTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoRasgoPersonal")) {
				jButtonAnterioresTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoRasgoPersonal")) {
				jButtonAnterioresTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoRasgoPersonal")) {
				jButtonSiguientesTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoRasgoPersonal")) {
				jButtonSiguientesTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoRasgoPersonal")) {
				jButtonSiguientesTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoRasgoPersonal") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoRasgoPersonal")) {
				jButtonAbrirOrderByTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoRasgoPersonal") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoRasgoPersonal")) {
				jButtonMostrarOcultarTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRasgoPersonal")) {
				jButtonNuevoGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoRasgoPersonal")) {
				jButtonNuevoGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoRasgoPersonal")) {
				jButtonNuevoGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoRasgoPersonal")) {
				jButtonCerrarReporteDinamicoTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoRasgoPersonal")) {
				jButtonGenerarReporteDinamicoTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoRasgoPersonal")) {
				
				jButtonGenerarExcelReporteDinamicoTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoRasgoPersonal")) {
				jButtonCerrarImportacionTipoRasgoPersonalActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoRasgoPersonal")) {
				
				jButtonGenerarImportacionTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoRasgoPersonal")) {
				
				jButtonAbrirImportacionTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoRasgoPersonal")) {
				jComboBoxTiposAccionesTipoRasgoPersonalActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoRasgoPersonal")) {
				jComboBoxTiposRelacionesTipoRasgoPersonalActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoRasgoPersonal")) {
				jComboBoxTiposAccionesTipoRasgoPersonalActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoRasgoPersonal")) {
				
				jComboBoxTiposSeleccionarTipoRasgoPersonalActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoRasgoPersonal")) {
				jTextFieldValorCampoGeneralTipoRasgoPersonalActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoRasgoPersonal")) {
				jButtonAbrirOrderByTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoRasgoPersonal")) {
				jButtonAbrirOrderByTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoRasgoPersonal")) {
				jButtonCerrarOrderByTipoRasgoPersonalActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRasgoPersonalBusqueda")) {
				this.jButtonidTipoRasgoPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRasgoPersonalUpdate")) {
				this.jButtonid_empresaTipoRasgoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRasgoPersonalBusqueda")) {
				this.jButtonid_empresaTipoRasgoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRasgoPersonalBusqueda")) {
				this.jButtoncodigoTipoRasgoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRasgoPersonalBusqueda")) {
				this.jButtonnombreTipoRasgoPersonalBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoRasgoPersonal();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				


				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoRasgoPersonal tiporasgopersonalLocal=null;
			
			if(!this.getEsControlTabla()) {
				tiporasgopersonalLocal=this.tiporasgopersonal;
			} else {
				tiporasgopersonalLocal=this.tiporasgopersonalAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
							
				
				


				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
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
			
			


			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRasgoPersonalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
								
						
				


				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
								
				
				


				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
							
				
				


				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
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
			
			


			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
								
				
				


				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRasgoPersonalActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoRasgoPersonal")) {
					jCheckBoxSeleccionarTodosTipoRasgoPersonalItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoRasgoPersonal")) {
					jCheckBoxSeleccionadosTipoRasgoPersonalItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoRasgoPersonal")) {
					
				}
				
				


				
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
												
				
				


				
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRasgoPersonalActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
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
			
			


			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tiporasgopersonal);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tiporasgopersonal);
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
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
				
				


				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoRasgoPersonal.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoRasgoPersonal.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoRasgoPersonalActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tiporasgopersonalAnterior =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoRasgoPersonal")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoRasgoPersonalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoRasgoPersonal.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tiporasgopersonal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tiporasgopersonal);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoRasgoPersonal")) {
				
				}
				
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoRasgoPersonal")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoRasgoPersonal.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoRasgoPersonal")) {
			
			}
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoRasgoPersonal();
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
			if(sTipo.equals("NuevoTipoRasgoPersonal")) {
				jButtonNuevoTipoRasgoPersonalActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoRasgoPersonal")) {
				jButtonDuplicarTipoRasgoPersonalActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoRasgoPersonal")) {
				jButtonCopiarTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoRasgoPersonal")) {
				jButtonVerFormTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoRasgoPersonal")) {
				jButtonNuevoTipoRasgoPersonalActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoRasgoPersonal")) {
				jButtonModificarTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoRasgoPersonal")) {
				jButtonActualizarTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoRasgoPersonal")) {
				jButtonEliminarTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoRasgoPersonal")) {
				jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoRasgoPersonal")) {
				jButtonCancelarTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoRasgoPersonal")) {
				jButtonCerrarTipoRasgoPersonalActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoRasgoPersonal")) {
				jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoRasgoPersonal")) {
				jButtonNuevoGuardarCambiosTipoRasgoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoRasgoPersonal")) {
				jButtonAbrirOrderByTipoRasgoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoRasgoPersonal")) {
				jButtonRecargarInformacionTipoRasgoPersonalActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoRasgoPersonal")) {
				jButtonAnterioresTipoRasgoPersonalActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoRasgoPersonal")) {
				jButtonSiguientesTipoRasgoPersonalActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoRasgoPersonalBusqueda")) {
				this.jButtonidTipoRasgoPersonalBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoRasgoPersonalUpdate")) {
				this.jButtonid_empresaTipoRasgoPersonalUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoRasgoPersonalBusqueda")) {
				this.jButtonid_empresaTipoRasgoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoRasgoPersonalBusqueda")) {
				this.jButtoncodigoTipoRasgoPersonalBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoRasgoPersonalBusqueda")) {
				this.jButtonnombreTipoRasgoPersonalBusquedaActionPerformed(evt);
			}
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoRasgoPersonal();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoRasgoPersonal")) {
				closingInternalFrameTipoRasgoPersonal();
				
			} else if(sTipo.equals("jButtonCancelarTipoRasgoPersonal")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoRasgoPersonal = (JInternalFrameBase)evt.getSource();
	            	
	            TipoRasgoPersonalBeanSwingJInternalFrame jInternalFrameParent=(TipoRasgoPersonalBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRasgoPersonal.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoRasgoPersonalActionPerformed(null);
			}
			
			TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tiporasgopersonal,new Object(),this.tiporasgopersonalParameterGeneral,this.tiporasgopersonalReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoRasgoPersonal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoRasgoPersonal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoRasgoPersonal(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tiporasgopersonal)) {
			if(!esControlTabla) {
				if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);			
				}
				
				if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporasgopersonalReturnGeneral=tiporasgopersonalLogic.procesarEventosTipoRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporasgopersonalLogic.getTipoRasgoPersonals(),this.tiporasgopersonal,this.tiporasgopersonalParameterGeneral,this.isEsNuevoTipoRasgoPersonal,classes);//this.tiporasgopersonalLogic.getTipoRasgoPersonal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral,this.tiporasgopersonalBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoRasgoPersonal(classes,this.tiporasgopersonalReturnGeneral,this.tiporasgopersonalBean,false);
					}
						
					if(this.tiporasgopersonalReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal());	
					}
						
					if(this.tiporasgopersonalReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal(),classes);//this.tiporasgopersonalBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoRasgoPersonal(this.tiporasgopersonal,classes);//this.tiporasgopersonalBean);									
				}
			
				if(TipoRasgoPersonalJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoRasgoPersonal(this.tiporasgopersonal,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoRasgoPersonal(this.tiporasgopersonal);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tiporasgopersonalAnterior!=null) {
						this.tiporasgopersonal=this.tiporasgopersonalAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tiporasgopersonalReturnGeneral=tiporasgopersonalLogic.procesarEventosTipoRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporasgopersonalLogic.getTipoRasgoPersonals(),this.tiporasgopersonal,this.tiporasgopersonalParameterGeneral,this.isEsNuevoTipoRasgoPersonal,classes);//this.tiporasgopersonalLogic.getTipoRasgoPersonal()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tiporasgopersonalSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tiporasgopersonalSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal(),tiporasgopersonalLogic.getTipoRasgoPersonals());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal(),this.tiporasgopersonals);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoRasgoPersonal.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoRasgoPersonal.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoRasgoPersonal();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoRasgoPersonal() throws Exception {
		
		TipoRasgoPersonalModel tiporasgopersonalModel=(TipoRasgoPersonalModel)this.jTableDatosTipoRasgoPersonal.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tiporasgopersonalModel.tiporasgopersonals=this.tiporasgopersonalLogic.getTipoRasgoPersonals();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tiporasgopersonalModel.tiporasgopersonals=this.tiporasgopersonals;
		}
		
		
		((TipoRasgoPersonalModel) this.jTableDatosTipoRasgoPersonal.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoRasgoPersonal() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettiporasgopersonalAnterior(),this.tiporasgopersonalLogic.getTipoRasgoPersonals());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettiporasgopersonalAnterior(),this.tiporasgopersonals);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoRasgoPersonal();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RasgoPersonal.class)) {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.setRasgoPersonals(tiporasgopersonal.getRasgoPersonals());
					this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaRasgoPersonal(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
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
										
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporasgopersonal,new Object(),generalEntityParameterGeneral,this.tiporasgopersonalReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoRasgoPersonalConstantesFunciones.getClassesRelationshipsOfTipoRasgoPersonal(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoRasgoPersonalConstantesFunciones.getClassesRelationshipsFromStringsOfTipoRasgoPersonal(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoRasgoPersonal(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoRasgoPersonalBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tiporasgopersonal,new Object(),generalEntityParameterGeneral,this.tiporasgopersonalReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoRasgoPersonal(TipoRasgoPersonalBean tiporasgopersonalBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(RasgoPersonal.class)) {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.setRasgoPersonals(tiporasgopersonal.getRasgoPersonals());
					this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.inicializarActualizarBindingTablaRasgoPersonal(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoRasgoPersonal(ArrayList<Classe> classes,TipoRasgoPersonalReturnGeneral tiporasgopersonalReturnGeneral,TipoRasgoPersonalBean tiporasgopersonalBean,Boolean conDefault) throws Exception {
		
			this.tiporasgopersonalBean.setRasgoPersonals(tiporasgopersonalReturnGeneral.getTipoRasgoPersonal().getRasgoPersonals());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(RasgoPersonal.class)) {
					tiporasgopersonal.setRasgoPersonals(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalBeanSwingJInternalFrame.rasgopersonalLogic.getRasgoPersonals());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tiporasgopersonal)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal = new TipoRasgoPersonalDetalleFormJInternalFrame(jDesktopPane,this.tiporasgopersonalSessionBean.getConGuardarRelaciones(),this.tiporasgopersonalSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.setVisible(false);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.tiporasgopersonalLogic=this.tiporasgopersonalLogic;
		
		this.cargarCombosFrameForeignKeyTipoRasgoPersonal("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoRasgoPersonal();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoRasgoPersonal();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoRasgoPersonal("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoRasgoPersonal();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRasgoPersonal"));
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"ModificarTipoRasgoPersonal"));

		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarToolBarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRasgoPersonal"));
					
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemModificarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRasgoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"ActualizarTipoRasgoPersonal"));
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarToolBarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRasgoPersonal"));
						
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemActualizarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRasgoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"EliminarTipoRasgoPersonal"));
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRasgoPersonal"));
								
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemEliminarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRasgoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CancelarTipoRasgoPersonal"));
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRasgoPersonal"));
					
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemCancelarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRasgoPersonal"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemDetalleCerrarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRasgoPersonal"));		
		
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRasgoPersonal"));
		
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRasgoPersonal"));
		
		
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRasgoPersonal"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonidTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonid_empresaTipoRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonid_empresaTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtoncodigoTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonnombreTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRasgoPersonalBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRasgoPersonal"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoRasgoPersonal"));
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoRasgoPersonal"));
		}
		
		this.jTableDatosTipoRasgoPersonal.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoRasgoPersonal"));
		
		this.jTableDatosTipoRasgoPersonal.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoRasgoPersonal"));
		
		this.jButtonNuevoTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"NuevoTipoRasgoPersonal"));
		
		this.jButtonDuplicarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"DuplicarTipoRasgoPersonal"));
		
		this.jButtonCopiarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"CopiarTipoRasgoPersonal"));
		
		this.jButtonVerFormTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"VerFormTipoRasgoPersonal"));
		
		
		this.jButtonNuevoToolBarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoRasgoPersonal"));
			
		this.jButtonDuplicarToolBarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoRasgoPersonal"));
			
		this.jMenuItemNuevoTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoRasgoPersonal"));
			
		this.jMenuItemDuplicarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoRasgoPersonal"));		
		
		
		this.jButtonNuevoRelacionesTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoRasgoPersonal"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoRasgoPersonal"));
			
		this.jMenuItemNuevoRelacionesTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoRasgoPersonal"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"ModificarTipoRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonModificarToolBarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoRasgoPersonal"));
			
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemModificarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoRasgoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"ActualizarTipoRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonActualizarToolBarTipoRasgoPersonal.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoRasgoPersonal"));
				
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemActualizarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoRasgoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"EliminarTipoRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonEliminarToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoRasgoPersonal"));
						
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemEliminarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoRasgoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CancelarTipoRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonCancelarToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoRasgoPersonal"));
			
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemCancelarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoRasgoPersonal"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoRasgoPersonal"));		
		
		
		this.jButtonCerrarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CerrarTipoRasgoPersonal"));
		
		
		this.jButtonCerrarToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoRasgoPersonal"));
			
		this.jMenuItemCerrarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoRasgoPersonal"));
			
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jMenuItemDetalleCerrarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoRasgoPersonal"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoRasgoPersonal"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoRasgoPersonal"));
		}
		
		this.jButtonCopiarToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoRasgoPersonal"));
			
		this.jButtonVerFormToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoRasgoPersonal"));
		
		this.jMenuItemGuardarCambiosTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoRasgoPersonal"));
			
		this.jMenuItemCopiarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoRasgoPersonal"));		
		
		this.jMenuItemVerFormTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoRasgoPersonal"));		
		
		
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRasgoPersonal"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoRasgoPersonal"));
			
		this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoRasgoPersonal"));		
		
		
		
		this.jButtonRecargarInformacionTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoRasgoPersonal"));
					
		this.jButtonRecargarInformacionToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoRasgoPersonal"));
		
		this.jMenuItemRecargarInformacionTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoRasgoPersonal"));		
		
		
		
		this.jButtonAnterioresTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"AnterioresTipoRasgoPersonal"));
		
		
		this.jButtonAnterioresToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoRasgoPersonal"));
		
		this.jMenuItemAnterioresTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoRasgoPersonal"));		
		
		
		this.jButtonSiguientesTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"SiguientesTipoRasgoPersonal"));
		
		
		this.jButtonSiguientesToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoRasgoPersonal"));
			
		this.jMenuItemSiguientesTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoRasgoPersonal"));
			
		this.jMenuItemAbrirOrderByTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoRasgoPersonal"));
			
		this.jMenuItemMostrarOcultarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoRasgoPersonal"));
			
		this.jMenuItemDetalleAbrirOrderByTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoRasgoPersonal"));
			
		this.jMenuItemDetalleMostarOcultarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoRasgoPersonal"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoRasgoPersonal"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoRasgoPersonal"));
			
		this.jMenuItemNuevoGuardarCambiosTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoRasgoPersonal"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoRasgoPersonal"));

		this.jCheckBoxSeleccionadosTipoRasgoPersonal.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoRasgoPersonal"));
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoRasgoPersonal"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoRasgoPersonal"));
			
		this.jComboBoxTiposAccionesTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoRasgoPersonal"));
					
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoRasgoPersonal"));
			
		this.jTextFieldValorCampoGeneralTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoRasgoPersonal"));		
		
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonidTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonid_empresaTipoRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonid_empresaTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtoncodigoTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonnombreTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRasgoPersonalBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoRasgoPersonal!=null) {
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRasgoPersonal"));
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRasgoPersonal"));
				this.jInternalFrameReporteDinamicoTipoRasgoPersonal.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRasgoPersonal"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoRasgoPersonal"));				
			//this.jButtonGenerarReporteDinamicoTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoRasgoPersonal"));
			//this.jButtonGenerarExcelReporteDinamicoTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoRasgoPersonal"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoRasgoPersonal!=null) {
				this.jInternalFrameImportacionTipoRasgoPersonal.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoRasgoPersonal"));
				this.jInternalFrameImportacionTipoRasgoPersonal.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoRasgoPersonal"));
				this.jInternalFrameImportacionTipoRasgoPersonal.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoRasgoPersonal"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoRasgoPersonal"));
			
			this.jButtonAbrirOrderByToolBarTipoRasgoPersonal.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoRasgoPersonal"));			
			
			if(this.jInternalFrameOrderByTipoRasgoPersonal!=null) {
				this.jInternalFrameOrderByTipoRasgoPersonal.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoRasgoPersonal"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoRasgoPersonal.jTabbedPaneRelacionesTipoRasgoPersonal.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoRasgoPersonal"));
		
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
            		closingInternalFrameTipoRasgoPersonal();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoRasgoPersonal = (JInternalFrameBase)event.getSource();
	            	
	            TipoRasgoPersonalBeanSwingJInternalFrame jInternalFrameParent=(TipoRasgoPersonalBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoRasgoPersonal.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoRasgoPersonalActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoRasgoPersonal.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoRasgoPersonalListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoRasgoPersonal.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoRasgoPersonal.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRasgoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRasgoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRasgoPersonalActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoRasgoPersonal";
		inputMap = this.jButtonNuevoTipoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRasgoPersonalActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRasgoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRasgoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoRasgoPersonalActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoRasgoPersonal";
		inputMap = this.jButtonNuevoRelacionesTipoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoRasgoPersonalActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoRasgoPersonal";
		inputMap = this.jButtonModificarTipoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoRasgoPersonal";
		inputMap = this.jButtonActualizarTipoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoRasgoPersonal";
		inputMap = this.jButtonEliminarTipoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoRasgoPersonal";
		inputMap = this.jButtonCancelarTipoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoRasgoPersonal";
		inputMap = this.jButtonCerrarTipoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoRasgoPersonal";
		inputMap = this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosTipoRasgoPersonal.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonGuardarCambiosTipoRasgoPersonal.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoRasgoPersonalActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoRasgoPersonal.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoRasgoPersonalItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoRasgoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoRasgoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoRasgoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoRasgoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoRasgoPersonal.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoRasgoPersonalActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonidTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"idTipoRasgoPersonalBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonid_empresaTipoRasgoPersonalUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoRasgoPersonalUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonid_empresaTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtoncodigoTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoRasgoPersonalBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jButtonnombreTipoRasgoPersonalBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoRasgoPersonalBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoRasgoPersonal.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoRasgoPersonalActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoRasgoPersonalActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoRasgoPersonal.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoRasgoPersonal(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
					tiporasgopersonalAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonals) {
					tiporasgopersonalAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoRasgoPersonalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRasgoPersonal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
						tiporasgopersonalAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonals) {
						tiporasgopersonalAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonals) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRasgoPersonal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRasgoPersonal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRasgoPersonal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoRasgoPersonalItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoRasgoPersonal(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoRasgoPersonal.getSelectedRows();
			
			TipoRasgoPersonal tiporasgopersonalLocal=new TipoRasgoPersonal();
			
			//this.seleccionarTodosTipoRasgoPersonal(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tiporasgopersonalLocal =(TipoRasgoPersonal) this.tiporasgopersonalLogic.getTipoRasgoPersonals().toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tiporasgopersonalLocal =(TipoRasgoPersonal) this.tiporasgopersonals.toArray()[this.jTableDatosTipoRasgoPersonal.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tiporasgopersonalLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
						tiporasgopersonalAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonals) {
						tiporasgopersonalAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoRasgoPersonal.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoRasgoPersonal.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoRasgoPersonal,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoRasgoPersonalItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoRasgoPersonalParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoRasgoPersonalActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoRasgoPersonal(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoRasgoPersonal.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonalLogic.getTipoRasgoPersonals()) {
				
						if(sTipoSeleccionar.equals(TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporasgopersonalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporasgopersonalAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonals) {
					
						if(sTipoSeleccionar.equals(TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tiporasgopersonalAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tiporasgopersonalAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoRasgoPersonalActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoRasgoPersonal(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoRasgoPersonal=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoRasgoPersonal.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoRasgoPersonal) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoRasgoPersonal(conSplash);
				
					this.generarReporteTipoRasgoPersonalsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoRasgoPersonalsSeleccionados();
				//this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRasgoPersonalsSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoRasgoPersonalsSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRasgoPersonal();
				
				this.exportarTipoRasgoPersonalsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoRasgoPersonals();
				//this.importarTipoRasgoPersonals();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoRasgoPersonal();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoRasgoPersonalsSeleccionados();
				//this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Rasgo Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoRasgoPersonal();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoRasgoPersonal)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoRasgoPersonal(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoRasgoPersonalBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoRasgoPersonal) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoRasgoPersonal(conSplash);
					
						//this.actualizarParametrosGeneralTipoRasgoPersonal();
						
						this.generarReporteProcesoAccionTipoRasgoPersonalsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoRasgoPersonalBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Rasgo PersonalES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Rasgo Personal", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoRasgoPersonal();
				
						this.actualizarParametrosGeneralTipoRasgoPersonal();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tiporasgopersonalReturnGeneral=tiporasgopersonalLogic.procesarAccionTipoRasgoPersonalsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tiporasgopersonalLogic.getTipoRasgoPersonals(),this.tiporasgopersonalParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoRasgoPersonalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoRasgoPersonal();
					
					TipoRasgoPersonalBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoRasgoPersonalReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoRasgoPersonal.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxTiposAccionesFormularioTipoRasgoPersonal.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoRasgoPersonal(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoRasgoPersonalActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoRasgoPersonal();
			
			if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		
			TipoRasgoPersonal tiporasgopersonal=new TipoRasgoPersonal();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoRasgoPersonal(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoRasgoPersonal.getSelectedItem();
			
			
			
			
			tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
			//this.sTipoAccion;
			
			if(tiporasgopersonalsSeleccionados.size()==1) {
				for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsSeleccionados) {
					tiporasgopersonal=tiporasgopersonalAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Rasgo Personal")) {
					jButtonRasgoPersonalActionPerformed(null,rowIndex,true,false,tiporasgopersonal);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoRasgoPersonal();
			
      		//this.finishProcessTipoRasgoPersonal(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoRasgoPersonalReturnGeneral() throws Exception {
		if(this.tiporasgopersonalReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tiporasgopersonalReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tiporasgopersonalReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tiporasgopersonalReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tiporasgopersonalReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tiporasgopersonalReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoRasgoPersonal(false);
		}
		
		if(this.tiporasgopersonalReturnGeneral.getConRetornoLista() || this.tiporasgopersonalReturnGeneral.getConRetornoObjeto()) {
			if(this.tiporasgopersonalReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporasgopersonalLogic.setTipoRasgoPersonals(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonals());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tiporasgopersonalReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tiporasgopersonalLogic.setTipoRasgoPersonal(this.tiporasgopersonalReturnGeneral.getTipoRasgoPersonal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoRasgoPersonal(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoRasgoPersonal() throws Exception {
		
		
	}
	
	public ArrayList<TipoRasgoPersonal> getTipoRasgoPersonalsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoRasgoPersonal) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalLogic.getTipoRasgoPersonals()) {
					if(tiporasgopersonalAux.getIsSelected()) {
						tiporasgopersonalsSeleccionados.add(tiporasgopersonalAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoRasgoPersonal tiporasgopersonalAux:this.tiporasgopersonals) {
					if(tiporasgopersonalAux.getIsSelected()) {
						tiporasgopersonalsSeleccionados.add(tiporasgopersonalAux);				
					}
				}
			}
			
			if(tiporasgopersonalsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tiporasgopersonalsSeleccionados.addAll(this.tiporasgopersonalLogic.getTipoRasgoPersonals());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tiporasgopersonalsSeleccionados.addAll(this.tiporasgopersonals);				
					}
				}
			}
		} else {
			tiporasgopersonalsSeleccionados.add(this.tiporasgopersonal);
		}
		
		return tiporasgopersonalsSeleccionados;
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
	
	public void generarReporteTipoRasgoPersonalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoRasgoPersonalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoRasgoPersonalsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRasgoPersonalsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoRasgoPersonalsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoRasgoPersonalsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Rasgo Personal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoRasgoPersonals("Todos",tiporasgopersonalsSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoRasgoPersonals("Todos",tiporasgopersonalsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoRasgoPersonalsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoRasgoPersonals("Todos",tiporasgopersonalsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoRasgoPersonal();
		
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoRasgoPersonal();
		
		
		//this.generarReporteTipoRasgoPersonals("Todos",tiporasgopersonalsSeleccionados ,tiporasgopersonalImplementable,tiporasgopersonalImplementableHome);
	}
	
	public void mostrarImportacionTipoRasgoPersonals() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoRasgoPersonal();
		
		this.abrirFrameImportacionTipoRasgoPersonal();		
		
			
		//this.generarReporteTipoRasgoPersonals("Todos",tiporasgopersonalsSeleccionados ,tiporasgopersonalImplementable,tiporasgopersonalImplementableHome);
	}
	
	public void importarTipoRasgoPersonals() throws Exception {		
	
	}
	
	public void exportarTipoRasgoPersonalsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoRasgoPersonalsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoRasgoPersonalsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoRasgoPersonalsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Rasgo Personal",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporasgopersonal."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoRasgoPersonal(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoRasgoPersonal(tiporasgopersonalAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tiporasgopersonalAux.setsDetalleGeneralEntityReporte(tiporasgopersonalAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoRasgoPersonal(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoRasgoPersonalConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRasgoPersonalConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tiporasgopersonal.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporasgopersonal.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporasgopersonal.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporasgopersonal.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tiporasgopersonal.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporasgopersonal.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoRasgoPersonals");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoRasgoPersonal(row);				
				iRow++;
			}				
			
			for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoRasgoPersonal(tiporasgopersonalAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoRasgoPersonalsSeleccionados() throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();		
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tiporasgopersonal.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tiporasgopersonals");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tiporasgopersonal");
			//elementRoot.appendChild(element);
		
			for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsSeleccionados) {
				element = document.createElement("tiporasgopersonal");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoRasgoPersonal(tiporasgopersonalAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Rasgo Personal",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoRasgoPersonal(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tiporasgopersonal.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporasgopersonal.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporasgopersonal.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tiporasgopersonal.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoRasgoPersonal(TipoRasgoPersonal tiporasgopersonal,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoRasgoPersonalConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tiporasgopersonal.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoRasgoPersonalConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tiporasgopersonal.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoRasgoPersonalConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tiporasgopersonal.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoRasgoPersonalConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tiporasgopersonal.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoRasgoPersonalConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tiporasgopersonal.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoRasgoPersonalsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados=new ArrayList<TipoRasgoPersonal>();
		
		tiporasgopersonalsSeleccionados=this.getTipoRasgoPersonalsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoRasgoPersonal(tiporasgopersonalsSeleccionados);
		
		this.generarReporteTipoRasgoPersonals("Todos",tiporasgopersonalsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoRasgoPersonal(ArrayList<TipoRasgoPersonal> tiporasgopersonalsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoRasgoPersonal tiporasgopersonalAux:tiporasgopersonalsSeleccionados) {
				tiporasgopersonalAux.setsDetalleGeneralEntityReporte(tiporasgopersonalAux.toString());
			
				if(sTipoSeleccionar.equals(TipoRasgoPersonalConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tiporasgopersonalAux.setsDescripcionGeneralEntityReporte1(tiporasgopersonalAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoRasgoPersonalConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tiporasgopersonalAux.setsDescripcionGeneralEntityReporte1(tiporasgopersonalAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoRasgoPersonalConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tiporasgopersonalAux.setsDescripcionGeneralEntityReporte1(tiporasgopersonalAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoRasgoPersonalConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoRasgoPersonal(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoRasgoPersonal=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=true;
				this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=true;
			}
			
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=true;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=true;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=true;
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=true;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=true;
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;
			this.isVisibilidadCeldaModificarTipoRasgoPersonal=true;
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaCancelarTipoRasgoPersonal=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoRasgoPersonal=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoRasgoPersonalJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=true;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=true;
		} else {
			this.actualizarEstadoPanelsTipoRasgoPersonal(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoRasgoPersonal=false;
			//this.isVisibilidadCeldaVerFormTipoRasgoPersonal=false;
			this.isVisibilidadCeldaDuplicarTipoRasgoPersonal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tiporasgopersonalSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
			this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			if(!tiporasgopersonalSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;												
			}
			
			this.jButtonCerrarTipoRasgoPersonal.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoRasgoPersonal=false;
		}
		
		if(!this.permiteMantenimiento(this.tiporasgopersonal)) {
			this.isVisibilidadCeldaActualizarTipoRasgoPersonal=false;
			this.isVisibilidadCeldaEliminarTipoRasgoPersonal=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoRasgoPersonal() {
		this.isVisibilidadCeldaNuevoTipoRasgoPersonal=false;
		this.isVisibilidadCeldaGuardarCambiosTipoRasgoPersonal=false;
	}
	
	public void actualizarEstadoPanelsTipoRasgoPersonal(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoRasgoPersonal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosTipoRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRasgoPersonal!=null) {
				this.jPanelPaginacionTipoRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoRasgoPersonal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosTipoRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRasgoPersonal!=null) {
				this.jPanelPaginacionTipoRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoRasgoPersonal.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosTipoRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRasgoPersonal!=null) {
				this.jPanelPaginacionTipoRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoRasgoPersonal.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosTipoRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoRasgoPersonal!=null) {
				this.jPanelPaginacionTipoRasgoPersonal.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoRasgoPersonal.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosTipoRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRasgoPersonal!=null) {
				this.jPanelPaginacionTipoRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoRasgoPersonal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosTipoRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRasgoPersonal!=null) {
				this.jPanelPaginacionTipoRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosEdicionTipoRasgoPersonal.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoRasgoPersonal!=null) {
				this.jScrollPanelDatosTipoRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoRasgoPersonal!=null) {
				this.jPanelPaginacionTipoRasgoPersonal.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
					this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tiporasgopersonalSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoRasgoPersonal!=null) {
				this.jTabbedPaneBusquedasTipoRasgoPersonal.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoRasgoPersonal!=null) {
				this.jPanelParametrosReportesTipoRasgoPersonal.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoRasgoPersonalParaRasgoPersonales() throws Exception {
		Boolean isPaginaPopupRasgoPersonal=false;

		try {

			if(this.tiporasgopersonalSessionBean==null) {
				this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean==null) {
				this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean=new RasgoPersonalSessionBean();
			}

			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean.setsPathNavegacionActual(tiporasgopersonalSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+RasgoPersonalConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupRasgoPersonal=this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeRasgoPersonal(true);
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeRasgoPersonal(TipoRasgoPersonalConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean.setisBusquedaDesdeForeignKeySesionTipoRasgoPersonal(true);
			this.jInternalFrameDetalleFormTipoRasgoPersonal.rasgopersonalSessionBean.setlidTipoRasgoPersonalActual(this.idTipoRasgoPersonalActual);

			tiporasgopersonalSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoRasgoPersonal(true);
			tiporasgopersonalSessionBean.setlIdTipoRasgoPersonalActualForeignKey(this.idTipoRasgoPersonalActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoRasgoPersonalSessionBean tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
		
		if(this.tiporasgopersonalSessionBean==null) {
			this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
		}
		
		this.tiporasgopersonalSessionBean.setsUltimaBusquedaTipoRasgoPersonal(this.getsAccionBusqueda());
		this.tiporasgopersonalSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tiporasgopersonalSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tiporasgopersonalSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoRasgoPersonalSessionBean tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
		
		if(this.tiporasgopersonalSessionBean==null) {
			this.tiporasgopersonalSessionBean=new TipoRasgoPersonalSessionBean();
		}
		
		if(this.tiporasgopersonalSessionBean.getsUltimaBusquedaTipoRasgoPersonal()!=null&&!this.tiporasgopersonalSessionBean.getsUltimaBusquedaTipoRasgoPersonal().equals("")) {
			this.setsAccionBusqueda(tiporasgopersonalSessionBean.getsUltimaBusquedaTipoRasgoPersonal());
			this.setiNumeroPaginacion(tiporasgopersonalSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tiporasgopersonalSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tiporasgopersonalSessionBean.getid_empresa());
				tiporasgopersonalSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tiporasgopersonalSessionBean.setsUltimaBusquedaTipoRasgoPersonal("");
		this.tiporasgopersonalSessionBean.setiNumeroPaginacion(TipoRasgoPersonalConstantesFunciones.INUMEROPAGINACION);
		this.tiporasgopersonalSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoRasgoPersonal(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoRasgoPersonal() {
		this.updateBorderResaltarBusquedasFormularioTipoRasgoPersonal();
		this.updateVisibilidadBusquedasFormularioTipoRasgoPersonal();
		this.updateHabilitarBusquedasFormularioTipoRasgoPersonal();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoRasgoPersonal() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoRasgoPersonal.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoRasgoPersonal() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoRasgoPersonal.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoRasgoPersonal() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoRasgoPersonal.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoRasgoPersonal(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoRasgoPersonal.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoRasgoPersonal() throws Exception {

		if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoRasgoPersonal();
		this.updateVisibilidadResaltarControlesFormularioTipoRasgoPersonal();
		this.updateHabilitarResaltarControlesFormularioTipoRasgoPersonal();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoRasgoPersonal() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tiporasgopersonalConstantesFunciones.resaltaridTipoRasgoPersonal!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.setBorder(this.tiporasgopersonalConstantesFunciones.resaltaridTipoRasgoPersonal);}
		if(this.tiporasgopersonalConstantesFunciones.resaltarid_empresaTipoRasgoPersonal!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setBorder(this.tiporasgopersonalConstantesFunciones.resaltarid_empresaTipoRasgoPersonal);}
		if(this.tiporasgopersonalConstantesFunciones.resaltarcodigoTipoRasgoPersonal!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextFieldcodigoTipoRasgoPersonal.setBorder(this.tiporasgopersonalConstantesFunciones.resaltarcodigoTipoRasgoPersonal);}
		if(this.tiporasgopersonalConstantesFunciones.resaltarnombreTipoRasgoPersonal!=null && this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextAreanombreTipoRasgoPersonal.setBorder(this.tiporasgopersonalConstantesFunciones.resaltarnombreTipoRasgoPersonal);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoRasgoPersonal() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
	
		//this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.setVisible(this.tiporasgopersonalConstantesFunciones.mostraridTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jPanelidTipoRasgoPersonal.setVisible(this.tiporasgopersonalConstantesFunciones.mostraridTipoRasgoPersonal);
		//this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setVisible(this.tiporasgopersonalConstantesFunciones.mostrarid_empresaTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jPanelid_empresaTipoRasgoPersonal.setVisible(this.tiporasgopersonalConstantesFunciones.mostrarid_empresaTipoRasgoPersonal);
		//this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextFieldcodigoTipoRasgoPersonal.setVisible(this.tiporasgopersonalConstantesFunciones.mostrarcodigoTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jPanelcodigoTipoRasgoPersonal.setVisible(this.tiporasgopersonalConstantesFunciones.mostrarcodigoTipoRasgoPersonal);
		//this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextAreanombreTipoRasgoPersonal.setVisible(this.tiporasgopersonalConstantesFunciones.mostrarnombreTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jPanelnombreTipoRasgoPersonal.setVisible(this.tiporasgopersonalConstantesFunciones.mostrarnombreTipoRasgoPersonal);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoRasgoPersonal() throws Exception {
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoRasgoPersonal!=null) {
	
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jLabelidTipoRasgoPersonal.setEnabled(this.tiporasgopersonalConstantesFunciones.activaridTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jComboBoxid_empresaTipoRasgoPersonal.setEnabled(this.tiporasgopersonalConstantesFunciones.activarid_empresaTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextFieldcodigoTipoRasgoPersonal.setEnabled(this.tiporasgopersonalConstantesFunciones.activarcodigoTipoRasgoPersonal);
		this.jInternalFrameDetalleFormTipoRasgoPersonal.jTextAreanombreTipoRasgoPersonal.setEnabled(this.tiporasgopersonalConstantesFunciones.activarnombreTipoRasgoPersonal);
		}
	}
	
		
}