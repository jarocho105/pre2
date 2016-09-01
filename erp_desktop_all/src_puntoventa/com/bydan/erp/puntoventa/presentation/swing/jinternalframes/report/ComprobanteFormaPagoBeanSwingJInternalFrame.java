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
package com.bydan.erp.puntoventa.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.puntoventa.util.ComprobanteFormaPagoConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ComprobanteFormaPagoParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ComprobanteFormaPagoParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.ComprobanteFormaPagoBean;
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

import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.puntoventa.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.puntoventa.util.*;

import com.bydan.erp.puntoventa.util.report.*;
import com.bydan.erp.puntoventa.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComprobanteFormaPagoBeanSwingJInternalFrame extends ComprobanteFormaPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComprobanteFormaPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComprobanteFormaPago> comprobanteformapagoValidator = new ClassValidator<ComprobanteFormaPago>(ComprobanteFormaPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComprobanteFormaPago comprobanteformapago;	
	public ComprobanteFormaPago comprobanteformapagoAux;
	public ComprobanteFormaPago comprobanteformapagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComprobanteFormaPago comprobanteformapagoTotales;
	public Long idComprobanteFormaPagoActual;
	public Long iIdNuevoComprobanteFormaPago=0L;
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

	public String sFinalQueryComboCaja="";

	public List<Caja> cajasForeignKey;

	public List<Caja> getcajasForeignKey() {
		return cajasForeignKey;
	}

	public void setcajasForeignKey(List<Caja> cajasForeignKey) {
		this.cajasForeignKey = cajasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Caja cajaForeignKey;

	public Caja getcajaForeignKey() {
		return cajaForeignKey;
	}

	public void setcajaForeignKey(Caja cajaForeignKey) {
		this.cajaForeignKey = cajaForeignKey;
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
	
	public Boolean isPermisoTodoComprobanteFormaPago;
	public Boolean isPermisoNuevoComprobanteFormaPago;
	public Boolean isPermisoActualizarComprobanteFormaPago;
	public Boolean isPermisoActualizarOriginalComprobanteFormaPago;
	public Boolean isPermisoEliminarComprobanteFormaPago;
	public Boolean isPermisoGuardarCambiosComprobanteFormaPago;
	public Boolean isPermisoConsultaComprobanteFormaPago;
	public Boolean isPermisoBusquedaComprobanteFormaPago;
	public Boolean isPermisoReporteComprobanteFormaPago;
	public Boolean isPermisoPaginacionMedioComprobanteFormaPago;
	public Boolean isPermisoPaginacionAltoComprobanteFormaPago;
	public Boolean isPermisoPaginacionTodoComprobanteFormaPago;
	public Boolean isPermisoCopiarComprobanteFormaPago;
	public Boolean isPermisoVerFormComprobanteFormaPago;
	public Boolean isPermisoDuplicarComprobanteFormaPago;
	public Boolean isPermisoOrdenComprobanteFormaPago;
	
	
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
	
	public ComprobanteFormaPagoParameterReturnGeneral comprobanteformapagoReturnGeneral;
	public ComprobanteFormaPagoParameterReturnGeneral comprobanteformapagoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComprobanteFormaPago=false;
	public Boolean esParaAccionDesdeFormularioComprobanteFormaPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComprobanteFormaPagoSessionBeanAdditional comprobanteformapagoSessionBeanAdditional=null;
	
	public ComprobanteFormaPagoSessionBeanAdditional getComprobanteFormaPagoSessionBeanAdditional() {
		return this.comprobanteformapagoSessionBeanAdditional;
	}
	
	public void setComprobanteFormaPagoSessionBeanAdditional(ComprobanteFormaPagoSessionBeanAdditional comprobanteformapagoSessionBeanAdditional) {
		try {
			this.comprobanteformapagoSessionBeanAdditional=comprobanteformapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComprobanteFormaPagoBeanSwingJInternalFrameAdditional comprobanteformapagoBeanSwingJInternalFrameAdditional=null;
	//public class ComprobanteFormaPagoBeanSwingJInternalFrame
	
	public ComprobanteFormaPagoBeanSwingJInternalFrameAdditional getComprobanteFormaPagoBeanSwingJInternalFrameAdditional() {
		return this.comprobanteformapagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setComprobanteFormaPagoBeanSwingJInternalFrameAdditional(ComprobanteFormaPagoBeanSwingJInternalFrameAdditional comprobanteformapagoBeanSwingJInternalFrameAdditional) {
		try {
			this.comprobanteformapagoBeanSwingJInternalFrameAdditional=comprobanteformapagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComprobanteFormaPagoLogic comprobanteformapagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComprobanteFormaPago comprobanteformapagoBean;
	public ComprobanteFormaPagoConstantesFunciones comprobanteformapagoConstantesFunciones;
	//public ComprobanteFormaPagoParameterReturnGeneral comprobanteformapagoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public CajaLogic cajaLogic;
	
	//PARAMETROS
	
	
	//public List<ComprobanteFormaPago> comprobanteformapagos;	
	//public List<ComprobanteFormaPago> comprobanteformapagosEliminados;
	//public List<ComprobanteFormaPago> comprobanteformapagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComprobanteFormaPago=false;
	public Boolean isVisibilidadCeldaDuplicarComprobanteFormaPago=true;
	public Boolean isVisibilidadCeldaCopiarComprobanteFormaPago=true;
	public Boolean isVisibilidadCeldaVerFormComprobanteFormaPago=true;
	public Boolean isVisibilidadCeldaOrdenComprobanteFormaPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
	public Boolean isVisibilidadCeldaModificarComprobanteFormaPago=false;
	public Boolean isVisibilidadCeldaActualizarComprobanteFormaPago=false;
	public Boolean isVisibilidadCeldaEliminarComprobanteFormaPago=false;
	public Boolean isVisibilidadCeldaCancelarComprobanteFormaPago=false;
	public Boolean isVisibilidadCeldaGuardarComprobanteFormaPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;	
	
	
	public Boolean isVisibilidadBusquedaComprobanteFormaPago=false;
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoComprobanteFormaPago() {
		return this.iIdNuevoComprobanteFormaPago;
	}

	public void setiIdNuevoComprobanteFormaPago(Long iIdNuevoComprobanteFormaPago) {
		this.iIdNuevoComprobanteFormaPago = iIdNuevoComprobanteFormaPago;
	}
	
	public Long getidComprobanteFormaPagoActual() {
		return this.idComprobanteFormaPagoActual;
	}

	public void setidComprobanteFormaPagoActual(Long idComprobanteFormaPagoActual) {
		this.idComprobanteFormaPagoActual = idComprobanteFormaPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComprobanteFormaPago getcomprobanteformapago() {
		return this.comprobanteformapago;
	}

	public void setcomprobanteformapago(ComprobanteFormaPago comprobanteformapago) {
		this.comprobanteformapago = comprobanteformapago;
	}
	
	public ComprobanteFormaPago getcomprobanteformapagoAux() {
		return this.comprobanteformapagoAux;
	}

	public void setcomprobanteformapagoAux(ComprobanteFormaPago comprobanteformapagoAux) {
		this.comprobanteformapagoAux = comprobanteformapagoAux;
	}				
	
	public ComprobanteFormaPago getcomprobanteformapagoAnterior() {
		return this.comprobanteformapagoAnterior;
	}

	public void setcomprobanteformapagoAnterior(ComprobanteFormaPago comprobanteformapagoAnterior) {
		this.comprobanteformapagoAnterior = comprobanteformapagoAnterior;
	}	
	
	public ComprobanteFormaPago getcomprobanteformapagoTotales() {
		return this.comprobanteformapagoTotales;
	}

	public void setcomprobanteformapagoTotales(ComprobanteFormaPago comprobanteformapagoTotales) {
		this.comprobanteformapagoTotales = comprobanteformapagoTotales;
	}	
	
	public ComprobanteFormaPago getcomprobanteformapagoBean() {
		return this.comprobanteformapagoBean;
	}

	public void setcomprobanteformapagoBean(ComprobanteFormaPago comprobanteformapagoBean) {
		this.comprobanteformapagoBean = comprobanteformapagoBean;
	}	
	
	public ComprobanteFormaPagoParameterReturnGeneral getcomprobanteformapagoReturnGeneral() {
		return this.comprobanteformapagoReturnGeneral;
	}

	public void setcomprobanteformapagoReturnGeneral(ComprobanteFormaPagoParameterReturnGeneral comprobanteformapagoReturnGeneral) {
		this.comprobanteformapagoReturnGeneral = comprobanteformapagoReturnGeneral;
	}	
	
	
	public Date fecha_inicioBusquedaComprobanteFormaPago=new Date();

	public Date getfecha_inicioBusquedaComprobanteFormaPago() {
		return this.fecha_inicioBusquedaComprobanteFormaPago;
	}

	public void setfecha_inicioBusquedaComprobanteFormaPago(Date fecha_inicioBusquedaComprobanteFormaPago) {
		this.fecha_inicioBusquedaComprobanteFormaPago = fecha_inicioBusquedaComprobanteFormaPago;
	}

;
	public Date fecha_finBusquedaComprobanteFormaPago=new Date();

	public Date getfecha_finBusquedaComprobanteFormaPago() {
		return this.fecha_finBusquedaComprobanteFormaPago;
	}

	public void setfecha_finBusquedaComprobanteFormaPago(Date fecha_finBusquedaComprobanteFormaPago) {
		this.fecha_finBusquedaComprobanteFormaPago = fecha_finBusquedaComprobanteFormaPago;
	}

	public Long id_cajaFK_IdCaja=-1L;

	public Long getid_cajaFK_IdCaja() {
		return this.id_cajaFK_IdCaja;
	}

	public void setid_cajaFK_IdCaja(Long id_cajaFK_IdCaja) {
		this.id_cajaFK_IdCaja = id_cajaFK_IdCaja;
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

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComprobanteFormaPagoLogic getComprobanteFormaPagoLogic()	{		
		return comprobanteformapagoLogic;
	}

	public void setComprobanteFormaPagoLogic(ComprobanteFormaPagoLogic comprobanteformapagoLogic) {
		this.comprobanteformapagoLogic = comprobanteformapagoLogic;
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
	
	public Boolean getIsEsNuevoComprobanteFormaPago() {
		return isEsNuevoComprobanteFormaPago;
	}

	public void setIsEsNuevoComprobanteFormaPago(Boolean isEsNuevoComprobanteFormaPago) {
		this.isEsNuevoComprobanteFormaPago = isEsNuevoComprobanteFormaPago;
	}

	public Boolean getEsParaAccionDesdeFormularioComprobanteFormaPago() {
		return esParaAccionDesdeFormularioComprobanteFormaPago;
	}
	
	public void setEsParaAccionDesdeFormularioComprobanteFormaPago(Boolean esParaAccionDesdeFormularioComprobanteFormaPago) {
		this.esParaAccionDesdeFormularioComprobanteFormaPago = esParaAccionDesdeFormularioComprobanteFormaPago;
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

			if(this.comprobanteformapagoSessionBean==null) {
				this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
			}

			if(!this.comprobanteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comprobanteformapagoSessionBean.getlidEmpresaActual());
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

			if(this.comprobanteformapagoSessionBean==null) {
				this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
			}

			if(!this.comprobanteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(comprobanteformapagoSessionBean.getlidSucursalActual());
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

			if(this.comprobanteformapagoSessionBean==null) {
				this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
			}

			if(!this.comprobanteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(comprobanteformapagoSessionBean.getlidClienteActual());
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

	public void cargarCombosCajasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.cajasForeignKey=new ArrayList<Caja>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			CajaLogic cajaLogic=new CajaLogic();

			//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

			if(this.comprobanteformapagoSessionBean==null) {
				this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
			}

			if(!this.comprobanteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//cajaLogic.getCajaDataAccess().setIsForForeingKeyData(true);

					cajaLogic.getTodosCajasWithConnection(sFinalQuery,new Pagination());

					this.cajasForeignKey=cajaLogic.getCajas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCaja(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					cajaLogic.getEntityWithConnection(comprobanteformapagoSessionBean.getlidCajaActual());
					this.cajasForeignKey.add(cajaLogic.getCaja());
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

					if(this.comprobanteformapago!=null) {
						this.comprobanteformapago.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
						this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComprobanteFormaPago.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComprobanteFormaPagoGenerico)throws Exception
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
				jComboBoxid_empresaComprobanteFormaPagoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComprobanteFormaPagoGenerico!=null && jComboBoxid_empresaComprobanteFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_empresaComprobanteFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.comprobanteformapago!=null) {
						this.comprobanteformapago.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
						this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalComprobanteFormaPago.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalComprobanteFormaPagoGenerico)throws Exception
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
				jComboBoxid_sucursalComprobanteFormaPagoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalComprobanteFormaPagoGenerico!=null && jComboBoxid_sucursalComprobanteFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalComprobanteFormaPagoGenerico.setSelectedIndex(0);
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

					if(this.comprobanteformapago!=null) {
						this.comprobanteformapago.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
						this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteComprobanteFormaPago.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteComprobanteFormaPagoGenerico)throws Exception
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
				jComboBoxid_clienteComprobanteFormaPagoGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteComprobanteFormaPagoGenerico!=null && jComboBoxid_clienteComprobanteFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_clienteComprobanteFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualCajaForeignKey(Long idCajaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(cajaTemp!=null) {

					if(this.comprobanteformapago!=null) {
						this.comprobanteformapago.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
						this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaComprobanteFormaPago.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setSelectedIndex(0);
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

	public String getActualCajaForeignKeyDescripcion(Long idCajaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}


			sDescripcion=CajaConstantesFunciones.getCajaDescripcion(cajaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaComprobanteFormaPagoGenerico)throws Exception
	{
		try
		{
			Caja  cajaTemp=null;

			for(Caja cajaAux:cajasForeignKey) {
				if(cajaAux.getId()!=null && cajaAux.getId().equals(idCajaSeleccionado)) {
					cajaTemp=cajaAux;
					break;
				}
			}

			if(cajaTemp!=null) {
				jComboBoxid_cajaComprobanteFormaPagoGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaComprobanteFormaPagoGenerico!=null && jComboBoxid_cajaComprobanteFormaPagoGenerico.getItemCount()>0) {
					jComboBoxid_cajaComprobanteFormaPagoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComprobanteFormaPago comprobanteformapago,JComboBox jComboBoxid_empresaComprobanteFormaPagoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComprobanteFormaPagoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComprobanteFormaPagoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comprobanteformapago.setid_empresa(empresaAux.getId());
				comprobanteformapago.setempresa_descripcion(ComprobanteFormaPagoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comprobanteformapago.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(ComprobanteFormaPago comprobanteformapago,JComboBox jComboBoxid_sucursalComprobanteFormaPagoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalComprobanteFormaPagoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalComprobanteFormaPagoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				comprobanteformapago.setid_sucursal(sucursalAux.getId());
				comprobanteformapago.setsucursal_descripcion(ComprobanteFormaPagoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				comprobanteformapago.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ComprobanteFormaPago comprobanteformapago,JComboBox jComboBoxid_clienteComprobanteFormaPagoGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteComprobanteFormaPagoGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteComprobanteFormaPagoGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				comprobanteformapago.setid_cliente(clienteAux.getId());
				comprobanteformapago.setcliente_descripcion(ComprobanteFormaPagoConstantesFunciones.getClienteDescripcion(clienteAux));
				comprobanteformapago.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(ComprobanteFormaPago comprobanteformapago,JComboBox jComboBoxid_cajaComprobanteFormaPagoGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaComprobanteFormaPagoGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaComprobanteFormaPagoGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				comprobanteformapago.setid_caja(cajaAux.getId());
				comprobanteformapago.setcaja_descripcion(ComprobanteFormaPagoConstantesFunciones.getCajaDescripcion(cajaAux));
				comprobanteformapago.setCaja(cajaAux);			}
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

					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { 
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { 
					}

					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { 
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { 
					}

					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { 
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { 
					}

					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameCajasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCaja=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { 
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { 
					}

					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameCajaForeignKey(Caja caja,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComprobanteFormaPago() throws Exception {
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
		
	public ComprobanteFormaPagoParameterReturnGeneral getComprobanteFormaPagoParameterGeneral() {
		return this.comprobanteformapagoParameterGeneral;
	}
	
	public void setComprobanteFormaPagoParameterGeneral(ComprobanteFormaPagoParameterReturnGeneral comprobanteformapagoParameterGeneral) {
		this.comprobanteformapagoParameterGeneral = comprobanteformapagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComprobanteFormaPago() {
		return isPermisoTodoComprobanteFormaPago;
	}

	public void setIsPermisoTodoComprobanteFormaPago(Boolean isPermisoTodoComprobanteFormaPago) {
		this.isPermisoTodoComprobanteFormaPago = isPermisoTodoComprobanteFormaPago;
	}

	public Boolean getIsPermisoNuevoComprobanteFormaPago() {
		return isPermisoNuevoComprobanteFormaPago;
	}

	public void setIsPermisoNuevoComprobanteFormaPago(Boolean isPermisoNuevoComprobanteFormaPago) {
		this.isPermisoNuevoComprobanteFormaPago = isPermisoNuevoComprobanteFormaPago;
	}

	public Boolean getIsPermisoActualizarComprobanteFormaPago() {
		return isPermisoActualizarComprobanteFormaPago;
	}

	public void setIsPermisoActualizarComprobanteFormaPago(Boolean isPermisoActualizarComprobanteFormaPago) {
		this.isPermisoActualizarComprobanteFormaPago = isPermisoActualizarComprobanteFormaPago;
	}

	public Boolean getIsPermisoEliminarComprobanteFormaPago() {
		return isPermisoEliminarComprobanteFormaPago;
	}

	public void setIsPermisoEliminarComprobanteFormaPago(Boolean isPermisoEliminarComprobanteFormaPago) {
		this.isPermisoEliminarComprobanteFormaPago = isPermisoEliminarComprobanteFormaPago;
	}

	public Boolean getIsPermisoGuardarCambiosComprobanteFormaPago() {
		return isPermisoGuardarCambiosComprobanteFormaPago;
	}

	public void setIsPermisoGuardarCambiosComprobanteFormaPago(Boolean isPermisoGuardarCambiosComprobanteFormaPago) {
		this.isPermisoGuardarCambiosComprobanteFormaPago = isPermisoGuardarCambiosComprobanteFormaPago;
	}
	
	public Boolean getIsPermisoConsultaComprobanteFormaPago() {
		return isPermisoConsultaComprobanteFormaPago;
	}

	public void setIsPermisoConsultaComprobanteFormaPago(Boolean isPermisoConsultaComprobanteFormaPago) {
		this.isPermisoConsultaComprobanteFormaPago = isPermisoConsultaComprobanteFormaPago;
	}

	public Boolean getIsPermisoBusquedaComprobanteFormaPago() {
		return isPermisoBusquedaComprobanteFormaPago;
	}

	public void setIsPermisoBusquedaComprobanteFormaPago(Boolean isPermisoBusquedaComprobanteFormaPago) {
		this.isPermisoBusquedaComprobanteFormaPago = isPermisoBusquedaComprobanteFormaPago;
	}

	public Boolean getIsPermisoReporteComprobanteFormaPago() {
		return isPermisoReporteComprobanteFormaPago;
	}

	public void setIsPermisoReporteComprobanteFormaPago(Boolean isPermisoReporteComprobanteFormaPago) {
		this.isPermisoReporteComprobanteFormaPago = isPermisoReporteComprobanteFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioComprobanteFormaPago() {
		return isPermisoPaginacionMedioComprobanteFormaPago;
	}

	public void setIsPermisoPaginacionMedioComprobanteFormaPago(Boolean isPermisoPaginacionMedioComprobanteFormaPago) {
		this.isPermisoPaginacionMedioComprobanteFormaPago = isPermisoPaginacionMedioComprobanteFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoComprobanteFormaPago() {
		return isPermisoPaginacionTodoComprobanteFormaPago;
	}

	public void setIsPermisoPaginacionTodoComprobanteFormaPago(Boolean isPermisoPaginacionTodoComprobanteFormaPago) {
		this.isPermisoPaginacionTodoComprobanteFormaPago = isPermisoPaginacionTodoComprobanteFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoComprobanteFormaPago() {
		return isPermisoPaginacionAltoComprobanteFormaPago;
	}

	public void setIsPermisoPaginacionAltoComprobanteFormaPago(Boolean isPermisoPaginacionAltoComprobanteFormaPago) {
		this.isPermisoPaginacionAltoComprobanteFormaPago = isPermisoPaginacionAltoComprobanteFormaPago;
	}
	
	public Boolean getIsPermisoCopiarComprobanteFormaPago() {
		return isPermisoCopiarComprobanteFormaPago;
	}

	public void setIsPermisoCopiarComprobanteFormaPago(Boolean isPermisoCopiarComprobanteFormaPago) {
		this.isPermisoCopiarComprobanteFormaPago = isPermisoCopiarComprobanteFormaPago;
	}
	
	public Boolean getIsPermisoVerFormComprobanteFormaPago() {
		return isPermisoVerFormComprobanteFormaPago;
	}

	public void setIsPermisoVerFormComprobanteFormaPago(Boolean isPermisoVerFormComprobanteFormaPago) {
		this.isPermisoVerFormComprobanteFormaPago = isPermisoVerFormComprobanteFormaPago;
	}
	
	public Boolean getIsPermisoDuplicarComprobanteFormaPago() {
		return isPermisoDuplicarComprobanteFormaPago;
	}

	public void setIsPermisoDuplicarComprobanteFormaPago(Boolean isPermisoDuplicarComprobanteFormaPago) {
		this.isPermisoDuplicarComprobanteFormaPago = isPermisoDuplicarComprobanteFormaPago;
	}
	
	public Boolean getIsPermisoOrdenComprobanteFormaPago() {
		return isPermisoOrdenComprobanteFormaPago;
	}

	public void setIsPermisoOrdenComprobanteFormaPago(Boolean isPermisoOrdenComprobanteFormaPago) {
		this.isPermisoOrdenComprobanteFormaPago = isPermisoOrdenComprobanteFormaPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComprobanteFormaPago() {
		return isVisibilidadCeldaNuevoComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoComprobanteFormaPago(Boolean isVisibilidadCeldaNuevoComprobanteFormaPago) {
		this.isVisibilidadCeldaNuevoComprobanteFormaPago = isVisibilidadCeldaNuevoComprobanteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComprobanteFormaPago() {
		return isVisibilidadCeldaDuplicarComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaDuplicarComprobanteFormaPago(Boolean isVisibilidadCeldaDuplicarComprobanteFormaPago) {
		this.isVisibilidadCeldaDuplicarComprobanteFormaPago = isVisibilidadCeldaDuplicarComprobanteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComprobanteFormaPago() {
		return isVisibilidadCeldaCopiarComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaCopiarComprobanteFormaPago(Boolean isVisibilidadCeldaCopiarComprobanteFormaPago) {
		this.isVisibilidadCeldaCopiarComprobanteFormaPago = isVisibilidadCeldaCopiarComprobanteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComprobanteFormaPago() {
		return isVisibilidadCeldaVerFormComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaVerFormComprobanteFormaPago(Boolean isVisibilidadCeldaVerFormComprobanteFormaPago) {
		this.isVisibilidadCeldaVerFormComprobanteFormaPago = isVisibilidadCeldaVerFormComprobanteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComprobanteFormaPago() {
		return isVisibilidadCeldaOrdenComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaOrdenComprobanteFormaPago(Boolean isVisibilidadCeldaOrdenComprobanteFormaPago) {
		this.isVisibilidadCeldaOrdenComprobanteFormaPago = isVisibilidadCeldaOrdenComprobanteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComprobanteFormaPago() {
		return isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComprobanteFormaPago(Boolean isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago) {
		this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago = isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComprobanteFormaPago() {
		return isVisibilidadCeldaModificarComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaModificarComprobanteFormaPago(Boolean isVisibilidadCeldaModificarComprobanteFormaPago) {
		this.isVisibilidadCeldaModificarComprobanteFormaPago = isVisibilidadCeldaModificarComprobanteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComprobanteFormaPago() {
		return isVisibilidadCeldaActualizarComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaActualizarComprobanteFormaPago(Boolean isVisibilidadCeldaActualizarComprobanteFormaPago) {
		this.isVisibilidadCeldaActualizarComprobanteFormaPago = isVisibilidadCeldaActualizarComprobanteFormaPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarComprobanteFormaPago() {
		return isVisibilidadCeldaEliminarComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaEliminarComprobanteFormaPago(Boolean isVisibilidadCeldaEliminarComprobanteFormaPago) {
		this.isVisibilidadCeldaEliminarComprobanteFormaPago = isVisibilidadCeldaEliminarComprobanteFormaPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarComprobanteFormaPago() {
		return isVisibilidadCeldaCancelarComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaCancelarComprobanteFormaPago(Boolean isVisibilidadCeldaCancelarComprobanteFormaPago) {
		this.isVisibilidadCeldaCancelarComprobanteFormaPago = isVisibilidadCeldaCancelarComprobanteFormaPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarComprobanteFormaPago() {
		return isVisibilidadCeldaGuardarComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarComprobanteFormaPago(Boolean isVisibilidadCeldaGuardarComprobanteFormaPago) {
		this.isVisibilidadCeldaGuardarComprobanteFormaPago = isVisibilidadCeldaGuardarComprobanteFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComprobanteFormaPago() {
		return isVisibilidadCeldaGuardarCambiosComprobanteFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComprobanteFormaPago(Boolean isVisibilidadCeldaGuardarCambiosComprobanteFormaPago) {
		this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago = isVisibilidadCeldaGuardarCambiosComprobanteFormaPago;
	}
		
	public ComprobanteFormaPagoSessionBean getcomprobanteformapagoSessionBean() {
		return this.comprobanteformapagoSessionBean;
	}
	
	public void setcomprobanteformapagoSessionBean(ComprobanteFormaPagoSessionBean comprobanteformapagoSessionBean) {
		this.comprobanteformapagoSessionBean=comprobanteformapagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaComprobanteFormaPago() {
		return this.isVisibilidadBusquedaComprobanteFormaPago;
	}

	public void setisVisibilidadBusquedaComprobanteFormaPago(Boolean isVisibilidadBusquedaComprobanteFormaPago) {
		this.isVisibilidadBusquedaComprobanteFormaPago=isVisibilidadBusquedaComprobanteFormaPago;
	}

	public Boolean getisVisibilidadFK_IdCaja() {
		return this.isVisibilidadFK_IdCaja;
	}

	public void setisVisibilidadFK_IdCaja(Boolean isVisibilidadFK_IdCaja) {
		this.isVisibilidadFK_IdCaja=isVisibilidadFK_IdCaja;
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

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comprobanteformapago,null);
				this.setActualParaGuardarSucursalForeignKey(comprobanteformapago,null);
				this.setActualParaGuardarClienteForeignKey(comprobanteformapago,null);
				this.setActualParaGuardarCajaForeignKey(comprobanteformapago,null);
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
	
	public void bugActualizarReferenciaActual(ComprobanteFormaPago comprobanteformapago,ComprobanteFormaPago comprobanteformapagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComprobanteFormaPago(comprobanteformapago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comprobanteformapagoAux.setId(comprobanteformapago.getId());
		comprobanteformapagoAux.setVersionRow(comprobanteformapago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ComprobanteFormaPago comprobanteformapagoLocal) throws Exception {
		
		if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComprobanteFormaPago comprobanteformapagoLocal) throws Exception {	
		if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comprobanteformapagoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				comprobanteformapagoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				comprobanteformapagoLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				comprobanteformapagoLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComprobanteFormaPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comprobanteformapagoValidator.getInvalidValues(this.comprobanteformapago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComprobanteFormaPago comprobanteformapago,List<ComprobanteFormaPago> comprobanteformapagos) throws Exception {
	}		
	
	public void actualizarSelectedLista(ComprobanteFormaPago comprobanteformapago,List<ComprobanteFormaPago> comprobanteformapagos) throws Exception {
		try	{			
			ComprobanteFormaPagoConstantesFunciones.actualizarSelectedLista(comprobanteformapago,comprobanteformapagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComprobanteFormaPago> comprobanteformapagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comprobanteformapagosLocal=this.comprobanteformapagoLogic.getComprobanteFormaPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comprobanteformapagosLocal=this.comprobanteformapagos;
			}
			//ARCHITECTURE
		
			for(ComprobanteFormaPago comprobanteformapagoLocal:comprobanteformapagosLocal) {
				if(this.permiteMantenimiento(comprobanteformapagoLocal) && comprobanteformapagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComprobanteFormaPagoConstantesFunciones.getComprobanteFormaPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelid_clienteComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelid_cajaComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.NOMBRECAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnombre_cajaComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelsecuencialComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfechaComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.CODIGOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelcodigo_clienteComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnombre_clienteComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelsubtotalComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelivaComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeldescuentoComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.FINANCIAMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfinanciamientoComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfleteComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeliceComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeltotalComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.TIPO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeltipoComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelvalorComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.FECHAFORMAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfecha_forma_pagoComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.NUMEROCUENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_cuentaComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.NUMEROCHEQUE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_chequeComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.GIRADOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelgiradorComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.NUMERODIASPLAZO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_dias_plazoComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.NUMEROTARJETA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_tarjetaComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.AUTORIZACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelautorizacionComprobanteFormaPago,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFormaPagoConstantesFunciones.LOTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelloteComprobanteFormaPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelid_clienteComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelid_cajaComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnombre_cajaComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelsecuencialComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfechaComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelcodigo_clienteComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnombre_clienteComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelsubtotalComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelivaComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeldescuentoComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfinanciamientoComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfleteComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeliceComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeltotalComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeltipoComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelvalorComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfecha_forma_pagoComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_cuentaComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_chequeComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelgiradorComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_dias_plazoComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_tarjetaComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelautorizacionComprobanteFormaPago,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelloteComprobanteFormaPago,"");
		
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
		this.iIdNuevoComprobanteFormaPago--;	
		
		
		this.comprobanteformapagoAux=new ComprobanteFormaPago();
		
		this.comprobanteformapagoAux.setId(this.iIdNuevoComprobanteFormaPago);
		this.comprobanteformapagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobanteformapagoLogic.getComprobanteFormaPagos().add(this.comprobanteformapagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comprobanteformapagos.add(this.comprobanteformapagoAux);
		}
		//ARCHITECTURE
		
		this.comprobanteformapago=this.comprobanteformapagoAux;
		
		if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComprobanteFormaPago(this.comprobanteformapago);
			this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFormaPago(this.comprobanteformapago);
		}
				
		//this.setDefaultControlesComprobanteFormaPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComprobanteFormaPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComprobanteFormaPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFormaPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobanteFormaPago(this.comprobanteformapagoBean,this.comprobanteformapago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComprobanteFormaPago(this.comprobanteformapagoReturnGeneral,this.comprobanteformapagoBean,false);
		
		if(this.comprobanteformapagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFormaPago(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComprobanteFormaPago(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPago());
		}
		
		if(this.comprobanteformapagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComprobanteFormaPago(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPago(),classes);//this.comprobanteformapagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComprobanteFormaPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComprobanteFormaPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.RecargarFormComprobanteFormaPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComprobanteFormaPago(false);
						
			if(comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFormaPago();
			}
			
			this.actualizarVisualTableDatosComprobanteFormaPago();
			
			this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(this.getIndiceNuevoComprobanteFormaPago(), this.getIndiceNuevoComprobanteFormaPago());
			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
						
			this.actualizarEstadoCeldasBotonesComprobanteFormaPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComprobanteFormaPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_inicioComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarfecha_inicioComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_finComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarfecha_finComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_cajaComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarnombre_cajaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsecuencialComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarsecuencialComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfechaComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarfechaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldcodigo_clienteComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarcodigo_clienteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_clienteComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarnombre_clienteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsubtotalComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarsubtotalComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldivaComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarivaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFielddescuentoComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activardescuentoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfinanciamientoComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarfinanciamientoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfleteComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarfleteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldiceComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activariceComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtotalComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activartotalComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtipoComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activartipoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldvalorComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarvalorComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_forma_pagoComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarfecha_forma_pagoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_cuentaComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarnumero_cuentaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_chequeComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarnumero_chequeComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreagiradorComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activargiradorComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_dias_plazoComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarnumero_dias_plazoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_tarjetaComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarnumero_tarjetaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreaautorizacionComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarautorizacionComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldloteComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarloteComprobanteFormaPago);	
		//
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarid_empresaComprobanteFormaPago);//
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarid_sucursalComprobanteFormaPago);//
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarid_clienteComprobanteFormaPago);//
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setEnabled(isHabilitar && this.comprobanteformapagoConstantesFunciones.activarid_cajaComprobanteFormaPago);
	};
	
	public void setDefaultControlesComprobanteFormaPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComprobanteFormaPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comprobanteformapagoSessionBean.setConGuardarRelaciones(true);			
			this.comprobanteformapagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.setVisible(true);
			
					
		} else {
			//this.comprobanteformapagoSessionBean.setConGuardarRelaciones(false);			
			this.comprobanteformapagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComprobanteFormaPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
				if(comprobanteformapagoAux.getId().equals(this.iIdNuevoComprobanteFormaPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagos) {
				if(comprobanteformapagoAux.getId().equals(this.iIdNuevoComprobanteFormaPago)) {
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
	
	public int getIndiceActualComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
				if(comprobanteformapagoAux.getId().equals(comprobanteformapago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagos) {
				if(comprobanteformapagoAux.getId().equals(comprobanteformapago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComprobanteFormaPago(ComprobanteFormaPago comprobanteformapagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
				if(comprobanteformapagoAux.getComprobanteFormaPagoOriginal().getId().equals(comprobanteformapagoOriginal.getId())) {
					existe=true;
					comprobanteformapagoOriginal.setId(comprobanteformapagoAux.getId());
					comprobanteformapagoOriginal.setVersionRow(comprobanteformapagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagos) {
				if(comprobanteformapagoAux.getComprobanteFormaPagoOriginal().getId().equals(comprobanteformapagoOriginal.getId())) {
					existe=true;
					comprobanteformapagoOriginal.setId(comprobanteformapagoAux.getId());
					comprobanteformapagoOriginal.setVersionRow(comprobanteformapagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComprobanteFormaPago(Boolean esParaCancelar) throws Exception {
		comprobanteformapagosAux=new ArrayList<ComprobanteFormaPago>();
		comprobanteformapagoAux=new ComprobanteFormaPago();
		
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
					if(comprobanteformapagoAux.getId()<0) {
						comprobanteformapagosAux.add(comprobanteformapagoAux);
					}		
				}
				this.iIdNuevoComprobanteFormaPago=0L;
				this.comprobanteformapagoLogic.getComprobanteFormaPagos().removeAll(comprobanteformapagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagos) {
					if(comprobanteformapagoAux.getId()<0) {
						comprobanteformapagosAux.add(comprobanteformapagoAux);
					}		
				}
				this.iIdNuevoComprobanteFormaPago=0L;
				this.comprobanteformapagos.removeAll(comprobanteformapagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComprobanteFormaPago 
					&& this.comprobanteformapagoLogic.getComprobanteFormaPagos().size()>0
					) {
					comprobanteformapagoAux=this.comprobanteformapagoLogic.getComprobanteFormaPagos().get(this.comprobanteformapagoLogic.getComprobanteFormaPagos().size() - 1);
				
					if(comprobanteformapagoAux.getId()<0) {
						this.comprobanteformapagoLogic.getComprobanteFormaPagos().remove(comprobanteformapagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComprobanteFormaPago && this.comprobanteformapagos.size()>0) {
					comprobanteformapagoAux=this.comprobanteformapagos.get(this.comprobanteformapagos.size() - 1);
				
					if(comprobanteformapagoAux.getId()<0) {
						this.comprobanteformapagos.remove(comprobanteformapagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComprobanteFormaPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comprobanteformapago.getId()<0) {
				this.comprobanteformapagoLogic.getComprobanteFormaPagos().remove(this.comprobanteformapago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comprobanteformapago.getId()<0) {
				this.comprobanteformapagos.remove(this.comprobanteformapago);
			}
		}			
	}
	
	public void setEstadosInicialesComprobanteFormaPago(List<ComprobanteFormaPago> comprobanteformapagosAux) throws Exception {
		ComprobanteFormaPagoConstantesFunciones.setEstadosInicialesComprobanteFormaPago(comprobanteformapagosAux);
	}
	
	public void setEstadosInicialesComprobanteFormaPago(ComprobanteFormaPago comprobanteformapagoAux) throws Exception {
		ComprobanteFormaPagoConstantesFunciones.setEstadosInicialesComprobanteFormaPago(comprobanteformapagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComprobanteFormaPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComprobanteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComprobanteFormaPagoActual()) {
				if(!this.isEsNuevoComprobanteFormaPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComprobanteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComprobanteFormaPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComprobanteFormaPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comprobante Forma Pago ?", "MANTENIMIENTO DE Comprobante Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComprobanteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComprobanteFormaPago comprobanteformapago) throws Exception {
		ComprobanteFormaPagoConstantesFunciones.seleccionarAsignar(this.comprobanteformapago,comprobanteformapago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComprobanteFormaPago=this.isPermisoActualizarOriginalComprobanteFormaPago;
			
			
			this.seleccionarAsignar(comprobanteformapago);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesComprobanteFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comprobanteformapagoSessionBean.setsFuncionBusquedaRapida(this.comprobanteformapagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComprobanteFormaPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComprobanteFormaPago(esParaCancelar);				
				this.cancelarNuevoComprobanteFormaPago(esParaCancelar);								
			}
			
			this.comprobanteformapago=new ComprobanteFormaPago();
			
			this.inicializarComprobanteFormaPago();
			
			this.actualizarEstadoCeldasBotonesComprobanteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComprobanteFormaPago() throws Exception {
		try {
			ComprobanteFormaPagoConstantesFunciones.inicializarComprobanteFormaPago(this.comprobanteformapago);
			
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
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comprobanteformapagoLogic.getComprobanteFormaPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComprobanteFormaPagos(String sAccionBusqueda,List<ComprobanteFormaPago> comprobanteformapagosParaReportes) throws Exception {
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
					sPathReporteFinal="ComprobanteFormaPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComprobanteFormaPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComprobanteFormaPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComprobanteFormaPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comprobante Forma Pagos");		
		parameters.put("busquedapor", ComprobanteFormaPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComprobanteFormaPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComprobanteFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComprobanteFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComprobanteFormaPago=new JRBeanArrayDataSource(ComprobanteFormaPagoJInternalFrame.TraerComprobanteFormaPagoBeans(comprobanteformapagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComprobanteFormaPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComprobanteFormaPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComprobanteFormaPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComprobanteFormaPagoBean.TraerComprobanteFormaPagoBeans(comprobanteformapagosParaReportes).toArray()));
							
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
				this.generarExcelReporteComprobanteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,comprobanteformapagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComprobanteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,comprobanteformapagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComprobanteFormaPagoActionPerformed(null);
					//this.generarExcelReporteComprobanteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,comprobanteformapagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComprobanteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,comprobanteformapagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComprobanteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,comprobanteformapagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComprobanteFormaPagos(sAccionBusqueda,sTipoArchivoReporte,comprobanteformapagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComprobanteFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFormaPago> comprobanteformapagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobanteformapago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFormaPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobanteFormaPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComprobanteFormaPago comprobanteformapago : comprobanteformapagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComprobanteFormaPagoConstantesFunciones.generarExcelReporteDataComprobanteFormaPago("NORMAL",row,workbook,comprobanteformapago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComprobanteFormaPago(String sTipo,Row row,Workbook workbook) {
		
		ComprobanteFormaPagoConstantesFunciones.generarExcelReporteHeaderComprobanteFormaPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComprobanteFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFormaPago> comprobanteformapagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobanteformapago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComprobanteFormaPago comprobanteformapago : comprobanteformapagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.getComprobanteFormaPagoDescripcion(comprobanteformapago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getnombre_caja());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getcodigo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getsubtotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getfinanciamiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.gettipo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getfecha_forma_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getnumero_cuenta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getnumero_cheque());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getgirador());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getnumero_dias_plazo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getnumero_tarjeta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getautorizacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobanteformapago.getlote());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComprobanteFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFormaPago> comprobanteformapagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComprobanteFormaPago> comprobanteformapagosRespaldo=null;
		
		classes=ComprobanteFormaPagoConstantesFunciones.getClassesRelationshipsOfComprobanteFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comprobanteformapagoLogic.setDatosCliente(this.datosCliente);
		this.comprobanteformapagoLogic.setDatosDeep(this.datosDeep);
		this.comprobanteformapagoLogic.setIsConDeep(true);
		
		comprobanteformapagosRespaldo=this.comprobanteformapagoLogic.getComprobanteFormaPagos();
		
		this.comprobanteformapagoLogic.setComprobanteFormaPagos(comprobanteformapagosParaReportes);	
		this.comprobanteformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comprobanteformapagosParaReportes=this.comprobanteformapagoLogic.getComprobanteFormaPagos();
		this.comprobanteformapagoLogic.setComprobanteFormaPagos(comprobanteformapagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobanteformapago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobanteFormaPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComprobanteFormaPago comprobanteformapago : comprobanteformapagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComprobanteFormaPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComprobanteFormaPagoConstantesFunciones.generarExcelReporteDataComprobanteFormaPago("NORMAL",row,workbook,comprobanteformapago,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.getComprobanteFormaPagoDescripcion(comprobanteformapago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComprobanteFormaPago() throws Exception {		
		this.startProcessComprobanteFormaPago(true);
	}
	
	public void startProcessComprobanteFormaPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComprobanteFormaPago ,this.jPanelParametrosReportesComprobanteFormaPago, this.jScrollPanelDatosComprobanteFormaPago,this.jPanelPaginacionComprobanteFormaPago, this.jScrollPanelDatosEdicionComprobanteFormaPago, this.jPanelAccionesComprobanteFormaPago,this.jPanelAccionesFormularioComprobanteFormaPago,this.jmenuBarComprobanteFormaPago,this.jmenuBarDetalleComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,this.jTtoolBarDetalleComprobanteFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobanteFormaPago=this.jTabbedPaneBusquedasComprobanteFormaPago; 
		
		final JPanel jPanelParametrosReportesComprobanteFormaPago=this.jPanelParametrosReportesComprobanteFormaPago;
		//final JScrollPane jScrollPanelDatosComprobanteFormaPago=this.jScrollPanelDatosComprobanteFormaPago;
		final JTable jTableDatosComprobanteFormaPago=this.jTableDatosComprobanteFormaPago;		
		final JPanel jPanelPaginacionComprobanteFormaPago=this.jPanelPaginacionComprobanteFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionComprobanteFormaPago=this.jScrollPanelDatosEdicionComprobanteFormaPago;
		final JPanel jPanelAccionesComprobanteFormaPago=this.jPanelAccionesComprobanteFormaPago;
		
		JPanel jPanelCamposAuxiliarComprobanteFormaPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComprobanteFormaPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			jPanelCamposAuxiliarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelCamposComprobanteFormaPago;
			jPanelAccionesFormularioAuxiliarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelAccionesFormularioComprobanteFormaPago;
		}
		
		final JPanel jPanelCamposComprobanteFormaPago=jPanelCamposAuxiliarComprobanteFormaPago;
		final JPanel jPanelAccionesFormularioComprobanteFormaPago=jPanelAccionesFormularioAuxiliarComprobanteFormaPago;
		
		
		final JMenuBar jmenuBarComprobanteFormaPago=this.jmenuBarComprobanteFormaPago;
		final JToolBar jTtoolBarComprobanteFormaPago=this.jTtoolBarComprobanteFormaPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComprobanteFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobanteFormaPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			jmenuBarDetalleAuxiliarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jmenuBarDetalleComprobanteFormaPago;
			jTtoolBarDetalleAuxiliarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jTtoolBarDetalleComprobanteFormaPago;
		}
		
		final JMenuBar jmenuBarDetalleComprobanteFormaPago=jmenuBarDetalleAuxiliarComprobanteFormaPago;
		final JToolBar jTtoolBarDetalleComprobanteFormaPago=jTtoolBarDetalleAuxiliarComprobanteFormaPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobanteFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobanteFormaPago;
			processRunnable.jTableDatos=jTableDatosComprobanteFormaPago;
			processRunnable.jPanelCampos=jPanelCamposComprobanteFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobanteFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesComprobanteFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobanteFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarComprobanteFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobanteFormaPago;
			processRunnable.jTtoolBar=jTtoolBarComprobanteFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobanteFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobanteFormaPago ,jPanelParametrosReportesComprobanteFormaPago,jTableDatosComprobanteFormaPago, /*jScrollPanelDatosComprobanteFormaPago,*/jPanelCamposComprobanteFormaPago,jPanelPaginacionComprobanteFormaPago, /*jScrollPanelDatosEdicionComprobanteFormaPago,*/ jPanelAccionesComprobanteFormaPago,jPanelAccionesFormularioComprobanteFormaPago,jmenuBarComprobanteFormaPago,jmenuBarDetalleComprobanteFormaPago,jTtoolBarComprobanteFormaPago,jTtoolBarDetalleComprobanteFormaPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobanteFormaPago ,jPanelParametrosReportesComprobanteFormaPago, jScrollPanelDatosComprobanteFormaPago,jPanelPaginacionComprobanteFormaPago, jScrollPanelDatosEdicionComprobanteFormaPago, jPanelAccionesComprobanteFormaPago,jPanelAccionesFormularioComprobanteFormaPago,jmenuBarComprobanteFormaPago,jmenuBarDetalleComprobanteFormaPago,jTtoolBarComprobanteFormaPago,jTtoolBarDetalleComprobanteFormaPago);
						
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
	
	public void finishProcessComprobanteFormaPago() {// throws Exception 
		this.finishProcessComprobanteFormaPago(true);
	}
	
	public void finishProcessComprobanteFormaPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComprobanteFormaPago ,this.jPanelParametrosReportesComprobanteFormaPago, this.jScrollPanelDatosComprobanteFormaPago,this.jPanelPaginacionComprobanteFormaPago, this.jScrollPanelDatosEdicionComprobanteFormaPago, this.jPanelAccionesComprobanteFormaPago,this.jPanelAccionesFormularioComprobanteFormaPago,this.jmenuBarComprobanteFormaPago,this.jmenuBarDetalleComprobanteFormaPago,this.jTtoolBarComprobanteFormaPago,this.jTtoolBarDetalleComprobanteFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobanteFormaPago=this.jTabbedPaneBusquedasComprobanteFormaPago; 
		
		final JPanel jPanelParametrosReportesComprobanteFormaPago=this.jPanelParametrosReportesComprobanteFormaPago;
		//final JScrollPane jScrollPanelDatosComprobanteFormaPago=this.jScrollPanelDatosComprobanteFormaPago;
		final JTable jTableDatosComprobanteFormaPago=this.jTableDatosComprobanteFormaPago;		
		final JPanel jPanelPaginacionComprobanteFormaPago=this.jPanelPaginacionComprobanteFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionComprobanteFormaPago=this.jScrollPanelDatosEdicionComprobanteFormaPago;
		final JPanel jPanelAccionesComprobanteFormaPago=this.jPanelAccionesComprobanteFormaPago;
		
		JPanel jPanelCamposAuxiliarComprobanteFormaPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComprobanteFormaPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			jPanelCamposAuxiliarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelCamposComprobanteFormaPago;
			jPanelAccionesFormularioAuxiliarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelAccionesFormularioComprobanteFormaPago;
		}
		
		final JPanel jPanelCamposComprobanteFormaPago=jPanelCamposAuxiliarComprobanteFormaPago;
		final JPanel jPanelAccionesFormularioComprobanteFormaPago=jPanelAccionesFormularioAuxiliarComprobanteFormaPago;
		
		
		final JMenuBar jmenuBarComprobanteFormaPago=this.jmenuBarComprobanteFormaPago;		
		final JToolBar jTtoolBarComprobanteFormaPago=this.jTtoolBarComprobanteFormaPago;
				
		JMenuBar jmenuBarDetalleAuxiliarComprobanteFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobanteFormaPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			jmenuBarDetalleAuxiliarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jmenuBarDetalleComprobanteFormaPago;
			jTtoolBarDetalleAuxiliarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jTtoolBarDetalleComprobanteFormaPago;		
		}
		
		final JMenuBar jmenuBarDetalleComprobanteFormaPago=jmenuBarDetalleAuxiliarComprobanteFormaPago;
		final JToolBar jTtoolBarDetalleComprobanteFormaPago=jTtoolBarDetalleAuxiliarComprobanteFormaPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobanteFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobanteFormaPago;
			processRunnable.jTableDatos=jTableDatosComprobanteFormaPago;
			processRunnable.jPanelCampos=jPanelCamposComprobanteFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobanteFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesComprobanteFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobanteFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarComprobanteFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobanteFormaPago;
			processRunnable.jTtoolBar=jTtoolBarComprobanteFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobanteFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComprobanteFormaPago ,jPanelParametrosReportesComprobanteFormaPago, jTableDatosComprobanteFormaPago,/*jScrollPanelDatosComprobanteFormaPago,*/jPanelCamposComprobanteFormaPago,jPanelPaginacionComprobanteFormaPago, /*jScrollPanelDatosEdicionComprobanteFormaPago,*/ jPanelAccionesComprobanteFormaPago,jPanelAccionesFormularioComprobanteFormaPago,jmenuBarComprobanteFormaPago,jmenuBarDetalleComprobanteFormaPago,jTtoolBarComprobanteFormaPago,jTtoolBarDetalleComprobanteFormaPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComprobanteFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComprobanteFormaPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComprobanteFormaPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComprobanteFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComprobanteFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComprobanteFormaPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComprobanteFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComprobanteFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComprobanteFormaPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comprobanteformapagoConstantesFunciones.getsFinalQueryComprobanteFormaPago();
		String  finalQueryPaginacionTodos=this.comprobanteformapagoConstantesFunciones.getsFinalQueryComprobanteFormaPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComprobanteFormaPagoConstantesFunciones.getArrayColumnasGlobalesNoComprobanteFormaPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComprobanteFormaPagoConstantesFunciones.getArrayColumnasGlobalesComprobanteFormaPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComprobanteFormaPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comprobanteformapagosEliminados= new ArrayList<ComprobanteFormaPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComprobanteFormaPago();
		
				///*ComprobanteFormaPagoSessionBean*/this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
			
			if(this.comprobanteformapagoSessionBean==null) {
				this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
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
					this.iNumeroPaginacion=ComprobanteFormaPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComprobanteFormaPagoConstantesFunciones.getClassesForeignKeysOfComprobanteFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comprobanteformapago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comprobanteformapagosAux= new ArrayList<ComprobanteFormaPago>();
			
				
			comprobanteformapagoLogic.setDatosCliente(this.datosCliente);
			comprobanteformapagoLogic.setDatosDeep(this.datosDeep);
			comprobanteformapagoLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaComprobanteFormaPago")) {
				this.sDetalleReporte=ComprobanteFormaPagoConstantesFunciones.getDetalleIndiceBusquedaComprobanteFormaPago(fecha_inicioBusquedaComprobanteFormaPago,fecha_finBusquedaComprobanteFormaPago);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comprobanteformapagoLogic.getComprobanteFormaPagosBusquedaComprobanteFormaPago(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaComprobanteFormaPago,fecha_finBusquedaComprobanteFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobanteFormaPagoConstantesFunciones.getDetalleIndiceBusquedaComprobanteFormaPago(fecha_inicioBusquedaComprobanteFormaPago,fecha_finBusquedaComprobanteFormaPago);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobanteFormaPagoConstantesFunciones.getDetalleIndiceBusquedaComprobanteFormaPago(fecha_inicioBusquedaComprobanteFormaPago,fecha_finBusquedaComprobanteFormaPago);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comprobanteformapagoLogic.getComprobanteFormaPagos()==null||comprobanteformapagoLogic.getComprobanteFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comprobanteformapagos==null|| comprobanteformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobanteformapagosAux=new ArrayList<ComprobanteFormaPago>();
						comprobanteformapagosAux.addAll(comprobanteformapagoLogic.getComprobanteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobanteformapagosAux=new ArrayList<ComprobanteFormaPago>();
							comprobanteformapagosAux.addAll(comprobanteformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comprobanteformapagoLogic.getComprobanteFormaPagosBusquedaComprobanteFormaPago(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,fecha_inicioBusquedaComprobanteFormaPago,fecha_finBusquedaComprobanteFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobanteFormaPagoConstantesFunciones.getDetalleIndiceBusquedaComprobanteFormaPago(fecha_inicioBusquedaComprobanteFormaPago,fecha_finBusquedaComprobanteFormaPago);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobanteFormaPagoConstantesFunciones.getDetalleIndiceBusquedaComprobanteFormaPago(fecha_inicioBusquedaComprobanteFormaPago,fecha_finBusquedaComprobanteFormaPago);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComprobanteFormaPagos("BusquedaComprobanteFormaPago",comprobanteformapagoLogic.getComprobanteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComprobanteFormaPagos("BusquedaComprobanteFormaPago",comprobanteformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobanteformapagoLogic.setComprobanteFormaPagos(new ArrayList<ComprobanteFormaPago>());
						comprobanteformapagoLogic.getComprobanteFormaPagos().addAll(comprobanteformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobanteformapagos=new ArrayList<ComprobanteFormaPago>();
							comprobanteformapagos.addAll(comprobanteformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComprobanteFormaPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComprobanteFormaPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobanteformapagoLogic.getComprobanteFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobanteformapagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobanteformapagoLogic.getComprobanteFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobanteformapagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComprobanteFormaPago comprobanteformapago) {
		Boolean permite=true;
		
		if(this.comprobanteformapago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComprobanteFormaPagoConstantesFunciones.getOrderByListaComprobanteFormaPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComprobanteFormaPagoConstantesFunciones.getOrderByListaComprobanteFormaPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagoLogic.getComprobanteFormaPagos()) {
				if(comprobanteformapago.getsType().equals(Constantes2.S_TOTALES)) {
					comprobanteformapagoTotales=comprobanteformapago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFormaPago comprobanteformapago:this.comprobanteformapagos) {
				if(comprobanteformapago.getsType().equals(Constantes2.S_TOTALES)) {
					comprobanteformapagoTotales=comprobanteformapago;
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
			this.comprobanteformapagoAux=new ComprobanteFormaPago();
			this.comprobanteformapagoAux.setsType(Constantes2.S_TOTALES);
			this.comprobanteformapagoAux.setIsNew(false);
			this.comprobanteformapagoAux.setIsChanged(false);
			this.comprobanteformapagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ComprobanteFormaPagoConstantesFunciones.TotalizarValoresFilaComprobanteFormaPago(this.comprobanteformapagoLogic.getComprobanteFormaPagos(),this.comprobanteformapagoAux);
				
				//this.comprobanteformapagoLogic.getComprobanteFormaPagos().add(this.comprobanteformapagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComprobanteFormaPagoConstantesFunciones.TotalizarValoresFilaComprobanteFormaPago(this.comprobanteformapagos,this.comprobanteformapagoAux);
				
				this.comprobanteformapagos.add(this.comprobanteformapagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comprobanteformapagoTotales=new ComprobanteFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobanteformapagoLogic.getComprobanteFormaPagos().remove(comprobanteformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobanteformapagos.remove(comprobanteformapagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comprobanteformapagoTotales=new ComprobanteFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagoLogic.getComprobanteFormaPagos()) {
				if(comprobanteformapago.getsType().equals(Constantes2.S_TOTALES)) {
					comprobanteformapagoTotales=comprobanteformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobanteFormaPagoConstantesFunciones.TotalizarValoresFilaComprobanteFormaPago(this.comprobanteformapagoLogic.getComprobanteFormaPagos(),comprobanteformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFormaPago comprobanteformapago:this.comprobanteformapagos) {
				if(comprobanteformapago.getsType().equals(Constantes2.S_TOTALES)) {
					comprobanteformapagoTotales=comprobanteformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobanteFormaPagoConstantesFunciones.TotalizarValoresFilaComprobanteFormaPago(this.comprobanteformapagos,comprobanteformapagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComprobanteFormaPagosBusquedaComprobanteFormaPago()throws Exception {
		try {
			sAccionBusqueda="BusquedaComprobanteFormaPago";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFormaPagosFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFormaPagosFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFormaPagosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFormaPagosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComprobanteFormaPagosBusquedaComprobanteFormaPago(String sFinalQuery,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobanteformapagoLogic.getComprobanteFormaPagosBusquedaComprobanteFormaPago(sFinalQuery,this.pagination,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFormaPagosFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobanteformapagoLogic.getComprobanteFormaPagosFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFormaPagosFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobanteformapagoLogic.getComprobanteFormaPagosFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFormaPagosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobanteformapagoLogic.getComprobanteFormaPagosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFormaPagosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobanteformapagoLogic.getComprobanteFormaPagosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosComprobanteFormaPago() {
		this.isPermisoTodoComprobanteFormaPago=false;
		this.isPermisoNuevoComprobanteFormaPago=false;
		this.isPermisoActualizarComprobanteFormaPago=false;
		this.isPermisoActualizarOriginalComprobanteFormaPago=false;
		this.isPermisoEliminarComprobanteFormaPago=false;
		this.isPermisoGuardarCambiosComprobanteFormaPago=false;
		this.isPermisoConsultaComprobanteFormaPago=true;
		this.isPermisoBusquedaComprobanteFormaPago=true;
		this.isPermisoReporteComprobanteFormaPago=true;
		this.isPermisoOrdenComprobanteFormaPago=false;		
		this.isPermisoPaginacionMedioComprobanteFormaPago=false;		
		this.isPermisoPaginacionAltoComprobanteFormaPago=false;		
		this.isPermisoPaginacionTodoComprobanteFormaPago=false;		
		this.isPermisoCopiarComprobanteFormaPago=false;		
		this.isPermisoVerFormComprobanteFormaPago=false;		
		this.isPermisoDuplicarComprobanteFormaPago=false;
		this.isPermisoOrdenComprobanteFormaPago=false;
	}
	
	public void setPermisosUsuarioComprobanteFormaPago(Boolean isPermiso) {
		this.isPermisoTodoComprobanteFormaPago=isPermiso;
		this.isPermisoNuevoComprobanteFormaPago=isPermiso;
		this.isPermisoActualizarComprobanteFormaPago=isPermiso;
		this.isPermisoActualizarOriginalComprobanteFormaPago=isPermiso;
		this.isPermisoEliminarComprobanteFormaPago=isPermiso;
		this.isPermisoGuardarCambiosComprobanteFormaPago=isPermiso;
		this.isPermisoConsultaComprobanteFormaPago=isPermiso;
		this.isPermisoBusquedaComprobanteFormaPago=isPermiso;
		this.isPermisoReporteComprobanteFormaPago=isPermiso;
		this.isPermisoOrdenComprobanteFormaPago=isPermiso;		
		this.isPermisoPaginacionMedioComprobanteFormaPago=isPermiso;		
		this.isPermisoPaginacionAltoComprobanteFormaPago=isPermiso;		
		this.isPermisoPaginacionTodoComprobanteFormaPago=isPermiso;		
		this.isPermisoCopiarComprobanteFormaPago=isPermiso;		
		this.isPermisoVerFormComprobanteFormaPago=isPermiso;		
		this.isPermisoDuplicarComprobanteFormaPago=isPermiso;
		this.isPermisoOrdenComprobanteFormaPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComprobanteFormaPago(Boolean isPermiso) {
		//this.isPermisoTodoComprobanteFormaPago=isPermiso;
		this.isPermisoNuevoComprobanteFormaPago=isPermiso;
		this.isPermisoActualizarComprobanteFormaPago=isPermiso;
		this.isPermisoActualizarOriginalComprobanteFormaPago=isPermiso;
		this.isPermisoEliminarComprobanteFormaPago=isPermiso;
		this.isPermisoGuardarCambiosComprobanteFormaPago=isPermiso;
		//this.isPermisoConsultaComprobanteFormaPago=isPermiso;
		//this.isPermisoBusquedaComprobanteFormaPago=isPermiso;
		//this.isPermisoReporteComprobanteFormaPago=isPermiso;
		//this.isPermisoOrdenComprobanteFormaPago=isPermiso;		
		//this.isPermisoPaginacionMedioComprobanteFormaPago=isPermiso;		
		//this.isPermisoPaginacionAltoComprobanteFormaPago=isPermiso;		
		//this.isPermisoPaginacionTodoComprobanteFormaPago=isPermiso;		
		//this.isPermisoCopiarComprobanteFormaPago=isPermiso;		
		//this.isPermisoDuplicarComprobanteFormaPago=isPermiso;
		//this.isPermisoOrdenComprobanteFormaPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComprobanteFormaPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComprobanteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComprobanteFormaPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComprobanteFormaPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComprobanteFormaPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComprobanteFormaPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComprobanteFormaPagoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComprobanteFormaPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComprobanteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComprobanteFormaPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComprobanteFormaPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComprobanteFormaPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComprobanteFormaPago=this.isPermisoActualizarComprobanteFormaPago;
			this.isPermisoEliminarComprobanteFormaPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComprobanteFormaPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComprobanteFormaPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComprobanteFormaPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComprobanteFormaPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComprobanteFormaPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobanteFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComprobanteFormaPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComprobanteFormaPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComprobanteFormaPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComprobanteFormaPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComprobanteFormaPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComprobanteFormaPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobanteFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComprobanteFormaPago.setToolTipText(this.jTableDatosComprobanteFormaPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComprobanteFormaPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComprobanteFormaPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComprobanteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComprobanteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComprobanteFormaPago() throws Exception {
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
	public void inicializarCombosForeignKeyComprobanteFormaPagoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComprobanteFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComprobanteFormaPagoJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyCajaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.cajasForeignKey==null||this.cajasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=CajaConstantesFunciones.getArrayColumnasGlobalesCaja(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,CajaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=CajaConstantesFunciones.SFINALQUERY;

				this.cargarCombosCajasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyComprobanteFormaPago()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyCaja();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comprobanteformapagoSessionBean==null) {
				this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean();
			}

			if(!this.comprobanteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.comprobanteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.comprobanteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.comprobanteformapagoSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
				Caja caja=new Caja();
				CajaConstantesFunciones.setCajaDescripcion(caja,Constantes.SMENSAJE_ESCOJA_OPCION);
				caja.setId(null);

				if(!CajaConstantesFunciones.ExisteEnLista(this.cajasForeignKey,caja,true)) {

					this.cajasForeignKey.add(0,caja);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyComprobanteFormaPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComprobanteFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComprobanteFormaPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFormaPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(comprobanteformapago.getid_cliente(),false,"Formulario");
			this.setActualCajaForeignKey(comprobanteformapago.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComprobanteFormaPago()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.comprobanteformapagoConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualCajaForeignKey(this.comprobanteformapagoConstantesFunciones.getid_caja(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFormaPago()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComprobanteFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComprobanteFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComprobanteFormaPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComprobanteFormaPago()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComprobanteFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComprobanteFormaPago()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ComprobanteFormaPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComprobanteFormaPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComprobanteFormaPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comprobanteformapagoSessionBean=new ComprobanteFormaPagoSessionBean(); 
		this.comprobanteformapagoConstantesFunciones=new ComprobanteFormaPagoConstantesFunciones(); 
		this.comprobanteformapagoBean=new ComprobanteFormaPago();//(this.comprobanteformapagoConstantesFunciones); 		
		this.comprobanteformapagoReturnGeneral=new ComprobanteFormaPagoParameterReturnGeneral(); 
		
		this.comprobanteformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobanteformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComprobanteFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComprobanteFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComprobanteFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComprobanteFormaPago(true);
			
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
			
			this.comprobanteformapagoConstantesFunciones=new ComprobanteFormaPagoConstantesFunciones(); 
			this.comprobanteformapagoBean=new ComprobanteFormaPago();//this.comprobanteformapagoConstantesFunciones); 			
			this.comprobanteformapagoReturnGeneral=new ComprobanteFormaPagoParameterReturnGeneral(); 
		
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobante Forma Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comprobanteformapago=new ComprobanteFormaPago();
			this.comprobanteformapagos = new ArrayList<ComprobanteFormaPago>();
			this.comprobanteformapagosAux = new ArrayList<ComprobanteFormaPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic=new ComprobanteFormaPagoLogic();
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.comprobanteformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comprobanteformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComprobanteFormaPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobanteFormaPago);	
					}
					
					if(this.jInternalFrameImportacionComprobanteFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobanteFormaPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComprobanteFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComprobanteFormaPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobanteFormaPago);
				this.jInternalFrameDetalleFormComprobanteFormaPago.setVisible(false);
				this.jInternalFrameDetalleFormComprobanteFormaPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobanteFormaPago);
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.setVisible(false);
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComprobanteFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComprobanteFormaPago);
					this.jInternalFrameImportacionComprobanteFormaPago.setVisible(false);
					this.jInternalFrameImportacionComprobanteFormaPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComprobanteFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComprobanteFormaPago);
					this.jInternalFrameOrderByComprobanteFormaPago.setVisible(false);
					this.jInternalFrameOrderByComprobanteFormaPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComprobanteFormaPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComprobanteFormaPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comprobanteformapagoReturnGeneral=new ComprobanteFormaPagoParameterReturnGeneral();
			
			this.comprobanteformapagoParameterGeneral=new ComprobanteFormaPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comprobanteformapagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComprobanteFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobanteFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),this.comprobanteformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobanteFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),this.comprobanteformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=false;
			this.isVisibilidadCeldaDuplicarComprobanteFormaPago=true;
			this.isVisibilidadCeldaCopiarComprobanteFormaPago=true;
			this.isVisibilidadCeldaVerFormComprobanteFormaPago=true;
			this.isVisibilidadCeldaOrdenComprobanteFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
			this.isVisibilidadCeldaModificarComprobanteFormaPago=false;
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=false;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=false;
			this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;
			
			
			this.isVisibilidadBusquedaComprobanteFormaPago=true;
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComprobanteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComprobanteFormaPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComprobanteFormaPago(false);
			
			this.setPermisosUsuarioComprobanteFormaPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() 
				|| (this.comprobanteformapagoSessionBean.getEsGuardarRelacionado() && this.comprobanteformapagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComprobanteFormaPagoClasesRelacionadas();
			}
			
			if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComprobanteFormaPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComprobanteFormaPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComprobanteFormaPago();
			}
			
			if(!this.isPermisoBusquedaComprobanteFormaPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComprobanteFormaPagoConstantesFunciones.getTiposSeleccionarComprobanteFormaPago());
				
				this.tiposColumnasSelect=ComprobanteFormaPagoConstantesFunciones.getTiposSeleccionarComprobanteFormaPago(true);
				
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
			//if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComprobanteFormaPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioComprobanteFormaPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioComprobanteFormaPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFormaPago() ;
			
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
			this.clienteLogic=new ClienteLogic();
			this.cajaLogic=new CajaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comprobanteformapagoImplementable= (ComprobanteFormaPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobanteFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comprobanteformapagoImplementableHome= (ComprobanteFormaPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobanteFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comprobanteformapagos= new ArrayList<ComprobanteFormaPago>();
			this.comprobanteformapagosEliminados= new ArrayList<ComprobanteFormaPago>();
						
			this.isEsNuevoComprobanteFormaPago=false;
			this.esParaAccionDesdeFormularioComprobanteFormaPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComprobanteFormaPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComprobanteFormaPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComprobanteFormaPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComprobanteFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComprobanteFormaPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComprobanteFormaPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComprobanteFormaPago();
			}
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComprobanteFormaPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComprobanteFormaPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComprobanteFormaPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComprobanteFormaPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComprobanteFormaPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComprobanteFormaPago() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComprobanteFormaPago")) {
				iIndex=this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComprobanteFormaPago();	
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
	
	public void cargarCombosForeignKeyComprobanteFormaPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComprobanteFormaPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComprobanteFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComprobanteFormaPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComprobanteFormaPago();
		
		this.cargarCombosFrameForeignKeyComprobanteFormaPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComprobanteFormaPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComprobanteFormaPago();
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

	public void cargarCombosForeignKeyCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCaja(this.cajasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoComprobanteFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
			
			if(jTableDatosComprobanteFormaPago.getRowCount()>=1) {
				jTableDatosComprobanteFormaPago.removeRowSelectionInterval(0, jTableDatosComprobanteFormaPago.getRowCount()-1);						
			}
			
			this.isEsNuevoComprobanteFormaPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComprobanteFormaPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComprobanteFormaPago(true);			
			//this.comprobanteformapago=new ComprobanteFormaPago();
			//this.comprobanteformapago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFormaPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFormaPago() ;
			
			if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFormaPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comprobanteformapago);	
			this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);				
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
			if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComprobanteFormaPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComprobanteFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComprobanteFormaPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComprobanteFormaPago.getSelectedRows().length;			
			}
			
			comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComprobanteFormaPago--;			
				//ComprobanteFormaPago comprobanteformapagoAux= new ComprobanteFormaPago();			
				//comprobanteformapagoAux.setId(this.iIdNuevoComprobanteFormaPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComprobanteFormaPago comprobanteformapagoOrigen=new ComprobanteFormaPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComprobanteFormaPago comprobanteformapagoOrigen : comprobanteformapagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comprobanteformapagoOrigen =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobanteformapagoOrigen =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComprobanteFormaPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comprobanteformapago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComprobanteFormaPago(comprobanteformapagoOrigen,this.comprobanteformapago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobanteformapagoLogic.getComprobanteFormaPagos().add(this.comprobanteformapagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobanteformapagos.add(this.comprobanteformapagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
				
				this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(this.getIndiceNuevoComprobanteFormaPago(), this.getIndiceNuevoComprobanteFormaPago());
				
				int iLastRow =  this.jTableDatosComprobanteFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobanteFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobanteFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();									
		
			ComprobanteFormaPago comprobanteformapagoOrigen=new ComprobanteFormaPago();
			ComprobanteFormaPago comprobanteformapagoDestino=new ComprobanteFormaPago();
				
			comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComprobanteFormaPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comprobanteformapagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComprobanteFormaPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobanteformapagoOrigen =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobanteformapagoOrigen =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobanteformapagoDestino =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobanteformapagoDestino =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comprobanteformapagoOrigen =comprobanteformapagosSeleccionados.get(0);
				comprobanteformapagoDestino =comprobanteformapagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComprobanteFormaPago(comprobanteformapagoOrigen,comprobanteformapagoDestino,true,false);
				
				comprobanteformapagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comprobanteformapagoDestino,comprobanteformapagoLogic.getComprobanteFormaPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comprobanteformapagoDestino,comprobanteformapagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
				
				//this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(this.getIndiceNuevoComprobanteFormaPago(), this.getIndiceNuevoComprobanteFormaPago());
				
				int iLastRow =  this.jTableDatosComprobanteFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobanteFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobanteFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComprobanteFormaPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComprobanteFormaPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComprobanteFormaPago.setVisible(!isVisible);
			this.jPanelPaginacionComprobanteFormaPago.setVisible(!isVisible);
			this.jPanelAccionesComprobanteFormaPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComprobanteFormaPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComprobanteFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComprobanteFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComprobanteFormaPago();
			
			this.abrirFrameOrderByComprobanteFormaPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComprobanteFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComprobanteFormaPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobanteFormaPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComprobanteFormaPago.isMaximum()) {
					this.jInternalFrameDetalleFormComprobanteFormaPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComprobanteFormaPago.setSize(this.jInternalFrameDetalleFormComprobanteFormaPago.iWidthFormulario,this.jInternalFrameDetalleFormComprobanteFormaPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComprobanteFormaPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComprobanteFormaPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComprobanteFormaPago.isMaximum()) {
						this.jInternalFrameDetalleFormComprobanteFormaPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComprobanteFormaPago.jContentPaneDetalleComprobanteFormaPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFormaPago.jContentPaneDetalleComprobanteFormaPago.getWidth(),ComprobanteFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFormaPago.jContentPaneDetalleComprobanteFormaPago.getWidth(),ComprobanteFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFormaPago.jContentPaneDetalleComprobanteFormaPago.getWidth(),ComprobanteFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComprobanteFormaPago.setVisible(true);
	        this.jInternalFrameDetalleFormComprobanteFormaPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComprobanteFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComprobanteFormaPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComprobanteFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFormaPago,false,this);
				} else {
					this.jInternalFrameOrderByComprobanteFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFormaPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComprobanteFormaPago);
				this.jInternalFrameOrderByComprobanteFormaPago.setVisible(false);
				this.jInternalFrameOrderByComprobanteFormaPago.setSelected(false);
				
				this.jInternalFrameOrderByComprobanteFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobanteFormaPago"));
				
				this.inicializarActualizarBindingTablaOrderByComprobanteFormaPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComprobanteFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComprobanteFormaPago==null) {
				
				this.jInternalFrameImportacionComprobanteFormaPago=new ImportacionJInternalFrame(ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobanteFormaPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComprobanteFormaPago);
				this.jInternalFrameImportacionComprobanteFormaPago.setVisible(false);
				this.jInternalFrameImportacionComprobanteFormaPago.setSelected(false);


				this.jInternalFrameImportacionComprobanteFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobanteFormaPago"));
				this.jInternalFrameImportacionComprobanteFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobanteFormaPago"));
				this.jInternalFrameImportacionComprobanteFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobanteFormaPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComprobanteFormaPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComprobanteFormaPago==null) {
				this.jInternalFrameReporteDinamicoComprobanteFormaPago=new ReporteDinamicoJInternalFrame(ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobanteFormaPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobanteFormaPago);
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.setVisible(false);
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFormaPago"));
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFormaPago"));
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFormaPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFormaPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComprobanteFormaPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobanteFormaPago);
			
	       	this.jInternalFrameDetalleFormComprobanteFormaPago.setVisible(false);
	        this.jInternalFrameDetalleFormComprobanteFormaPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormComprobanteFormaPago.dispose();
			//this.jInternalFrameDetalleFormComprobanteFormaPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComprobanteFormaPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComprobanteFormaPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoComprobanteFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComprobanteFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComprobanteFormaPago.setVisible(true);
	        this.jInternalFrameImportacionComprobanteFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComprobanteFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComprobanteFormaPago.setVisible(true);
	        this.jInternalFrameOrderByComprobanteFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComprobanteFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComprobanteFormaPago.setVisible(false);
	        this.jInternalFrameOrderByComprobanteFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComprobanteFormaPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComprobanteFormaPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoComprobanteFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComprobanteFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComprobanteFormaPago.setVisible(false);
	        this.jInternalFrameImportacionComprobanteFormaPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComprobanteFormaPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComprobanteFormaPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComprobanteFormaPago(true);
			//this.isEsNuevoComprobanteFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComprobanteFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFormaPago(false) ;
			
			if(comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFormaPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComprobanteFormaPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComprobanteFormaPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComprobanteFormaPago(true);
			//this.isEsNuevoComprobanteFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comprobanteformapago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComprobanteFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComprobanteFormaPago(false) ;
			
			if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFormaPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobanteFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobanteFormaPago.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComprobanteFormaPago(false);
			
			//if(!this.isEsNuevoComprobanteFormaPago) {								
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				
			}
			
			if(this.permiteMantenimiento(this.comprobanteformapago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComprobanteFormaPago=true;
					this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
					this.isEsNuevoComprobanteFormaPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComprobanteFormaPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComprobanteFormaPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobanteFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFormaPago(false);
				
				this.habilitarDeshabilitarControlesComprobanteFormaPago(false);
			
												
				
				if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComprobanteFormaPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComprobanteFormaPagoActionPerformed(evt,comprobanteformapagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComprobanteFormaPago(this.comprobanteformapago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comprobanteformapagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comprobanteformapago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.comprobanteformapago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.comprobanteformapago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comprobanteformapago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComprobanteFormaPagoModel) this.jTableDatosComprobanteFormaPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComprobanteFormaPago=true;
				this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
				this.isEsNuevoComprobanteFormaPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobanteFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFormaPago(false);
				
				this.habilitarDeshabilitarControlesComprobanteFormaPago(false);
				
				
				
				if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComprobanteFormaPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComprobanteFormaPago.getRowCount()>=1) {
				jTableDatosComprobanteFormaPago.removeRowSelectionInterval(0, jTableDatosComprobanteFormaPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComprobanteFormaPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFormaPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFormaPago(false) ;
			
			this.isEsNuevoComprobanteFormaPago=false;
			
			if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComprobanteFormaPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComprobanteFormaPago(false);
				
				//SI ES MANUAL
				if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComprobanteFormaPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComprobanteFormaPago--;			
			//ComprobanteFormaPago comprobanteformapagoAux= new ComprobanteFormaPago();			
			//comprobanteformapagoAux.setId(this.iIdNuevoComprobanteFormaPago);
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComprobanteFormaPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
			
			this.comprobanteformapago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comprobanteformapagoLogic.getComprobanteFormaPagos().add(this.comprobanteformapagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comprobanteformapagos.add(this.comprobanteformapagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
			
			this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(this.getIndiceNuevoComprobanteFormaPago(), this.getIndiceNuevoComprobanteFormaPago());
			
			int iLastRow =  this.jTableDatosComprobanteFormaPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComprobanteFormaPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComprobanteFormaPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFormaPago(false);
			
			//SI ES MANUAL
			if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFormaPago();
			}
			
			//this.abrirFrameTreeComprobanteFormaPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComprobanteFormaPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComprobanteFormaPago.setFileImportacion(this.jInternalFrameImportacionComprobanteFormaPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComprobanteFormaPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComprobanteFormaPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComprobanteFormaPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComprobanteFormaPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		

		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComprobanteFormaPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComprobanteFormaPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteComprobanteFormaPagos("Todos",comprobanteformapagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_btotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_btotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_btotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_btotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nanciamiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nanciamiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nanciamiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nanciamiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_po_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_po_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_po_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_po_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFormaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFormaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFormaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFormaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCuenta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCuenta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCuenta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCuenta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroCheque_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroCheque_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroCheque_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroCheque_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rador_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rador_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rador_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rador_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDiasPlazo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDiasPlazo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDiasPlazo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDiasPlazo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroTarjeta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroTarjeta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroTarjeta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroTarjeta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_torizacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_torizacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_torizacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_torizacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_te_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_te_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_te_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_te_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoria="nombre_caja";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoria="codigo_cliente";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="subtotal";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoria="financiamiento";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoria="tipo";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO:
					sNombreCampoCategoria="fecha_forma_pago";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoria="numero_cuenta";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoria="numero_cheque";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR:
					sNombreCampoCategoria="girador";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO:
					sNombreCampoCategoria="numero_dias_plazo";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA:
					sNombreCampoCategoria="numero_tarjeta";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION:
					sNombreCampoCategoria="autorizacion";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoria="lote";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoriaValor="nombre_caja";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoriaValor="codigo_cliente";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="subtotal";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoriaValor="financiamiento";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO:
					sNombreCampoCategoriaValor="tipo";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO:
					sNombreCampoCategoriaValor="fecha_forma_pago";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA:
					sNombreCampoCategoriaValor="numero_cuenta";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					sNombreCampoCategoriaValor="numero_cheque";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR:
					sNombreCampoCategoriaValor="girador";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO:
					sNombreCampoCategoriaValor="numero_dias_plazo";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA:
					sNombreCampoCategoriaValor="numero_tarjeta";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION:
					sNombreCampoCategoriaValor="autorizacion";
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoriaValor="lote";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_caja");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cliente");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Subtotal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"subtotal");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Financiamiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"financiamiento");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"tipo");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Forma Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_forma_pago");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cuenta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cuenta");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Cheque",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_cheque");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Girador",sNombreCampoCategoria,sNombreCampoCategoriaValor,"girador");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Dias Plazo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias_plazo");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Tarjeta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_tarjeta");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Autorizacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"autorizacion");
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Lote",sNombreCampoCategoria,sNombreCampoCategoriaValor,"lote");
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
	
	public void jButtonGenerarExcelReporteDinamicoComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobanteformapago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComprobanteFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getnombre_caja());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getcodigo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getsubtotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IVA);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getfinanciamiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_ICE);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.gettipo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getfecha_forma_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getnumero_cuenta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getnumero_cheque());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getgirador());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getnumero_dias_plazo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getnumero_tarjeta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getautorizacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE);
					iRow++;

					for(ComprobanteFormaPago comprobanteformapago:comprobanteformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobanteformapago.getlote());
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
			//	this.getFilaCabeceraExportarExcelComprobanteFormaPago(row);				
			//	iRow++;
			//}				
			
			//for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComprobanteFormaPago(comprobanteformapagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFormaPago(false);
			
			//SI ES MANUAL
			if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFormaPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFormaPago(false);
			
			//SI ES MANUAL
			if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobanteFormaPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFormaPago(false);
			
			//SI ES MANUAL
			if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobanteFormaPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComprobanteFormaPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComprobanteFormaPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComprobanteFormaPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComprobanteFormaPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComprobanteFormaPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComprobanteFormaPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosComprobanteFormaPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosComprobanteFormaPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComprobanteFormaPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComprobanteFormaPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComprobanteFormaPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComprobanteFormaPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComprobanteFormaPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComprobanteFormaPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFormaPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComprobanteFormaPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComprobanteFormaPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComprobanteFormaPago();
		
		this.inicializarActualizarBindingBotonesManualComprobanteFormaPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComprobanteFormaPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFormaPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFormaPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFormaPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComprobanteFormaPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComprobanteFormaPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComprobanteFormaPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComprobanteFormaPago.jCheckBoxPostAccionNuevoComprobanteFormaPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComprobanteFormaPago.jCheckBoxPostAccionSinCerrarComprobanteFormaPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComprobanteFormaPago.jCheckBoxPostAccionSinMensajeComprobanteFormaPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComprobanteFormaPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComprobanteFormaPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComprobanteFormaPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
				this.jInternalFrameDetalleFormComprobanteFormaPago.jCheckBoxPostAccionNuevoComprobanteFormaPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComprobanteFormaPago.jCheckBoxPostAccionSinCerrarComprobanteFormaPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComprobanteFormaPago.jCheckBoxPostAccionSinMensajeComprobanteFormaPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComprobanteFormaPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComprobanteFormaPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComprobanteFormaPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComprobanteFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComprobanteFormaPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComprobanteFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComprobanteFormaPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComprobanteFormaPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComprobanteFormaPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComprobanteFormaPago(Boolean esInicializar) throws Exception {
		try	{	
			if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFormaPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFormaPago() throws Exception {
		try	{
			if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobanteFormaPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobanteFormaPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobanteFormaPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComprobanteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComprobanteFormaPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComprobanteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComprobanteFormaPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComprobanteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComprobanteFormaPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComprobanteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComprobanteFormaPago.addItem(reporte);
			}
			
			
			if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComprobanteFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComprobanteFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComprobanteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComprobanteFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComprobanteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComprobanteFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComprobanteFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComprobanteFormaPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComprobanteFormaPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFormaPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFormaPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComprobanteFormaPagoConstantesFunciones.getTiposSeleccionarComprobanteFormaPago(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComprobanteFormaPagoConstantesFunciones.getTiposSeleccionarComprobanteFormaPago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComprobanteFormaPagoConstantesFunciones.getTiposSeleccionarComprobanteFormaPago(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComprobanteFormaPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.fecha_inicioBusquedaComprobanteFormaPago=new Date(this.jDateChooserfecha_inicioBusquedaComprobanteFormaPagoComprobanteFormaPago.getDate().getTime());
		this.fecha_finBusquedaComprobanteFormaPago=new Date(this.jDateChooserfecha_finBusquedaComprobanteFormaPagoComprobanteFormaPago.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComprobanteFormaPago(Boolean esInicializar) throws Exception {				
		if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComprobanteFormaPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComprobanteFormaPago() throws Exception {
		this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComprobanteFormaPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComprobanteFormaPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComprobanteFormaPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comprobanteformapagoLogic.getComprobanteFormaPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comprobanteformapagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComprobanteFormaPago.setModel(new ComprobanteFormaPagoModel(this.comprobanteformapagoLogic.getComprobanteFormaPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComprobanteFormaPago.setModel(new ComprobanteFormaPagoModel(this.comprobanteformapagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComprobanteFormaPago!=null && this.jInternalFrameOrderByComprobanteFormaPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComprobanteFormaPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO,comprobanteformapagoConstantesFunciones.resaltarSeleccionarComprobanteFormaPago,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComprobanteFormaPagoConstantesFunciones.SCLASSWEBTITULO,comprobanteformapagoConstantesFunciones.resaltarSeleccionarComprobanteFormaPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_ID));

		if(this.comprobanteformapagoConstantesFunciones.mostraridComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltaridComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activaridComprobanteFormaPago,iSizeTabla,this,true,"idComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltaridComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activaridComprobanteFormaPago,this,true,"idComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA));

		if(this.comprobanteformapagoConstantesFunciones.mostrarnombre_cajaComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnombre_cajaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnombre_cajaComprobanteFormaPago,iSizeTabla,this,true,"nombre_cajaComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnombre_cajaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnombre_cajaComprobanteFormaPago,this,true,"nombre_cajaComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL));

		if(this.comprobanteformapagoConstantesFunciones.mostrarsecuencialComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarsecuencialComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarsecuencialComprobanteFormaPago,iSizeTabla,this,true,"secuencialComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarsecuencialComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarsecuencialComprobanteFormaPago,this,true,"secuencialComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA));

		if(this.comprobanteformapagoConstantesFunciones.mostrarfechaComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.comprobanteformapagoConstantesFunciones.resaltarfechaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarfechaComprobanteFormaPago,iSizeTabla,this,true,"fechaComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarfechaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarfechaComprobanteFormaPago,this,true,"fechaComprobanteFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE));

		if(this.comprobanteformapagoConstantesFunciones.mostrarcodigo_clienteComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarcodigo_clienteComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarcodigo_clienteComprobanteFormaPago,iSizeTabla,this,true,"codigo_clienteComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarcodigo_clienteComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarcodigo_clienteComprobanteFormaPago,this,true,"codigo_clienteComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.comprobanteformapagoConstantesFunciones.mostrarnombre_clienteComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnombre_clienteComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnombre_clienteComprobanteFormaPago,iSizeTabla,this,true,"nombre_clienteComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnombre_clienteComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnombre_clienteComprobanteFormaPago,this,true,"nombre_clienteComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL));

		if(this.comprobanteformapagoConstantesFunciones.mostrarsubtotalComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltarsubtotalComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarsubtotalComprobanteFormaPago,iSizeTabla,this,true,"subtotalComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarsubtotalComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarsubtotalComprobanteFormaPago,this,true,"subtotalComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_IVA));

		if(this.comprobanteformapagoConstantesFunciones.mostrarivaComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltarivaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarivaComprobanteFormaPago,iSizeTabla,this,true,"ivaComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarivaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarivaComprobanteFormaPago,this,true,"ivaComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO));

		if(this.comprobanteformapagoConstantesFunciones.mostrardescuentoComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltardescuentoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activardescuentoComprobanteFormaPago,iSizeTabla,this,true,"descuentoComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltardescuentoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activardescuentoComprobanteFormaPago,this,true,"descuentoComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO));

		if(this.comprobanteformapagoConstantesFunciones.mostrarfinanciamientoComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltarfinanciamientoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarfinanciamientoComprobanteFormaPago,iSizeTabla,this,true,"financiamientoComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarfinanciamientoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarfinanciamientoComprobanteFormaPago,this,true,"financiamientoComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE));

		if(this.comprobanteformapagoConstantesFunciones.mostrarfleteComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltarfleteComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarfleteComprobanteFormaPago,iSizeTabla,this,true,"fleteComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarfleteComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarfleteComprobanteFormaPago,this,true,"fleteComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_ICE));

		if(this.comprobanteformapagoConstantesFunciones.mostrariceComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltariceComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activariceComprobanteFormaPago,iSizeTabla,this,true,"iceComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltariceComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activariceComprobanteFormaPago,this,true,"iceComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL));

		if(this.comprobanteformapagoConstantesFunciones.mostrartotalComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltartotalComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activartotalComprobanteFormaPago,iSizeTabla,this,true,"totalComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltartotalComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activartotalComprobanteFormaPago,this,true,"totalComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO));

		if(this.comprobanteformapagoConstantesFunciones.mostrartipoComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltartipoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activartipoComprobanteFormaPago,iSizeTabla,this,true,"tipoComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltartipoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activartipoComprobanteFormaPago,this,true,"tipoComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR));

		if(this.comprobanteformapagoConstantesFunciones.mostrarvalorComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltarvalorComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarvalorComprobanteFormaPago,iSizeTabla,this,true,"valorComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarvalorComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarvalorComprobanteFormaPago,this,true,"valorComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO));

		if(this.comprobanteformapagoConstantesFunciones.mostrarfecha_forma_pagoComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.comprobanteformapagoConstantesFunciones.resaltarfecha_forma_pagoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarfecha_forma_pagoComprobanteFormaPago,iSizeTabla,this,true,"fecha_forma_pagoComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarfecha_forma_pagoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarfecha_forma_pagoComprobanteFormaPago,this,true,"fecha_forma_pagoComprobanteFormaPago","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA));

		if(this.comprobanteformapagoConstantesFunciones.mostrarnumero_cuentaComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnumero_cuentaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnumero_cuentaComprobanteFormaPago,iSizeTabla,this,true,"numero_cuentaComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnumero_cuentaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnumero_cuentaComprobanteFormaPago,this,true,"numero_cuentaComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE));

		if(this.comprobanteformapagoConstantesFunciones.mostrarnumero_chequeComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnumero_chequeComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnumero_chequeComprobanteFormaPago,iSizeTabla,this,true,"numero_chequeComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnumero_chequeComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnumero_chequeComprobanteFormaPago,this,true,"numero_chequeComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR));

		if(this.comprobanteformapagoConstantesFunciones.mostrargiradorComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltargiradorComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activargiradorComprobanteFormaPago,iSizeTabla,this,true,"giradorComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltargiradorComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activargiradorComprobanteFormaPago,this,true,"giradorComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO));

		if(this.comprobanteformapagoConstantesFunciones.mostrarnumero_dias_plazoComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnumero_dias_plazoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnumero_dias_plazoComprobanteFormaPago,iSizeTabla,this,true,"numero_dias_plazoComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnumero_dias_plazoComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnumero_dias_plazoComprobanteFormaPago,this,true,"numero_dias_plazoComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA));

		if(this.comprobanteformapagoConstantesFunciones.mostrarnumero_tarjetaComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnumero_tarjetaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnumero_tarjetaComprobanteFormaPago,iSizeTabla,this,true,"numero_tarjetaComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarnumero_tarjetaComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarnumero_tarjetaComprobanteFormaPago,this,true,"numero_tarjetaComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION));

		if(this.comprobanteformapagoConstantesFunciones.mostrarautorizacionComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarautorizacionComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarautorizacionComprobanteFormaPago,iSizeTabla,this,true,"autorizacionComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarautorizacionComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarautorizacionComprobanteFormaPago,this,true,"autorizacionComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE));

		if(this.comprobanteformapagoConstantesFunciones.mostrarloteComprobanteFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobanteformapagoConstantesFunciones.resaltarloteComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarloteComprobanteFormaPago,iSizeTabla,this,true,"loteComprobanteFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobanteformapagoConstantesFunciones.resaltarloteComprobanteFormaPago,this.comprobanteformapagoConstantesFunciones.activarloteComprobanteFormaPago,this,true,"loteComprobanteFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobanteFormaPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobanteFormaPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComprobanteFormaPago.addColumn(tableColumn);
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
			
			this.jTableDatosComprobanteFormaPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComprobanteFormaPago.moveColumn(this.jTableDatosComprobanteFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComprobanteFormaPago.moveColumn(this.jTableDatosComprobanteFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComprobanteFormaPago.moveColumn(this.jTableDatosComprobanteFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComprobanteFormaPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComprobanteFormaPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComprobanteFormaPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComprobanteFormaPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComprobanteFormaPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComprobanteFormaPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComprobanteFormaPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=comprobanteformapagoLogic.getComprobanteFormaPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comprobanteformapagos.size()-1;
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
		//this.jTableDatosComprobanteFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComprobanteFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComprobanteFormaPago();
			
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
				
				//this.isEsNuevoComprobanteFormaPago=false;
					
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
				if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobanteFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobanteFormaPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comprobanteformapago.getsType().equals("DUPLICADO")
				   || this.comprobanteformapago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComprobanteFormaPago=true;
				
				} else {
					this.isEsNuevoComprobanteFormaPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
					if(this.comprobanteformapago.getId()>=0 && !this.comprobanteformapago.getIsNew()) {						
						this.isEsNuevoComprobanteFormaPago=false;
						
					} else {
						this.isEsNuevoComprobanteFormaPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComprobanteFormaPago(esRelaciones);						
				
				this.seleccionarComprobanteFormaPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comprobanteformapago.getId()<0) {
					this.isEsNuevoComprobanteFormaPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComprobanteFormaPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComprobanteFormaPago(evt,rowIndex);
				}	
				
				if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComprobanteFormaPago: " + this.dDif); 
					}
				}								
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComprobanteFormaPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comprobanteformapago)) {
					if(this.comprobanteformapago.getId()>0) {
						this.comprobanteformapago.setIsDeleted(true);
						
						this.comprobanteformapagosEliminados.add(this.comprobanteformapago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobanteformapagoLogic.getComprobanteFormaPagos().remove(this.comprobanteformapago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobanteformapagos.remove(this.comprobanteformapago);				
					}
					
					
					((ComprobanteFormaPagoModel) this.jTableDatosComprobanteFormaPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFormaPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComprobanteFormaPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComprobanteFormaPago) {
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobanteFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobanteFormaPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComprobanteFormaPago(this.comprobanteformapago);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.comprobanteformapagoConstantesFunciones.cargarid_clienteComprobanteFormaPago || this.comprobanteformapagoConstantesFunciones.event_dependid_clienteComprobanteFormaPago) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.comprobanteformapago.getid_cliente());
									//this.inicializarActualizarBindingComprobanteFormaPago(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(comprobanteformapago.getCliente()!=null) {
							this.clientesForeignKey.add(comprobanteformapago.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.comprobanteformapago.getid_cliente(),false,"Formulario");

					//Caja
					if(!this.comprobanteformapagoConstantesFunciones.cargarid_cajaComprobanteFormaPago || this.comprobanteformapagoConstantesFunciones.event_dependid_cajaComprobanteFormaPago) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.comprobanteformapago.getid_caja());
									//this.inicializarActualizarBindingComprobanteFormaPago(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(comprobanteformapago.getCaja()!=null) {
							this.cajasForeignKey.add(comprobanteformapago.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.comprobanteformapago.getid_caja(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComprobanteFormaPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComprobanteFormaPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFormaPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComprobanteFormaPago(comprobanteformapago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComprobanteFormaPago(comprobanteformapago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComprobanteFormaPago(comprobanteformapago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFormaPago(comprobanteformapago);
	}
	
	public void setVariablesObjetoActualToFormularioComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.setText(comprobanteformapago.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_cajaComprobanteFormaPago.setText(comprobanteformapago.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsecuencialComprobanteFormaPago.setText(comprobanteformapago.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfechaComprobanteFormaPago.setDate(comprobanteformapago.getfecha());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldcodigo_clienteComprobanteFormaPago.setText(comprobanteformapago.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_clienteComprobanteFormaPago.setText(comprobanteformapago.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsubtotalComprobanteFormaPago.setText(comprobanteformapago.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldivaComprobanteFormaPago.setText(comprobanteformapago.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFielddescuentoComprobanteFormaPago.setText(comprobanteformapago.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfinanciamientoComprobanteFormaPago.setText(comprobanteformapago.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfleteComprobanteFormaPago.setText(comprobanteformapago.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldiceComprobanteFormaPago.setText(comprobanteformapago.getice().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtotalComprobanteFormaPago.setText(comprobanteformapago.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtipoComprobanteFormaPago.setText(comprobanteformapago.gettipo());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldvalorComprobanteFormaPago.setText(comprobanteformapago.getvalor().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_forma_pagoComprobanteFormaPago.setDate(comprobanteformapago.getfecha_forma_pago());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_cuentaComprobanteFormaPago.setText(comprobanteformapago.getnumero_cuenta());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_chequeComprobanteFormaPago.setText(comprobanteformapago.getnumero_cheque());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreagiradorComprobanteFormaPago.setText(comprobanteformapago.getgirador());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_dias_plazoComprobanteFormaPago.setText(comprobanteformapago.getnumero_dias_plazo().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_tarjetaComprobanteFormaPago.setText(comprobanteformapago.getnumero_tarjeta());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreaautorizacionComprobanteFormaPago.setText(comprobanteformapago.getautorizacion());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldloteComprobanteFormaPago.setText(comprobanteformapago.getlote());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComprobanteFormaPago comprobanteformapagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comprobanteformapagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComprobanteFormaPago comprobanteformapagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comprobanteformapagoLocal=this.comprobanteformapago;
			} else {
				comprobanteformapagoLocal=this.comprobanteformapagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comprobanteformapagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComprobanteFormaPago(comprobanteformapagoLocal,true);
					
					if(comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comprobanteformapagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comprobanteformapagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobanteFormaPago(comprobanteformapago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(comprobanteformapago);
	}
	
	public void setVariablesFormularioToObjetoActualComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobanteFormaPago(comprobanteformapago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.getText()==null || this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.getText()=="" || this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.getText()=="Id") {
				this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.setText("0");
			}

			if(conColumnasBase) {comprobanteformapago.setId(Long.parseLong(this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelIdComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setnombre_caja(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_cajaComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnombre_cajaComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setsecuencial(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsecuencialComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelsecuencialComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setfecha(this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfechaComprobanteFormaPago.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfechaComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setcodigo_cliente(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldcodigo_clienteComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelcodigo_clienteComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setnombre_cliente(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_clienteComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnombre_clienteComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setsubtotal(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsubtotalComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelsubtotalComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setiva(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldivaComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelivaComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFielddescuentoComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeldescuentoComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setfinanciamiento(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfinanciamientoComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfinanciamientoComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setflete(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfleteComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfleteComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setice(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldiceComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeliceComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.settotal(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtotalComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeltotalComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.settipo(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtipoComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabeltipoComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldvalorComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelvalorComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setfecha_forma_pago(this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_forma_pagoComprobanteFormaPago.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelfecha_forma_pagoComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setnumero_cuenta(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_cuentaComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_cuentaComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setnumero_cheque(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_chequeComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_chequeComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setgirador(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreagiradorComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelgiradorComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setnumero_dias_plazo(Integer.parseInt(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_dias_plazoComprobanteFormaPago.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_dias_plazoComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setnumero_tarjeta(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_tarjetaComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelnumero_tarjetaComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setautorizacion(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreaautorizacionComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelautorizacionComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobanteformapago.setlote(this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldloteComprobanteFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelloteComprobanteFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobanteFormaPago(ComprobanteFormaPago comprobanteformapagoBean,ComprobanteFormaPago comprobanteformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComprobanteFormaPago(ComprobanteFormaPago comprobanteformapagoOrigen,ComprobanteFormaPago comprobanteformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobanteformapagoOrigen.getId()!=null && !comprobanteformapagoOrigen.getId().equals(0L))) {comprobanteformapago.setId(comprobanteformapagoOrigen.getId());}}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getid_cliente()!=null && !comprobanteformapagoOrigen.getid_cliente().equals(-1L))) {comprobanteformapago.setid_cliente(comprobanteformapagoOrigen.getid_cliente());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getid_caja()!=null && !comprobanteformapagoOrigen.getid_caja().equals(-1L))) {comprobanteformapago.setid_caja(comprobanteformapagoOrigen.getid_caja());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getfecha_inicio()!=null && !comprobanteformapagoOrigen.getfecha_inicio().equals(new Date()))) {comprobanteformapago.setfecha_inicio(comprobanteformapagoOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getfecha_fin()!=null && !comprobanteformapagoOrigen.getfecha_fin().equals(new Date()))) {comprobanteformapago.setfecha_fin(comprobanteformapagoOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getnombre_caja()!=null && !comprobanteformapagoOrigen.getnombre_caja().equals(""))) {comprobanteformapago.setnombre_caja(comprobanteformapagoOrigen.getnombre_caja());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getsecuencial()!=null && !comprobanteformapagoOrigen.getsecuencial().equals(""))) {comprobanteformapago.setsecuencial(comprobanteformapagoOrigen.getsecuencial());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getfecha()!=null && !comprobanteformapagoOrigen.getfecha().equals(new Date()))) {comprobanteformapago.setfecha(comprobanteformapagoOrigen.getfecha());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getcodigo_cliente()!=null && !comprobanteformapagoOrigen.getcodigo_cliente().equals(""))) {comprobanteformapago.setcodigo_cliente(comprobanteformapagoOrigen.getcodigo_cliente());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getnombre_cliente()!=null && !comprobanteformapagoOrigen.getnombre_cliente().equals(""))) {comprobanteformapago.setnombre_cliente(comprobanteformapagoOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getsubtotal()!=null && !comprobanteformapagoOrigen.getsubtotal().equals(0.0))) {comprobanteformapago.setsubtotal(comprobanteformapagoOrigen.getsubtotal());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getiva()!=null && !comprobanteformapagoOrigen.getiva().equals(0.0))) {comprobanteformapago.setiva(comprobanteformapagoOrigen.getiva());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getdescuento()!=null && !comprobanteformapagoOrigen.getdescuento().equals(0.0))) {comprobanteformapago.setdescuento(comprobanteformapagoOrigen.getdescuento());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getfinanciamiento()!=null && !comprobanteformapagoOrigen.getfinanciamiento().equals(0.0))) {comprobanteformapago.setfinanciamiento(comprobanteformapagoOrigen.getfinanciamiento());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getflete()!=null && !comprobanteformapagoOrigen.getflete().equals(0.0))) {comprobanteformapago.setflete(comprobanteformapagoOrigen.getflete());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getice()!=null && !comprobanteformapagoOrigen.getice().equals(0.0))) {comprobanteformapago.setice(comprobanteformapagoOrigen.getice());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.gettotal()!=null && !comprobanteformapagoOrigen.gettotal().equals(0.0))) {comprobanteformapago.settotal(comprobanteformapagoOrigen.gettotal());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.gettipo()!=null && !comprobanteformapagoOrigen.gettipo().equals(""))) {comprobanteformapago.settipo(comprobanteformapagoOrigen.gettipo());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getvalor()!=null && !comprobanteformapagoOrigen.getvalor().equals(0.0))) {comprobanteformapago.setvalor(comprobanteformapagoOrigen.getvalor());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getfecha_forma_pago()!=null && !comprobanteformapagoOrigen.getfecha_forma_pago().equals(new Date()))) {comprobanteformapago.setfecha_forma_pago(comprobanteformapagoOrigen.getfecha_forma_pago());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getnumero_cuenta()!=null && !comprobanteformapagoOrigen.getnumero_cuenta().equals(""))) {comprobanteformapago.setnumero_cuenta(comprobanteformapagoOrigen.getnumero_cuenta());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getnumero_cheque()!=null && !comprobanteformapagoOrigen.getnumero_cheque().equals(""))) {comprobanteformapago.setnumero_cheque(comprobanteformapagoOrigen.getnumero_cheque());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getgirador()!=null && !comprobanteformapagoOrigen.getgirador().equals(""))) {comprobanteformapago.setgirador(comprobanteformapagoOrigen.getgirador());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getnumero_dias_plazo()!=null && !comprobanteformapagoOrigen.getnumero_dias_plazo().equals(0))) {comprobanteformapago.setnumero_dias_plazo(comprobanteformapagoOrigen.getnumero_dias_plazo());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getnumero_tarjeta()!=null && !comprobanteformapagoOrigen.getnumero_tarjeta().equals(""))) {comprobanteformapago.setnumero_tarjeta(comprobanteformapagoOrigen.getnumero_tarjeta());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getautorizacion()!=null && !comprobanteformapagoOrigen.getautorizacion().equals(""))) {comprobanteformapago.setautorizacion(comprobanteformapagoOrigen.getautorizacion());}
			if(conDefault || (!conDefault && comprobanteformapagoOrigen.getlote()!=null && !comprobanteformapagoOrigen.getlote().equals(""))) {comprobanteformapago.setlote(comprobanteformapagoOrigen.getlote());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.setText(comprobanteformapago.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_cajaComprobanteFormaPago.setText(comprobanteformapago.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsecuencialComprobanteFormaPago.setText(comprobanteformapago.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfechaComprobanteFormaPago.setDate(comprobanteformapago.getfecha());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldcodigo_clienteComprobanteFormaPago.setText(comprobanteformapago.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_clienteComprobanteFormaPago.setText(comprobanteformapago.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsubtotalComprobanteFormaPago.setText(comprobanteformapago.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldivaComprobanteFormaPago.setText(comprobanteformapago.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFielddescuentoComprobanteFormaPago.setText(comprobanteformapago.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfinanciamientoComprobanteFormaPago.setText(comprobanteformapago.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfleteComprobanteFormaPago.setText(comprobanteformapago.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldiceComprobanteFormaPago.setText(comprobanteformapago.getice().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtotalComprobanteFormaPago.setText(comprobanteformapago.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtipoComprobanteFormaPago.setText(comprobanteformapago.gettipo());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldvalorComprobanteFormaPago.setText(comprobanteformapago.getvalor().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_forma_pagoComprobanteFormaPago.setDate(comprobanteformapago.getfecha_forma_pago());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_cuentaComprobanteFormaPago.setText(comprobanteformapago.getnumero_cuenta());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_chequeComprobanteFormaPago.setText(comprobanteformapago.getnumero_cheque());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreagiradorComprobanteFormaPago.setText(comprobanteformapago.getgirador());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_dias_plazoComprobanteFormaPago.setText(comprobanteformapago.getnumero_dias_plazo().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_tarjetaComprobanteFormaPago.setText(comprobanteformapago.getnumero_tarjeta());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreaautorizacionComprobanteFormaPago.setText(comprobanteformapago.getautorizacion());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldloteComprobanteFormaPago.setText(comprobanteformapago.getlote());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobanteFormaPago(ComprobanteFormaPagoBean comprobanteformapagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.setText(comprobanteformapagoBean.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_cajaComprobanteFormaPago.setText(comprobanteformapagoBean.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsecuencialComprobanteFormaPago.setText(comprobanteformapagoBean.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfechaComprobanteFormaPago.setDate(comprobanteformapagoBean.getfecha());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldcodigo_clienteComprobanteFormaPago.setText(comprobanteformapagoBean.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_clienteComprobanteFormaPago.setText(comprobanteformapagoBean.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsubtotalComprobanteFormaPago.setText(comprobanteformapagoBean.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldivaComprobanteFormaPago.setText(comprobanteformapagoBean.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFielddescuentoComprobanteFormaPago.setText(comprobanteformapagoBean.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfinanciamientoComprobanteFormaPago.setText(comprobanteformapagoBean.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfleteComprobanteFormaPago.setText(comprobanteformapagoBean.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldiceComprobanteFormaPago.setText(comprobanteformapagoBean.getice().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtotalComprobanteFormaPago.setText(comprobanteformapagoBean.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtipoComprobanteFormaPago.setText(comprobanteformapagoBean.gettipo());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldvalorComprobanteFormaPago.setText(comprobanteformapagoBean.getvalor().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_forma_pagoComprobanteFormaPago.setDate(comprobanteformapagoBean.getfecha_forma_pago());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_cuentaComprobanteFormaPago.setText(comprobanteformapagoBean.getnumero_cuenta());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_chequeComprobanteFormaPago.setText(comprobanteformapagoBean.getnumero_cheque());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreagiradorComprobanteFormaPago.setText(comprobanteformapagoBean.getgirador());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_dias_plazoComprobanteFormaPago.setText(comprobanteformapagoBean.getnumero_dias_plazo().toString());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_tarjetaComprobanteFormaPago.setText(comprobanteformapagoBean.getnumero_tarjeta());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreaautorizacionComprobanteFormaPago.setText(comprobanteformapagoBean.getautorizacion());
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldloteComprobanteFormaPago.setText(comprobanteformapagoBean.getlote());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComprobanteFormaPago(ComprobanteFormaPagoParameterReturnGeneral comprobanteformapagoReturnGeneral,ComprobanteFormaPagoBean comprobanteformapagoBean,Boolean conDefault) throws Exception { 
		try {
			ComprobanteFormaPago comprobanteformapagoLocal=new ComprobanteFormaPago();
			
			comprobanteformapagoLocal=comprobanteformapagoReturnGeneral.getComprobanteFormaPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobanteformapagoLocal.getId()!=null && !comprobanteformapagoLocal.getId().equals(0L))) {comprobanteformapagoBean.setId(comprobanteformapagoLocal.getId());}}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getnombre_caja()!=null && !comprobanteformapagoLocal.getnombre_caja().equals(""))) {comprobanteformapagoBean.setnombre_caja(comprobanteformapagoLocal.getnombre_caja());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getsecuencial()!=null && !comprobanteformapagoLocal.getsecuencial().equals(""))) {comprobanteformapagoBean.setsecuencial(comprobanteformapagoLocal.getsecuencial());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getfecha()!=null && !comprobanteformapagoLocal.getfecha().equals(new Date()))) {comprobanteformapagoBean.setfecha(comprobanteformapagoLocal.getfecha());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getcodigo_cliente()!=null && !comprobanteformapagoLocal.getcodigo_cliente().equals(""))) {comprobanteformapagoBean.setcodigo_cliente(comprobanteformapagoLocal.getcodigo_cliente());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getnombre_cliente()!=null && !comprobanteformapagoLocal.getnombre_cliente().equals(""))) {comprobanteformapagoBean.setnombre_cliente(comprobanteformapagoLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getsubtotal()!=null && !comprobanteformapagoLocal.getsubtotal().equals(0.0))) {comprobanteformapagoBean.setsubtotal(comprobanteformapagoLocal.getsubtotal());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getiva()!=null && !comprobanteformapagoLocal.getiva().equals(0.0))) {comprobanteformapagoBean.setiva(comprobanteformapagoLocal.getiva());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getdescuento()!=null && !comprobanteformapagoLocal.getdescuento().equals(0.0))) {comprobanteformapagoBean.setdescuento(comprobanteformapagoLocal.getdescuento());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getfinanciamiento()!=null && !comprobanteformapagoLocal.getfinanciamiento().equals(0.0))) {comprobanteformapagoBean.setfinanciamiento(comprobanteformapagoLocal.getfinanciamiento());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getflete()!=null && !comprobanteformapagoLocal.getflete().equals(0.0))) {comprobanteformapagoBean.setflete(comprobanteformapagoLocal.getflete());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getice()!=null && !comprobanteformapagoLocal.getice().equals(0.0))) {comprobanteformapagoBean.setice(comprobanteformapagoLocal.getice());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.gettotal()!=null && !comprobanteformapagoLocal.gettotal().equals(0.0))) {comprobanteformapagoBean.settotal(comprobanteformapagoLocal.gettotal());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.gettipo()!=null && !comprobanteformapagoLocal.gettipo().equals(""))) {comprobanteformapagoBean.settipo(comprobanteformapagoLocal.gettipo());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getvalor()!=null && !comprobanteformapagoLocal.getvalor().equals(0.0))) {comprobanteformapagoBean.setvalor(comprobanteformapagoLocal.getvalor());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getfecha_forma_pago()!=null && !comprobanteformapagoLocal.getfecha_forma_pago().equals(new Date()))) {comprobanteformapagoBean.setfecha_forma_pago(comprobanteformapagoLocal.getfecha_forma_pago());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getnumero_cuenta()!=null && !comprobanteformapagoLocal.getnumero_cuenta().equals(""))) {comprobanteformapagoBean.setnumero_cuenta(comprobanteformapagoLocal.getnumero_cuenta());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getnumero_cheque()!=null && !comprobanteformapagoLocal.getnumero_cheque().equals(""))) {comprobanteformapagoBean.setnumero_cheque(comprobanteformapagoLocal.getnumero_cheque());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getgirador()!=null && !comprobanteformapagoLocal.getgirador().equals(""))) {comprobanteformapagoBean.setgirador(comprobanteformapagoLocal.getgirador());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getnumero_dias_plazo()!=null && !comprobanteformapagoLocal.getnumero_dias_plazo().equals(0))) {comprobanteformapagoBean.setnumero_dias_plazo(comprobanteformapagoLocal.getnumero_dias_plazo());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getnumero_tarjeta()!=null && !comprobanteformapagoLocal.getnumero_tarjeta().equals(""))) {comprobanteformapagoBean.setnumero_tarjeta(comprobanteformapagoLocal.getnumero_tarjeta());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getautorizacion()!=null && !comprobanteformapagoLocal.getautorizacion().equals(""))) {comprobanteformapagoBean.setautorizacion(comprobanteformapagoLocal.getautorizacion());}
			if(conDefault || (!conDefault && comprobanteformapagoLocal.getlote()!=null && !comprobanteformapagoLocal.getlote().equals(""))) {comprobanteformapagoBean.setlote(comprobanteformapagoLocal.getlote());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComprobanteFormaPagoGenerico(Long idComprobanteFormaPagoSeleccionado,JComboBox jComboBoxComprobanteFormaPago,List<ComprobanteFormaPago> comprobanteformapagosLocal)throws Exception {
		try {
			ComprobanteFormaPago  comprobanteformapagoTemp=null;

			for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagosLocal) {
				if(comprobanteformapagoAux.getId()!=null && comprobanteformapagoAux.getId().equals(idComprobanteFormaPagoSeleccionado)) {
					comprobanteformapagoTemp=comprobanteformapagoAux;
					break;
				}
			}

			jComboBoxComprobanteFormaPago.setSelectedItem(comprobanteformapagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComprobanteFormaPagoGenerico(JComboBox jComboBoxComprobanteFormaPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobanteFormaPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComprobanteFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobanteFormaPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComprobanteFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComprobanteFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComprobanteFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobanteformapago=(ComprobanteFormaPago) comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobanteformapago =(ComprobanteFormaPago) comprobanteformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comprobanteformapago.getIsNew() && !comprobanteformapago.getIsChanged() && !comprobanteformapago.getIsDeleted()) {
				sDescripcion=comprobanteformapago.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comprobanteformapago.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!comprobanteformapago.getIsNew() && !comprobanteformapago.getIsChanged() && !comprobanteformapago.getIsDeleted()) {
				sDescripcion=comprobanteformapago.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=comprobanteformapago.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!comprobanteformapago.getIsNew() && !comprobanteformapago.getIsChanged() && !comprobanteformapago.getIsDeleted()) {
				sDescripcion=comprobanteformapago.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=comprobanteformapago.getcliente_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!comprobanteformapago.getIsNew() && !comprobanteformapago.getIsChanged() && !comprobanteformapago.getIsDeleted()) {
				sDescripcion=comprobanteformapago.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=comprobanteformapago.getcaja_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComprobanteFormaPago comprobanteformapagoRow=new ComprobanteFormaPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobanteformapagoRow=(ComprobanteFormaPago) comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobanteformapagoRow=(ComprobanteFormaPago) comprobanteformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComprobanteFormaPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago));			
			this.jButtonDuplicarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFormaPago && this.isPermisoDuplicarComprobanteFormaPago));			
			this.jButtonCopiarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaCopiarComprobanteFormaPago && this.isPermisoCopiarComprobanteFormaPago));
			this.jButtonVerFormComprobanteFormaPago.setVisible((this.isVisibilidadCeldaVerFormComprobanteFormaPago && this.isPermisoVerFormComprobanteFormaPago));
			
			this.jButtonAbrirOrderByComprobanteFormaPago.setVisible((this.isVisibilidadCeldaOrdenComprobanteFormaPago && this.isPermisoOrdenComprobanteFormaPago));			
			
			this.jButtonNuevoRelacionesComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago));			
			this.jButtonNuevoGuardarCambiosComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaModificarComprobanteFormaPago && this.isPermisoActualizarComprobanteFormaPago));	
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaActualizarComprobanteFormaPago && this.isPermisoActualizarComprobanteFormaPago));	
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaEliminarComprobanteFormaPago && this.isPermisoEliminarComprobanteFormaPago));
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarComprobanteFormaPago.setVisible(this.isVisibilidadCeldaCancelarComprobanteFormaPago);							
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosComprobanteFormaPago.setVisible((this.isVisibilidadCeldaGuardarComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaComprobanteFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago));						
			this.jButtonDuplicarToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFormaPago && this.isPermisoDuplicarComprobanteFormaPago));						
			this.jButtonCopiarToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaCopiarComprobanteFormaPago && this.isPermisoCopiarComprobanteFormaPago));			
			this.jButtonVerFormToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaVerFormComprobanteFormaPago && this.isPermisoVerFormComprobanteFormaPago));			
			this.jButtonAbrirOrderByToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaOrdenComprobanteFormaPago && this.isPermisoOrdenComprobanteFormaPago));
			this.jButtonNuevoRelacionesToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago));			
			this.jButtonNuevoGuardarCambiosToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));			
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaModificarComprobanteFormaPago && this.isPermisoActualizarComprobanteFormaPago));	
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaActualizarComprobanteFormaPago  && this.isPermisoActualizarComprobanteFormaPago));	
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaEliminarComprobanteFormaPago && this.isPermisoEliminarComprobanteFormaPago));
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarToolBarComprobanteFormaPago.setVisible(this.isVisibilidadCeldaCancelarComprobanteFormaPago);				
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaGuardarComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago));			
			this.jMenuItemDuplicarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFormaPago && this.isPermisoDuplicarComprobanteFormaPago));			
			this.jMenuItemCopiarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaCopiarComprobanteFormaPago && this.isPermisoCopiarComprobanteFormaPago));			
			this.jMenuItemVerFormComprobanteFormaPago.setVisible((this.isVisibilidadCeldaVerFormComprobanteFormaPago && this.isPermisoVerFormComprobanteFormaPago));			
			this.jMenuItemAbrirOrderByComprobanteFormaPago.setVisible((this.isVisibilidadCeldaOrdenComprobanteFormaPago && this.isPermisoOrdenComprobanteFormaPago));			
			//this.jMenuItemMostrarOcultarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaOrdenComprobanteFormaPago && this.isPermisoOrdenComprobanteFormaPago));
			this.jMenuItemDetalleAbrirOrderByComprobanteFormaPago.setVisible((this.isVisibilidadCeldaOrdenComprobanteFormaPago && this.isPermisoOrdenComprobanteFormaPago));			
			//this.jMenuItemDetalleMostrarOcultarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaOrdenComprobanteFormaPago && this.isPermisoOrdenComprobanteFormaPago));			
			this.jMenuItemNuevoRelacionesComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago));			
			this.jMenuItemNuevoGuardarCambiosComprobanteFormaPago.setVisible((this.isVisibilidadCeldaNuevoComprobanteFormaPago && this.isPermisoNuevoComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));									
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemModificarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaModificarComprobanteFormaPago && this.isPermisoActualizarComprobanteFormaPago));	
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemActualizarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaActualizarComprobanteFormaPago && this.isPermisoActualizarComprobanteFormaPago));	
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemEliminarComprobanteFormaPago.setVisible((this.isVisibilidadCeldaEliminarComprobanteFormaPago && this.isPermisoEliminarComprobanteFormaPago));
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemCancelarComprobanteFormaPago.setVisible(this.isVisibilidadCeldaCancelarComprobanteFormaPago);				
			}
			
			this.jMenuItemGuardarCambiosComprobanteFormaPago.setVisible((this.isVisibilidadCeldaGuardarComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));						
			this.jMenuItemGuardarCambiosTablaComprobanteFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=this.jButtonNuevoComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaDuplicarComprobanteFormaPago=this.jButtonDuplicarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaCopiarComprobanteFormaPago=this.jButtonCopiarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaVerFormComprobanteFormaPago=this.jButtonVerFormComprobanteFormaPago.isVisible();
			
			this.isVisibilidadCeldaOrdenComprobanteFormaPago=this.jButtonAbrirOrderByComprobanteFormaPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=this.jButtonNuevoRelacionesComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaModificarComprobanteFormaPago=this.jButtonModificarComprobanteFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosComprobanteFormaPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=this.jButtonGuardarCambiosTablaComprobanteFormaPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=this.jButtonNuevoToolBarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=this.jButtonNuevoRelacionesToolBarComprobanteFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			this.isVisibilidadCeldaModificarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarToolBarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarToolBarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarToolBarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarToolBarComprobanteFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobanteFormaPago=this.jButtonGuardarCambiosToolBarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=this.jButtonGuardarCambiosTablaToolBarComprobanteFormaPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=this.jMenuItemNuevoComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=this.jMenuItemNuevoRelacionesComprobanteFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			this.isVisibilidadCeldaModificarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemModificarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemActualizarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemEliminarComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemCancelarComprobanteFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobanteFormaPago=this.jMenuItemGuardarCambiosComprobanteFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=this.jMenuItemGuardarCambiosTablaComprobanteFormaPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComprobanteFormaPago(Boolean esInicializar) {
		if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
				//if(this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComprobanteFormaPago();
			}
			
			this.inicializarActualizarBindingBotonesManualComprobanteFormaPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComprobanteFormaPago() {
		this.jButtonNuevoComprobanteFormaPago.setVisible(this.isPermisoNuevoComprobanteFormaPago);			
		this.jButtonDuplicarComprobanteFormaPago.setVisible(this.isPermisoDuplicarComprobanteFormaPago);			
		this.jButtonCopiarComprobanteFormaPago.setVisible(this.isPermisoCopiarComprobanteFormaPago);			
		this.jButtonVerFormComprobanteFormaPago.setVisible(this.isPermisoVerFormComprobanteFormaPago);			
		
		this.jButtonAbrirOrderByComprobanteFormaPago.setVisible(this.isPermisoOrdenComprobanteFormaPago);					
		
		this.jButtonNuevoRelacionesComprobanteFormaPago.setVisible(this.isPermisoNuevoComprobanteFormaPago);			
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarComprobanteFormaPago.setVisible(this.isPermisoActualizarComprobanteFormaPago);	
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarComprobanteFormaPago.setVisible(this.isPermisoActualizarComprobanteFormaPago);	
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarComprobanteFormaPago.setVisible(this.isPermisoEliminarComprobanteFormaPago);
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarComprobanteFormaPago.setVisible(this.isVisibilidadCeldaCancelarComprobanteFormaPago);						
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosComprobanteFormaPago.setVisible(this.isPermisoGuardarCambiosComprobanteFormaPago);							
		}
		
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.setVisible(this.isPermisoActualizarComprobanteFormaPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobanteFormaPago() {
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarComprobanteFormaPago.setVisible(this.isPermisoActualizarComprobanteFormaPago);	
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarComprobanteFormaPago.setVisible(this.isPermisoActualizarComprobanteFormaPago);	
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarComprobanteFormaPago.setVisible(this.isPermisoEliminarComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarComprobanteFormaPago.setVisible(this.isVisibilidadCeldaCancelarComprobanteFormaPago);							
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosComprobanteFormaPago.setVisible((this.isVisibilidadCeldaGuardarComprobanteFormaPago && this.isPermisoGuardarCambiosComprobanteFormaPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComprobanteFormaPago() {
		if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComprobanteFormaPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComprobanteFormaPago() {
	}
	
	public void jTableDatosComprobanteFormaPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComprobanteFormaPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comprobanteformapago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComprobanteFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComprobanteFormaPago(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comprobanteformapagoLogic.getConnexion());

				if(this.comprobanteformapago.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comprobanteformapago.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFormaPago=(TitledBorder)this.jScrollPanelDatosComprobanteFormaPago.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComprobanteFormaPago.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comprobanteformapago.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalComprobanteFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebComprobanteFormaPago(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.comprobanteformapagoLogic.getConnexion());

				if(this.comprobanteformapago.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.comprobanteformapago.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFormaPago=(TitledBorder)this.jScrollPanelDatosComprobanteFormaPago.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderComprobanteFormaPago.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.comprobanteformapago.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteComprobanteFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebComprobanteFormaPago(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.comprobanteformapagoLogic.getConnexion());

				if(this.comprobanteformapago.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.comprobanteformapago.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFormaPago=(TitledBorder)this.jScrollPanelDatosComprobanteFormaPago.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderComprobanteFormaPago.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.comprobanteformapago.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaComprobanteFormaPagoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebComprobanteFormaPago(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFormaPago.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFormaPago.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.comprobanteformapagoLogic.getConnexion());

				if(this.comprobanteformapago.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.comprobanteformapago.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFormaPago=(TitledBorder)this.jScrollPanelDatosComprobanteFormaPago.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderComprobanteFormaPago.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.comprobanteformapago.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.comprobanteformapago.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.comprobanteformapago.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cajaComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getnombre_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_caja like '%"+this.comprobanteformapago.getnombre_caja()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.comprobanteformapago.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.comprobanteformapago.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_clienteComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getcodigo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cliente like '%"+this.comprobanteformapago.getcodigo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.comprobanteformapago.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsubtotalComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getsubtotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where subtotal = "+this.comprobanteformapago.getsubtotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.comprobanteformapago.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.comprobanteformapago.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfinanciamientoComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getfinanciamiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where financiamiento = "+this.comprobanteformapago.getfinanciamiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.comprobanteformapago.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.comprobanteformapago.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.comprobanteformapago.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontipoComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.gettipo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where tipo like '%"+this.comprobanteformapago.gettipo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.comprobanteformapago.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_forma_pagoComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getfecha_forma_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_forma_pago = '"+Funciones2.getStringPostgresDate(this.comprobanteformapago.getfecha_forma_pago())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_cuentaComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getnumero_cuenta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cuenta like '%"+this.comprobanteformapago.getnumero_cuenta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chequeComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getnumero_cheque()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_cheque like '%"+this.comprobanteformapago.getnumero_cheque()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtongiradorComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getgirador()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where girador like '%"+this.comprobanteformapago.getgirador()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_dias_plazoComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getnumero_dias_plazo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias_plazo = "+this.comprobanteformapago.getnumero_dias_plazo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_tarjetaComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getnumero_tarjeta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_tarjeta like '%"+this.comprobanteformapago.getnumero_tarjeta()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonautorizacionComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getautorizacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where autorizacion like '%"+this.comprobanteformapago.getautorizacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonloteComprobanteFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.getcomprobanteformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobanteformapago==null) {
						this.comprobanteformapago = new ComprobanteFormaPago();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);
				}

				if(this.comprobanteformapago.getlote()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where lote like '%"+this.comprobanteformapago.getlote()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaComprobanteFormaPagoComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);

			this.getComprobanteFormaPagosBusquedaComprobanteFormaPago();

			this.inicializarActualizarBindingComprobanteFormaPago(false);

			//if(ComprobanteFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCajaComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);

			this.getComprobanteFormaPagosFK_IdCaja();

			this.inicializarActualizarBindingComprobanteFormaPago(false);

			//if(ComprobanteFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);

			this.getComprobanteFormaPagosFK_IdCliente();

			this.inicializarActualizarBindingComprobanteFormaPago(false);

			//if(ComprobanteFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);

			this.getComprobanteFormaPagosFK_IdEmpresa();

			this.inicializarActualizarBindingComprobanteFormaPago(false);

			//if(ComprobanteFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalComprobanteFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);

			this.getComprobanteFormaPagosFK_IdSucursal();

			this.inicializarActualizarBindingComprobanteFormaPago(false);

			//if(ComprobanteFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobanteformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComprobanteFormaPago() {
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormComprobanteFormaPago.dispose();
			this.jInternalFrameDetalleFormComprobanteFormaPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
			this.jInternalFrameReporteDinamicoComprobanteFormaPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComprobanteFormaPago.dispose();
			this.jInternalFrameReporteDinamicoComprobanteFormaPago=null;
		}
		
		if(this.jInternalFrameImportacionComprobanteFormaPago!=null) {
			this.jInternalFrameImportacionComprobanteFormaPago.setVisible(false);	    			
			this.jInternalFrameImportacionComprobanteFormaPago.dispose();
			this.jInternalFrameImportacionComprobanteFormaPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComprobanteFormaPago();
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoComprobanteFormaPago")) {
				jButtonNuevoComprobanteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComprobanteFormaPago")) {
				jButtonDuplicarComprobanteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComprobanteFormaPago")) {
				jButtonCopiarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormComprobanteFormaPago")) {
				jButtonVerFormComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComprobanteFormaPago")) {
				jButtonNuevoComprobanteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComprobanteFormaPago")) {
				jButtonDuplicarComprobanteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComprobanteFormaPago")) {
				jButtonNuevoComprobanteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComprobanteFormaPago")) {
				jButtonDuplicarComprobanteFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComprobanteFormaPago")) {
				jButtonNuevoComprobanteFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComprobanteFormaPago")) {
				jButtonNuevoComprobanteFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComprobanteFormaPago")) {
				jButtonNuevoComprobanteFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComprobanteFormaPago")) {
				jButtonModificarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComprobanteFormaPago")) {
				jButtonModificarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComprobanteFormaPago")) {
				jButtonModificarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComprobanteFormaPago")) {
				jButtonActualizarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComprobanteFormaPago")) {
				jButtonActualizarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComprobanteFormaPago")) {
				jButtonActualizarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarComprobanteFormaPago")) {
				jButtonEliminarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComprobanteFormaPago")) {
				jButtonEliminarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComprobanteFormaPago")) {
				jButtonEliminarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarComprobanteFormaPago")) {
				jButtonCancelarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComprobanteFormaPago")) {
				jButtonCancelarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComprobanteFormaPago")) {
				jButtonCancelarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarComprobanteFormaPago")) {
				jButtonCerrarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComprobanteFormaPago")) {
				jButtonCerrarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComprobanteFormaPago")) {
				jButtonCerrarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComprobanteFormaPago")) {
				jButtonMostrarOcultarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComprobanteFormaPago")) {
				jButtonCancelarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComprobanteFormaPago")) {
				jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComprobanteFormaPago")) {
				jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComprobanteFormaPago")) {
				jButtonCopiarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComprobanteFormaPago")) {
				jButtonVerFormComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComprobanteFormaPago")) {
				jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComprobanteFormaPago")) {
				jButtonCopiarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComprobanteFormaPago")) {
				jButtonVerFormComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComprobanteFormaPago")) {
				jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComprobanteFormaPago")) {
				jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComprobanteFormaPago")) {
				jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComprobanteFormaPago")) {
				jButtonRecargarInformacionComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComprobanteFormaPago")) {
				jButtonRecargarInformacionComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComprobanteFormaPago")) {
				jButtonRecargarInformacionComprobanteFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComprobanteFormaPago")) {
				jButtonAnterioresComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComprobanteFormaPago")) {
				jButtonAnterioresComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComprobanteFormaPago")) {
				jButtonAnterioresComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComprobanteFormaPago")) {
				jButtonSiguientesComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComprobanteFormaPago")) {
				jButtonSiguientesComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComprobanteFormaPago")) {
				jButtonSiguientesComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComprobanteFormaPago") || sTipo.equals("MenuItemDetalleAbrirOrderByComprobanteFormaPago")) {
				jButtonAbrirOrderByComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComprobanteFormaPago") || sTipo.equals("MenuItemDetalleMostrarOcultarComprobanteFormaPago")) {
				jButtonMostrarOcultarComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComprobanteFormaPago")) {
				jButtonNuevoGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComprobanteFormaPago")) {
				jButtonNuevoGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComprobanteFormaPago")) {
				jButtonNuevoGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComprobanteFormaPago")) {
				jButtonCerrarReporteDinamicoComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComprobanteFormaPago")) {
				jButtonGenerarReporteDinamicoComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComprobanteFormaPago")) {
				
				jButtonGenerarExcelReporteDinamicoComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComprobanteFormaPago")) {
				jButtonCerrarImportacionComprobanteFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComprobanteFormaPago")) {
				
				jButtonGenerarImportacionComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComprobanteFormaPago")) {
				
				jButtonAbrirImportacionComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComprobanteFormaPago")) {
				jComboBoxTiposAccionesComprobanteFormaPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComprobanteFormaPago")) {
				jComboBoxTiposRelacionesComprobanteFormaPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComprobanteFormaPago")) {
				jComboBoxTiposAccionesComprobanteFormaPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComprobanteFormaPago")) {
				
				jComboBoxTiposSeleccionarComprobanteFormaPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComprobanteFormaPago")) {
				jTextFieldValorCampoGeneralComprobanteFormaPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComprobanteFormaPago")) {
				jButtonAbrirOrderByComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComprobanteFormaPago")) {
				jButtonAbrirOrderByComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComprobanteFormaPago")) {
				jButtonCerrarOrderByComprobanteFormaPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobanteFormaPagoBusqueda")) {
				this.jButtonidComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobanteFormaPagoUpdate")) {
				this.jButtonid_empresaComprobanteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobanteFormaPagoBusqueda")) {
				this.jButtonid_empresaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalComprobanteFormaPagoUpdate")) {
				this.jButtonid_sucursalComprobanteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalComprobanteFormaPagoBusqueda")) {
				this.jButtonid_sucursalComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteComprobanteFormaPagoUpdate")) {
				this.jButtonid_clienteComprobanteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteComprobanteFormaPagoBusqueda")) {
				this.jButtonid_clienteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaComprobanteFormaPagoUpdate")) {
				this.jButtonid_cajaComprobanteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaComprobanteFormaPagoBusqueda")) {
				this.jButtonid_cajaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioComprobanteFormaPagoBusqueda")) {
				this.jButtonfecha_inicioComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finComprobanteFormaPagoBusqueda")) {
				this.jButtonfecha_finComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaComprobanteFormaPagoBusqueda")) {
				this.jButtonnombre_cajaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialComprobanteFormaPagoBusqueda")) {
				this.jButtonsecuencialComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaComprobanteFormaPagoBusqueda")) {
				this.jButtonfechaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteComprobanteFormaPagoBusqueda")) {
				this.jButtoncodigo_clienteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComprobanteFormaPagoBusqueda")) {
				this.jButtonnombre_clienteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalComprobanteFormaPagoBusqueda")) {
				this.jButtonsubtotalComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaComprobanteFormaPagoBusqueda")) {
				this.jButtonivaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoComprobanteFormaPagoBusqueda")) {
				this.jButtondescuentoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoComprobanteFormaPagoBusqueda")) {
				this.jButtonfinanciamientoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteComprobanteFormaPagoBusqueda")) {
				this.jButtonfleteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceComprobanteFormaPagoBusqueda")) {
				this.jButtoniceComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalComprobanteFormaPagoBusqueda")) {
				this.jButtontotalComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoComprobanteFormaPagoBusqueda")) {
				this.jButtontipoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorComprobanteFormaPagoBusqueda")) {
				this.jButtonvalorComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_forma_pagoComprobanteFormaPagoBusqueda")) {
				this.jButtonfecha_forma_pagoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaComprobanteFormaPagoBusqueda")) {
				this.jButtonnumero_cuentaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeComprobanteFormaPagoBusqueda")) {
				this.jButtonnumero_chequeComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("giradorComprobanteFormaPagoBusqueda")) {
				this.jButtongiradorComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_dias_plazoComprobanteFormaPagoBusqueda")) {
				this.jButtonnumero_dias_plazoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_tarjetaComprobanteFormaPagoBusqueda")) {
				this.jButtonnumero_tarjetaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autorizacionComprobanteFormaPagoBusqueda")) {
				this.jButtonautorizacionComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("loteComprobanteFormaPagoBusqueda")) {
				this.jButtonloteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaComprobanteFormaPagoComprobanteFormaPago")) {
				this.jButtonBusquedaComprobanteFormaPagoComprobanteFormaPagoActionPerformed(evt);
			}
			
			;
			
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComprobanteFormaPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				


				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComprobanteFormaPago comprobanteformapagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				comprobanteformapagoLocal=this.comprobanteformapago;
			} else {
				comprobanteformapagoLocal=this.comprobanteformapagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
							
				
				


				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
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
			
			


			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
								
						
				


				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
								
				
				


				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
							
				
				


				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
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
			
			


			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
								
				
				


				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComprobanteFormaPago")) {
					jCheckBoxSeleccionarTodosComprobanteFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComprobanteFormaPago")) {
					jCheckBoxSeleccionadosComprobanteFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComprobanteFormaPago")) {
					
				}
				
				


				
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
												
				
				


				
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFormaPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
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
			
			


			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobanteformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobanteformapago);
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
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
				
				


				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFormaPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobanteformapagoAnterior =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComprobanteFormaPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComprobanteFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComprobanteFormaPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comprobanteformapago =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comprobanteformapago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComprobanteFormaPago")) {
				
				}
				
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComprobanteFormaPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComprobanteFormaPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComprobanteFormaPago")) {
			
			}
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComprobanteFormaPago();
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
			if(sTipo.equals("NuevoComprobanteFormaPago")) {
				jButtonNuevoComprobanteFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComprobanteFormaPago")) {
				jButtonDuplicarComprobanteFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComprobanteFormaPago")) {
				jButtonCopiarComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComprobanteFormaPago")) {
				jButtonVerFormComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComprobanteFormaPago")) {
				jButtonNuevoComprobanteFormaPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComprobanteFormaPago")) {
				jButtonModificarComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComprobanteFormaPago")) {
				jButtonActualizarComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComprobanteFormaPago")) {
				jButtonEliminarComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComprobanteFormaPago")) {
				jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComprobanteFormaPago")) {
				jButtonCancelarComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComprobanteFormaPago")) {
				jButtonCerrarComprobanteFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComprobanteFormaPago")) {
				jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComprobanteFormaPago")) {
				jButtonNuevoGuardarCambiosComprobanteFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComprobanteFormaPago")) {
				jButtonAbrirOrderByComprobanteFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComprobanteFormaPago")) {
				jButtonRecargarInformacionComprobanteFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComprobanteFormaPago")) {
				jButtonAnterioresComprobanteFormaPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComprobanteFormaPago")) {
				jButtonSiguientesComprobanteFormaPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobanteFormaPagoBusqueda")) {
				this.jButtonidComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobanteFormaPagoUpdate")) {
				this.jButtonid_empresaComprobanteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobanteFormaPagoBusqueda")) {
				this.jButtonid_empresaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalComprobanteFormaPagoUpdate")) {
				this.jButtonid_sucursalComprobanteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalComprobanteFormaPagoBusqueda")) {
				this.jButtonid_sucursalComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteComprobanteFormaPagoUpdate")) {
				this.jButtonid_clienteComprobanteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteComprobanteFormaPagoBusqueda")) {
				this.jButtonid_clienteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaComprobanteFormaPagoUpdate")) {
				this.jButtonid_cajaComprobanteFormaPagoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaComprobanteFormaPagoBusqueda")) {
				this.jButtonid_cajaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioComprobanteFormaPagoBusqueda")) {
				this.jButtonfecha_inicioComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finComprobanteFormaPagoBusqueda")) {
				this.jButtonfecha_finComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaComprobanteFormaPagoBusqueda")) {
				this.jButtonnombre_cajaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialComprobanteFormaPagoBusqueda")) {
				this.jButtonsecuencialComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaComprobanteFormaPagoBusqueda")) {
				this.jButtonfechaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteComprobanteFormaPagoBusqueda")) {
				this.jButtoncodigo_clienteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComprobanteFormaPagoBusqueda")) {
				this.jButtonnombre_clienteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalComprobanteFormaPagoBusqueda")) {
				this.jButtonsubtotalComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaComprobanteFormaPagoBusqueda")) {
				this.jButtonivaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoComprobanteFormaPagoBusqueda")) {
				this.jButtondescuentoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoComprobanteFormaPagoBusqueda")) {
				this.jButtonfinanciamientoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteComprobanteFormaPagoBusqueda")) {
				this.jButtonfleteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceComprobanteFormaPagoBusqueda")) {
				this.jButtoniceComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalComprobanteFormaPagoBusqueda")) {
				this.jButtontotalComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("tipoComprobanteFormaPagoBusqueda")) {
				this.jButtontipoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorComprobanteFormaPagoBusqueda")) {
				this.jButtonvalorComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_forma_pagoComprobanteFormaPagoBusqueda")) {
				this.jButtonfecha_forma_pagoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_cuentaComprobanteFormaPagoBusqueda")) {
				this.jButtonnumero_cuentaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chequeComprobanteFormaPagoBusqueda")) {
				this.jButtonnumero_chequeComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("giradorComprobanteFormaPagoBusqueda")) {
				this.jButtongiradorComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_dias_plazoComprobanteFormaPagoBusqueda")) {
				this.jButtonnumero_dias_plazoComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_tarjetaComprobanteFormaPagoBusqueda")) {
				this.jButtonnumero_tarjetaComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("autorizacionComprobanteFormaPagoBusqueda")) {
				this.jButtonautorizacionComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("loteComprobanteFormaPagoBusqueda")) {
				this.jButtonloteComprobanteFormaPagoBusquedaActionPerformed(evt);
			}
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComprobanteFormaPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComprobanteFormaPago")) {
				closingInternalFrameComprobanteFormaPago();
				
			} else if(sTipo.equals("jButtonCancelarComprobanteFormaPago")) {
				JInternalFrameBase jInternalFrameDetalleFormComprobanteFormaPago = (JInternalFrameBase)evt.getSource();
	            	
	            ComprobanteFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(ComprobanteFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobanteFormaPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComprobanteFormaPagoActionPerformed(null);
			}
			
			ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobanteformapago,new Object(),this.comprobanteformapagoParameterGeneral,this.comprobanteformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComprobanteFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComprobanteFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComprobanteFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comprobanteformapago)) {
			if(!esControlTabla) {
				if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);			
				}
				
				if(this.comprobanteformapagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComprobanteFormaPago(this.comprobanteformapago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComprobanteFormaPago(this.comprobanteformapagoReturnGeneral,this.comprobanteformapagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comprobanteformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComprobanteFormaPago(classes,this.comprobanteformapagoReturnGeneral,this.comprobanteformapagoBean,false);
					}
						
					if(this.comprobanteformapagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFormaPago(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComprobanteFormaPago(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPago());	
					}
						
					if(this.comprobanteformapagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComprobanteFormaPago(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPago(),classes);//this.comprobanteformapagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComprobanteFormaPago(this.comprobanteformapago,classes);//this.comprobanteformapagoBean);									
				}
			
				if(ComprobanteFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComprobanteFormaPago(this.comprobanteformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFormaPago(this.comprobanteformapago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comprobanteformapagoAnterior!=null) {
						this.comprobanteformapago=this.comprobanteformapagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comprobanteformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comprobanteformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPago(),comprobanteformapagoLogic.getComprobanteFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPago(),this.comprobanteformapagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComprobanteFormaPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosComprobanteFormaPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComprobanteFormaPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosComprobanteFormaPago() throws Exception {
		
		ComprobanteFormaPagoModel comprobanteformapagoModel=(ComprobanteFormaPagoModel)this.jTableDatosComprobanteFormaPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobanteformapagoModel.comprobanteformapagos=this.comprobanteformapagoLogic.getComprobanteFormaPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comprobanteformapagoModel.comprobanteformapagos=this.comprobanteformapagos;
		}
		
		
		((ComprobanteFormaPagoModel) this.jTableDatosComprobanteFormaPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComprobanteFormaPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomprobanteformapagoAnterior(),this.comprobanteformapagoLogic.getComprobanteFormaPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomprobanteformapagoAnterior(),this.comprobanteformapagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComprobanteFormaPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
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
										
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobanteformapago,new Object(),generalEntityParameterGeneral,this.comprobanteformapagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComprobanteFormaPagoConstantesFunciones.getClassesRelationshipsOfComprobanteFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComprobanteFormaPagoConstantesFunciones.getClassesRelationshipsFromStringsOfComprobanteFormaPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComprobanteFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobanteformapago,new Object(),generalEntityParameterGeneral,this.comprobanteformapagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComprobanteFormaPago(ComprobanteFormaPagoBean comprobanteformapagoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComprobanteFormaPago(ArrayList<Classe> classes,ComprobanteFormaPagoReturnGeneral comprobanteformapagoReturnGeneral,ComprobanteFormaPagoBean comprobanteformapagoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comprobanteformapago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComprobanteFormaPago = new ComprobanteFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.comprobanteformapagoSessionBean.getConGuardarRelaciones(),this.comprobanteformapagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.setVisible(false);
		this.jInternalFrameDetalleFormComprobanteFormaPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.comprobanteformapagoLogic=this.comprobanteformapagoLogic;
		
		this.cargarCombosFrameForeignKeyComprobanteFormaPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobanteFormaPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobanteFormaPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComprobanteFormaPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComprobanteFormaPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobanteFormaPago"));
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"ModificarComprobanteFormaPago"));

		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarToolBarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobanteFormaPago"));
					
		this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemModificarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobanteFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarComprobanteFormaPago"));
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarToolBarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobanteFormaPago"));
						
		this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemActualizarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobanteFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"EliminarComprobanteFormaPago"));
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobanteFormaPago"));
								
		this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemEliminarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobanteFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"CancelarComprobanteFormaPago"));
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobanteFormaPago"));
					
		this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemCancelarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobanteFormaPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemDetalleCerrarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobanteFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobanteFormaPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonidComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_empresaComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_empresaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_sucursalComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_sucursalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_clienteComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_cajaComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_cajaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_inicioComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_finComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnombre_cajaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonsecuencialComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfechaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnombre_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonsubtotalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonivaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtondescuentoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfinanciamientoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfleteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtoniceComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtontotalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtontipoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"tipoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonvalorComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valorComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_forma_pagoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_chequeComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtongiradorComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"giradorComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_dias_plazoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_tarjetaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonautorizacionComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonloteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"loteComprobanteFormaPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobanteFormaPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComprobanteFormaPago"));
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobanteFormaPago"));
		}
		
		this.jTableDatosComprobanteFormaPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComprobanteFormaPago"));
		
		this.jTableDatosComprobanteFormaPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComprobanteFormaPago"));
		
		this.jButtonNuevoComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"NuevoComprobanteFormaPago"));
		
		this.jButtonDuplicarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarComprobanteFormaPago"));
		
		this.jButtonCopiarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"CopiarComprobanteFormaPago"));
		
		this.jButtonVerFormComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"VerFormComprobanteFormaPago"));
		
		
		this.jButtonNuevoToolBarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarComprobanteFormaPago"));
			
		this.jButtonDuplicarToolBarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComprobanteFormaPago"));
			
		this.jMenuItemNuevoComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComprobanteFormaPago"));
			
		this.jMenuItemDuplicarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComprobanteFormaPago"));		
		
		
		this.jButtonNuevoRelacionesComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComprobanteFormaPago"));
		
		
		this.jButtonNuevoRelacionesToolBarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComprobanteFormaPago"));
			
		this.jMenuItemNuevoRelacionesComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComprobanteFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"ModificarComprobanteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonModificarToolBarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobanteFormaPago"));
			
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemModificarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobanteFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarComprobanteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonActualizarToolBarComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobanteFormaPago"));
				
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemActualizarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobanteFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"EliminarComprobanteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonEliminarToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobanteFormaPago"));
						
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemEliminarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobanteFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"CancelarComprobanteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonCancelarToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobanteFormaPago"));
			
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemCancelarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobanteFormaPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComprobanteFormaPago"));		
		
		
		this.jButtonCerrarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"CerrarComprobanteFormaPago"));
		
		
		this.jButtonCerrarToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarComprobanteFormaPago"));
			
		this.jMenuItemCerrarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComprobanteFormaPago"));
			
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jMenuItemDetalleCerrarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobanteFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosComprobanteFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFormaPago"));
		}
		
		this.jButtonCopiarToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarComprobanteFormaPago"));
			
		this.jButtonVerFormToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarComprobanteFormaPago"));
		
		this.jMenuItemGuardarCambiosComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComprobanteFormaPago"));
			
		this.jMenuItemCopiarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComprobanteFormaPago"));		
		
		this.jMenuItemVerFormComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComprobanteFormaPago"));		
		
		
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobanteFormaPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComprobanteFormaPago"));
			
		this.jMenuItemGuardarCambiosTablaComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobanteFormaPago"));		
		
		
		
		this.jButtonRecargarInformacionComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionComprobanteFormaPago"));
					
		this.jButtonRecargarInformacionToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComprobanteFormaPago"));
		
		this.jMenuItemRecargarInformacionComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComprobanteFormaPago"));		
		
		
		
		this.jButtonAnterioresComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresComprobanteFormaPago"));
		
		
		this.jButtonAnterioresToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComprobanteFormaPago"));
		
		this.jMenuItemAnterioresComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComprobanteFormaPago"));		
		
		
		this.jButtonSiguientesComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesComprobanteFormaPago"));
		
		
		this.jButtonSiguientesToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComprobanteFormaPago"));
			
		this.jMenuItemSiguientesComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComprobanteFormaPago"));
			
		this.jMenuItemAbrirOrderByComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComprobanteFormaPago"));
			
		this.jMenuItemMostrarOcultarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComprobanteFormaPago"));
			
		this.jMenuItemDetalleAbrirOrderByComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComprobanteFormaPago"));
			
		this.jMenuItemDetalleMostarOcultarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComprobanteFormaPago"));		
		
		
		this.jButtonNuevoGuardarCambiosComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComprobanteFormaPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComprobanteFormaPago"));
			
		this.jMenuItemNuevoGuardarCambiosComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComprobanteFormaPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComprobanteFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComprobanteFormaPago"));

		this.jCheckBoxSeleccionadosComprobanteFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComprobanteFormaPago"));
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobanteFormaPago"));
		}
		
		
		this.jComboBoxTiposRelacionesComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesComprobanteFormaPago"));
			
		this.jComboBoxTiposAccionesComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesComprobanteFormaPago"));
					
		this.jComboBoxTiposSeleccionarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComprobanteFormaPago"));
			
		this.jTextFieldValorCampoGeneralComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComprobanteFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonidComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_empresaComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_empresaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_sucursalComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_sucursalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_clienteComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_cajaComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_cajaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_inicioComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_finComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnombre_cajaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonsecuencialComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfechaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnombre_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonsubtotalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonivaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtondescuentoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfinanciamientoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfleteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtoniceComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtontotalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtontipoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"tipoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonvalorComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valorComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_forma_pagoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_chequeComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtongiradorComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"giradorComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_dias_plazoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_tarjetaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonautorizacionComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonloteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"loteComprobanteFormaPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaComprobanteFormaPagoComprobanteFormaPago"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComprobanteFormaPago!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFormaPago"));
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFormaPago"));
				this.jInternalFrameReporteDinamicoComprobanteFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFormaPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFormaPago"));				
			//this.jButtonGenerarReporteDinamicoComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFormaPago"));
			//this.jButtonGenerarExcelReporteDinamicoComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFormaPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComprobanteFormaPago!=null) {
				this.jInternalFrameImportacionComprobanteFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobanteFormaPago"));
				this.jInternalFrameImportacionComprobanteFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobanteFormaPago"));
				this.jInternalFrameImportacionComprobanteFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobanteFormaPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByComprobanteFormaPago"));
			
			this.jButtonAbrirOrderByToolBarComprobanteFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComprobanteFormaPago"));			
			
			if(this.jInternalFrameOrderByComprobanteFormaPago!=null) {
				this.jInternalFrameOrderByComprobanteFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobanteFormaPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFormaPago.jTabbedPaneRelacionesComprobanteFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobanteFormaPago"));
		
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
            		closingInternalFrameComprobanteFormaPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComprobanteFormaPago = (JInternalFrameBase)event.getSource();
	            	
	            ComprobanteFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(ComprobanteFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobanteFormaPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComprobanteFormaPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComprobanteFormaPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComprobanteFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComprobanteFormaPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComprobanteFormaPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComprobanteFormaPago";
		inputMap = this.jButtonNuevoComprobanteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComprobanteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobanteFormaPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComprobanteFormaPago";
		inputMap = this.jButtonNuevoRelacionesComprobanteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComprobanteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobanteFormaPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComprobanteFormaPago";
		inputMap = this.jButtonModificarComprobanteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComprobanteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComprobanteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComprobanteFormaPago";
		inputMap = this.jButtonActualizarComprobanteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComprobanteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComprobanteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComprobanteFormaPago";
		inputMap = this.jButtonEliminarComprobanteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComprobanteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComprobanteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComprobanteFormaPago";
		inputMap = this.jButtonCancelarComprobanteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComprobanteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComprobanteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComprobanteFormaPago";
		inputMap = this.jButtonCerrarComprobanteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComprobanteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComprobanteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComprobanteFormaPago";
		inputMap = this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosComprobanteFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonGuardarCambiosComprobanteFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComprobanteFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComprobanteFormaPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComprobanteFormaPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComprobanteFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComprobanteFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComprobanteFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComprobanteFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComprobanteFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComprobanteFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonidComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_empresaComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_empresaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_sucursalComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_sucursalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_clienteComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFormaPagoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_cajaComprobanteFormaPagoUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFormaPagoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonid_cajaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_inicioComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_finComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnombre_cajaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonsecuencialComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfechaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtoncodigo_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnombre_clienteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonsubtotalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonivaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtondescuentoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfinanciamientoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfleteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtoniceComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtontotalComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtontipoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"tipoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonvalorComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"valorComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonfecha_forma_pagoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_forma_pagoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_cuentaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_cuentaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_chequeComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chequeComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtongiradorComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"giradorComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_dias_plazoComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_dias_plazoComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonnumero_tarjetaComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"numero_tarjetaComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonautorizacionComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"autorizacionComprobanteFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFormaPago.jButtonloteComprobanteFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"loteComprobanteFormaPagoBusqueda"));
		
		
		this.jButtonBusquedaComprobanteFormaPagoComprobanteFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaComprobanteFormaPagoComprobanteFormaPago"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComprobanteFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComprobanteFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComprobanteFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComprobanteFormaPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComprobanteFormaPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
					comprobanteformapagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagos) {
					comprobanteformapagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComprobanteFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
						comprobanteformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagos) {
						comprobanteformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobanteFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobanteFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComprobanteFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComprobanteFormaPago.getSelectedRows();
			
			ComprobanteFormaPago comprobanteformapagoLocal=new ComprobanteFormaPago();
			
			//this.seleccionarTodosComprobanteFormaPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comprobanteformapagoLocal =(ComprobanteFormaPago) this.comprobanteformapagoLogic.getComprobanteFormaPagos().toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comprobanteformapagoLocal =(ComprobanteFormaPago) this.comprobanteformapagos.toArray()[this.jTableDatosComprobanteFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comprobanteformapagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
						comprobanteformapagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagos) {
						comprobanteformapagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobanteFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobanteFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComprobanteFormaPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComprobanteFormaPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComprobanteFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComprobanteFormaPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagoLogic.getComprobanteFormaPagos()) {
				
						if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							comprobanteformapagoAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							comprobanteformapagoAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							comprobanteformapagoAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							comprobanteformapagoAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							comprobanteformapagoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							comprobanteformapagoAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comprobanteformapagoAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							comprobanteformapagoAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_IVA)) {
							existe=true;
							comprobanteformapagoAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							comprobanteformapagoAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							comprobanteformapagoAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							comprobanteformapagoAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_ICE)) {
							existe=true;
							comprobanteformapagoAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							comprobanteformapagoAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							comprobanteformapagoAux.settipo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							comprobanteformapagoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO)) {
							existe=true;
							comprobanteformapagoAux.setfecha_forma_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							comprobanteformapagoAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							comprobanteformapagoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR)) {
							existe=true;
							comprobanteformapagoAux.setgirador(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO)) {
							existe=true;
							comprobanteformapagoAux.setnumero_dias_plazo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA)) {
							existe=true;
							comprobanteformapagoAux.setnumero_tarjeta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION)) {
							existe=true;
							comprobanteformapagoAux.setautorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							comprobanteformapagoAux.setlote(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagos) {
					
						if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							comprobanteformapagoAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							comprobanteformapagoAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							comprobanteformapagoAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							comprobanteformapagoAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							comprobanteformapagoAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							comprobanteformapagoAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comprobanteformapagoAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							comprobanteformapagoAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_IVA)) {
							existe=true;
							comprobanteformapagoAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							comprobanteformapagoAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							comprobanteformapagoAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							comprobanteformapagoAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_ICE)) {
							existe=true;
							comprobanteformapagoAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							comprobanteformapagoAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO)) {
							existe=true;
							comprobanteformapagoAux.settipo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							comprobanteformapagoAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO)) {
							existe=true;
							comprobanteformapagoAux.setfecha_forma_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA)) {
							existe=true;
							comprobanteformapagoAux.setnumero_cuenta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
							existe=true;
							comprobanteformapagoAux.setnumero_cheque(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR)) {
							existe=true;
							comprobanteformapagoAux.setgirador(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO)) {
							existe=true;
							comprobanteformapagoAux.setnumero_dias_plazo(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA)) {
							existe=true;
							comprobanteformapagoAux.setnumero_tarjeta(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION)) {
							existe=true;
							comprobanteformapagoAux.setautorizacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							comprobanteformapagoAux.setlote(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComprobanteFormaPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComprobanteFormaPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComprobanteFormaPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComprobanteFormaPago) {				
					conSplash=true;//false;										
					
					//this.startProcessComprobanteFormaPago(conSplash);
				
					this.generarReporteComprobanteFormaPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComprobanteFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobanteFormaPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobanteFormaPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobanteFormaPago();
				
				this.exportarComprobanteFormaPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComprobanteFormaPagos();
				//this.importarComprobanteFormaPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobanteFormaPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComprobanteFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comprobante Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComprobanteFormaPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComprobanteFormaPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComprobanteFormaPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setSelectedIndex(0);					
				}	
			} 			
			else if(ComprobanteFormaPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComprobanteFormaPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComprobanteFormaPago(conSplash);
					
						//this.actualizarParametrosGeneralComprobanteFormaPago();
						
						this.generarReporteProcesoAccionComprobanteFormaPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comprobante Forma PagoS SELECCIONADOS?", "MANTENIMIENTO DE Comprobante Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComprobanteFormaPago();
				
						this.actualizarParametrosGeneralComprobanteFormaPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comprobanteformapagoReturnGeneral=comprobanteformapagoLogic.procesarAccionComprobanteFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comprobanteformapagoLogic.getComprobanteFormaPagos(),this.comprobanteformapagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComprobanteFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComprobanteFormaPago();
					
					ComprobanteFormaPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComprobanteFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobanteFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxTiposAccionesFormularioComprobanteFormaPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComprobanteFormaPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComprobanteFormaPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComprobanteFormaPago();
			
			if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		
			ComprobanteFormaPago comprobanteformapago=new ComprobanteFormaPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComprobanteFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComprobanteFormaPago.getSelectedItem();
			
			
			
			
			comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(comprobanteformapagosSeleccionados.size()==1) {
				for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagosSeleccionados) {
					comprobanteformapago=comprobanteformapagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComprobanteFormaPago();
			
      		//this.finishProcessComprobanteFormaPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComprobanteFormaPagoReturnGeneral() throws Exception {
		if(this.comprobanteformapagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comprobanteformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comprobanteformapagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comprobanteformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comprobanteformapagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comprobanteformapagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComprobanteFormaPago(false);
		}
		
		if(this.comprobanteformapagoReturnGeneral.getConRetornoLista() || this.comprobanteformapagoReturnGeneral.getConRetornoObjeto()) {
			if(this.comprobanteformapagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comprobanteformapagoLogic.setComprobanteFormaPagos(this.comprobanteformapagoReturnGeneral.getComprobanteFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingComprobanteFormaPago(false);
		}
	}
	
	public void actualizarParametrosGeneralComprobanteFormaPago() throws Exception {
		
		
	}
	
	public ArrayList<ComprobanteFormaPago> getComprobanteFormaPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComprobanteFormaPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagoLogic.getComprobanteFormaPagos()) {
					if(comprobanteformapagoAux.getIsSelected()) {
						comprobanteformapagosSeleccionados.add(comprobanteformapagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFormaPago comprobanteformapagoAux:this.comprobanteformapagos) {
					if(comprobanteformapagoAux.getIsSelected()) {
						comprobanteformapagosSeleccionados.add(comprobanteformapagoAux);				
					}
				}
			}
			
			if(comprobanteformapagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comprobanteformapagosSeleccionados.addAll(this.comprobanteformapagoLogic.getComprobanteFormaPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comprobanteformapagosSeleccionados.addAll(this.comprobanteformapagos);				
					}
				}
			}
		} else {
			comprobanteformapagosSeleccionados.add(this.comprobanteformapago);
		}
		
		return comprobanteformapagosSeleccionados;
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
	
	public void generarReporteComprobanteFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComprobanteFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComprobanteFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobanteFormaPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobanteFormaPagosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comprobante Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComprobanteFormaPagosSeleccionados() throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComprobanteFormaPagos("Todos",comprobanteformapagosSeleccionados);
		
	}	
	
	public void generarReporteNormalComprobanteFormaPagosSeleccionados() throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComprobanteFormaPagos("Todos",comprobanteformapagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComprobanteFormaPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComprobanteFormaPagos("Todos",comprobanteformapagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComprobanteFormaPagosSeleccionados() throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComprobanteFormaPago();
		
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComprobanteFormaPago();
		
		
		//this.generarReporteComprobanteFormaPagos("Todos",comprobanteformapagosSeleccionados ,comprobanteformapagoImplementable,comprobanteformapagoImplementableHome);
	}
	
	public void mostrarImportacionComprobanteFormaPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComprobanteFormaPago();
		
		this.abrirFrameImportacionComprobanteFormaPago();		
		
			
		//this.generarReporteComprobanteFormaPagos("Todos",comprobanteformapagosSeleccionados ,comprobanteformapagoImplementable,comprobanteformapagoImplementableHome);
	}
	
	public void importarComprobanteFormaPagos() throws Exception {		
	
	}
	
	public void exportarComprobanteFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComprobanteFormaPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComprobanteFormaPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComprobanteFormaPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comprobante Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComprobanteFormaPagosSeleccionados() throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobanteformapago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComprobanteFormaPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComprobanteFormaPago(comprobanteformapagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comprobanteformapagoAux.setsDetalleGeneralEntityReporte(comprobanteformapagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComprobanteFormaPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comprobanteformapago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getnombre_caja();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getcodigo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getsubtotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getfinanciamiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.gettipo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getfecha_forma_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getnumero_cuenta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getnumero_cheque();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getgirador();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getnumero_dias_plazo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getnumero_tarjeta();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getautorizacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobanteformapago.getlote();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComprobanteFormaPagosSeleccionados() throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobanteformapago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComprobanteFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComprobanteFormaPago(row);				
				iRow++;
			}				
			
			for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComprobanteFormaPago(comprobanteformapagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComprobanteFormaPagosSeleccionados() throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();		
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobanteformapago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comprobanteformapagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comprobanteformapago");
			//elementRoot.appendChild(element);
		
			for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagosSeleccionados) {
				element = document.createElement("comprobanteformapago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComprobanteFormaPago(comprobanteformapagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComprobanteFormaPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FINANCIAMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getnombre_caja());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getcodigo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getsubtotal());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getfinanciamiento());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.gettipo());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getfecha_forma_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getnumero_cuenta());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getnumero_cheque());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getgirador());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getnumero_dias_plazo());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getnumero_tarjeta());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getautorizacion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobanteformapago.getlote());				
	}
	
	public void setFilaDatosExportarXmlComprobanteFormaPago(ComprobanteFormaPago comprobanteformapago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComprobanteFormaPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comprobanteformapago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComprobanteFormaPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comprobanteformapago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComprobanteFormaPagoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comprobanteformapago.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(ComprobanteFormaPagoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(comprobanteformapago.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(ComprobanteFormaPagoConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(comprobanteformapago.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementcaja_descripcion = document.createElement(ComprobanteFormaPagoConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(comprobanteformapago.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementfecha_inicio = document.createElement(ComprobanteFormaPagoConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(comprobanteformapago.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(ComprobanteFormaPagoConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(comprobanteformapago.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementnombre_caja = document.createElement(ComprobanteFormaPagoConstantesFunciones.NOMBRECAJA);
		elementnombre_caja.appendChild(document.createTextNode(comprobanteformapago.getnombre_caja().trim()));
		element.appendChild(elementnombre_caja);

		Element elementsecuencial = document.createElement(ComprobanteFormaPagoConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(comprobanteformapago.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha = document.createElement(ComprobanteFormaPagoConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(comprobanteformapago.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementcodigo_cliente = document.createElement(ComprobanteFormaPagoConstantesFunciones.CODIGOCLIENTE);
		elementcodigo_cliente.appendChild(document.createTextNode(comprobanteformapago.getcodigo_cliente().trim()));
		element.appendChild(elementcodigo_cliente);

		Element elementnombre_cliente = document.createElement(ComprobanteFormaPagoConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(comprobanteformapago.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementsubtotal = document.createElement(ComprobanteFormaPagoConstantesFunciones.SUBTOTAL);
		elementsubtotal.appendChild(document.createTextNode(comprobanteformapago.getsubtotal().toString().trim()));
		element.appendChild(elementsubtotal);

		Element elementiva = document.createElement(ComprobanteFormaPagoConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(comprobanteformapago.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento = document.createElement(ComprobanteFormaPagoConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(comprobanteformapago.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementfinanciamiento = document.createElement(ComprobanteFormaPagoConstantesFunciones.FINANCIAMIENTO);
		elementfinanciamiento.appendChild(document.createTextNode(comprobanteformapago.getfinanciamiento().toString().trim()));
		element.appendChild(elementfinanciamiento);

		Element elementflete = document.createElement(ComprobanteFormaPagoConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(comprobanteformapago.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementice = document.createElement(ComprobanteFormaPagoConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(comprobanteformapago.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementtotal = document.createElement(ComprobanteFormaPagoConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(comprobanteformapago.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementtipo = document.createElement(ComprobanteFormaPagoConstantesFunciones.TIPO);
		elementtipo.appendChild(document.createTextNode(comprobanteformapago.gettipo().trim()));
		element.appendChild(elementtipo);

		Element elementvalor = document.createElement(ComprobanteFormaPagoConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(comprobanteformapago.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfecha_forma_pago = document.createElement(ComprobanteFormaPagoConstantesFunciones.FECHAFORMAPAGO);
		elementfecha_forma_pago.appendChild(document.createTextNode(comprobanteformapago.getfecha_forma_pago().toString().trim()));
		element.appendChild(elementfecha_forma_pago);

		Element elementnumero_cuenta = document.createElement(ComprobanteFormaPagoConstantesFunciones.NUMEROCUENTA);
		elementnumero_cuenta.appendChild(document.createTextNode(comprobanteformapago.getnumero_cuenta().trim()));
		element.appendChild(elementnumero_cuenta);

		Element elementnumero_cheque = document.createElement(ComprobanteFormaPagoConstantesFunciones.NUMEROCHEQUE);
		elementnumero_cheque.appendChild(document.createTextNode(comprobanteformapago.getnumero_cheque().trim()));
		element.appendChild(elementnumero_cheque);

		Element elementgirador = document.createElement(ComprobanteFormaPagoConstantesFunciones.GIRADOR);
		elementgirador.appendChild(document.createTextNode(comprobanteformapago.getgirador().trim()));
		element.appendChild(elementgirador);

		Element elementnumero_dias_plazo = document.createElement(ComprobanteFormaPagoConstantesFunciones.NUMERODIASPLAZO);
		elementnumero_dias_plazo.appendChild(document.createTextNode(comprobanteformapago.getnumero_dias_plazo().toString().trim()));
		element.appendChild(elementnumero_dias_plazo);

		Element elementnumero_tarjeta = document.createElement(ComprobanteFormaPagoConstantesFunciones.NUMEROTARJETA);
		elementnumero_tarjeta.appendChild(document.createTextNode(comprobanteformapago.getnumero_tarjeta().trim()));
		element.appendChild(elementnumero_tarjeta);

		Element elementautorizacion = document.createElement(ComprobanteFormaPagoConstantesFunciones.AUTORIZACION);
		elementautorizacion.appendChild(document.createTextNode(comprobanteformapago.getautorizacion().trim()));
		element.appendChild(elementautorizacion);

		Element elementlote = document.createElement(ComprobanteFormaPagoConstantesFunciones.LOTE);
		elementlote.appendChild(document.createTextNode(comprobanteformapago.getlote().trim()));
		element.appendChild(elementlote);
	}
	
	public void generarReporteGroupGenericoComprobanteFormaPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados=new ArrayList<ComprobanteFormaPago>();
		
		comprobanteformapagosSeleccionados=this.getComprobanteFormaPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComprobanteFormaPago(comprobanteformapagosSeleccionados);
		
		this.generarReporteComprobanteFormaPagos("Todos",comprobanteformapagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComprobanteFormaPago(ArrayList<ComprobanteFormaPago> comprobanteformapagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComprobanteFormaPago comprobanteformapagoAux:comprobanteformapagosSeleccionados) {
				comprobanteformapagoAux.setsDetalleGeneralEntityReporte(comprobanteformapagoAux.toString());
			
				if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobanteformapagoAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobanteformapagoAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECAJA)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getnombre_caja());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobanteformapagoAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_CODIGOCLIENTE)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getcodigo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_TIPO)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.gettipo());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_FECHAFORMAPAGO)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobanteformapagoAux.getfecha_forma_pago()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCUENTA)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getnumero_cuenta());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROCHEQUE)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getnumero_cheque());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_GIRADOR)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getgirador());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMERODIASPLAZO)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getnumero_dias_plazo().toString());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_NUMEROTARJETA)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getnumero_tarjeta());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_AUTORIZACION)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getautorizacion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFormaPagoConstantesFunciones.LABEL_LOTE)) {
					existe=true;
					comprobanteformapagoAux.setsDescripcionGeneralEntityReporte1(comprobanteformapagoAux.getlote());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComprobanteFormaPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComprobanteFormaPago=true;
				this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=true;
				this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=true;
			}
			
			this.isVisibilidadCeldaModificarComprobanteFormaPago=false;
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=false;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;
			this.isVisibilidadCeldaModificarComprobanteFormaPago=false;
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=true;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;
			this.isVisibilidadCeldaModificarComprobanteFormaPago=false;
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=true;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=true;
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;
			this.isVisibilidadCeldaModificarComprobanteFormaPago=false;
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=true;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=true;
			this.isVisibilidadCeldaModificarComprobanteFormaPago=false;
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=false;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=false;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;
			this.isVisibilidadCeldaModificarComprobanteFormaPago=true;
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=false;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
			this.isVisibilidadCeldaCancelarComprobanteFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComprobanteFormaPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=true;
		} else {
			this.actualizarEstadoPanelsComprobanteFormaPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComprobanteFormaPago=false;
			//this.isVisibilidadCeldaVerFormComprobanteFormaPago=false;
			this.isVisibilidadCeldaDuplicarComprobanteFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comprobanteformapagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
		} else {
			this.isVisibilidadCeldaNuevoComprobanteFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!comprobanteformapagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;												
			}
			
			this.jButtonCerrarComprobanteFormaPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
		}
		
		if(!this.permiteMantenimiento(this.comprobanteformapago)) {
			this.isVisibilidadCeldaActualizarComprobanteFormaPago=false;
			this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoComprobanteFormaPago=false;
		this.isVisibilidadCeldaNuevoRelacionesComprobanteFormaPago=false;
		this.isVisibilidadCeldaGuardarCambiosComprobanteFormaPago=false;
		//this.isVisibilidadCeldaModificarComprobanteFormaPago=true;
		this.isVisibilidadCeldaActualizarComprobanteFormaPago=false;
		this.isVisibilidadCeldaEliminarComprobanteFormaPago=false;
		//this.isVisibilidadCeldaCancelarComprobanteFormaPago=true;			
		this.isVisibilidadCeldaGuardarComprobanteFormaPago=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComprobanteFormaPago() {
	}
	
	public void actualizarEstadoPanelsComprobanteFormaPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComprobanteFormaPago!=null) {
				this.jScrollPanelDatosEdicionComprobanteFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFormaPago!=null) {
				this.jScrollPanelDatosComprobanteFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFormaPago!=null) {
				this.jPanelPaginacionComprobanteFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComprobanteFormaPago!=null) {
				this.jScrollPanelDatosEdicionComprobanteFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComprobanteFormaPago!=null) {
				this.jScrollPanelDatosComprobanteFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFormaPago!=null) {
				this.jPanelPaginacionComprobanteFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComprobanteFormaPago!=null) {
				this.jScrollPanelDatosEdicionComprobanteFormaPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFormaPago!=null) {
				this.jScrollPanelDatosComprobanteFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFormaPago!=null) {
				this.jPanelPaginacionComprobanteFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComprobanteFormaPago!=null) {
				this.jScrollPanelDatosEdicionComprobanteFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFormaPago!=null) {
				this.jScrollPanelDatosComprobanteFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFormaPago!=null) {
				this.jPanelPaginacionComprobanteFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComprobanteFormaPago!=null) {
				this.jScrollPanelDatosEdicionComprobanteFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFormaPago!=null) {
				this.jScrollPanelDatosComprobanteFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFormaPago!=null) {
				this.jPanelPaginacionComprobanteFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComprobanteFormaPago!=null) {
				this.jScrollPanelDatosEdicionComprobanteFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFormaPago!=null) {
				this.jScrollPanelDatosComprobanteFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFormaPago!=null) {
				this.jPanelPaginacionComprobanteFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComprobanteFormaPago!=null) {
				this.jScrollPanelDatosEdicionComprobanteFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFormaPago!=null) {
				this.jScrollPanelDatosComprobanteFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFormaPago!=null) {
				this.jPanelPaginacionComprobanteFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
					this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comprobanteformapagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFormaPago!=null) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComprobanteFormaPago!=null) {
				this.jPanelParametrosReportesComprobanteFormaPago.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaComprobanteFormaPago=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaComprobanteFormaPago) {this.jTabbedPaneBusquedasComprobanteFormaPago.remove(jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaComprobanteFormaPago=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaComprobanteFormaPago) {this.jTabbedPaneBusquedasComprobanteFormaPago.remove(jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaComprobanteFormaPago=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaComprobanteFormaPago) {this.jTabbedPaneBusquedasComprobanteFormaPago.remove(jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadBusquedaComprobanteFormaPago=isParaCajaNegation;
			if(!this.isVisibilidadBusquedaComprobanteFormaPago) {this.jTabbedPaneBusquedasComprobanteFormaPago.remove(jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);}
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
			
			this.inicializarActualizarBindingTablaComprobanteFormaPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComprobanteFormaPago() {
		this.updateBorderResaltarBusquedasFormularioComprobanteFormaPago();
		this.updateVisibilidadBusquedasFormularioComprobanteFormaPago();
		this.updateHabilitarBusquedasFormularioComprobanteFormaPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioComprobanteFormaPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComprobanteFormaPago.getComponents().length>0) {
	

		if(this.comprobanteformapagoConstantesFunciones.resaltarBusquedaComprobanteFormaPagoComprobanteFormaPago!=null) {
			index= this.jTabbedPaneBusquedasComprobanteFormaPago.indexOfComponent(this.jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFormaPago.getComponent(index);
				jPanel.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarBusquedaComprobanteFormaPagoComprobanteFormaPago);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComprobanteFormaPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComprobanteFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobanteFormaPago.indexOfComponent(this.jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarBusquedaComprobanteFormaPagoComprobanteFormaPago);
			if(!this.comprobanteformapagoConstantesFunciones.mostrarBusquedaComprobanteFormaPagoComprobanteFormaPago && index>-1) {
				this.jTabbedPaneBusquedasComprobanteFormaPago.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComprobanteFormaPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComprobanteFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobanteFormaPago.indexOfComponent(this.jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comprobanteformapagoConstantesFunciones.activarBusquedaComprobanteFormaPagoComprobanteFormaPago);
				this.jTabbedPaneBusquedasComprobanteFormaPago.setEnabledAt(index,this.comprobanteformapagoConstantesFunciones.activarBusquedaComprobanteFormaPagoComprobanteFormaPago);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComprobanteFormaPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaComprobanteFormaPago")) {
			index= this.jTabbedPaneBusquedasComprobanteFormaPago.indexOfComponent(this.jPanelBusquedaComprobanteFormaPagoComprobanteFormaPago);

			this.jTabbedPaneBusquedasComprobanteFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFormaPago.getComponent(index);

			this.comprobanteformapagoConstantesFunciones.setResaltarBusquedaComprobanteFormaPagoComprobanteFormaPago(resaltar);

			jPanel.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarBusquedaComprobanteFormaPagoComprobanteFormaPago);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComprobanteFormaPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComprobanteFormaPago() throws Exception {

		if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComprobanteFormaPago();
		this.updateVisibilidadResaltarControlesFormularioComprobanteFormaPago();
		this.updateHabilitarResaltarControlesFormularioComprobanteFormaPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioComprobanteFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comprobanteformapagoConstantesFunciones.resaltaridComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltaridComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarid_empresaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarid_empresaComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarid_sucursalComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarid_sucursalComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarid_clienteComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarid_clienteComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarid_cajaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarid_cajaComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarfecha_inicioComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_inicioComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarfecha_inicioComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarfecha_finComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_finComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarfecha_finComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarnombre_cajaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_cajaComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarnombre_cajaComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarsecuencialComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsecuencialComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarsecuencialComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarfechaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfechaComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarfechaComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarcodigo_clienteComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldcodigo_clienteComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarcodigo_clienteComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarnombre_clienteComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_clienteComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarnombre_clienteComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarsubtotalComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsubtotalComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarsubtotalComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarivaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldivaComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarivaComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltardescuentoComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFielddescuentoComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltardescuentoComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarfinanciamientoComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfinanciamientoComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarfinanciamientoComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarfleteComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfleteComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarfleteComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltariceComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldiceComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltariceComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltartotalComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtotalComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltartotalComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltartipoComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtipoComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltartipoComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarvalorComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldvalorComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarvalorComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarfecha_forma_pagoComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_forma_pagoComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarfecha_forma_pagoComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarnumero_cuentaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_cuentaComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarnumero_cuentaComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarnumero_chequeComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_chequeComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarnumero_chequeComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltargiradorComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreagiradorComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltargiradorComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarnumero_dias_plazoComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_dias_plazoComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarnumero_dias_plazoComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarnumero_tarjetaComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_tarjetaComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarnumero_tarjetaComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarautorizacionComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreaautorizacionComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarautorizacionComprobanteFormaPago);}
		if(this.comprobanteformapagoConstantesFunciones.resaltarloteComprobanteFormaPago!=null && this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldloteComprobanteFormaPago.setBorder(this.comprobanteformapagoConstantesFunciones.resaltarloteComprobanteFormaPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComprobanteFormaPago() throws Exception {		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
	
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostraridComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelidComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostraridComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarid_empresaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelid_empresaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarid_empresaComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarid_sucursalComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelid_sucursalComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarid_sucursalComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarid_clienteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelid_clienteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarid_clienteComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarid_cajaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelid_cajaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarid_cajaComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_inicioComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfecha_inicioComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelfecha_inicioComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfecha_inicioComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_finComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfecha_finComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelfecha_finComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfecha_finComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_cajaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnombre_cajaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelnombre_cajaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnombre_cajaComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsecuencialComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarsecuencialComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelsecuencialComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarsecuencialComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfechaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfechaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelfechaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfechaComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldcodigo_clienteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarcodigo_clienteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelcodigo_clienteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarcodigo_clienteComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_clienteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnombre_clienteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelnombre_clienteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnombre_clienteComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsubtotalComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarsubtotalComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelsubtotalComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarsubtotalComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldivaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarivaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelivaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarivaComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFielddescuentoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrardescuentoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPaneldescuentoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrardescuentoComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfinanciamientoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfinanciamientoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelfinanciamientoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfinanciamientoComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfleteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfleteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelfleteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfleteComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldiceComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrariceComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPaneliceComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrariceComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtotalComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrartotalComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPaneltotalComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrartotalComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtipoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrartipoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPaneltipoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrartipoComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldvalorComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarvalorComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelvalorComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarvalorComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_forma_pagoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfecha_forma_pagoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelfecha_forma_pagoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarfecha_forma_pagoComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_cuentaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnumero_cuentaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelnumero_cuentaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnumero_cuentaComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_chequeComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnumero_chequeComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelnumero_chequeComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnumero_chequeComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreagiradorComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrargiradorComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelgiradorComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrargiradorComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_dias_plazoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnumero_dias_plazoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelnumero_dias_plazoComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnumero_dias_plazoComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_tarjetaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnumero_tarjetaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelnumero_tarjetaComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarnumero_tarjetaComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreaautorizacionComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarautorizacionComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelautorizacionComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarautorizacionComprobanteFormaPago);
		//this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldloteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarloteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jPanelloteComprobanteFormaPago.setVisible(this.comprobanteformapagoConstantesFunciones.mostrarloteComprobanteFormaPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComprobanteFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormComprobanteFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFormaPago!=null) {
	
		this.jInternalFrameDetalleFormComprobanteFormaPago.jLabelidComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activaridComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_empresaComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarid_empresaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_sucursalComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarid_sucursalComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_clienteComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarid_clienteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jComboBoxid_cajaComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarid_cajaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_inicioComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarfecha_inicioComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_finComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarfecha_finComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_cajaComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarnombre_cajaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsecuencialComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarsecuencialComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfechaComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarfechaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldcodigo_clienteComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarcodigo_clienteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreanombre_clienteComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarnombre_clienteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldsubtotalComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarsubtotalComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldivaComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarivaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFielddescuentoComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activardescuentoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfinanciamientoComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarfinanciamientoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldfleteComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarfleteComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldiceComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activariceComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtotalComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activartotalComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldtipoComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activartipoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldvalorComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarvalorComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jDateChooserfecha_forma_pagoComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarfecha_forma_pagoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_cuentaComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarnumero_cuentaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_chequeComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarnumero_chequeComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreagiradorComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activargiradorComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_dias_plazoComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarnumero_dias_plazoComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldnumero_tarjetaComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarnumero_tarjetaComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextAreaautorizacionComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarautorizacionComprobanteFormaPago);
		this.jInternalFrameDetalleFormComprobanteFormaPago.jTextFieldloteComprobanteFormaPago.setEnabled(this.comprobanteformapagoConstantesFunciones.activarloteComprobanteFormaPago);
		}
	}
	
		
}