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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes;




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

import com.bydan.erp.puntoventa.util.CajaIngresoDetalleConstantesFunciones;
import com.bydan.erp.puntoventa.util.CajaIngresoDetalleParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CajaIngresoDetalleParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.CajaIngresoDetalleBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.puntoventa.resources.reportes.AuxiliarReportes;


import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.puntoventa.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CajaIngresoDetalleBeanSwingJInternalFrame extends CajaIngresoDetalleJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajaIngresoDetalleBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CajaIngresoDetalle> cajaingresodetalleValidator = new ClassValidator<CajaIngresoDetalle>(CajaIngresoDetalle.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CajaIngresoDetalle cajaingresodetalle;	
	public CajaIngresoDetalle cajaingresodetalleAux;
	public CajaIngresoDetalle cajaingresodetalleAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CajaIngresoDetalle cajaingresodetalleTotales;
	public Long idCajaIngresoDetalleActual;
	public Long iIdNuevoCajaIngresoDetalle=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCajaIngreso="";

	public List<CajaIngreso> cajaingresosForeignKey;

	public List<CajaIngreso> getcajaingresosForeignKey() {
		return cajaingresosForeignKey;
	}

	public void setcajaingresosForeignKey(List<CajaIngreso> cajaingresosForeignKey) {
		this.cajaingresosForeignKey = cajaingresosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CajaIngreso cajaingresoForeignKey;

	public CajaIngreso getcajaingresoForeignKey() {
		return cajaingresoForeignKey;
	}

	public void setcajaingresoForeignKey(CajaIngreso cajaingresoForeignKey) {
		this.cajaingresoForeignKey = cajaingresoForeignKey;
	}

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

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
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
	
	public Boolean isPermisoTodoCajaIngresoDetalle;
	public Boolean isPermisoNuevoCajaIngresoDetalle;
	public Boolean isPermisoActualizarCajaIngresoDetalle;
	public Boolean isPermisoActualizarOriginalCajaIngresoDetalle;
	public Boolean isPermisoEliminarCajaIngresoDetalle;
	public Boolean isPermisoGuardarCambiosCajaIngresoDetalle;
	public Boolean isPermisoConsultaCajaIngresoDetalle;
	public Boolean isPermisoBusquedaCajaIngresoDetalle;
	public Boolean isPermisoReporteCajaIngresoDetalle;
	public Boolean isPermisoPaginacionMedioCajaIngresoDetalle;
	public Boolean isPermisoPaginacionAltoCajaIngresoDetalle;
	public Boolean isPermisoPaginacionTodoCajaIngresoDetalle;
	public Boolean isPermisoCopiarCajaIngresoDetalle;
	public Boolean isPermisoVerFormCajaIngresoDetalle;
	public Boolean isPermisoDuplicarCajaIngresoDetalle;
	public Boolean isPermisoOrdenCajaIngresoDetalle;
	
	
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
	
	public CajaIngresoDetalleParameterReturnGeneral cajaingresodetalleReturnGeneral;
	public CajaIngresoDetalleParameterReturnGeneral cajaingresodetalleParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajaIngresoDetalle=false;
	public Boolean esParaAccionDesdeFormularioCajaIngresoDetalle=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajaIngresoDetalleSessionBeanAdditional cajaingresodetalleSessionBeanAdditional=null;
	
	public CajaIngresoDetalleSessionBeanAdditional getCajaIngresoDetalleSessionBeanAdditional() {
		return this.cajaingresodetalleSessionBeanAdditional;
	}
	
	public void setCajaIngresoDetalleSessionBeanAdditional(CajaIngresoDetalleSessionBeanAdditional cajaingresodetalleSessionBeanAdditional) {
		try {
			this.cajaingresodetalleSessionBeanAdditional=cajaingresodetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajaIngresoDetalleBeanSwingJInternalFrameAdditional cajaingresodetalleBeanSwingJInternalFrameAdditional=null;
	//public class CajaIngresoDetalleBeanSwingJInternalFrame
	
	public CajaIngresoDetalleBeanSwingJInternalFrameAdditional getCajaIngresoDetalleBeanSwingJInternalFrameAdditional() {
		return this.cajaingresodetalleBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajaIngresoDetalleBeanSwingJInternalFrameAdditional(CajaIngresoDetalleBeanSwingJInternalFrameAdditional cajaingresodetalleBeanSwingJInternalFrameAdditional) {
		try {
			this.cajaingresodetalleBeanSwingJInternalFrameAdditional=cajaingresodetalleBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajaIngresoDetalleLogic cajaingresodetalleLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CajaIngresoDetalle cajaingresodetalleBean;
	public CajaIngresoDetalleConstantesFunciones cajaingresodetalleConstantesFunciones;
	//public CajaIngresoDetalleParameterReturnGeneral cajaingresodetalleReturnGeneral;
	
	//FK
	
	public CajaIngresoLogic cajaingresoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public FacturaLogic facturaLogic;
	
	//PARAMETROS
	
	
	//public List<CajaIngresoDetalle> cajaingresodetalles;	
	//public List<CajaIngresoDetalle> cajaingresodetallesEliminados;
	//public List<CajaIngresoDetalle> cajaingresodetallesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajaIngresoDetalle=false;
	public Boolean isVisibilidadCeldaDuplicarCajaIngresoDetalle=true;
	public Boolean isVisibilidadCeldaCopiarCajaIngresoDetalle=true;
	public Boolean isVisibilidadCeldaVerFormCajaIngresoDetalle=true;
	public Boolean isVisibilidadCeldaOrdenCajaIngresoDetalle=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
	public Boolean isVisibilidadCeldaModificarCajaIngresoDetalle=false;
	public Boolean isVisibilidadCeldaActualizarCajaIngresoDetalle=false;
	public Boolean isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
	public Boolean isVisibilidadCeldaCancelarCajaIngresoDetalle=false;
	public Boolean isVisibilidadCeldaGuardarCajaIngresoDetalle=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=false;	
	
	
	public Boolean isVisibilidadFK_IdCajaIngreso=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCajaIngresoDetalle() {
		return this.iIdNuevoCajaIngresoDetalle;
	}

	public void setiIdNuevoCajaIngresoDetalle(Long iIdNuevoCajaIngresoDetalle) {
		this.iIdNuevoCajaIngresoDetalle = iIdNuevoCajaIngresoDetalle;
	}
	
	public Long getidCajaIngresoDetalleActual() {
		return this.idCajaIngresoDetalleActual;
	}

	public void setidCajaIngresoDetalleActual(Long idCajaIngresoDetalleActual) {
		this.idCajaIngresoDetalleActual = idCajaIngresoDetalleActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CajaIngresoDetalle getcajaingresodetalle() {
		return this.cajaingresodetalle;
	}

	public void setcajaingresodetalle(CajaIngresoDetalle cajaingresodetalle) {
		this.cajaingresodetalle = cajaingresodetalle;
	}
	
	public CajaIngresoDetalle getcajaingresodetalleAux() {
		return this.cajaingresodetalleAux;
	}

	public void setcajaingresodetalleAux(CajaIngresoDetalle cajaingresodetalleAux) {
		this.cajaingresodetalleAux = cajaingresodetalleAux;
	}				
	
	public CajaIngresoDetalle getcajaingresodetalleAnterior() {
		return this.cajaingresodetalleAnterior;
	}

	public void setcajaingresodetalleAnterior(CajaIngresoDetalle cajaingresodetalleAnterior) {
		this.cajaingresodetalleAnterior = cajaingresodetalleAnterior;
	}	
	
	public CajaIngresoDetalle getcajaingresodetalleTotales() {
		return this.cajaingresodetalleTotales;
	}

	public void setcajaingresodetalleTotales(CajaIngresoDetalle cajaingresodetalleTotales) {
		this.cajaingresodetalleTotales = cajaingresodetalleTotales;
	}	
	
	public CajaIngresoDetalle getcajaingresodetalleBean() {
		return this.cajaingresodetalleBean;
	}

	public void setcajaingresodetalleBean(CajaIngresoDetalle cajaingresodetalleBean) {
		this.cajaingresodetalleBean = cajaingresodetalleBean;
	}	
	
	public CajaIngresoDetalleParameterReturnGeneral getcajaingresodetalleReturnGeneral() {
		return this.cajaingresodetalleReturnGeneral;
	}

	public void setcajaingresodetalleReturnGeneral(CajaIngresoDetalleParameterReturnGeneral cajaingresodetalleReturnGeneral) {
		this.cajaingresodetalleReturnGeneral = cajaingresodetalleReturnGeneral;
	}	
	
	
	public Long id_caja_ingresoFK_IdCajaIngreso=-1L;

	public Long getid_caja_ingresoFK_IdCajaIngreso() {
		return this.id_caja_ingresoFK_IdCajaIngreso;
	}

	public void setid_caja_ingresoFK_IdCajaIngreso(Long id_caja_ingresoFK_IdCajaIngreso) {
		this.id_caja_ingresoFK_IdCajaIngreso = id_caja_ingresoFK_IdCajaIngreso;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
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
	
	
	public CajaIngresoDetalleLogic getCajaIngresoDetalleLogic()	{		
		return cajaingresodetalleLogic;
	}

	public void setCajaIngresoDetalleLogic(CajaIngresoDetalleLogic cajaingresodetalleLogic) {
		this.cajaingresodetalleLogic = cajaingresodetalleLogic;
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
	
	public Boolean getIsEsNuevoCajaIngresoDetalle() {
		return isEsNuevoCajaIngresoDetalle;
	}

	public void setIsEsNuevoCajaIngresoDetalle(Boolean isEsNuevoCajaIngresoDetalle) {
		this.isEsNuevoCajaIngresoDetalle = isEsNuevoCajaIngresoDetalle;
	}

	public Boolean getEsParaAccionDesdeFormularioCajaIngresoDetalle() {
		return esParaAccionDesdeFormularioCajaIngresoDetalle;
	}
	
	public void setEsParaAccionDesdeFormularioCajaIngresoDetalle(Boolean esParaAccionDesdeFormularioCajaIngresoDetalle) {
		this.esParaAccionDesdeFormularioCajaIngresoDetalle = esParaAccionDesdeFormularioCajaIngresoDetalle;
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
	
	
	public void cargarCombosCajaIngresosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajaingresosForeignKey=new ArrayList<CajaIngreso>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaIngresoLogic cajaingresoLogic=new CajaIngresoLogic();

			cajaingresoLogic.getCajaIngresoDataAccess().setIsForForeingKeyData(true);

			if(this.cajaingresodetalleSessionBean==null) {
				this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCajaIngreso()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLogic.getCajaIngresoDataAccess().setIsForForeingKeyData(true);

					cajaingresoLogic.getTodosCajaIngresosWithConnection(sFinalQuery,new Pagination());

					this.cajaingresosForeignKey=cajaingresoLogic.getCajaIngresos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCajaIngreso(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresoLogic.getEntityWithConnection(cajaingresodetalleSessionBean.getlidCajaIngresoActual());
					this.cajaingresosForeignKey.add(cajaingresoLogic.getCajaIngreso());
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

			if(this.cajaingresodetalleSessionBean==null) {
				this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cajaingresodetalleSessionBean.getlidEmpresaActual());
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

			if(this.cajaingresodetalleSessionBean==null) {
				this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cajaingresodetalleSessionBean.getlidSucursalActual());
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

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.cajaingresodetalleSessionBean==null) {
				this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(cajaingresodetalleSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.cajaingresodetalleSessionBean==null) {
				this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(cajaingresodetalleSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
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

	
	
	public void setActualCajaIngresoForeignKey(Long idCajaIngresoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CajaIngreso  cajaingresoTemp=null;

			for(CajaIngreso cajaingresoAux:cajaingresosForeignKey) {
				if(cajaingresoAux.getId()!=null && cajaingresoAux.getId().equals(idCajaIngresoSeleccionado)) {
					cajaingresoTemp=cajaingresoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaingresoTemp!=null) {

					if(this.cajaingresodetalle!=null) {
						this.cajaingresodetalle.setCajaIngreso(cajaingresoTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setSelectedItem(cajaingresoTemp);
					}
				} else {
					//jComboBoxid_caja_ingresoCajaIngresoDetalle.setSelectedItem(cajaingresoTemp);
					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCajaIngreso") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaingresoTemp!=null && jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle!=null) {
						jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setSelectedItem(cajaingresoTemp);
					} else {
						if(jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle!=null) {
							//jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setSelectedItem(cajaingresoTemp);
							if(jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.getItemCount()>0) {
								jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setSelectedIndex(0);
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

	public String getActualCajaIngresoForeignKeyDescripcion(Long idCajaIngresoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CajaIngreso  cajaingresoTemp=null;

			for(CajaIngreso cajaingresoAux:cajaingresosForeignKey) {
				if(cajaingresoAux.getId()!=null && cajaingresoAux.getId().equals(idCajaIngresoSeleccionado)) {
					cajaingresoTemp=cajaingresoAux;
					break;
				}
			}


			sDescripcion=CajaIngresoConstantesFunciones.getCajaIngresoDescripcion(cajaingresoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaIngresoForeignKeyGenerico(Long idCajaIngresoSeleccionado,JComboBox jComboBoxid_caja_ingresoCajaIngresoDetalleGenerico)throws Exception
	{
		try
		{
			CajaIngreso  cajaingresoTemp=null;

			for(CajaIngreso cajaingresoAux:cajaingresosForeignKey) {
				if(cajaingresoAux.getId()!=null && cajaingresoAux.getId().equals(idCajaIngresoSeleccionado)) {
					cajaingresoTemp=cajaingresoAux;
					break;
				}
			}

			if(cajaingresoTemp!=null) {
				jComboBoxid_caja_ingresoCajaIngresoDetalleGenerico.setSelectedItem(cajaingresoTemp);
			} else {
				if(jComboBoxid_caja_ingresoCajaIngresoDetalleGenerico!=null && jComboBoxid_caja_ingresoCajaIngresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_caja_ingresoCajaIngresoDetalleGenerico.setSelectedIndex(0);
				}
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

					if(this.cajaingresodetalle!=null) {
						this.cajaingresodetalle.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajaIngresoDetalle.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajaIngresoDetalleGenerico)throws Exception
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
				jComboBoxid_empresaCajaIngresoDetalleGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajaIngresoDetalleGenerico!=null && jComboBoxid_empresaCajaIngresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajaIngresoDetalleGenerico.setSelectedIndex(0);
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

					if(this.cajaingresodetalle!=null) {
						this.cajaingresodetalle.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCajaIngresoDetalle.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCajaIngresoDetalleGenerico)throws Exception
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
				jComboBoxid_sucursalCajaIngresoDetalleGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCajaIngresoDetalleGenerico!=null && jComboBoxid_sucursalCajaIngresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCajaIngresoDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.cajaingresodetalle!=null) {
						this.cajaingresodetalle.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteCajaIngresoDetalle.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle!=null) {
						jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle!=null) {
							//jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteCajaIngresoDetalleGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteCajaIngresoDetalleGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteCajaIngresoDetalleGenerico!=null && jComboBoxid_clienteCajaIngresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_clienteCajaIngresoDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.cajaingresodetalle!=null) {
						this.cajaingresodetalle.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaCajaIngresoDetalle.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle!=null) {
						jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle!=null) {
							//jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.setSelectedIndex(0);
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

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaCajaIngresoDetalleGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaCajaIngresoDetalleGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaCajaIngresoDetalleGenerico!=null && jComboBoxid_facturaCajaIngresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_facturaCajaIngresoDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaIngresoForeignKey(CajaIngresoDetalle cajaingresodetalle,JComboBox jComboBoxid_caja_ingresoCajaIngresoDetalleGenerico)throws Exception
	{
		try
		{
			CajaIngreso  cajaingresoAux=new CajaIngreso();

			if(jComboBoxid_caja_ingresoCajaIngresoDetalleGenerico==null) {
				cajaingresoAux=(CajaIngreso)this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.getSelectedItem();
			} else {
				cajaingresoAux=(CajaIngreso)jComboBoxid_caja_ingresoCajaIngresoDetalleGenerico.getSelectedItem();
			}

			if(cajaingresoAux!=null && cajaingresoAux.getId()!=null) {
				cajaingresodetalle.setid_caja_ingreso(cajaingresoAux.getId());
				cajaingresodetalle.setcajaingreso_descripcion(CajaIngresoDetalleConstantesFunciones.getCajaIngresoDescripcion(cajaingresoAux));
				cajaingresodetalle.setCajaIngreso(cajaingresoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CajaIngresoDetalle cajaingresodetalle,JComboBox jComboBoxid_empresaCajaIngresoDetalleGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajaIngresoDetalleGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajaIngresoDetalleGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajaingresodetalle.setid_empresa(empresaAux.getId());
				cajaingresodetalle.setempresa_descripcion(CajaIngresoDetalleConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajaingresodetalle.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CajaIngresoDetalle cajaingresodetalle,JComboBox jComboBoxid_sucursalCajaIngresoDetalleGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCajaIngresoDetalleGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCajaIngresoDetalleGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cajaingresodetalle.setid_sucursal(sucursalAux.getId());
				cajaingresodetalle.setsucursal_descripcion(CajaIngresoDetalleConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cajaingresodetalle.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(CajaIngresoDetalle cajaingresodetalle,JComboBox jComboBoxid_clienteCajaIngresoDetalleGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteCajaIngresoDetalleGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteCajaIngresoDetalleGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				cajaingresodetalle.setid_cliente(clienteAux.getId());
				cajaingresodetalle.setcliente_descripcion(CajaIngresoDetalleConstantesFunciones.getClienteDescripcion(clienteAux));
				cajaingresodetalle.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(CajaIngresoDetalle cajaingresodetalle,JComboBox jComboBoxid_facturaCajaIngresoDetalleGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaCajaIngresoDetalleGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaCajaIngresoDetalleGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				cajaingresodetalle.setid_factura(facturaAux.getId());
				cajaingresodetalle.setfactura_descripcion(CajaIngresoDetalleConstantesFunciones.getFacturaDescripcion(facturaAux));
				cajaingresodetalle.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajaIngresosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCajaIngreso=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.removeAllItems();

							for(CajaIngreso cajaingreso:this.cajaingresosForeignKey) {
								this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.addItem(cajaingreso);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
					}

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCajaIngreso") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.removeAllItems();

							for(CajaIngreso cajaingreso:this.cajaingresosForeignKey) {
								this.jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.addItem(cajaingreso);
							}
						}

						if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
					}

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
					}

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
					}

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.addItem(cliente);
							}
						}

						if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { 
					}

					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.addItem(factura);
							}
						}

						if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCajaIngresoForeignKey(CajaIngreso cajaingreso,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setSelectedItem(cajaingreso);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setSelectedItem(cajaingreso);
						} else {
							this.jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCajaIngresoDetalle() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CajaIngresoDetalleConstantesFunciones.refrescarForeignKeysDescripcionesCajaIngresoDetalle(this.cajaingresodetalleLogic.getCajaIngresoDetalles());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CajaIngresoDetalleConstantesFunciones.refrescarForeignKeysDescripcionesCajaIngresoDetalle(this.cajaingresodetalles);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(CajaIngreso.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Factura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cajaingresodetalleLogic.setCajaIngresoDetalles(this.cajaingresodetalles);
			cajaingresodetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CajaIngresoDetalleParameterReturnGeneral getCajaIngresoDetalleParameterGeneral() {
		return this.cajaingresodetalleParameterGeneral;
	}
	
	public void setCajaIngresoDetalleParameterGeneral(CajaIngresoDetalleParameterReturnGeneral cajaingresodetalleParameterGeneral) {
		this.cajaingresodetalleParameterGeneral = cajaingresodetalleParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCajaIngresoDetalle() {
		return isPermisoTodoCajaIngresoDetalle;
	}

	public void setIsPermisoTodoCajaIngresoDetalle(Boolean isPermisoTodoCajaIngresoDetalle) {
		this.isPermisoTodoCajaIngresoDetalle = isPermisoTodoCajaIngresoDetalle;
	}

	public Boolean getIsPermisoNuevoCajaIngresoDetalle() {
		return isPermisoNuevoCajaIngresoDetalle;
	}

	public void setIsPermisoNuevoCajaIngresoDetalle(Boolean isPermisoNuevoCajaIngresoDetalle) {
		this.isPermisoNuevoCajaIngresoDetalle = isPermisoNuevoCajaIngresoDetalle;
	}

	public Boolean getIsPermisoActualizarCajaIngresoDetalle() {
		return isPermisoActualizarCajaIngresoDetalle;
	}

	public void setIsPermisoActualizarCajaIngresoDetalle(Boolean isPermisoActualizarCajaIngresoDetalle) {
		this.isPermisoActualizarCajaIngresoDetalle = isPermisoActualizarCajaIngresoDetalle;
	}

	public Boolean getIsPermisoEliminarCajaIngresoDetalle() {
		return isPermisoEliminarCajaIngresoDetalle;
	}

	public void setIsPermisoEliminarCajaIngresoDetalle(Boolean isPermisoEliminarCajaIngresoDetalle) {
		this.isPermisoEliminarCajaIngresoDetalle = isPermisoEliminarCajaIngresoDetalle;
	}

	public Boolean getIsPermisoGuardarCambiosCajaIngresoDetalle() {
		return isPermisoGuardarCambiosCajaIngresoDetalle;
	}

	public void setIsPermisoGuardarCambiosCajaIngresoDetalle(Boolean isPermisoGuardarCambiosCajaIngresoDetalle) {
		this.isPermisoGuardarCambiosCajaIngresoDetalle = isPermisoGuardarCambiosCajaIngresoDetalle;
	}
	
	public Boolean getIsPermisoConsultaCajaIngresoDetalle() {
		return isPermisoConsultaCajaIngresoDetalle;
	}

	public void setIsPermisoConsultaCajaIngresoDetalle(Boolean isPermisoConsultaCajaIngresoDetalle) {
		this.isPermisoConsultaCajaIngresoDetalle = isPermisoConsultaCajaIngresoDetalle;
	}

	public Boolean getIsPermisoBusquedaCajaIngresoDetalle() {
		return isPermisoBusquedaCajaIngresoDetalle;
	}

	public void setIsPermisoBusquedaCajaIngresoDetalle(Boolean isPermisoBusquedaCajaIngresoDetalle) {
		this.isPermisoBusquedaCajaIngresoDetalle = isPermisoBusquedaCajaIngresoDetalle;
	}

	public Boolean getIsPermisoReporteCajaIngresoDetalle() {
		return isPermisoReporteCajaIngresoDetalle;
	}

	public void setIsPermisoReporteCajaIngresoDetalle(Boolean isPermisoReporteCajaIngresoDetalle) {
		this.isPermisoReporteCajaIngresoDetalle = isPermisoReporteCajaIngresoDetalle;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajaIngresoDetalle() {
		return isPermisoPaginacionMedioCajaIngresoDetalle;
	}

	public void setIsPermisoPaginacionMedioCajaIngresoDetalle(Boolean isPermisoPaginacionMedioCajaIngresoDetalle) {
		this.isPermisoPaginacionMedioCajaIngresoDetalle = isPermisoPaginacionMedioCajaIngresoDetalle;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajaIngresoDetalle() {
		return isPermisoPaginacionTodoCajaIngresoDetalle;
	}

	public void setIsPermisoPaginacionTodoCajaIngresoDetalle(Boolean isPermisoPaginacionTodoCajaIngresoDetalle) {
		this.isPermisoPaginacionTodoCajaIngresoDetalle = isPermisoPaginacionTodoCajaIngresoDetalle;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajaIngresoDetalle() {
		return isPermisoPaginacionAltoCajaIngresoDetalle;
	}

	public void setIsPermisoPaginacionAltoCajaIngresoDetalle(Boolean isPermisoPaginacionAltoCajaIngresoDetalle) {
		this.isPermisoPaginacionAltoCajaIngresoDetalle = isPermisoPaginacionAltoCajaIngresoDetalle;
	}
	
	public Boolean getIsPermisoCopiarCajaIngresoDetalle() {
		return isPermisoCopiarCajaIngresoDetalle;
	}

	public void setIsPermisoCopiarCajaIngresoDetalle(Boolean isPermisoCopiarCajaIngresoDetalle) {
		this.isPermisoCopiarCajaIngresoDetalle = isPermisoCopiarCajaIngresoDetalle;
	}
	
	public Boolean getIsPermisoVerFormCajaIngresoDetalle() {
		return isPermisoVerFormCajaIngresoDetalle;
	}

	public void setIsPermisoVerFormCajaIngresoDetalle(Boolean isPermisoVerFormCajaIngresoDetalle) {
		this.isPermisoVerFormCajaIngresoDetalle = isPermisoVerFormCajaIngresoDetalle;
	}
	
	public Boolean getIsPermisoDuplicarCajaIngresoDetalle() {
		return isPermisoDuplicarCajaIngresoDetalle;
	}

	public void setIsPermisoDuplicarCajaIngresoDetalle(Boolean isPermisoDuplicarCajaIngresoDetalle) {
		this.isPermisoDuplicarCajaIngresoDetalle = isPermisoDuplicarCajaIngresoDetalle;
	}
	
	public Boolean getIsPermisoOrdenCajaIngresoDetalle() {
		return isPermisoOrdenCajaIngresoDetalle;
	}

	public void setIsPermisoOrdenCajaIngresoDetalle(Boolean isPermisoOrdenCajaIngresoDetalle) {
		this.isPermisoOrdenCajaIngresoDetalle = isPermisoOrdenCajaIngresoDetalle;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCajaIngresoDetalle() {
		return isVisibilidadCeldaNuevoCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaNuevoCajaIngresoDetalle(Boolean isVisibilidadCeldaNuevoCajaIngresoDetalle) {
		this.isVisibilidadCeldaNuevoCajaIngresoDetalle = isVisibilidadCeldaNuevoCajaIngresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajaIngresoDetalle() {
		return isVisibilidadCeldaDuplicarCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaDuplicarCajaIngresoDetalle(Boolean isVisibilidadCeldaDuplicarCajaIngresoDetalle) {
		this.isVisibilidadCeldaDuplicarCajaIngresoDetalle = isVisibilidadCeldaDuplicarCajaIngresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajaIngresoDetalle() {
		return isVisibilidadCeldaCopiarCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaCopiarCajaIngresoDetalle(Boolean isVisibilidadCeldaCopiarCajaIngresoDetalle) {
		this.isVisibilidadCeldaCopiarCajaIngresoDetalle = isVisibilidadCeldaCopiarCajaIngresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajaIngresoDetalle() {
		return isVisibilidadCeldaVerFormCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaVerFormCajaIngresoDetalle(Boolean isVisibilidadCeldaVerFormCajaIngresoDetalle) {
		this.isVisibilidadCeldaVerFormCajaIngresoDetalle = isVisibilidadCeldaVerFormCajaIngresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajaIngresoDetalle() {
		return isVisibilidadCeldaOrdenCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaOrdenCajaIngresoDetalle(Boolean isVisibilidadCeldaOrdenCajaIngresoDetalle) {
		this.isVisibilidadCeldaOrdenCajaIngresoDetalle = isVisibilidadCeldaOrdenCajaIngresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle() {
		return isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle(Boolean isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle) {
		this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle = isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajaIngresoDetalle() {
		return isVisibilidadCeldaModificarCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaModificarCajaIngresoDetalle(Boolean isVisibilidadCeldaModificarCajaIngresoDetalle) {
		this.isVisibilidadCeldaModificarCajaIngresoDetalle = isVisibilidadCeldaModificarCajaIngresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajaIngresoDetalle() {
		return isVisibilidadCeldaActualizarCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaActualizarCajaIngresoDetalle(Boolean isVisibilidadCeldaActualizarCajaIngresoDetalle) {
		this.isVisibilidadCeldaActualizarCajaIngresoDetalle = isVisibilidadCeldaActualizarCajaIngresoDetalle;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajaIngresoDetalle() {
		return isVisibilidadCeldaEliminarCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaEliminarCajaIngresoDetalle(Boolean isVisibilidadCeldaEliminarCajaIngresoDetalle) {
		this.isVisibilidadCeldaEliminarCajaIngresoDetalle = isVisibilidadCeldaEliminarCajaIngresoDetalle;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajaIngresoDetalle() {
		return isVisibilidadCeldaCancelarCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaCancelarCajaIngresoDetalle(Boolean isVisibilidadCeldaCancelarCajaIngresoDetalle) {
		this.isVisibilidadCeldaCancelarCajaIngresoDetalle = isVisibilidadCeldaCancelarCajaIngresoDetalle;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajaIngresoDetalle() {
		return isVisibilidadCeldaGuardarCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCajaIngresoDetalle(Boolean isVisibilidadCeldaGuardarCajaIngresoDetalle) {
		this.isVisibilidadCeldaGuardarCajaIngresoDetalle = isVisibilidadCeldaGuardarCajaIngresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajaIngresoDetalle() {
		return isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajaIngresoDetalle(Boolean isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle) {
		this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle = isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle;
	}
		
	public CajaIngresoDetalleSessionBean getcajaingresodetalleSessionBean() {
		return this.cajaingresodetalleSessionBean;
	}
	
	public void setcajaingresodetalleSessionBean(CajaIngresoDetalleSessionBean cajaingresodetalleSessionBean) {
		this.cajaingresodetalleSessionBean=cajaingresodetalleSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCajaIngreso() {
		return this.isVisibilidadFK_IdCajaIngreso;
	}

	public void setisVisibilidadFK_IdCajaIngreso(Boolean isVisibilidadFK_IdCajaIngreso) {
		this.isVisibilidadFK_IdCajaIngreso=isVisibilidadFK_IdCajaIngreso;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle)throws Exception {
		try {
			
				this.setActualParaGuardarCajaIngresoForeignKey(cajaingresodetalle,null);
				this.setActualParaGuardarEmpresaForeignKey(cajaingresodetalle,null);
				this.setActualParaGuardarSucursalForeignKey(cajaingresodetalle,null);
				this.setActualParaGuardarClienteForeignKey(cajaingresodetalle,null);
				this.setActualParaGuardarFacturaForeignKey(cajaingresodetalle,null);
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
	
	public void bugActualizarReferenciaActual(CajaIngresoDetalle cajaingresodetalle,CajaIngresoDetalle cajaingresodetalleAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajaIngresoDetalle(cajaingresodetalle);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajaingresodetalleAux.setId(cajaingresodetalle.getId());
		cajaingresodetalleAux.setVersionRow(cajaingresodetalle.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCajaIngresoDetalle();
		
			int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cajaingresodetalleValidator.getInvalidValues(this.cajaingresodetalle);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cajaingresodetalleLogic.setDatosCliente(datosCliente);
			cajaingresodetalleLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cajaingresodetalleAux=new  CajaIngresoDetalle();
				
				cajaingresodetalleAux.setIsNew(true);
				cajaingresodetalleAux.setIsChanged(true);
				
				cajaingresodetalleAux.setCajaIngresoDetalleOriginal(this.cajaingresodetalle);
				
				cajaingresodetalleAux.setId(this.cajaingresodetalle.getId());	
				cajaingresodetalleAux.setVersionRow(this.cajaingresodetalle.getVersionRow());	
				cajaingresodetalleAux.setid_caja_ingreso(this.cajaingresodetalle.getid_caja_ingreso());	
				cajaingresodetalleAux.setid_empresa(this.cajaingresodetalle.getid_empresa());	
				cajaingresodetalleAux.setid_sucursal(this.cajaingresodetalle.getid_sucursal());	
				cajaingresodetalleAux.setid_cliente(this.cajaingresodetalle.getid_cliente());	
				cajaingresodetalleAux.setid_factura(this.cajaingresodetalle.getid_factura());	
				cajaingresodetalleAux.setconcepto(this.cajaingresodetalle.getconcepto());	
				cajaingresodetalleAux.setvalor(this.cajaingresodetalle.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajaingresodetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cajaingresodetalleAux,cajaingresodetalleLogic.getCajaIngresoDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaingresodetalleAux,cajaingresodetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleLogic.saveCajaIngresoDetalles();//WithConnection
						//cajaingresodetalleLogic.getSetVersionRowCajaIngresoDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajaingresodetalle,cajaingresodetalleAux);
					
					this.refrescarForeignKeysDescripcionesCajaIngresoDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaingresodetalleLogic.saveCajaIngresoDetalleRelaciones(cajaingresodetalleAux);//WithConnection
								//cajaingresodetalleLogic.getSetVersionRowCajaIngresoDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajaingresodetalle,cajaingresodetalleAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajaingresodetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajaingresodetalleAux,cajaingresodetalleLogic.getCajaIngresoDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajaingresodetalleAux,cajaingresodetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajaingresodetalle,cajaingresodetalleAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cajaingresodetalleAux=new  CajaIngresoDetalle();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() 
					|| (this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() && this.cajaingresodetalle.getId()>=0)) {
						
					cajaingresodetalleAux.setIsNew(false);
				}
				
				cajaingresodetalleAux.setIsDeleted(false);
			
				cajaingresodetalleAux.setId(this.cajaingresodetalle.getId());	
				cajaingresodetalleAux.setVersionRow(this.cajaingresodetalle.getVersionRow());	
				cajaingresodetalleAux.setid_caja_ingreso(this.cajaingresodetalle.getid_caja_ingreso());	
				cajaingresodetalleAux.setid_empresa(this.cajaingresodetalle.getid_empresa());	
				cajaingresodetalleAux.setid_sucursal(this.cajaingresodetalle.getid_sucursal());	
				cajaingresodetalleAux.setid_cliente(this.cajaingresodetalle.getid_cliente());	
				cajaingresodetalleAux.setid_factura(this.cajaingresodetalle.getid_factura());	
				cajaingresodetalleAux.setconcepto(this.cajaingresodetalle.getconcepto());	
				cajaingresodetalleAux.setvalor(this.cajaingresodetalle.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajaingresodetalleAux,cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaingresodetalleAux,cajaingresodetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleLogic.saveCajaIngresoDetalles();//WithConnection
						//cajaingresodetalleLogic.getSetVersionRowCajaIngresoDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajaingresodetalle,cajaingresodetalleAux);
					
					this.refrescarForeignKeysDescripcionesCajaIngresoDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaingresodetalleLogic.saveCajaIngresoDetalleRelaciones(cajaingresodetalleAux);//WithConnection
								//cajaingresodetalleLogic.getSetVersionRowCajaIngresoDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajaingresodetalle,cajaingresodetalleAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajaingresodetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajaingresodetalleAux,cajaingresodetalleLogic.getCajaIngresoDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajaingresodetalleAux,cajaingresodetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajaingresodetalle,cajaingresodetalleAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cajaingresodetalleAux=new  CajaIngresoDetalle();
				
				cajaingresodetalleAux.setIsNew(false);
				cajaingresodetalleAux.setIsChanged(false);
				
				cajaingresodetalleAux.setIsDeleted(true);
				
				cajaingresodetalleAux.setId(this.cajaingresodetalle.getId());	
				cajaingresodetalleAux.setVersionRow(this.cajaingresodetalle.getVersionRow());	
				cajaingresodetalleAux.setid_caja_ingreso(this.cajaingresodetalle.getid_caja_ingreso());	
				cajaingresodetalleAux.setid_empresa(this.cajaingresodetalle.getid_empresa());	
				cajaingresodetalleAux.setid_sucursal(this.cajaingresodetalle.getid_sucursal());	
				cajaingresodetalleAux.setid_cliente(this.cajaingresodetalle.getid_cliente());	
				cajaingresodetalleAux.setid_factura(this.cajaingresodetalle.getid_factura());	
				cajaingresodetalleAux.setconcepto(this.cajaingresodetalle.getconcepto());	
				cajaingresodetalleAux.setvalor(this.cajaingresodetalle.getvalor());	
				
				if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cajaingresodetalleAux.getId()>=0) {	
						this.cajaingresodetallesEliminados.add(cajaingresodetalleAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cajaingresodetalleAux,cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaingresodetalleAux,cajaingresodetalles);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleLogic.saveCajaIngresoDetalles();//WithConnection
						//cajaingresodetalleLogic.getSetVersionRowCajaIngresoDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaingresodetalleLogic.saveCajaIngresoDetalleRelaciones(cajaingresodetalleAux);//WithConnection
								//cajaingresodetalleLogic.getSetVersionRowCajaIngresoDetalles();//WithConnection
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
							if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cajaingresodetalleSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cajaingresodetalleAux,cajaingresodetalleLogic.getCajaIngresoDetalles());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cajaingresodetalleAux,cajaingresodetalles);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(this.cajaingresodetallesEliminados);
					
					cajaingresodetalleLogic.saveCajaIngresoDetalles();//WithConnection
					//cajaingresodetalleLogic.getSetVersionRowCajaIngresoDetalles();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCajaIngresoDetalle();
				
				this.cajaingresodetallesEliminados= new ArrayList<CajaIngresoDetalle>();		
			}
			
			if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Caja Ingreso Detalle GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cajaingresodetalle=cajaingresodetalleAux;
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
      		//this.finishProcessCajaIngresoDetalle();
      	}
		
	}	
	
	public void actualizarRelaciones(CajaIngresoDetalle cajaingresodetalleLocal) throws Exception {
		
		if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CajaIngresoDetalle cajaingresodetalleLocal) throws Exception {	
		if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CajaIngresoDetalleFormJInternalFrame.class)) {
				CajaIngresoBeanSwingJInternalFrame cajaingresoBeanSwingJInternalFrameLocal=(CajaIngresoBeanSwingJInternalFrame) ((CajaIngresoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaingresoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCajaIngreso(cajaingresoBeanSwingJInternalFrameLocal.getcajaingreso(),true);
				cajaingresoBeanSwingJInternalFrameLocal.actualizarLista(cajaingresoBeanSwingJInternalFrameLocal.cajaingreso,this.cajaingresosForeignKey);

				cajaingresoBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaingresoBeanSwingJInternalFrameLocal.cajaingreso);

				cajaingresodetalleLocal.setCajaIngreso(cajaingresoBeanSwingJInternalFrameLocal.cajaingreso);

				this.addItemDefectoCombosForeignKeyCajaIngreso();
				this.cargarCombosFrameCajaIngresosForeignKey("Formulario");
				this.setActualCajaIngresoForeignKey(cajaingresoBeanSwingJInternalFrameLocal.cajaingreso.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajaingresodetalleLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cajaingresodetalleLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				cajaingresodetalleLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				cajaingresodetalleLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajaIngresoDetalleActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajaingresodetalleValidator.getInvalidValues(this.cajaingresodetalle);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CajaIngresoDetalle cajaingresodetalle,List<CajaIngresoDetalle> cajaingresodetalles) throws Exception {
		try	{		
			CajaIngresoDetalleConstantesFunciones.actualizarLista(cajaingresodetalle,cajaingresodetalles,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CajaIngresoDetalle cajaingresodetalle,List<CajaIngresoDetalle> cajaingresodetalles) throws Exception {
		try	{			
			CajaIngresoDetalleConstantesFunciones.actualizarSelectedLista(cajaingresodetalle,cajaingresodetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CajaIngresoDetalle> cajaingresodetallesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajaingresodetallesLocal=this.cajaingresodetalleLogic.getCajaIngresoDetalles();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajaingresodetallesLocal=this.cajaingresodetalles;
			}
			//ARCHITECTURE
		
			for(CajaIngresoDetalle cajaingresodetalleLocal:cajaingresodetallesLocal) {
				if(this.permiteMantenimiento(cajaingresodetalleLocal) && cajaingresodetalleLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CajaIngresoDetalleConstantesFunciones.getCajaIngresoDetalleLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajaIngresoDetalleConstantesFunciones.IDCAJAINGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_caja_ingresoCajaIngresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoDetalleConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_empresaCajaIngresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoDetalleConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_sucursalCajaIngresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoDetalleConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_clienteCajaIngresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoDetalleConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_facturaCajaIngresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoDetalleConstantesFunciones.CONCEPTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelconceptoCajaIngresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaIngresoDetalleConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelvalorCajaIngresoDetalle,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_caja_ingresoCajaIngresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_empresaCajaIngresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_sucursalCajaIngresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_clienteCajaIngresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelid_facturaCajaIngresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelconceptoCajaIngresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelvalorCajaIngresoDetalle,"");
		
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
		this.iIdNuevoCajaIngresoDetalle--;	
		
		
		this.cajaingresodetalleAux=new CajaIngresoDetalle();
		
		this.cajaingresodetalleAux.setId(this.iIdNuevoCajaIngresoDetalle);
		this.cajaingresodetalleAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajaingresodetalleLogic.getCajaIngresoDetalles().add(this.cajaingresodetalleAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajaingresodetalles.add(this.cajaingresodetalleAux);
		}
		//ARCHITECTURE
		
		this.cajaingresodetalle=this.cajaingresodetalleAux;
		
		if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajaIngresoDetalle(this.cajaingresodetalle);
			this.setVariablesObjetoActualToFormularioForeignKeyCajaIngresoDetalle(this.cajaingresodetalle);
		}
				
		//this.setDefaultControlesCajaIngresoDetalle();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajaIngresoDetalle();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajaIngresoDetalle();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaIngresoDetalle();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaIngresoDetalle(this.cajaingresodetalleBean,this.cajaingresodetalle,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
			classes=CajaIngresoDetalleConstantesFunciones.getClassesRelationshipsOfCajaIngresoDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cajaingresodetalleReturnGeneral=cajaingresodetalleLogic.procesarEventosCajaIngresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaingresodetalleLogic.getCajaIngresoDetalles(),this.cajaingresodetalle,this.cajaingresodetalleParameterGeneral,this.isEsNuevoCajaIngresoDetalle,classes);//this.cajaingresodetalleLogic.getCajaIngresoDetalle()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral,this.cajaingresodetalleBean,false);
		
		if(this.cajaingresodetalleReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle());
		}
		
		if(this.cajaingresodetalleReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle(),classes);//this.cajaingresodetalleBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajaIngresoDetalle();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajaIngresoDetalle();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.RecargarFormCajaIngresoDetalle(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajaIngresoDetalle(false);
						
			if(cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaIngresoDetalle();
			}
			
			this.actualizarVisualTableDatosCajaIngresoDetalle();
			
			this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(this.getIndiceNuevoCajaIngresoDetalle(), this.getIndiceNuevoCajaIngresoDetalle());
			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
						
			this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajaIngresoDetalle(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextAreaconceptoCajaIngresoDetalle.setEnabled(isHabilitar && this.cajaingresodetalleConstantesFunciones.activarconceptoCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextFieldvalorCajaIngresoDetalle.setEnabled(isHabilitar && this.cajaingresodetalleConstantesFunciones.activarvalorCajaIngresoDetalle);	
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setEnabled(isHabilitar && this.cajaingresodetalleConstantesFunciones.activarid_caja_ingresoCajaIngresoDetalle);//
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setEnabled(isHabilitar && this.cajaingresodetalleConstantesFunciones.activarid_empresaCajaIngresoDetalle);//
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setEnabled(isHabilitar && this.cajaingresodetalleConstantesFunciones.activarid_sucursalCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setEnabled(isHabilitar && this.cajaingresodetalleConstantesFunciones.activarid_clienteCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setEnabled(isHabilitar && this.cajaingresodetalleConstantesFunciones.activarid_facturaCajaIngresoDetalle);
	};
	
	public void setDefaultControlesCajaIngresoDetalle() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajaIngresoDetalle(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajaingresodetalleSessionBean.setConGuardarRelaciones(true);			
			this.cajaingresodetalleSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.setVisible(true);
			
					
		} else {
			//this.cajaingresodetalleSessionBean.setConGuardarRelaciones(false);			
			this.cajaingresodetalleSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCajaIngresoDetalle() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
				if(cajaingresodetalleAux.getId().equals(this.iIdNuevoCajaIngresoDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalles) {
				if(cajaingresodetalleAux.getId().equals(this.iIdNuevoCajaIngresoDetalle)) {
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
	
	public int getIndiceActualCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
				if(cajaingresodetalleAux.getId().equals(cajaingresodetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalles) {
				if(cajaingresodetalleAux.getId().equals(cajaingresodetalle.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalleOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
				if(cajaingresodetalleAux.getCajaIngresoDetalleOriginal().getId().equals(cajaingresodetalleOriginal.getId())) {
					existe=true;
					cajaingresodetalleOriginal.setId(cajaingresodetalleAux.getId());
					cajaingresodetalleOriginal.setVersionRow(cajaingresodetalleAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalles) {
				if(cajaingresodetalleAux.getCajaIngresoDetalleOriginal().getId().equals(cajaingresodetalleOriginal.getId())) {
					existe=true;
					cajaingresodetalleOriginal.setId(cajaingresodetalleAux.getId());
					cajaingresodetalleOriginal.setVersionRow(cajaingresodetalleAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajaIngresoDetalle(Boolean esParaCancelar) throws Exception {
		cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
		cajaingresodetalleAux=new CajaIngresoDetalle();
		
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
					if(cajaingresodetalleAux.getId()<0) {
						cajaingresodetallesAux.add(cajaingresodetalleAux);
					}		
				}
				this.iIdNuevoCajaIngresoDetalle=0L;
				this.cajaingresodetalleLogic.getCajaIngresoDetalles().removeAll(cajaingresodetallesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalles) {
					if(cajaingresodetalleAux.getId()<0) {
						cajaingresodetallesAux.add(cajaingresodetalleAux);
					}		
				}
				this.iIdNuevoCajaIngresoDetalle=0L;
				this.cajaingresodetalles.removeAll(cajaingresodetallesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajaIngresoDetalle 
					&& this.cajaingresodetalleLogic.getCajaIngresoDetalles().size()>0
					) {
					cajaingresodetalleAux=this.cajaingresodetalleLogic.getCajaIngresoDetalles().get(this.cajaingresodetalleLogic.getCajaIngresoDetalles().size() - 1);
				
					if(cajaingresodetalleAux.getId()<0) {
						this.cajaingresodetalleLogic.getCajaIngresoDetalles().remove(cajaingresodetalleAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajaIngresoDetalle && this.cajaingresodetalles.size()>0) {
					cajaingresodetalleAux=this.cajaingresodetalles.get(this.cajaingresodetalles.size() - 1);
				
					if(cajaingresodetalleAux.getId()<0) {
						this.cajaingresodetalles.remove(cajaingresodetalleAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajaIngresoDetalle(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajaingresodetalle.getId()<0) {
				this.cajaingresodetalleLogic.getCajaIngresoDetalles().remove(this.cajaingresodetalle);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajaingresodetalle.getId()<0) {
				this.cajaingresodetalles.remove(this.cajaingresodetalle);
			}
		}			
	}
	
	public void setEstadosInicialesCajaIngresoDetalle(List<CajaIngresoDetalle> cajaingresodetallesAux) throws Exception {
		CajaIngresoDetalleConstantesFunciones.setEstadosInicialesCajaIngresoDetalle(cajaingresodetallesAux);
	}
	
	public void setEstadosInicialesCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalleAux) throws Exception {
		CajaIngresoDetalleConstantesFunciones.setEstadosInicialesCajaIngresoDetalle(cajaingresodetalleAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajaIngresoDetalleActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajaIngresoDetalleActual()) {
				if(!this.isEsNuevoCajaIngresoDetalle) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajaIngresoDetalle=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajaIngresoDetalleActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Caja Ingreso Detalle ?", "MANTENIMIENTO DE Caja Ingreso Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CajaIngresoDetalle cajaingresodetalle) throws Exception {
		CajaIngresoDetalleConstantesFunciones.seleccionarAsignar(this.cajaingresodetalle,cajaingresodetalle);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajaIngresoDetalle=this.isPermisoActualizarOriginalCajaIngresoDetalle;
			
			
			this.seleccionarAsignar(cajaingresodetalle);
			
			

			idClienteActual=cajaingresodetalle.getid_cliente();
			this.seleccionarClienteActual();

			idFacturaActual=cajaingresodetalle.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaIngresoDetalleConstantesFunciones.quitarEspaciosCajaIngresoDetalle(this.cajaingresodetalle,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajaingresodetalleSessionBean.setsFuncionBusquedaRapida(this.cajaingresodetalleSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	public void seleccionarFacturaActual() throws Exception {
		try	{
			Factura facturaAux=new Factura();

			if(this.idFacturaActual != null && this.idFacturaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(this.idFacturaActual);
					facturaAux= facturaLogic.getFactura();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				facturasForeignKey=new ArrayList<Factura>();
				facturasForeignKey.add(facturaAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCajaIngresoDetalle) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajaIngresoDetalle(esParaCancelar);				
				this.cancelarNuevoCajaIngresoDetalle(esParaCancelar);								
			}
			
			this.cajaingresodetalle=new CajaIngresoDetalle();
			
			this.inicializarCajaIngresoDetalle();
			
			this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajaIngresoDetalle() throws Exception {
		try {
			CajaIngresoDetalleConstantesFunciones.inicializarCajaIngresoDetalle(this.cajaingresodetalle);
			
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
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajaingresodetalleLogic.getCajaIngresoDetalles().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajaIngresoDetalles(String sAccionBusqueda,List<CajaIngresoDetalle> cajaingresodetallesParaReportes) throws Exception {
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
					sPathReporteFinal="CajaIngresoDetalle"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajaIngresoDetalleMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajaIngresoDetalleMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CajaIngresoDetalle"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Caja Ingreso Detalles");		
		parameters.put("busquedapor", CajaIngresoDetalleConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajaIngresoDetalle=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajaIngresoDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajaIngresoDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajaIngresoDetalle=new JRBeanArrayDataSource(CajaIngresoDetalleJInternalFrame.TraerCajaIngresoDetalleBeans(cajaingresodetallesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajaIngresoDetalle);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajaIngresoDetalleConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajaIngresoDetalleConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajaIngresoDetalleBean.TraerCajaIngresoDetalleBeans(cajaingresodetallesParaReportes).toArray()));
							
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
				this.generarExcelReporteCajaIngresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaingresodetallesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajaIngresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaingresodetallesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajaIngresoDetalleActionPerformed(null);
					//this.generarExcelReporteCajaIngresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaingresodetallesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajaIngresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaingresodetallesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajaIngresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaingresodetallesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajaIngresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaingresodetallesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajaIngresoDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaIngresoDetalle> cajaingresodetallesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingresodetalle";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaIngresoDetalles");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaIngresoDetalle("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CajaIngresoDetalle cajaingresodetalle : cajaingresodetallesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajaIngresoDetalleConstantesFunciones.generarExcelReporteDataCajaIngresoDetalle("NORMAL",row,workbook,cajaingresodetalle,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajaIngresoDetalle(String sTipo,Row row,Workbook workbook) {
		
		CajaIngresoDetalleConstantesFunciones.generarExcelReporteHeaderCajaIngresoDetalle(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajaIngresoDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaIngresoDetalle> cajaingresodetallesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingresodetalle_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaIngresoDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CajaIngresoDetalle cajaingresodetalle : cajaingresodetallesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajaIngresoDetalleConstantesFunciones.getCajaIngresoDetalleDescripcion(cajaingresodetalle));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingresodetalle.getcajaingreso_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingresodetalle.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingresodetalle.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingresodetalle.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingresodetalle.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingresodetalle.getconcepto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaIngresoDetalleConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaingresodetalle.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajaIngresoDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaIngresoDetalle> cajaingresodetallesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CajaIngresoDetalle> cajaingresodetallesRespaldo=null;
		
		classes=CajaIngresoDetalleConstantesFunciones.getClassesRelationshipsOfCajaIngresoDetalle(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajaingresodetalleLogic.setDatosCliente(this.datosCliente);
		this.cajaingresodetalleLogic.setDatosDeep(this.datosDeep);
		this.cajaingresodetalleLogic.setIsConDeep(true);
		
		cajaingresodetallesRespaldo=this.cajaingresodetalleLogic.getCajaIngresoDetalles();
		
		this.cajaingresodetalleLogic.setCajaIngresoDetalles(cajaingresodetallesParaReportes);	
		this.cajaingresodetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajaingresodetallesParaReportes=this.cajaingresodetalleLogic.getCajaIngresoDetalles();
		this.cajaingresodetalleLogic.setCajaIngresoDetalles(cajaingresodetallesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingresodetalle_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaIngresoDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaIngresoDetalle("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CajaIngresoDetalle cajaingresodetalle : cajaingresodetallesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajaIngresoDetalle("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajaIngresoDetalleConstantesFunciones.generarExcelReporteDataCajaIngresoDetalle("NORMAL",row,workbook,cajaingresodetalle,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CajaIngresoDetalleConstantesFunciones.getCajaIngresoDetalleDescripcion(cajaingresodetalle));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajaIngresoDetalle() throws Exception {		
		this.startProcessCajaIngresoDetalle(true);
	}
	
	public void startProcessCajaIngresoDetalle(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajaIngresoDetalle ,this.jPanelParametrosReportesCajaIngresoDetalle, this.jScrollPanelDatosCajaIngresoDetalle,this.jPanelPaginacionCajaIngresoDetalle, this.jScrollPanelDatosEdicionCajaIngresoDetalle, this.jPanelAccionesCajaIngresoDetalle,this.jPanelAccionesFormularioCajaIngresoDetalle,this.jmenuBarCajaIngresoDetalle,this.jmenuBarDetalleCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,this.jTtoolBarDetalleCajaIngresoDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaIngresoDetalle=this.jTabbedPaneBusquedasCajaIngresoDetalle; 
		
		final JPanel jPanelParametrosReportesCajaIngresoDetalle=this.jPanelParametrosReportesCajaIngresoDetalle;
		//final JScrollPane jScrollPanelDatosCajaIngresoDetalle=this.jScrollPanelDatosCajaIngresoDetalle;
		final JTable jTableDatosCajaIngresoDetalle=this.jTableDatosCajaIngresoDetalle;		
		final JPanel jPanelPaginacionCajaIngresoDetalle=this.jPanelPaginacionCajaIngresoDetalle;
		//final JScrollPane jScrollPanelDatosEdicionCajaIngresoDetalle=this.jScrollPanelDatosEdicionCajaIngresoDetalle;
		final JPanel jPanelAccionesCajaIngresoDetalle=this.jPanelAccionesCajaIngresoDetalle;
		
		JPanel jPanelCamposAuxiliarCajaIngresoDetalle=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajaIngresoDetalle=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			jPanelCamposAuxiliarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelCamposCajaIngresoDetalle;
			jPanelAccionesFormularioAuxiliarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelAccionesFormularioCajaIngresoDetalle;
		}
		
		final JPanel jPanelCamposCajaIngresoDetalle=jPanelCamposAuxiliarCajaIngresoDetalle;
		final JPanel jPanelAccionesFormularioCajaIngresoDetalle=jPanelAccionesFormularioAuxiliarCajaIngresoDetalle;
		
		
		final JMenuBar jmenuBarCajaIngresoDetalle=this.jmenuBarCajaIngresoDetalle;
		final JToolBar jTtoolBarCajaIngresoDetalle=this.jTtoolBarCajaIngresoDetalle;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajaIngresoDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaIngresoDetalle=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			jmenuBarDetalleAuxiliarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jmenuBarDetalleCajaIngresoDetalle;
			jTtoolBarDetalleAuxiliarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jTtoolBarDetalleCajaIngresoDetalle;
		}
		
		final JMenuBar jmenuBarDetalleCajaIngresoDetalle=jmenuBarDetalleAuxiliarCajaIngresoDetalle;
		final JToolBar jTtoolBarDetalleCajaIngresoDetalle=jTtoolBarDetalleAuxiliarCajaIngresoDetalle;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaIngresoDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaIngresoDetalle;
			processRunnable.jTableDatos=jTableDatosCajaIngresoDetalle;
			processRunnable.jPanelCampos=jPanelCamposCajaIngresoDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaIngresoDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesCajaIngresoDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaIngresoDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarCajaIngresoDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaIngresoDetalle;
			processRunnable.jTtoolBar=jTtoolBarCajaIngresoDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaIngresoDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaIngresoDetalle ,jPanelParametrosReportesCajaIngresoDetalle,jTableDatosCajaIngresoDetalle, /*jScrollPanelDatosCajaIngresoDetalle,*/jPanelCamposCajaIngresoDetalle,jPanelPaginacionCajaIngresoDetalle, /*jScrollPanelDatosEdicionCajaIngresoDetalle,*/ jPanelAccionesCajaIngresoDetalle,jPanelAccionesFormularioCajaIngresoDetalle,jmenuBarCajaIngresoDetalle,jmenuBarDetalleCajaIngresoDetalle,jTtoolBarCajaIngresoDetalle,jTtoolBarDetalleCajaIngresoDetalle);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaIngresoDetalle ,jPanelParametrosReportesCajaIngresoDetalle, jScrollPanelDatosCajaIngresoDetalle,jPanelPaginacionCajaIngresoDetalle, jScrollPanelDatosEdicionCajaIngresoDetalle, jPanelAccionesCajaIngresoDetalle,jPanelAccionesFormularioCajaIngresoDetalle,jmenuBarCajaIngresoDetalle,jmenuBarDetalleCajaIngresoDetalle,jTtoolBarCajaIngresoDetalle,jTtoolBarDetalleCajaIngresoDetalle);
						
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
	
	public void finishProcessCajaIngresoDetalle() {// throws Exception 
		this.finishProcessCajaIngresoDetalle(true);
	}
	
	public void finishProcessCajaIngresoDetalle(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajaIngresoDetalle ,this.jPanelParametrosReportesCajaIngresoDetalle, this.jScrollPanelDatosCajaIngresoDetalle,this.jPanelPaginacionCajaIngresoDetalle, this.jScrollPanelDatosEdicionCajaIngresoDetalle, this.jPanelAccionesCajaIngresoDetalle,this.jPanelAccionesFormularioCajaIngresoDetalle,this.jmenuBarCajaIngresoDetalle,this.jmenuBarDetalleCajaIngresoDetalle,this.jTtoolBarCajaIngresoDetalle,this.jTtoolBarDetalleCajaIngresoDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaIngresoDetalle=this.jTabbedPaneBusquedasCajaIngresoDetalle; 
		
		final JPanel jPanelParametrosReportesCajaIngresoDetalle=this.jPanelParametrosReportesCajaIngresoDetalle;
		//final JScrollPane jScrollPanelDatosCajaIngresoDetalle=this.jScrollPanelDatosCajaIngresoDetalle;
		final JTable jTableDatosCajaIngresoDetalle=this.jTableDatosCajaIngresoDetalle;		
		final JPanel jPanelPaginacionCajaIngresoDetalle=this.jPanelPaginacionCajaIngresoDetalle;
		//final JScrollPane jScrollPanelDatosEdicionCajaIngresoDetalle=this.jScrollPanelDatosEdicionCajaIngresoDetalle;
		final JPanel jPanelAccionesCajaIngresoDetalle=this.jPanelAccionesCajaIngresoDetalle;
		
		JPanel jPanelCamposAuxiliarCajaIngresoDetalle=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajaIngresoDetalle=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			jPanelCamposAuxiliarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelCamposCajaIngresoDetalle;
			jPanelAccionesFormularioAuxiliarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelAccionesFormularioCajaIngresoDetalle;
		}
		
		final JPanel jPanelCamposCajaIngresoDetalle=jPanelCamposAuxiliarCajaIngresoDetalle;
		final JPanel jPanelAccionesFormularioCajaIngresoDetalle=jPanelAccionesFormularioAuxiliarCajaIngresoDetalle;
		
		
		final JMenuBar jmenuBarCajaIngresoDetalle=this.jmenuBarCajaIngresoDetalle;		
		final JToolBar jTtoolBarCajaIngresoDetalle=this.jTtoolBarCajaIngresoDetalle;
				
		JMenuBar jmenuBarDetalleAuxiliarCajaIngresoDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaIngresoDetalle=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			jmenuBarDetalleAuxiliarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jmenuBarDetalleCajaIngresoDetalle;
			jTtoolBarDetalleAuxiliarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jTtoolBarDetalleCajaIngresoDetalle;		
		}
		
		final JMenuBar jmenuBarDetalleCajaIngresoDetalle=jmenuBarDetalleAuxiliarCajaIngresoDetalle;
		final JToolBar jTtoolBarDetalleCajaIngresoDetalle=jTtoolBarDetalleAuxiliarCajaIngresoDetalle;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaIngresoDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaIngresoDetalle;
			processRunnable.jTableDatos=jTableDatosCajaIngresoDetalle;
			processRunnable.jPanelCampos=jPanelCamposCajaIngresoDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaIngresoDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesCajaIngresoDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaIngresoDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarCajaIngresoDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaIngresoDetalle;
			processRunnable.jTtoolBar=jTtoolBarCajaIngresoDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaIngresoDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajaIngresoDetalle ,jPanelParametrosReportesCajaIngresoDetalle, jTableDatosCajaIngresoDetalle,/*jScrollPanelDatosCajaIngresoDetalle,*/jPanelCamposCajaIngresoDetalle,jPanelPaginacionCajaIngresoDetalle, /*jScrollPanelDatosEdicionCajaIngresoDetalle,*/ jPanelAccionesCajaIngresoDetalle,jPanelAccionesFormularioCajaIngresoDetalle,jmenuBarCajaIngresoDetalle,jmenuBarDetalleCajaIngresoDetalle,jTtoolBarCajaIngresoDetalle,jTtoolBarDetalleCajaIngresoDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajaIngresoDetalle(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajaIngresoDetalle(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajaIngresoDetalle(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajaIngresoDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajaIngresoDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajaIngresoDetalle,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajaIngresoDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajaIngresoDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajaIngresoDetalle,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajaingresodetalleConstantesFunciones.getsFinalQueryCajaIngresoDetalle();
		String  finalQueryPaginacionTodos=this.cajaingresodetalleConstantesFunciones.getsFinalQueryCajaIngresoDetalle();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CajaIngresoDetalleConstantesFunciones.getArrayColumnasGlobalesNoCajaIngresoDetalle(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajaIngresoDetalleConstantesFunciones.getArrayColumnasGlobalesCajaIngresoDetalle(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajaIngresoDetalleConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajaingresodetallesEliminados= new ArrayList<CajaIngresoDetalle>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajaIngresoDetalle();
		
				///*CajaIngresoDetalleSessionBean*/this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			
			if(this.cajaingresodetalleSessionBean==null) {
				this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
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
					this.iNumeroPaginacion=CajaIngresoDetalleConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajaIngresoDetalleConstantesFunciones.getClassesForeignKeysOfCajaIngresoDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajaingresodetalle."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajaingresodetallesAux= new ArrayList<CajaIngresoDetalle>();
			
				
			cajaingresodetalleLogic.setDatosCliente(this.datosCliente);
			cajaingresodetalleLogic.setDatosDeep(this.datosDeep);
			cajaingresodetalleLogic.setIsConDeep(true);
			
			
			cajaingresodetalleLogic.getCajaIngresoDetalleDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cajaingresodetalleLogic.getTodosCajaIngresoDetalles(finalQueryGlobal,pagination);
					
					//cajaingresodetalleLogic.getTodosCajaIngresoDetallesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cajaingresodetalleLogic.getCajaIngresoDetalles()==null|| cajaingresodetalleLogic.getCajaIngresoDetalles().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaingresodetallesAux= new ArrayList<CajaIngresoDetalle>();
							cajaingresodetallesAux.addAll(cajaingresodetalleLogic.getCajaIngresoDetalles());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetallesAux= new ArrayList<CajaIngresoDetalle>();
							cajaingresodetallesAux.addAll(cajaingresodetalles);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaingresodetalleLogic.getTodosCajaIngresoDetalles(finalQueryGlobal+"",this.pagination);												
							
							//cajaingresodetalleLogic.getTodosCajaIngresoDetallesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCajaIngresoDetalles("Todos",cajaingresodetalleLogic.getCajaIngresoDetalles() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());					
							cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(cajaingresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetalles=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetalles.addAll(cajaingresodetallesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCajaIngresoDetalle=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCajaIngresoDetalle=this.idActual;
				
				} else if(this.idCajaIngresoDetalleActual!=null && this.idCajaIngresoDetalleActual!=0L) {
					idCajaIngresoDetalle=idCajaIngresoDetalleActual;
				}
				
					
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndicePorId(idCajaIngresoDetalle);
				
				this.cajaingresodetalles=new ArrayList<CajaIngresoDetalle>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cajaingresodetalleLogic.getEntity(idCajaIngresoDetalle);
					
					//cajaingresodetalleLogic.getEntityWithConnection(idCajaIngresoDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
					cajaingresodetalleLogic.getCajaIngresoDetalles().add(cajaingresodetalleLogic.getCajaIngresoDetalle());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingresodetalles=new ArrayList<CajaIngresoDetalle>();
					this.cajaingresodetalles.add(cajaingresodetalle);
				}
				
				if(cajaingresodetalleLogic.getCajaIngresoDetalle()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCajaIngreso")) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaIngreso(id_caja_ingresoFK_IdCajaIngreso);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdCajaIngreso(finalQueryGlobal,pagination,id_caja_ingresoFK_IdCajaIngreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaIngreso(id_caja_ingresoFK_IdCajaIngreso);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaIngreso(id_caja_ingresoFK_IdCajaIngreso);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresodetalleLogic.getCajaIngresoDetalles()==null||cajaingresodetalleLogic.getCajaIngresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresodetalles==null|| cajaingresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
						cajaingresodetallesAux.addAll(cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetallesAux.addAll(cajaingresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdCajaIngreso(finalQueryGlobal,pagination,id_caja_ingresoFK_IdCajaIngreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaIngreso(id_caja_ingresoFK_IdCajaIngreso);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaIngreso(id_caja_ingresoFK_IdCajaIngreso);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresoDetalles("FK_IdCajaIngreso",cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresoDetalles("FK_IdCajaIngreso",cajaingresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
						cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(cajaingresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetalles=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetalles.addAll(cajaingresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresodetalleLogic.getCajaIngresoDetalles()==null||cajaingresodetalleLogic.getCajaIngresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresodetalles==null|| cajaingresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
						cajaingresodetallesAux.addAll(cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetallesAux.addAll(cajaingresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresoDetalles("FK_IdCliente",cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresoDetalles("FK_IdCliente",cajaingresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
						cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(cajaingresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetalles=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetalles.addAll(cajaingresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresodetalleLogic.getCajaIngresoDetalles()==null||cajaingresodetalleLogic.getCajaIngresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresodetalles==null|| cajaingresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
						cajaingresodetallesAux.addAll(cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetallesAux.addAll(cajaingresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresoDetalles("FK_IdEmpresa",cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresoDetalles("FK_IdEmpresa",cajaingresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
						cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(cajaingresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetalles=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetalles.addAll(cajaingresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresodetalleLogic.getCajaIngresoDetalles()==null||cajaingresodetalleLogic.getCajaIngresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresodetalles==null|| cajaingresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
						cajaingresodetallesAux.addAll(cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetallesAux.addAll(cajaingresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresoDetalles("FK_IdFactura",cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresoDetalles("FK_IdFactura",cajaingresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
						cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(cajaingresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetalles=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetalles.addAll(cajaingresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaingresodetalleLogic.getCajaIngresoDetalles()==null||cajaingresodetalleLogic.getCajaIngresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaingresodetalles==null|| cajaingresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
						cajaingresodetallesAux.addAll(cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetallesAux=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetallesAux.addAll(cajaingresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaIngresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaIngresoDetalles("FK_IdSucursal",cajaingresodetalleLogic.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaIngresoDetalles("FK_IdSucursal",cajaingresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleLogic.setCajaIngresoDetalles(new ArrayList<CajaIngresoDetalle>());
						cajaingresodetalleLogic.getCajaIngresoDetalles().addAll(cajaingresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetalles=new ArrayList<CajaIngresoDetalle>();
							cajaingresodetalles.addAll(cajaingresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajaIngresoDetalle();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajaIngresoDetalle();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajaingresodetalleLogic.getCajaIngresoDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaingresodetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajaingresodetalleLogic.getCajaIngresoDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaingresodetalles.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CajaIngresoDetalle cajaingresodetalle) {
		Boolean permite=true;
		
		if(this.cajaingresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajaIngresoDetalleConstantesFunciones.getOrderByListaCajaIngresoDetalle();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajaIngresoDetalleConstantesFunciones.getOrderByListaCajaIngresoDetalle();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetalleLogic.getCajaIngresoDetalles()) {
				if(cajaingresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					cajaingresodetalleTotales=cajaingresodetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngresoDetalle cajaingresodetalle:this.cajaingresodetalles) {
				if(cajaingresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					cajaingresodetalleTotales=cajaingresodetalle;
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
			this.cajaingresodetalleAux=new CajaIngresoDetalle();
			this.cajaingresodetalleAux.setsType(Constantes2.S_TOTALES);
			this.cajaingresodetalleAux.setIsNew(false);
			this.cajaingresodetalleAux.setIsChanged(false);
			this.cajaingresodetalleAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CajaIngresoDetalleConstantesFunciones.TotalizarValoresFilaCajaIngresoDetalle(this.cajaingresodetalleLogic.getCajaIngresoDetalles(),this.cajaingresodetalleAux);
				
				this.cajaingresodetalleLogic.getCajaIngresoDetalles().add(this.cajaingresodetalleAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajaIngresoDetalleConstantesFunciones.TotalizarValoresFilaCajaIngresoDetalle(this.cajaingresodetalles,this.cajaingresodetalleAux);
				
				this.cajaingresodetalles.add(this.cajaingresodetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajaingresodetalleTotales=new CajaIngresoDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajaingresodetalleLogic.getCajaIngresoDetalles().remove(cajaingresodetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajaingresodetalles.remove(cajaingresodetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajaingresodetalleTotales=new CajaIngresoDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetalleLogic.getCajaIngresoDetalles()) {
				if(cajaingresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					cajaingresodetalleTotales=cajaingresodetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaIngresoDetalleConstantesFunciones.TotalizarValoresFilaCajaIngresoDetalle(this.cajaingresodetalleLogic.getCajaIngresoDetalles(),cajaingresodetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaIngresoDetalle cajaingresodetalle:this.cajaingresodetalles) {
				if(cajaingresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					cajaingresodetalleTotales=cajaingresodetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaIngresoDetalleConstantesFunciones.TotalizarValoresFilaCajaIngresoDetalle(this.cajaingresodetalles,cajaingresodetalleTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajaIngresoDetallesFK_IdCajaIngreso()throws Exception {
		try {
			sAccionBusqueda="FK_IdCajaIngreso";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaIngresoDetallesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaIngresoDetallesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaIngresoDetallesFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaIngresoDetallesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajaIngresoDetallesFK_IdCajaIngreso(String sFinalQuery,Long id_caja_ingreso)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdCajaIngreso(sFinalQuery,this.pagination,id_caja_ingreso);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaIngresoDetallesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaIngresoDetallesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaIngresoDetallesFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaIngresoDetallesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresodetalleLogic.getCajaIngresoDetallesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCajaIngresoDetalle() {
		this.isPermisoTodoCajaIngresoDetalle=false;
		this.isPermisoNuevoCajaIngresoDetalle=false;
		this.isPermisoActualizarCajaIngresoDetalle=false;
		this.isPermisoActualizarOriginalCajaIngresoDetalle=false;
		this.isPermisoEliminarCajaIngresoDetalle=false;
		this.isPermisoGuardarCambiosCajaIngresoDetalle=false;
		this.isPermisoConsultaCajaIngresoDetalle=false;
		this.isPermisoBusquedaCajaIngresoDetalle=false;
		this.isPermisoReporteCajaIngresoDetalle=false;		
		this.isPermisoOrdenCajaIngresoDetalle=false;		
		this.isPermisoPaginacionMedioCajaIngresoDetalle=false;		
		this.isPermisoPaginacionAltoCajaIngresoDetalle=false;
		this.isPermisoPaginacionTodoCajaIngresoDetalle=false;
		this.isPermisoCopiarCajaIngresoDetalle=false;		
		this.isPermisoVerFormCajaIngresoDetalle=false;		
		this.isPermisoDuplicarCajaIngresoDetalle=false;		
		this.isPermisoOrdenCajaIngresoDetalle=false;		
	}
	
	public void setPermisosUsuarioCajaIngresoDetalle(Boolean isPermiso) {
		this.isPermisoTodoCajaIngresoDetalle=isPermiso;
		this.isPermisoNuevoCajaIngresoDetalle=isPermiso;
		this.isPermisoActualizarCajaIngresoDetalle=isPermiso;
		this.isPermisoActualizarOriginalCajaIngresoDetalle=isPermiso;
		this.isPermisoEliminarCajaIngresoDetalle=isPermiso;
		this.isPermisoGuardarCambiosCajaIngresoDetalle=isPermiso;
		this.isPermisoConsultaCajaIngresoDetalle=isPermiso;
		this.isPermisoBusquedaCajaIngresoDetalle=isPermiso;
		this.isPermisoReporteCajaIngresoDetalle=isPermiso;
		this.isPermisoOrdenCajaIngresoDetalle=isPermiso;		
		this.isPermisoPaginacionMedioCajaIngresoDetalle=isPermiso;		
		this.isPermisoPaginacionAltoCajaIngresoDetalle=isPermiso;		
		this.isPermisoPaginacionTodoCajaIngresoDetalle=isPermiso;		
		this.isPermisoCopiarCajaIngresoDetalle=isPermiso;		
		this.isPermisoVerFormCajaIngresoDetalle=isPermiso;		
		this.isPermisoDuplicarCajaIngresoDetalle=isPermiso;
		this.isPermisoOrdenCajaIngresoDetalle=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajaIngresoDetalle(Boolean isPermiso) {
		//this.isPermisoTodoCajaIngresoDetalle=isPermiso;
		this.isPermisoNuevoCajaIngresoDetalle=isPermiso;
		this.isPermisoActualizarCajaIngresoDetalle=isPermiso;
		this.isPermisoActualizarOriginalCajaIngresoDetalle=isPermiso;
		this.isPermisoEliminarCajaIngresoDetalle=isPermiso;
		this.isPermisoGuardarCambiosCajaIngresoDetalle=isPermiso;
		//this.isPermisoConsultaCajaIngresoDetalle=isPermiso;
		//this.isPermisoBusquedaCajaIngresoDetalle=isPermiso;
		//this.isPermisoReporteCajaIngresoDetalle=isPermiso;
		//this.isPermisoOrdenCajaIngresoDetalle=isPermiso;		
		//this.isPermisoPaginacionMedioCajaIngresoDetalle=isPermiso;		
		//this.isPermisoPaginacionAltoCajaIngresoDetalle=isPermiso;		
		//this.isPermisoPaginacionTodoCajaIngresoDetalle=isPermiso;		
		//this.isPermisoCopiarCajaIngresoDetalle=isPermiso;		
		//this.isPermisoDuplicarCajaIngresoDetalle=isPermiso;
		//this.isPermisoOrdenCajaIngresoDetalle=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajaIngresoDetalleClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CajaIngresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajaIngresoDetalle(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajaIngresoDetalleClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCajaIngresoDetalleClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajaIngresoDetalleClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajaIngresoDetalleClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCajaIngresoDetalle() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajaIngresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajaIngresoDetalleConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajaIngresoDetalle=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajaIngresoDetalle=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajaIngresoDetalle=this.isPermisoActualizarCajaIngresoDetalle;
			this.isPermisoEliminarCajaIngresoDetalle=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajaIngresoDetalle=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajaIngresoDetalle=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajaIngresoDetalle=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajaIngresoDetalle=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajaIngresoDetalle=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaIngresoDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajaIngresoDetalle=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajaIngresoDetalle=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajaIngresoDetalle=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajaIngresoDetalle=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajaIngresoDetalle=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajaIngresoDetalle=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaIngresoDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajaIngresoDetalle.setToolTipText(this.jTableDatosCajaIngresoDetalle.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajaIngresoDetalle(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajaIngresoDetalle(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajaIngresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CajaIngresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCajaIngresoDetalle() throws Exception {
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
	public void inicializarCombosForeignKeyCajaIngresoDetalleListas()throws Exception {
		try	{						
			
				this.cajaingresosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCajaIngresoDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajaIngresoDetalleJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCajaIngresoDetalleListas(false);
			} else {
			
				this.cargarCombosForeignKeyCajaIngresoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyCajaIngresoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajaingresosForeignKey==null||this.cajaingresosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaIngresoConstantesFunciones.getArrayColumnasGlobalesCajaIngreso(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaIngresoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaIngresoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajaIngresosForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyCajaIngresoDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CajaIngresoDetalleParameterReturnGeneral cajaingresodetalleReturnGeneral=new CajaIngresoDetalleParameterReturnGeneral();
						
			


				String finalQueryGlobalCajaIngreso="";

				if(((this.cajaingresosForeignKey==null||this.cajaingresosForeignKey.size()<=0) && this.cajaingresodetalleConstantesFunciones.cargarid_caja_ingresoCajaIngresoDetalle)
					 || (this.esRecargarFks && this.cajaingresodetalleConstantesFunciones.cargarid_caja_ingresoCajaIngresoDetalle)) {

					if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCajaIngreso()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CajaIngresoConstantesFunciones.getArrayColumnasGlobalesCajaIngreso(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCajaIngreso=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaIngresoConstantesFunciones.TABLENAME);

						finalQueryGlobalCajaIngreso=Funciones.GetFinalQueryAppend(finalQueryGlobalCajaIngreso, "");
						finalQueryGlobalCajaIngreso+=CajaIngresoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCajaIngresosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCajaIngreso=" WHERE " + ConstantesSql.ID + "="+cajaingresodetalleSessionBean.getlidCajaIngresoActual();
					}
				} else {
					finalQueryGlobalCajaIngreso="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cajaingresodetalleConstantesFunciones.cargarid_empresaCajaIngresoDetalle)
					 || (this.esRecargarFks && this.cajaingresodetalleConstantesFunciones.cargarid_empresaCajaIngresoDetalle)) {

					if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cajaingresodetalleSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cajaingresodetalleConstantesFunciones.cargarid_sucursalCajaIngresoDetalle)
					 || (this.esRecargarFks && this.cajaingresodetalleConstantesFunciones.cargarid_sucursalCajaIngresoDetalle)) {

					if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cajaingresodetalleSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.cajaingresodetalleConstantesFunciones.cargarid_clienteCajaIngresoDetalle)
					 || (this.esRecargarFks && this.cajaingresodetalleConstantesFunciones.cargarid_clienteCajaIngresoDetalle)) {

					if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+cajaingresodetalleSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.cajaingresodetalleConstantesFunciones.cargarid_facturaCajaIngresoDetalle)
					 || (this.esRecargarFks && this.cajaingresodetalleConstantesFunciones.cargarid_facturaCajaIngresoDetalle)) {

					if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+cajaingresodetalleSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cajaingresodetalleReturnGeneral=cajaingresodetalleLogic.cargarCombosLoteForeignKeyCajaIngresoDetalle(finalQueryGlobalCajaIngreso,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente,finalQueryGlobalFactura);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCajaIngreso.equals("NONE")) {
				this.cajaingresosForeignKey=cajaingresodetalleReturnGeneral.getcajaingresosForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cajaingresodetalleReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cajaingresodetalleReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=cajaingresodetalleReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=cajaingresodetalleReturnGeneral.getfacturasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCajaIngresoDetalle()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCajaIngreso();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyFactura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCajaIngreso()throws Exception {
		try {
			if(this.cajaingresodetalleSessionBean==null) {
				this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCajaIngreso()) {
				CajaIngreso cajaingreso=new CajaIngreso();
				CajaIngresoConstantesFunciones.setCajaIngresoDescripcion(cajaingreso,Constantes.SMENSAJE_ESCOJA_OPCION);
				cajaingreso.setId(null);

				if(!CajaIngresoConstantesFunciones.ExisteEnLista(this.cajaingresosForeignKey,cajaingreso,true)) {

					this.cajaingresosForeignKey.add(0,cajaingreso);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.cajaingresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyCajaIngresoDetalle()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajaIngresoDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajaIngresoDetalle()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaIngresoDetalle();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle)throws Exception {	
		try {
			
			this.setActualCajaIngresoForeignKey(cajaingresodetalle.getid_caja_ingreso(),false,"Formulario");
			this.setActualClienteForeignKey(cajaingresodetalle.getid_cliente(),false,"Formulario");
			this.setActualFacturaForeignKey(cajaingresodetalle.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cajaingresodetalle.getCliente()!=null && !sTipoEvento.equals("id_clienteCajaIngresoDetalle")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(cajaingresodetalle.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				if(cajaingresodetalle.getFactura()!=null && !sTipoEvento.equals("id_facturaCajaIngresoDetalle")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(cajaingresodetalle.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajaIngresoDetalle()throws Exception {	
		try {
			
			this.setActualCajaIngresoForeignKey(this.cajaingresodetalleConstantesFunciones.getid_caja_ingreso(),false,"Formulario");
			this.setActualClienteForeignKey(this.cajaingresodetalleConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualFacturaForeignKey(this.cajaingresodetalleConstantesFunciones.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajaIngresoDetalle()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajaIngresoDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajaIngresoDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajaIngresoDetalle()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajaIngresoDetalle()throws Exception {
		try {
			

			this.cargarCombosFrameCajaIngresosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCajaIngresoDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCajaIngresosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCajaIngresoDetalle()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CajaIngresoDetalleBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajaIngresoDetalleBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajaIngresoDetalleBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean(); 
		this.cajaingresodetalleConstantesFunciones=new CajaIngresoDetalleConstantesFunciones(); 
		this.cajaingresodetalleBean=new CajaIngresoDetalle();//(this.cajaingresodetalleConstantesFunciones); 		
		this.cajaingresodetalleReturnGeneral=new CajaIngresoDetalleParameterReturnGeneral(); 
		
		this.cajaingresodetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaingresodetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajaIngresoDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajaIngresoDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajaIngresoDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajaIngresoDetalle(true);
			
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
			
			this.cajaingresodetalleConstantesFunciones=new CajaIngresoDetalleConstantesFunciones(); 
			this.cajaingresodetalleBean=new CajaIngresoDetalle();//this.cajaingresodetalleConstantesFunciones); 			
			this.cajaingresodetalleReturnGeneral=new CajaIngresoDetalleParameterReturnGeneral(); 
		
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Ingreso Detalle Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cajaingresodetalle=new CajaIngresoDetalle();
			this.cajaingresodetalles = new ArrayList<CajaIngresoDetalle>();
			this.cajaingresodetallesAux = new ArrayList<CajaIngresoDetalle>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic=new CajaIngresoDetalleLogic();
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.cajaingresodetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajaingresodetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajaIngresoDetalle);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaIngresoDetalle);	
					}
					
					if(this.jInternalFrameImportacionCajaIngresoDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaIngresoDetalle);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajaIngresoDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajaIngresoDetalle);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaIngresoDetalle);
				this.jInternalFrameDetalleFormCajaIngresoDetalle.setVisible(false);
				this.jInternalFrameDetalleFormCajaIngresoDetalle.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaIngresoDetalle);
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setVisible(false);
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajaIngresoDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajaIngresoDetalle);
					this.jInternalFrameImportacionCajaIngresoDetalle.setVisible(false);
					this.jInternalFrameImportacionCajaIngresoDetalle.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajaIngresoDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajaIngresoDetalle);
					this.jInternalFrameOrderByCajaIngresoDetalle.setVisible(false);
					this.jInternalFrameOrderByCajaIngresoDetalle.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajaIngresoDetalleActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajaIngresoDetalleConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cajaingresodetalleReturnGeneral=new CajaIngresoDetalleParameterReturnGeneral();
			
			this.cajaingresodetalleParameterGeneral=new CajaIngresoDetalleParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajaingresodetalleLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CajaIngresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaIngresoDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),this.cajaingresodetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaIngresoDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),this.cajaingresodetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=false;
			this.isVisibilidadCeldaDuplicarCajaIngresoDetalle=true;
			this.isVisibilidadCeldaCopiarCajaIngresoDetalle=true;
			this.isVisibilidadCeldaVerFormCajaIngresoDetalle=true;
			this.isVisibilidadCeldaOrdenCajaIngresoDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=false;
			
			
			this.isVisibilidadFK_IdCajaIngreso=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajaIngresoDetalle();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajaIngresoDetalle(false);
			
			this.setPermisosUsuarioCajaIngresoDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() 
				|| (this.cajaingresodetalleSessionBean.getEsGuardarRelacionado() && this.cajaingresodetalleSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajaIngresoDetalleClasesRelacionadas();
			}
			
			if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajaIngresoDetalleClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajaIngresoDetalle();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajaIngresoDetalle();
			}
			
			if(!this.isPermisoBusquedaCajaIngresoDetalle) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCajaIngresoDetalle,this.isPermisoPaginacionMedioCajaIngresoDetalle,this.isPermisoPaginacionTodoCajaIngresoDetalle);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajaIngresoDetalleConstantesFunciones.getTiposSeleccionarCajaIngresoDetalle());
				
				this.tiposColumnasSelect=CajaIngresoDetalleConstantesFunciones.getTiposSeleccionarCajaIngresoDetalle(true);
				
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
			//if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajaIngresoDetalle();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCajaIngresoDetalle(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCajaIngresoDetalle(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaIngresoDetalle() ;
			
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
			
			this.cajaingresoLogic=new CajaIngresoLogic();
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.clienteLogic=new ClienteLogic();
			this.facturaLogic=new FacturaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				cajaingresodetalleImplementable= (CajaIngresoDetalleImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaIngresoDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajaingresodetalleImplementableHome= (CajaIngresoDetalleImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaIngresoDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajaingresodetalles= new ArrayList<CajaIngresoDetalle>();
			this.cajaingresodetallesEliminados= new ArrayList<CajaIngresoDetalle>();
						
			this.isEsNuevoCajaIngresoDetalle=false;
			this.esParaAccionDesdeFormularioCajaIngresoDetalle=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.cajaingresosForeignKey=new ArrayList<CajaIngreso>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCajaIngresoDetalle(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajaIngresoDetalle();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajaIngresoDetalleConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajaIngresoDetalle(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajaIngresoDetalle();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajaIngresoDetalle();
			}
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajaIngresoDetalle.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajaIngresoDetalle.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajaIngresoDetalle.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajaIngresoDetalle(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CajaIngresoDetalle: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajaIngresoDetalle() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajaIngresoDetalle")) {
				iIndex=this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajaIngresoDetalle();	
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
	
	public void cargarCombosForeignKeyCajaIngresoDetalle(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajaIngresoDetalle(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajaIngresoDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajaIngresoDetalleListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajaIngresoDetalle();
		
		this.cargarCombosFrameForeignKeyCajaIngresoDetalle();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajaIngresoDetalle();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajaIngresoDetalle();
		}
	}
	
	

	public void cargarCombosForeignKeyCajaIngreso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaIngresoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCajaIngreso();
				this.cargarCombosFrameCajaIngresosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCajaIngreso(this.cajaingresosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoCajaIngresoDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
			
			if(jTableDatosCajaIngresoDetalle.getRowCount()>=1) {
				jTableDatosCajaIngresoDetalle.removeRowSelectionInterval(0, jTableDatosCajaIngresoDetalle.getRowCount()-1);						
			}
			
			this.isEsNuevoCajaIngresoDetalle=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajaIngresoDetalle(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajaIngresoDetalle(true);			
			//this.cajaingresodetalle=new CajaIngresoDetalle();
			//this.cajaingresodetalle.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaIngresoDetalle(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle() ;
			
			if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaIngresoDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajaingresodetalle);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);				
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
			if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CajaIngresoDetalle: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajaIngresoDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajaIngresoDetalle.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajaIngresoDetalle.getSelectedRows().length;			
			}
			
			cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajaIngresoDetalle--;			
				//CajaIngresoDetalle cajaingresodetalleAux= new CajaIngresoDetalle();			
				//cajaingresodetalleAux.setId(this.iIdNuevoCajaIngresoDetalle);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CajaIngresoDetalle cajaingresodetalleOrigen=new CajaIngresoDetalle();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CajaIngresoDetalle cajaingresodetalleOrigen : cajaingresodetallesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajaingresodetalleOrigen =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaingresodetalleOrigen =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajaIngresoDetalle();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajaingresodetalle.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajaIngresoDetalle(cajaingresodetalleOrigen,this.cajaingresodetalle,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajaingresodetalleLogic.getCajaIngresoDetalles().add(this.cajaingresodetalleAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalles.add(this.cajaingresodetalleAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
				
				this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(this.getIndiceNuevoCajaIngresoDetalle(), this.getIndiceNuevoCajaIngresoDetalle());
				
				int iLastRow =  this.jTableDatosCajaIngresoDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaIngresoDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaIngresoDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();									
		
			CajaIngresoDetalle cajaingresodetalleOrigen=new CajaIngresoDetalle();
			CajaIngresoDetalle cajaingresodetalleDestino=new CajaIngresoDetalle();
				
			cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajaIngresoDetalle.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajaingresodetallesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajaIngresoDetalle.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleOrigen =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajaingresodetalleOrigen =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaingresodetalleDestino =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajaingresodetalleDestino =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajaingresodetalleOrigen =cajaingresodetallesSeleccionados.get(0);
				cajaingresodetalleDestino =cajaingresodetallesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajaIngresoDetalle(cajaingresodetalleOrigen,cajaingresodetalleDestino,true,false);
				
				cajaingresodetalleDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajaingresodetalleDestino,cajaingresodetalleLogic.getCajaIngresoDetalles());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaingresodetalleDestino,cajaingresodetalles);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
				
				//this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(this.getIndiceNuevoCajaIngresoDetalle(), this.getIndiceNuevoCajaIngresoDetalle());
				
				int iLastRow =  this.jTableDatosCajaIngresoDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaIngresoDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaIngresoDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajaIngresoDetalle.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajaIngresoDetalle.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(!isVisible);
			this.jPanelPaginacionCajaIngresoDetalle.setVisible(!isVisible);
			this.jPanelAccionesCajaIngresoDetalle.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajaIngresoDetalle();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajaIngresoDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajaIngresoDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajaIngresoDetalle();
			
			this.abrirFrameOrderByCajaIngresoDetalle();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajaIngresoDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajaIngresoDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaIngresoDetalle);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajaIngresoDetalle.isMaximum()) {
					this.jInternalFrameDetalleFormCajaIngresoDetalle.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajaIngresoDetalle.setSize(this.jInternalFrameDetalleFormCajaIngresoDetalle.iWidthFormulario,this.jInternalFrameDetalleFormCajaIngresoDetalle.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajaIngresoDetalle.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajaIngresoDetalle.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajaIngresoDetalle.isMaximum()) {
						this.jInternalFrameDetalleFormCajaIngresoDetalle.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jContentPaneDetalleCajaIngresoDetalle.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajaIngresoDetalle.jContentPaneDetalleCajaIngresoDetalle.getWidth(),CajaIngresoDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajaIngresoDetalle.jContentPaneDetalleCajaIngresoDetalle.getWidth(),CajaIngresoDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajaIngresoDetalle.jContentPaneDetalleCajaIngresoDetalle.getWidth(),CajaIngresoDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajaIngresoDetalle.setVisible(true);
	        this.jInternalFrameDetalleFormCajaIngresoDetalle.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajaIngresoDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajaIngresoDetalle==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajaIngresoDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaIngresoDetalle,false,this);
				} else {
					this.jInternalFrameOrderByCajaIngresoDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaIngresoDetalle,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajaIngresoDetalle);
				this.jInternalFrameOrderByCajaIngresoDetalle.setVisible(false);
				this.jInternalFrameOrderByCajaIngresoDetalle.setSelected(false);
				
				this.jInternalFrameOrderByCajaIngresoDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaIngresoDetalle"));
				
				this.inicializarActualizarBindingTablaOrderByCajaIngresoDetalle();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajaIngresoDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajaIngresoDetalle==null) {
				
				this.jInternalFrameImportacionCajaIngresoDetalle=new ImportacionJInternalFrame(CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaIngresoDetalle);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajaIngresoDetalle);
				this.jInternalFrameImportacionCajaIngresoDetalle.setVisible(false);
				this.jInternalFrameImportacionCajaIngresoDetalle.setSelected(false);


				this.jInternalFrameImportacionCajaIngresoDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaIngresoDetalle"));
				this.jInternalFrameImportacionCajaIngresoDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaIngresoDetalle"));
				this.jInternalFrameImportacionCajaIngresoDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaIngresoDetalle"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajaIngresoDetalle() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle==null) {
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle=new ReporteDinamicoJInternalFrame(CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaIngresoDetalle);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaIngresoDetalle);
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setVisible(false);
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaIngresoDetalle"));
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaIngresoDetalle"));
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaIngresoDetalle"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaIngresoDetalle();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCajaIngresoDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaIngresoDetalle);
			
	       	this.jInternalFrameDetalleFormCajaIngresoDetalle.setVisible(false);
	        this.jInternalFrameDetalleFormCajaIngresoDetalle.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajaIngresoDetalle.dispose();
			//this.jInternalFrameDetalleFormCajaIngresoDetalle=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajaIngresoDetalle() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajaIngresoDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajaIngresoDetalle.setVisible(true);
	        this.jInternalFrameImportacionCajaIngresoDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajaIngresoDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajaIngresoDetalle.setVisible(true);
	        this.jInternalFrameOrderByCajaIngresoDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajaIngresoDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajaIngresoDetalle.setVisible(false);
	        this.jInternalFrameOrderByCajaIngresoDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajaIngresoDetalle() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajaIngresoDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajaIngresoDetalle.setVisible(false);
	        this.jInternalFrameImportacionCajaIngresoDetalle.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajaIngresoDetalle(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajaIngresoDetalle(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajaIngresoDetalle(true);
			//this.isEsNuevoCajaIngresoDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaIngresoDetalle(false) ;
			
			if(cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaIngresoDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajaIngresoDetalleActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajaIngresoDetalle(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajaIngresoDetalle(true);
			//this.isEsNuevoCajaIngresoDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajaingresodetalle.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajaIngresoDetalle(false) ;
			
			if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaIngresoDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.cajaingresodetalleConstantesFunciones.cargarid_clienteCajaIngresoDetalle) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
			
			if(sType.equals("Factura")) {
				if(!this.cajaingresodetalleConstantesFunciones.cargarid_facturaCajaIngresoDetalle) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCajaIngreso(List<CajaIngreso> cajaingresosForeignKey)throws Exception{
		TableColumn tableColumnCajaIngreso=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO));
		TableCellEditor tableCellEditorCajaIngreso =tableColumnCajaIngreso.getCellEditor();

		CajaIngresoTableCell cajaingresoTableCellFk=(CajaIngresoTableCell)tableCellEditorCajaIngreso;

		if(cajaingresoTableCellFk!=null) {
			cajaingresoTableCellFk.setcajaingresosForeignKey(cajaingresosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaIngresoDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaingresoTableCellFk.setRowActual(intSelectedRow);
			//cajaingresoTableCellFk.setcajaingresosForeignKeyActual(cajaingresosForeignKey);
		//}


		if(cajaingresoTableCellFk!=null) {
			cajaingresoTableCellFk.RecargarCajaIngresosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaIngresoDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaIngresoDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajaIngresoDetalle(false);
			
			//if(!this.isEsNuevoCajaIngresoDetalle) {								
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				
			}
			
			if(this.permiteMantenimiento(this.cajaingresodetalle)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajaIngresoDetalle=true;
					this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
					this.isEsNuevoCajaIngresoDetalle=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajaIngresoDetalle=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajaIngresoDetalle=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaIngresoDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle(false);
				
				this.habilitarDeshabilitarControlesCajaIngresoDetalle(false);
			
												
				
				if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajaIngresoDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajaIngresoDetalleActionPerformed(evt,cajaingresodetalleSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajaIngresoDetalle(this.cajaingresodetalle,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajaingresodetalleSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajaingresodetalle.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				this.cajaingresodetalle.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				this.cajaingresodetalle.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajaingresodetalle)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajaIngresoDetalleModel) this.jTableDatosCajaIngresoDetalle.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajaIngresoDetalle=true;
				this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
				this.isEsNuevoCajaIngresoDetalle=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaIngresoDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle(false);
				
				this.habilitarDeshabilitarControlesCajaIngresoDetalle(false);
				
				
				
				if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajaIngresoDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajaIngresoDetalle.getRowCount()>=1) {
				jTableDatosCajaIngresoDetalle.removeRowSelectionInterval(0, jTableDatosCajaIngresoDetalle.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajaIngresoDetalle(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaIngresoDetalle(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle(false) ;
			
			this.isEsNuevoCajaIngresoDetalle=false;
			
			if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajaIngresoDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajaIngresoDetalle(false);
				
				//SI ES MANUAL
				if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajaIngresoDetalle();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajaIngresoDetalle--;			
			//CajaIngresoDetalle cajaingresodetalleAux= new CajaIngresoDetalle();			
			//cajaingresodetalleAux.setId(this.iIdNuevoCajaIngresoDetalle);
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajaIngresoDetalle();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
			
			this.cajaingresodetalle.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajaingresodetalleLogic.getCajaIngresoDetalles().add(this.cajaingresodetalleAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajaingresodetalles.add(this.cajaingresodetalleAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
			
			this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(this.getIndiceNuevoCajaIngresoDetalle(), this.getIndiceNuevoCajaIngresoDetalle());
			
			int iLastRow =  this.jTableDatosCajaIngresoDetalle.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajaIngresoDetalle.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajaIngresoDetalle.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaIngresoDetalle(false);
			
			//SI ES MANUAL
			if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaIngresoDetalle();
			}
			
			//this.abrirFrameTreeCajaIngresoDetalle();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Caja Ingreso DetalleS ?", "MANTENIMIENTO DE Caja Ingreso Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCajaIngresoDetalle.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCajaIngresoDetalle();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cajaingresodetalleReturnGeneral=cajaingresodetalleLogic.procesarImportacionCajaIngresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cajaingresodetalleParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCajaIngresoDetalleReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajaIngresoDetalle.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajaIngresoDetalle.setFileImportacion(this.jInternalFrameImportacionCajaIngresoDetalle.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajaIngresoDetalle.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajaIngresoDetalle.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajaIngresoDetalle.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajaIngresoDetalle.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		

		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajaIngresoDetalleBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajaIngresoDetalleBaseDesign.jrxml";
			
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
			
			this.generarReporteCajaIngresoDetalles("Todos",cajaingresodetallesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CajaIngreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CajaIngreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CajaIngreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CajaIngreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ncepto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ncepto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ncepto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ncepto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_VALOR:
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
		
		if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO:
					sNombreCampoCategoria="id_caja_ingreso";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					sNombreCampoCategoria="concepto";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO:
					sNombreCampoCategoriaValor="id_caja_ingreso";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					sNombreCampoCategoriaValor="concepto";
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja Ingreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja_ingreso");
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Concepto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"concepto");
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_VALOR:
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
	
	public void jButtonGenerarExcelReporteDinamicoCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingresodetalle";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CajaIngresoDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO);
					iRow++;

					for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingresodetalle.getcajaingreso_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingresodetalle.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingresodetalle.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingresodetalle.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingresodetalle.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO);
					iRow++;

					for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingresodetalle.getconcepto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaIngresoDetalleConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(CajaIngresoDetalle cajaingresodetalle:cajaingresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaingresodetalle.getvalor());
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
			//	this.getFilaCabeceraExportarExcelCajaIngresoDetalle(row);				
			//	iRow++;
			//}				
			
			//for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetallesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajaIngresoDetalle(cajaingresodetalleAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
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
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaIngresoDetalle(false);
			
			//SI ES MANUAL
			if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaIngresoDetalle();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaIngresoDetalle(false);
			
			//SI ES MANUAL
			if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaIngresoDetalle();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaIngresoDetalle(false);
			
			//SI ES MANUAL
			if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaIngresoDetalle();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajaIngresoDetalle() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajaIngresoDetalle.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajaIngresoDetalle.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajaIngresoDetalle.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajaIngresoDetalle.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajaIngresoDetalle.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajaIngresoDetalle.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajaIngresoDetalle.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajaIngresoDetalle(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajaIngresoDetalle(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajaIngresoDetalle(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajaIngresoDetalle(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajaIngresoDetalle(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajaIngresoDetalle(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaIngresoDetalle(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajaIngresoDetalle(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajaIngresoDetalle() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajaIngresoDetalle();
		
		this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajaIngresoDetalle();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaIngresoDetalle() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajaIngresoDetalle(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajaIngresoDetalle(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajaIngresoDetalle.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajaIngresoDetalle.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajaIngresoDetalle.jCheckBoxPostAccionNuevoCajaIngresoDetalle.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajaIngresoDetalle.jCheckBoxPostAccionSinCerrarCajaIngresoDetalle.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajaIngresoDetalle.jCheckBoxPostAccionSinMensajeCajaIngresoDetalle.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajaIngresoDetalle.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajaIngresoDetalle.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jCheckBoxPostAccionNuevoCajaIngresoDetalle.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jCheckBoxPostAccionSinCerrarCajaIngresoDetalle.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jCheckBoxPostAccionSinMensajeCajaIngresoDetalle.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajaIngresoDetalle.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajaIngresoDetalle.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajaIngresoDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajaIngresoDetalle.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajaIngresoDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajaIngresoDetalle.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajaIngresoDetalle.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajaIngresoDetalle.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajaIngresoDetalle(Boolean esInicializar) throws Exception {
		try	{	
			if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajaIngresoDetalle(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajaIngresoDetalle() throws Exception {
		try	{
			if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaIngresoDetalle();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaIngresoDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaIngresoDetalle() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajaIngresoDetalle.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajaIngresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajaIngresoDetalle.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajaIngresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajaIngresoDetalle.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajaIngresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajaIngresoDetalle.addItem(reporte);
			}
			
			
			if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajaIngresoDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajaIngresoDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajaIngresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajaIngresoDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajaIngresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajaIngresoDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajaIngresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajaIngresoDetalle.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajaIngresoDetalle.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaIngresoDetalle();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaIngresoDetalle() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CajaIngresoDetalleConstantesFunciones.getTiposSeleccionarCajaIngresoDetalle(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CajaIngresoDetalleConstantesFunciones.getTiposSeleccionarCajaIngresoDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CajaIngresoDetalleConstantesFunciones.getTiposSeleccionarCajaIngresoDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajaIngresoDetalle()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.getSelectedItem()!=null){this.id_caja_ingresoFK_IdCajaIngreso=((CajaIngreso)this.jComboBoxid_caja_ingresoFK_IdCajaIngresoCajaIngresoDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteCajaIngresoDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaCajaIngresoDetalle.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajaIngresoDetalle(Boolean esInicializar) throws Exception {				
		if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajaIngresoDetalle();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajaIngresoDetalle() throws Exception {
		this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajaIngresoDetalle() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajaIngresoDetalleOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalleOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajaIngresoDetalle(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajaingresodetalleLogic.getCajaIngresoDetalles().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajaingresodetalles.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajaIngresoDetalle.setModel(new CajaIngresoDetalleModel(this.cajaingresodetalleLogic.getCajaIngresoDetalles(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajaIngresoDetalle.setModel(new CajaIngresoDetalleModel(this.cajaingresodetalles,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajaIngresoDetalle!=null && this.jInternalFrameOrderByCajaIngresoDetalle.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajaIngresoDetalle();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO,cajaingresodetalleConstantesFunciones.resaltarSeleccionarCajaIngresoDetalle,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajaIngresoDetalleConstantesFunciones.SCLASSWEBTITULO,cajaingresodetalleConstantesFunciones.resaltarSeleccionarCajaIngresoDetalle,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_ID));

		if(this.cajaingresodetalleConstantesFunciones.mostraridCajaIngresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoDetalleConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajaingresodetalleConstantesFunciones.resaltaridCajaIngresoDetalle,this.cajaingresodetalleConstantesFunciones.activaridCajaIngresoDetalle,iSizeTabla,this,true,"idCajaIngresoDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaingresodetalleConstantesFunciones.resaltaridCajaIngresoDetalle,this.cajaingresodetalleConstantesFunciones.activaridCajaIngresoDetalle,this,true,"idCajaIngresoDetalle","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO));

		if(this.cajaingresodetalleConstantesFunciones.mostrarid_caja_ingresoCajaIngresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CajaIngresoTableCell(this.cajaingresosForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_caja_ingresoCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_caja_ingresoCajaIngresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new CajaIngresoTableCell(this.cajaingresosForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_caja_ingresoCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_caja_ingresoCajaIngresoDetalle,true,"id_caja_ingresoCajaIngresoDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cajaingresodetalleConstantesFunciones.mostrarid_empresaCajaIngresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_empresaCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_empresaCajaIngresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_empresaCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_empresaCajaIngresoDetalle,false,"id_empresaCajaIngresoDetalle","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cajaingresodetalleConstantesFunciones.mostrarid_sucursalCajaIngresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_sucursalCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_sucursalCajaIngresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_sucursalCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_sucursalCajaIngresoDetalle,false,"id_sucursalCajaIngresoDetalle","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE));

		if(this.cajaingresodetalleConstantesFunciones.mostrarid_clienteCajaIngresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_clienteCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_clienteCajaIngresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_clienteCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_clienteCajaIngresoDetalle,true,"id_clienteCajaIngresoDetalle","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA));

		if(this.cajaingresodetalleConstantesFunciones.mostrarid_facturaCajaIngresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_facturaCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_facturaCajaIngresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.cajaingresodetalleConstantesFunciones.resaltarid_facturaCajaIngresoDetalle,this,this.cajaingresodetalleConstantesFunciones.activarid_facturaCajaIngresoDetalle,true,"id_facturaCajaIngresoDetalle","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO));

		if(this.cajaingresodetalleConstantesFunciones.mostrarconceptoCajaIngresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajaingresodetalleConstantesFunciones.resaltarconceptoCajaIngresoDetalle,this.cajaingresodetalleConstantesFunciones.activarconceptoCajaIngresoDetalle,iSizeTabla,this,true,"conceptoCajaIngresoDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaingresodetalleConstantesFunciones.resaltarconceptoCajaIngresoDetalle,this.cajaingresodetalleConstantesFunciones.activarconceptoCajaIngresoDetalle,this,true,"conceptoCajaIngresoDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,CajaIngresoDetalleConstantesFunciones.LABEL_VALOR));

		if(this.cajaingresodetalleConstantesFunciones.mostrarvalorCajaIngresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaIngresoDetalleConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajaingresodetalleConstantesFunciones.resaltarvalorCajaIngresoDetalle,this.cajaingresodetalleConstantesFunciones.activarvalorCajaIngresoDetalle,iSizeTabla,this,true,"valorCajaIngresoDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaingresodetalleConstantesFunciones.resaltarvalorCajaIngresoDetalle,this.cajaingresodetalleConstantesFunciones.activarvalorCajaIngresoDetalle,this,true,"valorCajaIngresoDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaIngresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaIngresoDetalle.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaIngresoDetalle.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajaIngresoDetalle.addColumn(tableColumn);
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
			
			this.jTableDatosCajaIngresoDetalle.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajaIngresoDetalle.moveColumn(this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajaIngresoDetalle.moveColumn(this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajaIngresoDetalle.moveColumn(this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajaIngresoDetalle.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajaIngresoDetalle.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajaIngresoDetalle,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajaIngresoDetalle.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajaIngresoDetalle.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajaIngresoDetalle.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cajaingresodetalleLogic.getCajaIngresoDetalles().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajaingresodetalles.size()-1;
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
		//this.jTableDatosCajaIngresoDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajaIngresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajaIngresoDetalle();
			
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
				
				//this.isEsNuevoCajaIngresoDetalle=false;
					
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
				if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaIngresoDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaIngresoDetalle.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajaingresodetalle.getsType().equals("DUPLICADO")
				   || this.cajaingresodetalle.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajaIngresoDetalle=true;
				
				} else {
					this.isEsNuevoCajaIngresoDetalle=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
					if(this.cajaingresodetalle.getId()>=0 && !this.cajaingresodetalle.getIsNew()) {						
						this.isEsNuevoCajaIngresoDetalle=false;
						
					} else {
						this.isEsNuevoCajaIngresoDetalle=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajaIngresoDetalle(esRelaciones);						
				
				this.seleccionarCajaIngresoDetalle(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajaingresodetalle.getId()<0) {
					this.isEsNuevoCajaIngresoDetalle=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajaIngresoDetalle(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajaIngresoDetalle(evt,rowIndex);
				}	
				
				if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CajaIngresoDetalle: " + this.dDif); 
					}
				}								
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajaIngresoDetalle(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajaingresodetalle)) {
					if(this.cajaingresodetalle.getId()>0) {
						this.cajaingresodetalle.setIsDeleted(true);
						
						this.cajaingresodetallesEliminados.add(this.cajaingresodetalle);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajaingresodetalleLogic.getCajaIngresoDetalles().remove(this.cajaingresodetalle);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalles.remove(this.cajaingresodetalle);				
					}
					
					
					((CajaIngresoDetalleModel) this.jTableDatosCajaIngresoDetalle.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajaIngresoDetalle(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajaIngresoDetalle) {
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaIngresoDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaIngresoDetalle.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajaIngresoDetalle(this.cajaingresodetalle);
				}
				
				//ARCHITECTURE
				try {
					

					//CajaIngreso
					if(!this.cajaingresodetalleConstantesFunciones.cargarid_caja_ingresoCajaIngresoDetalle || this.cajaingresodetalleConstantesFunciones.event_dependid_caja_ingresoCajaIngresoDetalle) {
						//this.cargarCombosCajaIngresosForeignKeyLista(" where id="+this.cajaingresodetalle.getid_caja_ingreso());
									//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
						this.cajaingresosForeignKey=new ArrayList<CajaIngreso>();

						if(cajaingresodetalle.getCajaIngreso()!=null) {
							this.cajaingresosForeignKey.add(cajaingresodetalle.getCajaIngreso());
						}

						this.addItemDefectoCombosForeignKeyCajaIngreso();
						this.cargarCombosFrameCajaIngresosForeignKey("Todos");
					}
					this.setActualCajaIngresoForeignKey(this.cajaingresodetalle.getid_caja_ingreso(),false,"Formulario");

					//Empresa
					if(!this.cajaingresodetalleConstantesFunciones.cargarid_empresaCajaIngresoDetalle || this.cajaingresodetalleConstantesFunciones.event_dependid_empresaCajaIngresoDetalle) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cajaingresodetalle.getid_empresa());
									//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cajaingresodetalle.getEmpresa()!=null) {
							this.empresasForeignKey.add(cajaingresodetalle.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cajaingresodetalle.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cajaingresodetalleConstantesFunciones.cargarid_sucursalCajaIngresoDetalle || this.cajaingresodetalleConstantesFunciones.event_dependid_sucursalCajaIngresoDetalle) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cajaingresodetalle.getid_sucursal());
									//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cajaingresodetalle.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cajaingresodetalle.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cajaingresodetalle.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.cajaingresodetalleConstantesFunciones.cargarid_clienteCajaIngresoDetalle || this.cajaingresodetalleConstantesFunciones.event_dependid_clienteCajaIngresoDetalle) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.cajaingresodetalle.getid_cliente());
									//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(cajaingresodetalle.getCliente()!=null) {
							this.clientesForeignKey.add(cajaingresodetalle.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.cajaingresodetalle.getid_cliente(),false,"Formulario");

					//Factura
					if(!this.cajaingresodetalleConstantesFunciones.cargarid_facturaCajaIngresoDetalle || this.cajaingresodetalleConstantesFunciones.event_dependid_facturaCajaIngresoDetalle) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.cajaingresodetalle.getid_factura());
									//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(cajaingresodetalle.getFactura()!=null) {
							this.facturasForeignKey.add(cajaingresodetalle.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.cajaingresodetalle.getid_factura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajaIngresoDetalle("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajaIngresoDetalle(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajaIngresoDetalle(cajaingresodetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajaIngresoDetalle(cajaingresodetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajaIngresoDetalle(cajaingresodetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajaIngresoDetalle(cajaingresodetalle);
	}
	
	public void setVariablesObjetoActualToFormularioCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.setText(cajaingresodetalle.getId().toString());
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextAreaconceptoCajaIngresoDetalle.setText(cajaingresodetalle.getconcepto());
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextFieldvalorCajaIngresoDetalle.setText(cajaingresodetalle.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CajaIngresoDetalle cajaingresodetalleLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajaingresodetalleLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CajaIngresoDetalle cajaingresodetalleLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajaingresodetalleLocal=this.cajaingresodetalle;
			} else {
				cajaingresodetalleLocal=this.cajaingresodetalleAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajaingresodetalleLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajaIngresoDetalle(cajaingresodetalleLocal,true);
					
					if(cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajaingresodetalleLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajaingresodetalleLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(cajaingresodetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(cajaingresodetalle);
	}
	
	public void setVariablesFormularioToObjetoActualCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(cajaingresodetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.getText()==null || this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.getText()=="" || this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.getText()=="Id") {
				this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.setText("0");
			}

			if(conColumnasBase) {cajaingresodetalle.setId(Long.parseLong(this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaIngresoDetalleConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelIdCajaIngresoDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaingresodetalle.setconcepto(this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextAreaconceptoCajaIngresoDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelconceptoCajaIngresoDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaingresodetalle.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextFieldvalorCajaIngresoDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaIngresoDetalleConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelvalorCajaIngresoDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalleBean,CajaIngresoDetalle cajaingresodetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cajaingresodetalleBean.getid_caja_ingreso()!=null && !cajaingresodetalleBean.getid_caja_ingreso().equals(-1L))) {cajaingresodetalle.setid_caja_ingreso(cajaingresodetalleBean.getid_caja_ingreso());}
			if(conDefault || (!conDefault && cajaingresodetalleBean.getid_cliente()!=null && !cajaingresodetalleBean.getid_cliente().equals(-1L))) {cajaingresodetalle.setid_cliente(cajaingresodetalleBean.getid_cliente());}
			if(conDefault || (!conDefault && cajaingresodetalleBean.getid_factura()!=null && !cajaingresodetalleBean.getid_factura().equals(-1L))) {cajaingresodetalle.setid_factura(cajaingresodetalleBean.getid_factura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalleOrigen,CajaIngresoDetalle cajaingresodetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajaingresodetalleOrigen.getId()!=null && !cajaingresodetalleOrigen.getId().equals(0L))) {cajaingresodetalle.setId(cajaingresodetalleOrigen.getId());}}
			if(conDefault || (!conDefault && cajaingresodetalleOrigen.getid_caja_ingreso()!=null && !cajaingresodetalleOrigen.getid_caja_ingreso().equals(-1L))) {cajaingresodetalle.setid_caja_ingreso(cajaingresodetalleOrigen.getid_caja_ingreso());}
			if(conDefault || (!conDefault && cajaingresodetalleOrigen.getid_cliente()!=null && !cajaingresodetalleOrigen.getid_cliente().equals(-1L))) {cajaingresodetalle.setid_cliente(cajaingresodetalleOrigen.getid_cliente());}
			if(conDefault || (!conDefault && cajaingresodetalleOrigen.getid_factura()!=null && !cajaingresodetalleOrigen.getid_factura().equals(-1L))) {cajaingresodetalle.setid_factura(cajaingresodetalleOrigen.getid_factura());}
			if(conDefault || (!conDefault && cajaingresodetalleOrigen.getconcepto()!=null && !cajaingresodetalleOrigen.getconcepto().equals(""))) {cajaingresodetalle.setconcepto(cajaingresodetalleOrigen.getconcepto());}
			if(conDefault || (!conDefault && cajaingresodetalleOrigen.getvalor()!=null && !cajaingresodetalleOrigen.getvalor().equals(0.0))) {cajaingresodetalle.setvalor(cajaingresodetalleOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.setText(cajaingresodetalle.getId().toString());
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextAreaconceptoCajaIngresoDetalle.setText(cajaingresodetalle.getconcepto());
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextFieldvalorCajaIngresoDetalle.setText(cajaingresodetalle.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaIngresoDetalle(CajaIngresoDetalleBean cajaingresodetalleBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.setText(cajaingresodetalleBean.getId().toString());
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextAreaconceptoCajaIngresoDetalle.setText(cajaingresodetalleBean.getconcepto());
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextFieldvalorCajaIngresoDetalle.setText(cajaingresodetalleBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajaIngresoDetalle(CajaIngresoDetalleParameterReturnGeneral cajaingresodetalleReturnGeneral,CajaIngresoDetalleBean cajaingresodetalleBean,Boolean conDefault) throws Exception { 
		try {
			CajaIngresoDetalle cajaingresodetalleLocal=new CajaIngresoDetalle();
			
			cajaingresodetalleLocal=cajaingresodetalleReturnGeneral.getCajaIngresoDetalle();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajaingresodetalleLocal.getId()!=null && !cajaingresodetalleLocal.getId().equals(0L))) {cajaingresodetalleBean.setId(cajaingresodetalleLocal.getId());}}
			if(conDefault || (!conDefault && cajaingresodetalleLocal.getid_caja_ingreso()!=null && !cajaingresodetalleLocal.getid_caja_ingreso().equals(-1L))) {cajaingresodetalleBean.setid_caja_ingreso(cajaingresodetalleLocal.getid_caja_ingreso());}
			if(conDefault || (!conDefault && cajaingresodetalleLocal.getid_cliente()!=null && !cajaingresodetalleLocal.getid_cliente().equals(-1L))) {cajaingresodetalleBean.setid_cliente(cajaingresodetalleLocal.getid_cliente());}
			if(conDefault || (!conDefault && cajaingresodetalleLocal.getid_factura()!=null && !cajaingresodetalleLocal.getid_factura().equals(-1L))) {cajaingresodetalleBean.setid_factura(cajaingresodetalleLocal.getid_factura());}
			if(conDefault || (!conDefault && cajaingresodetalleLocal.getconcepto()!=null && !cajaingresodetalleLocal.getconcepto().equals(""))) {cajaingresodetalleBean.setconcepto(cajaingresodetalleLocal.getconcepto());}
			if(conDefault || (!conDefault && cajaingresodetalleLocal.getvalor()!=null && !cajaingresodetalleLocal.getvalor().equals(0.0))) {cajaingresodetalleBean.setvalor(cajaingresodetalleLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajaIngresoDetalleGenerico(Long idCajaIngresoDetalleSeleccionado,JComboBox jComboBoxCajaIngresoDetalle,List<CajaIngresoDetalle> cajaingresodetallesLocal)throws Exception {
		try {
			CajaIngresoDetalle  cajaingresodetalleTemp=null;

			for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetallesLocal) {
				if(cajaingresodetalleAux.getId()!=null && cajaingresodetalleAux.getId().equals(idCajaIngresoDetalleSeleccionado)) {
					cajaingresodetalleTemp=cajaingresodetalleAux;
					break;
				}
			}

			jComboBoxCajaIngresoDetalle.setSelectedItem(cajaingresodetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajaIngresoDetalleGenerico(JComboBox jComboBoxCajaIngresoDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaIngresoDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajaIngresoDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaIngresoDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajaIngresoDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajaIngresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajaIngresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaingresodetalle=(CajaIngresoDetalle) cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajaingresodetalle =(CajaIngresoDetalle) cajaingresodetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("CajaIngreso")) {
			//sDescripcion=this.getActualCajaIngresoForeignKeyDescripcion((Long)value);
			if(!cajaingresodetalle.getIsNew() && !cajaingresodetalle.getIsChanged() && !cajaingresodetalle.getIsDeleted()) {
				sDescripcion=cajaingresodetalle.getcajaingreso_descripcion();
			} else {
				//sDescripcion=this.getActualCajaIngresoForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingresodetalle.getcajaingreso_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajaingresodetalle.getIsNew() && !cajaingresodetalle.getIsChanged() && !cajaingresodetalle.getIsDeleted()) {
				sDescripcion=cajaingresodetalle.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingresodetalle.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cajaingresodetalle.getIsNew() && !cajaingresodetalle.getIsChanged() && !cajaingresodetalle.getIsDeleted()) {
				sDescripcion=cajaingresodetalle.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingresodetalle.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!cajaingresodetalle.getIsNew() && !cajaingresodetalle.getIsChanged() && !cajaingresodetalle.getIsDeleted()) {
				sDescripcion=cajaingresodetalle.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingresodetalle.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!cajaingresodetalle.getIsNew() && !cajaingresodetalle.getIsChanged() && !cajaingresodetalle.getIsDeleted()) {
				sDescripcion=cajaingresodetalle.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=cajaingresodetalle.getfactura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CajaIngresoDetalle cajaingresodetalleRow=new CajaIngresoDetalle();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaingresodetalleRow=(CajaIngresoDetalle) cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajaingresodetalleRow=(CajaIngresoDetalle) cajaingresodetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajaIngresoDetalle(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle));			
			this.jButtonDuplicarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaDuplicarCajaIngresoDetalle && this.isPermisoDuplicarCajaIngresoDetalle));			
			this.jButtonCopiarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaCopiarCajaIngresoDetalle && this.isPermisoCopiarCajaIngresoDetalle));
			this.jButtonVerFormCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaVerFormCajaIngresoDetalle && this.isPermisoVerFormCajaIngresoDetalle));
			
			this.jButtonAbrirOrderByCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaIngresoDetalle && this.isPermisoOrdenCajaIngresoDetalle));			
			
			this.jButtonNuevoRelacionesCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle));			
			this.jButtonNuevoGuardarCambiosCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaModificarCajaIngresoDetalle && this.isPermisoActualizarCajaIngresoDetalle));	
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaActualizarCajaIngresoDetalle && this.isPermisoActualizarCajaIngresoDetalle));	
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaEliminarCajaIngresoDetalle && this.isPermisoEliminarCajaIngresoDetalle));
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarCajaIngresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaIngresoDetalle);							
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle));						
			this.jButtonDuplicarToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaDuplicarCajaIngresoDetalle && this.isPermisoDuplicarCajaIngresoDetalle));						
			this.jButtonCopiarToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaCopiarCajaIngresoDetalle && this.isPermisoCopiarCajaIngresoDetalle));			
			this.jButtonVerFormToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaVerFormCajaIngresoDetalle && this.isPermisoVerFormCajaIngresoDetalle));			
			this.jButtonAbrirOrderByToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaIngresoDetalle && this.isPermisoOrdenCajaIngresoDetalle));
			this.jButtonNuevoRelacionesToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle));			
			this.jButtonNuevoGuardarCambiosToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));			
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaModificarCajaIngresoDetalle && this.isPermisoActualizarCajaIngresoDetalle));	
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaActualizarCajaIngresoDetalle  && this.isPermisoActualizarCajaIngresoDetalle));	
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaEliminarCajaIngresoDetalle && this.isPermisoEliminarCajaIngresoDetalle));
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarToolBarCajaIngresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaIngresoDetalle);				
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle));			
			this.jMenuItemDuplicarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaDuplicarCajaIngresoDetalle && this.isPermisoDuplicarCajaIngresoDetalle));			
			this.jMenuItemCopiarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaCopiarCajaIngresoDetalle && this.isPermisoCopiarCajaIngresoDetalle));			
			this.jMenuItemVerFormCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaVerFormCajaIngresoDetalle && this.isPermisoVerFormCajaIngresoDetalle));			
			this.jMenuItemAbrirOrderByCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaIngresoDetalle && this.isPermisoOrdenCajaIngresoDetalle));			
			//this.jMenuItemMostrarOcultarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaIngresoDetalle && this.isPermisoOrdenCajaIngresoDetalle));
			this.jMenuItemDetalleAbrirOrderByCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaIngresoDetalle && this.isPermisoOrdenCajaIngresoDetalle));			
			//this.jMenuItemDetalleMostrarOcultarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaIngresoDetalle && this.isPermisoOrdenCajaIngresoDetalle));			
			this.jMenuItemNuevoRelacionesCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle));			
			this.jMenuItemNuevoGuardarCambiosCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaIngresoDetalle && this.isPermisoNuevoCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));									
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemModificarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaModificarCajaIngresoDetalle && this.isPermisoActualizarCajaIngresoDetalle));	
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemActualizarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaActualizarCajaIngresoDetalle && this.isPermisoActualizarCajaIngresoDetalle));	
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemEliminarCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaEliminarCajaIngresoDetalle && this.isPermisoEliminarCajaIngresoDetalle));
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemCancelarCajaIngresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaIngresoDetalle);				
			}
			
			this.jMenuItemGuardarCambiosCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));						
			this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=this.jButtonNuevoCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaDuplicarCajaIngresoDetalle=this.jButtonDuplicarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaCopiarCajaIngresoDetalle=this.jButtonCopiarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaVerFormCajaIngresoDetalle=this.jButtonVerFormCajaIngresoDetalle.isVisible();
			
			this.isVisibilidadCeldaOrdenCajaIngresoDetalle=this.jButtonAbrirOrderByCajaIngresoDetalle.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=this.jButtonNuevoRelacionesCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=this.jButtonModificarCajaIngresoDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosCajaIngresoDetalle.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=this.jButtonGuardarCambiosTablaCajaIngresoDetalle.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=this.jButtonNuevoToolBarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=this.jButtonNuevoRelacionesToolBarCajaIngresoDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarToolBarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarToolBarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarToolBarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarToolBarCajaIngresoDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaIngresoDetalle=this.jButtonGuardarCambiosToolBarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=this.jButtonGuardarCambiosTablaToolBarCajaIngresoDetalle.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=this.jMenuItemNuevoCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=this.jMenuItemNuevoRelacionesCajaIngresoDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemModificarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemActualizarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemEliminarCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemCancelarCajaIngresoDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaIngresoDetalle=this.jMenuItemGuardarCambiosCajaIngresoDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajaIngresoDetalle(Boolean esInicializar) {
		if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
				//if(this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajaIngresoDetalle();
			}
			
			this.inicializarActualizarBindingBotonesManualCajaIngresoDetalle(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajaIngresoDetalle() {
		this.jButtonNuevoCajaIngresoDetalle.setVisible(this.isPermisoNuevoCajaIngresoDetalle);			
		this.jButtonDuplicarCajaIngresoDetalle.setVisible(this.isPermisoDuplicarCajaIngresoDetalle);			
		this.jButtonCopiarCajaIngresoDetalle.setVisible(this.isPermisoCopiarCajaIngresoDetalle);			
		this.jButtonVerFormCajaIngresoDetalle.setVisible(this.isPermisoVerFormCajaIngresoDetalle);			
		
		this.jButtonAbrirOrderByCajaIngresoDetalle.setVisible(this.isPermisoOrdenCajaIngresoDetalle);					
		
		this.jButtonNuevoRelacionesCajaIngresoDetalle.setVisible(this.isPermisoNuevoCajaIngresoDetalle);			
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarCajaIngresoDetalle.setVisible(this.isPermisoActualizarCajaIngresoDetalle);	
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarCajaIngresoDetalle.setVisible(this.isPermisoActualizarCajaIngresoDetalle);	
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarCajaIngresoDetalle.setVisible(this.isPermisoEliminarCajaIngresoDetalle);
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarCajaIngresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaIngresoDetalle);						
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosCajaIngresoDetalle.setVisible(this.isPermisoGuardarCambiosCajaIngresoDetalle);							
		}
		
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.setVisible(this.isPermisoActualizarCajaIngresoDetalle);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaIngresoDetalle() {
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarCajaIngresoDetalle.setVisible(this.isPermisoActualizarCajaIngresoDetalle);	
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarCajaIngresoDetalle.setVisible(this.isPermisoActualizarCajaIngresoDetalle);	
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarCajaIngresoDetalle.setVisible(this.isPermisoEliminarCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarCajaIngresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaIngresoDetalle);							
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosCajaIngresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCajaIngresoDetalle && this.isPermisoGuardarCambiosCajaIngresoDetalle));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajaIngresoDetalle() {
		if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajaIngresoDetalle();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajaIngresoDetalle() {
	}
	
	public void jTableDatosCajaIngresoDetalleListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajaIngresoDetalle(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajaIngresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingresodetalle==null) {
						this.cajaingresodetalle = new CajaIngresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				}

				if(this.cajaingresodetalle.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajaingresodetalle.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_caja_ingresoCajaIngresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocajaingreso=true;

			idTienePermisocajaingreso=this.tienePermisosUsuarioEnPaginaWebCajaIngresoDetalle(CajaIngresoConstantesFunciones.CLASSNAME);

			if(idTienePermisocajaingreso) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);

				this.cajaingresoBeanSwingJInternalFrame=new CajaIngresoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaingresoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaingresoBeanSwingJInternalFrame.getCajaIngresoLogic().setConnexion(this.cajaingresodetalleLogic.getConnexion());

				if(this.cajaingresodetalle.getid_caja_ingreso()!=null) {
					this.cajaingresoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaingresoBeanSwingJInternalFrame.setIdActual(this.cajaingresodetalle.getid_caja_ingreso());
					this.cajaingresoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaingresoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaingresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaIngreso();
				}

				JInternalFrameBase jinternalFrame =this.cajaingresoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaIngresoDetalle.getBorder();
				TitledBorder titledBordercajaingreso=(TitledBorder)this.cajaingresoBeanSwingJInternalFrame.jScrollPanelDatosCajaIngreso.getBorder();

				titledBordercajaingreso.setTitle(titledBorderCajaIngresoDetalle.getTitle() + " -> Caja Ingreso");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_caja_ingresoCajaIngresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingresodetalle==null) {
						this.cajaingresodetalle = new CajaIngresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				}

				if(this.cajaingresodetalle.getid_caja_ingreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja_ingreso = "+this.cajaingresodetalle.getid_caja_ingreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajaIngresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajaIngresoDetalle(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajaingresodetalleLogic.getConnexion());

				if(this.cajaingresodetalle.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajaingresodetalle.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaIngresoDetalle.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajaIngresoDetalle.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajaIngresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingresodetalle==null) {
						this.cajaingresodetalle = new CajaIngresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				}

				if(this.cajaingresodetalle.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajaingresodetalle.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCajaIngresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCajaIngresoDetalle(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cajaingresodetalleLogic.getConnexion());

				if(this.cajaingresodetalle.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cajaingresodetalle.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaIngresoDetalle.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCajaIngresoDetalle.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCajaIngresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingresodetalle==null) {
						this.cajaingresodetalle = new CajaIngresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				}

				if(this.cajaingresodetalle.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cajaingresodetalle.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteCajaIngresoDetalleActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCajaIngresoDetalle=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosCajaIngresoDetalle.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCajaIngresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaIngresoDetalle.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCajaIngresoDetalle.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteCajaIngresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebCajaIngresoDetalle(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.cajaingresodetalleLogic.getConnexion());

				if(this.cajaingresodetalle.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.cajaingresodetalle.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaIngresoDetalle.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCajaIngresoDetalle.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteCajaIngresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingresodetalle==null) {
						this.cajaingresodetalle = new CajaIngresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				}

				if(this.cajaingresodetalle.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.cajaingresodetalle.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaCajaIngresoDetalleActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.facturaBeanSwingJInternalFrame.sTipoBusqueda="Factura";

			if(!this.sFinalQueryGeneral_factura.equals("")) {
				this.facturaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_factura);
				this.facturaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.facturaBeanSwingJInternalFrame.procesarBusqueda(this.facturaBeanSwingJInternalFrame.sAccionBusqueda);
				this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingFactura(false);
			}

			if(!this.sFinalQueryComboFactura.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderCajaIngresoDetalle=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosCajaIngresoDetalle.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCajaIngresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaIngresoDetalle.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderCajaIngresoDetalle.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaCajaIngresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebCajaIngresoDetalle(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaIngresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaIngresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.cajaingresodetalleLogic.getConnexion());

				if(this.cajaingresodetalle.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.cajaingresodetalle.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaIngresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaIngresoDetalle.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderCajaIngresoDetalle.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaCajaIngresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingresodetalle==null) {
						this.cajaingresodetalle = new CajaIngresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				}

				if(this.cajaingresodetalle.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.cajaingresodetalle.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonconceptoCajaIngresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingresodetalle==null) {
						this.cajaingresodetalle = new CajaIngresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				}

				if(this.cajaingresodetalle.getconcepto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where concepto like '%"+this.cajaingresodetalle.getconcepto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorCajaIngresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.getcajaingresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaingresodetalle==null) {
						this.cajaingresodetalle = new CajaIngresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);
				}

				if(this.cajaingresodetalle.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.cajaingresodetalle.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaIngresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCajaIngresoCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);

			this.getCajaIngresoDetallesFK_IdCajaIngreso();

			this.inicializarActualizarBindingCajaIngresoDetalle(false);

			//if(CajaIngresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);

			this.getCajaIngresoDetallesFK_IdCliente();

			this.inicializarActualizarBindingCajaIngresoDetalle(false);

			//if(CajaIngresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);

			this.getCajaIngresoDetallesFK_IdEmpresa();

			this.inicializarActualizarBindingCajaIngresoDetalle(false);

			//if(CajaIngresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);

			this.getCajaIngresoDetallesFK_IdFactura();

			this.inicializarActualizarBindingCajaIngresoDetalle(false);

			//if(CajaIngresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCajaIngresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);

			this.getCajaIngresoDetallesFK_IdSucursal();

			this.inicializarActualizarBindingCajaIngresoDetalle(false);

			//if(CajaIngresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaingresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajaIngresoDetalle() {
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajaIngresoDetalle.dispose();
			this.jInternalFrameDetalleFormCajaIngresoDetalle=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
			this.jInternalFrameReporteDinamicoCajaIngresoDetalle.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajaIngresoDetalle.dispose();
			this.jInternalFrameReporteDinamicoCajaIngresoDetalle=null;
		}
		
		if(this.jInternalFrameImportacionCajaIngresoDetalle!=null) {
			this.jInternalFrameImportacionCajaIngresoDetalle.setVisible(false);	    			
			this.jInternalFrameImportacionCajaIngresoDetalle.dispose();
			this.jInternalFrameImportacionCajaIngresoDetalle=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajaIngresoDetalle();
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajaIngresoDetalle")) {
				jButtonNuevoCajaIngresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajaIngresoDetalle")) {
				jButtonDuplicarCajaIngresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajaIngresoDetalle")) {
				jButtonCopiarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajaIngresoDetalle")) {
				jButtonVerFormCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajaIngresoDetalle")) {
				jButtonNuevoCajaIngresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajaIngresoDetalle")) {
				jButtonDuplicarCajaIngresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajaIngresoDetalle")) {
				jButtonNuevoCajaIngresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajaIngresoDetalle")) {
				jButtonDuplicarCajaIngresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajaIngresoDetalle")) {
				jButtonNuevoCajaIngresoDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajaIngresoDetalle")) {
				jButtonNuevoCajaIngresoDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajaIngresoDetalle")) {
				jButtonNuevoCajaIngresoDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajaIngresoDetalle")) {
				jButtonModificarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajaIngresoDetalle")) {
				jButtonModificarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajaIngresoDetalle")) {
				jButtonModificarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajaIngresoDetalle")) {
				jButtonActualizarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajaIngresoDetalle")) {
				jButtonActualizarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajaIngresoDetalle")) {
				jButtonActualizarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajaIngresoDetalle")) {
				jButtonEliminarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajaIngresoDetalle")) {
				jButtonEliminarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajaIngresoDetalle")) {
				jButtonEliminarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajaIngresoDetalle")) {
				jButtonCancelarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajaIngresoDetalle")) {
				jButtonCancelarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajaIngresoDetalle")) {
				jButtonCancelarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajaIngresoDetalle")) {
				jButtonCerrarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajaIngresoDetalle")) {
				jButtonCerrarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajaIngresoDetalle")) {
				jButtonCerrarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajaIngresoDetalle")) {
				jButtonMostrarOcultarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajaIngresoDetalle")) {
				jButtonCancelarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajaIngresoDetalle")) {
				jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajaIngresoDetalle")) {
				jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajaIngresoDetalle")) {
				jButtonCopiarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajaIngresoDetalle")) {
				jButtonVerFormCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajaIngresoDetalle")) {
				jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajaIngresoDetalle")) {
				jButtonCopiarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajaIngresoDetalle")) {
				jButtonVerFormCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajaIngresoDetalle")) {
				jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajaIngresoDetalle")) {
				jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajaIngresoDetalle")) {
				jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajaIngresoDetalle")) {
				jButtonRecargarInformacionCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajaIngresoDetalle")) {
				jButtonRecargarInformacionCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajaIngresoDetalle")) {
				jButtonRecargarInformacionCajaIngresoDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajaIngresoDetalle")) {
				jButtonAnterioresCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajaIngresoDetalle")) {
				jButtonAnterioresCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajaIngresoDetalle")) {
				jButtonAnterioresCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajaIngresoDetalle")) {
				jButtonSiguientesCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajaIngresoDetalle")) {
				jButtonSiguientesCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajaIngresoDetalle")) {
				jButtonSiguientesCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajaIngresoDetalle") || sTipo.equals("MenuItemDetalleAbrirOrderByCajaIngresoDetalle")) {
				jButtonAbrirOrderByCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajaIngresoDetalle") || sTipo.equals("MenuItemDetalleMostrarOcultarCajaIngresoDetalle")) {
				jButtonMostrarOcultarCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajaIngresoDetalle")) {
				jButtonNuevoGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajaIngresoDetalle")) {
				jButtonNuevoGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajaIngresoDetalle")) {
				jButtonNuevoGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajaIngresoDetalle")) {
				jButtonCerrarReporteDinamicoCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajaIngresoDetalle")) {
				jButtonGenerarReporteDinamicoCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajaIngresoDetalle")) {
				
				jButtonGenerarExcelReporteDinamicoCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajaIngresoDetalle")) {
				jButtonCerrarImportacionCajaIngresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajaIngresoDetalle")) {
				
				jButtonGenerarImportacionCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajaIngresoDetalle")) {
				
				jButtonAbrirImportacionCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajaIngresoDetalle")) {
				jComboBoxTiposAccionesCajaIngresoDetalleActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajaIngresoDetalle")) {
				jComboBoxTiposRelacionesCajaIngresoDetalleActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajaIngresoDetalle")) {
				jComboBoxTiposAccionesCajaIngresoDetalleActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajaIngresoDetalle")) {
				
				jComboBoxTiposSeleccionarCajaIngresoDetalleActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajaIngresoDetalle")) {
				jTextFieldValorCampoGeneralCajaIngresoDetalleActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajaIngresoDetalle")) {
				jButtonAbrirOrderByCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajaIngresoDetalle")) {
				jButtonAbrirOrderByCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajaIngresoDetalle")) {
				jButtonCerrarOrderByCajaIngresoDetalleActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaIngresoDetalleBusqueda")) {
				this.jButtonidCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_caja_ingresoCajaIngresoDetalleUpdate")) {
				this.jButtonid_caja_ingresoCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_caja_ingresoCajaIngresoDetalleBusqueda")) {
				this.jButtonid_caja_ingresoCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaIngresoDetalleUpdate")) {
				this.jButtonid_empresaCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaIngresoDetalleBusqueda")) {
				this.jButtonid_empresaCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaIngresoDetalleUpdate")) {
				this.jButtonid_sucursalCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaIngresoDetalleBusqueda")) {
				this.jButtonid_sucursalCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCajaIngresoDetalle")) {
				this.jButtonid_clienteCajaIngresoDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCajaIngresoDetalleUpdate")) {
				this.jButtonid_clienteCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCajaIngresoDetalleBusqueda")) {
				this.jButtonid_clienteCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaCajaIngresoDetalle")) {
				this.jButtonid_facturaCajaIngresoDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaCajaIngresoDetalleUpdate")) {
				this.jButtonid_facturaCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaCajaIngresoDetalleBusqueda")) {
				this.jButtonid_facturaCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("conceptoCajaIngresoDetalleBusqueda")) {
				this.jButtonconceptoCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCajaIngresoDetalleBusqueda")) {
				this.jButtonvalorCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteCajaIngresoDetalle")) {
				this.jButtonid_clienteCajaIngresoDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("id_facturaCajaIngresoDetalle")) {
				this.jButtonid_facturaCajaIngresoDetalleActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCajaIngresoCajaIngresoDetalle")) {
				this.jButtonFK_IdCajaIngresoCajaIngresoDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteCajaIngresoDetalle")) {
				this.jButtonFK_IdClienteCajaIngresoDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaCajaIngresoDetalle")) {
				this.jButtonFK_IdFacturaCajaIngresoDetalleActionPerformed(evt);
			}
			
			;
			
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajaIngresoDetalle();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				


				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CajaIngresoDetalle cajaingresodetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajaingresodetalleLocal=this.cajaingresodetalle;
			} else {
				cajaingresodetalleLocal=this.cajaingresodetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
							
				
				


				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
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
			
			


			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
								
						
				


				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
								
				
				


				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
							
				
				


				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
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
			
			


			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
								
				
				


				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajaIngresoDetalle")) {
					jCheckBoxSeleccionarTodosCajaIngresoDetalleItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajaIngresoDetalle")) {
					jCheckBoxSeleccionadosCajaIngresoDetalleItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajaIngresoDetalle")) {
					
				}
				
				


				
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
												
				
				


				
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoDetalleActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
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
			
			


			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaingresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaingresodetalle);
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
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
				
				


				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaIngresoDetalle.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaIngresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaIngresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaingresodetalleAnterior =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajaIngresoDetalle")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajaIngresoDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajaIngresoDetalle.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajaingresodetalle =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajaingresodetalle);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajaIngresoDetalle")) {
				
				}
				
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajaIngresoDetalle")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajaIngresoDetalle.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajaIngresoDetalle")) {
			
			}
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajaIngresoDetalle();
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
			if(sTipo.equals("NuevoCajaIngresoDetalle")) {
				jButtonNuevoCajaIngresoDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajaIngresoDetalle")) {
				jButtonDuplicarCajaIngresoDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajaIngresoDetalle")) {
				jButtonCopiarCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajaIngresoDetalle")) {
				jButtonVerFormCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajaIngresoDetalle")) {
				jButtonNuevoCajaIngresoDetalleActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajaIngresoDetalle")) {
				jButtonModificarCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajaIngresoDetalle")) {
				jButtonActualizarCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajaIngresoDetalle")) {
				jButtonEliminarCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajaIngresoDetalle")) {
				jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajaIngresoDetalle")) {
				jButtonCancelarCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajaIngresoDetalle")) {
				jButtonCerrarCajaIngresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajaIngresoDetalle")) {
				jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajaIngresoDetalle")) {
				jButtonNuevoGuardarCambiosCajaIngresoDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajaIngresoDetalle")) {
				jButtonAbrirOrderByCajaIngresoDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajaIngresoDetalle")) {
				jButtonRecargarInformacionCajaIngresoDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajaIngresoDetalle")) {
				jButtonAnterioresCajaIngresoDetalleActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajaIngresoDetalle")) {
				jButtonSiguientesCajaIngresoDetalleActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaIngresoDetalleBusqueda")) {
				this.jButtonidCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_caja_ingresoCajaIngresoDetalleUpdate")) {
				this.jButtonid_caja_ingresoCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_caja_ingresoCajaIngresoDetalleBusqueda")) {
				this.jButtonid_caja_ingresoCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaIngresoDetalleUpdate")) {
				this.jButtonid_empresaCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaIngresoDetalleBusqueda")) {
				this.jButtonid_empresaCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaIngresoDetalleUpdate")) {
				this.jButtonid_sucursalCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaIngresoDetalleBusqueda")) {
				this.jButtonid_sucursalCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCajaIngresoDetalle")) {
				this.jButtonid_clienteCajaIngresoDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCajaIngresoDetalleUpdate")) {
				this.jButtonid_clienteCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCajaIngresoDetalleBusqueda")) {
				this.jButtonid_clienteCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaCajaIngresoDetalle")) {
				this.jButtonid_facturaCajaIngresoDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaCajaIngresoDetalleUpdate")) {
				this.jButtonid_facturaCajaIngresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaCajaIngresoDetalleBusqueda")) {
				this.jButtonid_facturaCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("conceptoCajaIngresoDetalleBusqueda")) {
				this.jButtonconceptoCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCajaIngresoDetalleBusqueda")) {
				this.jButtonvalorCajaIngresoDetalleBusquedaActionPerformed(evt);
			}
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajaIngresoDetalle();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajaIngresoDetalle")) {
				closingInternalFrameCajaIngresoDetalle();
				
			} else if(sTipo.equals("jButtonCancelarCajaIngresoDetalle")) {
				JInternalFrameBase jInternalFrameDetalleFormCajaIngresoDetalle = (JInternalFrameBase)evt.getSource();
	            	
	            CajaIngresoDetalleBeanSwingJInternalFrame jInternalFrameParent=(CajaIngresoDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaIngresoDetalle.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajaIngresoDetalleActionPerformed(null);
			}
			
			CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajaingresodetalle,new Object(),this.cajaingresodetalleParameterGeneral,this.cajaingresodetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajaIngresoDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajaIngresoDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajaIngresoDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajaingresodetalle)) {
			if(!esControlTabla) {
				if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);			
				}
				
				if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajaingresodetalleReturnGeneral=cajaingresodetalleLogic.procesarEventosCajaIngresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaingresodetalleLogic.getCajaIngresoDetalles(),this.cajaingresodetalle,this.cajaingresodetalleParameterGeneral,this.isEsNuevoCajaIngresoDetalle,classes);//this.cajaingresodetalleLogic.getCajaIngresoDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral,this.cajaingresodetalleBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajaIngresoDetalle(classes,this.cajaingresodetalleReturnGeneral,this.cajaingresodetalleBean,false);
					}
						
					if(this.cajaingresodetalleReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle());	
					}
						
					if(this.cajaingresodetalleReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle(),classes);//this.cajaingresodetalleBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajaIngresoDetalle(this.cajaingresodetalle,classes);//this.cajaingresodetalleBean);									
				}
			
				if(CajaIngresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajaIngresoDetalle(this.cajaingresodetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaIngresoDetalle(this.cajaingresodetalle);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajaingresodetalleAnterior!=null) {
						this.cajaingresodetalle=this.cajaingresodetalleAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajaingresodetalleReturnGeneral=cajaingresodetalleLogic.procesarEventosCajaIngresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaingresodetalleLogic.getCajaIngresoDetalles(),this.cajaingresodetalle,this.cajaingresodetalleParameterGeneral,this.isEsNuevoCajaIngresoDetalle,classes);//this.cajaingresodetalleLogic.getCajaIngresoDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajaingresodetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajaingresodetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle(),cajaingresodetalleLogic.getCajaIngresoDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle(),this.cajaingresodetalles);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajaIngresoDetalle.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajaIngresoDetalle.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajaIngresoDetalle();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajaIngresoDetalle() throws Exception {
		
		CajaIngresoDetalleModel cajaingresodetalleModel=(CajaIngresoDetalleModel)this.jTableDatosCajaIngresoDetalle.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaingresodetalleModel.cajaingresodetalles=this.cajaingresodetalleLogic.getCajaIngresoDetalles();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajaingresodetalleModel.cajaingresodetalles=this.cajaingresodetalles;
		}
		
		
		((CajaIngresoDetalleModel) this.jTableDatosCajaIngresoDetalle.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajaIngresoDetalle() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajaingresodetalleAnterior(),this.cajaingresodetalleLogic.getCajaIngresoDetalles());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajaingresodetalleAnterior(),this.cajaingresodetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajaIngresoDetalle();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
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
										
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaingresodetalle,new Object(),generalEntityParameterGeneral,this.cajaingresodetalleReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajaIngresoDetalleConstantesFunciones.getClassesRelationshipsOfCajaIngresoDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajaIngresoDetalleConstantesFunciones.getClassesRelationshipsFromStringsOfCajaIngresoDetalle(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajaIngresoDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajaIngresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaingresodetalle,new Object(),generalEntityParameterGeneral,this.cajaingresodetalleReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajaIngresoDetalle(CajaIngresoDetalleBean cajaingresodetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajaIngresoDetalle(ArrayList<Classe> classes,CajaIngresoDetalleReturnGeneral cajaingresodetalleReturnGeneral,CajaIngresoDetalleBean cajaingresodetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cajaingresodetalle)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle = new CajaIngresoDetalleDetalleFormJInternalFrame(jDesktopPane,this.cajaingresodetalleSessionBean.getConGuardarRelaciones(),this.cajaingresodetalleSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.setVisible(false);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.cajaingresodetalleLogic=this.cajaingresodetalleLogic;
		
		this.cargarCombosFrameForeignKeyCajaIngresoDetalle("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaIngresoDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaIngresoDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajaIngresoDetalle("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajaIngresoDetalle();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaIngresoDetalle"));
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"ModificarCajaIngresoDetalle"));

		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarToolBarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaIngresoDetalle"));
					
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemModificarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaIngresoDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"ActualizarCajaIngresoDetalle"));
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarToolBarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaIngresoDetalle"));
						
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemActualizarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaIngresoDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"EliminarCajaIngresoDetalle"));
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaIngresoDetalle"));
								
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemEliminarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaIngresoDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"CancelarCajaIngresoDetalle"));
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaIngresoDetalle"));
					
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemCancelarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaIngresoDetalle"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemDetalleCerrarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaIngresoDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaIngresoDetalle"));
		
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaIngresoDetalle"));
		
		
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaIngresoDetalle"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonidCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_caja_ingresoCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_caja_ingresoCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_empresaCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_empresaCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_sucursalCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_sucursalCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoDetalleBusqueda"));
		//jButtonid_clienteCajaIngresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaIngresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalleBusqueda"));
		//jButtonid_facturaCajaIngresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCajaIngresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonconceptoCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"conceptoCajaIngresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonvalorCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaIngresoDetalleBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaIngresoDetalle"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajaIngresoDetalle"));
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaIngresoDetalle"));
		}
		
		this.jTableDatosCajaIngresoDetalle.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajaIngresoDetalle"));
		
		this.jTableDatosCajaIngresoDetalle.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajaIngresoDetalle"));
		
		this.jButtonNuevoCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"NuevoCajaIngresoDetalle"));
		
		this.jButtonDuplicarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"DuplicarCajaIngresoDetalle"));
		
		this.jButtonCopiarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"CopiarCajaIngresoDetalle"));
		
		this.jButtonVerFormCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"VerFormCajaIngresoDetalle"));
		
		
		this.jButtonNuevoToolBarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajaIngresoDetalle"));
			
		this.jButtonDuplicarToolBarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajaIngresoDetalle"));
			
		this.jMenuItemNuevoCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajaIngresoDetalle"));
			
		this.jMenuItemDuplicarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajaIngresoDetalle"));		
		
		
		this.jButtonNuevoRelacionesCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajaIngresoDetalle"));
		
		
		this.jButtonNuevoRelacionesToolBarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajaIngresoDetalle"));
			
		this.jMenuItemNuevoRelacionesCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajaIngresoDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"ModificarCajaIngresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonModificarToolBarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaIngresoDetalle"));
			
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemModificarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaIngresoDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"ActualizarCajaIngresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonActualizarToolBarCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaIngresoDetalle"));
				
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemActualizarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaIngresoDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"EliminarCajaIngresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonEliminarToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaIngresoDetalle"));
						
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemEliminarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaIngresoDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"CancelarCajaIngresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonCancelarToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaIngresoDetalle"));
			
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemCancelarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaIngresoDetalle"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajaIngresoDetalle"));		
		
		
		this.jButtonCerrarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"CerrarCajaIngresoDetalle"));
		
		
		this.jButtonCerrarToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajaIngresoDetalle"));
			
		this.jMenuItemCerrarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajaIngresoDetalle"));
			
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jMenuItemDetalleCerrarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaIngresoDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajaIngresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaIngresoDetalle"));
		}
		
		this.jButtonCopiarToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajaIngresoDetalle"));
			
		this.jButtonVerFormToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajaIngresoDetalle"));
		
		this.jMenuItemGuardarCambiosCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajaIngresoDetalle"));
			
		this.jMenuItemCopiarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajaIngresoDetalle"));		
		
		this.jMenuItemVerFormCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajaIngresoDetalle"));		
		
		
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaIngresoDetalle"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajaIngresoDetalle"));
			
		this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaIngresoDetalle"));		
		
		
		
		this.jButtonRecargarInformacionCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajaIngresoDetalle"));
					
		this.jButtonRecargarInformacionToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajaIngresoDetalle"));
		
		this.jMenuItemRecargarInformacionCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajaIngresoDetalle"));		
		
		
		
		this.jButtonAnterioresCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"AnterioresCajaIngresoDetalle"));
		
		
		this.jButtonAnterioresToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajaIngresoDetalle"));
		
		this.jMenuItemAnterioresCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajaIngresoDetalle"));		
		
		
		this.jButtonSiguientesCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"SiguientesCajaIngresoDetalle"));
		
		
		this.jButtonSiguientesToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajaIngresoDetalle"));
			
		this.jMenuItemSiguientesCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajaIngresoDetalle"));
			
		this.jMenuItemAbrirOrderByCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajaIngresoDetalle"));
			
		this.jMenuItemMostrarOcultarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajaIngresoDetalle"));
			
		this.jMenuItemDetalleAbrirOrderByCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajaIngresoDetalle"));
			
		this.jMenuItemDetalleMostarOcultarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajaIngresoDetalle"));		
		
		
		this.jButtonNuevoGuardarCambiosCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajaIngresoDetalle"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajaIngresoDetalle"));
			
		this.jMenuItemNuevoGuardarCambiosCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajaIngresoDetalle"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajaIngresoDetalle"));

		this.jCheckBoxSeleccionadosCajaIngresoDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajaIngresoDetalle"));
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaIngresoDetalle"));
		}
		
		
		this.jComboBoxTiposRelacionesCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajaIngresoDetalle"));
			
		this.jComboBoxTiposAccionesCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesCajaIngresoDetalle"));
					
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajaIngresoDetalle"));
			
		this.jTextFieldValorCampoGeneralCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajaIngresoDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonidCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_caja_ingresoCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_caja_ingresoCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_empresaCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_empresaCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_sucursalCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_sucursalCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoDetalleBusqueda"));
		//jButtonid_clienteCajaIngresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaIngresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalleBusqueda"));
		//jButtonid_facturaCajaIngresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCajaIngresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonconceptoCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"conceptoCajaIngresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonvalorCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaIngresoDetalleBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCajaIngresoCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdCajaIngresoCajaIngresoDetalle"));

			this.jButtonFK_IdClienteCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdClienteCajaIngresoDetalle"));

			this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalle"));

			this.jButtonFK_IdFacturaCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdFacturaCajaIngresoDetalle"));

			this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalle"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajaIngresoDetalle!=null) {
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaIngresoDetalle"));
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaIngresoDetalle"));
				this.jInternalFrameReporteDinamicoCajaIngresoDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaIngresoDetalle"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaIngresoDetalle"));				
			//this.jButtonGenerarReporteDinamicoCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaIngresoDetalle"));
			//this.jButtonGenerarExcelReporteDinamicoCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaIngresoDetalle"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajaIngresoDetalle!=null) {
				this.jInternalFrameImportacionCajaIngresoDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaIngresoDetalle"));
				this.jInternalFrameImportacionCajaIngresoDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaIngresoDetalle"));
				this.jInternalFrameImportacionCajaIngresoDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaIngresoDetalle"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajaIngresoDetalle"));
			
			this.jButtonAbrirOrderByToolBarCajaIngresoDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajaIngresoDetalle"));			
			
			if(this.jInternalFrameOrderByCajaIngresoDetalle!=null) {
				this.jInternalFrameOrderByCajaIngresoDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaIngresoDetalle"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jTabbedPaneRelacionesCajaIngresoDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaIngresoDetalle"));
		
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
            		closingInternalFrameCajaIngresoDetalle();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajaIngresoDetalle = (JInternalFrameBase)event.getSource();
	            	
	            CajaIngresoDetalleBeanSwingJInternalFrame jInternalFrameParent=(CajaIngresoDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaIngresoDetalle.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajaIngresoDetalleActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajaIngresoDetalle.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajaIngresoDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajaIngresoDetalle.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajaIngresoDetalle.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajaIngresoDetalle";
		inputMap = this.jButtonNuevoCajaIngresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajaIngresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaIngresoDetalleActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaIngresoDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajaIngresoDetalle";
		inputMap = this.jButtonNuevoRelacionesCajaIngresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajaIngresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaIngresoDetalleActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajaIngresoDetalle";
		inputMap = this.jButtonModificarCajaIngresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajaIngresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajaIngresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajaIngresoDetalle";
		inputMap = this.jButtonActualizarCajaIngresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajaIngresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajaIngresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajaIngresoDetalle";
		inputMap = this.jButtonEliminarCajaIngresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajaIngresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajaIngresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajaIngresoDetalle";
		inputMap = this.jButtonCancelarCajaIngresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajaIngresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajaIngresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajaIngresoDetalle";
		inputMap = this.jButtonCerrarCajaIngresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajaIngresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajaIngresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajaIngresoDetalle";
		inputMap = this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosCajaIngresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonGuardarCambiosCajaIngresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajaIngresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajaIngresoDetalle.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajaIngresoDetalleItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajaIngresoDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajaIngresoDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajaIngresoDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajaIngresoDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajaIngresoDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajaIngresoDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonidCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_caja_ingresoCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_caja_ingresoCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_caja_ingresoCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_caja_ingresoCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_empresaCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_empresaCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaIngresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_sucursalCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_sucursalCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaIngresoDetalleBusqueda"));
		//jButtonid_clienteCajaIngresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaIngresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalleBusqueda"));
		//jButtonid_facturaCajaIngresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCajaIngresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonconceptoCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"conceptoCajaIngresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonvalorCajaIngresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaIngresoDetalleBusqueda"));
		
		
		this.jButtonFK_IdCajaIngresoCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdCajaIngresoCajaIngresoDetalle"));

		this.jButtonFK_IdClienteCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdClienteCajaIngresoDetalle"));

		this.jButtonBuscarFK_IdClienteid_clienteCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaIngresoDetalle"));

		this.jButtonFK_IdFacturaCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdFacturaCajaIngresoDetalle"));

		this.jButtonBuscarFK_IdFacturaid_facturaCajaIngresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaIngresoDetalle"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajaIngresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajaIngresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajaIngresoDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajaIngresoDetalle.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajaIngresoDetalle(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
					cajaingresodetalleAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetalles) {
					cajaingresodetalleAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajaIngresoDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
						cajaingresodetalleAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetalles) {
						cajaingresodetalleAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetalles) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaIngresoDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaIngresoDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajaIngresoDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajaIngresoDetalle.getSelectedRows();
			
			CajaIngresoDetalle cajaingresodetalleLocal=new CajaIngresoDetalle();
			
			//this.seleccionarTodosCajaIngresoDetalle(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaingresodetalleLocal =(CajaIngresoDetalle) this.cajaingresodetalleLogic.getCajaIngresoDetalles().toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajaingresodetalleLocal =(CajaIngresoDetalle) this.cajaingresodetalles.toArray()[this.jTableDatosCajaIngresoDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajaingresodetalleLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
						cajaingresodetalleAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetalles) {
						cajaingresodetalleAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaIngresoDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaIngresoDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaIngresoDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajaIngresoDetalleItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajaIngresoDetalleParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajaIngresoDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajaIngresoDetalle.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalleLogic.getCajaIngresoDetalles()) {
				
						if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO)) {
							existe=true;
							cajaingresodetalleAux.setconcepto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							cajaingresodetalleAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetalles) {
					
						if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO)) {
							existe=true;
							cajaingresodetalleAux.setconcepto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							cajaingresodetalleAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajaIngresoDetalleActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajaIngresoDetalle=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajaIngresoDetalle.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajaIngresoDetalle) {				
					conSplash=true;//false;										
					
					//this.startProcessCajaIngresoDetalle(conSplash);
				
					this.generarReporteCajaIngresoDetallesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajaIngresoDetallesSeleccionados();
				//this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaIngresoDetallesSeleccionados(false);
				//this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaIngresoDetallesSeleccionados(true);
				//this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaIngresoDetalle();
				
				this.exportarCajaIngresoDetallesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajaIngresoDetalles();
				//this.importarCajaIngresoDetalles();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaIngresoDetalle();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajaIngresoDetallesSeleccionados();
				//this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Caja Ingreso Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajaIngresoDetalle();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajaIngresoDetalle)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajaIngresoDetalle(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setSelectedIndex(0);					
				}	
			} 			
			else if(CajaIngresoDetalleBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajaIngresoDetalle) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajaIngresoDetalle(conSplash);
					
						//this.actualizarParametrosGeneralCajaIngresoDetalle();
						
						this.generarReporteProcesoAccionCajaIngresoDetallesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajaIngresoDetalleBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Caja Ingreso DetalleS SELECCIONADOS?", "MANTENIMIENTO DE Caja Ingreso Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajaIngresoDetalle();
				
						this.actualizarParametrosGeneralCajaIngresoDetalle();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajaingresodetalleReturnGeneral=cajaingresodetalleLogic.procesarAccionCajaIngresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajaingresodetalleLogic.getCajaIngresoDetalles(),this.cajaingresodetalleParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajaIngresoDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajaIngresoDetalle();
					
					CajaIngresoDetalleBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajaIngresoDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaIngresoDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxTiposAccionesFormularioCajaIngresoDetalle.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajaIngresoDetalle(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajaIngresoDetalleActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajaIngresoDetalle();
			
			if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		
			CajaIngresoDetalle cajaingresodetalle=new CajaIngresoDetalle();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajaIngresoDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajaIngresoDetalle.getSelectedItem();
			
			
			
			
			cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajaingresodetallesSeleccionados.size()==1) {
				for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetallesSeleccionados) {
					cajaingresodetalle=cajaingresodetalleAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajaIngresoDetalle();
			
      		//this.finishProcessCajaIngresoDetalle(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajaIngresoDetalleReturnGeneral() throws Exception {
		if(this.cajaingresodetalleReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajaingresodetalleReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajaingresodetalleReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajaingresodetalleReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajaingresodetalleReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajaingresodetalleReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajaIngresoDetalle(false);
		}
		
		if(this.cajaingresodetalleReturnGeneral.getConRetornoLista() || this.cajaingresodetalleReturnGeneral.getConRetornoObjeto()) {
			if(this.cajaingresodetalleReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajaingresodetalleLogic.setCajaIngresoDetalles(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cajaingresodetalleReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajaingresodetalleLogic.setCajaIngresoDetalle(this.cajaingresodetalleReturnGeneral.getCajaIngresoDetalle());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCajaIngresoDetalle(false);
		}
	}
	
	public void actualizarParametrosGeneralCajaIngresoDetalle() throws Exception {
		
		
	}
	
	public ArrayList<CajaIngresoDetalle> getCajaIngresoDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajaIngresoDetalle) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetalleLogic.getCajaIngresoDetalles()) {
					if(cajaingresodetalleAux.getIsSelected()) {
						cajaingresodetallesSeleccionados.add(cajaingresodetalleAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaIngresoDetalle cajaingresodetalleAux:this.cajaingresodetalles) {
					if(cajaingresodetalleAux.getIsSelected()) {
						cajaingresodetallesSeleccionados.add(cajaingresodetalleAux);				
					}
				}
			}
			
			if(cajaingresodetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajaingresodetallesSeleccionados.addAll(this.cajaingresodetalleLogic.getCajaIngresoDetalles());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajaingresodetallesSeleccionados.addAll(this.cajaingresodetalles);				
					}
				}
			}
		} else {
			cajaingresodetallesSeleccionados.add(this.cajaingresodetalle);
		}
		
		return cajaingresodetallesSeleccionados;
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
	
	public void generarReporteCajaIngresoDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajaIngresoDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajaIngresoDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaIngresoDetallesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaIngresoDetallesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Caja Ingreso Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajaIngresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajaIngresoDetalles("Todos",cajaingresodetallesSeleccionados);
		
	}	
	
	public void generarReporteNormalCajaIngresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajaIngresoDetalles("Todos",cajaingresodetallesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajaIngresoDetallesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajaIngresoDetalles("Todos",cajaingresodetallesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajaIngresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajaIngresoDetalle();
		
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajaIngresoDetalle();
		
		
		//this.generarReporteCajaIngresoDetalles("Todos",cajaingresodetallesSeleccionados ,cajaingresodetalleImplementable,cajaingresodetalleImplementableHome);
	}
	
	public void mostrarImportacionCajaIngresoDetalles() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajaIngresoDetalle();
		
		this.abrirFrameImportacionCajaIngresoDetalle();		
		
			
		//this.generarReporteCajaIngresoDetalles("Todos",cajaingresodetallesSeleccionados ,cajaingresodetalleImplementable,cajaingresodetalleImplementableHome);
	}
	
	public void importarCajaIngresoDetalles() throws Exception {		
	
	}
	
	public void exportarCajaIngresoDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajaIngresoDetallesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajaIngresoDetallesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajaIngresoDetallesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Caja Ingreso Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajaIngresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingresodetalle."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajaIngresoDetalle(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetallesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajaIngresoDetalle(cajaingresodetalleAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajaingresodetalleAux.setsDetalleGeneralEntityReporte(cajaingresodetalleAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajaIngresoDetalle(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaIngresoDetalleConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajaingresodetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingresodetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingresodetalle.getcajaingreso_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingresodetalle.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingresodetalle.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingresodetalle.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingresodetalle.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingresodetalle.getconcepto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaingresodetalle.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajaIngresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingresodetalle.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CajaIngresoDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajaIngresoDetalle(row);				
				iRow++;
			}				
			
			for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetallesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajaIngresoDetalle(cajaingresodetalleAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajaIngresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();		
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaingresodetalle.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajaingresodetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajaingresodetalle");
			//elementRoot.appendChild(element);
		
			for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetallesSeleccionados) {
				element = document.createElement("cajaingresodetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajaIngresoDetalle(cajaingresodetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Ingreso Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajaIngresoDetalle(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaIngresoDetalleConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingresodetalle.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingresodetalle.getcajaingreso_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingresodetalle.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingresodetalle.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingresodetalle.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingresodetalle.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingresodetalle.getconcepto());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaingresodetalle.getvalor());				
	}
	
	public void setFilaDatosExportarXmlCajaIngresoDetalle(CajaIngresoDetalle cajaingresodetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajaIngresoDetalleConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajaingresodetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajaIngresoDetalleConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajaingresodetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcajaingreso_descripcion = document.createElement(CajaIngresoDetalleConstantesFunciones.IDCAJAINGRESO);
		elementcajaingreso_descripcion.appendChild(document.createTextNode(cajaingresodetalle.getcajaingreso_descripcion()));
		element.appendChild(elementcajaingreso_descripcion);

		Element elementempresa_descripcion = document.createElement(CajaIngresoDetalleConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajaingresodetalle.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CajaIngresoDetalleConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cajaingresodetalle.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(CajaIngresoDetalleConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(cajaingresodetalle.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfactura_descripcion = document.createElement(CajaIngresoDetalleConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(cajaingresodetalle.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementconcepto = document.createElement(CajaIngresoDetalleConstantesFunciones.CONCEPTO);
		elementconcepto.appendChild(document.createTextNode(cajaingresodetalle.getconcepto().trim()));
		element.appendChild(elementconcepto);

		Element elementvalor = document.createElement(CajaIngresoDetalleConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(cajaingresodetalle.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoCajaIngresoDetallesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados=new ArrayList<CajaIngresoDetalle>();
		
		cajaingresodetallesSeleccionados=this.getCajaIngresoDetallesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCajaIngresoDetalle(cajaingresodetallesSeleccionados);
		
		this.generarReporteCajaIngresoDetalles("Todos",cajaingresodetallesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajaIngresoDetalle(ArrayList<CajaIngresoDetalle> cajaingresodetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CajaIngresoDetalle cajaingresodetalleAux:cajaingresodetallesSeleccionados) {
				cajaingresodetalleAux.setsDetalleGeneralEntityReporte(cajaingresodetalleAux.toString());
			
				if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_IDCAJAINGRESO)) {
					existe=true;
					cajaingresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaingresodetalleAux.getcajaingreso_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajaingresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaingresodetalleAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cajaingresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaingresodetalleAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					cajaingresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaingresodetalleAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					cajaingresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaingresodetalleAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaIngresoDetalleConstantesFunciones.LABEL_CONCEPTO)) {
					existe=true;
					cajaingresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaingresodetalleAux.getconcepto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaIngresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajaIngresoDetalle(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajaIngresoDetalle=true;
				this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=true;
				this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=true;
			}
			
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=true;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=true;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=true;
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=true;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=true;
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaIngresoDetalle=true;
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaIngresoDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaIngresoDetalle=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajaIngresoDetalleJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=true;
		} else {
			this.actualizarEstadoPanelsCajaIngresoDetalle(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajaIngresoDetalle=false;
			//this.isVisibilidadCeldaVerFormCajaIngresoDetalle=false;
			this.isVisibilidadCeldaDuplicarCajaIngresoDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajaingresodetalleSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
		} else {
			this.isVisibilidadCeldaNuevoCajaIngresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaIngresoDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			if(!cajaingresodetalleSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;												
			}
			
			this.jButtonCerrarCajaIngresoDetalle.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajaIngresoDetalle=false;
		}
		
		if(!this.permiteMantenimiento(this.cajaingresodetalle)) {
			this.isVisibilidadCeldaActualizarCajaIngresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaIngresoDetalle=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajaIngresoDetalle() {
	}
	
	public void actualizarEstadoPanelsCajaIngresoDetalle(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaIngresoDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosCajaIngresoDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaIngresoDetalle!=null) {
				this.jPanelPaginacionCajaIngresoDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaIngresoDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosCajaIngresoDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaIngresoDetalle!=null) {
				this.jPanelPaginacionCajaIngresoDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaIngresoDetalle.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosCajaIngresoDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaIngresoDetalle!=null) {
				this.jPanelPaginacionCajaIngresoDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaIngresoDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosCajaIngresoDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaIngresoDetalle!=null) {
				this.jPanelPaginacionCajaIngresoDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaIngresoDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosCajaIngresoDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaIngresoDetalle!=null) {
				this.jPanelPaginacionCajaIngresoDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaIngresoDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosCajaIngresoDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaIngresoDetalle!=null) {
				this.jPanelPaginacionCajaIngresoDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaIngresoDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaIngresoDetalle!=null) {
				this.jScrollPanelDatosCajaIngresoDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaIngresoDetalle!=null) {
				this.jPanelPaginacionCajaIngresoDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
					this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajaingresodetalleSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaIngresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajaIngresoDetalle!=null) {
				this.jPanelParametrosReportesCajaIngresoDetalle.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCajaIngreso(Boolean isParaCajaIngreso){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaIngresoNegation=!isParaCajaIngreso;

			this.isVisibilidadFK_IdCajaIngreso=isParaCajaIngreso;
			if(!this.isVisibilidadFK_IdCajaIngreso) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdCajaIngresoCajaIngresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaCajaIngresoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdClienteCajaIngresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaCajaIngresoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdFacturaCajaIngresoDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCajaIngreso=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCajaIngreso) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdCajaIngresoCajaIngresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdClienteCajaIngresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdFacturaCajaIngresoDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCajaIngreso=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCajaIngreso) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdCajaIngresoCajaIngresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdClienteCajaIngresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdFacturaCajaIngresoDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCajaIngreso=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCajaIngreso) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdCajaIngresoCajaIngresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdClienteCajaIngresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdFacturaCajaIngresoDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdCajaIngreso=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCajaIngreso) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdCajaIngresoCajaIngresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdClienteCajaIngresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(jPanelFK_IdFacturaCajaIngresoDetalle);}
		}
		
	}
	
	
	
	

	public String registrarSesionCajaIngresoDetalleParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(cajaingresodetalleSessionBean==null) {
				cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(cajaingresodetalleSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.cajaingresodetalleFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CajaIngresoDetalleConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionCajaIngresoDetalle(true);
			//clienteSessionBean.setlidCajaIngresoDetalleActual(this.idCajaIngresoDetalleActual);

			cajaingresodetalleSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle(true);
			cajaingresodetalleSessionBean.setlIdCajaIngresoDetalleActualForeignKey(this.idCajaIngresoDetalleActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCajaIngresoDetalleParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(cajaingresodetalleSessionBean==null) {
				cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(cajaingresodetalleSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.cajaingresodetalleFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(CajaIngresoDetalleConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionCajaIngresoDetalle(true);
			//facturaSessionBean.setlidCajaIngresoDetalleActual(this.idCajaIngresoDetalleActual);

			cajaingresodetalleSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCajaIngresoDetalle(true);
			cajaingresodetalleSessionBean.setlIdCajaIngresoDetalleActualForeignKey(this.idCajaIngresoDetalleActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CajaIngresoDetalleSessionBean cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
		
		if(this.cajaingresodetalleSessionBean==null) {
			this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
		}
		
		this.cajaingresodetalleSessionBean.setsUltimaBusquedaCajaIngresoDetalle(this.getsAccionBusqueda());
		this.cajaingresodetalleSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cajaingresodetalleSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCajaIngreso")) {
			cajaingresodetalleSessionBean.setid_caja_ingreso(this.getid_caja_ingresoFK_IdCajaIngreso());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			cajaingresodetalleSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cajaingresodetalleSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			cajaingresodetalleSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cajaingresodetalleSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CajaIngresoDetalleSessionBean cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
		
		if(this.cajaingresodetalleSessionBean==null) {
			this.cajaingresodetalleSessionBean=new CajaIngresoDetalleSessionBean();
		}
		
		if(this.cajaingresodetalleSessionBean.getsUltimaBusquedaCajaIngresoDetalle()!=null&&!this.cajaingresodetalleSessionBean.getsUltimaBusquedaCajaIngresoDetalle().equals("")) {
			this.setsAccionBusqueda(cajaingresodetalleSessionBean.getsUltimaBusquedaCajaIngresoDetalle());
			this.setiNumeroPaginacion(cajaingresodetalleSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cajaingresodetalleSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCajaIngreso")) {
				this.setid_caja_ingresoFK_IdCajaIngreso(cajaingresodetalleSessionBean.getid_caja_ingreso());
				cajaingresodetalleSessionBean.setid_caja_ingreso(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(cajaingresodetalleSessionBean.getid_cliente());
				cajaingresodetalleSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cajaingresodetalleSessionBean.getid_empresa());
				cajaingresodetalleSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(cajaingresodetalleSessionBean.getid_factura());
				cajaingresodetalleSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cajaingresodetalleSessionBean.getid_sucursal());
				cajaingresodetalleSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.cajaingresodetalleSessionBean.setsUltimaBusquedaCajaIngresoDetalle("");
		this.cajaingresodetalleSessionBean.setiNumeroPaginacion(CajaIngresoDetalleConstantesFunciones.INUMEROPAGINACION);
		this.cajaingresodetalleSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajaIngresoDetalle(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajaIngresoDetalle() {
		this.updateBorderResaltarBusquedasFormularioCajaIngresoDetalle();
		this.updateVisibilidadBusquedasFormularioCajaIngresoDetalle();
		this.updateHabilitarBusquedasFormularioCajaIngresoDetalle();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajaIngresoDetalle() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponents().length>0) {
	

		if(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdCajaIngresoCajaIngresoDetalle!=null) {
			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdCajaIngresoCajaIngresoDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
				jPanel.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdCajaIngresoCajaIngresoDetalle);
			}
		}

		if(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdClienteCajaIngresoDetalle!=null) {
			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdClienteCajaIngresoDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
				jPanel.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdClienteCajaIngresoDetalle);
			}
		}

		if(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdFacturaCajaIngresoDetalle!=null) {
			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdFacturaCajaIngresoDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
				jPanel.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdFacturaCajaIngresoDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajaIngresoDetalle() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdCajaIngresoCajaIngresoDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarFK_IdCajaIngresoCajaIngresoDetalle);
			if(!this.cajaingresodetalleConstantesFunciones.mostrarFK_IdCajaIngresoCajaIngresoDetalle && index>-1) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdClienteCajaIngresoDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarFK_IdClienteCajaIngresoDetalle);
			if(!this.cajaingresodetalleConstantesFunciones.mostrarFK_IdClienteCajaIngresoDetalle && index>-1) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdFacturaCajaIngresoDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarFK_IdFacturaCajaIngresoDetalle);
			if(!this.cajaingresodetalleConstantesFunciones.mostrarFK_IdFacturaCajaIngresoDetalle && index>-1) {
				this.jTabbedPaneBusquedasCajaIngresoDetalle.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajaIngresoDetalle() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdCajaIngresoCajaIngresoDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaingresodetalleConstantesFunciones.activarFK_IdCajaIngresoCajaIngresoDetalle);
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setEnabledAt(index,this.cajaingresodetalleConstantesFunciones.activarFK_IdCajaIngresoCajaIngresoDetalle);
			}

			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdClienteCajaIngresoDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaingresodetalleConstantesFunciones.activarFK_IdClienteCajaIngresoDetalle);
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setEnabledAt(index,this.cajaingresodetalleConstantesFunciones.activarFK_IdClienteCajaIngresoDetalle);
			}

			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdFacturaCajaIngresoDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaingresodetalleConstantesFunciones.activarFK_IdFacturaCajaIngresoDetalle);
				this.jTabbedPaneBusquedasCajaIngresoDetalle.setEnabledAt(index,this.cajaingresodetalleConstantesFunciones.activarFK_IdFacturaCajaIngresoDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajaIngresoDetalle(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCajaIngreso")) {
			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdCajaIngresoCajaIngresoDetalle);

			this.jTabbedPaneBusquedasCajaIngresoDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);

			this.cajaingresodetalleConstantesFunciones.setResaltarFK_IdCajaIngresoCajaIngresoDetalle(resaltar);

			jPanel.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdCajaIngresoCajaIngresoDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdClienteCajaIngresoDetalle);

			this.jTabbedPaneBusquedasCajaIngresoDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);

			this.cajaingresodetalleConstantesFunciones.setResaltarFK_IdClienteCajaIngresoDetalle(resaltar);

			jPanel.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdClienteCajaIngresoDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasCajaIngresoDetalle.indexOfComponent(this.jPanelFK_IdFacturaCajaIngresoDetalle);

			this.jTabbedPaneBusquedasCajaIngresoDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaIngresoDetalle.getComponent(index);

			this.cajaingresodetalleConstantesFunciones.setResaltarFK_IdFacturaCajaIngresoDetalle(resaltar);

			jPanel.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarFK_IdFacturaCajaIngresoDetalle);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajaIngresoDetalle.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCajaIngresoDetalle() throws Exception {

		if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajaIngresoDetalle();
		this.updateVisibilidadResaltarControlesFormularioCajaIngresoDetalle();
		this.updateHabilitarResaltarControlesFormularioCajaIngresoDetalle();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajaIngresoDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajaingresodetalleConstantesFunciones.resaltaridCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.setBorder(this.cajaingresodetalleConstantesFunciones.resaltaridCajaIngresoDetalle);}
		if(this.cajaingresodetalleConstantesFunciones.resaltarid_caja_ingresoCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarid_caja_ingresoCajaIngresoDetalle);}
		if(this.cajaingresodetalleConstantesFunciones.resaltarid_empresaCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarid_empresaCajaIngresoDetalle);}
		if(this.cajaingresodetalleConstantesFunciones.resaltarid_sucursalCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarid_sucursalCajaIngresoDetalle);}
		if(this.cajaingresodetalleConstantesFunciones.resaltarid_clienteCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarid_clienteCajaIngresoDetalle);}
		if(this.cajaingresodetalleConstantesFunciones.resaltarid_facturaCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarid_facturaCajaIngresoDetalle);}
		if(this.cajaingresodetalleConstantesFunciones.resaltarconceptoCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextAreaconceptoCajaIngresoDetalle.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarconceptoCajaIngresoDetalle);}
		if(this.cajaingresodetalleConstantesFunciones.resaltarvalorCajaIngresoDetalle!=null && this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextFieldvalorCajaIngresoDetalle.setBorder(this.cajaingresodetalleConstantesFunciones.resaltarvalorCajaIngresoDetalle);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajaIngresoDetalle() throws Exception {		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
	
		//this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostraridCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelidCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostraridCajaIngresoDetalle);
		//this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_caja_ingresoCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelid_caja_ingresoCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_caja_ingresoCajaIngresoDetalle);
		//this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_empresaCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelid_empresaCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_empresaCajaIngresoDetalle);
		//this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_sucursalCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelid_sucursalCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_sucursalCajaIngresoDetalle);
		//this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_clienteCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelid_clienteCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_clienteCajaIngresoDetalle);
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_clienteCajaIngresoDetalle);
		//this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_facturaCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelid_facturaCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_facturaCajaIngresoDetalle);
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarid_facturaCajaIngresoDetalle);
		//this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextAreaconceptoCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarconceptoCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelconceptoCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarconceptoCajaIngresoDetalle);
		//this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextFieldvalorCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarvalorCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jPanelvalorCajaIngresoDetalle.setVisible(this.cajaingresodetalleConstantesFunciones.mostrarvalorCajaIngresoDetalle);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajaIngresoDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaIngresoDetalle!=null) {
	
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jLabelidCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activaridCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_caja_ingresoCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarid_caja_ingresoCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_empresaCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarid_empresaCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_sucursalCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarid_sucursalCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_clienteCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarid_clienteCajaIngresoDetalle);
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_clienteCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarid_clienteCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jComboBoxid_facturaCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarid_facturaCajaIngresoDetalle);
			this.jInternalFrameDetalleFormCajaIngresoDetalle.jButtonid_facturaCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarid_facturaCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextAreaconceptoCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarconceptoCajaIngresoDetalle);
		this.jInternalFrameDetalleFormCajaIngresoDetalle.jTextFieldvalorCajaIngresoDetalle.setEnabled(this.cajaingresodetalleConstantesFunciones.activarvalorCajaIngresoDetalle);
		}
	}
	
		
}