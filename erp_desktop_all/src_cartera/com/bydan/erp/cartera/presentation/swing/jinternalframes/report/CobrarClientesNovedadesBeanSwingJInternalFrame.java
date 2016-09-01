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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;


import java.sql.Time;


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

//import com.bydan.erp.cartera.util.CobrarClientesNovedadesConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarClientesNovedadesParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarClientesNovedadesParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarClientesNovedadesBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
public class CobrarClientesNovedadesBeanSwingJInternalFrame extends CobrarClientesNovedadesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarClientesNovedadesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarClientesNovedades> cobrarclientesnovedadesValidator = new ClassValidator<CobrarClientesNovedades>(CobrarClientesNovedades.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarClientesNovedades cobrarclientesnovedades;	
	public CobrarClientesNovedades cobrarclientesnovedadesAux;
	public CobrarClientesNovedades cobrarclientesnovedadesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarClientesNovedades cobrarclientesnovedadesTotales;
	public Long idCobrarClientesNovedadesActual;
	public Long iIdNuevoCobrarClientesNovedades=0L;
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
	
	public Boolean isPermisoTodoCobrarClientesNovedades;
	public Boolean isPermisoNuevoCobrarClientesNovedades;
	public Boolean isPermisoActualizarCobrarClientesNovedades;
	public Boolean isPermisoActualizarOriginalCobrarClientesNovedades;
	public Boolean isPermisoEliminarCobrarClientesNovedades;
	public Boolean isPermisoGuardarCambiosCobrarClientesNovedades;
	public Boolean isPermisoConsultaCobrarClientesNovedades;
	public Boolean isPermisoBusquedaCobrarClientesNovedades;
	public Boolean isPermisoReporteCobrarClientesNovedades;
	public Boolean isPermisoPaginacionMedioCobrarClientesNovedades;
	public Boolean isPermisoPaginacionAltoCobrarClientesNovedades;
	public Boolean isPermisoPaginacionTodoCobrarClientesNovedades;
	public Boolean isPermisoCopiarCobrarClientesNovedades;
	public Boolean isPermisoVerFormCobrarClientesNovedades;
	public Boolean isPermisoDuplicarCobrarClientesNovedades;
	public Boolean isPermisoOrdenCobrarClientesNovedades;
	
	
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
	
	public CobrarClientesNovedadesParameterReturnGeneral cobrarclientesnovedadesReturnGeneral;
	public CobrarClientesNovedadesParameterReturnGeneral cobrarclientesnovedadesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarClientesNovedades=false;
	public Boolean esParaAccionDesdeFormularioCobrarClientesNovedades=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarClientesNovedadesSessionBeanAdditional cobrarclientesnovedadesSessionBeanAdditional=null;
	
	public CobrarClientesNovedadesSessionBeanAdditional getCobrarClientesNovedadesSessionBeanAdditional() {
		return this.cobrarclientesnovedadesSessionBeanAdditional;
	}
	
	public void setCobrarClientesNovedadesSessionBeanAdditional(CobrarClientesNovedadesSessionBeanAdditional cobrarclientesnovedadesSessionBeanAdditional) {
		try {
			this.cobrarclientesnovedadesSessionBeanAdditional=cobrarclientesnovedadesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarClientesNovedadesBeanSwingJInternalFrameAdditional cobrarclientesnovedadesBeanSwingJInternalFrameAdditional=null;
	//public class CobrarClientesNovedadesBeanSwingJInternalFrame
	
	public CobrarClientesNovedadesBeanSwingJInternalFrameAdditional getCobrarClientesNovedadesBeanSwingJInternalFrameAdditional() {
		return this.cobrarclientesnovedadesBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarClientesNovedadesBeanSwingJInternalFrameAdditional(CobrarClientesNovedadesBeanSwingJInternalFrameAdditional cobrarclientesnovedadesBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarclientesnovedadesBeanSwingJInternalFrameAdditional=cobrarclientesnovedadesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarClientesNovedadesLogic cobrarclientesnovedadesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarClientesNovedades cobrarclientesnovedadesBean;
	public CobrarClientesNovedadesConstantesFunciones cobrarclientesnovedadesConstantesFunciones;
	//public CobrarClientesNovedadesParameterReturnGeneral cobrarclientesnovedadesReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarClientesNovedades> cobrarclientesnovedadess;	
	//public List<CobrarClientesNovedades> cobrarclientesnovedadessEliminados;
	//public List<CobrarClientesNovedades> cobrarclientesnovedadessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarClientesNovedades=true;
	public Boolean isVisibilidadCeldaCopiarCobrarClientesNovedades=true;
	public Boolean isVisibilidadCeldaVerFormCobrarClientesNovedades=true;
	public Boolean isVisibilidadCeldaOrdenCobrarClientesNovedades=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
	public Boolean isVisibilidadCeldaModificarCobrarClientesNovedades=false;
	public Boolean isVisibilidadCeldaActualizarCobrarClientesNovedades=false;
	public Boolean isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
	public Boolean isVisibilidadCeldaCancelarCobrarClientesNovedades=false;
	public Boolean isVisibilidadCeldaGuardarCobrarClientesNovedades=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarClientesNovedades=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCobrarClientesNovedades() {
		return this.iIdNuevoCobrarClientesNovedades;
	}

	public void setiIdNuevoCobrarClientesNovedades(Long iIdNuevoCobrarClientesNovedades) {
		this.iIdNuevoCobrarClientesNovedades = iIdNuevoCobrarClientesNovedades;
	}
	
	public Long getidCobrarClientesNovedadesActual() {
		return this.idCobrarClientesNovedadesActual;
	}

	public void setidCobrarClientesNovedadesActual(Long idCobrarClientesNovedadesActual) {
		this.idCobrarClientesNovedadesActual = idCobrarClientesNovedadesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarClientesNovedades getcobrarclientesnovedades() {
		return this.cobrarclientesnovedades;
	}

	public void setcobrarclientesnovedades(CobrarClientesNovedades cobrarclientesnovedades) {
		this.cobrarclientesnovedades = cobrarclientesnovedades;
	}
	
	public CobrarClientesNovedades getcobrarclientesnovedadesAux() {
		return this.cobrarclientesnovedadesAux;
	}

	public void setcobrarclientesnovedadesAux(CobrarClientesNovedades cobrarclientesnovedadesAux) {
		this.cobrarclientesnovedadesAux = cobrarclientesnovedadesAux;
	}				
	
	public CobrarClientesNovedades getcobrarclientesnovedadesAnterior() {
		return this.cobrarclientesnovedadesAnterior;
	}

	public void setcobrarclientesnovedadesAnterior(CobrarClientesNovedades cobrarclientesnovedadesAnterior) {
		this.cobrarclientesnovedadesAnterior = cobrarclientesnovedadesAnterior;
	}	
	
	public CobrarClientesNovedades getcobrarclientesnovedadesTotales() {
		return this.cobrarclientesnovedadesTotales;
	}

	public void setcobrarclientesnovedadesTotales(CobrarClientesNovedades cobrarclientesnovedadesTotales) {
		this.cobrarclientesnovedadesTotales = cobrarclientesnovedadesTotales;
	}	
	
	public CobrarClientesNovedades getcobrarclientesnovedadesBean() {
		return this.cobrarclientesnovedadesBean;
	}

	public void setcobrarclientesnovedadesBean(CobrarClientesNovedades cobrarclientesnovedadesBean) {
		this.cobrarclientesnovedadesBean = cobrarclientesnovedadesBean;
	}	
	
	public CobrarClientesNovedadesParameterReturnGeneral getcobrarclientesnovedadesReturnGeneral() {
		return this.cobrarclientesnovedadesReturnGeneral;
	}

	public void setcobrarclientesnovedadesReturnGeneral(CobrarClientesNovedadesParameterReturnGeneral cobrarclientesnovedadesReturnGeneral) {
		this.cobrarclientesnovedadesReturnGeneral = cobrarclientesnovedadesReturnGeneral;
	}	
	
	
	public Date feha_atencion_hastaBusquedaCobrarClientesNovedades=new Date();

	public Date getfeha_atencion_hastaBusquedaCobrarClientesNovedades() {
		return this.feha_atencion_hastaBusquedaCobrarClientesNovedades;
	}

	public void setfeha_atencion_hastaBusquedaCobrarClientesNovedades(Date feha_atencion_hastaBusquedaCobrarClientesNovedades) {
		this.feha_atencion_hastaBusquedaCobrarClientesNovedades = feha_atencion_hastaBusquedaCobrarClientesNovedades;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
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
	
	
	public CobrarClientesNovedadesLogic getCobrarClientesNovedadesLogic()	{		
		return cobrarclientesnovedadesLogic;
	}

	public void setCobrarClientesNovedadesLogic(CobrarClientesNovedadesLogic cobrarclientesnovedadesLogic) {
		this.cobrarclientesnovedadesLogic = cobrarclientesnovedadesLogic;
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
	
	public Boolean getIsEsNuevoCobrarClientesNovedades() {
		return isEsNuevoCobrarClientesNovedades;
	}

	public void setIsEsNuevoCobrarClientesNovedades(Boolean isEsNuevoCobrarClientesNovedades) {
		this.isEsNuevoCobrarClientesNovedades = isEsNuevoCobrarClientesNovedades;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarClientesNovedades() {
		return esParaAccionDesdeFormularioCobrarClientesNovedades;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarClientesNovedades(Boolean esParaAccionDesdeFormularioCobrarClientesNovedades) {
		this.esParaAccionDesdeFormularioCobrarClientesNovedades = esParaAccionDesdeFormularioCobrarClientesNovedades;
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

			if(this.cobrarclientesnovedadesSessionBean==null) {
				this.cobrarclientesnovedadesSessionBean=new CobrarClientesNovedadesSessionBean();
			}

			if(!this.cobrarclientesnovedadesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarclientesnovedadesSessionBean.getlidEmpresaActual());
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

			if(this.cobrarclientesnovedadesSessionBean==null) {
				this.cobrarclientesnovedadesSessionBean=new CobrarClientesNovedadesSessionBean();
			}

			if(!this.cobrarclientesnovedadesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cobrarclientesnovedadesSessionBean.getlidSucursalActual());
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

					if(this.cobrarclientesnovedades!=null) {
						this.cobrarclientesnovedades.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
						this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarClientesNovedades.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarClientesNovedadesGenerico)throws Exception
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
				jComboBoxid_empresaCobrarClientesNovedadesGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarClientesNovedadesGenerico!=null && jComboBoxid_empresaCobrarClientesNovedadesGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarClientesNovedadesGenerico.setSelectedIndex(0);
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

					if(this.cobrarclientesnovedades!=null) {
						this.cobrarclientesnovedades.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
						this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCobrarClientesNovedades.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
						if(this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCobrarClientesNovedadesGenerico)throws Exception
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
				jComboBoxid_sucursalCobrarClientesNovedadesGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCobrarClientesNovedadesGenerico!=null && jComboBoxid_sucursalCobrarClientesNovedadesGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCobrarClientesNovedadesGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarClientesNovedades cobrarclientesnovedades,JComboBox jComboBoxid_empresaCobrarClientesNovedadesGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarClientesNovedadesGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarClientesNovedadesGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarclientesnovedades.setid_empresa(empresaAux.getId());
				cobrarclientesnovedades.setempresa_descripcion(CobrarClientesNovedadesConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarclientesnovedades.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CobrarClientesNovedades cobrarclientesnovedades,JComboBox jComboBoxid_sucursalCobrarClientesNovedadesGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCobrarClientesNovedadesGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCobrarClientesNovedadesGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cobrarclientesnovedades.setid_sucursal(sucursalAux.getId());
				cobrarclientesnovedades.setsucursal_descripcion(CobrarClientesNovedadesConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cobrarclientesnovedades.setSucursal(sucursalAux);			}
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

					if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { 
					}

					if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { 
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { 
					}

					if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesCobrarClientesNovedades() throws Exception {
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
		
	public CobrarClientesNovedadesParameterReturnGeneral getCobrarClientesNovedadesParameterGeneral() {
		return this.cobrarclientesnovedadesParameterGeneral;
	}
	
	public void setCobrarClientesNovedadesParameterGeneral(CobrarClientesNovedadesParameterReturnGeneral cobrarclientesnovedadesParameterGeneral) {
		this.cobrarclientesnovedadesParameterGeneral = cobrarclientesnovedadesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarClientesNovedades() {
		return isPermisoTodoCobrarClientesNovedades;
	}

	public void setIsPermisoTodoCobrarClientesNovedades(Boolean isPermisoTodoCobrarClientesNovedades) {
		this.isPermisoTodoCobrarClientesNovedades = isPermisoTodoCobrarClientesNovedades;
	}

	public Boolean getIsPermisoNuevoCobrarClientesNovedades() {
		return isPermisoNuevoCobrarClientesNovedades;
	}

	public void setIsPermisoNuevoCobrarClientesNovedades(Boolean isPermisoNuevoCobrarClientesNovedades) {
		this.isPermisoNuevoCobrarClientesNovedades = isPermisoNuevoCobrarClientesNovedades;
	}

	public Boolean getIsPermisoActualizarCobrarClientesNovedades() {
		return isPermisoActualizarCobrarClientesNovedades;
	}

	public void setIsPermisoActualizarCobrarClientesNovedades(Boolean isPermisoActualizarCobrarClientesNovedades) {
		this.isPermisoActualizarCobrarClientesNovedades = isPermisoActualizarCobrarClientesNovedades;
	}

	public Boolean getIsPermisoEliminarCobrarClientesNovedades() {
		return isPermisoEliminarCobrarClientesNovedades;
	}

	public void setIsPermisoEliminarCobrarClientesNovedades(Boolean isPermisoEliminarCobrarClientesNovedades) {
		this.isPermisoEliminarCobrarClientesNovedades = isPermisoEliminarCobrarClientesNovedades;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarClientesNovedades() {
		return isPermisoGuardarCambiosCobrarClientesNovedades;
	}

	public void setIsPermisoGuardarCambiosCobrarClientesNovedades(Boolean isPermisoGuardarCambiosCobrarClientesNovedades) {
		this.isPermisoGuardarCambiosCobrarClientesNovedades = isPermisoGuardarCambiosCobrarClientesNovedades;
	}
	
	public Boolean getIsPermisoConsultaCobrarClientesNovedades() {
		return isPermisoConsultaCobrarClientesNovedades;
	}

	public void setIsPermisoConsultaCobrarClientesNovedades(Boolean isPermisoConsultaCobrarClientesNovedades) {
		this.isPermisoConsultaCobrarClientesNovedades = isPermisoConsultaCobrarClientesNovedades;
	}

	public Boolean getIsPermisoBusquedaCobrarClientesNovedades() {
		return isPermisoBusquedaCobrarClientesNovedades;
	}

	public void setIsPermisoBusquedaCobrarClientesNovedades(Boolean isPermisoBusquedaCobrarClientesNovedades) {
		this.isPermisoBusquedaCobrarClientesNovedades = isPermisoBusquedaCobrarClientesNovedades;
	}

	public Boolean getIsPermisoReporteCobrarClientesNovedades() {
		return isPermisoReporteCobrarClientesNovedades;
	}

	public void setIsPermisoReporteCobrarClientesNovedades(Boolean isPermisoReporteCobrarClientesNovedades) {
		this.isPermisoReporteCobrarClientesNovedades = isPermisoReporteCobrarClientesNovedades;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarClientesNovedades() {
		return isPermisoPaginacionMedioCobrarClientesNovedades;
	}

	public void setIsPermisoPaginacionMedioCobrarClientesNovedades(Boolean isPermisoPaginacionMedioCobrarClientesNovedades) {
		this.isPermisoPaginacionMedioCobrarClientesNovedades = isPermisoPaginacionMedioCobrarClientesNovedades;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarClientesNovedades() {
		return isPermisoPaginacionTodoCobrarClientesNovedades;
	}

	public void setIsPermisoPaginacionTodoCobrarClientesNovedades(Boolean isPermisoPaginacionTodoCobrarClientesNovedades) {
		this.isPermisoPaginacionTodoCobrarClientesNovedades = isPermisoPaginacionTodoCobrarClientesNovedades;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarClientesNovedades() {
		return isPermisoPaginacionAltoCobrarClientesNovedades;
	}

	public void setIsPermisoPaginacionAltoCobrarClientesNovedades(Boolean isPermisoPaginacionAltoCobrarClientesNovedades) {
		this.isPermisoPaginacionAltoCobrarClientesNovedades = isPermisoPaginacionAltoCobrarClientesNovedades;
	}
	
	public Boolean getIsPermisoCopiarCobrarClientesNovedades() {
		return isPermisoCopiarCobrarClientesNovedades;
	}

	public void setIsPermisoCopiarCobrarClientesNovedades(Boolean isPermisoCopiarCobrarClientesNovedades) {
		this.isPermisoCopiarCobrarClientesNovedades = isPermisoCopiarCobrarClientesNovedades;
	}
	
	public Boolean getIsPermisoVerFormCobrarClientesNovedades() {
		return isPermisoVerFormCobrarClientesNovedades;
	}

	public void setIsPermisoVerFormCobrarClientesNovedades(Boolean isPermisoVerFormCobrarClientesNovedades) {
		this.isPermisoVerFormCobrarClientesNovedades = isPermisoVerFormCobrarClientesNovedades;
	}
	
	public Boolean getIsPermisoDuplicarCobrarClientesNovedades() {
		return isPermisoDuplicarCobrarClientesNovedades;
	}

	public void setIsPermisoDuplicarCobrarClientesNovedades(Boolean isPermisoDuplicarCobrarClientesNovedades) {
		this.isPermisoDuplicarCobrarClientesNovedades = isPermisoDuplicarCobrarClientesNovedades;
	}
	
	public Boolean getIsPermisoOrdenCobrarClientesNovedades() {
		return isPermisoOrdenCobrarClientesNovedades;
	}

	public void setIsPermisoOrdenCobrarClientesNovedades(Boolean isPermisoOrdenCobrarClientesNovedades) {
		this.isPermisoOrdenCobrarClientesNovedades = isPermisoOrdenCobrarClientesNovedades;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarClientesNovedades() {
		return isVisibilidadCeldaNuevoCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaNuevoCobrarClientesNovedades(Boolean isVisibilidadCeldaNuevoCobrarClientesNovedades) {
		this.isVisibilidadCeldaNuevoCobrarClientesNovedades = isVisibilidadCeldaNuevoCobrarClientesNovedades;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarClientesNovedades() {
		return isVisibilidadCeldaDuplicarCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarClientesNovedades(Boolean isVisibilidadCeldaDuplicarCobrarClientesNovedades) {
		this.isVisibilidadCeldaDuplicarCobrarClientesNovedades = isVisibilidadCeldaDuplicarCobrarClientesNovedades;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarClientesNovedades() {
		return isVisibilidadCeldaCopiarCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaCopiarCobrarClientesNovedades(Boolean isVisibilidadCeldaCopiarCobrarClientesNovedades) {
		this.isVisibilidadCeldaCopiarCobrarClientesNovedades = isVisibilidadCeldaCopiarCobrarClientesNovedades;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarClientesNovedades() {
		return isVisibilidadCeldaVerFormCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaVerFormCobrarClientesNovedades(Boolean isVisibilidadCeldaVerFormCobrarClientesNovedades) {
		this.isVisibilidadCeldaVerFormCobrarClientesNovedades = isVisibilidadCeldaVerFormCobrarClientesNovedades;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarClientesNovedades() {
		return isVisibilidadCeldaOrdenCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaOrdenCobrarClientesNovedades(Boolean isVisibilidadCeldaOrdenCobrarClientesNovedades) {
		this.isVisibilidadCeldaOrdenCobrarClientesNovedades = isVisibilidadCeldaOrdenCobrarClientesNovedades;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades() {
		return isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades(Boolean isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades = isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarClientesNovedades() {
		return isVisibilidadCeldaModificarCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaModificarCobrarClientesNovedades(Boolean isVisibilidadCeldaModificarCobrarClientesNovedades) {
		this.isVisibilidadCeldaModificarCobrarClientesNovedades = isVisibilidadCeldaModificarCobrarClientesNovedades;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarClientesNovedades() {
		return isVisibilidadCeldaActualizarCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaActualizarCobrarClientesNovedades(Boolean isVisibilidadCeldaActualizarCobrarClientesNovedades) {
		this.isVisibilidadCeldaActualizarCobrarClientesNovedades = isVisibilidadCeldaActualizarCobrarClientesNovedades;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarClientesNovedades() {
		return isVisibilidadCeldaEliminarCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaEliminarCobrarClientesNovedades(Boolean isVisibilidadCeldaEliminarCobrarClientesNovedades) {
		this.isVisibilidadCeldaEliminarCobrarClientesNovedades = isVisibilidadCeldaEliminarCobrarClientesNovedades;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarClientesNovedades() {
		return isVisibilidadCeldaCancelarCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaCancelarCobrarClientesNovedades(Boolean isVisibilidadCeldaCancelarCobrarClientesNovedades) {
		this.isVisibilidadCeldaCancelarCobrarClientesNovedades = isVisibilidadCeldaCancelarCobrarClientesNovedades;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarClientesNovedades() {
		return isVisibilidadCeldaGuardarCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaGuardarCobrarClientesNovedades(Boolean isVisibilidadCeldaGuardarCobrarClientesNovedades) {
		this.isVisibilidadCeldaGuardarCobrarClientesNovedades = isVisibilidadCeldaGuardarCobrarClientesNovedades;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarClientesNovedades() {
		return isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarClientesNovedades(Boolean isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades) {
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades = isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades;
	}
		
	public CobrarClientesNovedadesSessionBean getcobrarclientesnovedadesSessionBean() {
		return this.cobrarclientesnovedadesSessionBean;
	}
	
	public void setcobrarclientesnovedadesSessionBean(CobrarClientesNovedadesSessionBean cobrarclientesnovedadesSessionBean) {
		this.cobrarclientesnovedadesSessionBean=cobrarclientesnovedadesSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarClientesNovedades() {
		return this.isVisibilidadBusquedaCobrarClientesNovedades;
	}

	public void setisVisibilidadBusquedaCobrarClientesNovedades(Boolean isVisibilidadBusquedaCobrarClientesNovedades) {
		this.isVisibilidadBusquedaCobrarClientesNovedades=isVisibilidadBusquedaCobrarClientesNovedades;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarclientesnovedades,null);
				this.setActualParaGuardarSucursalForeignKey(cobrarclientesnovedades,null);
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
	
	public void bugActualizarReferenciaActual(CobrarClientesNovedades cobrarclientesnovedades,CobrarClientesNovedades cobrarclientesnovedadesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarClientesNovedades(cobrarclientesnovedades);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarclientesnovedadesAux.setId(cobrarclientesnovedades.getId());
		cobrarclientesnovedadesAux.setVersionRow(cobrarclientesnovedades.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarClientesNovedades cobrarclientesnovedadesLocal) throws Exception {
		
		if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarClientesNovedades cobrarclientesnovedadesLocal) throws Exception {	
		if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarclientesnovedadesLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cobrarclientesnovedadesLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarClientesNovedadesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarclientesnovedadesValidator.getInvalidValues(this.cobrarclientesnovedades);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarClientesNovedades cobrarclientesnovedades,List<CobrarClientesNovedades> cobrarclientesnovedadess) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarClientesNovedades cobrarclientesnovedades,List<CobrarClientesNovedades> cobrarclientesnovedadess) throws Exception {
		try	{			
			CobrarClientesNovedadesConstantesFunciones.actualizarSelectedLista(cobrarclientesnovedades,cobrarclientesnovedadess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarClientesNovedades> cobrarclientesnovedadessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarclientesnovedadessLocal=this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarclientesnovedadessLocal=this.cobrarclientesnovedadess;
			}
			//ARCHITECTURE
		
			for(CobrarClientesNovedades cobrarclientesnovedadesLocal:cobrarclientesnovedadessLocal) {
				if(this.permiteMantenimiento(cobrarclientesnovedadesLocal) && cobrarclientesnovedadesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarClientesNovedadesConstantesFunciones.getCobrarClientesNovedadesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarClientesNovedadesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelcodigoCobrarClientesNovedades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesNovedadesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelnombreCobrarClientesNovedades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesNovedadesConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelapellidoCobrarClientesNovedades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesNovedadesConstantesFunciones.FEHAATENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelfeha_atencionCobrarClientesNovedades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesNovedadesConstantesFunciones.HORAATENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelhora_atencionCobrarClientesNovedades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesNovedadesConstantesFunciones.ACCIONTOMADA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelaccion_tomadaCobrarClientesNovedades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesNovedadesConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabeldescripcionCobrarClientesNovedades,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarClientesNovedadesConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelesta_activoCobrarClientesNovedades,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelcodigoCobrarClientesNovedades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelnombreCobrarClientesNovedades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelapellidoCobrarClientesNovedades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelfeha_atencionCobrarClientesNovedades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelhora_atencionCobrarClientesNovedades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelaccion_tomadaCobrarClientesNovedades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabeldescripcionCobrarClientesNovedades,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelesta_activoCobrarClientesNovedades,"");
		
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
		this.iIdNuevoCobrarClientesNovedades--;	
		
		
		this.cobrarclientesnovedadesAux=new CobrarClientesNovedades();
		
		this.cobrarclientesnovedadesAux.setId(this.iIdNuevoCobrarClientesNovedades);
		this.cobrarclientesnovedadesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().add(this.cobrarclientesnovedadesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarclientesnovedadess.add(this.cobrarclientesnovedadesAux);
		}
		//ARCHITECTURE
		
		this.cobrarclientesnovedades=this.cobrarclientesnovedadesAux;
		
		if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarClientesNovedades(this.cobrarclientesnovedades);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesNovedades(this.cobrarclientesnovedades);
		}
				
		//this.setDefaultControlesCobrarClientesNovedades();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarClientesNovedades();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesNovedades();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesNovedades();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedadesBean,this.cobrarclientesnovedades,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesNovedades(this.cobrarclientesnovedadesReturnGeneral,this.cobrarclientesnovedadesBean,false);
		
		if(this.cobrarclientesnovedadesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesNovedades(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarClientesNovedades(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades());
		}
		
		if(this.cobrarclientesnovedadesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesNovedades(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades(),classes);//this.cobrarclientesnovedadesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarClientesNovedades();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarClientesNovedades();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.RecargarFormCobrarClientesNovedades(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarClientesNovedades(false);
						
			if(cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesNovedades();
			}
			
			this.actualizarVisualTableDatosCobrarClientesNovedades();
			
			this.jTableDatosCobrarClientesNovedades.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesNovedades(), this.getIndiceNuevoCobrarClientesNovedades());
			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
						
			this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarClientesNovedades(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activarfeha_atencion_hastaCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextFieldcodigoCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activarcodigoCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreanombreCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activarnombreCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaapellidoCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activarapellidoCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencionCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activarfeha_atencionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jSpinnerhora_atencionCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activarhora_atencionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaaccion_tomadaCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activaraccion_tomadaCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreadescripcionCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activardescripcionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activaresta_activoCobrarClientesNovedades);	
		//
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activarid_empresaCobrarClientesNovedades);//
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setEnabled(isHabilitar && this.cobrarclientesnovedadesConstantesFunciones.activarid_sucursalCobrarClientesNovedades);
	};
	
	public void setDefaultControlesCobrarClientesNovedades() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarClientesNovedades(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarclientesnovedadesSessionBean.setConGuardarRelaciones(true);			
			this.cobrarclientesnovedadesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.setVisible(true);
			
					
		} else {
			//this.cobrarclientesnovedadesSessionBean.setConGuardarRelaciones(false);			
			this.cobrarclientesnovedadesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarClientesNovedades() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
				if(cobrarclientesnovedadesAux.getId().equals(this.iIdNuevoCobrarClientesNovedades)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadess) {
				if(cobrarclientesnovedadesAux.getId().equals(this.iIdNuevoCobrarClientesNovedades)) {
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
	
	public int getIndiceActualCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
				if(cobrarclientesnovedadesAux.getId().equals(cobrarclientesnovedades.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadess) {
				if(cobrarclientesnovedadesAux.getId().equals(cobrarclientesnovedades.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedadesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
				if(cobrarclientesnovedadesAux.getCobrarClientesNovedadesOriginal().getId().equals(cobrarclientesnovedadesOriginal.getId())) {
					existe=true;
					cobrarclientesnovedadesOriginal.setId(cobrarclientesnovedadesAux.getId());
					cobrarclientesnovedadesOriginal.setVersionRow(cobrarclientesnovedadesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadess) {
				if(cobrarclientesnovedadesAux.getCobrarClientesNovedadesOriginal().getId().equals(cobrarclientesnovedadesOriginal.getId())) {
					existe=true;
					cobrarclientesnovedadesOriginal.setId(cobrarclientesnovedadesAux.getId());
					cobrarclientesnovedadesOriginal.setVersionRow(cobrarclientesnovedadesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarClientesNovedades(Boolean esParaCancelar) throws Exception {
		cobrarclientesnovedadessAux=new ArrayList<CobrarClientesNovedades>();
		cobrarclientesnovedadesAux=new CobrarClientesNovedades();
		
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
					if(cobrarclientesnovedadesAux.getId()<0) {
						cobrarclientesnovedadessAux.add(cobrarclientesnovedadesAux);
					}		
				}
				this.iIdNuevoCobrarClientesNovedades=0L;
				this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().removeAll(cobrarclientesnovedadessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadess) {
					if(cobrarclientesnovedadesAux.getId()<0) {
						cobrarclientesnovedadessAux.add(cobrarclientesnovedadesAux);
					}		
				}
				this.iIdNuevoCobrarClientesNovedades=0L;
				this.cobrarclientesnovedadess.removeAll(cobrarclientesnovedadessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesNovedades 
					&& this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size()>0
					) {
					cobrarclientesnovedadesAux=this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().get(this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size() - 1);
				
					if(cobrarclientesnovedadesAux.getId()<0) {
						this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().remove(cobrarclientesnovedadesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarClientesNovedades && this.cobrarclientesnovedadess.size()>0) {
					cobrarclientesnovedadesAux=this.cobrarclientesnovedadess.get(this.cobrarclientesnovedadess.size() - 1);
				
					if(cobrarclientesnovedadesAux.getId()<0) {
						this.cobrarclientesnovedadess.remove(cobrarclientesnovedadesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarClientesNovedades(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarclientesnovedades.getId()<0) {
				this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().remove(this.cobrarclientesnovedades);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarclientesnovedades.getId()<0) {
				this.cobrarclientesnovedadess.remove(this.cobrarclientesnovedades);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarClientesNovedades(List<CobrarClientesNovedades> cobrarclientesnovedadessAux) throws Exception {
		CobrarClientesNovedadesConstantesFunciones.setEstadosInicialesCobrarClientesNovedades(cobrarclientesnovedadessAux);
	}
	
	public void setEstadosInicialesCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedadesAux) throws Exception {
		CobrarClientesNovedadesConstantesFunciones.setEstadosInicialesCobrarClientesNovedades(cobrarclientesnovedadesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarClientesNovedadesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarClientesNovedadesActual()) {
				if(!this.isEsNuevoCobrarClientesNovedades) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarClientesNovedades=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarClientesNovedadesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Clientes Novedades ?", "MANTENIMIENTO DE Cobrar Clientes Novedades", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarClientesNovedades cobrarclientesnovedades) throws Exception {
		CobrarClientesNovedadesConstantesFunciones.seleccionarAsignar(this.cobrarclientesnovedades,cobrarclientesnovedades);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarClientesNovedades=this.isPermisoActualizarOriginalCobrarClientesNovedades;
			
			
			this.seleccionarAsignar(cobrarclientesnovedades);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarclientesnovedadesSessionBean.setsFuncionBusquedaRapida(this.cobrarclientesnovedadesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarClientesNovedades) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarClientesNovedades(esParaCancelar);				
				this.cancelarNuevoCobrarClientesNovedades(esParaCancelar);								
			}
			
			this.cobrarclientesnovedades=new CobrarClientesNovedades();
			
			this.inicializarCobrarClientesNovedades();
			
			this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarClientesNovedades() throws Exception {
		try {
			CobrarClientesNovedadesConstantesFunciones.inicializarCobrarClientesNovedades(this.cobrarclientesnovedades);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarClientesNovedadess(String sAccionBusqueda,List<CobrarClientesNovedades> cobrarclientesnovedadessParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarClientesNovedades"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarClientesNovedadesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarClientesNovedadesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarClientesNovedades"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Clientes Novedadeses");		
		parameters.put("busquedapor", CobrarClientesNovedadesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarClientesNovedades=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarClientesNovedadesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarClientesNovedadesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarClientesNovedades=new JRBeanArrayDataSource(CobrarClientesNovedadesJInternalFrame.TraerCobrarClientesNovedadesBeans(cobrarclientesnovedadessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarClientesNovedades);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarClientesNovedadesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarClientesNovedadesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarClientesNovedadesBean.TraerCobrarClientesNovedadesBeans(cobrarclientesnovedadessParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarClientesNovedadess(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesnovedadessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarClientesNovedadess(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesnovedadessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarClientesNovedadesActionPerformed(null);
					//this.generarExcelReporteCobrarClientesNovedadess(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesnovedadessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarClientesNovedadess(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesnovedadessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarClientesNovedadess(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesnovedadessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarClientesNovedadess(sAccionBusqueda,sTipoArchivoReporte,cobrarclientesnovedadessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarClientesNovedadess(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesNovedades> cobrarclientesnovedadessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesnovedades";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesNovedadess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesNovedades("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarClientesNovedades cobrarclientesnovedades : cobrarclientesnovedadessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarClientesNovedadesConstantesFunciones.generarExcelReporteDataCobrarClientesNovedades("NORMAL",row,workbook,cobrarclientesnovedades,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarClientesNovedades(String sTipo,Row row,Workbook workbook) {
		
		CobrarClientesNovedadesConstantesFunciones.generarExcelReporteHeaderCobrarClientesNovedades(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarClientesNovedadess(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesNovedades> cobrarclientesnovedadessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesnovedades_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesNovedadess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarClientesNovedades cobrarclientesnovedades : cobrarclientesnovedadessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.getCobrarClientesNovedadesDescripcion(cobrarclientesnovedades));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getfeha_atencion_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getfeha_atencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.gethora_atencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getaccion_tomada());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarclientesnovedades.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(cobrarclientesnovedades.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarClientesNovedadess(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarClientesNovedades> cobrarclientesnovedadessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarClientesNovedades> cobrarclientesnovedadessRespaldo=null;
		
		classes=CobrarClientesNovedadesConstantesFunciones.getClassesRelationshipsOfCobrarClientesNovedades(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarclientesnovedadesLogic.setDatosCliente(this.datosCliente);
		this.cobrarclientesnovedadesLogic.setDatosDeep(this.datosDeep);
		this.cobrarclientesnovedadesLogic.setIsConDeep(true);
		
		cobrarclientesnovedadessRespaldo=this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess();
		
		this.cobrarclientesnovedadesLogic.setCobrarClientesNovedadess(cobrarclientesnovedadessParaReportes);	
		this.cobrarclientesnovedadesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarclientesnovedadessParaReportes=this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess();
		this.cobrarclientesnovedadesLogic.setCobrarClientesNovedadess(cobrarclientesnovedadessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesnovedades_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarClientesNovedadess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarClientesNovedades("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarClientesNovedades cobrarclientesnovedades : cobrarclientesnovedadessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarClientesNovedades("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarClientesNovedadesConstantesFunciones.generarExcelReporteDataCobrarClientesNovedades("NORMAL",row,workbook,cobrarclientesnovedades,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.getCobrarClientesNovedadesDescripcion(cobrarclientesnovedades));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarClientesNovedades() throws Exception {		
		this.startProcessCobrarClientesNovedades(true);
	}
	
	public void startProcessCobrarClientesNovedades(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarClientesNovedades ,this.jPanelParametrosReportesCobrarClientesNovedades, this.jScrollPanelDatosCobrarClientesNovedades,this.jPanelPaginacionCobrarClientesNovedades, this.jScrollPanelDatosEdicionCobrarClientesNovedades, this.jPanelAccionesCobrarClientesNovedades,this.jPanelAccionesFormularioCobrarClientesNovedades,this.jmenuBarCobrarClientesNovedades,this.jmenuBarDetalleCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,this.jTtoolBarDetalleCobrarClientesNovedades);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesNovedades=this.jTabbedPaneBusquedasCobrarClientesNovedades; 
		
		final JPanel jPanelParametrosReportesCobrarClientesNovedades=this.jPanelParametrosReportesCobrarClientesNovedades;
		//final JScrollPane jScrollPanelDatosCobrarClientesNovedades=this.jScrollPanelDatosCobrarClientesNovedades;
		final JTable jTableDatosCobrarClientesNovedades=this.jTableDatosCobrarClientesNovedades;		
		final JPanel jPanelPaginacionCobrarClientesNovedades=this.jPanelPaginacionCobrarClientesNovedades;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesNovedades=this.jScrollPanelDatosEdicionCobrarClientesNovedades;
		final JPanel jPanelAccionesCobrarClientesNovedades=this.jPanelAccionesCobrarClientesNovedades;
		
		JPanel jPanelCamposAuxiliarCobrarClientesNovedades=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesNovedades=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			jPanelCamposAuxiliarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelCamposCobrarClientesNovedades;
			jPanelAccionesFormularioAuxiliarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelAccionesFormularioCobrarClientesNovedades;
		}
		
		final JPanel jPanelCamposCobrarClientesNovedades=jPanelCamposAuxiliarCobrarClientesNovedades;
		final JPanel jPanelAccionesFormularioCobrarClientesNovedades=jPanelAccionesFormularioAuxiliarCobrarClientesNovedades;
		
		
		final JMenuBar jmenuBarCobrarClientesNovedades=this.jmenuBarCobrarClientesNovedades;
		final JToolBar jTtoolBarCobrarClientesNovedades=this.jTtoolBarCobrarClientesNovedades;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesNovedades=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesNovedades=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jmenuBarDetalleCobrarClientesNovedades;
			jTtoolBarDetalleAuxiliarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jTtoolBarDetalleCobrarClientesNovedades;
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesNovedades=jmenuBarDetalleAuxiliarCobrarClientesNovedades;
		final JToolBar jTtoolBarDetalleCobrarClientesNovedades=jTtoolBarDetalleAuxiliarCobrarClientesNovedades;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesNovedades;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesNovedades;
			processRunnable.jTableDatos=jTableDatosCobrarClientesNovedades;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesNovedades;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesNovedades;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesNovedades;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesNovedades;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesNovedades;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesNovedades;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesNovedades;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesNovedades;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesNovedades ,jPanelParametrosReportesCobrarClientesNovedades,jTableDatosCobrarClientesNovedades, /*jScrollPanelDatosCobrarClientesNovedades,*/jPanelCamposCobrarClientesNovedades,jPanelPaginacionCobrarClientesNovedades, /*jScrollPanelDatosEdicionCobrarClientesNovedades,*/ jPanelAccionesCobrarClientesNovedades,jPanelAccionesFormularioCobrarClientesNovedades,jmenuBarCobrarClientesNovedades,jmenuBarDetalleCobrarClientesNovedades,jTtoolBarCobrarClientesNovedades,jTtoolBarDetalleCobrarClientesNovedades);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarClientesNovedades ,jPanelParametrosReportesCobrarClientesNovedades, jScrollPanelDatosCobrarClientesNovedades,jPanelPaginacionCobrarClientesNovedades, jScrollPanelDatosEdicionCobrarClientesNovedades, jPanelAccionesCobrarClientesNovedades,jPanelAccionesFormularioCobrarClientesNovedades,jmenuBarCobrarClientesNovedades,jmenuBarDetalleCobrarClientesNovedades,jTtoolBarCobrarClientesNovedades,jTtoolBarDetalleCobrarClientesNovedades);
						
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
	
	public void finishProcessCobrarClientesNovedades() {// throws Exception 
		this.finishProcessCobrarClientesNovedades(true);
	}
	
	public void finishProcessCobrarClientesNovedades(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarClientesNovedades ,this.jPanelParametrosReportesCobrarClientesNovedades, this.jScrollPanelDatosCobrarClientesNovedades,this.jPanelPaginacionCobrarClientesNovedades, this.jScrollPanelDatosEdicionCobrarClientesNovedades, this.jPanelAccionesCobrarClientesNovedades,this.jPanelAccionesFormularioCobrarClientesNovedades,this.jmenuBarCobrarClientesNovedades,this.jmenuBarDetalleCobrarClientesNovedades,this.jTtoolBarCobrarClientesNovedades,this.jTtoolBarDetalleCobrarClientesNovedades);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarClientesNovedades=this.jTabbedPaneBusquedasCobrarClientesNovedades; 
		
		final JPanel jPanelParametrosReportesCobrarClientesNovedades=this.jPanelParametrosReportesCobrarClientesNovedades;
		//final JScrollPane jScrollPanelDatosCobrarClientesNovedades=this.jScrollPanelDatosCobrarClientesNovedades;
		final JTable jTableDatosCobrarClientesNovedades=this.jTableDatosCobrarClientesNovedades;		
		final JPanel jPanelPaginacionCobrarClientesNovedades=this.jPanelPaginacionCobrarClientesNovedades;
		//final JScrollPane jScrollPanelDatosEdicionCobrarClientesNovedades=this.jScrollPanelDatosEdicionCobrarClientesNovedades;
		final JPanel jPanelAccionesCobrarClientesNovedades=this.jPanelAccionesCobrarClientesNovedades;
		
		JPanel jPanelCamposAuxiliarCobrarClientesNovedades=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarClientesNovedades=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			jPanelCamposAuxiliarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelCamposCobrarClientesNovedades;
			jPanelAccionesFormularioAuxiliarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelAccionesFormularioCobrarClientesNovedades;
		}
		
		final JPanel jPanelCamposCobrarClientesNovedades=jPanelCamposAuxiliarCobrarClientesNovedades;
		final JPanel jPanelAccionesFormularioCobrarClientesNovedades=jPanelAccionesFormularioAuxiliarCobrarClientesNovedades;
		
		
		final JMenuBar jmenuBarCobrarClientesNovedades=this.jmenuBarCobrarClientesNovedades;		
		final JToolBar jTtoolBarCobrarClientesNovedades=this.jTtoolBarCobrarClientesNovedades;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarClientesNovedades=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarClientesNovedades=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			jmenuBarDetalleAuxiliarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jmenuBarDetalleCobrarClientesNovedades;
			jTtoolBarDetalleAuxiliarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jTtoolBarDetalleCobrarClientesNovedades;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarClientesNovedades=jmenuBarDetalleAuxiliarCobrarClientesNovedades;
		final JToolBar jTtoolBarDetalleCobrarClientesNovedades=jTtoolBarDetalleAuxiliarCobrarClientesNovedades;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarClientesNovedades;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarClientesNovedades;
			processRunnable.jTableDatos=jTableDatosCobrarClientesNovedades;
			processRunnable.jPanelCampos=jPanelCamposCobrarClientesNovedades;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarClientesNovedades;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarClientesNovedades;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarClientesNovedades;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarClientesNovedades;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarClientesNovedades;
			processRunnable.jTtoolBar=jTtoolBarCobrarClientesNovedades;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarClientesNovedades;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarClientesNovedades ,jPanelParametrosReportesCobrarClientesNovedades, jTableDatosCobrarClientesNovedades,/*jScrollPanelDatosCobrarClientesNovedades,*/jPanelCamposCobrarClientesNovedades,jPanelPaginacionCobrarClientesNovedades, /*jScrollPanelDatosEdicionCobrarClientesNovedades,*/ jPanelAccionesCobrarClientesNovedades,jPanelAccionesFormularioCobrarClientesNovedades,jmenuBarCobrarClientesNovedades,jmenuBarDetalleCobrarClientesNovedades,jTtoolBarCobrarClientesNovedades,jTtoolBarDetalleCobrarClientesNovedades));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarClientesNovedades(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarClientesNovedades(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarClientesNovedades(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarClientesNovedades(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarClientesNovedades,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarClientesNovedades,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarClientesNovedades(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarClientesNovedades,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarClientesNovedades,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarclientesnovedadesConstantesFunciones.getsFinalQueryCobrarClientesNovedades();
		String  finalQueryPaginacionTodos=this.cobrarclientesnovedadesConstantesFunciones.getsFinalQueryCobrarClientesNovedades();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarClientesNovedadesConstantesFunciones.getArrayColumnasGlobalesNoCobrarClientesNovedades(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarClientesNovedadesConstantesFunciones.getArrayColumnasGlobalesCobrarClientesNovedades(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarClientesNovedadesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarclientesnovedadessEliminados= new ArrayList<CobrarClientesNovedades>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarClientesNovedades();
		
				///*CobrarClientesNovedadesSessionBean*/this.cobrarclientesnovedadesSessionBean=new CobrarClientesNovedadesSessionBean();
			
			if(this.cobrarclientesnovedadesSessionBean==null) {
				this.cobrarclientesnovedadesSessionBean=new CobrarClientesNovedadesSessionBean();
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
					this.iNumeroPaginacion=CobrarClientesNovedadesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarClientesNovedadesConstantesFunciones.getClassesForeignKeysOfCobrarClientesNovedades(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarclientesnovedades."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarclientesnovedadessAux= new ArrayList<CobrarClientesNovedades>();
			
				
			cobrarclientesnovedadesLogic.setDatosCliente(this.datosCliente);
			cobrarclientesnovedadesLogic.setDatosDeep(this.datosDeep);
			cobrarclientesnovedadesLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarClientesNovedades")) {
				this.sDetalleReporte=CobrarClientesNovedadesConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesNovedades(feha_atencion_hastaBusquedaCobrarClientesNovedades);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarclientesnovedadesLogic.getCobrarClientesNovedadessBusquedaCobrarClientesNovedades(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,feha_atencion_hastaBusquedaCobrarClientesNovedades);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesNovedadesConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesNovedades(feha_atencion_hastaBusquedaCobrarClientesNovedades);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesNovedadesConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesNovedades(feha_atencion_hastaBusquedaCobrarClientesNovedades);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()==null||cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarclientesnovedadess==null|| cobrarclientesnovedadess.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesnovedadessAux=new ArrayList<CobrarClientesNovedades>();
						cobrarclientesnovedadessAux.addAll(cobrarclientesnovedadesLogic.getCobrarClientesNovedadess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesnovedadessAux=new ArrayList<CobrarClientesNovedades>();
							cobrarclientesnovedadessAux.addAll(cobrarclientesnovedadess);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarclientesnovedadesLogic.getCobrarClientesNovedadessBusquedaCobrarClientesNovedades(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,feha_atencion_hastaBusquedaCobrarClientesNovedades);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarClientesNovedadesConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesNovedades(feha_atencion_hastaBusquedaCobrarClientesNovedades);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarClientesNovedadesConstantesFunciones.getDetalleIndiceBusquedaCobrarClientesNovedades(feha_atencion_hastaBusquedaCobrarClientesNovedades);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarClientesNovedadess("BusquedaCobrarClientesNovedades",cobrarclientesnovedadesLogic.getCobrarClientesNovedadess());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarClientesNovedadess("BusquedaCobrarClientesNovedades",cobrarclientesnovedadess);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesnovedadesLogic.setCobrarClientesNovedadess(new ArrayList<CobrarClientesNovedades>());
						cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().addAll(cobrarclientesnovedadessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesnovedadess=new ArrayList<CobrarClientesNovedades>();
							cobrarclientesnovedadess.addAll(cobrarclientesnovedadessAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarClientesNovedades();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarClientesNovedades();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesnovedadess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarclientesnovedadess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarClientesNovedades cobrarclientesnovedades) {
		Boolean permite=true;
		
		if(this.cobrarclientesnovedades.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarClientesNovedadesConstantesFunciones.getOrderByListaCobrarClientesNovedades();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarClientesNovedadesConstantesFunciones.getOrderByListaCobrarClientesNovedades();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
				if(cobrarclientesnovedades.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesnovedadesTotales=cobrarclientesnovedades;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesNovedades cobrarclientesnovedades:this.cobrarclientesnovedadess) {
				if(cobrarclientesnovedades.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesnovedadesTotales=cobrarclientesnovedades;
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
			this.cobrarclientesnovedadesAux=new CobrarClientesNovedades();
			this.cobrarclientesnovedadesAux.setsType(Constantes2.S_TOTALES);
			this.cobrarclientesnovedadesAux.setIsNew(false);
			this.cobrarclientesnovedadesAux.setIsChanged(false);
			this.cobrarclientesnovedadesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarClientesNovedadesConstantesFunciones.TotalizarValoresFilaCobrarClientesNovedades(this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess(),this.cobrarclientesnovedadesAux);
				
				//this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().add(this.cobrarclientesnovedadesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarClientesNovedadesConstantesFunciones.TotalizarValoresFilaCobrarClientesNovedades(this.cobrarclientesnovedadess,this.cobrarclientesnovedadesAux);
				
				this.cobrarclientesnovedadess.add(this.cobrarclientesnovedadesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarclientesnovedadesTotales=new CobrarClientesNovedades();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().remove(cobrarclientesnovedadesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarclientesnovedadess.remove(cobrarclientesnovedadesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarclientesnovedadesTotales=new CobrarClientesNovedades();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
				if(cobrarclientesnovedades.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesnovedadesTotales=cobrarclientesnovedades;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesNovedadesConstantesFunciones.TotalizarValoresFilaCobrarClientesNovedades(this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess(),cobrarclientesnovedadesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarClientesNovedades cobrarclientesnovedades:this.cobrarclientesnovedadess) {
				if(cobrarclientesnovedades.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarclientesnovedadesTotales=cobrarclientesnovedades;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarClientesNovedadesConstantesFunciones.TotalizarValoresFilaCobrarClientesNovedades(this.cobrarclientesnovedadess,cobrarclientesnovedadesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarClientesNovedadessBusquedaCobrarClientesNovedades()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarClientesNovedades";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesNovedadessFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarClientesNovedadessFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarClientesNovedadessBusquedaCobrarClientesNovedades(String sFinalQuery,Date feha_atencion_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesnovedadesLogic.getCobrarClientesNovedadessBusquedaCobrarClientesNovedades(sFinalQuery,this.pagination,feha_atencion_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesNovedadessFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesnovedadesLogic.getCobrarClientesNovedadessFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarClientesNovedadessFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarclientesnovedadesLogic.getCobrarClientesNovedadessFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCobrarClientesNovedades() {
		this.isPermisoTodoCobrarClientesNovedades=false;
		this.isPermisoNuevoCobrarClientesNovedades=false;
		this.isPermisoActualizarCobrarClientesNovedades=false;
		this.isPermisoActualizarOriginalCobrarClientesNovedades=false;
		this.isPermisoEliminarCobrarClientesNovedades=false;
		this.isPermisoGuardarCambiosCobrarClientesNovedades=false;
		this.isPermisoConsultaCobrarClientesNovedades=true;
		this.isPermisoBusquedaCobrarClientesNovedades=true;
		this.isPermisoReporteCobrarClientesNovedades=true;
		this.isPermisoOrdenCobrarClientesNovedades=false;		
		this.isPermisoPaginacionMedioCobrarClientesNovedades=false;		
		this.isPermisoPaginacionAltoCobrarClientesNovedades=false;		
		this.isPermisoPaginacionTodoCobrarClientesNovedades=false;		
		this.isPermisoCopiarCobrarClientesNovedades=false;		
		this.isPermisoVerFormCobrarClientesNovedades=false;		
		this.isPermisoDuplicarCobrarClientesNovedades=false;
		this.isPermisoOrdenCobrarClientesNovedades=false;
	}
	
	public void setPermisosUsuarioCobrarClientesNovedades(Boolean isPermiso) {
		this.isPermisoTodoCobrarClientesNovedades=isPermiso;
		this.isPermisoNuevoCobrarClientesNovedades=isPermiso;
		this.isPermisoActualizarCobrarClientesNovedades=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesNovedades=isPermiso;
		this.isPermisoEliminarCobrarClientesNovedades=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesNovedades=isPermiso;
		this.isPermisoConsultaCobrarClientesNovedades=isPermiso;
		this.isPermisoBusquedaCobrarClientesNovedades=isPermiso;
		this.isPermisoReporteCobrarClientesNovedades=isPermiso;
		this.isPermisoOrdenCobrarClientesNovedades=isPermiso;		
		this.isPermisoPaginacionMedioCobrarClientesNovedades=isPermiso;		
		this.isPermisoPaginacionAltoCobrarClientesNovedades=isPermiso;		
		this.isPermisoPaginacionTodoCobrarClientesNovedades=isPermiso;		
		this.isPermisoCopiarCobrarClientesNovedades=isPermiso;		
		this.isPermisoVerFormCobrarClientesNovedades=isPermiso;		
		this.isPermisoDuplicarCobrarClientesNovedades=isPermiso;
		this.isPermisoOrdenCobrarClientesNovedades=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarClientesNovedades(Boolean isPermiso) {
		//this.isPermisoTodoCobrarClientesNovedades=isPermiso;
		this.isPermisoNuevoCobrarClientesNovedades=isPermiso;
		this.isPermisoActualizarCobrarClientesNovedades=isPermiso;
		this.isPermisoActualizarOriginalCobrarClientesNovedades=isPermiso;
		this.isPermisoEliminarCobrarClientesNovedades=isPermiso;
		this.isPermisoGuardarCambiosCobrarClientesNovedades=isPermiso;
		//this.isPermisoConsultaCobrarClientesNovedades=isPermiso;
		//this.isPermisoBusquedaCobrarClientesNovedades=isPermiso;
		//this.isPermisoReporteCobrarClientesNovedades=isPermiso;
		//this.isPermisoOrdenCobrarClientesNovedades=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarClientesNovedades=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarClientesNovedades=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarClientesNovedades=isPermiso;		
		//this.isPermisoCopiarCobrarClientesNovedades=isPermiso;		
		//this.isPermisoDuplicarCobrarClientesNovedades=isPermiso;
		//this.isPermisoOrdenCobrarClientesNovedades=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesNovedadesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarClientesNovedadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarClientesNovedades(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarClientesNovedadesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarClientesNovedadesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarClientesNovedadesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarClientesNovedadesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarClientesNovedades() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarClientesNovedadesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarClientesNovedadesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarClientesNovedades=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarClientesNovedades=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarClientesNovedades=this.isPermisoActualizarCobrarClientesNovedades;
			this.isPermisoEliminarCobrarClientesNovedades=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarClientesNovedades=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarClientesNovedades=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarClientesNovedades=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarClientesNovedades=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarClientesNovedades=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesNovedades=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarClientesNovedades=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarClientesNovedades=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarClientesNovedades=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarClientesNovedades=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarClientesNovedades=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarClientesNovedades=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarClientesNovedades=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarClientesNovedades.setToolTipText(this.jTableDatosCobrarClientesNovedades.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarClientesNovedades(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarClientesNovedades(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarClientesNovedadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarClientesNovedadesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarClientesNovedades() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarClientesNovedadesListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarClientesNovedadesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarClientesNovedadesJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarClientesNovedades()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarclientesnovedadesSessionBean==null) {
				this.cobrarclientesnovedadesSessionBean=new CobrarClientesNovedadesSessionBean();
			}

			if(!this.cobrarclientesnovedadesSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cobrarclientesnovedadesSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
	
	public void initActionsCombosTodosForeignKeyCobrarClientesNovedades()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarClientesNovedades(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarClientesNovedades()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesNovedades();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarClientesNovedades()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarClientesNovedades()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarClientesNovedades()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarClientesNovedades()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarClientesNovedades()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarClientesNovedades()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarClientesNovedades(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarClientesNovedades()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public CobrarClientesNovedadesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarClientesNovedadesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarClientesNovedadesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarclientesnovedadesSessionBean=new CobrarClientesNovedadesSessionBean(); 
		this.cobrarclientesnovedadesConstantesFunciones=new CobrarClientesNovedadesConstantesFunciones(); 
		this.cobrarclientesnovedadesBean=new CobrarClientesNovedades();//(this.cobrarclientesnovedadesConstantesFunciones); 		
		this.cobrarclientesnovedadesReturnGeneral=new CobrarClientesNovedadesParameterReturnGeneral(); 
		
		this.cobrarclientesnovedadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarclientesnovedadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarClientesNovedadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarClientesNovedadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarClientesNovedadesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarClientesNovedades(true);
			
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
			
			this.cobrarclientesnovedadesConstantesFunciones=new CobrarClientesNovedadesConstantesFunciones(); 
			this.cobrarclientesnovedadesBean=new CobrarClientesNovedades();//this.cobrarclientesnovedadesConstantesFunciones); 			
			this.cobrarclientesnovedadesReturnGeneral=new CobrarClientesNovedadesParameterReturnGeneral(); 
		
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Clientes Novedades Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cobrarclientesnovedades=new CobrarClientesNovedades();
			this.cobrarclientesnovedadess = new ArrayList<CobrarClientesNovedades>();
			this.cobrarclientesnovedadessAux = new ArrayList<CobrarClientesNovedades>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic=new CobrarClientesNovedadesLogic();
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarclientesnovedadesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarclientesnovedadesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarClientesNovedades);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesNovedades);	
					}
					
					if(this.jInternalFrameImportacionCobrarClientesNovedades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesNovedades);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarClientesNovedades!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarClientesNovedades);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesNovedades);
				this.jInternalFrameDetalleFormCobrarClientesNovedades.setVisible(false);
				this.jInternalFrameDetalleFormCobrarClientesNovedades.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesNovedades);
					this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarClientesNovedades!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesNovedades);
					this.jInternalFrameImportacionCobrarClientesNovedades.setVisible(false);
					this.jInternalFrameImportacionCobrarClientesNovedades.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarClientesNovedades!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesNovedades);
					this.jInternalFrameOrderByCobrarClientesNovedades.setVisible(false);
					this.jInternalFrameOrderByCobrarClientesNovedades.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarClientesNovedadesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarClientesNovedadesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarclientesnovedadesReturnGeneral=new CobrarClientesNovedadesParameterReturnGeneral();
			
			this.cobrarclientesnovedadesParameterGeneral=new CobrarClientesNovedadesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarclientesnovedadesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarClientesNovedadesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesNovedadesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado(),this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarClientesNovedadesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado(),this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesNovedades=true;
			this.isVisibilidadCeldaCopiarCobrarClientesNovedades=true;
			this.isVisibilidadCeldaVerFormCobrarClientesNovedades=true;
			this.isVisibilidadCeldaOrdenCobrarClientesNovedades=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;
			
			
			this.isVisibilidadBusquedaCobrarClientesNovedades=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarClientesNovedades();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarClientesNovedades(false);
			
			this.setPermisosUsuarioCobrarClientesNovedades();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado() && this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarClientesNovedadesClasesRelacionadas();
			}
			
			if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarClientesNovedadesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarClientesNovedades();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesNovedades();
			}
			
			if(!this.isPermisoBusquedaCobrarClientesNovedades) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				this.tiposReportes.add(new Reporte("LISTA_COLUMNAS","LISTA COLUMNAS"));
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarClientesNovedadesConstantesFunciones.getTiposSeleccionarCobrarClientesNovedades());
				
				this.tiposColumnasSelect=CobrarClientesNovedadesConstantesFunciones.getTiposSeleccionarCobrarClientesNovedades(true);
				
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
			//if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarClientesNovedades();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioCobrarClientesNovedades(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioCobrarClientesNovedades(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesNovedades() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobrarclientesnovedadesImplementable= (CobrarClientesNovedadesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesNovedadesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarclientesnovedadesImplementableHome= (CobrarClientesNovedadesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarClientesNovedadesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarclientesnovedadess= new ArrayList<CobrarClientesNovedades>();
			this.cobrarclientesnovedadessEliminados= new ArrayList<CobrarClientesNovedades>();
						
			this.isEsNuevoCobrarClientesNovedades=false;
			this.esParaAccionDesdeFormularioCobrarClientesNovedades=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarClientesNovedades(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarClientesNovedades();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarClientesNovedadesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarClientesNovedades(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarClientesNovedades();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarClientesNovedades();
			}
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarClientesNovedades.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarClientesNovedades.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarClientesNovedades.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarClientesNovedades(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarClientesNovedades: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarClientesNovedades() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarClientesNovedades")) {
				iIndex=this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarClientesNovedades();	
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
	
	public void cargarCombosForeignKeyCobrarClientesNovedades(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarClientesNovedades(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarClientesNovedades(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarClientesNovedadesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarClientesNovedades();
		
		this.cargarCombosFrameForeignKeyCobrarClientesNovedades();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarClientesNovedades();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarClientesNovedades();
		}
	}
	
	
	
	public void jButtonNuevoCobrarClientesNovedadesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
			
			if(jTableDatosCobrarClientesNovedades.getRowCount()>=1) {
				jTableDatosCobrarClientesNovedades.removeRowSelectionInterval(0, jTableDatosCobrarClientesNovedades.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarClientesNovedades=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarClientesNovedades(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarClientesNovedades(true);			
			//this.cobrarclientesnovedades=new CobrarClientesNovedades();
			//this.cobrarclientesnovedades.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesNovedades(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades() ;
			
			if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesNovedades(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarclientesnovedades);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);				
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
			if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarClientesNovedades: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarClientesNovedadesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarClientesNovedades.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesNovedades.getSelectedRows().length;			
			}
			
			cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarClientesNovedades--;			
				//CobrarClientesNovedades cobrarclientesnovedadesAux= new CobrarClientesNovedades();			
				//cobrarclientesnovedadesAux.setId(this.iIdNuevoCobrarClientesNovedades);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarClientesNovedades cobrarclientesnovedadesOrigen=new CobrarClientesNovedades();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarClientesNovedades cobrarclientesnovedadesOrigen : cobrarclientesnovedadessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarclientesnovedadesOrigen =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarclientesnovedadesOrigen =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarClientesNovedades();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarclientesnovedades.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarClientesNovedades(cobrarclientesnovedadesOrigen,this.cobrarclientesnovedades,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().add(this.cobrarclientesnovedadesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedadess.add(this.cobrarclientesnovedadesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
				
				this.jTableDatosCobrarClientesNovedades.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesNovedades(), this.getIndiceNuevoCobrarClientesNovedades());
				
				int iLastRow =  this.jTableDatosCobrarClientesNovedades.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesNovedades.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesNovedades.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();									
		
			CobrarClientesNovedades cobrarclientesnovedadesOrigen=new CobrarClientesNovedades();
			CobrarClientesNovedades cobrarclientesnovedadesDestino=new CobrarClientesNovedades();
				
			cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarClientesNovedades.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarclientesnovedadessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarClientesNovedades.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesnovedadesOrigen =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientesnovedadesOrigen =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarclientesnovedadesDestino =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarclientesnovedadesDestino =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarclientesnovedadesOrigen =cobrarclientesnovedadessSeleccionados.get(0);
				cobrarclientesnovedadesDestino =cobrarclientesnovedadessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarClientesNovedades(cobrarclientesnovedadesOrigen,cobrarclientesnovedadesDestino,true,false);
				
				cobrarclientesnovedadesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarclientesnovedadesDestino,cobrarclientesnovedadesLogic.getCobrarClientesNovedadess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarclientesnovedadesDestino,cobrarclientesnovedadess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
				
				//this.jTableDatosCobrarClientesNovedades.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesNovedades(), this.getIndiceNuevoCobrarClientesNovedades());
				
				int iLastRow =  this.jTableDatosCobrarClientesNovedades.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarClientesNovedades.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarClientesNovedades.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarClientesNovedades.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarClientesNovedades.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(!isVisible);
			this.jPanelPaginacionCobrarClientesNovedades.setVisible(!isVisible);
			this.jPanelAccionesCobrarClientesNovedades.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarClientesNovedades();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarClientesNovedades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarClientesNovedades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarClientesNovedades();
			
			this.abrirFrameOrderByCobrarClientesNovedades();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarClientesNovedades();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarClientesNovedades(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesNovedades);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarClientesNovedades.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarClientesNovedades.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarClientesNovedades.setSize(this.jInternalFrameDetalleFormCobrarClientesNovedades.iWidthFormulario,this.jInternalFrameDetalleFormCobrarClientesNovedades.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarClientesNovedades.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarClientesNovedades.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarClientesNovedades.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarClientesNovedades.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesNovedades.jContentPaneDetalleCobrarClientesNovedades.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesNovedades.jContentPaneDetalleCobrarClientesNovedades.getWidth(),CobrarClientesNovedadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesNovedades.jContentPaneDetalleCobrarClientesNovedades.getWidth(),CobrarClientesNovedadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarClientesNovedades.jContentPaneDetalleCobrarClientesNovedades.getWidth(),CobrarClientesNovedadesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarClientesNovedades.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarClientesNovedades.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarClientesNovedades() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarClientesNovedades==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarClientesNovedades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesNovedades,false,this);
				} else {
					this.jInternalFrameOrderByCobrarClientesNovedades=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarClientesNovedades,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarClientesNovedades);
				this.jInternalFrameOrderByCobrarClientesNovedades.setVisible(false);
				this.jInternalFrameOrderByCobrarClientesNovedades.setSelected(false);
				
				this.jInternalFrameOrderByCobrarClientesNovedades.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesNovedades"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarClientesNovedades();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarClientesNovedades() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarClientesNovedades==null) {
				
				this.jInternalFrameImportacionCobrarClientesNovedades=new ImportacionJInternalFrame(CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarClientesNovedades);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarClientesNovedades);
				this.jInternalFrameImportacionCobrarClientesNovedades.setVisible(false);
				this.jInternalFrameImportacionCobrarClientesNovedades.setSelected(false);


				this.jInternalFrameImportacionCobrarClientesNovedades.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesNovedades"));
				this.jInternalFrameImportacionCobrarClientesNovedades.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesNovedades"));
				this.jInternalFrameImportacionCobrarClientesNovedades.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesNovedades"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarClientesNovedades() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades==null) {
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades=new ReporteDinamicoJInternalFrame(CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarClientesNovedades);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarClientesNovedades);
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesNovedades"));
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesNovedades"));
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesNovedades"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesNovedades();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarClientesNovedades() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarClientesNovedades);
			
	       	this.jInternalFrameDetalleFormCobrarClientesNovedades.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarClientesNovedades.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarClientesNovedades.dispose();
			//this.jInternalFrameDetalleFormCobrarClientesNovedades=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarClientesNovedades() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarClientesNovedades() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarClientesNovedades.setVisible(true);
	        this.jInternalFrameImportacionCobrarClientesNovedades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarClientesNovedades() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarClientesNovedades.setVisible(true);
	        this.jInternalFrameOrderByCobrarClientesNovedades.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarClientesNovedades() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarClientesNovedades.setVisible(false);
	        this.jInternalFrameOrderByCobrarClientesNovedades.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarClientesNovedades() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarClientesNovedades() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarClientesNovedades.setVisible(false);
	        this.jInternalFrameImportacionCobrarClientesNovedades.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarClientesNovedades(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarClientesNovedades(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarClientesNovedades(true);
			//this.isEsNuevoCobrarClientesNovedades=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesNovedades(false) ;
			
			if(cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesNovedades(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarClientesNovedadesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarClientesNovedades(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarClientesNovedades(true);
			//this.isEsNuevoCobrarClientesNovedades=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarclientesnovedades.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarClientesNovedades(false) ;
			
			if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarClientesNovedades(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	
	public void jButtonActualizarCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesNovedades(false);
			
			//if(!this.isEsNuevoCobrarClientesNovedades) {								
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarclientesnovedades)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarClientesNovedades=true;
					this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
					this.isEsNuevoCobrarClientesNovedades=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarClientesNovedades=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarClientesNovedades=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesNovedades(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesNovedades(false);
			
												
				
				if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarClientesNovedades();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,cobrarclientesnovedadesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarClientesNovedades(this.cobrarclientesnovedades,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarClientesNovedades.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarclientesnovedadesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarclientesnovedades.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientesnovedades.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				this.cobrarclientesnovedades.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarclientesnovedades)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarClientesNovedadesModel) this.jTableDatosCobrarClientesNovedades.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarClientesNovedades=true;
				this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
				this.isEsNuevoCobrarClientesNovedades=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarClientesNovedades(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades(false);
				
				this.habilitarDeshabilitarControlesCobrarClientesNovedades(false);
				
				
				
				if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarClientesNovedades();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarClientesNovedades.getRowCount()>=1) {
				jTableDatosCobrarClientesNovedades.removeRowSelectionInterval(0, jTableDatosCobrarClientesNovedades.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarClientesNovedades(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarClientesNovedades(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades(false) ;
			
			this.isEsNuevoCobrarClientesNovedades=false;
			
			if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarClientesNovedades();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarClientesNovedades(false);
				
				//SI ES MANUAL
				if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarClientesNovedades();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarClientesNovedades--;			
			//CobrarClientesNovedades cobrarclientesnovedadesAux= new CobrarClientesNovedades();			
			//cobrarclientesnovedadesAux.setId(this.iIdNuevoCobrarClientesNovedades);
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarClientesNovedades();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
			
			this.cobrarclientesnovedades.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().add(this.cobrarclientesnovedadesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarclientesnovedadess.add(this.cobrarclientesnovedadesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
			
			this.jTableDatosCobrarClientesNovedades.setRowSelectionInterval(this.getIndiceNuevoCobrarClientesNovedades(), this.getIndiceNuevoCobrarClientesNovedades());
			
			int iLastRow =  this.jTableDatosCobrarClientesNovedades.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarClientesNovedades.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarClientesNovedades.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesNovedades(false);
			
			//SI ES MANUAL
			if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesNovedades();
			}
			
			//this.abrirFrameTreeCobrarClientesNovedades();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarClientesNovedades.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarClientesNovedades.setFileImportacion(this.jInternalFrameImportacionCobrarClientesNovedades.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarClientesNovedades.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarClientesNovedades.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarClientesNovedades.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarClientesNovedades.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		

		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarClientesNovedadesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarClientesNovedadesBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarClientesNovedadess("Todos",cobrarclientesnovedadessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_haAtencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_haAtencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_haAtencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_haAtencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_raAtencion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_raAtencion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_raAtencion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_raAtencion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cionTomada_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cionTomada_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cionTomada_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cionTomada_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION:
					sNombreCampoCategoria="feha_atencion";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION:
					sNombreCampoCategoria="hora_atencion";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA:
					sNombreCampoCategoria="accion_tomada";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION:
					sNombreCampoCategoriaValor="feha_atencion";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION:
					sNombreCampoCategoriaValor="hora_atencion";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA:
					sNombreCampoCategoriaValor="accion_tomada";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apello",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Feha Atencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"feha_atencion");
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Hora Atencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"hora_atencion");
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Accion Tomada",sNombreCampoCategoria,sNombreCampoCategoriaValor,"accion_tomada");
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesnovedades";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarClientesNovedadess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getfeha_atencion_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getfeha_atencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.gethora_atencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getaccion_tomada());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(CobrarClientesNovedades cobrarclientesnovedades:cobrarclientesnovedadessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarclientesnovedades.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelCobrarClientesNovedades(row);				
			//	iRow++;
			//}				
			
			//for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarClientesNovedades(cobrarclientesnovedadesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesNovedades(false);
			
			//SI ES MANUAL
			if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarClientesNovedades();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesNovedades(false);
			
			//SI ES MANUAL
			if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesNovedades();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarClientesNovedades(false);
			
			//SI ES MANUAL
			if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarClientesNovedades();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarClientesNovedades() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarClientesNovedades.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarClientesNovedades.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarClientesNovedades.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarClientesNovedades.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarClientesNovedades.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarClientesNovedades.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarClientesNovedades.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarClientesNovedades(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarClientesNovedades(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarClientesNovedades(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarClientesNovedades(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarClientesNovedades(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarClientesNovedades(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesNovedades(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarClientesNovedades(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarClientesNovedades() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarClientesNovedades();
		
		this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesNovedades();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesNovedades() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesNovedades(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesNovedades(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarClientesNovedades.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarClientesNovedades.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxPostAccionNuevoCobrarClientesNovedades.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxPostAccionSinCerrarCobrarClientesNovedades.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxPostAccionSinMensajeCobrarClientesNovedades.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarClientesNovedades.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarClientesNovedades.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
				this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxPostAccionNuevoCobrarClientesNovedades.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxPostAccionSinCerrarCobrarClientesNovedades.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxPostAccionSinMensajeCobrarClientesNovedades.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarClientesNovedades.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarClientesNovedades.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarClientesNovedades.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarClientesNovedades.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarClientesNovedades.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarClientesNovedades.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarClientesNovedades.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarClientesNovedades.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarClientesNovedades(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarClientesNovedades(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarClientesNovedades() throws Exception {
		try	{
			if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesNovedades();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesNovedades() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarClientesNovedades() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarClientesNovedades.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarClientesNovedades.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarClientesNovedades.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarClientesNovedades.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarClientesNovedades.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarClientesNovedades.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarClientesNovedades.addItem(reporte);
			}
			
			
			if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarClientesNovedades.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarClientesNovedades.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarClientesNovedades.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarClientesNovedades.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarClientesNovedades.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarClientesNovedades.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarClientesNovedades.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarClientesNovedades.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarClientesNovedades.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesNovedades();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarClientesNovedades() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarClientesNovedades()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.feha_atencion_hastaBusquedaCobrarClientesNovedades=new Date(this.jDateChooserfeha_atencion_hastaBusquedaCobrarClientesNovedadesCobrarClientesNovedades.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarClientesNovedades(Boolean esInicializar) throws Exception {				
		if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarClientesNovedades();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarClientesNovedades() throws Exception {
		this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarClientesNovedades() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarClientesNovedadesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedadesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarClientesNovedades(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarclientesnovedadess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarClientesNovedades.setModel(new CobrarClientesNovedadesModel(this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarClientesNovedades.setModel(new CobrarClientesNovedadesModel(this.cobrarclientesnovedadess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarClientesNovedades!=null && this.jInternalFrameOrderByCobrarClientesNovedades.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarClientesNovedades();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO,cobrarclientesnovedadesConstantesFunciones.resaltarSeleccionarCobrarClientesNovedades,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarClientesNovedadesConstantesFunciones.SCLASSWEBTITULO,cobrarclientesnovedadesConstantesFunciones.resaltarSeleccionarCobrarClientesNovedades,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_ID));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostraridCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltaridCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activaridCobrarClientesNovedades,this,true,"idCobrarClientesNovedades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltaridCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activaridCobrarClientesNovedades,this,true,"idCobrarClientesNovedades","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostrarcodigoCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarcodigoCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarcodigoCobrarClientesNovedades,this,true,"codigoCobrarClientesNovedades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarcodigoCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarcodigoCobrarClientesNovedades,this,true,"codigoCobrarClientesNovedades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostrarnombreCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarnombreCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarnombreCobrarClientesNovedades,this,true,"nombreCobrarClientesNovedades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarnombreCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarnombreCobrarClientesNovedades,this,true,"nombreCobrarClientesNovedades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostrarapellidoCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarapellidoCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarapellidoCobrarClientesNovedades,this,true,"apellidoCobrarClientesNovedades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarapellidoCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarapellidoCobrarClientesNovedades,this,true,"apellidoCobrarClientesNovedades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostrarfeha_atencionCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarfeha_atencionCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarfeha_atencionCobrarClientesNovedades,this,true,"feha_atencionCobrarClientesNovedades","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarfeha_atencionCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarfeha_atencionCobrarClientesNovedades,this,true,"feha_atencionCobrarClientesNovedades","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostrarhora_atencionCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TimeRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarhora_atencionCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarhora_atencionCobrarClientesNovedades,this,true,"hora_atencionCobrarClientesNovedades","BASICO"));
			tableColumn.setCellEditor(new TimeEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltarhora_atencionCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activarhora_atencionCobrarClientesNovedades,this,true,"hora_atencionCobrarClientesNovedades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostraraccion_tomadaCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltaraccion_tomadaCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activaraccion_tomadaCobrarClientesNovedades,this,true,"accion_tomadaCobrarClientesNovedades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltaraccion_tomadaCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activaraccion_tomadaCobrarClientesNovedades,this,true,"accion_tomadaCobrarClientesNovedades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostrardescripcionCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltardescripcionCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activardescripcionCobrarClientesNovedades,this,true,"descripcionCobrarClientesNovedades","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltardescripcionCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activardescripcionCobrarClientesNovedades,this,true,"descripcionCobrarClientesNovedades","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.cobrarclientesnovedadesConstantesFunciones.mostraresta_activoCobrarClientesNovedades && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltaresta_activoCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activaresta_activoCobrarClientesNovedades));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.cobrarclientesnovedadesConstantesFunciones.resaltaresta_activoCobrarClientesNovedades,this.cobrarclientesnovedadesConstantesFunciones.activaresta_activoCobrarClientesNovedades,this,true,"esta_activoCobrarClientesNovedades","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CobrarClientesNovedadesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesNovedades.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarClientesNovedades.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarClientesNovedades.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarClientesNovedades.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarClientesNovedades.moveColumn(this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarClientesNovedades.moveColumn(this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarClientesNovedades.moveColumn(this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarClientesNovedades.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarClientesNovedades.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarClientesNovedades,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarClientesNovedades.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarClientesNovedades.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarClientesNovedades.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarclientesnovedadess.size()-1;
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
		//this.jTableDatosCobrarClientesNovedades.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarClientesNovedades.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarClientesNovedades();
			
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
				
				//this.isEsNuevoCobrarClientesNovedades=false;
					
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
				if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesNovedades.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesNovedades.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarclientesnovedades.getsType().equals("DUPLICADO")
				   || this.cobrarclientesnovedades.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarClientesNovedades=true;
				
				} else {
					this.isEsNuevoCobrarClientesNovedades=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarclientesnovedades.getId()>=0 && !this.cobrarclientesnovedades.getIsNew()) {						
						this.isEsNuevoCobrarClientesNovedades=false;
						
					} else {
						this.isEsNuevoCobrarClientesNovedades=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarClientesNovedades(esRelaciones);						
				
				this.seleccionarCobrarClientesNovedades(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarclientesnovedades.getId()<0) {
					this.isEsNuevoCobrarClientesNovedades=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarClientesNovedades(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarClientesNovedades(evt,rowIndex);
				}	
				
				if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarClientesNovedades: " + this.dDif); 
					}
				}								
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarClientesNovedades(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarclientesnovedades)) {
					if(this.cobrarclientesnovedades.getId()>0) {
						this.cobrarclientesnovedades.setIsDeleted(true);
						
						this.cobrarclientesnovedadessEliminados.add(this.cobrarclientesnovedades);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().remove(this.cobrarclientesnovedades);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedadess.remove(this.cobrarclientesnovedades);				
					}
					
					
					((CobrarClientesNovedadesModel) this.jTableDatosCobrarClientesNovedades.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarClientesNovedades(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarClientesNovedades) {
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarClientesNovedades.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarClientesNovedades.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarClientesNovedades(this.cobrarclientesnovedades);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarClientesNovedades("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarClientesNovedades(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarClientesNovedades(cobrarclientesnovedades,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarClientesNovedades(cobrarclientesnovedades);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarClientesNovedades(cobrarclientesnovedades,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesNovedades(cobrarclientesnovedades);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.setText(cobrarclientesnovedades.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextFieldcodigoCobrarClientesNovedades.setText(cobrarclientesnovedades.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreanombreCobrarClientesNovedades.setText(cobrarclientesnovedades.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaapellidoCobrarClientesNovedades.setText(cobrarclientesnovedades.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencionCobrarClientesNovedades.setDate(cobrarclientesnovedades.getfeha_atencion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jSpinnerhora_atencionCobrarClientesNovedades.setValue(cobrarclientesnovedades.gethora_atencion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaaccion_tomadaCobrarClientesNovedades.setText(cobrarclientesnovedades.getaccion_tomada());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreadescripcionCobrarClientesNovedades.setText(cobrarclientesnovedades.getdescripcion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.setSelected(cobrarclientesnovedades.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarClientesNovedades cobrarclientesnovedadesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarclientesnovedadesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarClientesNovedades cobrarclientesnovedadesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarclientesnovedadesLocal=this.cobrarclientesnovedades;
			} else {
				cobrarclientesnovedadesLocal=this.cobrarclientesnovedadesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarclientesnovedadesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarClientesNovedades(cobrarclientesnovedadesLocal,true);
					
					if(cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarclientesnovedadesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarclientesnovedadesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(cobrarclientesnovedades,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(cobrarclientesnovedades);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(cobrarclientesnovedades,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.getText()==null || this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.getText()=="" || this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.setText("0");
			}

			if(conColumnasBase) {cobrarclientesnovedades.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelIdCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesnovedades.setcodigo(this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextFieldcodigoCobrarClientesNovedades.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelcodigoCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesnovedades.setnombre(this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreanombreCobrarClientesNovedades.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelnombreCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesnovedades.setapellido(this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaapellidoCobrarClientesNovedades.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelapellidoCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesnovedades.setfeha_atencion(this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencionCobrarClientesNovedades.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelfeha_atencionCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesnovedades.sethora_atencion(new Time(((Date)this.jInternalFrameDetalleFormCobrarClientesNovedades.jSpinnerhora_atencionCobrarClientesNovedades.getValue()).getTime()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelhora_atencionCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesnovedades.setaccion_tomada(this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaaccion_tomadaCobrarClientesNovedades.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelaccion_tomadaCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesnovedades.setdescripcion(this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreadescripcionCobrarClientesNovedades.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabeldescripcionCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarclientesnovedades.setesta_activo(this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelesta_activoCobrarClientesNovedades,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedadesBean,CobrarClientesNovedades cobrarclientesnovedades,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedadesOrigen,CobrarClientesNovedades cobrarclientesnovedades,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getId()!=null && !cobrarclientesnovedadesOrigen.getId().equals(0L))) {cobrarclientesnovedades.setId(cobrarclientesnovedadesOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getfeha_atencion_hasta()!=null && !cobrarclientesnovedadesOrigen.getfeha_atencion_hasta().equals(new Date()))) {cobrarclientesnovedades.setfeha_atencion_hasta(cobrarclientesnovedadesOrigen.getfeha_atencion_hasta());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getcodigo()!=null && !cobrarclientesnovedadesOrigen.getcodigo().equals(""))) {cobrarclientesnovedades.setcodigo(cobrarclientesnovedadesOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getnombre()!=null && !cobrarclientesnovedadesOrigen.getnombre().equals(""))) {cobrarclientesnovedades.setnombre(cobrarclientesnovedadesOrigen.getnombre());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getapellido()!=null && !cobrarclientesnovedadesOrigen.getapellido().equals(""))) {cobrarclientesnovedades.setapellido(cobrarclientesnovedadesOrigen.getapellido());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getfeha_atencion()!=null && !cobrarclientesnovedadesOrigen.getfeha_atencion().equals(new Date()))) {cobrarclientesnovedades.setfeha_atencion(cobrarclientesnovedadesOrigen.getfeha_atencion());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.gethora_atencion()!=null && !cobrarclientesnovedadesOrigen.gethora_atencion().equals(new Time((new Date()).getTime())))) {cobrarclientesnovedades.sethora_atencion(cobrarclientesnovedadesOrigen.gethora_atencion());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getaccion_tomada()!=null && !cobrarclientesnovedadesOrigen.getaccion_tomada().equals(""))) {cobrarclientesnovedades.setaccion_tomada(cobrarclientesnovedadesOrigen.getaccion_tomada());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getdescripcion()!=null && !cobrarclientesnovedadesOrigen.getdescripcion().equals(""))) {cobrarclientesnovedades.setdescripcion(cobrarclientesnovedadesOrigen.getdescripcion());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesOrigen.getesta_activo()!=null && !cobrarclientesnovedadesOrigen.getesta_activo().equals(false))) {cobrarclientesnovedades.setesta_activo(cobrarclientesnovedadesOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.setText(cobrarclientesnovedades.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextFieldcodigoCobrarClientesNovedades.setText(cobrarclientesnovedades.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreanombreCobrarClientesNovedades.setText(cobrarclientesnovedades.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaapellidoCobrarClientesNovedades.setText(cobrarclientesnovedades.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencionCobrarClientesNovedades.setDate(cobrarclientesnovedades.getfeha_atencion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jSpinnerhora_atencionCobrarClientesNovedades.setValue(cobrarclientesnovedades.gethora_atencion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaaccion_tomadaCobrarClientesNovedades.setText(cobrarclientesnovedades.getaccion_tomada());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreadescripcionCobrarClientesNovedades.setText(cobrarclientesnovedades.getdescripcion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.setSelected(cobrarclientesnovedades.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarClientesNovedades(CobrarClientesNovedadesBean cobrarclientesnovedadesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.setText(cobrarclientesnovedadesBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextFieldcodigoCobrarClientesNovedades.setText(cobrarclientesnovedadesBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreanombreCobrarClientesNovedades.setText(cobrarclientesnovedadesBean.getnombre());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaapellidoCobrarClientesNovedades.setText(cobrarclientesnovedadesBean.getapellido());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencionCobrarClientesNovedades.setDate(cobrarclientesnovedadesBean.getfeha_atencion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jSpinnerhora_atencionCobrarClientesNovedades.setValue(cobrarclientesnovedadesBean.gethora_atencion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaaccion_tomadaCobrarClientesNovedades.setText(cobrarclientesnovedadesBean.getaccion_tomada());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreadescripcionCobrarClientesNovedades.setText(cobrarclientesnovedadesBean.getdescripcion());
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.setSelected(cobrarclientesnovedadesBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarClientesNovedades(CobrarClientesNovedadesParameterReturnGeneral cobrarclientesnovedadesReturnGeneral,CobrarClientesNovedadesBean cobrarclientesnovedadesBean,Boolean conDefault) throws Exception { 
		try {
			CobrarClientesNovedades cobrarclientesnovedadesLocal=new CobrarClientesNovedades();
			
			cobrarclientesnovedadesLocal=cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.getId()!=null && !cobrarclientesnovedadesLocal.getId().equals(0L))) {cobrarclientesnovedadesBean.setId(cobrarclientesnovedadesLocal.getId());}}
			if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.getcodigo()!=null && !cobrarclientesnovedadesLocal.getcodigo().equals(""))) {cobrarclientesnovedadesBean.setcodigo(cobrarclientesnovedadesLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.getnombre()!=null && !cobrarclientesnovedadesLocal.getnombre().equals(""))) {cobrarclientesnovedadesBean.setnombre(cobrarclientesnovedadesLocal.getnombre());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.getapellido()!=null && !cobrarclientesnovedadesLocal.getapellido().equals(""))) {cobrarclientesnovedadesBean.setapellido(cobrarclientesnovedadesLocal.getapellido());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.getfeha_atencion()!=null && !cobrarclientesnovedadesLocal.getfeha_atencion().equals(new Date()))) {cobrarclientesnovedadesBean.setfeha_atencion(cobrarclientesnovedadesLocal.getfeha_atencion());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.gethora_atencion()!=null && !cobrarclientesnovedadesLocal.gethora_atencion().equals(new Time((new Date()).getTime())))) {cobrarclientesnovedadesBean.sethora_atencion(cobrarclientesnovedadesLocal.gethora_atencion());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.getaccion_tomada()!=null && !cobrarclientesnovedadesLocal.getaccion_tomada().equals(""))) {cobrarclientesnovedadesBean.setaccion_tomada(cobrarclientesnovedadesLocal.getaccion_tomada());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.getdescripcion()!=null && !cobrarclientesnovedadesLocal.getdescripcion().equals(""))) {cobrarclientesnovedadesBean.setdescripcion(cobrarclientesnovedadesLocal.getdescripcion());}
			if(conDefault || (!conDefault && cobrarclientesnovedadesLocal.getesta_activo()!=null && !cobrarclientesnovedadesLocal.getesta_activo().equals(false))) {cobrarclientesnovedadesBean.setesta_activo(cobrarclientesnovedadesLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarClientesNovedadesGenerico(Long idCobrarClientesNovedadesSeleccionado,JComboBox jComboBoxCobrarClientesNovedades,List<CobrarClientesNovedades> cobrarclientesnovedadessLocal)throws Exception {
		try {
			CobrarClientesNovedades  cobrarclientesnovedadesTemp=null;

			for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadessLocal) {
				if(cobrarclientesnovedadesAux.getId()!=null && cobrarclientesnovedadesAux.getId().equals(idCobrarClientesNovedadesSeleccionado)) {
					cobrarclientesnovedadesTemp=cobrarclientesnovedadesAux;
					break;
				}
			}

			jComboBoxCobrarClientesNovedades.setSelectedItem(cobrarclientesnovedadesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarClientesNovedadesGenerico(JComboBox jComboBoxCobrarClientesNovedades,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesNovedades.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarClientesNovedades.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarClientesNovedades.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarClientesNovedades.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarClientesNovedades.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarClientesNovedades.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesnovedades=(CobrarClientesNovedades) cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientesnovedades =(CobrarClientesNovedades) cobrarclientesnovedadess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarclientesnovedades.getIsNew() && !cobrarclientesnovedades.getIsChanged() && !cobrarclientesnovedades.getIsDeleted()) {
				sDescripcion=cobrarclientesnovedades.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesnovedades.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cobrarclientesnovedades.getIsNew() && !cobrarclientesnovedades.getIsChanged() && !cobrarclientesnovedades.getIsDeleted()) {
				sDescripcion=cobrarclientesnovedades.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarclientesnovedades.getsucursal_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarClientesNovedades cobrarclientesnovedadesRow=new CobrarClientesNovedades();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesnovedadesRow=(CobrarClientesNovedades) cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarclientesnovedadesRow=(CobrarClientesNovedades) cobrarclientesnovedadess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarClientesNovedades(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades));			
			this.jButtonDuplicarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesNovedades && this.isPermisoDuplicarCobrarClientesNovedades));			
			this.jButtonCopiarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesNovedades && this.isPermisoCopiarCobrarClientesNovedades));
			this.jButtonVerFormCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesNovedades && this.isPermisoVerFormCobrarClientesNovedades));
			
			this.jButtonAbrirOrderByCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesNovedades && this.isPermisoOrdenCobrarClientesNovedades));			
			
			this.jButtonNuevoRelacionesCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades));			
			this.jButtonNuevoGuardarCambiosCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaModificarCobrarClientesNovedades && this.isPermisoActualizarCobrarClientesNovedades));	
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesNovedades && this.isPermisoActualizarCobrarClientesNovedades));	
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesNovedades && this.isPermisoEliminarCobrarClientesNovedades));
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarCobrarClientesNovedades.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesNovedades);							
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades));						
			this.jButtonDuplicarToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesNovedades && this.isPermisoDuplicarCobrarClientesNovedades));						
			this.jButtonCopiarToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesNovedades && this.isPermisoCopiarCobrarClientesNovedades));			
			this.jButtonVerFormToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesNovedades && this.isPermisoVerFormCobrarClientesNovedades));			
			this.jButtonAbrirOrderByToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesNovedades && this.isPermisoOrdenCobrarClientesNovedades));
			this.jButtonNuevoRelacionesToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));			
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaModificarCobrarClientesNovedades && this.isPermisoActualizarCobrarClientesNovedades));	
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesNovedades  && this.isPermisoActualizarCobrarClientesNovedades));	
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesNovedades && this.isPermisoEliminarCobrarClientesNovedades));
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarToolBarCobrarClientesNovedades.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesNovedades);				
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades));			
			this.jMenuItemDuplicarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaDuplicarCobrarClientesNovedades && this.isPermisoDuplicarCobrarClientesNovedades));			
			this.jMenuItemCopiarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaCopiarCobrarClientesNovedades && this.isPermisoCopiarCobrarClientesNovedades));			
			this.jMenuItemVerFormCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaVerFormCobrarClientesNovedades && this.isPermisoVerFormCobrarClientesNovedades));			
			this.jMenuItemAbrirOrderByCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesNovedades && this.isPermisoOrdenCobrarClientesNovedades));			
			//this.jMenuItemMostrarOcultarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesNovedades && this.isPermisoOrdenCobrarClientesNovedades));
			this.jMenuItemDetalleAbrirOrderByCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesNovedades && this.isPermisoOrdenCobrarClientesNovedades));			
			//this.jMenuItemDetalleMostrarOcultarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaOrdenCobrarClientesNovedades && this.isPermisoOrdenCobrarClientesNovedades));			
			this.jMenuItemNuevoRelacionesCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades));			
			this.jMenuItemNuevoGuardarCambiosCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaNuevoCobrarClientesNovedades && this.isPermisoNuevoCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));									
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemModificarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaModificarCobrarClientesNovedades && this.isPermisoActualizarCobrarClientesNovedades));	
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemActualizarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaActualizarCobrarClientesNovedades && this.isPermisoActualizarCobrarClientesNovedades));	
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemEliminarCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaEliminarCobrarClientesNovedades && this.isPermisoEliminarCobrarClientesNovedades));
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemCancelarCobrarClientesNovedades.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesNovedades);				
			}
			
			this.jMenuItemGuardarCambiosCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));						
			this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=this.jButtonNuevoCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarClientesNovedades=this.jButtonDuplicarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaCopiarCobrarClientesNovedades=this.jButtonCopiarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaVerFormCobrarClientesNovedades=this.jButtonVerFormCobrarClientesNovedades.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarClientesNovedades=this.jButtonAbrirOrderByCobrarClientesNovedades.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=this.jButtonNuevoRelacionesCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=this.jButtonModificarCobrarClientesNovedades.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaGuardarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosCobrarClientesNovedades.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=this.jButtonGuardarCambiosTablaCobrarClientesNovedades.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=this.jButtonNuevoToolBarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=this.jButtonNuevoRelacionesToolBarCobrarClientesNovedades.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarToolBarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarToolBarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarToolBarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarToolBarCobrarClientesNovedades.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesNovedades=this.jButtonGuardarCambiosToolBarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=this.jButtonGuardarCambiosTablaToolBarCobrarClientesNovedades.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=this.jMenuItemNuevoCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=this.jMenuItemNuevoRelacionesCobrarClientesNovedades.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemModificarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemActualizarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemEliminarCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemCancelarCobrarClientesNovedades.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarClientesNovedades=this.jMenuItemGuardarCambiosCobrarClientesNovedades.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarClientesNovedades(Boolean esInicializar) {
		if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesNovedades();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarClientesNovedades(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarClientesNovedades() {
		this.jButtonNuevoCobrarClientesNovedades.setVisible(this.isPermisoNuevoCobrarClientesNovedades);			
		this.jButtonDuplicarCobrarClientesNovedades.setVisible(this.isPermisoDuplicarCobrarClientesNovedades);			
		this.jButtonCopiarCobrarClientesNovedades.setVisible(this.isPermisoCopiarCobrarClientesNovedades);			
		this.jButtonVerFormCobrarClientesNovedades.setVisible(this.isPermisoVerFormCobrarClientesNovedades);			
		
		this.jButtonAbrirOrderByCobrarClientesNovedades.setVisible(this.isPermisoOrdenCobrarClientesNovedades);					
		
		this.jButtonNuevoRelacionesCobrarClientesNovedades.setVisible(this.isPermisoNuevoCobrarClientesNovedades);			
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarCobrarClientesNovedades.setVisible(this.isPermisoActualizarCobrarClientesNovedades);	
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarCobrarClientesNovedades.setVisible(this.isPermisoActualizarCobrarClientesNovedades);	
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarCobrarClientesNovedades.setVisible(this.isPermisoEliminarCobrarClientesNovedades);
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarCobrarClientesNovedades.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesNovedades);						
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosCobrarClientesNovedades.setVisible(this.isPermisoGuardarCambiosCobrarClientesNovedades);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.setVisible(this.isPermisoActualizarCobrarClientesNovedades);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesNovedades() {
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarCobrarClientesNovedades.setVisible(this.isPermisoActualizarCobrarClientesNovedades);	
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarCobrarClientesNovedades.setVisible(this.isPermisoActualizarCobrarClientesNovedades);	
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarCobrarClientesNovedades.setVisible(this.isPermisoEliminarCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarCobrarClientesNovedades.setVisible(this.isVisibilidadCeldaCancelarCobrarClientesNovedades);							
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosCobrarClientesNovedades.setVisible((this.isVisibilidadCeldaGuardarCobrarClientesNovedades && this.isPermisoGuardarCambiosCobrarClientesNovedades));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarClientesNovedades() {
		if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarClientesNovedades();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarClientesNovedades() {
	}
	
	public void jTableDatosCobrarClientesNovedadesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarClientesNovedades(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarclientesnovedades.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarClientesNovedadesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarClientesNovedades(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesNovedades.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesNovedades.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarclientesnovedadesLogic.getConnexion());

				if(this.cobrarclientesnovedades.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarclientesnovedades.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesNovedades=(TitledBorder)this.jScrollPanelDatosCobrarClientesNovedades.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarClientesNovedades.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarclientesnovedades.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCobrarClientesNovedadesUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCobrarClientesNovedades(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarClientesNovedades.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarClientesNovedades.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cobrarclientesnovedadesLogic.getConnexion());

				if(this.cobrarclientesnovedades.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cobrarclientesnovedades.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarClientesNovedades=(TitledBorder)this.jScrollPanelDatosCobrarClientesNovedades.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCobrarClientesNovedades.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cobrarclientesnovedades.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfeha_atencion_hastaCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getfeha_atencion_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where feha_atencion_hasta = '"+Funciones2.getStringPostgresDate(this.cobrarclientesnovedades.getfeha_atencion_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarclientesnovedades.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cobrarclientesnovedades.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.cobrarclientesnovedades.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfeha_atencionCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getfeha_atencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where feha_atencion = '"+Funciones2.getStringPostgresDate(this.cobrarclientesnovedades.getfeha_atencion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonhora_atencionCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.gethora_atencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where hora_atencion = "+this.cobrarclientesnovedades.gethora_atencion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonaccion_tomadaCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getaccion_tomada()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where accion_tomada like '%"+this.cobrarclientesnovedades.getaccion_tomada()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.cobrarclientesnovedades.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoCobrarClientesNovedadesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.getcobrarclientesnovedades(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarclientesnovedades==null) {
						this.cobrarclientesnovedades = new CobrarClientesNovedades();
					}

					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);
				}

				if(this.cobrarclientesnovedades.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.cobrarclientesnovedades.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarClientesNovedades(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);

			this.getCobrarClientesNovedadessBusquedaCobrarClientesNovedades();

			this.inicializarActualizarBindingCobrarClientesNovedades(false);

			//if(CobrarClientesNovedadesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);

			this.getCobrarClientesNovedadessFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarClientesNovedades(false);

			//if(CobrarClientesNovedadesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCobrarClientesNovedadesActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);

			this.getCobrarClientesNovedadessFK_IdSucursal();

			this.inicializarActualizarBindingCobrarClientesNovedades(false);

			//if(CobrarClientesNovedadesBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarclientesnovedadesLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarClientesNovedades() {
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarClientesNovedades.dispose();
			this.jInternalFrameDetalleFormCobrarClientesNovedades=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
			this.jInternalFrameReporteDinamicoCobrarClientesNovedades.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarClientesNovedades.dispose();
			this.jInternalFrameReporteDinamicoCobrarClientesNovedades=null;
		}
		
		if(this.jInternalFrameImportacionCobrarClientesNovedades!=null) {
			this.jInternalFrameImportacionCobrarClientesNovedades.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarClientesNovedades.dispose();
			this.jInternalFrameImportacionCobrarClientesNovedades=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarClientesNovedades();
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarClientesNovedades")) {
				jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarClientesNovedades")) {
				jButtonDuplicarCobrarClientesNovedadesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarClientesNovedades")) {
				jButtonCopiarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarClientesNovedades")) {
				jButtonVerFormCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarClientesNovedades")) {
				jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarClientesNovedades")) {
				jButtonDuplicarCobrarClientesNovedadesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarClientesNovedades")) {
				jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarClientesNovedades")) {
				jButtonDuplicarCobrarClientesNovedadesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesNovedades")) {
				jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarClientesNovedades")) {
				jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarClientesNovedades")) {
				jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarClientesNovedades")) {
				jButtonModificarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarClientesNovedades")) {
				jButtonModificarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarClientesNovedades")) {
				jButtonModificarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarClientesNovedades")) {
				jButtonActualizarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarClientesNovedades")) {
				jButtonActualizarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarClientesNovedades")) {
				jButtonActualizarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarClientesNovedades")) {
				jButtonEliminarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarClientesNovedades")) {
				jButtonEliminarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarClientesNovedades")) {
				jButtonEliminarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarClientesNovedades")) {
				jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarClientesNovedades")) {
				jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarClientesNovedades")) {
				jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarClientesNovedades")) {
				jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarClientesNovedades")) {
				jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarClientesNovedades")) {
				jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarClientesNovedades")) {
				jButtonMostrarOcultarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarClientesNovedades")) {
				jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarClientesNovedades")) {
				jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarClientesNovedades")) {
				jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarClientesNovedades")) {
				jButtonCopiarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarClientesNovedades")) {
				jButtonVerFormCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarClientesNovedades")) {
				jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarClientesNovedades")) {
				jButtonCopiarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarClientesNovedades")) {
				jButtonVerFormCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesNovedades")) {
				jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarClientesNovedades")) {
				jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarClientesNovedades")) {
				jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarClientesNovedades")) {
				jButtonRecargarInformacionCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarClientesNovedades")) {
				jButtonRecargarInformacionCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarClientesNovedades")) {
				jButtonRecargarInformacionCobrarClientesNovedadesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarClientesNovedades")) {
				jButtonAnterioresCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarClientesNovedades")) {
				jButtonAnterioresCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarClientesNovedades")) {
				jButtonAnterioresCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarClientesNovedades")) {
				jButtonSiguientesCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarClientesNovedades")) {
				jButtonSiguientesCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarClientesNovedades")) {
				jButtonSiguientesCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarClientesNovedades") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarClientesNovedades")) {
				jButtonAbrirOrderByCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarClientesNovedades") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarClientesNovedades")) {
				jButtonMostrarOcultarCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesNovedades")) {
				jButtonNuevoGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarClientesNovedades")) {
				jButtonNuevoGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarClientesNovedades")) {
				jButtonNuevoGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarClientesNovedades")) {
				jButtonCerrarReporteDinamicoCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarClientesNovedades")) {
				jButtonGenerarReporteDinamicoCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarClientesNovedades")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarClientesNovedades")) {
				jButtonCerrarImportacionCobrarClientesNovedadesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarClientesNovedades")) {
				
				jButtonGenerarImportacionCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarClientesNovedades")) {
				
				jButtonAbrirImportacionCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarClientesNovedades")) {
				jComboBoxTiposAccionesCobrarClientesNovedadesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarClientesNovedades")) {
				jComboBoxTiposRelacionesCobrarClientesNovedadesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarClientesNovedades")) {
				jComboBoxTiposAccionesCobrarClientesNovedadesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarClientesNovedades")) {
				
				jComboBoxTiposSeleccionarCobrarClientesNovedadesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarClientesNovedades")) {
				jTextFieldValorCampoGeneralCobrarClientesNovedadesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarClientesNovedades")) {
				jButtonAbrirOrderByCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarClientesNovedades")) {
				jButtonAbrirOrderByCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarClientesNovedades")) {
				jButtonCerrarOrderByCobrarClientesNovedadesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesNovedadesBusqueda")) {
				this.jButtonidCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesNovedadesUpdate")) {
				this.jButtonid_empresaCobrarClientesNovedadesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesNovedadesBusqueda")) {
				this.jButtonid_empresaCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesNovedadesUpdate")) {
				this.jButtonid_sucursalCobrarClientesNovedadesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesNovedadesBusqueda")) {
				this.jButtonid_sucursalCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("feha_atencion_hastaCobrarClientesNovedadesBusqueda")) {
				this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesNovedadesBusqueda")) {
				this.jButtoncodigoCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarClientesNovedadesBusqueda")) {
				this.jButtonnombreCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobrarClientesNovedadesBusqueda")) {
				this.jButtonapellidoCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("feha_atencionCobrarClientesNovedadesBusqueda")) {
				this.jButtonfeha_atencionCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_atencionCobrarClientesNovedadesBusqueda")) {
				this.jButtonhora_atencionCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("accion_tomadaCobrarClientesNovedadesBusqueda")) {
				this.jButtonaccion_tomadaCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCobrarClientesNovedadesBusqueda")) {
				this.jButtondescripcionCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoCobrarClientesNovedadesBusqueda")) {
				this.jButtonesta_activoCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarClientesNovedadesCobrarClientesNovedades")) {
				this.jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedadesActionPerformed(evt);
			}
			
			;
			
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarClientesNovedades();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				


				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarClientesNovedades cobrarclientesnovedadesLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarclientesnovedadesLocal=this.cobrarclientesnovedades;
			} else {
				cobrarclientesnovedadesLocal=this.cobrarclientesnovedadesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
							
				
				


				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
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
			
			


			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesNovedadesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
								
						
				


				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
								
				
				


				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
							
				
				


				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
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
			
			


			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
								
				
				


				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesNovedadesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarClientesNovedades")) {
					jCheckBoxSeleccionarTodosCobrarClientesNovedadesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarClientesNovedades")) {
					jCheckBoxSeleccionadosCobrarClientesNovedadesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarClientesNovedades")) {
					
				}
				
				


				
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
												
				
				


				
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesNovedadesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
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
			
			


			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarclientesnovedades);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarclientesnovedades);
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
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
				
				


				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarClientesNovedades.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarClientesNovedades.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarClientesNovedadesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarclientesnovedadesAnterior =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarClientesNovedades")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarClientesNovedadesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarClientesNovedades.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarclientesnovedades =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarclientesnovedades);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarClientesNovedades")) {
				
				}
				
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarClientesNovedades")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarClientesNovedades.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarClientesNovedades")) {
			
			}
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarClientesNovedades();
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarClientesNovedades")) {
				jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarClientesNovedades")) {
				jButtonDuplicarCobrarClientesNovedadesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarClientesNovedades")) {
				jButtonCopiarCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarClientesNovedades")) {
				jButtonVerFormCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarClientesNovedades")) {
				jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarClientesNovedades")) {
				jButtonModificarCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarClientesNovedades")) {
				jButtonActualizarCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarClientesNovedades")) {
				jButtonEliminarCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarClientesNovedades")) {
				jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarClientesNovedades")) {
				jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarClientesNovedades")) {
				jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarClientesNovedades")) {
				jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarClientesNovedades")) {
				jButtonNuevoGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarClientesNovedades")) {
				jButtonAbrirOrderByCobrarClientesNovedadesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarClientesNovedades")) {
				jButtonRecargarInformacionCobrarClientesNovedadesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarClientesNovedades")) {
				jButtonAnterioresCobrarClientesNovedadesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarClientesNovedades")) {
				jButtonSiguientesCobrarClientesNovedadesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarClientesNovedadesBusqueda")) {
				this.jButtonidCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesNovedadesUpdate")) {
				this.jButtonid_empresaCobrarClientesNovedadesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarClientesNovedadesBusqueda")) {
				this.jButtonid_empresaCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesNovedadesUpdate")) {
				this.jButtonid_sucursalCobrarClientesNovedadesUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarClientesNovedadesBusqueda")) {
				this.jButtonid_sucursalCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("feha_atencion_hastaCobrarClientesNovedadesBusqueda")) {
				this.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarClientesNovedadesBusqueda")) {
				this.jButtoncodigoCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarClientesNovedadesBusqueda")) {
				this.jButtonnombreCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoCobrarClientesNovedadesBusqueda")) {
				this.jButtonapellidoCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("feha_atencionCobrarClientesNovedadesBusqueda")) {
				this.jButtonfeha_atencionCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("hora_atencionCobrarClientesNovedadesBusqueda")) {
				this.jButtonhora_atencionCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("accion_tomadaCobrarClientesNovedadesBusqueda")) {
				this.jButtonaccion_tomadaCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionCobrarClientesNovedadesBusqueda")) {
				this.jButtondescripcionCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoCobrarClientesNovedadesBusqueda")) {
				this.jButtonesta_activoCobrarClientesNovedadesBusquedaActionPerformed(evt);
			}
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarClientesNovedades();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarClientesNovedades")) {
				closingInternalFrameCobrarClientesNovedades();
				
			} else if(sTipo.equals("jButtonCancelarCobrarClientesNovedades")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarClientesNovedades = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarClientesNovedadesBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesNovedadesBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesNovedades.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarClientesNovedadesActionPerformed(null);
			}
			
			CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarclientesnovedades,new Object(),this.cobrarclientesnovedadesParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarClientesNovedades(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarClientesNovedades(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarClientesNovedades(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarclientesnovedades)) {
			if(!esControlTabla) {
				if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);			
				}
				
				if(this.cobrarclientesnovedadesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarClientesNovedades(this.cobrarclientesnovedadesReturnGeneral,this.cobrarclientesnovedadesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarclientesnovedadesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesNovedades(classes,this.cobrarclientesnovedadesReturnGeneral,this.cobrarclientesnovedadesBean,false);
					}
						
					if(this.cobrarclientesnovedadesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarClientesNovedades(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarClientesNovedades(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades());	
					}
						
					if(this.cobrarclientesnovedadesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesNovedades(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades(),classes);//this.cobrarclientesnovedadesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarClientesNovedades(this.cobrarclientesnovedades,classes);//this.cobrarclientesnovedadesBean);									
				}
			
				if(CobrarClientesNovedadesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarClientesNovedades(this.cobrarclientesnovedades,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarClientesNovedades(this.cobrarclientesnovedades);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarclientesnovedadesAnterior!=null) {
						this.cobrarclientesnovedades=this.cobrarclientesnovedadesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarclientesnovedadesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades(),cobrarclientesnovedadesLogic.getCobrarClientesNovedadess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedades(),this.cobrarclientesnovedadess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarClientesNovedades.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarClientesNovedades.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarClientesNovedades();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarClientesNovedades() throws Exception {
		
		CobrarClientesNovedadesModel cobrarclientesnovedadesModel=(CobrarClientesNovedadesModel)this.jTableDatosCobrarClientesNovedades.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarclientesnovedadesModel.cobrarclientesnovedadess=this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarclientesnovedadesModel.cobrarclientesnovedadess=this.cobrarclientesnovedadess;
		}
		
		
		((CobrarClientesNovedadesModel) this.jTableDatosCobrarClientesNovedades.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarClientesNovedades() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarclientesnovedadesAnterior(),this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarclientesnovedadesAnterior(),this.cobrarclientesnovedadess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarClientesNovedades();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
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
										
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientesnovedades,new Object(),generalEntityParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarClientesNovedadesConstantesFunciones.getClassesRelationshipsOfCobrarClientesNovedades(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarClientesNovedadesConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarClientesNovedades(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarClientesNovedades(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarclientesnovedades,new Object(),generalEntityParameterGeneral,this.cobrarclientesnovedadesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarClientesNovedades(CobrarClientesNovedadesBean cobrarclientesnovedadesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarClientesNovedades(ArrayList<Classe> classes,CobrarClientesNovedadesReturnGeneral cobrarclientesnovedadesReturnGeneral,CobrarClientesNovedadesBean cobrarclientesnovedadesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarclientesnovedades)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades = new CobrarClientesNovedadesDetalleFormJInternalFrame(jDesktopPane,this.cobrarclientesnovedadesSessionBean.getConGuardarRelaciones(),this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.setVisible(false);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.cobrarclientesnovedadesLogic=this.cobrarclientesnovedadesLogic;
		
		this.cargarCombosFrameForeignKeyCobrarClientesNovedades("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarClientesNovedades();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarClientesNovedades();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarClientesNovedades("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarClientesNovedades();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesNovedades"));
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesNovedades"));

		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarToolBarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesNovedades"));
					
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemModificarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesNovedades"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesNovedades"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarToolBarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesNovedades"));
						
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemActualizarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesNovedades"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesNovedades"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesNovedades"));
								
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemEliminarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesNovedades"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesNovedades"));
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesNovedades"));
					
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemCancelarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesNovedades"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemDetalleCerrarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesNovedades"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesNovedades"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesNovedades"));
		
		
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesNovedades"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonidCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesNovedadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_empresaCobrarClientesNovedadesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesNovedadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_empresaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesNovedadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_sucursalCobrarClientesNovedadesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesNovedadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_sucursalCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencion_hastaCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtoncodigoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonnombreCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonapellidoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonhora_atencionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"hora_atencionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"accion_tomadaCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtondescripcionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonesta_activoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCobrarClientesNovedadesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesNovedades"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarClientesNovedades"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarClientesNovedades"));
		}
		
		this.jTableDatosCobrarClientesNovedades.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarClientesNovedades"));
		
		this.jTableDatosCobrarClientesNovedades.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarClientesNovedades"));
		
		this.jButtonNuevoCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"NuevoCobrarClientesNovedades"));
		
		this.jButtonDuplicarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"DuplicarCobrarClientesNovedades"));
		
		this.jButtonCopiarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"CopiarCobrarClientesNovedades"));
		
		this.jButtonVerFormCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"VerFormCobrarClientesNovedades"));
		
		
		this.jButtonNuevoToolBarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarClientesNovedades"));
			
		this.jButtonDuplicarToolBarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarClientesNovedades"));
			
		this.jMenuItemNuevoCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarClientesNovedades"));
			
		this.jMenuItemDuplicarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarClientesNovedades"));		
		
		
		this.jButtonNuevoRelacionesCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarClientesNovedades"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarClientesNovedades"));
			
		this.jMenuItemNuevoRelacionesCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarClientesNovedades"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"ModificarCobrarClientesNovedades"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonModificarToolBarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarClientesNovedades"));
			
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemModificarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarClientesNovedades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"ActualizarCobrarClientesNovedades"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonActualizarToolBarCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarClientesNovedades"));
				
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemActualizarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarClientesNovedades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"EliminarCobrarClientesNovedades"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonEliminarToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarClientesNovedades"));
						
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemEliminarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarClientesNovedades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"CancelarCobrarClientesNovedades"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonCancelarToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarClientesNovedades"));
			
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemCancelarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarClientesNovedades"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarClientesNovedades"));		
		
		
		this.jButtonCerrarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"CerrarCobrarClientesNovedades"));
		
		
		this.jButtonCerrarToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarClientesNovedades"));
			
		this.jMenuItemCerrarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarClientesNovedades"));
			
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jMenuItemDetalleCerrarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarClientesNovedades"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarClientesNovedades"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarClientesNovedades"));
		}
		
		this.jButtonCopiarToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarClientesNovedades"));
			
		this.jButtonVerFormToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarClientesNovedades"));
		
		this.jMenuItemGuardarCambiosCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarClientesNovedades"));
			
		this.jMenuItemCopiarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarClientesNovedades"));		
		
		this.jMenuItemVerFormCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarClientesNovedades"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesNovedades"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarClientesNovedades"));
			
		this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarClientesNovedades"));		
		
		
		
		this.jButtonRecargarInformacionCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarClientesNovedades"));
					
		this.jButtonRecargarInformacionToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarClientesNovedades"));
		
		this.jMenuItemRecargarInformacionCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarClientesNovedades"));		
		
		
		
		this.jButtonAnterioresCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"AnterioresCobrarClientesNovedades"));
		
		
		this.jButtonAnterioresToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarClientesNovedades"));
		
		this.jMenuItemAnterioresCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarClientesNovedades"));		
		
		
		this.jButtonSiguientesCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"SiguientesCobrarClientesNovedades"));
		
		
		this.jButtonSiguientesToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarClientesNovedades"));
			
		this.jMenuItemSiguientesCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarClientesNovedades"));
			
		this.jMenuItemAbrirOrderByCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarClientesNovedades"));
			
		this.jMenuItemMostrarOcultarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarClientesNovedades"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarClientesNovedades"));
			
		this.jMenuItemDetalleMostarOcultarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarClientesNovedades"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarClientesNovedades"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarClientesNovedades"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarClientesNovedades"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarClientesNovedades"));

		this.jCheckBoxSeleccionadosCobrarClientesNovedades.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarClientesNovedades"));
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarClientesNovedades"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarClientesNovedades"));
			
		this.jComboBoxTiposAccionesCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarClientesNovedades"));
					
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarClientesNovedades"));
			
		this.jTextFieldValorCampoGeneralCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarClientesNovedades"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonidCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesNovedadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_empresaCobrarClientesNovedadesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesNovedadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_empresaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesNovedadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_sucursalCobrarClientesNovedadesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesNovedadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_sucursalCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencion_hastaCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtoncodigoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonnombreCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonapellidoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonhora_atencionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"hora_atencionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"accion_tomadaCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtondescripcionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonesta_activoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCobrarClientesNovedadesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesNovedadesCobrarClientesNovedades"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarClientesNovedades!=null) {
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesNovedades"));
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesNovedades"));
				this.jInternalFrameReporteDinamicoCobrarClientesNovedades.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesNovedades"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarClientesNovedades"));				
			//this.jButtonGenerarReporteDinamicoCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarClientesNovedades"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarClientesNovedades"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarClientesNovedades!=null) {
				this.jInternalFrameImportacionCobrarClientesNovedades.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarClientesNovedades"));
				this.jInternalFrameImportacionCobrarClientesNovedades.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarClientesNovedades"));
				this.jInternalFrameImportacionCobrarClientesNovedades.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarClientesNovedades"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarClientesNovedades"));
			
			this.jButtonAbrirOrderByToolBarCobrarClientesNovedades.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarClientesNovedades"));			
			
			if(this.jInternalFrameOrderByCobrarClientesNovedades!=null) {
				this.jInternalFrameOrderByCobrarClientesNovedades.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarClientesNovedades"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarClientesNovedades.jTabbedPaneRelacionesCobrarClientesNovedades.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarClientesNovedades"));
		
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
            		closingInternalFrameCobrarClientesNovedades();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarClientesNovedades = (JInternalFrameBase)event.getSource();
	            	
	            CobrarClientesNovedadesBeanSwingJInternalFrame jInternalFrameParent=(CobrarClientesNovedadesBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarClientesNovedades.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarClientesNovedadesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarClientesNovedades.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarClientesNovedadesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarClientesNovedades.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarClientesNovedades.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarClientesNovedades";
		inputMap = this.jButtonNuevoCobrarClientesNovedades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarClientesNovedades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarClientesNovedades";
		inputMap = this.jButtonNuevoRelacionesCobrarClientesNovedades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarClientesNovedades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarClientesNovedadesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarClientesNovedades";
		inputMap = this.jButtonModificarCobrarClientesNovedades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarClientesNovedades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarClientesNovedadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarClientesNovedades";
		inputMap = this.jButtonActualizarCobrarClientesNovedades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarClientesNovedades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarClientesNovedadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarClientesNovedades";
		inputMap = this.jButtonEliminarCobrarClientesNovedades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarClientesNovedades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarClientesNovedadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarClientesNovedades";
		inputMap = this.jButtonCancelarCobrarClientesNovedades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarClientesNovedades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarClientesNovedades";
		inputMap = this.jButtonCerrarCobrarClientesNovedades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarClientesNovedades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarClientesNovedadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarClientesNovedades";
		inputMap = this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosCobrarClientesNovedades.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonGuardarCambiosCobrarClientesNovedades.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarClientesNovedades.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarClientesNovedadesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarClientesNovedades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarClientesNovedadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarClientesNovedades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarClientesNovedadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarClientesNovedades.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarClientesNovedadesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonidCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarClientesNovedadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_empresaCobrarClientesNovedadesUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesNovedadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_empresaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarClientesNovedadesBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_sucursalCobrarClientesNovedadesUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesNovedadesUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonid_sucursalCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonfeha_atencion_hastaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencion_hastaCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtoncodigoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonnombreCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonapellidoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"apellidoCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonfeha_atencionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"feha_atencionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonhora_atencionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"hora_atencionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonaccion_tomadaCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"accion_tomadaCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtondescripcionCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"descripcionCobrarClientesNovedadesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jButtonesta_activoCobrarClientesNovedadesBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoCobrarClientesNovedadesBusqueda"));
		
		
		this.jButtonBusquedaCobrarClientesNovedadesCobrarClientesNovedades.addActionListener(new ButtonActionListener(this,"BusquedaCobrarClientesNovedadesCobrarClientesNovedades"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarClientesNovedades.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarClientesNovedadesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarClientesNovedadesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarClientesNovedades.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarClientesNovedades(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
					cobrarclientesnovedadesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadess) {
					cobrarclientesnovedadesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarClientesNovedadesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
						cobrarclientesnovedadesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadess) {
						cobrarclientesnovedadesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
					
						if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							cobrarclientesnovedadesAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadess) {
						
						if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							cobrarclientesnovedadesAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesNovedades.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesNovedades.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarClientesNovedadesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarClientesNovedades.getSelectedRows();
			
			CobrarClientesNovedades cobrarclientesnovedadesLocal=new CobrarClientesNovedades();
			
			//this.seleccionarTodosCobrarClientesNovedades(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarclientesnovedadesLocal =(CobrarClientesNovedades) this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess().toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarclientesnovedadesLocal =(CobrarClientesNovedades) this.cobrarclientesnovedadess.toArray()[this.jTableDatosCobrarClientesNovedades.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarclientesnovedadesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
						cobrarclientesnovedadesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadess) {
						cobrarclientesnovedadesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarClientesNovedades.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarClientesNovedades.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarClientesNovedades,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarClientesNovedadesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarClientesNovedadesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarClientesNovedadesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarClientesNovedades.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
				
						if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA)) {
							existe=true;
							cobrarclientesnovedadesAux.setfeha_atencion_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientesnovedadesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarclientesnovedadesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobrarclientesnovedadesAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION)) {
							existe=true;
							cobrarclientesnovedadesAux.setfeha_atencion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION)) {
							existe=true;
							cobrarclientesnovedadesAux.sethora_atencion(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA)) {
							existe=true;
							cobrarclientesnovedadesAux.setaccion_tomada(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cobrarclientesnovedadesAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadess) {
					
						if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA)) {
							existe=true;
							cobrarclientesnovedadesAux.setfeha_atencion_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarclientesnovedadesAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarclientesnovedadesAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							cobrarclientesnovedadesAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION)) {
							existe=true;
							cobrarclientesnovedadesAux.setfeha_atencion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION)) {
							existe=true;
							cobrarclientesnovedadesAux.sethora_atencion(Time.valueOf(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA)) {
							existe=true;
							cobrarclientesnovedadesAux.setaccion_tomada(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							cobrarclientesnovedadesAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarClientesNovedadesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarClientesNovedades=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarClientesNovedades.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarClientesNovedades) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarClientesNovedades(conSplash);
				
					this.generarReporteCobrarClientesNovedadessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarClientesNovedadessSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesNovedadessSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarClientesNovedadessSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesNovedades();
				
				this.exportarCobrarClientesNovedadessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarClientesNovedadess();
				//this.importarCobrarClientesNovedadess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarClientesNovedades();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarClientesNovedadessSeleccionados();
				//this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Clientes Novedades", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarClientesNovedades();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarClientesNovedades)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarClientesNovedades(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarClientesNovedadesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarClientesNovedades) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarClientesNovedades(conSplash);
					
						//this.actualizarParametrosGeneralCobrarClientesNovedades();
						
						this.generarReporteProcesoAccionCobrarClientesNovedadessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Clientes NovedadesES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Clientes Novedades", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarClientesNovedades();
				
						this.actualizarParametrosGeneralCobrarClientesNovedades();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarclientesnovedadesReturnGeneral=cobrarclientesnovedadesLogic.procesarAccionCobrarClientesNovedadessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess(),this.cobrarclientesnovedadesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarClientesNovedadesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarClientesNovedades();
					
					CobrarClientesNovedadesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarClientesNovedadesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarClientesNovedades.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxTiposAccionesFormularioCobrarClientesNovedades.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarClientesNovedades(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarClientesNovedadesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarClientesNovedades();
			
			if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
			CobrarClientesNovedades cobrarclientesnovedades=new CobrarClientesNovedades();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarClientesNovedades(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarClientesNovedades.getSelectedItem();
			
			
			
			
			cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarclientesnovedadessSeleccionados.size()==1) {
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadessSeleccionados) {
					cobrarclientesnovedades=cobrarclientesnovedadesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarClientesNovedades();
			
      		//this.finishProcessCobrarClientesNovedades(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarClientesNovedadesReturnGeneral() throws Exception {
		if(this.cobrarclientesnovedadesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientesnovedadesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarclientesnovedadesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarclientesnovedadesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarclientesnovedadesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarclientesnovedadesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarClientesNovedades(false);
		}
		
		if(this.cobrarclientesnovedadesReturnGeneral.getConRetornoLista() || this.cobrarclientesnovedadesReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarclientesnovedadesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarclientesnovedadesLogic.setCobrarClientesNovedadess(this.cobrarclientesnovedadesReturnGeneral.getCobrarClientesNovedadess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarClientesNovedades(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarClientesNovedades() throws Exception {
		
		
	}
	
	public ArrayList<CobrarClientesNovedades> getCobrarClientesNovedadessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarClientesNovedades) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadesLogic.getCobrarClientesNovedadess()) {
					if(cobrarclientesnovedadesAux.getIsSelected()) {
						cobrarclientesnovedadessSeleccionados.add(cobrarclientesnovedadesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarClientesNovedades cobrarclientesnovedadesAux:this.cobrarclientesnovedadess) {
					if(cobrarclientesnovedadesAux.getIsSelected()) {
						cobrarclientesnovedadessSeleccionados.add(cobrarclientesnovedadesAux);				
					}
				}
			}
			
			if(cobrarclientesnovedadessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarclientesnovedadessSeleccionados.addAll(this.cobrarclientesnovedadesLogic.getCobrarClientesNovedadess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarclientesnovedadessSeleccionados.addAll(this.cobrarclientesnovedadess);				
					}
				}
			}
		} else {
			cobrarclientesnovedadessSeleccionados.add(this.cobrarclientesnovedades);
		}
		
		return cobrarclientesnovedadessSeleccionados;
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
	
	public void generarReporteCobrarClientesNovedadessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			//SI ES GROUP REPORTE NO ES NORMAL, NORMAL ES AGRUPADO
			this.generarReporteGroupReporteCobrarClientesNovedadessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarClientesNovedadessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesNovedadessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarClientesNovedadessSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("LISTA_COLUMNAS")) {
			//SI ES GROUP REPORTE LISTA_COLUMNAS ES NORMAL
			existe=true;
			this.generarReporteNormalCobrarClientesNovedadessSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Clientes Novedades",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarClientesNovedadessSeleccionados() throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarClientesNovedadess("Todos",cobrarclientesnovedadessSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarClientesNovedadessSeleccionados() throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarClientesNovedadess("Todos",cobrarclientesnovedadessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarClientesNovedadessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarClientesNovedadess("Todos",cobrarclientesnovedadessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	public void generarReporteGroupReporteCobrarClientesNovedadessSeleccionados() throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		//GROUP REPORTE
		this.sTipoReporteExtra="GroupReporte";
			
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarClientesNovedadess("Todos",cobrarclientesnovedadessSeleccionados);
	}	
	
	public void mostrarReporteDinamicoCobrarClientesNovedadessSeleccionados() throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarClientesNovedades();
		
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarClientesNovedades();
		
		
		//this.generarReporteCobrarClientesNovedadess("Todos",cobrarclientesnovedadessSeleccionados ,cobrarclientesnovedadesImplementable,cobrarclientesnovedadesImplementableHome);
	}
	
	public void mostrarImportacionCobrarClientesNovedadess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarClientesNovedades();
		
		this.abrirFrameImportacionCobrarClientesNovedades();		
		
			
		//this.generarReporteCobrarClientesNovedadess("Todos",cobrarclientesnovedadessSeleccionados ,cobrarclientesnovedadesImplementable,cobrarclientesnovedadesImplementableHome);
	}
	
	public void importarCobrarClientesNovedadess() throws Exception {		
	
	}
	
	public void exportarCobrarClientesNovedadessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarClientesNovedadessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarClientesNovedadessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarClientesNovedadessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Clientes Novedades",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarClientesNovedadessSeleccionados() throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesnovedades."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarClientesNovedades(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarClientesNovedades(cobrarclientesnovedadesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarclientesnovedadesAux.setsDetalleGeneralEntityReporte(cobrarclientesnovedadesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarClientesNovedades(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarclientesnovedades.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getfeha_atencion_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getfeha_atencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.gethora_atencion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getaccion_tomada();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarclientesnovedades.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarClientesNovedadessSeleccionados() throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesnovedades.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarClientesNovedadess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarClientesNovedades(row);				
				iRow++;
			}				
			
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarClientesNovedades(cobrarclientesnovedadesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarClientesNovedadessSeleccionados() throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();		
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarclientesnovedades.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarclientesnovedadess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarclientesnovedades");
			//elementRoot.appendChild(element);
		
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadessSeleccionados) {
				element = document.createElement("cobrarclientesnovedades");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarClientesNovedades(cobrarclientesnovedadesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Clientes Novedades",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarClientesNovedades(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getfeha_atencion_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getfeha_atencion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.gethora_atencion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getaccion_tomada());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarclientesnovedades.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlCobrarClientesNovedades(CobrarClientesNovedades cobrarclientesnovedades,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarClientesNovedadesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarclientesnovedades.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarClientesNovedadesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarclientesnovedades.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarClientesNovedadesConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarclientesnovedades.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CobrarClientesNovedadesConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cobrarclientesnovedades.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementfeha_atencion_hasta = document.createElement(CobrarClientesNovedadesConstantesFunciones.FEHAATENCIONHASTA);
		elementfeha_atencion_hasta.appendChild(document.createTextNode(cobrarclientesnovedades.getfeha_atencion_hasta().toString().trim()));
		element.appendChild(elementfeha_atencion_hasta);

		Element elementcodigo = document.createElement(CobrarClientesNovedadesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarclientesnovedades.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CobrarClientesNovedadesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cobrarclientesnovedades.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementapellido = document.createElement(CobrarClientesNovedadesConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(cobrarclientesnovedades.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementfeha_atencion = document.createElement(CobrarClientesNovedadesConstantesFunciones.FEHAATENCION);
		elementfeha_atencion.appendChild(document.createTextNode(cobrarclientesnovedades.getfeha_atencion().toString().trim()));
		element.appendChild(elementfeha_atencion);

		Element elementhora_atencion = document.createElement(CobrarClientesNovedadesConstantesFunciones.HORAATENCION);
		elementhora_atencion.appendChild(document.createTextNode(cobrarclientesnovedades.gethora_atencion().toString().trim()));
		element.appendChild(elementhora_atencion);

		Element elementaccion_tomada = document.createElement(CobrarClientesNovedadesConstantesFunciones.ACCIONTOMADA);
		elementaccion_tomada.appendChild(document.createTextNode(cobrarclientesnovedades.getaccion_tomada().trim()));
		element.appendChild(elementaccion_tomada);

		Element elementdescripcion = document.createElement(CobrarClientesNovedadesConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(cobrarclientesnovedades.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementesta_activo = document.createElement(CobrarClientesNovedadesConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(cobrarclientesnovedades.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoCobrarClientesNovedadessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados=new ArrayList<CobrarClientesNovedades>();
		
		cobrarclientesnovedadessSeleccionados=this.getCobrarClientesNovedadessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarClientesNovedades(cobrarclientesnovedadessSeleccionados);
		
		this.generarReporteCobrarClientesNovedadess("Todos",cobrarclientesnovedadessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarClientesNovedades(ArrayList<CobrarClientesNovedades> cobrarclientesnovedadessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarClientesNovedades cobrarclientesnovedadesAux:cobrarclientesnovedadessSeleccionados) {
				cobrarclientesnovedadesAux.setsDetalleGeneralEntityReporte(cobrarclientesnovedadesAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(cobrarclientesnovedadesAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(cobrarclientesnovedadesAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCIONHASTA)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarclientesnovedadesAux.getfeha_atencion_hasta()));
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(cobrarclientesnovedadesAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(cobrarclientesnovedadesAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(cobrarclientesnovedadesAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_FEHAATENCION)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(cobrarclientesnovedadesAux.getfeha_atencion()));
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_HORAATENCION)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(cobrarclientesnovedadesAux.gethora_atencion().toString());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_ACCIONTOMADA)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(cobrarclientesnovedadesAux.getaccion_tomada());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(cobrarclientesnovedadesAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarClientesNovedadesConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					cobrarclientesnovedadesAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(cobrarclientesnovedadesAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarClientesNovedadesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarClientesNovedades(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarClientesNovedades=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=true;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=true;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=true;
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=true;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=true;
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;
			this.isVisibilidadCeldaModificarCobrarClientesNovedades=true;
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaCancelarCobrarClientesNovedades=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarClientesNovedadesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=true;
		} else {
			this.actualizarEstadoPanelsCobrarClientesNovedades(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarClientesNovedades=false;
			//this.isVisibilidadCeldaVerFormCobrarClientesNovedades=false;
			this.isVisibilidadCeldaDuplicarCobrarClientesNovedades=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarclientesnovedadesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;												
			}
			
			this.jButtonCerrarCobrarClientesNovedades.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarclientesnovedades)) {
			this.isVisibilidadCeldaActualizarCobrarClientesNovedades=false;
			this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarClientesNovedades=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarClientesNovedades=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarClientesNovedades=false;
		//this.isVisibilidadCeldaModificarCobrarClientesNovedades=true;
		this.isVisibilidadCeldaActualizarCobrarClientesNovedades=false;
		this.isVisibilidadCeldaEliminarCobrarClientesNovedades=false;
		//this.isVisibilidadCeldaCancelarCobrarClientesNovedades=true;			
		this.isVisibilidadCeldaGuardarCobrarClientesNovedades=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarClientesNovedades() {
	}
	
	public void actualizarEstadoPanelsCobrarClientesNovedades(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesNovedades.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosCobrarClientesNovedades.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesNovedades!=null) {
				this.jPanelPaginacionCobrarClientesNovedades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesNovedades.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosCobrarClientesNovedades.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesNovedades!=null) {
				this.jPanelPaginacionCobrarClientesNovedades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesNovedades.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosCobrarClientesNovedades.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesNovedades!=null) {
				this.jPanelPaginacionCobrarClientesNovedades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesNovedades.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosCobrarClientesNovedades.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarClientesNovedades!=null) {
				this.jPanelPaginacionCobrarClientesNovedades.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesNovedades.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosCobrarClientesNovedades.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesNovedades!=null) {
				this.jPanelPaginacionCobrarClientesNovedades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesNovedades.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosCobrarClientesNovedades.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesNovedades!=null) {
				this.jPanelPaginacionCobrarClientesNovedades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosEdicionCobrarClientesNovedades.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarClientesNovedades!=null) {
				this.jScrollPanelDatosCobrarClientesNovedades.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarClientesNovedades!=null) {
				this.jPanelPaginacionCobrarClientesNovedades.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
					this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarclientesnovedadesSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarClientesNovedades!=null) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarClientesNovedades!=null) {
				this.jPanelParametrosReportesCobrarClientesNovedades.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarClientesNovedades=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesNovedades) {this.jTabbedPaneBusquedasCobrarClientesNovedades.remove(jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaCobrarClientesNovedades=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaCobrarClientesNovedades) {this.jTabbedPaneBusquedasCobrarClientesNovedades.remove(jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades);}
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
			
			this.inicializarActualizarBindingTablaCobrarClientesNovedades(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarClientesNovedades() {
		this.updateBorderResaltarBusquedasFormularioCobrarClientesNovedades();
		this.updateVisibilidadBusquedasFormularioCobrarClientesNovedades();
		this.updateHabilitarBusquedasFormularioCobrarClientesNovedades();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarClientesNovedades() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarClientesNovedades.getComponents().length>0) {
	

		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarBusquedaCobrarClientesNovedadesCobrarClientesNovedades!=null) {
			index= this.jTabbedPaneBusquedasCobrarClientesNovedades.indexOfComponent(this.jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesNovedades.getComponent(index);
				jPanel.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarClientesNovedades() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarClientesNovedades.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesNovedades.indexOfComponent(this.jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesNovedades.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
			if(!this.cobrarclientesnovedadesConstantesFunciones.mostrarBusquedaCobrarClientesNovedadesCobrarClientesNovedades && index>-1) {
				this.jTabbedPaneBusquedasCobrarClientesNovedades.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarClientesNovedades() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarClientesNovedades.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarClientesNovedades.indexOfComponent(this.jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesNovedades.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
				this.jTabbedPaneBusquedasCobrarClientesNovedades.setEnabledAt(index,this.cobrarclientesnovedadesConstantesFunciones.activarBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarClientesNovedades(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarClientesNovedades")) {
			index= this.jTabbedPaneBusquedasCobrarClientesNovedades.indexOfComponent(this.jPanelBusquedaCobrarClientesNovedadesCobrarClientesNovedades);

			this.jTabbedPaneBusquedasCobrarClientesNovedades.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarClientesNovedades.getComponent(index);

			this.cobrarclientesnovedadesConstantesFunciones.setResaltarBusquedaCobrarClientesNovedadesCobrarClientesNovedades(resaltar);

			jPanel.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarBusquedaCobrarClientesNovedadesCobrarClientesNovedades);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarClientesNovedades.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarClientesNovedades() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarClientesNovedades();
		this.updateVisibilidadResaltarControlesFormularioCobrarClientesNovedades();
		this.updateHabilitarResaltarControlesFormularioCobrarClientesNovedades();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarClientesNovedades() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltaridCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltaridCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarid_empresaCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarid_empresaCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarid_sucursalCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarid_sucursalCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarfeha_atencion_hastaCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarfeha_atencion_hastaCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarcodigoCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextFieldcodigoCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarcodigoCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarnombreCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreanombreCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarnombreCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarapellidoCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaapellidoCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarapellidoCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarfeha_atencionCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencionCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarfeha_atencionCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltarhora_atencionCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jSpinnerhora_atencionCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltarhora_atencionCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltaraccion_tomadaCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaaccion_tomadaCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltaraccion_tomadaCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltardescripcionCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreadescripcionCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltardescripcionCobrarClientesNovedades);}
		if(this.cobrarclientesnovedadesConstantesFunciones.resaltaresta_activoCobrarClientesNovedades!=null && this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.setBorderPainted(true);this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.setBorder(this.cobrarclientesnovedadesConstantesFunciones.resaltaresta_activoCobrarClientesNovedades);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarClientesNovedades() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
	
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostraridCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelidCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostraridCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarid_empresaCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelid_empresaCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarid_empresaCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarid_sucursalCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelid_sucursalCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarid_sucursalCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarfeha_atencion_hastaCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelfeha_atencion_hastaCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarfeha_atencion_hastaCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextFieldcodigoCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarcodigoCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelcodigoCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarcodigoCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreanombreCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarnombreCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelnombreCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarnombreCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaapellidoCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarapellidoCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelapellidoCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarapellidoCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencionCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarfeha_atencionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelfeha_atencionCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarfeha_atencionCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jSpinnerhora_atencionCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarhora_atencionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelhora_atencionCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrarhora_atencionCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaaccion_tomadaCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostraraccion_tomadaCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelaccion_tomadaCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostraraccion_tomadaCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreadescripcionCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrardescripcionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPaneldescripcionCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostrardescripcionCobrarClientesNovedades);
		//this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostraresta_activoCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jPanelesta_activoCobrarClientesNovedades.setVisible(this.cobrarclientesnovedadesConstantesFunciones.mostraresta_activoCobrarClientesNovedades);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarClientesNovedades() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarClientesNovedades!=null) {
	
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jLabelidCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activaridCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_empresaCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarid_empresaCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jComboBoxid_sucursalCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarid_sucursalCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencion_hastaCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarfeha_atencion_hastaCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextFieldcodigoCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarcodigoCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreanombreCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarnombreCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaapellidoCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarapellidoCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jDateChooserfeha_atencionCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarfeha_atencionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jSpinnerhora_atencionCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activarhora_atencionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreaaccion_tomadaCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activaraccion_tomadaCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jTextAreadescripcionCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activardescripcionCobrarClientesNovedades);
		this.jInternalFrameDetalleFormCobrarClientesNovedades.jCheckBoxesta_activoCobrarClientesNovedades.setEnabled(this.cobrarclientesnovedadesConstantesFunciones.activaresta_activoCobrarClientesNovedades);
		}
	}
	
		
}