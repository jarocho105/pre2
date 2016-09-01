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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.PedidoProduConstantesFunciones;
import com.bydan.erp.produccion.util.PedidoProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.PedidoProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.PedidoProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class PedidoProduBeanSwingJInternalFrame extends PedidoProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(PedidoProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<PedidoProdu> pedidoproduValidator = new ClassValidator<PedidoProdu>(PedidoProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public PedidoProdu pedidoprodu;	
	public PedidoProdu pedidoproduAux;
	public PedidoProdu pedidoproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public PedidoProdu pedidoproduTotales;
	public Long idPedidoProduActual;
	public Long iIdNuevoPedidoProdu=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboFormato="";

	public List<Formato> formatosForeignKey;

	public List<Formato> getformatosForeignKey() {
		return formatosForeignKey;
	}

	public void setformatosForeignKey(List<Formato> formatosForeignKey) {
		this.formatosForeignKey = formatosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Formato formatoForeignKey;

	public Formato getformatoForeignKey() {
		return formatoForeignKey;
	}

	public void setformatoForeignKey(Formato formatoForeignKey) {
		this.formatoForeignKey = formatoForeignKey;
	}

	public String sFinalQueryComboTipoPrioridadEmpresaProdu="";

	public List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusForeignKey;

	public List<TipoPrioridadEmpresaProdu> gettipoprioridadempresaprodusForeignKey() {
		return tipoprioridadempresaprodusForeignKey;
	}

	public void settipoprioridadempresaprodusForeignKey(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusForeignKey) {
		this.tipoprioridadempresaprodusForeignKey = tipoprioridadempresaprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoPrioridadEmpresaProdu tipoprioridadempresaproduForeignKey;

	public TipoPrioridadEmpresaProdu gettipoprioridadempresaproduForeignKey() {
		return tipoprioridadempresaproduForeignKey;
	}

	public void settipoprioridadempresaproduForeignKey(TipoPrioridadEmpresaProdu tipoprioridadempresaproduForeignKey) {
		this.tipoprioridadempresaproduForeignKey = tipoprioridadempresaproduForeignKey;
	}

	public String sFinalQueryComboEmpleadoResponsable="";

	public List<Empleado> empleadoresponsablesForeignKey;

	public List<Empleado> getempleadoresponsablesForeignKey() {
		return empleadoresponsablesForeignKey;
	}

	public void setempleadoresponsablesForeignKey(List<Empleado> empleadoresponsablesForeignKey) {
		this.empleadoresponsablesForeignKey = empleadoresponsablesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoresponsableForeignKey;

	public Empleado getempleadoresponsableForeignKey() {
		return empleadoresponsableForeignKey;
	}

	public void setempleadoresponsableForeignKey(Empleado empleadoresponsableForeignKey) {
		this.empleadoresponsableForeignKey = empleadoresponsableForeignKey;
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

	public String sFinalQueryComboEstadoOrdenProdu="";

	public List<EstadoOrdenProdu> estadoordenprodusForeignKey;

	public List<EstadoOrdenProdu> getestadoordenprodusForeignKey() {
		return estadoordenprodusForeignKey;
	}

	public void setestadoordenprodusForeignKey(List<EstadoOrdenProdu> estadoordenprodusForeignKey) {
		this.estadoordenprodusForeignKey = estadoordenprodusForeignKey;
	}

	//OBJETO FK ACTUAL
	public EstadoOrdenProdu estadoordenproduForeignKey;

	public EstadoOrdenProdu getestadoordenproduForeignKey() {
		return estadoordenproduForeignKey;
	}

	public void setestadoordenproduForeignKey(EstadoOrdenProdu estadoordenproduForeignKey) {
		this.estadoordenproduForeignKey = estadoordenproduForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	

	public Boolean isTienePermisosPedidoDetaProdu=false;

	public Boolean getIsTienePermisosPedidoDetaProdu() {
		return isTienePermisosPedidoDetaProdu;
	}

	public void setIsTienePermisosPedidoDetaProdu(Boolean isTienePermisosPedidoDetaProdu) {
		this.isTienePermisosPedidoDetaProdu= isTienePermisosPedidoDetaProdu;
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
	
	public Boolean isPermisoTodoPedidoProdu;
	public Boolean isPermisoNuevoPedidoProdu;
	public Boolean isPermisoActualizarPedidoProdu;
	public Boolean isPermisoActualizarOriginalPedidoProdu;
	public Boolean isPermisoEliminarPedidoProdu;
	public Boolean isPermisoGuardarCambiosPedidoProdu;
	public Boolean isPermisoConsultaPedidoProdu;
	public Boolean isPermisoBusquedaPedidoProdu;
	public Boolean isPermisoReportePedidoProdu;
	public Boolean isPermisoPaginacionMedioPedidoProdu;
	public Boolean isPermisoPaginacionAltoPedidoProdu;
	public Boolean isPermisoPaginacionTodoPedidoProdu;
	public Boolean isPermisoCopiarPedidoProdu;
	public Boolean isPermisoVerFormPedidoProdu;
	public Boolean isPermisoDuplicarPedidoProdu;
	public Boolean isPermisoOrdenPedidoProdu;
	
	
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
	
	public PedidoProduParameterReturnGeneral pedidoproduReturnGeneral;
	public PedidoProduParameterReturnGeneral pedidoproduParameterGeneral;
	
	

	public PedidoDetaProduLogic pedidodetaproduLogic=null;

	public PedidoDetaProduLogic getPedidoDetaProduLogic() {
		return pedidodetaproduLogic;
	}

	public void setPedidoDetaProduLogic(PedidoDetaProduLogic pedidodetaproduLogic) {
		this.pedidodetaproduLogic = pedidodetaproduLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoPedidoProdu=false;
	public Boolean esParaAccionDesdeFormularioPedidoProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected PedidoProduSessionBeanAdditional pedidoproduSessionBeanAdditional=null;
	
	public PedidoProduSessionBeanAdditional getPedidoProduSessionBeanAdditional() {
		return this.pedidoproduSessionBeanAdditional;
	}
	
	public void setPedidoProduSessionBeanAdditional(PedidoProduSessionBeanAdditional pedidoproduSessionBeanAdditional) {
		try {
			this.pedidoproduSessionBeanAdditional=pedidoproduSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected PedidoProduBeanSwingJInternalFrameAdditional pedidoproduBeanSwingJInternalFrameAdditional=null;
	//public class PedidoProduBeanSwingJInternalFrame
	
	public PedidoProduBeanSwingJInternalFrameAdditional getPedidoProduBeanSwingJInternalFrameAdditional() {
		return this.pedidoproduBeanSwingJInternalFrameAdditional;
	}
	
	public void setPedidoProduBeanSwingJInternalFrameAdditional(PedidoProduBeanSwingJInternalFrameAdditional pedidoproduBeanSwingJInternalFrameAdditional) {
		try {
			this.pedidoproduBeanSwingJInternalFrameAdditional=pedidoproduBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public PedidoProduLogic pedidoproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public PedidoProdu pedidoproduBean;
	public PedidoProduConstantesFunciones pedidoproduConstantesFunciones;
	//public PedidoProduParameterReturnGeneral pedidoproduReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public FormatoLogic formatoLogic;
	public TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogic;
	public EmpleadoLogic empleadoresponsableLogic;
	public ClienteLogic clienteLogic;
	public EstadoOrdenProduLogic estadoordenproduLogic;
	
	//PARAMETROS
	
	
	//public List<PedidoProdu> pedidoprodus;	
	//public List<PedidoProdu> pedidoprodusEliminados;
	//public List<PedidoProdu> pedidoprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoPedidoProdu=false;
	public Boolean isVisibilidadCeldaDuplicarPedidoProdu=true;
	public Boolean isVisibilidadCeldaCopiarPedidoProdu=true;
	public Boolean isVisibilidadCeldaVerFormPedidoProdu=true;
	public Boolean isVisibilidadCeldaOrdenPedidoProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
	public Boolean isVisibilidadCeldaModificarPedidoProdu=false;
	public Boolean isVisibilidadCeldaActualizarPedidoProdu=false;
	public Boolean isVisibilidadCeldaEliminarPedidoProdu=false;
	public Boolean isVisibilidadCeldaCancelarPedidoProdu=false;
	public Boolean isVisibilidadCeldaGuardarPedidoProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosPedidoProdu=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpleadoResponsable=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstadoOrdenProdu=false;
	public Boolean isVisibilidadFK_IdFormato=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoPrioridadEmpresaProdu=false;
	
	public Long getiIdNuevoPedidoProdu() {
		return this.iIdNuevoPedidoProdu;
	}

	public void setiIdNuevoPedidoProdu(Long iIdNuevoPedidoProdu) {
		this.iIdNuevoPedidoProdu = iIdNuevoPedidoProdu;
	}
	
	public Long getidPedidoProduActual() {
		return this.idPedidoProduActual;
	}

	public void setidPedidoProduActual(Long idPedidoProduActual) {
		this.idPedidoProduActual = idPedidoProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public PedidoProdu getpedidoprodu() {
		return this.pedidoprodu;
	}

	public void setpedidoprodu(PedidoProdu pedidoprodu) {
		this.pedidoprodu = pedidoprodu;
	}
	
	public PedidoProdu getpedidoproduAux() {
		return this.pedidoproduAux;
	}

	public void setpedidoproduAux(PedidoProdu pedidoproduAux) {
		this.pedidoproduAux = pedidoproduAux;
	}				
	
	public PedidoProdu getpedidoproduAnterior() {
		return this.pedidoproduAnterior;
	}

	public void setpedidoproduAnterior(PedidoProdu pedidoproduAnterior) {
		this.pedidoproduAnterior = pedidoproduAnterior;
	}	
	
	public PedidoProdu getpedidoproduTotales() {
		return this.pedidoproduTotales;
	}

	public void setpedidoproduTotales(PedidoProdu pedidoproduTotales) {
		this.pedidoproduTotales = pedidoproduTotales;
	}	
	
	public PedidoProdu getpedidoproduBean() {
		return this.pedidoproduBean;
	}

	public void setpedidoproduBean(PedidoProdu pedidoproduBean) {
		this.pedidoproduBean = pedidoproduBean;
	}	
	
	public PedidoProduParameterReturnGeneral getpedidoproduReturnGeneral() {
		return this.pedidoproduReturnGeneral;
	}

	public void setpedidoproduReturnGeneral(PedidoProduParameterReturnGeneral pedidoproduReturnGeneral) {
		this.pedidoproduReturnGeneral = pedidoproduReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empleado_responsableFK_IdEmpleadoResponsable=-1L;

	public Long getid_empleado_responsableFK_IdEmpleadoResponsable() {
		return this.id_empleado_responsableFK_IdEmpleadoResponsable;
	}

	public void setid_empleado_responsableFK_IdEmpleadoResponsable(Long id_empleado_responsableFK_IdEmpleadoResponsable) {
		this.id_empleado_responsableFK_IdEmpleadoResponsable = id_empleado_responsableFK_IdEmpleadoResponsable;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estado_orden_produFK_IdEstadoOrdenProdu=-1L;

	public Long getid_estado_orden_produFK_IdEstadoOrdenProdu() {
		return this.id_estado_orden_produFK_IdEstadoOrdenProdu;
	}

	public void setid_estado_orden_produFK_IdEstadoOrdenProdu(Long id_estado_orden_produFK_IdEstadoOrdenProdu) {
		this.id_estado_orden_produFK_IdEstadoOrdenProdu = id_estado_orden_produFK_IdEstadoOrdenProdu;
	}

	public Long id_formatoFK_IdFormato=null;

	public Long getid_formatoFK_IdFormato() {
		return this.id_formatoFK_IdFormato;
	}

	public void setid_formatoFK_IdFormato(Long id_formatoFK_IdFormato) {
		this.id_formatoFK_IdFormato = id_formatoFK_IdFormato;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu=-1L;

	public Long getid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu() {
		return this.id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu;
	}

	public void setid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu(Long id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu) {
		this.id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu = id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public PedidoProduLogic getPedidoProduLogic()	{		
		return pedidoproduLogic;
	}

	public void setPedidoProduLogic(PedidoProduLogic pedidoproduLogic) {
		this.pedidoproduLogic = pedidoproduLogic;
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
	
	public Boolean getIsEsNuevoPedidoProdu() {
		return isEsNuevoPedidoProdu;
	}

	public void setIsEsNuevoPedidoProdu(Boolean isEsNuevoPedidoProdu) {
		this.isEsNuevoPedidoProdu = isEsNuevoPedidoProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioPedidoProdu() {
		return esParaAccionDesdeFormularioPedidoProdu;
	}
	
	public void setEsParaAccionDesdeFormularioPedidoProdu(Boolean esParaAccionDesdeFormularioPedidoProdu) {
		this.esParaAccionDesdeFormularioPedidoProdu = esParaAccionDesdeFormularioPedidoProdu;
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

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(pedidoproduSessionBean.getlidEmpresaActual());
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

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(pedidoproduSessionBean.getlidSucursalActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(pedidoproduSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(pedidoproduSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosFormatosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.formatosForeignKey=new ArrayList<Formato>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FormatoLogic formatoLogic=new FormatoLogic();

			//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//formatoLogic.getFormatoDataAccess().setIsForForeingKeyData(true);

					formatoLogic.getTodosFormatosWithConnection(sFinalQuery,new Pagination());

					this.formatosForeignKey=formatoLogic.getFormatos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFormato(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					formatoLogic.getEntityWithConnection(pedidoproduSessionBean.getlidFormatoActual());
					this.formatosForeignKey.add(formatoLogic.getFormato());
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

	public void cargarCombosTipoPrioridadEmpresaProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoprioridadempresaprodusForeignKey=new ArrayList<TipoPrioridadEmpresaProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoPrioridadEmpresaProduLogic tipoprioridadempresaproduLogic=new TipoPrioridadEmpresaProduLogic();

			//tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProduDataAccess().setIsForForeingKeyData(true);

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProduDataAccess().setIsForForeingKeyData(true);

					tipoprioridadempresaproduLogic.getTodosTipoPrioridadEmpresaProdusWithConnection(sFinalQuery,new Pagination());

					this.tipoprioridadempresaprodusForeignKey=tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoPrioridadEmpresaProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadempresaproduLogic.getEntityWithConnection(pedidoproduSessionBean.getlidTipoPrioridadEmpresaProduActual());
					this.tipoprioridadempresaprodusForeignKey.add(tipoprioridadempresaproduLogic.getTipoPrioridadEmpresaProdu());
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

	public void cargarCombosEmpleadoResponsablesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadoresponsablesForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoResponsable()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoresponsableLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadoresponsablesForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleadoResponsable(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(pedidoproduSessionBean.getlidEmpleadoResponsableActual());
					this.empleadoresponsablesForeignKey.add(empleadoLogic.getEmpleado());
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

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(pedidoproduSessionBean.getlidClienteActual());
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

	public void cargarCombosEstadoOrdenProdusForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estadoordenprodusForeignKey=new ArrayList<EstadoOrdenProdu>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstadoOrdenProduLogic estadoordenproduLogic=new EstadoOrdenProduLogic();

			//estadoordenproduLogic.getEstadoOrdenProduDataAccess().setIsForForeingKeyData(true);

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEstadoOrdenProdu()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estadoordenproduLogic.getEstadoOrdenProduDataAccess().setIsForForeingKeyData(true);

					estadoordenproduLogic.getTodosEstadoOrdenProdusWithConnection(sFinalQuery,new Pagination());

					this.estadoordenprodusForeignKey=estadoordenproduLogic.getEstadoOrdenProdus();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstadoOrdenProdu(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoordenproduLogic.getEntityWithConnection(pedidoproduSessionBean.getlidEstadoOrdenProduActual());
					this.estadoordenprodusForeignKey.add(estadoordenproduLogic.getEstadoOrdenProdu());
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

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaPedidoProdu.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaPedidoProduGenerico)throws Exception
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
				jComboBoxid_empresaPedidoProduGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaPedidoProduGenerico!=null && jComboBoxid_empresaPedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_empresaPedidoProduGenerico.setSelectedIndex(0);
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

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalPedidoProdu.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalPedidoProduGenerico)throws Exception
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
				jComboBoxid_sucursalPedidoProduGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalPedidoProduGenerico!=null && jComboBoxid_sucursalPedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_sucursalPedidoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioPedidoProdu.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioPedidoProduGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioPedidoProduGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioPedidoProduGenerico!=null && jComboBoxid_ejercicioPedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioPedidoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoPedidoProdu.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoPedidoProduGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoPedidoProduGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoPedidoProduGenerico!=null && jComboBoxid_periodoPedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_periodoPedidoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFormatoForeignKey(Long idFormatoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(formatoTemp!=null) {

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setFormato(formatoTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setSelectedItem(formatoTemp);
					}
				} else {
					//jComboBoxid_formatoPedidoProdu.setSelectedItem(formatoTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){
					if(formatoTemp!=null && jComboBoxid_formatoFK_IdFormatoPedidoProdu!=null) {
						jComboBoxid_formatoFK_IdFormatoPedidoProdu.setSelectedItem(formatoTemp);
					} else {
						if(jComboBoxid_formatoFK_IdFormatoPedidoProdu!=null) {
							//jComboBoxid_formatoFK_IdFormatoPedidoProdu.setSelectedItem(formatoTemp);
							if(jComboBoxid_formatoFK_IdFormatoPedidoProdu.getItemCount()>0) {
								jComboBoxid_formatoFK_IdFormatoPedidoProdu.setSelectedIndex(0);
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

	public String getActualFormatoForeignKeyDescripcion(Long idFormatoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}


			sDescripcion=FormatoConstantesFunciones.getFormatoDescripcion(formatoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFormatoForeignKeyGenerico(Long idFormatoSeleccionado,JComboBox jComboBoxid_formatoPedidoProduGenerico)throws Exception
	{
		try
		{
			Formato  formatoTemp=null;

			for(Formato formatoAux:formatosForeignKey) {
				if(formatoAux.getId()!=null && formatoAux.getId().equals(idFormatoSeleccionado)) {
					formatoTemp=formatoAux;
					break;
				}
			}

			if(formatoTemp!=null) {
				jComboBoxid_formatoPedidoProduGenerico.setSelectedItem(formatoTemp);
			} else {
				if(jComboBoxid_formatoPedidoProduGenerico!=null && jComboBoxid_formatoPedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_formatoPedidoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoPrioridadEmpresaProduForeignKey(Long idTipoPrioridadEmpresaProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduTemp=null;

			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusForeignKey) {
				if(tipoprioridadempresaproduAux.getId()!=null && tipoprioridadempresaproduAux.getId().equals(idTipoPrioridadEmpresaProduSeleccionado)) {
					tipoprioridadempresaproduTemp=tipoprioridadempresaproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoprioridadempresaproduTemp!=null) {

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setTipoPrioridadEmpresaProdu(tipoprioridadempresaproduTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setSelectedItem(tipoprioridadempresaproduTemp);
					}
				} else {
					//jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setSelectedItem(tipoprioridadempresaproduTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoPrioridadEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoprioridadempresaproduTemp!=null && jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu!=null) {
						jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setSelectedItem(tipoprioridadempresaproduTemp);
					} else {
						if(jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu!=null) {
							//jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setSelectedItem(tipoprioridadempresaproduTemp);
							if(jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.getItemCount()>0) {
								jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setSelectedIndex(0);
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

	public String getActualTipoPrioridadEmpresaProduForeignKeyDescripcion(Long idTipoPrioridadEmpresaProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduTemp=null;

			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusForeignKey) {
				if(tipoprioridadempresaproduAux.getId()!=null && tipoprioridadempresaproduAux.getId().equals(idTipoPrioridadEmpresaProduSeleccionado)) {
					tipoprioridadempresaproduTemp=tipoprioridadempresaproduAux;
					break;
				}
			}


			sDescripcion=TipoPrioridadEmpresaProduConstantesFunciones.getTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoPrioridadEmpresaProduForeignKeyGenerico(Long idTipoPrioridadEmpresaProduSeleccionado,JComboBox jComboBoxid_tipo_prioridad_empresa_produPedidoProduGenerico)throws Exception
	{
		try
		{
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduTemp=null;

			for(TipoPrioridadEmpresaProdu tipoprioridadempresaproduAux:tipoprioridadempresaprodusForeignKey) {
				if(tipoprioridadempresaproduAux.getId()!=null && tipoprioridadempresaproduAux.getId().equals(idTipoPrioridadEmpresaProduSeleccionado)) {
					tipoprioridadempresaproduTemp=tipoprioridadempresaproduAux;
					break;
				}
			}

			if(tipoprioridadempresaproduTemp!=null) {
				jComboBoxid_tipo_prioridad_empresa_produPedidoProduGenerico.setSelectedItem(tipoprioridadempresaproduTemp);
			} else {
				if(jComboBoxid_tipo_prioridad_empresa_produPedidoProduGenerico!=null && jComboBoxid_tipo_prioridad_empresa_produPedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_tipo_prioridad_empresa_produPedidoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoResponsableForeignKey(Long idEmpleadoResponsableSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoresponsableTemp=null;

			for(Empleado empleadoresponsableAux:empleadoresponsablesForeignKey) {
				if(empleadoresponsableAux.getId()!=null && empleadoresponsableAux.getId().equals(idEmpleadoResponsableSeleccionado)) {
					empleadoresponsableTemp=empleadoresponsableAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoresponsableTemp!=null) {

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setEmpleadoResponsable(empleadoresponsableTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setSelectedItem(empleadoresponsableTemp);
					}
				} else {
					//jComboBoxid_empleado_responsablePedidoProdu.setSelectedItem(empleadoresponsableTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoResponsable") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoresponsableTemp!=null && jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu!=null) {
						jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setSelectedItem(empleadoresponsableTemp);
					} else {
						if(jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu!=null) {
							//jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setSelectedItem(empleadoresponsableTemp);
							if(jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.getItemCount()>0) {
								jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setSelectedIndex(0);
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

	public String getActualEmpleadoResponsableForeignKeyDescripcion(Long idEmpleadoResponsableSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoresponsableTemp=null;

			for(Empleado empleadoresponsableAux:empleadoresponsablesForeignKey) {
				if(empleadoresponsableAux.getId()!=null && empleadoresponsableAux.getId().equals(idEmpleadoResponsableSeleccionado)) {
					empleadoresponsableTemp=empleadoresponsableAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoresponsableTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoResponsableForeignKeyGenerico(Long idEmpleadoResponsableSeleccionado,JComboBox jComboBoxid_empleado_responsablePedidoProduGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoresponsableTemp=null;

			for(Empleado empleadoresponsableAux:empleadoresponsablesForeignKey) {
				if(empleadoresponsableAux.getId()!=null && empleadoresponsableAux.getId().equals(idEmpleadoResponsableSeleccionado)) {
					empleadoresponsableTemp=empleadoresponsableAux;
					break;
				}
			}

			if(empleadoresponsableTemp!=null) {
				jComboBoxid_empleado_responsablePedidoProduGenerico.setSelectedItem(empleadoresponsableTemp);
			} else {
				if(jComboBoxid_empleado_responsablePedidoProduGenerico!=null && jComboBoxid_empleado_responsablePedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_empleado_responsablePedidoProduGenerico.setSelectedIndex(0);
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

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clientePedidoProdu.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClientePedidoProdu!=null) {
						jComboBoxid_clienteFK_IdClientePedidoProdu.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClientePedidoProdu!=null) {
							//jComboBoxid_clienteFK_IdClientePedidoProdu.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClientePedidoProdu.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClientePedidoProdu.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clientePedidoProduGenerico)throws Exception
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
				jComboBoxid_clientePedidoProduGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clientePedidoProduGenerico!=null && jComboBoxid_clientePedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_clientePedidoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstadoOrdenProduForeignKey(Long idEstadoOrdenProduSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			EstadoOrdenProdu  estadoordenproduTemp=null;

			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusForeignKey) {
				if(estadoordenproduAux.getId()!=null && estadoordenproduAux.getId().equals(idEstadoOrdenProduSeleccionado)) {
					estadoordenproduTemp=estadoordenproduAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estadoordenproduTemp!=null) {

					if(this.pedidoprodu!=null) {
						this.pedidoprodu.setEstadoOrdenProdu(estadoordenproduTemp);
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setSelectedItem(estadoordenproduTemp);
					}
				} else {
					//jComboBoxid_estado_orden_produPedidoProdu.setSelectedItem(estadoordenproduTemp);
					if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
						if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.getItemCount()>0) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstadoOrdenProdu") || sFormularioTipoBusqueda.equals("Todos")){
					if(estadoordenproduTemp!=null && jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu!=null) {
						jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setSelectedItem(estadoordenproduTemp);
					} else {
						if(jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu!=null) {
							//jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setSelectedItem(estadoordenproduTemp);
							if(jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.getItemCount()>0) {
								jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setSelectedIndex(0);
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

	public String getActualEstadoOrdenProduForeignKeyDescripcion(Long idEstadoOrdenProduSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			EstadoOrdenProdu  estadoordenproduTemp=null;

			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusForeignKey) {
				if(estadoordenproduAux.getId()!=null && estadoordenproduAux.getId().equals(idEstadoOrdenProduSeleccionado)) {
					estadoordenproduTemp=estadoordenproduAux;
					break;
				}
			}


			sDescripcion=EstadoOrdenProduConstantesFunciones.getEstadoOrdenProduDescripcion(estadoordenproduTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstadoOrdenProduForeignKeyGenerico(Long idEstadoOrdenProduSeleccionado,JComboBox jComboBoxid_estado_orden_produPedidoProduGenerico)throws Exception
	{
		try
		{
			EstadoOrdenProdu  estadoordenproduTemp=null;

			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusForeignKey) {
				if(estadoordenproduAux.getId()!=null && estadoordenproduAux.getId().equals(idEstadoOrdenProduSeleccionado)) {
					estadoordenproduTemp=estadoordenproduAux;
					break;
				}
			}

			if(estadoordenproduTemp!=null) {
				jComboBoxid_estado_orden_produPedidoProduGenerico.setSelectedItem(estadoordenproduTemp);
			} else {
				if(jComboBoxid_estado_orden_produPedidoProduGenerico!=null && jComboBoxid_estado_orden_produPedidoProduGenerico.getItemCount()>0) {
					jComboBoxid_estado_orden_produPedidoProduGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_empresaPedidoProduGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaPedidoProduGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaPedidoProduGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				pedidoprodu.setid_empresa(empresaAux.getId());
				pedidoprodu.setempresa_descripcion(PedidoProduConstantesFunciones.getEmpresaDescripcion(empresaAux));
				pedidoprodu.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_sucursalPedidoProduGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalPedidoProduGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalPedidoProduGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				pedidoprodu.setid_sucursal(sucursalAux.getId());
				pedidoprodu.setsucursal_descripcion(PedidoProduConstantesFunciones.getSucursalDescripcion(sucursalAux));
				pedidoprodu.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_ejercicioPedidoProduGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioPedidoProduGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioPedidoProduGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				pedidoprodu.setid_ejercicio(ejercicioAux.getId());
				pedidoprodu.setejercicio_descripcion(PedidoProduConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				pedidoprodu.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_periodoPedidoProduGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoPedidoProduGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoPedidoProduGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				pedidoprodu.setid_periodo(periodoAux.getId());
				pedidoprodu.setperiodo_descripcion(PedidoProduConstantesFunciones.getPeriodoDescripcion(periodoAux));
				pedidoprodu.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFormatoForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_formatoPedidoProduGenerico)throws Exception
	{
		try
		{
			Formato  formatoAux=new Formato();

			if(jComboBoxid_formatoPedidoProduGenerico==null) {
				formatoAux=(Formato)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.getSelectedItem();
			} else {
				formatoAux=(Formato)jComboBoxid_formatoPedidoProduGenerico.getSelectedItem();
			}

			if(formatoAux!=null) {
				pedidoprodu.setid_formato(formatoAux.getId());
				pedidoprodu.setformato_descripcion(PedidoProduConstantesFunciones.getFormatoDescripcion(formatoAux));
				pedidoprodu.setFormato(formatoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoPrioridadEmpresaProduForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_tipo_prioridad_empresa_produPedidoProduGenerico)throws Exception
	{
		try
		{
			TipoPrioridadEmpresaProdu  tipoprioridadempresaproduAux=new TipoPrioridadEmpresaProdu();

			if(jComboBoxid_tipo_prioridad_empresa_produPedidoProduGenerico==null) {
				tipoprioridadempresaproduAux=(TipoPrioridadEmpresaProdu)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getSelectedItem();
			} else {
				tipoprioridadempresaproduAux=(TipoPrioridadEmpresaProdu)jComboBoxid_tipo_prioridad_empresa_produPedidoProduGenerico.getSelectedItem();
			}

			if(tipoprioridadempresaproduAux!=null && tipoprioridadempresaproduAux.getId()!=null) {
				pedidoprodu.setid_tipo_prioridad_empresa_produ(tipoprioridadempresaproduAux.getId());
				pedidoprodu.settipoprioridadempresaprodu_descripcion(PedidoProduConstantesFunciones.getTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaproduAux));
				pedidoprodu.setTipoPrioridadEmpresaProdu(tipoprioridadempresaproduAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoResponsableForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_empleado_responsablePedidoProduGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleado_responsablePedidoProduGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleado_responsablePedidoProduGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				pedidoprodu.setid_empleado_responsable(empleadoAux.getId());
				pedidoprodu.setempleadoresponsable_descripcion(PedidoProduConstantesFunciones.getEmpleadoResponsableDescripcion(empleadoAux));
				pedidoprodu.setEmpleadoResponsable(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_clientePedidoProduGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clientePedidoProduGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clientePedidoProduGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				pedidoprodu.setid_cliente(clienteAux.getId());
				pedidoprodu.setcliente_descripcion(PedidoProduConstantesFunciones.getClienteDescripcion(clienteAux));
				pedidoprodu.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstadoOrdenProduForeignKey(PedidoProdu pedidoprodu,JComboBox jComboBoxid_estado_orden_produPedidoProduGenerico)throws Exception
	{
		try
		{
			EstadoOrdenProdu  estadoordenproduAux=new EstadoOrdenProdu();

			if(jComboBoxid_estado_orden_produPedidoProduGenerico==null) {
				estadoordenproduAux=(EstadoOrdenProdu)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.getSelectedItem();
			} else {
				estadoordenproduAux=(EstadoOrdenProdu)jComboBoxid_estado_orden_produPedidoProduGenerico.getSelectedItem();
			}

			if(estadoordenproduAux!=null && estadoordenproduAux.getId()!=null) {
				pedidoprodu.setid_estado_orden_produ(estadoordenproduAux.getId());
				pedidoprodu.setestadoordenprodu_descripcion(PedidoProduConstantesFunciones.getEstadoOrdenProduDescripcion(estadoordenproduAux));
				pedidoprodu.setEstadoOrdenProdu(estadoordenproduAux);			}
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

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
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

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFormatosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFormato=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.addItem(formato);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdFormato") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_formatoFK_IdFormatoPedidoProdu.removeAllItems();

							for(Formato formato:this.formatosForeignKey) {
								this.jComboBoxid_formatoFK_IdFormatoPedidoProdu.addItem(formato);
							}
						}

						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoPrioridadEmpresaProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.removeAllItems();

							for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:this.tipoprioridadempresaprodusForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.addItem(tipoprioridadempresaprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoPrioridadEmpresaProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.removeAllItems();

							for(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu:this.tipoprioridadempresaprodusForeignKey) {
								this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.addItem(tipoprioridadempresaprodu);
							}
						}

						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadoResponsablesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.removeAllItems();

							for(Empleado empleadoresponsable:this.empleadoresponsablesForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.addItem(empleadoresponsable);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleadoResponsable") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.removeAllItems();

							for(Empleado empleadoresponsable:this.empleadoresponsablesForeignKey) {
								this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.addItem(empleadoresponsable);
							}
						}

						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClientePedidoProdu.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClientePedidoProdu.addItem(cliente);
							}
						}

						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstadoOrdenProdusForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstadoOrdenProdu=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.removeAllItems();

							for(EstadoOrdenProdu estadoordenprodu:this.estadoordenprodusForeignKey) {
								this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.addItem(estadoordenprodu);
							}
						}
					}

					if(this.jInternalFrameDetalleFormPedidoProdu!=null) { 
					}

					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstadoOrdenProdu") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.removeAllItems();

							for(EstadoOrdenProdu estadoordenprodu:this.estadoordenprodusForeignKey) {
								this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.addItem(estadoordenprodu);
							}
						}

						if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFormatoForeignKey(Formato formato,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setSelectedItem(formato);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_formatoFK_IdFormatoPedidoProdu.setSelectedItem(formato);
						} else {
							this.jComboBoxid_formatoFK_IdFormatoPedidoProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoPrioridadEmpresaProduForeignKey(TipoPrioridadEmpresaProdu tipoprioridadempresaprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setSelectedItem(tipoprioridadempresaprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setSelectedItem(tipoprioridadempresaprodu);
						} else {
							this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoResponsableForeignKey(Empleado empleadoresponsable,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setSelectedItem(empleadoresponsable);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setSelectedItem(empleadoresponsable);
						} else {
							this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClientePedidoProdu.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClientePedidoProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEstadoOrdenProduForeignKey(EstadoOrdenProdu estadoordenprodu,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setSelectedItem(estadoordenprodu);
						}
					} else {
						if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setSelectedItem(estadoordenprodu);
						} else {
							this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesPedidoProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			PedidoProduConstantesFunciones.refrescarForeignKeysDescripcionesPedidoProdu(this.pedidoproduLogic.getPedidoProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			PedidoProduConstantesFunciones.refrescarForeignKeysDescripcionesPedidoProdu(this.pedidoprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Formato.class));
		classes.add(new Classe(TipoPrioridadEmpresaProdu.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(EstadoOrdenProdu.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//pedidoproduLogic.setPedidoProdus(this.pedidoprodus);
			pedidoproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public PedidoProduParameterReturnGeneral getPedidoProduParameterGeneral() {
		return this.pedidoproduParameterGeneral;
	}
	
	public void setPedidoProduParameterGeneral(PedidoProduParameterReturnGeneral pedidoproduParameterGeneral) {
		this.pedidoproduParameterGeneral = pedidoproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoPedidoProdu() {
		return isPermisoTodoPedidoProdu;
	}

	public void setIsPermisoTodoPedidoProdu(Boolean isPermisoTodoPedidoProdu) {
		this.isPermisoTodoPedidoProdu = isPermisoTodoPedidoProdu;
	}

	public Boolean getIsPermisoNuevoPedidoProdu() {
		return isPermisoNuevoPedidoProdu;
	}

	public void setIsPermisoNuevoPedidoProdu(Boolean isPermisoNuevoPedidoProdu) {
		this.isPermisoNuevoPedidoProdu = isPermisoNuevoPedidoProdu;
	}

	public Boolean getIsPermisoActualizarPedidoProdu() {
		return isPermisoActualizarPedidoProdu;
	}

	public void setIsPermisoActualizarPedidoProdu(Boolean isPermisoActualizarPedidoProdu) {
		this.isPermisoActualizarPedidoProdu = isPermisoActualizarPedidoProdu;
	}

	public Boolean getIsPermisoEliminarPedidoProdu() {
		return isPermisoEliminarPedidoProdu;
	}

	public void setIsPermisoEliminarPedidoProdu(Boolean isPermisoEliminarPedidoProdu) {
		this.isPermisoEliminarPedidoProdu = isPermisoEliminarPedidoProdu;
	}

	public Boolean getIsPermisoGuardarCambiosPedidoProdu() {
		return isPermisoGuardarCambiosPedidoProdu;
	}

	public void setIsPermisoGuardarCambiosPedidoProdu(Boolean isPermisoGuardarCambiosPedidoProdu) {
		this.isPermisoGuardarCambiosPedidoProdu = isPermisoGuardarCambiosPedidoProdu;
	}
	
	public Boolean getIsPermisoConsultaPedidoProdu() {
		return isPermisoConsultaPedidoProdu;
	}

	public void setIsPermisoConsultaPedidoProdu(Boolean isPermisoConsultaPedidoProdu) {
		this.isPermisoConsultaPedidoProdu = isPermisoConsultaPedidoProdu;
	}

	public Boolean getIsPermisoBusquedaPedidoProdu() {
		return isPermisoBusquedaPedidoProdu;
	}

	public void setIsPermisoBusquedaPedidoProdu(Boolean isPermisoBusquedaPedidoProdu) {
		this.isPermisoBusquedaPedidoProdu = isPermisoBusquedaPedidoProdu;
	}

	public Boolean getIsPermisoReportePedidoProdu() {
		return isPermisoReportePedidoProdu;
	}

	public void setIsPermisoReportePedidoProdu(Boolean isPermisoReportePedidoProdu) {
		this.isPermisoReportePedidoProdu = isPermisoReportePedidoProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioPedidoProdu() {
		return isPermisoPaginacionMedioPedidoProdu;
	}

	public void setIsPermisoPaginacionMedioPedidoProdu(Boolean isPermisoPaginacionMedioPedidoProdu) {
		this.isPermisoPaginacionMedioPedidoProdu = isPermisoPaginacionMedioPedidoProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoPedidoProdu() {
		return isPermisoPaginacionTodoPedidoProdu;
	}

	public void setIsPermisoPaginacionTodoPedidoProdu(Boolean isPermisoPaginacionTodoPedidoProdu) {
		this.isPermisoPaginacionTodoPedidoProdu = isPermisoPaginacionTodoPedidoProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoPedidoProdu() {
		return isPermisoPaginacionAltoPedidoProdu;
	}

	public void setIsPermisoPaginacionAltoPedidoProdu(Boolean isPermisoPaginacionAltoPedidoProdu) {
		this.isPermisoPaginacionAltoPedidoProdu = isPermisoPaginacionAltoPedidoProdu;
	}
	
	public Boolean getIsPermisoCopiarPedidoProdu() {
		return isPermisoCopiarPedidoProdu;
	}

	public void setIsPermisoCopiarPedidoProdu(Boolean isPermisoCopiarPedidoProdu) {
		this.isPermisoCopiarPedidoProdu = isPermisoCopiarPedidoProdu;
	}
	
	public Boolean getIsPermisoVerFormPedidoProdu() {
		return isPermisoVerFormPedidoProdu;
	}

	public void setIsPermisoVerFormPedidoProdu(Boolean isPermisoVerFormPedidoProdu) {
		this.isPermisoVerFormPedidoProdu = isPermisoVerFormPedidoProdu;
	}
	
	public Boolean getIsPermisoDuplicarPedidoProdu() {
		return isPermisoDuplicarPedidoProdu;
	}

	public void setIsPermisoDuplicarPedidoProdu(Boolean isPermisoDuplicarPedidoProdu) {
		this.isPermisoDuplicarPedidoProdu = isPermisoDuplicarPedidoProdu;
	}
	
	public Boolean getIsPermisoOrdenPedidoProdu() {
		return isPermisoOrdenPedidoProdu;
	}

	public void setIsPermisoOrdenPedidoProdu(Boolean isPermisoOrdenPedidoProdu) {
		this.isPermisoOrdenPedidoProdu = isPermisoOrdenPedidoProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoPedidoProdu() {
		return isVisibilidadCeldaNuevoPedidoProdu;
	}

	public void setIsVisibilidadCeldaNuevoPedidoProdu(Boolean isVisibilidadCeldaNuevoPedidoProdu) {
		this.isVisibilidadCeldaNuevoPedidoProdu = isVisibilidadCeldaNuevoPedidoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarPedidoProdu() {
		return isVisibilidadCeldaDuplicarPedidoProdu;
	}

	public void setIsVisibilidadCeldaDuplicarPedidoProdu(Boolean isVisibilidadCeldaDuplicarPedidoProdu) {
		this.isVisibilidadCeldaDuplicarPedidoProdu = isVisibilidadCeldaDuplicarPedidoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarPedidoProdu() {
		return isVisibilidadCeldaCopiarPedidoProdu;
	}

	public void setIsVisibilidadCeldaCopiarPedidoProdu(Boolean isVisibilidadCeldaCopiarPedidoProdu) {
		this.isVisibilidadCeldaCopiarPedidoProdu = isVisibilidadCeldaCopiarPedidoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormPedidoProdu() {
		return isVisibilidadCeldaVerFormPedidoProdu;
	}

	public void setIsVisibilidadCeldaVerFormPedidoProdu(Boolean isVisibilidadCeldaVerFormPedidoProdu) {
		this.isVisibilidadCeldaVerFormPedidoProdu = isVisibilidadCeldaVerFormPedidoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenPedidoProdu() {
		return isVisibilidadCeldaOrdenPedidoProdu;
	}

	public void setIsVisibilidadCeldaOrdenPedidoProdu(Boolean isVisibilidadCeldaOrdenPedidoProdu) {
		this.isVisibilidadCeldaOrdenPedidoProdu = isVisibilidadCeldaOrdenPedidoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesPedidoProdu() {
		return isVisibilidadCeldaNuevoRelacionesPedidoProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesPedidoProdu(Boolean isVisibilidadCeldaNuevoRelacionesPedidoProdu) {
		this.isVisibilidadCeldaNuevoRelacionesPedidoProdu = isVisibilidadCeldaNuevoRelacionesPedidoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarPedidoProdu() {
		return isVisibilidadCeldaModificarPedidoProdu;
	}

	public void setIsVisibilidadCeldaModificarPedidoProdu(Boolean isVisibilidadCeldaModificarPedidoProdu) {
		this.isVisibilidadCeldaModificarPedidoProdu = isVisibilidadCeldaModificarPedidoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarPedidoProdu() {
		return isVisibilidadCeldaActualizarPedidoProdu;
	}

	public void setIsVisibilidadCeldaActualizarPedidoProdu(Boolean isVisibilidadCeldaActualizarPedidoProdu) {
		this.isVisibilidadCeldaActualizarPedidoProdu = isVisibilidadCeldaActualizarPedidoProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarPedidoProdu() {
		return isVisibilidadCeldaEliminarPedidoProdu;
	}

	public void setIsVisibilidadCeldaEliminarPedidoProdu(Boolean isVisibilidadCeldaEliminarPedidoProdu) {
		this.isVisibilidadCeldaEliminarPedidoProdu = isVisibilidadCeldaEliminarPedidoProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarPedidoProdu() {
		return isVisibilidadCeldaCancelarPedidoProdu;
	}

	public void setIsVisibilidadCeldaCancelarPedidoProdu(Boolean isVisibilidadCeldaCancelarPedidoProdu) {
		this.isVisibilidadCeldaCancelarPedidoProdu = isVisibilidadCeldaCancelarPedidoProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarPedidoProdu() {
		return isVisibilidadCeldaGuardarPedidoProdu;
	}

	public void setIsVisibilidadCeldaGuardarPedidoProdu(Boolean isVisibilidadCeldaGuardarPedidoProdu) {
		this.isVisibilidadCeldaGuardarPedidoProdu = isVisibilidadCeldaGuardarPedidoProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosPedidoProdu() {
		return isVisibilidadCeldaGuardarCambiosPedidoProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosPedidoProdu(Boolean isVisibilidadCeldaGuardarCambiosPedidoProdu) {
		this.isVisibilidadCeldaGuardarCambiosPedidoProdu = isVisibilidadCeldaGuardarCambiosPedidoProdu;
	}
		
	public PedidoProduSessionBean getpedidoproduSessionBean() {
		return this.pedidoproduSessionBean;
	}
	
	public void setpedidoproduSessionBean(PedidoProduSessionBean pedidoproduSessionBean) {
		this.pedidoproduSessionBean=pedidoproduSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpleadoResponsable() {
		return this.isVisibilidadFK_IdEmpleadoResponsable;
	}

	public void setisVisibilidadFK_IdEmpleadoResponsable(Boolean isVisibilidadFK_IdEmpleadoResponsable) {
		this.isVisibilidadFK_IdEmpleadoResponsable=isVisibilidadFK_IdEmpleadoResponsable;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstadoOrdenProdu() {
		return this.isVisibilidadFK_IdEstadoOrdenProdu;
	}

	public void setisVisibilidadFK_IdEstadoOrdenProdu(Boolean isVisibilidadFK_IdEstadoOrdenProdu) {
		this.isVisibilidadFK_IdEstadoOrdenProdu=isVisibilidadFK_IdEstadoOrdenProdu;
	}

	public Boolean getisVisibilidadFK_IdFormato() {
		return this.isVisibilidadFK_IdFormato;
	}

	public void setisVisibilidadFK_IdFormato(Boolean isVisibilidadFK_IdFormato) {
		this.isVisibilidadFK_IdFormato=isVisibilidadFK_IdFormato;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoPrioridadEmpresaProdu() {
		return this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu;
	}

	public void setisVisibilidadFK_IdTipoPrioridadEmpresaProdu(Boolean isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {
		this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isVisibilidadFK_IdTipoPrioridadEmpresaProdu;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(PedidoProdu pedidoprodu)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(pedidoprodu,null);
				this.setActualParaGuardarSucursalForeignKey(pedidoprodu,null);
				this.setActualParaGuardarEjercicioForeignKey(pedidoprodu,null);
				this.setActualParaGuardarPeriodoForeignKey(pedidoprodu,null);
				this.setActualParaGuardarFormatoForeignKey(pedidoprodu,null);
				this.setActualParaGuardarTipoPrioridadEmpresaProduForeignKey(pedidoprodu,null);
				this.setActualParaGuardarEmpleadoResponsableForeignKey(pedidoprodu,null);
				this.setActualParaGuardarClienteForeignKey(pedidoprodu,null);
				this.setActualParaGuardarEstadoOrdenProduForeignKey(pedidoprodu,null);
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
	
	public void bugActualizarReferenciaActual(PedidoProdu pedidoprodu,PedidoProdu pedidoproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalPedidoProdu(pedidoprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		pedidoproduAux.setId(pedidoprodu.getId());
		pedidoproduAux.setVersionRow(pedidoprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessPedidoProdu();
		
			int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = pedidoproduValidator.getInvalidValues(this.pedidoprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			pedidoproduLogic.setDatosCliente(datosCliente);
			pedidoproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				pedidoproduAux=new  PedidoProdu();
				
				pedidoproduAux.setIsNew(true);
				pedidoproduAux.setIsChanged(true);
				
				pedidoproduAux.setPedidoProduOriginal(this.pedidoprodu);
				
				pedidoproduAux.setId(this.pedidoprodu.getId());	
				pedidoproduAux.setVersionRow(this.pedidoprodu.getVersionRow());	
				pedidoproduAux.setid_empresa(this.pedidoprodu.getid_empresa());	
				pedidoproduAux.setid_sucursal(this.pedidoprodu.getid_sucursal());	
				pedidoproduAux.setid_ejercicio(this.pedidoprodu.getid_ejercicio());	
				pedidoproduAux.setid_periodo(this.pedidoprodu.getid_periodo());	
				pedidoproduAux.setid_formato(this.pedidoprodu.getid_formato());	
				pedidoproduAux.setid_tipo_prioridad_empresa_produ(this.pedidoprodu.getid_tipo_prioridad_empresa_produ());	
				pedidoproduAux.setid_empleado_responsable(this.pedidoprodu.getid_empleado_responsable());	
				pedidoproduAux.setsecuencial(this.pedidoprodu.getsecuencial());	
				pedidoproduAux.setid_cliente(this.pedidoprodu.getid_cliente());	
				pedidoproduAux.setdireccion_cliente(this.pedidoprodu.getdireccion_cliente());	
				pedidoproduAux.settelefono_cliente(this.pedidoprodu.gettelefono_cliente());	
				pedidoproduAux.setruc_cliente(this.pedidoprodu.getruc_cliente());	
				pedidoproduAux.setlote(this.pedidoprodu.getlote());	
				pedidoproduAux.setfecha_pedido(this.pedidoprodu.getfecha_pedido());	
				pedidoproduAux.setfecha_entrega(this.pedidoprodu.getfecha_entrega());	
				pedidoproduAux.setes_uso_interno(this.pedidoprodu.getes_uso_interno());	
				pedidoproduAux.setfecha(this.pedidoprodu.getfecha());	
				pedidoproduAux.setdescripcion(this.pedidoprodu.getdescripcion());	
				pedidoproduAux.setid_estado_orden_produ(this.pedidoprodu.getid_estado_orden_produ());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pedidoproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(pedidoproduAux,pedidoproduLogic.getPedidoProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidoproduAux,pedidoprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.pedidoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.pedidoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.savePedidoProdus();//WithConnection
						//pedidoproduLogic.getSetVersionRowPedidoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.pedidoprodu,pedidoproduAux);
					
					this.refrescarForeignKeysDescripcionesPedidoProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus().addAll(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodus.addAll(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodusEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								pedidoproduLogic.savePedidoProduRelaciones(pedidoproduAux,this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());//WithConnection
								//pedidoproduLogic.getSetVersionRowPedidoProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.pedidoprodu,pedidoproduAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodus= new ArrayList<PedidoDetaProdu>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();}
							pedidoproduAux.setPedidoDetaProdus(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.pedidoproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(pedidoproduAux,pedidoproduLogic.getPedidoProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(pedidoproduAux,pedidoprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.pedidoprodu,pedidoproduAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				pedidoproduAux=new  PedidoProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.pedidoproduSessionBean.getEsGuardarRelacionado() 
					|| (this.pedidoproduSessionBean.getEsGuardarRelacionado() && this.pedidoprodu.getId()>=0)) {
						
					pedidoproduAux.setIsNew(false);
				}
				
				pedidoproduAux.setIsDeleted(false);
			
				pedidoproduAux.setId(this.pedidoprodu.getId());	
				pedidoproduAux.setVersionRow(this.pedidoprodu.getVersionRow());	
				pedidoproduAux.setid_empresa(this.pedidoprodu.getid_empresa());	
				pedidoproduAux.setid_sucursal(this.pedidoprodu.getid_sucursal());	
				pedidoproduAux.setid_ejercicio(this.pedidoprodu.getid_ejercicio());	
				pedidoproduAux.setid_periodo(this.pedidoprodu.getid_periodo());	
				pedidoproduAux.setid_formato(this.pedidoprodu.getid_formato());	
				pedidoproduAux.setid_tipo_prioridad_empresa_produ(this.pedidoprodu.getid_tipo_prioridad_empresa_produ());	
				pedidoproduAux.setid_empleado_responsable(this.pedidoprodu.getid_empleado_responsable());	
				pedidoproduAux.setsecuencial(this.pedidoprodu.getsecuencial());	
				pedidoproduAux.setid_cliente(this.pedidoprodu.getid_cliente());	
				pedidoproduAux.setdireccion_cliente(this.pedidoprodu.getdireccion_cliente());	
				pedidoproduAux.settelefono_cliente(this.pedidoprodu.gettelefono_cliente());	
				pedidoproduAux.setruc_cliente(this.pedidoprodu.getruc_cliente());	
				pedidoproduAux.setlote(this.pedidoprodu.getlote());	
				pedidoproduAux.setfecha_pedido(this.pedidoprodu.getfecha_pedido());	
				pedidoproduAux.setfecha_entrega(this.pedidoprodu.getfecha_entrega());	
				pedidoproduAux.setes_uso_interno(this.pedidoprodu.getes_uso_interno());	
				pedidoproduAux.setfecha(this.pedidoprodu.getfecha());	
				pedidoproduAux.setdescripcion(this.pedidoprodu.getdescripcion());	
				pedidoproduAux.setid_estado_orden_produ(this.pedidoprodu.getid_estado_orden_produ());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pedidoproduAux,pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidoproduAux,pedidoprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.pedidoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.pedidoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.savePedidoProdus();//WithConnection
						//pedidoproduLogic.getSetVersionRowPedidoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.pedidoprodu,pedidoproduAux);
					
					this.refrescarForeignKeysDescripcionesPedidoProdu();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus().addAll(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodus.addAll(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodusEliminados);
						}
						//ARCHITECTURE
						
						if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								pedidoproduLogic.savePedidoProduRelaciones(pedidoproduAux,this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());//WithConnection
								//pedidoproduLogic.getSetVersionRowPedidoProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.pedidoprodu,pedidoproduAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodus= new ArrayList<PedidoDetaProdu>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();}
							pedidoproduAux.setPedidoDetaProdus(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones() 
									|| this.pedidoproduSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(pedidoproduAux,pedidoproduLogic.getPedidoProdus());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(pedidoproduAux,pedidoprodus);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.pedidoprodu,pedidoproduAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				pedidoproduAux=new  PedidoProdu();
				
				pedidoproduAux.setIsNew(false);
				pedidoproduAux.setIsChanged(false);
				
				pedidoproduAux.setIsDeleted(true);
				
				pedidoproduAux.setId(this.pedidoprodu.getId());	
				pedidoproduAux.setVersionRow(this.pedidoprodu.getVersionRow());	
				pedidoproduAux.setid_empresa(this.pedidoprodu.getid_empresa());	
				pedidoproduAux.setid_sucursal(this.pedidoprodu.getid_sucursal());	
				pedidoproduAux.setid_ejercicio(this.pedidoprodu.getid_ejercicio());	
				pedidoproduAux.setid_periodo(this.pedidoprodu.getid_periodo());	
				pedidoproduAux.setid_formato(this.pedidoprodu.getid_formato());	
				pedidoproduAux.setid_tipo_prioridad_empresa_produ(this.pedidoprodu.getid_tipo_prioridad_empresa_produ());	
				pedidoproduAux.setid_empleado_responsable(this.pedidoprodu.getid_empleado_responsable());	
				pedidoproduAux.setsecuencial(this.pedidoprodu.getsecuencial());	
				pedidoproduAux.setid_cliente(this.pedidoprodu.getid_cliente());	
				pedidoproduAux.setdireccion_cliente(this.pedidoprodu.getdireccion_cliente());	
				pedidoproduAux.settelefono_cliente(this.pedidoprodu.gettelefono_cliente());	
				pedidoproduAux.setruc_cliente(this.pedidoprodu.getruc_cliente());	
				pedidoproduAux.setlote(this.pedidoprodu.getlote());	
				pedidoproduAux.setfecha_pedido(this.pedidoprodu.getfecha_pedido());	
				pedidoproduAux.setfecha_entrega(this.pedidoprodu.getfecha_entrega());	
				pedidoproduAux.setes_uso_interno(this.pedidoprodu.getes_uso_interno());	
				pedidoproduAux.setfecha(this.pedidoprodu.getfecha());	
				pedidoproduAux.setdescripcion(this.pedidoprodu.getdescripcion());	
				pedidoproduAux.setid_estado_orden_produ(this.pedidoprodu.getid_estado_orden_produ());	
				
				if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.pedidoproduAux.getId()>=0) {	
						this.pedidoprodusEliminados.add(pedidoproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(pedidoproduAux,pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidoproduAux,pedidoprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.pedidoproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.pedidoproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.savePedidoProdus();//WithConnection
						//pedidoproduLogic.getSetVersionRowPedidoProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus().addAll(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodusEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodus.addAll(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodusEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								pedidoproduLogic.savePedidoProduRelaciones(pedidoproduAux,this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());//WithConnection
								//pedidoproduLogic.getSetVersionRowPedidoProdus();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.setPedidoDetaProdus(new ArrayList<PedidoDetaProdu>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodus= new ArrayList<PedidoDetaProdu>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.quitarFilaTotales();}
							pedidoproduAux.setPedidoDetaProdus(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.pedidoproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(pedidoproduAux,pedidoproduLogic.getPedidoProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(pedidoproduAux,pedidoprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getPedidoProdus().addAll(this.pedidoprodusEliminados);
					
					pedidoproduLogic.savePedidoProdus();//WithConnection
					//pedidoproduLogic.getSetVersionRowPedidoProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesPedidoProdu();
				
				this.pedidoprodusEliminados= new ArrayList<PedidoProdu>();		
			}
			
			if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Pedido Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.pedidoprodu=pedidoproduAux;
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
      		//this.finishProcessPedidoProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(PedidoProdu pedidoproduLocal) throws Exception {
		
		if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				pedidoproduLocal.setPedidoDetaProdus(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());
			
			} else {
			
				pedidoproduLocal.setPedidoDetaProdus(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaprodus);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(PedidoProdu pedidoproduLocal) throws Exception {	
		if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				pedidoproduLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				pedidoproduLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				pedidoproduLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				pedidoproduLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FormatoDetalleFormJInternalFrame.class)) {
				FormatoBeanSwingJInternalFrame formatoBeanSwingJInternalFrameLocal=(FormatoBeanSwingJInternalFrame) ((FormatoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				formatoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFormato(formatoBeanSwingJInternalFrameLocal.getformato(),true);
				formatoBeanSwingJInternalFrameLocal.actualizarLista(formatoBeanSwingJInternalFrameLocal.formato,this.formatosForeignKey);

				formatoBeanSwingJInternalFrameLocal.actualizarRelaciones(formatoBeanSwingJInternalFrameLocal.formato);

				pedidoproduLocal.setFormato(formatoBeanSwingJInternalFrameLocal.formato);

				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey("Formulario");
				this.setActualFormatoForeignKey(formatoBeanSwingJInternalFrameLocal.formato.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoPrioridadEmpresaProduDetalleFormJInternalFrame.class)) {
				TipoPrioridadEmpresaProduBeanSwingJInternalFrame tipoprioridadempresaproduBeanSwingJInternalFrameLocal=(TipoPrioridadEmpresaProduBeanSwingJInternalFrame) ((TipoPrioridadEmpresaProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoprioridadempresaproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoPrioridadEmpresaProdu(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.gettipoprioridadempresaprodu(),true);
				tipoprioridadempresaproduBeanSwingJInternalFrameLocal.actualizarLista(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.tipoprioridadempresaprodu,this.tipoprioridadempresaprodusForeignKey);

				tipoprioridadempresaproduBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.tipoprioridadempresaprodu);

				pedidoproduLocal.setTipoPrioridadEmpresaProdu(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.tipoprioridadempresaprodu);

				this.addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
				this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey("Formulario");
				this.setActualTipoPrioridadEmpresaProduForeignKey(tipoprioridadempresaproduBeanSwingJInternalFrameLocal.tipoprioridadempresaprodu.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoresponsableBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoresponsableBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoresponsableBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoresponsableBeanSwingJInternalFrameLocal.actualizarLista(empleadoresponsableBeanSwingJInternalFrameLocal.empleado,this.empleadoresponsablesForeignKey);

				empleadoresponsableBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoresponsableBeanSwingJInternalFrameLocal.empleado);

				pedidoproduLocal.setEmpleadoResponsable(empleadoresponsableBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleadoResponsable();
				this.cargarCombosFrameEmpleadoResponsablesForeignKey("Formulario");
				this.setActualEmpleadoResponsableForeignKey(empleadoresponsableBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				pedidoproduLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstadoOrdenProduDetalleFormJInternalFrame.class)) {
				EstadoOrdenProduBeanSwingJInternalFrame estadoordenproduBeanSwingJInternalFrameLocal=(EstadoOrdenProduBeanSwingJInternalFrame) ((EstadoOrdenProduDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estadoordenproduBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstadoOrdenProdu(estadoordenproduBeanSwingJInternalFrameLocal.getestadoordenprodu(),true);
				estadoordenproduBeanSwingJInternalFrameLocal.actualizarLista(estadoordenproduBeanSwingJInternalFrameLocal.estadoordenprodu,this.estadoordenprodusForeignKey);

				estadoordenproduBeanSwingJInternalFrameLocal.actualizarRelaciones(estadoordenproduBeanSwingJInternalFrameLocal.estadoordenprodu);

				pedidoproduLocal.setEstadoOrdenProdu(estadoordenproduBeanSwingJInternalFrameLocal.estadoordenprodu);

				this.addItemDefectoCombosForeignKeyEstadoOrdenProdu();
				this.cargarCombosFrameEstadoOrdenProdusForeignKey("Formulario");
				this.setActualEstadoOrdenProduForeignKey(estadoordenproduBeanSwingJInternalFrameLocal.estadoordenprodu.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarPedidoProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = pedidoproduValidator.getInvalidValues(this.pedidoprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(PedidoProdu pedidoprodu,List<PedidoProdu> pedidoprodus) throws Exception {
		try	{		
			PedidoProduConstantesFunciones.actualizarLista(pedidoprodu,pedidoprodus,this.pedidoproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(PedidoProdu pedidoprodu,List<PedidoProdu> pedidoprodus) throws Exception {
		try	{			
			PedidoProduConstantesFunciones.actualizarSelectedLista(pedidoprodu,pedidoprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<PedidoProdu> pedidoprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				pedidoprodusLocal=this.pedidoproduLogic.getPedidoProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				pedidoprodusLocal=this.pedidoprodus;
			}
			//ARCHITECTURE
		
			for(PedidoProdu pedidoproduLocal:pedidoprodusLocal) {
				if(this.permiteMantenimiento(pedidoproduLocal) && pedidoproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+PedidoProduConstantesFunciones.getPedidoProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_empresaPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_sucursalPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_ejercicioPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_periodoPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDFORMATO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_formatoPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDTIPOPRIORIDADEMPRESAPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_tipo_prioridad_empresa_produPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDEMPLEADORESPONSABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_empleado_responsablePedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelsecuencialPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_clientePedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.DIRECCIONCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabeldireccion_clientePedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.TELEFONOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabeltelefono_clientePedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.RUCCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelruc_clientePedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.LOTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabellotePedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.FECHAPEDIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelfecha_pedidoPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.FECHAENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelfecha_entregaPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.ESUSOINTERNO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabeles_uso_internoPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelfechaPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabeldescripcionPedidoProdu,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(PedidoProduConstantesFunciones.IDESTADOORDENPRODU)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_estado_orden_produPedidoProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_empresaPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_sucursalPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_ejercicioPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_periodoPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_formatoPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_tipo_prioridad_empresa_produPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_empleado_responsablePedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelsecuencialPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_clientePedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabeldireccion_clientePedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabeltelefono_clientePedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelruc_clientePedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabellotePedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelfecha_pedidoPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelfecha_entregaPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabeles_uso_internoPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelfechaPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabeldescripcionPedidoProdu,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormPedidoProdu.jLabelid_estado_orden_produPedidoProdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PedidoDetaProdu")) {
			if(this.pedidoprodu==null) {
				this.pedidoprodu= new PedidoProdu();
			}

			if(this.pedidoproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoPedidoProdu
				this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.getpedidodetaprodu().setPedidoProdu(this.pedidoprodu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoPedidoProdu--;	
		
		
		this.pedidoproduAux=new PedidoProdu();
		
		this.pedidoproduAux.setId(this.iIdNuevoPedidoProdu);
		this.pedidoproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.pedidoproduLogic.getPedidoProdus().add(this.pedidoproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.pedidoprodus.add(this.pedidoproduAux);
		}
		//ARCHITECTURE
		
		this.pedidoprodu=this.pedidoproduAux;
		
		if(PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioPedidoProdu(this.pedidoprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyPedidoProdu(this.pedidoprodu);
		}
				
		//this.setDefaultControlesPedidoProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyPedidoProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyPedidoProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyPedidoProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPedidoProdu(this.pedidoproduBean,this.pedidoprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(PedidoProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
			classes=PedidoProduConstantesFunciones.getClassesRelationshipsOfPedidoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.pedidoproduReturnGeneral=pedidoproduLogic.procesarEventosPedidoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidoproduLogic.getPedidoProdus(),this.pedidoprodu,this.pedidoproduParameterGeneral,this.isEsNuevoPedidoProdu,classes);//this.pedidoproduLogic.getPedidoProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanPedidoProdu(this.pedidoproduReturnGeneral,this.pedidoproduBean,false);
		
		if(this.pedidoproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyPedidoProdu(this.pedidoproduReturnGeneral.getPedidoProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioPedidoProdu(this.pedidoproduReturnGeneral.getPedidoProdu());
		}
		
		if(this.pedidoproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioPedidoProdu(this.pedidoproduReturnGeneral.getPedidoProdu(),classes);//this.pedidoproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyPedidoProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyPedidoProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PedidoProduBeanSwingJInternalFrameAdditional.RecargarFormPedidoProdu(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingPedidoProdu(false);
						
			if(pedidoproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.getEsGuardarRelacionado() && PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoDetaProduActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidoProdu();
			}
			
			this.actualizarVisualTableDatosPedidoProdu();
			
			this.jTableDatosPedidoProdu.setRowSelectionInterval(this.getIndiceNuevoPedidoProdu(), this.getIndiceNuevoPedidoProdu());
			
			this.seleccionarFilaTablaPedidoProduActual();
						
			this.actualizarEstadoCeldasBotonesPedidoProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesPedidoProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormPedidoProdu.jTextFieldsecuencialPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarsecuencialPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextAreadireccion_clientePedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activardireccion_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextFieldtelefono_clientePedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activartelefono_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextFieldruc_clientePedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarruc_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextFieldlotePedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarlotePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_pedidoPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarfecha_pedidoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_entregaPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarfecha_entregaPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activares_uso_internoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfechaPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarfechaPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextAreadescripcionPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activardescripcionPedidoProdu);	
		//
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_empresaPedidoProdu);//
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_sucursalPedidoProdu);//
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_ejercicioPedidoProdu);//
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_periodoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_formatoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_tipo_prioridad_empresa_produPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_empleado_responsablePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setEnabled(isHabilitar && this.pedidoproduConstantesFunciones.activarid_estado_orden_produPedidoProdu);
	};
	
	public void setDefaultControlesPedidoProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoPedidoProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.pedidoproduSessionBean.setConGuardarRelaciones(true);			
			this.pedidoproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.pedidoproduSessionBean.setConGuardarRelaciones(false);			
			this.pedidoproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoPedidoProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
				if(pedidoproduAux.getId().equals(this.iIdNuevoPedidoProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoProdu pedidoproduAux:this.pedidoprodus) {
				if(pedidoproduAux.getId().equals(this.iIdNuevoPedidoProdu)) {
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
	
	public int getIndiceActualPedidoProdu(PedidoProdu pedidoprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
				if(pedidoproduAux.getId().equals(pedidoprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoProdu pedidoproduAux:this.pedidoprodus) {
				if(pedidoproduAux.getId().equals(pedidoprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalPedidoProdu(PedidoProdu pedidoproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
				if(pedidoproduAux.getPedidoProduOriginal().getId().equals(pedidoproduOriginal.getId())) {
					existe=true;
					pedidoproduOriginal.setId(pedidoproduAux.getId());
					pedidoproduOriginal.setVersionRow(pedidoproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoProdu pedidoproduAux:this.pedidoprodus) {
				if(pedidoproduAux.getPedidoProduOriginal().getId().equals(pedidoproduOriginal.getId())) {
					existe=true;
					pedidoproduOriginal.setId(pedidoproduAux.getId());
					pedidoproduOriginal.setVersionRow(pedidoproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosPedidoProdu(Boolean esParaCancelar) throws Exception {
		pedidoprodusAux=new ArrayList<PedidoProdu>();
		pedidoproduAux=new PedidoProdu();
		
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
					if(pedidoproduAux.getId()<0) {
						pedidoprodusAux.add(pedidoproduAux);
					}		
				}
				this.iIdNuevoPedidoProdu=0L;
				this.pedidoproduLogic.getPedidoProdus().removeAll(pedidoprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidoProdu pedidoproduAux:this.pedidoprodus) {
					if(pedidoproduAux.getId()<0) {
						pedidoprodusAux.add(pedidoproduAux);
					}		
				}
				this.iIdNuevoPedidoProdu=0L;
				this.pedidoprodus.removeAll(pedidoprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoPedidoProdu 
					&& this.pedidoproduLogic.getPedidoProdus().size()>0
					) {
					pedidoproduAux=this.pedidoproduLogic.getPedidoProdus().get(this.pedidoproduLogic.getPedidoProdus().size() - 1);
				
					if(pedidoproduAux.getId()<0) {
						this.pedidoproduLogic.getPedidoProdus().remove(pedidoproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoPedidoProdu && this.pedidoprodus.size()>0) {
					pedidoproduAux=this.pedidoprodus.get(this.pedidoprodus.size() - 1);
				
					if(pedidoproduAux.getId()<0) {
						this.pedidoprodus.remove(pedidoproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoPedidoProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(pedidoprodu.getId()<0) {
				this.pedidoproduLogic.getPedidoProdus().remove(this.pedidoprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(pedidoprodu.getId()<0) {
				this.pedidoprodus.remove(this.pedidoprodu);
			}
		}			
	}
	
	public void setEstadosInicialesPedidoProdu(List<PedidoProdu> pedidoprodusAux) throws Exception {
		PedidoProduConstantesFunciones.setEstadosInicialesPedidoProdu(pedidoprodusAux);
	}
	
	public void setEstadosInicialesPedidoProdu(PedidoProdu pedidoproduAux) throws Exception {
		PedidoProduConstantesFunciones.setEstadosInicialesPedidoProdu(pedidoproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarPedidoProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesPedidoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarPedidoProduActual()) {
				if(!this.isEsNuevoPedidoProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesPedidoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoPedidoProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarPedidoProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Pedido Produccion ?", "MANTENIMIENTO DE Pedido Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesPedidoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(PedidoProdu pedidoprodu) throws Exception {
		PedidoProduConstantesFunciones.seleccionarAsignar(this.pedidoprodu,pedidoprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarPedidoProdu=this.isPermisoActualizarOriginalPedidoProdu;
			
			
			this.seleccionarAsignar(pedidoprodu);
			
			

			idClienteActual=pedidoprodu.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			PedidoProduConstantesFunciones.quitarEspaciosPedidoProdu(this.pedidoprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesPedidoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.pedidoproduSessionBean.setsFuncionBusquedaRapida(this.pedidoproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoPedidoProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosPedidoProdu(esParaCancelar);				
				this.cancelarNuevoPedidoProdu(esParaCancelar);								
			}
			
			this.pedidoprodu=new PedidoProdu();
			
			this.inicializarPedidoProdu();
			
			this.actualizarEstadoCeldasBotonesPedidoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarPedidoProdu() throws Exception {
		try {
			PedidoProduConstantesFunciones.inicializarPedidoProdu(this.pedidoprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.pedidoproduLogic.getPedidoProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReportePedidoProdus(String sAccionBusqueda,List<PedidoProdu> pedidoprodusParaReportes) throws Exception {
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
					sPathReporteFinal="PedidoProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="PedidoProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("PedidoProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="PedidoProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Pedido Producciones");		
		parameters.put("busquedapor", PedidoProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PedidoDetaProdu.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					PedidoProduLogic pedidoproduLogicAuxiliar=new PedidoProduLogic();
					pedidoproduLogicAuxiliar.setDatosCliente(pedidoproduLogic.getDatosCliente());				
					pedidoproduLogicAuxiliar.setPedidoProdus(pedidoprodusParaReportes);
					
					pedidoproduLogicAuxiliar.cargarRelacionesLoteForeignKeyPedidoProduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					pedidoprodusParaReportes=pedidoproduLogicAuxiliar.getPedidoProdus();
					
					//pedidoproduLogic.getNewConnexionToDeep();
					
					//for (PedidoProdu pedidoprodu:pedidoprodusParaReportes) {
					//	pedidoproduLogic.deepLoad(pedidoprodu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//pedidoproduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//pedidoproduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePedidoDetaProdu = AuxiliarReportes.class.getResourceAsStream("PedidoDetaProduDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidodetaprodu", reportFilePedidoDetaProdu);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourcePedidoProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			PedidoProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			PedidoProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourcePedidoProdu=new JRBeanArrayDataSource(PedidoProduJInternalFrame.TraerPedidoProduBeans(pedidoprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourcePedidoProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+PedidoProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+PedidoProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(PedidoProduBean.TraerPedidoProduBeans(pedidoprodusParaReportes).toArray()));
							
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
				this.generarExcelReportePedidoProdus(sAccionBusqueda,sTipoArchivoReporte,pedidoprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalPedidoProdus(sAccionBusqueda,sTipoArchivoReporte,pedidoprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoPedidoProduActionPerformed(null);
					//this.generarExcelReportePedidoProdus(sAccionBusqueda,sTipoArchivoReporte,pedidoprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalPedidoProdus(sAccionBusqueda,sTipoArchivoReporte,pedidoprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesPedidoProdus(sAccionBusqueda,sTipoArchivoReporte,pedidoprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesPedidoProdus(sAccionBusqueda,sTipoArchivoReporte,pedidoprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReportePedidoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidoProdu> pedidoprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidoProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPedidoProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(PedidoProdu pedidoprodu : pedidoprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			PedidoProduConstantesFunciones.generarExcelReporteDataPedidoProdu("NORMAL",row,workbook,pedidoprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderPedidoProdu(String sTipo,Row row,Workbook workbook) {
		
		PedidoProduConstantesFunciones.generarExcelReporteHeaderPedidoProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalPedidoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidoProdu> pedidoprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidoProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(PedidoProdu pedidoprodu : pedidoprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(PedidoProduConstantesFunciones.getPedidoProduDescripcion(pedidoprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDFORMATO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDFORMATO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getformato_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.gettipoprioridadempresaprodu_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getempleadoresponsable_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getdireccion_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.gettelefono_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_RUCCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_RUCCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getruc_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_LOTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_LOTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getlote());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getfecha_pedido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_FECHAENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHAENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getfecha_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(pedidoprodu.getes_uso_interno()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(pedidoprodu.getestadoordenprodu_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesPedidoProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<PedidoProdu> pedidoprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<PedidoProdu> pedidoprodusRespaldo=null;
		
		classes=PedidoProduConstantesFunciones.getClassesRelationshipsOfPedidoProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.pedidoproduLogic.setDatosCliente(this.datosCliente);
		this.pedidoproduLogic.setDatosDeep(this.datosDeep);
		this.pedidoproduLogic.setIsConDeep(true);
		
		pedidoprodusRespaldo=this.pedidoproduLogic.getPedidoProdus();
		
		this.pedidoproduLogic.setPedidoProdus(pedidoprodusParaReportes);	
		this.pedidoproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		pedidoprodusParaReportes=this.pedidoproduLogic.getPedidoProdus();
		this.pedidoproduLogic.setPedidoProdus(pedidoprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("PedidoProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderPedidoProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(PedidoProdu pedidoprodu : pedidoprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderPedidoProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			PedidoProduConstantesFunciones.generarExcelReporteDataPedidoProdu("NORMAL",row,workbook,pedidoprodu,cellStyleDataAux);
		
			
			


				//PedidoDetaProdu
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO))) {

				if(pedidoprodu.getPedidoDetaProdus()!=null && pedidoprodu.getPedidoDetaProdus().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoDetaProduConstantesFunciones.generarExcelReporteHeaderPedidoDetaProdu("RELACIONADO",row,workbook);
				}

				if(pedidoprodu.getPedidoDetaProdus()!=null) {
					i2=0;
					for(PedidoDetaProdu pedidodetaprodu : pedidoprodu.getPedidoDetaProdus()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoDetaProduConstantesFunciones.generarExcelReporteDataPedidoDetaProdu("RELACIONADO",row,workbook,pedidodetaprodu,cellStyleDataAuxHijo);
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
		cell.setCellValue(PedidoProduConstantesFunciones.getPedidoProduDescripcion(pedidoprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoPedidoProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessPedidoProdu() throws Exception {		
		this.startProcessPedidoProdu(true);
	}
	
	public void startProcessPedidoProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasPedidoProdu ,this.jPanelParametrosReportesPedidoProdu, this.jScrollPanelDatosPedidoProdu,this.jPanelPaginacionPedidoProdu, this.jScrollPanelDatosEdicionPedidoProdu, this.jPanelAccionesPedidoProdu,this.jPanelAccionesFormularioPedidoProdu,this.jmenuBarPedidoProdu,this.jmenuBarDetallePedidoProdu,this.jTtoolBarPedidoProdu,this.jTtoolBarDetallePedidoProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasPedidoProdu=this.jTabbedPaneBusquedasPedidoProdu; 
		
		final JPanel jPanelParametrosReportesPedidoProdu=this.jPanelParametrosReportesPedidoProdu;
		//final JScrollPane jScrollPanelDatosPedidoProdu=this.jScrollPanelDatosPedidoProdu;
		final JTable jTableDatosPedidoProdu=this.jTableDatosPedidoProdu;		
		final JPanel jPanelPaginacionPedidoProdu=this.jPanelPaginacionPedidoProdu;
		//final JScrollPane jScrollPanelDatosEdicionPedidoProdu=this.jScrollPanelDatosEdicionPedidoProdu;
		final JPanel jPanelAccionesPedidoProdu=this.jPanelAccionesPedidoProdu;
		
		JPanel jPanelCamposAuxiliarPedidoProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarPedidoProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			jPanelCamposAuxiliarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jPanelCamposPedidoProdu;
			jPanelAccionesFormularioAuxiliarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jPanelAccionesFormularioPedidoProdu;
		}
		
		final JPanel jPanelCamposPedidoProdu=jPanelCamposAuxiliarPedidoProdu;
		final JPanel jPanelAccionesFormularioPedidoProdu=jPanelAccionesFormularioAuxiliarPedidoProdu;
		
		
		final JMenuBar jmenuBarPedidoProdu=this.jmenuBarPedidoProdu;
		final JToolBar jTtoolBarPedidoProdu=this.jTtoolBarPedidoProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarPedidoProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPedidoProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			jmenuBarDetalleAuxiliarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jmenuBarDetallePedidoProdu;
			jTtoolBarDetalleAuxiliarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jTtoolBarDetallePedidoProdu;
		}
		
		final JMenuBar jmenuBarDetallePedidoProdu=jmenuBarDetalleAuxiliarPedidoProdu;
		final JToolBar jTtoolBarDetallePedidoProdu=jTtoolBarDetalleAuxiliarPedidoProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPedidoProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPedidoProdu;
			processRunnable.jTableDatos=jTableDatosPedidoProdu;
			processRunnable.jPanelCampos=jPanelCamposPedidoProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionPedidoProdu;
			processRunnable.jPanelAcciones=jPanelAccionesPedidoProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPedidoProdu;
			
			
			processRunnable.jmenuBar=jmenuBarPedidoProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePedidoProdu;
			processRunnable.jTtoolBar=jTtoolBarPedidoProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePedidoProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPedidoProdu ,jPanelParametrosReportesPedidoProdu,jTableDatosPedidoProdu, /*jScrollPanelDatosPedidoProdu,*/jPanelCamposPedidoProdu,jPanelPaginacionPedidoProdu, /*jScrollPanelDatosEdicionPedidoProdu,*/ jPanelAccionesPedidoProdu,jPanelAccionesFormularioPedidoProdu,jmenuBarPedidoProdu,jmenuBarDetallePedidoProdu,jTtoolBarPedidoProdu,jTtoolBarDetallePedidoProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasPedidoProdu ,jPanelParametrosReportesPedidoProdu, jScrollPanelDatosPedidoProdu,jPanelPaginacionPedidoProdu, jScrollPanelDatosEdicionPedidoProdu, jPanelAccionesPedidoProdu,jPanelAccionesFormularioPedidoProdu,jmenuBarPedidoProdu,jmenuBarDetallePedidoProdu,jTtoolBarPedidoProdu,jTtoolBarDetallePedidoProdu);
						
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
	
	public void finishProcessPedidoProdu() {// throws Exception 
		this.finishProcessPedidoProdu(true);
	}
	
	public void finishProcessPedidoProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasPedidoProdu ,this.jPanelParametrosReportesPedidoProdu, this.jScrollPanelDatosPedidoProdu,this.jPanelPaginacionPedidoProdu, this.jScrollPanelDatosEdicionPedidoProdu, this.jPanelAccionesPedidoProdu,this.jPanelAccionesFormularioPedidoProdu,this.jmenuBarPedidoProdu,this.jmenuBarDetallePedidoProdu,this.jTtoolBarPedidoProdu,this.jTtoolBarDetallePedidoProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasPedidoProdu=this.jTabbedPaneBusquedasPedidoProdu; 
		
		final JPanel jPanelParametrosReportesPedidoProdu=this.jPanelParametrosReportesPedidoProdu;
		//final JScrollPane jScrollPanelDatosPedidoProdu=this.jScrollPanelDatosPedidoProdu;
		final JTable jTableDatosPedidoProdu=this.jTableDatosPedidoProdu;		
		final JPanel jPanelPaginacionPedidoProdu=this.jPanelPaginacionPedidoProdu;
		//final JScrollPane jScrollPanelDatosEdicionPedidoProdu=this.jScrollPanelDatosEdicionPedidoProdu;
		final JPanel jPanelAccionesPedidoProdu=this.jPanelAccionesPedidoProdu;
		
		JPanel jPanelCamposAuxiliarPedidoProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarPedidoProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			jPanelCamposAuxiliarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jPanelCamposPedidoProdu;
			jPanelAccionesFormularioAuxiliarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jPanelAccionesFormularioPedidoProdu;
		}
		
		final JPanel jPanelCamposPedidoProdu=jPanelCamposAuxiliarPedidoProdu;
		final JPanel jPanelAccionesFormularioPedidoProdu=jPanelAccionesFormularioAuxiliarPedidoProdu;
		
		
		final JMenuBar jmenuBarPedidoProdu=this.jmenuBarPedidoProdu;		
		final JToolBar jTtoolBarPedidoProdu=this.jTtoolBarPedidoProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarPedidoProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarPedidoProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			jmenuBarDetalleAuxiliarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jmenuBarDetallePedidoProdu;
			jTtoolBarDetalleAuxiliarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jTtoolBarDetallePedidoProdu;		
		}
		
		final JMenuBar jmenuBarDetallePedidoProdu=jmenuBarDetalleAuxiliarPedidoProdu;
		final JToolBar jTtoolBarDetallePedidoProdu=jTtoolBarDetalleAuxiliarPedidoProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasPedidoProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesPedidoProdu;
			processRunnable.jTableDatos=jTableDatosPedidoProdu;
			processRunnable.jPanelCampos=jPanelCamposPedidoProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionPedidoProdu;
			processRunnable.jPanelAcciones=jPanelAccionesPedidoProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioPedidoProdu;
			
			
			processRunnable.jmenuBar=jmenuBarPedidoProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetallePedidoProdu;
			processRunnable.jTtoolBar=jTtoolBarPedidoProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetallePedidoProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasPedidoProdu ,jPanelParametrosReportesPedidoProdu, jTableDatosPedidoProdu,/*jScrollPanelDatosPedidoProdu,*/jPanelCamposPedidoProdu,jPanelPaginacionPedidoProdu, /*jScrollPanelDatosEdicionPedidoProdu,*/ jPanelAccionesPedidoProdu,jPanelAccionesFormularioPedidoProdu,jmenuBarPedidoProdu,jmenuBarDetallePedidoProdu,jTtoolBarPedidoProdu,jTtoolBarDetallePedidoProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesPedidoProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarPedidoProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuPedidoProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarPedidoProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarPedidoProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePedidoProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuPedidoProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarPedidoProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePedidoProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.pedidoproduConstantesFunciones.getsFinalQueryPedidoProdu();
		String  finalQueryPaginacionTodos=this.pedidoproduConstantesFunciones.getsFinalQueryPedidoProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=PedidoProduConstantesFunciones.getArrayColumnasGlobalesNoPedidoProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=PedidoProduConstantesFunciones.getArrayColumnasGlobalesPedidoProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,PedidoProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.pedidoprodusEliminados= new ArrayList<PedidoProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessPedidoProdu();
		
				///*PedidoProduSessionBean*/this.pedidoproduSessionBean=new PedidoProduSessionBean();
			
			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
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
					this.iNumeroPaginacion=PedidoProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=PedidoProduConstantesFunciones.getClassesForeignKeysOfPedidoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/pedidoprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			pedidoprodusAux= new ArrayList<PedidoProdu>();
			
				
			pedidoproduLogic.setDatosCliente(this.datosCliente);
			pedidoproduLogic.setDatosDeep(this.datosDeep);
			pedidoproduLogic.setIsConDeep(true);
			
			
			pedidoproduLogic.getPedidoProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					pedidoproduLogic.getTodosPedidoProdus(finalQueryGlobal,pagination);
					
					//pedidoproduLogic.getTodosPedidoProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(pedidoproduLogic.getPedidoProdus()==null|| pedidoproduLogic.getPedidoProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							pedidoprodusAux= new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux= new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							pedidoproduLogic.getTodosPedidoProdus(finalQueryGlobal+"",this.pagination);												
							
							//pedidoproduLogic.getTodosPedidoProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReportePedidoProdus("Todos",pedidoproduLogic.getPedidoProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());					
							pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idPedidoProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idPedidoProdu=this.idActual;
				
				} else if(this.idPedidoProduActual!=null && this.idPedidoProduActual!=0L) {
					idPedidoProdu=idPedidoProduActual;
				}
				
					
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndicePorId(idPedidoProdu);
				
				this.pedidoprodus=new ArrayList<PedidoProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					pedidoproduLogic.getEntity(idPedidoProdu);
					
					//pedidoproduLogic.getEntityWithConnection(idPedidoProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
					pedidoproduLogic.getPedidoProdus().add(pedidoproduLogic.getPedidoProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodus=new ArrayList<PedidoProdu>();
					this.pedidoprodus.add(pedidoprodu);
				}
				
				if(pedidoproduLogic.getPedidoProdu()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdCliente",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdCliente",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdEjercicio",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdEjercicio",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleadoResponsable")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdEmpleadoResponsable(finalQueryGlobal,pagination,id_empleado_responsableFK_IdEmpleadoResponsable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdEmpleadoResponsable(finalQueryGlobal,pagination,id_empleado_responsableFK_IdEmpleadoResponsable);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpleadoResponsable(id_empleado_responsableFK_IdEmpleadoResponsable);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdEmpleadoResponsable",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdEmpleadoResponsable",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdEmpresa",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdEmpresa",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstadoOrdenProdu")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdEstadoOrdenProdu(finalQueryGlobal,pagination,id_estado_orden_produFK_IdEstadoOrdenProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdEstadoOrdenProdu(finalQueryGlobal,pagination,id_estado_orden_produFK_IdEstadoOrdenProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdEstadoOrdenProdu(id_estado_orden_produFK_IdEstadoOrdenProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdEstadoOrdenProdu",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdEstadoOrdenProdu",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdFormato")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdFormato(finalQueryGlobal,pagination,id_formatoFK_IdFormato);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdFormato(id_formatoFK_IdFormato);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdFormato",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdFormato",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPeriodo")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdPeriodo(finalQueryGlobal,pagination,id_periodoFK_IdPeriodo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdPeriodo(id_periodoFK_IdPeriodo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdPeriodo",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdPeriodo",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdSucursal",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdSucursal",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoPrioridadEmpresaProdu")) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					pedidoproduLogic.getPedidoProdusFK_IdTipoPrioridadEmpresaProdu(finalQueryGlobal,pagination,id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=pedidoproduLogic.getPedidoProdus()==null||pedidoproduLogic.getPedidoProdus().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=pedidoprodus==null|| pedidoprodus.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoprodusAux=new ArrayList<PedidoProdu>();
						pedidoprodusAux.addAll(pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodusAux=new ArrayList<PedidoProdu>();
							pedidoprodusAux.addAll(pedidoprodus);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							pedidoproduLogic.getPedidoProdusFK_IdTipoPrioridadEmpresaProdu(finalQueryGlobal,pagination,id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=PedidoProduConstantesFunciones.getDetalleIndiceFK_IdTipoPrioridadEmpresaProdu(id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReportePedidoProdus("FK_IdTipoPrioridadEmpresaProdu",pedidoproduLogic.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReportePedidoProdus("FK_IdTipoPrioridadEmpresaProdu",pedidoprodus);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduLogic.setPedidoProdus(new ArrayList<PedidoProdu>());
						pedidoproduLogic.getPedidoProdus().addAll(pedidoprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoprodus=new ArrayList<PedidoProdu>();
							pedidoprodus.addAll(pedidoprodusAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesPedidoProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessPedidoProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pedidoproduLogic.getPedidoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=pedidoproduLogic.getPedidoProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=pedidoprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(PedidoProdu pedidoprodu) {
		Boolean permite=true;
		
		if(this.pedidoprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=PedidoProduConstantesFunciones.getOrderByListaPedidoProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=PedidoProduConstantesFunciones.getOrderByListaPedidoProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoProdu pedidoprodu:pedidoproduLogic.getPedidoProdus()) {
				if(pedidoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					pedidoproduTotales=pedidoprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoProdu pedidoprodu:this.pedidoprodus) {
				if(pedidoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					pedidoproduTotales=pedidoprodu;
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
			this.pedidoproduAux=new PedidoProdu();
			this.pedidoproduAux.setsType(Constantes2.S_TOTALES);
			this.pedidoproduAux.setIsNew(false);
			this.pedidoproduAux.setIsChanged(false);
			this.pedidoproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				PedidoProduConstantesFunciones.TotalizarValoresFilaPedidoProdu(this.pedidoproduLogic.getPedidoProdus(),this.pedidoproduAux);
				
				this.pedidoproduLogic.getPedidoProdus().add(this.pedidoproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				PedidoProduConstantesFunciones.TotalizarValoresFilaPedidoProdu(this.pedidoprodus,this.pedidoproduAux);
				
				this.pedidoprodus.add(this.pedidoproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		pedidoproduTotales=new PedidoProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pedidoproduLogic.getPedidoProdus().remove(pedidoproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.pedidoprodus.remove(pedidoproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		pedidoproduTotales=new PedidoProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(PedidoProdu pedidoprodu:pedidoproduLogic.getPedidoProdus()) {
				if(pedidoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					pedidoproduTotales=pedidoprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PedidoProduConstantesFunciones.TotalizarValoresFilaPedidoProdu(this.pedidoproduLogic.getPedidoProdus(),pedidoproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(PedidoProdu pedidoprodu:this.pedidoprodus) {
				if(pedidoprodu.getsType().equals(Constantes2.S_TOTALES)) {
					pedidoproduTotales=pedidoprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				PedidoProduConstantesFunciones.TotalizarValoresFilaPedidoProdu(this.pedidoprodus,pedidoproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getPedidoProdusFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoProdusFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoProdusFK_IdEmpleadoResponsable()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleadoResponsable";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoProdusFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoProdusFK_IdEstadoOrdenProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstadoOrdenProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoProdusFK_IdFormato()throws Exception {
		try {
			sAccionBusqueda="FK_IdFormato";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoProdusFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoProdusFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getPedidoProdusFK_IdTipoPrioridadEmpresaProdu()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoPrioridadEmpresaProdu";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getPedidoProdusFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoProdusFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoProdusFK_IdEmpleadoResponsable(String sFinalQuery,Long id_empleado_responsable)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdEmpleadoResponsable(sFinalQuery,this.pagination,id_empleado_responsable);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoProdusFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoProdusFK_IdEstadoOrdenProdu(String sFinalQuery,Long id_estado_orden_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdEstadoOrdenProdu(sFinalQuery,this.pagination,id_estado_orden_produ);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoProdusFK_IdFormato(String sFinalQuery,Long id_formato)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdFormato(sFinalQuery,this.pagination,id_formato);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoProdusFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoProdusFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getPedidoProdusFK_IdTipoPrioridadEmpresaProdu(String sFinalQuery,Long id_tipo_prioridad_empresa_produ)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLogic.getPedidoProdusFK_IdTipoPrioridadEmpresaProdu(sFinalQuery,this.pagination,id_tipo_prioridad_empresa_produ);
				
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
	
	public void inicializarPermisosPedidoProdu() {
		this.isPermisoTodoPedidoProdu=false;
		this.isPermisoNuevoPedidoProdu=false;
		this.isPermisoActualizarPedidoProdu=false;
		this.isPermisoActualizarOriginalPedidoProdu=false;
		this.isPermisoEliminarPedidoProdu=false;
		this.isPermisoGuardarCambiosPedidoProdu=false;
		this.isPermisoConsultaPedidoProdu=false;
		this.isPermisoBusquedaPedidoProdu=false;
		this.isPermisoReportePedidoProdu=false;		
		this.isPermisoOrdenPedidoProdu=false;		
		this.isPermisoPaginacionMedioPedidoProdu=false;		
		this.isPermisoPaginacionAltoPedidoProdu=false;
		this.isPermisoPaginacionTodoPedidoProdu=false;
		this.isPermisoCopiarPedidoProdu=false;		
		this.isPermisoVerFormPedidoProdu=false;		
		this.isPermisoDuplicarPedidoProdu=false;		
		this.isPermisoOrdenPedidoProdu=false;		
	}
	
	public void setPermisosUsuarioPedidoProdu(Boolean isPermiso) {
		this.isPermisoTodoPedidoProdu=isPermiso;
		this.isPermisoNuevoPedidoProdu=isPermiso;
		this.isPermisoActualizarPedidoProdu=isPermiso;
		this.isPermisoActualizarOriginalPedidoProdu=isPermiso;
		this.isPermisoEliminarPedidoProdu=isPermiso;
		this.isPermisoGuardarCambiosPedidoProdu=isPermiso;
		this.isPermisoConsultaPedidoProdu=isPermiso;
		this.isPermisoBusquedaPedidoProdu=isPermiso;
		this.isPermisoReportePedidoProdu=isPermiso;
		this.isPermisoOrdenPedidoProdu=isPermiso;		
		this.isPermisoPaginacionMedioPedidoProdu=isPermiso;		
		this.isPermisoPaginacionAltoPedidoProdu=isPermiso;		
		this.isPermisoPaginacionTodoPedidoProdu=isPermiso;		
		this.isPermisoCopiarPedidoProdu=isPermiso;		
		this.isPermisoVerFormPedidoProdu=isPermiso;		
		this.isPermisoDuplicarPedidoProdu=isPermiso;
		this.isPermisoOrdenPedidoProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioPedidoProdu(Boolean isPermiso) {
		//this.isPermisoTodoPedidoProdu=isPermiso;
		this.isPermisoNuevoPedidoProdu=isPermiso;
		this.isPermisoActualizarPedidoProdu=isPermiso;
		this.isPermisoActualizarOriginalPedidoProdu=isPermiso;
		this.isPermisoEliminarPedidoProdu=isPermiso;
		this.isPermisoGuardarCambiosPedidoProdu=isPermiso;
		//this.isPermisoConsultaPedidoProdu=isPermiso;
		//this.isPermisoBusquedaPedidoProdu=isPermiso;
		//this.isPermisoReportePedidoProdu=isPermiso;
		//this.isPermisoOrdenPedidoProdu=isPermiso;		
		//this.isPermisoPaginacionMedioPedidoProdu=isPermiso;		
		//this.isPermisoPaginacionAltoPedidoProdu=isPermiso;		
		//this.isPermisoPaginacionTodoPedidoProdu=isPermiso;		
		//this.isPermisoCopiarPedidoProdu=isPermiso;		
		//this.isPermisoDuplicarPedidoProdu=isPermiso;
		//this.isPermisoOrdenPedidoProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioPedidoProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PedidoDetaProduConstantesFunciones.SNOMBREOPCION);
		
		if(PedidoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPedidoDetaProdu=false;
		this.isTienePermisosPedidoDetaProdu=this.verificarGetPermisosUsuarioOpcionPedidoProduClaseRelacionada(this.opcionsRelacionadas,PedidoDetaProduConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebPedidoProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioPedidoProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPedidoDetaProdu=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioPedidoProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionPedidoProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioPedidoProduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPedidoDetaProdu && this.jInternalFrameDetalleFormPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.remove(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioPedidoProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(PedidoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, PedidoProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoPedidoProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarPedidoProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalPedidoProdu=this.isPermisoActualizarPedidoProdu;
			this.isPermisoEliminarPedidoProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosPedidoProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaPedidoProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaPedidoProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoPedidoProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReportePedidoProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPedidoProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioPedidoProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoPedidoProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoPedidoProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarPedidoProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormPedidoProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarPedidoProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenPedidoProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosPedidoProdu.setToolTipText(this.jTableDatosPedidoProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioPedidoProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioPedidoProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(PedidoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(PedidoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioPedidoProdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPedidoDetaProdu && this.pedidoproduConstantesFunciones.mostrarPedidoDetaProduPedidoProdu && !PedidoProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Detalle Produccion");
			reporte.setsDescripcion("Pedido Detalle Produccion");
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
	public void inicializarCombosForeignKeyPedidoProduListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.formatosForeignKey=new ArrayList();
				this.tipoprioridadempresaprodusForeignKey=new ArrayList();
				this.empleadoresponsablesForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
				this.estadoordenprodusForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyPedidoProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(PedidoProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyPedidoProduListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoPrioridadEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoResponsableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstadoOrdenProduListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyFormatoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FormatoConstantesFunciones.SFINALQUERY;

				this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrioridadEmpresaProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoprioridadempresaprodusForeignKey==null||this.tipoprioridadempresaprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoPrioridadEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoPrioridadEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrioridadEmpresaProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoPrioridadEmpresaProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoPrioridadEmpresaProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoResponsableListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadoresponsablesForeignKey==null||this.empleadoresponsablesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadoResponsablesForeignKeyLista(finalQueryGlobal);
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

	public void cargarCombosForeignKeyEstadoOrdenProduListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estadoordenprodusForeignKey==null||this.estadoordenprodusForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstadoOrdenProduConstantesFunciones.getArrayColumnasGlobalesEstadoOrdenProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoOrdenProduConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstadoOrdenProduConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstadoOrdenProdusForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyPedidoProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			PedidoProduParameterReturnGeneral pedidoproduReturnGeneral=new PedidoProduParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_empresaPedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_empresaPedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_sucursalPedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_sucursalPedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_ejercicioPedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_ejercicioPedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_periodoPedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_periodoPedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalFormato="";

				if(((this.formatosForeignKey==null||this.formatosForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_formatoPedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_formatoPedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FormatoConstantesFunciones.getArrayColumnasGlobalesFormato(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFormato=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FormatoConstantesFunciones.TABLENAME);

						finalQueryGlobalFormato=Funciones.GetFinalQueryAppend(finalQueryGlobalFormato, "");
						finalQueryGlobalFormato+=FormatoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFormatosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFormato=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidFormatoActual();
					}
				} else {
					finalQueryGlobalFormato="NONE";
				}


				String finalQueryGlobalTipoPrioridadEmpresaProdu="";

				if(((this.tipoprioridadempresaprodusForeignKey==null||this.tipoprioridadempresaprodusForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_tipo_prioridad_empresa_produPedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_tipo_prioridad_empresa_produPedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoPrioridadEmpresaProduConstantesFunciones.getArrayColumnasGlobalesTipoPrioridadEmpresaProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoPrioridadEmpresaProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoPrioridadEmpresaProduConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoPrioridadEmpresaProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoPrioridadEmpresaProdu, "");
						finalQueryGlobalTipoPrioridadEmpresaProdu+=TipoPrioridadEmpresaProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoPrioridadEmpresaProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoPrioridadEmpresaProdu=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidTipoPrioridadEmpresaProduActual();
					}
				} else {
					finalQueryGlobalTipoPrioridadEmpresaProdu="NONE";
				}


				String finalQueryGlobalEmpleadoResponsable="";

				if(((this.empleadoresponsablesForeignKey==null||this.empleadoresponsablesForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_empleado_responsablePedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_empleado_responsablePedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoResponsable()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleadoResponsable=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleadoResponsable=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleadoResponsable, "");
						finalQueryGlobalEmpleadoResponsable+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadoResponsablesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleadoResponsable=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidEmpleadoResponsableActual();
					}
				} else {
					finalQueryGlobalEmpleadoResponsable="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_clientePedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_clientePedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalEstadoOrdenProdu="";

				if(((this.estadoordenprodusForeignKey==null||this.estadoordenprodusForeignKey.size()<=0) && this.pedidoproduConstantesFunciones.cargarid_estado_orden_produPedidoProdu)
					 || (this.esRecargarFks && this.pedidoproduConstantesFunciones.cargarid_estado_orden_produPedidoProdu)) {

					if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEstadoOrdenProdu()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstadoOrdenProduConstantesFunciones.getArrayColumnasGlobalesEstadoOrdenProdu(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstadoOrdenProdu=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstadoOrdenProduConstantesFunciones.TABLENAME);

						finalQueryGlobalEstadoOrdenProdu=Funciones.GetFinalQueryAppend(finalQueryGlobalEstadoOrdenProdu, "");
						finalQueryGlobalEstadoOrdenProdu+=EstadoOrdenProduConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstadoOrdenProdusForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstadoOrdenProdu=" WHERE " + ConstantesSql.ID + "="+pedidoproduSessionBean.getlidEstadoOrdenProduActual();
					}
				} else {
					finalQueryGlobalEstadoOrdenProdu="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				pedidoproduReturnGeneral=pedidoproduLogic.cargarCombosLoteForeignKeyPedidoProdu(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalFormato,finalQueryGlobalTipoPrioridadEmpresaProdu,finalQueryGlobalEmpleadoResponsable,finalQueryGlobalCliente,finalQueryGlobalEstadoOrdenProdu);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=pedidoproduReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=pedidoproduReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=pedidoproduReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=pedidoproduReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalFormato.equals("NONE")) {
				this.formatosForeignKey=pedidoproduReturnGeneral.getformatosForeignKey();
			}

			if(!finalQueryGlobalTipoPrioridadEmpresaProdu.equals("NONE")) {
				this.tipoprioridadempresaprodusForeignKey=pedidoproduReturnGeneral.gettipoprioridadempresaprodusForeignKey();
			}

			if(!finalQueryGlobalEmpleadoResponsable.equals("NONE")) {
				this.empleadoresponsablesForeignKey=pedidoproduReturnGeneral.getempleadoresponsablesForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=pedidoproduReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalEstadoOrdenProdu.equals("NONE")) {
				this.estadoordenprodusForeignKey=pedidoproduReturnGeneral.getestadoordenprodusForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyPedidoProdu()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyFormato();
			this.addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
			this.addItemDefectoCombosForeignKeyEmpleadoResponsable();
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyEstadoOrdenProdu();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyFormato()throws Exception {
		try {

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionFormato()) {
				Formato formato=new Formato();
				FormatoConstantesFunciones.setFormatoDescripcion(formato,Constantes.SMENSAJE_ESCOJA_OPCION);
				formato.setId(null);

				if(!FormatoConstantesFunciones.ExisteEnLista(this.formatosForeignKey,formato,true)) {

					this.formatosForeignKey.add(0,formato);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu()throws Exception {
		try {

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionTipoPrioridadEmpresaProdu()) {
				TipoPrioridadEmpresaProdu tipoprioridadempresaprodu=new TipoPrioridadEmpresaProdu();
				TipoPrioridadEmpresaProduConstantesFunciones.setTipoPrioridadEmpresaProduDescripcion(tipoprioridadempresaprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoprioridadempresaprodu.setId(null);

				if(!TipoPrioridadEmpresaProduConstantesFunciones.ExisteEnLista(this.tipoprioridadempresaprodusForeignKey,tipoprioridadempresaprodu,true)) {

					this.tipoprioridadempresaprodusForeignKey.add(0,tipoprioridadempresaprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleadoResponsable()throws Exception {
		try {

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEmpleadoResponsable()) {
				Empleado empleadoresponsable=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleadoresponsable,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleadoresponsable.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadoresponsablesForeignKey,empleadoresponsable,true)) {

					this.empleadoresponsablesForeignKey.add(0,empleadoresponsable);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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

	public void addItemDefectoCombosForeignKeyEstadoOrdenProdu()throws Exception {
		try {

			if(!this.pedidoproduSessionBean.getisBusquedaDesdeForeignKeySesionEstadoOrdenProdu()) {
				EstadoOrdenProdu estadoordenprodu=new EstadoOrdenProdu();
				EstadoOrdenProduConstantesFunciones.setEstadoOrdenProduDescripcion(estadoordenprodu,Constantes.SMENSAJE_ESCOJA_OPCION);
				estadoordenprodu.setId(null);

				if(!EstadoOrdenProduConstantesFunciones.ExisteEnLista(this.estadoordenprodusForeignKey,estadoordenprodu,true)) {

					this.estadoordenprodusForeignKey.add(0,estadoordenprodu);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyPedidoProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyPedidoProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyPedidoProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
				this.setActualPeriodoForeignKey(this.parametroGeneralUsuario.getid_periodo(),false,"Formulario");
			
			
				this.pedidoprodu.setfecha_pedido(this.parametroGeneralUsuario.getfecha_sistema());
				this.pedidoprodu.setfecha_entrega(this.parametroGeneralUsuario.getfecha_sistema());
				this.pedidoprodu.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyPedidoProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyPedidoProdu(PedidoProdu pedidoprodu)throws Exception {	
		try {
			
			this.setActualFormatoForeignKey(pedidoprodu.getid_formato(),false,"Formulario");
			this.setActualTipoPrioridadEmpresaProduForeignKey(pedidoprodu.getid_tipo_prioridad_empresa_produ(),false,"Formulario");
			this.setActualEmpleadoResponsableForeignKey(pedidoprodu.getid_empleado_responsable(),false,"Formulario");
			this.setActualClienteForeignKey(pedidoprodu.getid_cliente(),false,"Formulario");
			this.setActualEstadoOrdenProduForeignKey(pedidoprodu.getid_estado_orden_produ(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyPedidoProdu(PedidoProdu pedidoprodu,String sTipoEvento)throws Exception {	
		try {
			
			

				if(pedidoprodu.getCliente()!=null && !sTipoEvento.equals("id_clientePedidoProdu")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(pedidoprodu.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyPedidoProdu()throws Exception {	
		try {
			
			this.setActualFormatoForeignKey(this.pedidoproduConstantesFunciones.getid_formato(),false,"Formulario");
			this.setActualTipoPrioridadEmpresaProduForeignKey(this.pedidoproduConstantesFunciones.getid_tipo_prioridad_empresa_produ(),false,"Formulario");
			this.setActualEmpleadoResponsableForeignKey(this.pedidoproduConstantesFunciones.getid_empleado_responsable(),false,"Formulario");
			this.setActualClienteForeignKey(this.pedidoproduConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualEstadoOrdenProduForeignKey(this.pedidoproduConstantesFunciones.getid_estado_orden_produ(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyPedidoProdu()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.getSelectedItem();
				}

				if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
					Periodo periodoActual=(Periodo)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyPedidoProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyPedidoProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroPedidoProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyPedidoProdu()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameFormatosForeignKey("Todos");
			this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey("Todos");
			this.cargarCombosFrameEmpleadoResponsablesForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameEstadoOrdenProdusForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyPedidoProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadoResponsablesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstadoOrdenProdusForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyPedidoProdu()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.getItemCount()>0) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


















	
	

	public PedidoProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public PedidoProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public PedidoProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.pedidoproduSessionBean=new PedidoProduSessionBean(); 
		this.pedidoproduConstantesFunciones=new PedidoProduConstantesFunciones(); 
		this.pedidoproduBean=new PedidoProdu();//(this.pedidoproduConstantesFunciones); 		
		this.pedidoproduReturnGeneral=new PedidoProduParameterReturnGeneral(); 
		
		this.pedidoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pedidoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public PedidoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public PedidoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public PedidoProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessPedidoProdu(true);
			
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
			
			this.pedidoproduConstantesFunciones=new PedidoProduConstantesFunciones(); 
			this.pedidoproduBean=new PedidoProdu();//this.pedidoproduConstantesFunciones); 			
			this.pedidoproduReturnGeneral=new PedidoProduParameterReturnGeneral(); 
		
			PedidoProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pedido Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.pedidoprodu=new PedidoProdu();
			this.pedidoprodus = new ArrayList<PedidoProdu>();
			this.pedidoprodusAux = new ArrayList<PedidoProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic=new PedidoProduLogic();
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}
			
			//this.pedidoproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.pedidoproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormPedidoProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPedidoProdu);	
					}
					
					if(this.jInternalFrameImportacionPedidoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPedidoProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByPedidoProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByPedidoProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormPedidoProdu);
				this.jInternalFrameDetalleFormPedidoProdu.setVisible(false);
				this.jInternalFrameDetalleFormPedidoProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPedidoProdu);
					this.jInternalFrameReporteDinamicoPedidoProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoPedidoProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionPedidoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionPedidoProdu);
					this.jInternalFrameImportacionPedidoProdu.setVisible(false);
					this.jInternalFrameImportacionPedidoProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByPedidoProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByPedidoProdu);
					this.jInternalFrameOrderByPedidoProdu.setVisible(false);
					this.jInternalFrameOrderByPedidoProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idPedidoProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=PedidoProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.pedidoproduReturnGeneral=new PedidoProduParameterReturnGeneral();
			
			this.pedidoproduParameterGeneral=new PedidoProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.pedidoproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(PedidoProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PedidoDetaProduConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PedidoProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pedidoproduSessionBean.getEsGuardarRelacionado(),this.pedidoproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,PedidoProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.pedidoproduSessionBean.getEsGuardarRelacionado(),this.pedidoproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoPedidoProdu=false;
			this.isVisibilidadCeldaDuplicarPedidoProdu=true;
			this.isVisibilidadCeldaCopiarPedidoProdu=true;
			this.isVisibilidadCeldaVerFormPedidoProdu=true;
			this.isVisibilidadCeldaOrdenPedidoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
			this.isVisibilidadCeldaModificarPedidoProdu=false;
			this.isVisibilidadCeldaActualizarPedidoProdu=false;
			this.isVisibilidadCeldaEliminarPedidoProdu=false;
			this.isVisibilidadCeldaCancelarPedidoProdu=false;
			this.isVisibilidadCeldaGuardarPedidoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpleadoResponsable=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstadoOrdenProdu=true;
			this.isVisibilidadFK_IdFormato=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesPedidoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosPedidoProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioPedidoProdu(false);
			
			this.setPermisosUsuarioPedidoProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidoproduSessionBean.getEsGuardarRelacionado() 
				|| (this.pedidoproduSessionBean.getEsGuardarRelacionado() && this.pedidoproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioPedidoProduClasesRelacionadas();
			}
			
			if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioPedidoProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosPedidoProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualPedidoProdu();
			}
			
			if(!this.isPermisoBusquedaPedidoProdu) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioPedidoProdu,this.isPermisoPaginacionMedioPedidoProdu,this.isPermisoPaginacionTodoPedidoProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(PedidoProduConstantesFunciones.getTiposSeleccionarPedidoProdu());
				
				this.tiposColumnasSelect=PedidoProduConstantesFunciones.getTiposSeleccionarPedidoProdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectPedidoProdu();				
				//this.tiposRelacionesSelect=PedidoProduConstantesFunciones.getTiposRelacionesPedidoProdu(true);
				
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
			//if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioPedidoProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioPedidoProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioPedidoProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidoProdu() ;
			
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
			
			
			this.pedidodetaproduLogic=new PedidoDetaProduLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.formatoLogic=new FormatoLogic();
			this.tipoprioridadempresaproduLogic=new TipoPrioridadEmpresaProduLogic();
			this.empleadoresponsableLogic=new EmpleadoLogic();
			this.clienteLogic=new ClienteLogic();
			this.estadoordenproduLogic=new EstadoOrdenProduLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				pedidoproduImplementable= (PedidoProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PedidoProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				pedidoproduImplementableHome= (PedidoProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+PedidoProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.pedidoprodus= new ArrayList<PedidoProdu>();
			this.pedidoprodusEliminados= new ArrayList<PedidoProdu>();
						
			this.isEsNuevoPedidoProdu=false;
			this.esParaAccionDesdeFormularioPedidoProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.formatosForeignKey=new ArrayList<Formato>() ;
			this.tipoprioridadempresaprodusForeignKey=new ArrayList<TipoPrioridadEmpresaProdu>() ;
			this.empleadoresponsablesForeignKey=new ArrayList<Empleado>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.estadoordenprodusForeignKey=new ArrayList<EstadoOrdenProdu>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyPedidoProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroPedidoProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			PedidoProduBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=PedidoProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesPedidoProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingPedidoProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioPedidoProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioPedidoProdu();
			}
			
			PedidoProduBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasPedidoProdu.getTabCount(); i++) {
					this.jTabbedPaneBusquedasPedidoProdu.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasPedidoProdu.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessPedidoProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga PedidoProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectPedidoProdu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesPedidoProdu")) {
				iIndex=this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();	
				
				

				if(sTitle.equals("Pedido Detalle Producciones")) {
					if(!PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessPedidoProdu();

						this.cargarParteTabPanelRelacionadaPedidoDetaProdu(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessPedidoProdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPedidoDetaProdu(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormPedidoProdu.cargarSessionConBeanSwingJInternalFramePedidoDetaProdu(false,true,iIndex);
		this.jButtonPedidoDetaProduActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoDetaProdu();

		//this.jTabbedPaneRelacionesPedidoProdu.updateUI();
		//this.jTabbedPaneRelacionesPedidoProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesPedidoProdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PedidoDetaProdu")) {
				int row=this.jTableDatosPedidoProdu.getSelectedRow();
				jButtonPedidoDetaProduActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pedido Detalle Produccion")) {

					if(this.isTienePermisosPedidoDetaProdu && this.pedidoproduConstantesFunciones.mostrarPedidoDetaProduPedidoProdu && !PedidoProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Detalle Producciones"+"("+PedidoDetaProduConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Detalle Producciones");

						if(pedidoproduConstantesFunciones.resaltarPedidoDetaProduPedidoProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(pedidoproduConstantesFunciones.resaltarPedidoDetaProduPedidoProdu);
						}

						jmenuItem.setEnabled(this.pedidoproduConstantesFunciones.activarPedidoDetaProduPedidoProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoDetaProdu"));

						

						this.jInternalFrameDetalleFormPedidoProdu.jmenuDetallePedidoProdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyPedidoProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyPedidoProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyPedidoProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyPedidoProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyPedidoProdu();
		
		this.cargarCombosFrameForeignKeyPedidoProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyPedidoProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyPedidoProdu();
		}
	}
	
	

	public void cargarCombosForeignKeyFormato(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFormatoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFormato();
				this.cargarCombosFrameFormatosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFormato(this.formatosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoPrioridadEmpresaProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoPrioridadEmpresaProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
				this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoPrioridadEmpresaProdu(this.tipoprioridadempresaprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoResponsable(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoResponsableListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleadoResponsable();
				this.cargarCombosFrameEmpleadoResponsablesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleadoResponsable(this.empleadoresponsablesForeignKey);

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

	public void cargarCombosForeignKeyEstadoOrdenProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstadoOrdenProduListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstadoOrdenProdu();
				this.cargarCombosFrameEstadoOrdenProdusForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstadoOrdenProdu(this.estadoordenprodusForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoPedidoProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
			
			if(jTableDatosPedidoProdu.getRowCount()>=1) {
				jTableDatosPedidoProdu.removeRowSelectionInterval(0, jTableDatosPedidoProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoPedidoProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoPedidoProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesPedidoProdu(true);			
			//this.pedidoprodu=new PedidoProdu();
			//this.pedidoprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidoProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidoProdu() ;
			
			if(PedidoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidoProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.pedidoprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);				
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
			if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar PedidoProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarPedidoProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosPedidoProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosPedidoProdu.getSelectedRows().length;			
			}
			
			pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoPedidoProdu--;			
				//PedidoProdu pedidoproduAux= new PedidoProdu();			
				//pedidoproduAux.setId(this.iIdNuevoPedidoProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//PedidoProdu pedidoproduOrigen=new PedidoProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(PedidoProdu pedidoproduOrigen : pedidoprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							pedidoproduOrigen =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							pedidoproduOrigen =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaPedidoProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.pedidoprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosPedidoProdu(pedidoproduOrigen,this.pedidoprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pedidoproduLogic.getPedidoProdus().add(this.pedidoproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pedidoprodus.add(this.pedidoproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaPedidoProdu(false);
				
				this.jTableDatosPedidoProdu.setRowSelectionInterval(this.getIndiceNuevoPedidoProdu(), this.getIndiceNuevoPedidoProdu());
				
				int iLastRow =  this.jTableDatosPedidoProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPedidoProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPedidoProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidoProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();									
		
			PedidoProdu pedidoproduOrigen=new PedidoProdu();
			PedidoProdu pedidoproduDestino=new PedidoProdu();
				
			pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosPedidoProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || pedidoprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosPedidoProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduOrigen =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pedidoproduOrigen =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						pedidoproduDestino =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						pedidoproduDestino =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				pedidoproduOrigen =pedidoprodusSeleccionados.get(0);
				pedidoproduDestino =pedidoprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosPedidoProdu(pedidoproduOrigen,pedidoproduDestino,true,false);
				
				pedidoproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(pedidoproduDestino,pedidoproduLogic.getPedidoProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(pedidoproduDestino,pedidoprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaPedidoProdu(false);
				
				//this.jTableDatosPedidoProdu.setRowSelectionInterval(this.getIndiceNuevoPedidoProdu(), this.getIndiceNuevoPedidoProdu());
				
				int iLastRow =  this.jTableDatosPedidoProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosPedidoProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosPedidoProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidoProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormPedidoProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesPedidoProdu.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasPedidoProdu.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesPedidoProdu.setVisible(!isVisible);
			this.jPanelPaginacionPedidoProdu.setVisible(!isVisible);
			this.jPanelAccionesPedidoProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFramePedidoProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoPedidoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionPedidoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByPedidoProdu();
			
			this.abrirFrameOrderByPedidoProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByPedidoProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetallePedidoProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormPedidoProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormPedidoProdu.isMaximum()) {
					this.jInternalFrameDetalleFormPedidoProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormPedidoProdu.setSize(this.jInternalFrameDetalleFormPedidoProdu.iWidthFormulario,this.jInternalFrameDetalleFormPedidoProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormPedidoProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormPedidoProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormPedidoProdu.isMaximum()) {
						this.jInternalFrameDetalleFormPedidoProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormPedidoProdu.jContentPaneDetallePedidoProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormPedidoProdu.jContentPaneDetallePedidoProdu.getWidth(),PedidoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormPedidoProdu.jContentPaneDetallePedidoProdu.getWidth(),PedidoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormPedidoProdu.jContentPaneDetallePedidoProdu.getWidth(),PedidoProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoDetaProdu();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormPedidoProdu.setVisible(true);
	        this.jInternalFrameDetalleFormPedidoProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByPedidoProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByPedidoProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByPedidoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoProdu,false,this);
				} else {
					this.jInternalFrameOrderByPedidoProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByPedidoProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByPedidoProdu);
				this.jInternalFrameOrderByPedidoProdu.setVisible(false);
				this.jInternalFrameOrderByPedidoProdu.setSelected(false);
				
				this.jInternalFrameOrderByPedidoProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPedidoProdu"));
				
				this.inicializarActualizarBindingTablaOrderByPedidoProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionPedidoProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionPedidoProdu==null) {
				
				this.jInternalFrameImportacionPedidoProdu=new ImportacionJInternalFrame(PedidoProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionPedidoProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionPedidoProdu);
				this.jInternalFrameImportacionPedidoProdu.setVisible(false);
				this.jInternalFrameImportacionPedidoProdu.setSelected(false);


				this.jInternalFrameImportacionPedidoProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPedidoProdu"));
				this.jInternalFrameImportacionPedidoProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPedidoProdu"));
				this.jInternalFrameImportacionPedidoProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPedidoProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoPedidoProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoPedidoProdu==null) {
				this.jInternalFrameReporteDinamicoPedidoProdu=new ReporteDinamicoJInternalFrame(PedidoProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoPedidoProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoPedidoProdu);
				this.jInternalFrameReporteDinamicoPedidoProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoPedidoProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoPedidoProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidoProdu"));
				this.jInternalFrameReporteDinamicoPedidoProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidoProdu"));
				this.jInternalFrameReporteDinamicoPedidoProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidoProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidoProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPedidoDetaProdu() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormPedidoProdu.jContentPaneDetallePedidoProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetallePedidoProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormPedidoProdu);
			
	       	this.jInternalFrameDetalleFormPedidoProdu.setVisible(false);
	        this.jInternalFrameDetalleFormPedidoProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormPedidoProdu.dispose();
			//this.jInternalFrameDetalleFormPedidoProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoPedidoProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoPedidoProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoPedidoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionPedidoProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionPedidoProdu.setVisible(true);
	        this.jInternalFrameImportacionPedidoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByPedidoProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByPedidoProdu.setVisible(true);
	        this.jInternalFrameOrderByPedidoProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByPedidoProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByPedidoProdu.setVisible(false);
	        this.jInternalFrameOrderByPedidoProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoPedidoProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoPedidoProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoPedidoProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionPedidoProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionPedidoProdu.setVisible(false);
	        this.jInternalFrameImportacionPedidoProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarPedidoProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarPedidoProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesPedidoProdu(true);
			//this.isEsNuevoPedidoProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesPedidoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidoProdu(false) ;
			
			if(pedidoproduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.getEsGuardarRelacionado() && PedidoDetaProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoDetaProduActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(PedidoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidoProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidoProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaPedidoProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarPedidoProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesPedidoProdu(true);
			//this.isEsNuevoPedidoProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.pedidoprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesPedidoProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesPedidoProdu(false) ;
			
			if(PedidoProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetallePedidoProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidoProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.pedidoproduConstantesFunciones.cargarid_clientePedidoProdu) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingPedidoProdu(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
					
	
	public void recargarComboTablaFormato(List<Formato> formatosForeignKey)throws Exception{
		TableColumn tableColumnFormato=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDFORMATO));
		TableCellEditor tableCellEditorFormato =tableColumnFormato.getCellEditor();

		FormatoTableCell formatoTableCellFk=(FormatoTableCell)tableCellEditorFormato;

		if(formatoTableCellFk!=null) {
			formatoTableCellFk.setformatosForeignKey(formatosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//formatoTableCellFk.setRowActual(intSelectedRow);
			//formatoTableCellFk.setformatosForeignKeyActual(formatosForeignKey);
		//}


		if(formatoTableCellFk!=null) {
			formatoTableCellFk.RecargarFormatosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoPrioridadEmpresaProdu(List<TipoPrioridadEmpresaProdu> tipoprioridadempresaprodusForeignKey)throws Exception{
		TableColumn tableColumnTipoPrioridadEmpresaProdu=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU));
		TableCellEditor tableCellEditorTipoPrioridadEmpresaProdu =tableColumnTipoPrioridadEmpresaProdu.getCellEditor();

		TipoPrioridadEmpresaProduTableCell tipoprioridadempresaproduTableCellFk=(TipoPrioridadEmpresaProduTableCell)tableCellEditorTipoPrioridadEmpresaProdu;

		if(tipoprioridadempresaproduTableCellFk!=null) {
			tipoprioridadempresaproduTableCellFk.settipoprioridadempresaprodusForeignKey(tipoprioridadempresaprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoprioridadempresaproduTableCellFk.setRowActual(intSelectedRow);
			//tipoprioridadempresaproduTableCellFk.settipoprioridadempresaprodusForeignKeyActual(tipoprioridadempresaprodusForeignKey);
		//}


		if(tipoprioridadempresaproduTableCellFk!=null) {
			tipoprioridadempresaproduTableCellFk.RecargarTipoPrioridadEmpresaProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleadoResponsable(List<Empleado> empleadoresponsablesForeignKey)throws Exception{
		TableColumn tableColumnEmpleadoResponsable=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE));
		TableCellEditor tableCellEditorEmpleadoResponsable =tableColumnEmpleadoResponsable.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleadoResponsable;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadoresponsablesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadoresponsablesForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstadoOrdenProdu(List<EstadoOrdenProdu> estadoordenprodusForeignKey)throws Exception{
		TableColumn tableColumnEstadoOrdenProdu=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU));
		TableCellEditor tableCellEditorEstadoOrdenProdu =tableColumnEstadoOrdenProdu.getCellEditor();

		EstadoOrdenProduTableCell estadoordenproduTableCellFk=(EstadoOrdenProduTableCell)tableCellEditorEstadoOrdenProdu;

		if(estadoordenproduTableCellFk!=null) {
			estadoordenproduTableCellFk.setestadoordenprodusForeignKey(estadoordenprodusForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosPedidoProdu.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estadoordenproduTableCellFk.setRowActual(intSelectedRow);
			//estadoordenproduTableCellFk.setestadoordenprodusForeignKeyActual(estadoordenprodusForeignKey);
		//}


		if(estadoordenproduTableCellFk!=null) {
			estadoordenproduTableCellFk.RecargarEstadoOrdenProdusForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesPedidoProdu(false);
			
			//if(!this.isEsNuevoPedidoProdu) {								
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				
			}
			
			if(this.permiteMantenimiento(this.pedidoprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoPedidoProdu=true;
					this.inicializarActualizarBindingTablaPedidoProdu(false);
					this.isEsNuevoPedidoProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoPedidoProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoPedidoProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPedidoProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidoProdu(false);
				
				this.habilitarDeshabilitarControlesPedidoProdu(false);
			
												
				
				if(PedidoProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetallePedidoProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoPedidoProduActionPerformed(evt,pedidoproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualPedidoProdu(this.pedidoprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,pedidoproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.pedidoprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarPedidoProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				this.pedidoprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				this.pedidoprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.pedidoprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((PedidoProduModel) this.jTableDatosPedidoProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoPedidoProdu=true;
				this.inicializarActualizarBindingTablaPedidoProdu(false);
				this.isEsNuevoPedidoProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesPedidoProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidoProdu(false);
				
				this.habilitarDeshabilitarControlesPedidoProdu(false);
				
				
				
				if(PedidoProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetallePedidoProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarPedidoProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosPedidoProdu.getRowCount()>=1) {
				jTableDatosPedidoProdu.removeRowSelectionInterval(0, jTableDatosPedidoProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesPedidoProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaPedidoProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesPedidoProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualPedidoProdu(false) ;
			
			this.isEsNuevoPedidoProdu=false;
			
			if(PedidoProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetallePedidoProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosPedidoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingPedidoProdu(false);
				
				//SI ES MANUAL
				if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualPedidoProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosPedidoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoPedidoProdu--;			
			//PedidoProdu pedidoproduAux= new PedidoProdu();			
			//pedidoproduAux.setId(this.iIdNuevoPedidoProdu);
			
			if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaPedidoProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
			
			this.pedidoprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.pedidoproduLogic.getPedidoProdus().add(this.pedidoproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.pedidoprodus.add(this.pedidoproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaPedidoProdu(false);
			
			this.jTableDatosPedidoProdu.setRowSelectionInterval(this.getIndiceNuevoPedidoProdu(), this.getIndiceNuevoPedidoProdu());
			
			int iLastRow =  this.jTableDatosPedidoProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosPedidoProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosPedidoProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaPedidoProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionPedidoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingPedidoProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidoProdu(false);
			
			//SI ES MANUAL
			if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidoProdu();
			}
			
			//this.abrirFrameTreePedidoProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionPedidoProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Pedido ProduccionES ?", "MANTENIMIENTO DE Pedido Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionPedidoProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralPedidoProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.pedidoproduReturnGeneral=pedidoproduLogic.procesarImportacionPedidoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.pedidoproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarPedidoProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionPedidoProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionPedidoProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionPedidoProdu.setFileImportacion(this.jInternalFrameImportacionPedidoProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionPedidoProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionPedidoProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionPedidoProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionPedidoProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoPedidoProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		

		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("PedidoProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"PedidoProduBaseDesign.jrxml";
			
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
			
			this.generarReportePedidoProdus("Todos",pedidoprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PedidoProduConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_IDFORMATO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Formato_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Formato_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Formato_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Formato_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoPrioridadEmpresaProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoPrioridadEmpresaProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoPrioridadEmpresaProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoPrioridadEmpresaProdu_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EmpleadoResponsable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EmpleadoResponsable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EmpleadoResponsable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EmpleadoResponsable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccionCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccionCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccionCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccionCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefonoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefonoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefonoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefonoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_RUCCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_LOTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_te_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_te_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_te_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_te_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaPedido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaPedido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaPedido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaPedido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAENTREGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_UsoInterno_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_UsoInterno_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_UsoInterno_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_UsoInterno_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_EstadoOrdenProdu_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_EstadoOrdenProdu_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_EstadoOrdenProdu_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_EstadoOrdenProdu_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoPedidoProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case PedidoProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoria="id_formato";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					sNombreCampoCategoria="id_tipo_prioridad_empresa_produ";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					sNombreCampoCategoria="id_empleado_responsable";
					break;

				case PedidoProduConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					sNombreCampoCategoria="direccion_cliente";
					break;

				case PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					sNombreCampoCategoria="telefono_cliente";
					break;

				case PedidoProduConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoria="ruc_cliente";
					break;

				case PedidoProduConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoria="lote";
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO:
					sNombreCampoCategoria="fecha_pedido";
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoria="fecha_entrega";
					break;

				case PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO:
					sNombreCampoCategoria="es_uso_interno";
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case PedidoProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					sNombreCampoCategoria="id_estado_orden_produ";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case PedidoProduConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDFORMATO:
					sNombreCampoCategoriaValor="id_formato";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					sNombreCampoCategoriaValor="id_tipo_prioridad_empresa_produ";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					sNombreCampoCategoriaValor="id_empleado_responsable";
					break;

				case PedidoProduConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					sNombreCampoCategoriaValor="direccion_cliente";
					break;

				case PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					sNombreCampoCategoriaValor="telefono_cliente";
					break;

				case PedidoProduConstantesFunciones.LABEL_RUCCLIENTE:
					sNombreCampoCategoriaValor="ruc_cliente";
					break;

				case PedidoProduConstantesFunciones.LABEL_LOTE:
					sNombreCampoCategoriaValor="lote";
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO:
					sNombreCampoCategoriaValor="fecha_pedido";
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoriaValor="fecha_entrega";
					break;

				case PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO:
					sNombreCampoCategoriaValor="es_uso_interno";
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case PedidoProduConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					sNombreCampoCategoriaValor="id_estado_orden_produ";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case PedidoProduConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case PedidoProduConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case PedidoProduConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case PedidoProduConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case PedidoProduConstantesFunciones.LABEL_IDFORMATO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Formato",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_formato");
					break;

				case PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Priorad Empresa Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_prioridad_empresa_produ");
					break;

				case PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado Responsable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado_responsable");
					break;

				case PedidoProduConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case PedidoProduConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion_cliente");
					break;

				case PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono_cliente");
					break;

				case PedidoProduConstantesFunciones.LABEL_RUCCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc_cliente");
					break;

				case PedidoProduConstantesFunciones.LABEL_LOTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Lote",sNombreCampoCategoria,sNombreCampoCategoriaValor,"lote");
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Pedo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_pedido");
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrega");
					break;

				case PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Uso Interno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_uso_interno");
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case PedidoProduConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado Orden Produ",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estado_orden_produ");
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
	
	public void jButtonGenerarExcelReporteDinamicoPedidoProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("PedidoProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case PedidoProduConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_IDFORMATO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDFORMATO);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getformato_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.gettipoprioridadempresaprodu_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getempleadoresponsable_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getdireccion_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.gettelefono_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_RUCCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_RUCCLIENTE);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getruc_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_LOTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_LOTE);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getlote());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getfecha_pedido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHAENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHAENTREGA);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getfecha_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getes_uso_interno());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU);
					iRow++;

					for(PedidoProdu pedidoprodu:pedidoprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(pedidoprodu.getestadoordenprodu_descripcion());
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
			//	this.getFilaCabeceraExportarExcelPedidoProdu(row);				
			//	iRow++;
			//}				
			
			//for(PedidoProdu pedidoproduAux:pedidoprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelPedidoProdu(pedidoproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidoProdu(false);
			
			//SI ES MANUAL
			if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualPedidoProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresPedidoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidoProdu(false);
			
			//SI ES MANUAL
			if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPedidoProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesPedidoProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingPedidoProdu(false);
			
			//SI ES MANUAL
			if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualPedidoProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaPedidoProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosPedidoProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosPedidoProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosPedidoProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosPedidoProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosPedidoProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosPedidoProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosPedidoProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingPedidoProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingPedidoProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingPedidoProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaPedidoProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesPedidoProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasPedidoProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidoProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesPedidoProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!PedidoProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualPedidoProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaPedidoProdu();
		
		this.inicializarActualizarBindingBotonesManualPedidoProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualPedidoProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesPedidoProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualPedidoProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualPedidoProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosPedidoProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosPedidoProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReportePedidoProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxPostAccionNuevoPedidoProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxPostAccionSinCerrarPedidoProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxPostAccionSinMensajePedidoProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosPedidoProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosPedidoProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReportePedidoProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
				this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxPostAccionNuevoPedidoProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxPostAccionSinCerrarPedidoProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxPostAccionSinMensajePedidoProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionPedidoProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionPedidoProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesPedidoProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesPedidoProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesPedidoProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarPedidoProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesPedidoProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesPedidoProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralPedidoProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPedidoProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualPedidoProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesPedidoProdu() throws Exception {
		try	{
			if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualPedidoProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePedidoProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualPedidoProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesPedidoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesPedidoProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesPedidoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesPedidoProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesPedidoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesPedidoProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionPedidoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionPedidoProdu.addItem(reporte);
			}
			
			
			if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionPedidoProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionPedidoProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesPedidoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesPedidoProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesPedidoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesPedidoProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarPedidoProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarPedidoProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarPedidoProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidoProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualPedidoProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
				this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
				this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoPedidoProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidoProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoPedidoProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoPedidoProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoPedidoProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualPedidoProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClientePedidoProdu.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClientePedidoProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.getSelectedItem()!=null){this.id_empleado_responsableFK_IdEmpleadoResponsable=((Empleado)this.jComboBoxid_empleado_responsableFK_IdEmpleadoResponsablePedidoProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.getSelectedItem()!=null){this.id_estado_orden_produFK_IdEstadoOrdenProdu=((EstadoOrdenProdu)this.jComboBoxid_estado_orden_produFK_IdEstadoOrdenProduPedidoProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_formatoFK_IdFormatoPedidoProdu.getSelectedItem()!=null){this.id_formatoFK_IdFormato=((Formato)this.jComboBoxid_formatoFK_IdFormatoPedidoProdu.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.getSelectedItem()!=null){this.id_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu=((TipoPrioridadEmpresaProdu)this.jComboBoxid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProduPedidoProdu.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasPedidoProdu(Boolean esInicializar) throws Exception {				
		if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualPedidoProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaPedidoProdu() throws Exception {
		this.inicializarActualizarBindingTablaPedidoProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByPedidoProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosPedidoProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaPedidoProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=pedidoproduLogic.getPedidoProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=pedidoprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosPedidoProdu.setModel(new PedidoProduModel(this.pedidoproduLogic.getPedidoProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosPedidoProdu.setModel(new PedidoProduModel(this.pedidoprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByPedidoProdu!=null && this.jInternalFrameOrderByPedidoProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByPedidoProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+PedidoProduConstantesFunciones.SCLASSWEBTITULO,pedidoproduConstantesFunciones.resaltarSeleccionarPedidoProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+PedidoProduConstantesFunciones.SCLASSWEBTITULO,pedidoproduConstantesFunciones.resaltarSeleccionarPedidoProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_ID));

		if(this.pedidoproduConstantesFunciones.mostraridPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.pedidoproduConstantesFunciones.resaltaridPedidoProdu,this.pedidoproduConstantesFunciones.activaridPedidoProdu,this,true,"idPedidoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoproduConstantesFunciones.resaltaridPedidoProdu,this.pedidoproduConstantesFunciones.activaridPedidoProdu,this,true,"idPedidoProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDEMPRESA));

		if(this.pedidoproduConstantesFunciones.mostrarid_empresaPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.pedidoproduConstantesFunciones.resaltarid_empresaPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_empresaPedidoProdu));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.pedidoproduConstantesFunciones.resaltarid_empresaPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_empresaPedidoProdu,false,"id_empresaPedidoProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.pedidoproduConstantesFunciones.mostrarid_sucursalPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.pedidoproduConstantesFunciones.resaltarid_sucursalPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_sucursalPedidoProdu));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.pedidoproduConstantesFunciones.resaltarid_sucursalPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_sucursalPedidoProdu,false,"id_sucursalPedidoProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.pedidoproduConstantesFunciones.mostrarid_ejercicioPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.pedidoproduConstantesFunciones.resaltarid_ejercicioPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_ejercicioPedidoProdu));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.pedidoproduConstantesFunciones.resaltarid_ejercicioPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_ejercicioPedidoProdu,false,"id_ejercicioPedidoProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDPERIODO));

		if(this.pedidoproduConstantesFunciones.mostrarid_periodoPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.pedidoproduConstantesFunciones.resaltarid_periodoPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_periodoPedidoProdu));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.pedidoproduConstantesFunciones.resaltarid_periodoPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_periodoPedidoProdu,false,"id_periodoPedidoProdu","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDFORMATO));

		if(this.pedidoproduConstantesFunciones.mostrarid_formatoPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDFORMATO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FormatoTableCell(this.formatosForeignKey,this.pedidoproduConstantesFunciones.resaltarid_formatoPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_formatoPedidoProdu));
			tableColumn.setCellEditor(new FormatoTableCell(this.formatosForeignKey,this.pedidoproduConstantesFunciones.resaltarid_formatoPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_formatoPedidoProdu,true,"id_formatoPedidoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU));

		if(this.pedidoproduConstantesFunciones.mostrarid_tipo_prioridad_empresa_produPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoPrioridadEmpresaProduTableCell(this.tipoprioridadempresaprodusForeignKey,this.pedidoproduConstantesFunciones.resaltarid_tipo_prioridad_empresa_produPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_tipo_prioridad_empresa_produPedidoProdu));
			tableColumn.setCellEditor(new TipoPrioridadEmpresaProduTableCell(this.tipoprioridadempresaprodusForeignKey,this.pedidoproduConstantesFunciones.resaltarid_tipo_prioridad_empresa_produPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_tipo_prioridad_empresa_produPedidoProdu,true,"id_tipo_prioridad_empresa_produPedidoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE));

		if(this.pedidoproduConstantesFunciones.mostrarid_empleado_responsablePedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadoresponsablesForeignKey,this.pedidoproduConstantesFunciones.resaltarid_empleado_responsablePedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_empleado_responsablePedidoProdu));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadoresponsablesForeignKey,this.pedidoproduConstantesFunciones.resaltarid_empleado_responsablePedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_empleado_responsablePedidoProdu,true,"id_empleado_responsablePedidoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_SECUENCIAL));

		if(this.pedidoproduConstantesFunciones.mostrarsecuencialPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoproduConstantesFunciones.resaltarsecuencialPedidoProdu,this.pedidoproduConstantesFunciones.activarsecuencialPedidoProdu,this,true,"secuencialPedidoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoproduConstantesFunciones.resaltarsecuencialPedidoProdu,this.pedidoproduConstantesFunciones.activarsecuencialPedidoProdu,this,true,"secuencialPedidoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDCLIENTE));

		if(this.pedidoproduConstantesFunciones.mostrarid_clientePedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.pedidoproduConstantesFunciones.resaltarid_clientePedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_clientePedidoProdu));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.pedidoproduConstantesFunciones.resaltarid_clientePedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_clientePedidoProdu,true,"id_clientePedidoProdu","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE));

		if(this.pedidoproduConstantesFunciones.mostrardireccion_clientePedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoproduConstantesFunciones.resaltardireccion_clientePedidoProdu,this.pedidoproduConstantesFunciones.activardireccion_clientePedidoProdu,this,true,"direccion_clientePedidoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoproduConstantesFunciones.resaltardireccion_clientePedidoProdu,this.pedidoproduConstantesFunciones.activardireccion_clientePedidoProdu,this,true,"direccion_clientePedidoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE));

		if(this.pedidoproduConstantesFunciones.mostrartelefono_clientePedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoproduConstantesFunciones.resaltartelefono_clientePedidoProdu,this.pedidoproduConstantesFunciones.activartelefono_clientePedidoProdu,this,true,"telefono_clientePedidoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoproduConstantesFunciones.resaltartelefono_clientePedidoProdu,this.pedidoproduConstantesFunciones.activartelefono_clientePedidoProdu,this,true,"telefono_clientePedidoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_RUCCLIENTE));

		if(this.pedidoproduConstantesFunciones.mostrarruc_clientePedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_RUCCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoproduConstantesFunciones.resaltarruc_clientePedidoProdu,this.pedidoproduConstantesFunciones.activarruc_clientePedidoProdu,this,true,"ruc_clientePedidoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoproduConstantesFunciones.resaltarruc_clientePedidoProdu,this.pedidoproduConstantesFunciones.activarruc_clientePedidoProdu,this,true,"ruc_clientePedidoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_LOTE));

		if(this.pedidoproduConstantesFunciones.mostrarlotePedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_LOTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoproduConstantesFunciones.resaltarlotePedidoProdu,this.pedidoproduConstantesFunciones.activarlotePedidoProdu,this,true,"lotePedidoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoproduConstantesFunciones.resaltarlotePedidoProdu,this.pedidoproduConstantesFunciones.activarlotePedidoProdu,this,true,"lotePedidoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO));

		if(this.pedidoproduConstantesFunciones.mostrarfecha_pedidoPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pedidoproduConstantesFunciones.resaltarfecha_pedidoPedidoProdu,this.pedidoproduConstantesFunciones.activarfecha_pedidoPedidoProdu,this,true,"fecha_pedidoPedidoProdu","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pedidoproduConstantesFunciones.resaltarfecha_pedidoPedidoProdu,this.pedidoproduConstantesFunciones.activarfecha_pedidoPedidoProdu,this,true,"fecha_pedidoPedidoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_FECHAENTREGA));

		if(this.pedidoproduConstantesFunciones.mostrarfecha_entregaPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_FECHAENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pedidoproduConstantesFunciones.resaltarfecha_entregaPedidoProdu,this.pedidoproduConstantesFunciones.activarfecha_entregaPedidoProdu,this,true,"fecha_entregaPedidoProdu","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pedidoproduConstantesFunciones.resaltarfecha_entregaPedidoProdu,this.pedidoproduConstantesFunciones.activarfecha_entregaPedidoProdu,this,true,"fecha_entregaPedidoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO));

		if(this.pedidoproduConstantesFunciones.mostrares_uso_internoPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.pedidoproduConstantesFunciones.resaltares_uso_internoPedidoProdu,this.pedidoproduConstantesFunciones.activares_uso_internoPedidoProdu));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.pedidoproduConstantesFunciones.resaltares_uso_internoPedidoProdu,this.pedidoproduConstantesFunciones.activares_uso_internoPedidoProdu,this,true,"es_uso_internoPedidoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_FECHA));

		if(this.pedidoproduConstantesFunciones.mostrarfechaPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.pedidoproduConstantesFunciones.resaltarfechaPedidoProdu,this.pedidoproduConstantesFunciones.activarfechaPedidoProdu,this,true,"fechaPedidoProdu","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.pedidoproduConstantesFunciones.resaltarfechaPedidoProdu,this.pedidoproduConstantesFunciones.activarfechaPedidoProdu,this,true,"fechaPedidoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_DESCRIPCION));

		if(this.pedidoproduConstantesFunciones.mostrardescripcionPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.pedidoproduConstantesFunciones.resaltardescripcionPedidoProdu,this.pedidoproduConstantesFunciones.activardescripcionPedidoProdu,this,true,"descripcionPedidoProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.pedidoproduConstantesFunciones.resaltardescripcionPedidoProdu,this.pedidoproduConstantesFunciones.activardescripcionPedidoProdu,this,true,"descripcionPedidoProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU));

		if(this.pedidoproduConstantesFunciones.mostrarid_estado_orden_produPedidoProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstadoOrdenProduTableCell(this.estadoordenprodusForeignKey,this.pedidoproduConstantesFunciones.resaltarid_estado_orden_produPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_estado_orden_produPedidoProdu));
			tableColumn.setCellEditor(new EstadoOrdenProduTableCell(this.estadoordenprodusForeignKey,this.pedidoproduConstantesFunciones.resaltarid_estado_orden_produPedidoProdu,this,this.pedidoproduConstantesFunciones.activarid_estado_orden_produPedidoProdu,true,"id_estado_orden_produPedidoProdu","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new PedidoProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPedidoDetaProdu && this.pedidoproduConstantesFunciones.mostrarPedidoDetaProduPedidoProdu && !PedidoProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Detalle Producciones");
				tableColumn.setHeaderValue("Pedido Detalle Producciones");
				tableColumn.setCellRenderer(new PedidoDetaProduTableCell(pedidoproduConstantesFunciones.resaltarPedidoDetaProduPedidoProdu,this,this.pedidoproduConstantesFunciones.activarPedidoDetaProduPedidoProdu));
				tableColumn.setCellEditor(new PedidoDetaProduTableCell(pedidoproduConstantesFunciones.resaltarPedidoDetaProduPedidoProdu,this,this.pedidoproduConstantesFunciones.activarPedidoDetaProduPedidoProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosPedidoProdu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pedidoproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pedidoproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPedidoProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.pedidoproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.pedidoproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosPedidoProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.pedidoproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.pedidoproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosPedidoProdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.pedidoproduSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosPedidoProdu.addColumn(tableColumn);
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
			
			this.jTableDatosPedidoProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.pedidoproduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosPedidoProdu.moveColumn(this.jTableDatosPedidoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosPedidoProdu.moveColumn(this.jTableDatosPedidoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.pedidoproduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosPedidoProdu.moveColumn(this.jTableDatosPedidoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosPedidoProdu.moveColumn(this.jTableDatosPedidoProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosPedidoProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosPedidoProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosPedidoProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosPedidoProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosPedidoProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosPedidoProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosPedidoProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosPedidoProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=pedidoproduLogic.getPedidoProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=pedidoprodus.size()-1;
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
		//this.jTableDatosPedidoProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosPedidoProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosPedidoProdu();
			
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
				
				//this.isEsNuevoPedidoProdu=false;
					
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
				if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormPedidoProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPedidoProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPedidoProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.pedidoprodu.getsType().equals("DUPLICADO")
				   || this.pedidoprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoPedidoProdu=true;
				
				} else {
					this.isEsNuevoPedidoProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
					if(this.pedidoprodu.getId()>=0 && !this.pedidoprodu.getIsNew()) {						
						this.isEsNuevoPedidoProdu=false;
						
					} else {
						this.isEsNuevoPedidoProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoPedidoProdu(esRelaciones);						
				
				this.seleccionarPedidoProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.pedidoprodu.getId()<0) {
					this.isEsNuevoPedidoProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarPedidoProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarPedidoProdu(evt,rowIndex);
				}	
				
				if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion PedidoProdu: " + this.dDif); 
					}
				}								
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarPedidoProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.pedidoprodu)) {
					if(this.pedidoprodu.getId()>0) {
						this.pedidoprodu.setIsDeleted(true);
						
						this.pedidoprodusEliminados.add(this.pedidoprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.pedidoproduLogic.getPedidoProdus().remove(this.pedidoprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.pedidoprodus.remove(this.pedidoprodu);				
					}
					
					
					((PedidoProduModel) this.jTableDatosPedidoProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaPedidoProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarPedidoProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoPedidoProdu) {
			
			if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosPedidoProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosPedidoProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioPedidoProdu(this.pedidoprodu);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.pedidoproduConstantesFunciones.cargarid_empresaPedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_empresaPedidoProdu) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.pedidoprodu.getid_empresa());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(pedidoprodu.getEmpresa()!=null) {
							this.empresasForeignKey.add(pedidoprodu.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.pedidoprodu.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.pedidoproduConstantesFunciones.cargarid_sucursalPedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_sucursalPedidoProdu) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.pedidoprodu.getid_sucursal());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(pedidoprodu.getSucursal()!=null) {
							this.sucursalsForeignKey.add(pedidoprodu.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.pedidoprodu.getid_sucursal(),false,"Formulario");

					//Ejercicio
					if(!this.pedidoproduConstantesFunciones.cargarid_ejercicioPedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_ejercicioPedidoProdu) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.pedidoprodu.getid_ejercicio());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(pedidoprodu.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(pedidoprodu.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.pedidoprodu.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.pedidoproduConstantesFunciones.cargarid_periodoPedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_periodoPedidoProdu) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.pedidoprodu.getid_periodo());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(pedidoprodu.getPeriodo()!=null) {
							this.periodosForeignKey.add(pedidoprodu.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.pedidoprodu.getid_periodo(),false,"Formulario");

					//Formato
					if(!this.pedidoproduConstantesFunciones.cargarid_formatoPedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_formatoPedidoProdu) {
						//this.cargarCombosFormatosForeignKeyLista(" where id="+this.pedidoprodu.getid_formato());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.formatosForeignKey=new ArrayList<Formato>();

						if(pedidoprodu.getFormato()!=null) {
							this.formatosForeignKey.add(pedidoprodu.getFormato());
						}

						this.addItemDefectoCombosForeignKeyFormato();
						this.cargarCombosFrameFormatosForeignKey("Todos");
					}
					this.setActualFormatoForeignKey(this.pedidoprodu.getid_formato(),false,"Formulario");

					//TipoPrioridadEmpresaProdu
					if(!this.pedidoproduConstantesFunciones.cargarid_tipo_prioridad_empresa_produPedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_tipo_prioridad_empresa_produPedidoProdu) {
						//this.cargarCombosTipoPrioridadEmpresaProdusForeignKeyLista(" where id="+this.pedidoprodu.getid_tipo_prioridad_empresa_produ());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.tipoprioridadempresaprodusForeignKey=new ArrayList<TipoPrioridadEmpresaProdu>();

						if(pedidoprodu.getTipoPrioridadEmpresaProdu()!=null) {
							this.tipoprioridadempresaprodusForeignKey.add(pedidoprodu.getTipoPrioridadEmpresaProdu());
						}

						this.addItemDefectoCombosForeignKeyTipoPrioridadEmpresaProdu();
						this.cargarCombosFrameTipoPrioridadEmpresaProdusForeignKey("Todos");
					}
					this.setActualTipoPrioridadEmpresaProduForeignKey(this.pedidoprodu.getid_tipo_prioridad_empresa_produ(),false,"Formulario");

					//EmpleadoResponsable
					if(!this.pedidoproduConstantesFunciones.cargarid_empleado_responsablePedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_empleado_responsablePedidoProdu) {
						//this.cargarCombosEmpleadoResponsablesForeignKeyLista(" where id="+this.pedidoprodu.getid_empleado_responsable());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.empleadoresponsablesForeignKey=new ArrayList<Empleado>();

						if(pedidoprodu.getEmpleadoResponsable()!=null) {
							this.empleadoresponsablesForeignKey.add(pedidoprodu.getEmpleadoResponsable());
						}

						this.addItemDefectoCombosForeignKeyEmpleadoResponsable();
						this.cargarCombosFrameEmpleadoResponsablesForeignKey("Todos");
					}
					this.setActualEmpleadoResponsableForeignKey(this.pedidoprodu.getid_empleado_responsable(),false,"Formulario");

					//Cliente
					if(!this.pedidoproduConstantesFunciones.cargarid_clientePedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_clientePedidoProdu) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.pedidoprodu.getid_cliente());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(pedidoprodu.getCliente()!=null) {
							this.clientesForeignKey.add(pedidoprodu.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.pedidoprodu.getid_cliente(),false,"Formulario");

					//EstadoOrdenProdu
					if(!this.pedidoproduConstantesFunciones.cargarid_estado_orden_produPedidoProdu || this.pedidoproduConstantesFunciones.event_dependid_estado_orden_produPedidoProdu) {
						//this.cargarCombosEstadoOrdenProdusForeignKeyLista(" where id="+this.pedidoprodu.getid_estado_orden_produ());
									//this.inicializarActualizarBindingPedidoProdu(false,false);
						this.estadoordenprodusForeignKey=new ArrayList<EstadoOrdenProdu>();

						if(pedidoprodu.getEstadoOrdenProdu()!=null) {
							this.estadoordenprodusForeignKey.add(pedidoprodu.getEstadoOrdenProdu());
						}

						this.addItemDefectoCombosForeignKeyEstadoOrdenProdu();
						this.cargarCombosFrameEstadoOrdenProdusForeignKey("Todos");
					}
					this.setActualEstadoOrdenProduForeignKey(this.pedidoprodu.getid_estado_orden_produ(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesPedidoProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesPedidoProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualPedidoProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoPedidoProdu(PedidoProdu pedidoprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoPedidoProdu(pedidoprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoPedidoProdu(PedidoProdu pedidoprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioPedidoProdu(pedidoprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyPedidoProdu(pedidoprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyPedidoProdu(pedidoprodu);
	}
	
	public void setVariablesObjetoActualToFormularioPedidoProdu(PedidoProdu pedidoprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.setText(pedidoprodu.getId().toString());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldsecuencialPedidoProdu.setText(pedidoprodu.getsecuencial());
			this.jInternalFrameDetalleFormPedidoProdu.jTextAreadireccion_clientePedidoProdu.setText(pedidoprodu.getdireccion_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldtelefono_clientePedidoProdu.setText(pedidoprodu.gettelefono_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldruc_clientePedidoProdu.setText(pedidoprodu.getruc_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldlotePedidoProdu.setText(pedidoprodu.getlote());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_pedidoPedidoProdu.setDate(pedidoprodu.getfecha_pedido());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_entregaPedidoProdu.setDate(pedidoprodu.getfecha_entrega());
			this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.setSelected(pedidoprodu.getes_uso_interno());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfechaPedidoProdu.setDate(pedidoprodu.getfecha());
			this.jInternalFrameDetalleFormPedidoProdu.jTextAreadescripcionPedidoProdu.setText(pedidoprodu.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,PedidoProdu pedidoproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,pedidoproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,PedidoProdu pedidoproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				pedidoproduLocal=this.pedidoprodu;
			} else {
				pedidoproduLocal=this.pedidoproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(pedidoproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoPedidoProdu(pedidoproduLocal,true);
					
					if(pedidoproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(pedidoproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(pedidoproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoPedidoProdu(PedidoProdu pedidoprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPedidoProdu(pedidoprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(pedidoprodu);
	}
	
	public void setVariablesFormularioToObjetoActualPedidoProdu(PedidoProdu pedidoprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualPedidoProdu(pedidoprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualPedidoProdu(PedidoProdu pedidoprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.getText()==null || this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.getText()=="" || this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.setText("0");
			}

			if(conColumnasBase) {pedidoprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelIdPedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setsecuencial(this.jInternalFrameDetalleFormPedidoProdu.jTextFieldsecuencialPedidoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelsecuencialPedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setdireccion_cliente(this.jInternalFrameDetalleFormPedidoProdu.jTextAreadireccion_clientePedidoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabeldireccion_clientePedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.settelefono_cliente(this.jInternalFrameDetalleFormPedidoProdu.jTextFieldtelefono_clientePedidoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabeltelefono_clientePedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setruc_cliente(this.jInternalFrameDetalleFormPedidoProdu.jTextFieldruc_clientePedidoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_RUCCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelruc_clientePedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setlote(this.jInternalFrameDetalleFormPedidoProdu.jTextFieldlotePedidoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_LOTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabellotePedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setfecha_pedido(this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_pedidoPedidoProdu.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelfecha_pedidoPedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setfecha_entrega(this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_entregaPedidoProdu.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_FECHAENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelfecha_entregaPedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setes_uso_interno(this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabeles_uso_internoPedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setfecha(this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfechaPedidoProdu.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabelfechaPedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			pedidoprodu.setdescripcion(this.jInternalFrameDetalleFormPedidoProdu.jTextAreadescripcionPedidoProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+PedidoProduConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormPedidoProdu.jLabeldescripcionPedidoProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualPedidoProdu(PedidoProdu pedidoproduBean,PedidoProdu pedidoprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && pedidoproduBean.getid_formato()!=null && !pedidoproduBean.getid_formato().equals(null))) {pedidoprodu.setid_formato(pedidoproduBean.getid_formato());}
			if(conDefault || (!conDefault && pedidoproduBean.getid_tipo_prioridad_empresa_produ()!=null && !pedidoproduBean.getid_tipo_prioridad_empresa_produ().equals(-1L))) {pedidoprodu.setid_tipo_prioridad_empresa_produ(pedidoproduBean.getid_tipo_prioridad_empresa_produ());}
			if(conDefault || (!conDefault && pedidoproduBean.getid_empleado_responsable()!=null && !pedidoproduBean.getid_empleado_responsable().equals(-1L))) {pedidoprodu.setid_empleado_responsable(pedidoproduBean.getid_empleado_responsable());}
			if(conDefault || (!conDefault && pedidoproduBean.getid_cliente()!=null && !pedidoproduBean.getid_cliente().equals(-1L))) {pedidoprodu.setid_cliente(pedidoproduBean.getid_cliente());}
			if(conDefault || (!conDefault && pedidoproduBean.getid_estado_orden_produ()!=null && !pedidoproduBean.getid_estado_orden_produ().equals(-1L))) {pedidoprodu.setid_estado_orden_produ(pedidoproduBean.getid_estado_orden_produ());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosPedidoProdu(PedidoProdu pedidoproduOrigen,PedidoProdu pedidoprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pedidoproduOrigen.getId()!=null && !pedidoproduOrigen.getId().equals(0L))) {pedidoprodu.setId(pedidoproduOrigen.getId());}}
			if(conDefault || (!conDefault && pedidoproduOrigen.getid_formato()!=null && !pedidoproduOrigen.getid_formato().equals(null))) {pedidoprodu.setid_formato(pedidoproduOrigen.getid_formato());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getid_tipo_prioridad_empresa_produ()!=null && !pedidoproduOrigen.getid_tipo_prioridad_empresa_produ().equals(-1L))) {pedidoprodu.setid_tipo_prioridad_empresa_produ(pedidoproduOrigen.getid_tipo_prioridad_empresa_produ());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getid_empleado_responsable()!=null && !pedidoproduOrigen.getid_empleado_responsable().equals(-1L))) {pedidoprodu.setid_empleado_responsable(pedidoproduOrigen.getid_empleado_responsable());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getsecuencial()!=null && !pedidoproduOrigen.getsecuencial().equals(""))) {pedidoprodu.setsecuencial(pedidoproduOrigen.getsecuencial());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getid_cliente()!=null && !pedidoproduOrigen.getid_cliente().equals(-1L))) {pedidoprodu.setid_cliente(pedidoproduOrigen.getid_cliente());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getdireccion_cliente()!=null && !pedidoproduOrigen.getdireccion_cliente().equals(""))) {pedidoprodu.setdireccion_cliente(pedidoproduOrigen.getdireccion_cliente());}
			if(conDefault || (!conDefault && pedidoproduOrigen.gettelefono_cliente()!=null && !pedidoproduOrigen.gettelefono_cliente().equals(""))) {pedidoprodu.settelefono_cliente(pedidoproduOrigen.gettelefono_cliente());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getruc_cliente()!=null && !pedidoproduOrigen.getruc_cliente().equals(""))) {pedidoprodu.setruc_cliente(pedidoproduOrigen.getruc_cliente());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getlote()!=null && !pedidoproduOrigen.getlote().equals(""))) {pedidoprodu.setlote(pedidoproduOrigen.getlote());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getfecha_pedido()!=null && !pedidoproduOrigen.getfecha_pedido().equals(new Date()))) {pedidoprodu.setfecha_pedido(pedidoproduOrigen.getfecha_pedido());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getfecha_entrega()!=null && !pedidoproduOrigen.getfecha_entrega().equals(new Date()))) {pedidoprodu.setfecha_entrega(pedidoproduOrigen.getfecha_entrega());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getes_uso_interno()!=null && !pedidoproduOrigen.getes_uso_interno().equals(false))) {pedidoprodu.setes_uso_interno(pedidoproduOrigen.getes_uso_interno());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getfecha()!=null && !pedidoproduOrigen.getfecha().equals(new Date()))) {pedidoprodu.setfecha(pedidoproduOrigen.getfecha());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getdescripcion()!=null && !pedidoproduOrigen.getdescripcion().equals(""))) {pedidoprodu.setdescripcion(pedidoproduOrigen.getdescripcion());}
			if(conDefault || (!conDefault && pedidoproduOrigen.getid_estado_orden_produ()!=null && !pedidoproduOrigen.getid_estado_orden_produ().equals(-1L))) {pedidoprodu.setid_estado_orden_produ(pedidoproduOrigen.getid_estado_orden_produ());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPedidoProdu(PedidoProdu pedidoprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.setText(pedidoprodu.getId().toString());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldsecuencialPedidoProdu.setText(pedidoprodu.getsecuencial());
			this.jInternalFrameDetalleFormPedidoProdu.jTextAreadireccion_clientePedidoProdu.setText(pedidoprodu.getdireccion_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldtelefono_clientePedidoProdu.setText(pedidoprodu.gettelefono_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldruc_clientePedidoProdu.setText(pedidoprodu.getruc_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldlotePedidoProdu.setText(pedidoprodu.getlote());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_pedidoPedidoProdu.setDate(pedidoprodu.getfecha_pedido());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_entregaPedidoProdu.setDate(pedidoprodu.getfecha_entrega());
			this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.setSelected(pedidoprodu.getes_uso_interno());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfechaPedidoProdu.setDate(pedidoprodu.getfecha());
			this.jInternalFrameDetalleFormPedidoProdu.jTextAreadescripcionPedidoProdu.setText(pedidoprodu.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioPedidoProdu(PedidoProduBean pedidoproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.setText(pedidoproduBean.getId().toString());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldsecuencialPedidoProdu.setText(pedidoproduBean.getsecuencial());
			this.jInternalFrameDetalleFormPedidoProdu.jTextAreadireccion_clientePedidoProdu.setText(pedidoproduBean.getdireccion_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldtelefono_clientePedidoProdu.setText(pedidoproduBean.gettelefono_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldruc_clientePedidoProdu.setText(pedidoproduBean.getruc_cliente());
			this.jInternalFrameDetalleFormPedidoProdu.jTextFieldlotePedidoProdu.setText(pedidoproduBean.getlote());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_pedidoPedidoProdu.setDate(pedidoproduBean.getfecha_pedido());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_entregaPedidoProdu.setDate(pedidoproduBean.getfecha_entrega());
			this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.setSelected(pedidoproduBean.getes_uso_interno());
			this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfechaPedidoProdu.setDate(pedidoproduBean.getfecha());
			this.jInternalFrameDetalleFormPedidoProdu.jTextAreadescripcionPedidoProdu.setText(pedidoproduBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanPedidoProdu(PedidoProduParameterReturnGeneral pedidoproduReturnGeneral,PedidoProduBean pedidoproduBean,Boolean conDefault) throws Exception { 
		try {
			PedidoProdu pedidoproduLocal=new PedidoProdu();
			
			pedidoproduLocal=pedidoproduReturnGeneral.getPedidoProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && pedidoproduLocal.getId()!=null && !pedidoproduLocal.getId().equals(0L))) {pedidoproduBean.setId(pedidoproduLocal.getId());}}
			if(conDefault || (!conDefault && pedidoproduLocal.getid_formato()!=null && !pedidoproduLocal.getid_formato().equals(null))) {pedidoproduBean.setid_formato(pedidoproduLocal.getid_formato());}
			if(conDefault || (!conDefault && pedidoproduLocal.getid_tipo_prioridad_empresa_produ()!=null && !pedidoproduLocal.getid_tipo_prioridad_empresa_produ().equals(-1L))) {pedidoproduBean.setid_tipo_prioridad_empresa_produ(pedidoproduLocal.getid_tipo_prioridad_empresa_produ());}
			if(conDefault || (!conDefault && pedidoproduLocal.getid_empleado_responsable()!=null && !pedidoproduLocal.getid_empleado_responsable().equals(-1L))) {pedidoproduBean.setid_empleado_responsable(pedidoproduLocal.getid_empleado_responsable());}
			if(conDefault || (!conDefault && pedidoproduLocal.getsecuencial()!=null && !pedidoproduLocal.getsecuencial().equals(""))) {pedidoproduBean.setsecuencial(pedidoproduLocal.getsecuencial());}
			if(conDefault || (!conDefault && pedidoproduLocal.getid_cliente()!=null && !pedidoproduLocal.getid_cliente().equals(-1L))) {pedidoproduBean.setid_cliente(pedidoproduLocal.getid_cliente());}
			if(conDefault || (!conDefault && pedidoproduLocal.getdireccion_cliente()!=null && !pedidoproduLocal.getdireccion_cliente().equals(""))) {pedidoproduBean.setdireccion_cliente(pedidoproduLocal.getdireccion_cliente());}
			if(conDefault || (!conDefault && pedidoproduLocal.gettelefono_cliente()!=null && !pedidoproduLocal.gettelefono_cliente().equals(""))) {pedidoproduBean.settelefono_cliente(pedidoproduLocal.gettelefono_cliente());}
			if(conDefault || (!conDefault && pedidoproduLocal.getruc_cliente()!=null && !pedidoproduLocal.getruc_cliente().equals(""))) {pedidoproduBean.setruc_cliente(pedidoproduLocal.getruc_cliente());}
			if(conDefault || (!conDefault && pedidoproduLocal.getlote()!=null && !pedidoproduLocal.getlote().equals(""))) {pedidoproduBean.setlote(pedidoproduLocal.getlote());}
			if(conDefault || (!conDefault && pedidoproduLocal.getfecha_pedido()!=null && !pedidoproduLocal.getfecha_pedido().equals(new Date()))) {pedidoproduBean.setfecha_pedido(pedidoproduLocal.getfecha_pedido());}
			if(conDefault || (!conDefault && pedidoproduLocal.getfecha_entrega()!=null && !pedidoproduLocal.getfecha_entrega().equals(new Date()))) {pedidoproduBean.setfecha_entrega(pedidoproduLocal.getfecha_entrega());}
			if(conDefault || (!conDefault && pedidoproduLocal.getes_uso_interno()!=null && !pedidoproduLocal.getes_uso_interno().equals(false))) {pedidoproduBean.setes_uso_interno(pedidoproduLocal.getes_uso_interno());}
			if(conDefault || (!conDefault && pedidoproduLocal.getfecha()!=null && !pedidoproduLocal.getfecha().equals(new Date()))) {pedidoproduBean.setfecha(pedidoproduLocal.getfecha());}
			if(conDefault || (!conDefault && pedidoproduLocal.getdescripcion()!=null && !pedidoproduLocal.getdescripcion().equals(""))) {pedidoproduBean.setdescripcion(pedidoproduLocal.getdescripcion());}
			if(conDefault || (!conDefault && pedidoproduLocal.getid_estado_orden_produ()!=null && !pedidoproduLocal.getid_estado_orden_produ().equals(-1L))) {pedidoproduBean.setid_estado_orden_produ(pedidoproduLocal.getid_estado_orden_produ());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxPedidoProduGenerico(Long idPedidoProduSeleccionado,JComboBox jComboBoxPedidoProdu,List<PedidoProdu> pedidoprodusLocal)throws Exception {
		try {
			PedidoProdu  pedidoproduTemp=null;

			for(PedidoProdu pedidoproduAux:pedidoprodusLocal) {
				if(pedidoproduAux.getId()!=null && pedidoproduAux.getId().equals(idPedidoProduSeleccionado)) {
					pedidoproduTemp=pedidoproduAux;
					break;
				}
			}

			jComboBoxPedidoProdu.setSelectedItem(pedidoproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxPedidoProduGenerico(JComboBox jComboBoxPedidoProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPedidoProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxPedidoProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxPedidoProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxPedidoProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxPedidoProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxPedidoProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PedidoDetaProdu")) {
			jButtonPedidoDetaProduActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidoprodu=(PedidoProdu) pedidoproduLogic.getPedidoProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pedidoprodu =(PedidoProdu) pedidoprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Formato")) {
			//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.getformato_descripcion();
			} else {
				//sDescripcion=this.getActualFormatoForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.getformato_descripcion();
			}
		}

		if(sTipo.equals("TipoPrioridadEmpresaProdu")) {
			//sDescripcion=this.getActualTipoPrioridadEmpresaProduForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.gettipoprioridadempresaprodu_descripcion();
			} else {
				//sDescripcion=this.getActualTipoPrioridadEmpresaProduForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.gettipoprioridadempresaprodu_descripcion();
			}
		}

		if(sTipo.equals("EmpleadoResponsable")) {
			//sDescripcion=this.getActualEmpleadoResponsableForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.getempleadoresponsable_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoResponsableForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.getempleadoresponsable_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.getcliente_descripcion();
			}
		}

		if(sTipo.equals("EstadoOrdenProdu")) {
			//sDescripcion=this.getActualEstadoOrdenProduForeignKeyDescripcion((Long)value);
			if(!pedidoprodu.getIsNew() && !pedidoprodu.getIsChanged() && !pedidoprodu.getIsDeleted()) {
				sDescripcion=pedidoprodu.getestadoordenprodu_descripcion();
			} else {
				//sDescripcion=this.getActualEstadoOrdenProduForeignKeyDescripcion((Long)value);
				sDescripcion=pedidoprodu.getestadoordenprodu_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		PedidoProdu pedidoproduRow=new PedidoProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidoproduRow=(PedidoProdu) pedidoproduLogic.getPedidoProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			pedidoproduRow=(PedidoProdu) pedidoprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPedidoDetaProduActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,PedidoProdu pedidoprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormPedidoProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu = (PedidoProdu)this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.pedidoprodu = (PedidoProdu)this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(pedidoprodu!=null) {
						this.pedidoprodu = pedidoprodu;
					} else {
						this.pedidoprodu = new PedidoProdu();
					}
				}

				if(this.isTienePermisosPedidoDetaProdu && this.permiteMantenimiento(this.pedidoprodu)) {
					PedidoDetaProduBeanSwingJInternalFrame pedidodetaproduBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFramePopup=new PedidoDetaProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidodetaproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFramePopup;
					} else {
						pedidodetaproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame;
					}

					List<PedidoProdu> pedidoprodus=new ArrayList<PedidoProdu>();
					pedidoprodus.add(this.pedidoprodu);
					if(!esRelacionado) {
						//pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setConGuardarRelaciones(false);
						//pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidodetaproduBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormPedidoProdu.cargarPedidoDetaProduBeanSwingJInternalFrame(pedidoprodus,this.pedidoprodu,pedidodetaproduBeanSwingJInternalFrame,/*conInicializar,*/pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.getConGuardarRelaciones(),pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduSessionBean.getEsGuardarRelacionado());
					pedidodetaproduBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidodetaproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoDetaProdu("no_relacionado");

						pedidodetaproduBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoDetaProduConstantesFunciones.ITAMANIOFILATABLA + (PedidoDetaProduConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidodetaproduBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
						TitledBorder titledBorderPedidoDetaProdu=(TitledBorder)pedidodetaproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoDetaProdu.getBorder();

						titledBorderPedidoDetaProdu.setTitle(titledBorderPedidoProdu.getTitle() + " -> Pedido Detalle Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidodetaproduBeanSwingJInternalFrame);
						}

						pedidodetaproduBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidodetaproduBeanSwingJInternalFrame);

						pedidodetaproduBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.pedidoproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Detalle Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualPedidoProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoProdu && this.isPermisoNuevoPedidoProdu));			
			this.jButtonDuplicarPedidoProdu.setVisible((this.isVisibilidadCeldaDuplicarPedidoProdu && this.isPermisoDuplicarPedidoProdu));			
			this.jButtonCopiarPedidoProdu.setVisible((this.isVisibilidadCeldaCopiarPedidoProdu && this.isPermisoCopiarPedidoProdu));
			this.jButtonVerFormPedidoProdu.setVisible((this.isVisibilidadCeldaVerFormPedidoProdu && this.isPermisoVerFormPedidoProdu));
			
			this.jButtonAbrirOrderByPedidoProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoProdu && this.isPermisoOrdenPedidoProdu));			
			
			this.jButtonNuevoRelacionesPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidoProdu && this.isPermisoNuevoPedidoProdu));			
			this.jButtonNuevoGuardarCambiosPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoProdu && this.isPermisoNuevoPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));
			
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarPedidoProdu.setVisible((this.isVisibilidadCeldaModificarPedidoProdu && this.isPermisoActualizarPedidoProdu));	
			this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarPedidoProdu.setVisible((this.isVisibilidadCeldaActualizarPedidoProdu && this.isPermisoActualizarPedidoProdu));	
			this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarPedidoProdu.setVisible((this.isVisibilidadCeldaEliminarPedidoProdu && this.isPermisoEliminarPedidoProdu));
			this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarPedidoProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoProdu);							
			this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosPedidoProdu.setVisible((this.isVisibilidadCeldaGuardarPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaPedidoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoProdu && this.isPermisoNuevoPedidoProdu));						
			this.jButtonDuplicarToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaDuplicarPedidoProdu && this.isPermisoDuplicarPedidoProdu));						
			this.jButtonCopiarToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaCopiarPedidoProdu && this.isPermisoCopiarPedidoProdu));			
			this.jButtonVerFormToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaVerFormPedidoProdu && this.isPermisoVerFormPedidoProdu));			
			this.jButtonAbrirOrderByToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoProdu && this.isPermisoOrdenPedidoProdu));
			this.jButtonNuevoRelacionesToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidoProdu && this.isPermisoNuevoPedidoProdu));			
			this.jButtonNuevoGuardarCambiosToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoProdu && this.isPermisoNuevoPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));			
			
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaModificarPedidoProdu && this.isPermisoActualizarPedidoProdu));	
			this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaActualizarPedidoProdu  && this.isPermisoActualizarPedidoProdu));	
			this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaEliminarPedidoProdu && this.isPermisoEliminarPedidoProdu));
			this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarToolBarPedidoProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoProdu);				
			this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaGuardarPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarPedidoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoProdu && this.isPermisoNuevoPedidoProdu));			
			this.jMenuItemDuplicarPedidoProdu.setVisible((this.isVisibilidadCeldaDuplicarPedidoProdu && this.isPermisoDuplicarPedidoProdu));			
			this.jMenuItemCopiarPedidoProdu.setVisible((this.isVisibilidadCeldaCopiarPedidoProdu && this.isPermisoCopiarPedidoProdu));			
			this.jMenuItemVerFormPedidoProdu.setVisible((this.isVisibilidadCeldaVerFormPedidoProdu && this.isPermisoVerFormPedidoProdu));			
			this.jMenuItemAbrirOrderByPedidoProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoProdu && this.isPermisoOrdenPedidoProdu));			
			//this.jMenuItemMostrarOcultarPedidoProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoProdu && this.isPermisoOrdenPedidoProdu));
			this.jMenuItemDetalleAbrirOrderByPedidoProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoProdu && this.isPermisoOrdenPedidoProdu));			
			//this.jMenuItemDetalleMostrarOcultarPedidoProdu.setVisible((this.isVisibilidadCeldaOrdenPedidoProdu && this.isPermisoOrdenPedidoProdu));			
			this.jMenuItemNuevoRelacionesPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesPedidoProdu && this.isPermisoNuevoPedidoProdu));			
			this.jMenuItemNuevoGuardarCambiosPedidoProdu.setVisible((this.isVisibilidadCeldaNuevoPedidoProdu && this.isPermisoNuevoPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));									
			
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemModificarPedidoProdu.setVisible((this.isVisibilidadCeldaModificarPedidoProdu && this.isPermisoActualizarPedidoProdu));	
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemActualizarPedidoProdu.setVisible((this.isVisibilidadCeldaActualizarPedidoProdu && this.isPermisoActualizarPedidoProdu));	
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemEliminarPedidoProdu.setVisible((this.isVisibilidadCeldaEliminarPedidoProdu && this.isPermisoEliminarPedidoProdu));
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemCancelarPedidoProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoProdu);				
			}
			
			this.jMenuItemGuardarCambiosPedidoProdu.setVisible((this.isVisibilidadCeldaGuardarPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));						
			this.jMenuItemGuardarCambiosTablaPedidoProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoPedidoProdu=this.jButtonNuevoPedidoProdu.isVisible();
			this.isVisibilidadCeldaDuplicarPedidoProdu=this.jButtonDuplicarPedidoProdu.isVisible();
			this.isVisibilidadCeldaCopiarPedidoProdu=this.jButtonCopiarPedidoProdu.isVisible();
			this.isVisibilidadCeldaVerFormPedidoProdu=this.jButtonVerFormPedidoProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenPedidoProdu=this.jButtonAbrirOrderByPedidoProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=this.jButtonNuevoRelacionesPedidoProdu.isVisible();
			this.isVisibilidadCeldaModificarPedidoProdu=this.jButtonModificarPedidoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			this.isVisibilidadCeldaActualizarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarPedidoProdu.isVisible();
			this.isVisibilidadCeldaEliminarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarPedidoProdu.isVisible();
			this.isVisibilidadCeldaCancelarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarPedidoProdu.isVisible();
			this.isVisibilidadCeldaGuardarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosPedidoProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=this.jButtonGuardarCambiosTablaPedidoProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoPedidoProdu=this.jButtonNuevoToolBarPedidoProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=this.jButtonNuevoRelacionesToolBarPedidoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			this.isVisibilidadCeldaModificarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarToolBarPedidoProdu.isVisible();
			this.isVisibilidadCeldaActualizarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarToolBarPedidoProdu.isVisible();
			this.isVisibilidadCeldaEliminarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarToolBarPedidoProdu.isVisible();
			this.isVisibilidadCeldaCancelarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarToolBarPedidoProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPedidoProdu=this.jButtonGuardarCambiosToolBarPedidoProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=this.jButtonGuardarCambiosTablaToolBarPedidoProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoPedidoProdu=this.jMenuItemNuevoPedidoProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=this.jMenuItemNuevoRelacionesPedidoProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			this.isVisibilidadCeldaModificarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jMenuItemModificarPedidoProdu.isVisible();
			this.isVisibilidadCeldaActualizarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jMenuItemActualizarPedidoProdu.isVisible();
			this.isVisibilidadCeldaEliminarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jMenuItemEliminarPedidoProdu.isVisible();
			this.isVisibilidadCeldaCancelarPedidoProdu=this.jInternalFrameDetalleFormPedidoProdu.jMenuItemCancelarPedidoProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarPedidoProdu=this.jMenuItemGuardarCambiosPedidoProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=this.jMenuItemGuardarCambiosTablaPedidoProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesPedidoProdu(Boolean esInicializar) {
		if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
				//if(this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesPedidoProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualPedidoProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualPedidoProdu() {
		this.jButtonNuevoPedidoProdu.setVisible(this.isPermisoNuevoPedidoProdu);			
		this.jButtonDuplicarPedidoProdu.setVisible(this.isPermisoDuplicarPedidoProdu);			
		this.jButtonCopiarPedidoProdu.setVisible(this.isPermisoCopiarPedidoProdu);			
		this.jButtonVerFormPedidoProdu.setVisible(this.isPermisoVerFormPedidoProdu);			
		
		this.jButtonAbrirOrderByPedidoProdu.setVisible(this.isPermisoOrdenPedidoProdu);					
		
		this.jButtonNuevoRelacionesPedidoProdu.setVisible(this.isPermisoNuevoPedidoProdu);			
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarPedidoProdu.setVisible(this.isPermisoActualizarPedidoProdu);	
			this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarPedidoProdu.setVisible(this.isPermisoActualizarPedidoProdu);	
			this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarPedidoProdu.setVisible(this.isPermisoEliminarPedidoProdu);
			this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarPedidoProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoProdu);						
			this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosPedidoProdu.setVisible(this.isPermisoGuardarCambiosPedidoProdu);							
		}
		
		this.jButtonGuardarCambiosTablaPedidoProdu.setVisible(this.isPermisoActualizarPedidoProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetallePedidoProdu() {
		this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarPedidoProdu.setVisible(this.isPermisoActualizarPedidoProdu);	
		this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarPedidoProdu.setVisible(this.isPermisoActualizarPedidoProdu);	
		this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarPedidoProdu.setVisible(this.isPermisoEliminarPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarPedidoProdu.setVisible(this.isVisibilidadCeldaCancelarPedidoProdu);							
		this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosPedidoProdu.setVisible((this.isVisibilidadCeldaGuardarPedidoProdu && this.isPermisoGuardarCambiosPedidoProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosPedidoProdu() {
		if(PedidoProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualPedidoProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesPedidoProdu() {
	}
	
	public void jTableDatosPedidoProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarPedidoProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.pedidoprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaPedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderPedidoProdu.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.pedidoprodu.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalPedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderPedidoProdu.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.pedidoprodu.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioPedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderPedidoProdu.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.pedidoprodu.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoPedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderPedidoProdu.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.pedidoprodu.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_formatoPedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoformato=true;

			idTienePermisoformato=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(FormatoConstantesFunciones.CLASSNAME);

			if(idTienePermisoformato) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.formatoBeanSwingJInternalFrame=new FormatoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.formatoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.formatoBeanSwingJInternalFrame.getFormatoLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_formato()!=null) {
					this.formatoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.formatoBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_formato());
					this.formatoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.formatoBeanSwingJInternalFrame.inicializarActualizarBindingTablaFormato();
				}

				JInternalFrameBase jinternalFrame =this.formatoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBorderformato=(TitledBorder)this.formatoBeanSwingJInternalFrame.jScrollPanelDatosFormato.getBorder();

				titledBorderformato.setTitle(titledBorderPedidoProdu.getTitle() + " -> Formato");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_formatoPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_formato()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_formato = "+this.pedidoprodu.getid_formato().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_prioridad_empresa_produPedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoprioridadempresaprodu=true;

			idTienePermisotipoprioridadempresaprodu=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(TipoPrioridadEmpresaProduConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoprioridadempresaprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.tipoprioridadempresaproduBeanSwingJInternalFrame=new TipoPrioridadEmpresaProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoprioridadempresaproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoprioridadempresaproduBeanSwingJInternalFrame.getTipoPrioridadEmpresaProduLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_tipo_prioridad_empresa_produ()!=null) {
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_tipo_prioridad_empresa_produ());
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoprioridadempresaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoPrioridadEmpresaProdu();
				}

				JInternalFrameBase jinternalFrame =this.tipoprioridadempresaproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBordertipoprioridadempresaprodu=(TitledBorder)this.tipoprioridadempresaproduBeanSwingJInternalFrame.jScrollPanelDatosTipoPrioridadEmpresaProdu.getBorder();

				titledBordertipoprioridadempresaprodu.setTitle(titledBorderPedidoProdu.getTitle() + " -> Tipo Prioridad Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_prioridad_empresa_produPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_tipo_prioridad_empresa_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_prioridad_empresa_produ = "+this.pedidoprodu.getid_tipo_prioridad_empresa_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleado_responsablePedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleadoresponsable=true;

			idTienePermisoempleadoresponsable=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleadoresponsable) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.empleadoresponsableBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoresponsableBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoresponsableBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_empleado_responsable()!=null) {
					this.empleadoresponsableBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoresponsableBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_empleado_responsable());
					this.empleadoresponsableBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoresponsableBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoresponsableBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoresponsableBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBorderempleadoresponsable=(TitledBorder)this.empleadoresponsableBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleadoresponsable.setTitle(titledBorderPedidoProdu.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleado_responsablePedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_empleado_responsable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado_responsable = "+this.pedidoprodu.getid_empleado_responsable().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.pedidoprodu.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clientePedidoProduActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderPedidoProdu=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosPedidoProdu.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderPedidoProdu.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clientePedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderPedidoProdu.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clientePedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.pedidoprodu.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccion_clientePedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getdireccion_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion_cliente like '%"+this.pedidoprodu.getdireccion_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefono_clientePedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.gettelefono_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono_cliente like '%"+this.pedidoprodu.gettelefono_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonruc_clientePedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getruc_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc_cliente like '%"+this.pedidoprodu.getruc_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonlotePedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getlote()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where lote like '%"+this.pedidoprodu.getlote()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pedidoPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getfecha_pedido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pedido = '"+Funciones2.getStringPostgresDate(this.pedidoprodu.getfecha_pedido())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entregaPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getfecha_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrega = '"+Funciones2.getStringPostgresDate(this.pedidoprodu.getfecha_entrega())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_uso_internoPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getes_uso_interno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_uso_interno = "+this.pedidoprodu.getes_uso_interno().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.pedidoprodu.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.pedidoprodu.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estado_orden_produPedidoProduUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestadoordenprodu=true;

			idTienePermisoestadoordenprodu=this.tienePermisosUsuarioEnPaginaWebPedidoProdu(EstadoOrdenProduConstantesFunciones.CLASSNAME);

			if(idTienePermisoestadoordenprodu) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosPedidoProdu.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosPedidoProdu.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);

				this.estadoordenproduBeanSwingJInternalFrame=new EstadoOrdenProduBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estadoordenproduBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estadoordenproduBeanSwingJInternalFrame.getEstadoOrdenProduLogic().setConnexion(this.pedidoproduLogic.getConnexion());

				if(this.pedidoprodu.getid_estado_orden_produ()!=null) {
					this.estadoordenproduBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estadoordenproduBeanSwingJInternalFrame.setIdActual(this.pedidoprodu.getid_estado_orden_produ());
					this.estadoordenproduBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estadoordenproduBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estadoordenproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstadoOrdenProdu();
				}

				JInternalFrameBase jinternalFrame =this.estadoordenproduBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderPedidoProdu=(TitledBorder)this.jScrollPanelDatosPedidoProdu.getBorder();
				TitledBorder titledBorderestadoordenprodu=(TitledBorder)this.estadoordenproduBeanSwingJInternalFrame.jScrollPanelDatosEstadoOrdenProdu.getBorder();

				titledBorderestadoordenprodu.setTitle(titledBorderPedidoProdu.getTitle() + " -> Estado Orden Produccion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estado_orden_produPedidoProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.getpedidoprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.pedidoprodu==null) {
						this.pedidoprodu = new PedidoProdu();
					}

					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);
				}

				if(this.pedidoprodu.getid_estado_orden_produ()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estado_orden_produ = "+this.pedidoprodu.getid_estado_orden_produ().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingPedidoProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClientePedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdCliente();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioPedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdEjercicio();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoResponsablePedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdEmpleadoResponsable();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaPedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdEmpresa();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstadoOrdenProduPedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdEstadoOrdenProdu();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFormatoPedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdFormato();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoPedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdPeriodo();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalPedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdSucursal();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoPrioridadEmpresaProduPedidoProduActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingPedidoProdu(false,false);

			this.getPedidoProdusFK_IdTipoPrioridadEmpresaProdu();

			this.inicializarActualizarBindingPedidoProdu(false);

			//if(PedidoProduBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingPedidoProdu(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.pedidoproduLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFramePedidoProdu() {
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
		

		if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
			this.jInternalFrameDetalleFormPedidoProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormPedidoProdu.dispose();
			this.jInternalFrameDetalleFormPedidoProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
			this.jInternalFrameReporteDinamicoPedidoProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoPedidoProdu.dispose();
			this.jInternalFrameReporteDinamicoPedidoProdu=null;
		}
		
		if(this.jInternalFrameImportacionPedidoProdu!=null) {
			this.jInternalFrameImportacionPedidoProdu.setVisible(false);	    			
			this.jInternalFrameImportacionPedidoProdu.dispose();
			this.jInternalFrameImportacionPedidoProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessPedidoProdu();
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoPedidoProdu")) {
				jButtonNuevoPedidoProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarPedidoProdu")) {
				jButtonDuplicarPedidoProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarPedidoProdu")) {
				jButtonCopiarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormPedidoProdu")) {
				jButtonVerFormPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarPedidoProdu")) {
				jButtonNuevoPedidoProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarPedidoProdu")) {
				jButtonDuplicarPedidoProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoPedidoProdu")) {
				jButtonNuevoPedidoProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarPedidoProdu")) {
				jButtonDuplicarPedidoProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesPedidoProdu")) {
				jButtonNuevoPedidoProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarPedidoProdu")) {
				jButtonNuevoPedidoProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesPedidoProdu")) {
				jButtonNuevoPedidoProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarPedidoProdu")) {
				jButtonModificarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarPedidoProdu")) {
				jButtonModificarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarPedidoProdu")) {
				jButtonModificarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarPedidoProdu")) {
				jButtonActualizarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarPedidoProdu")) {
				jButtonActualizarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarPedidoProdu")) {
				jButtonActualizarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarPedidoProdu")) {
				jButtonEliminarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarPedidoProdu")) {
				jButtonEliminarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarPedidoProdu")) {
				jButtonEliminarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarPedidoProdu")) {
				jButtonCancelarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarPedidoProdu")) {
				jButtonCancelarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarPedidoProdu")) {
				jButtonCancelarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarPedidoProdu")) {
				jButtonCerrarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarPedidoProdu")) {
				jButtonCerrarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarPedidoProdu")) {
				jButtonCerrarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarPedidoProdu")) {
				jButtonMostrarOcultarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarPedidoProdu")) {
				jButtonCancelarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosPedidoProdu")) {
				jButtonGuardarCambiosPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarPedidoProdu")) {
				jButtonGuardarCambiosPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarPedidoProdu")) {
				jButtonCopiarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarPedidoProdu")) {
				jButtonVerFormPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosPedidoProdu")) {
				jButtonGuardarCambiosPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarPedidoProdu")) {
				jButtonCopiarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormPedidoProdu")) {
				jButtonVerFormPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaPedidoProdu")) {
				jButtonGuardarCambiosPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarPedidoProdu")) {
				jButtonGuardarCambiosPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaPedidoProdu")) {
				jButtonGuardarCambiosPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionPedidoProdu")) {
				jButtonRecargarInformacionPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarPedidoProdu")) {
				jButtonRecargarInformacionPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionPedidoProdu")) {
				jButtonRecargarInformacionPedidoProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresPedidoProdu")) {
				jButtonAnterioresPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarPedidoProdu")) {
				jButtonAnterioresPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnteriorePedidoProdu")) {
				jButtonAnterioresPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesPedidoProdu")) {
				jButtonSiguientesPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarPedidoProdu")) {
				jButtonSiguientesPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesPedidoProdu")) {
				jButtonSiguientesPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByPedidoProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByPedidoProdu")) {
				jButtonAbrirOrderByPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarPedidoProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarPedidoProdu")) {
				jButtonMostrarOcultarPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosPedidoProdu")) {
				jButtonNuevoGuardarCambiosPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarPedidoProdu")) {
				jButtonNuevoGuardarCambiosPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosPedidoProdu")) {
				jButtonNuevoGuardarCambiosPedidoProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoPedidoProdu")) {
				jButtonCerrarReporteDinamicoPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoPedidoProdu")) {
				jButtonGenerarReporteDinamicoPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoPedidoProdu")) {
				
				jButtonGenerarExcelReporteDinamicoPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionPedidoProdu")) {
				jButtonCerrarImportacionPedidoProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionPedidoProdu")) {
				
				jButtonGenerarImportacionPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionPedidoProdu")) {
				
				jButtonAbrirImportacionPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesPedidoProdu")) {
				jComboBoxTiposAccionesPedidoProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesPedidoProdu")) {
				jComboBoxTiposRelacionesPedidoProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioPedidoProdu")) {
				jComboBoxTiposAccionesPedidoProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarPedidoProdu")) {
				
				jComboBoxTiposSeleccionarPedidoProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralPedidoProdu")) {
				jTextFieldValorCampoGeneralPedidoProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByPedidoProdu")) {
				jButtonAbrirOrderByPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarPedidoProdu")) {
				jButtonAbrirOrderByPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByPedidoProdu")) {
				jButtonCerrarOrderByPedidoProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPedidoProduBusqueda")) {
				this.jButtonidPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPedidoProduUpdate")) {
				this.jButtonid_empresaPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPedidoProduBusqueda")) {
				this.jButtonid_empresaPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPedidoProduUpdate")) {
				this.jButtonid_sucursalPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPedidoProduBusqueda")) {
				this.jButtonid_sucursalPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPedidoProduUpdate")) {
				this.jButtonid_ejercicioPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPedidoProduBusqueda")) {
				this.jButtonid_ejercicioPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPedidoProduUpdate")) {
				this.jButtonid_periodoPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPedidoProduBusqueda")) {
				this.jButtonid_periodoPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoPedidoProduUpdate")) {
				this.jButtonid_formatoPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoPedidoProduBusqueda")) {
				this.jButtonid_formatoPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_prioridad_empresa_produPedidoProduUpdate")) {
				this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_prioridad_empresa_produPedidoProduBusqueda")) {
				this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_responsablePedidoProduUpdate")) {
				this.jButtonid_empleado_responsablePedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_responsablePedidoProduBusqueda")) {
				this.jButtonid_empleado_responsablePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialPedidoProduBusqueda")) {
				this.jButtonsecuencialPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clientePedidoProdu")) {
				this.jButtonid_clientePedidoProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clientePedidoProduUpdate")) {
				this.jButtonid_clientePedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clientePedidoProduBusqueda")) {
				this.jButtonid_clientePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_clientePedidoProduBusqueda")) {
				this.jButtondireccion_clientePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_clientePedidoProduBusqueda")) {
				this.jButtontelefono_clientePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clientePedidoProduBusqueda")) {
				this.jButtonruc_clientePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("lotePedidoProduBusqueda")) {
				this.jButtonlotePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pedidoPedidoProduBusqueda")) {
				this.jButtonfecha_pedidoPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaPedidoProduBusqueda")) {
				this.jButtonfecha_entregaPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_uso_internoPedidoProduBusqueda")) {
				this.jButtones_uso_internoPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPedidoProduBusqueda")) {
				this.jButtonfechaPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPedidoProduBusqueda")) {
				this.jButtondescripcionPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_orden_produPedidoProduUpdate")) {
				this.jButtonid_estado_orden_produPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_orden_produPedidoProduBusqueda")) {
				this.jButtonid_estado_orden_produPedidoProduBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clientePedidoProdu")) {
				this.jButtonid_clientePedidoProduActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClientePedidoProdu")) {
				this.jButtonFK_IdClientePedidoProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoResponsablePedidoProdu")) {
				this.jButtonFK_IdEmpleadoResponsablePedidoProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstadoOrdenProduPedidoProdu")) {
				this.jButtonFK_IdEstadoOrdenProduPedidoProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdFormatoPedidoProdu")) {
				this.jButtonFK_IdFormatoPedidoProduActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoPrioridadEmpresaProduPedidoProdu")) {
				this.jButtonFK_IdTipoPrioridadEmpresaProduPedidoProduActionPerformed(evt);
			}
			
			;
			
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessPedidoProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				


				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			PedidoProdu pedidoproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				pedidoproduLocal=this.pedidoprodu;
			} else {
				pedidoproduLocal=this.pedidoproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
							
				
				


				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
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
			
			


			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
								
						
				


				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
								
				
				


				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
							
				
				


				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoproduAnterior =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pedidoproduAnterior =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
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
			
			


			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
								
				
				


				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosPedidoProdu")) {
					jCheckBoxSeleccionarTodosPedidoProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosPedidoProdu")) {
					jCheckBoxSeleccionadosPedidoProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarPedidoProdu")) {
					
				}
				
				


				
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
												
				
				


				
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.pedidoproduAnterior =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.pedidoproduAnterior =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
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
			
			


			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaPedidoProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.pedidoprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.pedidoprodu);
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
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
				
				


				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(PedidoProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",PedidoProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaPedidoProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.pedidoproduAnterior =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarPedidoProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosPedidoProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosPedidoProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.pedidoprodu =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.pedidoprodu =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.pedidoprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarPedidoProdu")) {
				
				}
				
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarPedidoProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosPedidoProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarPedidoProdu")) {
			
			}
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessPedidoProdu();
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
			if(sTipo.equals("NuevoPedidoProdu")) {
				jButtonNuevoPedidoProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarPedidoProdu")) {
				jButtonDuplicarPedidoProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarPedidoProdu")) {
				jButtonCopiarPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormPedidoProdu")) {
				jButtonVerFormPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesPedidoProdu")) {
				jButtonNuevoPedidoProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarPedidoProdu")) {
				jButtonModificarPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarPedidoProdu")) {
				jButtonActualizarPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarPedidoProdu")) {
				jButtonEliminarPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaPedidoProdu")) {
				jButtonGuardarCambiosPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarPedidoProdu")) {
				jButtonCancelarPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarPedidoProdu")) {
				jButtonCerrarPedidoProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosPedidoProdu")) {
				jButtonGuardarCambiosPedidoProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosPedidoProdu")) {
				jButtonNuevoGuardarCambiosPedidoProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByPedidoProdu")) {
				jButtonAbrirOrderByPedidoProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionPedidoProdu")) {
				jButtonRecargarInformacionPedidoProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresPedidoProdu")) {
				jButtonAnterioresPedidoProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesPedidoProdu")) {
				jButtonSiguientesPedidoProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idPedidoProduBusqueda")) {
				this.jButtonidPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaPedidoProduUpdate")) {
				this.jButtonid_empresaPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaPedidoProduBusqueda")) {
				this.jButtonid_empresaPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalPedidoProduUpdate")) {
				this.jButtonid_sucursalPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalPedidoProduBusqueda")) {
				this.jButtonid_sucursalPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioPedidoProduUpdate")) {
				this.jButtonid_ejercicioPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioPedidoProduBusqueda")) {
				this.jButtonid_ejercicioPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoPedidoProduUpdate")) {
				this.jButtonid_periodoPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoPedidoProduBusqueda")) {
				this.jButtonid_periodoPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_formatoPedidoProduUpdate")) {
				this.jButtonid_formatoPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_formatoPedidoProduBusqueda")) {
				this.jButtonid_formatoPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_prioridad_empresa_produPedidoProduUpdate")) {
				this.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_prioridad_empresa_produPedidoProduBusqueda")) {
				this.jButtonid_tipo_prioridad_empresa_produPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleado_responsablePedidoProduUpdate")) {
				this.jButtonid_empleado_responsablePedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleado_responsablePedidoProduBusqueda")) {
				this.jButtonid_empleado_responsablePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialPedidoProduBusqueda")) {
				this.jButtonsecuencialPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clientePedidoProdu")) {
				this.jButtonid_clientePedidoProduActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clientePedidoProduUpdate")) {
				this.jButtonid_clientePedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clientePedidoProduBusqueda")) {
				this.jButtonid_clientePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccion_clientePedidoProduBusqueda")) {
				this.jButtondireccion_clientePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefono_clientePedidoProduBusqueda")) {
				this.jButtontelefono_clientePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ruc_clientePedidoProduBusqueda")) {
				this.jButtonruc_clientePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("lotePedidoProduBusqueda")) {
				this.jButtonlotePedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pedidoPedidoProduBusqueda")) {
				this.jButtonfecha_pedidoPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaPedidoProduBusqueda")) {
				this.jButtonfecha_entregaPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_uso_internoPedidoProduBusqueda")) {
				this.jButtones_uso_internoPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaPedidoProduBusqueda")) {
				this.jButtonfechaPedidoProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionPedidoProduBusqueda")) {
				this.jButtondescripcionPedidoProduBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estado_orden_produPedidoProduUpdate")) {
				this.jButtonid_estado_orden_produPedidoProduUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estado_orden_produPedidoProduBusqueda")) {
				this.jButtonid_estado_orden_produPedidoProduBusquedaActionPerformed(evt);
			}
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessPedidoProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFramePedidoProdu")) {
				closingInternalFramePedidoProdu();
				
			} else if(sTipo.equals("jButtonCancelarPedidoProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormPedidoProdu = (JInternalFrameBase)evt.getSource();
	            	
	            PedidoProduBeanSwingJInternalFrame jInternalFrameParent=(PedidoProduBeanSwingJInternalFrame)jInternalFrameDetalleFormPedidoProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarPedidoProduActionPerformed(null);
			}
			
			PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.pedidoprodu,new Object(),this.pedidoproduParameterGeneral,this.pedidoproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormPedidoProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormPedidoProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormPedidoProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.pedidoprodu)) {
			if(!esControlTabla) {
				if(PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);			
				}
				
				if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualPedidoProdu(this.pedidoprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.pedidoproduReturnGeneral=pedidoproduLogic.procesarEventosPedidoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidoproduLogic.getPedidoProdus(),this.pedidoprodu,this.pedidoproduParameterGeneral,this.isEsNuevoPedidoProdu,classes);//this.pedidoproduLogic.getPedidoProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanPedidoProdu(this.pedidoproduReturnGeneral,this.pedidoproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanPedidoProdu(classes,this.pedidoproduReturnGeneral,this.pedidoproduBean,false);
					}
						
					if(this.pedidoproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyPedidoProdu(this.pedidoproduReturnGeneral.getPedidoProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioPedidoProdu(this.pedidoproduReturnGeneral.getPedidoProdu());	
					}
						
					if(this.pedidoproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioPedidoProdu(this.pedidoproduReturnGeneral.getPedidoProdu(),classes);//this.pedidoproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioPedidoProdu(this.pedidoprodu,classes);//this.pedidoproduBean);									
				}
			
				if(PedidoProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualPedidoProdu(this.pedidoprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysPedidoProdu(this.pedidoprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.pedidoproduAnterior!=null) {
						this.pedidoprodu=this.pedidoproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.pedidoproduReturnGeneral=pedidoproduLogic.procesarEventosPedidoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidoproduLogic.getPedidoProdus(),this.pedidoprodu,this.pedidoproduParameterGeneral,this.isEsNuevoPedidoProdu,classes);//this.pedidoproduLogic.getPedidoProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.pedidoproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.pedidoproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.pedidoproduReturnGeneral.getPedidoProdu(),pedidoproduLogic.getPedidoProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.pedidoproduReturnGeneral.getPedidoProdu(),this.pedidoprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosPedidoProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosPedidoProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosPedidoProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosPedidoProdu() throws Exception {
		
		PedidoProduModel pedidoproduModel=(PedidoProduModel)this.jTableDatosPedidoProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			pedidoproduModel.pedidoprodus=this.pedidoproduLogic.getPedidoProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			pedidoproduModel.pedidoprodus=this.pedidoprodus;
		}
		
		
		((PedidoProduModel) this.jTableDatosPedidoProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaPedidoProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getpedidoproduAnterior(),this.pedidoproduLogic.getPedidoProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getpedidoproduAnterior(),this.pedidoprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosPedidoProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioPedidoProdu(PedidoProdu pedidoprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoDetaProdu.class)) {
					this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.setPedidoDetaProdus(pedidoprodu.getPedidoDetaProdus());
					this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoDetaProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
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
										
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidoprodu,new Object(),generalEntityParameterGeneral,this.pedidoproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.pedidoproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=PedidoProduConstantesFunciones.getClassesRelationshipsOfPedidoProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=PedidoProduConstantesFunciones.getClassesRelationshipsFromStringsOfPedidoProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormPedidoProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				PedidoProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.pedidoprodu,new Object(),generalEntityParameterGeneral,this.pedidoproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioPedidoProdu(PedidoProduBean pedidoproduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoDetaProdu.class)) {
					this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.setPedidoDetaProdus(pedidoprodu.getPedidoDetaProdus());
					this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoDetaProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanPedidoProdu(ArrayList<Classe> classes,PedidoProduReturnGeneral pedidoproduReturnGeneral,PedidoProduBean pedidoproduBean,Boolean conDefault) throws Exception {
		
			this.pedidoproduBean.setPedidoDetaProdus(pedidoproduReturnGeneral.getPedidoProdu().getPedidoDetaProdus());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualPedidoProdu(PedidoProdu pedidoprodu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoDetaProdu.class)) {
					pedidoprodu.setPedidoDetaProdus(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduBeanSwingJInternalFrame.pedidodetaproduLogic.getPedidoDetaProdus());
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
		if(!paraTabla && !this.permiteMantenimiento(this.pedidoprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormPedidoProdu = new PedidoProduDetalleFormJInternalFrame(jDesktopPane,this.pedidoproduSessionBean.getConGuardarRelaciones(),this.pedidoproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.setVisible(false);
		this.jInternalFrameDetalleFormPedidoProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormPedidoProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormPedidoProdu.pedidoproduLogic=this.pedidoproduLogic;
		
		this.cargarCombosFrameForeignKeyPedidoProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetallePedidoProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetallePedidoProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyPedidoProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyPedidoProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormPedidoProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPedidoProdu"));
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarPedidoProdu.addActionListener(new ButtonActionListener(this,"ModificarPedidoProdu"));

		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarToolBarPedidoProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarPedidoProdu"));
					
		this.jInternalFrameDetalleFormPedidoProdu.jMenuItemModificarPedidoProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarPedidoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarPedidoProdu.addActionListener (new ButtonActionListener(this,"ActualizarPedidoProdu"));
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarToolBarPedidoProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPedidoProdu"));
						
		this.jInternalFrameDetalleFormPedidoProdu.jMenuItemActualizarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPedidoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarPedidoProdu.addActionListener (new ButtonActionListener(this,"EliminarPedidoProdu"));
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarPedidoProdu"));
								
		this.jInternalFrameDetalleFormPedidoProdu.jMenuItemEliminarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPedidoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarPedidoProdu.addActionListener (new ButtonActionListener(this,"CancelarPedidoProdu"));
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarPedidoProdu"));
					
		this.jInternalFrameDetalleFormPedidoProdu.jMenuItemCancelarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPedidoProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jMenuItemDetalleCerrarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPedidoProdu"));		
		
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidoProdu"));
		
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidoProdu"));
		
		
		
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPedidoProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonidPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"idPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empresaPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empresaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_sucursalPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_sucursalPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_ejercicioPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_ejercicioPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_periodoPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_periodoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_formatoPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_formatoPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_formatoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empleado_responsablePedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_responsablePedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empleado_responsablePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_responsablePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonsecuencialPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"secuencialPedidoProduBusqueda"));
		//jButtonid_clientePedidoProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clientePedidoProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProdu.addActionListener(new ButtonActionListener(this,"id_clientePedidoProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_clientePedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtondireccion_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"direccion_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtontelefono_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"telefono_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonruc_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonlotePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"lotePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfecha_pedidoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pedidoPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfecha_entregaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtones_uso_internoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"es_uso_internoPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfechaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fechaPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtondescripcionPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_estado_orden_produPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_estado_orden_produPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_estado_orden_produPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_orden_produPedidoProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPedidoProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFramePedidoProdu"));
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarPedidoProdu"));
		}
		
		this.jTableDatosPedidoProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarPedidoProdu"));
		
		this.jTableDatosPedidoProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarPedidoProdu"));
		
		this.jButtonNuevoPedidoProdu.addActionListener(new ButtonActionListener(this,"NuevoPedidoProdu"));
		
		this.jButtonDuplicarPedidoProdu.addActionListener(new ButtonActionListener(this,"DuplicarPedidoProdu"));
		
		this.jButtonCopiarPedidoProdu.addActionListener(new ButtonActionListener(this,"CopiarPedidoProdu"));
		
		this.jButtonVerFormPedidoProdu.addActionListener(new ButtonActionListener(this,"VerFormPedidoProdu"));
		
		
		this.jButtonNuevoToolBarPedidoProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarPedidoProdu"));
			
		this.jButtonDuplicarToolBarPedidoProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarPedidoProdu"));
			
		this.jMenuItemNuevoPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoPedidoProdu"));
			
		this.jMenuItemDuplicarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarPedidoProdu"));		
		
		
		this.jButtonNuevoRelacionesPedidoProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesPedidoProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarPedidoProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarPedidoProdu"));
			
		this.jMenuItemNuevoRelacionesPedidoProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesPedidoProdu"));		
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarPedidoProdu.addActionListener(new ButtonActionListener(this,"ModificarPedidoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonModificarToolBarPedidoProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarPedidoProdu"));
			
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemModificarPedidoProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarPedidoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarPedidoProdu.addActionListener (new ButtonActionListener(this,"ActualizarPedidoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonActualizarToolBarPedidoProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarPedidoProdu"));
				
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemActualizarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarPedidoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarPedidoProdu.addActionListener (new ButtonActionListener(this,"EliminarPedidoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonEliminarToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarPedidoProdu"));
						
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemEliminarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarPedidoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarPedidoProdu.addActionListener (new ButtonActionListener(this,"CancelarPedidoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonCancelarToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarPedidoProdu"));
			
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemCancelarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarPedidoProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarPedidoProdu"));		
		
		
		this.jButtonCerrarPedidoProdu.addActionListener (new ButtonActionListener(this,"CerrarPedidoProdu"));
		
		
		this.jButtonCerrarToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarPedidoProdu"));
			
		this.jMenuItemCerrarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarPedidoProdu"));
			
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jMenuItemDetalleCerrarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarPedidoProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosPedidoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosPedidoProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarPedidoProdu"));
		}
		
		this.jButtonCopiarToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarPedidoProdu"));
			
		this.jButtonVerFormToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarPedidoProdu"));
		
		this.jMenuItemGuardarCambiosPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosPedidoProdu"));
			
		this.jMenuItemCopiarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarPedidoProdu"));		
		
		this.jMenuItemVerFormPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormPedidoProdu"));		
		
		
		this.jButtonGuardarCambiosTablaPedidoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPedidoProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarPedidoProdu"));
			
		this.jMenuItemGuardarCambiosTablaPedidoProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaPedidoProdu"));		
		
		
		
		this.jButtonRecargarInformacionPedidoProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionPedidoProdu"));
					
		this.jButtonRecargarInformacionToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarPedidoProdu"));
		
		this.jMenuItemRecargarInformacionPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionPedidoProdu"));		
		
		
		
		this.jButtonAnterioresPedidoProdu.addActionListener (new ButtonActionListener(this,"AnterioresPedidoProdu"));
		
		
		this.jButtonAnterioresToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarPedidoProdu"));
		
		this.jMenuItemAnterioresPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresPedidoProdu"));		
		
		
		this.jButtonSiguientesPedidoProdu.addActionListener (new ButtonActionListener(this,"SiguientesPedidoProdu"));
		
		
		this.jButtonSiguientesToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarPedidoProdu"));
			
		this.jMenuItemSiguientesPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesPedidoProdu"));
			
		this.jMenuItemAbrirOrderByPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByPedidoProdu"));
			
		this.jMenuItemMostrarOcultarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarPedidoProdu"));
			
		this.jMenuItemDetalleAbrirOrderByPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByPedidoProdu"));
			
		this.jMenuItemDetalleMostarOcultarPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarPedidoProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosPedidoProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosPedidoProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarPedidoProdu"));
			
		this.jMenuItemNuevoGuardarCambiosPedidoProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosPedidoProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosPedidoProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosPedidoProdu"));

		this.jCheckBoxSeleccionadosPedidoProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosPedidoProdu"));
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioPedidoProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesPedidoProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesPedidoProdu"));
			
		this.jComboBoxTiposAccionesPedidoProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesPedidoProdu"));
					
		this.jComboBoxTiposSeleccionarPedidoProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarPedidoProdu"));
			
		this.jTextFieldValorCampoGeneralPedidoProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralPedidoProdu"));		
		
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonidPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"idPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empresaPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empresaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_sucursalPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_sucursalPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_ejercicioPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_ejercicioPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_periodoPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_periodoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_formatoPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_formatoPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_formatoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empleado_responsablePedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_responsablePedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empleado_responsablePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_responsablePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonsecuencialPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"secuencialPedidoProduBusqueda"));
		//jButtonid_clientePedidoProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clientePedidoProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProdu.addActionListener(new ButtonActionListener(this,"id_clientePedidoProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_clientePedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtondireccion_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"direccion_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtontelefono_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"telefono_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonruc_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonlotePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"lotePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfecha_pedidoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pedidoPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfecha_entregaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtones_uso_internoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"es_uso_internoPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfechaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fechaPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtondescripcionPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_estado_orden_produPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_estado_orden_produPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_estado_orden_produPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_orden_produPedidoProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClientePedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdClientePedidoProdu"));

			this.jButtonBuscarFK_IdClienteid_clientePedidoProdu.addActionListener(new ButtonActionListener(this,"id_clientePedidoProdu"));

			this.jButtonFK_IdEmpleadoResponsablePedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoResponsablePedidoProdu"));

			this.jButtonFK_IdEstadoOrdenProduPedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdEstadoOrdenProduPedidoProdu"));

			this.jButtonFK_IdFormatoPedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdFormatoPedidoProdu"));

			this.jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrioridadEmpresaProduPedidoProdu"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoPedidoProdu!=null) {
				this.jInternalFrameReporteDinamicoPedidoProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidoProdu"));
				this.jInternalFrameReporteDinamicoPedidoProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidoProdu"));
				this.jInternalFrameReporteDinamicoPedidoProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidoProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoPedidoProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoPedidoProdu"));				
			//this.jButtonGenerarReporteDinamicoPedidoProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoPedidoProdu"));
			//this.jButtonGenerarExcelReporteDinamicoPedidoProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoPedidoProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionPedidoProdu!=null) {
				this.jInternalFrameImportacionPedidoProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionPedidoProdu"));
				this.jInternalFrameImportacionPedidoProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionPedidoProdu"));
				this.jInternalFrameImportacionPedidoProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionPedidoProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByPedidoProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByPedidoProdu"));
			
			this.jButtonAbrirOrderByToolBarPedidoProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarPedidoProdu"));			
			
			if(this.jInternalFrameOrderByPedidoProdu!=null) {
				this.jInternalFrameOrderByPedidoProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByPedidoProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormPedidoProdu.jTabbedPaneRelacionesPedidoProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesPedidoProdu"));
		
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
            		closingInternalFramePedidoProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormPedidoProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormPedidoProdu = (JInternalFrameBase)event.getSource();
	            	
	            PedidoProduBeanSwingJInternalFrame jInternalFrameParent=(PedidoProduBeanSwingJInternalFrame)jInternalFrameDetalleFormPedidoProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarPedidoProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosPedidoProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosPedidoProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosPedidoProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosPedidoProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoPedidoProdu";
		inputMap = this.jButtonNuevoPedidoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoPedidoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPedidoProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoPedidoProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesPedidoProdu";
		inputMap = this.jButtonNuevoRelacionesPedidoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesPedidoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoPedidoProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarPedidoProdu";
		inputMap = this.jButtonModificarPedidoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarPedidoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarPedidoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarPedidoProdu";
		inputMap = this.jButtonActualizarPedidoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarPedidoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarPedidoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarPedidoProdu";
		inputMap = this.jButtonEliminarPedidoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarPedidoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarPedidoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarPedidoProdu";
		inputMap = this.jButtonCancelarPedidoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarPedidoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarPedidoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarPedidoProdu";
		inputMap = this.jButtonCerrarPedidoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarPedidoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarPedidoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosPedidoProdu";
		inputMap = this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosPedidoProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormPedidoProdu.jButtonGuardarCambiosPedidoProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosPedidoProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosPedidoProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosPedidoProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesPedidoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesPedidoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarPedidoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarPedidoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralPedidoProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralPedidoProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonidPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"idPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empresaPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empresaPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empresaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_sucursalPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_sucursalPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_ejercicioPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_ejercicioPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_periodoPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_periodoPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_periodoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_formatoPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_formatoPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_formatoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_formatoPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_tipo_prioridad_empresa_produPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_tipo_prioridad_empresa_produPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_prioridad_empresa_produPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empleado_responsablePedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_empleado_responsablePedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_empleado_responsablePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_empleado_responsablePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonsecuencialPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"secuencialPedidoProduBusqueda"));
		//jButtonid_clientePedidoProdu.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clientePedidoProduActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProdu.addActionListener(new ButtonActionListener(this,"id_clientePedidoProdu"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_clientePedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtondireccion_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"direccion_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtontelefono_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"telefono_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonruc_clientePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"ruc_clientePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonlotePedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"lotePedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfecha_pedidoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pedidoPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfecha_entregaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtones_uso_internoPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"es_uso_internoPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonfechaPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"fechaPedidoProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtondescripcionPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"descripcionPedidoProduBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_estado_orden_produPedidoProduUpdate.addActionListener(new ButtonActionListener(this,"id_estado_orden_produPedidoProduUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormPedidoProdu.jButtonid_estado_orden_produPedidoProduBusqueda.addActionListener(new ButtonActionListener(this,"id_estado_orden_produPedidoProduBusqueda"));
		
		
		this.jButtonFK_IdClientePedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdClientePedidoProdu"));

		this.jButtonBuscarFK_IdClienteid_clientePedidoProdu.addActionListener(new ButtonActionListener(this,"id_clientePedidoProdu"));

		this.jButtonFK_IdEmpleadoResponsablePedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoResponsablePedidoProdu"));

		this.jButtonFK_IdEstadoOrdenProduPedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdEstadoOrdenProduPedidoProdu"));

		this.jButtonFK_IdFormatoPedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdFormatoPedidoProdu"));

		this.jButtonFK_IdTipoPrioridadEmpresaProduPedidoProdu.addActionListener(new ButtonActionListener(this,"FK_IdTipoPrioridadEmpresaProduPedidoProdu"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionPedidoProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionPedidoProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarPedidoProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarPedidoProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosPedidoProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
					pedidoproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidoProdu pedidoproduAux:pedidoprodus) {
					pedidoproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosPedidoProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPedidoProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
						pedidoproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidoProdu pedidoproduAux:pedidoprodus) {
						pedidoproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
					
						if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO)) {
							existe=true;
							pedidoproduAux.setes_uso_interno(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidoProdu pedidoproduAux:pedidoprodus) {
						
						if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO)) {
							existe=true;
							pedidoproduAux.setes_uso_interno(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaPedidoProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPedidoProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPedidoProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosPedidoProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingPedidoProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosPedidoProdu.getSelectedRows();
			
			PedidoProdu pedidoproduLocal=new PedidoProdu();
			
			//this.seleccionarTodosPedidoProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					pedidoproduLocal =(PedidoProdu) this.pedidoproduLogic.getPedidoProdus().toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					pedidoproduLocal =(PedidoProdu) this.pedidoprodus.toArray()[this.jTableDatosPedidoProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				pedidoproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
						pedidoproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(PedidoProdu pedidoproduAux:pedidoprodus) {
						pedidoproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaPedidoProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosPedidoProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosPedidoProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosPedidoProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualPedidoProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarPedidoProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralPedidoProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingPedidoProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralPedidoProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(PedidoProdu pedidoproduAux:this.pedidoproduLogic.getPedidoProdus()) {
				
						if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							pedidoproduAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE)) {
							existe=true;
							pedidoproduAux.setdireccion_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE)) {
							existe=true;
							pedidoproduAux.settelefono_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							pedidoproduAux.setruc_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							pedidoproduAux.setlote(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO)) {
							existe=true;
							pedidoproduAux.setfecha_pedido(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							pedidoproduAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							pedidoproduAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							pedidoproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidoProdu pedidoproduAux:pedidoprodus) {
					
						if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							pedidoproduAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE)) {
							existe=true;
							pedidoproduAux.setdireccion_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE)) {
							existe=true;
							pedidoproduAux.settelefono_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_RUCCLIENTE)) {
							existe=true;
							pedidoproduAux.setruc_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_LOTE)) {
							existe=true;
							pedidoproduAux.setlote(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO)) {
							existe=true;
							pedidoproduAux.setfecha_pedido(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							pedidoproduAux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							pedidoproduAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							pedidoproduAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaPedidoProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesPedidoProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingPedidoProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioPedidoProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesPedidoProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReportePedidoProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessPedidoProdu(conSplash);
				
					this.generarReportePedidoProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoPedidoProdusSeleccionados();
				//this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPedidoProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoPedidoProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPedidoProdu();
				
				this.exportarPedidoProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionPedidoProdus();
				//this.importarPedidoProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessPedidoProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelPedidoProdusSeleccionados();
				//this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Pedido Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessPedidoProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoPedidoProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyPedidoProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.setSelectedIndex(0);					
				}	
			} 			
			else if(PedidoProduBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReportePedidoProdu) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessPedidoProdu(conSplash);
					
						//this.actualizarParametrosGeneralPedidoProdu();
						
						this.generarReporteProcesoAccionPedidoProdusSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(PedidoProduBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Pedido ProduccionES SELECCIONADOS?", "MANTENIMIENTO DE Pedido Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessPedidoProdu();
				
						this.actualizarParametrosGeneralPedidoProdu();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.pedidoproduReturnGeneral=pedidoproduLogic.procesarAccionPedidoProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.pedidoproduLogic.getPedidoProdus(),this.pedidoproduParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarPedidoProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralPedidoProdu();
					
					PedidoProduBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarPedidoProduReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesPedidoProdu.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormPedidoProdu.jComboBoxTiposAccionesFormularioPedidoProdu.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessPedidoProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesPedidoProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessPedidoProdu();
			
			if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		
			PedidoProdu pedidoprodu=new PedidoProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingPedidoProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesPedidoProdu.getSelectedItem();
			
			
			
			
			pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(pedidoprodusSeleccionados.size()==1) {
				for(PedidoProdu pedidoproduAux:pedidoprodusSeleccionados) {
					pedidoprodu=pedidoproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pedido Detalle Produccion")) {
					jButtonPedidoDetaProduActionPerformed(null,rowIndex,true,false,pedidoprodu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessPedidoProdu();
			
      		//this.finishProcessPedidoProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarPedidoProduReturnGeneral() throws Exception {
		if(this.pedidoproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.pedidoproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.pedidoproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.pedidoproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.pedidoproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.pedidoproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingPedidoProdu(false);
		}
		
		if(this.pedidoproduReturnGeneral.getConRetornoLista() || this.pedidoproduReturnGeneral.getConRetornoObjeto()) {
			if(this.pedidoproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pedidoproduLogic.setPedidoProdus(this.pedidoproduReturnGeneral.getPedidoProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.pedidoproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.pedidoproduLogic.setPedidoProdu(this.pedidoproduReturnGeneral.getPedidoProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingPedidoProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralPedidoProdu() throws Exception {
		
		
	}
	
	public ArrayList<PedidoProdu> getPedidoProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioPedidoProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(PedidoProdu pedidoproduAux:pedidoproduLogic.getPedidoProdus()) {
					if(pedidoproduAux.getIsSelected()) {
						pedidoprodusSeleccionados.add(pedidoproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(PedidoProdu pedidoproduAux:this.pedidoprodus) {
					if(pedidoproduAux.getIsSelected()) {
						pedidoprodusSeleccionados.add(pedidoproduAux);				
					}
				}
			}
			
			if(pedidoprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						pedidoprodusSeleccionados.addAll(this.pedidoproduLogic.getPedidoProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						pedidoprodusSeleccionados.addAll(this.pedidoprodus);				
					}
				}
			}
		} else {
			pedidoprodusSeleccionados.add(this.pedidoprodu);
		}
		
		return pedidoprodusSeleccionados;
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
	
	public void generarReportePedidoProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalPedidoProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoPedidoProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPedidoProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoPedidoProdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesPedidoProdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Pedido Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesPedidoProdusSeleccionados() throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReportePedidoProdus("Todos",pedidoprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalPedidoProdusSeleccionados() throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReportePedidoProdus("Todos",pedidoprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionPedidoProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReportePedidoProdus("Todos",pedidoprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoPedidoProdusSeleccionados() throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoPedidoProdu();
		
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoPedidoProdu();
		
		
		//this.generarReportePedidoProdus("Todos",pedidoprodusSeleccionados ,pedidoproduImplementable,pedidoproduImplementableHome);
	}
	
	public void mostrarImportacionPedidoProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionPedidoProdu();
		
		this.abrirFrameImportacionPedidoProdu();		
		
			
		//this.generarReportePedidoProdus("Todos",pedidoprodusSeleccionados ,pedidoproduImplementable,pedidoproduImplementableHome);
	}
	
	public void importarPedidoProdus() throws Exception {		
	
	}
	
	public void exportarPedidoProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelPedidoProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoPedidoProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlPedidoProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Pedido Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoPedidoProdusSeleccionados() throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarPedidoProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(PedidoProdu pedidoproduAux:pedidoprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarPedidoProdu(pedidoproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//pedidoproduAux.setsDetalleGeneralEntityReporte(pedidoproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarPedidoProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDFORMATO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_RUCCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_LOTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_FECHAENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarPedidoProdu(PedidoProdu pedidoprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=pedidoprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getformato_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.gettipoprioridadempresaprodu_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getempleadoresponsable_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getdireccion_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.gettelefono_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getruc_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getlote();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getfecha_pedido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getfecha_entrega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getes_uso_interno().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=pedidoprodu.getestadoordenprodu_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelPedidoProdusSeleccionados() throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("PedidoProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelPedidoProdu(row);				
				iRow++;
			}				
			
			for(PedidoProdu pedidoproduAux:pedidoprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelPedidoProdu(pedidoproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlPedidoProdusSeleccionados() throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();		
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"pedidoprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("pedidoprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("pedidoprodu");
			//elementRoot.appendChild(element);
		
			for(PedidoProdu pedidoproduAux:pedidoprodusSeleccionados) {
				element = document.createElement("pedidoprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlPedidoProdu(pedidoproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Pedido Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelPedidoProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDFORMATO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_RUCCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_LOTE);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHAENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelPedidoProdu(PedidoProdu pedidoprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getformato_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.gettipoprioridadempresaprodu_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getempleadoresponsable_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getdireccion_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.gettelefono_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getruc_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getlote());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getfecha_pedido());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getfecha_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getes_uso_interno());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(pedidoprodu.getestadoordenprodu_descripcion());				
	}
	
	public void setFilaDatosExportarXmlPedidoProdu(PedidoProdu pedidoprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(PedidoProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(pedidoprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(PedidoProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(pedidoprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(PedidoProduConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(pedidoprodu.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(PedidoProduConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(pedidoprodu.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementejercicio_descripcion = document.createElement(PedidoProduConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(pedidoprodu.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(PedidoProduConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(pedidoprodu.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementformato_descripcion = document.createElement(PedidoProduConstantesFunciones.IDFORMATO);
		elementformato_descripcion.appendChild(document.createTextNode(pedidoprodu.getformato_descripcion()));
		element.appendChild(elementformato_descripcion);

		Element elementtipoprioridadempresaprodu_descripcion = document.createElement(PedidoProduConstantesFunciones.IDTIPOPRIORIDADEMPRESAPRODU);
		elementtipoprioridadempresaprodu_descripcion.appendChild(document.createTextNode(pedidoprodu.gettipoprioridadempresaprodu_descripcion()));
		element.appendChild(elementtipoprioridadempresaprodu_descripcion);

		Element elementempleadoresponsable_descripcion = document.createElement(PedidoProduConstantesFunciones.IDEMPLEADORESPONSABLE);
		elementempleadoresponsable_descripcion.appendChild(document.createTextNode(pedidoprodu.getempleadoresponsable_descripcion()));
		element.appendChild(elementempleadoresponsable_descripcion);

		Element elementsecuencial = document.createElement(PedidoProduConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(pedidoprodu.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementcliente_descripcion = document.createElement(PedidoProduConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(pedidoprodu.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementdireccion_cliente = document.createElement(PedidoProduConstantesFunciones.DIRECCIONCLIENTE);
		elementdireccion_cliente.appendChild(document.createTextNode(pedidoprodu.getdireccion_cliente().trim()));
		element.appendChild(elementdireccion_cliente);

		Element elementtelefono_cliente = document.createElement(PedidoProduConstantesFunciones.TELEFONOCLIENTE);
		elementtelefono_cliente.appendChild(document.createTextNode(pedidoprodu.gettelefono_cliente().trim()));
		element.appendChild(elementtelefono_cliente);

		Element elementruc_cliente = document.createElement(PedidoProduConstantesFunciones.RUCCLIENTE);
		elementruc_cliente.appendChild(document.createTextNode(pedidoprodu.getruc_cliente().trim()));
		element.appendChild(elementruc_cliente);

		Element elementlote = document.createElement(PedidoProduConstantesFunciones.LOTE);
		elementlote.appendChild(document.createTextNode(pedidoprodu.getlote().trim()));
		element.appendChild(elementlote);

		Element elementfecha_pedido = document.createElement(PedidoProduConstantesFunciones.FECHAPEDIDO);
		elementfecha_pedido.appendChild(document.createTextNode(pedidoprodu.getfecha_pedido().toString().trim()));
		element.appendChild(elementfecha_pedido);

		Element elementfecha_entrega = document.createElement(PedidoProduConstantesFunciones.FECHAENTREGA);
		elementfecha_entrega.appendChild(document.createTextNode(pedidoprodu.getfecha_entrega().toString().trim()));
		element.appendChild(elementfecha_entrega);

		Element elementes_uso_interno = document.createElement(PedidoProduConstantesFunciones.ESUSOINTERNO);
		elementes_uso_interno.appendChild(document.createTextNode(pedidoprodu.getes_uso_interno().toString().trim()));
		element.appendChild(elementes_uso_interno);

		Element elementfecha = document.createElement(PedidoProduConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(pedidoprodu.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementdescripcion = document.createElement(PedidoProduConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(pedidoprodu.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementestadoordenprodu_descripcion = document.createElement(PedidoProduConstantesFunciones.IDESTADOORDENPRODU);
		elementestadoordenprodu_descripcion.appendChild(document.createTextNode(pedidoprodu.getestadoordenprodu_descripcion()));
		element.appendChild(elementestadoordenprodu_descripcion);
	}
	
	public void generarReporteGroupGenericoPedidoProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<PedidoProdu> pedidoprodusSeleccionados=new ArrayList<PedidoProdu>();
		
		pedidoprodusSeleccionados=this.getPedidoProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoPedidoProdu(pedidoprodusSeleccionados);
		
		this.generarReportePedidoProdus("Todos",pedidoprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoPedidoProdu(ArrayList<PedidoProdu> pedidoprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(PedidoProdu pedidoproduAux:pedidoprodusSeleccionados) {
				pedidoproduAux.setsDetalleGeneralEntityReporte(pedidoproduAux.toString());
			
				if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDFORMATO)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getformato_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDTIPOPRIORIDADEMPRESAPRODU)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.gettipoprioridadempresaprodu_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDEMPLEADORESPONSABLE)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getempleadoresponsable_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_DIRECCIONCLIENTE)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getdireccion_cliente());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_TELEFONOCLIENTE)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.gettelefono_cliente());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_RUCCLIENTE)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getruc_cliente());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_LOTE)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getlote());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHAPEDIDO)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidoproduAux.getfecha_pedido()));
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHAENTREGA)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidoproduAux.getfecha_entrega()));
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_ESUSOINTERNO)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(pedidoproduAux.getes_uso_interno()));
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(pedidoproduAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(PedidoProduConstantesFunciones.LABEL_IDESTADOORDENPRODU)) {
					existe=true;
					pedidoproduAux.setsDescripcionGeneralEntityReporte1(pedidoproduAux.getestadoordenprodu_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,PedidoProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesPedidoProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoPedidoProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=true;
				this.isVisibilidadCeldaGuardarCambiosPedidoProdu=true;
			}
			
			this.isVisibilidadCeldaModificarPedidoProdu=false;
			this.isVisibilidadCeldaActualizarPedidoProdu=false;
			this.isVisibilidadCeldaEliminarPedidoProdu=false;
			this.isVisibilidadCeldaCancelarPedidoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoPedidoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=false;
			this.isVisibilidadCeldaModificarPedidoProdu=false;
			this.isVisibilidadCeldaActualizarPedidoProdu=true;
			this.isVisibilidadCeldaEliminarPedidoProdu=false;
			this.isVisibilidadCeldaCancelarPedidoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoPedidoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=false;
			this.isVisibilidadCeldaModificarPedidoProdu=false;
			this.isVisibilidadCeldaActualizarPedidoProdu=true;
			this.isVisibilidadCeldaEliminarPedidoProdu=true;
			this.isVisibilidadCeldaCancelarPedidoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoPedidoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=false;
			this.isVisibilidadCeldaModificarPedidoProdu=false;
			this.isVisibilidadCeldaActualizarPedidoProdu=true;
			this.isVisibilidadCeldaEliminarPedidoProdu=false;
			this.isVisibilidadCeldaCancelarPedidoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoPedidoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=true;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=true;
			this.isVisibilidadCeldaModificarPedidoProdu=false;
			this.isVisibilidadCeldaActualizarPedidoProdu=false;
			this.isVisibilidadCeldaEliminarPedidoProdu=false;
			this.isVisibilidadCeldaCancelarPedidoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoPedidoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=false;
			this.isVisibilidadCeldaActualizarPedidoProdu=false;
			this.isVisibilidadCeldaEliminarPedidoProdu=false;
			this.isVisibilidadCeldaCancelarPedidoProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoPedidoProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=false;
			this.isVisibilidadCeldaModificarPedidoProdu=true;
			this.isVisibilidadCeldaActualizarPedidoProdu=false;
			this.isVisibilidadCeldaEliminarPedidoProdu=false;
			this.isVisibilidadCeldaCancelarPedidoProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarPedidoProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(PedidoProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoPedidoProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=true;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=true;
		} else {
			this.actualizarEstadoPanelsPedidoProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarPedidoProdu=false;
			//this.isVisibilidadCeldaVerFormPedidoProdu=false;
			this.isVisibilidadCeldaDuplicarPedidoProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!pedidoproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoPedidoProdu=false;
			this.isVisibilidadCeldaGuardarCambiosPedidoProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(pedidoproduSessionBean.getEsGuardarRelacionado()) {
			if(!pedidoproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;												
			}
			
			this.jButtonCerrarPedidoProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesPedidoProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.pedidoprodu)) {
			this.isVisibilidadCeldaActualizarPedidoProdu=false;
			this.isVisibilidadCeldaEliminarPedidoProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesPedidoProdu() {
		this.isVisibilidadCeldaNuevoPedidoProdu=false;
		this.isVisibilidadCeldaGuardarCambiosPedidoProdu=false;
	}
	
	public void actualizarEstadoPanelsPedidoProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionPedidoProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidoProdu!=null) {
				this.jScrollPanelDatosPedidoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidoProdu!=null) {
				this.jPanelPaginacionPedidoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionPedidoProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosPedidoProdu!=null) {
				this.jScrollPanelDatosPedidoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidoProdu!=null) {
				this.jPanelPaginacionPedidoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionPedidoProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoProdu.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPedidoProdu!=null) {
				this.jScrollPanelDatosPedidoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidoProdu!=null) {
				this.jPanelPaginacionPedidoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionPedidoProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoProdu.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosPedidoProdu!=null) {
				this.jScrollPanelDatosPedidoProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionPedidoProdu!=null) {
				this.jPanelPaginacionPedidoProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionPedidoProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoProdu.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidoProdu!=null) {
				this.jScrollPanelDatosPedidoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidoProdu!=null) {
				this.jPanelPaginacionPedidoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionPedidoProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidoProdu!=null) {
				this.jScrollPanelDatosPedidoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidoProdu!=null) {
				this.jPanelPaginacionPedidoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionPedidoProdu!=null) {
				this.jScrollPanelDatosEdicionPedidoProdu.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosPedidoProdu!=null) {
				this.jScrollPanelDatosPedidoProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionPedidoProdu!=null) {
				this.jPanelPaginacionPedidoProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
					this.jTabbedPaneBusquedasPedidoProdu.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.pedidoproduSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasPedidoProdu!=null) {
				this.jTabbedPaneBusquedasPedidoProdu.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesPedidoProdu!=null) {
				this.jPanelParametrosReportesPedidoProdu.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdCliente=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdCliente=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaFormato(Boolean isParaFormato){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFormatoNegation=!isParaFormato;

			this.isVisibilidadFK_IdCliente=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaFormato;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaFormatoNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoPrioridadEmpresaProdu(Boolean isParaTipoPrioridadEmpresaProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoPrioridadEmpresaProduNegation=!isParaTipoPrioridadEmpresaProdu;

			this.isVisibilidadFK_IdCliente=isParaTipoPrioridadEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaTipoPrioridadEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaTipoPrioridadEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaTipoPrioridadEmpresaProduNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaTipoPrioridadEmpresaProdu;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleadoResponsable(Boolean isParaEmpleadoResponsable){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoResponsableNegation=!isParaEmpleadoResponsable;

			this.isVisibilidadFK_IdCliente=isParaEmpleadoResponsableNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaEmpleadoResponsable;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaEmpleadoResponsableNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaEmpleadoResponsableNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaEmpleadoResponsableNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstadoOrdenProdu(Boolean isParaEstadoOrdenProdu){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstadoOrdenProduNegation=!isParaEstadoOrdenProdu;

			this.isVisibilidadFK_IdCliente=isParaEstadoOrdenProduNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdClientePedidoProdu);}

			this.isVisibilidadFK_IdEmpleadoResponsable=isParaEstadoOrdenProduNegation;
			if(!this.isVisibilidadFK_IdEmpleadoResponsable) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEmpleadoResponsablePedidoProdu);}

			this.isVisibilidadFK_IdEstadoOrdenProdu=isParaEstadoOrdenProdu;
			if(!this.isVisibilidadFK_IdEstadoOrdenProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdEstadoOrdenProduPedidoProdu);}

			this.isVisibilidadFK_IdFormato=isParaEstadoOrdenProduNegation;
			if(!this.isVisibilidadFK_IdFormato) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdFormatoPedidoProdu);}

			this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu=isParaEstadoOrdenProduNegation;
			if(!this.isVisibilidadFK_IdTipoPrioridadEmpresaProdu) {this.jTabbedPaneBusquedasPedidoProdu.remove(jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);}
		}
		
	}
	
	

	public String registrarSesionPedidoProduParaPedidoDetaProdues() throws Exception {
		Boolean isPaginaPopupPedidoDetaProdu=false;

		try {

			if(this.pedidoproduSessionBean==null) {
				this.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean==null) {
				this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean=new PedidoDetaProduSessionBean();
			}

			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean.setsPathNavegacionActual(pedidoproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoDetaProduConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoDetaProdu=this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoDetaProdu(true);
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoDetaProdu(PedidoProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean.setisBusquedaDesdeForeignKeySesionPedidoProdu(true);
			this.jInternalFrameDetalleFormPedidoProdu.pedidodetaproduSessionBean.setlidPedidoProduActual(this.idPedidoProduActual);

			pedidoproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPedidoProdu(true);
			pedidoproduSessionBean.setlIdPedidoProduActualForeignKey(this.idPedidoProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	

	public String registrarSesionPedidoProduParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(pedidoproduSessionBean==null) {
				pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(pedidoproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.pedidoproduFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(PedidoProduConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionPedidoProdu(true);
			//clienteSessionBean.setlidPedidoProduActual(this.idPedidoProduActual);

			pedidoproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyPedidoProdu(true);
			pedidoproduSessionBean.setlIdPedidoProduActualForeignKey(this.idPedidoProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//PedidoProduSessionBean pedidoproduSessionBean=new PedidoProduSessionBean();
		
		if(this.pedidoproduSessionBean==null) {
			this.pedidoproduSessionBean=new PedidoProduSessionBean();
		}
		
		this.pedidoproduSessionBean.setsUltimaBusquedaPedidoProdu(this.getsAccionBusqueda());
		this.pedidoproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.pedidoproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			pedidoproduSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			pedidoproduSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoResponsable")) {
			pedidoproduSessionBean.setid_empleado_responsable(this.getid_empleado_responsableFK_IdEmpleadoResponsable());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			pedidoproduSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstadoOrdenProdu")) {
			pedidoproduSessionBean.setid_estado_orden_produ(this.getid_estado_orden_produFK_IdEstadoOrdenProdu());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
			pedidoproduSessionBean.setid_formato(this.getid_formatoFK_IdFormato());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
			pedidoproduSessionBean.setid_periodo(this.getid_periodoFK_IdPeriodo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			pedidoproduSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoPrioridadEmpresaProdu")) {
			pedidoproduSessionBean.setid_tipo_prioridad_empresa_produ(this.getid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//PedidoProduSessionBean pedidoproduSessionBean=new PedidoProduSessionBean();
		
		if(this.pedidoproduSessionBean==null) {
			this.pedidoproduSessionBean=new PedidoProduSessionBean();
		}
		
		if(this.pedidoproduSessionBean.getsUltimaBusquedaPedidoProdu()!=null&&!this.pedidoproduSessionBean.getsUltimaBusquedaPedidoProdu().equals("")) {
			this.setsAccionBusqueda(pedidoproduSessionBean.getsUltimaBusquedaPedidoProdu());
			this.setiNumeroPaginacion(pedidoproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(pedidoproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(pedidoproduSessionBean.getid_cliente());
				pedidoproduSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(pedidoproduSessionBean.getid_ejercicio());
				pedidoproduSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleadoResponsable")) {
				this.setid_empleado_responsableFK_IdEmpleadoResponsable(pedidoproduSessionBean.getid_empleado_responsable());
				pedidoproduSessionBean.setid_empleado_responsable(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(pedidoproduSessionBean.getid_empresa());
				pedidoproduSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstadoOrdenProdu")) {
				this.setid_estado_orden_produFK_IdEstadoOrdenProdu(pedidoproduSessionBean.getid_estado_orden_produ());
				pedidoproduSessionBean.setid_estado_orden_produ(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdFormato")) {
				this.setid_formatoFK_IdFormato(pedidoproduSessionBean.getid_formato());
				pedidoproduSessionBean.setid_formato(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPeriodo")) {
				this.setid_periodoFK_IdPeriodo(pedidoproduSessionBean.getid_periodo());
				pedidoproduSessionBean.setid_periodo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(pedidoproduSessionBean.getid_sucursal());
				pedidoproduSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoPrioridadEmpresaProdu")) {
				this.setid_tipo_prioridad_empresa_produFK_IdTipoPrioridadEmpresaProdu(pedidoproduSessionBean.getid_tipo_prioridad_empresa_produ());
				pedidoproduSessionBean.setid_tipo_prioridad_empresa_produ(-1L);
			}
		}
		
		this.pedidoproduSessionBean.setsUltimaBusquedaPedidoProdu("");
		this.pedidoproduSessionBean.setiNumeroPaginacion(PedidoProduConstantesFunciones.INUMEROPAGINACION);
		this.pedidoproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaPedidoProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioPedidoProdu() {
		this.updateBorderResaltarBusquedasFormularioPedidoProdu();
		this.updateVisibilidadBusquedasFormularioPedidoProdu();
		this.updateHabilitarBusquedasFormularioPedidoProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioPedidoProdu() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasPedidoProdu.getComponents().length>0) {
	

		if(this.pedidoproduConstantesFunciones.resaltarFK_IdClientePedidoProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdClientePedidoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdClientePedidoProdu);
			}
		}

		if(this.pedidoproduConstantesFunciones.resaltarFK_IdEmpleadoResponsablePedidoProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdEmpleadoResponsablePedidoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdEmpleadoResponsablePedidoProdu);
			}
		}

		if(this.pedidoproduConstantesFunciones.resaltarFK_IdEstadoOrdenProduPedidoProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdEstadoOrdenProduPedidoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdEstadoOrdenProduPedidoProdu);
			}
		}

		if(this.pedidoproduConstantesFunciones.resaltarFK_IdFormatoPedidoProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdFormatoPedidoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdFormatoPedidoProdu);
			}
		}

		if(this.pedidoproduConstantesFunciones.resaltarFK_IdTipoPrioridadEmpresaProduPedidoProdu!=null) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdTipoPrioridadEmpresaProduPedidoProdu);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioPedidoProdu() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasPedidoProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdClientePedidoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidoproduConstantesFunciones.mostrarFK_IdClientePedidoProdu);
			if(!this.pedidoproduConstantesFunciones.mostrarFK_IdClientePedidoProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdEmpleadoResponsablePedidoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidoproduConstantesFunciones.mostrarFK_IdEmpleadoResponsablePedidoProdu);
			if(!this.pedidoproduConstantesFunciones.mostrarFK_IdEmpleadoResponsablePedidoProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdEstadoOrdenProduPedidoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidoproduConstantesFunciones.mostrarFK_IdEstadoOrdenProduPedidoProdu);
			if(!this.pedidoproduConstantesFunciones.mostrarFK_IdEstadoOrdenProduPedidoProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdFormatoPedidoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidoproduConstantesFunciones.mostrarFK_IdFormatoPedidoProdu);
			if(!this.pedidoproduConstantesFunciones.mostrarFK_IdFormatoPedidoProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoProdu.remove(index);
			}

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);
			jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.pedidoproduConstantesFunciones.mostrarFK_IdTipoPrioridadEmpresaProduPedidoProdu);
			if(!this.pedidoproduConstantesFunciones.mostrarFK_IdTipoPrioridadEmpresaProduPedidoProdu && index>-1) {
				this.jTabbedPaneBusquedasPedidoProdu.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioPedidoProdu() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasPedidoProdu.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdClientePedidoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidoproduConstantesFunciones.activarFK_IdClientePedidoProdu);
				this.jTabbedPaneBusquedasPedidoProdu.setEnabledAt(index,this.pedidoproduConstantesFunciones.activarFK_IdClientePedidoProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdEmpleadoResponsablePedidoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidoproduConstantesFunciones.activarFK_IdEmpleadoResponsablePedidoProdu);
				this.jTabbedPaneBusquedasPedidoProdu.setEnabledAt(index,this.pedidoproduConstantesFunciones.activarFK_IdEmpleadoResponsablePedidoProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdEstadoOrdenProduPedidoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidoproduConstantesFunciones.activarFK_IdEstadoOrdenProduPedidoProdu);
				this.jTabbedPaneBusquedasPedidoProdu.setEnabledAt(index,this.pedidoproduConstantesFunciones.activarFK_IdEstadoOrdenProduPedidoProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdFormatoPedidoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidoproduConstantesFunciones.activarFK_IdFormatoPedidoProdu);
				this.jTabbedPaneBusquedasPedidoProdu.setEnabledAt(index,this.pedidoproduConstantesFunciones.activarFK_IdFormatoPedidoProdu);
			}

			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.pedidoproduConstantesFunciones.activarFK_IdTipoPrioridadEmpresaProduPedidoProdu);
				this.jTabbedPaneBusquedasPedidoProdu.setEnabledAt(index,this.pedidoproduConstantesFunciones.activarFK_IdTipoPrioridadEmpresaProduPedidoProdu);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaPedidoProdu(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdClientePedidoProdu);

			this.jTabbedPaneBusquedasPedidoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);

			this.pedidoproduConstantesFunciones.setResaltarFK_IdClientePedidoProdu(resaltar);

			jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdClientePedidoProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleadoResponsable")) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdEmpleadoResponsablePedidoProdu);

			this.jTabbedPaneBusquedasPedidoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);

			this.pedidoproduConstantesFunciones.setResaltarFK_IdEmpleadoResponsablePedidoProdu(resaltar);

			jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdEmpleadoResponsablePedidoProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstadoOrdenProdu")) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdEstadoOrdenProduPedidoProdu);

			this.jTabbedPaneBusquedasPedidoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);

			this.pedidoproduConstantesFunciones.setResaltarFK_IdEstadoOrdenProduPedidoProdu(resaltar);

			jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdEstadoOrdenProduPedidoProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdFormato")) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdFormatoPedidoProdu);

			this.jTabbedPaneBusquedasPedidoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);

			this.pedidoproduConstantesFunciones.setResaltarFK_IdFormatoPedidoProdu(resaltar);

			jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdFormatoPedidoProdu);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoPrioridadEmpresaProdu")) {
			index= this.jTabbedPaneBusquedasPedidoProdu.indexOfComponent(this.jPanelFK_IdTipoPrioridadEmpresaProduPedidoProdu);

			this.jTabbedPaneBusquedasPedidoProdu.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasPedidoProdu.getComponent(index);

			this.pedidoproduConstantesFunciones.setResaltarFK_IdTipoPrioridadEmpresaProduPedidoProdu(resaltar);

			jPanel.setBorder(this.pedidoproduConstantesFunciones.resaltarFK_IdTipoPrioridadEmpresaProduPedidoProdu);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarPedidoProdu.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioPedidoProdu() throws Exception {

		if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioPedidoProdu();
		this.updateVisibilidadResaltarControlesFormularioPedidoProdu();
		this.updateHabilitarResaltarControlesFormularioPedidoProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioPedidoProdu() throws Exception {
		if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.pedidoproduConstantesFunciones.resaltaridPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltaridPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_empresaPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_empresaPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_sucursalPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_sucursalPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_ejercicioPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_ejercicioPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_periodoPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_periodoPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_formatoPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_formatoPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_tipo_prioridad_empresa_produPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_tipo_prioridad_empresa_produPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_empleado_responsablePedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_empleado_responsablePedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarsecuencialPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jTextFieldsecuencialPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarsecuencialPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_clientePedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_clientePedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltardireccion_clientePedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jTextAreadireccion_clientePedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltardireccion_clientePedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltartelefono_clientePedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jTextFieldtelefono_clientePedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltartelefono_clientePedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarruc_clientePedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jTextFieldruc_clientePedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarruc_clientePedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarlotePedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jTextFieldlotePedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarlotePedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarfecha_pedidoPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_pedidoPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarfecha_pedidoPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarfecha_entregaPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_entregaPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarfecha_entregaPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltares_uso_internoPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.setBorderPainted(true);this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltares_uso_internoPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarfechaPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfechaPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarfechaPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltardescripcionPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jTextAreadescripcionPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltardescripcionPedidoProdu);}
		if(this.pedidoproduConstantesFunciones.resaltarid_estado_orden_produPedidoProdu!=null && this.jInternalFrameDetalleFormPedidoProdu!=null) {this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setBorder(this.pedidoproduConstantesFunciones.resaltarid_estado_orden_produPedidoProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioPedidoProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
	
		//this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostraridPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelidPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostraridPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_empresaPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_empresaPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_empresaPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_sucursalPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_sucursalPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_sucursalPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_ejercicioPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_ejercicioPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_ejercicioPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_periodoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_periodoPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_periodoPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_formatoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_formatoPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_formatoPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_tipo_prioridad_empresa_produPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_tipo_prioridad_empresa_produPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_tipo_prioridad_empresa_produPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_empleado_responsablePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_empleado_responsablePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_empleado_responsablePedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jTextFieldsecuencialPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarsecuencialPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelsecuencialPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarsecuencialPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_clientePedidoProdu);
			this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_clientePedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jTextAreadireccion_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrardireccion_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPaneldireccion_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrardireccion_clientePedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jTextFieldtelefono_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrartelefono_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPaneltelefono_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrartelefono_clientePedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jTextFieldruc_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarruc_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelruc_clientePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarruc_clientePedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jTextFieldlotePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarlotePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanellotePedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarlotePedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_pedidoPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarfecha_pedidoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelfecha_pedidoPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarfecha_pedidoPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_entregaPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarfecha_entregaPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelfecha_entregaPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarfecha_entregaPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrares_uso_internoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPaneles_uso_internoPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrares_uso_internoPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfechaPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarfechaPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelfechaPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarfechaPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jTextAreadescripcionPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrardescripcionPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPaneldescripcionPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrardescripcionPedidoProdu);
		//this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_estado_orden_produPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jPanelid_estado_orden_produPedidoProdu.setVisible(this.pedidoproduConstantesFunciones.mostrarid_estado_orden_produPedidoProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioPedidoProdu() throws Exception {
		if(this.jInternalFrameDetalleFormPedidoProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormPedidoProdu!=null) {
	
		this.jInternalFrameDetalleFormPedidoProdu.jLabelidPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activaridPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empresaPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_empresaPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_sucursalPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_sucursalPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_ejercicioPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_ejercicioPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_periodoPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_periodoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_formatoPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_formatoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_tipo_prioridad_empresa_produPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_tipo_prioridad_empresa_produPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_empleado_responsablePedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_empleado_responsablePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextFieldsecuencialPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarsecuencialPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_clientePedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_clientePedidoProdu);
			this.jInternalFrameDetalleFormPedidoProdu.jButtonid_clientePedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextAreadireccion_clientePedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activardireccion_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextFieldtelefono_clientePedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activartelefono_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextFieldruc_clientePedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarruc_clientePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextFieldlotePedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarlotePedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_pedidoPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarfecha_pedidoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfecha_entregaPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarfecha_entregaPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jCheckBoxes_uso_internoPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activares_uso_internoPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jDateChooserfechaPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarfechaPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jTextAreadescripcionPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activardescripcionPedidoProdu);
		this.jInternalFrameDetalleFormPedidoProdu.jComboBoxid_estado_orden_produPedidoProdu.setEnabled(this.pedidoproduConstantesFunciones.activarid_estado_orden_produPedidoProdu);
		}
	}
	
		
}