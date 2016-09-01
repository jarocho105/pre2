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

import com.bydan.erp.puntoventa.util.CajaEgresoDetalleConstantesFunciones;
import com.bydan.erp.puntoventa.util.CajaEgresoDetalleParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.CajaEgresoDetalleParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.CajaEgresoDetalleBean;
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
public class CajaEgresoDetalleBeanSwingJInternalFrame extends CajaEgresoDetalleJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CajaEgresoDetalleBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CajaEgresoDetalle> cajaegresodetalleValidator = new ClassValidator<CajaEgresoDetalle>(CajaEgresoDetalle.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CajaEgresoDetalle cajaegresodetalle;	
	public CajaEgresoDetalle cajaegresodetalleAux;
	public CajaEgresoDetalle cajaegresodetalleAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CajaEgresoDetalle cajaegresodetalleTotales;
	public Long idCajaEgresoDetalleActual;
	public Long iIdNuevoCajaEgresoDetalle=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCajaEgreso="";

	public List<CajaEgreso> cajaegresosForeignKey;

	public List<CajaEgreso> getcajaegresosForeignKey() {
		return cajaegresosForeignKey;
	}

	public void setcajaegresosForeignKey(List<CajaEgreso> cajaegresosForeignKey) {
		this.cajaegresosForeignKey = cajaegresosForeignKey;
	}

	//OBJETO FK ACTUAL
	public CajaEgreso cajaegresoForeignKey;

	public CajaEgreso getcajaegresoForeignKey() {
		return cajaegresoForeignKey;
	}

	public void setcajaegresoForeignKey(CajaEgreso cajaegresoForeignKey) {
		this.cajaegresoForeignKey = cajaegresoForeignKey;
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
	
	public Boolean isPermisoTodoCajaEgresoDetalle;
	public Boolean isPermisoNuevoCajaEgresoDetalle;
	public Boolean isPermisoActualizarCajaEgresoDetalle;
	public Boolean isPermisoActualizarOriginalCajaEgresoDetalle;
	public Boolean isPermisoEliminarCajaEgresoDetalle;
	public Boolean isPermisoGuardarCambiosCajaEgresoDetalle;
	public Boolean isPermisoConsultaCajaEgresoDetalle;
	public Boolean isPermisoBusquedaCajaEgresoDetalle;
	public Boolean isPermisoReporteCajaEgresoDetalle;
	public Boolean isPermisoPaginacionMedioCajaEgresoDetalle;
	public Boolean isPermisoPaginacionAltoCajaEgresoDetalle;
	public Boolean isPermisoPaginacionTodoCajaEgresoDetalle;
	public Boolean isPermisoCopiarCajaEgresoDetalle;
	public Boolean isPermisoVerFormCajaEgresoDetalle;
	public Boolean isPermisoDuplicarCajaEgresoDetalle;
	public Boolean isPermisoOrdenCajaEgresoDetalle;
	
	
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
	
	public CajaEgresoDetalleParameterReturnGeneral cajaegresodetalleReturnGeneral;
	public CajaEgresoDetalleParameterReturnGeneral cajaegresodetalleParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCajaEgresoDetalle=false;
	public Boolean esParaAccionDesdeFormularioCajaEgresoDetalle=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CajaEgresoDetalleSessionBeanAdditional cajaegresodetalleSessionBeanAdditional=null;
	
	public CajaEgresoDetalleSessionBeanAdditional getCajaEgresoDetalleSessionBeanAdditional() {
		return this.cajaegresodetalleSessionBeanAdditional;
	}
	
	public void setCajaEgresoDetalleSessionBeanAdditional(CajaEgresoDetalleSessionBeanAdditional cajaegresodetalleSessionBeanAdditional) {
		try {
			this.cajaegresodetalleSessionBeanAdditional=cajaegresodetalleSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CajaEgresoDetalleBeanSwingJInternalFrameAdditional cajaegresodetalleBeanSwingJInternalFrameAdditional=null;
	//public class CajaEgresoDetalleBeanSwingJInternalFrame
	
	public CajaEgresoDetalleBeanSwingJInternalFrameAdditional getCajaEgresoDetalleBeanSwingJInternalFrameAdditional() {
		return this.cajaegresodetalleBeanSwingJInternalFrameAdditional;
	}
	
	public void setCajaEgresoDetalleBeanSwingJInternalFrameAdditional(CajaEgresoDetalleBeanSwingJInternalFrameAdditional cajaegresodetalleBeanSwingJInternalFrameAdditional) {
		try {
			this.cajaegresodetalleBeanSwingJInternalFrameAdditional=cajaegresodetalleBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CajaEgresoDetalleLogic cajaegresodetalleLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CajaEgresoDetalle cajaegresodetalleBean;
	public CajaEgresoDetalleConstantesFunciones cajaegresodetalleConstantesFunciones;
	//public CajaEgresoDetalleParameterReturnGeneral cajaegresodetalleReturnGeneral;
	
	//FK
	
	public CajaEgresoLogic cajaegresoLogic;
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public FacturaLogic facturaLogic;
	
	//PARAMETROS
	
	
	//public List<CajaEgresoDetalle> cajaegresodetalles;	
	//public List<CajaEgresoDetalle> cajaegresodetallesEliminados;
	//public List<CajaEgresoDetalle> cajaegresodetallesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCajaEgresoDetalle=false;
	public Boolean isVisibilidadCeldaDuplicarCajaEgresoDetalle=true;
	public Boolean isVisibilidadCeldaCopiarCajaEgresoDetalle=true;
	public Boolean isVisibilidadCeldaVerFormCajaEgresoDetalle=true;
	public Boolean isVisibilidadCeldaOrdenCajaEgresoDetalle=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
	public Boolean isVisibilidadCeldaModificarCajaEgresoDetalle=false;
	public Boolean isVisibilidadCeldaActualizarCajaEgresoDetalle=false;
	public Boolean isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
	public Boolean isVisibilidadCeldaCancelarCajaEgresoDetalle=false;
	public Boolean isVisibilidadCeldaGuardarCajaEgresoDetalle=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=false;	
	
	
	public Boolean isVisibilidadFK_IdCajaEgreso=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoCajaEgresoDetalle() {
		return this.iIdNuevoCajaEgresoDetalle;
	}

	public void setiIdNuevoCajaEgresoDetalle(Long iIdNuevoCajaEgresoDetalle) {
		this.iIdNuevoCajaEgresoDetalle = iIdNuevoCajaEgresoDetalle;
	}
	
	public Long getidCajaEgresoDetalleActual() {
		return this.idCajaEgresoDetalleActual;
	}

	public void setidCajaEgresoDetalleActual(Long idCajaEgresoDetalleActual) {
		this.idCajaEgresoDetalleActual = idCajaEgresoDetalleActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CajaEgresoDetalle getcajaegresodetalle() {
		return this.cajaegresodetalle;
	}

	public void setcajaegresodetalle(CajaEgresoDetalle cajaegresodetalle) {
		this.cajaegresodetalle = cajaegresodetalle;
	}
	
	public CajaEgresoDetalle getcajaegresodetalleAux() {
		return this.cajaegresodetalleAux;
	}

	public void setcajaegresodetalleAux(CajaEgresoDetalle cajaegresodetalleAux) {
		this.cajaegresodetalleAux = cajaegresodetalleAux;
	}				
	
	public CajaEgresoDetalle getcajaegresodetalleAnterior() {
		return this.cajaegresodetalleAnterior;
	}

	public void setcajaegresodetalleAnterior(CajaEgresoDetalle cajaegresodetalleAnterior) {
		this.cajaegresodetalleAnterior = cajaegresodetalleAnterior;
	}	
	
	public CajaEgresoDetalle getcajaegresodetalleTotales() {
		return this.cajaegresodetalleTotales;
	}

	public void setcajaegresodetalleTotales(CajaEgresoDetalle cajaegresodetalleTotales) {
		this.cajaegresodetalleTotales = cajaegresodetalleTotales;
	}	
	
	public CajaEgresoDetalle getcajaegresodetalleBean() {
		return this.cajaegresodetalleBean;
	}

	public void setcajaegresodetalleBean(CajaEgresoDetalle cajaegresodetalleBean) {
		this.cajaegresodetalleBean = cajaegresodetalleBean;
	}	
	
	public CajaEgresoDetalleParameterReturnGeneral getcajaegresodetalleReturnGeneral() {
		return this.cajaegresodetalleReturnGeneral;
	}

	public void setcajaegresodetalleReturnGeneral(CajaEgresoDetalleParameterReturnGeneral cajaegresodetalleReturnGeneral) {
		this.cajaegresodetalleReturnGeneral = cajaegresodetalleReturnGeneral;
	}	
	
	
	public Long id_caja_egresoFK_IdCajaEgreso=-1L;

	public Long getid_caja_egresoFK_IdCajaEgreso() {
		return this.id_caja_egresoFK_IdCajaEgreso;
	}

	public void setid_caja_egresoFK_IdCajaEgreso(Long id_caja_egresoFK_IdCajaEgreso) {
		this.id_caja_egresoFK_IdCajaEgreso = id_caja_egresoFK_IdCajaEgreso;
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
	
	
	public CajaEgresoDetalleLogic getCajaEgresoDetalleLogic()	{		
		return cajaegresodetalleLogic;
	}

	public void setCajaEgresoDetalleLogic(CajaEgresoDetalleLogic cajaegresodetalleLogic) {
		this.cajaegresodetalleLogic = cajaegresodetalleLogic;
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
	
	public Boolean getIsEsNuevoCajaEgresoDetalle() {
		return isEsNuevoCajaEgresoDetalle;
	}

	public void setIsEsNuevoCajaEgresoDetalle(Boolean isEsNuevoCajaEgresoDetalle) {
		this.isEsNuevoCajaEgresoDetalle = isEsNuevoCajaEgresoDetalle;
	}

	public Boolean getEsParaAccionDesdeFormularioCajaEgresoDetalle() {
		return esParaAccionDesdeFormularioCajaEgresoDetalle;
	}
	
	public void setEsParaAccionDesdeFormularioCajaEgresoDetalle(Boolean esParaAccionDesdeFormularioCajaEgresoDetalle) {
		this.esParaAccionDesdeFormularioCajaEgresoDetalle = esParaAccionDesdeFormularioCajaEgresoDetalle;
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
	
	
	public void cargarCombosCajaEgresosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajaegresosForeignKey=new ArrayList<CajaEgreso>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaEgresoLogic cajaegresoLogic=new CajaEgresoLogic();

			cajaegresoLogic.getCajaEgresoDataAccess().setIsForForeingKeyData(true);

			if(this.cajaegresodetalleSessionBean==null) {
				this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCajaEgreso()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLogic.getCajaEgresoDataAccess().setIsForForeingKeyData(true);

					cajaegresoLogic.getTodosCajaEgresosWithConnection(sFinalQuery,new Pagination());

					this.cajaegresosForeignKey=cajaegresoLogic.getCajaEgresos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCajaEgreso(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresoLogic.getEntityWithConnection(cajaegresodetalleSessionBean.getlidCajaEgresoActual());
					this.cajaegresosForeignKey.add(cajaegresoLogic.getCajaEgreso());
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

			if(this.cajaegresodetalleSessionBean==null) {
				this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(cajaegresodetalleSessionBean.getlidEmpresaActual());
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

			if(this.cajaegresodetalleSessionBean==null) {
				this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(cajaegresodetalleSessionBean.getlidSucursalActual());
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

			if(this.cajaegresodetalleSessionBean==null) {
				this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(cajaegresodetalleSessionBean.getlidClienteActual());
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

			if(this.cajaegresodetalleSessionBean==null) {
				this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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
					facturaLogic.getEntityWithConnection(cajaegresodetalleSessionBean.getlidFacturaActual());
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

	
	
	public void setActualCajaEgresoForeignKey(Long idCajaEgresoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			CajaEgreso  cajaegresoTemp=null;

			for(CajaEgreso cajaegresoAux:cajaegresosForeignKey) {
				if(cajaegresoAux.getId()!=null && cajaegresoAux.getId().equals(idCajaEgresoSeleccionado)) {
					cajaegresoTemp=cajaegresoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaegresoTemp!=null) {

					if(this.cajaegresodetalle!=null) {
						this.cajaegresodetalle.setCajaEgreso(cajaegresoTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setSelectedItem(cajaegresoTemp);
					}
				} else {
					//jComboBoxid_caja_egresoCajaEgresoDetalle.setSelectedItem(cajaegresoTemp);
					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCajaEgreso") || sFormularioTipoBusqueda.equals("Todos")){
					if(cajaegresoTemp!=null && jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle!=null) {
						jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setSelectedItem(cajaegresoTemp);
					} else {
						if(jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle!=null) {
							//jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setSelectedItem(cajaegresoTemp);
							if(jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.getItemCount()>0) {
								jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setSelectedIndex(0);
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

	public String getActualCajaEgresoForeignKeyDescripcion(Long idCajaEgresoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			CajaEgreso  cajaegresoTemp=null;

			for(CajaEgreso cajaegresoAux:cajaegresosForeignKey) {
				if(cajaegresoAux.getId()!=null && cajaegresoAux.getId().equals(idCajaEgresoSeleccionado)) {
					cajaegresoTemp=cajaegresoAux;
					break;
				}
			}


			sDescripcion=CajaEgresoConstantesFunciones.getCajaEgresoDescripcion(cajaegresoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaEgresoForeignKeyGenerico(Long idCajaEgresoSeleccionado,JComboBox jComboBoxid_caja_egresoCajaEgresoDetalleGenerico)throws Exception
	{
		try
		{
			CajaEgreso  cajaegresoTemp=null;

			for(CajaEgreso cajaegresoAux:cajaegresosForeignKey) {
				if(cajaegresoAux.getId()!=null && cajaegresoAux.getId().equals(idCajaEgresoSeleccionado)) {
					cajaegresoTemp=cajaegresoAux;
					break;
				}
			}

			if(cajaegresoTemp!=null) {
				jComboBoxid_caja_egresoCajaEgresoDetalleGenerico.setSelectedItem(cajaegresoTemp);
			} else {
				if(jComboBoxid_caja_egresoCajaEgresoDetalleGenerico!=null && jComboBoxid_caja_egresoCajaEgresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_caja_egresoCajaEgresoDetalleGenerico.setSelectedIndex(0);
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

					if(this.cajaegresodetalle!=null) {
						this.cajaegresodetalle.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaCajaEgresoDetalle.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaCajaEgresoDetalleGenerico)throws Exception
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
				jComboBoxid_empresaCajaEgresoDetalleGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaCajaEgresoDetalleGenerico!=null && jComboBoxid_empresaCajaEgresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_empresaCajaEgresoDetalleGenerico.setSelectedIndex(0);
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

					if(this.cajaegresodetalle!=null) {
						this.cajaegresodetalle.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalCajaEgresoDetalle.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalCajaEgresoDetalleGenerico)throws Exception
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
				jComboBoxid_sucursalCajaEgresoDetalleGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalCajaEgresoDetalleGenerico!=null && jComboBoxid_sucursalCajaEgresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_sucursalCajaEgresoDetalleGenerico.setSelectedIndex(0);
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

					if(this.cajaegresodetalle!=null) {
						this.cajaegresodetalle.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteCajaEgresoDetalle.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle!=null) {
						jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle!=null) {
							//jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteCajaEgresoDetalleGenerico)throws Exception
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
				jComboBoxid_clienteCajaEgresoDetalleGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteCajaEgresoDetalleGenerico!=null && jComboBoxid_clienteCajaEgresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_clienteCajaEgresoDetalleGenerico.setSelectedIndex(0);
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

					if(this.cajaegresodetalle!=null) {
						this.cajaegresodetalle.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaCajaEgresoDetalle.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.getItemCount()>0) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(facturaTemp!=null && jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle!=null) {
						jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.setSelectedItem(facturaTemp);
					} else {
						if(jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle!=null) {
							//jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.setSelectedItem(facturaTemp);
							if(jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.getItemCount()>0) {
								jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.setSelectedIndex(0);
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
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaCajaEgresoDetalleGenerico)throws Exception
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
				jComboBoxid_facturaCajaEgresoDetalleGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaCajaEgresoDetalleGenerico!=null && jComboBoxid_facturaCajaEgresoDetalleGenerico.getItemCount()>0) {
					jComboBoxid_facturaCajaEgresoDetalleGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaEgresoForeignKey(CajaEgresoDetalle cajaegresodetalle,JComboBox jComboBoxid_caja_egresoCajaEgresoDetalleGenerico)throws Exception
	{
		try
		{
			CajaEgreso  cajaegresoAux=new CajaEgreso();

			if(jComboBoxid_caja_egresoCajaEgresoDetalleGenerico==null) {
				cajaegresoAux=(CajaEgreso)this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.getSelectedItem();
			} else {
				cajaegresoAux=(CajaEgreso)jComboBoxid_caja_egresoCajaEgresoDetalleGenerico.getSelectedItem();
			}

			if(cajaegresoAux!=null && cajaegresoAux.getId()!=null) {
				cajaegresodetalle.setid_caja_egreso(cajaegresoAux.getId());
				cajaegresodetalle.setcajaegreso_descripcion(CajaEgresoDetalleConstantesFunciones.getCajaEgresoDescripcion(cajaegresoAux));
				cajaegresodetalle.setCajaEgreso(cajaegresoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(CajaEgresoDetalle cajaegresodetalle,JComboBox jComboBoxid_empresaCajaEgresoDetalleGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaCajaEgresoDetalleGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaCajaEgresoDetalleGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				cajaegresodetalle.setid_empresa(empresaAux.getId());
				cajaegresodetalle.setempresa_descripcion(CajaEgresoDetalleConstantesFunciones.getEmpresaDescripcion(empresaAux));
				cajaegresodetalle.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(CajaEgresoDetalle cajaegresodetalle,JComboBox jComboBoxid_sucursalCajaEgresoDetalleGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalCajaEgresoDetalleGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalCajaEgresoDetalleGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				cajaegresodetalle.setid_sucursal(sucursalAux.getId());
				cajaegresodetalle.setsucursal_descripcion(CajaEgresoDetalleConstantesFunciones.getSucursalDescripcion(sucursalAux));
				cajaegresodetalle.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(CajaEgresoDetalle cajaegresodetalle,JComboBox jComboBoxid_clienteCajaEgresoDetalleGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteCajaEgresoDetalleGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteCajaEgresoDetalleGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				cajaegresodetalle.setid_cliente(clienteAux.getId());
				cajaegresodetalle.setcliente_descripcion(CajaEgresoDetalleConstantesFunciones.getClienteDescripcion(clienteAux));
				cajaegresodetalle.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(CajaEgresoDetalle cajaegresodetalle,JComboBox jComboBoxid_facturaCajaEgresoDetalleGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaCajaEgresoDetalleGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaCajaEgresoDetalleGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				cajaegresodetalle.setid_factura(facturaAux.getId());
				cajaegresodetalle.setfactura_descripcion(CajaEgresoDetalleConstantesFunciones.getFacturaDescripcion(facturaAux));
				cajaegresodetalle.setFactura(facturaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajaEgresosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCajaEgreso=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.removeAllItems();

							for(CajaEgreso cajaegreso:this.cajaegresosForeignKey) {
								this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.addItem(cajaegreso);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
					}

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCajaEgreso") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.removeAllItems();

							for(CajaEgreso cajaegreso:this.cajaegresosForeignKey) {
								this.jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.addItem(cajaegreso);
							}
						}

						if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
					}

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
					}

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
					}

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.addItem(cliente);
							}
						}

						if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
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

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { 
					}

					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.addItem(factura);
							}
						}

						if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameCajaEgresoForeignKey(CajaEgreso cajaegreso,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setSelectedItem(cajaegreso);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setSelectedItem(cajaegreso);
						} else {
							this.jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.setSelectedItem(factura);
						} else {
							this.jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesCajaEgresoDetalle() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CajaEgresoDetalleConstantesFunciones.refrescarForeignKeysDescripcionesCajaEgresoDetalle(this.cajaegresodetalleLogic.getCajaEgresoDetalles());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CajaEgresoDetalleConstantesFunciones.refrescarForeignKeysDescripcionesCajaEgresoDetalle(this.cajaegresodetalles);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(CajaEgreso.class));
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(Factura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//cajaegresodetalleLogic.setCajaEgresoDetalles(this.cajaegresodetalles);
			cajaegresodetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CajaEgresoDetalleParameterReturnGeneral getCajaEgresoDetalleParameterGeneral() {
		return this.cajaegresodetalleParameterGeneral;
	}
	
	public void setCajaEgresoDetalleParameterGeneral(CajaEgresoDetalleParameterReturnGeneral cajaegresodetalleParameterGeneral) {
		this.cajaegresodetalleParameterGeneral = cajaegresodetalleParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCajaEgresoDetalle() {
		return isPermisoTodoCajaEgresoDetalle;
	}

	public void setIsPermisoTodoCajaEgresoDetalle(Boolean isPermisoTodoCajaEgresoDetalle) {
		this.isPermisoTodoCajaEgresoDetalle = isPermisoTodoCajaEgresoDetalle;
	}

	public Boolean getIsPermisoNuevoCajaEgresoDetalle() {
		return isPermisoNuevoCajaEgresoDetalle;
	}

	public void setIsPermisoNuevoCajaEgresoDetalle(Boolean isPermisoNuevoCajaEgresoDetalle) {
		this.isPermisoNuevoCajaEgresoDetalle = isPermisoNuevoCajaEgresoDetalle;
	}

	public Boolean getIsPermisoActualizarCajaEgresoDetalle() {
		return isPermisoActualizarCajaEgresoDetalle;
	}

	public void setIsPermisoActualizarCajaEgresoDetalle(Boolean isPermisoActualizarCajaEgresoDetalle) {
		this.isPermisoActualizarCajaEgresoDetalle = isPermisoActualizarCajaEgresoDetalle;
	}

	public Boolean getIsPermisoEliminarCajaEgresoDetalle() {
		return isPermisoEliminarCajaEgresoDetalle;
	}

	public void setIsPermisoEliminarCajaEgresoDetalle(Boolean isPermisoEliminarCajaEgresoDetalle) {
		this.isPermisoEliminarCajaEgresoDetalle = isPermisoEliminarCajaEgresoDetalle;
	}

	public Boolean getIsPermisoGuardarCambiosCajaEgresoDetalle() {
		return isPermisoGuardarCambiosCajaEgresoDetalle;
	}

	public void setIsPermisoGuardarCambiosCajaEgresoDetalle(Boolean isPermisoGuardarCambiosCajaEgresoDetalle) {
		this.isPermisoGuardarCambiosCajaEgresoDetalle = isPermisoGuardarCambiosCajaEgresoDetalle;
	}
	
	public Boolean getIsPermisoConsultaCajaEgresoDetalle() {
		return isPermisoConsultaCajaEgresoDetalle;
	}

	public void setIsPermisoConsultaCajaEgresoDetalle(Boolean isPermisoConsultaCajaEgresoDetalle) {
		this.isPermisoConsultaCajaEgresoDetalle = isPermisoConsultaCajaEgresoDetalle;
	}

	public Boolean getIsPermisoBusquedaCajaEgresoDetalle() {
		return isPermisoBusquedaCajaEgresoDetalle;
	}

	public void setIsPermisoBusquedaCajaEgresoDetalle(Boolean isPermisoBusquedaCajaEgresoDetalle) {
		this.isPermisoBusquedaCajaEgresoDetalle = isPermisoBusquedaCajaEgresoDetalle;
	}

	public Boolean getIsPermisoReporteCajaEgresoDetalle() {
		return isPermisoReporteCajaEgresoDetalle;
	}

	public void setIsPermisoReporteCajaEgresoDetalle(Boolean isPermisoReporteCajaEgresoDetalle) {
		this.isPermisoReporteCajaEgresoDetalle = isPermisoReporteCajaEgresoDetalle;
	}
	
	public Boolean getIsPermisoPaginacionMedioCajaEgresoDetalle() {
		return isPermisoPaginacionMedioCajaEgresoDetalle;
	}

	public void setIsPermisoPaginacionMedioCajaEgresoDetalle(Boolean isPermisoPaginacionMedioCajaEgresoDetalle) {
		this.isPermisoPaginacionMedioCajaEgresoDetalle = isPermisoPaginacionMedioCajaEgresoDetalle;
	}
	
	public Boolean getIsPermisoPaginacionTodoCajaEgresoDetalle() {
		return isPermisoPaginacionTodoCajaEgresoDetalle;
	}

	public void setIsPermisoPaginacionTodoCajaEgresoDetalle(Boolean isPermisoPaginacionTodoCajaEgresoDetalle) {
		this.isPermisoPaginacionTodoCajaEgresoDetalle = isPermisoPaginacionTodoCajaEgresoDetalle;
	}
	
	public Boolean getIsPermisoPaginacionAltoCajaEgresoDetalle() {
		return isPermisoPaginacionAltoCajaEgresoDetalle;
	}

	public void setIsPermisoPaginacionAltoCajaEgresoDetalle(Boolean isPermisoPaginacionAltoCajaEgresoDetalle) {
		this.isPermisoPaginacionAltoCajaEgresoDetalle = isPermisoPaginacionAltoCajaEgresoDetalle;
	}
	
	public Boolean getIsPermisoCopiarCajaEgresoDetalle() {
		return isPermisoCopiarCajaEgresoDetalle;
	}

	public void setIsPermisoCopiarCajaEgresoDetalle(Boolean isPermisoCopiarCajaEgresoDetalle) {
		this.isPermisoCopiarCajaEgresoDetalle = isPermisoCopiarCajaEgresoDetalle;
	}
	
	public Boolean getIsPermisoVerFormCajaEgresoDetalle() {
		return isPermisoVerFormCajaEgresoDetalle;
	}

	public void setIsPermisoVerFormCajaEgresoDetalle(Boolean isPermisoVerFormCajaEgresoDetalle) {
		this.isPermisoVerFormCajaEgresoDetalle = isPermisoVerFormCajaEgresoDetalle;
	}
	
	public Boolean getIsPermisoDuplicarCajaEgresoDetalle() {
		return isPermisoDuplicarCajaEgresoDetalle;
	}

	public void setIsPermisoDuplicarCajaEgresoDetalle(Boolean isPermisoDuplicarCajaEgresoDetalle) {
		this.isPermisoDuplicarCajaEgresoDetalle = isPermisoDuplicarCajaEgresoDetalle;
	}
	
	public Boolean getIsPermisoOrdenCajaEgresoDetalle() {
		return isPermisoOrdenCajaEgresoDetalle;
	}

	public void setIsPermisoOrdenCajaEgresoDetalle(Boolean isPermisoOrdenCajaEgresoDetalle) {
		this.isPermisoOrdenCajaEgresoDetalle = isPermisoOrdenCajaEgresoDetalle;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCajaEgresoDetalle() {
		return isVisibilidadCeldaNuevoCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaNuevoCajaEgresoDetalle(Boolean isVisibilidadCeldaNuevoCajaEgresoDetalle) {
		this.isVisibilidadCeldaNuevoCajaEgresoDetalle = isVisibilidadCeldaNuevoCajaEgresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCajaEgresoDetalle() {
		return isVisibilidadCeldaDuplicarCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaDuplicarCajaEgresoDetalle(Boolean isVisibilidadCeldaDuplicarCajaEgresoDetalle) {
		this.isVisibilidadCeldaDuplicarCajaEgresoDetalle = isVisibilidadCeldaDuplicarCajaEgresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCajaEgresoDetalle() {
		return isVisibilidadCeldaCopiarCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaCopiarCajaEgresoDetalle(Boolean isVisibilidadCeldaCopiarCajaEgresoDetalle) {
		this.isVisibilidadCeldaCopiarCajaEgresoDetalle = isVisibilidadCeldaCopiarCajaEgresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCajaEgresoDetalle() {
		return isVisibilidadCeldaVerFormCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaVerFormCajaEgresoDetalle(Boolean isVisibilidadCeldaVerFormCajaEgresoDetalle) {
		this.isVisibilidadCeldaVerFormCajaEgresoDetalle = isVisibilidadCeldaVerFormCajaEgresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCajaEgresoDetalle() {
		return isVisibilidadCeldaOrdenCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaOrdenCajaEgresoDetalle(Boolean isVisibilidadCeldaOrdenCajaEgresoDetalle) {
		this.isVisibilidadCeldaOrdenCajaEgresoDetalle = isVisibilidadCeldaOrdenCajaEgresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle() {
		return isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle(Boolean isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle) {
		this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle = isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCajaEgresoDetalle() {
		return isVisibilidadCeldaModificarCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaModificarCajaEgresoDetalle(Boolean isVisibilidadCeldaModificarCajaEgresoDetalle) {
		this.isVisibilidadCeldaModificarCajaEgresoDetalle = isVisibilidadCeldaModificarCajaEgresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCajaEgresoDetalle() {
		return isVisibilidadCeldaActualizarCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaActualizarCajaEgresoDetalle(Boolean isVisibilidadCeldaActualizarCajaEgresoDetalle) {
		this.isVisibilidadCeldaActualizarCajaEgresoDetalle = isVisibilidadCeldaActualizarCajaEgresoDetalle;
	}

	public Boolean getIsVisibilidadCeldaEliminarCajaEgresoDetalle() {
		return isVisibilidadCeldaEliminarCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaEliminarCajaEgresoDetalle(Boolean isVisibilidadCeldaEliminarCajaEgresoDetalle) {
		this.isVisibilidadCeldaEliminarCajaEgresoDetalle = isVisibilidadCeldaEliminarCajaEgresoDetalle;
	}

	public Boolean getIsVisibilidadCeldaCancelarCajaEgresoDetalle() {
		return isVisibilidadCeldaCancelarCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaCancelarCajaEgresoDetalle(Boolean isVisibilidadCeldaCancelarCajaEgresoDetalle) {
		this.isVisibilidadCeldaCancelarCajaEgresoDetalle = isVisibilidadCeldaCancelarCajaEgresoDetalle;
	}

	public Boolean getIsVisibilidadCeldaGuardarCajaEgresoDetalle() {
		return isVisibilidadCeldaGuardarCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCajaEgresoDetalle(Boolean isVisibilidadCeldaGuardarCajaEgresoDetalle) {
		this.isVisibilidadCeldaGuardarCajaEgresoDetalle = isVisibilidadCeldaGuardarCajaEgresoDetalle;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCajaEgresoDetalle() {
		return isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCajaEgresoDetalle(Boolean isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle) {
		this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle = isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle;
	}
		
	public CajaEgresoDetalleSessionBean getcajaegresodetalleSessionBean() {
		return this.cajaegresodetalleSessionBean;
	}
	
	public void setcajaegresodetalleSessionBean(CajaEgresoDetalleSessionBean cajaegresodetalleSessionBean) {
		this.cajaegresodetalleSessionBean=cajaegresodetalleSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCajaEgreso() {
		return this.isVisibilidadFK_IdCajaEgreso;
	}

	public void setisVisibilidadFK_IdCajaEgreso(Boolean isVisibilidadFK_IdCajaEgreso) {
		this.isVisibilidadFK_IdCajaEgreso=isVisibilidadFK_IdCajaEgreso;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle)throws Exception {
		try {
			
				this.setActualParaGuardarCajaEgresoForeignKey(cajaegresodetalle,null);
				this.setActualParaGuardarEmpresaForeignKey(cajaegresodetalle,null);
				this.setActualParaGuardarSucursalForeignKey(cajaegresodetalle,null);
				this.setActualParaGuardarClienteForeignKey(cajaegresodetalle,null);
				this.setActualParaGuardarFacturaForeignKey(cajaegresodetalle,null);
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
	
	public void bugActualizarReferenciaActual(CajaEgresoDetalle cajaegresodetalle,CajaEgresoDetalle cajaegresodetalleAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCajaEgresoDetalle(cajaegresodetalle);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		cajaegresodetalleAux.setId(cajaegresodetalle.getId());
		cajaegresodetalleAux.setVersionRow(cajaegresodetalle.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCajaEgresoDetalle();
		
			int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = cajaegresodetalleValidator.getInvalidValues(this.cajaegresodetalle);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			cajaegresodetalleLogic.setDatosCliente(datosCliente);
			cajaegresodetalleLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				cajaegresodetalleAux=new  CajaEgresoDetalle();
				
				cajaegresodetalleAux.setIsNew(true);
				cajaegresodetalleAux.setIsChanged(true);
				
				cajaegresodetalleAux.setCajaEgresoDetalleOriginal(this.cajaegresodetalle);
				
				cajaegresodetalleAux.setId(this.cajaegresodetalle.getId());	
				cajaegresodetalleAux.setVersionRow(this.cajaegresodetalle.getVersionRow());	
				cajaegresodetalleAux.setid_caja_egreso(this.cajaegresodetalle.getid_caja_egreso());	
				cajaegresodetalleAux.setid_empresa(this.cajaegresodetalle.getid_empresa());	
				cajaegresodetalleAux.setid_sucursal(this.cajaegresodetalle.getid_sucursal());	
				cajaegresodetalleAux.setid_cliente(this.cajaegresodetalle.getid_cliente());	
				cajaegresodetalleAux.setid_factura(this.cajaegresodetalle.getid_factura());	
				cajaegresodetalleAux.setconcepto(this.cajaegresodetalle.getconcepto());	
				cajaegresodetalleAux.setvalor(this.cajaegresodetalle.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajaegresodetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(cajaegresodetalleAux,cajaegresodetalleLogic.getCajaEgresoDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaegresodetalleAux,cajaegresodetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleLogic.saveCajaEgresoDetalles();//WithConnection
						//cajaegresodetalleLogic.getSetVersionRowCajaEgresoDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajaegresodetalle,cajaegresodetalleAux);
					
					this.refrescarForeignKeysDescripcionesCajaEgresoDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaegresodetalleLogic.saveCajaEgresoDetalleRelaciones(cajaegresodetalleAux);//WithConnection
								//cajaegresodetalleLogic.getSetVersionRowCajaEgresoDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajaegresodetalle,cajaegresodetalleAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajaegresodetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajaegresodetalleAux,cajaegresodetalleLogic.getCajaEgresoDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajaegresodetalleAux,cajaegresodetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajaegresodetalle,cajaegresodetalleAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				cajaegresodetalleAux=new  CajaEgresoDetalle();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() 
					|| (this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() && this.cajaegresodetalle.getId()>=0)) {
						
					cajaegresodetalleAux.setIsNew(false);
				}
				
				cajaegresodetalleAux.setIsDeleted(false);
			
				cajaegresodetalleAux.setId(this.cajaegresodetalle.getId());	
				cajaegresodetalleAux.setVersionRow(this.cajaegresodetalle.getVersionRow());	
				cajaegresodetalleAux.setid_caja_egreso(this.cajaegresodetalle.getid_caja_egreso());	
				cajaegresodetalleAux.setid_empresa(this.cajaegresodetalle.getid_empresa());	
				cajaegresodetalleAux.setid_sucursal(this.cajaegresodetalle.getid_sucursal());	
				cajaegresodetalleAux.setid_cliente(this.cajaegresodetalle.getid_cliente());	
				cajaegresodetalleAux.setid_factura(this.cajaegresodetalle.getid_factura());	
				cajaegresodetalleAux.setconcepto(this.cajaegresodetalle.getconcepto());	
				cajaegresodetalleAux.setvalor(this.cajaegresodetalle.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajaegresodetalleAux,cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaegresodetalleAux,cajaegresodetalles);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleLogic.saveCajaEgresoDetalles();//WithConnection
						//cajaegresodetalleLogic.getSetVersionRowCajaEgresoDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.cajaegresodetalle,cajaegresodetalleAux);
					
					this.refrescarForeignKeysDescripcionesCajaEgresoDetalle();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaegresodetalleLogic.saveCajaEgresoDetalleRelaciones(cajaegresodetalleAux);//WithConnection
								//cajaegresodetalleLogic.getSetVersionRowCajaEgresoDetalles();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.cajaegresodetalle,cajaegresodetalleAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones() 
									|| this.cajaegresodetalleSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(cajaegresodetalleAux,cajaegresodetalleLogic.getCajaEgresoDetalles());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(cajaegresodetalleAux,cajaegresodetalles);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.cajaegresodetalle,cajaegresodetalleAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				cajaegresodetalleAux=new  CajaEgresoDetalle();
				
				cajaegresodetalleAux.setIsNew(false);
				cajaegresodetalleAux.setIsChanged(false);
				
				cajaegresodetalleAux.setIsDeleted(true);
				
				cajaegresodetalleAux.setId(this.cajaegresodetalle.getId());	
				cajaegresodetalleAux.setVersionRow(this.cajaegresodetalle.getVersionRow());	
				cajaegresodetalleAux.setid_caja_egreso(this.cajaegresodetalle.getid_caja_egreso());	
				cajaegresodetalleAux.setid_empresa(this.cajaegresodetalle.getid_empresa());	
				cajaegresodetalleAux.setid_sucursal(this.cajaegresodetalle.getid_sucursal());	
				cajaegresodetalleAux.setid_cliente(this.cajaegresodetalle.getid_cliente());	
				cajaegresodetalleAux.setid_factura(this.cajaegresodetalle.getid_factura());	
				cajaegresodetalleAux.setconcepto(this.cajaegresodetalle.getconcepto());	
				cajaegresodetalleAux.setvalor(this.cajaegresodetalle.getvalor());	
				
				if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.cajaegresodetalleAux.getId()>=0) {	
						this.cajaegresodetallesEliminados.add(cajaegresodetalleAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(cajaegresodetalleAux,cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaegresodetalleAux,cajaegresodetalles);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleLogic.saveCajaEgresoDetalles();//WithConnection
						//cajaegresodetalleLogic.getSetVersionRowCajaEgresoDetalles();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								cajaegresodetalleLogic.saveCajaEgresoDetalleRelaciones(cajaegresodetalleAux);//WithConnection
								//cajaegresodetalleLogic.getSetVersionRowCajaEgresoDetalles();//WithConnection
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
							if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones() 
								|| this.cajaegresodetalleSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(cajaegresodetalleAux,cajaegresodetalleLogic.getCajaEgresoDetalles());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(cajaegresodetalleAux,cajaegresodetalles);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(this.cajaegresodetallesEliminados);
					
					cajaegresodetalleLogic.saveCajaEgresoDetalles();//WithConnection
					//cajaegresodetalleLogic.getSetVersionRowCajaEgresoDetalles();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesCajaEgresoDetalle();
				
				this.cajaegresodetallesEliminados= new ArrayList<CajaEgresoDetalle>();		
			}
			
			if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Caja Egreso Detalle GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.cajaegresodetalle=cajaegresodetalleAux;
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
      		//this.finishProcessCajaEgresoDetalle();
      	}
		
	}	
	
	public void actualizarRelaciones(CajaEgresoDetalle cajaegresodetalleLocal) throws Exception {
		
		if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CajaEgresoDetalle cajaegresodetalleLocal) throws Exception {	
		if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(CajaEgresoDetalleFormJInternalFrame.class)) {
				CajaEgresoBeanSwingJInternalFrame cajaegresoBeanSwingJInternalFrameLocal=(CajaEgresoBeanSwingJInternalFrame) ((CajaEgresoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaegresoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCajaEgreso(cajaegresoBeanSwingJInternalFrameLocal.getcajaegreso(),true);
				cajaegresoBeanSwingJInternalFrameLocal.actualizarLista(cajaegresoBeanSwingJInternalFrameLocal.cajaegreso,this.cajaegresosForeignKey);

				cajaegresoBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaegresoBeanSwingJInternalFrameLocal.cajaegreso);

				cajaegresodetalleLocal.setCajaEgreso(cajaegresoBeanSwingJInternalFrameLocal.cajaegreso);

				this.addItemDefectoCombosForeignKeyCajaEgreso();
				this.cargarCombosFrameCajaEgresosForeignKey("Formulario");
				this.setActualCajaEgresoForeignKey(cajaegresoBeanSwingJInternalFrameLocal.cajaegreso.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				cajaegresodetalleLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				cajaegresodetalleLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				cajaegresodetalleLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				cajaegresodetalleLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarCajaEgresoDetalleActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = cajaegresodetalleValidator.getInvalidValues(this.cajaegresodetalle);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CajaEgresoDetalle cajaegresodetalle,List<CajaEgresoDetalle> cajaegresodetalles) throws Exception {
		try	{		
			CajaEgresoDetalleConstantesFunciones.actualizarLista(cajaegresodetalle,cajaegresodetalles,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CajaEgresoDetalle cajaegresodetalle,List<CajaEgresoDetalle> cajaegresodetalles) throws Exception {
		try	{			
			CajaEgresoDetalleConstantesFunciones.actualizarSelectedLista(cajaegresodetalle,cajaegresodetalles);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CajaEgresoDetalle> cajaegresodetallesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				cajaegresodetallesLocal=this.cajaegresodetalleLogic.getCajaEgresoDetalles();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				cajaegresodetallesLocal=this.cajaegresodetalles;
			}
			//ARCHITECTURE
		
			for(CajaEgresoDetalle cajaegresodetalleLocal:cajaegresodetallesLocal) {
				if(this.permiteMantenimiento(cajaegresodetalleLocal) && cajaegresodetalleLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CajaEgresoDetalleConstantesFunciones.getCajaEgresoDetalleLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CajaEgresoDetalleConstantesFunciones.IDCAJAEGRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_caja_egresoCajaEgresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoDetalleConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_empresaCajaEgresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoDetalleConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_sucursalCajaEgresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoDetalleConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_clienteCajaEgresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoDetalleConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_facturaCajaEgresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoDetalleConstantesFunciones.CONCEPTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelconceptoCajaEgresoDetalle,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CajaEgresoDetalleConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelvalorCajaEgresoDetalle,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_caja_egresoCajaEgresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_empresaCajaEgresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_sucursalCajaEgresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_clienteCajaEgresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelid_facturaCajaEgresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelconceptoCajaEgresoDetalle,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelvalorCajaEgresoDetalle,"");
		
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
		this.iIdNuevoCajaEgresoDetalle--;	
		
		
		this.cajaegresodetalleAux=new CajaEgresoDetalle();
		
		this.cajaegresodetalleAux.setId(this.iIdNuevoCajaEgresoDetalle);
		this.cajaegresodetalleAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.cajaegresodetalleLogic.getCajaEgresoDetalles().add(this.cajaegresodetalleAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.cajaegresodetalles.add(this.cajaegresodetalleAux);
		}
		//ARCHITECTURE
		
		this.cajaegresodetalle=this.cajaegresodetalleAux;
		
		if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCajaEgresoDetalle(this.cajaegresodetalle);
			this.setVariablesObjetoActualToFormularioForeignKeyCajaEgresoDetalle(this.cajaegresodetalle);
		}
				
		//this.setDefaultControlesCajaEgresoDetalle();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCajaEgresoDetalle();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCajaEgresoDetalle();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaEgresoDetalle();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaEgresoDetalle(this.cajaegresodetalleBean,this.cajaegresodetalle,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
			classes=CajaEgresoDetalleConstantesFunciones.getClassesRelationshipsOfCajaEgresoDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.cajaegresodetalleReturnGeneral=cajaegresodetalleLogic.procesarEventosCajaEgresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaegresodetalleLogic.getCajaEgresoDetalles(),this.cajaegresodetalle,this.cajaegresodetalleParameterGeneral,this.isEsNuevoCajaEgresoDetalle,classes);//this.cajaegresodetalleLogic.getCajaEgresoDetalle()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral,this.cajaegresodetalleBean,false);
		
		if(this.cajaegresodetalleReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle());
		}
		
		if(this.cajaegresodetalleReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle(),classes);//this.cajaegresodetalleBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCajaEgresoDetalle();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCajaEgresoDetalle();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.RecargarFormCajaEgresoDetalle(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCajaEgresoDetalle(false);
						
			if(cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaEgresoDetalle();
			}
			
			this.actualizarVisualTableDatosCajaEgresoDetalle();
			
			this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(this.getIndiceNuevoCajaEgresoDetalle(), this.getIndiceNuevoCajaEgresoDetalle());
			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
						
			this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCajaEgresoDetalle(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextAreaconceptoCajaEgresoDetalle.setEnabled(isHabilitar && this.cajaegresodetalleConstantesFunciones.activarconceptoCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextFieldvalorCajaEgresoDetalle.setEnabled(isHabilitar && this.cajaegresodetalleConstantesFunciones.activarvalorCajaEgresoDetalle);	
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setEnabled(isHabilitar && this.cajaegresodetalleConstantesFunciones.activarid_caja_egresoCajaEgresoDetalle);//
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setEnabled(isHabilitar && this.cajaegresodetalleConstantesFunciones.activarid_empresaCajaEgresoDetalle);//
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setEnabled(isHabilitar && this.cajaegresodetalleConstantesFunciones.activarid_sucursalCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setEnabled(isHabilitar && this.cajaegresodetalleConstantesFunciones.activarid_clienteCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setEnabled(isHabilitar && this.cajaegresodetalleConstantesFunciones.activarid_facturaCajaEgresoDetalle);
	};
	
	public void setDefaultControlesCajaEgresoDetalle() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCajaEgresoDetalle(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.cajaegresodetalleSessionBean.setConGuardarRelaciones(true);			
			this.cajaegresodetalleSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.setVisible(true);
			
					
		} else {
			//this.cajaegresodetalleSessionBean.setConGuardarRelaciones(false);			
			this.cajaegresodetalleSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoCajaEgresoDetalle() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
				if(cajaegresodetalleAux.getId().equals(this.iIdNuevoCajaEgresoDetalle)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalles) {
				if(cajaegresodetalleAux.getId().equals(this.iIdNuevoCajaEgresoDetalle)) {
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
	
	public int getIndiceActualCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
				if(cajaegresodetalleAux.getId().equals(cajaegresodetalle.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalles) {
				if(cajaegresodetalleAux.getId().equals(cajaegresodetalle.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalleOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
				if(cajaegresodetalleAux.getCajaEgresoDetalleOriginal().getId().equals(cajaegresodetalleOriginal.getId())) {
					existe=true;
					cajaegresodetalleOriginal.setId(cajaegresodetalleAux.getId());
					cajaegresodetalleOriginal.setVersionRow(cajaegresodetalleAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalles) {
				if(cajaegresodetalleAux.getCajaEgresoDetalleOriginal().getId().equals(cajaegresodetalleOriginal.getId())) {
					existe=true;
					cajaegresodetalleOriginal.setId(cajaegresodetalleAux.getId());
					cajaegresodetalleOriginal.setVersionRow(cajaegresodetalleAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCajaEgresoDetalle(Boolean esParaCancelar) throws Exception {
		cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
		cajaegresodetalleAux=new CajaEgresoDetalle();
		
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
					if(cajaegresodetalleAux.getId()<0) {
						cajaegresodetallesAux.add(cajaegresodetalleAux);
					}		
				}
				this.iIdNuevoCajaEgresoDetalle=0L;
				this.cajaegresodetalleLogic.getCajaEgresoDetalles().removeAll(cajaegresodetallesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalles) {
					if(cajaegresodetalleAux.getId()<0) {
						cajaegresodetallesAux.add(cajaegresodetalleAux);
					}		
				}
				this.iIdNuevoCajaEgresoDetalle=0L;
				this.cajaegresodetalles.removeAll(cajaegresodetallesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCajaEgresoDetalle 
					&& this.cajaegresodetalleLogic.getCajaEgresoDetalles().size()>0
					) {
					cajaegresodetalleAux=this.cajaegresodetalleLogic.getCajaEgresoDetalles().get(this.cajaegresodetalleLogic.getCajaEgresoDetalles().size() - 1);
				
					if(cajaegresodetalleAux.getId()<0) {
						this.cajaegresodetalleLogic.getCajaEgresoDetalles().remove(cajaegresodetalleAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCajaEgresoDetalle && this.cajaegresodetalles.size()>0) {
					cajaegresodetalleAux=this.cajaegresodetalles.get(this.cajaegresodetalles.size() - 1);
				
					if(cajaegresodetalleAux.getId()<0) {
						this.cajaegresodetalles.remove(cajaegresodetalleAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCajaEgresoDetalle(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(cajaegresodetalle.getId()<0) {
				this.cajaegresodetalleLogic.getCajaEgresoDetalles().remove(this.cajaegresodetalle);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(cajaegresodetalle.getId()<0) {
				this.cajaegresodetalles.remove(this.cajaegresodetalle);
			}
		}			
	}
	
	public void setEstadosInicialesCajaEgresoDetalle(List<CajaEgresoDetalle> cajaegresodetallesAux) throws Exception {
		CajaEgresoDetalleConstantesFunciones.setEstadosInicialesCajaEgresoDetalle(cajaegresodetallesAux);
	}
	
	public void setEstadosInicialesCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalleAux) throws Exception {
		CajaEgresoDetalleConstantesFunciones.setEstadosInicialesCajaEgresoDetalle(cajaegresodetalleAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCajaEgresoDetalleActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCajaEgresoDetalleActual()) {
				if(!this.isEsNuevoCajaEgresoDetalle) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCajaEgresoDetalle=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCajaEgresoDetalleActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Caja Egreso Detalle ?", "MANTENIMIENTO DE Caja Egreso Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CajaEgresoDetalle cajaegresodetalle) throws Exception {
		CajaEgresoDetalleConstantesFunciones.seleccionarAsignar(this.cajaegresodetalle,cajaegresodetalle);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCajaEgresoDetalle=this.isPermisoActualizarOriginalCajaEgresoDetalle;
			
			
			this.seleccionarAsignar(cajaegresodetalle);
			
			

			idClienteActual=cajaegresodetalle.getid_cliente();
			this.seleccionarClienteActual();

			idFacturaActual=cajaegresodetalle.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CajaEgresoDetalleConstantesFunciones.quitarEspaciosCajaEgresoDetalle(this.cajaegresodetalle,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.cajaegresodetalleSessionBean.setsFuncionBusquedaRapida(this.cajaegresodetalleSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoCajaEgresoDetalle) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCajaEgresoDetalle(esParaCancelar);				
				this.cancelarNuevoCajaEgresoDetalle(esParaCancelar);								
			}
			
			this.cajaegresodetalle=new CajaEgresoDetalle();
			
			this.inicializarCajaEgresoDetalle();
			
			this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCajaEgresoDetalle() throws Exception {
		try {
			CajaEgresoDetalleConstantesFunciones.inicializarCajaEgresoDetalle(this.cajaegresodetalle);
			
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
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.cajaegresodetalleLogic.getCajaEgresoDetalles().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCajaEgresoDetalles(String sAccionBusqueda,List<CajaEgresoDetalle> cajaegresodetallesParaReportes) throws Exception {
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
					sPathReporteFinal="CajaEgresoDetalle"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CajaEgresoDetalleMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CajaEgresoDetalleMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CajaEgresoDetalle"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Caja Egreso Detalles");		
		parameters.put("busquedapor", CajaEgresoDetalleConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCajaEgresoDetalle=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CajaEgresoDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CajaEgresoDetalleConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCajaEgresoDetalle=new JRBeanArrayDataSource(CajaEgresoDetalleJInternalFrame.TraerCajaEgresoDetalleBeans(cajaegresodetallesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCajaEgresoDetalle);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CajaEgresoDetalleConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CajaEgresoDetalleConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CajaEgresoDetalleBean.TraerCajaEgresoDetalleBeans(cajaegresodetallesParaReportes).toArray()));
							
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
				this.generarExcelReporteCajaEgresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaegresodetallesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCajaEgresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaegresodetallesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCajaEgresoDetalleActionPerformed(null);
					//this.generarExcelReporteCajaEgresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaegresodetallesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCajaEgresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaegresodetallesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCajaEgresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaegresodetallesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCajaEgresoDetalles(sAccionBusqueda,sTipoArchivoReporte,cajaegresodetallesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCajaEgresoDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaEgresoDetalle> cajaegresodetallesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegresodetalle";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaEgresoDetalles");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaEgresoDetalle("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CajaEgresoDetalle cajaegresodetalle : cajaegresodetallesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CajaEgresoDetalleConstantesFunciones.generarExcelReporteDataCajaEgresoDetalle("NORMAL",row,workbook,cajaegresodetalle,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCajaEgresoDetalle(String sTipo,Row row,Workbook workbook) {
		
		CajaEgresoDetalleConstantesFunciones.generarExcelReporteHeaderCajaEgresoDetalle(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCajaEgresoDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaEgresoDetalle> cajaegresodetallesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegresodetalle_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaEgresoDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CajaEgresoDetalle cajaegresodetalle : cajaegresodetallesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CajaEgresoDetalleConstantesFunciones.getCajaEgresoDetalleDescripcion(cajaegresodetalle));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegresodetalle.getcajaegreso_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegresodetalle.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegresodetalle.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegresodetalle.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegresodetalle.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegresodetalle.getconcepto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CajaEgresoDetalleConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(cajaegresodetalle.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCajaEgresoDetalles(String sAccionBusqueda,String sTipoArchivoReporte,List<CajaEgresoDetalle> cajaegresodetallesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CajaEgresoDetalle> cajaegresodetallesRespaldo=null;
		
		classes=CajaEgresoDetalleConstantesFunciones.getClassesRelationshipsOfCajaEgresoDetalle(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.cajaegresodetalleLogic.setDatosCliente(this.datosCliente);
		this.cajaegresodetalleLogic.setDatosDeep(this.datosDeep);
		this.cajaegresodetalleLogic.setIsConDeep(true);
		
		cajaegresodetallesRespaldo=this.cajaegresodetalleLogic.getCajaEgresoDetalles();
		
		this.cajaegresodetalleLogic.setCajaEgresoDetalles(cajaegresodetallesParaReportes);	
		this.cajaegresodetalleLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		cajaegresodetallesParaReportes=this.cajaegresodetalleLogic.getCajaEgresoDetalles();
		this.cajaegresodetalleLogic.setCajaEgresoDetalles(cajaegresodetallesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegresodetalle_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CajaEgresoDetalles");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCajaEgresoDetalle("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CajaEgresoDetalle cajaegresodetalle : cajaegresodetallesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCajaEgresoDetalle("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CajaEgresoDetalleConstantesFunciones.generarExcelReporteDataCajaEgresoDetalle("NORMAL",row,workbook,cajaegresodetalle,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(CajaEgresoDetalleConstantesFunciones.getCajaEgresoDetalleDescripcion(cajaegresodetalle));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCajaEgresoDetalle() throws Exception {		
		this.startProcessCajaEgresoDetalle(true);
	}
	
	public void startProcessCajaEgresoDetalle(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasCajaEgresoDetalle ,this.jPanelParametrosReportesCajaEgresoDetalle, this.jScrollPanelDatosCajaEgresoDetalle,this.jPanelPaginacionCajaEgresoDetalle, this.jScrollPanelDatosEdicionCajaEgresoDetalle, this.jPanelAccionesCajaEgresoDetalle,this.jPanelAccionesFormularioCajaEgresoDetalle,this.jmenuBarCajaEgresoDetalle,this.jmenuBarDetalleCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,this.jTtoolBarDetalleCajaEgresoDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaEgresoDetalle=this.jTabbedPaneBusquedasCajaEgresoDetalle; 
		
		final JPanel jPanelParametrosReportesCajaEgresoDetalle=this.jPanelParametrosReportesCajaEgresoDetalle;
		//final JScrollPane jScrollPanelDatosCajaEgresoDetalle=this.jScrollPanelDatosCajaEgresoDetalle;
		final JTable jTableDatosCajaEgresoDetalle=this.jTableDatosCajaEgresoDetalle;		
		final JPanel jPanelPaginacionCajaEgresoDetalle=this.jPanelPaginacionCajaEgresoDetalle;
		//final JScrollPane jScrollPanelDatosEdicionCajaEgresoDetalle=this.jScrollPanelDatosEdicionCajaEgresoDetalle;
		final JPanel jPanelAccionesCajaEgresoDetalle=this.jPanelAccionesCajaEgresoDetalle;
		
		JPanel jPanelCamposAuxiliarCajaEgresoDetalle=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCajaEgresoDetalle=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			jPanelCamposAuxiliarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelCamposCajaEgresoDetalle;
			jPanelAccionesFormularioAuxiliarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelAccionesFormularioCajaEgresoDetalle;
		}
		
		final JPanel jPanelCamposCajaEgresoDetalle=jPanelCamposAuxiliarCajaEgresoDetalle;
		final JPanel jPanelAccionesFormularioCajaEgresoDetalle=jPanelAccionesFormularioAuxiliarCajaEgresoDetalle;
		
		
		final JMenuBar jmenuBarCajaEgresoDetalle=this.jmenuBarCajaEgresoDetalle;
		final JToolBar jTtoolBarCajaEgresoDetalle=this.jTtoolBarCajaEgresoDetalle;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCajaEgresoDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaEgresoDetalle=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			jmenuBarDetalleAuxiliarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jmenuBarDetalleCajaEgresoDetalle;
			jTtoolBarDetalleAuxiliarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jTtoolBarDetalleCajaEgresoDetalle;
		}
		
		final JMenuBar jmenuBarDetalleCajaEgresoDetalle=jmenuBarDetalleAuxiliarCajaEgresoDetalle;
		final JToolBar jTtoolBarDetalleCajaEgresoDetalle=jTtoolBarDetalleAuxiliarCajaEgresoDetalle;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaEgresoDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaEgresoDetalle;
			processRunnable.jTableDatos=jTableDatosCajaEgresoDetalle;
			processRunnable.jPanelCampos=jPanelCamposCajaEgresoDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaEgresoDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesCajaEgresoDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaEgresoDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarCajaEgresoDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaEgresoDetalle;
			processRunnable.jTtoolBar=jTtoolBarCajaEgresoDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaEgresoDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaEgresoDetalle ,jPanelParametrosReportesCajaEgresoDetalle,jTableDatosCajaEgresoDetalle, /*jScrollPanelDatosCajaEgresoDetalle,*/jPanelCamposCajaEgresoDetalle,jPanelPaginacionCajaEgresoDetalle, /*jScrollPanelDatosEdicionCajaEgresoDetalle,*/ jPanelAccionesCajaEgresoDetalle,jPanelAccionesFormularioCajaEgresoDetalle,jmenuBarCajaEgresoDetalle,jmenuBarDetalleCajaEgresoDetalle,jTtoolBarCajaEgresoDetalle,jTtoolBarDetalleCajaEgresoDetalle);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCajaEgresoDetalle ,jPanelParametrosReportesCajaEgresoDetalle, jScrollPanelDatosCajaEgresoDetalle,jPanelPaginacionCajaEgresoDetalle, jScrollPanelDatosEdicionCajaEgresoDetalle, jPanelAccionesCajaEgresoDetalle,jPanelAccionesFormularioCajaEgresoDetalle,jmenuBarCajaEgresoDetalle,jmenuBarDetalleCajaEgresoDetalle,jTtoolBarCajaEgresoDetalle,jTtoolBarDetalleCajaEgresoDetalle);
						
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
	
	public void finishProcessCajaEgresoDetalle() {// throws Exception 
		this.finishProcessCajaEgresoDetalle(true);
	}
	
	public void finishProcessCajaEgresoDetalle(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasCajaEgresoDetalle ,this.jPanelParametrosReportesCajaEgresoDetalle, this.jScrollPanelDatosCajaEgresoDetalle,this.jPanelPaginacionCajaEgresoDetalle, this.jScrollPanelDatosEdicionCajaEgresoDetalle, this.jPanelAccionesCajaEgresoDetalle,this.jPanelAccionesFormularioCajaEgresoDetalle,this.jmenuBarCajaEgresoDetalle,this.jmenuBarDetalleCajaEgresoDetalle,this.jTtoolBarCajaEgresoDetalle,this.jTtoolBarDetalleCajaEgresoDetalle);		
		
		final JTabbedPane jTabbedPaneBusquedasCajaEgresoDetalle=this.jTabbedPaneBusquedasCajaEgresoDetalle; 
		
		final JPanel jPanelParametrosReportesCajaEgresoDetalle=this.jPanelParametrosReportesCajaEgresoDetalle;
		//final JScrollPane jScrollPanelDatosCajaEgresoDetalle=this.jScrollPanelDatosCajaEgresoDetalle;
		final JTable jTableDatosCajaEgresoDetalle=this.jTableDatosCajaEgresoDetalle;		
		final JPanel jPanelPaginacionCajaEgresoDetalle=this.jPanelPaginacionCajaEgresoDetalle;
		//final JScrollPane jScrollPanelDatosEdicionCajaEgresoDetalle=this.jScrollPanelDatosEdicionCajaEgresoDetalle;
		final JPanel jPanelAccionesCajaEgresoDetalle=this.jPanelAccionesCajaEgresoDetalle;
		
		JPanel jPanelCamposAuxiliarCajaEgresoDetalle=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCajaEgresoDetalle=new JPanel();
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			jPanelCamposAuxiliarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelCamposCajaEgresoDetalle;
			jPanelAccionesFormularioAuxiliarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelAccionesFormularioCajaEgresoDetalle;
		}
		
		final JPanel jPanelCamposCajaEgresoDetalle=jPanelCamposAuxiliarCajaEgresoDetalle;
		final JPanel jPanelAccionesFormularioCajaEgresoDetalle=jPanelAccionesFormularioAuxiliarCajaEgresoDetalle;
		
		
		final JMenuBar jmenuBarCajaEgresoDetalle=this.jmenuBarCajaEgresoDetalle;		
		final JToolBar jTtoolBarCajaEgresoDetalle=this.jTtoolBarCajaEgresoDetalle;
				
		JMenuBar jmenuBarDetalleAuxiliarCajaEgresoDetalle=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCajaEgresoDetalle=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			jmenuBarDetalleAuxiliarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jmenuBarDetalleCajaEgresoDetalle;
			jTtoolBarDetalleAuxiliarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jTtoolBarDetalleCajaEgresoDetalle;		
		}
		
		final JMenuBar jmenuBarDetalleCajaEgresoDetalle=jmenuBarDetalleAuxiliarCajaEgresoDetalle;
		final JToolBar jTtoolBarDetalleCajaEgresoDetalle=jTtoolBarDetalleAuxiliarCajaEgresoDetalle;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCajaEgresoDetalle;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCajaEgresoDetalle;
			processRunnable.jTableDatos=jTableDatosCajaEgresoDetalle;
			processRunnable.jPanelCampos=jPanelCamposCajaEgresoDetalle;
			processRunnable.jPanelPaginacion=jPanelPaginacionCajaEgresoDetalle;
			processRunnable.jPanelAcciones=jPanelAccionesCajaEgresoDetalle;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCajaEgresoDetalle;
			
			
			processRunnable.jmenuBar=jmenuBarCajaEgresoDetalle;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCajaEgresoDetalle;
			processRunnable.jTtoolBar=jTtoolBarCajaEgresoDetalle;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCajaEgresoDetalle;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCajaEgresoDetalle ,jPanelParametrosReportesCajaEgresoDetalle, jTableDatosCajaEgresoDetalle,/*jScrollPanelDatosCajaEgresoDetalle,*/jPanelCamposCajaEgresoDetalle,jPanelPaginacionCajaEgresoDetalle, /*jScrollPanelDatosEdicionCajaEgresoDetalle,*/ jPanelAccionesCajaEgresoDetalle,jPanelAccionesFormularioCajaEgresoDetalle,jmenuBarCajaEgresoDetalle,jmenuBarDetalleCajaEgresoDetalle,jTtoolBarCajaEgresoDetalle,jTtoolBarDetalleCajaEgresoDetalle));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCajaEgresoDetalle(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCajaEgresoDetalle(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCajaEgresoDetalle(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCajaEgresoDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCajaEgresoDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCajaEgresoDetalle,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCajaEgresoDetalle(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCajaEgresoDetalle,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCajaEgresoDetalle,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.cajaegresodetalleConstantesFunciones.getsFinalQueryCajaEgresoDetalle();
		String  finalQueryPaginacionTodos=this.cajaegresodetalleConstantesFunciones.getsFinalQueryCajaEgresoDetalle();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CajaEgresoDetalleConstantesFunciones.getArrayColumnasGlobalesNoCajaEgresoDetalle(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CajaEgresoDetalleConstantesFunciones.getArrayColumnasGlobalesCajaEgresoDetalle(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CajaEgresoDetalleConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.cajaegresodetallesEliminados= new ArrayList<CajaEgresoDetalle>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCajaEgresoDetalle();
		
				///*CajaEgresoDetalleSessionBean*/this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			
			if(this.cajaegresodetalleSessionBean==null) {
				this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
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
					this.iNumeroPaginacion=CajaEgresoDetalleConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CajaEgresoDetalleConstantesFunciones.getClassesForeignKeysOfCajaEgresoDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/cajaegresodetalle."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			cajaegresodetallesAux= new ArrayList<CajaEgresoDetalle>();
			
				
			cajaegresodetalleLogic.setDatosCliente(this.datosCliente);
			cajaegresodetalleLogic.setDatosDeep(this.datosDeep);
			cajaegresodetalleLogic.setIsConDeep(true);
			
			
			cajaegresodetalleLogic.getCajaEgresoDetalleDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					cajaegresodetalleLogic.getTodosCajaEgresoDetalles(finalQueryGlobal,pagination);
					
					//cajaegresodetalleLogic.getTodosCajaEgresoDetallesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(cajaegresodetalleLogic.getCajaEgresoDetalles()==null|| cajaegresodetalleLogic.getCajaEgresoDetalles().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaegresodetallesAux= new ArrayList<CajaEgresoDetalle>();
							cajaegresodetallesAux.addAll(cajaegresodetalleLogic.getCajaEgresoDetalles());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetallesAux= new ArrayList<CajaEgresoDetalle>();
							cajaegresodetallesAux.addAll(cajaegresodetalles);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaegresodetalleLogic.getTodosCajaEgresoDetalles(finalQueryGlobal+"",this.pagination);												
							
							//cajaegresodetalleLogic.getTodosCajaEgresoDetallesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCajaEgresoDetalles("Todos",cajaegresodetalleLogic.getCajaEgresoDetalles() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());					
							cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(cajaegresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetalles=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetalles.addAll(cajaegresodetallesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCajaEgresoDetalle=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCajaEgresoDetalle=this.idActual;
				
				} else if(this.idCajaEgresoDetalleActual!=null && this.idCajaEgresoDetalleActual!=0L) {
					idCajaEgresoDetalle=idCajaEgresoDetalleActual;
				}
				
					
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndicePorId(idCajaEgresoDetalle);
				
				this.cajaegresodetalles=new ArrayList<CajaEgresoDetalle>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					cajaegresodetalleLogic.getEntity(idCajaEgresoDetalle);
					
					//cajaegresodetalleLogic.getEntityWithConnection(idCajaEgresoDetalle);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
					cajaegresodetalleLogic.getCajaEgresoDetalles().add(cajaegresodetalleLogic.getCajaEgresoDetalle());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegresodetalles=new ArrayList<CajaEgresoDetalle>();
					this.cajaegresodetalles.add(cajaegresodetalle);
				}
				
				if(cajaegresodetalleLogic.getCajaEgresoDetalle()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCajaEgreso")) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaEgreso(id_caja_egresoFK_IdCajaEgreso);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdCajaEgreso(finalQueryGlobal,pagination,id_caja_egresoFK_IdCajaEgreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaEgreso(id_caja_egresoFK_IdCajaEgreso);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaEgreso(id_caja_egresoFK_IdCajaEgreso);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresodetalleLogic.getCajaEgresoDetalles()==null||cajaegresodetalleLogic.getCajaEgresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresodetalles==null|| cajaegresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
						cajaegresodetallesAux.addAll(cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetallesAux.addAll(cajaegresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdCajaEgreso(finalQueryGlobal,pagination,id_caja_egresoFK_IdCajaEgreso);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaEgreso(id_caja_egresoFK_IdCajaEgreso);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCajaEgreso(id_caja_egresoFK_IdCajaEgreso);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresoDetalles("FK_IdCajaEgreso",cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresoDetalles("FK_IdCajaEgreso",cajaegresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
						cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(cajaegresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetalles=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetalles.addAll(cajaegresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresodetalleLogic.getCajaEgresoDetalles()==null||cajaegresodetalleLogic.getCajaEgresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresodetalles==null|| cajaegresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
						cajaegresodetallesAux.addAll(cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetallesAux.addAll(cajaegresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresoDetalles("FK_IdCliente",cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresoDetalles("FK_IdCliente",cajaegresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
						cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(cajaegresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetalles=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetalles.addAll(cajaegresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresodetalleLogic.getCajaEgresoDetalles()==null||cajaegresodetalleLogic.getCajaEgresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresodetalles==null|| cajaegresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
						cajaegresodetallesAux.addAll(cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetallesAux.addAll(cajaegresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresoDetalles("FK_IdEmpresa",cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresoDetalles("FK_IdEmpresa",cajaegresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
						cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(cajaegresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetalles=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetalles.addAll(cajaegresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFactura")) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresodetalleLogic.getCajaEgresoDetalles()==null||cajaegresodetalleLogic.getCajaEgresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresodetalles==null|| cajaegresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
						cajaegresodetallesAux.addAll(cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetallesAux.addAll(cajaegresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdFactura(finalQueryGlobal,pagination,id_facturaFK_IdFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdFactura(id_facturaFK_IdFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresoDetalles("FK_IdFactura",cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresoDetalles("FK_IdFactura",cajaegresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
						cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(cajaegresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetalles=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetalles.addAll(cajaegresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=cajaegresodetalleLogic.getCajaEgresoDetalles()==null||cajaegresodetalleLogic.getCajaEgresoDetalles().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=cajaegresodetalles==null|| cajaegresodetalles.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
						cajaegresodetallesAux.addAll(cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetallesAux=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetallesAux.addAll(cajaegresodetalles);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=CajaEgresoDetalleConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteCajaEgresoDetalles("FK_IdSucursal",cajaegresodetalleLogic.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteCajaEgresoDetalles("FK_IdSucursal",cajaegresodetalles);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleLogic.setCajaEgresoDetalles(new ArrayList<CajaEgresoDetalle>());
						cajaegresodetalleLogic.getCajaEgresoDetalles().addAll(cajaegresodetallesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetalles=new ArrayList<CajaEgresoDetalle>();
							cajaegresodetalles.addAll(cajaegresodetallesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCajaEgresoDetalle();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCajaEgresoDetalle();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajaegresodetalleLogic.getCajaEgresoDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaegresodetalles.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=cajaegresodetalleLogic.getCajaEgresoDetalles().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=cajaegresodetalles.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CajaEgresoDetalle cajaegresodetalle) {
		Boolean permite=true;
		
		if(this.cajaegresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CajaEgresoDetalleConstantesFunciones.getOrderByListaCajaEgresoDetalle();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CajaEgresoDetalleConstantesFunciones.getOrderByListaCajaEgresoDetalle();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetalleLogic.getCajaEgresoDetalles()) {
				if(cajaegresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					cajaegresodetalleTotales=cajaegresodetalle;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgresoDetalle cajaegresodetalle:this.cajaegresodetalles) {
				if(cajaegresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					cajaegresodetalleTotales=cajaegresodetalle;
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
			this.cajaegresodetalleAux=new CajaEgresoDetalle();
			this.cajaegresodetalleAux.setsType(Constantes2.S_TOTALES);
			this.cajaegresodetalleAux.setIsNew(false);
			this.cajaegresodetalleAux.setIsChanged(false);
			this.cajaegresodetalleAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CajaEgresoDetalleConstantesFunciones.TotalizarValoresFilaCajaEgresoDetalle(this.cajaegresodetalleLogic.getCajaEgresoDetalles(),this.cajaegresodetalleAux);
				
				this.cajaegresodetalleLogic.getCajaEgresoDetalles().add(this.cajaegresodetalleAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CajaEgresoDetalleConstantesFunciones.TotalizarValoresFilaCajaEgresoDetalle(this.cajaegresodetalles,this.cajaegresodetalleAux);
				
				this.cajaegresodetalles.add(this.cajaegresodetalleAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		cajaegresodetalleTotales=new CajaEgresoDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajaegresodetalleLogic.getCajaEgresoDetalles().remove(cajaegresodetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.cajaegresodetalles.remove(cajaegresodetalleTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		cajaegresodetalleTotales=new CajaEgresoDetalle();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetalleLogic.getCajaEgresoDetalles()) {
				if(cajaegresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					cajaegresodetalleTotales=cajaegresodetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaEgresoDetalleConstantesFunciones.TotalizarValoresFilaCajaEgresoDetalle(this.cajaegresodetalleLogic.getCajaEgresoDetalles(),cajaegresodetalleTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CajaEgresoDetalle cajaegresodetalle:this.cajaegresodetalles) {
				if(cajaegresodetalle.getsType().equals(Constantes2.S_TOTALES)) {
					cajaegresodetalleTotales=cajaegresodetalle;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CajaEgresoDetalleConstantesFunciones.TotalizarValoresFilaCajaEgresoDetalle(this.cajaegresodetalles,cajaegresodetalleTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getCajaEgresoDetallesFK_IdCajaEgreso()throws Exception {
		try {
			sAccionBusqueda="FK_IdCajaEgreso";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaEgresoDetallesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaEgresoDetallesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaEgresoDetallesFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getCajaEgresoDetallesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getCajaEgresoDetallesFK_IdCajaEgreso(String sFinalQuery,Long id_caja_egreso)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdCajaEgreso(sFinalQuery,this.pagination,id_caja_egreso);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaEgresoDetallesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaEgresoDetallesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaEgresoDetallesFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getCajaEgresoDetallesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresodetalleLogic.getCajaEgresoDetallesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosCajaEgresoDetalle() {
		this.isPermisoTodoCajaEgresoDetalle=false;
		this.isPermisoNuevoCajaEgresoDetalle=false;
		this.isPermisoActualizarCajaEgresoDetalle=false;
		this.isPermisoActualizarOriginalCajaEgresoDetalle=false;
		this.isPermisoEliminarCajaEgresoDetalle=false;
		this.isPermisoGuardarCambiosCajaEgresoDetalle=false;
		this.isPermisoConsultaCajaEgresoDetalle=false;
		this.isPermisoBusquedaCajaEgresoDetalle=false;
		this.isPermisoReporteCajaEgresoDetalle=false;		
		this.isPermisoOrdenCajaEgresoDetalle=false;		
		this.isPermisoPaginacionMedioCajaEgresoDetalle=false;		
		this.isPermisoPaginacionAltoCajaEgresoDetalle=false;
		this.isPermisoPaginacionTodoCajaEgresoDetalle=false;
		this.isPermisoCopiarCajaEgresoDetalle=false;		
		this.isPermisoVerFormCajaEgresoDetalle=false;		
		this.isPermisoDuplicarCajaEgresoDetalle=false;		
		this.isPermisoOrdenCajaEgresoDetalle=false;		
	}
	
	public void setPermisosUsuarioCajaEgresoDetalle(Boolean isPermiso) {
		this.isPermisoTodoCajaEgresoDetalle=isPermiso;
		this.isPermisoNuevoCajaEgresoDetalle=isPermiso;
		this.isPermisoActualizarCajaEgresoDetalle=isPermiso;
		this.isPermisoActualizarOriginalCajaEgresoDetalle=isPermiso;
		this.isPermisoEliminarCajaEgresoDetalle=isPermiso;
		this.isPermisoGuardarCambiosCajaEgresoDetalle=isPermiso;
		this.isPermisoConsultaCajaEgresoDetalle=isPermiso;
		this.isPermisoBusquedaCajaEgresoDetalle=isPermiso;
		this.isPermisoReporteCajaEgresoDetalle=isPermiso;
		this.isPermisoOrdenCajaEgresoDetalle=isPermiso;		
		this.isPermisoPaginacionMedioCajaEgresoDetalle=isPermiso;		
		this.isPermisoPaginacionAltoCajaEgresoDetalle=isPermiso;		
		this.isPermisoPaginacionTodoCajaEgresoDetalle=isPermiso;		
		this.isPermisoCopiarCajaEgresoDetalle=isPermiso;		
		this.isPermisoVerFormCajaEgresoDetalle=isPermiso;		
		this.isPermisoDuplicarCajaEgresoDetalle=isPermiso;
		this.isPermisoOrdenCajaEgresoDetalle=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCajaEgresoDetalle(Boolean isPermiso) {
		//this.isPermisoTodoCajaEgresoDetalle=isPermiso;
		this.isPermisoNuevoCajaEgresoDetalle=isPermiso;
		this.isPermisoActualizarCajaEgresoDetalle=isPermiso;
		this.isPermisoActualizarOriginalCajaEgresoDetalle=isPermiso;
		this.isPermisoEliminarCajaEgresoDetalle=isPermiso;
		this.isPermisoGuardarCambiosCajaEgresoDetalle=isPermiso;
		//this.isPermisoConsultaCajaEgresoDetalle=isPermiso;
		//this.isPermisoBusquedaCajaEgresoDetalle=isPermiso;
		//this.isPermisoReporteCajaEgresoDetalle=isPermiso;
		//this.isPermisoOrdenCajaEgresoDetalle=isPermiso;		
		//this.isPermisoPaginacionMedioCajaEgresoDetalle=isPermiso;		
		//this.isPermisoPaginacionAltoCajaEgresoDetalle=isPermiso;		
		//this.isPermisoPaginacionTodoCajaEgresoDetalle=isPermiso;		
		//this.isPermisoCopiarCajaEgresoDetalle=isPermiso;		
		//this.isPermisoDuplicarCajaEgresoDetalle=isPermiso;
		//this.isPermisoOrdenCajaEgresoDetalle=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCajaEgresoDetalleClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(CajaEgresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebCajaEgresoDetalle(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCajaEgresoDetalleClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioCajaEgresoDetalleClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCajaEgresoDetalleClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCajaEgresoDetalleClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioCajaEgresoDetalle() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CajaEgresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CajaEgresoDetalleConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCajaEgresoDetalle=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCajaEgresoDetalle=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCajaEgresoDetalle=this.isPermisoActualizarCajaEgresoDetalle;
			this.isPermisoEliminarCajaEgresoDetalle=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCajaEgresoDetalle=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCajaEgresoDetalle=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCajaEgresoDetalle=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCajaEgresoDetalle=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCajaEgresoDetalle=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaEgresoDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCajaEgresoDetalle=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCajaEgresoDetalle=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCajaEgresoDetalle=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCajaEgresoDetalle=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCajaEgresoDetalle=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCajaEgresoDetalle=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCajaEgresoDetalle=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCajaEgresoDetalle.setToolTipText(this.jTableDatosCajaEgresoDetalle.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCajaEgresoDetalle(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCajaEgresoDetalle(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CajaEgresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CajaEgresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCajaEgresoDetalle() throws Exception {
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
	public void inicializarCombosForeignKeyCajaEgresoDetalleListas()throws Exception {
		try	{						
			
				this.cajaegresosForeignKey=new ArrayList();
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCajaEgresoDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CajaEgresoDetalleJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCajaEgresoDetalleListas(false);
			} else {
			
				this.cargarCombosForeignKeyCajaEgresoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyCajaEgresoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajaegresosForeignKey==null||this.cajaegresosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaEgresoConstantesFunciones.getArrayColumnasGlobalesCajaEgreso(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaEgresoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaEgresoConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajaEgresosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyCajaEgresoDetalleListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			CajaEgresoDetalleParameterReturnGeneral cajaegresodetalleReturnGeneral=new CajaEgresoDetalleParameterReturnGeneral();
						
			


				String finalQueryGlobalCajaEgreso="";

				if(((this.cajaegresosForeignKey==null||this.cajaegresosForeignKey.size()<=0) && this.cajaegresodetalleConstantesFunciones.cargarid_caja_egresoCajaEgresoDetalle)
					 || (this.esRecargarFks && this.cajaegresodetalleConstantesFunciones.cargarid_caja_egresoCajaEgresoDetalle)) {

					if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCajaEgreso()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=CajaEgresoConstantesFunciones.getArrayColumnasGlobalesCajaEgreso(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCajaEgreso=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaEgresoConstantesFunciones.TABLENAME);

						finalQueryGlobalCajaEgreso=Funciones.GetFinalQueryAppend(finalQueryGlobalCajaEgreso, "");
						finalQueryGlobalCajaEgreso+=CajaEgresoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosCajaEgresosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCajaEgreso=" WHERE " + ConstantesSql.ID + "="+cajaegresodetalleSessionBean.getlidCajaEgresoActual();
					}
				} else {
					finalQueryGlobalCajaEgreso="NONE";
				}


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.cajaegresodetalleConstantesFunciones.cargarid_empresaCajaEgresoDetalle)
					 || (this.esRecargarFks && this.cajaegresodetalleConstantesFunciones.cargarid_empresaCajaEgresoDetalle)) {

					if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+cajaegresodetalleSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.cajaegresodetalleConstantesFunciones.cargarid_sucursalCajaEgresoDetalle)
					 || (this.esRecargarFks && this.cajaegresodetalleConstantesFunciones.cargarid_sucursalCajaEgresoDetalle)) {

					if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+cajaegresodetalleSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.cajaegresodetalleConstantesFunciones.cargarid_clienteCajaEgresoDetalle)
					 || (this.esRecargarFks && this.cajaegresodetalleConstantesFunciones.cargarid_clienteCajaEgresoDetalle)) {

					if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+cajaegresodetalleSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.cajaegresodetalleConstantesFunciones.cargarid_facturaCajaEgresoDetalle)
					 || (this.esRecargarFks && this.cajaegresodetalleConstantesFunciones.cargarid_facturaCajaEgresoDetalle)) {

					if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+cajaegresodetalleSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				cajaegresodetalleReturnGeneral=cajaegresodetalleLogic.cargarCombosLoteForeignKeyCajaEgresoDetalle(finalQueryGlobalCajaEgreso,finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente,finalQueryGlobalFactura);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCajaEgreso.equals("NONE")) {
				this.cajaegresosForeignKey=cajaegresodetalleReturnGeneral.getcajaegresosForeignKey();
			}

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=cajaegresodetalleReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=cajaegresodetalleReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=cajaegresodetalleReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=cajaegresodetalleReturnGeneral.getfacturasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCajaEgresoDetalle()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCajaEgreso();
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyFactura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCajaEgreso()throws Exception {
		try {
			if(this.cajaegresodetalleSessionBean==null) {
				this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCajaEgreso()) {
				CajaEgreso cajaegreso=new CajaEgreso();
				CajaEgresoConstantesFunciones.setCajaEgresoDescripcion(cajaegreso,Constantes.SMENSAJE_ESCOJA_OPCION);
				cajaegreso.setId(null);

				if(!CajaEgresoConstantesFunciones.ExisteEnLista(this.cajaegresosForeignKey,cajaegreso,true)) {

					this.cajaegresosForeignKey.add(0,cajaegreso);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

			if(!this.cajaegresodetalleSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
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
	
	public void initActionsCombosTodosForeignKeyCajaEgresoDetalle()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCajaEgresoDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCajaEgresoDetalle()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCajaEgresoDetalle();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle)throws Exception {	
		try {
			
			this.setActualCajaEgresoForeignKey(cajaegresodetalle.getid_caja_egreso(),false,"Formulario");
			this.setActualClienteForeignKey(cajaegresodetalle.getid_cliente(),false,"Formulario");
			this.setActualFacturaForeignKey(cajaegresodetalle.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,String sTipoEvento)throws Exception {	
		try {
			
			

				if(cajaegresodetalle.getCliente()!=null && !sTipoEvento.equals("id_clienteCajaEgresoDetalle")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(cajaegresodetalle.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				if(cajaegresodetalle.getFactura()!=null && !sTipoEvento.equals("id_facturaCajaEgresoDetalle")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(cajaegresodetalle.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCajaEgresoDetalle()throws Exception {	
		try {
			
			this.setActualCajaEgresoForeignKey(this.cajaegresodetalleConstantesFunciones.getid_caja_egreso(),false,"Formulario");
			this.setActualClienteForeignKey(this.cajaegresodetalleConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualFacturaForeignKey(this.cajaegresodetalleConstantesFunciones.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCajaEgresoDetalle()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCajaEgresoDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCajaEgresoDetalle()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCajaEgresoDetalle()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCajaEgresoDetalle()throws Exception {
		try {
			

			this.cargarCombosFrameCajaEgresosForeignKey("Todos");
			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCajaEgresoDetalle(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameCajaEgresosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCajaEgresoDetalle()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.getItemCount()>0) {
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public CajaEgresoDetalleBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CajaEgresoDetalleBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CajaEgresoDetalleBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean(); 
		this.cajaegresodetalleConstantesFunciones=new CajaEgresoDetalleConstantesFunciones(); 
		this.cajaegresodetalleBean=new CajaEgresoDetalle();//(this.cajaegresodetalleConstantesFunciones); 		
		this.cajaegresodetalleReturnGeneral=new CajaEgresoDetalleParameterReturnGeneral(); 
		
		this.cajaegresodetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.cajaegresodetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CajaEgresoDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CajaEgresoDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CajaEgresoDetalleBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCajaEgresoDetalle(true);
			
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
			
			this.cajaegresodetalleConstantesFunciones=new CajaEgresoDetalleConstantesFunciones(); 
			this.cajaegresodetalleBean=new CajaEgresoDetalle();//this.cajaegresodetalleConstantesFunciones); 			
			this.cajaegresodetalleReturnGeneral=new CajaEgresoDetalleParameterReturnGeneral(); 
		
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Caja Egreso Detalle Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.cajaegresodetalle=new CajaEgresoDetalle();
			this.cajaegresodetalles = new ArrayList<CajaEgresoDetalle>();
			this.cajaegresodetallesAux = new ArrayList<CajaEgresoDetalle>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic=new CajaEgresoDetalleLogic();
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.cajaegresodetalleSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.cajaegresodetalleSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCajaEgresoDetalle);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaEgresoDetalle);	
					}
					
					if(this.jInternalFrameImportacionCajaEgresoDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaEgresoDetalle);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCajaEgresoDetalle!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCajaEgresoDetalle);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaEgresoDetalle);
				this.jInternalFrameDetalleFormCajaEgresoDetalle.setVisible(false);
				this.jInternalFrameDetalleFormCajaEgresoDetalle.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaEgresoDetalle);
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setVisible(false);
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCajaEgresoDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCajaEgresoDetalle);
					this.jInternalFrameImportacionCajaEgresoDetalle.setVisible(false);
					this.jInternalFrameImportacionCajaEgresoDetalle.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCajaEgresoDetalle!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCajaEgresoDetalle);
					this.jInternalFrameOrderByCajaEgresoDetalle.setVisible(false);
					this.jInternalFrameOrderByCajaEgresoDetalle.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCajaEgresoDetalleActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CajaEgresoDetalleConstantesFunciones.INUMEROPAGINACION;
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
			
			this.cajaegresodetalleReturnGeneral=new CajaEgresoDetalleParameterReturnGeneral();
			
			this.cajaegresodetalleParameterGeneral=new CajaEgresoDetalleParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.cajaegresodetalleLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CajaEgresoDetalleJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaEgresoDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),this.cajaegresodetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CajaEgresoDetalleConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),this.cajaegresodetalleSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=false;
			this.isVisibilidadCeldaDuplicarCajaEgresoDetalle=true;
			this.isVisibilidadCeldaCopiarCajaEgresoDetalle=true;
			this.isVisibilidadCeldaVerFormCajaEgresoDetalle=true;
			this.isVisibilidadCeldaOrdenCajaEgresoDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=false;
			
			
			this.isVisibilidadFK_IdCajaEgreso=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCajaEgresoDetalle();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCajaEgresoDetalle(false);
			
			this.setPermisosUsuarioCajaEgresoDetalle();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() 
				|| (this.cajaegresodetalleSessionBean.getEsGuardarRelacionado() && this.cajaegresodetalleSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCajaEgresoDetalleClasesRelacionadas();
			}
			
			if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCajaEgresoDetalleClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCajaEgresoDetalle();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCajaEgresoDetalle();
			}
			
			if(!this.isPermisoBusquedaCajaEgresoDetalle) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCajaEgresoDetalle,this.isPermisoPaginacionMedioCajaEgresoDetalle,this.isPermisoPaginacionTodoCajaEgresoDetalle);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CajaEgresoDetalleConstantesFunciones.getTiposSeleccionarCajaEgresoDetalle());
				
				this.tiposColumnasSelect=CajaEgresoDetalleConstantesFunciones.getTiposSeleccionarCajaEgresoDetalle(true);
				
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
			//if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCajaEgresoDetalle();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioCajaEgresoDetalle(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioCajaEgresoDetalle(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaEgresoDetalle() ;
			
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
			
			this.cajaegresoLogic=new CajaEgresoLogic();
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
				cajaegresodetalleImplementable= (CajaEgresoDetalleImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaEgresoDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				cajaegresodetalleImplementableHome= (CajaEgresoDetalleImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CajaEgresoDetalleConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.cajaegresodetalles= new ArrayList<CajaEgresoDetalle>();
			this.cajaegresodetallesEliminados= new ArrayList<CajaEgresoDetalle>();
						
			this.isEsNuevoCajaEgresoDetalle=false;
			this.esParaAccionDesdeFormularioCajaEgresoDetalle=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.cajaegresosForeignKey=new ArrayList<CajaEgreso>() ;
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCajaEgresoDetalle(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCajaEgresoDetalle();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CajaEgresoDetalleConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCajaEgresoDetalle(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCajaEgresoDetalle();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCajaEgresoDetalle();
			}
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasCajaEgresoDetalle.getTabCount(); i++) {
					this.jTabbedPaneBusquedasCajaEgresoDetalle.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasCajaEgresoDetalle.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCajaEgresoDetalle(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CajaEgresoDetalle: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCajaEgresoDetalle() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCajaEgresoDetalle")) {
				iIndex=this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCajaEgresoDetalle();	
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
	
	public void cargarCombosForeignKeyCajaEgresoDetalle(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCajaEgresoDetalle(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCajaEgresoDetalle(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCajaEgresoDetalleListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCajaEgresoDetalle();
		
		this.cargarCombosFrameForeignKeyCajaEgresoDetalle();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCajaEgresoDetalle();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCajaEgresoDetalle();
		}
	}
	
	

	public void cargarCombosForeignKeyCajaEgreso(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaEgresoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCajaEgreso();
				this.cargarCombosFrameCajaEgresosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCajaEgreso(this.cajaegresosForeignKey);

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
	
	public void jButtonNuevoCajaEgresoDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
			
			if(jTableDatosCajaEgresoDetalle.getRowCount()>=1) {
				jTableDatosCajaEgresoDetalle.removeRowSelectionInterval(0, jTableDatosCajaEgresoDetalle.getRowCount()-1);						
			}
			
			this.isEsNuevoCajaEgresoDetalle=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCajaEgresoDetalle(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCajaEgresoDetalle(true);			
			//this.cajaegresodetalle=new CajaEgresoDetalle();
			//this.cajaegresodetalle.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaEgresoDetalle(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle() ;
			
			if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaEgresoDetalle(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.cajaegresodetalle);	
			this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);				
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
			if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CajaEgresoDetalle: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCajaEgresoDetalleActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCajaEgresoDetalle.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCajaEgresoDetalle.getSelectedRows().length;			
			}
			
			cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCajaEgresoDetalle--;			
				//CajaEgresoDetalle cajaegresodetalleAux= new CajaEgresoDetalle();			
				//cajaegresodetalleAux.setId(this.iIdNuevoCajaEgresoDetalle);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CajaEgresoDetalle cajaegresodetalleOrigen=new CajaEgresoDetalle();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CajaEgresoDetalle cajaegresodetalleOrigen : cajaegresodetallesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							cajaegresodetalleOrigen =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							cajaegresodetalleOrigen =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCajaEgresoDetalle();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.cajaegresodetalle.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCajaEgresoDetalle(cajaegresodetalleOrigen,this.cajaegresodetalle,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajaegresodetalleLogic.getCajaEgresoDetalles().add(this.cajaegresodetalleAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalles.add(this.cajaegresodetalleAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
				
				this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(this.getIndiceNuevoCajaEgresoDetalle(), this.getIndiceNuevoCajaEgresoDetalle());
				
				int iLastRow =  this.jTableDatosCajaEgresoDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaEgresoDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaEgresoDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();									
		
			CajaEgresoDetalle cajaegresodetalleOrigen=new CajaEgresoDetalle();
			CajaEgresoDetalle cajaegresodetalleDestino=new CajaEgresoDetalle();
				
			cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCajaEgresoDetalle.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || cajaegresodetallesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCajaEgresoDetalle.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleOrigen =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajaegresodetalleOrigen =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						cajaegresodetalleDestino =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						cajaegresodetalleDestino =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				cajaegresodetalleOrigen =cajaegresodetallesSeleccionados.get(0);
				cajaegresodetalleDestino =cajaegresodetallesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCajaEgresoDetalle(cajaegresodetalleOrigen,cajaegresodetalleDestino,true,false);
				
				cajaegresodetalleDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(cajaegresodetalleDestino,cajaegresodetalleLogic.getCajaEgresoDetalles());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(cajaegresodetalleDestino,cajaegresodetalles);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
				
				//this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(this.getIndiceNuevoCajaEgresoDetalle(), this.getIndiceNuevoCajaEgresoDetalle());
				
				int iLastRow =  this.jTableDatosCajaEgresoDetalle.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCajaEgresoDetalle.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCajaEgresoDetalle.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCajaEgresoDetalle.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCajaEgresoDetalle.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(!isVisible);
			this.jPanelPaginacionCajaEgresoDetalle.setVisible(!isVisible);
			this.jPanelAccionesCajaEgresoDetalle.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCajaEgresoDetalle();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCajaEgresoDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCajaEgresoDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCajaEgresoDetalle();
			
			this.abrirFrameOrderByCajaEgresoDetalle();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCajaEgresoDetalle();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCajaEgresoDetalle(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaEgresoDetalle);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCajaEgresoDetalle.isMaximum()) {
					this.jInternalFrameDetalleFormCajaEgresoDetalle.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCajaEgresoDetalle.setSize(this.jInternalFrameDetalleFormCajaEgresoDetalle.iWidthFormulario,this.jInternalFrameDetalleFormCajaEgresoDetalle.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCajaEgresoDetalle.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCajaEgresoDetalle.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCajaEgresoDetalle.isMaximum()) {
						this.jInternalFrameDetalleFormCajaEgresoDetalle.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jContentPaneDetalleCajaEgresoDetalle.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCajaEgresoDetalle.jContentPaneDetalleCajaEgresoDetalle.getWidth(),CajaEgresoDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCajaEgresoDetalle.jContentPaneDetalleCajaEgresoDetalle.getWidth(),CajaEgresoDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCajaEgresoDetalle.jContentPaneDetalleCajaEgresoDetalle.getWidth(),CajaEgresoDetalleConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCajaEgresoDetalle.setVisible(true);
	        this.jInternalFrameDetalleFormCajaEgresoDetalle.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCajaEgresoDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCajaEgresoDetalle==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCajaEgresoDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaEgresoDetalle,false,this);
				} else {
					this.jInternalFrameOrderByCajaEgresoDetalle=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCajaEgresoDetalle,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCajaEgresoDetalle);
				this.jInternalFrameOrderByCajaEgresoDetalle.setVisible(false);
				this.jInternalFrameOrderByCajaEgresoDetalle.setSelected(false);
				
				this.jInternalFrameOrderByCajaEgresoDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaEgresoDetalle"));
				
				this.inicializarActualizarBindingTablaOrderByCajaEgresoDetalle();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCajaEgresoDetalle() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCajaEgresoDetalle==null) {
				
				this.jInternalFrameImportacionCajaEgresoDetalle=new ImportacionJInternalFrame(CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCajaEgresoDetalle);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCajaEgresoDetalle);
				this.jInternalFrameImportacionCajaEgresoDetalle.setVisible(false);
				this.jInternalFrameImportacionCajaEgresoDetalle.setSelected(false);


				this.jInternalFrameImportacionCajaEgresoDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaEgresoDetalle"));
				this.jInternalFrameImportacionCajaEgresoDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaEgresoDetalle"));
				this.jInternalFrameImportacionCajaEgresoDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaEgresoDetalle"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCajaEgresoDetalle() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle==null) {
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle=new ReporteDinamicoJInternalFrame(CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCajaEgresoDetalle);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCajaEgresoDetalle);
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setVisible(false);
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaEgresoDetalle"));
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaEgresoDetalle"));
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaEgresoDetalle"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaEgresoDetalle();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleCajaEgresoDetalle() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCajaEgresoDetalle);
			
	       	this.jInternalFrameDetalleFormCajaEgresoDetalle.setVisible(false);
	        this.jInternalFrameDetalleFormCajaEgresoDetalle.setSelected(false);
			
			//this.jInternalFrameDetalleFormCajaEgresoDetalle.dispose();
			//this.jInternalFrameDetalleFormCajaEgresoDetalle=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCajaEgresoDetalle() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setVisible(true);
	        this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCajaEgresoDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCajaEgresoDetalle.setVisible(true);
	        this.jInternalFrameImportacionCajaEgresoDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCajaEgresoDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCajaEgresoDetalle.setVisible(true);
	        this.jInternalFrameOrderByCajaEgresoDetalle.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCajaEgresoDetalle() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCajaEgresoDetalle.setVisible(false);
	        this.jInternalFrameOrderByCajaEgresoDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCajaEgresoDetalle() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setVisible(false);
	        this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCajaEgresoDetalle() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCajaEgresoDetalle.setVisible(false);
	        this.jInternalFrameImportacionCajaEgresoDetalle.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCajaEgresoDetalle(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCajaEgresoDetalle(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCajaEgresoDetalle(true);
			//this.isEsNuevoCajaEgresoDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaEgresoDetalle(false) ;
			
			if(cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaEgresoDetalle(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCajaEgresoDetalleActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCajaEgresoDetalle(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCajaEgresoDetalle(true);
			//this.isEsNuevoCajaEgresoDetalle=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.cajaegresodetalle.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCajaEgresoDetalle(false) ;
			
			if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCajaEgresoDetalle(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.cajaegresodetalleConstantesFunciones.cargarid_clienteCajaEgresoDetalle) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
			
			if(sType.equals("Factura")) {
				if(!this.cajaegresodetalleConstantesFunciones.cargarid_facturaCajaEgresoDetalle) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCajaEgreso(List<CajaEgreso> cajaegresosForeignKey)throws Exception{
		TableColumn tableColumnCajaEgreso=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO));
		TableCellEditor tableCellEditorCajaEgreso =tableColumnCajaEgreso.getCellEditor();

		CajaEgresoTableCell cajaegresoTableCellFk=(CajaEgresoTableCell)tableCellEditorCajaEgreso;

		if(cajaegresoTableCellFk!=null) {
			cajaegresoTableCellFk.setcajaegresosForeignKey(cajaegresosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaEgresoDetalle.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaegresoTableCellFk.setRowActual(intSelectedRow);
			//cajaegresoTableCellFk.setcajaegresosForeignKeyActual(cajaegresosForeignKey);
		//}


		if(cajaegresoTableCellFk!=null) {
			cajaegresoTableCellFk.RecargarCajaEgresosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaEgresoDetalle.getSelectedRow();

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
		TableColumn tableColumnFactura=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosCajaEgresoDetalle.getSelectedRow();

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
	
	public void jButtonActualizarCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCajaEgresoDetalle(false);
			
			//if(!this.isEsNuevoCajaEgresoDetalle) {								
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				
			}
			
			if(this.permiteMantenimiento(this.cajaegresodetalle)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCajaEgresoDetalle=true;
					this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
					this.isEsNuevoCajaEgresoDetalle=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCajaEgresoDetalle=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCajaEgresoDetalle=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaEgresoDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle(false);
				
				this.habilitarDeshabilitarControlesCajaEgresoDetalle(false);
			
												
				
				if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCajaEgresoDetalle();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCajaEgresoDetalleActionPerformed(evt,cajaegresodetalleSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCajaEgresoDetalle(this.cajaegresodetalle,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,cajaegresodetalleSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.cajaegresodetalle.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				this.cajaegresodetalle.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				this.cajaegresodetalle.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.cajaegresodetalle)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CajaEgresoDetalleModel) this.jTableDatosCajaEgresoDetalle.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCajaEgresoDetalle=true;
				this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
				this.isEsNuevoCajaEgresoDetalle=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCajaEgresoDetalle(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle(false);
				
				this.habilitarDeshabilitarControlesCajaEgresoDetalle(false);
				
				
				
				if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCajaEgresoDetalle();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCajaEgresoDetalle.getRowCount()>=1) {
				jTableDatosCajaEgresoDetalle.removeRowSelectionInterval(0, jTableDatosCajaEgresoDetalle.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCajaEgresoDetalle(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCajaEgresoDetalle(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle(false) ;
			
			this.isEsNuevoCajaEgresoDetalle=false;
			
			if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCajaEgresoDetalle();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCajaEgresoDetalle(false);
				
				//SI ES MANUAL
				if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCajaEgresoDetalle();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCajaEgresoDetalle--;			
			//CajaEgresoDetalle cajaegresodetalleAux= new CajaEgresoDetalle();			
			//cajaegresodetalleAux.setId(this.iIdNuevoCajaEgresoDetalle);
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCajaEgresoDetalle();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
			
			this.cajaegresodetalle.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.cajaegresodetalleLogic.getCajaEgresoDetalles().add(this.cajaegresodetalleAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.cajaegresodetalles.add(this.cajaegresodetalleAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
			
			this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(this.getIndiceNuevoCajaEgresoDetalle(), this.getIndiceNuevoCajaEgresoDetalle());
			
			int iLastRow =  this.jTableDatosCajaEgresoDetalle.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCajaEgresoDetalle.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCajaEgresoDetalle.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaEgresoDetalle(false);
			
			//SI ES MANUAL
			if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaEgresoDetalle();
			}
			
			//this.abrirFrameTreeCajaEgresoDetalle();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Caja Egreso DetalleS ?", "MANTENIMIENTO DE Caja Egreso Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCajaEgresoDetalle.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCajaEgresoDetalle();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.cajaegresodetalleReturnGeneral=cajaegresodetalleLogic.procesarImportacionCajaEgresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.cajaegresodetalleParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCajaEgresoDetalleReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCajaEgresoDetalle.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCajaEgresoDetalle.setFileImportacion(this.jInternalFrameImportacionCajaEgresoDetalle.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCajaEgresoDetalle.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCajaEgresoDetalle.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCajaEgresoDetalle.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCajaEgresoDetalle.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		

		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CajaEgresoDetalleBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CajaEgresoDetalleBaseDesign.jrxml";
			
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
			
			this.generarReporteCajaEgresoDetalles("Todos",cajaegresodetallesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_CajaEgreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_CajaEgreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_CajaEgreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_CajaEgreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ncepto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ncepto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ncepto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ncepto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_VALOR:
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
		
		if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO:
					sNombreCampoCategoria="id_caja_egreso";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					sNombreCampoCategoria="concepto";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO:
					sNombreCampoCategoriaValor="id_caja_egreso";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					sNombreCampoCategoriaValor="concepto";
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja Egreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja_egreso");
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Concepto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"concepto");
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_VALOR:
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
	
	public void jButtonGenerarExcelReporteDinamicoCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegresodetalle";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CajaEgresoDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO);
					iRow++;

					for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegresodetalle.getcajaegreso_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegresodetalle.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegresodetalle.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegresodetalle.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegresodetalle.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO);
					iRow++;

					for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegresodetalle.getconcepto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CajaEgresoDetalleConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(CajaEgresoDetalle cajaegresodetalle:cajaegresodetallesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(cajaegresodetalle.getvalor());
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
			//	this.getFilaCabeceraExportarExcelCajaEgresoDetalle(row);				
			//	iRow++;
			//}				
			
			//for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetallesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCajaEgresoDetalle(cajaegresodetalleAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
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
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaEgresoDetalle(false);
			
			//SI ES MANUAL
			if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCajaEgresoDetalle();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaEgresoDetalle(false);
			
			//SI ES MANUAL
			if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaEgresoDetalle();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCajaEgresoDetalle(false);
			
			//SI ES MANUAL
			if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCajaEgresoDetalle();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCajaEgresoDetalle() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCajaEgresoDetalle.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCajaEgresoDetalle.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCajaEgresoDetalle.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCajaEgresoDetalle.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCajaEgresoDetalle.setMinimumSize(dimensionMinimum);
		this.jTableDatosCajaEgresoDetalle.setMaximumSize(dimensionMaximum);
		this.jTableDatosCajaEgresoDetalle.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCajaEgresoDetalle(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCajaEgresoDetalle(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCajaEgresoDetalle(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCajaEgresoDetalle(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCajaEgresoDetalle(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCajaEgresoDetalle(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaEgresoDetalle(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCajaEgresoDetalle(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCajaEgresoDetalle() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCajaEgresoDetalle();
		
		this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCajaEgresoDetalle();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCajaEgresoDetalle() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCajaEgresoDetalle(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCajaEgresoDetalle(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCajaEgresoDetalle.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCajaEgresoDetalle.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCajaEgresoDetalle.jCheckBoxPostAccionNuevoCajaEgresoDetalle.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCajaEgresoDetalle.jCheckBoxPostAccionSinCerrarCajaEgresoDetalle.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCajaEgresoDetalle.jCheckBoxPostAccionSinMensajeCajaEgresoDetalle.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCajaEgresoDetalle.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCajaEgresoDetalle.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jCheckBoxPostAccionNuevoCajaEgresoDetalle.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jCheckBoxPostAccionSinCerrarCajaEgresoDetalle.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jCheckBoxPostAccionSinMensajeCajaEgresoDetalle.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCajaEgresoDetalle.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCajaEgresoDetalle.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCajaEgresoDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCajaEgresoDetalle.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCajaEgresoDetalle.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCajaEgresoDetalle.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCajaEgresoDetalle.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCajaEgresoDetalle.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCajaEgresoDetalle(Boolean esInicializar) throws Exception {
		try	{	
			if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCajaEgresoDetalle(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCajaEgresoDetalle() throws Exception {
		try	{
			if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaEgresoDetalle();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaEgresoDetalle() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCajaEgresoDetalle() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCajaEgresoDetalle.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCajaEgresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCajaEgresoDetalle.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCajaEgresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCajaEgresoDetalle.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCajaEgresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCajaEgresoDetalle.addItem(reporte);
			}
			
			
			if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCajaEgresoDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCajaEgresoDetalle.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCajaEgresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCajaEgresoDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCajaEgresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCajaEgresoDetalle.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCajaEgresoDetalle.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCajaEgresoDetalle.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCajaEgresoDetalle.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaEgresoDetalle();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCajaEgresoDetalle() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
				
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=CajaEgresoDetalleConstantesFunciones.getTiposSeleccionarCajaEgresoDetalle(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=CajaEgresoDetalleConstantesFunciones.getTiposSeleccionarCajaEgresoDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=CajaEgresoDetalleConstantesFunciones.getTiposSeleccionarCajaEgresoDetalle(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCajaEgresoDetalle()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.getSelectedItem()!=null){this.id_caja_egresoFK_IdCajaEgreso=((CajaEgreso)this.jComboBoxid_caja_egresoFK_IdCajaEgresoCajaEgresoDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteCajaEgresoDetalle.getSelectedItem()).getId();}
		if(this.jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.getSelectedItem()!=null){this.id_facturaFK_IdFactura=((Factura)this.jComboBoxid_facturaFK_IdFacturaCajaEgresoDetalle.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCajaEgresoDetalle(Boolean esInicializar) throws Exception {				
		if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCajaEgresoDetalle();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCajaEgresoDetalle() throws Exception {
		this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCajaEgresoDetalle() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCajaEgresoDetalleOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalleOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCajaEgresoDetalle(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=cajaegresodetalleLogic.getCajaEgresoDetalles().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=cajaegresodetalles.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCajaEgresoDetalle.setModel(new CajaEgresoDetalleModel(this.cajaegresodetalleLogic.getCajaEgresoDetalles(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCajaEgresoDetalle.setModel(new CajaEgresoDetalleModel(this.cajaegresodetalles,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCajaEgresoDetalle!=null && this.jInternalFrameOrderByCajaEgresoDetalle.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCajaEgresoDetalle();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO,cajaegresodetalleConstantesFunciones.resaltarSeleccionarCajaEgresoDetalle,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CajaEgresoDetalleConstantesFunciones.SCLASSWEBTITULO,cajaegresodetalleConstantesFunciones.resaltarSeleccionarCajaEgresoDetalle,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_ID));

		if(this.cajaegresodetalleConstantesFunciones.mostraridCajaEgresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoDetalleConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajaegresodetalleConstantesFunciones.resaltaridCajaEgresoDetalle,this.cajaegresodetalleConstantesFunciones.activaridCajaEgresoDetalle,iSizeTabla,this,true,"idCajaEgresoDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaegresodetalleConstantesFunciones.resaltaridCajaEgresoDetalle,this.cajaegresodetalleConstantesFunciones.activaridCajaEgresoDetalle,this,true,"idCajaEgresoDetalle","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO));

		if(this.cajaegresodetalleConstantesFunciones.mostrarid_caja_egresoCajaEgresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new CajaEgresoTableCell(this.cajaegresosForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_caja_egresoCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_caja_egresoCajaEgresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new CajaEgresoTableCell(this.cajaegresosForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_caja_egresoCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_caja_egresoCajaEgresoDetalle,true,"id_caja_egresoCajaEgresoDetalle","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA));

		if(this.cajaegresodetalleConstantesFunciones.mostrarid_empresaCajaEgresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_empresaCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_empresaCajaEgresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_empresaCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_empresaCajaEgresoDetalle,false,"id_empresaCajaEgresoDetalle","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.cajaegresodetalleConstantesFunciones.mostrarid_sucursalCajaEgresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_sucursalCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_sucursalCajaEgresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_sucursalCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_sucursalCajaEgresoDetalle,false,"id_sucursalCajaEgresoDetalle","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE));

		if(this.cajaegresodetalleConstantesFunciones.mostrarid_clienteCajaEgresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_clienteCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_clienteCajaEgresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_clienteCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_clienteCajaEgresoDetalle,true,"id_clienteCajaEgresoDetalle","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA));

		if(this.cajaegresodetalleConstantesFunciones.mostrarid_facturaCajaEgresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_facturaCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_facturaCajaEgresoDetalle,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.cajaegresodetalleConstantesFunciones.resaltarid_facturaCajaEgresoDetalle,this,this.cajaegresodetalleConstantesFunciones.activarid_facturaCajaEgresoDetalle,true,"id_facturaCajaEgresoDetalle","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO));

		if(this.cajaegresodetalleConstantesFunciones.mostrarconceptoCajaEgresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.cajaegresodetalleConstantesFunciones.resaltarconceptoCajaEgresoDetalle,this.cajaegresodetalleConstantesFunciones.activarconceptoCajaEgresoDetalle,iSizeTabla,this,true,"conceptoCajaEgresoDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaegresodetalleConstantesFunciones.resaltarconceptoCajaEgresoDetalle,this.cajaegresodetalleConstantesFunciones.activarconceptoCajaEgresoDetalle,this,true,"conceptoCajaEgresoDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,CajaEgresoDetalleConstantesFunciones.LABEL_VALOR));

		if(this.cajaegresodetalleConstantesFunciones.mostrarvalorCajaEgresoDetalle && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CajaEgresoDetalleConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.cajaegresodetalleConstantesFunciones.resaltarvalorCajaEgresoDetalle,this.cajaegresodetalleConstantesFunciones.activarvalorCajaEgresoDetalle,iSizeTabla,this,true,"valorCajaEgresoDetalle","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.cajaegresodetalleConstantesFunciones.resaltarvalorCajaEgresoDetalle,this.cajaegresodetalleConstantesFunciones.activarvalorCajaEgresoDetalle,this,true,"valorCajaEgresoDetalle","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CajaEgresoDetallePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaEgresoDetalle.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCajaEgresoDetalle.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCajaEgresoDetalle.addColumn(tableColumn);
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
			
			this.jTableDatosCajaEgresoDetalle.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCajaEgresoDetalle.moveColumn(this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCajaEgresoDetalle.moveColumn(this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCajaEgresoDetalle.moveColumn(this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCajaEgresoDetalle.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCajaEgresoDetalle.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCajaEgresoDetalle,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCajaEgresoDetalle.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCajaEgresoDetalle.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCajaEgresoDetalle.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=cajaegresodetalleLogic.getCajaEgresoDetalles().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=cajaegresodetalles.size()-1;
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
		//this.jTableDatosCajaEgresoDetalle.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCajaEgresoDetalle.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCajaEgresoDetalle();
			
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
				
				//this.isEsNuevoCajaEgresoDetalle=false;
					
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
				if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaEgresoDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaEgresoDetalle.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.cajaegresodetalle.getsType().equals("DUPLICADO")
				   || this.cajaegresodetalle.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCajaEgresoDetalle=true;
				
				} else {
					this.isEsNuevoCajaEgresoDetalle=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
					if(this.cajaegresodetalle.getId()>=0 && !this.cajaegresodetalle.getIsNew()) {						
						this.isEsNuevoCajaEgresoDetalle=false;
						
					} else {
						this.isEsNuevoCajaEgresoDetalle=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCajaEgresoDetalle(esRelaciones);						
				
				this.seleccionarCajaEgresoDetalle(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.cajaegresodetalle.getId()<0) {
					this.isEsNuevoCajaEgresoDetalle=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCajaEgresoDetalle(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCajaEgresoDetalle(evt,rowIndex);
				}	
				
				if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CajaEgresoDetalle: " + this.dDif); 
					}
				}								
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCajaEgresoDetalle(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.cajaegresodetalle)) {
					if(this.cajaegresodetalle.getId()>0) {
						this.cajaegresodetalle.setIsDeleted(true);
						
						this.cajaegresodetallesEliminados.add(this.cajaegresodetalle);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.cajaegresodetalleLogic.getCajaEgresoDetalles().remove(this.cajaegresodetalle);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalles.remove(this.cajaegresodetalle);				
					}
					
					
					((CajaEgresoDetalleModel) this.jTableDatosCajaEgresoDetalle.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCajaEgresoDetalle(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCajaEgresoDetalle) {
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCajaEgresoDetalle.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCajaEgresoDetalle.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCajaEgresoDetalle(this.cajaegresodetalle);
				}
				
				//ARCHITECTURE
				try {
					

					//CajaEgreso
					if(!this.cajaegresodetalleConstantesFunciones.cargarid_caja_egresoCajaEgresoDetalle || this.cajaegresodetalleConstantesFunciones.event_dependid_caja_egresoCajaEgresoDetalle) {
						//this.cargarCombosCajaEgresosForeignKeyLista(" where id="+this.cajaegresodetalle.getid_caja_egreso());
									//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
						this.cajaegresosForeignKey=new ArrayList<CajaEgreso>();

						if(cajaegresodetalle.getCajaEgreso()!=null) {
							this.cajaegresosForeignKey.add(cajaegresodetalle.getCajaEgreso());
						}

						this.addItemDefectoCombosForeignKeyCajaEgreso();
						this.cargarCombosFrameCajaEgresosForeignKey("Todos");
					}
					this.setActualCajaEgresoForeignKey(this.cajaegresodetalle.getid_caja_egreso(),false,"Formulario");

					//Empresa
					if(!this.cajaegresodetalleConstantesFunciones.cargarid_empresaCajaEgresoDetalle || this.cajaegresodetalleConstantesFunciones.event_dependid_empresaCajaEgresoDetalle) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.cajaegresodetalle.getid_empresa());
									//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(cajaegresodetalle.getEmpresa()!=null) {
							this.empresasForeignKey.add(cajaegresodetalle.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.cajaegresodetalle.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.cajaegresodetalleConstantesFunciones.cargarid_sucursalCajaEgresoDetalle || this.cajaegresodetalleConstantesFunciones.event_dependid_sucursalCajaEgresoDetalle) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.cajaegresodetalle.getid_sucursal());
									//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(cajaegresodetalle.getSucursal()!=null) {
							this.sucursalsForeignKey.add(cajaegresodetalle.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.cajaegresodetalle.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.cajaegresodetalleConstantesFunciones.cargarid_clienteCajaEgresoDetalle || this.cajaegresodetalleConstantesFunciones.event_dependid_clienteCajaEgresoDetalle) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.cajaegresodetalle.getid_cliente());
									//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(cajaegresodetalle.getCliente()!=null) {
							this.clientesForeignKey.add(cajaegresodetalle.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.cajaegresodetalle.getid_cliente(),false,"Formulario");

					//Factura
					if(!this.cajaegresodetalleConstantesFunciones.cargarid_facturaCajaEgresoDetalle || this.cajaegresodetalleConstantesFunciones.event_dependid_facturaCajaEgresoDetalle) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.cajaegresodetalle.getid_factura());
									//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(cajaegresodetalle.getFactura()!=null) {
							this.facturasForeignKey.add(cajaegresodetalle.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.cajaegresodetalle.getid_factura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCajaEgresoDetalle("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCajaEgresoDetalle(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCajaEgresoDetalle(cajaegresodetalle,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCajaEgresoDetalle(cajaegresodetalle);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCajaEgresoDetalle(cajaegresodetalle,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCajaEgresoDetalle(cajaegresodetalle);
	}
	
	public void setVariablesObjetoActualToFormularioCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.setText(cajaegresodetalle.getId().toString());
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextAreaconceptoCajaEgresoDetalle.setText(cajaegresodetalle.getconcepto());
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextFieldvalorCajaEgresoDetalle.setText(cajaegresodetalle.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CajaEgresoDetalle cajaegresodetalleLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,cajaegresodetalleLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CajaEgresoDetalle cajaegresodetalleLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				cajaegresodetalleLocal=this.cajaegresodetalle;
			} else {
				cajaegresodetalleLocal=this.cajaegresodetalleAnterior;
			}
		}
		
		if(this.permiteMantenimiento(cajaegresodetalleLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCajaEgresoDetalle(cajaegresodetalleLocal,true);
					
					if(cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(cajaegresodetalleLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(cajaegresodetalleLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(cajaegresodetalle,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(cajaegresodetalle);
	}
	
	public void setVariablesFormularioToObjetoActualCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(cajaegresodetalle,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.getText()==null || this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.getText()=="" || this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.getText()=="Id") {
				this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.setText("0");
			}

			if(conColumnasBase) {cajaegresodetalle.setId(Long.parseLong(this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaEgresoDetalleConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelIdCajaEgresoDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaegresodetalle.setconcepto(this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextAreaconceptoCajaEgresoDetalle.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelconceptoCajaEgresoDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			cajaegresodetalle.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextFieldvalorCajaEgresoDetalle.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CajaEgresoDetalleConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelvalorCajaEgresoDetalle,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalleBean,CajaEgresoDetalle cajaegresodetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && cajaegresodetalleBean.getid_caja_egreso()!=null && !cajaegresodetalleBean.getid_caja_egreso().equals(-1L))) {cajaegresodetalle.setid_caja_egreso(cajaegresodetalleBean.getid_caja_egreso());}
			if(conDefault || (!conDefault && cajaegresodetalleBean.getid_cliente()!=null && !cajaegresodetalleBean.getid_cliente().equals(-1L))) {cajaegresodetalle.setid_cliente(cajaegresodetalleBean.getid_cliente());}
			if(conDefault || (!conDefault && cajaegresodetalleBean.getid_factura()!=null && !cajaegresodetalleBean.getid_factura().equals(-1L))) {cajaegresodetalle.setid_factura(cajaegresodetalleBean.getid_factura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalleOrigen,CajaEgresoDetalle cajaegresodetalle,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajaegresodetalleOrigen.getId()!=null && !cajaegresodetalleOrigen.getId().equals(0L))) {cajaegresodetalle.setId(cajaegresodetalleOrigen.getId());}}
			if(conDefault || (!conDefault && cajaegresodetalleOrigen.getid_caja_egreso()!=null && !cajaegresodetalleOrigen.getid_caja_egreso().equals(-1L))) {cajaegresodetalle.setid_caja_egreso(cajaegresodetalleOrigen.getid_caja_egreso());}
			if(conDefault || (!conDefault && cajaegresodetalleOrigen.getid_cliente()!=null && !cajaegresodetalleOrigen.getid_cliente().equals(-1L))) {cajaegresodetalle.setid_cliente(cajaegresodetalleOrigen.getid_cliente());}
			if(conDefault || (!conDefault && cajaegresodetalleOrigen.getid_factura()!=null && !cajaegresodetalleOrigen.getid_factura().equals(-1L))) {cajaegresodetalle.setid_factura(cajaegresodetalleOrigen.getid_factura());}
			if(conDefault || (!conDefault && cajaegresodetalleOrigen.getconcepto()!=null && !cajaegresodetalleOrigen.getconcepto().equals(""))) {cajaegresodetalle.setconcepto(cajaegresodetalleOrigen.getconcepto());}
			if(conDefault || (!conDefault && cajaegresodetalleOrigen.getvalor()!=null && !cajaegresodetalleOrigen.getvalor().equals(0.0))) {cajaegresodetalle.setvalor(cajaegresodetalleOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.setText(cajaegresodetalle.getId().toString());
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextAreaconceptoCajaEgresoDetalle.setText(cajaegresodetalle.getconcepto());
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextFieldvalorCajaEgresoDetalle.setText(cajaegresodetalle.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCajaEgresoDetalle(CajaEgresoDetalleBean cajaegresodetalleBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.setText(cajaegresodetalleBean.getId().toString());
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextAreaconceptoCajaEgresoDetalle.setText(cajaegresodetalleBean.getconcepto());
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextFieldvalorCajaEgresoDetalle.setText(cajaegresodetalleBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCajaEgresoDetalle(CajaEgresoDetalleParameterReturnGeneral cajaegresodetalleReturnGeneral,CajaEgresoDetalleBean cajaegresodetalleBean,Boolean conDefault) throws Exception { 
		try {
			CajaEgresoDetalle cajaegresodetalleLocal=new CajaEgresoDetalle();
			
			cajaegresodetalleLocal=cajaegresodetalleReturnGeneral.getCajaEgresoDetalle();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && cajaegresodetalleLocal.getId()!=null && !cajaegresodetalleLocal.getId().equals(0L))) {cajaegresodetalleBean.setId(cajaegresodetalleLocal.getId());}}
			if(conDefault || (!conDefault && cajaegresodetalleLocal.getid_caja_egreso()!=null && !cajaegresodetalleLocal.getid_caja_egreso().equals(-1L))) {cajaegresodetalleBean.setid_caja_egreso(cajaegresodetalleLocal.getid_caja_egreso());}
			if(conDefault || (!conDefault && cajaegresodetalleLocal.getid_cliente()!=null && !cajaegresodetalleLocal.getid_cliente().equals(-1L))) {cajaegresodetalleBean.setid_cliente(cajaegresodetalleLocal.getid_cliente());}
			if(conDefault || (!conDefault && cajaegresodetalleLocal.getid_factura()!=null && !cajaegresodetalleLocal.getid_factura().equals(-1L))) {cajaegresodetalleBean.setid_factura(cajaegresodetalleLocal.getid_factura());}
			if(conDefault || (!conDefault && cajaegresodetalleLocal.getconcepto()!=null && !cajaegresodetalleLocal.getconcepto().equals(""))) {cajaegresodetalleBean.setconcepto(cajaegresodetalleLocal.getconcepto());}
			if(conDefault || (!conDefault && cajaegresodetalleLocal.getvalor()!=null && !cajaegresodetalleLocal.getvalor().equals(0.0))) {cajaegresodetalleBean.setvalor(cajaegresodetalleLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCajaEgresoDetalleGenerico(Long idCajaEgresoDetalleSeleccionado,JComboBox jComboBoxCajaEgresoDetalle,List<CajaEgresoDetalle> cajaegresodetallesLocal)throws Exception {
		try {
			CajaEgresoDetalle  cajaegresodetalleTemp=null;

			for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetallesLocal) {
				if(cajaegresodetalleAux.getId()!=null && cajaegresodetalleAux.getId().equals(idCajaEgresoDetalleSeleccionado)) {
					cajaegresodetalleTemp=cajaegresodetalleAux;
					break;
				}
			}

			jComboBoxCajaEgresoDetalle.setSelectedItem(cajaegresodetalleTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCajaEgresoDetalleGenerico(JComboBox jComboBoxCajaEgresoDetalle,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaEgresoDetalle.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCajaEgresoDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCajaEgresoDetalle.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCajaEgresoDetalle.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCajaEgresoDetalle.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCajaEgresoDetalle.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaegresodetalle=(CajaEgresoDetalle) cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajaegresodetalle =(CajaEgresoDetalle) cajaegresodetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("CajaEgreso")) {
			//sDescripcion=this.getActualCajaEgresoForeignKeyDescripcion((Long)value);
			if(!cajaegresodetalle.getIsNew() && !cajaegresodetalle.getIsChanged() && !cajaegresodetalle.getIsDeleted()) {
				sDescripcion=cajaegresodetalle.getcajaegreso_descripcion();
			} else {
				//sDescripcion=this.getActualCajaEgresoForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegresodetalle.getcajaegreso_descripcion();
			}
		}

		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!cajaegresodetalle.getIsNew() && !cajaegresodetalle.getIsChanged() && !cajaegresodetalle.getIsDeleted()) {
				sDescripcion=cajaegresodetalle.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegresodetalle.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!cajaegresodetalle.getIsNew() && !cajaegresodetalle.getIsChanged() && !cajaegresodetalle.getIsDeleted()) {
				sDescripcion=cajaegresodetalle.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegresodetalle.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!cajaegresodetalle.getIsNew() && !cajaegresodetalle.getIsChanged() && !cajaegresodetalle.getIsDeleted()) {
				sDescripcion=cajaegresodetalle.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegresodetalle.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!cajaegresodetalle.getIsNew() && !cajaegresodetalle.getIsChanged() && !cajaegresodetalle.getIsDeleted()) {
				sDescripcion=cajaegresodetalle.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=cajaegresodetalle.getfactura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CajaEgresoDetalle cajaegresodetalleRow=new CajaEgresoDetalle();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaegresodetalleRow=(CajaEgresoDetalle) cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			cajaegresodetalleRow=(CajaEgresoDetalle) cajaegresodetalles.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCajaEgresoDetalle(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle));			
			this.jButtonDuplicarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaDuplicarCajaEgresoDetalle && this.isPermisoDuplicarCajaEgresoDetalle));			
			this.jButtonCopiarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaCopiarCajaEgresoDetalle && this.isPermisoCopiarCajaEgresoDetalle));
			this.jButtonVerFormCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaVerFormCajaEgresoDetalle && this.isPermisoVerFormCajaEgresoDetalle));
			
			this.jButtonAbrirOrderByCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaEgresoDetalle && this.isPermisoOrdenCajaEgresoDetalle));			
			
			this.jButtonNuevoRelacionesCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle));			
			this.jButtonNuevoGuardarCambiosCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaModificarCajaEgresoDetalle && this.isPermisoActualizarCajaEgresoDetalle));	
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaActualizarCajaEgresoDetalle && this.isPermisoActualizarCajaEgresoDetalle));	
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaEliminarCajaEgresoDetalle && this.isPermisoEliminarCajaEgresoDetalle));
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarCajaEgresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaEgresoDetalle);							
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));			
			
			}
						
			this.jButtonGuardarCambiosTablaCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle));						
			this.jButtonDuplicarToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaDuplicarCajaEgresoDetalle && this.isPermisoDuplicarCajaEgresoDetalle));						
			this.jButtonCopiarToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaCopiarCajaEgresoDetalle && this.isPermisoCopiarCajaEgresoDetalle));			
			this.jButtonVerFormToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaVerFormCajaEgresoDetalle && this.isPermisoVerFormCajaEgresoDetalle));			
			this.jButtonAbrirOrderByToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaEgresoDetalle && this.isPermisoOrdenCajaEgresoDetalle));
			this.jButtonNuevoRelacionesToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle));			
			this.jButtonNuevoGuardarCambiosToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));			
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaModificarCajaEgresoDetalle && this.isPermisoActualizarCajaEgresoDetalle));	
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaActualizarCajaEgresoDetalle  && this.isPermisoActualizarCajaEgresoDetalle));	
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaEliminarCajaEgresoDetalle && this.isPermisoEliminarCajaEgresoDetalle));
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarToolBarCajaEgresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaEgresoDetalle);				
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle));			
			this.jMenuItemDuplicarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaDuplicarCajaEgresoDetalle && this.isPermisoDuplicarCajaEgresoDetalle));			
			this.jMenuItemCopiarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaCopiarCajaEgresoDetalle && this.isPermisoCopiarCajaEgresoDetalle));			
			this.jMenuItemVerFormCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaVerFormCajaEgresoDetalle && this.isPermisoVerFormCajaEgresoDetalle));			
			this.jMenuItemAbrirOrderByCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaEgresoDetalle && this.isPermisoOrdenCajaEgresoDetalle));			
			//this.jMenuItemMostrarOcultarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaEgresoDetalle && this.isPermisoOrdenCajaEgresoDetalle));
			this.jMenuItemDetalleAbrirOrderByCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaEgresoDetalle && this.isPermisoOrdenCajaEgresoDetalle));			
			//this.jMenuItemDetalleMostrarOcultarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaOrdenCajaEgresoDetalle && this.isPermisoOrdenCajaEgresoDetalle));			
			this.jMenuItemNuevoRelacionesCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle));			
			this.jMenuItemNuevoGuardarCambiosCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaNuevoCajaEgresoDetalle && this.isPermisoNuevoCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));									
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemModificarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaModificarCajaEgresoDetalle && this.isPermisoActualizarCajaEgresoDetalle));	
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemActualizarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaActualizarCajaEgresoDetalle && this.isPermisoActualizarCajaEgresoDetalle));	
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemEliminarCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaEliminarCajaEgresoDetalle && this.isPermisoEliminarCajaEgresoDetalle));
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemCancelarCajaEgresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaEgresoDetalle);				
			}
			
			this.jMenuItemGuardarCambiosCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));						
			this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=this.jButtonNuevoCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaDuplicarCajaEgresoDetalle=this.jButtonDuplicarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaCopiarCajaEgresoDetalle=this.jButtonCopiarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaVerFormCajaEgresoDetalle=this.jButtonVerFormCajaEgresoDetalle.isVisible();
			
			this.isVisibilidadCeldaOrdenCajaEgresoDetalle=this.jButtonAbrirOrderByCajaEgresoDetalle.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=this.jButtonNuevoRelacionesCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=this.jButtonModificarCajaEgresoDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosCajaEgresoDetalle.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=this.jButtonGuardarCambiosTablaCajaEgresoDetalle.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=this.jButtonNuevoToolBarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=this.jButtonNuevoRelacionesToolBarCajaEgresoDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarToolBarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarToolBarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarToolBarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarToolBarCajaEgresoDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaEgresoDetalle=this.jButtonGuardarCambiosToolBarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=this.jButtonGuardarCambiosTablaToolBarCajaEgresoDetalle.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=this.jMenuItemNuevoCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=this.jMenuItemNuevoRelacionesCajaEgresoDetalle.isVisible();
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemModificarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemActualizarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemEliminarCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemCancelarCajaEgresoDetalle.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCajaEgresoDetalle=this.jMenuItemGuardarCambiosCajaEgresoDetalle.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCajaEgresoDetalle(Boolean esInicializar) {
		if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {			
			if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
				//if(this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCajaEgresoDetalle();
			}
			
			this.inicializarActualizarBindingBotonesManualCajaEgresoDetalle(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCajaEgresoDetalle() {
		this.jButtonNuevoCajaEgresoDetalle.setVisible(this.isPermisoNuevoCajaEgresoDetalle);			
		this.jButtonDuplicarCajaEgresoDetalle.setVisible(this.isPermisoDuplicarCajaEgresoDetalle);			
		this.jButtonCopiarCajaEgresoDetalle.setVisible(this.isPermisoCopiarCajaEgresoDetalle);			
		this.jButtonVerFormCajaEgresoDetalle.setVisible(this.isPermisoVerFormCajaEgresoDetalle);			
		
		this.jButtonAbrirOrderByCajaEgresoDetalle.setVisible(this.isPermisoOrdenCajaEgresoDetalle);					
		
		this.jButtonNuevoRelacionesCajaEgresoDetalle.setVisible(this.isPermisoNuevoCajaEgresoDetalle);			
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarCajaEgresoDetalle.setVisible(this.isPermisoActualizarCajaEgresoDetalle);	
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarCajaEgresoDetalle.setVisible(this.isPermisoActualizarCajaEgresoDetalle);	
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarCajaEgresoDetalle.setVisible(this.isPermisoEliminarCajaEgresoDetalle);
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarCajaEgresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaEgresoDetalle);						
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosCajaEgresoDetalle.setVisible(this.isPermisoGuardarCambiosCajaEgresoDetalle);							
		}
		
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.setVisible(this.isPermisoActualizarCajaEgresoDetalle);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaEgresoDetalle() {
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarCajaEgresoDetalle.setVisible(this.isPermisoActualizarCajaEgresoDetalle);	
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarCajaEgresoDetalle.setVisible(this.isPermisoActualizarCajaEgresoDetalle);	
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarCajaEgresoDetalle.setVisible(this.isPermisoEliminarCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarCajaEgresoDetalle.setVisible(this.isVisibilidadCeldaCancelarCajaEgresoDetalle);							
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosCajaEgresoDetalle.setVisible((this.isVisibilidadCeldaGuardarCajaEgresoDetalle && this.isPermisoGuardarCambiosCajaEgresoDetalle));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCajaEgresoDetalle() {
		if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCajaEgresoDetalle();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCajaEgresoDetalle() {
	}
	
	public void jTableDatosCajaEgresoDetalleListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCajaEgresoDetalle(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCajaEgresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegresodetalle==null) {
						this.cajaegresodetalle = new CajaEgresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				}

				if(this.cajaegresodetalle.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.cajaegresodetalle.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_caja_egresoCajaEgresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocajaegreso=true;

			idTienePermisocajaegreso=this.tienePermisosUsuarioEnPaginaWebCajaEgresoDetalle(CajaEgresoConstantesFunciones.CLASSNAME);

			if(idTienePermisocajaegreso) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);

				this.cajaegresoBeanSwingJInternalFrame=new CajaEgresoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaegresoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaegresoBeanSwingJInternalFrame.getCajaEgresoLogic().setConnexion(this.cajaegresodetalleLogic.getConnexion());

				if(this.cajaegresodetalle.getid_caja_egreso()!=null) {
					this.cajaegresoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaegresoBeanSwingJInternalFrame.setIdActual(this.cajaegresodetalle.getid_caja_egreso());
					this.cajaegresoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaegresoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaegresoBeanSwingJInternalFrame.inicializarActualizarBindingTablaCajaEgreso();
				}

				JInternalFrameBase jinternalFrame =this.cajaegresoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaEgresoDetalle.getBorder();
				TitledBorder titledBordercajaegreso=(TitledBorder)this.cajaegresoBeanSwingJInternalFrame.jScrollPanelDatosCajaEgreso.getBorder();

				titledBordercajaegreso.setTitle(titledBorderCajaEgresoDetalle.getTitle() + " -> Caja Egreso");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_caja_egresoCajaEgresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegresodetalle==null) {
						this.cajaegresodetalle = new CajaEgresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				}

				if(this.cajaegresodetalle.getid_caja_egreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja_egreso = "+this.cajaegresodetalle.getid_caja_egreso().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaCajaEgresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebCajaEgresoDetalle(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.cajaegresodetalleLogic.getConnexion());

				if(this.cajaegresodetalle.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.cajaegresodetalle.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaEgresoDetalle.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderCajaEgresoDetalle.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaCajaEgresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegresodetalle==null) {
						this.cajaegresodetalle = new CajaEgresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				}

				if(this.cajaegresodetalle.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.cajaegresodetalle.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalCajaEgresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebCajaEgresoDetalle(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.cajaegresodetalleLogic.getConnexion());

				if(this.cajaegresodetalle.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.cajaegresodetalle.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaEgresoDetalle.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderCajaEgresoDetalle.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalCajaEgresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegresodetalle==null) {
						this.cajaegresodetalle = new CajaEgresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				}

				if(this.cajaegresodetalle.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.cajaegresodetalle.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteCajaEgresoDetalleActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCajaEgresoDetalle=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosCajaEgresoDetalle.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCajaEgresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaEgresoDetalle.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCajaEgresoDetalle.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteCajaEgresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebCajaEgresoDetalle(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.cajaegresodetalleLogic.getConnexion());

				if(this.cajaegresodetalle.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.cajaegresodetalle.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaEgresoDetalle.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderCajaEgresoDetalle.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteCajaEgresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegresodetalle==null) {
						this.cajaegresodetalle = new CajaEgresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				}

				if(this.cajaegresodetalle.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.cajaegresodetalle.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaCajaEgresoDetalleActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderCajaEgresoDetalle=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosCajaEgresoDetalle.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderCajaEgresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaEgresoDetalle.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderCajaEgresoDetalle.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaCajaEgresoDetalleUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebCajaEgresoDetalle(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosCajaEgresoDetalle.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosCajaEgresoDetalle.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.cajaegresodetalleLogic.getConnexion());

				if(this.cajaegresodetalle.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.cajaegresodetalle.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderCajaEgresoDetalle=(TitledBorder)this.jScrollPanelDatosCajaEgresoDetalle.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderCajaEgresoDetalle.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaCajaEgresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegresodetalle==null) {
						this.cajaegresodetalle = new CajaEgresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				}

				if(this.cajaegresodetalle.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.cajaegresodetalle.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonconceptoCajaEgresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegresodetalle==null) {
						this.cajaegresodetalle = new CajaEgresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				}

				if(this.cajaegresodetalle.getconcepto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where concepto like '%"+this.cajaegresodetalle.getconcepto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorCajaEgresoDetalleBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.getcajaegresodetalle(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.cajaegresodetalle==null) {
						this.cajaegresodetalle = new CajaEgresoDetalle();
					}

					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);
				}

				if(this.cajaegresodetalle.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.cajaegresodetalle.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCajaEgresoDetalle(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdCajaEgresoCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);

			this.getCajaEgresoDetallesFK_IdCajaEgreso();

			this.inicializarActualizarBindingCajaEgresoDetalle(false);

			//if(CajaEgresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);

			this.getCajaEgresoDetallesFK_IdCliente();

			this.inicializarActualizarBindingCajaEgresoDetalle(false);

			//if(CajaEgresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);

			this.getCajaEgresoDetallesFK_IdEmpresa();

			this.inicializarActualizarBindingCajaEgresoDetalle(false);

			//if(CajaEgresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);

			this.getCajaEgresoDetallesFK_IdFactura();

			this.inicializarActualizarBindingCajaEgresoDetalle(false);

			//if(CajaEgresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalCajaEgresoDetalleActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);

			this.getCajaEgresoDetallesFK_IdSucursal();

			this.inicializarActualizarBindingCajaEgresoDetalle(false);

			//if(CajaEgresoDetalleBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.cajaegresodetalleLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameCajaEgresoDetalle() {
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.setVisible(false);	    			
			this.jInternalFrameDetalleFormCajaEgresoDetalle.dispose();
			this.jInternalFrameDetalleFormCajaEgresoDetalle=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
			this.jInternalFrameReporteDinamicoCajaEgresoDetalle.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCajaEgresoDetalle.dispose();
			this.jInternalFrameReporteDinamicoCajaEgresoDetalle=null;
		}
		
		if(this.jInternalFrameImportacionCajaEgresoDetalle!=null) {
			this.jInternalFrameImportacionCajaEgresoDetalle.setVisible(false);	    			
			this.jInternalFrameImportacionCajaEgresoDetalle.dispose();
			this.jInternalFrameImportacionCajaEgresoDetalle=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCajaEgresoDetalle();
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
			
			if(sTipo.equals("NuevoCajaEgresoDetalle")) {
				jButtonNuevoCajaEgresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCajaEgresoDetalle")) {
				jButtonDuplicarCajaEgresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCajaEgresoDetalle")) {
				jButtonCopiarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormCajaEgresoDetalle")) {
				jButtonVerFormCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCajaEgresoDetalle")) {
				jButtonNuevoCajaEgresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCajaEgresoDetalle")) {
				jButtonDuplicarCajaEgresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCajaEgresoDetalle")) {
				jButtonNuevoCajaEgresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCajaEgresoDetalle")) {
				jButtonDuplicarCajaEgresoDetalleActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCajaEgresoDetalle")) {
				jButtonNuevoCajaEgresoDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCajaEgresoDetalle")) {
				jButtonNuevoCajaEgresoDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCajaEgresoDetalle")) {
				jButtonNuevoCajaEgresoDetalleActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCajaEgresoDetalle")) {
				jButtonModificarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCajaEgresoDetalle")) {
				jButtonModificarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCajaEgresoDetalle")) {
				jButtonModificarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCajaEgresoDetalle")) {
				jButtonActualizarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCajaEgresoDetalle")) {
				jButtonActualizarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCajaEgresoDetalle")) {
				jButtonActualizarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarCajaEgresoDetalle")) {
				jButtonEliminarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCajaEgresoDetalle")) {
				jButtonEliminarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCajaEgresoDetalle")) {
				jButtonEliminarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarCajaEgresoDetalle")) {
				jButtonCancelarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCajaEgresoDetalle")) {
				jButtonCancelarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCajaEgresoDetalle")) {
				jButtonCancelarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarCajaEgresoDetalle")) {
				jButtonCerrarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCajaEgresoDetalle")) {
				jButtonCerrarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCajaEgresoDetalle")) {
				jButtonCerrarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCajaEgresoDetalle")) {
				jButtonMostrarOcultarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCajaEgresoDetalle")) {
				jButtonCancelarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCajaEgresoDetalle")) {
				jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCajaEgresoDetalle")) {
				jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCajaEgresoDetalle")) {
				jButtonCopiarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCajaEgresoDetalle")) {
				jButtonVerFormCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCajaEgresoDetalle")) {
				jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCajaEgresoDetalle")) {
				jButtonCopiarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCajaEgresoDetalle")) {
				jButtonVerFormCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCajaEgresoDetalle")) {
				jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCajaEgresoDetalle")) {
				jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCajaEgresoDetalle")) {
				jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCajaEgresoDetalle")) {
				jButtonRecargarInformacionCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCajaEgresoDetalle")) {
				jButtonRecargarInformacionCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCajaEgresoDetalle")) {
				jButtonRecargarInformacionCajaEgresoDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCajaEgresoDetalle")) {
				jButtonAnterioresCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCajaEgresoDetalle")) {
				jButtonAnterioresCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCajaEgresoDetalle")) {
				jButtonAnterioresCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCajaEgresoDetalle")) {
				jButtonSiguientesCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCajaEgresoDetalle")) {
				jButtonSiguientesCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCajaEgresoDetalle")) {
				jButtonSiguientesCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCajaEgresoDetalle") || sTipo.equals("MenuItemDetalleAbrirOrderByCajaEgresoDetalle")) {
				jButtonAbrirOrderByCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCajaEgresoDetalle") || sTipo.equals("MenuItemDetalleMostrarOcultarCajaEgresoDetalle")) {
				jButtonMostrarOcultarCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCajaEgresoDetalle")) {
				jButtonNuevoGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCajaEgresoDetalle")) {
				jButtonNuevoGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCajaEgresoDetalle")) {
				jButtonNuevoGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCajaEgresoDetalle")) {
				jButtonCerrarReporteDinamicoCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCajaEgresoDetalle")) {
				jButtonGenerarReporteDinamicoCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCajaEgresoDetalle")) {
				
				jButtonGenerarExcelReporteDinamicoCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCajaEgresoDetalle")) {
				jButtonCerrarImportacionCajaEgresoDetalleActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCajaEgresoDetalle")) {
				
				jButtonGenerarImportacionCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCajaEgresoDetalle")) {
				
				jButtonAbrirImportacionCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCajaEgresoDetalle")) {
				jComboBoxTiposAccionesCajaEgresoDetalleActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCajaEgresoDetalle")) {
				jComboBoxTiposRelacionesCajaEgresoDetalleActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCajaEgresoDetalle")) {
				jComboBoxTiposAccionesCajaEgresoDetalleActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCajaEgresoDetalle")) {
				
				jComboBoxTiposSeleccionarCajaEgresoDetalleActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCajaEgresoDetalle")) {
				jTextFieldValorCampoGeneralCajaEgresoDetalleActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCajaEgresoDetalle")) {
				jButtonAbrirOrderByCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCajaEgresoDetalle")) {
				jButtonAbrirOrderByCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCajaEgresoDetalle")) {
				jButtonCerrarOrderByCajaEgresoDetalleActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaEgresoDetalleBusqueda")) {
				this.jButtonidCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_caja_egresoCajaEgresoDetalleUpdate")) {
				this.jButtonid_caja_egresoCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_caja_egresoCajaEgresoDetalleBusqueda")) {
				this.jButtonid_caja_egresoCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaEgresoDetalleUpdate")) {
				this.jButtonid_empresaCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaEgresoDetalleBusqueda")) {
				this.jButtonid_empresaCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaEgresoDetalleUpdate")) {
				this.jButtonid_sucursalCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaEgresoDetalleBusqueda")) {
				this.jButtonid_sucursalCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCajaEgresoDetalle")) {
				this.jButtonid_clienteCajaEgresoDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCajaEgresoDetalleUpdate")) {
				this.jButtonid_clienteCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCajaEgresoDetalleBusqueda")) {
				this.jButtonid_clienteCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaCajaEgresoDetalle")) {
				this.jButtonid_facturaCajaEgresoDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaCajaEgresoDetalleUpdate")) {
				this.jButtonid_facturaCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaCajaEgresoDetalleBusqueda")) {
				this.jButtonid_facturaCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("conceptoCajaEgresoDetalleBusqueda")) {
				this.jButtonconceptoCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCajaEgresoDetalleBusqueda")) {
				this.jButtonvalorCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteCajaEgresoDetalle")) {
				this.jButtonid_clienteCajaEgresoDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("id_facturaCajaEgresoDetalle")) {
				this.jButtonid_facturaCajaEgresoDetalleActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdCajaEgresoCajaEgresoDetalle")) {
				this.jButtonFK_IdCajaEgresoCajaEgresoDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteCajaEgresoDetalle")) {
				this.jButtonFK_IdClienteCajaEgresoDetalleActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFacturaCajaEgresoDetalle")) {
				this.jButtonFK_IdFacturaCajaEgresoDetalleActionPerformed(evt);
			}
			
			;
			
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCajaEgresoDetalle();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				


				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CajaEgresoDetalle cajaegresodetalleLocal=null;
			
			if(!this.getEsControlTabla()) {
				cajaegresodetalleLocal=this.cajaegresodetalle;
			} else {
				cajaegresodetalleLocal=this.cajaegresodetalleAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
							
				
				


				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
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
			
			


			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
								
						
				


				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
								
				
				


				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
							
				
				


				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
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
			
			


			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
								
				
				


				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
			
			this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoDetalleActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCajaEgresoDetalle")) {
					jCheckBoxSeleccionarTodosCajaEgresoDetalleItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCajaEgresoDetalle")) {
					jCheckBoxSeleccionadosCajaEgresoDetalleItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCajaEgresoDetalle")) {
					
				}
				
				


				
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
												
				
				


				
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoDetalleActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
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
			
			


			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.cajaegresodetalle);
				
				this.actualizarInformacion("INFO_PADRE",false,this.cajaegresodetalle);
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
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
				
				


				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CajaEgresoDetalle.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CajaEgresoDetalle.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCajaEgresoDetalleActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.cajaegresodetalleAnterior =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCajaEgresoDetalle")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCajaEgresoDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCajaEgresoDetalle.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.cajaegresodetalle =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.cajaegresodetalle);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCajaEgresoDetalle")) {
				
				}
				
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCajaEgresoDetalle")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCajaEgresoDetalle.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCajaEgresoDetalle")) {
			
			}
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCajaEgresoDetalle();
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
			if(sTipo.equals("NuevoCajaEgresoDetalle")) {
				jButtonNuevoCajaEgresoDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCajaEgresoDetalle")) {
				jButtonDuplicarCajaEgresoDetalleActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCajaEgresoDetalle")) {
				jButtonCopiarCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCajaEgresoDetalle")) {
				jButtonVerFormCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCajaEgresoDetalle")) {
				jButtonNuevoCajaEgresoDetalleActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCajaEgresoDetalle")) {
				jButtonModificarCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCajaEgresoDetalle")) {
				jButtonActualizarCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCajaEgresoDetalle")) {
				jButtonEliminarCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCajaEgresoDetalle")) {
				jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCajaEgresoDetalle")) {
				jButtonCancelarCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCajaEgresoDetalle")) {
				jButtonCerrarCajaEgresoDetalleActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCajaEgresoDetalle")) {
				jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCajaEgresoDetalle")) {
				jButtonNuevoGuardarCambiosCajaEgresoDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCajaEgresoDetalle")) {
				jButtonAbrirOrderByCajaEgresoDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCajaEgresoDetalle")) {
				jButtonRecargarInformacionCajaEgresoDetalleActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCajaEgresoDetalle")) {
				jButtonAnterioresCajaEgresoDetalleActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCajaEgresoDetalle")) {
				jButtonSiguientesCajaEgresoDetalleActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCajaEgresoDetalleBusqueda")) {
				this.jButtonidCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_caja_egresoCajaEgresoDetalleUpdate")) {
				this.jButtonid_caja_egresoCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_caja_egresoCajaEgresoDetalleBusqueda")) {
				this.jButtonid_caja_egresoCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaCajaEgresoDetalleUpdate")) {
				this.jButtonid_empresaCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaCajaEgresoDetalleBusqueda")) {
				this.jButtonid_empresaCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalCajaEgresoDetalleUpdate")) {
				this.jButtonid_sucursalCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalCajaEgresoDetalleBusqueda")) {
				this.jButtonid_sucursalCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteCajaEgresoDetalle")) {
				this.jButtonid_clienteCajaEgresoDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteCajaEgresoDetalleUpdate")) {
				this.jButtonid_clienteCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteCajaEgresoDetalleBusqueda")) {
				this.jButtonid_clienteCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaCajaEgresoDetalle")) {
				this.jButtonid_facturaCajaEgresoDetalleActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaCajaEgresoDetalleUpdate")) {
				this.jButtonid_facturaCajaEgresoDetalleUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaCajaEgresoDetalleBusqueda")) {
				this.jButtonid_facturaCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("conceptoCajaEgresoDetalleBusqueda")) {
				this.jButtonconceptoCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorCajaEgresoDetalleBusqueda")) {
				this.jButtonvalorCajaEgresoDetalleBusquedaActionPerformed(evt);
			}
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCajaEgresoDetalle();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCajaEgresoDetalle")) {
				closingInternalFrameCajaEgresoDetalle();
				
			} else if(sTipo.equals("jButtonCancelarCajaEgresoDetalle")) {
				JInternalFrameBase jInternalFrameDetalleFormCajaEgresoDetalle = (JInternalFrameBase)evt.getSource();
	            	
	            CajaEgresoDetalleBeanSwingJInternalFrame jInternalFrameParent=(CajaEgresoDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaEgresoDetalle.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCajaEgresoDetalleActionPerformed(null);
			}
			
			CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.cajaegresodetalle,new Object(),this.cajaegresodetalleParameterGeneral,this.cajaegresodetalleReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCajaEgresoDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCajaEgresoDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCajaEgresoDetalle(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.cajaegresodetalle)) {
			if(!esControlTabla) {
				if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);			
				}
				
				if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajaegresodetalleReturnGeneral=cajaegresodetalleLogic.procesarEventosCajaEgresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaegresodetalleLogic.getCajaEgresoDetalles(),this.cajaegresodetalle,this.cajaegresodetalleParameterGeneral,this.isEsNuevoCajaEgresoDetalle,classes);//this.cajaegresodetalleLogic.getCajaEgresoDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral,this.cajaegresodetalleBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCajaEgresoDetalle(classes,this.cajaegresodetalleReturnGeneral,this.cajaegresodetalleBean,false);
					}
						
					if(this.cajaegresodetalleReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle());	
					}
						
					if(this.cajaegresodetalleReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle(),classes);//this.cajaegresodetalleBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCajaEgresoDetalle(this.cajaegresodetalle,classes);//this.cajaegresodetalleBean);									
				}
			
				if(CajaEgresoDetalleJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCajaEgresoDetalle(this.cajaegresodetalle,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCajaEgresoDetalle(this.cajaegresodetalle);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.cajaegresodetalleAnterior!=null) {
						this.cajaegresodetalle=this.cajaegresodetalleAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.cajaegresodetalleReturnGeneral=cajaegresodetalleLogic.procesarEventosCajaEgresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaegresodetalleLogic.getCajaEgresoDetalles(),this.cajaegresodetalle,this.cajaegresodetalleParameterGeneral,this.isEsNuevoCajaEgresoDetalle,classes);//this.cajaegresodetalleLogic.getCajaEgresoDetalle()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.cajaegresodetalleSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.cajaegresodetalleSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle(),cajaegresodetalleLogic.getCajaEgresoDetalles());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle(),this.cajaegresodetalles);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCajaEgresoDetalle.repaint();
				
				//((AbstractTableModel) this.jTableDatosCajaEgresoDetalle.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCajaEgresoDetalle();
			}
		}
	}
	
	public void actualizarVisualTableDatosCajaEgresoDetalle() throws Exception {
		
		CajaEgresoDetalleModel cajaegresodetalleModel=(CajaEgresoDetalleModel)this.jTableDatosCajaEgresoDetalle.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			cajaegresodetalleModel.cajaegresodetalles=this.cajaegresodetalleLogic.getCajaEgresoDetalles();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			cajaegresodetalleModel.cajaegresodetalles=this.cajaegresodetalles;
		}
		
		
		((CajaEgresoDetalleModel) this.jTableDatosCajaEgresoDetalle.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCajaEgresoDetalle() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcajaegresodetalleAnterior(),this.cajaegresodetalleLogic.getCajaEgresoDetalles());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcajaegresodetalleAnterior(),this.cajaegresodetalles);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCajaEgresoDetalle();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
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
										
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaegresodetalle,new Object(),generalEntityParameterGeneral,this.cajaegresodetalleReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CajaEgresoDetalleConstantesFunciones.getClassesRelationshipsOfCajaEgresoDetalle(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CajaEgresoDetalleConstantesFunciones.getClassesRelationshipsFromStringsOfCajaEgresoDetalle(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCajaEgresoDetalle(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CajaEgresoDetalleBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.cajaegresodetalle,new Object(),generalEntityParameterGeneral,this.cajaegresodetalleReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCajaEgresoDetalle(CajaEgresoDetalleBean cajaegresodetalleBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCajaEgresoDetalle(ArrayList<Classe> classes,CajaEgresoDetalleReturnGeneral cajaegresodetalleReturnGeneral,CajaEgresoDetalleBean cajaegresodetalleBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.cajaegresodetalle)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle = new CajaEgresoDetalleDetalleFormJInternalFrame(jDesktopPane,this.cajaegresodetalleSessionBean.getConGuardarRelaciones(),this.cajaegresodetalleSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.setVisible(false);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.setSelected(false);						
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.cajaegresodetalleLogic=this.cajaegresodetalleLogic;
		
		this.cargarCombosFrameForeignKeyCajaEgresoDetalle("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCajaEgresoDetalle();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCajaEgresoDetalle();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCajaEgresoDetalle("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCajaEgresoDetalle();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaEgresoDetalle"));
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"ModificarCajaEgresoDetalle"));

		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarToolBarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaEgresoDetalle"));
					
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemModificarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaEgresoDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"ActualizarCajaEgresoDetalle"));
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarToolBarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaEgresoDetalle"));
						
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemActualizarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaEgresoDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"EliminarCajaEgresoDetalle"));
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaEgresoDetalle"));
								
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemEliminarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaEgresoDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"CancelarCajaEgresoDetalle"));
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaEgresoDetalle"));
					
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemCancelarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaEgresoDetalle"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemDetalleCerrarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaEgresoDetalle"));		
		
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaEgresoDetalle"));
		
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaEgresoDetalle"));
		
		
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaEgresoDetalle"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonidCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_caja_egresoCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_caja_egresoCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_caja_egresoCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_empresaCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_empresaCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_sucursalCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_sucursalCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoDetalleBusqueda"));
		//jButtonid_clienteCajaEgresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaEgresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalleBusqueda"));
		//jButtonid_facturaCajaEgresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCajaEgresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonconceptoCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"conceptoCajaEgresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonvalorCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaEgresoDetalleBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaEgresoDetalle"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCajaEgresoDetalle"));
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCajaEgresoDetalle"));
		}
		
		this.jTableDatosCajaEgresoDetalle.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCajaEgresoDetalle"));
		
		this.jTableDatosCajaEgresoDetalle.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCajaEgresoDetalle"));
		
		this.jButtonNuevoCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"NuevoCajaEgresoDetalle"));
		
		this.jButtonDuplicarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"DuplicarCajaEgresoDetalle"));
		
		this.jButtonCopiarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"CopiarCajaEgresoDetalle"));
		
		this.jButtonVerFormCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"VerFormCajaEgresoDetalle"));
		
		
		this.jButtonNuevoToolBarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"NuevoToolBarCajaEgresoDetalle"));
			
		this.jButtonDuplicarToolBarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCajaEgresoDetalle"));
			
		this.jMenuItemNuevoCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCajaEgresoDetalle"));
			
		this.jMenuItemDuplicarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCajaEgresoDetalle"));		
		
		
		this.jButtonNuevoRelacionesCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCajaEgresoDetalle"));
		
		
		this.jButtonNuevoRelacionesToolBarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCajaEgresoDetalle"));
			
		this.jMenuItemNuevoRelacionesCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCajaEgresoDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"ModificarCajaEgresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonModificarToolBarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"ModificarToolBarCajaEgresoDetalle"));
			
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemModificarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"MenuItemModificarCajaEgresoDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"ActualizarCajaEgresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonActualizarToolBarCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCajaEgresoDetalle"));
				
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemActualizarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCajaEgresoDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"EliminarCajaEgresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonEliminarToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"EliminarToolBarCajaEgresoDetalle"));
						
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemEliminarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCajaEgresoDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"CancelarCajaEgresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonCancelarToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"CancelarToolBarCajaEgresoDetalle"));
			
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemCancelarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCajaEgresoDetalle"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCajaEgresoDetalle"));		
		
		
		this.jButtonCerrarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"CerrarCajaEgresoDetalle"));
		
		
		this.jButtonCerrarToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"CerrarToolBarCajaEgresoDetalle"));
			
		this.jMenuItemCerrarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCajaEgresoDetalle"));
			
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jMenuItemDetalleCerrarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCajaEgresoDetalle"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosCajaEgresoDetalle"));
		}
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCajaEgresoDetalle"));
		}
		
		this.jButtonCopiarToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"CopiarToolBarCajaEgresoDetalle"));
			
		this.jButtonVerFormToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"VerFormToolBarCajaEgresoDetalle"));
		
		this.jMenuItemGuardarCambiosCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCajaEgresoDetalle"));
			
		this.jMenuItemCopiarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCajaEgresoDetalle"));		
		
		this.jMenuItemVerFormCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCajaEgresoDetalle"));		
		
		
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaEgresoDetalle"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCajaEgresoDetalle"));
			
		this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCajaEgresoDetalle"));		
		
		
		
		this.jButtonRecargarInformacionCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionCajaEgresoDetalle"));
					
		this.jButtonRecargarInformacionToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCajaEgresoDetalle"));
		
		this.jMenuItemRecargarInformacionCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCajaEgresoDetalle"));		
		
		
		
		this.jButtonAnterioresCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"AnterioresCajaEgresoDetalle"));
		
		
		this.jButtonAnterioresToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCajaEgresoDetalle"));
		
		this.jMenuItemAnterioresCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCajaEgresoDetalle"));		
		
		
		this.jButtonSiguientesCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"SiguientesCajaEgresoDetalle"));
		
		
		this.jButtonSiguientesToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCajaEgresoDetalle"));
			
		this.jMenuItemSiguientesCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCajaEgresoDetalle"));
			
		this.jMenuItemAbrirOrderByCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCajaEgresoDetalle"));
			
		this.jMenuItemMostrarOcultarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCajaEgresoDetalle"));
			
		this.jMenuItemDetalleAbrirOrderByCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCajaEgresoDetalle"));
			
		this.jMenuItemDetalleMostarOcultarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCajaEgresoDetalle"));		
		
		
		this.jButtonNuevoGuardarCambiosCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCajaEgresoDetalle"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCajaEgresoDetalle"));
			
		this.jMenuItemNuevoGuardarCambiosCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCajaEgresoDetalle"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCajaEgresoDetalle"));

		this.jCheckBoxSeleccionadosCajaEgresoDetalle.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCajaEgresoDetalle"));
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCajaEgresoDetalle"));
		}
		
		
		this.jComboBoxTiposRelacionesCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"TiposRelacionesCajaEgresoDetalle"));
			
		this.jComboBoxTiposAccionesCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"TiposAccionesCajaEgresoDetalle"));
					
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCajaEgresoDetalle"));
			
		this.jTextFieldValorCampoGeneralCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCajaEgresoDetalle"));		
		
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonidCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_caja_egresoCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_caja_egresoCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_caja_egresoCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_empresaCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_empresaCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_sucursalCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_sucursalCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoDetalleBusqueda"));
		//jButtonid_clienteCajaEgresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaEgresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalleBusqueda"));
		//jButtonid_facturaCajaEgresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCajaEgresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonconceptoCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"conceptoCajaEgresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonvalorCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaEgresoDetalleBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdCajaEgresoCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdCajaEgresoCajaEgresoDetalle"));

			this.jButtonFK_IdClienteCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdClienteCajaEgresoDetalle"));

			this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalle"));

			this.jButtonFK_IdFacturaCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdFacturaCajaEgresoDetalle"));

			this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalle"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCajaEgresoDetalle!=null) {
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaEgresoDetalle"));
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaEgresoDetalle"));
				this.jInternalFrameReporteDinamicoCajaEgresoDetalle.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaEgresoDetalle"));
			}
			
			//this.jButtonCerrarReporteDinamicoCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCajaEgresoDetalle"));				
			//this.jButtonGenerarReporteDinamicoCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCajaEgresoDetalle"));
			//this.jButtonGenerarExcelReporteDinamicoCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCajaEgresoDetalle"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCajaEgresoDetalle!=null) {
				this.jInternalFrameImportacionCajaEgresoDetalle.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCajaEgresoDetalle"));
				this.jInternalFrameImportacionCajaEgresoDetalle.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCajaEgresoDetalle"));
				this.jInternalFrameImportacionCajaEgresoDetalle.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCajaEgresoDetalle"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByCajaEgresoDetalle"));
			
			this.jButtonAbrirOrderByToolBarCajaEgresoDetalle.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCajaEgresoDetalle"));			
			
			if(this.jInternalFrameOrderByCajaEgresoDetalle!=null) {
				this.jInternalFrameOrderByCajaEgresoDetalle.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCajaEgresoDetalle"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jTabbedPaneRelacionesCajaEgresoDetalle.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCajaEgresoDetalle"));
		
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
            		closingInternalFrameCajaEgresoDetalle();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCajaEgresoDetalle = (JInternalFrameBase)event.getSource();
	            	
	            CajaEgresoDetalleBeanSwingJInternalFrame jInternalFrameParent=(CajaEgresoDetalleBeanSwingJInternalFrame)jInternalFrameDetalleFormCajaEgresoDetalle.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCajaEgresoDetalleActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCajaEgresoDetalle.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCajaEgresoDetalleListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCajaEgresoDetalle.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCajaEgresoDetalle.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoDetalleActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCajaEgresoDetalle";
		inputMap = this.jButtonNuevoCajaEgresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCajaEgresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaEgresoDetalleActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCajaEgresoDetalleActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCajaEgresoDetalle";
		inputMap = this.jButtonNuevoRelacionesCajaEgresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCajaEgresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCajaEgresoDetalleActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCajaEgresoDetalle";
		inputMap = this.jButtonModificarCajaEgresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCajaEgresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCajaEgresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCajaEgresoDetalle";
		inputMap = this.jButtonActualizarCajaEgresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCajaEgresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCajaEgresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCajaEgresoDetalle";
		inputMap = this.jButtonEliminarCajaEgresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCajaEgresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCajaEgresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCajaEgresoDetalle";
		inputMap = this.jButtonCancelarCajaEgresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCajaEgresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCajaEgresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCajaEgresoDetalle";
		inputMap = this.jButtonCerrarCajaEgresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCajaEgresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCajaEgresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCajaEgresoDetalle";
		inputMap = this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosCajaEgresoDetalle.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonGuardarCambiosCajaEgresoDetalle.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCajaEgresoDetalleActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCajaEgresoDetalle.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCajaEgresoDetalleItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCajaEgresoDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCajaEgresoDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCajaEgresoDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCajaEgresoDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCajaEgresoDetalle.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCajaEgresoDetalleActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonidCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"idCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_caja_egresoCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_caja_egresoCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_caja_egresoCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_caja_egresoCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_empresaCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_empresaCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaCajaEgresoDetalleBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_sucursalCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_sucursalCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalCajaEgresoDetalleBusqueda"));
		//jButtonid_clienteCajaEgresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteCajaEgresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalleBusqueda"));
		//jButtonid_facturaCajaEgresoDetalle.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaCajaEgresoDetalleActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalle"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalleUpdate.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalleUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonconceptoCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"conceptoCajaEgresoDetalleBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonvalorCajaEgresoDetalleBusqueda.addActionListener(new ButtonActionListener(this,"valorCajaEgresoDetalleBusqueda"));
		
		
		this.jButtonFK_IdCajaEgresoCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdCajaEgresoCajaEgresoDetalle"));

		this.jButtonFK_IdClienteCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdClienteCajaEgresoDetalle"));

		this.jButtonBuscarFK_IdClienteid_clienteCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_clienteCajaEgresoDetalle"));

		this.jButtonFK_IdFacturaCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"FK_IdFacturaCajaEgresoDetalle"));

		this.jButtonBuscarFK_IdFacturaid_facturaCajaEgresoDetalle.addActionListener(new ButtonActionListener(this,"id_facturaCajaEgresoDetalle"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCajaEgresoDetalle.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCajaEgresoDetalleActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCajaEgresoDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCajaEgresoDetalle.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCajaEgresoDetalle(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
					cajaegresodetalleAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetalles) {
					cajaegresodetalleAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCajaEgresoDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
						cajaegresodetalleAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetalles) {
						cajaegresodetalleAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetalles) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaEgresoDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaEgresoDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCajaEgresoDetalleItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCajaEgresoDetalle.getSelectedRows();
			
			CajaEgresoDetalle cajaegresodetalleLocal=new CajaEgresoDetalle();
			
			//this.seleccionarTodosCajaEgresoDetalle(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaegresodetalleLocal =(CajaEgresoDetalle) this.cajaegresodetalleLogic.getCajaEgresoDetalles().toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					cajaegresodetalleLocal =(CajaEgresoDetalle) this.cajaegresodetalles.toArray()[this.jTableDatosCajaEgresoDetalle.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				cajaegresodetalleLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
						cajaegresodetalleAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetalles) {
						cajaegresodetalleAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCajaEgresoDetalle.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCajaEgresoDetalle.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCajaEgresoDetalle,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCajaEgresoDetalleItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCajaEgresoDetalleParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCajaEgresoDetalleActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCajaEgresoDetalle.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalleLogic.getCajaEgresoDetalles()) {
				
						if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO)) {
							existe=true;
							cajaegresodetalleAux.setconcepto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							cajaegresodetalleAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetalles) {
					
						if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO)) {
							existe=true;
							cajaegresodetalleAux.setconcepto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							cajaegresodetalleAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCajaEgresoDetalleActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCajaEgresoDetalle=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCajaEgresoDetalle.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCajaEgresoDetalle) {				
					conSplash=true;//false;										
					
					//this.startProcessCajaEgresoDetalle(conSplash);
				
					this.generarReporteCajaEgresoDetallesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCajaEgresoDetallesSeleccionados();
				//this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaEgresoDetallesSeleccionados(false);
				//this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCajaEgresoDetallesSeleccionados(true);
				//this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaEgresoDetalle();
				
				this.exportarCajaEgresoDetallesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCajaEgresoDetalles();
				//this.importarCajaEgresoDetalles();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCajaEgresoDetalle();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCajaEgresoDetallesSeleccionados();
				//this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Caja Egreso Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCajaEgresoDetalle();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCajaEgresoDetalle)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCajaEgresoDetalle(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setSelectedIndex(0);					
				}	
			} 			
			else if(CajaEgresoDetalleBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCajaEgresoDetalle) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCajaEgresoDetalle(conSplash);
					
						//this.actualizarParametrosGeneralCajaEgresoDetalle();
						
						this.generarReporteProcesoAccionCajaEgresoDetallesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CajaEgresoDetalleBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Caja Egreso DetalleS SELECCIONADOS?", "MANTENIMIENTO DE Caja Egreso Detalle", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCajaEgresoDetalle();
				
						this.actualizarParametrosGeneralCajaEgresoDetalle();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.cajaegresodetalleReturnGeneral=cajaegresodetalleLogic.procesarAccionCajaEgresoDetallesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.cajaegresodetalleLogic.getCajaEgresoDetalles(),this.cajaegresodetalleParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCajaEgresoDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCajaEgresoDetalle();
					
					CajaEgresoDetalleBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCajaEgresoDetalleReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCajaEgresoDetalle.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxTiposAccionesFormularioCajaEgresoDetalle.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCajaEgresoDetalle(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCajaEgresoDetalleActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCajaEgresoDetalle();
			
			if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		
			CajaEgresoDetalle cajaegresodetalle=new CajaEgresoDetalle();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCajaEgresoDetalle(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCajaEgresoDetalle.getSelectedItem();
			
			
			
			
			cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
			//this.sTipoAccion;
			
			if(cajaegresodetallesSeleccionados.size()==1) {
				for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetallesSeleccionados) {
					cajaegresodetalle=cajaegresodetalleAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCajaEgresoDetalle();
			
      		//this.finishProcessCajaEgresoDetalle(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCajaEgresoDetalleReturnGeneral() throws Exception {
		if(this.cajaegresodetalleReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.cajaegresodetalleReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.cajaegresodetalleReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.cajaegresodetalleReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.cajaegresodetalleReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.cajaegresodetalleReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCajaEgresoDetalle(false);
		}
		
		if(this.cajaegresodetalleReturnGeneral.getConRetornoLista() || this.cajaegresodetalleReturnGeneral.getConRetornoObjeto()) {
			if(this.cajaegresodetalleReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajaegresodetalleLogic.setCajaEgresoDetalles(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalles());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.cajaegresodetalleReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.cajaegresodetalleLogic.setCajaEgresoDetalle(this.cajaegresodetalleReturnGeneral.getCajaEgresoDetalle());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCajaEgresoDetalle(false);
		}
	}
	
	public void actualizarParametrosGeneralCajaEgresoDetalle() throws Exception {
		
		
	}
	
	public ArrayList<CajaEgresoDetalle> getCajaEgresoDetallesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCajaEgresoDetalle) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetalleLogic.getCajaEgresoDetalles()) {
					if(cajaegresodetalleAux.getIsSelected()) {
						cajaegresodetallesSeleccionados.add(cajaegresodetalleAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CajaEgresoDetalle cajaegresodetalleAux:this.cajaegresodetalles) {
					if(cajaegresodetalleAux.getIsSelected()) {
						cajaegresodetallesSeleccionados.add(cajaegresodetalleAux);				
					}
				}
			}
			
			if(cajaegresodetallesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						cajaegresodetallesSeleccionados.addAll(this.cajaegresodetalleLogic.getCajaEgresoDetalles());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						cajaegresodetallesSeleccionados.addAll(this.cajaegresodetalles);				
					}
				}
			}
		} else {
			cajaegresodetallesSeleccionados.add(this.cajaegresodetalle);
		}
		
		return cajaegresodetallesSeleccionados;
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
	
	public void generarReporteCajaEgresoDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCajaEgresoDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCajaEgresoDetallesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaEgresoDetallesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCajaEgresoDetallesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Caja Egreso Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCajaEgresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCajaEgresoDetalles("Todos",cajaegresodetallesSeleccionados);
		
	}	
	
	public void generarReporteNormalCajaEgresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCajaEgresoDetalles("Todos",cajaegresodetallesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCajaEgresoDetallesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCajaEgresoDetalles("Todos",cajaegresodetallesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCajaEgresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCajaEgresoDetalle();
		
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCajaEgresoDetalle();
		
		
		//this.generarReporteCajaEgresoDetalles("Todos",cajaegresodetallesSeleccionados ,cajaegresodetalleImplementable,cajaegresodetalleImplementableHome);
	}
	
	public void mostrarImportacionCajaEgresoDetalles() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCajaEgresoDetalle();
		
		this.abrirFrameImportacionCajaEgresoDetalle();		
		
			
		//this.generarReporteCajaEgresoDetalles("Todos",cajaegresodetallesSeleccionados ,cajaegresodetalleImplementable,cajaegresodetalleImplementableHome);
	}
	
	public void importarCajaEgresoDetalles() throws Exception {		
	
	}
	
	public void exportarCajaEgresoDetallesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCajaEgresoDetallesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCajaEgresoDetallesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCajaEgresoDetallesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Caja Egreso Detalle",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCajaEgresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegresodetalle."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCajaEgresoDetalle(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetallesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCajaEgresoDetalle(cajaegresodetalleAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//cajaegresodetalleAux.setsDetalleGeneralEntityReporte(cajaegresodetalleAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCajaEgresoDetalle(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CajaEgresoDetalleConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=cajaegresodetalle.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegresodetalle.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegresodetalle.getcajaegreso_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegresodetalle.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegresodetalle.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegresodetalle.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegresodetalle.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegresodetalle.getconcepto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=cajaegresodetalle.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCajaEgresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegresodetalle.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CajaEgresoDetalles");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCajaEgresoDetalle(row);				
				iRow++;
			}				
			
			for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetallesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCajaEgresoDetalle(cajaegresodetalleAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCajaEgresoDetallesSeleccionados() throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();		
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"cajaegresodetalle.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("cajaegresodetalles");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("cajaegresodetalle");
			//elementRoot.appendChild(element);
		
			for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetallesSeleccionados) {
				element = document.createElement("cajaegresodetalle");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCajaEgresoDetalle(cajaegresodetalleAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Caja Egreso Detalle",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCajaEgresoDetalle(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO);
		cell = row.createCell(iColumn++);cell.setCellValue(CajaEgresoDetalleConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegresodetalle.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegresodetalle.getcajaegreso_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegresodetalle.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegresodetalle.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegresodetalle.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegresodetalle.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegresodetalle.getconcepto());
		cell = row.createCell(iColumn++);cell.setCellValue(cajaegresodetalle.getvalor());				
	}
	
	public void setFilaDatosExportarXmlCajaEgresoDetalle(CajaEgresoDetalle cajaegresodetalle,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CajaEgresoDetalleConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(cajaegresodetalle.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CajaEgresoDetalleConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(cajaegresodetalle.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcajaegreso_descripcion = document.createElement(CajaEgresoDetalleConstantesFunciones.IDCAJAEGRESO);
		elementcajaegreso_descripcion.appendChild(document.createTextNode(cajaegresodetalle.getcajaegreso_descripcion()));
		element.appendChild(elementcajaegreso_descripcion);

		Element elementempresa_descripcion = document.createElement(CajaEgresoDetalleConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(cajaegresodetalle.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(CajaEgresoDetalleConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(cajaegresodetalle.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(CajaEgresoDetalleConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(cajaegresodetalle.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementfactura_descripcion = document.createElement(CajaEgresoDetalleConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(cajaegresodetalle.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementconcepto = document.createElement(CajaEgresoDetalleConstantesFunciones.CONCEPTO);
		elementconcepto.appendChild(document.createTextNode(cajaegresodetalle.getconcepto().trim()));
		element.appendChild(elementconcepto);

		Element elementvalor = document.createElement(CajaEgresoDetalleConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(cajaegresodetalle.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoCajaEgresoDetallesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados=new ArrayList<CajaEgresoDetalle>();
		
		cajaegresodetallesSeleccionados=this.getCajaEgresoDetallesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCajaEgresoDetalle(cajaegresodetallesSeleccionados);
		
		this.generarReporteCajaEgresoDetalles("Todos",cajaegresodetallesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCajaEgresoDetalle(ArrayList<CajaEgresoDetalle> cajaegresodetallesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CajaEgresoDetalle cajaegresodetalleAux:cajaegresodetallesSeleccionados) {
				cajaegresodetalleAux.setsDetalleGeneralEntityReporte(cajaegresodetalleAux.toString());
			
				if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_IDCAJAEGRESO)) {
					existe=true;
					cajaegresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaegresodetalleAux.getcajaegreso_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					cajaegresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaegresodetalleAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					cajaegresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaegresodetalleAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					cajaegresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaegresodetalleAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					cajaegresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaegresodetalleAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(CajaEgresoDetalleConstantesFunciones.LABEL_CONCEPTO)) {
					existe=true;
					cajaegresodetalleAux.setsDescripcionGeneralEntityReporte1(cajaegresodetalleAux.getconcepto());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CajaEgresoDetalleConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCajaEgresoDetalle(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCajaEgresoDetalle=true;
				this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=true;
				this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=true;
			}
			
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=true;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=true;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=true;
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=true;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=true;
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=true;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=false;
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=false;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=false;
			this.isVisibilidadCeldaModificarCajaEgresoDetalle=true;
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaCancelarCajaEgresoDetalle=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				} else {
					this.isVisibilidadCeldaGuardarCajaEgresoDetalle=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CajaEgresoDetalleJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=true;
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=true;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=true;
		} else {
			this.actualizarEstadoPanelsCajaEgresoDetalle(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCajaEgresoDetalle=false;
			//this.isVisibilidadCeldaVerFormCajaEgresoDetalle=false;
			this.isVisibilidadCeldaDuplicarCajaEgresoDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!cajaegresodetalleSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
		} else {
			this.isVisibilidadCeldaNuevoCajaEgresoDetalle=false;
			this.isVisibilidadCeldaGuardarCambiosCajaEgresoDetalle=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			if(!cajaegresodetalleSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;												
			}
			
			this.jButtonCerrarCajaEgresoDetalle.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCajaEgresoDetalle=false;
		}
		
		if(!this.permiteMantenimiento(this.cajaegresodetalle)) {
			this.isVisibilidadCeldaActualizarCajaEgresoDetalle=false;
			this.isVisibilidadCeldaEliminarCajaEgresoDetalle=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCajaEgresoDetalle() {
	}
	
	public void actualizarEstadoPanelsCajaEgresoDetalle(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaEgresoDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosCajaEgresoDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaEgresoDetalle!=null) {
				this.jPanelPaginacionCajaEgresoDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaEgresoDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosCajaEgresoDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaEgresoDetalle!=null) {
				this.jPanelPaginacionCajaEgresoDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaEgresoDetalle.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosCajaEgresoDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaEgresoDetalle!=null) {
				this.jPanelPaginacionCajaEgresoDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaEgresoDetalle.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosCajaEgresoDetalle.setVisible(false);
			}
			
			if(this.jPanelPaginacionCajaEgresoDetalle!=null) {
				this.jPanelPaginacionCajaEgresoDetalle.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaEgresoDetalle.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosCajaEgresoDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaEgresoDetalle!=null) {
				this.jPanelPaginacionCajaEgresoDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaEgresoDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosCajaEgresoDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaEgresoDetalle!=null) {
				this.jPanelPaginacionCajaEgresoDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosEdicionCajaEgresoDetalle.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCajaEgresoDetalle!=null) {
				this.jScrollPanelDatosCajaEgresoDetalle.setVisible(true);
			}
			
			if(this.jPanelPaginacionCajaEgresoDetalle!=null) {
				this.jPanelPaginacionCajaEgresoDetalle.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
					this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.cajaegresodetalleSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasCajaEgresoDetalle!=null) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesCajaEgresoDetalle!=null) {
				this.jPanelParametrosReportesCajaEgresoDetalle.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCajaEgreso(Boolean isParaCajaEgreso){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaEgresoNegation=!isParaCajaEgreso;

			this.isVisibilidadFK_IdCajaEgreso=isParaCajaEgreso;
			if(!this.isVisibilidadFK_IdCajaEgreso) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdCajaEgresoCajaEgresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaCajaEgresoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdClienteCajaEgresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaCajaEgresoNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdFacturaCajaEgresoDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCajaEgreso=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCajaEgreso) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdCajaEgresoCajaEgresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdClienteCajaEgresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdFacturaCajaEgresoDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCajaEgreso=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCajaEgreso) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdCajaEgresoCajaEgresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdClienteCajaEgresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdFacturaCajaEgresoDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCajaEgreso=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdCajaEgreso) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdCajaEgresoCajaEgresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdClienteCajaEgresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdFacturaCajaEgresoDetalle);}
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;

			this.isVisibilidadFK_IdCajaEgreso=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCajaEgreso) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdCajaEgresoCajaEgresoDetalle);}

			this.isVisibilidadFK_IdCliente=isParaFacturaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdClienteCajaEgresoDetalle);}

			this.isVisibilidadFK_IdFactura=isParaFactura;
			if(!this.isVisibilidadFK_IdFactura) {this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(jPanelFK_IdFacturaCajaEgresoDetalle);}
		}
		
	}
	
	
	
	

	public String registrarSesionCajaEgresoDetalleParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(cajaegresodetalleSessionBean==null) {
				cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(cajaegresodetalleSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.cajaegresodetalleFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CajaEgresoDetalleConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionCajaEgresoDetalle(true);
			//clienteSessionBean.setlidCajaEgresoDetalleActual(this.idCajaEgresoDetalleActual);

			cajaegresodetalleSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCajaEgresoDetalle(true);
			cajaegresodetalleSessionBean.setlIdCajaEgresoDetalleActualForeignKey(this.idCajaEgresoDetalleActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}

	public String registrarSesionCajaEgresoDetalleParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(cajaegresodetalleSessionBean==null) {
				cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(cajaegresodetalleSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.cajaegresodetalleFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(CajaEgresoDetalleConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionCajaEgresoDetalle(true);
			//facturaSessionBean.setlidCajaEgresoDetalleActual(this.idCajaEgresoDetalleActual);

			cajaegresodetalleSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCajaEgresoDetalle(true);
			cajaegresodetalleSessionBean.setlIdCajaEgresoDetalleActualForeignKey(this.idCajaEgresoDetalleActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CajaEgresoDetalleSessionBean cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
		
		if(this.cajaegresodetalleSessionBean==null) {
			this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
		}
		
		this.cajaegresodetalleSessionBean.setsUltimaBusquedaCajaEgresoDetalle(this.getsAccionBusqueda());
		this.cajaegresodetalleSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.cajaegresodetalleSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCajaEgreso")) {
			cajaegresodetalleSessionBean.setid_caja_egreso(this.getid_caja_egresoFK_IdCajaEgreso());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			cajaegresodetalleSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			cajaegresodetalleSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
			cajaegresodetalleSessionBean.setid_factura(this.getid_facturaFK_IdFactura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			cajaegresodetalleSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CajaEgresoDetalleSessionBean cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
		
		if(this.cajaegresodetalleSessionBean==null) {
			this.cajaegresodetalleSessionBean=new CajaEgresoDetalleSessionBean();
		}
		
		if(this.cajaegresodetalleSessionBean.getsUltimaBusquedaCajaEgresoDetalle()!=null&&!this.cajaegresodetalleSessionBean.getsUltimaBusquedaCajaEgresoDetalle().equals("")) {
			this.setsAccionBusqueda(cajaegresodetalleSessionBean.getsUltimaBusquedaCajaEgresoDetalle());
			this.setiNumeroPaginacion(cajaegresodetalleSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(cajaegresodetalleSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCajaEgreso")) {
				this.setid_caja_egresoFK_IdCajaEgreso(cajaegresodetalleSessionBean.getid_caja_egreso());
				cajaegresodetalleSessionBean.setid_caja_egreso(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(cajaegresodetalleSessionBean.getid_cliente());
				cajaegresodetalleSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(cajaegresodetalleSessionBean.getid_empresa());
				cajaegresodetalleSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFactura")) {
				this.setid_facturaFK_IdFactura(cajaegresodetalleSessionBean.getid_factura());
				cajaegresodetalleSessionBean.setid_factura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(cajaegresodetalleSessionBean.getid_sucursal());
				cajaegresodetalleSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.cajaegresodetalleSessionBean.setsUltimaBusquedaCajaEgresoDetalle("");
		this.cajaegresodetalleSessionBean.setiNumeroPaginacion(CajaEgresoDetalleConstantesFunciones.INUMEROPAGINACION);
		this.cajaegresodetalleSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCajaEgresoDetalle(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCajaEgresoDetalle() {
		this.updateBorderResaltarBusquedasFormularioCajaEgresoDetalle();
		this.updateVisibilidadBusquedasFormularioCajaEgresoDetalle();
		this.updateHabilitarBusquedasFormularioCajaEgresoDetalle();
	}
	
	public void updateBorderResaltarBusquedasFormularioCajaEgresoDetalle() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponents().length>0) {
	

		if(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdCajaEgresoCajaEgresoDetalle!=null) {
			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdCajaEgresoCajaEgresoDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
				jPanel.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdCajaEgresoCajaEgresoDetalle);
			}
		}

		if(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdClienteCajaEgresoDetalle!=null) {
			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdClienteCajaEgresoDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
				jPanel.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdClienteCajaEgresoDetalle);
			}
		}

		if(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdFacturaCajaEgresoDetalle!=null) {
			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdFacturaCajaEgresoDetalle);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
				jPanel.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdFacturaCajaEgresoDetalle);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioCajaEgresoDetalle() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdCajaEgresoCajaEgresoDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarFK_IdCajaEgresoCajaEgresoDetalle);
			if(!this.cajaegresodetalleConstantesFunciones.mostrarFK_IdCajaEgresoCajaEgresoDetalle && index>-1) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdClienteCajaEgresoDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarFK_IdClienteCajaEgresoDetalle);
			if(!this.cajaegresodetalleConstantesFunciones.mostrarFK_IdClienteCajaEgresoDetalle && index>-1) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(index);
			}

			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdFacturaCajaEgresoDetalle);
			jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarFK_IdFacturaCajaEgresoDetalle);
			if(!this.cajaegresodetalleConstantesFunciones.mostrarFK_IdFacturaCajaEgresoDetalle && index>-1) {
				this.jTabbedPaneBusquedasCajaEgresoDetalle.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioCajaEgresoDetalle() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdCajaEgresoCajaEgresoDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaegresodetalleConstantesFunciones.activarFK_IdCajaEgresoCajaEgresoDetalle);
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setEnabledAt(index,this.cajaegresodetalleConstantesFunciones.activarFK_IdCajaEgresoCajaEgresoDetalle);
			}

			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdClienteCajaEgresoDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaegresodetalleConstantesFunciones.activarFK_IdClienteCajaEgresoDetalle);
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setEnabledAt(index,this.cajaegresodetalleConstantesFunciones.activarFK_IdClienteCajaEgresoDetalle);
			}

			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdFacturaCajaEgresoDetalle);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.cajaegresodetalleConstantesFunciones.activarFK_IdFacturaCajaEgresoDetalle);
				this.jTabbedPaneBusquedasCajaEgresoDetalle.setEnabledAt(index,this.cajaegresodetalleConstantesFunciones.activarFK_IdFacturaCajaEgresoDetalle);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaCajaEgresoDetalle(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCajaEgreso")) {
			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdCajaEgresoCajaEgresoDetalle);

			this.jTabbedPaneBusquedasCajaEgresoDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);

			this.cajaegresodetalleConstantesFunciones.setResaltarFK_IdCajaEgresoCajaEgresoDetalle(resaltar);

			jPanel.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdCajaEgresoCajaEgresoDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdClienteCajaEgresoDetalle);

			this.jTabbedPaneBusquedasCajaEgresoDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);

			this.cajaegresodetalleConstantesFunciones.setResaltarFK_IdClienteCajaEgresoDetalle(resaltar);

			jPanel.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdClienteCajaEgresoDetalle);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFactura")) {
			index= this.jTabbedPaneBusquedasCajaEgresoDetalle.indexOfComponent(this.jPanelFK_IdFacturaCajaEgresoDetalle);

			this.jTabbedPaneBusquedasCajaEgresoDetalle.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasCajaEgresoDetalle.getComponent(index);

			this.cajaegresodetalleConstantesFunciones.setResaltarFK_IdFacturaCajaEgresoDetalle(resaltar);

			jPanel.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarFK_IdFacturaCajaEgresoDetalle);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarCajaEgresoDetalle.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioCajaEgresoDetalle() throws Exception {

		if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCajaEgresoDetalle();
		this.updateVisibilidadResaltarControlesFormularioCajaEgresoDetalle();
		this.updateHabilitarResaltarControlesFormularioCajaEgresoDetalle();
		
	}
	
	public void updateBorderResaltarControlesFormularioCajaEgresoDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.cajaegresodetalleConstantesFunciones.resaltaridCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.setBorder(this.cajaegresodetalleConstantesFunciones.resaltaridCajaEgresoDetalle);}
		if(this.cajaegresodetalleConstantesFunciones.resaltarid_caja_egresoCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarid_caja_egresoCajaEgresoDetalle);}
		if(this.cajaegresodetalleConstantesFunciones.resaltarid_empresaCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarid_empresaCajaEgresoDetalle);}
		if(this.cajaegresodetalleConstantesFunciones.resaltarid_sucursalCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarid_sucursalCajaEgresoDetalle);}
		if(this.cajaegresodetalleConstantesFunciones.resaltarid_clienteCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarid_clienteCajaEgresoDetalle);}
		if(this.cajaegresodetalleConstantesFunciones.resaltarid_facturaCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarid_facturaCajaEgresoDetalle);}
		if(this.cajaegresodetalleConstantesFunciones.resaltarconceptoCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextAreaconceptoCajaEgresoDetalle.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarconceptoCajaEgresoDetalle);}
		if(this.cajaegresodetalleConstantesFunciones.resaltarvalorCajaEgresoDetalle!=null && this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextFieldvalorCajaEgresoDetalle.setBorder(this.cajaegresodetalleConstantesFunciones.resaltarvalorCajaEgresoDetalle);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCajaEgresoDetalle() throws Exception {		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
	
		//this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostraridCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelidCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostraridCajaEgresoDetalle);
		//this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_caja_egresoCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelid_caja_egresoCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_caja_egresoCajaEgresoDetalle);
		//this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_empresaCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelid_empresaCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_empresaCajaEgresoDetalle);
		//this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_sucursalCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelid_sucursalCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_sucursalCajaEgresoDetalle);
		//this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_clienteCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelid_clienteCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_clienteCajaEgresoDetalle);
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_clienteCajaEgresoDetalle);
		//this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_facturaCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelid_facturaCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_facturaCajaEgresoDetalle);
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarid_facturaCajaEgresoDetalle);
		//this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextAreaconceptoCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarconceptoCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelconceptoCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarconceptoCajaEgresoDetalle);
		//this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextFieldvalorCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarvalorCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jPanelvalorCajaEgresoDetalle.setVisible(this.cajaegresodetalleConstantesFunciones.mostrarvalorCajaEgresoDetalle);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCajaEgresoDetalle() throws Exception {
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCajaEgresoDetalle!=null) {
	
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jLabelidCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activaridCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_caja_egresoCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarid_caja_egresoCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_empresaCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarid_empresaCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_sucursalCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarid_sucursalCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_clienteCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarid_clienteCajaEgresoDetalle);
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_clienteCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarid_clienteCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jComboBoxid_facturaCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarid_facturaCajaEgresoDetalle);
			this.jInternalFrameDetalleFormCajaEgresoDetalle.jButtonid_facturaCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarid_facturaCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextAreaconceptoCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarconceptoCajaEgresoDetalle);
		this.jInternalFrameDetalleFormCajaEgresoDetalle.jTextFieldvalorCajaEgresoDetalle.setEnabled(this.cajaegresodetalleConstantesFunciones.activarvalorCajaEgresoDetalle);
		}
	}
	
		
}