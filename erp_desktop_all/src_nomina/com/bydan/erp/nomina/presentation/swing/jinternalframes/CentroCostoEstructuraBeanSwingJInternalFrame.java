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

import com.bydan.erp.nomina.util.CentroCostoEstructuraConstantesFunciones;
import com.bydan.erp.nomina.util.CentroCostoEstructuraParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CentroCostoEstructuraParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CentroCostoEstructuraBean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CentroCostoEstructuraBeanSwingJInternalFrame extends CentroCostoEstructuraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CentroCostoEstructuraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CentroCostoEstructura> centrocostoestructuraValidator = new ClassValidator<CentroCostoEstructura>(CentroCostoEstructura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CentroCostoEstructura centrocostoestructura;	
	public CentroCostoEstructura centrocostoestructuraAux;
	public CentroCostoEstructura centrocostoestructuraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CentroCostoEstructura centrocostoestructuraTotales;
	public Long idCentroCostoEstructuraActual;
	public Long iIdNuevoCentroCostoEstructura=0L;
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

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
	}

	public String sFinalQueryComboCentroCosto="";

	public List<CentroCosto> centrocostosForeignKey;

	public List<CentroCosto> getcentrocostosForeignKey() {
		return centrocostosForeignKey;
	}

	public void setcentrocostosForeignKey(List<CentroCosto> centrocostosForeignKey) {
		this.centrocostosForeignKey = centrocostosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CentroCosto centrocostoForeignKey;

	public CentroCosto getcentrocostoForeignKey() {
		return centrocostoForeignKey;
	}

	public void setcentrocostoForeignKey(CentroCosto centrocostoForeignKey) {
		this.centrocostoForeignKey = centrocostoForeignKey;
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
	
	public Boolean isPermisoTodoCentroCostoEstructura;
	public Boolean isPermisoNuevoCentroCostoEstructura;
	public Boolean isPermisoActualizarCentroCostoEstructura;
	public Boolean isPermisoActualizarOriginalCentroCostoEstructura;
	public Boolean isPermisoEliminarCentroCostoEstructura;
	public Boolean isPermisoGuardarCambiosCentroCostoEstructura;
	public Boolean isPermisoConsultaCentroCostoEstructura;
	public Boolean isPermisoBusquedaCentroCostoEstructura;
	public Boolean isPermisoReporteCentroCostoEstructura;
	public Boolean isPermisoPaginacionMedioCentroCostoEstructura;
	public Boolean isPermisoPaginacionAltoCentroCostoEstructura;
	public Boolean isPermisoPaginacionTodoCentroCostoEstructura;
	public Boolean isPermisoCopiarCentroCostoEstructura;
	public Boolean isPermisoVerFormCentroCostoEstructura;
	public Boolean isPermisoDuplicarCentroCostoEstructura;
	public Boolean isPermisoOrdenCentroCostoEstructura;
	
	
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
	
	public CentroCostoEstructuraParameterReturnGeneral centrocostoestructuraReturnGeneral;
	public CentroCostoEstructuraParameterReturnGeneral centrocostoestructuraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCentroCostoEstructura=false;
	public Boolean esParaAccionDesdeFormularioCentroCostoEstructura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CentroCostoEstructuraSessionBeanAdditional centrocostoestructuraSessionBeanAdditional=null;
	
	public CentroCostoEstructuraSessionBeanAdditional getCentroCostoEstructuraSessionBeanAdditional() {
		return this.centrocostoestructuraSessionBeanAdditional;
	}
	
	public void setCentroCostoEstructuraSessionBeanAdditional(CentroCostoEstructuraSessionBeanAdditional centrocostoestructuraSessionBeanAdditional) {
		try {
			this.centrocostoestructuraSessionBeanAdditional=centrocostoestructuraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CentroCostoEstructuraBeanSwingJInternalFrameAdditional centrocostoestructuraBeanSwingJInternalFrameAdditional=null;
	//public class CentroCostoEstructuraBeanSwingJInternalFrame
	
	public CentroCostoEstructuraBeanSwingJInternalFrameAdditional getCentroCostoEstructuraBeanSwingJInternalFrameAdditional() {
		return this.centrocostoestructuraBeanSwingJInternalFrameAdditional;
	}
	
	public void setCentroCostoEstructuraBeanSwingJInternalFrameAdditional(CentroCostoEstructuraBeanSwingJInternalFrameAdditional centrocostoestructuraBeanSwingJInternalFrameAdditional) {
		try {
			this.centrocostoestructuraBeanSwingJInternalFrameAdditional=centrocostoestructuraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CentroCostoEstructuraLogic centrocostoestructuraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CentroCostoEstructura centrocostoestructuraBean;
	public CentroCostoEstructuraConstantesFunciones centrocostoestructuraConstantesFunciones;
	//public CentroCostoEstructuraParameterReturnGeneral centrocostoestructuraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EstructuraLogic estructuraLogic;
	public CentroCostoLogic centrocostoLogic;
	
	//PARAMETROS
	
	
	//public List<CentroCostoEstructura> centrocostoestructuras;	
	//public List<CentroCostoEstructura> centrocostoestructurasEliminados;
	//public List<CentroCostoEstructura> centrocostoestructurasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCentroCostoEstructura=false;
	public Boolean isVisibilidadCeldaDuplicarCentroCostoEstructura=true;
	public Boolean isVisibilidadCeldaCopiarCentroCostoEstructura=true;
	public Boolean isVisibilidadCeldaVerFormCentroCostoEstructura=true;
	public Boolean isVisibilidadCeldaOrdenCentroCostoEstructura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
	public Boolean isVisibilidadCeldaModificarCentroCostoEstructura=false;
	public Boolean isVisibilidadCeldaActualizarCentroCostoEstructura=false;
	public Boolean isVisibilidadCeldaEliminarCentroCostoEstructura=false;
	public Boolean isVisibilidadCeldaCancelarCentroCostoEstructura=false;
	public Boolean isVisibilidadCeldaGuardarCentroCostoEstructura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=false;	
	
	
	public Boolean isVisibilidadFK_IdCentroCosto=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCentroCostoEstructura() {
		return this.iIdNuevoCentroCostoEstructura;
	}

	public void setiIdNuevoCentroCostoEstructura(Long iIdNuevoCentroCostoEstructura) {
		this.iIdNuevoCentroCostoEstructura = iIdNuevoCentroCostoEstructura;
	}
	
	public Long getidCentroCostoEstructuraActual() {
		return this.idCentroCostoEstructuraActual;
	}

	public void setidCentroCostoEstructuraActual(Long idCentroCostoEstructuraActual) {
		this.idCentroCostoEstructuraActual = idCentroCostoEstructuraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CentroCostoEstructura getcentrocostoestructura() {
		return this.centrocostoestructura;
	}

	public void setcentrocostoestructura(CentroCostoEstructura centrocostoestructura) {
		this.centrocostoestructura = centrocostoestructura;
	}
	
	public CentroCostoEstructura getcentrocostoestructuraAux() {
		return this.centrocostoestructuraAux;
	}

	public void setcentrocostoestructuraAux(CentroCostoEstructura centrocostoestructuraAux) {
		this.centrocostoestructuraAux = centrocostoestructuraAux;
	}				
	
	public CentroCostoEstructura getcentrocostoestructuraAnterior() {
		return this.centrocostoestructuraAnterior;
	}

	public void setcentrocostoestructuraAnterior(CentroCostoEstructura centrocostoestructuraAnterior) {
		this.centrocostoestructuraAnterior = centrocostoestructuraAnterior;
	}	
	
	public CentroCostoEstructura getcentrocostoestructuraTotales() {
		return this.centrocostoestructuraTotales;
	}

	public void setcentrocostoestructuraTotales(CentroCostoEstructura centrocostoestructuraTotales) {
		this.centrocostoestructuraTotales = centrocostoestructuraTotales;
	}	
	
	public CentroCostoEstructura getcentrocostoestructuraBean() {
		return this.centrocostoestructuraBean;
	}

	public void setcentrocostoestructuraBean(CentroCostoEstructura centrocostoestructuraBean) {
		this.centrocostoestructuraBean = centrocostoestructuraBean;
	}	
	
	public CentroCostoEstructuraParameterReturnGeneral getcentrocostoestructuraReturnGeneral() {
		return this.centrocostoestructuraReturnGeneral;
	}

	public void setcentrocostoestructuraReturnGeneral(CentroCostoEstructuraParameterReturnGeneral centrocostoestructuraReturnGeneral) {
		this.centrocostoestructuraReturnGeneral = centrocostoestructuraReturnGeneral;
	}	
	
	
	public Long id_centro_costoFK_IdCentroCosto=null;

	public Long getid_centro_costoFK_IdCentroCosto() {
		return this.id_centro_costoFK_IdCentroCosto;
	}

	public void setid_centro_costoFK_IdCentroCosto(Long id_centro_costoFK_IdCentroCosto) {
		this.id_centro_costoFK_IdCentroCosto = id_centro_costoFK_IdCentroCosto;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CentroCostoEstructuraLogic getCentroCostoEstructuraLogic()	{		
		return centrocostoestructuraLogic;
	}

	public void setCentroCostoEstructuraLogic(CentroCostoEstructuraLogic centrocostoestructuraLogic) {
		this.centrocostoestructuraLogic = centrocostoestructuraLogic;
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
	
	public Boolean getIsEsNuevoCentroCostoEstructura() {
		return isEsNuevoCentroCostoEstructura;
	}

	public void setIsEsNuevoCentroCostoEstructura(Boolean isEsNuevoCentroCostoEstructura) {
		this.isEsNuevoCentroCostoEstructura = isEsNuevoCentroCostoEstructura;
	}

	public Boolean getEsParaAccionDesdeFormularioCentroCostoEstructura() {
		return esParaAccionDesdeFormularioCentroCostoEstructura;
	}
	
	public void setEsParaAccionDesdeFormularioCentroCostoEstructura(Boolean esParaAccionDesdeFormularioCentroCostoEstructura) {
		this.esParaAccionDesdeFormularioCentroCostoEstructura = esParaAccionDesdeFormularioCentroCostoEstructura;
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

			if(this.centrocostoestructuraSessionBean==null) {
				this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
			}

			if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(centrocostoestructuraSessionBean.getlidEmpresaActual());
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

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostoestructuraSessionBean==null) {
				this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
			}

			if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(centrocostoestructuraSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostoestructuraSessionBean==null) {
				this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
			}

			if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(centrocostoestructuraSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

	public void cargarCombosCentroCostosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.centrocostosForeignKey=new ArrayList<CentroCosto>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CentroCostoLogic centrocostoLogic=new CentroCostoLogic();

			//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

			if(this.centrocostoestructuraSessionBean==null) {
				this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
			}

			if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//centrocostoLogic.getCentroCostoDataAccess().setIsForForeingKeyData(true);

					centrocostoLogic.getTodosCentroCostosWithConnection(sFinalQuery,new Pagination());

					this.centrocostosForeignKey=centrocostoLogic.getCentroCostos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCentroCosto(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoLogic.getEntityWithConnection(centrocostoestructuraSessionBean.getlidCentroCostoActual());
					this.centrocostosForeignKey.add(centrocostoLogic.getCentroCosto());
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

					if(this.centrocostoestructura!=null) {
						this.centrocostoestructura.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
						this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCentroCostoEstructura.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCentroCostoEstructuraGenerico)throws Exception
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
				jComboBoxid_empresaCentroCostoEstructuraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCentroCostoEstructuraGenerico!=null && jComboBoxid_empresaCentroCostoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_empresaCentroCostoEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.centrocostoestructura!=null) {
						this.centrocostoestructura.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
						this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCentroCostoEstructura.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setSelectedIndex(0);
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

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCentroCostoEstructuraGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalCentroCostoEstructuraGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCentroCostoEstructuraGenerico!=null && jComboBoxid_sucursalCentroCostoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCentroCostoEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.centrocostoestructura!=null) {
						this.centrocostoestructura.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
						this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraCentroCostoEstructura.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura!=null) {
						jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraCentroCostoEstructuraGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraCentroCostoEstructuraGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraCentroCostoEstructuraGenerico!=null && jComboBoxid_estructuraCentroCostoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_estructuraCentroCostoEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCentroCostoForeignKey(Long idCentroCostoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(centrocostoTemp!=null) {

					if(this.centrocostoestructura!=null) {
						this.centrocostoestructura.setCentroCosto(centrocostoTemp);
					}

					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
						this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setSelectedItem(centrocostoTemp);
					}
				} else {
					//jComboBoxid_centro_costoCentroCostoEstructura.setSelectedItem(centrocostoTemp);
					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.getItemCount()>0) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){
					if(centrocostoTemp!=null && jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura!=null) {
						jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setSelectedItem(centrocostoTemp);
					} else {
						if(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura!=null) {
							//jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setSelectedItem(centrocostoTemp);
							if(jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.getItemCount()>0) {
								jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setSelectedIndex(0);
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

	public String getActualCentroCostoForeignKeyDescripcion(Long idCentroCostoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}


			sDescripcion=CentroCostoConstantesFunciones.getCentroCostoDescripcion(centrocostoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCentroCostoForeignKeyGenerico(Long idCentroCostoSeleccionado,JComboBox jComboBoxid_centro_costoCentroCostoEstructuraGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoTemp=null;

			for(CentroCosto centrocostoAux:centrocostosForeignKey) {
				if(centrocostoAux.getId()!=null && centrocostoAux.getId().equals(idCentroCostoSeleccionado)) {
					centrocostoTemp=centrocostoAux;
					break;
				}
			}

			if(centrocostoTemp!=null) {
				jComboBoxid_centro_costoCentroCostoEstructuraGenerico.setSelectedItem(centrocostoTemp);
			} else {
				if(jComboBoxid_centro_costoCentroCostoEstructuraGenerico!=null && jComboBoxid_centro_costoCentroCostoEstructuraGenerico.getItemCount()>0) {
					jComboBoxid_centro_costoCentroCostoEstructuraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CentroCostoEstructura centrocostoestructura,JComboBox jComboBoxid_empresaCentroCostoEstructuraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCentroCostoEstructuraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCentroCostoEstructuraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				centrocostoestructura.setid_empresa(empresaAux.getId());
				centrocostoestructura.setempresa_descripcion(CentroCostoEstructuraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				centrocostoestructura.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CentroCostoEstructura centrocostoestructura,JComboBox jComboBoxid_sucursalCentroCostoEstructuraGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCentroCostoEstructuraGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCentroCostoEstructuraGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				centrocostoestructura.setid_sucursal(sucursalAux.getId());
				centrocostoestructura.setsucursal_descripcion(CentroCostoEstructuraConstantesFunciones.getSucursalDescripcion(sucursalAux));
				centrocostoestructura.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(CentroCostoEstructura centrocostoestructura,JComboBox jComboBoxid_estructuraCentroCostoEstructuraGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraCentroCostoEstructuraGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraCentroCostoEstructuraGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				centrocostoestructura.setid_estructura(estructuraAux.getId());
				centrocostoestructura.setestructura_descripcion(CentroCostoEstructuraConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				centrocostoestructura.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCentroCostoForeignKey(CentroCostoEstructura centrocostoestructura,JComboBox jComboBoxid_centro_costoCentroCostoEstructuraGenerico)throws Exception
	{
		try
		{
			CentroCosto  centrocostoAux=new CentroCosto();

			if(jComboBoxid_centro_costoCentroCostoEstructuraGenerico==null) {
				centrocostoAux=(CentroCosto)this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.getSelectedItem();
			} else {
				centrocostoAux=(CentroCosto)jComboBoxid_centro_costoCentroCostoEstructuraGenerico.getSelectedItem();
			}

			if(centrocostoAux!=null) {
				centrocostoestructura.setid_centro_costo(centrocostoAux.getId());
				centrocostoestructura.setcentrocosto_descripcion(CentroCostoEstructuraConstantesFunciones.getCentroCostoDescripcion(centrocostoAux));
				centrocostoestructura.setCentroCosto(centrocostoAux);			}
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

					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { 
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { 
					}

					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { 
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { 
					}

					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { 
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { 
					}

					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.addItem(estructura);
							}
						}

						if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCentroCostosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCentroCosto=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { 
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.addItem(centrocosto);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { 
					}

					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCentroCosto") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.removeAllItems();

							for(CentroCosto centrocosto:this.centrocostosForeignKey) {
								this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.addItem(centrocosto);
							}
						}

						if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameCentroCostoForeignKey(CentroCosto centrocosto,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setSelectedItem(centrocosto);
						}
					} else {
						if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setSelectedItem(centrocosto);
						} else {
							this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCentroCostoEstructura() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CentroCostoEstructuraConstantesFunciones.refrescarForeignKeysDescripcionesCentroCostoEstructura(this.centrocostoestructuraLogic.getCentroCostoEstructuras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CentroCostoEstructuraConstantesFunciones.refrescarForeignKeysDescripcionesCentroCostoEstructura(this.centrocostoestructuras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(CentroCosto.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//centrocostoestructuraLogic.setCentroCostoEstructuras(this.centrocostoestructuras);
			centrocostoestructuraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CentroCostoEstructuraParameterReturnGeneral getCentroCostoEstructuraParameterGeneral() {
		return this.centrocostoestructuraParameterGeneral;
	}
	
	public void setCentroCostoEstructuraParameterGeneral(CentroCostoEstructuraParameterReturnGeneral centrocostoestructuraParameterGeneral) {
		this.centrocostoestructuraParameterGeneral = centrocostoestructuraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCentroCostoEstructura() {
		return isPermisoTodoCentroCostoEstructura;
	}

	public void setIsPermisoTodoCentroCostoEstructura(Boolean isPermisoTodoCentroCostoEstructura) {
		this.isPermisoTodoCentroCostoEstructura = isPermisoTodoCentroCostoEstructura;
	}

	public Boolean getIsPermisoNuevoCentroCostoEstructura() {
		return isPermisoNuevoCentroCostoEstructura;
	}

	public void setIsPermisoNuevoCentroCostoEstructura(Boolean isPermisoNuevoCentroCostoEstructura) {
		this.isPermisoNuevoCentroCostoEstructura = isPermisoNuevoCentroCostoEstructura;
	}

	public Boolean getIsPermisoActualizarCentroCostoEstructura() {
		return isPermisoActualizarCentroCostoEstructura;
	}

	public void setIsPermisoActualizarCentroCostoEstructura(Boolean isPermisoActualizarCentroCostoEstructura) {
		this.isPermisoActualizarCentroCostoEstructura = isPermisoActualizarCentroCostoEstructura;
	}

	public Boolean getIsPermisoEliminarCentroCostoEstructura() {
		return isPermisoEliminarCentroCostoEstructura;
	}

	public void setIsPermisoEliminarCentroCostoEstructura(Boolean isPermisoEliminarCentroCostoEstructura) {
		this.isPermisoEliminarCentroCostoEstructura = isPermisoEliminarCentroCostoEstructura;
	}

	public Boolean getIsPermisoGuardarCambiosCentroCostoEstructura() {
		return isPermisoGuardarCambiosCentroCostoEstructura;
	}

	public void setIsPermisoGuardarCambiosCentroCostoEstructura(Boolean isPermisoGuardarCambiosCentroCostoEstructura) {
		this.isPermisoGuardarCambiosCentroCostoEstructura = isPermisoGuardarCambiosCentroCostoEstructura;
	}
	
	public Boolean getIsPermisoConsultaCentroCostoEstructura() {
		return isPermisoConsultaCentroCostoEstructura;
	}

	public void setIsPermisoConsultaCentroCostoEstructura(Boolean isPermisoConsultaCentroCostoEstructura) {
		this.isPermisoConsultaCentroCostoEstructura = isPermisoConsultaCentroCostoEstructura;
	}

	public Boolean getIsPermisoBusquedaCentroCostoEstructura() {
		return isPermisoBusquedaCentroCostoEstructura;
	}

	public void setIsPermisoBusquedaCentroCostoEstructura(Boolean isPermisoBusquedaCentroCostoEstructura) {
		this.isPermisoBusquedaCentroCostoEstructura = isPermisoBusquedaCentroCostoEstructura;
	}

	public Boolean getIsPermisoReporteCentroCostoEstructura() {
		return isPermisoReporteCentroCostoEstructura;
	}

	public void setIsPermisoReporteCentroCostoEstructura(Boolean isPermisoReporteCentroCostoEstructura) {
		this.isPermisoReporteCentroCostoEstructura = isPermisoReporteCentroCostoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionMedioCentroCostoEstructura() {
		return isPermisoPaginacionMedioCentroCostoEstructura;
	}

	public void setIsPermisoPaginacionMedioCentroCostoEstructura(Boolean isPermisoPaginacionMedioCentroCostoEstructura) {
		this.isPermisoPaginacionMedioCentroCostoEstructura = isPermisoPaginacionMedioCentroCostoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionTodoCentroCostoEstructura() {
		return isPermisoPaginacionTodoCentroCostoEstructura;
	}

	public void setIsPermisoPaginacionTodoCentroCostoEstructura(Boolean isPermisoPaginacionTodoCentroCostoEstructura) {
		this.isPermisoPaginacionTodoCentroCostoEstructura = isPermisoPaginacionTodoCentroCostoEstructura;
	}
	
	public Boolean getIsPermisoPaginacionAltoCentroCostoEstructura() {
		return isPermisoPaginacionAltoCentroCostoEstructura;
	}

	public void setIsPermisoPaginacionAltoCentroCostoEstructura(Boolean isPermisoPaginacionAltoCentroCostoEstructura) {
		this.isPermisoPaginacionAltoCentroCostoEstructura = isPermisoPaginacionAltoCentroCostoEstructura;
	}
	
	public Boolean getIsPermisoCopiarCentroCostoEstructura() {
		return isPermisoCopiarCentroCostoEstructura;
	}

	public void setIsPermisoCopiarCentroCostoEstructura(Boolean isPermisoCopiarCentroCostoEstructura) {
		this.isPermisoCopiarCentroCostoEstructura = isPermisoCopiarCentroCostoEstructura;
	}
	
	public Boolean getIsPermisoVerFormCentroCostoEstructura() {
		return isPermisoVerFormCentroCostoEstructura;
	}

	public void setIsPermisoVerFormCentroCostoEstructura(Boolean isPermisoVerFormCentroCostoEstructura) {
		this.isPermisoVerFormCentroCostoEstructura = isPermisoVerFormCentroCostoEstructura;
	}
	
	public Boolean getIsPermisoDuplicarCentroCostoEstructura() {
		return isPermisoDuplicarCentroCostoEstructura;
	}

	public void setIsPermisoDuplicarCentroCostoEstructura(Boolean isPermisoDuplicarCentroCostoEstructura) {
		this.isPermisoDuplicarCentroCostoEstructura = isPermisoDuplicarCentroCostoEstructura;
	}
	
	public Boolean getIsPermisoOrdenCentroCostoEstructura() {
		return isPermisoOrdenCentroCostoEstructura;
	}

	public void setIsPermisoOrdenCentroCostoEstructura(Boolean isPermisoOrdenCentroCostoEstructura) {
		this.isPermisoOrdenCentroCostoEstructura = isPermisoOrdenCentroCostoEstructura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCentroCostoEstructura() {
		return isVisibilidadCeldaNuevoCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaNuevoCentroCostoEstructura(Boolean isVisibilidadCeldaNuevoCentroCostoEstructura) {
		this.isVisibilidadCeldaNuevoCentroCostoEstructura = isVisibilidadCeldaNuevoCentroCostoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCentroCostoEstructura() {
		return isVisibilidadCeldaDuplicarCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaDuplicarCentroCostoEstructura(Boolean isVisibilidadCeldaDuplicarCentroCostoEstructura) {
		this.isVisibilidadCeldaDuplicarCentroCostoEstructura = isVisibilidadCeldaDuplicarCentroCostoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCentroCostoEstructura() {
		return isVisibilidadCeldaCopiarCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaCopiarCentroCostoEstructura(Boolean isVisibilidadCeldaCopiarCentroCostoEstructura) {
		this.isVisibilidadCeldaCopiarCentroCostoEstructura = isVisibilidadCeldaCopiarCentroCostoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCentroCostoEstructura() {
		return isVisibilidadCeldaVerFormCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaVerFormCentroCostoEstructura(Boolean isVisibilidadCeldaVerFormCentroCostoEstructura) {
		this.isVisibilidadCeldaVerFormCentroCostoEstructura = isVisibilidadCeldaVerFormCentroCostoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCentroCostoEstructura() {
		return isVisibilidadCeldaOrdenCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaOrdenCentroCostoEstructura(Boolean isVisibilidadCeldaOrdenCentroCostoEstructura) {
		this.isVisibilidadCeldaOrdenCentroCostoEstructura = isVisibilidadCeldaOrdenCentroCostoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCentroCostoEstructura() {
		return isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCentroCostoEstructura(Boolean isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura) {
		this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura = isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCentroCostoEstructura() {
		return isVisibilidadCeldaModificarCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaModificarCentroCostoEstructura(Boolean isVisibilidadCeldaModificarCentroCostoEstructura) {
		this.isVisibilidadCeldaModificarCentroCostoEstructura = isVisibilidadCeldaModificarCentroCostoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCentroCostoEstructura() {
		return isVisibilidadCeldaActualizarCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaActualizarCentroCostoEstructura(Boolean isVisibilidadCeldaActualizarCentroCostoEstructura) {
		this.isVisibilidadCeldaActualizarCentroCostoEstructura = isVisibilidadCeldaActualizarCentroCostoEstructura;
	}

	public Boolean getIsVisibilidadCeldaEliminarCentroCostoEstructura() {
		return isVisibilidadCeldaEliminarCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaEliminarCentroCostoEstructura(Boolean isVisibilidadCeldaEliminarCentroCostoEstructura) {
		this.isVisibilidadCeldaEliminarCentroCostoEstructura = isVisibilidadCeldaEliminarCentroCostoEstructura;
	}

	public Boolean getIsVisibilidadCeldaCancelarCentroCostoEstructura() {
		return isVisibilidadCeldaCancelarCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaCancelarCentroCostoEstructura(Boolean isVisibilidadCeldaCancelarCentroCostoEstructura) {
		this.isVisibilidadCeldaCancelarCentroCostoEstructura = isVisibilidadCeldaCancelarCentroCostoEstructura;
	}

	public Boolean getIsVisibilidadCeldaGuardarCentroCostoEstructura() {
		return isVisibilidadCeldaGuardarCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaGuardarCentroCostoEstructura(Boolean isVisibilidadCeldaGuardarCentroCostoEstructura) {
		this.isVisibilidadCeldaGuardarCentroCostoEstructura = isVisibilidadCeldaGuardarCentroCostoEstructura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCentroCostoEstructura() {
		return isVisibilidadCeldaGuardarCambiosCentroCostoEstructura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCentroCostoEstructura(Boolean isVisibilidadCeldaGuardarCambiosCentroCostoEstructura) {
		this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura = isVisibilidadCeldaGuardarCambiosCentroCostoEstructura;
	}
		
	public CentroCostoEstructuraSessionBean getcentrocostoestructuraSessionBean() {
		return this.centrocostoestructuraSessionBean;
	}
	
	public void setcentrocostoestructuraSessionBean(CentroCostoEstructuraSessionBean centrocostoestructuraSessionBean) {
		this.centrocostoestructuraSessionBean=centrocostoestructuraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCentroCosto() {
		return this.isVisibilidadFK_IdCentroCosto;
	}

	public void setisVisibilidadFK_IdCentroCosto(Boolean isVisibilidadFK_IdCentroCosto) {
		this.isVisibilidadFK_IdCentroCosto=isVisibilidadFK_IdCentroCosto;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(CentroCostoEstructura centrocostoestructura)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(centrocostoestructura,null);
				this.setActualParaGuardarSucursalForeignKey(centrocostoestructura,null);
				this.setActualParaGuardarEstructuraForeignKey(centrocostoestructura,null);
				this.setActualParaGuardarCentroCostoForeignKey(centrocostoestructura,null);
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
	
	public void bugActualizarReferenciaActual(CentroCostoEstructura centrocostoestructura,CentroCostoEstructura centrocostoestructuraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCentroCostoEstructura(centrocostoestructura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		centrocostoestructuraAux.setId(centrocostoestructura.getId());
		centrocostoestructuraAux.setVersionRow(centrocostoestructura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCentroCostoEstructura();
		
			int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = centrocostoestructuraValidator.getInvalidValues(this.centrocostoestructura);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			centrocostoestructuraLogic.setDatosCliente(datosCliente);
			centrocostoestructuraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				centrocostoestructuraAux=new  CentroCostoEstructura();
				
				centrocostoestructuraAux.setIsNew(true);
				centrocostoestructuraAux.setIsChanged(true);
				
				centrocostoestructuraAux.setCentroCostoEstructuraOriginal(this.centrocostoestructura);
				
				centrocostoestructuraAux.setId(this.centrocostoestructura.getId());	
				centrocostoestructuraAux.setVersionRow(this.centrocostoestructura.getVersionRow());	
				centrocostoestructuraAux.setid_empresa(this.centrocostoestructura.getid_empresa());	
				centrocostoestructuraAux.setid_sucursal(this.centrocostoestructura.getid_sucursal());	
				centrocostoestructuraAux.setid_estructura(this.centrocostoestructura.getid_estructura());	
				centrocostoestructuraAux.setid_centro_costo(this.centrocostoestructura.getid_centro_costo());	
				centrocostoestructuraAux.setporcentaje(this.centrocostoestructura.getporcentaje());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centrocostoestructuraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(centrocostoestructuraAux,centrocostoestructuraLogic.getCentroCostoEstructuras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostoestructuraAux,centrocostoestructuras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraLogic.saveCentroCostoEstructuras();//WithConnection
						//centrocostoestructuraLogic.getSetVersionRowCentroCostoEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centrocostoestructura,centrocostoestructuraAux);
					
					this.refrescarForeignKeysDescripcionesCentroCostoEstructura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostoestructuraLogic.saveCentroCostoEstructuraRelaciones(centrocostoestructuraAux);//WithConnection
								//centrocostoestructuraLogic.getSetVersionRowCentroCostoEstructuras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.centrocostoestructura,centrocostoestructuraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.centrocostoestructuraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(centrocostoestructuraAux,centrocostoestructuraLogic.getCentroCostoEstructuras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(centrocostoestructuraAux,centrocostoestructuras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.centrocostoestructura,centrocostoestructuraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				centrocostoestructuraAux=new  CentroCostoEstructura();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() 
					|| (this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() && this.centrocostoestructura.getId()>=0)) {
						
					centrocostoestructuraAux.setIsNew(false);
				}
				
				centrocostoestructuraAux.setIsDeleted(false);
			
				centrocostoestructuraAux.setId(this.centrocostoestructura.getId());	
				centrocostoestructuraAux.setVersionRow(this.centrocostoestructura.getVersionRow());	
				centrocostoestructuraAux.setid_empresa(this.centrocostoestructura.getid_empresa());	
				centrocostoestructuraAux.setid_sucursal(this.centrocostoestructura.getid_sucursal());	
				centrocostoestructuraAux.setid_estructura(this.centrocostoestructura.getid_estructura());	
				centrocostoestructuraAux.setid_centro_costo(this.centrocostoestructura.getid_centro_costo());	
				centrocostoestructuraAux.setporcentaje(this.centrocostoestructura.getporcentaje());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centrocostoestructuraAux,centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostoestructuraAux,centrocostoestructuras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraLogic.saveCentroCostoEstructuras();//WithConnection
						//centrocostoestructuraLogic.getSetVersionRowCentroCostoEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.centrocostoestructura,centrocostoestructuraAux);
					
					this.refrescarForeignKeysDescripcionesCentroCostoEstructura();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostoestructuraLogic.saveCentroCostoEstructuraRelaciones(centrocostoestructuraAux);//WithConnection
								//centrocostoestructuraLogic.getSetVersionRowCentroCostoEstructuras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.centrocostoestructura,centrocostoestructuraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.centrocostoestructuraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(centrocostoestructuraAux,centrocostoestructuraLogic.getCentroCostoEstructuras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(centrocostoestructuraAux,centrocostoestructuras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.centrocostoestructura,centrocostoestructuraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				centrocostoestructuraAux=new  CentroCostoEstructura();
				
				centrocostoestructuraAux.setIsNew(false);
				centrocostoestructuraAux.setIsChanged(false);
				
				centrocostoestructuraAux.setIsDeleted(true);
				
				centrocostoestructuraAux.setId(this.centrocostoestructura.getId());	
				centrocostoestructuraAux.setVersionRow(this.centrocostoestructura.getVersionRow());	
				centrocostoestructuraAux.setid_empresa(this.centrocostoestructura.getid_empresa());	
				centrocostoestructuraAux.setid_sucursal(this.centrocostoestructura.getid_sucursal());	
				centrocostoestructuraAux.setid_estructura(this.centrocostoestructura.getid_estructura());	
				centrocostoestructuraAux.setid_centro_costo(this.centrocostoestructura.getid_centro_costo());	
				centrocostoestructuraAux.setporcentaje(this.centrocostoestructura.getporcentaje());	
				
				if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.centrocostoestructuraAux.getId()>=0) {	
						this.centrocostoestructurasEliminados.add(centrocostoestructuraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(centrocostoestructuraAux,centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostoestructuraAux,centrocostoestructuras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraLogic.saveCentroCostoEstructuras();//WithConnection
						//centrocostoestructuraLogic.getSetVersionRowCentroCostoEstructuras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								centrocostoestructuraLogic.saveCentroCostoEstructuraRelaciones(centrocostoestructuraAux);//WithConnection
								//centrocostoestructuraLogic.getSetVersionRowCentroCostoEstructuras();//WithConnection
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
							if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.centrocostoestructuraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(centrocostoestructuraAux,centrocostoestructuraLogic.getCentroCostoEstructuras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(centrocostoestructuraAux,centrocostoestructuras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.getCentroCostoEstructuras().addAll(this.centrocostoestructurasEliminados);
					
					centrocostoestructuraLogic.saveCentroCostoEstructuras();//WithConnection
					//centrocostoestructuraLogic.getSetVersionRowCentroCostoEstructuras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCentroCostoEstructura();
				
				this.centrocostoestructurasEliminados= new ArrayList<CentroCostoEstructura>();		
			}
			
			if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Centro Costo Estructura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.centrocostoestructura=centrocostoestructuraAux;
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
      		//this.finishProcessCentroCostoEstructura();
      	}
		
	}	
	
	public void actualizarRelaciones(CentroCostoEstructura centrocostoestructuraLocal) throws Exception {
		
		if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CentroCostoEstructura centrocostoestructuraLocal) throws Exception {	
		if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				centrocostoestructuraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				centrocostoestructuraLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				centrocostoestructuraLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CentroCostoDetalleFormJInternalFrame.class)) {
				CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrameLocal=(CentroCostoBeanSwingJInternalFrame) ((CentroCostoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				centrocostoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCentroCosto(centrocostoBeanSwingJInternalFrameLocal.getcentrocosto(),true);
				centrocostoBeanSwingJInternalFrameLocal.actualizarLista(centrocostoBeanSwingJInternalFrameLocal.centrocosto,this.centrocostosForeignKey);

				centrocostoBeanSwingJInternalFrameLocal.actualizarRelaciones(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				centrocostoestructuraLocal.setCentroCosto(centrocostoBeanSwingJInternalFrameLocal.centrocosto);

				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey("Formulario");
				this.setActualCentroCostoForeignKey(centrocostoBeanSwingJInternalFrameLocal.centrocosto.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCentroCostoEstructuraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = centrocostoestructuraValidator.getInvalidValues(this.centrocostoestructura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CentroCostoEstructura centrocostoestructura,List<CentroCostoEstructura> centrocostoestructuras) throws Exception {
		try	{		
			CentroCostoEstructuraConstantesFunciones.actualizarLista(centrocostoestructura,centrocostoestructuras,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CentroCostoEstructura centrocostoestructura,List<CentroCostoEstructura> centrocostoestructuras) throws Exception {
		try	{			
			CentroCostoEstructuraConstantesFunciones.actualizarSelectedLista(centrocostoestructura,centrocostoestructuras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CentroCostoEstructura> centrocostoestructurasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				centrocostoestructurasLocal=this.centrocostoestructuraLogic.getCentroCostoEstructuras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				centrocostoestructurasLocal=this.centrocostoestructuras;
			}
			//ARCHITECTURE
		
			for(CentroCostoEstructura centrocostoestructuraLocal:centrocostoestructurasLocal) {
				if(this.permiteMantenimiento(centrocostoestructuraLocal) && centrocostoestructuraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CentroCostoEstructuraConstantesFunciones.getCentroCostoEstructuraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CentroCostoEstructuraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelid_empresaCentroCostoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoEstructuraConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelid_sucursalCentroCostoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoEstructuraConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelid_estructuraCentroCostoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoEstructuraConstantesFunciones.IDCENTROCOSTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelid_centro_costoCentroCostoEstructura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CentroCostoEstructuraConstantesFunciones.PORCENTAJE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelporcentajeCentroCostoEstructura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelid_empresaCentroCostoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelid_sucursalCentroCostoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelid_estructuraCentroCostoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelid_centro_costoCentroCostoEstructura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelporcentajeCentroCostoEstructura,"");
		
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
		this.iIdNuevoCentroCostoEstructura--;	
		
		
		this.centrocostoestructuraAux=new CentroCostoEstructura();
		
		this.centrocostoestructuraAux.setId(this.iIdNuevoCentroCostoEstructura);
		this.centrocostoestructuraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.centrocostoestructuraLogic.getCentroCostoEstructuras().add(this.centrocostoestructuraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.centrocostoestructuras.add(this.centrocostoestructuraAux);
		}
		//ARCHITECTURE
		
		this.centrocostoestructura=this.centrocostoestructuraAux;
		
		if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCentroCostoEstructura(this.centrocostoestructura);
			this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoEstructura(this.centrocostoestructura);
		}
				
		//this.setDefaultControlesCentroCostoEstructura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCentroCostoEstructura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCentroCostoEstructura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoEstructura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroCostoEstructura(this.centrocostoestructuraBean,this.centrocostoestructura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
			classes=CentroCostoEstructuraConstantesFunciones.getClassesRelationshipsOfCentroCostoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.centrocostoestructuraReturnGeneral=centrocostoestructuraLogic.procesarEventosCentroCostoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostoestructuraLogic.getCentroCostoEstructuras(),this.centrocostoestructura,this.centrocostoestructuraParameterGeneral,this.isEsNuevoCentroCostoEstructura,classes);//this.centrocostoestructuraLogic.getCentroCostoEstructura()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCentroCostoEstructura(this.centrocostoestructuraReturnGeneral,this.centrocostoestructuraBean,false);
		
		if(this.centrocostoestructuraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoEstructura(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCentroCostoEstructura(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura());
		}
		
		if(this.centrocostoestructuraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCentroCostoEstructura(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura(),classes);//this.centrocostoestructuraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCentroCostoEstructura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCentroCostoEstructura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.RecargarFormCentroCostoEstructura(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCentroCostoEstructura(false);
						
			if(centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoEstructura();
			}
			
			this.actualizarVisualTableDatosCentroCostoEstructura();
			
			this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(this.getIndiceNuevoCentroCostoEstructura(), this.getIndiceNuevoCentroCostoEstructura());
			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
						
			this.actualizarEstadoCeldasBotonesCentroCostoEstructura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCentroCostoEstructura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jTextFieldporcentajeCentroCostoEstructura.setEnabled(isHabilitar && this.centrocostoestructuraConstantesFunciones.activarporcentajeCentroCostoEstructura);	
		//
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setEnabled(isHabilitar && this.centrocostoestructuraConstantesFunciones.activarid_empresaCentroCostoEstructura);//
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setEnabled(isHabilitar && this.centrocostoestructuraConstantesFunciones.activarid_sucursalCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setEnabled(isHabilitar && this.centrocostoestructuraConstantesFunciones.activarid_estructuraCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setEnabled(isHabilitar && this.centrocostoestructuraConstantesFunciones.activarid_centro_costoCentroCostoEstructura);
	};
	
	public void setDefaultControlesCentroCostoEstructura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCentroCostoEstructura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.centrocostoestructuraSessionBean.setConGuardarRelaciones(true);			
			this.centrocostoestructuraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.setVisible(true);
			
					
		} else {
			//this.centrocostoestructuraSessionBean.setConGuardarRelaciones(false);			
			this.centrocostoestructuraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCentroCostoEstructura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
				if(centrocostoestructuraAux.getId().equals(this.iIdNuevoCentroCostoEstructura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuras) {
				if(centrocostoestructuraAux.getId().equals(this.iIdNuevoCentroCostoEstructura)) {
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
	
	public int getIndiceActualCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
				if(centrocostoestructuraAux.getId().equals(centrocostoestructura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuras) {
				if(centrocostoestructuraAux.getId().equals(centrocostoestructura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCentroCostoEstructura(CentroCostoEstructura centrocostoestructuraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
				if(centrocostoestructuraAux.getCentroCostoEstructuraOriginal().getId().equals(centrocostoestructuraOriginal.getId())) {
					existe=true;
					centrocostoestructuraOriginal.setId(centrocostoestructuraAux.getId());
					centrocostoestructuraOriginal.setVersionRow(centrocostoestructuraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuras) {
				if(centrocostoestructuraAux.getCentroCostoEstructuraOriginal().getId().equals(centrocostoestructuraOriginal.getId())) {
					existe=true;
					centrocostoestructuraOriginal.setId(centrocostoestructuraAux.getId());
					centrocostoestructuraOriginal.setVersionRow(centrocostoestructuraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCentroCostoEstructura(Boolean esParaCancelar) throws Exception {
		centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
		centrocostoestructuraAux=new CentroCostoEstructura();
		
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
					if(centrocostoestructuraAux.getId()<0) {
						centrocostoestructurasAux.add(centrocostoestructuraAux);
					}		
				}
				this.iIdNuevoCentroCostoEstructura=0L;
				this.centrocostoestructuraLogic.getCentroCostoEstructuras().removeAll(centrocostoestructurasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuras) {
					if(centrocostoestructuraAux.getId()<0) {
						centrocostoestructurasAux.add(centrocostoestructuraAux);
					}		
				}
				this.iIdNuevoCentroCostoEstructura=0L;
				this.centrocostoestructuras.removeAll(centrocostoestructurasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCentroCostoEstructura 
					&& this.centrocostoestructuraLogic.getCentroCostoEstructuras().size()>0
					) {
					centrocostoestructuraAux=this.centrocostoestructuraLogic.getCentroCostoEstructuras().get(this.centrocostoestructuraLogic.getCentroCostoEstructuras().size() - 1);
				
					if(centrocostoestructuraAux.getId()<0) {
						this.centrocostoestructuraLogic.getCentroCostoEstructuras().remove(centrocostoestructuraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCentroCostoEstructura && this.centrocostoestructuras.size()>0) {
					centrocostoestructuraAux=this.centrocostoestructuras.get(this.centrocostoestructuras.size() - 1);
				
					if(centrocostoestructuraAux.getId()<0) {
						this.centrocostoestructuras.remove(centrocostoestructuraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCentroCostoEstructura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(centrocostoestructura.getId()<0) {
				this.centrocostoestructuraLogic.getCentroCostoEstructuras().remove(this.centrocostoestructura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(centrocostoestructura.getId()<0) {
				this.centrocostoestructuras.remove(this.centrocostoestructura);
			}
		}			
	}
	
	public void setEstadosInicialesCentroCostoEstructura(List<CentroCostoEstructura> centrocostoestructurasAux) throws Exception {
		CentroCostoEstructuraConstantesFunciones.setEstadosInicialesCentroCostoEstructura(centrocostoestructurasAux);
	}
	
	public void setEstadosInicialesCentroCostoEstructura(CentroCostoEstructura centrocostoestructuraAux) throws Exception {
		CentroCostoEstructuraConstantesFunciones.setEstadosInicialesCentroCostoEstructura(centrocostoestructuraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCentroCostoEstructuraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCentroCostoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCentroCostoEstructuraActual()) {
				if(!this.isEsNuevoCentroCostoEstructura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCentroCostoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCentroCostoEstructura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCentroCostoEstructuraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Centro Costo Estructura ?", "MANTENIMIENTO DE Centro Costo Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCentroCostoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CentroCostoEstructura centrocostoestructura) throws Exception {
		CentroCostoEstructuraConstantesFunciones.seleccionarAsignar(this.centrocostoestructura,centrocostoestructura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCentroCostoEstructura=this.isPermisoActualizarOriginalCentroCostoEstructura;
			
			
			this.seleccionarAsignar(centrocostoestructura);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CentroCostoEstructuraConstantesFunciones.quitarEspaciosCentroCostoEstructura(this.centrocostoestructura,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCentroCostoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.centrocostoestructuraSessionBean.setsFuncionBusquedaRapida(this.centrocostoestructuraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCentroCostoEstructura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCentroCostoEstructura(esParaCancelar);				
				this.cancelarNuevoCentroCostoEstructura(esParaCancelar);								
			}
			
			this.centrocostoestructura=new CentroCostoEstructura();
			
			this.inicializarCentroCostoEstructura();
			
			this.actualizarEstadoCeldasBotonesCentroCostoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCentroCostoEstructura() throws Exception {
		try {
			CentroCostoEstructuraConstantesFunciones.inicializarCentroCostoEstructura(this.centrocostoestructura);
			
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
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.centrocostoestructuraLogic.getCentroCostoEstructuras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCentroCostoEstructuras(String sAccionBusqueda,List<CentroCostoEstructura> centrocostoestructurasParaReportes) throws Exception {
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
					sPathReporteFinal="CentroCostoEstructura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CentroCostoEstructuraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CentroCostoEstructuraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CentroCostoEstructura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Centro Costo Estructuras");		
		parameters.put("busquedapor", CentroCostoEstructuraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCentroCostoEstructura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CentroCostoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CentroCostoEstructuraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCentroCostoEstructura=new JRBeanArrayDataSource(CentroCostoEstructuraJInternalFrame.TraerCentroCostoEstructuraBeans(centrocostoestructurasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCentroCostoEstructura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CentroCostoEstructuraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CentroCostoEstructuraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CentroCostoEstructuraBean.TraerCentroCostoEstructuraBeans(centrocostoestructurasParaReportes).toArray()));
							
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
				this.generarExcelReporteCentroCostoEstructuras(sAccionBusqueda,sTipoArchivoReporte,centrocostoestructurasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCentroCostoEstructuras(sAccionBusqueda,sTipoArchivoReporte,centrocostoestructurasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCentroCostoEstructuraActionPerformed(null);
					//this.generarExcelReporteCentroCostoEstructuras(sAccionBusqueda,sTipoArchivoReporte,centrocostoestructurasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCentroCostoEstructuras(sAccionBusqueda,sTipoArchivoReporte,centrocostoestructurasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCentroCostoEstructuras(sAccionBusqueda,sTipoArchivoReporte,centrocostoestructurasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCentroCostoEstructuras(sAccionBusqueda,sTipoArchivoReporte,centrocostoestructurasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCentroCostoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoEstructura> centrocostoestructurasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostoestructura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoEstructuras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroCostoEstructura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CentroCostoEstructura centrocostoestructura : centrocostoestructurasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CentroCostoEstructuraConstantesFunciones.generarExcelReporteDataCentroCostoEstructura("NORMAL",row,workbook,centrocostoestructura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCentroCostoEstructura(String sTipo,Row row,Workbook workbook) {
		
		CentroCostoEstructuraConstantesFunciones.generarExcelReporteHeaderCentroCostoEstructura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCentroCostoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoEstructura> centrocostoestructurasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostoestructura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoEstructuras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CentroCostoEstructura centrocostoestructura : centrocostoestructurasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CentroCostoEstructuraConstantesFunciones.getCentroCostoEstructuraDescripcion(centrocostoestructura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostoestructura.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostoestructura.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostoestructura.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostoestructura.getcentrocosto_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(centrocostoestructura.getporcentaje());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCentroCostoEstructuras(String sAccionBusqueda,String sTipoArchivoReporte,List<CentroCostoEstructura> centrocostoestructurasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CentroCostoEstructura> centrocostoestructurasRespaldo=null;
		
		classes=CentroCostoEstructuraConstantesFunciones.getClassesRelationshipsOfCentroCostoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.centrocostoestructuraLogic.setDatosCliente(this.datosCliente);
		this.centrocostoestructuraLogic.setDatosDeep(this.datosDeep);
		this.centrocostoestructuraLogic.setIsConDeep(true);
		
		centrocostoestructurasRespaldo=this.centrocostoestructuraLogic.getCentroCostoEstructuras();
		
		this.centrocostoestructuraLogic.setCentroCostoEstructuras(centrocostoestructurasParaReportes);	
		this.centrocostoestructuraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		centrocostoestructurasParaReportes=this.centrocostoestructuraLogic.getCentroCostoEstructuras();
		this.centrocostoestructuraLogic.setCentroCostoEstructuras(centrocostoestructurasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostoestructura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CentroCostoEstructuras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCentroCostoEstructura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CentroCostoEstructura centrocostoestructura : centrocostoestructurasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCentroCostoEstructura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CentroCostoEstructuraConstantesFunciones.generarExcelReporteDataCentroCostoEstructura("NORMAL",row,workbook,centrocostoestructura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CentroCostoEstructuraConstantesFunciones.getCentroCostoEstructuraDescripcion(centrocostoestructura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCentroCostoEstructura() throws Exception {		
		this.startProcessCentroCostoEstructura(true);
	}
	
	public void startProcessCentroCostoEstructura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCentroCostoEstructura ,this.jPanelParametrosReportesCentroCostoEstructura, this.jScrollPanelDatosCentroCostoEstructura,this.jPanelPaginacionCentroCostoEstructura, this.jScrollPanelDatosEdicionCentroCostoEstructura, this.jPanelAccionesCentroCostoEstructura,this.jPanelAccionesFormularioCentroCostoEstructura,this.jmenuBarCentroCostoEstructura,this.jmenuBarDetalleCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,this.jTtoolBarDetalleCentroCostoEstructura);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroCostoEstructura=this.jTabbedPaneBusquedasCentroCostoEstructura; 
		
		final JPanel jPanelParametrosReportesCentroCostoEstructura=this.jPanelParametrosReportesCentroCostoEstructura;
		//final JScrollPane jScrollPanelDatosCentroCostoEstructura=this.jScrollPanelDatosCentroCostoEstructura;
		final JTable jTableDatosCentroCostoEstructura=this.jTableDatosCentroCostoEstructura;		
		final JPanel jPanelPaginacionCentroCostoEstructura=this.jPanelPaginacionCentroCostoEstructura;
		//final JScrollPane jScrollPanelDatosEdicionCentroCostoEstructura=this.jScrollPanelDatosEdicionCentroCostoEstructura;
		final JPanel jPanelAccionesCentroCostoEstructura=this.jPanelAccionesCentroCostoEstructura;
		
		JPanel jPanelCamposAuxiliarCentroCostoEstructura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCentroCostoEstructura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			jPanelCamposAuxiliarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelCamposCentroCostoEstructura;
			jPanelAccionesFormularioAuxiliarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelAccionesFormularioCentroCostoEstructura;
		}
		
		final JPanel jPanelCamposCentroCostoEstructura=jPanelCamposAuxiliarCentroCostoEstructura;
		final JPanel jPanelAccionesFormularioCentroCostoEstructura=jPanelAccionesFormularioAuxiliarCentroCostoEstructura;
		
		
		final JMenuBar jmenuBarCentroCostoEstructura=this.jmenuBarCentroCostoEstructura;
		final JToolBar jTtoolBarCentroCostoEstructura=this.jTtoolBarCentroCostoEstructura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCentroCostoEstructura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroCostoEstructura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			jmenuBarDetalleAuxiliarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jmenuBarDetalleCentroCostoEstructura;
			jTtoolBarDetalleAuxiliarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jTtoolBarDetalleCentroCostoEstructura;
		}
		
		final JMenuBar jmenuBarDetalleCentroCostoEstructura=jmenuBarDetalleAuxiliarCentroCostoEstructura;
		final JToolBar jTtoolBarDetalleCentroCostoEstructura=jTtoolBarDetalleAuxiliarCentroCostoEstructura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroCostoEstructura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroCostoEstructura;
			processRunnable.jTableDatos=jTableDatosCentroCostoEstructura;
			processRunnable.jPanelCampos=jPanelCamposCentroCostoEstructura;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroCostoEstructura;
			processRunnable.jPanelAcciones=jPanelAccionesCentroCostoEstructura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroCostoEstructura;
			
			
			processRunnable.jmenuBar=jmenuBarCentroCostoEstructura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroCostoEstructura;
			processRunnable.jTtoolBar=jTtoolBarCentroCostoEstructura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroCostoEstructura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroCostoEstructura ,jPanelParametrosReportesCentroCostoEstructura,jTableDatosCentroCostoEstructura, /*jScrollPanelDatosCentroCostoEstructura,*/jPanelCamposCentroCostoEstructura,jPanelPaginacionCentroCostoEstructura, /*jScrollPanelDatosEdicionCentroCostoEstructura,*/ jPanelAccionesCentroCostoEstructura,jPanelAccionesFormularioCentroCostoEstructura,jmenuBarCentroCostoEstructura,jmenuBarDetalleCentroCostoEstructura,jTtoolBarCentroCostoEstructura,jTtoolBarDetalleCentroCostoEstructura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCentroCostoEstructura ,jPanelParametrosReportesCentroCostoEstructura, jScrollPanelDatosCentroCostoEstructura,jPanelPaginacionCentroCostoEstructura, jScrollPanelDatosEdicionCentroCostoEstructura, jPanelAccionesCentroCostoEstructura,jPanelAccionesFormularioCentroCostoEstructura,jmenuBarCentroCostoEstructura,jmenuBarDetalleCentroCostoEstructura,jTtoolBarCentroCostoEstructura,jTtoolBarDetalleCentroCostoEstructura);
						
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
	
	public void finishProcessCentroCostoEstructura() {// throws Exception 
		this.finishProcessCentroCostoEstructura(true);
	}
	
	public void finishProcessCentroCostoEstructura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCentroCostoEstructura ,this.jPanelParametrosReportesCentroCostoEstructura, this.jScrollPanelDatosCentroCostoEstructura,this.jPanelPaginacionCentroCostoEstructura, this.jScrollPanelDatosEdicionCentroCostoEstructura, this.jPanelAccionesCentroCostoEstructura,this.jPanelAccionesFormularioCentroCostoEstructura,this.jmenuBarCentroCostoEstructura,this.jmenuBarDetalleCentroCostoEstructura,this.jTtoolBarCentroCostoEstructura,this.jTtoolBarDetalleCentroCostoEstructura);		
		
		final JTabbedPane jTabbedPaneBusquedasCentroCostoEstructura=this.jTabbedPaneBusquedasCentroCostoEstructura; 
		
		final JPanel jPanelParametrosReportesCentroCostoEstructura=this.jPanelParametrosReportesCentroCostoEstructura;
		//final JScrollPane jScrollPanelDatosCentroCostoEstructura=this.jScrollPanelDatosCentroCostoEstructura;
		final JTable jTableDatosCentroCostoEstructura=this.jTableDatosCentroCostoEstructura;		
		final JPanel jPanelPaginacionCentroCostoEstructura=this.jPanelPaginacionCentroCostoEstructura;
		//final JScrollPane jScrollPanelDatosEdicionCentroCostoEstructura=this.jScrollPanelDatosEdicionCentroCostoEstructura;
		final JPanel jPanelAccionesCentroCostoEstructura=this.jPanelAccionesCentroCostoEstructura;
		
		JPanel jPanelCamposAuxiliarCentroCostoEstructura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCentroCostoEstructura=new JPanel();
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			jPanelCamposAuxiliarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelCamposCentroCostoEstructura;
			jPanelAccionesFormularioAuxiliarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelAccionesFormularioCentroCostoEstructura;
		}
		
		final JPanel jPanelCamposCentroCostoEstructura=jPanelCamposAuxiliarCentroCostoEstructura;
		final JPanel jPanelAccionesFormularioCentroCostoEstructura=jPanelAccionesFormularioAuxiliarCentroCostoEstructura;
		
		
		final JMenuBar jmenuBarCentroCostoEstructura=this.jmenuBarCentroCostoEstructura;		
		final JToolBar jTtoolBarCentroCostoEstructura=this.jTtoolBarCentroCostoEstructura;
				
		JMenuBar jmenuBarDetalleAuxiliarCentroCostoEstructura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCentroCostoEstructura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			jmenuBarDetalleAuxiliarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jmenuBarDetalleCentroCostoEstructura;
			jTtoolBarDetalleAuxiliarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jTtoolBarDetalleCentroCostoEstructura;		
		}
		
		final JMenuBar jmenuBarDetalleCentroCostoEstructura=jmenuBarDetalleAuxiliarCentroCostoEstructura;
		final JToolBar jTtoolBarDetalleCentroCostoEstructura=jTtoolBarDetalleAuxiliarCentroCostoEstructura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCentroCostoEstructura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCentroCostoEstructura;
			processRunnable.jTableDatos=jTableDatosCentroCostoEstructura;
			processRunnable.jPanelCampos=jPanelCamposCentroCostoEstructura;
			processRunnable.jPanelPaginacion=jPanelPaginacionCentroCostoEstructura;
			processRunnable.jPanelAcciones=jPanelAccionesCentroCostoEstructura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCentroCostoEstructura;
			
			
			processRunnable.jmenuBar=jmenuBarCentroCostoEstructura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCentroCostoEstructura;
			processRunnable.jTtoolBar=jTtoolBarCentroCostoEstructura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCentroCostoEstructura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCentroCostoEstructura ,jPanelParametrosReportesCentroCostoEstructura, jTableDatosCentroCostoEstructura,/*jScrollPanelDatosCentroCostoEstructura,*/jPanelCamposCentroCostoEstructura,jPanelPaginacionCentroCostoEstructura, /*jScrollPanelDatosEdicionCentroCostoEstructura,*/ jPanelAccionesCentroCostoEstructura,jPanelAccionesFormularioCentroCostoEstructura,jmenuBarCentroCostoEstructura,jmenuBarDetalleCentroCostoEstructura,jTtoolBarCentroCostoEstructura,jTtoolBarDetalleCentroCostoEstructura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCentroCostoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCentroCostoEstructura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCentroCostoEstructura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCentroCostoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCentroCostoEstructura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCentroCostoEstructura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCentroCostoEstructura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCentroCostoEstructura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCentroCostoEstructura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.centrocostoestructuraConstantesFunciones.getsFinalQueryCentroCostoEstructura();
		String  finalQueryPaginacionTodos=this.centrocostoestructuraConstantesFunciones.getsFinalQueryCentroCostoEstructura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CentroCostoEstructuraConstantesFunciones.getArrayColumnasGlobalesNoCentroCostoEstructura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CentroCostoEstructuraConstantesFunciones.getArrayColumnasGlobalesCentroCostoEstructura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CentroCostoEstructuraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.centrocostoestructurasEliminados= new ArrayList<CentroCostoEstructura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCentroCostoEstructura();
		
				///*CentroCostoEstructuraSessionBean*/this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
			
			if(this.centrocostoestructuraSessionBean==null) {
				this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
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
					this.iNumeroPaginacion=CentroCostoEstructuraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CentroCostoEstructuraConstantesFunciones.getClassesForeignKeysOfCentroCostoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/centrocostoestructura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			centrocostoestructurasAux= new ArrayList<CentroCostoEstructura>();
			
				
			centrocostoestructuraLogic.setDatosCliente(this.datosCliente);
			centrocostoestructuraLogic.setDatosDeep(this.datosDeep);
			centrocostoestructuraLogic.setIsConDeep(true);
			
			
			centrocostoestructuraLogic.getCentroCostoEstructuraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					centrocostoestructuraLogic.getTodosCentroCostoEstructuras(finalQueryGlobal,pagination);
					
					//centrocostoestructuraLogic.getTodosCentroCostoEstructurasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(centrocostoestructuraLogic.getCentroCostoEstructuras()==null|| centrocostoestructuraLogic.getCentroCostoEstructuras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostoestructurasAux= new ArrayList<CentroCostoEstructura>();
							centrocostoestructurasAux.addAll(centrocostoestructuraLogic.getCentroCostoEstructuras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructurasAux= new ArrayList<CentroCostoEstructura>();
							centrocostoestructurasAux.addAll(centrocostoestructuras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostoestructuraLogic.getTodosCentroCostoEstructuras(finalQueryGlobal+"",this.pagination);												
							
							//centrocostoestructuraLogic.getTodosCentroCostoEstructurasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCentroCostoEstructuras("Todos",centrocostoestructuraLogic.getCentroCostoEstructuras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							centrocostoestructuraLogic.setCentroCostoEstructuras(new ArrayList<CentroCostoEstructura>());					
							centrocostoestructuraLogic.getCentroCostoEstructuras().addAll(centrocostoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructuras=new ArrayList<CentroCostoEstructura>();
							centrocostoestructuras.addAll(centrocostoestructurasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCentroCostoEstructura=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCentroCostoEstructura=this.idActual;
				
				} else if(this.idCentroCostoEstructuraActual!=null && this.idCentroCostoEstructuraActual!=0L) {
					idCentroCostoEstructura=idCentroCostoEstructuraActual;
				}
				
					
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndicePorId(idCentroCostoEstructura);
				
				this.centrocostoestructuras=new ArrayList<CentroCostoEstructura>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					centrocostoestructuraLogic.getEntity(idCentroCostoEstructura);
					
					//centrocostoestructuraLogic.getEntityWithConnection(idCentroCostoEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoestructuraLogic.setCentroCostoEstructuras(new ArrayList<CentroCostoEstructura>());
					centrocostoestructuraLogic.getCentroCostoEstructuras().add(centrocostoestructuraLogic.getCentroCostoEstructura());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostoestructuras=new ArrayList<CentroCostoEstructura>();
					this.centrocostoestructuras.add(centrocostoestructura);
				}
				
				if(centrocostoestructuraLogic.getCentroCostoEstructura()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCentroCosto")) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostoestructuraLogic.getCentroCostoEstructuras()==null||centrocostoestructuraLogic.getCentroCostoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostoestructuras==null|| centrocostoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
						centrocostoestructurasAux.addAll(centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
							centrocostoestructurasAux.addAll(centrocostoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdCentroCosto(finalQueryGlobal,pagination,id_centro_costoFK_IdCentroCosto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdCentroCosto(id_centro_costoFK_IdCentroCosto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoEstructuras("FK_IdCentroCosto",centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoEstructuras("FK_IdCentroCosto",centrocostoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraLogic.setCentroCostoEstructuras(new ArrayList<CentroCostoEstructura>());
						centrocostoestructuraLogic.getCentroCostoEstructuras().addAll(centrocostoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructuras=new ArrayList<CentroCostoEstructura>();
							centrocostoestructuras.addAll(centrocostoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostoestructuraLogic.getCentroCostoEstructuras()==null||centrocostoestructuraLogic.getCentroCostoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostoestructuras==null|| centrocostoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
						centrocostoestructurasAux.addAll(centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
							centrocostoestructurasAux.addAll(centrocostoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoEstructuras("FK_IdEmpresa",centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoEstructuras("FK_IdEmpresa",centrocostoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraLogic.setCentroCostoEstructuras(new ArrayList<CentroCostoEstructura>());
						centrocostoestructuraLogic.getCentroCostoEstructuras().addAll(centrocostoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructuras=new ArrayList<CentroCostoEstructura>();
							centrocostoestructuras.addAll(centrocostoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostoestructuraLogic.getCentroCostoEstructuras()==null||centrocostoestructuraLogic.getCentroCostoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostoestructuras==null|| centrocostoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
						centrocostoestructurasAux.addAll(centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
							centrocostoestructurasAux.addAll(centrocostoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoEstructuras("FK_IdEstructura",centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoEstructuras("FK_IdEstructura",centrocostoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraLogic.setCentroCostoEstructuras(new ArrayList<CentroCostoEstructura>());
						centrocostoestructuraLogic.getCentroCostoEstructuras().addAll(centrocostoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructuras=new ArrayList<CentroCostoEstructura>();
							centrocostoestructuras.addAll(centrocostoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=centrocostoestructuraLogic.getCentroCostoEstructuras()==null||centrocostoestructuraLogic.getCentroCostoEstructuras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=centrocostoestructuras==null|| centrocostoestructuras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
						centrocostoestructurasAux.addAll(centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructurasAux=new ArrayList<CentroCostoEstructura>();
							centrocostoestructurasAux.addAll(centrocostoestructuras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CentroCostoEstructuraConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCentroCostoEstructuras("FK_IdSucursal",centrocostoestructuraLogic.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCentroCostoEstructuras("FK_IdSucursal",centrocostoestructuras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraLogic.setCentroCostoEstructuras(new ArrayList<CentroCostoEstructura>());
						centrocostoestructuraLogic.getCentroCostoEstructuras().addAll(centrocostoestructurasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructuras=new ArrayList<CentroCostoEstructura>();
							centrocostoestructuras.addAll(centrocostoestructurasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCentroCostoEstructura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCentroCostoEstructura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centrocostoestructuraLogic.getCentroCostoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostoestructuras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=centrocostoestructuraLogic.getCentroCostoEstructuras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=centrocostoestructuras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CentroCostoEstructura centrocostoestructura) {
		Boolean permite=true;
		
		if(this.centrocostoestructura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CentroCostoEstructuraConstantesFunciones.getOrderByListaCentroCostoEstructura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CentroCostoEstructuraConstantesFunciones.getOrderByListaCentroCostoEstructura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoEstructura centrocostoestructura:centrocostoestructuraLogic.getCentroCostoEstructuras()) {
				if(centrocostoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostoestructuraTotales=centrocostoestructura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoEstructura centrocostoestructura:this.centrocostoestructuras) {
				if(centrocostoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostoestructuraTotales=centrocostoestructura;
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
			this.centrocostoestructuraAux=new CentroCostoEstructura();
			this.centrocostoestructuraAux.setsType(Constantes2.S_TOTALES);
			this.centrocostoestructuraAux.setIsNew(false);
			this.centrocostoestructuraAux.setIsChanged(false);
			this.centrocostoestructuraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CentroCostoEstructuraConstantesFunciones.TotalizarValoresFilaCentroCostoEstructura(this.centrocostoestructuraLogic.getCentroCostoEstructuras(),this.centrocostoestructuraAux);
				
				this.centrocostoestructuraLogic.getCentroCostoEstructuras().add(this.centrocostoestructuraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CentroCostoEstructuraConstantesFunciones.TotalizarValoresFilaCentroCostoEstructura(this.centrocostoestructuras,this.centrocostoestructuraAux);
				
				this.centrocostoestructuras.add(this.centrocostoestructuraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		centrocostoestructuraTotales=new CentroCostoEstructura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centrocostoestructuraLogic.getCentroCostoEstructuras().remove(centrocostoestructuraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.centrocostoestructuras.remove(centrocostoestructuraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		centrocostoestructuraTotales=new CentroCostoEstructura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CentroCostoEstructura centrocostoestructura:centrocostoestructuraLogic.getCentroCostoEstructuras()) {
				if(centrocostoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostoestructuraTotales=centrocostoestructura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroCostoEstructuraConstantesFunciones.TotalizarValoresFilaCentroCostoEstructura(this.centrocostoestructuraLogic.getCentroCostoEstructuras(),centrocostoestructuraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CentroCostoEstructura centrocostoestructura:this.centrocostoestructuras) {
				if(centrocostoestructura.getsType().equals(Constantes2.S_TOTALES)) {
					centrocostoestructuraTotales=centrocostoestructura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CentroCostoEstructuraConstantesFunciones.TotalizarValoresFilaCentroCostoEstructura(this.centrocostoestructuras,centrocostoestructuraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCentroCostoEstructurasFK_IdCentroCosto()throws Exception {
		try {
			sAccionBusqueda="FK_IdCentroCosto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoEstructurasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoEstructurasFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCentroCostoEstructurasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCentroCostoEstructurasFK_IdCentroCosto(String sFinalQuery,Long id_centro_costo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdCentroCosto(sFinalQuery,this.pagination,id_centro_costo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoEstructurasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoEstructurasFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCentroCostoEstructurasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoestructuraLogic.getCentroCostoEstructurasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCentroCostoEstructura() {
		this.isPermisoTodoCentroCostoEstructura=false;
		this.isPermisoNuevoCentroCostoEstructura=false;
		this.isPermisoActualizarCentroCostoEstructura=false;
		this.isPermisoActualizarOriginalCentroCostoEstructura=false;
		this.isPermisoEliminarCentroCostoEstructura=false;
		this.isPermisoGuardarCambiosCentroCostoEstructura=false;
		this.isPermisoConsultaCentroCostoEstructura=false;
		this.isPermisoBusquedaCentroCostoEstructura=false;
		this.isPermisoReporteCentroCostoEstructura=false;		
		this.isPermisoOrdenCentroCostoEstructura=false;		
		this.isPermisoPaginacionMedioCentroCostoEstructura=false;		
		this.isPermisoPaginacionAltoCentroCostoEstructura=false;
		this.isPermisoPaginacionTodoCentroCostoEstructura=false;
		this.isPermisoCopiarCentroCostoEstructura=false;		
		this.isPermisoVerFormCentroCostoEstructura=false;		
		this.isPermisoDuplicarCentroCostoEstructura=false;		
		this.isPermisoOrdenCentroCostoEstructura=false;		
	}
	
	public void setPermisosUsuarioCentroCostoEstructura(Boolean isPermiso) {
		this.isPermisoTodoCentroCostoEstructura=isPermiso;
		this.isPermisoNuevoCentroCostoEstructura=isPermiso;
		this.isPermisoActualizarCentroCostoEstructura=isPermiso;
		this.isPermisoActualizarOriginalCentroCostoEstructura=isPermiso;
		this.isPermisoEliminarCentroCostoEstructura=isPermiso;
		this.isPermisoGuardarCambiosCentroCostoEstructura=isPermiso;
		this.isPermisoConsultaCentroCostoEstructura=isPermiso;
		this.isPermisoBusquedaCentroCostoEstructura=isPermiso;
		this.isPermisoReporteCentroCostoEstructura=isPermiso;
		this.isPermisoOrdenCentroCostoEstructura=isPermiso;		
		this.isPermisoPaginacionMedioCentroCostoEstructura=isPermiso;		
		this.isPermisoPaginacionAltoCentroCostoEstructura=isPermiso;		
		this.isPermisoPaginacionTodoCentroCostoEstructura=isPermiso;		
		this.isPermisoCopiarCentroCostoEstructura=isPermiso;		
		this.isPermisoVerFormCentroCostoEstructura=isPermiso;		
		this.isPermisoDuplicarCentroCostoEstructura=isPermiso;
		this.isPermisoOrdenCentroCostoEstructura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCentroCostoEstructura(Boolean isPermiso) {
		//this.isPermisoTodoCentroCostoEstructura=isPermiso;
		this.isPermisoNuevoCentroCostoEstructura=isPermiso;
		this.isPermisoActualizarCentroCostoEstructura=isPermiso;
		this.isPermisoActualizarOriginalCentroCostoEstructura=isPermiso;
		this.isPermisoEliminarCentroCostoEstructura=isPermiso;
		this.isPermisoGuardarCambiosCentroCostoEstructura=isPermiso;
		//this.isPermisoConsultaCentroCostoEstructura=isPermiso;
		//this.isPermisoBusquedaCentroCostoEstructura=isPermiso;
		//this.isPermisoReporteCentroCostoEstructura=isPermiso;
		//this.isPermisoOrdenCentroCostoEstructura=isPermiso;		
		//this.isPermisoPaginacionMedioCentroCostoEstructura=isPermiso;		
		//this.isPermisoPaginacionAltoCentroCostoEstructura=isPermiso;		
		//this.isPermisoPaginacionTodoCentroCostoEstructura=isPermiso;		
		//this.isPermisoCopiarCentroCostoEstructura=isPermiso;		
		//this.isPermisoDuplicarCentroCostoEstructura=isPermiso;
		//this.isPermisoOrdenCentroCostoEstructura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCentroCostoEstructuraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CentroCostoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCentroCostoEstructura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCentroCostoEstructuraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCentroCostoEstructuraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCentroCostoEstructuraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCentroCostoEstructuraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCentroCostoEstructura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CentroCostoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CentroCostoEstructuraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCentroCostoEstructura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCentroCostoEstructura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCentroCostoEstructura=this.isPermisoActualizarCentroCostoEstructura;
			this.isPermisoEliminarCentroCostoEstructura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCentroCostoEstructura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCentroCostoEstructura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCentroCostoEstructura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCentroCostoEstructura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCentroCostoEstructura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroCostoEstructura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCentroCostoEstructura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCentroCostoEstructura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCentroCostoEstructura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCentroCostoEstructura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCentroCostoEstructura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCentroCostoEstructura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCentroCostoEstructura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCentroCostoEstructura.setToolTipText(this.jTableDatosCentroCostoEstructura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCentroCostoEstructura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCentroCostoEstructura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CentroCostoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CentroCostoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCentroCostoEstructura() throws Exception {
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
	public void inicializarCombosForeignKeyCentroCostoEstructuraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.centrocostosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCentroCostoEstructuraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CentroCostoEstructuraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCentroCostoEstructuraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCostoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CentroCostoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCentroCostoEstructuraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CentroCostoEstructuraParameterReturnGeneral centrocostoestructuraReturnGeneral=new CentroCostoEstructuraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.centrocostoestructuraConstantesFunciones.cargarid_empresaCentroCostoEstructura)
					 || (this.esRecargarFks && this.centrocostoestructuraConstantesFunciones.cargarid_empresaCentroCostoEstructura)) {

					if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+centrocostoestructuraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.centrocostoestructuraConstantesFunciones.cargarid_sucursalCentroCostoEstructura)
					 || (this.esRecargarFks && this.centrocostoestructuraConstantesFunciones.cargarid_sucursalCentroCostoEstructura)) {

					if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+centrocostoestructuraSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.centrocostoestructuraConstantesFunciones.cargarid_estructuraCentroCostoEstructura)
					 || (this.esRecargarFks && this.centrocostoestructuraConstantesFunciones.cargarid_estructuraCentroCostoEstructura)) {

					if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+centrocostoestructuraSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalCentroCosto="";

				if(((this.centrocostosForeignKey==null||this.centrocostosForeignKey.size()<=0) && this.centrocostoestructuraConstantesFunciones.cargarid_centro_costoCentroCostoEstructura)
					 || (this.esRecargarFks && this.centrocostoestructuraConstantesFunciones.cargarid_centro_costoCentroCostoEstructura)) {

					if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CentroCostoConstantesFunciones.getArrayColumnasGlobalesCentroCosto(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCentroCosto=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CentroCostoConstantesFunciones.TABLENAME);

						finalQueryGlobalCentroCosto=Funciones.GetFinalQueryAppend(finalQueryGlobalCentroCosto, "");
						finalQueryGlobalCentroCosto+=CentroCostoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCentroCostosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCentroCosto=" WHERE " + ConstantesSql.ID + "="+centrocostoestructuraSessionBean.getlidCentroCostoActual();
					}
				} else {
					finalQueryGlobalCentroCosto="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				centrocostoestructuraReturnGeneral=centrocostoestructuraLogic.cargarCombosLoteForeignKeyCentroCostoEstructura(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEstructura,finalQueryGlobalCentroCosto);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=centrocostoestructuraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=centrocostoestructuraReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=centrocostoestructuraReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalCentroCosto.equals("NONE")) {
				this.centrocostosForeignKey=centrocostoestructuraReturnGeneral.getcentrocostosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCentroCostoEstructura()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyCentroCosto();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.centrocostoestructuraSessionBean==null) {
				this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
			}

			if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCentroCosto()throws Exception {
		try {

			if(!this.centrocostoestructuraSessionBean.getisBusquedaDesdeForeignKeySesionCentroCosto()) {
				CentroCosto centrocosto=new CentroCosto();
				CentroCostoConstantesFunciones.setCentroCostoDescripcion(centrocosto,Constantes.SMENSAJE_ESCOJA_OPCION);
				centrocosto.setId(null);

				if(!CentroCostoConstantesFunciones.ExisteEnLista(this.centrocostosForeignKey,centrocosto,true)) {

					this.centrocostosForeignKey.add(0,centrocosto);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCentroCostoEstructura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCentroCostoEstructura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCentroCostoEstructura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoEstructura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCentroCostoEstructura(CentroCostoEstructura centrocostoestructura)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(centrocostoestructura.getid_estructura(),false,"Formulario");
			this.setActualCentroCostoForeignKey(centrocostoestructura.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCentroCostoEstructura()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.centrocostoestructuraConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualCentroCostoForeignKey(this.centrocostoestructuraConstantesFunciones.getid_centro_costo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCentroCostoEstructura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCentroCostoEstructura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCentroCostoEstructura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCentroCostoEstructura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCentroCostoEstructura()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameCentroCostosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCentroCostoEstructura(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCentroCostoEstructura()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.getItemCount()>0) {
				this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public CentroCostoEstructuraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CentroCostoEstructuraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CentroCostoEstructuraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean(); 
		this.centrocostoestructuraConstantesFunciones=new CentroCostoEstructuraConstantesFunciones(); 
		this.centrocostoestructuraBean=new CentroCostoEstructura();//(this.centrocostoestructuraConstantesFunciones); 		
		this.centrocostoestructuraReturnGeneral=new CentroCostoEstructuraParameterReturnGeneral(); 
		
		this.centrocostoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.centrocostoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CentroCostoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CentroCostoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CentroCostoEstructuraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCentroCostoEstructura(true);
			
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
			
			this.centrocostoestructuraConstantesFunciones=new CentroCostoEstructuraConstantesFunciones(); 
			this.centrocostoestructuraBean=new CentroCostoEstructura();//this.centrocostoestructuraConstantesFunciones); 			
			this.centrocostoestructuraReturnGeneral=new CentroCostoEstructuraParameterReturnGeneral(); 
		
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Centro Costo Estructura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.centrocostoestructura=new CentroCostoEstructura();
			this.centrocostoestructuras = new ArrayList<CentroCostoEstructura>();
			this.centrocostoestructurasAux = new ArrayList<CentroCostoEstructura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic=new CentroCostoEstructuraLogic();
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}
			
			//this.centrocostoestructuraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.centrocostoestructuraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCentroCostoEstructura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroCostoEstructura);	
					}
					
					if(this.jInternalFrameImportacionCentroCostoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroCostoEstructura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCentroCostoEstructura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCentroCostoEstructura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroCostoEstructura);
				this.jInternalFrameDetalleFormCentroCostoEstructura.setVisible(false);
				this.jInternalFrameDetalleFormCentroCostoEstructura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroCostoEstructura);
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.setVisible(false);
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCentroCostoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCentroCostoEstructura);
					this.jInternalFrameImportacionCentroCostoEstructura.setVisible(false);
					this.jInternalFrameImportacionCentroCostoEstructura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCentroCostoEstructura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCentroCostoEstructura);
					this.jInternalFrameOrderByCentroCostoEstructura.setVisible(false);
					this.jInternalFrameOrderByCentroCostoEstructura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCentroCostoEstructuraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CentroCostoEstructuraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.centrocostoestructuraReturnGeneral=new CentroCostoEstructuraParameterReturnGeneral();
			
			this.centrocostoestructuraParameterGeneral=new CentroCostoEstructuraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.centrocostoestructuraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CentroCostoEstructuraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroCostoEstructuraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),this.centrocostoestructuraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CentroCostoEstructuraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),this.centrocostoestructuraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=false;
			this.isVisibilidadCeldaDuplicarCentroCostoEstructura=true;
			this.isVisibilidadCeldaCopiarCentroCostoEstructura=true;
			this.isVisibilidadCeldaVerFormCentroCostoEstructura=true;
			this.isVisibilidadCeldaOrdenCentroCostoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
			this.isVisibilidadCeldaModificarCentroCostoEstructura=false;
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=false;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=false;
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=false;
			this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=false;
			
			
			this.isVisibilidadFK_IdCentroCosto=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCentroCostoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCentroCostoEstructura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCentroCostoEstructura(false);
			
			this.setPermisosUsuarioCentroCostoEstructura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() 
				|| (this.centrocostoestructuraSessionBean.getEsGuardarRelacionado() && this.centrocostoestructuraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCentroCostoEstructuraClasesRelacionadas();
			}
			
			if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCentroCostoEstructuraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCentroCostoEstructura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCentroCostoEstructura();
			}
			
			if(!this.isPermisoBusquedaCentroCostoEstructura) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCentroCostoEstructura,this.isPermisoPaginacionMedioCentroCostoEstructura,this.isPermisoPaginacionTodoCentroCostoEstructura);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CentroCostoEstructuraConstantesFunciones.getTiposSeleccionarCentroCostoEstructura());
				
				this.tiposColumnasSelect=CentroCostoEstructuraConstantesFunciones.getTiposSeleccionarCentroCostoEstructura(true);
				
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
			//if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCentroCostoEstructura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCentroCostoEstructura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCentroCostoEstructura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoEstructura() ;
			
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
			this.sucursalLogic=new SucursalLogic();
			this.estructuraLogic=new EstructuraLogic();
			this.centrocostoLogic=new CentroCostoLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				centrocostoestructuraImplementable= (CentroCostoEstructuraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroCostoEstructuraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				centrocostoestructuraImplementableHome= (CentroCostoEstructuraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CentroCostoEstructuraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.centrocostoestructuras= new ArrayList<CentroCostoEstructura>();
			this.centrocostoestructurasEliminados= new ArrayList<CentroCostoEstructura>();
						
			this.isEsNuevoCentroCostoEstructura=false;
			this.esParaAccionDesdeFormularioCentroCostoEstructura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.centrocostosForeignKey=new ArrayList<CentroCosto>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCentroCostoEstructura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCentroCostoEstructura();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CentroCostoEstructuraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCentroCostoEstructura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCentroCostoEstructura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCentroCostoEstructura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCentroCostoEstructura();
			}
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCentroCostoEstructura.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCentroCostoEstructura.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCentroCostoEstructura.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCentroCostoEstructura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CentroCostoEstructura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCentroCostoEstructura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCentroCostoEstructura")) {
				iIndex=this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCentroCostoEstructura();	
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
	
	public void cargarCombosForeignKeyCentroCostoEstructura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCentroCostoEstructura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCentroCostoEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCentroCostoEstructuraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCentroCostoEstructura();
		
		this.cargarCombosFrameForeignKeyCentroCostoEstructura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCentroCostoEstructura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCentroCostoEstructura();
		}
	}
	
	

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCentroCosto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCentroCostoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCentroCosto();
				this.cargarCombosFrameCentroCostosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCentroCosto(this.centrocostosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCentroCostoEstructuraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
			
			if(jTableDatosCentroCostoEstructura.getRowCount()>=1) {
				jTableDatosCentroCostoEstructura.removeRowSelectionInterval(0, jTableDatosCentroCostoEstructura.getRowCount()-1);						
			}
			
			this.isEsNuevoCentroCostoEstructura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCentroCostoEstructura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCentroCostoEstructura(true);			
			//this.centrocostoestructura=new CentroCostoEstructura();
			//this.centrocostoestructura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoEstructura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoEstructura() ;
			
			if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoEstructura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.centrocostoestructura);	
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);				
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
			if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CentroCostoEstructura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCentroCostoEstructuraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCentroCostoEstructura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCentroCostoEstructura.getSelectedRows().length;			
			}
			
			centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCentroCostoEstructura--;			
				//CentroCostoEstructura centrocostoestructuraAux= new CentroCostoEstructura();			
				//centrocostoestructuraAux.setId(this.iIdNuevoCentroCostoEstructura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CentroCostoEstructura centrocostoestructuraOrigen=new CentroCostoEstructura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CentroCostoEstructura centrocostoestructuraOrigen : centrocostoestructurasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							centrocostoestructuraOrigen =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							centrocostoestructuraOrigen =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCentroCostoEstructura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.centrocostoestructura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCentroCostoEstructura(centrocostoestructuraOrigen,this.centrocostoestructura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centrocostoestructuraLogic.getCentroCostoEstructuras().add(this.centrocostoestructuraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centrocostoestructuras.add(this.centrocostoestructuraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
				
				this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(this.getIndiceNuevoCentroCostoEstructura(), this.getIndiceNuevoCentroCostoEstructura());
				
				int iLastRow =  this.jTableDatosCentroCostoEstructura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroCostoEstructura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroCostoEstructura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();									
		
			CentroCostoEstructura centrocostoestructuraOrigen=new CentroCostoEstructura();
			CentroCostoEstructura centrocostoestructuraDestino=new CentroCostoEstructura();
				
			centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCentroCostoEstructura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || centrocostoestructurasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCentroCostoEstructura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraOrigen =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centrocostoestructuraOrigen =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						centrocostoestructuraDestino =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						centrocostoestructuraDestino =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				centrocostoestructuraOrigen =centrocostoestructurasSeleccionados.get(0);
				centrocostoestructuraDestino =centrocostoestructurasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCentroCostoEstructura(centrocostoestructuraOrigen,centrocostoestructuraDestino,true,false);
				
				centrocostoestructuraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(centrocostoestructuraDestino,centrocostoestructuraLogic.getCentroCostoEstructuras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(centrocostoestructuraDestino,centrocostoestructuras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
				
				//this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(this.getIndiceNuevoCentroCostoEstructura(), this.getIndiceNuevoCentroCostoEstructura());
				
				int iLastRow =  this.jTableDatosCentroCostoEstructura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCentroCostoEstructura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCentroCostoEstructura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCentroCostoEstructura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCentroCostoEstructura.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCentroCostoEstructura.setVisible(!isVisible);
			this.jPanelPaginacionCentroCostoEstructura.setVisible(!isVisible);
			this.jPanelAccionesCentroCostoEstructura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCentroCostoEstructura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCentroCostoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCentroCostoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCentroCostoEstructura();
			
			this.abrirFrameOrderByCentroCostoEstructura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCentroCostoEstructura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCentroCostoEstructura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroCostoEstructura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCentroCostoEstructura.isMaximum()) {
					this.jInternalFrameDetalleFormCentroCostoEstructura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCentroCostoEstructura.setSize(this.jInternalFrameDetalleFormCentroCostoEstructura.iWidthFormulario,this.jInternalFrameDetalleFormCentroCostoEstructura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCentroCostoEstructura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCentroCostoEstructura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCentroCostoEstructura.isMaximum()) {
						this.jInternalFrameDetalleFormCentroCostoEstructura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCentroCostoEstructura.jContentPaneDetalleCentroCostoEstructura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoEstructura.jContentPaneDetalleCentroCostoEstructura.getWidth(),CentroCostoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoEstructura.jContentPaneDetalleCentroCostoEstructura.getWidth(),CentroCostoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCentroCostoEstructura.jContentPaneDetalleCentroCostoEstructura.getWidth(),CentroCostoEstructuraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCentroCostoEstructura.setVisible(true);
	        this.jInternalFrameDetalleFormCentroCostoEstructura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCentroCostoEstructura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCentroCostoEstructura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCentroCostoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoEstructura,false,this);
				} else {
					this.jInternalFrameOrderByCentroCostoEstructura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCentroCostoEstructura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCentroCostoEstructura);
				this.jInternalFrameOrderByCentroCostoEstructura.setVisible(false);
				this.jInternalFrameOrderByCentroCostoEstructura.setSelected(false);
				
				this.jInternalFrameOrderByCentroCostoEstructura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroCostoEstructura"));
				
				this.inicializarActualizarBindingTablaOrderByCentroCostoEstructura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCentroCostoEstructura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCentroCostoEstructura==null) {
				
				this.jInternalFrameImportacionCentroCostoEstructura=new ImportacionJInternalFrame(CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCentroCostoEstructura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCentroCostoEstructura);
				this.jInternalFrameImportacionCentroCostoEstructura.setVisible(false);
				this.jInternalFrameImportacionCentroCostoEstructura.setSelected(false);


				this.jInternalFrameImportacionCentroCostoEstructura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroCostoEstructura"));
				this.jInternalFrameImportacionCentroCostoEstructura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroCostoEstructura"));
				this.jInternalFrameImportacionCentroCostoEstructura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroCostoEstructura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCentroCostoEstructura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCentroCostoEstructura==null) {
				this.jInternalFrameReporteDinamicoCentroCostoEstructura=new ReporteDinamicoJInternalFrame(CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCentroCostoEstructura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCentroCostoEstructura);
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.setVisible(false);
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoEstructura"));
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoEstructura"));
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoEstructura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoEstructura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCentroCostoEstructura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCentroCostoEstructura);
			
	       	this.jInternalFrameDetalleFormCentroCostoEstructura.setVisible(false);
	        this.jInternalFrameDetalleFormCentroCostoEstructura.setSelected(false);
			
			//this.jInternalFrameDetalleFormCentroCostoEstructura.dispose();
			//this.jInternalFrameDetalleFormCentroCostoEstructura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCentroCostoEstructura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCentroCostoEstructura.setVisible(true);
	        this.jInternalFrameReporteDinamicoCentroCostoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCentroCostoEstructura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCentroCostoEstructura.setVisible(true);
	        this.jInternalFrameImportacionCentroCostoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCentroCostoEstructura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCentroCostoEstructura.setVisible(true);
	        this.jInternalFrameOrderByCentroCostoEstructura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCentroCostoEstructura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCentroCostoEstructura.setVisible(false);
	        this.jInternalFrameOrderByCentroCostoEstructura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCentroCostoEstructura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCentroCostoEstructura.setVisible(false);
	        this.jInternalFrameReporteDinamicoCentroCostoEstructura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCentroCostoEstructura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCentroCostoEstructura.setVisible(false);
	        this.jInternalFrameImportacionCentroCostoEstructura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderCentroCostoEstructura=(TitledBorder)this.jScrollPanelDatosCentroCostoEstructura.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderCentroCostoEstructura.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}

				public void abrirFrameTreeCentroCosto(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeCentroCosto);
						CentroCostoBeanSwingJInternalFrame centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.sTipoBusqueda="CentroCosto";
						}

						centrocostoBeanSwingJInternalFrame.getTodosCentroCostoArbol();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setCentroCostos(centrocostoBeanSwingJInternalFrame.centrocostosArbol);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.CargarTreeCentroCosto();
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setVisible(true);
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						centrocostoBeanSwingJInternalFrame.jInternalFrameTreeCentroCosto.jInternalFrameParent=this;
						TitledBorder titledBorderCentroCostoEstructura=(TitledBorder)this.jScrollPanelDatosCentroCostoEstructura.getBorder();
						TitledBorder titledBorderCentroCosto=(TitledBorder)centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

						titledBorderCentroCosto.setTitle(titledBorderCentroCostoEstructura.getTitle() + " -> Centro Costo");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centrocostoBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(centrocostoBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeCentroCosto(CentroCostoBeanSwingJInternalFrame jInternalFrameTreeCentroCosto) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeCentroCosto);
						jInternalFrameTreeCentroCosto.setVisible(false);
						jInternalFrameTreeCentroCosto.setSelected(false);
						//jInternalFrameTreeCentroCosto.dispose();
						//jInternalFrameTreeCentroCosto=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCentroCostoEstructura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCentroCostoEstructura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCentroCostoEstructura(true);
			//this.isEsNuevoCentroCostoEstructura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCentroCostoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoEstructura(false) ;
			
			if(centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoEstructura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoEstructura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCentroCostoEstructuraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCentroCostoEstructura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCentroCostoEstructura(true);
			//this.isEsNuevoCentroCostoEstructura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.centrocostoestructura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCentroCostoEstructura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCentroCostoEstructura(false) ;
			
			if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCentroCostoEstructura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoEstructura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroCostoEstructura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCentroCosto(List<CentroCosto> centrocostosForeignKey)throws Exception{
		TableColumn tableColumnCentroCosto=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO));
		TableCellEditor tableCellEditorCentroCosto =tableColumnCentroCosto.getCellEditor();

		CentroCostoTableCell centrocostoTableCellFk=(CentroCostoTableCell)tableCellEditorCentroCosto;

		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.setcentrocostosForeignKey(centrocostosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCentroCostoEstructura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//centrocostoTableCellFk.setRowActual(intSelectedRow);
			//centrocostoTableCellFk.setcentrocostosForeignKeyActual(centrocostosForeignKey);
		//}


		if(centrocostoTableCellFk!=null) {
			centrocostoTableCellFk.RecargarCentroCostosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCentroCostoEstructura(false);
			
			//if(!this.isEsNuevoCentroCostoEstructura) {								
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
				
			}
			
			if(this.permiteMantenimiento(this.centrocostoestructura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCentroCostoEstructura=true;
					this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
					this.isEsNuevoCentroCostoEstructura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCentroCostoEstructura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCentroCostoEstructura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroCostoEstructura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoEstructura(false);
				
				this.habilitarDeshabilitarControlesCentroCostoEstructura(false);
			
												
				
				if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCentroCostoEstructura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCentroCostoEstructuraActionPerformed(evt,centrocostoestructuraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCentroCostoEstructura(this.centrocostoestructura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,centrocostoestructuraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.centrocostoestructura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				this.centrocostoestructura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				this.centrocostoestructura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.centrocostoestructura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CentroCostoEstructuraModel) this.jTableDatosCentroCostoEstructura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCentroCostoEstructura=true;
				this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
				this.isEsNuevoCentroCostoEstructura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCentroCostoEstructura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoEstructura(false);
				
				this.habilitarDeshabilitarControlesCentroCostoEstructura(false);
				
				
				
				if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCentroCostoEstructura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCentroCostoEstructura.getRowCount()>=1) {
				jTableDatosCentroCostoEstructura.removeRowSelectionInterval(0, jTableDatosCentroCostoEstructura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCentroCostoEstructura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCentroCostoEstructura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCentroCostoEstructura(false) ;
			
			this.isEsNuevoCentroCostoEstructura=false;
			
			if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCentroCostoEstructura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCentroCostoEstructura(false);
				
				//SI ES MANUAL
				if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCentroCostoEstructura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCentroCostoEstructura--;			
			//CentroCostoEstructura centrocostoestructuraAux= new CentroCostoEstructura();			
			//centrocostoestructuraAux.setId(this.iIdNuevoCentroCostoEstructura);
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCentroCostoEstructura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
			
			this.centrocostoestructura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.centrocostoestructuraLogic.getCentroCostoEstructuras().add(this.centrocostoestructuraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.centrocostoestructuras.add(this.centrocostoestructuraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
			
			this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(this.getIndiceNuevoCentroCostoEstructura(), this.getIndiceNuevoCentroCostoEstructura());
			
			int iLastRow =  this.jTableDatosCentroCostoEstructura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCentroCostoEstructura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCentroCostoEstructura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoEstructura(false);
			
			//SI ES MANUAL
			if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoEstructura();
			}
			
			//this.abrirFrameTreeCentroCostoEstructura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Centro Costo EstructuraS ?", "MANTENIMIENTO DE Centro Costo Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCentroCostoEstructura.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCentroCostoEstructura();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.centrocostoestructuraReturnGeneral=centrocostoestructuraLogic.procesarImportacionCentroCostoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.centrocostoestructuraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCentroCostoEstructuraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCentroCostoEstructura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCentroCostoEstructura.setFileImportacion(this.jInternalFrameImportacionCentroCostoEstructura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCentroCostoEstructura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCentroCostoEstructura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCentroCostoEstructura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCentroCostoEstructura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		

		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CentroCostoEstructuraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CentroCostoEstructuraBaseDesign.jrxml";
			
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
			
			this.generarReporteCentroCostoEstructuras("Todos",centrocostoestructurasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CentroCosto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CentroCosto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CentroCosto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CentroCosto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentaje_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentaje_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentaje_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentaje_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoria="id_centro_costo";
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoria="porcentaje";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO:
					sNombreCampoCategoriaValor="id_centro_costo";
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE:
					sNombreCampoCategoriaValor="porcentaje";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Centro Costo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_centro_costo");
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcentaje",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje");
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
	
	public void jButtonGenerarExcelReporteDinamicoCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostoestructura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CentroCostoEstructuras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CentroCostoEstructura centrocostoestructura:centrocostoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostoestructura.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CentroCostoEstructura centrocostoestructura:centrocostoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostoestructura.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(CentroCostoEstructura centrocostoestructura:centrocostoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostoestructura.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO);
					iRow++;

					for(CentroCostoEstructura centrocostoestructura:centrocostoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostoestructura.getcentrocosto_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE);
					iRow++;

					for(CentroCostoEstructura centrocostoestructura:centrocostoestructurasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(centrocostoestructura.getporcentaje());
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
			//	this.getFilaCabeceraExportarExcelCentroCostoEstructura(row);				
			//	iRow++;
			//}				
			
			//for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructurasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCentroCostoEstructura(centrocostoestructuraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
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
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoEstructura(false);
			
			//SI ES MANUAL
			if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCentroCostoEstructura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoEstructura(false);
			
			//SI ES MANUAL
			if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroCostoEstructura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCentroCostoEstructura(false);
			
			//SI ES MANUAL
			if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCentroCostoEstructura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCentroCostoEstructura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCentroCostoEstructura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCentroCostoEstructura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCentroCostoEstructura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCentroCostoEstructura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCentroCostoEstructura.setMinimumSize(dimensionMinimum);
		this.jTableDatosCentroCostoEstructura.setMaximumSize(dimensionMaximum);
		this.jTableDatosCentroCostoEstructura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCentroCostoEstructura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCentroCostoEstructura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCentroCostoEstructura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCentroCostoEstructura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCentroCostoEstructura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCentroCostoEstructura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoEstructura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCentroCostoEstructura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCentroCostoEstructura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCentroCostoEstructura();
		
		this.inicializarActualizarBindingBotonesManualCentroCostoEstructura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCentroCostoEstructura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoEstructura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoEstructura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoEstructura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCentroCostoEstructura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCentroCostoEstructura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCentroCostoEstructura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCentroCostoEstructura.jCheckBoxPostAccionNuevoCentroCostoEstructura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCentroCostoEstructura.jCheckBoxPostAccionSinCerrarCentroCostoEstructura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCentroCostoEstructura.jCheckBoxPostAccionSinMensajeCentroCostoEstructura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCentroCostoEstructura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCentroCostoEstructura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCentroCostoEstructura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
				this.jInternalFrameDetalleFormCentroCostoEstructura.jCheckBoxPostAccionNuevoCentroCostoEstructura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCentroCostoEstructura.jCheckBoxPostAccionSinCerrarCentroCostoEstructura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCentroCostoEstructura.jCheckBoxPostAccionSinMensajeCentroCostoEstructura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCentroCostoEstructura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCentroCostoEstructura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCentroCostoEstructura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCentroCostoEstructura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCentroCostoEstructura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCentroCostoEstructura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCentroCostoEstructura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCentroCostoEstructura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCentroCostoEstructura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCentroCostoEstructura(Boolean esInicializar) throws Exception {
		try	{	
			if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCentroCostoEstructura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCentroCostoEstructura() throws Exception {
		try	{
			if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroCostoEstructura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroCostoEstructura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCentroCostoEstructura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCentroCostoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCentroCostoEstructura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCentroCostoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCentroCostoEstructura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCentroCostoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCentroCostoEstructura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCentroCostoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCentroCostoEstructura.addItem(reporte);
			}
			
			
			if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCentroCostoEstructura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCentroCostoEstructura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCentroCostoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCentroCostoEstructura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCentroCostoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCentroCostoEstructura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCentroCostoEstructura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCentroCostoEstructura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCentroCostoEstructura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoEstructura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCentroCostoEstructura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
				
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CentroCostoEstructuraConstantesFunciones.getTiposSeleccionarCentroCostoEstructura(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CentroCostoEstructuraConstantesFunciones.getTiposSeleccionarCentroCostoEstructura(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CentroCostoEstructuraConstantesFunciones.getTiposSeleccionarCentroCostoEstructura(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCentroCostoEstructura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.getSelectedItem()!=null){this.id_centro_costoFK_IdCentroCosto=((CentroCosto)this.jComboBoxid_centro_costoFK_IdCentroCostoCentroCostoEstructura.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraCentroCostoEstructura.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCentroCostoEstructura(Boolean esInicializar) throws Exception {				
		if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCentroCostoEstructura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCentroCostoEstructura() throws Exception {
		this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCentroCostoEstructura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCentroCostoEstructuraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructuraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCentroCostoEstructura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=centrocostoestructuraLogic.getCentroCostoEstructuras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=centrocostoestructuras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCentroCostoEstructura.setModel(new CentroCostoEstructuraModel(this.centrocostoestructuraLogic.getCentroCostoEstructuras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCentroCostoEstructura.setModel(new CentroCostoEstructuraModel(this.centrocostoestructuras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCentroCostoEstructura!=null && this.jInternalFrameOrderByCentroCostoEstructura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCentroCostoEstructura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO,centrocostoestructuraConstantesFunciones.resaltarSeleccionarCentroCostoEstructura,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CentroCostoEstructuraConstantesFunciones.SCLASSWEBTITULO,centrocostoestructuraConstantesFunciones.resaltarSeleccionarCentroCostoEstructura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,CentroCostoEstructuraConstantesFunciones.LABEL_ID));

		if(this.centrocostoestructuraConstantesFunciones.mostraridCentroCostoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoEstructuraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostoestructuraConstantesFunciones.resaltaridCentroCostoEstructura,this.centrocostoestructuraConstantesFunciones.activaridCentroCostoEstructura,iSizeTabla,this,true,"idCentroCostoEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoestructuraConstantesFunciones.resaltaridCentroCostoEstructura,this.centrocostoestructuraConstantesFunciones.activaridCentroCostoEstructura,this,true,"idCentroCostoEstructura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.centrocostoestructuraConstantesFunciones.mostrarid_empresaCentroCostoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.centrocostoestructuraConstantesFunciones.resaltarid_empresaCentroCostoEstructura,this,this.centrocostoestructuraConstantesFunciones.activarid_empresaCentroCostoEstructura,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.centrocostoestructuraConstantesFunciones.resaltarid_empresaCentroCostoEstructura,this,this.centrocostoestructuraConstantesFunciones.activarid_empresaCentroCostoEstructura,false,"id_empresaCentroCostoEstructura","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.centrocostoestructuraConstantesFunciones.mostrarid_sucursalCentroCostoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.centrocostoestructuraConstantesFunciones.resaltarid_sucursalCentroCostoEstructura,this,this.centrocostoestructuraConstantesFunciones.activarid_sucursalCentroCostoEstructura,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.centrocostoestructuraConstantesFunciones.resaltarid_sucursalCentroCostoEstructura,this,this.centrocostoestructuraConstantesFunciones.activarid_sucursalCentroCostoEstructura,false,"id_sucursalCentroCostoEstructura","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.centrocostoestructuraConstantesFunciones.mostrarid_estructuraCentroCostoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.centrocostoestructuraConstantesFunciones.resaltarid_estructuraCentroCostoEstructura,this,this.centrocostoestructuraConstantesFunciones.activarid_estructuraCentroCostoEstructura,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.centrocostoestructuraConstantesFunciones.resaltarid_estructuraCentroCostoEstructura,this,this.centrocostoestructuraConstantesFunciones.activarid_estructuraCentroCostoEstructura,true,"id_estructuraCentroCostoEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO));

		if(this.centrocostoestructuraConstantesFunciones.mostrarid_centro_costoCentroCostoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CentroCostoTableCell(this.centrocostosForeignKey,this.centrocostoestructuraConstantesFunciones.resaltarid_centro_costoCentroCostoEstructura,this,this.centrocostoestructuraConstantesFunciones.activarid_centro_costoCentroCostoEstructura,iSizeTabla));
			tableColumn.setCellEditor(new CentroCostoTableCell(this.centrocostosForeignKey,this.centrocostoestructuraConstantesFunciones.resaltarid_centro_costoCentroCostoEstructura,this,this.centrocostoestructuraConstantesFunciones.activarid_centro_costoCentroCostoEstructura,true,"id_centro_costoCentroCostoEstructura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE));

		if(this.centrocostoestructuraConstantesFunciones.mostrarporcentajeCentroCostoEstructura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.centrocostoestructuraConstantesFunciones.resaltarporcentajeCentroCostoEstructura,this.centrocostoestructuraConstantesFunciones.activarporcentajeCentroCostoEstructura,iSizeTabla,this,true,"porcentajeCentroCostoEstructura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.centrocostoestructuraConstantesFunciones.resaltarporcentajeCentroCostoEstructura,this.centrocostoestructuraConstantesFunciones.activarporcentajeCentroCostoEstructura,this,true,"porcentajeCentroCostoEstructura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CentroCostoEstructuraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroCostoEstructura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCentroCostoEstructura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCentroCostoEstructura.addColumn(tableColumn);
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
			
			this.jTableDatosCentroCostoEstructura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCentroCostoEstructura.moveColumn(this.jTableDatosCentroCostoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCentroCostoEstructura.moveColumn(this.jTableDatosCentroCostoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCentroCostoEstructura.moveColumn(this.jTableDatosCentroCostoEstructura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCentroCostoEstructura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCentroCostoEstructura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCentroCostoEstructura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCentroCostoEstructura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCentroCostoEstructura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCentroCostoEstructura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCentroCostoEstructura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=centrocostoestructuraLogic.getCentroCostoEstructuras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=centrocostoestructuras.size()-1;
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
		//this.jTableDatosCentroCostoEstructura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCentroCostoEstructura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCentroCostoEstructura();
			
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
				
				//this.isEsNuevoCentroCostoEstructura=false;
					
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
				if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroCostoEstructura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroCostoEstructura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.centrocostoestructura.getsType().equals("DUPLICADO")
				   || this.centrocostoestructura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCentroCostoEstructura=true;
				
				} else {
					this.isEsNuevoCentroCostoEstructura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
					if(this.centrocostoestructura.getId()>=0 && !this.centrocostoestructura.getIsNew()) {						
						this.isEsNuevoCentroCostoEstructura=false;
						
					} else {
						this.isEsNuevoCentroCostoEstructura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCentroCostoEstructura(esRelaciones);						
				
				this.seleccionarCentroCostoEstructura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.centrocostoestructura.getId()<0) {
					this.isEsNuevoCentroCostoEstructura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCentroCostoEstructura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCentroCostoEstructura(evt,rowIndex);
				}	
				
				if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CentroCostoEstructura: " + this.dDif); 
					}
				}								
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCentroCostoEstructura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.centrocostoestructura)) {
					if(this.centrocostoestructura.getId()>0) {
						this.centrocostoestructura.setIsDeleted(true);
						
						this.centrocostoestructurasEliminados.add(this.centrocostoestructura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.centrocostoestructuraLogic.getCentroCostoEstructuras().remove(this.centrocostoestructura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.centrocostoestructuras.remove(this.centrocostoestructura);				
					}
					
					
					((CentroCostoEstructuraModel) this.jTableDatosCentroCostoEstructura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCentroCostoEstructura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCentroCostoEstructura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCentroCostoEstructura) {
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCentroCostoEstructura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCentroCostoEstructura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCentroCostoEstructura(this.centrocostoestructura);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.centrocostoestructuraConstantesFunciones.cargarid_empresaCentroCostoEstructura || this.centrocostoestructuraConstantesFunciones.event_dependid_empresaCentroCostoEstructura) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.centrocostoestructura.getid_empresa());
									//this.inicializarActualizarBindingCentroCostoEstructura(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(centrocostoestructura.getEmpresa()!=null) {
							this.empresasForeignKey.add(centrocostoestructura.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.centrocostoestructura.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.centrocostoestructuraConstantesFunciones.cargarid_sucursalCentroCostoEstructura || this.centrocostoestructuraConstantesFunciones.event_dependid_sucursalCentroCostoEstructura) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.centrocostoestructura.getid_sucursal());
									//this.inicializarActualizarBindingCentroCostoEstructura(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(centrocostoestructura.getSucursal()!=null) {
							this.sucursalsForeignKey.add(centrocostoestructura.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.centrocostoestructura.getid_sucursal(),false,"Formulario");

					//Estructura
					if(!this.centrocostoestructuraConstantesFunciones.cargarid_estructuraCentroCostoEstructura || this.centrocostoestructuraConstantesFunciones.event_dependid_estructuraCentroCostoEstructura) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.centrocostoestructura.getid_estructura());
									//this.inicializarActualizarBindingCentroCostoEstructura(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(centrocostoestructura.getEstructura()!=null) {
							this.estructurasForeignKey.add(centrocostoestructura.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.centrocostoestructura.getid_estructura(),false,"Formulario");

					//CentroCosto
					if(!this.centrocostoestructuraConstantesFunciones.cargarid_centro_costoCentroCostoEstructura || this.centrocostoestructuraConstantesFunciones.event_dependid_centro_costoCentroCostoEstructura) {
						//this.cargarCombosCentroCostosForeignKeyLista(" where id="+this.centrocostoestructura.getid_centro_costo());
									//this.inicializarActualizarBindingCentroCostoEstructura(false,false);
						this.centrocostosForeignKey=new ArrayList<CentroCosto>();

						if(centrocostoestructura.getCentroCosto()!=null) {
							this.centrocostosForeignKey.add(centrocostoestructura.getCentroCosto());
						}

						this.addItemDefectoCombosForeignKeyCentroCosto();
						this.cargarCombosFrameCentroCostosForeignKey("Todos");
					}
					this.setActualCentroCostoForeignKey(this.centrocostoestructura.getid_centro_costo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCentroCostoEstructura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCentroCostoEstructura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCentroCostoEstructura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroCostoEstructura(CentroCostoEstructura centrocostoestructura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCentroCostoEstructura(centrocostoestructura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCentroCostoEstructura(centrocostoestructura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCentroCostoEstructura(centrocostoestructura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoEstructura(centrocostoestructura);
	}
	
	public void setVariablesObjetoActualToFormularioCentroCostoEstructura(CentroCostoEstructura centrocostoestructura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.setText(centrocostoestructura.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoEstructura.jTextFieldporcentajeCentroCostoEstructura.setText(centrocostoestructura.getporcentaje().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CentroCostoEstructura centrocostoestructuraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,centrocostoestructuraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CentroCostoEstructura centrocostoestructuraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				centrocostoestructuraLocal=this.centrocostoestructura;
			} else {
				centrocostoestructuraLocal=this.centrocostoestructuraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(centrocostoestructuraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCentroCostoEstructura(centrocostoestructuraLocal,true);
					
					if(centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(centrocostoestructuraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(centrocostoestructuraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroCostoEstructura(centrocostoestructura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(centrocostoestructura);
	}
	
	public void setVariablesFormularioToObjetoActualCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCentroCostoEstructura(centrocostoestructura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.getText()==null || this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.getText()=="" || this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.getText()=="Id") {
				this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.setText("0");
			}

			if(conColumnasBase) {centrocostoestructura.setId(Long.parseLong(this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoEstructuraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelIdCentroCostoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			centrocostoestructura.setporcentaje(Double.parseDouble(this.jInternalFrameDetalleFormCentroCostoEstructura.jTextFieldporcentajeCentroCostoEstructura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelporcentajeCentroCostoEstructura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCentroCostoEstructura(CentroCostoEstructura centrocostoestructuraBean,CentroCostoEstructura centrocostoestructura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && centrocostoestructuraBean.getid_estructura()!=null && !centrocostoestructuraBean.getid_estructura().equals(-1L))) {centrocostoestructura.setid_estructura(centrocostoestructuraBean.getid_estructura());}
			if(conDefault || (!conDefault && centrocostoestructuraBean.getid_centro_costo()!=null && !centrocostoestructuraBean.getid_centro_costo().equals(null))) {centrocostoestructura.setid_centro_costo(centrocostoestructuraBean.getid_centro_costo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCentroCostoEstructura(CentroCostoEstructura centrocostoestructuraOrigen,CentroCostoEstructura centrocostoestructura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centrocostoestructuraOrigen.getId()!=null && !centrocostoestructuraOrigen.getId().equals(0L))) {centrocostoestructura.setId(centrocostoestructuraOrigen.getId());}}
			if(conDefault || (!conDefault && centrocostoestructuraOrigen.getid_estructura()!=null && !centrocostoestructuraOrigen.getid_estructura().equals(-1L))) {centrocostoestructura.setid_estructura(centrocostoestructuraOrigen.getid_estructura());}
			if(conDefault || (!conDefault && centrocostoestructuraOrigen.getid_centro_costo()!=null && !centrocostoestructuraOrigen.getid_centro_costo().equals(null))) {centrocostoestructura.setid_centro_costo(centrocostoestructuraOrigen.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostoestructuraOrigen.getporcentaje()!=null && !centrocostoestructuraOrigen.getporcentaje().equals(0.0))) {centrocostoestructura.setporcentaje(centrocostoestructuraOrigen.getporcentaje());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroCostoEstructura(CentroCostoEstructura centrocostoestructura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.setText(centrocostoestructura.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoEstructura.jTextFieldporcentajeCentroCostoEstructura.setText(centrocostoestructura.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCentroCostoEstructura(CentroCostoEstructuraBean centrocostoestructuraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.setText(centrocostoestructuraBean.getId().toString());
			this.jInternalFrameDetalleFormCentroCostoEstructura.jTextFieldporcentajeCentroCostoEstructura.setText(centrocostoestructuraBean.getporcentaje().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCentroCostoEstructura(CentroCostoEstructuraParameterReturnGeneral centrocostoestructuraReturnGeneral,CentroCostoEstructuraBean centrocostoestructuraBean,Boolean conDefault) throws Exception { 
		try {
			CentroCostoEstructura centrocostoestructuraLocal=new CentroCostoEstructura();
			
			centrocostoestructuraLocal=centrocostoestructuraReturnGeneral.getCentroCostoEstructura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && centrocostoestructuraLocal.getId()!=null && !centrocostoestructuraLocal.getId().equals(0L))) {centrocostoestructuraBean.setId(centrocostoestructuraLocal.getId());}}
			if(conDefault || (!conDefault && centrocostoestructuraLocal.getid_estructura()!=null && !centrocostoestructuraLocal.getid_estructura().equals(-1L))) {centrocostoestructuraBean.setid_estructura(centrocostoestructuraLocal.getid_estructura());}
			if(conDefault || (!conDefault && centrocostoestructuraLocal.getid_centro_costo()!=null && !centrocostoestructuraLocal.getid_centro_costo().equals(null))) {centrocostoestructuraBean.setid_centro_costo(centrocostoestructuraLocal.getid_centro_costo());}
			if(conDefault || (!conDefault && centrocostoestructuraLocal.getporcentaje()!=null && !centrocostoestructuraLocal.getporcentaje().equals(0.0))) {centrocostoestructuraBean.setporcentaje(centrocostoestructuraLocal.getporcentaje());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCentroCostoEstructuraGenerico(Long idCentroCostoEstructuraSeleccionado,JComboBox jComboBoxCentroCostoEstructura,List<CentroCostoEstructura> centrocostoestructurasLocal)throws Exception {
		try {
			CentroCostoEstructura  centrocostoestructuraTemp=null;

			for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructurasLocal) {
				if(centrocostoestructuraAux.getId()!=null && centrocostoestructuraAux.getId().equals(idCentroCostoEstructuraSeleccionado)) {
					centrocostoestructuraTemp=centrocostoestructuraAux;
					break;
				}
			}

			jComboBoxCentroCostoEstructura.setSelectedItem(centrocostoestructuraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCentroCostoEstructuraGenerico(JComboBox jComboBoxCentroCostoEstructura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroCostoEstructura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCentroCostoEstructura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCentroCostoEstructura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCentroCostoEstructura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCentroCostoEstructura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCentroCostoEstructura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostoestructura=(CentroCostoEstructura) centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centrocostoestructura =(CentroCostoEstructura) centrocostoestructuras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!centrocostoestructura.getIsNew() && !centrocostoestructura.getIsChanged() && !centrocostoestructura.getIsDeleted()) {
				sDescripcion=centrocostoestructura.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostoestructura.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!centrocostoestructura.getIsNew() && !centrocostoestructura.getIsChanged() && !centrocostoestructura.getIsDeleted()) {
				sDescripcion=centrocostoestructura.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostoestructura.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!centrocostoestructura.getIsNew() && !centrocostoestructura.getIsChanged() && !centrocostoestructura.getIsDeleted()) {
				sDescripcion=centrocostoestructura.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostoestructura.getestructura_descripcion();
			}
		}

		if(sTipo.equals("CentroCosto")) {
			//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
			if(!centrocostoestructura.getIsNew() && !centrocostoestructura.getIsChanged() && !centrocostoestructura.getIsDeleted()) {
				sDescripcion=centrocostoestructura.getcentrocosto_descripcion();
			} else {
				//sDescripcion=this.getActualCentroCostoForeignKeyDescripcion((Long)value);
				sDescripcion=centrocostoestructura.getcentrocosto_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CentroCostoEstructura centrocostoestructuraRow=new CentroCostoEstructura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostoestructuraRow=(CentroCostoEstructura) centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			centrocostoestructuraRow=(CentroCostoEstructura) centrocostoestructuras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCentroCostoEstructura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura));			
			this.jButtonDuplicarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoEstructura && this.isPermisoDuplicarCentroCostoEstructura));			
			this.jButtonCopiarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaCopiarCentroCostoEstructura && this.isPermisoCopiarCentroCostoEstructura));
			this.jButtonVerFormCentroCostoEstructura.setVisible((this.isVisibilidadCeldaVerFormCentroCostoEstructura && this.isPermisoVerFormCentroCostoEstructura));
			
			this.jButtonAbrirOrderByCentroCostoEstructura.setVisible((this.isVisibilidadCeldaOrdenCentroCostoEstructura && this.isPermisoOrdenCentroCostoEstructura));			
			
			this.jButtonNuevoRelacionesCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura));			
			this.jButtonNuevoGuardarCambiosCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaModificarCentroCostoEstructura && this.isPermisoActualizarCentroCostoEstructura));	
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaActualizarCentroCostoEstructura && this.isPermisoActualizarCentroCostoEstructura));	
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaEliminarCentroCostoEstructura && this.isPermisoEliminarCentroCostoEstructura));
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarCentroCostoEstructura.setVisible(this.isVisibilidadCeldaCancelarCentroCostoEstructura);							
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosCentroCostoEstructura.setVisible((this.isVisibilidadCeldaGuardarCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));			
			
			}
						
			this.jButtonGuardarCambiosTablaCentroCostoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura));						
			this.jButtonDuplicarToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoEstructura && this.isPermisoDuplicarCentroCostoEstructura));						
			this.jButtonCopiarToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaCopiarCentroCostoEstructura && this.isPermisoCopiarCentroCostoEstructura));			
			this.jButtonVerFormToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaVerFormCentroCostoEstructura && this.isPermisoVerFormCentroCostoEstructura));			
			this.jButtonAbrirOrderByToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaOrdenCentroCostoEstructura && this.isPermisoOrdenCentroCostoEstructura));
			this.jButtonNuevoRelacionesToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura));			
			this.jButtonNuevoGuardarCambiosToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));			
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaModificarCentroCostoEstructura && this.isPermisoActualizarCentroCostoEstructura));	
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaActualizarCentroCostoEstructura  && this.isPermisoActualizarCentroCostoEstructura));	
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaEliminarCentroCostoEstructura && this.isPermisoEliminarCentroCostoEstructura));
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarToolBarCentroCostoEstructura.setVisible(this.isVisibilidadCeldaCancelarCentroCostoEstructura);				
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaGuardarCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura));			
			this.jMenuItemDuplicarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaDuplicarCentroCostoEstructura && this.isPermisoDuplicarCentroCostoEstructura));			
			this.jMenuItemCopiarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaCopiarCentroCostoEstructura && this.isPermisoCopiarCentroCostoEstructura));			
			this.jMenuItemVerFormCentroCostoEstructura.setVisible((this.isVisibilidadCeldaVerFormCentroCostoEstructura && this.isPermisoVerFormCentroCostoEstructura));			
			this.jMenuItemAbrirOrderByCentroCostoEstructura.setVisible((this.isVisibilidadCeldaOrdenCentroCostoEstructura && this.isPermisoOrdenCentroCostoEstructura));			
			//this.jMenuItemMostrarOcultarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaOrdenCentroCostoEstructura && this.isPermisoOrdenCentroCostoEstructura));
			this.jMenuItemDetalleAbrirOrderByCentroCostoEstructura.setVisible((this.isVisibilidadCeldaOrdenCentroCostoEstructura && this.isPermisoOrdenCentroCostoEstructura));			
			//this.jMenuItemDetalleMostrarOcultarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaOrdenCentroCostoEstructura && this.isPermisoOrdenCentroCostoEstructura));			
			this.jMenuItemNuevoRelacionesCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura));			
			this.jMenuItemNuevoGuardarCambiosCentroCostoEstructura.setVisible((this.isVisibilidadCeldaNuevoCentroCostoEstructura && this.isPermisoNuevoCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));									
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemModificarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaModificarCentroCostoEstructura && this.isPermisoActualizarCentroCostoEstructura));	
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemActualizarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaActualizarCentroCostoEstructura && this.isPermisoActualizarCentroCostoEstructura));	
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemEliminarCentroCostoEstructura.setVisible((this.isVisibilidadCeldaEliminarCentroCostoEstructura && this.isPermisoEliminarCentroCostoEstructura));
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemCancelarCentroCostoEstructura.setVisible(this.isVisibilidadCeldaCancelarCentroCostoEstructura);				
			}
			
			this.jMenuItemGuardarCambiosCentroCostoEstructura.setVisible((this.isVisibilidadCeldaGuardarCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));						
			this.jMenuItemGuardarCambiosTablaCentroCostoEstructura.setVisible((this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=this.jButtonNuevoCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaDuplicarCentroCostoEstructura=this.jButtonDuplicarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaCopiarCentroCostoEstructura=this.jButtonCopiarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaVerFormCentroCostoEstructura=this.jButtonVerFormCentroCostoEstructura.isVisible();
			
			this.isVisibilidadCeldaOrdenCentroCostoEstructura=this.jButtonAbrirOrderByCentroCostoEstructura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=this.jButtonNuevoRelacionesCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaModificarCentroCostoEstructura=this.jButtonModificarCentroCostoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosCentroCostoEstructura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=this.jButtonGuardarCambiosTablaCentroCostoEstructura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=this.jButtonNuevoToolBarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=this.jButtonNuevoRelacionesToolBarCentroCostoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			this.isVisibilidadCeldaModificarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarToolBarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarToolBarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarToolBarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarToolBarCentroCostoEstructura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroCostoEstructura=this.jButtonGuardarCambiosToolBarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=this.jButtonGuardarCambiosTablaToolBarCentroCostoEstructura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=this.jMenuItemNuevoCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=this.jMenuItemNuevoRelacionesCentroCostoEstructura.isVisible();
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			this.isVisibilidadCeldaModificarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemModificarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemActualizarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemEliminarCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemCancelarCentroCostoEstructura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCentroCostoEstructura=this.jMenuItemGuardarCambiosCentroCostoEstructura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=this.jMenuItemGuardarCambiosTablaCentroCostoEstructura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCentroCostoEstructura(Boolean esInicializar) {
		if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
				//if(this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCentroCostoEstructura();
			}
			
			this.inicializarActualizarBindingBotonesManualCentroCostoEstructura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCentroCostoEstructura() {
		this.jButtonNuevoCentroCostoEstructura.setVisible(this.isPermisoNuevoCentroCostoEstructura);			
		this.jButtonDuplicarCentroCostoEstructura.setVisible(this.isPermisoDuplicarCentroCostoEstructura);			
		this.jButtonCopiarCentroCostoEstructura.setVisible(this.isPermisoCopiarCentroCostoEstructura);			
		this.jButtonVerFormCentroCostoEstructura.setVisible(this.isPermisoVerFormCentroCostoEstructura);			
		
		this.jButtonAbrirOrderByCentroCostoEstructura.setVisible(this.isPermisoOrdenCentroCostoEstructura);					
		
		this.jButtonNuevoRelacionesCentroCostoEstructura.setVisible(this.isPermisoNuevoCentroCostoEstructura);			
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarCentroCostoEstructura.setVisible(this.isPermisoActualizarCentroCostoEstructura);	
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarCentroCostoEstructura.setVisible(this.isPermisoActualizarCentroCostoEstructura);	
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarCentroCostoEstructura.setVisible(this.isPermisoEliminarCentroCostoEstructura);
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarCentroCostoEstructura.setVisible(this.isVisibilidadCeldaCancelarCentroCostoEstructura);						
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosCentroCostoEstructura.setVisible(this.isPermisoGuardarCambiosCentroCostoEstructura);							
		}
		
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.setVisible(this.isPermisoActualizarCentroCostoEstructura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroCostoEstructura() {
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarCentroCostoEstructura.setVisible(this.isPermisoActualizarCentroCostoEstructura);	
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarCentroCostoEstructura.setVisible(this.isPermisoActualizarCentroCostoEstructura);	
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarCentroCostoEstructura.setVisible(this.isPermisoEliminarCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarCentroCostoEstructura.setVisible(this.isVisibilidadCeldaCancelarCentroCostoEstructura);							
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosCentroCostoEstructura.setVisible((this.isVisibilidadCeldaGuardarCentroCostoEstructura && this.isPermisoGuardarCambiosCentroCostoEstructura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCentroCostoEstructura() {
		if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCentroCostoEstructura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCentroCostoEstructura() {
	}
	
	public void jTableDatosCentroCostoEstructuraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCentroCostoEstructura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCentroCostoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostoestructura==null) {
						this.centrocostoestructura = new CentroCostoEstructura();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
				}

				if(this.centrocostoestructura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.centrocostoestructura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCentroCostoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCentroCostoEstructura(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.centrocostoestructuraLogic.getConnexion());

				if(this.centrocostoestructura.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.centrocostoestructura.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoEstructura=(TitledBorder)this.jScrollPanelDatosCentroCostoEstructura.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCentroCostoEstructura.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCentroCostoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostoestructura==null) {
						this.centrocostoestructura = new CentroCostoEstructura();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
				}

				if(this.centrocostoestructura.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.centrocostoestructura.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCentroCostoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCentroCostoEstructura(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.centrocostoestructuraLogic.getConnexion());

				if(this.centrocostoestructura.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.centrocostoestructura.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoEstructura=(TitledBorder)this.jScrollPanelDatosCentroCostoEstructura.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCentroCostoEstructura.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCentroCostoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostoestructura==null) {
						this.centrocostoestructura = new CentroCostoEstructura();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
				}

				if(this.centrocostoestructura.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.centrocostoestructura.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraCentroCostoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebCentroCostoEstructura(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.centrocostoestructuraLogic.getConnexion());

				if(this.centrocostoestructura.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.centrocostoestructura.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoEstructura=(TitledBorder)this.jScrollPanelDatosCentroCostoEstructura.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderCentroCostoEstructura.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraCentroCostoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostoestructura==null) {
						this.centrocostoestructura = new CentroCostoEstructura();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
				}

				if(this.centrocostoestructura.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.centrocostoestructura.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_centro_costoCentroCostoEstructuraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocentrocosto=true;

			idTienePermisocentrocosto=this.tienePermisosUsuarioEnPaginaWebCentroCostoEstructura(CentroCostoConstantesFunciones.CLASSNAME);

			if(idTienePermisocentrocosto) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCentroCostoEstructura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCentroCostoEstructura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);

				this.centrocostoBeanSwingJInternalFrame=new CentroCostoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.centrocostoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.centrocostoBeanSwingJInternalFrame.getCentroCostoLogic().setConnexion(this.centrocostoestructuraLogic.getConnexion());

				if(this.centrocostoestructura.getid_centro_costo()!=null) {
					this.centrocostoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.centrocostoBeanSwingJInternalFrame.setIdActual(this.centrocostoestructura.getid_centro_costo());
					this.centrocostoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.centrocostoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroCosto();
				}

				JInternalFrameBase jinternalFrame =this.centrocostoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCentroCostoEstructura=(TitledBorder)this.jScrollPanelDatosCentroCostoEstructura.getBorder();
				TitledBorder titledBordercentrocosto=(TitledBorder)this.centrocostoBeanSwingJInternalFrame.jScrollPanelDatosCentroCosto.getBorder();

				titledBordercentrocosto.setTitle(titledBorderCentroCostoEstructura.getTitle() + " -> Centro Costo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_centro_costoCentroCostoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostoestructura==null) {
						this.centrocostoestructura = new CentroCostoEstructura();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
				}

				if(this.centrocostoestructura.getid_centro_costo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_centro_costo = "+this.centrocostoestructura.getid_centro_costo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentajeCentroCostoEstructuraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.getcentrocostoestructura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.centrocostoestructura==null) {
						this.centrocostoestructura = new CentroCostoEstructura();
					}

					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);
				}

				if(this.centrocostoestructura.getporcentaje()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje = "+this.centrocostoestructura.getporcentaje().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCentroCostoEstructura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCentroCostoCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);

			this.getCentroCostoEstructurasFK_IdCentroCosto();

			this.inicializarActualizarBindingCentroCostoEstructura(false);

			//if(CentroCostoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);

			this.getCentroCostoEstructurasFK_IdEmpresa();

			this.inicializarActualizarBindingCentroCostoEstructura(false);

			//if(CentroCostoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);

			this.getCentroCostoEstructurasFK_IdEstructura();

			this.inicializarActualizarBindingCentroCostoEstructura(false);

			//if(CentroCostoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCentroCostoEstructuraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);

			this.getCentroCostoEstructurasFK_IdSucursal();

			this.inicializarActualizarBindingCentroCostoEstructura(false);

			//if(CentroCostoEstructuraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.centrocostoestructuraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCentroCostoEstructura() {
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.setVisible(false);	    			
			this.jInternalFrameDetalleFormCentroCostoEstructura.dispose();
			this.jInternalFrameDetalleFormCentroCostoEstructura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
			this.jInternalFrameReporteDinamicoCentroCostoEstructura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCentroCostoEstructura.dispose();
			this.jInternalFrameReporteDinamicoCentroCostoEstructura=null;
		}
		
		if(this.jInternalFrameImportacionCentroCostoEstructura!=null) {
			this.jInternalFrameImportacionCentroCostoEstructura.setVisible(false);	    			
			this.jInternalFrameImportacionCentroCostoEstructura.dispose();
			this.jInternalFrameImportacionCentroCostoEstructura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCentroCostoEstructura();
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
			
			if(sTipo.equals("NuevoCentroCostoEstructura")) {
				jButtonNuevoCentroCostoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCentroCostoEstructura")) {
				jButtonDuplicarCentroCostoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCentroCostoEstructura")) {
				jButtonCopiarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("VerFormCentroCostoEstructura")) {
				jButtonVerFormCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCentroCostoEstructura")) {
				jButtonNuevoCentroCostoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCentroCostoEstructura")) {
				jButtonDuplicarCentroCostoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCentroCostoEstructura")) {
				jButtonNuevoCentroCostoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCentroCostoEstructura")) {
				jButtonDuplicarCentroCostoEstructuraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCentroCostoEstructura")) {
				jButtonNuevoCentroCostoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCentroCostoEstructura")) {
				jButtonNuevoCentroCostoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCentroCostoEstructura")) {
				jButtonNuevoCentroCostoEstructuraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCentroCostoEstructura")) {
				jButtonModificarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCentroCostoEstructura")) {
				jButtonModificarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCentroCostoEstructura")) {
				jButtonModificarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCentroCostoEstructura")) {
				jButtonActualizarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCentroCostoEstructura")) {
				jButtonActualizarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCentroCostoEstructura")) {
				jButtonActualizarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("EliminarCentroCostoEstructura")) {
				jButtonEliminarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCentroCostoEstructura")) {
				jButtonEliminarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCentroCostoEstructura")) {
				jButtonEliminarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CancelarCentroCostoEstructura")) {
				jButtonCancelarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCentroCostoEstructura")) {
				jButtonCancelarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCentroCostoEstructura")) {
				jButtonCancelarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CerrarCentroCostoEstructura")) {
				jButtonCerrarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCentroCostoEstructura")) {
				jButtonCerrarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCentroCostoEstructura")) {
				jButtonCerrarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCentroCostoEstructura")) {
				jButtonMostrarOcultarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCentroCostoEstructura")) {
				jButtonCancelarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCentroCostoEstructura")) {
				jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCentroCostoEstructura")) {
				jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCentroCostoEstructura")) {
				jButtonCopiarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCentroCostoEstructura")) {
				jButtonVerFormCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCentroCostoEstructura")) {
				jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCentroCostoEstructura")) {
				jButtonCopiarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCentroCostoEstructura")) {
				jButtonVerFormCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCentroCostoEstructura")) {
				jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCentroCostoEstructura")) {
				jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCentroCostoEstructura")) {
				jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCentroCostoEstructura")) {
				jButtonRecargarInformacionCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCentroCostoEstructura")) {
				jButtonRecargarInformacionCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCentroCostoEstructura")) {
				jButtonRecargarInformacionCentroCostoEstructuraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCentroCostoEstructura")) {
				jButtonAnterioresCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCentroCostoEstructura")) {
				jButtonAnterioresCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCentroCostoEstructura")) {
				jButtonAnterioresCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCentroCostoEstructura")) {
				jButtonSiguientesCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCentroCostoEstructura")) {
				jButtonSiguientesCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCentroCostoEstructura")) {
				jButtonSiguientesCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCentroCostoEstructura") || sTipo.equals("MenuItemDetalleAbrirOrderByCentroCostoEstructura")) {
				jButtonAbrirOrderByCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCentroCostoEstructura") || sTipo.equals("MenuItemDetalleMostrarOcultarCentroCostoEstructura")) {
				jButtonMostrarOcultarCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCentroCostoEstructura")) {
				jButtonNuevoGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCentroCostoEstructura")) {
				jButtonNuevoGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCentroCostoEstructura")) {
				jButtonNuevoGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCentroCostoEstructura")) {
				jButtonCerrarReporteDinamicoCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCentroCostoEstructura")) {
				jButtonGenerarReporteDinamicoCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCentroCostoEstructura")) {
				
				jButtonGenerarExcelReporteDinamicoCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCentroCostoEstructura")) {
				jButtonCerrarImportacionCentroCostoEstructuraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCentroCostoEstructura")) {
				
				jButtonGenerarImportacionCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCentroCostoEstructura")) {
				
				jButtonAbrirImportacionCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCentroCostoEstructura")) {
				jComboBoxTiposAccionesCentroCostoEstructuraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCentroCostoEstructura")) {
				jComboBoxTiposRelacionesCentroCostoEstructuraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCentroCostoEstructura")) {
				jComboBoxTiposAccionesCentroCostoEstructuraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCentroCostoEstructura")) {
				
				jComboBoxTiposSeleccionarCentroCostoEstructuraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCentroCostoEstructura")) {
				jTextFieldValorCampoGeneralCentroCostoEstructuraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCentroCostoEstructura")) {
				jButtonAbrirOrderByCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCentroCostoEstructura")) {
				jButtonAbrirOrderByCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCentroCostoEstructura")) {
				jButtonCerrarOrderByCentroCostoEstructuraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroCostoEstructuraBusqueda")) {
				this.jButtonidCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroCostoEstructuraUpdate")) {
				this.jButtonid_empresaCentroCostoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroCostoEstructuraBusqueda")) {
				this.jButtonid_empresaCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoEstructuraUpdate")) {
				this.jButtonid_sucursalCentroCostoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoEstructuraBusqueda")) {
				this.jButtonid_sucursalCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraCentroCostoEstructuraUpdate")) {
				this.jButtonid_estructuraCentroCostoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraCentroCostoEstructuraBusqueda")) {
				this.jButtonid_estructuraCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoEstructuraUpdate")) {
				this.jButtonid_centro_costoCentroCostoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoEstructuraBusqueda")) {
				this.jButtonid_centro_costoCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeCentroCostoEstructuraBusqueda")) {
				this.jButtonporcentajeCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdCentroCostoCentroCostoEstructura")) {
				this.jButtonFK_IdCentroCostoCentroCostoEstructuraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraCentroCostoEstructura")) {
				this.jButtonFK_IdEstructuraCentroCostoEstructuraActionPerformed(evt);
			}
			
			;
			
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCentroCostoEstructura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				


				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CentroCostoEstructura centrocostoestructuraLocal=null;
			
			if(!this.getEsControlTabla()) {
				centrocostoestructuraLocal=this.centrocostoestructura;
			} else {
				centrocostoestructuraLocal=this.centrocostoestructuraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
							
				
				


				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
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
			
			


			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoEstructuraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
								
						
				


				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
								
				
				


				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
							
				
				


				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
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
			
			


			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
								
				
				


				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoEstructuraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCentroCostoEstructura")) {
					jCheckBoxSeleccionarTodosCentroCostoEstructuraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCentroCostoEstructura")) {
					jCheckBoxSeleccionadosCentroCostoEstructuraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCentroCostoEstructura")) {
					
				}
				
				


				
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
												
				
				


				
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoEstructuraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
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
			
			


			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.centrocostoestructura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.centrocostoestructura);
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
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
				
				


				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CentroCostoEstructura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CentroCostoEstructura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCentroCostoEstructuraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.centrocostoestructuraAnterior =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCentroCostoEstructura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCentroCostoEstructuraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCentroCostoEstructura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.centrocostoestructura =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.centrocostoestructura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCentroCostoEstructura")) {
				
				}
				
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCentroCostoEstructura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCentroCostoEstructura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCentroCostoEstructura")) {
			
			}
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCentroCostoEstructura();
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
			if(sTipo.equals("NuevoCentroCostoEstructura")) {
				jButtonNuevoCentroCostoEstructuraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCentroCostoEstructura")) {
				jButtonDuplicarCentroCostoEstructuraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCentroCostoEstructura")) {
				jButtonCopiarCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCentroCostoEstructura")) {
				jButtonVerFormCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCentroCostoEstructura")) {
				jButtonNuevoCentroCostoEstructuraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCentroCostoEstructura")) {
				jButtonModificarCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCentroCostoEstructura")) {
				jButtonActualizarCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCentroCostoEstructura")) {
				jButtonEliminarCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCentroCostoEstructura")) {
				jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCentroCostoEstructura")) {
				jButtonCancelarCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCentroCostoEstructura")) {
				jButtonCerrarCentroCostoEstructuraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCentroCostoEstructura")) {
				jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCentroCostoEstructura")) {
				jButtonNuevoGuardarCambiosCentroCostoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCentroCostoEstructura")) {
				jButtonAbrirOrderByCentroCostoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCentroCostoEstructura")) {
				jButtonRecargarInformacionCentroCostoEstructuraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCentroCostoEstructura")) {
				jButtonAnterioresCentroCostoEstructuraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCentroCostoEstructura")) {
				jButtonSiguientesCentroCostoEstructuraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCentroCostoEstructuraBusqueda")) {
				this.jButtonidCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCentroCostoEstructuraUpdate")) {
				this.jButtonid_empresaCentroCostoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCentroCostoEstructuraBusqueda")) {
				this.jButtonid_empresaCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoEstructuraUpdate")) {
				this.jButtonid_sucursalCentroCostoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCentroCostoEstructuraBusqueda")) {
				this.jButtonid_sucursalCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraCentroCostoEstructuraUpdate")) {
				this.jButtonid_estructuraCentroCostoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraCentroCostoEstructuraBusqueda")) {
				this.jButtonid_estructuraCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoEstructuraUpdate")) {
				this.jButtonid_centro_costoCentroCostoEstructuraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_centro_costoCentroCostoEstructuraBusqueda")) {
				this.jButtonid_centro_costoCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentajeCentroCostoEstructuraBusqueda")) {
				this.jButtonporcentajeCentroCostoEstructuraBusquedaActionPerformed(evt);
			}
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCentroCostoEstructura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCentroCostoEstructura")) {
				closingInternalFrameCentroCostoEstructura();
				
			} else if(sTipo.equals("jButtonCancelarCentroCostoEstructura")) {
				JInternalFrameBase jInternalFrameDetalleFormCentroCostoEstructura = (JInternalFrameBase)evt.getSource();
	            	
	            CentroCostoEstructuraBeanSwingJInternalFrame jInternalFrameParent=(CentroCostoEstructuraBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroCostoEstructura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCentroCostoEstructuraActionPerformed(null);
			}
			
			CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.centrocostoestructura,new Object(),this.centrocostoestructuraParameterGeneral,this.centrocostoestructuraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCentroCostoEstructura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCentroCostoEstructura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCentroCostoEstructura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.centrocostoestructura)) {
			if(!esControlTabla) {
				if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);			
				}
				
				if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCentroCostoEstructura(this.centrocostoestructura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centrocostoestructuraReturnGeneral=centrocostoestructuraLogic.procesarEventosCentroCostoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostoestructuraLogic.getCentroCostoEstructuras(),this.centrocostoestructura,this.centrocostoestructuraParameterGeneral,this.isEsNuevoCentroCostoEstructura,classes);//this.centrocostoestructuraLogic.getCentroCostoEstructura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCentroCostoEstructura(this.centrocostoestructuraReturnGeneral,this.centrocostoestructuraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCentroCostoEstructura(classes,this.centrocostoestructuraReturnGeneral,this.centrocostoestructuraBean,false);
					}
						
					if(this.centrocostoestructuraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCentroCostoEstructura(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCentroCostoEstructura(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura());	
					}
						
					if(this.centrocostoestructuraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCentroCostoEstructura(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura(),classes);//this.centrocostoestructuraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCentroCostoEstructura(this.centrocostoestructura,classes);//this.centrocostoestructuraBean);									
				}
			
				if(CentroCostoEstructuraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCentroCostoEstructura(this.centrocostoestructura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCentroCostoEstructura(this.centrocostoestructura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.centrocostoestructuraAnterior!=null) {
						this.centrocostoestructura=this.centrocostoestructuraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.centrocostoestructuraReturnGeneral=centrocostoestructuraLogic.procesarEventosCentroCostoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostoestructuraLogic.getCentroCostoEstructuras(),this.centrocostoestructura,this.centrocostoestructuraParameterGeneral,this.isEsNuevoCentroCostoEstructura,classes);//this.centrocostoestructuraLogic.getCentroCostoEstructura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.centrocostoestructuraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.centrocostoestructuraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura(),centrocostoestructuraLogic.getCentroCostoEstructuras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura(),this.centrocostoestructuras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCentroCostoEstructura.repaint();
				
				//((AbstractTableModel) this.jTableDatosCentroCostoEstructura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCentroCostoEstructura();
			}
		}
	}
	
	public void actualizarVisualTableDatosCentroCostoEstructura() throws Exception {
		
		CentroCostoEstructuraModel centrocostoestructuraModel=(CentroCostoEstructuraModel)this.jTableDatosCentroCostoEstructura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			centrocostoestructuraModel.centrocostoestructuras=this.centrocostoestructuraLogic.getCentroCostoEstructuras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			centrocostoestructuraModel.centrocostoestructuras=this.centrocostoestructuras;
		}
		
		
		((CentroCostoEstructuraModel) this.jTableDatosCentroCostoEstructura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCentroCostoEstructura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcentrocostoestructuraAnterior(),this.centrocostoestructuraLogic.getCentroCostoEstructuras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcentrocostoestructuraAnterior(),this.centrocostoestructuras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCentroCostoEstructura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
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
										
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostoestructura,new Object(),generalEntityParameterGeneral,this.centrocostoestructuraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CentroCostoEstructuraConstantesFunciones.getClassesRelationshipsOfCentroCostoEstructura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CentroCostoEstructuraConstantesFunciones.getClassesRelationshipsFromStringsOfCentroCostoEstructura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCentroCostoEstructura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CentroCostoEstructuraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.centrocostoestructura,new Object(),generalEntityParameterGeneral,this.centrocostoestructuraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCentroCostoEstructura(CentroCostoEstructuraBean centrocostoestructuraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCentroCostoEstructura(ArrayList<Classe> classes,CentroCostoEstructuraReturnGeneral centrocostoestructuraReturnGeneral,CentroCostoEstructuraBean centrocostoestructuraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.centrocostoestructura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCentroCostoEstructura = new CentroCostoEstructuraDetalleFormJInternalFrame(jDesktopPane,this.centrocostoestructuraSessionBean.getConGuardarRelaciones(),this.centrocostoestructuraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.setVisible(false);
		this.jInternalFrameDetalleFormCentroCostoEstructura.setSelected(false);						
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.centrocostoestructuraLogic=this.centrocostoestructuraLogic;
		
		this.cargarCombosFrameForeignKeyCentroCostoEstructura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCentroCostoEstructura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCentroCostoEstructura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCentroCostoEstructura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCentroCostoEstructura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroCostoEstructura"));
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"ModificarCentroCostoEstructura"));

		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarToolBarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroCostoEstructura"));
					
		this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemModificarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroCostoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"ActualizarCentroCostoEstructura"));
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarToolBarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroCostoEstructura"));
						
		this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemActualizarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroCostoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"EliminarCentroCostoEstructura"));
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroCostoEstructura"));
								
		this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemEliminarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroCostoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"CancelarCentroCostoEstructura"));
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroCostoEstructura"));
					
		this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemCancelarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroCostoEstructura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemDetalleCerrarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroCostoEstructura"));		
		
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoEstructura"));
		
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoEstructura"));
		
		
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroCostoEstructura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonidCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_empresaCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_empresaCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_sucursalCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_sucursalCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_estructuraCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_estructuraCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_centro_costoCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_centro_costoCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonporcentajeCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCentroCostoEstructuraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroCostoEstructura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCentroCostoEstructura"));
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCentroCostoEstructura"));
		}
		
		this.jTableDatosCentroCostoEstructura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCentroCostoEstructura"));
		
		this.jTableDatosCentroCostoEstructura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCentroCostoEstructura"));
		
		this.jButtonNuevoCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"NuevoCentroCostoEstructura"));
		
		this.jButtonDuplicarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"DuplicarCentroCostoEstructura"));
		
		this.jButtonCopiarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"CopiarCentroCostoEstructura"));
		
		this.jButtonVerFormCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"VerFormCentroCostoEstructura"));
		
		
		this.jButtonNuevoToolBarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"NuevoToolBarCentroCostoEstructura"));
			
		this.jButtonDuplicarToolBarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCentroCostoEstructura"));
			
		this.jMenuItemNuevoCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCentroCostoEstructura"));
			
		this.jMenuItemDuplicarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCentroCostoEstructura"));		
		
		
		this.jButtonNuevoRelacionesCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCentroCostoEstructura"));
		
		
		this.jButtonNuevoRelacionesToolBarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCentroCostoEstructura"));
			
		this.jMenuItemNuevoRelacionesCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCentroCostoEstructura"));		
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"ModificarCentroCostoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonModificarToolBarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"ModificarToolBarCentroCostoEstructura"));
			
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemModificarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"MenuItemModificarCentroCostoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"ActualizarCentroCostoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonActualizarToolBarCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCentroCostoEstructura"));
				
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemActualizarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCentroCostoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"EliminarCentroCostoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonEliminarToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"EliminarToolBarCentroCostoEstructura"));
						
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemEliminarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCentroCostoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"CancelarCentroCostoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonCancelarToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"CancelarToolBarCentroCostoEstructura"));
			
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemCancelarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCentroCostoEstructura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCentroCostoEstructura"));		
		
		
		this.jButtonCerrarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"CerrarCentroCostoEstructura"));
		
		
		this.jButtonCerrarToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"CerrarToolBarCentroCostoEstructura"));
			
		this.jMenuItemCerrarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCentroCostoEstructura"));
			
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jMenuItemDetalleCerrarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCentroCostoEstructura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosCentroCostoEstructura"));
		}
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCentroCostoEstructura"));
		}
		
		this.jButtonCopiarToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"CopiarToolBarCentroCostoEstructura"));
			
		this.jButtonVerFormToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"VerFormToolBarCentroCostoEstructura"));
		
		this.jMenuItemGuardarCambiosCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCentroCostoEstructura"));
			
		this.jMenuItemCopiarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCentroCostoEstructura"));		
		
		this.jMenuItemVerFormCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCentroCostoEstructura"));		
		
		
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroCostoEstructura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCentroCostoEstructura"));
			
		this.jMenuItemGuardarCambiosTablaCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCentroCostoEstructura"));		
		
		
		
		this.jButtonRecargarInformacionCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"RecargarInformacionCentroCostoEstructura"));
					
		this.jButtonRecargarInformacionToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCentroCostoEstructura"));
		
		this.jMenuItemRecargarInformacionCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCentroCostoEstructura"));		
		
		
		
		this.jButtonAnterioresCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"AnterioresCentroCostoEstructura"));
		
		
		this.jButtonAnterioresToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCentroCostoEstructura"));
		
		this.jMenuItemAnterioresCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCentroCostoEstructura"));		
		
		
		this.jButtonSiguientesCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"SiguientesCentroCostoEstructura"));
		
		
		this.jButtonSiguientesToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCentroCostoEstructura"));
			
		this.jMenuItemSiguientesCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCentroCostoEstructura"));
			
		this.jMenuItemAbrirOrderByCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCentroCostoEstructura"));
			
		this.jMenuItemMostrarOcultarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCentroCostoEstructura"));
			
		this.jMenuItemDetalleAbrirOrderByCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCentroCostoEstructura"));
			
		this.jMenuItemDetalleMostarOcultarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCentroCostoEstructura"));		
		
		
		this.jButtonNuevoGuardarCambiosCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCentroCostoEstructura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCentroCostoEstructura"));
			
		this.jMenuItemNuevoGuardarCambiosCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCentroCostoEstructura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCentroCostoEstructura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCentroCostoEstructura"));

		this.jCheckBoxSeleccionadosCentroCostoEstructura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCentroCostoEstructura"));
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCentroCostoEstructura"));
		}
		
		
		this.jComboBoxTiposRelacionesCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"TiposRelacionesCentroCostoEstructura"));
			
		this.jComboBoxTiposAccionesCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"TiposAccionesCentroCostoEstructura"));
					
		this.jComboBoxTiposSeleccionarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCentroCostoEstructura"));
			
		this.jTextFieldValorCampoGeneralCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCentroCostoEstructura"));		
		
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonidCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_empresaCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_empresaCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_sucursalCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_sucursalCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_estructuraCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_estructuraCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_centro_costoCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_centro_costoCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonporcentajeCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCentroCostoEstructuraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCentroCostoCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoCentroCostoEstructura"));

			this.jButtonFK_IdEstructuraCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraCentroCostoEstructura"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCentroCostoEstructura!=null) {
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoEstructura"));
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoEstructura"));
				this.jInternalFrameReporteDinamicoCentroCostoEstructura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoEstructura"));
			}
			
			//this.jButtonCerrarReporteDinamicoCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCentroCostoEstructura"));				
			//this.jButtonGenerarReporteDinamicoCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCentroCostoEstructura"));
			//this.jButtonGenerarExcelReporteDinamicoCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCentroCostoEstructura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCentroCostoEstructura!=null) {
				this.jInternalFrameImportacionCentroCostoEstructura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCentroCostoEstructura"));
				this.jInternalFrameImportacionCentroCostoEstructura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCentroCostoEstructura"));
				this.jInternalFrameImportacionCentroCostoEstructura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCentroCostoEstructura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"AbrirOrderByCentroCostoEstructura"));
			
			this.jButtonAbrirOrderByToolBarCentroCostoEstructura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCentroCostoEstructura"));			
			
			if(this.jInternalFrameOrderByCentroCostoEstructura!=null) {
				this.jInternalFrameOrderByCentroCostoEstructura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCentroCostoEstructura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCentroCostoEstructura.jTabbedPaneRelacionesCentroCostoEstructura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCentroCostoEstructura"));
		
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
            		closingInternalFrameCentroCostoEstructura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCentroCostoEstructura = (JInternalFrameBase)event.getSource();
	            	
	            CentroCostoEstructuraBeanSwingJInternalFrame jInternalFrameParent=(CentroCostoEstructuraBeanSwingJInternalFrame)jInternalFrameDetalleFormCentroCostoEstructura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCentroCostoEstructuraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCentroCostoEstructura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCentroCostoEstructuraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCentroCostoEstructura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCentroCostoEstructura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoEstructuraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCentroCostoEstructura";
		inputMap = this.jButtonNuevoCentroCostoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCentroCostoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroCostoEstructuraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCentroCostoEstructuraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCentroCostoEstructura";
		inputMap = this.jButtonNuevoRelacionesCentroCostoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCentroCostoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCentroCostoEstructuraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCentroCostoEstructura";
		inputMap = this.jButtonModificarCentroCostoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCentroCostoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCentroCostoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCentroCostoEstructura";
		inputMap = this.jButtonActualizarCentroCostoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCentroCostoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCentroCostoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCentroCostoEstructura";
		inputMap = this.jButtonEliminarCentroCostoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCentroCostoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCentroCostoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCentroCostoEstructura";
		inputMap = this.jButtonCancelarCentroCostoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCentroCostoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCentroCostoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCentroCostoEstructura";
		inputMap = this.jButtonCerrarCentroCostoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCentroCostoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCentroCostoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCentroCostoEstructura";
		inputMap = this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosCentroCostoEstructura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonGuardarCambiosCentroCostoEstructura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCentroCostoEstructuraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCentroCostoEstructura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCentroCostoEstructuraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCentroCostoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCentroCostoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCentroCostoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCentroCostoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCentroCostoEstructura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCentroCostoEstructuraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonidCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"idCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_empresaCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_empresaCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_sucursalCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_sucursalCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_estructuraCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_estructuraCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraCentroCostoEstructuraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_centro_costoCentroCostoEstructuraUpdate.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoEstructuraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonid_centro_costoCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"id_centro_costoCentroCostoEstructuraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCentroCostoEstructura.jButtonporcentajeCentroCostoEstructuraBusqueda.addActionListener(new ButtonActionListener(this,"porcentajeCentroCostoEstructuraBusqueda"));
		
		
		this.jButtonFK_IdCentroCostoCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdCentroCostoCentroCostoEstructura"));

		this.jButtonFK_IdEstructuraCentroCostoEstructura.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraCentroCostoEstructura"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCentroCostoEstructura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCentroCostoEstructuraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCentroCostoEstructuraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCentroCostoEstructura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCentroCostoEstructura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
					centrocostoestructuraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructuras) {
					centrocostoestructuraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCentroCostoEstructuraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
						centrocostoestructuraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructuras) {
						centrocostoestructuraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructuras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroCostoEstructura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroCostoEstructura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCentroCostoEstructuraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCentroCostoEstructura.getSelectedRows();
			
			CentroCostoEstructura centrocostoestructuraLocal=new CentroCostoEstructura();
			
			//this.seleccionarTodosCentroCostoEstructura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					centrocostoestructuraLocal =(CentroCostoEstructura) this.centrocostoestructuraLogic.getCentroCostoEstructuras().toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					centrocostoestructuraLocal =(CentroCostoEstructura) this.centrocostoestructuras.toArray()[this.jTableDatosCentroCostoEstructura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				centrocostoestructuraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
						centrocostoestructuraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructuras) {
						centrocostoestructuraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCentroCostoEstructura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCentroCostoEstructura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCentroCostoEstructura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCentroCostoEstructuraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCentroCostoEstructuraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCentroCostoEstructuraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCentroCostoEstructura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuraLogic.getCentroCostoEstructuras()) {
				
						if(sTipoSeleccionar.equals(CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							centrocostoestructuraAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructuras) {
					
						if(sTipoSeleccionar.equals(CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE)) {
							existe=true;
							centrocostoestructuraAux.setporcentaje(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCentroCostoEstructuraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCentroCostoEstructura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCentroCostoEstructura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCentroCostoEstructura) {				
					conSplash=true;//false;										
					
					//this.startProcessCentroCostoEstructura(conSplash);
				
					this.generarReporteCentroCostoEstructurasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCentroCostoEstructurasSeleccionados();
				//this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroCostoEstructurasSeleccionados(false);
				//this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCentroCostoEstructurasSeleccionados(true);
				//this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroCostoEstructura();
				
				this.exportarCentroCostoEstructurasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCentroCostoEstructuras();
				//this.importarCentroCostoEstructuras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCentroCostoEstructura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCentroCostoEstructurasSeleccionados();
				//this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Centro Costo Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCentroCostoEstructura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCentroCostoEstructura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCentroCostoEstructura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setSelectedIndex(0);					
				}	
			} 			
			else if(CentroCostoEstructuraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCentroCostoEstructura) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCentroCostoEstructura(conSplash);
					
						//this.actualizarParametrosGeneralCentroCostoEstructura();
						
						this.generarReporteProcesoAccionCentroCostoEstructurasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CentroCostoEstructuraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Centro Costo EstructuraS SELECCIONADOS?", "MANTENIMIENTO DE Centro Costo Estructura", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCentroCostoEstructura();
				
						this.actualizarParametrosGeneralCentroCostoEstructura();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.centrocostoestructuraReturnGeneral=centrocostoestructuraLogic.procesarAccionCentroCostoEstructurasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.centrocostoestructuraLogic.getCentroCostoEstructuras(),this.centrocostoestructuraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCentroCostoEstructuraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCentroCostoEstructura();
					
					CentroCostoEstructuraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCentroCostoEstructuraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCentroCostoEstructura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxTiposAccionesFormularioCentroCostoEstructura.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCentroCostoEstructura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCentroCostoEstructuraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCentroCostoEstructura();
			
			if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		
			CentroCostoEstructura centrocostoestructura=new CentroCostoEstructura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCentroCostoEstructura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCentroCostoEstructura.getSelectedItem();
			
			
			
			
			centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
			//this.sTipoAccion;
			
			if(centrocostoestructurasSeleccionados.size()==1) {
				for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructurasSeleccionados) {
					centrocostoestructura=centrocostoestructuraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCentroCostoEstructura();
			
      		//this.finishProcessCentroCostoEstructura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCentroCostoEstructuraReturnGeneral() throws Exception {
		if(this.centrocostoestructuraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.centrocostoestructuraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.centrocostoestructuraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.centrocostoestructuraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.centrocostoestructuraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.centrocostoestructuraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCentroCostoEstructura(false);
		}
		
		if(this.centrocostoestructuraReturnGeneral.getConRetornoLista() || this.centrocostoestructuraReturnGeneral.getConRetornoObjeto()) {
			if(this.centrocostoestructuraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centrocostoestructuraLogic.setCentroCostoEstructuras(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructuras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.centrocostoestructuraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.centrocostoestructuraLogic.setCentroCostoEstructura(this.centrocostoestructuraReturnGeneral.getCentroCostoEstructura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCentroCostoEstructura(false);
		}
	}
	
	public void actualizarParametrosGeneralCentroCostoEstructura() throws Exception {
		
		
	}
	
	public ArrayList<CentroCostoEstructura> getCentroCostoEstructurasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCentroCostoEstructura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructuraLogic.getCentroCostoEstructuras()) {
					if(centrocostoestructuraAux.getIsSelected()) {
						centrocostoestructurasSeleccionados.add(centrocostoestructuraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CentroCostoEstructura centrocostoestructuraAux:this.centrocostoestructuras) {
					if(centrocostoestructuraAux.getIsSelected()) {
						centrocostoestructurasSeleccionados.add(centrocostoestructuraAux);				
					}
				}
			}
			
			if(centrocostoestructurasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						centrocostoestructurasSeleccionados.addAll(this.centrocostoestructuraLogic.getCentroCostoEstructuras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						centrocostoestructurasSeleccionados.addAll(this.centrocostoestructuras);				
					}
				}
			}
		} else {
			centrocostoestructurasSeleccionados.add(this.centrocostoestructura);
		}
		
		return centrocostoestructurasSeleccionados;
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
	
	public void generarReporteCentroCostoEstructurasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCentroCostoEstructurasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCentroCostoEstructurasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroCostoEstructurasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCentroCostoEstructurasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Centro Costo Estructura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCentroCostoEstructurasSeleccionados() throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCentroCostoEstructuras("Todos",centrocostoestructurasSeleccionados);
		
	}	
	
	public void generarReporteNormalCentroCostoEstructurasSeleccionados() throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCentroCostoEstructuras("Todos",centrocostoestructurasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCentroCostoEstructurasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCentroCostoEstructuras("Todos",centrocostoestructurasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCentroCostoEstructurasSeleccionados() throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCentroCostoEstructura();
		
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCentroCostoEstructura();
		
		
		//this.generarReporteCentroCostoEstructuras("Todos",centrocostoestructurasSeleccionados ,centrocostoestructuraImplementable,centrocostoestructuraImplementableHome);
	}
	
	public void mostrarImportacionCentroCostoEstructuras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCentroCostoEstructura();
		
		this.abrirFrameImportacionCentroCostoEstructura();		
		
			
		//this.generarReporteCentroCostoEstructuras("Todos",centrocostoestructurasSeleccionados ,centrocostoestructuraImplementable,centrocostoestructuraImplementableHome);
	}
	
	public void importarCentroCostoEstructuras() throws Exception {		
	
	}
	
	public void exportarCentroCostoEstructurasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCentroCostoEstructurasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCentroCostoEstructurasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCentroCostoEstructurasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Centro Costo Estructura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCentroCostoEstructurasSeleccionados() throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostoestructura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCentroCostoEstructura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructurasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCentroCostoEstructura(centrocostoestructuraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//centrocostoestructuraAux.setsDetalleGeneralEntityReporte(centrocostoestructuraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCentroCostoEstructura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CentroCostoEstructuraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoEstructuraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=centrocostoestructura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostoestructura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostoestructura.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostoestructura.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostoestructura.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostoestructura.getcentrocosto_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=centrocostoestructura.getporcentaje().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCentroCostoEstructurasSeleccionados() throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostoestructura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CentroCostoEstructuras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCentroCostoEstructura(row);				
				iRow++;
			}				
			
			for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructurasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCentroCostoEstructura(centrocostoestructuraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCentroCostoEstructurasSeleccionados() throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();		
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"centrocostoestructura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("centrocostoestructuras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("centrocostoestructura");
			//elementRoot.appendChild(element);
		
			for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructurasSeleccionados) {
				element = document.createElement("centrocostoestructura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCentroCostoEstructura(centrocostoestructuraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Centro Costo Estructura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCentroCostoEstructura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CentroCostoEstructuraConstantesFunciones.LABEL_PORCENTAJE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostoestructura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostoestructura.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostoestructura.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostoestructura.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostoestructura.getcentrocosto_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(centrocostoestructura.getporcentaje());				
	}
	
	public void setFilaDatosExportarXmlCentroCostoEstructura(CentroCostoEstructura centrocostoestructura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CentroCostoEstructuraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(centrocostoestructura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CentroCostoEstructuraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(centrocostoestructura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CentroCostoEstructuraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(centrocostoestructura.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CentroCostoEstructuraConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(centrocostoestructura.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementestructura_descripcion = document.createElement(CentroCostoEstructuraConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(centrocostoestructura.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementcentrocosto_descripcion = document.createElement(CentroCostoEstructuraConstantesFunciones.IDCENTROCOSTO);
		elementcentrocosto_descripcion.appendChild(document.createTextNode(centrocostoestructura.getcentrocosto_descripcion()));
		element.appendChild(elementcentrocosto_descripcion);

		Element elementporcentaje = document.createElement(CentroCostoEstructuraConstantesFunciones.PORCENTAJE);
		elementporcentaje.appendChild(document.createTextNode(centrocostoestructura.getporcentaje().toString().trim()));
		element.appendChild(elementporcentaje);
	}
	
	public void generarReporteGroupGenericoCentroCostoEstructurasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados=new ArrayList<CentroCostoEstructura>();
		
		centrocostoestructurasSeleccionados=this.getCentroCostoEstructurasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCentroCostoEstructura(centrocostoestructurasSeleccionados);
		
		this.generarReporteCentroCostoEstructuras("Todos",centrocostoestructurasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCentroCostoEstructura(ArrayList<CentroCostoEstructura> centrocostoestructurasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CentroCostoEstructura centrocostoestructuraAux:centrocostoestructurasSeleccionados) {
				centrocostoestructuraAux.setsDetalleGeneralEntityReporte(centrocostoestructuraAux.toString());
			
				if(sTipoSeleccionar.equals(CentroCostoEstructuraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					centrocostoestructuraAux.setsDescripcionGeneralEntityReporte1(centrocostoestructuraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoEstructuraConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					centrocostoestructuraAux.setsDescripcionGeneralEntityReporte1(centrocostoestructuraAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoEstructuraConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					centrocostoestructuraAux.setsDescripcionGeneralEntityReporte1(centrocostoestructuraAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CentroCostoEstructuraConstantesFunciones.LABEL_IDCENTROCOSTO)) {
					existe=true;
					centrocostoestructuraAux.setsDescripcionGeneralEntityReporte1(centrocostoestructuraAux.getcentrocosto_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CentroCostoEstructuraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCentroCostoEstructura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCentroCostoEstructura=true;
				this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=true;
				this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=true;
			}
			
			this.isVisibilidadCeldaModificarCentroCostoEstructura=false;
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=false;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=false;
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=false;
			this.isVisibilidadCeldaModificarCentroCostoEstructura=false;
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=true;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=false;
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=false;
			this.isVisibilidadCeldaModificarCentroCostoEstructura=false;
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=true;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=true;
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=false;
			this.isVisibilidadCeldaModificarCentroCostoEstructura=false;
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=true;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=false;
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=true;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=true;
			this.isVisibilidadCeldaModificarCentroCostoEstructura=false;
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=false;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=false;
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=true;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=false;
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=false;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=false;
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=false;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=false;
			this.isVisibilidadCeldaModificarCentroCostoEstructura=true;
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=false;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=false;
			this.isVisibilidadCeldaCancelarCentroCostoEstructura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				} else {
					this.isVisibilidadCeldaGuardarCentroCostoEstructura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CentroCostoEstructuraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=true;
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=true;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=true;
		} else {
			this.actualizarEstadoPanelsCentroCostoEstructura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCentroCostoEstructura=false;
			//this.isVisibilidadCeldaVerFormCentroCostoEstructura=false;
			this.isVisibilidadCeldaDuplicarCentroCostoEstructura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!centrocostoestructuraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
		} else {
			this.isVisibilidadCeldaNuevoCentroCostoEstructura=false;
			this.isVisibilidadCeldaGuardarCambiosCentroCostoEstructura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			if(!centrocostoestructuraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;												
			}
			
			this.jButtonCerrarCentroCostoEstructura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCentroCostoEstructura=false;
		}
		
		if(!this.permiteMantenimiento(this.centrocostoestructura)) {
			this.isVisibilidadCeldaActualizarCentroCostoEstructura=false;
			this.isVisibilidadCeldaEliminarCentroCostoEstructura=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCentroCostoEstructura() {
	}
	
	public void actualizarEstadoPanelsCentroCostoEstructura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCentroCostoEstructura!=null) {
				this.jScrollPanelDatosEdicionCentroCostoEstructura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoEstructura!=null) {
				this.jScrollPanelDatosCentroCostoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoEstructura!=null) {
				this.jPanelPaginacionCentroCostoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCentroCostoEstructura!=null) {
				this.jScrollPanelDatosEdicionCentroCostoEstructura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCentroCostoEstructura!=null) {
				this.jScrollPanelDatosCentroCostoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoEstructura!=null) {
				this.jPanelPaginacionCentroCostoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCentroCostoEstructura!=null) {
				this.jScrollPanelDatosEdicionCentroCostoEstructura.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoEstructura!=null) {
				this.jScrollPanelDatosCentroCostoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoEstructura!=null) {
				this.jPanelPaginacionCentroCostoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCentroCostoEstructura!=null) {
				this.jScrollPanelDatosEdicionCentroCostoEstructura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoEstructura!=null) {
				this.jScrollPanelDatosCentroCostoEstructura.setVisible(false);
			}
			
			if(this.jPanelPaginacionCentroCostoEstructura!=null) {
				this.jPanelPaginacionCentroCostoEstructura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCentroCostoEstructura!=null) {
				this.jScrollPanelDatosEdicionCentroCostoEstructura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoEstructura!=null) {
				this.jScrollPanelDatosCentroCostoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoEstructura!=null) {
				this.jPanelPaginacionCentroCostoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCentroCostoEstructura!=null) {
				this.jScrollPanelDatosEdicionCentroCostoEstructura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoEstructura!=null) {
				this.jScrollPanelDatosCentroCostoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoEstructura!=null) {
				this.jPanelPaginacionCentroCostoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCentroCostoEstructura!=null) {
				this.jScrollPanelDatosEdicionCentroCostoEstructura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCentroCostoEstructura!=null) {
				this.jScrollPanelDatosCentroCostoEstructura.setVisible(true);
			}
			
			if(this.jPanelPaginacionCentroCostoEstructura!=null) {
				this.jPanelPaginacionCentroCostoEstructura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
					this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.centrocostoestructuraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCentroCostoEstructura!=null) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCentroCostoEstructura!=null) {
				this.jPanelParametrosReportesCentroCostoEstructura.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCentroCosto=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoEstructura.remove(jPanelFK_IdCentroCostoCentroCostoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasCentroCostoEstructura.remove(jPanelFK_IdEstructuraCentroCostoEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCentroCosto=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoEstructura.remove(jPanelFK_IdCentroCostoCentroCostoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasCentroCostoEstructura.remove(jPanelFK_IdEstructuraCentroCostoEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdCentroCosto=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoEstructura.remove(jPanelFK_IdCentroCostoCentroCostoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasCentroCostoEstructura.remove(jPanelFK_IdEstructuraCentroCostoEstructura);}
		}
		
	}

	public void setVisibilidadBusquedasParaCentroCosto(Boolean isParaCentroCosto){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCentroCostoNegation=!isParaCentroCosto;

			this.isVisibilidadFK_IdCentroCosto=isParaCentroCosto;
			if(!this.isVisibilidadFK_IdCentroCosto) {this.jTabbedPaneBusquedasCentroCostoEstructura.remove(jPanelFK_IdCentroCostoCentroCostoEstructura);}

			this.isVisibilidadFK_IdEstructura=isParaCentroCostoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasCentroCostoEstructura.remove(jPanelFK_IdEstructuraCentroCostoEstructura);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CentroCostoEstructuraSessionBean centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
		
		if(this.centrocostoestructuraSessionBean==null) {
			this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
		}
		
		this.centrocostoestructuraSessionBean.setsUltimaBusquedaCentroCostoEstructura(this.getsAccionBusqueda());
		this.centrocostoestructuraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.centrocostoestructuraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
			centrocostoestructuraSessionBean.setid_centro_costo(this.getid_centro_costoFK_IdCentroCosto());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			centrocostoestructuraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			centrocostoestructuraSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			centrocostoestructuraSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CentroCostoEstructuraSessionBean centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
		
		if(this.centrocostoestructuraSessionBean==null) {
			this.centrocostoestructuraSessionBean=new CentroCostoEstructuraSessionBean();
		}
		
		if(this.centrocostoestructuraSessionBean.getsUltimaBusquedaCentroCostoEstructura()!=null&&!this.centrocostoestructuraSessionBean.getsUltimaBusquedaCentroCostoEstructura().equals("")) {
			this.setsAccionBusqueda(centrocostoestructuraSessionBean.getsUltimaBusquedaCentroCostoEstructura());
			this.setiNumeroPaginacion(centrocostoestructuraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(centrocostoestructuraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCentroCosto")) {
				this.setid_centro_costoFK_IdCentroCosto(centrocostoestructuraSessionBean.getid_centro_costo());
				centrocostoestructuraSessionBean.setid_centro_costo(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(centrocostoestructuraSessionBean.getid_empresa());
				centrocostoestructuraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(centrocostoestructuraSessionBean.getid_estructura());
				centrocostoestructuraSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(centrocostoestructuraSessionBean.getid_sucursal());
				centrocostoestructuraSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.centrocostoestructuraSessionBean.setsUltimaBusquedaCentroCostoEstructura("");
		this.centrocostoestructuraSessionBean.setiNumeroPaginacion(CentroCostoEstructuraConstantesFunciones.INUMEROPAGINACION);
		this.centrocostoestructuraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCentroCostoEstructura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCentroCostoEstructura() {
		this.updateBorderResaltarBusquedasFormularioCentroCostoEstructura();
		this.updateVisibilidadBusquedasFormularioCentroCostoEstructura();
		this.updateHabilitarBusquedasFormularioCentroCostoEstructura();
	}
	
	public void updateBorderResaltarBusquedasFormularioCentroCostoEstructura() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCentroCostoEstructura.getComponents().length>0) {
	

		if(this.centrocostoestructuraConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoEstructura!=null) {
			index= this.jTabbedPaneBusquedasCentroCostoEstructura.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoEstructura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoEstructura.getComponent(index);
				jPanel.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoEstructura);
			}
		}

		if(this.centrocostoestructuraConstantesFunciones.resaltarFK_IdEstructuraCentroCostoEstructura!=null) {
			index= this.jTabbedPaneBusquedasCentroCostoEstructura.indexOfComponent(this.jPanelFK_IdEstructuraCentroCostoEstructura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoEstructura.getComponent(index);
				jPanel.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarFK_IdEstructuraCentroCostoEstructura);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCentroCostoEstructura() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCentroCostoEstructura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroCostoEstructura.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoEstructura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoEstructura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarFK_IdCentroCostoCentroCostoEstructura);
			if(!this.centrocostoestructuraConstantesFunciones.mostrarFK_IdCentroCostoCentroCostoEstructura && index>-1) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.remove(index);
			}

			index= this.jTabbedPaneBusquedasCentroCostoEstructura.indexOfComponent(this.jPanelFK_IdEstructuraCentroCostoEstructura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoEstructura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarFK_IdEstructuraCentroCostoEstructura);
			if(!this.centrocostoestructuraConstantesFunciones.mostrarFK_IdEstructuraCentroCostoEstructura && index>-1) {
				this.jTabbedPaneBusquedasCentroCostoEstructura.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCentroCostoEstructura() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCentroCostoEstructura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCentroCostoEstructura.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoEstructura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoEstructura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostoestructuraConstantesFunciones.activarFK_IdCentroCostoCentroCostoEstructura);
				this.jTabbedPaneBusquedasCentroCostoEstructura.setEnabledAt(index,this.centrocostoestructuraConstantesFunciones.activarFK_IdCentroCostoCentroCostoEstructura);
			}

			index= this.jTabbedPaneBusquedasCentroCostoEstructura.indexOfComponent(this.jPanelFK_IdEstructuraCentroCostoEstructura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoEstructura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.centrocostoestructuraConstantesFunciones.activarFK_IdEstructuraCentroCostoEstructura);
				this.jTabbedPaneBusquedasCentroCostoEstructura.setEnabledAt(index,this.centrocostoestructuraConstantesFunciones.activarFK_IdEstructuraCentroCostoEstructura);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCentroCostoEstructura(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCentroCosto")) {
			index= this.jTabbedPaneBusquedasCentroCostoEstructura.indexOfComponent(this.jPanelFK_IdCentroCostoCentroCostoEstructura);

			this.jTabbedPaneBusquedasCentroCostoEstructura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoEstructura.getComponent(index);

			this.centrocostoestructuraConstantesFunciones.setResaltarFK_IdCentroCostoCentroCostoEstructura(resaltar);

			jPanel.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarFK_IdCentroCostoCentroCostoEstructura);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasCentroCostoEstructura.indexOfComponent(this.jPanelFK_IdEstructuraCentroCostoEstructura);

			this.jTabbedPaneBusquedasCentroCostoEstructura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCentroCostoEstructura.getComponent(index);

			this.centrocostoestructuraConstantesFunciones.setResaltarFK_IdEstructuraCentroCostoEstructura(resaltar);

			jPanel.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarFK_IdEstructuraCentroCostoEstructura);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCentroCostoEstructura.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCentroCostoEstructura() throws Exception {

		if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCentroCostoEstructura();
		this.updateVisibilidadResaltarControlesFormularioCentroCostoEstructura();
		this.updateHabilitarResaltarControlesFormularioCentroCostoEstructura();
		
	}
	
	public void updateBorderResaltarControlesFormularioCentroCostoEstructura() throws Exception {
		if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.centrocostoestructuraConstantesFunciones.resaltaridCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.setBorder(this.centrocostoestructuraConstantesFunciones.resaltaridCentroCostoEstructura);}
		if(this.centrocostoestructuraConstantesFunciones.resaltarid_empresaCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarid_empresaCentroCostoEstructura);}
		if(this.centrocostoestructuraConstantesFunciones.resaltarid_sucursalCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarid_sucursalCentroCostoEstructura);}
		if(this.centrocostoestructuraConstantesFunciones.resaltarid_estructuraCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarid_estructuraCentroCostoEstructura);}
		if(this.centrocostoestructuraConstantesFunciones.resaltarid_centro_costoCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarid_centro_costoCentroCostoEstructura);}
		if(this.centrocostoestructuraConstantesFunciones.resaltarporcentajeCentroCostoEstructura!=null && this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {this.jInternalFrameDetalleFormCentroCostoEstructura.jTextFieldporcentajeCentroCostoEstructura.setBorder(this.centrocostoestructuraConstantesFunciones.resaltarporcentajeCentroCostoEstructura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCentroCostoEstructura() throws Exception {		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
	
		//this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostraridCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelidCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostraridCentroCostoEstructura);
		//this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarid_empresaCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelid_empresaCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarid_empresaCentroCostoEstructura);
		//this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarid_sucursalCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelid_sucursalCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarid_sucursalCentroCostoEstructura);
		//this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarid_estructuraCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelid_estructuraCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarid_estructuraCentroCostoEstructura);
		//this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarid_centro_costoCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelid_centro_costoCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarid_centro_costoCentroCostoEstructura);
		//this.jInternalFrameDetalleFormCentroCostoEstructura.jTextFieldporcentajeCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarporcentajeCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jPanelporcentajeCentroCostoEstructura.setVisible(this.centrocostoestructuraConstantesFunciones.mostrarporcentajeCentroCostoEstructura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCentroCostoEstructura() throws Exception {
		if(this.jInternalFrameDetalleFormCentroCostoEstructura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCentroCostoEstructura!=null) {
	
		this.jInternalFrameDetalleFormCentroCostoEstructura.jLabelidCentroCostoEstructura.setEnabled(this.centrocostoestructuraConstantesFunciones.activaridCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_empresaCentroCostoEstructura.setEnabled(this.centrocostoestructuraConstantesFunciones.activarid_empresaCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_sucursalCentroCostoEstructura.setEnabled(this.centrocostoestructuraConstantesFunciones.activarid_sucursalCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_estructuraCentroCostoEstructura.setEnabled(this.centrocostoestructuraConstantesFunciones.activarid_estructuraCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jComboBoxid_centro_costoCentroCostoEstructura.setEnabled(this.centrocostoestructuraConstantesFunciones.activarid_centro_costoCentroCostoEstructura);
		this.jInternalFrameDetalleFormCentroCostoEstructura.jTextFieldporcentajeCentroCostoEstructura.setEnabled(this.centrocostoestructuraConstantesFunciones.activarporcentajeCentroCostoEstructura);
		}
	}
	
		
}