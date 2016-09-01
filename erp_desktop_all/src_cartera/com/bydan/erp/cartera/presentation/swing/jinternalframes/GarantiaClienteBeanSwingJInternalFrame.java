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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.GarantiaClienteConstantesFunciones;
import com.bydan.erp.cartera.util.GarantiaClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.GarantiaClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.GarantiaClienteBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class GarantiaClienteBeanSwingJInternalFrame extends GarantiaClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(GarantiaClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<GarantiaCliente> garantiaclienteValidator = new ClassValidator<GarantiaCliente>(GarantiaCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public GarantiaCliente garantiacliente;	
	public GarantiaCliente garantiaclienteAux;
	public GarantiaCliente garantiaclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public GarantiaCliente garantiaclienteTotales;
	public Long idGarantiaClienteActual;
	public Long iIdNuevoGarantiaCliente=0L;
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

	public String sFinalQueryComboTipoGarantiaEmpresa="";

	public List<TipoGarantiaEmpresa> tipogarantiaempresasForeignKey;

	public List<TipoGarantiaEmpresa> gettipogarantiaempresasForeignKey() {
		return tipogarantiaempresasForeignKey;
	}

	public void settipogarantiaempresasForeignKey(List<TipoGarantiaEmpresa> tipogarantiaempresasForeignKey) {
		this.tipogarantiaempresasForeignKey = tipogarantiaempresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoGarantiaEmpresa tipogarantiaempresaForeignKey;

	public TipoGarantiaEmpresa gettipogarantiaempresaForeignKey() {
		return tipogarantiaempresaForeignKey;
	}

	public void settipogarantiaempresaForeignKey(TipoGarantiaEmpresa tipogarantiaempresaForeignKey) {
		this.tipogarantiaempresaForeignKey = tipogarantiaempresaForeignKey;
	}

	public String sFinalQueryComboEstadoGarantiaCliente="";

	public List<EstadoGarantiaCliente> estadogarantiaclientesForeignKey;

	public List<EstadoGarantiaCliente> getestadogarantiaclientesForeignKey() {
		return estadogarantiaclientesForeignKey;
	}

	public void setestadogarantiaclientesForeignKey(List<EstadoGarantiaCliente> estadogarantiaclientesForeignKey) {
		this.estadogarantiaclientesForeignKey = estadogarantiaclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoGarantiaCliente estadogarantiaclienteForeignKey;

	public EstadoGarantiaCliente getestadogarantiaclienteForeignKey() {
		return estadogarantiaclienteForeignKey;
	}

	public void setestadogarantiaclienteForeignKey(EstadoGarantiaCliente estadogarantiaclienteForeignKey) {
		this.estadogarantiaclienteForeignKey = estadogarantiaclienteForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoGarantiaCliente;
	public Boolean isPermisoNuevoGarantiaCliente;
	public Boolean isPermisoActualizarGarantiaCliente;
	public Boolean isPermisoActualizarOriginalGarantiaCliente;
	public Boolean isPermisoEliminarGarantiaCliente;
	public Boolean isPermisoGuardarCambiosGarantiaCliente;
	public Boolean isPermisoConsultaGarantiaCliente;
	public Boolean isPermisoBusquedaGarantiaCliente;
	public Boolean isPermisoReporteGarantiaCliente;
	public Boolean isPermisoPaginacionMedioGarantiaCliente;
	public Boolean isPermisoPaginacionAltoGarantiaCliente;
	public Boolean isPermisoPaginacionTodoGarantiaCliente;
	public Boolean isPermisoCopiarGarantiaCliente;
	public Boolean isPermisoVerFormGarantiaCliente;
	public Boolean isPermisoDuplicarGarantiaCliente;
	public Boolean isPermisoOrdenGarantiaCliente;
	
	
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
	
	public GarantiaClienteParameterReturnGeneral garantiaclienteReturnGeneral;
	public GarantiaClienteParameterReturnGeneral garantiaclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoGarantiaCliente=false;
	public Boolean esParaAccionDesdeFormularioGarantiaCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected GarantiaClienteSessionBeanAdditional garantiaclienteSessionBeanAdditional=null;
	
	public GarantiaClienteSessionBeanAdditional getGarantiaClienteSessionBeanAdditional() {
		return this.garantiaclienteSessionBeanAdditional;
	}
	
	public void setGarantiaClienteSessionBeanAdditional(GarantiaClienteSessionBeanAdditional garantiaclienteSessionBeanAdditional) {
		try {
			this.garantiaclienteSessionBeanAdditional=garantiaclienteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected GarantiaClienteBeanSwingJInternalFrameAdditional garantiaclienteBeanSwingJInternalFrameAdditional=null;
	//public class GarantiaClienteBeanSwingJInternalFrame
	
	public GarantiaClienteBeanSwingJInternalFrameAdditional getGarantiaClienteBeanSwingJInternalFrameAdditional() {
		return this.garantiaclienteBeanSwingJInternalFrameAdditional;
	}
	
	public void setGarantiaClienteBeanSwingJInternalFrameAdditional(GarantiaClienteBeanSwingJInternalFrameAdditional garantiaclienteBeanSwingJInternalFrameAdditional) {
		try {
			this.garantiaclienteBeanSwingJInternalFrameAdditional=garantiaclienteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public GarantiaClienteLogic garantiaclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public GarantiaCliente garantiaclienteBean;
	public GarantiaClienteConstantesFunciones garantiaclienteConstantesFunciones;
	//public GarantiaClienteParameterReturnGeneral garantiaclienteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public ClienteLogic clienteLogic;
	public TipoGarantiaEmpresaLogic tipogarantiaempresaLogic;
	public EstadoGarantiaClienteLogic estadogarantiaclienteLogic;
	
	//PARAMETROS
	
	
	//public List<GarantiaCliente> garantiaclientes;	
	//public List<GarantiaCliente> garantiaclientesEliminados;
	//public List<GarantiaCliente> garantiaclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoGarantiaCliente=false;
	public Boolean isVisibilidadCeldaDuplicarGarantiaCliente=true;
	public Boolean isVisibilidadCeldaCopiarGarantiaCliente=true;
	public Boolean isVisibilidadCeldaVerFormGarantiaCliente=true;
	public Boolean isVisibilidadCeldaOrdenGarantiaCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
	public Boolean isVisibilidadCeldaModificarGarantiaCliente=false;
	public Boolean isVisibilidadCeldaActualizarGarantiaCliente=false;
	public Boolean isVisibilidadCeldaEliminarGarantiaCliente=false;
	public Boolean isVisibilidadCeldaCancelarGarantiaCliente=false;
	public Boolean isVisibilidadCeldaGuardarGarantiaCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosGarantiaCliente=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoGarantiaCliente=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoGarantiaEmpresa=false;
	
	public Long getiIdNuevoGarantiaCliente() {
		return this.iIdNuevoGarantiaCliente;
	}

	public void setiIdNuevoGarantiaCliente(Long iIdNuevoGarantiaCliente) {
		this.iIdNuevoGarantiaCliente = iIdNuevoGarantiaCliente;
	}
	
	public Long getidGarantiaClienteActual() {
		return this.idGarantiaClienteActual;
	}

	public void setidGarantiaClienteActual(Long idGarantiaClienteActual) {
		this.idGarantiaClienteActual = idGarantiaClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public GarantiaCliente getgarantiacliente() {
		return this.garantiacliente;
	}

	public void setgarantiacliente(GarantiaCliente garantiacliente) {
		this.garantiacliente = garantiacliente;
	}
	
	public GarantiaCliente getgarantiaclienteAux() {
		return this.garantiaclienteAux;
	}

	public void setgarantiaclienteAux(GarantiaCliente garantiaclienteAux) {
		this.garantiaclienteAux = garantiaclienteAux;
	}				
	
	public GarantiaCliente getgarantiaclienteAnterior() {
		return this.garantiaclienteAnterior;
	}

	public void setgarantiaclienteAnterior(GarantiaCliente garantiaclienteAnterior) {
		this.garantiaclienteAnterior = garantiaclienteAnterior;
	}	
	
	public GarantiaCliente getgarantiaclienteTotales() {
		return this.garantiaclienteTotales;
	}

	public void setgarantiaclienteTotales(GarantiaCliente garantiaclienteTotales) {
		this.garantiaclienteTotales = garantiaclienteTotales;
	}	
	
	public GarantiaCliente getgarantiaclienteBean() {
		return this.garantiaclienteBean;
	}

	public void setgarantiaclienteBean(GarantiaCliente garantiaclienteBean) {
		this.garantiaclienteBean = garantiaclienteBean;
	}	
	
	public GarantiaClienteParameterReturnGeneral getgarantiaclienteReturnGeneral() {
		return this.garantiaclienteReturnGeneral;
	}

	public void setgarantiaclienteReturnGeneral(GarantiaClienteParameterReturnGeneral garantiaclienteReturnGeneral) {
		this.garantiaclienteReturnGeneral = garantiaclienteReturnGeneral;
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

	public Long id_estado_garantia_clienteFK_IdEstadoGarantiaCliente=-1L;

	public Long getid_estado_garantia_clienteFK_IdEstadoGarantiaCliente() {
		return this.id_estado_garantia_clienteFK_IdEstadoGarantiaCliente;
	}

	public void setid_estado_garantia_clienteFK_IdEstadoGarantiaCliente(Long id_estado_garantia_clienteFK_IdEstadoGarantiaCliente) {
		this.id_estado_garantia_clienteFK_IdEstadoGarantiaCliente = id_estado_garantia_clienteFK_IdEstadoGarantiaCliente;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa=-1L;

	public Long getid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa() {
		return this.id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa;
	}

	public void setid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa(Long id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa) {
		this.id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa = id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public GarantiaClienteLogic getGarantiaClienteLogic()	{		
		return garantiaclienteLogic;
	}

	public void setGarantiaClienteLogic(GarantiaClienteLogic garantiaclienteLogic) {
		this.garantiaclienteLogic = garantiaclienteLogic;
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
	
	public Boolean getIsEsNuevoGarantiaCliente() {
		return isEsNuevoGarantiaCliente;
	}

	public void setIsEsNuevoGarantiaCliente(Boolean isEsNuevoGarantiaCliente) {
		this.isEsNuevoGarantiaCliente = isEsNuevoGarantiaCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioGarantiaCliente() {
		return esParaAccionDesdeFormularioGarantiaCliente;
	}
	
	public void setEsParaAccionDesdeFormularioGarantiaCliente(Boolean esParaAccionDesdeFormularioGarantiaCliente) {
		this.esParaAccionDesdeFormularioGarantiaCliente = esParaAccionDesdeFormularioGarantiaCliente;
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

			if(this.garantiaclienteSessionBean==null) {
				this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(garantiaclienteSessionBean.getlidEmpresaActual());
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

			if(this.garantiaclienteSessionBean==null) {
				this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(garantiaclienteSessionBean.getlidSucursalActual());
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

			if(this.garantiaclienteSessionBean==null) {
				this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(garantiaclienteSessionBean.getlidClienteActual());
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

	public void cargarCombosTipoGarantiaEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipogarantiaempresasForeignKey=new ArrayList<TipoGarantiaEmpresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoGarantiaEmpresaLogic tipogarantiaempresaLogic=new TipoGarantiaEmpresaLogic();

			//tipogarantiaempresaLogic.getTipoGarantiaEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.garantiaclienteSessionBean==null) {
				this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipogarantiaempresaLogic.getTipoGarantiaEmpresaDataAccess().setIsForForeingKeyData(true);

					tipogarantiaempresaLogic.getTodosTipoGarantiaEmpresasWithConnection(sFinalQuery,new Pagination());

					this.tipogarantiaempresasForeignKey=tipogarantiaempresaLogic.getTipoGarantiaEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoGarantiaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogarantiaempresaLogic.getEntityWithConnection(garantiaclienteSessionBean.getlidTipoGarantiaEmpresaActual());
					this.tipogarantiaempresasForeignKey.add(tipogarantiaempresaLogic.getTipoGarantiaEmpresa());
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

	public void cargarCombosEstadoGarantiaClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadogarantiaclientesForeignKey=new ArrayList<EstadoGarantiaCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoGarantiaClienteLogic estadogarantiaclienteLogic=new EstadoGarantiaClienteLogic();

			//estadogarantiaclienteLogic.getEstadoGarantiaClienteDataAccess().setIsForForeingKeyData(true);

			if(this.garantiaclienteSessionBean==null) {
				this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEstadoGarantiaCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadogarantiaclienteLogic.getEstadoGarantiaClienteDataAccess().setIsForForeingKeyData(true);

					estadogarantiaclienteLogic.getTodosEstadoGarantiaClientesWithConnection(sFinalQuery,new Pagination());

					this.estadogarantiaclientesForeignKey=estadogarantiaclienteLogic.getEstadoGarantiaClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoGarantiaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadogarantiaclienteLogic.getEntityWithConnection(garantiaclienteSessionBean.getlidEstadoGarantiaClienteActual());
					this.estadogarantiaclientesForeignKey.add(estadogarantiaclienteLogic.getEstadoGarantiaCliente());
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

					if(this.garantiacliente!=null) {
						this.garantiacliente.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaGarantiaCliente.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaGarantiaClienteGenerico)throws Exception
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
				jComboBoxid_empresaGarantiaClienteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaGarantiaClienteGenerico!=null && jComboBoxid_empresaGarantiaClienteGenerico.getItemCount()>0) {
					jComboBoxid_empresaGarantiaClienteGenerico.setSelectedIndex(0);
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

					if(this.garantiacliente!=null) {
						this.garantiacliente.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalGarantiaCliente.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalGarantiaClienteGenerico)throws Exception
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
				jComboBoxid_sucursalGarantiaClienteGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalGarantiaClienteGenerico!=null && jComboBoxid_sucursalGarantiaClienteGenerico.getItemCount()>0) {
					jComboBoxid_sucursalGarantiaClienteGenerico.setSelectedIndex(0);
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

					if(this.garantiacliente!=null) {
						this.garantiacliente.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteGarantiaCliente.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteGarantiaCliente!=null) {
						jComboBoxid_clienteFK_IdClienteGarantiaCliente.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteGarantiaCliente!=null) {
							//jComboBoxid_clienteFK_IdClienteGarantiaCliente.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteGarantiaCliente.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteGarantiaCliente.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteGarantiaClienteGenerico)throws Exception
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
				jComboBoxid_clienteGarantiaClienteGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteGarantiaClienteGenerico!=null && jComboBoxid_clienteGarantiaClienteGenerico.getItemCount()>0) {
					jComboBoxid_clienteGarantiaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoGarantiaEmpresaForeignKey(Long idTipoGarantiaEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoGarantiaEmpresa  tipogarantiaempresaTemp=null;

			for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasForeignKey) {
				if(tipogarantiaempresaAux.getId()!=null && tipogarantiaempresaAux.getId().equals(idTipoGarantiaEmpresaSeleccionado)) {
					tipogarantiaempresaTemp=tipogarantiaempresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipogarantiaempresaTemp!=null) {

					if(this.garantiacliente!=null) {
						this.garantiacliente.setTipoGarantiaEmpresa(tipogarantiaempresaTemp);
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setSelectedItem(tipogarantiaempresaTemp);
					}
				} else {
					//jComboBoxid_tipo_garantia_empresaGarantiaCliente.setSelectedItem(tipogarantiaempresaTemp);
					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoGarantiaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipogarantiaempresaTemp!=null && jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente!=null) {
						jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setSelectedItem(tipogarantiaempresaTemp);
					} else {
						if(jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente!=null) {
							//jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setSelectedItem(tipogarantiaempresaTemp);
							if(jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.getItemCount()>0) {
								jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setSelectedIndex(0);
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

	public String getActualTipoGarantiaEmpresaForeignKeyDescripcion(Long idTipoGarantiaEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoGarantiaEmpresa  tipogarantiaempresaTemp=null;

			for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasForeignKey) {
				if(tipogarantiaempresaAux.getId()!=null && tipogarantiaempresaAux.getId().equals(idTipoGarantiaEmpresaSeleccionado)) {
					tipogarantiaempresaTemp=tipogarantiaempresaAux;
					break;
				}
			}


			sDescripcion=TipoGarantiaEmpresaConstantesFunciones.getTipoGarantiaEmpresaDescripcion(tipogarantiaempresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoGarantiaEmpresaForeignKeyGenerico(Long idTipoGarantiaEmpresaSeleccionado,JComboBox jComboBoxid_tipo_garantia_empresaGarantiaClienteGenerico)throws Exception
	{
		try
		{
			TipoGarantiaEmpresa  tipogarantiaempresaTemp=null;

			for(TipoGarantiaEmpresa tipogarantiaempresaAux:tipogarantiaempresasForeignKey) {
				if(tipogarantiaempresaAux.getId()!=null && tipogarantiaempresaAux.getId().equals(idTipoGarantiaEmpresaSeleccionado)) {
					tipogarantiaempresaTemp=tipogarantiaempresaAux;
					break;
				}
			}

			if(tipogarantiaempresaTemp!=null) {
				jComboBoxid_tipo_garantia_empresaGarantiaClienteGenerico.setSelectedItem(tipogarantiaempresaTemp);
			} else {
				if(jComboBoxid_tipo_garantia_empresaGarantiaClienteGenerico!=null && jComboBoxid_tipo_garantia_empresaGarantiaClienteGenerico.getItemCount()>0) {
					jComboBoxid_tipo_garantia_empresaGarantiaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoGarantiaClienteForeignKey(Long idEstadoGarantiaClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoGarantiaCliente  estadogarantiaclienteTemp=null;

			for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesForeignKey) {
				if(estadogarantiaclienteAux.getId()!=null && estadogarantiaclienteAux.getId().equals(idEstadoGarantiaClienteSeleccionado)) {
					estadogarantiaclienteTemp=estadogarantiaclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadogarantiaclienteTemp!=null) {

					if(this.garantiacliente!=null) {
						this.garantiacliente.setEstadoGarantiaCliente(estadogarantiaclienteTemp);
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setSelectedItem(estadogarantiaclienteTemp);
					}
				} else {
					//jComboBoxid_estado_garantia_clienteGarantiaCliente.setSelectedItem(estadogarantiaclienteTemp);
					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
						if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoGarantiaCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadogarantiaclienteTemp!=null && jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente!=null) {
						jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setSelectedItem(estadogarantiaclienteTemp);
					} else {
						if(jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente!=null) {
							//jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setSelectedItem(estadogarantiaclienteTemp);
							if(jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.getItemCount()>0) {
								jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setSelectedIndex(0);
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

	public String getActualEstadoGarantiaClienteForeignKeyDescripcion(Long idEstadoGarantiaClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoGarantiaCliente  estadogarantiaclienteTemp=null;

			for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesForeignKey) {
				if(estadogarantiaclienteAux.getId()!=null && estadogarantiaclienteAux.getId().equals(idEstadoGarantiaClienteSeleccionado)) {
					estadogarantiaclienteTemp=estadogarantiaclienteAux;
					break;
				}
			}


			sDescripcion=EstadoGarantiaClienteConstantesFunciones.getEstadoGarantiaClienteDescripcion(estadogarantiaclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoGarantiaClienteForeignKeyGenerico(Long idEstadoGarantiaClienteSeleccionado,JComboBox jComboBoxid_estado_garantia_clienteGarantiaClienteGenerico)throws Exception
	{
		try
		{
			EstadoGarantiaCliente  estadogarantiaclienteTemp=null;

			for(EstadoGarantiaCliente estadogarantiaclienteAux:estadogarantiaclientesForeignKey) {
				if(estadogarantiaclienteAux.getId()!=null && estadogarantiaclienteAux.getId().equals(idEstadoGarantiaClienteSeleccionado)) {
					estadogarantiaclienteTemp=estadogarantiaclienteAux;
					break;
				}
			}

			if(estadogarantiaclienteTemp!=null) {
				jComboBoxid_estado_garantia_clienteGarantiaClienteGenerico.setSelectedItem(estadogarantiaclienteTemp);
			} else {
				if(jComboBoxid_estado_garantia_clienteGarantiaClienteGenerico!=null && jComboBoxid_estado_garantia_clienteGarantiaClienteGenerico.getItemCount()>0) {
					jComboBoxid_estado_garantia_clienteGarantiaClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(GarantiaCliente garantiacliente,JComboBox jComboBoxid_empresaGarantiaClienteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaGarantiaClienteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaGarantiaClienteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				garantiacliente.setid_empresa(empresaAux.getId());
				garantiacliente.setempresa_descripcion(GarantiaClienteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				garantiacliente.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(GarantiaCliente garantiacliente,JComboBox jComboBoxid_sucursalGarantiaClienteGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalGarantiaClienteGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalGarantiaClienteGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				garantiacliente.setid_sucursal(sucursalAux.getId());
				garantiacliente.setsucursal_descripcion(GarantiaClienteConstantesFunciones.getSucursalDescripcion(sucursalAux));
				garantiacliente.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(GarantiaCliente garantiacliente,JComboBox jComboBoxid_clienteGarantiaClienteGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteGarantiaClienteGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteGarantiaClienteGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				garantiacliente.setid_cliente(clienteAux.getId());
				garantiacliente.setcliente_descripcion(GarantiaClienteConstantesFunciones.getClienteDescripcion(clienteAux));
				garantiacliente.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoGarantiaEmpresaForeignKey(GarantiaCliente garantiacliente,JComboBox jComboBoxid_tipo_garantia_empresaGarantiaClienteGenerico)throws Exception
	{
		try
		{
			TipoGarantiaEmpresa  tipogarantiaempresaAux=new TipoGarantiaEmpresa();

			if(jComboBoxid_tipo_garantia_empresaGarantiaClienteGenerico==null) {
				tipogarantiaempresaAux=(TipoGarantiaEmpresa)this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.getSelectedItem();
			} else {
				tipogarantiaempresaAux=(TipoGarantiaEmpresa)jComboBoxid_tipo_garantia_empresaGarantiaClienteGenerico.getSelectedItem();
			}

			if(tipogarantiaempresaAux!=null && tipogarantiaempresaAux.getId()!=null) {
				garantiacliente.setid_tipo_garantia_empresa(tipogarantiaempresaAux.getId());
				garantiacliente.settipogarantiaempresa_descripcion(GarantiaClienteConstantesFunciones.getTipoGarantiaEmpresaDescripcion(tipogarantiaempresaAux));
				garantiacliente.setTipoGarantiaEmpresa(tipogarantiaempresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoGarantiaClienteForeignKey(GarantiaCliente garantiacliente,JComboBox jComboBoxid_estado_garantia_clienteGarantiaClienteGenerico)throws Exception
	{
		try
		{
			EstadoGarantiaCliente  estadogarantiaclienteAux=new EstadoGarantiaCliente();

			if(jComboBoxid_estado_garantia_clienteGarantiaClienteGenerico==null) {
				estadogarantiaclienteAux=(EstadoGarantiaCliente)this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.getSelectedItem();
			} else {
				estadogarantiaclienteAux=(EstadoGarantiaCliente)jComboBoxid_estado_garantia_clienteGarantiaClienteGenerico.getSelectedItem();
			}

			if(estadogarantiaclienteAux!=null && estadogarantiaclienteAux.getId()!=null) {
				garantiacliente.setid_estado_garantia_cliente(estadogarantiaclienteAux.getId());
				garantiacliente.setestadogarantiacliente_descripcion(GarantiaClienteConstantesFunciones.getEstadoGarantiaClienteDescripcion(estadogarantiaclienteAux));
				garantiacliente.setEstadoGarantiaCliente(estadogarantiaclienteAux);			}
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

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
					}

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
					}

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
					}

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteGarantiaCliente.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteGarantiaCliente.addItem(cliente);
							}
						}

						if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoGarantiaEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoGarantiaEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.removeAllItems();

							for(TipoGarantiaEmpresa tipogarantiaempresa:this.tipogarantiaempresasForeignKey) {
								if(tipogarantiaempresa.getes_defecto()) {
									this.garantiaclienteBean.setid_tipo_garantia_empresa(tipogarantiaempresa.getId());
								}

								this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.addItem(tipogarantiaempresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
					}

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoGarantiaEmpresa") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.removeAllItems();

							for(TipoGarantiaEmpresa tipogarantiaempresa:this.tipogarantiaempresasForeignKey) {
								this.jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.addItem(tipogarantiaempresa);
							}
						}

						if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoGarantiaClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoGarantiaCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.removeAllItems();

							for(EstadoGarantiaCliente estadogarantiacliente:this.estadogarantiaclientesForeignKey) {
								this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.addItem(estadogarantiacliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { 
					}

					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoGarantiaCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.removeAllItems();

							for(EstadoGarantiaCliente estadogarantiacliente:this.estadogarantiaclientesForeignKey) {
								this.jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.addItem(estadogarantiacliente);
							}
						}

						if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteGarantiaCliente.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteGarantiaCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoGarantiaEmpresaForeignKey(TipoGarantiaEmpresa tipogarantiaempresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setSelectedItem(tipogarantiaempresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setSelectedItem(tipogarantiaempresa);
						} else {
							this.jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoGarantiaClienteForeignKey(EstadoGarantiaCliente estadogarantiacliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setSelectedItem(estadogarantiacliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setSelectedItem(estadogarantiacliente);
						} else {
							this.jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesGarantiaCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			GarantiaClienteConstantesFunciones.refrescarForeignKeysDescripcionesGarantiaCliente(this.garantiaclienteLogic.getGarantiaClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			GarantiaClienteConstantesFunciones.refrescarForeignKeysDescripcionesGarantiaCliente(this.garantiaclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoGarantiaEmpresa.class));
		classes.add(new Classe(EstadoGarantiaCliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//garantiaclienteLogic.setGarantiaClientes(this.garantiaclientes);
			garantiaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public GarantiaClienteParameterReturnGeneral getGarantiaClienteParameterGeneral() {
		return this.garantiaclienteParameterGeneral;
	}
	
	public void setGarantiaClienteParameterGeneral(GarantiaClienteParameterReturnGeneral garantiaclienteParameterGeneral) {
		this.garantiaclienteParameterGeneral = garantiaclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoGarantiaCliente() {
		return isPermisoTodoGarantiaCliente;
	}

	public void setIsPermisoTodoGarantiaCliente(Boolean isPermisoTodoGarantiaCliente) {
		this.isPermisoTodoGarantiaCliente = isPermisoTodoGarantiaCliente;
	}

	public Boolean getIsPermisoNuevoGarantiaCliente() {
		return isPermisoNuevoGarantiaCliente;
	}

	public void setIsPermisoNuevoGarantiaCliente(Boolean isPermisoNuevoGarantiaCliente) {
		this.isPermisoNuevoGarantiaCliente = isPermisoNuevoGarantiaCliente;
	}

	public Boolean getIsPermisoActualizarGarantiaCliente() {
		return isPermisoActualizarGarantiaCliente;
	}

	public void setIsPermisoActualizarGarantiaCliente(Boolean isPermisoActualizarGarantiaCliente) {
		this.isPermisoActualizarGarantiaCliente = isPermisoActualizarGarantiaCliente;
	}

	public Boolean getIsPermisoEliminarGarantiaCliente() {
		return isPermisoEliminarGarantiaCliente;
	}

	public void setIsPermisoEliminarGarantiaCliente(Boolean isPermisoEliminarGarantiaCliente) {
		this.isPermisoEliminarGarantiaCliente = isPermisoEliminarGarantiaCliente;
	}

	public Boolean getIsPermisoGuardarCambiosGarantiaCliente() {
		return isPermisoGuardarCambiosGarantiaCliente;
	}

	public void setIsPermisoGuardarCambiosGarantiaCliente(Boolean isPermisoGuardarCambiosGarantiaCliente) {
		this.isPermisoGuardarCambiosGarantiaCliente = isPermisoGuardarCambiosGarantiaCliente;
	}
	
	public Boolean getIsPermisoConsultaGarantiaCliente() {
		return isPermisoConsultaGarantiaCliente;
	}

	public void setIsPermisoConsultaGarantiaCliente(Boolean isPermisoConsultaGarantiaCliente) {
		this.isPermisoConsultaGarantiaCliente = isPermisoConsultaGarantiaCliente;
	}

	public Boolean getIsPermisoBusquedaGarantiaCliente() {
		return isPermisoBusquedaGarantiaCliente;
	}

	public void setIsPermisoBusquedaGarantiaCliente(Boolean isPermisoBusquedaGarantiaCliente) {
		this.isPermisoBusquedaGarantiaCliente = isPermisoBusquedaGarantiaCliente;
	}

	public Boolean getIsPermisoReporteGarantiaCliente() {
		return isPermisoReporteGarantiaCliente;
	}

	public void setIsPermisoReporteGarantiaCliente(Boolean isPermisoReporteGarantiaCliente) {
		this.isPermisoReporteGarantiaCliente = isPermisoReporteGarantiaCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioGarantiaCliente() {
		return isPermisoPaginacionMedioGarantiaCliente;
	}

	public void setIsPermisoPaginacionMedioGarantiaCliente(Boolean isPermisoPaginacionMedioGarantiaCliente) {
		this.isPermisoPaginacionMedioGarantiaCliente = isPermisoPaginacionMedioGarantiaCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoGarantiaCliente() {
		return isPermisoPaginacionTodoGarantiaCliente;
	}

	public void setIsPermisoPaginacionTodoGarantiaCliente(Boolean isPermisoPaginacionTodoGarantiaCliente) {
		this.isPermisoPaginacionTodoGarantiaCliente = isPermisoPaginacionTodoGarantiaCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoGarantiaCliente() {
		return isPermisoPaginacionAltoGarantiaCliente;
	}

	public void setIsPermisoPaginacionAltoGarantiaCliente(Boolean isPermisoPaginacionAltoGarantiaCliente) {
		this.isPermisoPaginacionAltoGarantiaCliente = isPermisoPaginacionAltoGarantiaCliente;
	}
	
	public Boolean getIsPermisoCopiarGarantiaCliente() {
		return isPermisoCopiarGarantiaCliente;
	}

	public void setIsPermisoCopiarGarantiaCliente(Boolean isPermisoCopiarGarantiaCliente) {
		this.isPermisoCopiarGarantiaCliente = isPermisoCopiarGarantiaCliente;
	}
	
	public Boolean getIsPermisoVerFormGarantiaCliente() {
		return isPermisoVerFormGarantiaCliente;
	}

	public void setIsPermisoVerFormGarantiaCliente(Boolean isPermisoVerFormGarantiaCliente) {
		this.isPermisoVerFormGarantiaCliente = isPermisoVerFormGarantiaCliente;
	}
	
	public Boolean getIsPermisoDuplicarGarantiaCliente() {
		return isPermisoDuplicarGarantiaCliente;
	}

	public void setIsPermisoDuplicarGarantiaCliente(Boolean isPermisoDuplicarGarantiaCliente) {
		this.isPermisoDuplicarGarantiaCliente = isPermisoDuplicarGarantiaCliente;
	}
	
	public Boolean getIsPermisoOrdenGarantiaCliente() {
		return isPermisoOrdenGarantiaCliente;
	}

	public void setIsPermisoOrdenGarantiaCliente(Boolean isPermisoOrdenGarantiaCliente) {
		this.isPermisoOrdenGarantiaCliente = isPermisoOrdenGarantiaCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoGarantiaCliente() {
		return isVisibilidadCeldaNuevoGarantiaCliente;
	}

	public void setIsVisibilidadCeldaNuevoGarantiaCliente(Boolean isVisibilidadCeldaNuevoGarantiaCliente) {
		this.isVisibilidadCeldaNuevoGarantiaCliente = isVisibilidadCeldaNuevoGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarGarantiaCliente() {
		return isVisibilidadCeldaDuplicarGarantiaCliente;
	}

	public void setIsVisibilidadCeldaDuplicarGarantiaCliente(Boolean isVisibilidadCeldaDuplicarGarantiaCliente) {
		this.isVisibilidadCeldaDuplicarGarantiaCliente = isVisibilidadCeldaDuplicarGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarGarantiaCliente() {
		return isVisibilidadCeldaCopiarGarantiaCliente;
	}

	public void setIsVisibilidadCeldaCopiarGarantiaCliente(Boolean isVisibilidadCeldaCopiarGarantiaCliente) {
		this.isVisibilidadCeldaCopiarGarantiaCliente = isVisibilidadCeldaCopiarGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormGarantiaCliente() {
		return isVisibilidadCeldaVerFormGarantiaCliente;
	}

	public void setIsVisibilidadCeldaVerFormGarantiaCliente(Boolean isVisibilidadCeldaVerFormGarantiaCliente) {
		this.isVisibilidadCeldaVerFormGarantiaCliente = isVisibilidadCeldaVerFormGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenGarantiaCliente() {
		return isVisibilidadCeldaOrdenGarantiaCliente;
	}

	public void setIsVisibilidadCeldaOrdenGarantiaCliente(Boolean isVisibilidadCeldaOrdenGarantiaCliente) {
		this.isVisibilidadCeldaOrdenGarantiaCliente = isVisibilidadCeldaOrdenGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesGarantiaCliente() {
		return isVisibilidadCeldaNuevoRelacionesGarantiaCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesGarantiaCliente(Boolean isVisibilidadCeldaNuevoRelacionesGarantiaCliente) {
		this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente = isVisibilidadCeldaNuevoRelacionesGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarGarantiaCliente() {
		return isVisibilidadCeldaModificarGarantiaCliente;
	}

	public void setIsVisibilidadCeldaModificarGarantiaCliente(Boolean isVisibilidadCeldaModificarGarantiaCliente) {
		this.isVisibilidadCeldaModificarGarantiaCliente = isVisibilidadCeldaModificarGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarGarantiaCliente() {
		return isVisibilidadCeldaActualizarGarantiaCliente;
	}

	public void setIsVisibilidadCeldaActualizarGarantiaCliente(Boolean isVisibilidadCeldaActualizarGarantiaCliente) {
		this.isVisibilidadCeldaActualizarGarantiaCliente = isVisibilidadCeldaActualizarGarantiaCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarGarantiaCliente() {
		return isVisibilidadCeldaEliminarGarantiaCliente;
	}

	public void setIsVisibilidadCeldaEliminarGarantiaCliente(Boolean isVisibilidadCeldaEliminarGarantiaCliente) {
		this.isVisibilidadCeldaEliminarGarantiaCliente = isVisibilidadCeldaEliminarGarantiaCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarGarantiaCliente() {
		return isVisibilidadCeldaCancelarGarantiaCliente;
	}

	public void setIsVisibilidadCeldaCancelarGarantiaCliente(Boolean isVisibilidadCeldaCancelarGarantiaCliente) {
		this.isVisibilidadCeldaCancelarGarantiaCliente = isVisibilidadCeldaCancelarGarantiaCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarGarantiaCliente() {
		return isVisibilidadCeldaGuardarGarantiaCliente;
	}

	public void setIsVisibilidadCeldaGuardarGarantiaCliente(Boolean isVisibilidadCeldaGuardarGarantiaCliente) {
		this.isVisibilidadCeldaGuardarGarantiaCliente = isVisibilidadCeldaGuardarGarantiaCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosGarantiaCliente() {
		return isVisibilidadCeldaGuardarCambiosGarantiaCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosGarantiaCliente(Boolean isVisibilidadCeldaGuardarCambiosGarantiaCliente) {
		this.isVisibilidadCeldaGuardarCambiosGarantiaCliente = isVisibilidadCeldaGuardarCambiosGarantiaCliente;
	}
		
	public GarantiaClienteSessionBean getgarantiaclienteSessionBean() {
		return this.garantiaclienteSessionBean;
	}
	
	public void setgarantiaclienteSessionBean(GarantiaClienteSessionBean garantiaclienteSessionBean) {
		this.garantiaclienteSessionBean=garantiaclienteSessionBean;
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

	public Boolean getisVisibilidadFK_IdEstadoGarantiaCliente() {
		return this.isVisibilidadFK_IdEstadoGarantiaCliente;
	}

	public void setisVisibilidadFK_IdEstadoGarantiaCliente(Boolean isVisibilidadFK_IdEstadoGarantiaCliente) {
		this.isVisibilidadFK_IdEstadoGarantiaCliente=isVisibilidadFK_IdEstadoGarantiaCliente;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoGarantiaEmpresa() {
		return this.isVisibilidadFK_IdTipoGarantiaEmpresa;
	}

	public void setisVisibilidadFK_IdTipoGarantiaEmpresa(Boolean isVisibilidadFK_IdTipoGarantiaEmpresa) {
		this.isVisibilidadFK_IdTipoGarantiaEmpresa=isVisibilidadFK_IdTipoGarantiaEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(GarantiaCliente garantiacliente)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(garantiacliente,null);
				this.setActualParaGuardarSucursalForeignKey(garantiacliente,null);
				this.setActualParaGuardarClienteForeignKey(garantiacliente,null);
				this.setActualParaGuardarTipoGarantiaEmpresaForeignKey(garantiacliente,null);
				this.setActualParaGuardarEstadoGarantiaClienteForeignKey(garantiacliente,null);
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
	
	public void bugActualizarReferenciaActual(GarantiaCliente garantiacliente,GarantiaCliente garantiaclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalGarantiaCliente(garantiacliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		garantiaclienteAux.setId(garantiacliente.getId());
		garantiaclienteAux.setVersionRow(garantiacliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessGarantiaCliente();
		
			int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = garantiaclienteValidator.getInvalidValues(this.garantiacliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			garantiaclienteLogic.setDatosCliente(datosCliente);
			garantiaclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				garantiaclienteAux=new  GarantiaCliente();
				
				garantiaclienteAux.setIsNew(true);
				garantiaclienteAux.setIsChanged(true);
				
				garantiaclienteAux.setGarantiaClienteOriginal(this.garantiacliente);
				
				garantiaclienteAux.setId(this.garantiacliente.getId());	
				garantiaclienteAux.setVersionRow(this.garantiacliente.getVersionRow());	
				garantiaclienteAux.setid_empresa(this.garantiacliente.getid_empresa());	
				garantiaclienteAux.setid_sucursal(this.garantiacliente.getid_sucursal());	
				garantiaclienteAux.setid_cliente(this.garantiacliente.getid_cliente());	
				garantiaclienteAux.setid_tipo_garantia_empresa(this.garantiacliente.getid_tipo_garantia_empresa());	
				garantiaclienteAux.setvalor(this.garantiacliente.getvalor());	
				garantiaclienteAux.setfecha_recepcion(this.garantiacliente.getfecha_recepcion());	
				garantiaclienteAux.setfecha_firma(this.garantiacliente.getfecha_firma());	
				garantiaclienteAux.setfecha_devolucion(this.garantiacliente.getfecha_devolucion());	
				garantiaclienteAux.setbeneficiario(this.garantiacliente.getbeneficiario());	
				garantiaclienteAux.setid_estado_garantia_cliente(this.garantiacliente.getid_estado_garantia_cliente());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.garantiaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(garantiaclienteAux,garantiaclienteLogic.getGarantiaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(garantiaclienteAux,garantiaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.garantiaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteLogic.saveGarantiaClientes();//WithConnection
						//garantiaclienteLogic.getSetVersionRowGarantiaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.garantiacliente,garantiaclienteAux);
					
					this.refrescarForeignKeysDescripcionesGarantiaCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								garantiaclienteLogic.saveGarantiaClienteRelaciones(garantiaclienteAux);//WithConnection
								//garantiaclienteLogic.getSetVersionRowGarantiaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.garantiacliente,garantiaclienteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.garantiaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(garantiaclienteAux,garantiaclienteLogic.getGarantiaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(garantiaclienteAux,garantiaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.garantiacliente,garantiaclienteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				garantiaclienteAux=new  GarantiaCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.garantiaclienteSessionBean.getEsGuardarRelacionado() && this.garantiacliente.getId()>=0)) {
						
					garantiaclienteAux.setIsNew(false);
				}
				
				garantiaclienteAux.setIsDeleted(false);
			
				garantiaclienteAux.setId(this.garantiacliente.getId());	
				garantiaclienteAux.setVersionRow(this.garantiacliente.getVersionRow());	
				garantiaclienteAux.setid_empresa(this.garantiacliente.getid_empresa());	
				garantiaclienteAux.setid_sucursal(this.garantiacliente.getid_sucursal());	
				garantiaclienteAux.setid_cliente(this.garantiacliente.getid_cliente());	
				garantiaclienteAux.setid_tipo_garantia_empresa(this.garantiacliente.getid_tipo_garantia_empresa());	
				garantiaclienteAux.setvalor(this.garantiacliente.getvalor());	
				garantiaclienteAux.setfecha_recepcion(this.garantiacliente.getfecha_recepcion());	
				garantiaclienteAux.setfecha_firma(this.garantiacliente.getfecha_firma());	
				garantiaclienteAux.setfecha_devolucion(this.garantiacliente.getfecha_devolucion());	
				garantiaclienteAux.setbeneficiario(this.garantiacliente.getbeneficiario());	
				garantiaclienteAux.setid_estado_garantia_cliente(this.garantiacliente.getid_estado_garantia_cliente());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(garantiaclienteAux,garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(garantiaclienteAux,garantiaclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.garantiaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteLogic.saveGarantiaClientes();//WithConnection
						//garantiaclienteLogic.getSetVersionRowGarantiaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.garantiacliente,garantiaclienteAux);
					
					this.refrescarForeignKeysDescripcionesGarantiaCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								garantiaclienteLogic.saveGarantiaClienteRelaciones(garantiaclienteAux);//WithConnection
								//garantiaclienteLogic.getSetVersionRowGarantiaClientes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.garantiacliente,garantiaclienteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.garantiaclienteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(garantiaclienteAux,garantiaclienteLogic.getGarantiaClientes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(garantiaclienteAux,garantiaclientes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.garantiacliente,garantiaclienteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				garantiaclienteAux=new  GarantiaCliente();
				
				garantiaclienteAux.setIsNew(false);
				garantiaclienteAux.setIsChanged(false);
				
				garantiaclienteAux.setIsDeleted(true);
				
				garantiaclienteAux.setId(this.garantiacliente.getId());	
				garantiaclienteAux.setVersionRow(this.garantiacliente.getVersionRow());	
				garantiaclienteAux.setid_empresa(this.garantiacliente.getid_empresa());	
				garantiaclienteAux.setid_sucursal(this.garantiacliente.getid_sucursal());	
				garantiaclienteAux.setid_cliente(this.garantiacliente.getid_cliente());	
				garantiaclienteAux.setid_tipo_garantia_empresa(this.garantiacliente.getid_tipo_garantia_empresa());	
				garantiaclienteAux.setvalor(this.garantiacliente.getvalor());	
				garantiaclienteAux.setfecha_recepcion(this.garantiacliente.getfecha_recepcion());	
				garantiaclienteAux.setfecha_firma(this.garantiacliente.getfecha_firma());	
				garantiaclienteAux.setfecha_devolucion(this.garantiacliente.getfecha_devolucion());	
				garantiaclienteAux.setbeneficiario(this.garantiacliente.getbeneficiario());	
				garantiaclienteAux.setid_estado_garantia_cliente(this.garantiacliente.getid_estado_garantia_cliente());	
				
				if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.garantiaclienteAux.getId()>=0) {	
						this.garantiaclientesEliminados.add(garantiaclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(garantiaclienteAux,garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(garantiaclienteAux,garantiaclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.garantiaclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteLogic.saveGarantiaClientes();//WithConnection
						//garantiaclienteLogic.getSetVersionRowGarantiaClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								garantiaclienteLogic.saveGarantiaClienteRelaciones(garantiaclienteAux);//WithConnection
								//garantiaclienteLogic.getSetVersionRowGarantiaClientes();//WithConnection
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
							if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.garantiaclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(garantiaclienteAux,garantiaclienteLogic.getGarantiaClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(garantiaclienteAux,garantiaclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getGarantiaClientes().addAll(this.garantiaclientesEliminados);
					
					garantiaclienteLogic.saveGarantiaClientes();//WithConnection
					//garantiaclienteLogic.getSetVersionRowGarantiaClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesGarantiaCliente();
				
				this.garantiaclientesEliminados= new ArrayList<GarantiaCliente>();		
			}
			
			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Garantia Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.garantiacliente=garantiaclienteAux;
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
      		//this.finishProcessGarantiaCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(GarantiaCliente garantiaclienteLocal) throws Exception {
		
		if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(GarantiaCliente garantiaclienteLocal) throws Exception {	
		if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				garantiaclienteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				garantiaclienteLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				garantiaclienteLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoGarantiaEmpresaDetalleFormJInternalFrame.class)) {
				TipoGarantiaEmpresaBeanSwingJInternalFrame tipogarantiaempresaBeanSwingJInternalFrameLocal=(TipoGarantiaEmpresaBeanSwingJInternalFrame) ((TipoGarantiaEmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipogarantiaempresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoGarantiaEmpresa(tipogarantiaempresaBeanSwingJInternalFrameLocal.gettipogarantiaempresa(),true);
				tipogarantiaempresaBeanSwingJInternalFrameLocal.actualizarLista(tipogarantiaempresaBeanSwingJInternalFrameLocal.tipogarantiaempresa,this.tipogarantiaempresasForeignKey);

				tipogarantiaempresaBeanSwingJInternalFrameLocal.actualizarRelaciones(tipogarantiaempresaBeanSwingJInternalFrameLocal.tipogarantiaempresa);

				garantiaclienteLocal.setTipoGarantiaEmpresa(tipogarantiaempresaBeanSwingJInternalFrameLocal.tipogarantiaempresa);

				this.addItemDefectoCombosForeignKeyTipoGarantiaEmpresa();
				this.cargarCombosFrameTipoGarantiaEmpresasForeignKey("Formulario");
				this.setActualTipoGarantiaEmpresaForeignKey(tipogarantiaempresaBeanSwingJInternalFrameLocal.tipogarantiaempresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoGarantiaClienteDetalleFormJInternalFrame.class)) {
				EstadoGarantiaClienteBeanSwingJInternalFrame estadogarantiaclienteBeanSwingJInternalFrameLocal=(EstadoGarantiaClienteBeanSwingJInternalFrame) ((EstadoGarantiaClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadogarantiaclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoGarantiaCliente(estadogarantiaclienteBeanSwingJInternalFrameLocal.getestadogarantiacliente(),true);
				estadogarantiaclienteBeanSwingJInternalFrameLocal.actualizarLista(estadogarantiaclienteBeanSwingJInternalFrameLocal.estadogarantiacliente,this.estadogarantiaclientesForeignKey);

				estadogarantiaclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(estadogarantiaclienteBeanSwingJInternalFrameLocal.estadogarantiacliente);

				garantiaclienteLocal.setEstadoGarantiaCliente(estadogarantiaclienteBeanSwingJInternalFrameLocal.estadogarantiacliente);

				this.addItemDefectoCombosForeignKeyEstadoGarantiaCliente();
				this.cargarCombosFrameEstadoGarantiaClientesForeignKey("Formulario");
				this.setActualEstadoGarantiaClienteForeignKey(estadogarantiaclienteBeanSwingJInternalFrameLocal.estadogarantiacliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarGarantiaClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = garantiaclienteValidator.getInvalidValues(this.garantiacliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(GarantiaCliente garantiacliente,List<GarantiaCliente> garantiaclientes) throws Exception {
		try	{		
			GarantiaClienteConstantesFunciones.actualizarLista(garantiacliente,garantiaclientes,this.garantiaclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(GarantiaCliente garantiacliente,List<GarantiaCliente> garantiaclientes) throws Exception {
		try	{			
			GarantiaClienteConstantesFunciones.actualizarSelectedLista(garantiacliente,garantiaclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<GarantiaCliente> garantiaclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				garantiaclientesLocal=this.garantiaclienteLogic.getGarantiaClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				garantiaclientesLocal=this.garantiaclientes;
			}
			//ARCHITECTURE
		
			for(GarantiaCliente garantiaclienteLocal:garantiaclientesLocal) {
				if(this.permiteMantenimiento(garantiaclienteLocal) && garantiaclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+GarantiaClienteConstantesFunciones.getGarantiaClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_empresaGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_sucursalGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_clienteGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.IDTIPOGARANTIAEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_tipo_garantia_empresaGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelvalorGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.FECHARECEPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_recepcionGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.FECHAFIRMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_firmaGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.FECHADEVOLUCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_devolucionGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.BENEFICIARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelbeneficiarioGarantiaCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(GarantiaClienteConstantesFunciones.IDESTADOGARANTIACLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_estado_garantia_clienteGarantiaCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_empresaGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_sucursalGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_clienteGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_tipo_garantia_empresaGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelvalorGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_recepcionGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_firmaGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_devolucionGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelbeneficiarioGarantiaCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormGarantiaCliente.jLabelid_estado_garantia_clienteGarantiaCliente,"");
		
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
		this.iIdNuevoGarantiaCliente--;	
		
		
		this.garantiaclienteAux=new GarantiaCliente();
		
		this.garantiaclienteAux.setId(this.iIdNuevoGarantiaCliente);
		this.garantiaclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.garantiaclienteLogic.getGarantiaClientes().add(this.garantiaclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.garantiaclientes.add(this.garantiaclienteAux);
		}
		//ARCHITECTURE
		
		this.garantiacliente=this.garantiaclienteAux;
		
		if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioGarantiaCliente(this.garantiacliente);
			this.setVariablesObjetoActualToFormularioForeignKeyGarantiaCliente(this.garantiacliente);
		}
				
		//this.setDefaultControlesGarantiaCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyGarantiaCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyGarantiaCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyGarantiaCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGarantiaCliente(this.garantiaclienteBean,this.garantiacliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(GarantiaClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
			classes=GarantiaClienteConstantesFunciones.getClassesRelationshipsOfGarantiaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.garantiaclienteReturnGeneral=garantiaclienteLogic.procesarEventosGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.garantiaclienteLogic.getGarantiaClientes(),this.garantiacliente,this.garantiaclienteParameterGeneral,this.isEsNuevoGarantiaCliente,classes);//this.garantiaclienteLogic.getGarantiaCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanGarantiaCliente(this.garantiaclienteReturnGeneral,this.garantiaclienteBean,false);
		
		if(this.garantiaclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyGarantiaCliente(this.garantiaclienteReturnGeneral.getGarantiaCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioGarantiaCliente(this.garantiaclienteReturnGeneral.getGarantiaCliente());
		}
		
		if(this.garantiaclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioGarantiaCliente(this.garantiaclienteReturnGeneral.getGarantiaCliente(),classes);//this.garantiaclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyGarantiaCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyGarantiaCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.RecargarFormGarantiaCliente(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingGarantiaCliente(false);
						
			if(garantiaclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGarantiaCliente();
			}
			
			this.actualizarVisualTableDatosGarantiaCliente();
			
			this.jTableDatosGarantiaCliente.setRowSelectionInterval(this.getIndiceNuevoGarantiaCliente(), this.getIndiceNuevoGarantiaCliente());
			
			this.seleccionarFilaTablaGarantiaClienteActual();
						
			this.actualizarEstadoCeldasBotonesGarantiaCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesGarantiaCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormGarantiaCliente.jTextFieldvalorGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarvalorGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_recepcionGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarfecha_recepcionGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_firmaGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarfecha_firmaGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_devolucionGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarfecha_devolucionGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jTextAreabeneficiarioGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarbeneficiarioGarantiaCliente);	
		//
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarid_empresaGarantiaCliente);//
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarid_sucursalGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarid_clienteGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarid_tipo_garantia_empresaGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setEnabled(isHabilitar && this.garantiaclienteConstantesFunciones.activarid_estado_garantia_clienteGarantiaCliente);
	};
	
	public void setDefaultControlesGarantiaCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoGarantiaCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.garantiaclienteSessionBean.setConGuardarRelaciones(true);			
			this.garantiaclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.setVisible(true);
			
					
		} else {
			//this.garantiaclienteSessionBean.setConGuardarRelaciones(false);			
			this.garantiaclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoGarantiaCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
				if(garantiaclienteAux.getId().equals(this.iIdNuevoGarantiaCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GarantiaCliente garantiaclienteAux:this.garantiaclientes) {
				if(garantiaclienteAux.getId().equals(this.iIdNuevoGarantiaCliente)) {
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
	
	public int getIndiceActualGarantiaCliente(GarantiaCliente garantiacliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
				if(garantiaclienteAux.getId().equals(garantiacliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GarantiaCliente garantiaclienteAux:this.garantiaclientes) {
				if(garantiaclienteAux.getId().equals(garantiacliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalGarantiaCliente(GarantiaCliente garantiaclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
				if(garantiaclienteAux.getGarantiaClienteOriginal().getId().equals(garantiaclienteOriginal.getId())) {
					existe=true;
					garantiaclienteOriginal.setId(garantiaclienteAux.getId());
					garantiaclienteOriginal.setVersionRow(garantiaclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GarantiaCliente garantiaclienteAux:this.garantiaclientes) {
				if(garantiaclienteAux.getGarantiaClienteOriginal().getId().equals(garantiaclienteOriginal.getId())) {
					existe=true;
					garantiaclienteOriginal.setId(garantiaclienteAux.getId());
					garantiaclienteOriginal.setVersionRow(garantiaclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosGarantiaCliente(Boolean esParaCancelar) throws Exception {
		garantiaclientesAux=new ArrayList<GarantiaCliente>();
		garantiaclienteAux=new GarantiaCliente();
		
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
					if(garantiaclienteAux.getId()<0) {
						garantiaclientesAux.add(garantiaclienteAux);
					}		
				}
				this.iIdNuevoGarantiaCliente=0L;
				this.garantiaclienteLogic.getGarantiaClientes().removeAll(garantiaclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GarantiaCliente garantiaclienteAux:this.garantiaclientes) {
					if(garantiaclienteAux.getId()<0) {
						garantiaclientesAux.add(garantiaclienteAux);
					}		
				}
				this.iIdNuevoGarantiaCliente=0L;
				this.garantiaclientes.removeAll(garantiaclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoGarantiaCliente 
					&& this.garantiaclienteLogic.getGarantiaClientes().size()>0
					) {
					garantiaclienteAux=this.garantiaclienteLogic.getGarantiaClientes().get(this.garantiaclienteLogic.getGarantiaClientes().size() - 1);
				
					if(garantiaclienteAux.getId()<0) {
						this.garantiaclienteLogic.getGarantiaClientes().remove(garantiaclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoGarantiaCliente && this.garantiaclientes.size()>0) {
					garantiaclienteAux=this.garantiaclientes.get(this.garantiaclientes.size() - 1);
				
					if(garantiaclienteAux.getId()<0) {
						this.garantiaclientes.remove(garantiaclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoGarantiaCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(garantiacliente.getId()<0) {
				this.garantiaclienteLogic.getGarantiaClientes().remove(this.garantiacliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(garantiacliente.getId()<0) {
				this.garantiaclientes.remove(this.garantiacliente);
			}
		}			
	}
	
	public void setEstadosInicialesGarantiaCliente(List<GarantiaCliente> garantiaclientesAux) throws Exception {
		GarantiaClienteConstantesFunciones.setEstadosInicialesGarantiaCliente(garantiaclientesAux);
	}
	
	public void setEstadosInicialesGarantiaCliente(GarantiaCliente garantiaclienteAux) throws Exception {
		GarantiaClienteConstantesFunciones.setEstadosInicialesGarantiaCliente(garantiaclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarGarantiaClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarGarantiaClienteActual()) {
				if(!this.isEsNuevoGarantiaCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoGarantiaCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarGarantiaClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Garantia Cliente ?", "MANTENIMIENTO DE Garantia Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(GarantiaCliente garantiacliente) throws Exception {
		GarantiaClienteConstantesFunciones.seleccionarAsignar(this.garantiacliente,garantiacliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarGarantiaCliente=this.isPermisoActualizarOriginalGarantiaCliente;
			
			
			this.seleccionarAsignar(garantiacliente);
			
			

			idClienteActual=garantiacliente.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			GarantiaClienteConstantesFunciones.quitarEspaciosGarantiaCliente(this.garantiacliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesGarantiaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.garantiaclienteSessionBean.setsFuncionBusquedaRapida(this.garantiaclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoGarantiaCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosGarantiaCliente(esParaCancelar);				
				this.cancelarNuevoGarantiaCliente(esParaCancelar);								
			}
			
			this.garantiacliente=new GarantiaCliente();
			
			this.inicializarGarantiaCliente();
			
			this.actualizarEstadoCeldasBotonesGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarGarantiaCliente() throws Exception {
		try {
			GarantiaClienteConstantesFunciones.inicializarGarantiaCliente(this.garantiacliente);
			
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
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.garantiaclienteLogic.getGarantiaClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteGarantiaClientes(String sAccionBusqueda,List<GarantiaCliente> garantiaclientesParaReportes) throws Exception {
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
					sPathReporteFinal="GarantiaCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="GarantiaClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("GarantiaClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="GarantiaCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Garantia Clientes");		
		parameters.put("busquedapor", GarantiaClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceGarantiaCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			GarantiaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			GarantiaClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceGarantiaCliente=new JRBeanArrayDataSource(GarantiaClienteJInternalFrame.TraerGarantiaClienteBeans(garantiaclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceGarantiaCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+GarantiaClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+GarantiaClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(GarantiaClienteBean.TraerGarantiaClienteBeans(garantiaclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,garantiaclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,garantiaclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoGarantiaClienteActionPerformed(null);
					//this.generarExcelReporteGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,garantiaclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,garantiaclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,garantiaclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesGarantiaClientes(sAccionBusqueda,sTipoArchivoReporte,garantiaclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteGarantiaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<GarantiaCliente> garantiaclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"garantiacliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GarantiaClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGarantiaCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(GarantiaCliente garantiacliente : garantiaclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			GarantiaClienteConstantesFunciones.generarExcelReporteDataGarantiaCliente("NORMAL",row,workbook,garantiacliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderGarantiaCliente(String sTipo,Row row,Workbook workbook) {
		
		GarantiaClienteConstantesFunciones.generarExcelReporteHeaderGarantiaCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalGarantiaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<GarantiaCliente> garantiaclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"garantiacliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GarantiaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(GarantiaCliente garantiacliente : garantiaclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(GarantiaClienteConstantesFunciones.getGarantiaClienteDescripcion(garantiacliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.gettipogarantiaempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getfecha_recepcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getfecha_firma());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getfecha_devolucion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getbeneficiario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(garantiacliente.getestadogarantiacliente_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesGarantiaClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<GarantiaCliente> garantiaclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<GarantiaCliente> garantiaclientesRespaldo=null;
		
		classes=GarantiaClienteConstantesFunciones.getClassesRelationshipsOfGarantiaCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.garantiaclienteLogic.setDatosCliente(this.datosCliente);
		this.garantiaclienteLogic.setDatosDeep(this.datosDeep);
		this.garantiaclienteLogic.setIsConDeep(true);
		
		garantiaclientesRespaldo=this.garantiaclienteLogic.getGarantiaClientes();
		
		this.garantiaclienteLogic.setGarantiaClientes(garantiaclientesParaReportes);	
		this.garantiaclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		garantiaclientesParaReportes=this.garantiaclienteLogic.getGarantiaClientes();
		this.garantiaclienteLogic.setGarantiaClientes(garantiaclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"garantiacliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("GarantiaClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderGarantiaCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(GarantiaCliente garantiacliente : garantiaclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderGarantiaCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			GarantiaClienteConstantesFunciones.generarExcelReporteDataGarantiaCliente("NORMAL",row,workbook,garantiacliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(GarantiaClienteConstantesFunciones.getGarantiaClienteDescripcion(garantiacliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoGarantiaCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessGarantiaCliente() throws Exception {		
		this.startProcessGarantiaCliente(true);
	}
	
	public void startProcessGarantiaCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasGarantiaCliente ,this.jPanelParametrosReportesGarantiaCliente, this.jScrollPanelDatosGarantiaCliente,this.jPanelPaginacionGarantiaCliente, this.jScrollPanelDatosEdicionGarantiaCliente, this.jPanelAccionesGarantiaCliente,this.jPanelAccionesFormularioGarantiaCliente,this.jmenuBarGarantiaCliente,this.jmenuBarDetalleGarantiaCliente,this.jTtoolBarGarantiaCliente,this.jTtoolBarDetalleGarantiaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasGarantiaCliente=this.jTabbedPaneBusquedasGarantiaCliente; 
		
		final JPanel jPanelParametrosReportesGarantiaCliente=this.jPanelParametrosReportesGarantiaCliente;
		//final JScrollPane jScrollPanelDatosGarantiaCliente=this.jScrollPanelDatosGarantiaCliente;
		final JTable jTableDatosGarantiaCliente=this.jTableDatosGarantiaCliente;		
		final JPanel jPanelPaginacionGarantiaCliente=this.jPanelPaginacionGarantiaCliente;
		//final JScrollPane jScrollPanelDatosEdicionGarantiaCliente=this.jScrollPanelDatosEdicionGarantiaCliente;
		final JPanel jPanelAccionesGarantiaCliente=this.jPanelAccionesGarantiaCliente;
		
		JPanel jPanelCamposAuxiliarGarantiaCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarGarantiaCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			jPanelCamposAuxiliarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jPanelCamposGarantiaCliente;
			jPanelAccionesFormularioAuxiliarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jPanelAccionesFormularioGarantiaCliente;
		}
		
		final JPanel jPanelCamposGarantiaCliente=jPanelCamposAuxiliarGarantiaCliente;
		final JPanel jPanelAccionesFormularioGarantiaCliente=jPanelAccionesFormularioAuxiliarGarantiaCliente;
		
		
		final JMenuBar jmenuBarGarantiaCliente=this.jmenuBarGarantiaCliente;
		final JToolBar jTtoolBarGarantiaCliente=this.jTtoolBarGarantiaCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarGarantiaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGarantiaCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			jmenuBarDetalleAuxiliarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jmenuBarDetalleGarantiaCliente;
			jTtoolBarDetalleAuxiliarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jTtoolBarDetalleGarantiaCliente;
		}
		
		final JMenuBar jmenuBarDetalleGarantiaCliente=jmenuBarDetalleAuxiliarGarantiaCliente;
		final JToolBar jTtoolBarDetalleGarantiaCliente=jTtoolBarDetalleAuxiliarGarantiaCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGarantiaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGarantiaCliente;
			processRunnable.jTableDatos=jTableDatosGarantiaCliente;
			processRunnable.jPanelCampos=jPanelCamposGarantiaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionGarantiaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesGarantiaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGarantiaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarGarantiaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGarantiaCliente;
			processRunnable.jTtoolBar=jTtoolBarGarantiaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGarantiaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGarantiaCliente ,jPanelParametrosReportesGarantiaCliente,jTableDatosGarantiaCliente, /*jScrollPanelDatosGarantiaCliente,*/jPanelCamposGarantiaCliente,jPanelPaginacionGarantiaCliente, /*jScrollPanelDatosEdicionGarantiaCliente,*/ jPanelAccionesGarantiaCliente,jPanelAccionesFormularioGarantiaCliente,jmenuBarGarantiaCliente,jmenuBarDetalleGarantiaCliente,jTtoolBarGarantiaCliente,jTtoolBarDetalleGarantiaCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasGarantiaCliente ,jPanelParametrosReportesGarantiaCliente, jScrollPanelDatosGarantiaCliente,jPanelPaginacionGarantiaCliente, jScrollPanelDatosEdicionGarantiaCliente, jPanelAccionesGarantiaCliente,jPanelAccionesFormularioGarantiaCliente,jmenuBarGarantiaCliente,jmenuBarDetalleGarantiaCliente,jTtoolBarGarantiaCliente,jTtoolBarDetalleGarantiaCliente);
						
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
	
	public void finishProcessGarantiaCliente() {// throws Exception 
		this.finishProcessGarantiaCliente(true);
	}
	
	public void finishProcessGarantiaCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasGarantiaCliente ,this.jPanelParametrosReportesGarantiaCliente, this.jScrollPanelDatosGarantiaCliente,this.jPanelPaginacionGarantiaCliente, this.jScrollPanelDatosEdicionGarantiaCliente, this.jPanelAccionesGarantiaCliente,this.jPanelAccionesFormularioGarantiaCliente,this.jmenuBarGarantiaCliente,this.jmenuBarDetalleGarantiaCliente,this.jTtoolBarGarantiaCliente,this.jTtoolBarDetalleGarantiaCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasGarantiaCliente=this.jTabbedPaneBusquedasGarantiaCliente; 
		
		final JPanel jPanelParametrosReportesGarantiaCliente=this.jPanelParametrosReportesGarantiaCliente;
		//final JScrollPane jScrollPanelDatosGarantiaCliente=this.jScrollPanelDatosGarantiaCliente;
		final JTable jTableDatosGarantiaCliente=this.jTableDatosGarantiaCliente;		
		final JPanel jPanelPaginacionGarantiaCliente=this.jPanelPaginacionGarantiaCliente;
		//final JScrollPane jScrollPanelDatosEdicionGarantiaCliente=this.jScrollPanelDatosEdicionGarantiaCliente;
		final JPanel jPanelAccionesGarantiaCliente=this.jPanelAccionesGarantiaCliente;
		
		JPanel jPanelCamposAuxiliarGarantiaCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarGarantiaCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			jPanelCamposAuxiliarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jPanelCamposGarantiaCliente;
			jPanelAccionesFormularioAuxiliarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jPanelAccionesFormularioGarantiaCliente;
		}
		
		final JPanel jPanelCamposGarantiaCliente=jPanelCamposAuxiliarGarantiaCliente;
		final JPanel jPanelAccionesFormularioGarantiaCliente=jPanelAccionesFormularioAuxiliarGarantiaCliente;
		
		
		final JMenuBar jmenuBarGarantiaCliente=this.jmenuBarGarantiaCliente;		
		final JToolBar jTtoolBarGarantiaCliente=this.jTtoolBarGarantiaCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarGarantiaCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarGarantiaCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			jmenuBarDetalleAuxiliarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jmenuBarDetalleGarantiaCliente;
			jTtoolBarDetalleAuxiliarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jTtoolBarDetalleGarantiaCliente;		
		}
		
		final JMenuBar jmenuBarDetalleGarantiaCliente=jmenuBarDetalleAuxiliarGarantiaCliente;
		final JToolBar jTtoolBarDetalleGarantiaCliente=jTtoolBarDetalleAuxiliarGarantiaCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasGarantiaCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesGarantiaCliente;
			processRunnable.jTableDatos=jTableDatosGarantiaCliente;
			processRunnable.jPanelCampos=jPanelCamposGarantiaCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionGarantiaCliente;
			processRunnable.jPanelAcciones=jPanelAccionesGarantiaCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioGarantiaCliente;
			
			
			processRunnable.jmenuBar=jmenuBarGarantiaCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleGarantiaCliente;
			processRunnable.jTtoolBar=jTtoolBarGarantiaCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleGarantiaCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasGarantiaCliente ,jPanelParametrosReportesGarantiaCliente, jTableDatosGarantiaCliente,/*jScrollPanelDatosGarantiaCliente,*/jPanelCamposGarantiaCliente,jPanelPaginacionGarantiaCliente, /*jScrollPanelDatosEdicionGarantiaCliente,*/ jPanelAccionesGarantiaCliente,jPanelAccionesFormularioGarantiaCliente,jmenuBarGarantiaCliente,jmenuBarDetalleGarantiaCliente,jTtoolBarGarantiaCliente,jTtoolBarDetalleGarantiaCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesGarantiaCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarGarantiaCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuGarantiaCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarGarantiaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarGarantiaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleGarantiaCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuGarantiaCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarGarantiaCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleGarantiaCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.garantiaclienteConstantesFunciones.getsFinalQueryGarantiaCliente();
		String  finalQueryPaginacionTodos=this.garantiaclienteConstantesFunciones.getsFinalQueryGarantiaCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=GarantiaClienteConstantesFunciones.getArrayColumnasGlobalesNoGarantiaCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=GarantiaClienteConstantesFunciones.getArrayColumnasGlobalesGarantiaCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,GarantiaClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.garantiaclientesEliminados= new ArrayList<GarantiaCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessGarantiaCliente();
		
				///*GarantiaClienteSessionBean*/this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			
			if(this.garantiaclienteSessionBean==null) {
				this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
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
					this.iNumeroPaginacion=GarantiaClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=GarantiaClienteConstantesFunciones.getClassesForeignKeysOfGarantiaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/garantiacliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			garantiaclientesAux= new ArrayList<GarantiaCliente>();
			
				
			garantiaclienteLogic.setDatosCliente(this.datosCliente);
			garantiaclienteLogic.setDatosDeep(this.datosDeep);
			garantiaclienteLogic.setIsConDeep(true);
			
			
			garantiaclienteLogic.getGarantiaClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					garantiaclienteLogic.getTodosGarantiaClientes(finalQueryGlobal,pagination);
					
					//garantiaclienteLogic.getTodosGarantiaClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(garantiaclienteLogic.getGarantiaClientes()==null|| garantiaclienteLogic.getGarantiaClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							garantiaclientesAux= new ArrayList<GarantiaCliente>();
							garantiaclientesAux.addAll(garantiaclienteLogic.getGarantiaClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientesAux= new ArrayList<GarantiaCliente>();
							garantiaclientesAux.addAll(garantiaclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							garantiaclienteLogic.getTodosGarantiaClientes(finalQueryGlobal+"",this.pagination);												
							
							//garantiaclienteLogic.getTodosGarantiaClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteGarantiaClientes("Todos",garantiaclienteLogic.getGarantiaClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());					
							garantiaclienteLogic.getGarantiaClientes().addAll(garantiaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientes=new ArrayList<GarantiaCliente>();
							garantiaclientes.addAll(garantiaclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idGarantiaCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idGarantiaCliente=this.idActual;
				
				} else if(this.idGarantiaClienteActual!=null && this.idGarantiaClienteActual!=0L) {
					idGarantiaCliente=idGarantiaClienteActual;
				}
				
					
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndicePorId(idGarantiaCliente);
				
				this.garantiaclientes=new ArrayList<GarantiaCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					garantiaclienteLogic.getEntity(idGarantiaCliente);
					
					//garantiaclienteLogic.getEntityWithConnection(idGarantiaCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
					garantiaclienteLogic.getGarantiaClientes().add(garantiaclienteLogic.getGarantiaCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.garantiaclientes=new ArrayList<GarantiaCliente>();
					this.garantiaclientes.add(garantiacliente);
				}
				
				if(garantiaclienteLogic.getGarantiaCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					garantiaclienteLogic.getGarantiaClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=garantiaclienteLogic.getGarantiaClientes()==null||garantiaclienteLogic.getGarantiaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=garantiaclientes==null|| garantiaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclientesAux=new ArrayList<GarantiaCliente>();
						garantiaclientesAux.addAll(garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientesAux=new ArrayList<GarantiaCliente>();
							garantiaclientesAux.addAll(garantiaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							garantiaclienteLogic.getGarantiaClientesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGarantiaClientes("FK_IdCliente",garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGarantiaClientes("FK_IdCliente",garantiaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
						garantiaclienteLogic.getGarantiaClientes().addAll(garantiaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientes=new ArrayList<GarantiaCliente>();
							garantiaclientes.addAll(garantiaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					garantiaclienteLogic.getGarantiaClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=garantiaclienteLogic.getGarantiaClientes()==null||garantiaclienteLogic.getGarantiaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=garantiaclientes==null|| garantiaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclientesAux=new ArrayList<GarantiaCliente>();
						garantiaclientesAux.addAll(garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientesAux=new ArrayList<GarantiaCliente>();
							garantiaclientesAux.addAll(garantiaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							garantiaclienteLogic.getGarantiaClientesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGarantiaClientes("FK_IdEmpresa",garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGarantiaClientes("FK_IdEmpresa",garantiaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
						garantiaclienteLogic.getGarantiaClientes().addAll(garantiaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientes=new ArrayList<GarantiaCliente>();
							garantiaclientes.addAll(garantiaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoGarantiaCliente")) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoGarantiaCliente(id_estado_garantia_clienteFK_IdEstadoGarantiaCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					garantiaclienteLogic.getGarantiaClientesFK_IdEstadoGarantiaCliente(finalQueryGlobal,pagination,id_estado_garantia_clienteFK_IdEstadoGarantiaCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoGarantiaCliente(id_estado_garantia_clienteFK_IdEstadoGarantiaCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoGarantiaCliente(id_estado_garantia_clienteFK_IdEstadoGarantiaCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=garantiaclienteLogic.getGarantiaClientes()==null||garantiaclienteLogic.getGarantiaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=garantiaclientes==null|| garantiaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclientesAux=new ArrayList<GarantiaCliente>();
						garantiaclientesAux.addAll(garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientesAux=new ArrayList<GarantiaCliente>();
							garantiaclientesAux.addAll(garantiaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							garantiaclienteLogic.getGarantiaClientesFK_IdEstadoGarantiaCliente(finalQueryGlobal,pagination,id_estado_garantia_clienteFK_IdEstadoGarantiaCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoGarantiaCliente(id_estado_garantia_clienteFK_IdEstadoGarantiaCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdEstadoGarantiaCliente(id_estado_garantia_clienteFK_IdEstadoGarantiaCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGarantiaClientes("FK_IdEstadoGarantiaCliente",garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGarantiaClientes("FK_IdEstadoGarantiaCliente",garantiaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
						garantiaclienteLogic.getGarantiaClientes().addAll(garantiaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientes=new ArrayList<GarantiaCliente>();
							garantiaclientes.addAll(garantiaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					garantiaclienteLogic.getGarantiaClientesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=garantiaclienteLogic.getGarantiaClientes()==null||garantiaclienteLogic.getGarantiaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=garantiaclientes==null|| garantiaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclientesAux=new ArrayList<GarantiaCliente>();
						garantiaclientesAux.addAll(garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientesAux=new ArrayList<GarantiaCliente>();
							garantiaclientesAux.addAll(garantiaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							garantiaclienteLogic.getGarantiaClientesFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGarantiaClientes("FK_IdSucursal",garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGarantiaClientes("FK_IdSucursal",garantiaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
						garantiaclienteLogic.getGarantiaClientes().addAll(garantiaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientes=new ArrayList<GarantiaCliente>();
							garantiaclientes.addAll(garantiaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoGarantiaEmpresa")) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGarantiaEmpresa(id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					garantiaclienteLogic.getGarantiaClientesFK_IdTipoGarantiaEmpresa(finalQueryGlobal,pagination,id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGarantiaEmpresa(id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGarantiaEmpresa(id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=garantiaclienteLogic.getGarantiaClientes()==null||garantiaclienteLogic.getGarantiaClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=garantiaclientes==null|| garantiaclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclientesAux=new ArrayList<GarantiaCliente>();
						garantiaclientesAux.addAll(garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientesAux=new ArrayList<GarantiaCliente>();
							garantiaclientesAux.addAll(garantiaclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							garantiaclienteLogic.getGarantiaClientesFK_IdTipoGarantiaEmpresa(finalQueryGlobal,pagination,id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGarantiaEmpresa(id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=GarantiaClienteConstantesFunciones.getDetalleIndiceFK_IdTipoGarantiaEmpresa(id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteGarantiaClientes("FK_IdTipoGarantiaEmpresa",garantiaclienteLogic.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteGarantiaClientes("FK_IdTipoGarantiaEmpresa",garantiaclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteLogic.setGarantiaClientes(new ArrayList<GarantiaCliente>());
						garantiaclienteLogic.getGarantiaClientes().addAll(garantiaclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclientes=new ArrayList<GarantiaCliente>();
							garantiaclientes.addAll(garantiaclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesGarantiaCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessGarantiaCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=garantiaclienteLogic.getGarantiaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=garantiaclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=garantiaclienteLogic.getGarantiaClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=garantiaclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(GarantiaCliente garantiacliente) {
		Boolean permite=true;
		
		if(this.garantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=GarantiaClienteConstantesFunciones.getOrderByListaGarantiaCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=GarantiaClienteConstantesFunciones.getOrderByListaGarantiaCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GarantiaCliente garantiacliente:garantiaclienteLogic.getGarantiaClientes()) {
				if(garantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
					garantiaclienteTotales=garantiacliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GarantiaCliente garantiacliente:this.garantiaclientes) {
				if(garantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
					garantiaclienteTotales=garantiacliente;
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
			this.garantiaclienteAux=new GarantiaCliente();
			this.garantiaclienteAux.setsType(Constantes2.S_TOTALES);
			this.garantiaclienteAux.setIsNew(false);
			this.garantiaclienteAux.setIsChanged(false);
			this.garantiaclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				GarantiaClienteConstantesFunciones.TotalizarValoresFilaGarantiaCliente(this.garantiaclienteLogic.getGarantiaClientes(),this.garantiaclienteAux);
				
				this.garantiaclienteLogic.getGarantiaClientes().add(this.garantiaclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				GarantiaClienteConstantesFunciones.TotalizarValoresFilaGarantiaCliente(this.garantiaclientes,this.garantiaclienteAux);
				
				this.garantiaclientes.add(this.garantiaclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		garantiaclienteTotales=new GarantiaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.garantiaclienteLogic.getGarantiaClientes().remove(garantiaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.garantiaclientes.remove(garantiaclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		garantiaclienteTotales=new GarantiaCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(GarantiaCliente garantiacliente:garantiaclienteLogic.getGarantiaClientes()) {
				if(garantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
					garantiaclienteTotales=garantiacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GarantiaClienteConstantesFunciones.TotalizarValoresFilaGarantiaCliente(this.garantiaclienteLogic.getGarantiaClientes(),garantiaclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(GarantiaCliente garantiacliente:this.garantiaclientes) {
				if(garantiacliente.getsType().equals(Constantes2.S_TOTALES)) {
					garantiaclienteTotales=garantiacliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				GarantiaClienteConstantesFunciones.TotalizarValoresFilaGarantiaCliente(this.garantiaclientes,garantiaclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getGarantiaClientesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGarantiaClientesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGarantiaClientesFK_IdEstadoGarantiaCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoGarantiaCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGarantiaClientesFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getGarantiaClientesFK_IdTipoGarantiaEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoGarantiaEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getGarantiaClientesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					garantiaclienteLogic.getGarantiaClientesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGarantiaClientesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					garantiaclienteLogic.getGarantiaClientesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGarantiaClientesFK_IdEstadoGarantiaCliente(String sFinalQuery,Long id_estado_garantia_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					garantiaclienteLogic.getGarantiaClientesFK_IdEstadoGarantiaCliente(sFinalQuery,this.pagination,id_estado_garantia_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGarantiaClientesFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					garantiaclienteLogic.getGarantiaClientesFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getGarantiaClientesFK_IdTipoGarantiaEmpresa(String sFinalQuery,Long id_tipo_garantia_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					garantiaclienteLogic.getGarantiaClientesFK_IdTipoGarantiaEmpresa(sFinalQuery,this.pagination,id_tipo_garantia_empresa);
				
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
	
	public void inicializarPermisosGarantiaCliente() {
		this.isPermisoTodoGarantiaCliente=false;
		this.isPermisoNuevoGarantiaCliente=false;
		this.isPermisoActualizarGarantiaCliente=false;
		this.isPermisoActualizarOriginalGarantiaCliente=false;
		this.isPermisoEliminarGarantiaCliente=false;
		this.isPermisoGuardarCambiosGarantiaCliente=false;
		this.isPermisoConsultaGarantiaCliente=false;
		this.isPermisoBusquedaGarantiaCliente=false;
		this.isPermisoReporteGarantiaCliente=false;		
		this.isPermisoOrdenGarantiaCliente=false;		
		this.isPermisoPaginacionMedioGarantiaCliente=false;		
		this.isPermisoPaginacionAltoGarantiaCliente=false;
		this.isPermisoPaginacionTodoGarantiaCliente=false;
		this.isPermisoCopiarGarantiaCliente=false;		
		this.isPermisoVerFormGarantiaCliente=false;		
		this.isPermisoDuplicarGarantiaCliente=false;		
		this.isPermisoOrdenGarantiaCliente=false;		
	}
	
	public void setPermisosUsuarioGarantiaCliente(Boolean isPermiso) {
		this.isPermisoTodoGarantiaCliente=isPermiso;
		this.isPermisoNuevoGarantiaCliente=isPermiso;
		this.isPermisoActualizarGarantiaCliente=isPermiso;
		this.isPermisoActualizarOriginalGarantiaCliente=isPermiso;
		this.isPermisoEliminarGarantiaCliente=isPermiso;
		this.isPermisoGuardarCambiosGarantiaCliente=isPermiso;
		this.isPermisoConsultaGarantiaCliente=isPermiso;
		this.isPermisoBusquedaGarantiaCliente=isPermiso;
		this.isPermisoReporteGarantiaCliente=isPermiso;
		this.isPermisoOrdenGarantiaCliente=isPermiso;		
		this.isPermisoPaginacionMedioGarantiaCliente=isPermiso;		
		this.isPermisoPaginacionAltoGarantiaCliente=isPermiso;		
		this.isPermisoPaginacionTodoGarantiaCliente=isPermiso;		
		this.isPermisoCopiarGarantiaCliente=isPermiso;		
		this.isPermisoVerFormGarantiaCliente=isPermiso;		
		this.isPermisoDuplicarGarantiaCliente=isPermiso;
		this.isPermisoOrdenGarantiaCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioGarantiaCliente(Boolean isPermiso) {
		//this.isPermisoTodoGarantiaCliente=isPermiso;
		this.isPermisoNuevoGarantiaCliente=isPermiso;
		this.isPermisoActualizarGarantiaCliente=isPermiso;
		this.isPermisoActualizarOriginalGarantiaCliente=isPermiso;
		this.isPermisoEliminarGarantiaCliente=isPermiso;
		this.isPermisoGuardarCambiosGarantiaCliente=isPermiso;
		//this.isPermisoConsultaGarantiaCliente=isPermiso;
		//this.isPermisoBusquedaGarantiaCliente=isPermiso;
		//this.isPermisoReporteGarantiaCliente=isPermiso;
		//this.isPermisoOrdenGarantiaCliente=isPermiso;		
		//this.isPermisoPaginacionMedioGarantiaCliente=isPermiso;		
		//this.isPermisoPaginacionAltoGarantiaCliente=isPermiso;		
		//this.isPermisoPaginacionTodoGarantiaCliente=isPermiso;		
		//this.isPermisoCopiarGarantiaCliente=isPermiso;		
		//this.isPermisoDuplicarGarantiaCliente=isPermiso;
		//this.isPermisoOrdenGarantiaCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioGarantiaClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(GarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebGarantiaCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioGarantiaClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioGarantiaClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionGarantiaClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioGarantiaClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioGarantiaCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(GarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, GarantiaClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoGarantiaCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarGarantiaCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalGarantiaCliente=this.isPermisoActualizarGarantiaCliente;
			this.isPermisoEliminarGarantiaCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosGarantiaCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaGarantiaCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaGarantiaCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoGarantiaCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteGarantiaCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGarantiaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioGarantiaCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoGarantiaCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoGarantiaCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarGarantiaCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormGarantiaCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarGarantiaCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenGarantiaCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosGarantiaCliente.setToolTipText(this.jTableDatosGarantiaCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioGarantiaCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioGarantiaCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(GarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(GarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioGarantiaCliente() throws Exception {
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
	public void inicializarCombosForeignKeyGarantiaClienteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.tipogarantiaempresasForeignKey=new ArrayList();
				this.estadogarantiaclientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyGarantiaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(GarantiaClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyGarantiaClienteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoGarantiaEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoGarantiaClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTipoGarantiaEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipogarantiaempresasForeignKey==null||this.tipogarantiaempresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoGarantiaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoGarantiaEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGarantiaEmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoGarantiaEmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoGarantiaEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoGarantiaClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadogarantiaclientesForeignKey==null||this.estadogarantiaclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoGarantiaClienteConstantesFunciones.getArrayColumnasGlobalesEstadoGarantiaCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoGarantiaClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoGarantiaClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoGarantiaClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyGarantiaClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			GarantiaClienteParameterReturnGeneral garantiaclienteReturnGeneral=new GarantiaClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.garantiaclienteConstantesFunciones.cargarid_empresaGarantiaCliente)
					 || (this.esRecargarFks && this.garantiaclienteConstantesFunciones.cargarid_empresaGarantiaCliente)) {

					if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+garantiaclienteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.garantiaclienteConstantesFunciones.cargarid_sucursalGarantiaCliente)
					 || (this.esRecargarFks && this.garantiaclienteConstantesFunciones.cargarid_sucursalGarantiaCliente)) {

					if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+garantiaclienteSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.garantiaclienteConstantesFunciones.cargarid_clienteGarantiaCliente)
					 || (this.esRecargarFks && this.garantiaclienteConstantesFunciones.cargarid_clienteGarantiaCliente)) {

					if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+garantiaclienteSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoGarantiaEmpresa="";

				if(((this.tipogarantiaempresasForeignKey==null||this.tipogarantiaempresasForeignKey.size()<=0) && this.garantiaclienteConstantesFunciones.cargarid_tipo_garantia_empresaGarantiaCliente)
					 || (this.esRecargarFks && this.garantiaclienteConstantesFunciones.cargarid_tipo_garantia_empresaGarantiaCliente)) {

					if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoGarantiaEmpresaConstantesFunciones.getArrayColumnasGlobalesTipoGarantiaEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoGarantiaEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoGarantiaEmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoGarantiaEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoGarantiaEmpresa, "");
						finalQueryGlobalTipoGarantiaEmpresa+=TipoGarantiaEmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoGarantiaEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoGarantiaEmpresa=" WHERE " + ConstantesSql.ID + "="+garantiaclienteSessionBean.getlidTipoGarantiaEmpresaActual();
					}
				} else {
					finalQueryGlobalTipoGarantiaEmpresa="NONE";
				}


				String finalQueryGlobalEstadoGarantiaCliente="";

				if(((this.estadogarantiaclientesForeignKey==null||this.estadogarantiaclientesForeignKey.size()<=0) && this.garantiaclienteConstantesFunciones.cargarid_estado_garantia_clienteGarantiaCliente)
					 || (this.esRecargarFks && this.garantiaclienteConstantesFunciones.cargarid_estado_garantia_clienteGarantiaCliente)) {

					if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEstadoGarantiaCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoGarantiaClienteConstantesFunciones.getArrayColumnasGlobalesEstadoGarantiaCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoGarantiaCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoGarantiaClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoGarantiaCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoGarantiaCliente, "");
						finalQueryGlobalEstadoGarantiaCliente+=EstadoGarantiaClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoGarantiaClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoGarantiaCliente=" WHERE " + ConstantesSql.ID + "="+garantiaclienteSessionBean.getlidEstadoGarantiaClienteActual();
					}
				} else {
					finalQueryGlobalEstadoGarantiaCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				garantiaclienteReturnGeneral=garantiaclienteLogic.cargarCombosLoteForeignKeyGarantiaCliente(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalCliente,finalQueryGlobalTipoGarantiaEmpresa,finalQueryGlobalEstadoGarantiaCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=garantiaclienteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=garantiaclienteReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=garantiaclienteReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoGarantiaEmpresa.equals("NONE")) {
				this.tipogarantiaempresasForeignKey=garantiaclienteReturnGeneral.gettipogarantiaempresasForeignKey();
			}

			if(!finalQueryGlobalEstadoGarantiaCliente.equals("NONE")) {
				this.estadogarantiaclientesForeignKey=garantiaclienteReturnGeneral.getestadogarantiaclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyGarantiaCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoGarantiaEmpresa();
			this.addItemDefectoCombosForeignKeyEstadoGarantiaCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.garantiaclienteSessionBean==null) {
				this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyTipoGarantiaEmpresa()throws Exception {
		try {

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionTipoGarantiaEmpresa()) {
				TipoGarantiaEmpresa tipogarantiaempresa=new TipoGarantiaEmpresa();
				TipoGarantiaEmpresaConstantesFunciones.setTipoGarantiaEmpresaDescripcion(tipogarantiaempresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipogarantiaempresa.setId(null);

				if(!TipoGarantiaEmpresaConstantesFunciones.ExisteEnLista(this.tipogarantiaempresasForeignKey,tipogarantiaempresa,true)) {

					this.tipogarantiaempresasForeignKey.add(0,tipogarantiaempresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEstadoGarantiaCliente()throws Exception {
		try {

			if(!this.garantiaclienteSessionBean.getisBusquedaDesdeForeignKeySesionEstadoGarantiaCliente()) {
				EstadoGarantiaCliente estadogarantiacliente=new EstadoGarantiaCliente();
				EstadoGarantiaClienteConstantesFunciones.setEstadoGarantiaClienteDescripcion(estadogarantiacliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadogarantiacliente.setId(null);

				if(!EstadoGarantiaClienteConstantesFunciones.ExisteEnLista(this.estadogarantiaclientesForeignKey,estadogarantiacliente,true)) {

					this.estadogarantiaclientesForeignKey.add(0,estadogarantiacliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyGarantiaCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyGarantiaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyGarantiaCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.garantiacliente.setfecha_recepcion(this.parametroGeneralUsuario.getfecha_sistema());
				this.garantiacliente.setfecha_firma(this.parametroGeneralUsuario.getfecha_sistema());
				this.garantiacliente.setfecha_devolucion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyGarantiaCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyGarantiaCliente(GarantiaCliente garantiacliente)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(garantiacliente.getid_cliente(),false,"Formulario");
			this.setActualTipoGarantiaEmpresaForeignKey(garantiacliente.getid_tipo_garantia_empresa(),false,"Formulario");
			this.setActualEstadoGarantiaClienteForeignKey(garantiacliente.getid_estado_garantia_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyGarantiaCliente(GarantiaCliente garantiacliente,String sTipoEvento)throws Exception {	
		try {
			
			

				if(garantiacliente.getCliente()!=null && !sTipoEvento.equals("id_clienteGarantiaCliente")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(garantiacliente.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyGarantiaCliente()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.garantiaclienteConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoGarantiaEmpresaForeignKey(this.garantiaclienteConstantesFunciones.getid_tipo_garantia_empresa(),false,"Formulario");
			this.setActualEstadoGarantiaClienteForeignKey(this.garantiaclienteConstantesFunciones.getid_estado_garantia_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyGarantiaCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyGarantiaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyGarantiaCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroGarantiaCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyGarantiaCliente()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoGarantiaEmpresasForeignKey("Todos");
			this.cargarCombosFrameEstadoGarantiaClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyGarantiaCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoGarantiaEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoGarantiaClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyGarantiaCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public GarantiaClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public GarantiaClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public GarantiaClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.garantiaclienteSessionBean=new GarantiaClienteSessionBean(); 
		this.garantiaclienteConstantesFunciones=new GarantiaClienteConstantesFunciones(); 
		this.garantiaclienteBean=new GarantiaCliente();//(this.garantiaclienteConstantesFunciones); 		
		this.garantiaclienteReturnGeneral=new GarantiaClienteParameterReturnGeneral(); 
		
		this.garantiaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.garantiaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public GarantiaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public GarantiaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public GarantiaClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessGarantiaCliente(true);
			
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
			
			this.garantiaclienteConstantesFunciones=new GarantiaClienteConstantesFunciones(); 
			this.garantiaclienteBean=new GarantiaCliente();//this.garantiaclienteConstantesFunciones); 			
			this.garantiaclienteReturnGeneral=new GarantiaClienteParameterReturnGeneral(); 
		
			GarantiaClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Garantia Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.garantiacliente=new GarantiaCliente();
			this.garantiaclientes = new ArrayList<GarantiaCliente>();
			this.garantiaclientesAux = new ArrayList<GarantiaCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic=new GarantiaClienteLogic();
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.garantiaclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.garantiaclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormGarantiaCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGarantiaCliente);	
					}
					
					if(this.jInternalFrameImportacionGarantiaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGarantiaCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByGarantiaCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByGarantiaCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormGarantiaCliente);
				this.jInternalFrameDetalleFormGarantiaCliente.setVisible(false);
				this.jInternalFrameDetalleFormGarantiaCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGarantiaCliente);
					this.jInternalFrameReporteDinamicoGarantiaCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoGarantiaCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionGarantiaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionGarantiaCliente);
					this.jInternalFrameImportacionGarantiaCliente.setVisible(false);
					this.jInternalFrameImportacionGarantiaCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByGarantiaCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByGarantiaCliente);
					this.jInternalFrameOrderByGarantiaCliente.setVisible(false);
					this.jInternalFrameOrderByGarantiaCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idGarantiaClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=GarantiaClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.garantiaclienteReturnGeneral=new GarantiaClienteParameterReturnGeneral();
			
			this.garantiaclienteParameterGeneral=new GarantiaClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.garantiaclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(GarantiaClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GarantiaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.garantiaclienteSessionBean.getEsGuardarRelacionado(),this.garantiaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,GarantiaClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.garantiaclienteSessionBean.getEsGuardarRelacionado(),this.garantiaclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoGarantiaCliente=false;
			this.isVisibilidadCeldaDuplicarGarantiaCliente=true;
			this.isVisibilidadCeldaCopiarGarantiaCliente=true;
			this.isVisibilidadCeldaVerFormGarantiaCliente=true;
			this.isVisibilidadCeldaOrdenGarantiaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
			this.isVisibilidadCeldaModificarGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoGarantiaCliente=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoGarantiaEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosGarantiaCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioGarantiaCliente(false);
			
			this.setPermisosUsuarioGarantiaCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.garantiaclienteSessionBean.getEsGuardarRelacionado() && this.garantiaclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioGarantiaClienteClasesRelacionadas();
			}
			
			if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioGarantiaClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosGarantiaCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualGarantiaCliente();
			}
			
			if(!this.isPermisoBusquedaGarantiaCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioGarantiaCliente,this.isPermisoPaginacionMedioGarantiaCliente,this.isPermisoPaginacionTodoGarantiaCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(GarantiaClienteConstantesFunciones.getTiposSeleccionarGarantiaCliente());
				
				this.tiposColumnasSelect=GarantiaClienteConstantesFunciones.getTiposSeleccionarGarantiaCliente(true);
				
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
			//if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioGarantiaCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioGarantiaCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioGarantiaCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesGarantiaCliente() ;
			
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
			this.tipogarantiaempresaLogic=new TipoGarantiaEmpresaLogic();
			this.estadogarantiaclienteLogic=new EstadoGarantiaClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				garantiaclienteImplementable= (GarantiaClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GarantiaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				garantiaclienteImplementableHome= (GarantiaClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+GarantiaClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.garantiaclientes= new ArrayList<GarantiaCliente>();
			this.garantiaclientesEliminados= new ArrayList<GarantiaCliente>();
						
			this.isEsNuevoGarantiaCliente=false;
			this.esParaAccionDesdeFormularioGarantiaCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipogarantiaempresasForeignKey=new ArrayList<TipoGarantiaEmpresa>() ;
			this.estadogarantiaclientesForeignKey=new ArrayList<EstadoGarantiaCliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyGarantiaCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroGarantiaCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			GarantiaClienteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=GarantiaClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesGarantiaCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingGarantiaCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioGarantiaCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioGarantiaCliente();
			}
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasGarantiaCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasGarantiaCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasGarantiaCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessGarantiaCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga GarantiaCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectGarantiaCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesGarantiaCliente")) {
				iIndex=this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessGarantiaCliente();	
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
	
	public void cargarCombosForeignKeyGarantiaCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyGarantiaCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyGarantiaCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyGarantiaClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyGarantiaCliente();
		
		this.cargarCombosFrameForeignKeyGarantiaCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyGarantiaCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyGarantiaCliente();
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

	public void cargarCombosForeignKeyTipoGarantiaEmpresa(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoGarantiaEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoGarantiaEmpresa();
				this.cargarCombosFrameTipoGarantiaEmpresasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoGarantiaEmpresa(this.tipogarantiaempresasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEstadoGarantiaCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoGarantiaClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoGarantiaCliente();
				this.cargarCombosFrameEstadoGarantiaClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoGarantiaCliente(this.estadogarantiaclientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoGarantiaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
			
			if(jTableDatosGarantiaCliente.getRowCount()>=1) {
				jTableDatosGarantiaCliente.removeRowSelectionInterval(0, jTableDatosGarantiaCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoGarantiaCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoGarantiaCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesGarantiaCliente(true);			
			//this.garantiacliente=new GarantiaCliente();
			//this.garantiacliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGarantiaCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGarantiaCliente() ;
			
			if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGarantiaCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.garantiacliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);				
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
			if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar GarantiaCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarGarantiaClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosGarantiaCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosGarantiaCliente.getSelectedRows().length;			
			}
			
			garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoGarantiaCliente--;			
				//GarantiaCliente garantiaclienteAux= new GarantiaCliente();			
				//garantiaclienteAux.setId(this.iIdNuevoGarantiaCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//GarantiaCliente garantiaclienteOrigen=new GarantiaCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(GarantiaCliente garantiaclienteOrigen : garantiaclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							garantiaclienteOrigen =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							garantiaclienteOrigen =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaGarantiaCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.garantiacliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosGarantiaCliente(garantiaclienteOrigen,this.garantiacliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.garantiaclienteLogic.getGarantiaClientes().add(this.garantiaclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.garantiaclientes.add(this.garantiaclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaGarantiaCliente(false);
				
				this.jTableDatosGarantiaCliente.setRowSelectionInterval(this.getIndiceNuevoGarantiaCliente(), this.getIndiceNuevoGarantiaCliente());
				
				int iLastRow =  this.jTableDatosGarantiaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGarantiaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGarantiaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGarantiaCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();									
		
			GarantiaCliente garantiaclienteOrigen=new GarantiaCliente();
			GarantiaCliente garantiaclienteDestino=new GarantiaCliente();
				
			garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosGarantiaCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || garantiaclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosGarantiaCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteOrigen =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						garantiaclienteOrigen =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						garantiaclienteDestino =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						garantiaclienteDestino =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				garantiaclienteOrigen =garantiaclientesSeleccionados.get(0);
				garantiaclienteDestino =garantiaclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosGarantiaCliente(garantiaclienteOrigen,garantiaclienteDestino,true,false);
				
				garantiaclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(garantiaclienteDestino,garantiaclienteLogic.getGarantiaClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(garantiaclienteDestino,garantiaclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaGarantiaCliente(false);
				
				//this.jTableDatosGarantiaCliente.setRowSelectionInterval(this.getIndiceNuevoGarantiaCliente(), this.getIndiceNuevoGarantiaCliente());
				
				int iLastRow =  this.jTableDatosGarantiaCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosGarantiaCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosGarantiaCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaGarantiaCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormGarantiaCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesGarantiaCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasGarantiaCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesGarantiaCliente.setVisible(!isVisible);
			this.jPanelPaginacionGarantiaCliente.setVisible(!isVisible);
			this.jPanelAccionesGarantiaCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameGarantiaCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoGarantiaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionGarantiaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByGarantiaCliente();
			
			this.abrirFrameOrderByGarantiaCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByGarantiaCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleGarantiaCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormGarantiaCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormGarantiaCliente.isMaximum()) {
					this.jInternalFrameDetalleFormGarantiaCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormGarantiaCliente.setSize(this.jInternalFrameDetalleFormGarantiaCliente.iWidthFormulario,this.jInternalFrameDetalleFormGarantiaCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormGarantiaCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormGarantiaCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormGarantiaCliente.isMaximum()) {
						this.jInternalFrameDetalleFormGarantiaCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormGarantiaCliente.jContentPaneDetalleGarantiaCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormGarantiaCliente.jContentPaneDetalleGarantiaCliente.getWidth(),GarantiaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormGarantiaCliente.jContentPaneDetalleGarantiaCliente.getWidth(),GarantiaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormGarantiaCliente.jContentPaneDetalleGarantiaCliente.getWidth(),GarantiaClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormGarantiaCliente.setVisible(true);
	        this.jInternalFrameDetalleFormGarantiaCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByGarantiaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByGarantiaCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByGarantiaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGarantiaCliente,false,this);
				} else {
					this.jInternalFrameOrderByGarantiaCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByGarantiaCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByGarantiaCliente);
				this.jInternalFrameOrderByGarantiaCliente.setVisible(false);
				this.jInternalFrameOrderByGarantiaCliente.setSelected(false);
				
				this.jInternalFrameOrderByGarantiaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGarantiaCliente"));
				
				this.inicializarActualizarBindingTablaOrderByGarantiaCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionGarantiaCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionGarantiaCliente==null) {
				
				this.jInternalFrameImportacionGarantiaCliente=new ImportacionJInternalFrame(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionGarantiaCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionGarantiaCliente);
				this.jInternalFrameImportacionGarantiaCliente.setVisible(false);
				this.jInternalFrameImportacionGarantiaCliente.setSelected(false);


				this.jInternalFrameImportacionGarantiaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGarantiaCliente"));
				this.jInternalFrameImportacionGarantiaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGarantiaCliente"));
				this.jInternalFrameImportacionGarantiaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGarantiaCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoGarantiaCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoGarantiaCliente==null) {
				this.jInternalFrameReporteDinamicoGarantiaCliente=new ReporteDinamicoJInternalFrame(GarantiaClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoGarantiaCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoGarantiaCliente);
				this.jInternalFrameReporteDinamicoGarantiaCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoGarantiaCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoGarantiaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGarantiaCliente"));
				this.jInternalFrameReporteDinamicoGarantiaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGarantiaCliente"));
				this.jInternalFrameReporteDinamicoGarantiaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGarantiaCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGarantiaCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleGarantiaCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormGarantiaCliente);
			
	       	this.jInternalFrameDetalleFormGarantiaCliente.setVisible(false);
	        this.jInternalFrameDetalleFormGarantiaCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormGarantiaCliente.dispose();
			//this.jInternalFrameDetalleFormGarantiaCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoGarantiaCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoGarantiaCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoGarantiaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionGarantiaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionGarantiaCliente.setVisible(true);
	        this.jInternalFrameImportacionGarantiaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByGarantiaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByGarantiaCliente.setVisible(true);
	        this.jInternalFrameOrderByGarantiaCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByGarantiaCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByGarantiaCliente.setVisible(false);
	        this.jInternalFrameOrderByGarantiaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoGarantiaCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoGarantiaCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoGarantiaCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionGarantiaCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionGarantiaCliente.setVisible(false);
	        this.jInternalFrameImportacionGarantiaCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarGarantiaCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarGarantiaCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesGarantiaCliente(true);
			//this.isEsNuevoGarantiaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesGarantiaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGarantiaCliente(false) ;
			
			if(garantiaclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGarantiaCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGarantiaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaGarantiaClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarGarantiaCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesGarantiaCliente(true);
			//this.isEsNuevoGarantiaCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.garantiacliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesGarantiaCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesGarantiaCliente(false) ;
			
			if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleGarantiaCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGarantiaCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.garantiaclienteConstantesFunciones.cargarid_clienteGarantiaCliente) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingGarantiaCliente(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGarantiaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoGarantiaEmpresa(List<TipoGarantiaEmpresa> tipogarantiaempresasForeignKey)throws Exception{
		TableColumn tableColumnTipoGarantiaEmpresa=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA));
		TableCellEditor tableCellEditorTipoGarantiaEmpresa =tableColumnTipoGarantiaEmpresa.getCellEditor();

		TipoGarantiaEmpresaTableCell tipogarantiaempresaTableCellFk=(TipoGarantiaEmpresaTableCell)tableCellEditorTipoGarantiaEmpresa;

		if(tipogarantiaempresaTableCellFk!=null) {
			tipogarantiaempresaTableCellFk.settipogarantiaempresasForeignKey(tipogarantiaempresasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGarantiaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipogarantiaempresaTableCellFk.setRowActual(intSelectedRow);
			//tipogarantiaempresaTableCellFk.settipogarantiaempresasForeignKeyActual(tipogarantiaempresasForeignKey);
		//}


		if(tipogarantiaempresaTableCellFk!=null) {
			tipogarantiaempresaTableCellFk.RecargarTipoGarantiaEmpresasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoGarantiaCliente(List<EstadoGarantiaCliente> estadogarantiaclientesForeignKey)throws Exception{
		TableColumn tableColumnEstadoGarantiaCliente=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE));
		TableCellEditor tableCellEditorEstadoGarantiaCliente =tableColumnEstadoGarantiaCliente.getCellEditor();

		EstadoGarantiaClienteTableCell estadogarantiaclienteTableCellFk=(EstadoGarantiaClienteTableCell)tableCellEditorEstadoGarantiaCliente;

		if(estadogarantiaclienteTableCellFk!=null) {
			estadogarantiaclienteTableCellFk.setestadogarantiaclientesForeignKey(estadogarantiaclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosGarantiaCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadogarantiaclienteTableCellFk.setRowActual(intSelectedRow);
			//estadogarantiaclienteTableCellFk.setestadogarantiaclientesForeignKeyActual(estadogarantiaclientesForeignKey);
		//}


		if(estadogarantiaclienteTableCellFk!=null) {
			estadogarantiaclienteTableCellFk.RecargarEstadoGarantiaClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesGarantiaCliente(false);
			
			//if(!this.isEsNuevoGarantiaCliente) {								
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				
			}
			
			if(this.permiteMantenimiento(this.garantiacliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoGarantiaCliente=true;
					this.inicializarActualizarBindingTablaGarantiaCliente(false);
					this.isEsNuevoGarantiaCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoGarantiaCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoGarantiaCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGarantiaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGarantiaCliente(false);
				
				this.habilitarDeshabilitarControlesGarantiaCliente(false);
			
												
				
				if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleGarantiaCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoGarantiaClienteActionPerformed(evt,garantiaclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualGarantiaCliente(this.garantiacliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosGarantiaCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,garantiaclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.garantiacliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				this.garantiacliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				this.garantiacliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.garantiacliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((GarantiaClienteModel) this.jTableDatosGarantiaCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoGarantiaCliente=true;
				this.inicializarActualizarBindingTablaGarantiaCliente(false);
				this.isEsNuevoGarantiaCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesGarantiaCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGarantiaCliente(false);
				
				this.habilitarDeshabilitarControlesGarantiaCliente(false);
				
				
				
				if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleGarantiaCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosGarantiaCliente.getRowCount()>=1) {
				jTableDatosGarantiaCliente.removeRowSelectionInterval(0, jTableDatosGarantiaCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesGarantiaCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaGarantiaCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesGarantiaCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualGarantiaCliente(false) ;
			
			this.isEsNuevoGarantiaCliente=false;
			
			if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleGarantiaCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingGarantiaCliente(false);
				
				//SI ES MANUAL
				if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualGarantiaCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoGarantiaCliente--;			
			//GarantiaCliente garantiaclienteAux= new GarantiaCliente();			
			//garantiaclienteAux.setId(this.iIdNuevoGarantiaCliente);
			
			if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaGarantiaCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
			
			this.garantiacliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.garantiaclienteLogic.getGarantiaClientes().add(this.garantiaclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.garantiaclientes.add(this.garantiaclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaGarantiaCliente(false);
			
			this.jTableDatosGarantiaCliente.setRowSelectionInterval(this.getIndiceNuevoGarantiaCliente(), this.getIndiceNuevoGarantiaCliente());
			
			int iLastRow =  this.jTableDatosGarantiaCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosGarantiaCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosGarantiaCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaGarantiaCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingGarantiaCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGarantiaCliente(false);
			
			//SI ES MANUAL
			if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGarantiaCliente();
			}
			
			//this.abrirFrameTreeGarantiaCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Garantia ClienteS ?", "MANTENIMIENTO DE Garantia Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionGarantiaCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralGarantiaCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.garantiaclienteReturnGeneral=garantiaclienteLogic.procesarImportacionGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.garantiaclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarGarantiaClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionGarantiaCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionGarantiaCliente.setFileImportacion(this.jInternalFrameImportacionGarantiaCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionGarantiaCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionGarantiaCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionGarantiaCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionGarantiaCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		

		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("GarantiaClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"GarantiaClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteGarantiaClientes("Todos",garantiaclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoGarantiaEmpresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoGarantiaEmpresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoGarantiaEmpresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoGarantiaEmpresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaRecepcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaRecepcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaRecepcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaRecepcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaFirma_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaFirma_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaFirma_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaFirma_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaDevolucion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaDevolucion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaDevolucion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaDevolucion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_neficiario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_neficiario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_neficiario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_neficiario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoGarantiaCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoGarantiaCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoGarantiaCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoGarantiaCliente_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoGarantiaCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA:
					sNombreCampoCategoria="id_tipo_garantia_empresa";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION:
					sNombreCampoCategoria="fecha_recepcion";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA:
					sNombreCampoCategoria="fecha_firma";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION:
					sNombreCampoCategoria="fecha_devolucion";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoria="beneficiario";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE:
					sNombreCampoCategoria="id_estado_garantia_cliente";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA:
					sNombreCampoCategoriaValor="id_tipo_garantia_empresa";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION:
					sNombreCampoCategoriaValor="fecha_recepcion";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA:
					sNombreCampoCategoriaValor="fecha_firma";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION:
					sNombreCampoCategoriaValor="fecha_devolucion";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO:
					sNombreCampoCategoriaValor="beneficiario";
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE:
					sNombreCampoCategoriaValor="id_estado_garantia_cliente";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Garantia Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_garantia_empresa");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Recepcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_recepcion");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Firma",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_firma");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Devolucion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_devolucion");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Beneficiario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"beneficiario");
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Garantia Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_garantia_cliente");
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
	
	public void jButtonGenerarExcelReporteDinamicoGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"garantiacliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("GarantiaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.gettipogarantiaempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getfecha_recepcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getfecha_firma());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getfecha_devolucion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getbeneficiario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE);
					iRow++;

					for(GarantiaCliente garantiacliente:garantiaclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(garantiacliente.getestadogarantiacliente_descripcion());
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
			//	this.getFilaCabeceraExportarExcelGarantiaCliente(row);				
			//	iRow++;
			//}				
			
			//for(GarantiaCliente garantiaclienteAux:garantiaclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelGarantiaCliente(garantiaclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGarantiaCliente(false);
			
			//SI ES MANUAL
			if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualGarantiaCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGarantiaCliente(false);
			
			//SI ES MANUAL
			if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGarantiaCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingGarantiaCliente(false);
			
			//SI ES MANUAL
			if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualGarantiaCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaGarantiaCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosGarantiaCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosGarantiaCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosGarantiaCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosGarantiaCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosGarantiaCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosGarantiaCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosGarantiaCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingGarantiaCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingGarantiaCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingGarantiaCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaGarantiaCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesGarantiaCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasGarantiaCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGarantiaCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesGarantiaCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualGarantiaCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaGarantiaCliente();
		
		this.inicializarActualizarBindingBotonesManualGarantiaCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualGarantiaCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesGarantiaCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualGarantiaCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualGarantiaCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosGarantiaCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosGarantiaCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteGarantiaCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormGarantiaCliente.jCheckBoxPostAccionNuevoGarantiaCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormGarantiaCliente.jCheckBoxPostAccionSinCerrarGarantiaCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormGarantiaCliente.jCheckBoxPostAccionSinMensajeGarantiaCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosGarantiaCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosGarantiaCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteGarantiaCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
				this.jInternalFrameDetalleFormGarantiaCliente.jCheckBoxPostAccionNuevoGarantiaCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormGarantiaCliente.jCheckBoxPostAccionSinCerrarGarantiaCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormGarantiaCliente.jCheckBoxPostAccionSinMensajeGarantiaCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionGarantiaCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionGarantiaCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesGarantiaCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesGarantiaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesGarantiaCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarGarantiaCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesGarantiaCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesGarantiaCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralGarantiaCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesGarantiaCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualGarantiaCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesGarantiaCliente() throws Exception {
		try	{
			if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualGarantiaCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGarantiaCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualGarantiaCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesGarantiaCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesGarantiaCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesGarantiaCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionGarantiaCliente.addItem(reporte);
			}
			
			
			if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionGarantiaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionGarantiaCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesGarantiaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesGarantiaCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarGarantiaCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarGarantiaCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarGarantiaCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGarantiaCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualGarantiaCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
				this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
				this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoGarantiaCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=GarantiaClienteConstantesFunciones.getTiposSeleccionarGarantiaCliente(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=GarantiaClienteConstantesFunciones.getTiposSeleccionarGarantiaCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=GarantiaClienteConstantesFunciones.getTiposSeleccionarGarantiaCliente(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoGarantiaCliente.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualGarantiaCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteGarantiaCliente.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteGarantiaCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.getSelectedItem()!=null){this.id_estado_garantia_clienteFK_IdEstadoGarantiaCliente=((EstadoGarantiaCliente)this.jComboBoxid_estado_garantia_clienteFK_IdEstadoGarantiaClienteGarantiaCliente.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.getSelectedItem()!=null){this.id_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa=((TipoGarantiaEmpresa)this.jComboBoxid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresaGarantiaCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasGarantiaCliente(Boolean esInicializar) throws Exception {				
		if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualGarantiaCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaGarantiaCliente() throws Exception {
		this.inicializarActualizarBindingTablaGarantiaCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByGarantiaCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosGarantiaClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaGarantiaCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=garantiaclienteLogic.getGarantiaClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=garantiaclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosGarantiaCliente.setModel(new GarantiaClienteModel(this.garantiaclienteLogic.getGarantiaClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosGarantiaCliente.setModel(new GarantiaClienteModel(this.garantiaclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByGarantiaCliente!=null && this.jInternalFrameOrderByGarantiaCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByGarantiaCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO,garantiaclienteConstantesFunciones.resaltarSeleccionarGarantiaCliente,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+GarantiaClienteConstantesFunciones.SCLASSWEBTITULO,garantiaclienteConstantesFunciones.resaltarSeleccionarGarantiaCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_ID));

		if(this.garantiaclienteConstantesFunciones.mostraridGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.garantiaclienteConstantesFunciones.resaltaridGarantiaCliente,this.garantiaclienteConstantesFunciones.activaridGarantiaCliente,iSizeTabla,this,true,"idGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.garantiaclienteConstantesFunciones.resaltaridGarantiaCliente,this.garantiaclienteConstantesFunciones.activaridGarantiaCliente,this,true,"idGarantiaCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.garantiaclienteConstantesFunciones.mostrarid_empresaGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_empresaGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_empresaGarantiaCliente,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_empresaGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_empresaGarantiaCliente,false,"id_empresaGarantiaCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.garantiaclienteConstantesFunciones.mostrarid_sucursalGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_sucursalGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_sucursalGarantiaCliente,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_sucursalGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_sucursalGarantiaCliente,false,"id_sucursalGarantiaCliente","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE));

		if(this.garantiaclienteConstantesFunciones.mostrarid_clienteGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_clienteGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_clienteGarantiaCliente,iSizeTabla));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_clienteGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_clienteGarantiaCliente,true,"id_clienteGarantiaCliente","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA));

		if(this.garantiaclienteConstantesFunciones.mostrarid_tipo_garantia_empresaGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoGarantiaEmpresaTableCell(this.tipogarantiaempresasForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_tipo_garantia_empresaGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_tipo_garantia_empresaGarantiaCliente,iSizeTabla));
			tableColumn.setCellEditor(new TipoGarantiaEmpresaTableCell(this.tipogarantiaempresasForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_tipo_garantia_empresaGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_tipo_garantia_empresaGarantiaCliente,true,"id_tipo_garantia_empresaGarantiaCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_VALOR));

		if(this.garantiaclienteConstantesFunciones.mostrarvalorGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.garantiaclienteConstantesFunciones.resaltarvalorGarantiaCliente,this.garantiaclienteConstantesFunciones.activarvalorGarantiaCliente,iSizeTabla,this,true,"valorGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.garantiaclienteConstantesFunciones.resaltarvalorGarantiaCliente,this.garantiaclienteConstantesFunciones.activarvalorGarantiaCliente,this,true,"valorGarantiaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION));

		if(this.garantiaclienteConstantesFunciones.mostrarfecha_recepcionGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.garantiaclienteConstantesFunciones.resaltarfecha_recepcionGarantiaCliente,this.garantiaclienteConstantesFunciones.activarfecha_recepcionGarantiaCliente,iSizeTabla,this,true,"fecha_recepcionGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.garantiaclienteConstantesFunciones.resaltarfecha_recepcionGarantiaCliente,this.garantiaclienteConstantesFunciones.activarfecha_recepcionGarantiaCliente,this,true,"fecha_recepcionGarantiaCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA));

		if(this.garantiaclienteConstantesFunciones.mostrarfecha_firmaGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.garantiaclienteConstantesFunciones.resaltarfecha_firmaGarantiaCliente,this.garantiaclienteConstantesFunciones.activarfecha_firmaGarantiaCliente,iSizeTabla,this,true,"fecha_firmaGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.garantiaclienteConstantesFunciones.resaltarfecha_firmaGarantiaCliente,this.garantiaclienteConstantesFunciones.activarfecha_firmaGarantiaCliente,this,true,"fecha_firmaGarantiaCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION));

		if(this.garantiaclienteConstantesFunciones.mostrarfecha_devolucionGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.garantiaclienteConstantesFunciones.resaltarfecha_devolucionGarantiaCliente,this.garantiaclienteConstantesFunciones.activarfecha_devolucionGarantiaCliente,iSizeTabla,this,true,"fecha_devolucionGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.garantiaclienteConstantesFunciones.resaltarfecha_devolucionGarantiaCliente,this.garantiaclienteConstantesFunciones.activarfecha_devolucionGarantiaCliente,this,true,"fecha_devolucionGarantiaCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO));

		if(this.garantiaclienteConstantesFunciones.mostrarbeneficiarioGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.garantiaclienteConstantesFunciones.resaltarbeneficiarioGarantiaCliente,this.garantiaclienteConstantesFunciones.activarbeneficiarioGarantiaCliente,iSizeTabla,this,true,"beneficiarioGarantiaCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.garantiaclienteConstantesFunciones.resaltarbeneficiarioGarantiaCliente,this.garantiaclienteConstantesFunciones.activarbeneficiarioGarantiaCliente,this,true,"beneficiarioGarantiaCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE));

		if(this.garantiaclienteConstantesFunciones.mostrarid_estado_garantia_clienteGarantiaCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoGarantiaClienteTableCell(this.estadogarantiaclientesForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_estado_garantia_clienteGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_estado_garantia_clienteGarantiaCliente,iSizeTabla));
			tableColumn.setCellEditor(new EstadoGarantiaClienteTableCell(this.estadogarantiaclientesForeignKey,this.garantiaclienteConstantesFunciones.resaltarid_estado_garantia_clienteGarantiaCliente,this,this.garantiaclienteConstantesFunciones.activarid_estado_garantia_clienteGarantiaCliente,true,"id_estado_garantia_clienteGarantiaCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new GarantiaClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.garantiaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.garantiaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGarantiaCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.garantiaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.garantiaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosGarantiaCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.garantiaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.garantiaclienteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosGarantiaCliente.addColumn(tableColumn);
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
			
			this.jTableDatosGarantiaCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosGarantiaCliente.moveColumn(this.jTableDatosGarantiaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosGarantiaCliente.moveColumn(this.jTableDatosGarantiaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosGarantiaCliente.moveColumn(this.jTableDatosGarantiaCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosGarantiaCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosGarantiaCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosGarantiaCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosGarantiaCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosGarantiaCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosGarantiaCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosGarantiaCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosGarantiaCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=garantiaclienteLogic.getGarantiaClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=garantiaclientes.size()-1;
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
		//this.jTableDatosGarantiaCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosGarantiaCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosGarantiaCliente();
			
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
				
				//this.isEsNuevoGarantiaCliente=false;
					
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
				if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormGarantiaCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGarantiaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGarantiaCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.garantiacliente.getsType().equals("DUPLICADO")
				   || this.garantiacliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoGarantiaCliente=true;
				
				} else {
					this.isEsNuevoGarantiaCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.garantiacliente.getId()>=0 && !this.garantiacliente.getIsNew()) {						
						this.isEsNuevoGarantiaCliente=false;
						
					} else {
						this.isEsNuevoGarantiaCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoGarantiaCliente(esRelaciones);						
				
				this.seleccionarGarantiaCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.garantiacliente.getId()<0) {
					this.isEsNuevoGarantiaCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarGarantiaCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarGarantiaCliente(evt,rowIndex);
				}	
				
				if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion GarantiaCliente: " + this.dDif); 
					}
				}								
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarGarantiaCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.garantiacliente)) {
					if(this.garantiacliente.getId()>0) {
						this.garantiacliente.setIsDeleted(true);
						
						this.garantiaclientesEliminados.add(this.garantiacliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.garantiaclienteLogic.getGarantiaClientes().remove(this.garantiacliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.garantiaclientes.remove(this.garantiacliente);				
					}
					
					
					((GarantiaClienteModel) this.jTableDatosGarantiaCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaGarantiaCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarGarantiaCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoGarantiaCliente) {
			
			if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosGarantiaCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosGarantiaCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioGarantiaCliente(this.garantiacliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.garantiaclienteConstantesFunciones.cargarid_empresaGarantiaCliente || this.garantiaclienteConstantesFunciones.event_dependid_empresaGarantiaCliente) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.garantiacliente.getid_empresa());
									//this.inicializarActualizarBindingGarantiaCliente(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(garantiacliente.getEmpresa()!=null) {
							this.empresasForeignKey.add(garantiacliente.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.garantiacliente.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.garantiaclienteConstantesFunciones.cargarid_sucursalGarantiaCliente || this.garantiaclienteConstantesFunciones.event_dependid_sucursalGarantiaCliente) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.garantiacliente.getid_sucursal());
									//this.inicializarActualizarBindingGarantiaCliente(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(garantiacliente.getSucursal()!=null) {
							this.sucursalsForeignKey.add(garantiacliente.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.garantiacliente.getid_sucursal(),false,"Formulario");

					//Cliente
					if(!this.garantiaclienteConstantesFunciones.cargarid_clienteGarantiaCliente || this.garantiaclienteConstantesFunciones.event_dependid_clienteGarantiaCliente) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.garantiacliente.getid_cliente());
									//this.inicializarActualizarBindingGarantiaCliente(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(garantiacliente.getCliente()!=null) {
							this.clientesForeignKey.add(garantiacliente.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.garantiacliente.getid_cliente(),false,"Formulario");

					//TipoGarantiaEmpresa
					if(!this.garantiaclienteConstantesFunciones.cargarid_tipo_garantia_empresaGarantiaCliente || this.garantiaclienteConstantesFunciones.event_dependid_tipo_garantia_empresaGarantiaCliente) {
						//this.cargarCombosTipoGarantiaEmpresasForeignKeyLista(" where id="+this.garantiacliente.getid_tipo_garantia_empresa());
									//this.inicializarActualizarBindingGarantiaCliente(false,false);
						this.tipogarantiaempresasForeignKey=new ArrayList<TipoGarantiaEmpresa>();

						if(garantiacliente.getTipoGarantiaEmpresa()!=null) {
							this.tipogarantiaempresasForeignKey.add(garantiacliente.getTipoGarantiaEmpresa());
						}

						this.addItemDefectoCombosForeignKeyTipoGarantiaEmpresa();
						this.cargarCombosFrameTipoGarantiaEmpresasForeignKey("Todos");
					}
					this.setActualTipoGarantiaEmpresaForeignKey(this.garantiacliente.getid_tipo_garantia_empresa(),false,"Formulario");

					//EstadoGarantiaCliente
					if(!this.garantiaclienteConstantesFunciones.cargarid_estado_garantia_clienteGarantiaCliente || this.garantiaclienteConstantesFunciones.event_dependid_estado_garantia_clienteGarantiaCliente) {
						//this.cargarCombosEstadoGarantiaClientesForeignKeyLista(" where id="+this.garantiacliente.getid_estado_garantia_cliente());
									//this.inicializarActualizarBindingGarantiaCliente(false,false);
						this.estadogarantiaclientesForeignKey=new ArrayList<EstadoGarantiaCliente>();

						if(garantiacliente.getEstadoGarantiaCliente()!=null) {
							this.estadogarantiaclientesForeignKey.add(garantiacliente.getEstadoGarantiaCliente());
						}

						this.addItemDefectoCombosForeignKeyEstadoGarantiaCliente();
						this.cargarCombosFrameEstadoGarantiaClientesForeignKey("Todos");
					}
					this.setActualEstadoGarantiaClienteForeignKey(this.garantiacliente.getid_estado_garantia_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesGarantiaCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesGarantiaCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualGarantiaCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoGarantiaCliente(GarantiaCliente garantiacliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoGarantiaCliente(garantiacliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoGarantiaCliente(GarantiaCliente garantiacliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioGarantiaCliente(garantiacliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyGarantiaCliente(garantiacliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyGarantiaCliente(garantiacliente);
	}
	
	public void setVariablesObjetoActualToFormularioGarantiaCliente(GarantiaCliente garantiacliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.setText(garantiacliente.getId().toString());
			this.jInternalFrameDetalleFormGarantiaCliente.jTextFieldvalorGarantiaCliente.setText(garantiacliente.getvalor().toString());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_recepcionGarantiaCliente.setDate(garantiacliente.getfecha_recepcion());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_firmaGarantiaCliente.setDate(garantiacliente.getfecha_firma());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_devolucionGarantiaCliente.setDate(garantiacliente.getfecha_devolucion());
			this.jInternalFrameDetalleFormGarantiaCliente.jTextAreabeneficiarioGarantiaCliente.setText(garantiacliente.getbeneficiario());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,GarantiaCliente garantiaclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,garantiaclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,GarantiaCliente garantiaclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				garantiaclienteLocal=this.garantiacliente;
			} else {
				garantiaclienteLocal=this.garantiaclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(garantiaclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoGarantiaCliente(garantiaclienteLocal,true);
					
					if(garantiaclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(garantiaclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(garantiaclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoGarantiaCliente(GarantiaCliente garantiacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGarantiaCliente(garantiacliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(garantiacliente);
	}
	
	public void setVariablesFormularioToObjetoActualGarantiaCliente(GarantiaCliente garantiacliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualGarantiaCliente(garantiacliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualGarantiaCliente(GarantiaCliente garantiacliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.getText()==null || this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.getText()=="" || this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.setText("0");
			}

			if(conColumnasBase) {garantiacliente.setId(Long.parseLong(this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GarantiaClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelIdGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			garantiacliente.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormGarantiaCliente.jTextFieldvalorGarantiaCliente.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GarantiaClienteConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelvalorGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			garantiacliente.setfecha_recepcion(this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_recepcionGarantiaCliente.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_recepcionGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			garantiacliente.setfecha_firma(this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_firmaGarantiaCliente.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_firmaGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			garantiacliente.setfecha_devolucion(this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_devolucionGarantiaCliente.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelfecha_devolucionGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			garantiacliente.setbeneficiario(this.jInternalFrameDetalleFormGarantiaCliente.jTextAreabeneficiarioGarantiaCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormGarantiaCliente.jLabelbeneficiarioGarantiaCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualGarantiaCliente(GarantiaCliente garantiaclienteBean,GarantiaCliente garantiacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && garantiaclienteBean.getid_cliente()!=null && !garantiaclienteBean.getid_cliente().equals(-1L))) {garantiacliente.setid_cliente(garantiaclienteBean.getid_cliente());}
			if(conDefault || (!conDefault && garantiaclienteBean.getid_tipo_garantia_empresa()!=null && !garantiaclienteBean.getid_tipo_garantia_empresa().equals(-1L))) {garantiacliente.setid_tipo_garantia_empresa(garantiaclienteBean.getid_tipo_garantia_empresa());}
			if(conDefault || (!conDefault && garantiaclienteBean.getid_estado_garantia_cliente()!=null && !garantiaclienteBean.getid_estado_garantia_cliente().equals(-1L))) {garantiacliente.setid_estado_garantia_cliente(garantiaclienteBean.getid_estado_garantia_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosGarantiaCliente(GarantiaCliente garantiaclienteOrigen,GarantiaCliente garantiacliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && garantiaclienteOrigen.getId()!=null && !garantiaclienteOrigen.getId().equals(0L))) {garantiacliente.setId(garantiaclienteOrigen.getId());}}
			if(conDefault || (!conDefault && garantiaclienteOrigen.getid_cliente()!=null && !garantiaclienteOrigen.getid_cliente().equals(-1L))) {garantiacliente.setid_cliente(garantiaclienteOrigen.getid_cliente());}
			if(conDefault || (!conDefault && garantiaclienteOrigen.getid_tipo_garantia_empresa()!=null && !garantiaclienteOrigen.getid_tipo_garantia_empresa().equals(-1L))) {garantiacliente.setid_tipo_garantia_empresa(garantiaclienteOrigen.getid_tipo_garantia_empresa());}
			if(conDefault || (!conDefault && garantiaclienteOrigen.getvalor()!=null && !garantiaclienteOrigen.getvalor().equals(0.0))) {garantiacliente.setvalor(garantiaclienteOrigen.getvalor());}
			if(conDefault || (!conDefault && garantiaclienteOrigen.getfecha_recepcion()!=null && !garantiaclienteOrigen.getfecha_recepcion().equals(new Date()))) {garantiacliente.setfecha_recepcion(garantiaclienteOrigen.getfecha_recepcion());}
			if(conDefault || (!conDefault && garantiaclienteOrigen.getfecha_firma()!=null && !garantiaclienteOrigen.getfecha_firma().equals(new Date()))) {garantiacliente.setfecha_firma(garantiaclienteOrigen.getfecha_firma());}
			if(conDefault || (!conDefault && garantiaclienteOrigen.getfecha_devolucion()!=null && !garantiaclienteOrigen.getfecha_devolucion().equals(new Date()))) {garantiacliente.setfecha_devolucion(garantiaclienteOrigen.getfecha_devolucion());}
			if(conDefault || (!conDefault && garantiaclienteOrigen.getbeneficiario()!=null && !garantiaclienteOrigen.getbeneficiario().equals(""))) {garantiacliente.setbeneficiario(garantiaclienteOrigen.getbeneficiario());}
			if(conDefault || (!conDefault && garantiaclienteOrigen.getid_estado_garantia_cliente()!=null && !garantiaclienteOrigen.getid_estado_garantia_cliente().equals(-1L))) {garantiacliente.setid_estado_garantia_cliente(garantiaclienteOrigen.getid_estado_garantia_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGarantiaCliente(GarantiaCliente garantiacliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.setText(garantiacliente.getId().toString());
			this.jInternalFrameDetalleFormGarantiaCliente.jTextFieldvalorGarantiaCliente.setText(garantiacliente.getvalor().toString());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_recepcionGarantiaCliente.setDate(garantiacliente.getfecha_recepcion());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_firmaGarantiaCliente.setDate(garantiacliente.getfecha_firma());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_devolucionGarantiaCliente.setDate(garantiacliente.getfecha_devolucion());
			this.jInternalFrameDetalleFormGarantiaCliente.jTextAreabeneficiarioGarantiaCliente.setText(garantiacliente.getbeneficiario());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioGarantiaCliente(GarantiaClienteBean garantiaclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.setText(garantiaclienteBean.getId().toString());
			this.jInternalFrameDetalleFormGarantiaCliente.jTextFieldvalorGarantiaCliente.setText(garantiaclienteBean.getvalor().toString());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_recepcionGarantiaCliente.setDate(garantiaclienteBean.getfecha_recepcion());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_firmaGarantiaCliente.setDate(garantiaclienteBean.getfecha_firma());
			this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_devolucionGarantiaCliente.setDate(garantiaclienteBean.getfecha_devolucion());
			this.jInternalFrameDetalleFormGarantiaCliente.jTextAreabeneficiarioGarantiaCliente.setText(garantiaclienteBean.getbeneficiario());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanGarantiaCliente(GarantiaClienteParameterReturnGeneral garantiaclienteReturnGeneral,GarantiaClienteBean garantiaclienteBean,Boolean conDefault) throws Exception { 
		try {
			GarantiaCliente garantiaclienteLocal=new GarantiaCliente();
			
			garantiaclienteLocal=garantiaclienteReturnGeneral.getGarantiaCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && garantiaclienteLocal.getId()!=null && !garantiaclienteLocal.getId().equals(0L))) {garantiaclienteBean.setId(garantiaclienteLocal.getId());}}
			if(conDefault || (!conDefault && garantiaclienteLocal.getid_cliente()!=null && !garantiaclienteLocal.getid_cliente().equals(-1L))) {garantiaclienteBean.setid_cliente(garantiaclienteLocal.getid_cliente());}
			if(conDefault || (!conDefault && garantiaclienteLocal.getid_tipo_garantia_empresa()!=null && !garantiaclienteLocal.getid_tipo_garantia_empresa().equals(-1L))) {garantiaclienteBean.setid_tipo_garantia_empresa(garantiaclienteLocal.getid_tipo_garantia_empresa());}
			if(conDefault || (!conDefault && garantiaclienteLocal.getvalor()!=null && !garantiaclienteLocal.getvalor().equals(0.0))) {garantiaclienteBean.setvalor(garantiaclienteLocal.getvalor());}
			if(conDefault || (!conDefault && garantiaclienteLocal.getfecha_recepcion()!=null && !garantiaclienteLocal.getfecha_recepcion().equals(new Date()))) {garantiaclienteBean.setfecha_recepcion(garantiaclienteLocal.getfecha_recepcion());}
			if(conDefault || (!conDefault && garantiaclienteLocal.getfecha_firma()!=null && !garantiaclienteLocal.getfecha_firma().equals(new Date()))) {garantiaclienteBean.setfecha_firma(garantiaclienteLocal.getfecha_firma());}
			if(conDefault || (!conDefault && garantiaclienteLocal.getfecha_devolucion()!=null && !garantiaclienteLocal.getfecha_devolucion().equals(new Date()))) {garantiaclienteBean.setfecha_devolucion(garantiaclienteLocal.getfecha_devolucion());}
			if(conDefault || (!conDefault && garantiaclienteLocal.getbeneficiario()!=null && !garantiaclienteLocal.getbeneficiario().equals(""))) {garantiaclienteBean.setbeneficiario(garantiaclienteLocal.getbeneficiario());}
			if(conDefault || (!conDefault && garantiaclienteLocal.getid_estado_garantia_cliente()!=null && !garantiaclienteLocal.getid_estado_garantia_cliente().equals(-1L))) {garantiaclienteBean.setid_estado_garantia_cliente(garantiaclienteLocal.getid_estado_garantia_cliente());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxGarantiaClienteGenerico(Long idGarantiaClienteSeleccionado,JComboBox jComboBoxGarantiaCliente,List<GarantiaCliente> garantiaclientesLocal)throws Exception {
		try {
			GarantiaCliente  garantiaclienteTemp=null;

			for(GarantiaCliente garantiaclienteAux:garantiaclientesLocal) {
				if(garantiaclienteAux.getId()!=null && garantiaclienteAux.getId().equals(idGarantiaClienteSeleccionado)) {
					garantiaclienteTemp=garantiaclienteAux;
					break;
				}
			}

			jComboBoxGarantiaCliente.setSelectedItem(garantiaclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxGarantiaClienteGenerico(JComboBox jComboBoxGarantiaCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGarantiaCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxGarantiaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxGarantiaCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxGarantiaCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxGarantiaCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxGarantiaCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			garantiacliente=(GarantiaCliente) garantiaclienteLogic.getGarantiaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			garantiacliente =(GarantiaCliente) garantiaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!garantiacliente.getIsNew() && !garantiacliente.getIsChanged() && !garantiacliente.getIsDeleted()) {
				sDescripcion=garantiacliente.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=garantiacliente.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!garantiacliente.getIsNew() && !garantiacliente.getIsChanged() && !garantiacliente.getIsDeleted()) {
				sDescripcion=garantiacliente.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=garantiacliente.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!garantiacliente.getIsNew() && !garantiacliente.getIsChanged() && !garantiacliente.getIsDeleted()) {
				sDescripcion=garantiacliente.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=garantiacliente.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoGarantiaEmpresa")) {
			//sDescripcion=this.getActualTipoGarantiaEmpresaForeignKeyDescripcion((Long)value);
			if(!garantiacliente.getIsNew() && !garantiacliente.getIsChanged() && !garantiacliente.getIsDeleted()) {
				sDescripcion=garantiacliente.gettipogarantiaempresa_descripcion();
			} else {
				//sDescripcion=this.getActualTipoGarantiaEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=garantiacliente.gettipogarantiaempresa_descripcion();
			}
		}

		if(sTipo.equals("EstadoGarantiaCliente")) {
			//sDescripcion=this.getActualEstadoGarantiaClienteForeignKeyDescripcion((Long)value);
			if(!garantiacliente.getIsNew() && !garantiacliente.getIsChanged() && !garantiacliente.getIsDeleted()) {
				sDescripcion=garantiacliente.getestadogarantiacliente_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoGarantiaClienteForeignKeyDescripcion((Long)value);
				sDescripcion=garantiacliente.getestadogarantiacliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		GarantiaCliente garantiaclienteRow=new GarantiaCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			garantiaclienteRow=(GarantiaCliente) garantiaclienteLogic.getGarantiaClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			garantiaclienteRow=(GarantiaCliente) garantiaclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualGarantiaCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoGarantiaCliente && this.isPermisoNuevoGarantiaCliente));			
			this.jButtonDuplicarGarantiaCliente.setVisible((this.isVisibilidadCeldaDuplicarGarantiaCliente && this.isPermisoDuplicarGarantiaCliente));			
			this.jButtonCopiarGarantiaCliente.setVisible((this.isVisibilidadCeldaCopiarGarantiaCliente && this.isPermisoCopiarGarantiaCliente));
			this.jButtonVerFormGarantiaCliente.setVisible((this.isVisibilidadCeldaVerFormGarantiaCliente && this.isPermisoVerFormGarantiaCliente));
			
			this.jButtonAbrirOrderByGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenGarantiaCliente && this.isPermisoOrdenGarantiaCliente));			
			
			this.jButtonNuevoRelacionesGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente && this.isPermisoNuevoGarantiaCliente));			
			this.jButtonNuevoGuardarCambiosGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoGarantiaCliente && this.isPermisoNuevoGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));
			
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarGarantiaCliente.setVisible((this.isVisibilidadCeldaModificarGarantiaCliente && this.isPermisoActualizarGarantiaCliente));	
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarGarantiaCliente.setVisible((this.isVisibilidadCeldaActualizarGarantiaCliente && this.isPermisoActualizarGarantiaCliente));	
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarGarantiaCliente.setVisible((this.isVisibilidadCeldaEliminarGarantiaCliente && this.isPermisoEliminarGarantiaCliente));
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarGarantiaCliente);							
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoGarantiaCliente && this.isPermisoNuevoGarantiaCliente));						
			this.jButtonDuplicarToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaDuplicarGarantiaCliente && this.isPermisoDuplicarGarantiaCliente));						
			this.jButtonCopiarToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaCopiarGarantiaCliente && this.isPermisoCopiarGarantiaCliente));			
			this.jButtonVerFormToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaVerFormGarantiaCliente && this.isPermisoVerFormGarantiaCliente));			
			this.jButtonAbrirOrderByToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenGarantiaCliente && this.isPermisoOrdenGarantiaCliente));
			this.jButtonNuevoRelacionesToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente && this.isPermisoNuevoGarantiaCliente));			
			this.jButtonNuevoGuardarCambiosToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoGarantiaCliente && this.isPermisoNuevoGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));			
			
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaModificarGarantiaCliente && this.isPermisoActualizarGarantiaCliente));	
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaActualizarGarantiaCliente  && this.isPermisoActualizarGarantiaCliente));	
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaEliminarGarantiaCliente && this.isPermisoEliminarGarantiaCliente));
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarToolBarGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarGarantiaCliente);				
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoGarantiaCliente && this.isPermisoNuevoGarantiaCliente));			
			this.jMenuItemDuplicarGarantiaCliente.setVisible((this.isVisibilidadCeldaDuplicarGarantiaCliente && this.isPermisoDuplicarGarantiaCliente));			
			this.jMenuItemCopiarGarantiaCliente.setVisible((this.isVisibilidadCeldaCopiarGarantiaCliente && this.isPermisoCopiarGarantiaCliente));			
			this.jMenuItemVerFormGarantiaCliente.setVisible((this.isVisibilidadCeldaVerFormGarantiaCliente && this.isPermisoVerFormGarantiaCliente));			
			this.jMenuItemAbrirOrderByGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenGarantiaCliente && this.isPermisoOrdenGarantiaCliente));			
			//this.jMenuItemMostrarOcultarGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenGarantiaCliente && this.isPermisoOrdenGarantiaCliente));
			this.jMenuItemDetalleAbrirOrderByGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenGarantiaCliente && this.isPermisoOrdenGarantiaCliente));			
			//this.jMenuItemDetalleMostrarOcultarGarantiaCliente.setVisible((this.isVisibilidadCeldaOrdenGarantiaCliente && this.isPermisoOrdenGarantiaCliente));			
			this.jMenuItemNuevoRelacionesGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente && this.isPermisoNuevoGarantiaCliente));			
			this.jMenuItemNuevoGuardarCambiosGarantiaCliente.setVisible((this.isVisibilidadCeldaNuevoGarantiaCliente && this.isPermisoNuevoGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));									
			
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemModificarGarantiaCliente.setVisible((this.isVisibilidadCeldaModificarGarantiaCliente && this.isPermisoActualizarGarantiaCliente));	
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemActualizarGarantiaCliente.setVisible((this.isVisibilidadCeldaActualizarGarantiaCliente && this.isPermisoActualizarGarantiaCliente));	
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemEliminarGarantiaCliente.setVisible((this.isVisibilidadCeldaEliminarGarantiaCliente && this.isPermisoEliminarGarantiaCliente));
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemCancelarGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarGarantiaCliente);				
			}
			
			this.jMenuItemGuardarCambiosGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));						
			this.jMenuItemGuardarCambiosTablaGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoGarantiaCliente=this.jButtonNuevoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaDuplicarGarantiaCliente=this.jButtonDuplicarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaCopiarGarantiaCliente=this.jButtonCopiarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaVerFormGarantiaCliente=this.jButtonVerFormGarantiaCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenGarantiaCliente=this.jButtonAbrirOrderByGarantiaCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=this.jButtonNuevoRelacionesGarantiaCliente.isVisible();
			this.isVisibilidadCeldaModificarGarantiaCliente=this.jButtonModificarGarantiaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			this.isVisibilidadCeldaActualizarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaEliminarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaCancelarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaGuardarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosGarantiaCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=this.jButtonGuardarCambiosTablaGarantiaCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoGarantiaCliente=this.jButtonNuevoToolBarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=this.jButtonNuevoRelacionesToolBarGarantiaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			this.isVisibilidadCeldaModificarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarToolBarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaActualizarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarToolBarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaEliminarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarToolBarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaCancelarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarToolBarGarantiaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGarantiaCliente=this.jButtonGuardarCambiosToolBarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=this.jButtonGuardarCambiosTablaToolBarGarantiaCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoGarantiaCliente=this.jMenuItemNuevoGarantiaCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=this.jMenuItemNuevoRelacionesGarantiaCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			this.isVisibilidadCeldaModificarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemModificarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaActualizarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemActualizarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaEliminarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemEliminarGarantiaCliente.isVisible();
			this.isVisibilidadCeldaCancelarGarantiaCliente=this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemCancelarGarantiaCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarGarantiaCliente=this.jMenuItemGuardarCambiosGarantiaCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=this.jMenuItemGuardarCambiosTablaGarantiaCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesGarantiaCliente(Boolean esInicializar) {
		if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesGarantiaCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualGarantiaCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualGarantiaCliente() {
		this.jButtonNuevoGarantiaCliente.setVisible(this.isPermisoNuevoGarantiaCliente);			
		this.jButtonDuplicarGarantiaCliente.setVisible(this.isPermisoDuplicarGarantiaCliente);			
		this.jButtonCopiarGarantiaCliente.setVisible(this.isPermisoCopiarGarantiaCliente);			
		this.jButtonVerFormGarantiaCliente.setVisible(this.isPermisoVerFormGarantiaCliente);			
		
		this.jButtonAbrirOrderByGarantiaCliente.setVisible(this.isPermisoOrdenGarantiaCliente);					
		
		this.jButtonNuevoRelacionesGarantiaCliente.setVisible(this.isPermisoNuevoGarantiaCliente);			
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarGarantiaCliente.setVisible(this.isPermisoActualizarGarantiaCliente);	
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarGarantiaCliente.setVisible(this.isPermisoActualizarGarantiaCliente);	
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarGarantiaCliente.setVisible(this.isPermisoEliminarGarantiaCliente);
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarGarantiaCliente);						
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosGarantiaCliente.setVisible(this.isPermisoGuardarCambiosGarantiaCliente);							
		}
		
		this.jButtonGuardarCambiosTablaGarantiaCliente.setVisible(this.isPermisoActualizarGarantiaCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleGarantiaCliente() {
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarGarantiaCliente.setVisible(this.isPermisoActualizarGarantiaCliente);	
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarGarantiaCliente.setVisible(this.isPermisoActualizarGarantiaCliente);	
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarGarantiaCliente.setVisible(this.isPermisoEliminarGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarGarantiaCliente.setVisible(this.isVisibilidadCeldaCancelarGarantiaCliente);							
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosGarantiaCliente.setVisible((this.isVisibilidadCeldaGuardarGarantiaCliente && this.isPermisoGuardarCambiosGarantiaCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosGarantiaCliente() {
		if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualGarantiaCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesGarantiaCliente() {
	}
	
	public void jTableDatosGarantiaClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarGarantiaCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.garantiacliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaGarantiaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebGarantiaCliente(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGarantiaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGarantiaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.garantiaclienteLogic.getConnexion());

				if(this.garantiacliente.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.garantiacliente.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGarantiaCliente=(TitledBorder)this.jScrollPanelDatosGarantiaCliente.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderGarantiaCliente.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.garantiacliente.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalGarantiaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebGarantiaCliente(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGarantiaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGarantiaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.garantiaclienteLogic.getConnexion());

				if(this.garantiacliente.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.garantiacliente.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGarantiaCliente=(TitledBorder)this.jScrollPanelDatosGarantiaCliente.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderGarantiaCliente.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.garantiacliente.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteGarantiaClienteActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderGarantiaCliente=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosGarantiaCliente.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderGarantiaCliente=(TitledBorder)this.jScrollPanelDatosGarantiaCliente.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderGarantiaCliente.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteGarantiaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebGarantiaCliente(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGarantiaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGarantiaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.garantiaclienteLogic.getConnexion());

				if(this.garantiacliente.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.garantiacliente.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGarantiaCliente=(TitledBorder)this.jScrollPanelDatosGarantiaCliente.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderGarantiaCliente.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.garantiacliente.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_garantia_empresaGarantiaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipogarantiaempresa=true;

			idTienePermisotipogarantiaempresa=this.tienePermisosUsuarioEnPaginaWebGarantiaCliente(TipoGarantiaEmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisotipogarantiaempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGarantiaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGarantiaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);

				this.tipogarantiaempresaBeanSwingJInternalFrame=new TipoGarantiaEmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipogarantiaempresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipogarantiaempresaBeanSwingJInternalFrame.getTipoGarantiaEmpresaLogic().setConnexion(this.garantiaclienteLogic.getConnexion());

				if(this.garantiacliente.getid_tipo_garantia_empresa()!=null) {
					this.tipogarantiaempresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipogarantiaempresaBeanSwingJInternalFrame.setIdActual(this.garantiacliente.getid_tipo_garantia_empresa());
					this.tipogarantiaempresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipogarantiaempresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipogarantiaempresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoGarantiaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.tipogarantiaempresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGarantiaCliente=(TitledBorder)this.jScrollPanelDatosGarantiaCliente.getBorder();
				TitledBorder titledBordertipogarantiaempresa=(TitledBorder)this.tipogarantiaempresaBeanSwingJInternalFrame.jScrollPanelDatosTipoGarantiaEmpresa.getBorder();

				titledBordertipogarantiaempresa.setTitle(titledBorderGarantiaCliente.getTitle() + " -> Tipo Garantia Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_garantia_empresaGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getid_tipo_garantia_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_garantia_empresa = "+this.garantiacliente.getid_tipo_garantia_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.garantiacliente.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_recepcionGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getfecha_recepcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_recepcion = '"+Funciones2.getStringPostgresDate(this.garantiacliente.getfecha_recepcion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_firmaGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getfecha_firma()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_firma = '"+Funciones2.getStringPostgresDate(this.garantiacliente.getfecha_firma())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_devolucionGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getfecha_devolucion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_devolucion = '"+Funciones2.getStringPostgresDate(this.garantiacliente.getfecha_devolucion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonbeneficiarioGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getbeneficiario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where beneficiario like '%"+this.garantiacliente.getbeneficiario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_garantia_clienteGarantiaClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadogarantiacliente=true;

			idTienePermisoestadogarantiacliente=this.tienePermisosUsuarioEnPaginaWebGarantiaCliente(EstadoGarantiaClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadogarantiacliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosGarantiaCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosGarantiaCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);

				this.estadogarantiaclienteBeanSwingJInternalFrame=new EstadoGarantiaClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadogarantiaclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadogarantiaclienteBeanSwingJInternalFrame.getEstadoGarantiaClienteLogic().setConnexion(this.garantiaclienteLogic.getConnexion());

				if(this.garantiacliente.getid_estado_garantia_cliente()!=null) {
					this.estadogarantiaclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadogarantiaclienteBeanSwingJInternalFrame.setIdActual(this.garantiacliente.getid_estado_garantia_cliente());
					this.estadogarantiaclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadogarantiaclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadogarantiaclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoGarantiaCliente();
				}

				JInternalFrameBase jinternalFrame =this.estadogarantiaclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderGarantiaCliente=(TitledBorder)this.jScrollPanelDatosGarantiaCliente.getBorder();
				TitledBorder titledBorderestadogarantiacliente=(TitledBorder)this.estadogarantiaclienteBeanSwingJInternalFrame.jScrollPanelDatosEstadoGarantiaCliente.getBorder();

				titledBorderestadogarantiacliente.setTitle(titledBorderGarantiaCliente.getTitle() + " -> Estado Garantia Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_garantia_clienteGarantiaClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.getgarantiacliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.garantiacliente==null) {
						this.garantiacliente = new GarantiaCliente();
					}

					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);
				}

				if(this.garantiacliente.getid_estado_garantia_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_garantia_cliente = "+this.garantiacliente.getid_estado_garantia_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingGarantiaCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGarantiaCliente(false,false);

			this.getGarantiaClientesFK_IdCliente();

			this.inicializarActualizarBindingGarantiaCliente(false);

			//if(GarantiaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGarantiaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGarantiaCliente(false,false);

			this.getGarantiaClientesFK_IdEmpresa();

			this.inicializarActualizarBindingGarantiaCliente(false);

			//if(GarantiaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGarantiaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoGarantiaClienteGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGarantiaCliente(false,false);

			this.getGarantiaClientesFK_IdEstadoGarantiaCliente();

			this.inicializarActualizarBindingGarantiaCliente(false);

			//if(GarantiaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGarantiaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGarantiaCliente(false,false);

			this.getGarantiaClientesFK_IdSucursal();

			this.inicializarActualizarBindingGarantiaCliente(false);

			//if(GarantiaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGarantiaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoGarantiaEmpresaGarantiaClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingGarantiaCliente(false,false);

			this.getGarantiaClientesFK_IdTipoGarantiaEmpresa();

			this.inicializarActualizarBindingGarantiaCliente(false);

			//if(GarantiaClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingGarantiaCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.garantiaclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameGarantiaCliente() {
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
			this.jInternalFrameDetalleFormGarantiaCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormGarantiaCliente.dispose();
			this.jInternalFrameDetalleFormGarantiaCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
			this.jInternalFrameReporteDinamicoGarantiaCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoGarantiaCliente.dispose();
			this.jInternalFrameReporteDinamicoGarantiaCliente=null;
		}
		
		if(this.jInternalFrameImportacionGarantiaCliente!=null) {
			this.jInternalFrameImportacionGarantiaCliente.setVisible(false);	    			
			this.jInternalFrameImportacionGarantiaCliente.dispose();
			this.jInternalFrameImportacionGarantiaCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessGarantiaCliente();
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoGarantiaCliente")) {
				jButtonNuevoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarGarantiaCliente")) {
				jButtonDuplicarGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarGarantiaCliente")) {
				jButtonCopiarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormGarantiaCliente")) {
				jButtonVerFormGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarGarantiaCliente")) {
				jButtonNuevoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarGarantiaCliente")) {
				jButtonDuplicarGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoGarantiaCliente")) {
				jButtonNuevoGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarGarantiaCliente")) {
				jButtonDuplicarGarantiaClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesGarantiaCliente")) {
				jButtonNuevoGarantiaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarGarantiaCliente")) {
				jButtonNuevoGarantiaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesGarantiaCliente")) {
				jButtonNuevoGarantiaClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarGarantiaCliente")) {
				jButtonModificarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarGarantiaCliente")) {
				jButtonModificarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarGarantiaCliente")) {
				jButtonModificarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarGarantiaCliente")) {
				jButtonActualizarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarGarantiaCliente")) {
				jButtonActualizarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarGarantiaCliente")) {
				jButtonActualizarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarGarantiaCliente")) {
				jButtonEliminarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarGarantiaCliente")) {
				jButtonEliminarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarGarantiaCliente")) {
				jButtonEliminarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarGarantiaCliente")) {
				jButtonCancelarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarGarantiaCliente")) {
				jButtonCancelarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarGarantiaCliente")) {
				jButtonCancelarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarGarantiaCliente")) {
				jButtonCerrarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarGarantiaCliente")) {
				jButtonCerrarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarGarantiaCliente")) {
				jButtonCerrarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarGarantiaCliente")) {
				jButtonMostrarOcultarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarGarantiaCliente")) {
				jButtonCancelarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosGarantiaCliente")) {
				jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarGarantiaCliente")) {
				jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarGarantiaCliente")) {
				jButtonCopiarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarGarantiaCliente")) {
				jButtonVerFormGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosGarantiaCliente")) {
				jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarGarantiaCliente")) {
				jButtonCopiarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormGarantiaCliente")) {
				jButtonVerFormGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaGarantiaCliente")) {
				jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarGarantiaCliente")) {
				jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaGarantiaCliente")) {
				jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionGarantiaCliente")) {
				jButtonRecargarInformacionGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarGarantiaCliente")) {
				jButtonRecargarInformacionGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionGarantiaCliente")) {
				jButtonRecargarInformacionGarantiaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresGarantiaCliente")) {
				jButtonAnterioresGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarGarantiaCliente")) {
				jButtonAnterioresGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreGarantiaCliente")) {
				jButtonAnterioresGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesGarantiaCliente")) {
				jButtonSiguientesGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarGarantiaCliente")) {
				jButtonSiguientesGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesGarantiaCliente")) {
				jButtonSiguientesGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByGarantiaCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByGarantiaCliente")) {
				jButtonAbrirOrderByGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarGarantiaCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarGarantiaCliente")) {
				jButtonMostrarOcultarGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosGarantiaCliente")) {
				jButtonNuevoGuardarCambiosGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarGarantiaCliente")) {
				jButtonNuevoGuardarCambiosGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosGarantiaCliente")) {
				jButtonNuevoGuardarCambiosGarantiaClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoGarantiaCliente")) {
				jButtonCerrarReporteDinamicoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoGarantiaCliente")) {
				jButtonGenerarReporteDinamicoGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoGarantiaCliente")) {
				
				jButtonGenerarExcelReporteDinamicoGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionGarantiaCliente")) {
				jButtonCerrarImportacionGarantiaClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionGarantiaCliente")) {
				
				jButtonGenerarImportacionGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionGarantiaCliente")) {
				
				jButtonAbrirImportacionGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesGarantiaCliente")) {
				jComboBoxTiposAccionesGarantiaClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesGarantiaCliente")) {
				jComboBoxTiposRelacionesGarantiaClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioGarantiaCliente")) {
				jComboBoxTiposAccionesGarantiaClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarGarantiaCliente")) {
				
				jComboBoxTiposSeleccionarGarantiaClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralGarantiaCliente")) {
				jTextFieldValorCampoGeneralGarantiaClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByGarantiaCliente")) {
				jButtonAbrirOrderByGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarGarantiaCliente")) {
				jButtonAbrirOrderByGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByGarantiaCliente")) {
				jButtonCerrarOrderByGarantiaClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGarantiaClienteBusqueda")) {
				this.jButtonidGarantiaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGarantiaClienteUpdate")) {
				this.jButtonid_empresaGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGarantiaClienteBusqueda")) {
				this.jButtonid_empresaGarantiaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalGarantiaClienteUpdate")) {
				this.jButtonid_sucursalGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalGarantiaClienteBusqueda")) {
				this.jButtonid_sucursalGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteGarantiaCliente")) {
				this.jButtonid_clienteGarantiaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteGarantiaClienteUpdate")) {
				this.jButtonid_clienteGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteGarantiaClienteBusqueda")) {
				this.jButtonid_clienteGarantiaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_garantia_empresaGarantiaClienteUpdate")) {
				this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_garantia_empresaGarantiaClienteBusqueda")) {
				this.jButtonid_tipo_garantia_empresaGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorGarantiaClienteBusqueda")) {
				this.jButtonvalorGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_recepcionGarantiaClienteBusqueda")) {
				this.jButtonfecha_recepcionGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_firmaGarantiaClienteBusqueda")) {
				this.jButtonfecha_firmaGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_devolucionGarantiaClienteBusqueda")) {
				this.jButtonfecha_devolucionGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioGarantiaClienteBusqueda")) {
				this.jButtonbeneficiarioGarantiaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_garantia_clienteGarantiaClienteUpdate")) {
				this.jButtonid_estado_garantia_clienteGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_garantia_clienteGarantiaClienteBusqueda")) {
				this.jButtonid_estado_garantia_clienteGarantiaClienteBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteGarantiaCliente")) {
				this.jButtonid_clienteGarantiaClienteActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteGarantiaCliente")) {
				this.jButtonFK_IdClienteGarantiaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoGarantiaClienteGarantiaCliente")) {
				this.jButtonFK_IdEstadoGarantiaClienteGarantiaClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoGarantiaEmpresaGarantiaCliente")) {
				this.jButtonFK_IdTipoGarantiaEmpresaGarantiaClienteActionPerformed(evt);
			}
			
			;
			
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessGarantiaCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGarantiaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				


				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			GarantiaCliente garantiaclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				garantiaclienteLocal=this.garantiacliente;
			} else {
				garantiaclienteLocal=this.garantiaclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
							
				
				


				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
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
			
			


			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGarantiaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
								
						
				


				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
								
				
				


				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGarantiaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
							
				
				


				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGarantiaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
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
			
			


			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGarantiaClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
								
				
				


				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGarantiaClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGarantiaClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosGarantiaCliente")) {
					jCheckBoxSeleccionarTodosGarantiaClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosGarantiaCliente")) {
					jCheckBoxSeleccionadosGarantiaClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarGarantiaCliente")) {
					
				}
				
				


				
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
												
				
				


				
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGarantiaClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGarantiaClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
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
			
			


			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaGarantiaClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.garantiacliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.garantiacliente);
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
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
				
				


				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(GarantiaCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",GarantiaCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaGarantiaClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.garantiaclienteAnterior =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarGarantiaCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosGarantiaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosGarantiaCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.garantiacliente =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.garantiacliente =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.garantiacliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarGarantiaCliente")) {
				
				}
				
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarGarantiaCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosGarantiaCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarGarantiaCliente")) {
			
			}
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessGarantiaCliente();
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
			if(sTipo.equals("NuevoGarantiaCliente")) {
				jButtonNuevoGarantiaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarGarantiaCliente")) {
				jButtonDuplicarGarantiaClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarGarantiaCliente")) {
				jButtonCopiarGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormGarantiaCliente")) {
				jButtonVerFormGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesGarantiaCliente")) {
				jButtonNuevoGarantiaClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarGarantiaCliente")) {
				jButtonModificarGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarGarantiaCliente")) {
				jButtonActualizarGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarGarantiaCliente")) {
				jButtonEliminarGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaGarantiaCliente")) {
				jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarGarantiaCliente")) {
				jButtonCancelarGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarGarantiaCliente")) {
				jButtonCerrarGarantiaClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosGarantiaCliente")) {
				jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosGarantiaCliente")) {
				jButtonNuevoGuardarCambiosGarantiaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByGarantiaCliente")) {
				jButtonAbrirOrderByGarantiaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionGarantiaCliente")) {
				jButtonRecargarInformacionGarantiaClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresGarantiaCliente")) {
				jButtonAnterioresGarantiaClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesGarantiaCliente")) {
				jButtonSiguientesGarantiaClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idGarantiaClienteBusqueda")) {
				this.jButtonidGarantiaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaGarantiaClienteUpdate")) {
				this.jButtonid_empresaGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaGarantiaClienteBusqueda")) {
				this.jButtonid_empresaGarantiaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalGarantiaClienteUpdate")) {
				this.jButtonid_sucursalGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalGarantiaClienteBusqueda")) {
				this.jButtonid_sucursalGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteGarantiaCliente")) {
				this.jButtonid_clienteGarantiaClienteActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteGarantiaClienteUpdate")) {
				this.jButtonid_clienteGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteGarantiaClienteBusqueda")) {
				this.jButtonid_clienteGarantiaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_garantia_empresaGarantiaClienteUpdate")) {
				this.jButtonid_tipo_garantia_empresaGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_garantia_empresaGarantiaClienteBusqueda")) {
				this.jButtonid_tipo_garantia_empresaGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorGarantiaClienteBusqueda")) {
				this.jButtonvalorGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_recepcionGarantiaClienteBusqueda")) {
				this.jButtonfecha_recepcionGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_firmaGarantiaClienteBusqueda")) {
				this.jButtonfecha_firmaGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_devolucionGarantiaClienteBusqueda")) {
				this.jButtonfecha_devolucionGarantiaClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("beneficiarioGarantiaClienteBusqueda")) {
				this.jButtonbeneficiarioGarantiaClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_garantia_clienteGarantiaClienteUpdate")) {
				this.jButtonid_estado_garantia_clienteGarantiaClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_garantia_clienteGarantiaClienteBusqueda")) {
				this.jButtonid_estado_garantia_clienteGarantiaClienteBusquedaActionPerformed(evt);
			}
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessGarantiaCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameGarantiaCliente")) {
				closingInternalFrameGarantiaCliente();
				
			} else if(sTipo.equals("jButtonCancelarGarantiaCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormGarantiaCliente = (JInternalFrameBase)evt.getSource();
	            	
	            GarantiaClienteBeanSwingJInternalFrame jInternalFrameParent=(GarantiaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormGarantiaCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarGarantiaClienteActionPerformed(null);
			}
			
			GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.garantiacliente,new Object(),this.garantiaclienteParameterGeneral,this.garantiaclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormGarantiaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormGarantiaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormGarantiaCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.garantiacliente)) {
			if(!esControlTabla) {
				if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);			
				}
				
				if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualGarantiaCliente(this.garantiacliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.garantiaclienteReturnGeneral=garantiaclienteLogic.procesarEventosGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.garantiaclienteLogic.getGarantiaClientes(),this.garantiacliente,this.garantiaclienteParameterGeneral,this.isEsNuevoGarantiaCliente,classes);//this.garantiaclienteLogic.getGarantiaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanGarantiaCliente(this.garantiaclienteReturnGeneral,this.garantiaclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanGarantiaCliente(classes,this.garantiaclienteReturnGeneral,this.garantiaclienteBean,false);
					}
						
					if(this.garantiaclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyGarantiaCliente(this.garantiaclienteReturnGeneral.getGarantiaCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioGarantiaCliente(this.garantiaclienteReturnGeneral.getGarantiaCliente());	
					}
						
					if(this.garantiaclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioGarantiaCliente(this.garantiaclienteReturnGeneral.getGarantiaCliente(),classes);//this.garantiaclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioGarantiaCliente(this.garantiacliente,classes);//this.garantiaclienteBean);									
				}
			
				if(GarantiaClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualGarantiaCliente(this.garantiacliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysGarantiaCliente(this.garantiacliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.garantiaclienteAnterior!=null) {
						this.garantiacliente=this.garantiaclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.garantiaclienteReturnGeneral=garantiaclienteLogic.procesarEventosGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.garantiaclienteLogic.getGarantiaClientes(),this.garantiacliente,this.garantiaclienteParameterGeneral,this.isEsNuevoGarantiaCliente,classes);//this.garantiaclienteLogic.getGarantiaCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.garantiaclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.garantiaclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.garantiaclienteReturnGeneral.getGarantiaCliente(),garantiaclienteLogic.getGarantiaClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.garantiaclienteReturnGeneral.getGarantiaCliente(),this.garantiaclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosGarantiaCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosGarantiaCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosGarantiaCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosGarantiaCliente() throws Exception {
		
		GarantiaClienteModel garantiaclienteModel=(GarantiaClienteModel)this.jTableDatosGarantiaCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			garantiaclienteModel.garantiaclientes=this.garantiaclienteLogic.getGarantiaClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			garantiaclienteModel.garantiaclientes=this.garantiaclientes;
		}
		
		
		((GarantiaClienteModel) this.jTableDatosGarantiaCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaGarantiaCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getgarantiaclienteAnterior(),this.garantiaclienteLogic.getGarantiaClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getgarantiaclienteAnterior(),this.garantiaclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosGarantiaCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioGarantiaCliente(GarantiaCliente garantiacliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
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
										
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.garantiacliente,new Object(),generalEntityParameterGeneral,this.garantiaclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.garantiaclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=GarantiaClienteConstantesFunciones.getClassesRelationshipsOfGarantiaCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=GarantiaClienteConstantesFunciones.getClassesRelationshipsFromStringsOfGarantiaCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormGarantiaCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				GarantiaClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.garantiacliente,new Object(),generalEntityParameterGeneral,this.garantiaclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioGarantiaCliente(GarantiaClienteBean garantiaclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanGarantiaCliente(ArrayList<Classe> classes,GarantiaClienteReturnGeneral garantiaclienteReturnGeneral,GarantiaClienteBean garantiaclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualGarantiaCliente(GarantiaCliente garantiacliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.garantiacliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormGarantiaCliente = new GarantiaClienteDetalleFormJInternalFrame(jDesktopPane,this.garantiaclienteSessionBean.getConGuardarRelaciones(),this.garantiaclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.setVisible(false);
		this.jInternalFrameDetalleFormGarantiaCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormGarantiaCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormGarantiaCliente.garantiaclienteLogic=this.garantiaclienteLogic;
		
		this.cargarCombosFrameForeignKeyGarantiaCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleGarantiaCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleGarantiaCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyGarantiaCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyGarantiaCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormGarantiaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGarantiaCliente"));
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarGarantiaCliente.addActionListener(new ButtonActionListener(this,"ModificarGarantiaCliente"));

		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarToolBarGarantiaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarGarantiaCliente"));
					
		this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemModificarGarantiaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarGarantiaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarGarantiaCliente.addActionListener (new ButtonActionListener(this,"ActualizarGarantiaCliente"));
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarToolBarGarantiaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGarantiaCliente"));
						
		this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemActualizarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGarantiaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarGarantiaCliente.addActionListener (new ButtonActionListener(this,"EliminarGarantiaCliente"));
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarGarantiaCliente"));
								
		this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemEliminarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGarantiaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarGarantiaCliente.addActionListener (new ButtonActionListener(this,"CancelarGarantiaCliente"));
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarGarantiaCliente"));
					
		this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemCancelarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGarantiaCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemDetalleCerrarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGarantiaCliente"));		
		
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGarantiaCliente"));
		
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGarantiaCliente"));
		
		
		
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGarantiaCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonidGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_empresaGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_empresaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_sucursalGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_sucursalGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGarantiaClienteBusqueda"));
		//jButtonid_clienteGarantiaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteGarantiaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_garantia_empresaGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_garantia_empresaGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonvalorGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"valorGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_recepcionGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_recepcionGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_firmaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_firmaGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_devolucionGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_devolucionGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonbeneficiarioGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_estado_garantia_clienteGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_garantia_clienteGarantiaClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGarantiaCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameGarantiaCliente"));
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarGarantiaCliente"));
		}
		
		this.jTableDatosGarantiaCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarGarantiaCliente"));
		
		this.jTableDatosGarantiaCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarGarantiaCliente"));
		
		this.jButtonNuevoGarantiaCliente.addActionListener(new ButtonActionListener(this,"NuevoGarantiaCliente"));
		
		this.jButtonDuplicarGarantiaCliente.addActionListener(new ButtonActionListener(this,"DuplicarGarantiaCliente"));
		
		this.jButtonCopiarGarantiaCliente.addActionListener(new ButtonActionListener(this,"CopiarGarantiaCliente"));
		
		this.jButtonVerFormGarantiaCliente.addActionListener(new ButtonActionListener(this,"VerFormGarantiaCliente"));
		
		
		this.jButtonNuevoToolBarGarantiaCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarGarantiaCliente"));
			
		this.jButtonDuplicarToolBarGarantiaCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarGarantiaCliente"));
			
		this.jMenuItemNuevoGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGarantiaCliente"));
			
		this.jMenuItemDuplicarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarGarantiaCliente"));		
		
		
		this.jButtonNuevoRelacionesGarantiaCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesGarantiaCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarGarantiaCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarGarantiaCliente"));
			
		this.jMenuItemNuevoRelacionesGarantiaCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesGarantiaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarGarantiaCliente.addActionListener(new ButtonActionListener(this,"ModificarGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonModificarToolBarGarantiaCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarGarantiaCliente"));
			
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemModificarGarantiaCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarGarantiaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarGarantiaCliente.addActionListener (new ButtonActionListener(this,"ActualizarGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonActualizarToolBarGarantiaCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarGarantiaCliente"));
				
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemActualizarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarGarantiaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarGarantiaCliente.addActionListener (new ButtonActionListener(this,"EliminarGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonEliminarToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarGarantiaCliente"));
						
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemEliminarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarGarantiaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarGarantiaCliente.addActionListener (new ButtonActionListener(this,"CancelarGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonCancelarToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarGarantiaCliente"));
			
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemCancelarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarGarantiaCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarGarantiaCliente"));		
		
		
		this.jButtonCerrarGarantiaCliente.addActionListener (new ButtonActionListener(this,"CerrarGarantiaCliente"));
		
		
		this.jButtonCerrarToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarGarantiaCliente"));
			
		this.jMenuItemCerrarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarGarantiaCliente"));
			
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jMenuItemDetalleCerrarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarGarantiaCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosGarantiaCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarGarantiaCliente"));
		}
		
		this.jButtonCopiarToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarGarantiaCliente"));
			
		this.jButtonVerFormToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarGarantiaCliente"));
		
		this.jMenuItemGuardarCambiosGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosGarantiaCliente"));
			
		this.jMenuItemCopiarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarGarantiaCliente"));		
		
		this.jMenuItemVerFormGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormGarantiaCliente"));		
		
		
		this.jButtonGuardarCambiosTablaGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGarantiaCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarGarantiaCliente"));
			
		this.jMenuItemGuardarCambiosTablaGarantiaCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaGarantiaCliente"));		
		
		
		
		this.jButtonRecargarInformacionGarantiaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionGarantiaCliente"));
					
		this.jButtonRecargarInformacionToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarGarantiaCliente"));
		
		this.jMenuItemRecargarInformacionGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionGarantiaCliente"));		
		
		
		
		this.jButtonAnterioresGarantiaCliente.addActionListener (new ButtonActionListener(this,"AnterioresGarantiaCliente"));
		
		
		this.jButtonAnterioresToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarGarantiaCliente"));
		
		this.jMenuItemAnterioresGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresGarantiaCliente"));		
		
		
		this.jButtonSiguientesGarantiaCliente.addActionListener (new ButtonActionListener(this,"SiguientesGarantiaCliente"));
		
		
		this.jButtonSiguientesToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarGarantiaCliente"));
			
		this.jMenuItemSiguientesGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesGarantiaCliente"));
			
		this.jMenuItemAbrirOrderByGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByGarantiaCliente"));
			
		this.jMenuItemMostrarOcultarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarGarantiaCliente"));
			
		this.jMenuItemDetalleAbrirOrderByGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByGarantiaCliente"));
			
		this.jMenuItemDetalleMostarOcultarGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarGarantiaCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosGarantiaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosGarantiaCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarGarantiaCliente"));
			
		this.jMenuItemNuevoGuardarCambiosGarantiaCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosGarantiaCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosGarantiaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosGarantiaCliente"));

		this.jCheckBoxSeleccionadosGarantiaCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosGarantiaCliente"));
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioGarantiaCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesGarantiaCliente"));
			
		this.jComboBoxTiposAccionesGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesGarantiaCliente"));
					
		this.jComboBoxTiposSeleccionarGarantiaCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarGarantiaCliente"));
			
		this.jTextFieldValorCampoGeneralGarantiaCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralGarantiaCliente"));		
		
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonidGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_empresaGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_empresaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_sucursalGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_sucursalGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGarantiaClienteBusqueda"));
		//jButtonid_clienteGarantiaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteGarantiaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_garantia_empresaGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_garantia_empresaGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonvalorGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"valorGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_recepcionGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_recepcionGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_firmaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_firmaGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_devolucionGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_devolucionGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonbeneficiarioGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_estado_garantia_clienteGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_garantia_clienteGarantiaClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteGarantiaCliente"));

			this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaCliente"));

			this.jButtonFK_IdEstadoGarantiaClienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"FK_IdEstadoGarantiaClienteGarantiaCliente"));

			this.jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente.addActionListener(new ButtonActionListener(this,"FK_IdTipoGarantiaEmpresaGarantiaCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoGarantiaCliente!=null) {
				this.jInternalFrameReporteDinamicoGarantiaCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGarantiaCliente"));
				this.jInternalFrameReporteDinamicoGarantiaCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGarantiaCliente"));
				this.jInternalFrameReporteDinamicoGarantiaCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGarantiaCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoGarantiaCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoGarantiaCliente"));				
			//this.jButtonGenerarReporteDinamicoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoGarantiaCliente"));
			//this.jButtonGenerarExcelReporteDinamicoGarantiaCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoGarantiaCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionGarantiaCliente!=null) {
				this.jInternalFrameImportacionGarantiaCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionGarantiaCliente"));
				this.jInternalFrameImportacionGarantiaCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionGarantiaCliente"));
				this.jInternalFrameImportacionGarantiaCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionGarantiaCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByGarantiaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByGarantiaCliente"));
			
			this.jButtonAbrirOrderByToolBarGarantiaCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarGarantiaCliente"));			
			
			if(this.jInternalFrameOrderByGarantiaCliente!=null) {
				this.jInternalFrameOrderByGarantiaCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByGarantiaCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormGarantiaCliente.jTabbedPaneRelacionesGarantiaCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesGarantiaCliente"));
		
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
            		closingInternalFrameGarantiaCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormGarantiaCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormGarantiaCliente = (JInternalFrameBase)event.getSource();
	            	
	            GarantiaClienteBeanSwingJInternalFrame jInternalFrameParent=(GarantiaClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormGarantiaCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarGarantiaClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosGarantiaCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosGarantiaClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosGarantiaCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosGarantiaCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGarantiaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGarantiaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGarantiaClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoGarantiaCliente";
		inputMap = this.jButtonNuevoGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGarantiaClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGarantiaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGarantiaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGarantiaClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesGarantiaCliente";
		inputMap = this.jButtonNuevoRelacionesGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoGarantiaClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarGarantiaCliente";
		inputMap = this.jButtonModificarGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarGarantiaCliente";
		inputMap = this.jButtonActualizarGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarGarantiaCliente";
		inputMap = this.jButtonEliminarGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarGarantiaCliente";
		inputMap = this.jButtonCancelarGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarGarantiaCliente";
		inputMap = this.jButtonCerrarGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosGarantiaCliente";
		inputMap = this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosGarantiaCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonGuardarCambiosGarantiaCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosGarantiaClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosGarantiaCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosGarantiaClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesGarantiaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesGarantiaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarGarantiaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarGarantiaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralGarantiaCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralGarantiaClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonidGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"idGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_empresaGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_empresaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_sucursalGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_sucursalGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalGarantiaClienteBusqueda"));
		//jButtonid_clienteGarantiaCliente.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteGarantiaClienteActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaCliente"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_tipo_garantia_empresaGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_garantia_empresaGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_tipo_garantia_empresaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_garantia_empresaGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonvalorGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"valorGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_recepcionGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_recepcionGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_firmaGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_firmaGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonfecha_devolucionGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"fecha_devolucionGarantiaClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonbeneficiarioGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"beneficiarioGarantiaClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_estado_garantia_clienteGarantiaClienteUpdate.addActionListener(new ButtonActionListener(this,"id_estado_garantia_clienteGarantiaClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_estado_garantia_clienteGarantiaClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_garantia_clienteGarantiaClienteBusqueda"));
		
		
		this.jButtonFK_IdClienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"FK_IdClienteGarantiaCliente"));

		this.jButtonBuscarFK_IdClienteid_clienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"id_clienteGarantiaCliente"));

		this.jButtonFK_IdEstadoGarantiaClienteGarantiaCliente.addActionListener(new ButtonActionListener(this,"FK_IdEstadoGarantiaClienteGarantiaCliente"));

		this.jButtonFK_IdTipoGarantiaEmpresaGarantiaCliente.addActionListener(new ButtonActionListener(this,"FK_IdTipoGarantiaEmpresaGarantiaCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionGarantiaCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionGarantiaClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarGarantiaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarGarantiaCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosGarantiaCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
					garantiaclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GarantiaCliente garantiaclienteAux:garantiaclientes) {
					garantiaclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosGarantiaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGarantiaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
						garantiaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GarantiaCliente garantiaclienteAux:garantiaclientes) {
						garantiaclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GarantiaCliente garantiaclienteAux:garantiaclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaGarantiaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGarantiaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGarantiaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosGarantiaClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingGarantiaCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosGarantiaCliente.getSelectedRows();
			
			GarantiaCliente garantiaclienteLocal=new GarantiaCliente();
			
			//this.seleccionarTodosGarantiaCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					garantiaclienteLocal =(GarantiaCliente) this.garantiaclienteLogic.getGarantiaClientes().toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					garantiaclienteLocal =(GarantiaCliente) this.garantiaclientes.toArray()[this.jTableDatosGarantiaCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				garantiaclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
						garantiaclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(GarantiaCliente garantiaclienteAux:garantiaclientes) {
						garantiaclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaGarantiaCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosGarantiaCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosGarantiaCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosGarantiaCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualGarantiaClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarGarantiaClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralGarantiaClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingGarantiaCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralGarantiaCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(GarantiaCliente garantiaclienteAux:this.garantiaclienteLogic.getGarantiaClientes()) {
				
						if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							garantiaclienteAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION)) {
							existe=true;
							garantiaclienteAux.setfecha_recepcion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA)) {
							existe=true;
							garantiaclienteAux.setfecha_firma(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION)) {
							existe=true;
							garantiaclienteAux.setfecha_devolucion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							garantiaclienteAux.setbeneficiario(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GarantiaCliente garantiaclienteAux:garantiaclientes) {
					
						if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							garantiaclienteAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION)) {
							existe=true;
							garantiaclienteAux.setfecha_recepcion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA)) {
							existe=true;
							garantiaclienteAux.setfecha_firma(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION)) {
							existe=true;
							garantiaclienteAux.setfecha_devolucion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO)) {
							existe=true;
							garantiaclienteAux.setbeneficiario(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaGarantiaCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesGarantiaClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingGarantiaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioGarantiaCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesGarantiaCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteGarantiaCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessGarantiaCliente(conSplash);
				
					this.generarReporteGarantiaClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoGarantiaClientesSeleccionados();
				//this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGarantiaClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoGarantiaClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGarantiaCliente();
				
				this.exportarGarantiaClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionGarantiaClientes();
				//this.importarGarantiaClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessGarantiaCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelGarantiaClientesSeleccionados();
				//this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Garantia Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessGarantiaCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoGarantiaCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyGarantiaCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.setSelectedIndex(0);					
				}	
			} 			
			else if(GarantiaClienteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteGarantiaCliente) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessGarantiaCliente(conSplash);
					
						//this.actualizarParametrosGeneralGarantiaCliente();
						
						this.generarReporteProcesoAccionGarantiaClientesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(GarantiaClienteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Garantia ClienteS SELECCIONADOS?", "MANTENIMIENTO DE Garantia Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessGarantiaCliente();
				
						this.actualizarParametrosGeneralGarantiaCliente();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.garantiaclienteReturnGeneral=garantiaclienteLogic.procesarAccionGarantiaClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.garantiaclienteLogic.getGarantiaClientes(),this.garantiaclienteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarGarantiaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralGarantiaCliente();
					
					GarantiaClienteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarGarantiaClienteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesGarantiaCliente.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxTiposAccionesFormularioGarantiaCliente.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessGarantiaCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesGarantiaClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessGarantiaCliente();
			
			if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		
			GarantiaCliente garantiacliente=new GarantiaCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingGarantiaCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesGarantiaCliente.getSelectedItem();
			
			
			
			
			garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(garantiaclientesSeleccionados.size()==1) {
				for(GarantiaCliente garantiaclienteAux:garantiaclientesSeleccionados) {
					garantiacliente=garantiaclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessGarantiaCliente();
			
      		//this.finishProcessGarantiaCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarGarantiaClienteReturnGeneral() throws Exception {
		if(this.garantiaclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.garantiaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.garantiaclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.garantiaclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.garantiaclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.garantiaclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingGarantiaCliente(false);
		}
		
		if(this.garantiaclienteReturnGeneral.getConRetornoLista() || this.garantiaclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.garantiaclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.garantiaclienteLogic.setGarantiaClientes(this.garantiaclienteReturnGeneral.getGarantiaClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.garantiaclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.garantiaclienteLogic.setGarantiaCliente(this.garantiaclienteReturnGeneral.getGarantiaCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingGarantiaCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralGarantiaCliente() throws Exception {
		
		
	}
	
	public ArrayList<GarantiaCliente> getGarantiaClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioGarantiaCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(GarantiaCliente garantiaclienteAux:garantiaclienteLogic.getGarantiaClientes()) {
					if(garantiaclienteAux.getIsSelected()) {
						garantiaclientesSeleccionados.add(garantiaclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(GarantiaCliente garantiaclienteAux:this.garantiaclientes) {
					if(garantiaclienteAux.getIsSelected()) {
						garantiaclientesSeleccionados.add(garantiaclienteAux);				
					}
				}
			}
			
			if(garantiaclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						garantiaclientesSeleccionados.addAll(this.garantiaclienteLogic.getGarantiaClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						garantiaclientesSeleccionados.addAll(this.garantiaclientes);				
					}
				}
			}
		} else {
			garantiaclientesSeleccionados.add(this.garantiacliente);
		}
		
		return garantiaclientesSeleccionados;
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
	
	public void generarReporteGarantiaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalGarantiaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoGarantiaClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGarantiaClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoGarantiaClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Garantia Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesGarantiaClientesSeleccionados() throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteGarantiaClientes("Todos",garantiaclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalGarantiaClientesSeleccionados() throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteGarantiaClientes("Todos",garantiaclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionGarantiaClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteGarantiaClientes("Todos",garantiaclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoGarantiaClientesSeleccionados() throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoGarantiaCliente();
		
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoGarantiaCliente();
		
		
		//this.generarReporteGarantiaClientes("Todos",garantiaclientesSeleccionados ,garantiaclienteImplementable,garantiaclienteImplementableHome);
	}
	
	public void mostrarImportacionGarantiaClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionGarantiaCliente();
		
		this.abrirFrameImportacionGarantiaCliente();		
		
			
		//this.generarReporteGarantiaClientes("Todos",garantiaclientesSeleccionados ,garantiaclienteImplementable,garantiaclienteImplementableHome);
	}
	
	public void importarGarantiaClientes() throws Exception {		
	
	}
	
	public void exportarGarantiaClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelGarantiaClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoGarantiaClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlGarantiaClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Garantia Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoGarantiaClientesSeleccionados() throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"garantiacliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarGarantiaCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(GarantiaCliente garantiaclienteAux:garantiaclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarGarantiaCliente(garantiaclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//garantiaclienteAux.setsDetalleGeneralEntityReporte(garantiaclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarGarantiaCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarGarantiaCliente(GarantiaCliente garantiacliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=garantiacliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.gettipogarantiaempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getfecha_recepcion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getfecha_firma().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getfecha_devolucion().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getbeneficiario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=garantiacliente.getestadogarantiacliente_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelGarantiaClientesSeleccionados() throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"garantiacliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("GarantiaClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelGarantiaCliente(row);				
				iRow++;
			}				
			
			for(GarantiaCliente garantiaclienteAux:garantiaclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelGarantiaCliente(garantiaclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlGarantiaClientesSeleccionados() throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();		
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"garantiacliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("garantiaclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("garantiacliente");
			//elementRoot.appendChild(element);
		
			for(GarantiaCliente garantiaclienteAux:garantiaclientesSeleccionados) {
				element = document.createElement("garantiacliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlGarantiaCliente(garantiaclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Garantia Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelGarantiaCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelGarantiaCliente(GarantiaCliente garantiacliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.gettipogarantiaempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getfecha_recepcion());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getfecha_firma());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getfecha_devolucion());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getbeneficiario());
		cell = row.createCell(iColumn++);cell.setCellValue(garantiacliente.getestadogarantiacliente_descripcion());				
	}
	
	public void setFilaDatosExportarXmlGarantiaCliente(GarantiaCliente garantiacliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(GarantiaClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(garantiacliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(GarantiaClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(garantiacliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(GarantiaClienteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(garantiacliente.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(GarantiaClienteConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(garantiacliente.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementcliente_descripcion = document.createElement(GarantiaClienteConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(garantiacliente.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementtipogarantiaempresa_descripcion = document.createElement(GarantiaClienteConstantesFunciones.IDTIPOGARANTIAEMPRESA);
		elementtipogarantiaempresa_descripcion.appendChild(document.createTextNode(garantiacliente.gettipogarantiaempresa_descripcion()));
		element.appendChild(elementtipogarantiaempresa_descripcion);

		Element elementvalor = document.createElement(GarantiaClienteConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(garantiacliente.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfecha_recepcion = document.createElement(GarantiaClienteConstantesFunciones.FECHARECEPCION);
		elementfecha_recepcion.appendChild(document.createTextNode(garantiacliente.getfecha_recepcion().toString().trim()));
		element.appendChild(elementfecha_recepcion);

		Element elementfecha_firma = document.createElement(GarantiaClienteConstantesFunciones.FECHAFIRMA);
		elementfecha_firma.appendChild(document.createTextNode(garantiacliente.getfecha_firma().toString().trim()));
		element.appendChild(elementfecha_firma);

		Element elementfecha_devolucion = document.createElement(GarantiaClienteConstantesFunciones.FECHADEVOLUCION);
		elementfecha_devolucion.appendChild(document.createTextNode(garantiacliente.getfecha_devolucion().toString().trim()));
		element.appendChild(elementfecha_devolucion);

		Element elementbeneficiario = document.createElement(GarantiaClienteConstantesFunciones.BENEFICIARIO);
		elementbeneficiario.appendChild(document.createTextNode(garantiacliente.getbeneficiario().trim()));
		element.appendChild(elementbeneficiario);

		Element elementestadogarantiacliente_descripcion = document.createElement(GarantiaClienteConstantesFunciones.IDESTADOGARANTIACLIENTE);
		elementestadogarantiacliente_descripcion.appendChild(document.createTextNode(garantiacliente.getestadogarantiacliente_descripcion()));
		element.appendChild(elementestadogarantiacliente_descripcion);
	}
	
	public void generarReporteGroupGenericoGarantiaClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<GarantiaCliente> garantiaclientesSeleccionados=new ArrayList<GarantiaCliente>();
		
		garantiaclientesSeleccionados=this.getGarantiaClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoGarantiaCliente(garantiaclientesSeleccionados);
		
		this.generarReporteGarantiaClientes("Todos",garantiaclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoGarantiaCliente(ArrayList<GarantiaCliente> garantiaclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(GarantiaCliente garantiaclienteAux:garantiaclientesSeleccionados) {
				garantiaclienteAux.setsDetalleGeneralEntityReporte(garantiaclienteAux.toString());
			
				if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(garantiaclienteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(garantiaclienteAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(garantiaclienteAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_IDTIPOGARANTIAEMPRESA)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(garantiaclienteAux.gettipogarantiaempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHARECEPCION)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(garantiaclienteAux.getfecha_recepcion()));
				}
				 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHAFIRMA)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(garantiaclienteAux.getfecha_firma()));
				}
				 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_FECHADEVOLUCION)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(garantiaclienteAux.getfecha_devolucion()));
				}
				 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_BENEFICIARIO)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(garantiaclienteAux.getbeneficiario());
				}
				 else if(sTipoSeleccionar.equals(GarantiaClienteConstantesFunciones.LABEL_IDESTADOGARANTIACLIENTE)) {
					existe=true;
					garantiaclienteAux.setsDescripcionGeneralEntityReporte1(garantiaclienteAux.getestadogarantiacliente_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,GarantiaClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesGarantiaCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoGarantiaCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=true;
				this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=true;
			}
			
			this.isVisibilidadCeldaModificarGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarGarantiaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGarantiaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=false;
			this.isVisibilidadCeldaModificarGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarGarantiaCliente=true;
			this.isVisibilidadCeldaEliminarGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarGarantiaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGarantiaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=false;
			this.isVisibilidadCeldaModificarGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarGarantiaCliente=true;
			this.isVisibilidadCeldaEliminarGarantiaCliente=true;
			this.isVisibilidadCeldaCancelarGarantiaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGarantiaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=false;
			this.isVisibilidadCeldaModificarGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarGarantiaCliente=true;
			this.isVisibilidadCeldaEliminarGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarGarantiaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoGarantiaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=true;
			this.isVisibilidadCeldaModificarGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarGarantiaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGarantiaCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=false;
			this.isVisibilidadCeldaActualizarGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarGarantiaCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoGarantiaCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=false;
			this.isVisibilidadCeldaModificarGarantiaCliente=true;
			this.isVisibilidadCeldaActualizarGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarGarantiaCliente=false;
			this.isVisibilidadCeldaCancelarGarantiaCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarGarantiaCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(GarantiaClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoGarantiaCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=true;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=true;
		} else {
			this.actualizarEstadoPanelsGarantiaCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarGarantiaCliente=false;
			//this.isVisibilidadCeldaVerFormGarantiaCliente=false;
			this.isVisibilidadCeldaDuplicarGarantiaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!garantiaclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoGarantiaCliente=false;
			this.isVisibilidadCeldaGuardarCambiosGarantiaCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!garantiaclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;												
			}
			
			this.jButtonCerrarGarantiaCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesGarantiaCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.garantiacliente)) {
			this.isVisibilidadCeldaActualizarGarantiaCliente=false;
			this.isVisibilidadCeldaEliminarGarantiaCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesGarantiaCliente() {
	}
	
	public void actualizarEstadoPanelsGarantiaCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionGarantiaCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGarantiaCliente!=null) {
				this.jScrollPanelDatosGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionGarantiaCliente!=null) {
				this.jPanelPaginacionGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionGarantiaCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosGarantiaCliente!=null) {
				this.jScrollPanelDatosGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionGarantiaCliente!=null) {
				this.jPanelPaginacionGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionGarantiaCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGarantiaCliente!=null) {
				this.jScrollPanelDatosGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionGarantiaCliente!=null) {
				this.jPanelPaginacionGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionGarantiaCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosGarantiaCliente!=null) {
				this.jScrollPanelDatosGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionGarantiaCliente!=null) {
				this.jPanelPaginacionGarantiaCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionGarantiaCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGarantiaCliente!=null) {
				this.jScrollPanelDatosGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionGarantiaCliente!=null) {
				this.jPanelPaginacionGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionGarantiaCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGarantiaCliente!=null) {
				this.jScrollPanelDatosGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionGarantiaCliente!=null) {
				this.jPanelPaginacionGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionGarantiaCliente!=null) {
				this.jScrollPanelDatosEdicionGarantiaCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosGarantiaCliente!=null) {
				this.jScrollPanelDatosGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionGarantiaCliente!=null) {
				this.jPanelPaginacionGarantiaCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
					this.jTabbedPaneBusquedasGarantiaCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.garantiaclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasGarantiaCliente!=null) {
				this.jTabbedPaneBusquedasGarantiaCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesGarantiaCliente!=null) {
				this.jPanelParametrosReportesGarantiaCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdClienteGarantiaCliente);}

			this.isVisibilidadFK_IdEstadoGarantiaCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoGarantiaCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);}

			this.isVisibilidadFK_IdTipoGarantiaEmpresa=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoGarantiaEmpresa) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdClienteGarantiaCliente);}

			this.isVisibilidadFK_IdEstadoGarantiaCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoGarantiaCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);}

			this.isVisibilidadFK_IdTipoGarantiaEmpresa=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoGarantiaEmpresa) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdClienteGarantiaCliente);}

			this.isVisibilidadFK_IdEstadoGarantiaCliente=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdEstadoGarantiaCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);}

			this.isVisibilidadFK_IdTipoGarantiaEmpresa=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoGarantiaEmpresa) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoGarantiaEmpresa(Boolean isParaTipoGarantiaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoGarantiaEmpresaNegation=!isParaTipoGarantiaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaTipoGarantiaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdClienteGarantiaCliente);}

			this.isVisibilidadFK_IdEstadoGarantiaCliente=isParaTipoGarantiaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoGarantiaCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);}

			this.isVisibilidadFK_IdTipoGarantiaEmpresa=isParaTipoGarantiaEmpresa;
			if(!this.isVisibilidadFK_IdTipoGarantiaEmpresa) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoGarantiaCliente(Boolean isParaEstadoGarantiaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoGarantiaClienteNegation=!isParaEstadoGarantiaCliente;

			this.isVisibilidadFK_IdCliente=isParaEstadoGarantiaClienteNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdClienteGarantiaCliente);}

			this.isVisibilidadFK_IdEstadoGarantiaCliente=isParaEstadoGarantiaCliente;
			if(!this.isVisibilidadFK_IdEstadoGarantiaCliente) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);}

			this.isVisibilidadFK_IdTipoGarantiaEmpresa=isParaEstadoGarantiaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoGarantiaEmpresa) {this.jTabbedPaneBusquedasGarantiaCliente.remove(jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);}
		}
		
	}
	
	
	
	

	public String registrarSesionGarantiaClienteParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(garantiaclienteSessionBean==null) {
				garantiaclienteSessionBean=new GarantiaClienteSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(garantiaclienteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.garantiaclienteFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(GarantiaClienteConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionGarantiaCliente(true);
			//clienteSessionBean.setlidGarantiaClienteActual(this.idGarantiaClienteActual);

			garantiaclienteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyGarantiaCliente(true);
			garantiaclienteSessionBean.setlIdGarantiaClienteActualForeignKey(this.idGarantiaClienteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//GarantiaClienteSessionBean garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		
		if(this.garantiaclienteSessionBean==null) {
			this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		}
		
		this.garantiaclienteSessionBean.setsUltimaBusquedaGarantiaCliente(this.getsAccionBusqueda());
		this.garantiaclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.garantiaclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			garantiaclienteSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			garantiaclienteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoGarantiaCliente")) {
			garantiaclienteSessionBean.setid_estado_garantia_cliente(this.getid_estado_garantia_clienteFK_IdEstadoGarantiaCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			garantiaclienteSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoGarantiaEmpresa")) {
			garantiaclienteSessionBean.setid_tipo_garantia_empresa(this.getid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//GarantiaClienteSessionBean garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		
		if(this.garantiaclienteSessionBean==null) {
			this.garantiaclienteSessionBean=new GarantiaClienteSessionBean();
		}
		
		if(this.garantiaclienteSessionBean.getsUltimaBusquedaGarantiaCliente()!=null&&!this.garantiaclienteSessionBean.getsUltimaBusquedaGarantiaCliente().equals("")) {
			this.setsAccionBusqueda(garantiaclienteSessionBean.getsUltimaBusquedaGarantiaCliente());
			this.setiNumeroPaginacion(garantiaclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(garantiaclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(garantiaclienteSessionBean.getid_cliente());
				garantiaclienteSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(garantiaclienteSessionBean.getid_empresa());
				garantiaclienteSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoGarantiaCliente")) {
				this.setid_estado_garantia_clienteFK_IdEstadoGarantiaCliente(garantiaclienteSessionBean.getid_estado_garantia_cliente());
				garantiaclienteSessionBean.setid_estado_garantia_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(garantiaclienteSessionBean.getid_sucursal());
				garantiaclienteSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoGarantiaEmpresa")) {
				this.setid_tipo_garantia_empresaFK_IdTipoGarantiaEmpresa(garantiaclienteSessionBean.getid_tipo_garantia_empresa());
				garantiaclienteSessionBean.setid_tipo_garantia_empresa(-1L);
			}
		}
		
		this.garantiaclienteSessionBean.setsUltimaBusquedaGarantiaCliente("");
		this.garantiaclienteSessionBean.setiNumeroPaginacion(GarantiaClienteConstantesFunciones.INUMEROPAGINACION);
		this.garantiaclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaGarantiaCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioGarantiaCliente() {
		this.updateBorderResaltarBusquedasFormularioGarantiaCliente();
		this.updateVisibilidadBusquedasFormularioGarantiaCliente();
		this.updateHabilitarBusquedasFormularioGarantiaCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioGarantiaCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasGarantiaCliente.getComponents().length>0) {
	

		if(this.garantiaclienteConstantesFunciones.resaltarFK_IdClienteGarantiaCliente!=null) {
			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdClienteGarantiaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
				jPanel.setBorder(this.garantiaclienteConstantesFunciones.resaltarFK_IdClienteGarantiaCliente);
			}
		}

		if(this.garantiaclienteConstantesFunciones.resaltarFK_IdEstadoGarantiaClienteGarantiaCliente!=null) {
			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
				jPanel.setBorder(this.garantiaclienteConstantesFunciones.resaltarFK_IdEstadoGarantiaClienteGarantiaCliente);
			}
		}

		if(this.garantiaclienteConstantesFunciones.resaltarFK_IdTipoGarantiaEmpresaGarantiaCliente!=null) {
			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
				jPanel.setBorder(this.garantiaclienteConstantesFunciones.resaltarFK_IdTipoGarantiaEmpresaGarantiaCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioGarantiaCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasGarantiaCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdClienteGarantiaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.garantiaclienteConstantesFunciones.mostrarFK_IdClienteGarantiaCliente);
			if(!this.garantiaclienteConstantesFunciones.mostrarFK_IdClienteGarantiaCliente && index>-1) {
				this.jTabbedPaneBusquedasGarantiaCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.garantiaclienteConstantesFunciones.mostrarFK_IdEstadoGarantiaClienteGarantiaCliente);
			if(!this.garantiaclienteConstantesFunciones.mostrarFK_IdEstadoGarantiaClienteGarantiaCliente && index>-1) {
				this.jTabbedPaneBusquedasGarantiaCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.garantiaclienteConstantesFunciones.mostrarFK_IdTipoGarantiaEmpresaGarantiaCliente);
			if(!this.garantiaclienteConstantesFunciones.mostrarFK_IdTipoGarantiaEmpresaGarantiaCliente && index>-1) {
				this.jTabbedPaneBusquedasGarantiaCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioGarantiaCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasGarantiaCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdClienteGarantiaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.garantiaclienteConstantesFunciones.activarFK_IdClienteGarantiaCliente);
				this.jTabbedPaneBusquedasGarantiaCliente.setEnabledAt(index,this.garantiaclienteConstantesFunciones.activarFK_IdClienteGarantiaCliente);
			}

			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.garantiaclienteConstantesFunciones.activarFK_IdEstadoGarantiaClienteGarantiaCliente);
				this.jTabbedPaneBusquedasGarantiaCliente.setEnabledAt(index,this.garantiaclienteConstantesFunciones.activarFK_IdEstadoGarantiaClienteGarantiaCliente);
			}

			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.garantiaclienteConstantesFunciones.activarFK_IdTipoGarantiaEmpresaGarantiaCliente);
				this.jTabbedPaneBusquedasGarantiaCliente.setEnabledAt(index,this.garantiaclienteConstantesFunciones.activarFK_IdTipoGarantiaEmpresaGarantiaCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaGarantiaCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdClienteGarantiaCliente);

			this.jTabbedPaneBusquedasGarantiaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);

			this.garantiaclienteConstantesFunciones.setResaltarFK_IdClienteGarantiaCliente(resaltar);

			jPanel.setBorder(this.garantiaclienteConstantesFunciones.resaltarFK_IdClienteGarantiaCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoGarantiaCliente")) {
			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdEstadoGarantiaClienteGarantiaCliente);

			this.jTabbedPaneBusquedasGarantiaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);

			this.garantiaclienteConstantesFunciones.setResaltarFK_IdEstadoGarantiaClienteGarantiaCliente(resaltar);

			jPanel.setBorder(this.garantiaclienteConstantesFunciones.resaltarFK_IdEstadoGarantiaClienteGarantiaCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoGarantiaEmpresa")) {
			index= this.jTabbedPaneBusquedasGarantiaCliente.indexOfComponent(this.jPanelFK_IdTipoGarantiaEmpresaGarantiaCliente);

			this.jTabbedPaneBusquedasGarantiaCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasGarantiaCliente.getComponent(index);

			this.garantiaclienteConstantesFunciones.setResaltarFK_IdTipoGarantiaEmpresaGarantiaCliente(resaltar);

			jPanel.setBorder(this.garantiaclienteConstantesFunciones.resaltarFK_IdTipoGarantiaEmpresaGarantiaCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarGarantiaCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioGarantiaCliente() throws Exception {

		if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioGarantiaCliente();
		this.updateVisibilidadResaltarControlesFormularioGarantiaCliente();
		this.updateHabilitarResaltarControlesFormularioGarantiaCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioGarantiaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.garantiaclienteConstantesFunciones.resaltaridGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltaridGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarid_empresaGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarid_empresaGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarid_sucursalGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarid_sucursalGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarid_clienteGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarid_clienteGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarid_tipo_garantia_empresaGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarid_tipo_garantia_empresaGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarvalorGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jTextFieldvalorGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarvalorGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarfecha_recepcionGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_recepcionGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarfecha_recepcionGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarfecha_firmaGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_firmaGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarfecha_firmaGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarfecha_devolucionGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_devolucionGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarfecha_devolucionGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarbeneficiarioGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jTextAreabeneficiarioGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarbeneficiarioGarantiaCliente);}
		if(this.garantiaclienteConstantesFunciones.resaltarid_estado_garantia_clienteGarantiaCliente!=null && this.jInternalFrameDetalleFormGarantiaCliente!=null) {this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setBorder(this.garantiaclienteConstantesFunciones.resaltarid_estado_garantia_clienteGarantiaCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioGarantiaCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
	
		//this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostraridGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelidGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostraridGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_empresaGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelid_empresaGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_empresaGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_sucursalGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelid_sucursalGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_sucursalGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_clienteGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelid_clienteGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_clienteGarantiaCliente);
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_clienteGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_tipo_garantia_empresaGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelid_tipo_garantia_empresaGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_tipo_garantia_empresaGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jTextFieldvalorGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarvalorGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelvalorGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarvalorGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_recepcionGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarfecha_recepcionGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelfecha_recepcionGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarfecha_recepcionGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_firmaGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarfecha_firmaGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelfecha_firmaGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarfecha_firmaGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_devolucionGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarfecha_devolucionGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelfecha_devolucionGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarfecha_devolucionGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jTextAreabeneficiarioGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarbeneficiarioGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelbeneficiarioGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarbeneficiarioGarantiaCliente);
		//this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_estado_garantia_clienteGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jPanelid_estado_garantia_clienteGarantiaCliente.setVisible(this.garantiaclienteConstantesFunciones.mostrarid_estado_garantia_clienteGarantiaCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioGarantiaCliente() throws Exception {
		if(this.jInternalFrameDetalleFormGarantiaCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormGarantiaCliente!=null) {
	
		this.jInternalFrameDetalleFormGarantiaCliente.jLabelidGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activaridGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_empresaGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarid_empresaGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_sucursalGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarid_sucursalGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_clienteGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarid_clienteGarantiaCliente);
			this.jInternalFrameDetalleFormGarantiaCliente.jButtonid_clienteGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarid_clienteGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_tipo_garantia_empresaGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarid_tipo_garantia_empresaGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jTextFieldvalorGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarvalorGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_recepcionGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarfecha_recepcionGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_firmaGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarfecha_firmaGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jDateChooserfecha_devolucionGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarfecha_devolucionGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jTextAreabeneficiarioGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarbeneficiarioGarantiaCliente);
		this.jInternalFrameDetalleFormGarantiaCliente.jComboBoxid_estado_garantia_clienteGarantiaCliente.setEnabled(this.garantiaclienteConstantesFunciones.activarid_estado_garantia_clienteGarantiaCliente);
		}
	}
	
		
}