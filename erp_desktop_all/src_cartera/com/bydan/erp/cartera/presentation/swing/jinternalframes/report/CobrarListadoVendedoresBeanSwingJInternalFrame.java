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

//import com.bydan.erp.cartera.util.CobrarListadoVendedoresConstantesFunciones;
import com.bydan.erp.cartera.util.report.CobrarListadoVendedoresParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.CobrarListadoVendedoresParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.CobrarListadoVendedoresBean;
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
import com.bydan.erp.comisiones.business.logic.*;

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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CobrarListadoVendedoresBeanSwingJInternalFrame extends CobrarListadoVendedoresJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CobrarListadoVendedoresBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CobrarListadoVendedores> cobrarlistadovendedoresValidator = new ClassValidator<CobrarListadoVendedores>(CobrarListadoVendedores.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CobrarListadoVendedores cobrarlistadovendedores;	
	public CobrarListadoVendedores cobrarlistadovendedoresAux;
	public CobrarListadoVendedores cobrarlistadovendedoresAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CobrarListadoVendedores cobrarlistadovendedoresTotales;
	public Long idCobrarListadoVendedoresActual;
	public Long iIdNuevoCobrarListadoVendedores=0L;
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

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
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
	
	public Boolean isPermisoTodoCobrarListadoVendedores;
	public Boolean isPermisoNuevoCobrarListadoVendedores;
	public Boolean isPermisoActualizarCobrarListadoVendedores;
	public Boolean isPermisoActualizarOriginalCobrarListadoVendedores;
	public Boolean isPermisoEliminarCobrarListadoVendedores;
	public Boolean isPermisoGuardarCambiosCobrarListadoVendedores;
	public Boolean isPermisoConsultaCobrarListadoVendedores;
	public Boolean isPermisoBusquedaCobrarListadoVendedores;
	public Boolean isPermisoReporteCobrarListadoVendedores;
	public Boolean isPermisoPaginacionMedioCobrarListadoVendedores;
	public Boolean isPermisoPaginacionAltoCobrarListadoVendedores;
	public Boolean isPermisoPaginacionTodoCobrarListadoVendedores;
	public Boolean isPermisoCopiarCobrarListadoVendedores;
	public Boolean isPermisoVerFormCobrarListadoVendedores;
	public Boolean isPermisoDuplicarCobrarListadoVendedores;
	public Boolean isPermisoOrdenCobrarListadoVendedores;
	
	
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
	
	public CobrarListadoVendedoresParameterReturnGeneral cobrarlistadovendedoresReturnGeneral;
	public CobrarListadoVendedoresParameterReturnGeneral cobrarlistadovendedoresParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCobrarListadoVendedores=false;
	public Boolean esParaAccionDesdeFormularioCobrarListadoVendedores=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CobrarListadoVendedoresSessionBeanAdditional cobrarlistadovendedoresSessionBeanAdditional=null;
	
	public CobrarListadoVendedoresSessionBeanAdditional getCobrarListadoVendedoresSessionBeanAdditional() {
		return this.cobrarlistadovendedoresSessionBeanAdditional;
	}
	
	public void setCobrarListadoVendedoresSessionBeanAdditional(CobrarListadoVendedoresSessionBeanAdditional cobrarlistadovendedoresSessionBeanAdditional) {
		try {
			this.cobrarlistadovendedoresSessionBeanAdditional=cobrarlistadovendedoresSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CobrarListadoVendedoresBeanSwingJInternalFrameAdditional cobrarlistadovendedoresBeanSwingJInternalFrameAdditional=null;
	//public class CobrarListadoVendedoresBeanSwingJInternalFrame
	
	public CobrarListadoVendedoresBeanSwingJInternalFrameAdditional getCobrarListadoVendedoresBeanSwingJInternalFrameAdditional() {
		return this.cobrarlistadovendedoresBeanSwingJInternalFrameAdditional;
	}
	
	public void setCobrarListadoVendedoresBeanSwingJInternalFrameAdditional(CobrarListadoVendedoresBeanSwingJInternalFrameAdditional cobrarlistadovendedoresBeanSwingJInternalFrameAdditional) {
		try {
			this.cobrarlistadovendedoresBeanSwingJInternalFrameAdditional=cobrarlistadovendedoresBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CobrarListadoVendedoresLogic cobrarlistadovendedoresLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CobrarListadoVendedores cobrarlistadovendedoresBean;
	public CobrarListadoVendedoresConstantesFunciones cobrarlistadovendedoresConstantesFunciones;
	//public CobrarListadoVendedoresParameterReturnGeneral cobrarlistadovendedoresReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public VendedorLogic vendedorLogic;
	
	//PARAMETROS
	
	
	//public List<CobrarListadoVendedores> cobrarlistadovendedoress;	
	//public List<CobrarListadoVendedores> cobrarlistadovendedoressEliminados;
	//public List<CobrarListadoVendedores> cobrarlistadovendedoressAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
	public Boolean isVisibilidadCeldaDuplicarCobrarListadoVendedores=true;
	public Boolean isVisibilidadCeldaCopiarCobrarListadoVendedores=true;
	public Boolean isVisibilidadCeldaVerFormCobrarListadoVendedores=true;
	public Boolean isVisibilidadCeldaOrdenCobrarListadoVendedores=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
	public Boolean isVisibilidadCeldaModificarCobrarListadoVendedores=false;
	public Boolean isVisibilidadCeldaActualizarCobrarListadoVendedores=false;
	public Boolean isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
	public Boolean isVisibilidadCeldaCancelarCobrarListadoVendedores=false;
	public Boolean isVisibilidadCeldaGuardarCobrarListadoVendedores=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;	
	
	
	public Boolean isVisibilidadBusquedaCobrarListadoVendedores=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoCobrarListadoVendedores() {
		return this.iIdNuevoCobrarListadoVendedores;
	}

	public void setiIdNuevoCobrarListadoVendedores(Long iIdNuevoCobrarListadoVendedores) {
		this.iIdNuevoCobrarListadoVendedores = iIdNuevoCobrarListadoVendedores;
	}
	
	public Long getidCobrarListadoVendedoresActual() {
		return this.idCobrarListadoVendedoresActual;
	}

	public void setidCobrarListadoVendedoresActual(Long idCobrarListadoVendedoresActual) {
		this.idCobrarListadoVendedoresActual = idCobrarListadoVendedoresActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CobrarListadoVendedores getcobrarlistadovendedores() {
		return this.cobrarlistadovendedores;
	}

	public void setcobrarlistadovendedores(CobrarListadoVendedores cobrarlistadovendedores) {
		this.cobrarlistadovendedores = cobrarlistadovendedores;
	}
	
	public CobrarListadoVendedores getcobrarlistadovendedoresAux() {
		return this.cobrarlistadovendedoresAux;
	}

	public void setcobrarlistadovendedoresAux(CobrarListadoVendedores cobrarlistadovendedoresAux) {
		this.cobrarlistadovendedoresAux = cobrarlistadovendedoresAux;
	}				
	
	public CobrarListadoVendedores getcobrarlistadovendedoresAnterior() {
		return this.cobrarlistadovendedoresAnterior;
	}

	public void setcobrarlistadovendedoresAnterior(CobrarListadoVendedores cobrarlistadovendedoresAnterior) {
		this.cobrarlistadovendedoresAnterior = cobrarlistadovendedoresAnterior;
	}	
	
	public CobrarListadoVendedores getcobrarlistadovendedoresTotales() {
		return this.cobrarlistadovendedoresTotales;
	}

	public void setcobrarlistadovendedoresTotales(CobrarListadoVendedores cobrarlistadovendedoresTotales) {
		this.cobrarlistadovendedoresTotales = cobrarlistadovendedoresTotales;
	}	
	
	public CobrarListadoVendedores getcobrarlistadovendedoresBean() {
		return this.cobrarlistadovendedoresBean;
	}

	public void setcobrarlistadovendedoresBean(CobrarListadoVendedores cobrarlistadovendedoresBean) {
		this.cobrarlistadovendedoresBean = cobrarlistadovendedoresBean;
	}	
	
	public CobrarListadoVendedoresParameterReturnGeneral getcobrarlistadovendedoresReturnGeneral() {
		return this.cobrarlistadovendedoresReturnGeneral;
	}

	public void setcobrarlistadovendedoresReturnGeneral(CobrarListadoVendedoresParameterReturnGeneral cobrarlistadovendedoresReturnGeneral) {
		this.cobrarlistadovendedoresReturnGeneral = cobrarlistadovendedoresReturnGeneral;
	}	
	
	
	public Long id_vendedorBusquedaCobrarListadoVendedores=-1L;

	public Long getid_vendedorBusquedaCobrarListadoVendedores() {
		return this.id_vendedorBusquedaCobrarListadoVendedores;
	}

	public void setid_vendedorBusquedaCobrarListadoVendedores(Long id_vendedorBusquedaCobrarListadoVendedores) {
		this.id_vendedorBusquedaCobrarListadoVendedores = id_vendedorBusquedaCobrarListadoVendedores;
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

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CobrarListadoVendedoresLogic getCobrarListadoVendedoresLogic()	{		
		return cobrarlistadovendedoresLogic;
	}

	public void setCobrarListadoVendedoresLogic(CobrarListadoVendedoresLogic cobrarlistadovendedoresLogic) {
		this.cobrarlistadovendedoresLogic = cobrarlistadovendedoresLogic;
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
	
	public Boolean getIsEsNuevoCobrarListadoVendedores() {
		return isEsNuevoCobrarListadoVendedores;
	}

	public void setIsEsNuevoCobrarListadoVendedores(Boolean isEsNuevoCobrarListadoVendedores) {
		this.isEsNuevoCobrarListadoVendedores = isEsNuevoCobrarListadoVendedores;
	}

	public Boolean getEsParaAccionDesdeFormularioCobrarListadoVendedores() {
		return esParaAccionDesdeFormularioCobrarListadoVendedores;
	}
	
	public void setEsParaAccionDesdeFormularioCobrarListadoVendedores(Boolean esParaAccionDesdeFormularioCobrarListadoVendedores) {
		this.esParaAccionDesdeFormularioCobrarListadoVendedores = esParaAccionDesdeFormularioCobrarListadoVendedores;
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

			if(this.cobrarlistadovendedoresSessionBean==null) {
				this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean();
			}

			if(!this.cobrarlistadovendedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cobrarlistadovendedoresSessionBean.getlidEmpresaActual());
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

			if(this.cobrarlistadovendedoresSessionBean==null) {
				this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean();
			}

			if(!this.cobrarlistadovendedoresSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cobrarlistadovendedoresSessionBean.getlidSucursalActual());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			Vendedor vendedorNulo = new Vendedor();

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.cobrarlistadovendedoresSessionBean==null) {
				this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean();
			}

			if(!this.cobrarlistadovendedoresSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}

				this.vendedorsForeignKey.add(0, vendedorNulo);

				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(cobrarlistadovendedoresSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

					if(this.cobrarlistadovendedores!=null) {
						this.cobrarlistadovendedores.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
						this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCobrarListadoVendedores.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCobrarListadoVendedoresGenerico)throws Exception
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
				jComboBoxid_empresaCobrarListadoVendedoresGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCobrarListadoVendedoresGenerico!=null && jComboBoxid_empresaCobrarListadoVendedoresGenerico.getItemCount()>0) {
					jComboBoxid_empresaCobrarListadoVendedoresGenerico.setSelectedIndex(0);
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

					if(this.cobrarlistadovendedores!=null) {
						this.cobrarlistadovendedores.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
						this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCobrarListadoVendedores.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCobrarListadoVendedoresGenerico)throws Exception
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
				jComboBoxid_sucursalCobrarListadoVendedoresGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCobrarListadoVendedoresGenerico!=null && jComboBoxid_sucursalCobrarListadoVendedoresGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCobrarListadoVendedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.cobrarlistadovendedores!=null) {
						this.cobrarlistadovendedores.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
						this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorCobrarListadoVendedores.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.getItemCount()>0) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaCobrarListadoVendedores") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores!=null) {
						jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores!=null) {
							//jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.getItemCount()>0) {
								jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorCobrarListadoVendedoresGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorCobrarListadoVendedoresGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorCobrarListadoVendedoresGenerico!=null && jComboBoxid_vendedorCobrarListadoVendedoresGenerico.getItemCount()>0) {
					jComboBoxid_vendedorCobrarListadoVendedoresGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CobrarListadoVendedores cobrarlistadovendedores,JComboBox jComboBoxid_empresaCobrarListadoVendedoresGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCobrarListadoVendedoresGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCobrarListadoVendedoresGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cobrarlistadovendedores.setid_empresa(empresaAux.getId());
				cobrarlistadovendedores.setempresa_descripcion(CobrarListadoVendedoresConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cobrarlistadovendedores.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CobrarListadoVendedores cobrarlistadovendedores,JComboBox jComboBoxid_sucursalCobrarListadoVendedoresGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCobrarListadoVendedoresGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCobrarListadoVendedoresGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cobrarlistadovendedores.setid_sucursal(sucursalAux.getId());
				cobrarlistadovendedores.setsucursal_descripcion(CobrarListadoVendedoresConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cobrarlistadovendedores.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(CobrarListadoVendedores cobrarlistadovendedores,JComboBox jComboBoxid_vendedorCobrarListadoVendedoresGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorCobrarListadoVendedoresGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorCobrarListadoVendedoresGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				cobrarlistadovendedores.setid_vendedor(vendedorAux.getId());
				cobrarlistadovendedores.setvendedor_descripcion(CobrarListadoVendedoresConstantesFunciones.getVendedorDescripcion(vendedorAux));
				cobrarlistadovendedores.setVendedor(vendedorAux);			}
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

					if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { 
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { 
					}

					if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { 
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { 
					}

					if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { 
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { 
					}

					if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaCobrarListadoVendedores") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.addItem(vendedor);
							}
						}

						if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCobrarListadoVendedores() throws Exception {
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
		
	public CobrarListadoVendedoresParameterReturnGeneral getCobrarListadoVendedoresParameterGeneral() {
		return this.cobrarlistadovendedoresParameterGeneral;
	}
	
	public void setCobrarListadoVendedoresParameterGeneral(CobrarListadoVendedoresParameterReturnGeneral cobrarlistadovendedoresParameterGeneral) {
		this.cobrarlistadovendedoresParameterGeneral = cobrarlistadovendedoresParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCobrarListadoVendedores() {
		return isPermisoTodoCobrarListadoVendedores;
	}

	public void setIsPermisoTodoCobrarListadoVendedores(Boolean isPermisoTodoCobrarListadoVendedores) {
		this.isPermisoTodoCobrarListadoVendedores = isPermisoTodoCobrarListadoVendedores;
	}

	public Boolean getIsPermisoNuevoCobrarListadoVendedores() {
		return isPermisoNuevoCobrarListadoVendedores;
	}

	public void setIsPermisoNuevoCobrarListadoVendedores(Boolean isPermisoNuevoCobrarListadoVendedores) {
		this.isPermisoNuevoCobrarListadoVendedores = isPermisoNuevoCobrarListadoVendedores;
	}

	public Boolean getIsPermisoActualizarCobrarListadoVendedores() {
		return isPermisoActualizarCobrarListadoVendedores;
	}

	public void setIsPermisoActualizarCobrarListadoVendedores(Boolean isPermisoActualizarCobrarListadoVendedores) {
		this.isPermisoActualizarCobrarListadoVendedores = isPermisoActualizarCobrarListadoVendedores;
	}

	public Boolean getIsPermisoEliminarCobrarListadoVendedores() {
		return isPermisoEliminarCobrarListadoVendedores;
	}

	public void setIsPermisoEliminarCobrarListadoVendedores(Boolean isPermisoEliminarCobrarListadoVendedores) {
		this.isPermisoEliminarCobrarListadoVendedores = isPermisoEliminarCobrarListadoVendedores;
	}

	public Boolean getIsPermisoGuardarCambiosCobrarListadoVendedores() {
		return isPermisoGuardarCambiosCobrarListadoVendedores;
	}

	public void setIsPermisoGuardarCambiosCobrarListadoVendedores(Boolean isPermisoGuardarCambiosCobrarListadoVendedores) {
		this.isPermisoGuardarCambiosCobrarListadoVendedores = isPermisoGuardarCambiosCobrarListadoVendedores;
	}
	
	public Boolean getIsPermisoConsultaCobrarListadoVendedores() {
		return isPermisoConsultaCobrarListadoVendedores;
	}

	public void setIsPermisoConsultaCobrarListadoVendedores(Boolean isPermisoConsultaCobrarListadoVendedores) {
		this.isPermisoConsultaCobrarListadoVendedores = isPermisoConsultaCobrarListadoVendedores;
	}

	public Boolean getIsPermisoBusquedaCobrarListadoVendedores() {
		return isPermisoBusquedaCobrarListadoVendedores;
	}

	public void setIsPermisoBusquedaCobrarListadoVendedores(Boolean isPermisoBusquedaCobrarListadoVendedores) {
		this.isPermisoBusquedaCobrarListadoVendedores = isPermisoBusquedaCobrarListadoVendedores;
	}

	public Boolean getIsPermisoReporteCobrarListadoVendedores() {
		return isPermisoReporteCobrarListadoVendedores;
	}

	public void setIsPermisoReporteCobrarListadoVendedores(Boolean isPermisoReporteCobrarListadoVendedores) {
		this.isPermisoReporteCobrarListadoVendedores = isPermisoReporteCobrarListadoVendedores;
	}
	
	public Boolean getIsPermisoPaginacionMedioCobrarListadoVendedores() {
		return isPermisoPaginacionMedioCobrarListadoVendedores;
	}

	public void setIsPermisoPaginacionMedioCobrarListadoVendedores(Boolean isPermisoPaginacionMedioCobrarListadoVendedores) {
		this.isPermisoPaginacionMedioCobrarListadoVendedores = isPermisoPaginacionMedioCobrarListadoVendedores;
	}
	
	public Boolean getIsPermisoPaginacionTodoCobrarListadoVendedores() {
		return isPermisoPaginacionTodoCobrarListadoVendedores;
	}

	public void setIsPermisoPaginacionTodoCobrarListadoVendedores(Boolean isPermisoPaginacionTodoCobrarListadoVendedores) {
		this.isPermisoPaginacionTodoCobrarListadoVendedores = isPermisoPaginacionTodoCobrarListadoVendedores;
	}
	
	public Boolean getIsPermisoPaginacionAltoCobrarListadoVendedores() {
		return isPermisoPaginacionAltoCobrarListadoVendedores;
	}

	public void setIsPermisoPaginacionAltoCobrarListadoVendedores(Boolean isPermisoPaginacionAltoCobrarListadoVendedores) {
		this.isPermisoPaginacionAltoCobrarListadoVendedores = isPermisoPaginacionAltoCobrarListadoVendedores;
	}
	
	public Boolean getIsPermisoCopiarCobrarListadoVendedores() {
		return isPermisoCopiarCobrarListadoVendedores;
	}

	public void setIsPermisoCopiarCobrarListadoVendedores(Boolean isPermisoCopiarCobrarListadoVendedores) {
		this.isPermisoCopiarCobrarListadoVendedores = isPermisoCopiarCobrarListadoVendedores;
	}
	
	public Boolean getIsPermisoVerFormCobrarListadoVendedores() {
		return isPermisoVerFormCobrarListadoVendedores;
	}

	public void setIsPermisoVerFormCobrarListadoVendedores(Boolean isPermisoVerFormCobrarListadoVendedores) {
		this.isPermisoVerFormCobrarListadoVendedores = isPermisoVerFormCobrarListadoVendedores;
	}
	
	public Boolean getIsPermisoDuplicarCobrarListadoVendedores() {
		return isPermisoDuplicarCobrarListadoVendedores;
	}

	public void setIsPermisoDuplicarCobrarListadoVendedores(Boolean isPermisoDuplicarCobrarListadoVendedores) {
		this.isPermisoDuplicarCobrarListadoVendedores = isPermisoDuplicarCobrarListadoVendedores;
	}
	
	public Boolean getIsPermisoOrdenCobrarListadoVendedores() {
		return isPermisoOrdenCobrarListadoVendedores;
	}

	public void setIsPermisoOrdenCobrarListadoVendedores(Boolean isPermisoOrdenCobrarListadoVendedores) {
		this.isPermisoOrdenCobrarListadoVendedores = isPermisoOrdenCobrarListadoVendedores;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCobrarListadoVendedores() {
		return isVisibilidadCeldaNuevoCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaNuevoCobrarListadoVendedores(Boolean isVisibilidadCeldaNuevoCobrarListadoVendedores) {
		this.isVisibilidadCeldaNuevoCobrarListadoVendedores = isVisibilidadCeldaNuevoCobrarListadoVendedores;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCobrarListadoVendedores() {
		return isVisibilidadCeldaDuplicarCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaDuplicarCobrarListadoVendedores(Boolean isVisibilidadCeldaDuplicarCobrarListadoVendedores) {
		this.isVisibilidadCeldaDuplicarCobrarListadoVendedores = isVisibilidadCeldaDuplicarCobrarListadoVendedores;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCobrarListadoVendedores() {
		return isVisibilidadCeldaCopiarCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaCopiarCobrarListadoVendedores(Boolean isVisibilidadCeldaCopiarCobrarListadoVendedores) {
		this.isVisibilidadCeldaCopiarCobrarListadoVendedores = isVisibilidadCeldaCopiarCobrarListadoVendedores;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCobrarListadoVendedores() {
		return isVisibilidadCeldaVerFormCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaVerFormCobrarListadoVendedores(Boolean isVisibilidadCeldaVerFormCobrarListadoVendedores) {
		this.isVisibilidadCeldaVerFormCobrarListadoVendedores = isVisibilidadCeldaVerFormCobrarListadoVendedores;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCobrarListadoVendedores() {
		return isVisibilidadCeldaOrdenCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaOrdenCobrarListadoVendedores(Boolean isVisibilidadCeldaOrdenCobrarListadoVendedores) {
		this.isVisibilidadCeldaOrdenCobrarListadoVendedores = isVisibilidadCeldaOrdenCobrarListadoVendedores;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores() {
		return isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores(Boolean isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores) {
		this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores = isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCobrarListadoVendedores() {
		return isVisibilidadCeldaModificarCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaModificarCobrarListadoVendedores(Boolean isVisibilidadCeldaModificarCobrarListadoVendedores) {
		this.isVisibilidadCeldaModificarCobrarListadoVendedores = isVisibilidadCeldaModificarCobrarListadoVendedores;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCobrarListadoVendedores() {
		return isVisibilidadCeldaActualizarCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaActualizarCobrarListadoVendedores(Boolean isVisibilidadCeldaActualizarCobrarListadoVendedores) {
		this.isVisibilidadCeldaActualizarCobrarListadoVendedores = isVisibilidadCeldaActualizarCobrarListadoVendedores;
	}

	public Boolean getIsVisibilidadCeldaEliminarCobrarListadoVendedores() {
		return isVisibilidadCeldaEliminarCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaEliminarCobrarListadoVendedores(Boolean isVisibilidadCeldaEliminarCobrarListadoVendedores) {
		this.isVisibilidadCeldaEliminarCobrarListadoVendedores = isVisibilidadCeldaEliminarCobrarListadoVendedores;
	}

	public Boolean getIsVisibilidadCeldaCancelarCobrarListadoVendedores() {
		return isVisibilidadCeldaCancelarCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaCancelarCobrarListadoVendedores(Boolean isVisibilidadCeldaCancelarCobrarListadoVendedores) {
		this.isVisibilidadCeldaCancelarCobrarListadoVendedores = isVisibilidadCeldaCancelarCobrarListadoVendedores;
	}

	public Boolean getIsVisibilidadCeldaGuardarCobrarListadoVendedores() {
		return isVisibilidadCeldaGuardarCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaGuardarCobrarListadoVendedores(Boolean isVisibilidadCeldaGuardarCobrarListadoVendedores) {
		this.isVisibilidadCeldaGuardarCobrarListadoVendedores = isVisibilidadCeldaGuardarCobrarListadoVendedores;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCobrarListadoVendedores() {
		return isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCobrarListadoVendedores(Boolean isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores) {
		this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores = isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores;
	}
		
	public CobrarListadoVendedoresSessionBean getcobrarlistadovendedoresSessionBean() {
		return this.cobrarlistadovendedoresSessionBean;
	}
	
	public void setcobrarlistadovendedoresSessionBean(CobrarListadoVendedoresSessionBean cobrarlistadovendedoresSessionBean) {
		this.cobrarlistadovendedoresSessionBean=cobrarlistadovendedoresSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaCobrarListadoVendedores() {
		return this.isVisibilidadBusquedaCobrarListadoVendedores;
	}

	public void setisVisibilidadBusquedaCobrarListadoVendedores(Boolean isVisibilidadBusquedaCobrarListadoVendedores) {
		this.isVisibilidadBusquedaCobrarListadoVendedores=isVisibilidadBusquedaCobrarListadoVendedores;
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

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(cobrarlistadovendedores,null);
				this.setActualParaGuardarSucursalForeignKey(cobrarlistadovendedores,null);
				this.setActualParaGuardarVendedorForeignKey(cobrarlistadovendedores,null);
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
	
	public void bugActualizarReferenciaActual(CobrarListadoVendedores cobrarlistadovendedores,CobrarListadoVendedores cobrarlistadovendedoresAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCobrarListadoVendedores(cobrarlistadovendedores);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cobrarlistadovendedoresAux.setId(cobrarlistadovendedores.getId());
		cobrarlistadovendedoresAux.setVersionRow(cobrarlistadovendedores.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(CobrarListadoVendedores cobrarlistadovendedoresLocal) throws Exception {
		
		if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CobrarListadoVendedores cobrarlistadovendedoresLocal) throws Exception {	
		if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cobrarlistadovendedoresLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cobrarlistadovendedoresLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				cobrarlistadovendedoresLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCobrarListadoVendedoresActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cobrarlistadovendedoresValidator.getInvalidValues(this.cobrarlistadovendedores);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CobrarListadoVendedores cobrarlistadovendedores,List<CobrarListadoVendedores> cobrarlistadovendedoress) throws Exception {
	}		
	
	public void actualizarSelectedLista(CobrarListadoVendedores cobrarlistadovendedores,List<CobrarListadoVendedores> cobrarlistadovendedoress) throws Exception {
		try	{			
			CobrarListadoVendedoresConstantesFunciones.actualizarSelectedLista(cobrarlistadovendedores,cobrarlistadovendedoress);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CobrarListadoVendedores> cobrarlistadovendedoressLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cobrarlistadovendedoressLocal=this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cobrarlistadovendedoressLocal=this.cobrarlistadovendedoress;
			}
			//ARCHITECTURE
		
			for(CobrarListadoVendedores cobrarlistadovendedoresLocal:cobrarlistadovendedoressLocal) {
				if(this.permiteMantenimiento(cobrarlistadovendedoresLocal) && cobrarlistadovendedoresLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CobrarListadoVendedoresConstantesFunciones.getCobrarListadoVendedoresLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CobrarListadoVendedoresConstantesFunciones.NOMBREVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelnombre_vendedorCobrarListadoVendedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadoVendedoresConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelcodigoCobrarListadoVendedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadoVendedoresConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelnombreCobrarListadoVendedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadoVendedoresConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelrucCobrarListadoVendedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadoVendedoresConstantesFunciones.DIRECCIONDOMICILIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabeldireccion_domicilioCobrarListadoVendedores,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CobrarListadoVendedoresConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabeltelefonoCobrarListadoVendedores,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelnombre_vendedorCobrarListadoVendedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelcodigoCobrarListadoVendedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelnombreCobrarListadoVendedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelrucCobrarListadoVendedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabeldireccion_domicilioCobrarListadoVendedores,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabeltelefonoCobrarListadoVendedores,"");
		
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
		this.iIdNuevoCobrarListadoVendedores--;	
		
		
		this.cobrarlistadovendedoresAux=new CobrarListadoVendedores();
		
		this.cobrarlistadovendedoresAux.setId(this.iIdNuevoCobrarListadoVendedores);
		this.cobrarlistadovendedoresAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().add(this.cobrarlistadovendedoresAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cobrarlistadovendedoress.add(this.cobrarlistadovendedoresAux);
		}
		//ARCHITECTURE
		
		this.cobrarlistadovendedores=this.cobrarlistadovendedoresAux;
		
		if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCobrarListadoVendedores(this.cobrarlistadovendedores);
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarListadoVendedores(this.cobrarlistadovendedores);
		}
				
		//this.setDefaultControlesCobrarListadoVendedores();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCobrarListadoVendedores();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCobrarListadoVendedores();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarListadoVendedores();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedoresBean,this.cobrarlistadovendedores,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCobrarListadoVendedores(this.cobrarlistadovendedoresReturnGeneral,this.cobrarlistadovendedoresBean,false);
		
		if(this.cobrarlistadovendedoresReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCobrarListadoVendedores(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCobrarListadoVendedores(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores());
		}
		
		if(this.cobrarlistadovendedoresReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCobrarListadoVendedores(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores(),classes);//this.cobrarlistadovendedoresBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCobrarListadoVendedores();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCobrarListadoVendedores();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.RecargarFormCobrarListadoVendedores(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCobrarListadoVendedores(false);
						
			if(cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarListadoVendedores();
			}
			
			this.actualizarVisualTableDatosCobrarListadoVendedores();
			
			this.jTableDatosCobrarListadoVendedores.setRowSelectionInterval(this.getIndiceNuevoCobrarListadoVendedores(), this.getIndiceNuevoCobrarListadoVendedores());
			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
						
			this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCobrarListadoVendedores(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombre_vendedorCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activarnombre_vendedorCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldcodigoCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activarcodigoCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombreCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activarnombreCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldrucCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activarrucCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreadireccion_domicilioCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activardireccion_domicilioCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreatelefonoCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activartelefonoCobrarListadoVendedores);	
		//
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activarid_empresaCobrarListadoVendedores);//
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activarid_sucursalCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setEnabled(isHabilitar && this.cobrarlistadovendedoresConstantesFunciones.activarid_vendedorCobrarListadoVendedores);
	};
	
	public void setDefaultControlesCobrarListadoVendedores() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCobrarListadoVendedores(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cobrarlistadovendedoresSessionBean.setConGuardarRelaciones(true);			
			this.cobrarlistadovendedoresSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.setVisible(true);
			
					
		} else {
			//this.cobrarlistadovendedoresSessionBean.setConGuardarRelaciones(false);			
			this.cobrarlistadovendedoresSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCobrarListadoVendedores() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
				if(cobrarlistadovendedoresAux.getId().equals(this.iIdNuevoCobrarListadoVendedores)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoress) {
				if(cobrarlistadovendedoresAux.getId().equals(this.iIdNuevoCobrarListadoVendedores)) {
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
	
	public int getIndiceActualCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
				if(cobrarlistadovendedoresAux.getId().equals(cobrarlistadovendedores.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoress) {
				if(cobrarlistadovendedoresAux.getId().equals(cobrarlistadovendedores.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedoresOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
				if(cobrarlistadovendedoresAux.getCobrarListadoVendedoresOriginal().getId().equals(cobrarlistadovendedoresOriginal.getId())) {
					existe=true;
					cobrarlistadovendedoresOriginal.setId(cobrarlistadovendedoresAux.getId());
					cobrarlistadovendedoresOriginal.setVersionRow(cobrarlistadovendedoresAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoress) {
				if(cobrarlistadovendedoresAux.getCobrarListadoVendedoresOriginal().getId().equals(cobrarlistadovendedoresOriginal.getId())) {
					existe=true;
					cobrarlistadovendedoresOriginal.setId(cobrarlistadovendedoresAux.getId());
					cobrarlistadovendedoresOriginal.setVersionRow(cobrarlistadovendedoresAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCobrarListadoVendedores(Boolean esParaCancelar) throws Exception {
		cobrarlistadovendedoressAux=new ArrayList<CobrarListadoVendedores>();
		cobrarlistadovendedoresAux=new CobrarListadoVendedores();
		
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
					if(cobrarlistadovendedoresAux.getId()<0) {
						cobrarlistadovendedoressAux.add(cobrarlistadovendedoresAux);
					}		
				}
				this.iIdNuevoCobrarListadoVendedores=0L;
				this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().removeAll(cobrarlistadovendedoressAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoress) {
					if(cobrarlistadovendedoresAux.getId()<0) {
						cobrarlistadovendedoressAux.add(cobrarlistadovendedoresAux);
					}		
				}
				this.iIdNuevoCobrarListadoVendedores=0L;
				this.cobrarlistadovendedoress.removeAll(cobrarlistadovendedoressAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCobrarListadoVendedores 
					&& this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size()>0
					) {
					cobrarlistadovendedoresAux=this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().get(this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size() - 1);
				
					if(cobrarlistadovendedoresAux.getId()<0) {
						this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().remove(cobrarlistadovendedoresAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCobrarListadoVendedores && this.cobrarlistadovendedoress.size()>0) {
					cobrarlistadovendedoresAux=this.cobrarlistadovendedoress.get(this.cobrarlistadovendedoress.size() - 1);
				
					if(cobrarlistadovendedoresAux.getId()<0) {
						this.cobrarlistadovendedoress.remove(cobrarlistadovendedoresAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCobrarListadoVendedores(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cobrarlistadovendedores.getId()<0) {
				this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().remove(this.cobrarlistadovendedores);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cobrarlistadovendedores.getId()<0) {
				this.cobrarlistadovendedoress.remove(this.cobrarlistadovendedores);
			}
		}			
	}
	
	public void setEstadosInicialesCobrarListadoVendedores(List<CobrarListadoVendedores> cobrarlistadovendedoressAux) throws Exception {
		CobrarListadoVendedoresConstantesFunciones.setEstadosInicialesCobrarListadoVendedores(cobrarlistadovendedoressAux);
	}
	
	public void setEstadosInicialesCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedoresAux) throws Exception {
		CobrarListadoVendedoresConstantesFunciones.setEstadosInicialesCobrarListadoVendedores(cobrarlistadovendedoresAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCobrarListadoVendedoresActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCobrarListadoVendedoresActual()) {
				if(!this.isEsNuevoCobrarListadoVendedores) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCobrarListadoVendedores=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCobrarListadoVendedoresActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cobrar Listado Vendedores ?", "MANTENIMIENTO DE Cobrar Listado Vendedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CobrarListadoVendedores cobrarlistadovendedores) throws Exception {
		CobrarListadoVendedoresConstantesFunciones.seleccionarAsignar(this.cobrarlistadovendedores,cobrarlistadovendedores);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCobrarListadoVendedores=this.isPermisoActualizarOriginalCobrarListadoVendedores;
			
			
			this.seleccionarAsignar(cobrarlistadovendedores);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cobrarlistadovendedoresSessionBean.setsFuncionBusquedaRapida(this.cobrarlistadovendedoresSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCobrarListadoVendedores) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCobrarListadoVendedores(esParaCancelar);				
				this.cancelarNuevoCobrarListadoVendedores(esParaCancelar);								
			}
			
			this.cobrarlistadovendedores=new CobrarListadoVendedores();
			
			this.inicializarCobrarListadoVendedores();
			
			this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCobrarListadoVendedores() throws Exception {
		try {
			CobrarListadoVendedoresConstantesFunciones.inicializarCobrarListadoVendedores(this.cobrarlistadovendedores);
			
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
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCobrarListadoVendedoress(String sAccionBusqueda,List<CobrarListadoVendedores> cobrarlistadovendedoressParaReportes) throws Exception {
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
					sPathReporteFinal="CobrarListadoVendedores"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CobrarListadoVendedoresMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CobrarListadoVendedoresMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CobrarListadoVendedores"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cobrar Listado Vendedoreses");		
		parameters.put("busquedapor", CobrarListadoVendedoresConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCobrarListadoVendedores=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CobrarListadoVendedoresConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CobrarListadoVendedoresConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCobrarListadoVendedores=new JRBeanArrayDataSource(CobrarListadoVendedoresJInternalFrame.TraerCobrarListadoVendedoresBeans(cobrarlistadovendedoressParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCobrarListadoVendedores);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CobrarListadoVendedoresConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CobrarListadoVendedoresConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CobrarListadoVendedoresBean.TraerCobrarListadoVendedoresBeans(cobrarlistadovendedoressParaReportes).toArray()));
							
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
				this.generarExcelReporteCobrarListadoVendedoress(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadovendedoressParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCobrarListadoVendedoress(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadovendedoressParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCobrarListadoVendedoresActionPerformed(null);
					//this.generarExcelReporteCobrarListadoVendedoress(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadovendedoressParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCobrarListadoVendedoress(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadovendedoressParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCobrarListadoVendedoress(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadovendedoressParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCobrarListadoVendedoress(sAccionBusqueda,sTipoArchivoReporte,cobrarlistadovendedoressParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCobrarListadoVendedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarListadoVendedores> cobrarlistadovendedoressParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadovendedores";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarListadoVendedoress");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarListadoVendedores("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CobrarListadoVendedores cobrarlistadovendedores : cobrarlistadovendedoressParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CobrarListadoVendedoresConstantesFunciones.generarExcelReporteDataCobrarListadoVendedores("NORMAL",row,workbook,cobrarlistadovendedores,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCobrarListadoVendedores(String sTipo,Row row,Workbook workbook) {
		
		CobrarListadoVendedoresConstantesFunciones.generarExcelReporteHeaderCobrarListadoVendedores(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCobrarListadoVendedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarListadoVendedores> cobrarlistadovendedoressParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadovendedores_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarListadoVendedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CobrarListadoVendedores cobrarlistadovendedores : cobrarlistadovendedoressParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.getCobrarListadoVendedoresDescripcion(cobrarlistadovendedores));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.getnombre_vendedor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.getdireccion_domicilio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cobrarlistadovendedores.gettelefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCobrarListadoVendedoress(String sAccionBusqueda,String sTipoArchivoReporte,List<CobrarListadoVendedores> cobrarlistadovendedoressParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CobrarListadoVendedores> cobrarlistadovendedoressRespaldo=null;
		
		classes=CobrarListadoVendedoresConstantesFunciones.getClassesRelationshipsOfCobrarListadoVendedores(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cobrarlistadovendedoresLogic.setDatosCliente(this.datosCliente);
		this.cobrarlistadovendedoresLogic.setDatosDeep(this.datosDeep);
		this.cobrarlistadovendedoresLogic.setIsConDeep(true);
		
		cobrarlistadovendedoressRespaldo=this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress();
		
		this.cobrarlistadovendedoresLogic.setCobrarListadoVendedoress(cobrarlistadovendedoressParaReportes);	
		this.cobrarlistadovendedoresLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cobrarlistadovendedoressParaReportes=this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress();
		this.cobrarlistadovendedoresLogic.setCobrarListadoVendedoress(cobrarlistadovendedoressRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadovendedores_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CobrarListadoVendedoress");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCobrarListadoVendedores("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CobrarListadoVendedores cobrarlistadovendedores : cobrarlistadovendedoressParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCobrarListadoVendedores("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CobrarListadoVendedoresConstantesFunciones.generarExcelReporteDataCobrarListadoVendedores("NORMAL",row,workbook,cobrarlistadovendedores,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.getCobrarListadoVendedoresDescripcion(cobrarlistadovendedores));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCobrarListadoVendedores() throws Exception {		
		this.startProcessCobrarListadoVendedores(true);
	}
	
	public void startProcessCobrarListadoVendedores(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCobrarListadoVendedores ,this.jPanelParametrosReportesCobrarListadoVendedores, this.jScrollPanelDatosCobrarListadoVendedores,this.jPanelPaginacionCobrarListadoVendedores, this.jScrollPanelDatosEdicionCobrarListadoVendedores, this.jPanelAccionesCobrarListadoVendedores,this.jPanelAccionesFormularioCobrarListadoVendedores,this.jmenuBarCobrarListadoVendedores,this.jmenuBarDetalleCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,this.jTtoolBarDetalleCobrarListadoVendedores);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarListadoVendedores=this.jTabbedPaneBusquedasCobrarListadoVendedores; 
		
		final JPanel jPanelParametrosReportesCobrarListadoVendedores=this.jPanelParametrosReportesCobrarListadoVendedores;
		//final JScrollPane jScrollPanelDatosCobrarListadoVendedores=this.jScrollPanelDatosCobrarListadoVendedores;
		final JTable jTableDatosCobrarListadoVendedores=this.jTableDatosCobrarListadoVendedores;		
		final JPanel jPanelPaginacionCobrarListadoVendedores=this.jPanelPaginacionCobrarListadoVendedores;
		//final JScrollPane jScrollPanelDatosEdicionCobrarListadoVendedores=this.jScrollPanelDatosEdicionCobrarListadoVendedores;
		final JPanel jPanelAccionesCobrarListadoVendedores=this.jPanelAccionesCobrarListadoVendedores;
		
		JPanel jPanelCamposAuxiliarCobrarListadoVendedores=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCobrarListadoVendedores=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			jPanelCamposAuxiliarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelCamposCobrarListadoVendedores;
			jPanelAccionesFormularioAuxiliarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelAccionesFormularioCobrarListadoVendedores;
		}
		
		final JPanel jPanelCamposCobrarListadoVendedores=jPanelCamposAuxiliarCobrarListadoVendedores;
		final JPanel jPanelAccionesFormularioCobrarListadoVendedores=jPanelAccionesFormularioAuxiliarCobrarListadoVendedores;
		
		
		final JMenuBar jmenuBarCobrarListadoVendedores=this.jmenuBarCobrarListadoVendedores;
		final JToolBar jTtoolBarCobrarListadoVendedores=this.jTtoolBarCobrarListadoVendedores;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCobrarListadoVendedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarListadoVendedores=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			jmenuBarDetalleAuxiliarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jmenuBarDetalleCobrarListadoVendedores;
			jTtoolBarDetalleAuxiliarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jTtoolBarDetalleCobrarListadoVendedores;
		}
		
		final JMenuBar jmenuBarDetalleCobrarListadoVendedores=jmenuBarDetalleAuxiliarCobrarListadoVendedores;
		final JToolBar jTtoolBarDetalleCobrarListadoVendedores=jTtoolBarDetalleAuxiliarCobrarListadoVendedores;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarListadoVendedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarListadoVendedores;
			processRunnable.jTableDatos=jTableDatosCobrarListadoVendedores;
			processRunnable.jPanelCampos=jPanelCamposCobrarListadoVendedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarListadoVendedores;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarListadoVendedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarListadoVendedores;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarListadoVendedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarListadoVendedores;
			processRunnable.jTtoolBar=jTtoolBarCobrarListadoVendedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarListadoVendedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarListadoVendedores ,jPanelParametrosReportesCobrarListadoVendedores,jTableDatosCobrarListadoVendedores, /*jScrollPanelDatosCobrarListadoVendedores,*/jPanelCamposCobrarListadoVendedores,jPanelPaginacionCobrarListadoVendedores, /*jScrollPanelDatosEdicionCobrarListadoVendedores,*/ jPanelAccionesCobrarListadoVendedores,jPanelAccionesFormularioCobrarListadoVendedores,jmenuBarCobrarListadoVendedores,jmenuBarDetalleCobrarListadoVendedores,jTtoolBarCobrarListadoVendedores,jTtoolBarDetalleCobrarListadoVendedores);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCobrarListadoVendedores ,jPanelParametrosReportesCobrarListadoVendedores, jScrollPanelDatosCobrarListadoVendedores,jPanelPaginacionCobrarListadoVendedores, jScrollPanelDatosEdicionCobrarListadoVendedores, jPanelAccionesCobrarListadoVendedores,jPanelAccionesFormularioCobrarListadoVendedores,jmenuBarCobrarListadoVendedores,jmenuBarDetalleCobrarListadoVendedores,jTtoolBarCobrarListadoVendedores,jTtoolBarDetalleCobrarListadoVendedores);
						
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
	
	public void finishProcessCobrarListadoVendedores() {// throws Exception 
		this.finishProcessCobrarListadoVendedores(true);
	}
	
	public void finishProcessCobrarListadoVendedores(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCobrarListadoVendedores ,this.jPanelParametrosReportesCobrarListadoVendedores, this.jScrollPanelDatosCobrarListadoVendedores,this.jPanelPaginacionCobrarListadoVendedores, this.jScrollPanelDatosEdicionCobrarListadoVendedores, this.jPanelAccionesCobrarListadoVendedores,this.jPanelAccionesFormularioCobrarListadoVendedores,this.jmenuBarCobrarListadoVendedores,this.jmenuBarDetalleCobrarListadoVendedores,this.jTtoolBarCobrarListadoVendedores,this.jTtoolBarDetalleCobrarListadoVendedores);		
		
		final JTabbedPane jTabbedPaneBusquedasCobrarListadoVendedores=this.jTabbedPaneBusquedasCobrarListadoVendedores; 
		
		final JPanel jPanelParametrosReportesCobrarListadoVendedores=this.jPanelParametrosReportesCobrarListadoVendedores;
		//final JScrollPane jScrollPanelDatosCobrarListadoVendedores=this.jScrollPanelDatosCobrarListadoVendedores;
		final JTable jTableDatosCobrarListadoVendedores=this.jTableDatosCobrarListadoVendedores;		
		final JPanel jPanelPaginacionCobrarListadoVendedores=this.jPanelPaginacionCobrarListadoVendedores;
		//final JScrollPane jScrollPanelDatosEdicionCobrarListadoVendedores=this.jScrollPanelDatosEdicionCobrarListadoVendedores;
		final JPanel jPanelAccionesCobrarListadoVendedores=this.jPanelAccionesCobrarListadoVendedores;
		
		JPanel jPanelCamposAuxiliarCobrarListadoVendedores=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCobrarListadoVendedores=new JPanel();
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			jPanelCamposAuxiliarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelCamposCobrarListadoVendedores;
			jPanelAccionesFormularioAuxiliarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelAccionesFormularioCobrarListadoVendedores;
		}
		
		final JPanel jPanelCamposCobrarListadoVendedores=jPanelCamposAuxiliarCobrarListadoVendedores;
		final JPanel jPanelAccionesFormularioCobrarListadoVendedores=jPanelAccionesFormularioAuxiliarCobrarListadoVendedores;
		
		
		final JMenuBar jmenuBarCobrarListadoVendedores=this.jmenuBarCobrarListadoVendedores;		
		final JToolBar jTtoolBarCobrarListadoVendedores=this.jTtoolBarCobrarListadoVendedores;
				
		JMenuBar jmenuBarDetalleAuxiliarCobrarListadoVendedores=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCobrarListadoVendedores=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			jmenuBarDetalleAuxiliarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jmenuBarDetalleCobrarListadoVendedores;
			jTtoolBarDetalleAuxiliarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jTtoolBarDetalleCobrarListadoVendedores;		
		}
		
		final JMenuBar jmenuBarDetalleCobrarListadoVendedores=jmenuBarDetalleAuxiliarCobrarListadoVendedores;
		final JToolBar jTtoolBarDetalleCobrarListadoVendedores=jTtoolBarDetalleAuxiliarCobrarListadoVendedores;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCobrarListadoVendedores;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCobrarListadoVendedores;
			processRunnable.jTableDatos=jTableDatosCobrarListadoVendedores;
			processRunnable.jPanelCampos=jPanelCamposCobrarListadoVendedores;
			processRunnable.jPanelPaginacion=jPanelPaginacionCobrarListadoVendedores;
			processRunnable.jPanelAcciones=jPanelAccionesCobrarListadoVendedores;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCobrarListadoVendedores;
			
			
			processRunnable.jmenuBar=jmenuBarCobrarListadoVendedores;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCobrarListadoVendedores;
			processRunnable.jTtoolBar=jTtoolBarCobrarListadoVendedores;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCobrarListadoVendedores;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCobrarListadoVendedores ,jPanelParametrosReportesCobrarListadoVendedores, jTableDatosCobrarListadoVendedores,/*jScrollPanelDatosCobrarListadoVendedores,*/jPanelCamposCobrarListadoVendedores,jPanelPaginacionCobrarListadoVendedores, /*jScrollPanelDatosEdicionCobrarListadoVendedores,*/ jPanelAccionesCobrarListadoVendedores,jPanelAccionesFormularioCobrarListadoVendedores,jmenuBarCobrarListadoVendedores,jmenuBarDetalleCobrarListadoVendedores,jTtoolBarCobrarListadoVendedores,jTtoolBarDetalleCobrarListadoVendedores));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCobrarListadoVendedores(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCobrarListadoVendedores(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCobrarListadoVendedores(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCobrarListadoVendedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCobrarListadoVendedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCobrarListadoVendedores,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCobrarListadoVendedores(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCobrarListadoVendedores,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCobrarListadoVendedores,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cobrarlistadovendedoresConstantesFunciones.getsFinalQueryCobrarListadoVendedores();
		String  finalQueryPaginacionTodos=this.cobrarlistadovendedoresConstantesFunciones.getsFinalQueryCobrarListadoVendedores();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CobrarListadoVendedoresConstantesFunciones.getArrayColumnasGlobalesNoCobrarListadoVendedores(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CobrarListadoVendedoresConstantesFunciones.getArrayColumnasGlobalesCobrarListadoVendedores(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CobrarListadoVendedoresConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cobrarlistadovendedoressEliminados= new ArrayList<CobrarListadoVendedores>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCobrarListadoVendedores();
		
				///*CobrarListadoVendedoresSessionBean*/this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean();
			
			if(this.cobrarlistadovendedoresSessionBean==null) {
				this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean();
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
					this.iNumeroPaginacion=CobrarListadoVendedoresConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CobrarListadoVendedoresConstantesFunciones.getClassesForeignKeysOfCobrarListadoVendedores(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cobrarlistadovendedores."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cobrarlistadovendedoressAux= new ArrayList<CobrarListadoVendedores>();
			
				
			cobrarlistadovendedoresLogic.setDatosCliente(this.datosCliente);
			cobrarlistadovendedoresLogic.setDatosDeep(this.datosDeep);
			cobrarlistadovendedoresLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaCobrarListadoVendedores")) {
				this.sDetalleReporte=CobrarListadoVendedoresConstantesFunciones.getDetalleIndiceBusquedaCobrarListadoVendedores(id_vendedorBusquedaCobrarListadoVendedores);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cobrarlistadovendedoresLogic.getCobrarListadoVendedoressBusquedaCobrarListadoVendedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_vendedorBusquedaCobrarListadoVendedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarListadoVendedoresConstantesFunciones.getDetalleIndiceBusquedaCobrarListadoVendedores(id_vendedorBusquedaCobrarListadoVendedores);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarListadoVendedoresConstantesFunciones.getDetalleIndiceBusquedaCobrarListadoVendedores(id_vendedorBusquedaCobrarListadoVendedores);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()==null||cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cobrarlistadovendedoress==null|| cobrarlistadovendedoress.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarlistadovendedoressAux=new ArrayList<CobrarListadoVendedores>();
						cobrarlistadovendedoressAux.addAll(cobrarlistadovendedoresLogic.getCobrarListadoVendedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarlistadovendedoressAux=new ArrayList<CobrarListadoVendedores>();
							cobrarlistadovendedoressAux.addAll(cobrarlistadovendedoress);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cobrarlistadovendedoresLogic.getCobrarListadoVendedoressBusquedaCobrarListadoVendedores(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_vendedorBusquedaCobrarListadoVendedores);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CobrarListadoVendedoresConstantesFunciones.getDetalleIndiceBusquedaCobrarListadoVendedores(id_vendedorBusquedaCobrarListadoVendedores);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CobrarListadoVendedoresConstantesFunciones.getDetalleIndiceBusquedaCobrarListadoVendedores(id_vendedorBusquedaCobrarListadoVendedores);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCobrarListadoVendedoress("BusquedaCobrarListadoVendedores",cobrarlistadovendedoresLogic.getCobrarListadoVendedoress());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCobrarListadoVendedoress("BusquedaCobrarListadoVendedores",cobrarlistadovendedoress);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarlistadovendedoresLogic.setCobrarListadoVendedoress(new ArrayList<CobrarListadoVendedores>());
						cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().addAll(cobrarlistadovendedoressAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarlistadovendedoress=new ArrayList<CobrarListadoVendedores>();
							cobrarlistadovendedoress.addAll(cobrarlistadovendedoressAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCobrarListadoVendedores();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCobrarListadoVendedores();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarlistadovendedoress.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cobrarlistadovendedoress.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CobrarListadoVendedores cobrarlistadovendedores) {
		Boolean permite=true;
		
		if(this.cobrarlistadovendedores.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CobrarListadoVendedoresConstantesFunciones.getOrderByListaCobrarListadoVendedores();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CobrarListadoVendedoresConstantesFunciones.getOrderByListaCobrarListadoVendedores();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
				if(cobrarlistadovendedores.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarlistadovendedoresTotales=cobrarlistadovendedores;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadoVendedores cobrarlistadovendedores:this.cobrarlistadovendedoress) {
				if(cobrarlistadovendedores.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarlistadovendedoresTotales=cobrarlistadovendedores;
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
			this.cobrarlistadovendedoresAux=new CobrarListadoVendedores();
			this.cobrarlistadovendedoresAux.setsType(Constantes2.S_TOTALES);
			this.cobrarlistadovendedoresAux.setIsNew(false);
			this.cobrarlistadovendedoresAux.setIsChanged(false);
			this.cobrarlistadovendedoresAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//CobrarListadoVendedoresConstantesFunciones.TotalizarValoresFilaCobrarListadoVendedores(this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress(),this.cobrarlistadovendedoresAux);
				
				//this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().add(this.cobrarlistadovendedoresAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CobrarListadoVendedoresConstantesFunciones.TotalizarValoresFilaCobrarListadoVendedores(this.cobrarlistadovendedoress,this.cobrarlistadovendedoresAux);
				
				this.cobrarlistadovendedoress.add(this.cobrarlistadovendedoresAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cobrarlistadovendedoresTotales=new CobrarListadoVendedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().remove(cobrarlistadovendedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cobrarlistadovendedoress.remove(cobrarlistadovendedoresTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cobrarlistadovendedoresTotales=new CobrarListadoVendedores();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
				if(cobrarlistadovendedores.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarlistadovendedoresTotales=cobrarlistadovendedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarListadoVendedoresConstantesFunciones.TotalizarValoresFilaCobrarListadoVendedores(this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress(),cobrarlistadovendedoresTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CobrarListadoVendedores cobrarlistadovendedores:this.cobrarlistadovendedoress) {
				if(cobrarlistadovendedores.getsType().equals(Constantes2.S_TOTALES)) {
					cobrarlistadovendedoresTotales=cobrarlistadovendedores;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CobrarListadoVendedoresConstantesFunciones.TotalizarValoresFilaCobrarListadoVendedores(this.cobrarlistadovendedoress,cobrarlistadovendedoresTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCobrarListadoVendedoressBusquedaCobrarListadoVendedores()throws Exception {
		try {
			sAccionBusqueda="BusquedaCobrarListadoVendedores";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarListadoVendedoressFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarListadoVendedoressFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCobrarListadoVendedoressFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCobrarListadoVendedoressBusquedaCobrarListadoVendedores(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarlistadovendedoresLogic.getCobrarListadoVendedoressBusquedaCobrarListadoVendedores(sFinalQuery,this.pagination,id_vendedor);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarListadoVendedoressFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarlistadovendedoresLogic.getCobrarListadoVendedoressFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarListadoVendedoressFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarlistadovendedoresLogic.getCobrarListadoVendedoressFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCobrarListadoVendedoressFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cobrarlistadovendedoresLogic.getCobrarListadoVendedoressFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosCobrarListadoVendedores() {
		this.isPermisoTodoCobrarListadoVendedores=false;
		this.isPermisoNuevoCobrarListadoVendedores=false;
		this.isPermisoActualizarCobrarListadoVendedores=false;
		this.isPermisoActualizarOriginalCobrarListadoVendedores=false;
		this.isPermisoEliminarCobrarListadoVendedores=false;
		this.isPermisoGuardarCambiosCobrarListadoVendedores=false;
		this.isPermisoConsultaCobrarListadoVendedores=true;
		this.isPermisoBusquedaCobrarListadoVendedores=true;
		this.isPermisoReporteCobrarListadoVendedores=true;
		this.isPermisoOrdenCobrarListadoVendedores=false;		
		this.isPermisoPaginacionMedioCobrarListadoVendedores=false;		
		this.isPermisoPaginacionAltoCobrarListadoVendedores=false;		
		this.isPermisoPaginacionTodoCobrarListadoVendedores=false;		
		this.isPermisoCopiarCobrarListadoVendedores=false;		
		this.isPermisoVerFormCobrarListadoVendedores=false;		
		this.isPermisoDuplicarCobrarListadoVendedores=false;
		this.isPermisoOrdenCobrarListadoVendedores=false;
	}
	
	public void setPermisosUsuarioCobrarListadoVendedores(Boolean isPermiso) {
		this.isPermisoTodoCobrarListadoVendedores=isPermiso;
		this.isPermisoNuevoCobrarListadoVendedores=isPermiso;
		this.isPermisoActualizarCobrarListadoVendedores=isPermiso;
		this.isPermisoActualizarOriginalCobrarListadoVendedores=isPermiso;
		this.isPermisoEliminarCobrarListadoVendedores=isPermiso;
		this.isPermisoGuardarCambiosCobrarListadoVendedores=isPermiso;
		this.isPermisoConsultaCobrarListadoVendedores=isPermiso;
		this.isPermisoBusquedaCobrarListadoVendedores=isPermiso;
		this.isPermisoReporteCobrarListadoVendedores=isPermiso;
		this.isPermisoOrdenCobrarListadoVendedores=isPermiso;		
		this.isPermisoPaginacionMedioCobrarListadoVendedores=isPermiso;		
		this.isPermisoPaginacionAltoCobrarListadoVendedores=isPermiso;		
		this.isPermisoPaginacionTodoCobrarListadoVendedores=isPermiso;		
		this.isPermisoCopiarCobrarListadoVendedores=isPermiso;		
		this.isPermisoVerFormCobrarListadoVendedores=isPermiso;		
		this.isPermisoDuplicarCobrarListadoVendedores=isPermiso;
		this.isPermisoOrdenCobrarListadoVendedores=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCobrarListadoVendedores(Boolean isPermiso) {
		//this.isPermisoTodoCobrarListadoVendedores=isPermiso;
		this.isPermisoNuevoCobrarListadoVendedores=isPermiso;
		this.isPermisoActualizarCobrarListadoVendedores=isPermiso;
		this.isPermisoActualizarOriginalCobrarListadoVendedores=isPermiso;
		this.isPermisoEliminarCobrarListadoVendedores=isPermiso;
		this.isPermisoGuardarCambiosCobrarListadoVendedores=isPermiso;
		//this.isPermisoConsultaCobrarListadoVendedores=isPermiso;
		//this.isPermisoBusquedaCobrarListadoVendedores=isPermiso;
		//this.isPermisoReporteCobrarListadoVendedores=isPermiso;
		//this.isPermisoOrdenCobrarListadoVendedores=isPermiso;		
		//this.isPermisoPaginacionMedioCobrarListadoVendedores=isPermiso;		
		//this.isPermisoPaginacionAltoCobrarListadoVendedores=isPermiso;		
		//this.isPermisoPaginacionTodoCobrarListadoVendedores=isPermiso;		
		//this.isPermisoCopiarCobrarListadoVendedores=isPermiso;		
		//this.isPermisoDuplicarCobrarListadoVendedores=isPermiso;
		//this.isPermisoOrdenCobrarListadoVendedores=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCobrarListadoVendedoresClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CobrarListadoVendedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCobrarListadoVendedores(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCobrarListadoVendedoresClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCobrarListadoVendedoresClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCobrarListadoVendedoresClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCobrarListadoVendedoresClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCobrarListadoVendedores() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CobrarListadoVendedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CobrarListadoVendedoresConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCobrarListadoVendedores=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCobrarListadoVendedores=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCobrarListadoVendedores=this.isPermisoActualizarCobrarListadoVendedores;
			this.isPermisoEliminarCobrarListadoVendedores=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCobrarListadoVendedores=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCobrarListadoVendedores=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCobrarListadoVendedores=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCobrarListadoVendedores=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCobrarListadoVendedores=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarListadoVendedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCobrarListadoVendedores=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCobrarListadoVendedores=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCobrarListadoVendedores=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCobrarListadoVendedores=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCobrarListadoVendedores=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCobrarListadoVendedores=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCobrarListadoVendedores=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCobrarListadoVendedores.setToolTipText(this.jTableDatosCobrarListadoVendedores.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCobrarListadoVendedores(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCobrarListadoVendedores(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CobrarListadoVendedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CobrarListadoVendedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCobrarListadoVendedores() throws Exception {
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
	public void inicializarCombosForeignKeyCobrarListadoVendedoresListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCobrarListadoVendedoresListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CobrarListadoVendedoresJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyCobrarListadoVendedores()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyVendedor();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.cobrarlistadovendedoresSessionBean==null) {
				this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean();
			}

			if(!this.cobrarlistadovendedoresSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cobrarlistadovendedoresSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.cobrarlistadovendedoresSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCobrarListadoVendedores()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCobrarListadoVendedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCobrarListadoVendedores()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarListadoVendedores();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCobrarListadoVendedores()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCobrarListadoVendedores()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCobrarListadoVendedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCobrarListadoVendedores()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCobrarListadoVendedores()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCobrarListadoVendedores()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCobrarListadoVendedores(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCobrarListadoVendedores()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.getItemCount()>0) {
				this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public CobrarListadoVendedoresBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CobrarListadoVendedoresBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CobrarListadoVendedoresBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cobrarlistadovendedoresSessionBean=new CobrarListadoVendedoresSessionBean(); 
		this.cobrarlistadovendedoresConstantesFunciones=new CobrarListadoVendedoresConstantesFunciones(); 
		this.cobrarlistadovendedoresBean=new CobrarListadoVendedores();//(this.cobrarlistadovendedoresConstantesFunciones); 		
		this.cobrarlistadovendedoresReturnGeneral=new CobrarListadoVendedoresParameterReturnGeneral(); 
		
		this.cobrarlistadovendedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cobrarlistadovendedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CobrarListadoVendedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CobrarListadoVendedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CobrarListadoVendedoresBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCobrarListadoVendedores(true);
			
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
			
			this.cobrarlistadovendedoresConstantesFunciones=new CobrarListadoVendedoresConstantesFunciones(); 
			this.cobrarlistadovendedoresBean=new CobrarListadoVendedores();//this.cobrarlistadovendedoresConstantesFunciones); 			
			this.cobrarlistadovendedoresReturnGeneral=new CobrarListadoVendedoresParameterReturnGeneral(); 
		
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cobrar Listado Vendedores Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.cobrarlistadovendedores=new CobrarListadoVendedores();
			this.cobrarlistadovendedoress = new ArrayList<CobrarListadoVendedores>();
			this.cobrarlistadovendedoressAux = new ArrayList<CobrarListadoVendedores>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic=new CobrarListadoVendedoresLogic();
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.cobrarlistadovendedoresSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cobrarlistadovendedoresSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCobrarListadoVendedores);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarListadoVendedores);	
					}
					
					if(this.jInternalFrameImportacionCobrarListadoVendedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarListadoVendedores);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCobrarListadoVendedores!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCobrarListadoVendedores);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarListadoVendedores);
				this.jInternalFrameDetalleFormCobrarListadoVendedores.setVisible(false);
				this.jInternalFrameDetalleFormCobrarListadoVendedores.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarListadoVendedores);
					this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setVisible(false);
					this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCobrarListadoVendedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCobrarListadoVendedores);
					this.jInternalFrameImportacionCobrarListadoVendedores.setVisible(false);
					this.jInternalFrameImportacionCobrarListadoVendedores.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCobrarListadoVendedores!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCobrarListadoVendedores);
					this.jInternalFrameOrderByCobrarListadoVendedores.setVisible(false);
					this.jInternalFrameOrderByCobrarListadoVendedores.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCobrarListadoVendedoresActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CobrarListadoVendedoresConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cobrarlistadovendedoresReturnGeneral=new CobrarListadoVendedoresParameterReturnGeneral();
			
			this.cobrarlistadovendedoresParameterGeneral=new CobrarListadoVendedoresParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cobrarlistadovendedoresLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CobrarListadoVendedoresJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarListadoVendedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado(),this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CobrarListadoVendedoresConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado(),this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
			this.isVisibilidadCeldaDuplicarCobrarListadoVendedores=true;
			this.isVisibilidadCeldaCopiarCobrarListadoVendedores=true;
			this.isVisibilidadCeldaVerFormCobrarListadoVendedores=true;
			this.isVisibilidadCeldaOrdenCobrarListadoVendedores=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;
			
			
			this.isVisibilidadBusquedaCobrarListadoVendedores=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCobrarListadoVendedores();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCobrarListadoVendedores(false);
			
			this.setPermisosUsuarioCobrarListadoVendedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() 
				|| (this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado() && this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCobrarListadoVendedoresClasesRelacionadas();
			}
			
			if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCobrarListadoVendedoresClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCobrarListadoVendedores();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCobrarListadoVendedores();
			}
			
			if(!this.isPermisoBusquedaCobrarListadoVendedores) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CobrarListadoVendedoresConstantesFunciones.getTiposSeleccionarCobrarListadoVendedores());
				
				this.tiposColumnasSelect=CobrarListadoVendedoresConstantesFunciones.getTiposSeleccionarCobrarListadoVendedores(true);
				
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
			//if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCobrarListadoVendedores();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,false);
				this.setAccionesUsuarioCobrarListadoVendedores(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,false);							
				this.setAccionesUsuarioCobrarListadoVendedores(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarListadoVendedores() ;
			
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
			this.vendedorLogic=new VendedorLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cobrarlistadovendedoresImplementable= (CobrarListadoVendedoresImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarListadoVendedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cobrarlistadovendedoresImplementableHome= (CobrarListadoVendedoresImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CobrarListadoVendedoresConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cobrarlistadovendedoress= new ArrayList<CobrarListadoVendedores>();
			this.cobrarlistadovendedoressEliminados= new ArrayList<CobrarListadoVendedores>();
						
			this.isEsNuevoCobrarListadoVendedores=false;
			this.esParaAccionDesdeFormularioCobrarListadoVendedores=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCobrarListadoVendedores(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCobrarListadoVendedores();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CobrarListadoVendedoresConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCobrarListadoVendedores(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCobrarListadoVendedores();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCobrarListadoVendedores();
			}
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCobrarListadoVendedores.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCobrarListadoVendedores.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCobrarListadoVendedores.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCobrarListadoVendedores(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CobrarListadoVendedores: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCobrarListadoVendedores() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCobrarListadoVendedores")) {
				iIndex=this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCobrarListadoVendedores();	
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
	
	public void cargarCombosForeignKeyCobrarListadoVendedores(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCobrarListadoVendedores(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCobrarListadoVendedores(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCobrarListadoVendedoresListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCobrarListadoVendedores();
		
		this.cargarCombosFrameForeignKeyCobrarListadoVendedores();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCobrarListadoVendedores();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCobrarListadoVendedores();
		}
	}
	
	

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCobrarListadoVendedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
			
			if(jTableDatosCobrarListadoVendedores.getRowCount()>=1) {
				jTableDatosCobrarListadoVendedores.removeRowSelectionInterval(0, jTableDatosCobrarListadoVendedores.getRowCount()-1);						
			}
			
			this.isEsNuevoCobrarListadoVendedores=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCobrarListadoVendedores(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCobrarListadoVendedores(true);			
			//this.cobrarlistadovendedores=new CobrarListadoVendedores();
			//this.cobrarlistadovendedores.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarListadoVendedores(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores() ;
			
			if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarListadoVendedores(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cobrarlistadovendedores);	
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);				
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
			if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CobrarListadoVendedores: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCobrarListadoVendedoresActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCobrarListadoVendedores.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCobrarListadoVendedores.getSelectedRows().length;			
			}
			
			cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCobrarListadoVendedores--;			
				//CobrarListadoVendedores cobrarlistadovendedoresAux= new CobrarListadoVendedores();			
				//cobrarlistadovendedoresAux.setId(this.iIdNuevoCobrarListadoVendedores);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CobrarListadoVendedores cobrarlistadovendedoresOrigen=new CobrarListadoVendedores();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CobrarListadoVendedores cobrarlistadovendedoresOrigen : cobrarlistadovendedoressSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cobrarlistadovendedoresOrigen =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cobrarlistadovendedoresOrigen =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCobrarListadoVendedores();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cobrarlistadovendedores.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCobrarListadoVendedores(cobrarlistadovendedoresOrigen,this.cobrarlistadovendedores,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().add(this.cobrarlistadovendedoresAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedoress.add(this.cobrarlistadovendedoresAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
				
				this.jTableDatosCobrarListadoVendedores.setRowSelectionInterval(this.getIndiceNuevoCobrarListadoVendedores(), this.getIndiceNuevoCobrarListadoVendedores());
				
				int iLastRow =  this.jTableDatosCobrarListadoVendedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarListadoVendedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarListadoVendedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();									
		
			CobrarListadoVendedores cobrarlistadovendedoresOrigen=new CobrarListadoVendedores();
			CobrarListadoVendedores cobrarlistadovendedoresDestino=new CobrarListadoVendedores();
				
			cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCobrarListadoVendedores.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cobrarlistadovendedoressSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCobrarListadoVendedores.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarlistadovendedoresOrigen =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarlistadovendedoresOrigen =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cobrarlistadovendedoresDestino =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cobrarlistadovendedoresDestino =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cobrarlistadovendedoresOrigen =cobrarlistadovendedoressSeleccionados.get(0);
				cobrarlistadovendedoresDestino =cobrarlistadovendedoressSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCobrarListadoVendedores(cobrarlistadovendedoresOrigen,cobrarlistadovendedoresDestino,true,false);
				
				cobrarlistadovendedoresDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cobrarlistadovendedoresDestino,cobrarlistadovendedoresLogic.getCobrarListadoVendedoress());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cobrarlistadovendedoresDestino,cobrarlistadovendedoress);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
				
				//this.jTableDatosCobrarListadoVendedores.setRowSelectionInterval(this.getIndiceNuevoCobrarListadoVendedores(), this.getIndiceNuevoCobrarListadoVendedores());
				
				int iLastRow =  this.jTableDatosCobrarListadoVendedores.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCobrarListadoVendedores.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCobrarListadoVendedores.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCobrarListadoVendedores.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCobrarListadoVendedores.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(!isVisible);
			this.jPanelPaginacionCobrarListadoVendedores.setVisible(!isVisible);
			this.jPanelAccionesCobrarListadoVendedores.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCobrarListadoVendedores();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCobrarListadoVendedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCobrarListadoVendedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCobrarListadoVendedores();
			
			this.abrirFrameOrderByCobrarListadoVendedores();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCobrarListadoVendedores();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCobrarListadoVendedores(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarListadoVendedores);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCobrarListadoVendedores.isMaximum()) {
					this.jInternalFrameDetalleFormCobrarListadoVendedores.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCobrarListadoVendedores.setSize(this.jInternalFrameDetalleFormCobrarListadoVendedores.iWidthFormulario,this.jInternalFrameDetalleFormCobrarListadoVendedores.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCobrarListadoVendedores.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCobrarListadoVendedores.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCobrarListadoVendedores.isMaximum()) {
						this.jInternalFrameDetalleFormCobrarListadoVendedores.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCobrarListadoVendedores.jContentPaneDetalleCobrarListadoVendedores.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCobrarListadoVendedores.jContentPaneDetalleCobrarListadoVendedores.getWidth(),CobrarListadoVendedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCobrarListadoVendedores.jContentPaneDetalleCobrarListadoVendedores.getWidth(),CobrarListadoVendedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCobrarListadoVendedores.jContentPaneDetalleCobrarListadoVendedores.getWidth(),CobrarListadoVendedoresConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCobrarListadoVendedores.setVisible(true);
	        this.jInternalFrameDetalleFormCobrarListadoVendedores.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCobrarListadoVendedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCobrarListadoVendedores==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCobrarListadoVendedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarListadoVendedores,false,this);
				} else {
					this.jInternalFrameOrderByCobrarListadoVendedores=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCobrarListadoVendedores,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCobrarListadoVendedores);
				this.jInternalFrameOrderByCobrarListadoVendedores.setVisible(false);
				this.jInternalFrameOrderByCobrarListadoVendedores.setSelected(false);
				
				this.jInternalFrameOrderByCobrarListadoVendedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarListadoVendedores"));
				
				this.inicializarActualizarBindingTablaOrderByCobrarListadoVendedores();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCobrarListadoVendedores() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCobrarListadoVendedores==null) {
				
				this.jInternalFrameImportacionCobrarListadoVendedores=new ImportacionJInternalFrame(CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCobrarListadoVendedores);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCobrarListadoVendedores);
				this.jInternalFrameImportacionCobrarListadoVendedores.setVisible(false);
				this.jInternalFrameImportacionCobrarListadoVendedores.setSelected(false);


				this.jInternalFrameImportacionCobrarListadoVendedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarListadoVendedores"));
				this.jInternalFrameImportacionCobrarListadoVendedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarListadoVendedores"));
				this.jInternalFrameImportacionCobrarListadoVendedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarListadoVendedores"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCobrarListadoVendedores() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores==null) {
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores=new ReporteDinamicoJInternalFrame(CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCobrarListadoVendedores);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCobrarListadoVendedores);
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setVisible(false);
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarListadoVendedores"));
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarListadoVendedores"));
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarListadoVendedores"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarListadoVendedores();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCobrarListadoVendedores() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCobrarListadoVendedores);
			
	       	this.jInternalFrameDetalleFormCobrarListadoVendedores.setVisible(false);
	        this.jInternalFrameDetalleFormCobrarListadoVendedores.setSelected(false);
			
			//this.jInternalFrameDetalleFormCobrarListadoVendedores.dispose();
			//this.jInternalFrameDetalleFormCobrarListadoVendedores=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCobrarListadoVendedores() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setVisible(true);
	        this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCobrarListadoVendedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCobrarListadoVendedores.setVisible(true);
	        this.jInternalFrameImportacionCobrarListadoVendedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCobrarListadoVendedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCobrarListadoVendedores.setVisible(true);
	        this.jInternalFrameOrderByCobrarListadoVendedores.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCobrarListadoVendedores() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCobrarListadoVendedores.setVisible(false);
	        this.jInternalFrameOrderByCobrarListadoVendedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCobrarListadoVendedores() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setVisible(false);
	        this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCobrarListadoVendedores() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCobrarListadoVendedores.setVisible(false);
	        this.jInternalFrameImportacionCobrarListadoVendedores.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCobrarListadoVendedores(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCobrarListadoVendedores(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCobrarListadoVendedores(true);
			//this.isEsNuevoCobrarListadoVendedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarListadoVendedores(false) ;
			
			if(cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarListadoVendedores(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCobrarListadoVendedoresActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCobrarListadoVendedores(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCobrarListadoVendedores(true);
			//this.isEsNuevoCobrarListadoVendedores=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cobrarlistadovendedores.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCobrarListadoVendedores(false) ;
			
			if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCobrarListadoVendedores(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCobrarListadoVendedores.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCobrarListadoVendedores(false);
			
			//if(!this.isEsNuevoCobrarListadoVendedores) {								
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				
			}
			
			if(this.permiteMantenimiento(this.cobrarlistadovendedores)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCobrarListadoVendedores=true;
					this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
					this.isEsNuevoCobrarListadoVendedores=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCobrarListadoVendedores=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCobrarListadoVendedores=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarListadoVendedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores(false);
				
				this.habilitarDeshabilitarControlesCobrarListadoVendedores(false);
			
												
				
				if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCobrarListadoVendedores();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,cobrarlistadovendedoresSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCobrarListadoVendedores(this.cobrarlistadovendedores,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCobrarListadoVendedores.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cobrarlistadovendedoresSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cobrarlistadovendedores.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				this.cobrarlistadovendedores.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				this.cobrarlistadovendedores.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cobrarlistadovendedores)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CobrarListadoVendedoresModel) this.jTableDatosCobrarListadoVendedores.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCobrarListadoVendedores=true;
				this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
				this.isEsNuevoCobrarListadoVendedores=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCobrarListadoVendedores(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores(false);
				
				this.habilitarDeshabilitarControlesCobrarListadoVendedores(false);
				
				
				
				if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCobrarListadoVendedores();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCobrarListadoVendedores.getRowCount()>=1) {
				jTableDatosCobrarListadoVendedores.removeRowSelectionInterval(0, jTableDatosCobrarListadoVendedores.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCobrarListadoVendedores(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCobrarListadoVendedores(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores(false) ;
			
			this.isEsNuevoCobrarListadoVendedores=false;
			
			if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCobrarListadoVendedores();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCobrarListadoVendedores(false);
				
				//SI ES MANUAL
				if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCobrarListadoVendedores();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCobrarListadoVendedores--;			
			//CobrarListadoVendedores cobrarlistadovendedoresAux= new CobrarListadoVendedores();			
			//cobrarlistadovendedoresAux.setId(this.iIdNuevoCobrarListadoVendedores);
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCobrarListadoVendedores();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
			
			this.cobrarlistadovendedores.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().add(this.cobrarlistadovendedoresAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cobrarlistadovendedoress.add(this.cobrarlistadovendedoresAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
			
			this.jTableDatosCobrarListadoVendedores.setRowSelectionInterval(this.getIndiceNuevoCobrarListadoVendedores(), this.getIndiceNuevoCobrarListadoVendedores());
			
			int iLastRow =  this.jTableDatosCobrarListadoVendedores.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCobrarListadoVendedores.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCobrarListadoVendedores.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarListadoVendedores(false);
			
			//SI ES MANUAL
			if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarListadoVendedores();
			}
			
			//this.abrirFrameTreeCobrarListadoVendedores();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCobrarListadoVendedores.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCobrarListadoVendedores.setFileImportacion(this.jInternalFrameImportacionCobrarListadoVendedores.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCobrarListadoVendedores.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCobrarListadoVendedores.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCobrarListadoVendedores.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCobrarListadoVendedores.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		

		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CobrarListadoVendedoresBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CobrarListadoVendedoresBaseDesign.jrxml";
			
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
			
			this.generarReporteCobrarListadoVendedoress("Todos",cobrarlistadovendedoressSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreVendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreVendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreVendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreVendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionDomicilio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionDomicilio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionDomicilio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionDomicilio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoria="nombre_vendedor";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO:
					sNombreCampoCategoria="direccion_domicilio";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR:
					sNombreCampoCategoriaValor="nombre_vendedor";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO:
					sNombreCampoCategoriaValor="direccion_domicilio";
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_vendedor");
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Domicilio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_domicilio");
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadovendedores";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CobrarListadoVendedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.getnombre_vendedor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_RUC);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.getdireccion_domicilio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(CobrarListadoVendedores cobrarlistadovendedores:cobrarlistadovendedoressSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cobrarlistadovendedores.gettelefono());
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
			//	this.getFilaCabeceraExportarExcelCobrarListadoVendedores(row);				
			//	iRow++;
			//}				
			
			//for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoressSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCobrarListadoVendedores(cobrarlistadovendedoresAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
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
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarListadoVendedores(false);
			
			//SI ES MANUAL
			if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCobrarListadoVendedores();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarListadoVendedores(false);
			
			//SI ES MANUAL
			if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarListadoVendedores();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCobrarListadoVendedores(false);
			
			//SI ES MANUAL
			if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCobrarListadoVendedores();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCobrarListadoVendedores() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCobrarListadoVendedores.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCobrarListadoVendedores.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCobrarListadoVendedores.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCobrarListadoVendedores.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCobrarListadoVendedores.setMinimumSize(dimensionMinimum);
		this.jTableDatosCobrarListadoVendedores.setMaximumSize(dimensionMaximum);
		this.jTableDatosCobrarListadoVendedores.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCobrarListadoVendedores(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCobrarListadoVendedores(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCobrarListadoVendedores(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCobrarListadoVendedores(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCobrarListadoVendedores(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCobrarListadoVendedores(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarListadoVendedores(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCobrarListadoVendedores(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCobrarListadoVendedores() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCobrarListadoVendedores();
		
		this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarListadoVendedores();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCobrarListadoVendedores() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarListadoVendedores(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarListadoVendedores(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCobrarListadoVendedores.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCobrarListadoVendedores.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCobrarListadoVendedores.jCheckBoxPostAccionNuevoCobrarListadoVendedores.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCobrarListadoVendedores.jCheckBoxPostAccionSinCerrarCobrarListadoVendedores.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCobrarListadoVendedores.jCheckBoxPostAccionSinMensajeCobrarListadoVendedores.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCobrarListadoVendedores.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCobrarListadoVendedores.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
				this.jInternalFrameDetalleFormCobrarListadoVendedores.jCheckBoxPostAccionNuevoCobrarListadoVendedores.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCobrarListadoVendedores.jCheckBoxPostAccionSinCerrarCobrarListadoVendedores.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCobrarListadoVendedores.jCheckBoxPostAccionSinMensajeCobrarListadoVendedores.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCobrarListadoVendedores.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCobrarListadoVendedores.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCobrarListadoVendedores.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCobrarListadoVendedores.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCobrarListadoVendedores.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCobrarListadoVendedores.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCobrarListadoVendedores.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCobrarListadoVendedores.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCobrarListadoVendedores(Boolean esInicializar) throws Exception {
		try	{	
			if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCobrarListadoVendedores(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCobrarListadoVendedores() throws Exception {
		try	{
			if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarListadoVendedores();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarListadoVendedores() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCobrarListadoVendedores() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCobrarListadoVendedores.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCobrarListadoVendedores.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCobrarListadoVendedores.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCobrarListadoVendedores.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCobrarListadoVendedores.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCobrarListadoVendedores.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCobrarListadoVendedores.addItem(reporte);
			}
			
			
			if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCobrarListadoVendedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCobrarListadoVendedores.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCobrarListadoVendedores.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCobrarListadoVendedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCobrarListadoVendedores.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCobrarListadoVendedores.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCobrarListadoVendedores.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCobrarListadoVendedores.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCobrarListadoVendedores.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarListadoVendedores();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCobrarListadoVendedores() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
				
				if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCobrarListadoVendedores()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.getSelectedItem()!=null){this.id_vendedorBusquedaCobrarListadoVendedores=((Vendedor)this.jComboBoxid_vendedorBusquedaCobrarListadoVendedoresCobrarListadoVendedores.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCobrarListadoVendedores(Boolean esInicializar) throws Exception {				
		if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCobrarListadoVendedores();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCobrarListadoVendedores() throws Exception {
		this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCobrarListadoVendedores() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCobrarListadoVendedoresOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedoresOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCobrarListadoVendedores(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cobrarlistadovendedoress.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCobrarListadoVendedores.setModel(new CobrarListadoVendedoresModel(this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCobrarListadoVendedores.setModel(new CobrarListadoVendedoresModel(this.cobrarlistadovendedoress,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCobrarListadoVendedores!=null && this.jInternalFrameOrderByCobrarListadoVendedores.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCobrarListadoVendedores();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO,cobrarlistadovendedoresConstantesFunciones.resaltarSeleccionarCobrarListadoVendedores,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CobrarListadoVendedoresConstantesFunciones.SCLASSWEBTITULO,cobrarlistadovendedoresConstantesFunciones.resaltarSeleccionarCobrarListadoVendedores,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,CobrarListadoVendedoresConstantesFunciones.LABEL_ID));

		if(this.cobrarlistadovendedoresConstantesFunciones.mostraridCobrarListadoVendedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadoVendedoresConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltaridCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activaridCobrarListadoVendedores,this,true,"idCobrarListadoVendedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltaridCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activaridCobrarListadoVendedores,this,true,"idCobrarListadoVendedores","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR));

		if(this.cobrarlistadovendedoresConstantesFunciones.mostrarnombre_vendedorCobrarListadoVendedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltarnombre_vendedorCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activarnombre_vendedorCobrarListadoVendedores,this,true,"nombre_vendedorCobrarListadoVendedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltarnombre_vendedorCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activarnombre_vendedorCobrarListadoVendedores,this,true,"nombre_vendedorCobrarListadoVendedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO));

		if(this.cobrarlistadovendedoresConstantesFunciones.mostrarcodigoCobrarListadoVendedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltarcodigoCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activarcodigoCobrarListadoVendedores,this,true,"codigoCobrarListadoVendedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltarcodigoCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activarcodigoCobrarListadoVendedores,this,true,"codigoCobrarListadoVendedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE));

		if(this.cobrarlistadovendedoresConstantesFunciones.mostrarnombreCobrarListadoVendedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltarnombreCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activarnombreCobrarListadoVendedores,this,true,"nombreCobrarListadoVendedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltarnombreCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activarnombreCobrarListadoVendedores,this,true,"nombreCobrarListadoVendedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,CobrarListadoVendedoresConstantesFunciones.LABEL_RUC));

		if(this.cobrarlistadovendedoresConstantesFunciones.mostrarrucCobrarListadoVendedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadoVendedoresConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltarrucCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activarrucCobrarListadoVendedores,this,true,"rucCobrarListadoVendedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltarrucCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activarrucCobrarListadoVendedores,this,true,"rucCobrarListadoVendedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO));

		if(this.cobrarlistadovendedoresConstantesFunciones.mostrardireccion_domicilioCobrarListadoVendedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltardireccion_domicilioCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activardireccion_domicilioCobrarListadoVendedores,this,true,"direccion_domicilioCobrarListadoVendedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltardireccion_domicilioCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activardireccion_domicilioCobrarListadoVendedores,this,true,"direccion_domicilioCobrarListadoVendedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO));

		if(this.cobrarlistadovendedoresConstantesFunciones.mostrartelefonoCobrarListadoVendedores && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltartelefonoCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activartelefonoCobrarListadoVendedores,this,true,"telefonoCobrarListadoVendedores","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cobrarlistadovendedoresConstantesFunciones.resaltartelefonoCobrarListadoVendedores,this.cobrarlistadovendedoresConstantesFunciones.activartelefonoCobrarListadoVendedores,this,true,"telefonoCobrarListadoVendedores","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CobrarListadoVendedoresPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarListadoVendedores.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCobrarListadoVendedores.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCobrarListadoVendedores.addColumn(tableColumn);
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
			
			this.jTableDatosCobrarListadoVendedores.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCobrarListadoVendedores.moveColumn(this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCobrarListadoVendedores.moveColumn(this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCobrarListadoVendedores.moveColumn(this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCobrarListadoVendedores.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCobrarListadoVendedores.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCobrarListadoVendedores,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCobrarListadoVendedores.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCobrarListadoVendedores.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCobrarListadoVendedores.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cobrarlistadovendedoress.size()-1;
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
		//this.jTableDatosCobrarListadoVendedores.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCobrarListadoVendedores.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCobrarListadoVendedores();
			
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
				
				//this.isEsNuevoCobrarListadoVendedores=false;
					
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
				if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarListadoVendedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarListadoVendedores.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cobrarlistadovendedores.getsType().equals("DUPLICADO")
				   || this.cobrarlistadovendedores.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCobrarListadoVendedores=true;
				
				} else {
					this.isEsNuevoCobrarListadoVendedores=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
					if(this.cobrarlistadovendedores.getId()>=0 && !this.cobrarlistadovendedores.getIsNew()) {						
						this.isEsNuevoCobrarListadoVendedores=false;
						
					} else {
						this.isEsNuevoCobrarListadoVendedores=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCobrarListadoVendedores(esRelaciones);						
				
				this.seleccionarCobrarListadoVendedores(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cobrarlistadovendedores.getId()<0) {
					this.isEsNuevoCobrarListadoVendedores=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCobrarListadoVendedores(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCobrarListadoVendedores(evt,rowIndex);
				}	
				
				if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CobrarListadoVendedores: " + this.dDif); 
					}
				}								
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCobrarListadoVendedores(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cobrarlistadovendedores)) {
					if(this.cobrarlistadovendedores.getId()>0) {
						this.cobrarlistadovendedores.setIsDeleted(true);
						
						this.cobrarlistadovendedoressEliminados.add(this.cobrarlistadovendedores);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().remove(this.cobrarlistadovendedores);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedoress.remove(this.cobrarlistadovendedores);				
					}
					
					
					((CobrarListadoVendedoresModel) this.jTableDatosCobrarListadoVendedores.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCobrarListadoVendedores(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCobrarListadoVendedores) {
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCobrarListadoVendedores.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCobrarListadoVendedores.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCobrarListadoVendedores(this.cobrarlistadovendedores);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCobrarListadoVendedores("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCobrarListadoVendedores(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCobrarListadoVendedores(cobrarlistadovendedores,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCobrarListadoVendedores(cobrarlistadovendedores);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCobrarListadoVendedores(cobrarlistadovendedores,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCobrarListadoVendedores(cobrarlistadovendedores);
	}
	
	public void setVariablesObjetoActualToFormularioCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.setText(cobrarlistadovendedores.getId().toString());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombre_vendedorCobrarListadoVendedores.setText(cobrarlistadovendedores.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldcodigoCobrarListadoVendedores.setText(cobrarlistadovendedores.getcodigo());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombreCobrarListadoVendedores.setText(cobrarlistadovendedores.getnombre());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldrucCobrarListadoVendedores.setText(cobrarlistadovendedores.getruc());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreadireccion_domicilioCobrarListadoVendedores.setText(cobrarlistadovendedores.getdireccion_domicilio());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreatelefonoCobrarListadoVendedores.setText(cobrarlistadovendedores.gettelefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CobrarListadoVendedores cobrarlistadovendedoresLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cobrarlistadovendedoresLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CobrarListadoVendedores cobrarlistadovendedoresLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cobrarlistadovendedoresLocal=this.cobrarlistadovendedores;
			} else {
				cobrarlistadovendedoresLocal=this.cobrarlistadovendedoresAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cobrarlistadovendedoresLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCobrarListadoVendedores(cobrarlistadovendedoresLocal,true);
					
					if(cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cobrarlistadovendedoresLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cobrarlistadovendedoresLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(cobrarlistadovendedores,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(cobrarlistadovendedores);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(cobrarlistadovendedores,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.getText()==null || this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.getText()=="" || this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.getText()=="Id") {
				this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.setText("0");
			}

			if(conColumnasBase) {cobrarlistadovendedores.setId(Long.parseLong(this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadoVendedoresConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelIdCobrarListadoVendedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadovendedores.setnombre_vendedor(this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombre_vendedorCobrarListadoVendedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelnombre_vendedorCobrarListadoVendedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadovendedores.setcodigo(this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldcodigoCobrarListadoVendedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelcodigoCobrarListadoVendedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadovendedores.setnombre(this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombreCobrarListadoVendedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelnombreCobrarListadoVendedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadovendedores.setruc(this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldrucCobrarListadoVendedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadoVendedoresConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelrucCobrarListadoVendedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadovendedores.setdireccion_domicilio(this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreadireccion_domicilioCobrarListadoVendedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabeldireccion_domicilioCobrarListadoVendedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cobrarlistadovendedores.settelefono(this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreatelefonoCobrarListadoVendedores.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabeltelefonoCobrarListadoVendedores,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedoresBean,CobrarListadoVendedores cobrarlistadovendedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedoresOrigen,CobrarListadoVendedores cobrarlistadovendedores,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarlistadovendedoresOrigen.getId()!=null && !cobrarlistadovendedoresOrigen.getId().equals(0L))) {cobrarlistadovendedores.setId(cobrarlistadovendedoresOrigen.getId());}}
			if(conDefault || (!conDefault && cobrarlistadovendedoresOrigen.getnombre_vendedor()!=null && !cobrarlistadovendedoresOrigen.getnombre_vendedor().equals(""))) {cobrarlistadovendedores.setnombre_vendedor(cobrarlistadovendedoresOrigen.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresOrigen.getcodigo()!=null && !cobrarlistadovendedoresOrigen.getcodigo().equals(""))) {cobrarlistadovendedores.setcodigo(cobrarlistadovendedoresOrigen.getcodigo());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresOrigen.getnombre()!=null && !cobrarlistadovendedoresOrigen.getnombre().equals(""))) {cobrarlistadovendedores.setnombre(cobrarlistadovendedoresOrigen.getnombre());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresOrigen.getruc()!=null && !cobrarlistadovendedoresOrigen.getruc().equals(""))) {cobrarlistadovendedores.setruc(cobrarlistadovendedoresOrigen.getruc());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresOrigen.getdireccion_domicilio()!=null && !cobrarlistadovendedoresOrigen.getdireccion_domicilio().equals(""))) {cobrarlistadovendedores.setdireccion_domicilio(cobrarlistadovendedoresOrigen.getdireccion_domicilio());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresOrigen.gettelefono()!=null && !cobrarlistadovendedoresOrigen.gettelefono().equals(""))) {cobrarlistadovendedores.settelefono(cobrarlistadovendedoresOrigen.gettelefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.setText(cobrarlistadovendedores.getId().toString());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombre_vendedorCobrarListadoVendedores.setText(cobrarlistadovendedores.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldcodigoCobrarListadoVendedores.setText(cobrarlistadovendedores.getcodigo());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombreCobrarListadoVendedores.setText(cobrarlistadovendedores.getnombre());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldrucCobrarListadoVendedores.setText(cobrarlistadovendedores.getruc());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreadireccion_domicilioCobrarListadoVendedores.setText(cobrarlistadovendedores.getdireccion_domicilio());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreatelefonoCobrarListadoVendedores.setText(cobrarlistadovendedores.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCobrarListadoVendedores(CobrarListadoVendedoresBean cobrarlistadovendedoresBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.setText(cobrarlistadovendedoresBean.getId().toString());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombre_vendedorCobrarListadoVendedores.setText(cobrarlistadovendedoresBean.getnombre_vendedor());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldcodigoCobrarListadoVendedores.setText(cobrarlistadovendedoresBean.getcodigo());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombreCobrarListadoVendedores.setText(cobrarlistadovendedoresBean.getnombre());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldrucCobrarListadoVendedores.setText(cobrarlistadovendedoresBean.getruc());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreadireccion_domicilioCobrarListadoVendedores.setText(cobrarlistadovendedoresBean.getdireccion_domicilio());
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreatelefonoCobrarListadoVendedores.setText(cobrarlistadovendedoresBean.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCobrarListadoVendedores(CobrarListadoVendedoresParameterReturnGeneral cobrarlistadovendedoresReturnGeneral,CobrarListadoVendedoresBean cobrarlistadovendedoresBean,Boolean conDefault) throws Exception { 
		try {
			CobrarListadoVendedores cobrarlistadovendedoresLocal=new CobrarListadoVendedores();
			
			cobrarlistadovendedoresLocal=cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cobrarlistadovendedoresLocal.getId()!=null && !cobrarlistadovendedoresLocal.getId().equals(0L))) {cobrarlistadovendedoresBean.setId(cobrarlistadovendedoresLocal.getId());}}
			if(conDefault || (!conDefault && cobrarlistadovendedoresLocal.getnombre_vendedor()!=null && !cobrarlistadovendedoresLocal.getnombre_vendedor().equals(""))) {cobrarlistadovendedoresBean.setnombre_vendedor(cobrarlistadovendedoresLocal.getnombre_vendedor());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresLocal.getcodigo()!=null && !cobrarlistadovendedoresLocal.getcodigo().equals(""))) {cobrarlistadovendedoresBean.setcodigo(cobrarlistadovendedoresLocal.getcodigo());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresLocal.getnombre()!=null && !cobrarlistadovendedoresLocal.getnombre().equals(""))) {cobrarlistadovendedoresBean.setnombre(cobrarlistadovendedoresLocal.getnombre());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresLocal.getruc()!=null && !cobrarlistadovendedoresLocal.getruc().equals(""))) {cobrarlistadovendedoresBean.setruc(cobrarlistadovendedoresLocal.getruc());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresLocal.getdireccion_domicilio()!=null && !cobrarlistadovendedoresLocal.getdireccion_domicilio().equals(""))) {cobrarlistadovendedoresBean.setdireccion_domicilio(cobrarlistadovendedoresLocal.getdireccion_domicilio());}
			if(conDefault || (!conDefault && cobrarlistadovendedoresLocal.gettelefono()!=null && !cobrarlistadovendedoresLocal.gettelefono().equals(""))) {cobrarlistadovendedoresBean.settelefono(cobrarlistadovendedoresLocal.gettelefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCobrarListadoVendedoresGenerico(Long idCobrarListadoVendedoresSeleccionado,JComboBox jComboBoxCobrarListadoVendedores,List<CobrarListadoVendedores> cobrarlistadovendedoressLocal)throws Exception {
		try {
			CobrarListadoVendedores  cobrarlistadovendedoresTemp=null;

			for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoressLocal) {
				if(cobrarlistadovendedoresAux.getId()!=null && cobrarlistadovendedoresAux.getId().equals(idCobrarListadoVendedoresSeleccionado)) {
					cobrarlistadovendedoresTemp=cobrarlistadovendedoresAux;
					break;
				}
			}

			jComboBoxCobrarListadoVendedores.setSelectedItem(cobrarlistadovendedoresTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCobrarListadoVendedoresGenerico(JComboBox jComboBoxCobrarListadoVendedores,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarListadoVendedores.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCobrarListadoVendedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCobrarListadoVendedores.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCobrarListadoVendedores.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCobrarListadoVendedores.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCobrarListadoVendedores.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarlistadovendedores=(CobrarListadoVendedores) cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarlistadovendedores =(CobrarListadoVendedores) cobrarlistadovendedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cobrarlistadovendedores.getIsNew() && !cobrarlistadovendedores.getIsChanged() && !cobrarlistadovendedores.getIsDeleted()) {
				sDescripcion=cobrarlistadovendedores.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarlistadovendedores.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cobrarlistadovendedores.getIsNew() && !cobrarlistadovendedores.getIsChanged() && !cobrarlistadovendedores.getIsDeleted()) {
				sDescripcion=cobrarlistadovendedores.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarlistadovendedores.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!cobrarlistadovendedores.getIsNew() && !cobrarlistadovendedores.getIsChanged() && !cobrarlistadovendedores.getIsDeleted()) {
				sDescripcion=cobrarlistadovendedores.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=cobrarlistadovendedores.getvendedor_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CobrarListadoVendedores cobrarlistadovendedoresRow=new CobrarListadoVendedores();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarlistadovendedoresRow=(CobrarListadoVendedores) cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cobrarlistadovendedoresRow=(CobrarListadoVendedores) cobrarlistadovendedoress.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCobrarListadoVendedores(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores));			
			this.jButtonDuplicarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaDuplicarCobrarListadoVendedores && this.isPermisoDuplicarCobrarListadoVendedores));			
			this.jButtonCopiarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaCopiarCobrarListadoVendedores && this.isPermisoCopiarCobrarListadoVendedores));
			this.jButtonVerFormCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaVerFormCobrarListadoVendedores && this.isPermisoVerFormCobrarListadoVendedores));
			
			this.jButtonAbrirOrderByCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaOrdenCobrarListadoVendedores && this.isPermisoOrdenCobrarListadoVendedores));			
			
			this.jButtonNuevoRelacionesCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores));			
			this.jButtonNuevoGuardarCambiosCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaModificarCobrarListadoVendedores && this.isPermisoActualizarCobrarListadoVendedores));	
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaActualizarCobrarListadoVendedores && this.isPermisoActualizarCobrarListadoVendedores));	
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaEliminarCobrarListadoVendedores && this.isPermisoEliminarCobrarListadoVendedores));
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarCobrarListadoVendedores.setVisible(this.isVisibilidadCeldaCancelarCobrarListadoVendedores);							
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaGuardarCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));			
			
			}
						
			this.jButtonGuardarCambiosTablaCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores));						
			this.jButtonDuplicarToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaDuplicarCobrarListadoVendedores && this.isPermisoDuplicarCobrarListadoVendedores));						
			this.jButtonCopiarToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaCopiarCobrarListadoVendedores && this.isPermisoCopiarCobrarListadoVendedores));			
			this.jButtonVerFormToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaVerFormCobrarListadoVendedores && this.isPermisoVerFormCobrarListadoVendedores));			
			this.jButtonAbrirOrderByToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaOrdenCobrarListadoVendedores && this.isPermisoOrdenCobrarListadoVendedores));
			this.jButtonNuevoRelacionesToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores));			
			this.jButtonNuevoGuardarCambiosToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));			
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaModificarCobrarListadoVendedores && this.isPermisoActualizarCobrarListadoVendedores));	
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaActualizarCobrarListadoVendedores  && this.isPermisoActualizarCobrarListadoVendedores));	
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaEliminarCobrarListadoVendedores && this.isPermisoEliminarCobrarListadoVendedores));
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarToolBarCobrarListadoVendedores.setVisible(this.isVisibilidadCeldaCancelarCobrarListadoVendedores);				
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaGuardarCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores));			
			this.jMenuItemDuplicarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaDuplicarCobrarListadoVendedores && this.isPermisoDuplicarCobrarListadoVendedores));			
			this.jMenuItemCopiarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaCopiarCobrarListadoVendedores && this.isPermisoCopiarCobrarListadoVendedores));			
			this.jMenuItemVerFormCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaVerFormCobrarListadoVendedores && this.isPermisoVerFormCobrarListadoVendedores));			
			this.jMenuItemAbrirOrderByCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaOrdenCobrarListadoVendedores && this.isPermisoOrdenCobrarListadoVendedores));			
			//this.jMenuItemMostrarOcultarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaOrdenCobrarListadoVendedores && this.isPermisoOrdenCobrarListadoVendedores));
			this.jMenuItemDetalleAbrirOrderByCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaOrdenCobrarListadoVendedores && this.isPermisoOrdenCobrarListadoVendedores));			
			//this.jMenuItemDetalleMostrarOcultarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaOrdenCobrarListadoVendedores && this.isPermisoOrdenCobrarListadoVendedores));			
			this.jMenuItemNuevoRelacionesCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores));			
			this.jMenuItemNuevoGuardarCambiosCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaNuevoCobrarListadoVendedores && this.isPermisoNuevoCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));									
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemModificarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaModificarCobrarListadoVendedores && this.isPermisoActualizarCobrarListadoVendedores));	
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemActualizarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaActualizarCobrarListadoVendedores && this.isPermisoActualizarCobrarListadoVendedores));	
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemEliminarCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaEliminarCobrarListadoVendedores && this.isPermisoEliminarCobrarListadoVendedores));
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemCancelarCobrarListadoVendedores.setVisible(this.isVisibilidadCeldaCancelarCobrarListadoVendedores);				
			}
			
			this.jMenuItemGuardarCambiosCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaGuardarCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));						
			this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=this.jButtonNuevoCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaDuplicarCobrarListadoVendedores=this.jButtonDuplicarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaCopiarCobrarListadoVendedores=this.jButtonCopiarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaVerFormCobrarListadoVendedores=this.jButtonVerFormCobrarListadoVendedores.isVisible();
			
			this.isVisibilidadCeldaOrdenCobrarListadoVendedores=this.jButtonAbrirOrderByCobrarListadoVendedores.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=this.jButtonNuevoRelacionesCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=this.jButtonModificarCobrarListadoVendedores.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaGuardarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosCobrarListadoVendedores.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=this.jButtonGuardarCambiosTablaCobrarListadoVendedores.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=this.jButtonNuevoToolBarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=this.jButtonNuevoRelacionesToolBarCobrarListadoVendedores.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarToolBarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarToolBarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarToolBarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarToolBarCobrarListadoVendedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarListadoVendedores=this.jButtonGuardarCambiosToolBarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=this.jButtonGuardarCambiosTablaToolBarCobrarListadoVendedores.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=this.jMenuItemNuevoCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=this.jMenuItemNuevoRelacionesCobrarListadoVendedores.isVisible();
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemModificarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemActualizarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemEliminarCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemCancelarCobrarListadoVendedores.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCobrarListadoVendedores=this.jMenuItemGuardarCambiosCobrarListadoVendedores.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCobrarListadoVendedores(Boolean esInicializar) {
		if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
				//if(this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarListadoVendedores();
			}
			
			this.inicializarActualizarBindingBotonesManualCobrarListadoVendedores(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCobrarListadoVendedores() {
		this.jButtonNuevoCobrarListadoVendedores.setVisible(this.isPermisoNuevoCobrarListadoVendedores);			
		this.jButtonDuplicarCobrarListadoVendedores.setVisible(this.isPermisoDuplicarCobrarListadoVendedores);			
		this.jButtonCopiarCobrarListadoVendedores.setVisible(this.isPermisoCopiarCobrarListadoVendedores);			
		this.jButtonVerFormCobrarListadoVendedores.setVisible(this.isPermisoVerFormCobrarListadoVendedores);			
		
		this.jButtonAbrirOrderByCobrarListadoVendedores.setVisible(this.isPermisoOrdenCobrarListadoVendedores);					
		
		this.jButtonNuevoRelacionesCobrarListadoVendedores.setVisible(this.isPermisoNuevoCobrarListadoVendedores);			
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarCobrarListadoVendedores.setVisible(this.isPermisoActualizarCobrarListadoVendedores);	
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarCobrarListadoVendedores.setVisible(this.isPermisoActualizarCobrarListadoVendedores);	
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarCobrarListadoVendedores.setVisible(this.isPermisoEliminarCobrarListadoVendedores);
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarCobrarListadoVendedores.setVisible(this.isVisibilidadCeldaCancelarCobrarListadoVendedores);						
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosCobrarListadoVendedores.setVisible(this.isPermisoGuardarCambiosCobrarListadoVendedores);							
		}
		
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.setVisible(this.isPermisoActualizarCobrarListadoVendedores);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarListadoVendedores() {
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarCobrarListadoVendedores.setVisible(this.isPermisoActualizarCobrarListadoVendedores);	
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarCobrarListadoVendedores.setVisible(this.isPermisoActualizarCobrarListadoVendedores);	
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarCobrarListadoVendedores.setVisible(this.isPermisoEliminarCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarCobrarListadoVendedores.setVisible(this.isVisibilidadCeldaCancelarCobrarListadoVendedores);							
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosCobrarListadoVendedores.setVisible((this.isVisibilidadCeldaGuardarCobrarListadoVendedores && this.isPermisoGuardarCambiosCobrarListadoVendedores));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCobrarListadoVendedores() {
		if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCobrarListadoVendedores();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCobrarListadoVendedores() {
	}
	
	public void jTableDatosCobrarListadoVendedoresListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCobrarListadoVendedores(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cobrarlistadovendedores.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCobrarListadoVendedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCobrarListadoVendedores(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarListadoVendedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarListadoVendedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cobrarlistadovendedoresLogic.getConnexion());

				if(this.cobrarlistadovendedores.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cobrarlistadovendedores.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarListadoVendedores=(TitledBorder)this.jScrollPanelDatosCobrarListadoVendedores.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCobrarListadoVendedores.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cobrarlistadovendedores.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCobrarListadoVendedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCobrarListadoVendedores(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarListadoVendedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarListadoVendedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cobrarlistadovendedoresLogic.getConnexion());

				if(this.cobrarlistadovendedores.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cobrarlistadovendedores.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarListadoVendedores=(TitledBorder)this.jScrollPanelDatosCobrarListadoVendedores.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCobrarListadoVendedores.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cobrarlistadovendedores.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorCobrarListadoVendedoresUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebCobrarListadoVendedores(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCobrarListadoVendedores.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCobrarListadoVendedores.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.cobrarlistadovendedoresLogic.getConnexion());

				if(this.cobrarlistadovendedores.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.cobrarlistadovendedores.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCobrarListadoVendedores=(TitledBorder)this.jScrollPanelDatosCobrarListadoVendedores.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderCobrarListadoVendedores.getTitle() + " -> VENDEDOR");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.cobrarlistadovendedores.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_vendedorCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getnombre_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_vendedor like '%"+this.cobrarlistadovendedores.getnombre_vendedor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.cobrarlistadovendedores.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.cobrarlistadovendedores.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.cobrarlistadovendedores.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_domicilioCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.getdireccion_domicilio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_domicilio like '%"+this.cobrarlistadovendedores.getdireccion_domicilio()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoCobrarListadoVendedoresBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.getcobrarlistadovendedores(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cobrarlistadovendedores==null) {
						this.cobrarlistadovendedores = new CobrarListadoVendedores();
					}

					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);
				}

				if(this.cobrarlistadovendedores.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.cobrarlistadovendedores.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCobrarListadoVendedores(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);

			this.getCobrarListadoVendedoressBusquedaCobrarListadoVendedores();

			this.inicializarActualizarBindingCobrarListadoVendedores(false);

			//if(CobrarListadoVendedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);

			this.getCobrarListadoVendedoressFK_IdEmpresa();

			this.inicializarActualizarBindingCobrarListadoVendedores(false);

			//if(CobrarListadoVendedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);

			this.getCobrarListadoVendedoressFK_IdSucursal();

			this.inicializarActualizarBindingCobrarListadoVendedores(false);

			//if(CobrarListadoVendedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorCobrarListadoVendedoresActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);

			this.getCobrarListadoVendedoressFK_IdVendedor();

			this.inicializarActualizarBindingCobrarListadoVendedores(false);

			//if(CobrarListadoVendedoresBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cobrarlistadovendedoresLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCobrarListadoVendedores() {
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.setVisible(false);	    			
			this.jInternalFrameDetalleFormCobrarListadoVendedores.dispose();
			this.jInternalFrameDetalleFormCobrarListadoVendedores=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
			this.jInternalFrameReporteDinamicoCobrarListadoVendedores.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCobrarListadoVendedores.dispose();
			this.jInternalFrameReporteDinamicoCobrarListadoVendedores=null;
		}
		
		if(this.jInternalFrameImportacionCobrarListadoVendedores!=null) {
			this.jInternalFrameImportacionCobrarListadoVendedores.setVisible(false);	    			
			this.jInternalFrameImportacionCobrarListadoVendedores.dispose();
			this.jInternalFrameImportacionCobrarListadoVendedores=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCobrarListadoVendedores();
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
			
			if(sTipo.equals("NuevoCobrarListadoVendedores")) {
				jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCobrarListadoVendedores")) {
				jButtonDuplicarCobrarListadoVendedoresActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCobrarListadoVendedores")) {
				jButtonCopiarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormCobrarListadoVendedores")) {
				jButtonVerFormCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCobrarListadoVendedores")) {
				jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCobrarListadoVendedores")) {
				jButtonDuplicarCobrarListadoVendedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCobrarListadoVendedores")) {
				jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCobrarListadoVendedores")) {
				jButtonDuplicarCobrarListadoVendedoresActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCobrarListadoVendedores")) {
				jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCobrarListadoVendedores")) {
				jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCobrarListadoVendedores")) {
				jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCobrarListadoVendedores")) {
				jButtonModificarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCobrarListadoVendedores")) {
				jButtonModificarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCobrarListadoVendedores")) {
				jButtonModificarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCobrarListadoVendedores")) {
				jButtonActualizarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCobrarListadoVendedores")) {
				jButtonActualizarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCobrarListadoVendedores")) {
				jButtonActualizarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarCobrarListadoVendedores")) {
				jButtonEliminarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCobrarListadoVendedores")) {
				jButtonEliminarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCobrarListadoVendedores")) {
				jButtonEliminarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarCobrarListadoVendedores")) {
				jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCobrarListadoVendedores")) {
				jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCobrarListadoVendedores")) {
				jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarCobrarListadoVendedores")) {
				jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCobrarListadoVendedores")) {
				jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCobrarListadoVendedores")) {
				jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCobrarListadoVendedores")) {
				jButtonMostrarOcultarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCobrarListadoVendedores")) {
				jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCobrarListadoVendedores")) {
				jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCobrarListadoVendedores")) {
				jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCobrarListadoVendedores")) {
				jButtonCopiarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCobrarListadoVendedores")) {
				jButtonVerFormCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCobrarListadoVendedores")) {
				jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCobrarListadoVendedores")) {
				jButtonCopiarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCobrarListadoVendedores")) {
				jButtonVerFormCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCobrarListadoVendedores")) {
				jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCobrarListadoVendedores")) {
				jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCobrarListadoVendedores")) {
				jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCobrarListadoVendedores")) {
				jButtonRecargarInformacionCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCobrarListadoVendedores")) {
				jButtonRecargarInformacionCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCobrarListadoVendedores")) {
				jButtonRecargarInformacionCobrarListadoVendedoresActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCobrarListadoVendedores")) {
				jButtonAnterioresCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCobrarListadoVendedores")) {
				jButtonAnterioresCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCobrarListadoVendedores")) {
				jButtonAnterioresCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCobrarListadoVendedores")) {
				jButtonSiguientesCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCobrarListadoVendedores")) {
				jButtonSiguientesCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCobrarListadoVendedores")) {
				jButtonSiguientesCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCobrarListadoVendedores") || sTipo.equals("MenuItemDetalleAbrirOrderByCobrarListadoVendedores")) {
				jButtonAbrirOrderByCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCobrarListadoVendedores") || sTipo.equals("MenuItemDetalleMostrarOcultarCobrarListadoVendedores")) {
				jButtonMostrarOcultarCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarListadoVendedores")) {
				jButtonNuevoGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCobrarListadoVendedores")) {
				jButtonNuevoGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCobrarListadoVendedores")) {
				jButtonNuevoGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCobrarListadoVendedores")) {
				jButtonCerrarReporteDinamicoCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCobrarListadoVendedores")) {
				jButtonGenerarReporteDinamicoCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCobrarListadoVendedores")) {
				
				jButtonGenerarExcelReporteDinamicoCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCobrarListadoVendedores")) {
				jButtonCerrarImportacionCobrarListadoVendedoresActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCobrarListadoVendedores")) {
				
				jButtonGenerarImportacionCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCobrarListadoVendedores")) {
				
				jButtonAbrirImportacionCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCobrarListadoVendedores")) {
				jComboBoxTiposAccionesCobrarListadoVendedoresActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCobrarListadoVendedores")) {
				jComboBoxTiposRelacionesCobrarListadoVendedoresActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCobrarListadoVendedores")) {
				jComboBoxTiposAccionesCobrarListadoVendedoresActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCobrarListadoVendedores")) {
				
				jComboBoxTiposSeleccionarCobrarListadoVendedoresActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCobrarListadoVendedores")) {
				jTextFieldValorCampoGeneralCobrarListadoVendedoresActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCobrarListadoVendedores")) {
				jButtonAbrirOrderByCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCobrarListadoVendedores")) {
				jButtonAbrirOrderByCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCobrarListadoVendedores")) {
				jButtonCerrarOrderByCobrarListadoVendedoresActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarListadoVendedoresBusqueda")) {
				this.jButtonidCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarListadoVendedoresUpdate")) {
				this.jButtonid_empresaCobrarListadoVendedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarListadoVendedoresBusqueda")) {
				this.jButtonid_empresaCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarListadoVendedoresUpdate")) {
				this.jButtonid_sucursalCobrarListadoVendedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarListadoVendedoresBusqueda")) {
				this.jButtonid_sucursalCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorCobrarListadoVendedoresUpdate")) {
				this.jButtonid_vendedorCobrarListadoVendedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorCobrarListadoVendedoresBusqueda")) {
				this.jButtonid_vendedorCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarListadoVendedoresBusqueda")) {
				this.jButtonnombre_vendedorCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarListadoVendedoresBusqueda")) {
				this.jButtoncodigoCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarListadoVendedoresBusqueda")) {
				this.jButtonnombreCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucCobrarListadoVendedoresBusqueda")) {
				this.jButtonrucCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_domicilioCobrarListadoVendedoresBusqueda")) {
				this.jButtondireccion_domicilioCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoCobrarListadoVendedoresBusqueda")) {
				this.jButtontelefonoCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaCobrarListadoVendedoresCobrarListadoVendedores")) {
				this.jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedoresActionPerformed(evt);
			}
			
			;
			
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCobrarListadoVendedores();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				


				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CobrarListadoVendedores cobrarlistadovendedoresLocal=null;
			
			if(!this.getEsControlTabla()) {
				cobrarlistadovendedoresLocal=this.cobrarlistadovendedores;
			} else {
				cobrarlistadovendedoresLocal=this.cobrarlistadovendedoresAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
							
				
				


				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
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
			
			


			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadoVendedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
								
						
				


				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
								
				
				


				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
							
				
				


				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
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
			
			


			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
								
				
				


				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadoVendedoresActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCobrarListadoVendedores")) {
					jCheckBoxSeleccionarTodosCobrarListadoVendedoresItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCobrarListadoVendedores")) {
					jCheckBoxSeleccionadosCobrarListadoVendedoresItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCobrarListadoVendedores")) {
					
				}
				
				


				
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
												
				
				


				
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadoVendedoresActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
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
			
			


			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cobrarlistadovendedores);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cobrarlistadovendedores);
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
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
				
				


				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CobrarListadoVendedores.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CobrarListadoVendedores.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCobrarListadoVendedoresActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cobrarlistadovendedoresAnterior =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCobrarListadoVendedores")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCobrarListadoVendedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCobrarListadoVendedores.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cobrarlistadovendedores =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cobrarlistadovendedores);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCobrarListadoVendedores")) {
				
				}
				
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCobrarListadoVendedores")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCobrarListadoVendedores.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCobrarListadoVendedores")) {
			
			}
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCobrarListadoVendedores();
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
			if(sTipo.equals("NuevoCobrarListadoVendedores")) {
				jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCobrarListadoVendedores")) {
				jButtonDuplicarCobrarListadoVendedoresActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCobrarListadoVendedores")) {
				jButtonCopiarCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCobrarListadoVendedores")) {
				jButtonVerFormCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCobrarListadoVendedores")) {
				jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCobrarListadoVendedores")) {
				jButtonModificarCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCobrarListadoVendedores")) {
				jButtonActualizarCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCobrarListadoVendedores")) {
				jButtonEliminarCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCobrarListadoVendedores")) {
				jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCobrarListadoVendedores")) {
				jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCobrarListadoVendedores")) {
				jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCobrarListadoVendedores")) {
				jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCobrarListadoVendedores")) {
				jButtonNuevoGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCobrarListadoVendedores")) {
				jButtonAbrirOrderByCobrarListadoVendedoresActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCobrarListadoVendedores")) {
				jButtonRecargarInformacionCobrarListadoVendedoresActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCobrarListadoVendedores")) {
				jButtonAnterioresCobrarListadoVendedoresActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCobrarListadoVendedores")) {
				jButtonSiguientesCobrarListadoVendedoresActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCobrarListadoVendedoresBusqueda")) {
				this.jButtonidCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCobrarListadoVendedoresUpdate")) {
				this.jButtonid_empresaCobrarListadoVendedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCobrarListadoVendedoresBusqueda")) {
				this.jButtonid_empresaCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCobrarListadoVendedoresUpdate")) {
				this.jButtonid_sucursalCobrarListadoVendedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCobrarListadoVendedoresBusqueda")) {
				this.jButtonid_sucursalCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorCobrarListadoVendedoresUpdate")) {
				this.jButtonid_vendedorCobrarListadoVendedoresUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorCobrarListadoVendedoresBusqueda")) {
				this.jButtonid_vendedorCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_vendedorCobrarListadoVendedoresBusqueda")) {
				this.jButtonnombre_vendedorCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCobrarListadoVendedoresBusqueda")) {
				this.jButtoncodigoCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCobrarListadoVendedoresBusqueda")) {
				this.jButtonnombreCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucCobrarListadoVendedoresBusqueda")) {
				this.jButtonrucCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_domicilioCobrarListadoVendedoresBusqueda")) {
				this.jButtondireccion_domicilioCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoCobrarListadoVendedoresBusqueda")) {
				this.jButtontelefonoCobrarListadoVendedoresBusquedaActionPerformed(evt);
			}
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCobrarListadoVendedores();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCobrarListadoVendedores")) {
				closingInternalFrameCobrarListadoVendedores();
				
			} else if(sTipo.equals("jButtonCancelarCobrarListadoVendedores")) {
				JInternalFrameBase jInternalFrameDetalleFormCobrarListadoVendedores = (JInternalFrameBase)evt.getSource();
	            	
	            CobrarListadoVendedoresBeanSwingJInternalFrame jInternalFrameParent=(CobrarListadoVendedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarListadoVendedores.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCobrarListadoVendedoresActionPerformed(null);
			}
			
			CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cobrarlistadovendedores,new Object(),this.cobrarlistadovendedoresParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCobrarListadoVendedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCobrarListadoVendedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCobrarListadoVendedores(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cobrarlistadovendedores)) {
			if(!esControlTabla) {
				if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);			
				}
				
				if(this.cobrarlistadovendedoresSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCobrarListadoVendedores(this.cobrarlistadovendedoresReturnGeneral,this.cobrarlistadovendedoresBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cobrarlistadovendedoresSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCobrarListadoVendedores(classes,this.cobrarlistadovendedoresReturnGeneral,this.cobrarlistadovendedoresBean,false);
					}
						
					if(this.cobrarlistadovendedoresReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCobrarListadoVendedores(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCobrarListadoVendedores(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores());	
					}
						
					if(this.cobrarlistadovendedoresReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCobrarListadoVendedores(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores(),classes);//this.cobrarlistadovendedoresBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCobrarListadoVendedores(this.cobrarlistadovendedores,classes);//this.cobrarlistadovendedoresBean);									
				}
			
				if(CobrarListadoVendedoresJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCobrarListadoVendedores(this.cobrarlistadovendedores,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCobrarListadoVendedores(this.cobrarlistadovendedores);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cobrarlistadovendedoresAnterior!=null) {
						this.cobrarlistadovendedores=this.cobrarlistadovendedoresAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cobrarlistadovendedoresSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores(),cobrarlistadovendedoresLogic.getCobrarListadoVendedoress());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedores(),this.cobrarlistadovendedoress);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCobrarListadoVendedores.repaint();
				
				//((AbstractTableModel) this.jTableDatosCobrarListadoVendedores.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCobrarListadoVendedores();
			}
		}
	}
	
	public void actualizarVisualTableDatosCobrarListadoVendedores() throws Exception {
		
		CobrarListadoVendedoresModel cobrarlistadovendedoresModel=(CobrarListadoVendedoresModel)this.jTableDatosCobrarListadoVendedores.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cobrarlistadovendedoresModel.cobrarlistadovendedoress=this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cobrarlistadovendedoresModel.cobrarlistadovendedoress=this.cobrarlistadovendedoress;
		}
		
		
		((CobrarListadoVendedoresModel) this.jTableDatosCobrarListadoVendedores.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCobrarListadoVendedores() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcobrarlistadovendedoresAnterior(),this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcobrarlistadovendedoresAnterior(),this.cobrarlistadovendedoress);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCobrarListadoVendedores();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
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
										
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarlistadovendedores,new Object(),generalEntityParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CobrarListadoVendedoresConstantesFunciones.getClassesRelationshipsOfCobrarListadoVendedores(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CobrarListadoVendedoresConstantesFunciones.getClassesRelationshipsFromStringsOfCobrarListadoVendedores(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCobrarListadoVendedores(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cobrarlistadovendedores,new Object(),generalEntityParameterGeneral,this.cobrarlistadovendedoresReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCobrarListadoVendedores(CobrarListadoVendedoresBean cobrarlistadovendedoresBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCobrarListadoVendedores(ArrayList<Classe> classes,CobrarListadoVendedoresReturnGeneral cobrarlistadovendedoresReturnGeneral,CobrarListadoVendedoresBean cobrarlistadovendedoresBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cobrarlistadovendedores)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores = new CobrarListadoVendedoresDetalleFormJInternalFrame(jDesktopPane,this.cobrarlistadovendedoresSessionBean.getConGuardarRelaciones(),this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.setVisible(false);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.setSelected(false);						
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.cobrarlistadovendedoresLogic=this.cobrarlistadovendedoresLogic;
		
		this.cargarCombosFrameForeignKeyCobrarListadoVendedores("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCobrarListadoVendedores();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCobrarListadoVendedores();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCobrarListadoVendedores("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCobrarListadoVendedores();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarListadoVendedores"));
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"ModificarCobrarListadoVendedores"));

		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarToolBarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarListadoVendedores"));
					
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemModificarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarListadoVendedores"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"ActualizarCobrarListadoVendedores"));
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarToolBarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarListadoVendedores"));
						
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemActualizarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarListadoVendedores"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"EliminarCobrarListadoVendedores"));
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarListadoVendedores"));
								
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemEliminarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarListadoVendedores"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"CancelarCobrarListadoVendedores"));
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarListadoVendedores"));
					
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemCancelarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarListadoVendedores"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemDetalleCerrarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarListadoVendedores"));		
		
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarListadoVendedores"));
		
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarListadoVendedores"));
		
		
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarListadoVendedores"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonidCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_empresaCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_empresaCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_sucursalCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_sucursalCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_vendedorCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_vendedorCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtoncodigoCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonnombreCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonrucCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"direccion_domicilioCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtontelefonoCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"telefonoCobrarListadoVendedoresBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarListadoVendedores"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCobrarListadoVendedores"));
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCobrarListadoVendedores"));
		}
		
		this.jTableDatosCobrarListadoVendedores.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCobrarListadoVendedores"));
		
		this.jTableDatosCobrarListadoVendedores.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCobrarListadoVendedores"));
		
		this.jButtonNuevoCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"NuevoCobrarListadoVendedores"));
		
		this.jButtonDuplicarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"DuplicarCobrarListadoVendedores"));
		
		this.jButtonCopiarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"CopiarCobrarListadoVendedores"));
		
		this.jButtonVerFormCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"VerFormCobrarListadoVendedores"));
		
		
		this.jButtonNuevoToolBarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"NuevoToolBarCobrarListadoVendedores"));
			
		this.jButtonDuplicarToolBarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCobrarListadoVendedores"));
			
		this.jMenuItemNuevoCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCobrarListadoVendedores"));
			
		this.jMenuItemDuplicarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCobrarListadoVendedores"));		
		
		
		this.jButtonNuevoRelacionesCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCobrarListadoVendedores"));
		
		
		this.jButtonNuevoRelacionesToolBarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCobrarListadoVendedores"));
			
		this.jMenuItemNuevoRelacionesCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCobrarListadoVendedores"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"ModificarCobrarListadoVendedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonModificarToolBarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"ModificarToolBarCobrarListadoVendedores"));
			
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemModificarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"MenuItemModificarCobrarListadoVendedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"ActualizarCobrarListadoVendedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonActualizarToolBarCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCobrarListadoVendedores"));
				
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemActualizarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCobrarListadoVendedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"EliminarCobrarListadoVendedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonEliminarToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"EliminarToolBarCobrarListadoVendedores"));
						
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemEliminarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCobrarListadoVendedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"CancelarCobrarListadoVendedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonCancelarToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"CancelarToolBarCobrarListadoVendedores"));
			
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemCancelarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCobrarListadoVendedores"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCobrarListadoVendedores"));		
		
		
		this.jButtonCerrarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"CerrarCobrarListadoVendedores"));
		
		
		this.jButtonCerrarToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"CerrarToolBarCobrarListadoVendedores"));
			
		this.jMenuItemCerrarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCobrarListadoVendedores"));
			
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jMenuItemDetalleCerrarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCobrarListadoVendedores"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosCobrarListadoVendedores"));
		}
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCobrarListadoVendedores"));
		}
		
		this.jButtonCopiarToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"CopiarToolBarCobrarListadoVendedores"));
			
		this.jButtonVerFormToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"VerFormToolBarCobrarListadoVendedores"));
		
		this.jMenuItemGuardarCambiosCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCobrarListadoVendedores"));
			
		this.jMenuItemCopiarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCobrarListadoVendedores"));		
		
		this.jMenuItemVerFormCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCobrarListadoVendedores"));		
		
		
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarListadoVendedores"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCobrarListadoVendedores"));
			
		this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCobrarListadoVendedores"));		
		
		
		
		this.jButtonRecargarInformacionCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionCobrarListadoVendedores"));
					
		this.jButtonRecargarInformacionToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCobrarListadoVendedores"));
		
		this.jMenuItemRecargarInformacionCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCobrarListadoVendedores"));		
		
		
		
		this.jButtonAnterioresCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"AnterioresCobrarListadoVendedores"));
		
		
		this.jButtonAnterioresToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCobrarListadoVendedores"));
		
		this.jMenuItemAnterioresCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCobrarListadoVendedores"));		
		
		
		this.jButtonSiguientesCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"SiguientesCobrarListadoVendedores"));
		
		
		this.jButtonSiguientesToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCobrarListadoVendedores"));
			
		this.jMenuItemSiguientesCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCobrarListadoVendedores"));
			
		this.jMenuItemAbrirOrderByCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCobrarListadoVendedores"));
			
		this.jMenuItemMostrarOcultarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCobrarListadoVendedores"));
			
		this.jMenuItemDetalleAbrirOrderByCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCobrarListadoVendedores"));
			
		this.jMenuItemDetalleMostarOcultarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCobrarListadoVendedores"));		
		
		
		this.jButtonNuevoGuardarCambiosCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCobrarListadoVendedores"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCobrarListadoVendedores"));
			
		this.jMenuItemNuevoGuardarCambiosCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCobrarListadoVendedores"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCobrarListadoVendedores"));

		this.jCheckBoxSeleccionadosCobrarListadoVendedores.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCobrarListadoVendedores"));
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCobrarListadoVendedores"));
		}
		
		
		this.jComboBoxTiposRelacionesCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"TiposRelacionesCobrarListadoVendedores"));
			
		this.jComboBoxTiposAccionesCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"TiposAccionesCobrarListadoVendedores"));
					
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCobrarListadoVendedores"));
			
		this.jTextFieldValorCampoGeneralCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCobrarListadoVendedores"));		
		
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonidCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_empresaCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_empresaCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_sucursalCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_sucursalCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_vendedorCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_vendedorCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtoncodigoCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonnombreCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonrucCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"direccion_domicilioCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtontelefonoCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"telefonoCobrarListadoVendedoresBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"BusquedaCobrarListadoVendedoresCobrarListadoVendedores"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCobrarListadoVendedores!=null) {
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarListadoVendedores"));
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarListadoVendedores"));
				this.jInternalFrameReporteDinamicoCobrarListadoVendedores.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarListadoVendedores"));
			}
			
			//this.jButtonCerrarReporteDinamicoCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCobrarListadoVendedores"));				
			//this.jButtonGenerarReporteDinamicoCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCobrarListadoVendedores"));
			//this.jButtonGenerarExcelReporteDinamicoCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCobrarListadoVendedores"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCobrarListadoVendedores!=null) {
				this.jInternalFrameImportacionCobrarListadoVendedores.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCobrarListadoVendedores"));
				this.jInternalFrameImportacionCobrarListadoVendedores.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCobrarListadoVendedores"));
				this.jInternalFrameImportacionCobrarListadoVendedores.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCobrarListadoVendedores"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByCobrarListadoVendedores"));
			
			this.jButtonAbrirOrderByToolBarCobrarListadoVendedores.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCobrarListadoVendedores"));			
			
			if(this.jInternalFrameOrderByCobrarListadoVendedores!=null) {
				this.jInternalFrameOrderByCobrarListadoVendedores.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCobrarListadoVendedores"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCobrarListadoVendedores.jTabbedPaneRelacionesCobrarListadoVendedores.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCobrarListadoVendedores"));
		
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
            		closingInternalFrameCobrarListadoVendedores();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCobrarListadoVendedores = (JInternalFrameBase)event.getSource();
	            	
	            CobrarListadoVendedoresBeanSwingJInternalFrame jInternalFrameParent=(CobrarListadoVendedoresBeanSwingJInternalFrame)jInternalFrameDetalleFormCobrarListadoVendedores.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCobrarListadoVendedoresActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCobrarListadoVendedores.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCobrarListadoVendedoresListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCobrarListadoVendedores.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCobrarListadoVendedores.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCobrarListadoVendedores";
		inputMap = this.jButtonNuevoCobrarListadoVendedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCobrarListadoVendedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCobrarListadoVendedores";
		inputMap = this.jButtonNuevoRelacionesCobrarListadoVendedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCobrarListadoVendedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCobrarListadoVendedoresActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCobrarListadoVendedores";
		inputMap = this.jButtonModificarCobrarListadoVendedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCobrarListadoVendedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCobrarListadoVendedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCobrarListadoVendedores";
		inputMap = this.jButtonActualizarCobrarListadoVendedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCobrarListadoVendedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCobrarListadoVendedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCobrarListadoVendedores";
		inputMap = this.jButtonEliminarCobrarListadoVendedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCobrarListadoVendedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCobrarListadoVendedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCobrarListadoVendedores";
		inputMap = this.jButtonCancelarCobrarListadoVendedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCobrarListadoVendedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCobrarListadoVendedores";
		inputMap = this.jButtonCerrarCobrarListadoVendedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCobrarListadoVendedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCobrarListadoVendedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCobrarListadoVendedores";
		inputMap = this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosCobrarListadoVendedores.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonGuardarCambiosCobrarListadoVendedores.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCobrarListadoVendedores.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCobrarListadoVendedoresItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCobrarListadoVendedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCobrarListadoVendedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCobrarListadoVendedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCobrarListadoVendedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCobrarListadoVendedores.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCobrarListadoVendedoresActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonidCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"idCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_empresaCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_empresaCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_sucursalCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_sucursalCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCobrarListadoVendedoresBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_vendedorCobrarListadoVendedoresUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarListadoVendedoresUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonid_vendedorCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonnombre_vendedorCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombre_vendedorCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtoncodigoCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"codigoCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonnombreCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"nombreCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtonrucCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"rucCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtondireccion_domicilioCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"direccion_domicilioCobrarListadoVendedoresBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jButtontelefonoCobrarListadoVendedoresBusqueda.addActionListener(new ButtonActionListener(this,"telefonoCobrarListadoVendedoresBusqueda"));
		
		
		this.jButtonBusquedaCobrarListadoVendedoresCobrarListadoVendedores.addActionListener(new ButtonActionListener(this,"BusquedaCobrarListadoVendedoresCobrarListadoVendedores"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCobrarListadoVendedores.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCobrarListadoVendedoresActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCobrarListadoVendedoresActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCobrarListadoVendedores.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCobrarListadoVendedores(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
					cobrarlistadovendedoresAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoress) {
					cobrarlistadovendedoresAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCobrarListadoVendedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
						cobrarlistadovendedoresAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoress) {
						cobrarlistadovendedoresAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoress) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarListadoVendedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarListadoVendedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCobrarListadoVendedoresItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCobrarListadoVendedores.getSelectedRows();
			
			CobrarListadoVendedores cobrarlistadovendedoresLocal=new CobrarListadoVendedores();
			
			//this.seleccionarTodosCobrarListadoVendedores(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cobrarlistadovendedoresLocal =(CobrarListadoVendedores) this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress().toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cobrarlistadovendedoresLocal =(CobrarListadoVendedores) this.cobrarlistadovendedoress.toArray()[this.jTableDatosCobrarListadoVendedores.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cobrarlistadovendedoresLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
						cobrarlistadovendedoresAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoress) {
						cobrarlistadovendedoresAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCobrarListadoVendedores.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCobrarListadoVendedores.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCobrarListadoVendedores,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCobrarListadoVendedoresItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCobrarListadoVendedoresParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCobrarListadoVendedoresActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCobrarListadoVendedores.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
				
						if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrarlistadovendedoresAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarlistadovendedoresAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarlistadovendedoresAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_RUC)) {
							existe=true;
							cobrarlistadovendedoresAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO)) {
							existe=true;
							cobrarlistadovendedoresAux.setdireccion_domicilio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							cobrarlistadovendedoresAux.settelefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoress) {
					
						if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
							existe=true;
							cobrarlistadovendedoresAux.setnombre_vendedor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							cobrarlistadovendedoresAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							cobrarlistadovendedoresAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_RUC)) {
							existe=true;
							cobrarlistadovendedoresAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO)) {
							existe=true;
							cobrarlistadovendedoresAux.setdireccion_domicilio(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							cobrarlistadovendedoresAux.settelefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCobrarListadoVendedoresActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCobrarListadoVendedores=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCobrarListadoVendedores.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCobrarListadoVendedores) {				
					conSplash=true;//false;										
					
					//this.startProcessCobrarListadoVendedores(conSplash);
				
					this.generarReporteCobrarListadoVendedoressSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCobrarListadoVendedoressSeleccionados();
				//this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarListadoVendedoressSeleccionados(false);
				//this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCobrarListadoVendedoressSeleccionados(true);
				//this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarListadoVendedores();
				
				this.exportarCobrarListadoVendedoressSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCobrarListadoVendedoress();
				//this.importarCobrarListadoVendedoress();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCobrarListadoVendedores();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCobrarListadoVendedoressSeleccionados();
				//this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cobrar Listado Vendedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCobrarListadoVendedores();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCobrarListadoVendedores)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCobrarListadoVendedores(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setSelectedIndex(0);					
				}	
			} 			
			else if(CobrarListadoVendedoresBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCobrarListadoVendedores) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCobrarListadoVendedores(conSplash);
					
						//this.actualizarParametrosGeneralCobrarListadoVendedores();
						
						this.generarReporteProcesoAccionCobrarListadoVendedoressSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cobrar Listado VendedoresES SELECCIONADOS?", "MANTENIMIENTO DE Cobrar Listado Vendedores", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCobrarListadoVendedores();
				
						this.actualizarParametrosGeneralCobrarListadoVendedores();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cobrarlistadovendedoresReturnGeneral=cobrarlistadovendedoresLogic.procesarAccionCobrarListadoVendedoressWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress(),this.cobrarlistadovendedoresParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCobrarListadoVendedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCobrarListadoVendedores();
					
					CobrarListadoVendedoresBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCobrarListadoVendedoresReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCobrarListadoVendedores.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxTiposAccionesFormularioCobrarListadoVendedores.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCobrarListadoVendedores(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCobrarListadoVendedoresActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCobrarListadoVendedores();
			
			if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		
			CobrarListadoVendedores cobrarlistadovendedores=new CobrarListadoVendedores();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCobrarListadoVendedores(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCobrarListadoVendedores.getSelectedItem();
			
			
			
			
			cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
			//this.sTipoAccion;
			
			if(cobrarlistadovendedoressSeleccionados.size()==1) {
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoressSeleccionados) {
					cobrarlistadovendedores=cobrarlistadovendedoresAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCobrarListadoVendedores();
			
      		//this.finishProcessCobrarListadoVendedores(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCobrarListadoVendedoresReturnGeneral() throws Exception {
		if(this.cobrarlistadovendedoresReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cobrarlistadovendedoresReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cobrarlistadovendedoresReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cobrarlistadovendedoresReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cobrarlistadovendedoresReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cobrarlistadovendedoresReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCobrarListadoVendedores(false);
		}
		
		if(this.cobrarlistadovendedoresReturnGeneral.getConRetornoLista() || this.cobrarlistadovendedoresReturnGeneral.getConRetornoObjeto()) {
			if(this.cobrarlistadovendedoresReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cobrarlistadovendedoresLogic.setCobrarListadoVendedoress(this.cobrarlistadovendedoresReturnGeneral.getCobrarListadoVendedoress());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingCobrarListadoVendedores(false);
		}
	}
	
	public void actualizarParametrosGeneralCobrarListadoVendedores() throws Exception {
		
		
	}
	
	public ArrayList<CobrarListadoVendedores> getCobrarListadoVendedoressSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCobrarListadoVendedores) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoresLogic.getCobrarListadoVendedoress()) {
					if(cobrarlistadovendedoresAux.getIsSelected()) {
						cobrarlistadovendedoressSeleccionados.add(cobrarlistadovendedoresAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CobrarListadoVendedores cobrarlistadovendedoresAux:this.cobrarlistadovendedoress) {
					if(cobrarlistadovendedoresAux.getIsSelected()) {
						cobrarlistadovendedoressSeleccionados.add(cobrarlistadovendedoresAux);				
					}
				}
			}
			
			if(cobrarlistadovendedoressSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cobrarlistadovendedoressSeleccionados.addAll(this.cobrarlistadovendedoresLogic.getCobrarListadoVendedoress());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cobrarlistadovendedoressSeleccionados.addAll(this.cobrarlistadovendedoress);				
					}
				}
			}
		} else {
			cobrarlistadovendedoressSeleccionados.add(this.cobrarlistadovendedores);
		}
		
		return cobrarlistadovendedoressSeleccionados;
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
	
	public void generarReporteCobrarListadoVendedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCobrarListadoVendedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCobrarListadoVendedoressSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarListadoVendedoressSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCobrarListadoVendedoressSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cobrar Listado Vendedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCobrarListadoVendedoressSeleccionados() throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCobrarListadoVendedoress("Todos",cobrarlistadovendedoressSeleccionados);
		
	}	
	
	public void generarReporteNormalCobrarListadoVendedoressSeleccionados() throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCobrarListadoVendedoress("Todos",cobrarlistadovendedoressSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCobrarListadoVendedoressSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCobrarListadoVendedoress("Todos",cobrarlistadovendedoressSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCobrarListadoVendedoressSeleccionados() throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCobrarListadoVendedores();
		
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCobrarListadoVendedores();
		
		
		//this.generarReporteCobrarListadoVendedoress("Todos",cobrarlistadovendedoressSeleccionados ,cobrarlistadovendedoresImplementable,cobrarlistadovendedoresImplementableHome);
	}
	
	public void mostrarImportacionCobrarListadoVendedoress() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCobrarListadoVendedores();
		
		this.abrirFrameImportacionCobrarListadoVendedores();		
		
			
		//this.generarReporteCobrarListadoVendedoress("Todos",cobrarlistadovendedoressSeleccionados ,cobrarlistadovendedoresImplementable,cobrarlistadovendedoresImplementableHome);
	}
	
	public void importarCobrarListadoVendedoress() throws Exception {		
	
	}
	
	public void exportarCobrarListadoVendedoressSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCobrarListadoVendedoressSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCobrarListadoVendedoressSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCobrarListadoVendedoressSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cobrar Listado Vendedores",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCobrarListadoVendedoressSeleccionados() throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadovendedores."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCobrarListadoVendedores(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoressSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCobrarListadoVendedores(cobrarlistadovendedoresAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cobrarlistadovendedoresAux.setsDetalleGeneralEntityReporte(cobrarlistadovendedoresAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCobrarListadoVendedores(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cobrarlistadovendedores.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getnombre_vendedor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.getdireccion_domicilio();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cobrarlistadovendedores.gettelefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCobrarListadoVendedoressSeleccionados() throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadovendedores.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CobrarListadoVendedoress");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCobrarListadoVendedores(row);				
				iRow++;
			}				
			
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoressSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCobrarListadoVendedores(cobrarlistadovendedoresAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCobrarListadoVendedoressSeleccionados() throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();		
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cobrarlistadovendedores.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cobrarlistadovendedoress");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cobrarlistadovendedores");
			//elementRoot.appendChild(element);
		
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoressSeleccionados) {
				element = document.createElement("cobrarlistadovendedores");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCobrarListadoVendedores(cobrarlistadovendedoresAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cobrar Listado Vendedores",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCobrarListadoVendedores(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO);
		cell = row.createCell(iColumn++);cell.setCellValue(CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getnombre_vendedor());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.getdireccion_domicilio());
		cell = row.createCell(iColumn++);cell.setCellValue(cobrarlistadovendedores.gettelefono());				
	}
	
	public void setFilaDatosExportarXmlCobrarListadoVendedores(CobrarListadoVendedores cobrarlistadovendedores,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CobrarListadoVendedoresConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cobrarlistadovendedores.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CobrarListadoVendedoresConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cobrarlistadovendedores.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(CobrarListadoVendedoresConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cobrarlistadovendedores.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CobrarListadoVendedoresConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cobrarlistadovendedores.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementvendedor_descripcion = document.createElement(CobrarListadoVendedoresConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(cobrarlistadovendedores.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementnombre_vendedor = document.createElement(CobrarListadoVendedoresConstantesFunciones.NOMBREVENDEDOR);
		elementnombre_vendedor.appendChild(document.createTextNode(cobrarlistadovendedores.getnombre_vendedor().trim()));
		element.appendChild(elementnombre_vendedor);

		Element elementcodigo = document.createElement(CobrarListadoVendedoresConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(cobrarlistadovendedores.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CobrarListadoVendedoresConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(cobrarlistadovendedores.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementruc = document.createElement(CobrarListadoVendedoresConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(cobrarlistadovendedores.getruc().trim()));
		element.appendChild(elementruc);

		Element elementdireccion_domicilio = document.createElement(CobrarListadoVendedoresConstantesFunciones.DIRECCIONDOMICILIO);
		elementdireccion_domicilio.appendChild(document.createTextNode(cobrarlistadovendedores.getdireccion_domicilio().trim()));
		element.appendChild(elementdireccion_domicilio);

		Element elementtelefono = document.createElement(CobrarListadoVendedoresConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(cobrarlistadovendedores.gettelefono().trim()));
		element.appendChild(elementtelefono);
	}
	
	public void generarReporteGroupGenericoCobrarListadoVendedoressSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados=new ArrayList<CobrarListadoVendedores>();
		
		cobrarlistadovendedoressSeleccionados=this.getCobrarListadoVendedoressSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCobrarListadoVendedores(cobrarlistadovendedoressSeleccionados);
		
		this.generarReporteCobrarListadoVendedoress("Todos",cobrarlistadovendedoressSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCobrarListadoVendedores(ArrayList<CobrarListadoVendedores> cobrarlistadovendedoressSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CobrarListadoVendedores cobrarlistadovendedoresAux:cobrarlistadovendedoressSeleccionados) {
				cobrarlistadovendedoresAux.setsDetalleGeneralEntityReporte(cobrarlistadovendedoresAux.toString());
			
				if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBREVENDEDOR)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.getnombre_vendedor());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_RUC)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_DIRECCIONDOMICILIO)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.getdireccion_domicilio());
				}
				 else if(sTipoSeleccionar.equals(CobrarListadoVendedoresConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					cobrarlistadovendedoresAux.setsDescripcionGeneralEntityReporte1(cobrarlistadovendedoresAux.gettelefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CobrarListadoVendedoresConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCobrarListadoVendedores(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCobrarListadoVendedores=true;
				this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=true;
				this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=true;
			}
			
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=true;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=true;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=true;
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=true;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=true;
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=true;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;
			this.isVisibilidadCeldaModificarCobrarListadoVendedores=true;
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaCancelarCobrarListadoVendedores=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				} else {
					this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CobrarListadoVendedoresJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=true;
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=true;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=true;
		} else {
			this.actualizarEstadoPanelsCobrarListadoVendedores(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCobrarListadoVendedores=false;
			//this.isVisibilidadCeldaVerFormCobrarListadoVendedores=false;
			this.isVisibilidadCeldaDuplicarCobrarListadoVendedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
		} else {
			this.isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
			this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			if(!cobrarlistadovendedoresSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;												
			}
			
			this.jButtonCerrarCobrarListadoVendedores.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
		}
		
		if(!this.permiteMantenimiento(this.cobrarlistadovendedores)) {
			this.isVisibilidadCeldaActualizarCobrarListadoVendedores=false;
			this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoCobrarListadoVendedores=false;
		this.isVisibilidadCeldaNuevoRelacionesCobrarListadoVendedores=false;
		this.isVisibilidadCeldaGuardarCambiosCobrarListadoVendedores=false;
		//this.isVisibilidadCeldaModificarCobrarListadoVendedores=true;
		this.isVisibilidadCeldaActualizarCobrarListadoVendedores=false;
		this.isVisibilidadCeldaEliminarCobrarListadoVendedores=false;
		//this.isVisibilidadCeldaCancelarCobrarListadoVendedores=true;			
		this.isVisibilidadCeldaGuardarCobrarListadoVendedores=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCobrarListadoVendedores() {
	}
	
	public void actualizarEstadoPanelsCobrarListadoVendedores(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosEdicionCobrarListadoVendedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosCobrarListadoVendedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarListadoVendedores!=null) {
				this.jPanelPaginacionCobrarListadoVendedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosEdicionCobrarListadoVendedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosCobrarListadoVendedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarListadoVendedores!=null) {
				this.jPanelPaginacionCobrarListadoVendedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosEdicionCobrarListadoVendedores.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosCobrarListadoVendedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarListadoVendedores!=null) {
				this.jPanelPaginacionCobrarListadoVendedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosEdicionCobrarListadoVendedores.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosCobrarListadoVendedores.setVisible(false);
			}
			
			if(this.jPanelPaginacionCobrarListadoVendedores!=null) {
				this.jPanelPaginacionCobrarListadoVendedores.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosEdicionCobrarListadoVendedores.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosCobrarListadoVendedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarListadoVendedores!=null) {
				this.jPanelPaginacionCobrarListadoVendedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosEdicionCobrarListadoVendedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosCobrarListadoVendedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarListadoVendedores!=null) {
				this.jPanelPaginacionCobrarListadoVendedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosEdicionCobrarListadoVendedores.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCobrarListadoVendedores!=null) {
				this.jScrollPanelDatosCobrarListadoVendedores.setVisible(true);
			}
			
			if(this.jPanelPaginacionCobrarListadoVendedores!=null) {
				this.jPanelPaginacionCobrarListadoVendedores.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
					this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cobrarlistadovendedoresSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCobrarListadoVendedores!=null) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCobrarListadoVendedores!=null) {
				this.jPanelParametrosReportesCobrarListadoVendedores.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaCobrarListadoVendedores=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaCobrarListadoVendedores) {this.jTabbedPaneBusquedasCobrarListadoVendedores.remove(jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaCobrarListadoVendedores=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaCobrarListadoVendedores) {this.jTabbedPaneBusquedasCobrarListadoVendedores.remove(jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadBusquedaCobrarListadoVendedores=isParaVendedor;
			if(!this.isVisibilidadBusquedaCobrarListadoVendedores) {this.jTabbedPaneBusquedasCobrarListadoVendedores.remove(jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores);}
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
			
			this.inicializarActualizarBindingTablaCobrarListadoVendedores(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCobrarListadoVendedores() {
		this.updateBorderResaltarBusquedasFormularioCobrarListadoVendedores();
		this.updateVisibilidadBusquedasFormularioCobrarListadoVendedores();
		this.updateHabilitarBusquedasFormularioCobrarListadoVendedores();
	}
	
	public void updateBorderResaltarBusquedasFormularioCobrarListadoVendedores() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCobrarListadoVendedores.getComponents().length>0) {
	

		if(this.cobrarlistadovendedoresConstantesFunciones.resaltarBusquedaCobrarListadoVendedoresCobrarListadoVendedores!=null) {
			index= this.jTabbedPaneBusquedasCobrarListadoVendedores.indexOfComponent(this.jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarListadoVendedores.getComponent(index);
				jPanel.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCobrarListadoVendedores() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCobrarListadoVendedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarListadoVendedores.indexOfComponent(this.jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarListadoVendedores.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
			if(!this.cobrarlistadovendedoresConstantesFunciones.mostrarBusquedaCobrarListadoVendedoresCobrarListadoVendedores && index>-1) {
				this.jTabbedPaneBusquedasCobrarListadoVendedores.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCobrarListadoVendedores() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCobrarListadoVendedores.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCobrarListadoVendedores.indexOfComponent(this.jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarListadoVendedores.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activarBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
				this.jTabbedPaneBusquedasCobrarListadoVendedores.setEnabledAt(index,this.cobrarlistadovendedoresConstantesFunciones.activarBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCobrarListadoVendedores(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaCobrarListadoVendedores")) {
			index= this.jTabbedPaneBusquedasCobrarListadoVendedores.indexOfComponent(this.jPanelBusquedaCobrarListadoVendedoresCobrarListadoVendedores);

			this.jTabbedPaneBusquedasCobrarListadoVendedores.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCobrarListadoVendedores.getComponent(index);

			this.cobrarlistadovendedoresConstantesFunciones.setResaltarBusquedaCobrarListadoVendedoresCobrarListadoVendedores(resaltar);

			jPanel.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarBusquedaCobrarListadoVendedoresCobrarListadoVendedores);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCobrarListadoVendedores.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCobrarListadoVendedores() throws Exception {

		if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCobrarListadoVendedores();
		this.updateVisibilidadResaltarControlesFormularioCobrarListadoVendedores();
		this.updateHabilitarResaltarControlesFormularioCobrarListadoVendedores();
		
	}
	
	public void updateBorderResaltarControlesFormularioCobrarListadoVendedores() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltaridCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltaridCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltarid_empresaCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarid_empresaCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltarid_sucursalCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarid_sucursalCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltarid_vendedorCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarid_vendedorCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltarnombre_vendedorCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombre_vendedorCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarnombre_vendedorCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltarcodigoCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldcodigoCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarcodigoCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltarnombreCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombreCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarnombreCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltarrucCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldrucCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltarrucCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltardireccion_domicilioCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreadireccion_domicilioCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltardireccion_domicilioCobrarListadoVendedores);}
		if(this.cobrarlistadovendedoresConstantesFunciones.resaltartelefonoCobrarListadoVendedores!=null && this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreatelefonoCobrarListadoVendedores.setBorder(this.cobrarlistadovendedoresConstantesFunciones.resaltartelefonoCobrarListadoVendedores);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCobrarListadoVendedores() throws Exception {		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
	
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostraridCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelidCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostraridCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarid_empresaCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelid_empresaCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarid_empresaCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarid_sucursalCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelid_sucursalCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarid_sucursalCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarid_vendedorCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelid_vendedorCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarid_vendedorCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombre_vendedorCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarnombre_vendedorCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelnombre_vendedorCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarnombre_vendedorCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldcodigoCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarcodigoCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelcodigoCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarcodigoCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombreCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarnombreCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelnombreCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarnombreCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldrucCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarrucCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPanelrucCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrarrucCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreadireccion_domicilioCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrardireccion_domicilioCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPaneldireccion_domicilioCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrardireccion_domicilioCobrarListadoVendedores);
		//this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreatelefonoCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrartelefonoCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jPaneltelefonoCobrarListadoVendedores.setVisible(this.cobrarlistadovendedoresConstantesFunciones.mostrartelefonoCobrarListadoVendedores);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCobrarListadoVendedores() throws Exception {
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCobrarListadoVendedores!=null) {
	
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jLabelidCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activaridCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_empresaCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activarid_empresaCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_sucursalCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activarid_sucursalCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jComboBoxid_vendedorCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activarid_vendedorCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombre_vendedorCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activarnombre_vendedorCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldcodigoCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activarcodigoCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreanombreCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activarnombreCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextFieldrucCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activarrucCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreadireccion_domicilioCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activardireccion_domicilioCobrarListadoVendedores);
		this.jInternalFrameDetalleFormCobrarListadoVendedores.jTextAreatelefonoCobrarListadoVendedores.setEnabled(this.cobrarlistadovendedoresConstantesFunciones.activartelefonoCobrarListadoVendedores);
		}
	}
	
		
}