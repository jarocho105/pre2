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

//import com.bydan.erp.puntoventa.util.ComprobanteFacturaConstantesFunciones;
import com.bydan.erp.puntoventa.util.report.ComprobanteFacturaParameterReturnGeneral;
//import com.bydan.erp.puntoventa.util.report.ComprobanteFacturaParameterGeneral;
//import com.bydan.erp.puntoventa.presentation.report.source.report.ComprobanteFacturaBean;
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
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

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
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComprobanteFacturaBeanSwingJInternalFrame extends ComprobanteFacturaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComprobanteFacturaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComprobanteFactura> comprobantefacturaValidator = new ClassValidator<ComprobanteFactura>(ComprobanteFactura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComprobanteFactura comprobantefactura;	
	public ComprobanteFactura comprobantefacturaAux;
	public ComprobanteFactura comprobantefacturaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComprobanteFactura comprobantefacturaTotales;
	public Long idComprobanteFacturaActual;
	public Long iIdNuevoComprobanteFactura=0L;
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
	
	public Boolean isPermisoTodoComprobanteFactura;
	public Boolean isPermisoNuevoComprobanteFactura;
	public Boolean isPermisoActualizarComprobanteFactura;
	public Boolean isPermisoActualizarOriginalComprobanteFactura;
	public Boolean isPermisoEliminarComprobanteFactura;
	public Boolean isPermisoGuardarCambiosComprobanteFactura;
	public Boolean isPermisoConsultaComprobanteFactura;
	public Boolean isPermisoBusquedaComprobanteFactura;
	public Boolean isPermisoReporteComprobanteFactura;
	public Boolean isPermisoPaginacionMedioComprobanteFactura;
	public Boolean isPermisoPaginacionAltoComprobanteFactura;
	public Boolean isPermisoPaginacionTodoComprobanteFactura;
	public Boolean isPermisoCopiarComprobanteFactura;
	public Boolean isPermisoVerFormComprobanteFactura;
	public Boolean isPermisoDuplicarComprobanteFactura;
	public Boolean isPermisoOrdenComprobanteFactura;
	
	
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
	
	public ComprobanteFacturaParameterReturnGeneral comprobantefacturaReturnGeneral;
	public ComprobanteFacturaParameterReturnGeneral comprobantefacturaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComprobanteFactura=false;
	public Boolean esParaAccionDesdeFormularioComprobanteFactura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComprobanteFacturaSessionBeanAdditional comprobantefacturaSessionBeanAdditional=null;
	
	public ComprobanteFacturaSessionBeanAdditional getComprobanteFacturaSessionBeanAdditional() {
		return this.comprobantefacturaSessionBeanAdditional;
	}
	
	public void setComprobanteFacturaSessionBeanAdditional(ComprobanteFacturaSessionBeanAdditional comprobantefacturaSessionBeanAdditional) {
		try {
			this.comprobantefacturaSessionBeanAdditional=comprobantefacturaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComprobanteFacturaBeanSwingJInternalFrameAdditional comprobantefacturaBeanSwingJInternalFrameAdditional=null;
	//public class ComprobanteFacturaBeanSwingJInternalFrame
	
	public ComprobanteFacturaBeanSwingJInternalFrameAdditional getComprobanteFacturaBeanSwingJInternalFrameAdditional() {
		return this.comprobantefacturaBeanSwingJInternalFrameAdditional;
	}
	
	public void setComprobanteFacturaBeanSwingJInternalFrameAdditional(ComprobanteFacturaBeanSwingJInternalFrameAdditional comprobantefacturaBeanSwingJInternalFrameAdditional) {
		try {
			this.comprobantefacturaBeanSwingJInternalFrameAdditional=comprobantefacturaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComprobanteFacturaLogic comprobantefacturaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComprobanteFactura comprobantefacturaBean;
	public ComprobanteFacturaConstantesFunciones comprobantefacturaConstantesFunciones;
	//public ComprobanteFacturaParameterReturnGeneral comprobantefacturaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public VendedorLogic vendedorLogic;
	public CajaLogic cajaLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<ComprobanteFactura> comprobantefacturas;	
	//public List<ComprobanteFactura> comprobantefacturasEliminados;
	//public List<ComprobanteFactura> comprobantefacturasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComprobanteFactura=false;
	public Boolean isVisibilidadCeldaDuplicarComprobanteFactura=true;
	public Boolean isVisibilidadCeldaCopiarComprobanteFactura=true;
	public Boolean isVisibilidadCeldaVerFormComprobanteFactura=true;
	public Boolean isVisibilidadCeldaOrdenComprobanteFactura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
	public Boolean isVisibilidadCeldaModificarComprobanteFactura=false;
	public Boolean isVisibilidadCeldaActualizarComprobanteFactura=false;
	public Boolean isVisibilidadCeldaEliminarComprobanteFactura=false;
	public Boolean isVisibilidadCeldaCancelarComprobanteFactura=false;
	public Boolean isVisibilidadCeldaGuardarComprobanteFactura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;	
	
	
	public Boolean isVisibilidadBusquedaComprobanteFactura=false;
	public Boolean isVisibilidadFK_IdCaja=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoComprobanteFactura() {
		return this.iIdNuevoComprobanteFactura;
	}

	public void setiIdNuevoComprobanteFactura(Long iIdNuevoComprobanteFactura) {
		this.iIdNuevoComprobanteFactura = iIdNuevoComprobanteFactura;
	}
	
	public Long getidComprobanteFacturaActual() {
		return this.idComprobanteFacturaActual;
	}

	public void setidComprobanteFacturaActual(Long idComprobanteFacturaActual) {
		this.idComprobanteFacturaActual = idComprobanteFacturaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComprobanteFactura getcomprobantefactura() {
		return this.comprobantefactura;
	}

	public void setcomprobantefactura(ComprobanteFactura comprobantefactura) {
		this.comprobantefactura = comprobantefactura;
	}
	
	public ComprobanteFactura getcomprobantefacturaAux() {
		return this.comprobantefacturaAux;
	}

	public void setcomprobantefacturaAux(ComprobanteFactura comprobantefacturaAux) {
		this.comprobantefacturaAux = comprobantefacturaAux;
	}				
	
	public ComprobanteFactura getcomprobantefacturaAnterior() {
		return this.comprobantefacturaAnterior;
	}

	public void setcomprobantefacturaAnterior(ComprobanteFactura comprobantefacturaAnterior) {
		this.comprobantefacturaAnterior = comprobantefacturaAnterior;
	}	
	
	public ComprobanteFactura getcomprobantefacturaTotales() {
		return this.comprobantefacturaTotales;
	}

	public void setcomprobantefacturaTotales(ComprobanteFactura comprobantefacturaTotales) {
		this.comprobantefacturaTotales = comprobantefacturaTotales;
	}	
	
	public ComprobanteFactura getcomprobantefacturaBean() {
		return this.comprobantefacturaBean;
	}

	public void setcomprobantefacturaBean(ComprobanteFactura comprobantefacturaBean) {
		this.comprobantefacturaBean = comprobantefacturaBean;
	}	
	
	public ComprobanteFacturaParameterReturnGeneral getcomprobantefacturaReturnGeneral() {
		return this.comprobantefacturaReturnGeneral;
	}

	public void setcomprobantefacturaReturnGeneral(ComprobanteFacturaParameterReturnGeneral comprobantefacturaReturnGeneral) {
		this.comprobantefacturaReturnGeneral = comprobantefacturaReturnGeneral;
	}	
	
	
	public Long id_vendedorBusquedaComprobanteFactura=-1L;

	public Long getid_vendedorBusquedaComprobanteFactura() {
		return this.id_vendedorBusquedaComprobanteFactura;
	}

	public void setid_vendedorBusquedaComprobanteFactura(Long id_vendedorBusquedaComprobanteFactura) {
		this.id_vendedorBusquedaComprobanteFactura = id_vendedorBusquedaComprobanteFactura;
	}

;
	public Date fecha_inicioBusquedaComprobanteFactura=new Date();

	public Date getfecha_inicioBusquedaComprobanteFactura() {
		return this.fecha_inicioBusquedaComprobanteFactura;
	}

	public void setfecha_inicioBusquedaComprobanteFactura(Date fecha_inicioBusquedaComprobanteFactura) {
		this.fecha_inicioBusquedaComprobanteFactura = fecha_inicioBusquedaComprobanteFactura;
	}

;
	public Date fecha_finBusquedaComprobanteFactura=new Date();

	public Date getfecha_finBusquedaComprobanteFactura() {
		return this.fecha_finBusquedaComprobanteFactura;
	}

	public void setfecha_finBusquedaComprobanteFactura(Date fecha_finBusquedaComprobanteFactura) {
		this.fecha_finBusquedaComprobanteFactura = fecha_finBusquedaComprobanteFactura;
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

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComprobanteFacturaLogic getComprobanteFacturaLogic()	{		
		return comprobantefacturaLogic;
	}

	public void setComprobanteFacturaLogic(ComprobanteFacturaLogic comprobantefacturaLogic) {
		this.comprobantefacturaLogic = comprobantefacturaLogic;
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
	
	public Boolean getIsEsNuevoComprobanteFactura() {
		return isEsNuevoComprobanteFactura;
	}

	public void setIsEsNuevoComprobanteFactura(Boolean isEsNuevoComprobanteFactura) {
		this.isEsNuevoComprobanteFactura = isEsNuevoComprobanteFactura;
	}

	public Boolean getEsParaAccionDesdeFormularioComprobanteFactura() {
		return esParaAccionDesdeFormularioComprobanteFactura;
	}
	
	public void setEsParaAccionDesdeFormularioComprobanteFactura(Boolean esParaAccionDesdeFormularioComprobanteFactura) {
		this.esParaAccionDesdeFormularioComprobanteFactura = esParaAccionDesdeFormularioComprobanteFactura;
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

			if(this.comprobantefacturaSessionBean==null) {
				this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
			}

			if(!this.comprobantefacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comprobantefacturaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.comprobantefacturaSessionBean==null) {
				this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
			}

			if(!this.comprobantefacturaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(comprobantefacturaSessionBean.getlidVendedorActual());
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

			if(this.comprobantefacturaSessionBean==null) {
				this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
			}

			if(!this.comprobantefacturaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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
					cajaLogic.getEntityWithConnection(comprobantefacturaSessionBean.getlidCajaActual());
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

			if(this.comprobantefacturaSessionBean==null) {
				this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
			}

			if(!this.comprobantefacturaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
					clienteLogic.getEntityWithConnection(comprobantefacturaSessionBean.getlidClienteActual());
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

					if(this.comprobantefactura!=null) {
						this.comprobantefactura.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
						this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComprobanteFactura.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComprobanteFacturaGenerico)throws Exception
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
				jComboBoxid_empresaComprobanteFacturaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComprobanteFacturaGenerico!=null && jComboBoxid_empresaComprobanteFacturaGenerico.getItemCount()>0) {
					jComboBoxid_empresaComprobanteFacturaGenerico.setSelectedIndex(0);
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

					if(this.comprobantefactura!=null) {
						this.comprobantefactura.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
						this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorComprobanteFactura.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaComprobanteFactura") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura!=null) {
						jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura!=null) {
							//jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.getItemCount()>0) {
								jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setSelectedIndex(0);
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
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorComprobanteFacturaGenerico)throws Exception
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
				jComboBoxid_vendedorComprobanteFacturaGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorComprobanteFacturaGenerico!=null && jComboBoxid_vendedorComprobanteFacturaGenerico.getItemCount()>0) {
					jComboBoxid_vendedorComprobanteFacturaGenerico.setSelectedIndex(0);
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

					if(this.comprobantefactura!=null) {
						this.comprobantefactura.setCaja(cajaTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
						this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setSelectedItem(cajaTemp);
					}
				} else {
					//jComboBoxid_cajaComprobanteFactura.setSelectedItem(cajaTemp);
					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setSelectedIndex(0);
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
	public void setActualCajaForeignKeyGenerico(Long idCajaSeleccionado,JComboBox jComboBoxid_cajaComprobanteFacturaGenerico)throws Exception
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
				jComboBoxid_cajaComprobanteFacturaGenerico.setSelectedItem(cajaTemp);
			} else {
				if(jComboBoxid_cajaComprobanteFacturaGenerico!=null && jComboBoxid_cajaComprobanteFacturaGenerico.getItemCount()>0) {
					jComboBoxid_cajaComprobanteFacturaGenerico.setSelectedIndex(0);
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

					if(this.comprobantefactura!=null) {
						this.comprobantefactura.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
						this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteComprobanteFactura.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
						if(this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.getItemCount()>0) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setSelectedIndex(0);
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
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteComprobanteFacturaGenerico)throws Exception
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
				jComboBoxid_clienteComprobanteFacturaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteComprobanteFacturaGenerico!=null && jComboBoxid_clienteComprobanteFacturaGenerico.getItemCount()>0) {
					jComboBoxid_clienteComprobanteFacturaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComprobanteFactura comprobantefactura,JComboBox jComboBoxid_empresaComprobanteFacturaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComprobanteFacturaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComprobanteFacturaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comprobantefactura.setid_empresa(empresaAux.getId());
				comprobantefactura.setempresa_descripcion(ComprobanteFacturaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comprobantefactura.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ComprobanteFactura comprobantefactura,JComboBox jComboBoxid_vendedorComprobanteFacturaGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorComprobanteFacturaGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorComprobanteFacturaGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				comprobantefactura.setid_vendedor(vendedorAux.getId());
				comprobantefactura.setvendedor_descripcion(ComprobanteFacturaConstantesFunciones.getVendedorDescripcion(vendedorAux));
				comprobantefactura.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarCajaForeignKey(ComprobanteFactura comprobantefactura,JComboBox jComboBoxid_cajaComprobanteFacturaGenerico)throws Exception
	{
		try
		{
			Caja  cajaAux=new Caja();

			if(jComboBoxid_cajaComprobanteFacturaGenerico==null) {
				cajaAux=(Caja)this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.getSelectedItem();
			} else {
				cajaAux=(Caja)jComboBoxid_cajaComprobanteFacturaGenerico.getSelectedItem();
			}

			if(cajaAux!=null && cajaAux.getId()!=null) {
				comprobantefactura.setid_caja(cajaAux.getId());
				comprobantefactura.setcaja_descripcion(ComprobanteFacturaConstantesFunciones.getCajaDescripcion(cajaAux));
				comprobantefactura.setCaja(cajaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(ComprobanteFactura comprobantefactura,JComboBox jComboBoxid_clienteComprobanteFacturaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteComprobanteFacturaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteComprobanteFacturaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				comprobantefactura.setid_cliente(clienteAux.getId());
				comprobantefactura.setcliente_descripcion(ComprobanteFacturaConstantesFunciones.getClienteDescripcion(clienteAux));
				comprobantefactura.setCliente(clienteAux);			}
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

					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { 
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { 
					}

					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { 
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { 
					}

					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaComprobanteFactura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.addItem(vendedor);
							}
						}

						if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { 
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.removeAllItems();

							for(Caja caja:this.cajasForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.addItem(caja);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { 
					}

					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { 
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { 
					}

					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setSelectedItem(caja);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComprobanteFactura() throws Exception {
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
		
	public ComprobanteFacturaParameterReturnGeneral getComprobanteFacturaParameterGeneral() {
		return this.comprobantefacturaParameterGeneral;
	}
	
	public void setComprobanteFacturaParameterGeneral(ComprobanteFacturaParameterReturnGeneral comprobantefacturaParameterGeneral) {
		this.comprobantefacturaParameterGeneral = comprobantefacturaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComprobanteFactura() {
		return isPermisoTodoComprobanteFactura;
	}

	public void setIsPermisoTodoComprobanteFactura(Boolean isPermisoTodoComprobanteFactura) {
		this.isPermisoTodoComprobanteFactura = isPermisoTodoComprobanteFactura;
	}

	public Boolean getIsPermisoNuevoComprobanteFactura() {
		return isPermisoNuevoComprobanteFactura;
	}

	public void setIsPermisoNuevoComprobanteFactura(Boolean isPermisoNuevoComprobanteFactura) {
		this.isPermisoNuevoComprobanteFactura = isPermisoNuevoComprobanteFactura;
	}

	public Boolean getIsPermisoActualizarComprobanteFactura() {
		return isPermisoActualizarComprobanteFactura;
	}

	public void setIsPermisoActualizarComprobanteFactura(Boolean isPermisoActualizarComprobanteFactura) {
		this.isPermisoActualizarComprobanteFactura = isPermisoActualizarComprobanteFactura;
	}

	public Boolean getIsPermisoEliminarComprobanteFactura() {
		return isPermisoEliminarComprobanteFactura;
	}

	public void setIsPermisoEliminarComprobanteFactura(Boolean isPermisoEliminarComprobanteFactura) {
		this.isPermisoEliminarComprobanteFactura = isPermisoEliminarComprobanteFactura;
	}

	public Boolean getIsPermisoGuardarCambiosComprobanteFactura() {
		return isPermisoGuardarCambiosComprobanteFactura;
	}

	public void setIsPermisoGuardarCambiosComprobanteFactura(Boolean isPermisoGuardarCambiosComprobanteFactura) {
		this.isPermisoGuardarCambiosComprobanteFactura = isPermisoGuardarCambiosComprobanteFactura;
	}
	
	public Boolean getIsPermisoConsultaComprobanteFactura() {
		return isPermisoConsultaComprobanteFactura;
	}

	public void setIsPermisoConsultaComprobanteFactura(Boolean isPermisoConsultaComprobanteFactura) {
		this.isPermisoConsultaComprobanteFactura = isPermisoConsultaComprobanteFactura;
	}

	public Boolean getIsPermisoBusquedaComprobanteFactura() {
		return isPermisoBusquedaComprobanteFactura;
	}

	public void setIsPermisoBusquedaComprobanteFactura(Boolean isPermisoBusquedaComprobanteFactura) {
		this.isPermisoBusquedaComprobanteFactura = isPermisoBusquedaComprobanteFactura;
	}

	public Boolean getIsPermisoReporteComprobanteFactura() {
		return isPermisoReporteComprobanteFactura;
	}

	public void setIsPermisoReporteComprobanteFactura(Boolean isPermisoReporteComprobanteFactura) {
		this.isPermisoReporteComprobanteFactura = isPermisoReporteComprobanteFactura;
	}
	
	public Boolean getIsPermisoPaginacionMedioComprobanteFactura() {
		return isPermisoPaginacionMedioComprobanteFactura;
	}

	public void setIsPermisoPaginacionMedioComprobanteFactura(Boolean isPermisoPaginacionMedioComprobanteFactura) {
		this.isPermisoPaginacionMedioComprobanteFactura = isPermisoPaginacionMedioComprobanteFactura;
	}
	
	public Boolean getIsPermisoPaginacionTodoComprobanteFactura() {
		return isPermisoPaginacionTodoComprobanteFactura;
	}

	public void setIsPermisoPaginacionTodoComprobanteFactura(Boolean isPermisoPaginacionTodoComprobanteFactura) {
		this.isPermisoPaginacionTodoComprobanteFactura = isPermisoPaginacionTodoComprobanteFactura;
	}
	
	public Boolean getIsPermisoPaginacionAltoComprobanteFactura() {
		return isPermisoPaginacionAltoComprobanteFactura;
	}

	public void setIsPermisoPaginacionAltoComprobanteFactura(Boolean isPermisoPaginacionAltoComprobanteFactura) {
		this.isPermisoPaginacionAltoComprobanteFactura = isPermisoPaginacionAltoComprobanteFactura;
	}
	
	public Boolean getIsPermisoCopiarComprobanteFactura() {
		return isPermisoCopiarComprobanteFactura;
	}

	public void setIsPermisoCopiarComprobanteFactura(Boolean isPermisoCopiarComprobanteFactura) {
		this.isPermisoCopiarComprobanteFactura = isPermisoCopiarComprobanteFactura;
	}
	
	public Boolean getIsPermisoVerFormComprobanteFactura() {
		return isPermisoVerFormComprobanteFactura;
	}

	public void setIsPermisoVerFormComprobanteFactura(Boolean isPermisoVerFormComprobanteFactura) {
		this.isPermisoVerFormComprobanteFactura = isPermisoVerFormComprobanteFactura;
	}
	
	public Boolean getIsPermisoDuplicarComprobanteFactura() {
		return isPermisoDuplicarComprobanteFactura;
	}

	public void setIsPermisoDuplicarComprobanteFactura(Boolean isPermisoDuplicarComprobanteFactura) {
		this.isPermisoDuplicarComprobanteFactura = isPermisoDuplicarComprobanteFactura;
	}
	
	public Boolean getIsPermisoOrdenComprobanteFactura() {
		return isPermisoOrdenComprobanteFactura;
	}

	public void setIsPermisoOrdenComprobanteFactura(Boolean isPermisoOrdenComprobanteFactura) {
		this.isPermisoOrdenComprobanteFactura = isPermisoOrdenComprobanteFactura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComprobanteFactura() {
		return isVisibilidadCeldaNuevoComprobanteFactura;
	}

	public void setIsVisibilidadCeldaNuevoComprobanteFactura(Boolean isVisibilidadCeldaNuevoComprobanteFactura) {
		this.isVisibilidadCeldaNuevoComprobanteFactura = isVisibilidadCeldaNuevoComprobanteFactura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComprobanteFactura() {
		return isVisibilidadCeldaDuplicarComprobanteFactura;
	}

	public void setIsVisibilidadCeldaDuplicarComprobanteFactura(Boolean isVisibilidadCeldaDuplicarComprobanteFactura) {
		this.isVisibilidadCeldaDuplicarComprobanteFactura = isVisibilidadCeldaDuplicarComprobanteFactura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComprobanteFactura() {
		return isVisibilidadCeldaCopiarComprobanteFactura;
	}

	public void setIsVisibilidadCeldaCopiarComprobanteFactura(Boolean isVisibilidadCeldaCopiarComprobanteFactura) {
		this.isVisibilidadCeldaCopiarComprobanteFactura = isVisibilidadCeldaCopiarComprobanteFactura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComprobanteFactura() {
		return isVisibilidadCeldaVerFormComprobanteFactura;
	}

	public void setIsVisibilidadCeldaVerFormComprobanteFactura(Boolean isVisibilidadCeldaVerFormComprobanteFactura) {
		this.isVisibilidadCeldaVerFormComprobanteFactura = isVisibilidadCeldaVerFormComprobanteFactura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComprobanteFactura() {
		return isVisibilidadCeldaOrdenComprobanteFactura;
	}

	public void setIsVisibilidadCeldaOrdenComprobanteFactura(Boolean isVisibilidadCeldaOrdenComprobanteFactura) {
		this.isVisibilidadCeldaOrdenComprobanteFactura = isVisibilidadCeldaOrdenComprobanteFactura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComprobanteFactura() {
		return isVisibilidadCeldaNuevoRelacionesComprobanteFactura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComprobanteFactura(Boolean isVisibilidadCeldaNuevoRelacionesComprobanteFactura) {
		this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura = isVisibilidadCeldaNuevoRelacionesComprobanteFactura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComprobanteFactura() {
		return isVisibilidadCeldaModificarComprobanteFactura;
	}

	public void setIsVisibilidadCeldaModificarComprobanteFactura(Boolean isVisibilidadCeldaModificarComprobanteFactura) {
		this.isVisibilidadCeldaModificarComprobanteFactura = isVisibilidadCeldaModificarComprobanteFactura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComprobanteFactura() {
		return isVisibilidadCeldaActualizarComprobanteFactura;
	}

	public void setIsVisibilidadCeldaActualizarComprobanteFactura(Boolean isVisibilidadCeldaActualizarComprobanteFactura) {
		this.isVisibilidadCeldaActualizarComprobanteFactura = isVisibilidadCeldaActualizarComprobanteFactura;
	}

	public Boolean getIsVisibilidadCeldaEliminarComprobanteFactura() {
		return isVisibilidadCeldaEliminarComprobanteFactura;
	}

	public void setIsVisibilidadCeldaEliminarComprobanteFactura(Boolean isVisibilidadCeldaEliminarComprobanteFactura) {
		this.isVisibilidadCeldaEliminarComprobanteFactura = isVisibilidadCeldaEliminarComprobanteFactura;
	}

	public Boolean getIsVisibilidadCeldaCancelarComprobanteFactura() {
		return isVisibilidadCeldaCancelarComprobanteFactura;
	}

	public void setIsVisibilidadCeldaCancelarComprobanteFactura(Boolean isVisibilidadCeldaCancelarComprobanteFactura) {
		this.isVisibilidadCeldaCancelarComprobanteFactura = isVisibilidadCeldaCancelarComprobanteFactura;
	}

	public Boolean getIsVisibilidadCeldaGuardarComprobanteFactura() {
		return isVisibilidadCeldaGuardarComprobanteFactura;
	}

	public void setIsVisibilidadCeldaGuardarComprobanteFactura(Boolean isVisibilidadCeldaGuardarComprobanteFactura) {
		this.isVisibilidadCeldaGuardarComprobanteFactura = isVisibilidadCeldaGuardarComprobanteFactura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComprobanteFactura() {
		return isVisibilidadCeldaGuardarCambiosComprobanteFactura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComprobanteFactura(Boolean isVisibilidadCeldaGuardarCambiosComprobanteFactura) {
		this.isVisibilidadCeldaGuardarCambiosComprobanteFactura = isVisibilidadCeldaGuardarCambiosComprobanteFactura;
	}
		
	public ComprobanteFacturaSessionBean getcomprobantefacturaSessionBean() {
		return this.comprobantefacturaSessionBean;
	}
	
	public void setcomprobantefacturaSessionBean(ComprobanteFacturaSessionBean comprobantefacturaSessionBean) {
		this.comprobantefacturaSessionBean=comprobantefacturaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaComprobanteFactura() {
		return this.isVisibilidadBusquedaComprobanteFactura;
	}

	public void setisVisibilidadBusquedaComprobanteFactura(Boolean isVisibilidadBusquedaComprobanteFactura) {
		this.isVisibilidadBusquedaComprobanteFactura=isVisibilidadBusquedaComprobanteFactura;
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

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(ComprobanteFactura comprobantefactura)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comprobantefactura,null);
				this.setActualParaGuardarVendedorForeignKey(comprobantefactura,null);
				this.setActualParaGuardarCajaForeignKey(comprobantefactura,null);
				this.setActualParaGuardarClienteForeignKey(comprobantefactura,null);
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
	
	public void bugActualizarReferenciaActual(ComprobanteFactura comprobantefactura,ComprobanteFactura comprobantefacturaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComprobanteFactura(comprobantefactura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comprobantefacturaAux.setId(comprobantefactura.getId());
		comprobantefacturaAux.setVersionRow(comprobantefactura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(ComprobanteFactura comprobantefacturaLocal) throws Exception {
		
		if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComprobanteFactura comprobantefacturaLocal) throws Exception {	
		if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comprobantefacturaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				comprobantefacturaLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(CajaDetalleFormJInternalFrame.class)) {
				CajaBeanSwingJInternalFrame cajaBeanSwingJInternalFrameLocal=(CajaBeanSwingJInternalFrame) ((CajaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				cajaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCaja(cajaBeanSwingJInternalFrameLocal.getcaja(),true);
				cajaBeanSwingJInternalFrameLocal.actualizarLista(cajaBeanSwingJInternalFrameLocal.caja,this.cajasForeignKey);

				cajaBeanSwingJInternalFrameLocal.actualizarRelaciones(cajaBeanSwingJInternalFrameLocal.caja);

				comprobantefacturaLocal.setCaja(cajaBeanSwingJInternalFrameLocal.caja);

				this.addItemDefectoCombosForeignKeyCaja();
				this.cargarCombosFrameCajasForeignKey("Formulario");
				this.setActualCajaForeignKey(cajaBeanSwingJInternalFrameLocal.caja.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				comprobantefacturaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComprobanteFacturaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comprobantefacturaValidator.getInvalidValues(this.comprobantefactura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComprobanteFactura comprobantefactura,List<ComprobanteFactura> comprobantefacturas) throws Exception {
	}		
	
	public void actualizarSelectedLista(ComprobanteFactura comprobantefactura,List<ComprobanteFactura> comprobantefacturas) throws Exception {
		try	{			
			ComprobanteFacturaConstantesFunciones.actualizarSelectedLista(comprobantefactura,comprobantefacturas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComprobanteFactura> comprobantefacturasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comprobantefacturasLocal=this.comprobantefacturaLogic.getComprobanteFacturas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comprobantefacturasLocal=this.comprobantefacturas;
			}
			//ARCHITECTURE
		
			for(ComprobanteFactura comprobantefacturaLocal:comprobantefacturasLocal) {
				if(this.permiteMantenimiento(comprobantefacturaLocal) && comprobantefacturaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComprobanteFacturaConstantesFunciones.getComprobanteFacturaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.IDCAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelid_cajaComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelid_clienteComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.NOMBRECAJA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelnombre_cajaComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.SECUENCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelsecuencialComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfechaComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.CODIGOCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelcodigo_clienteComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelnombre_clienteComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.SUBTOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelsubtotalComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.IVA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelivaComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.DESCUENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabeldescuentoComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.FINANCIAMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfinanciamientoComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.FLETE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfleteComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.ICE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabeliceComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.TOTAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabeltotalComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.CANTIDADFORMASPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelcantidad_formas_pagoComprobanteFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComprobanteFacturaConstantesFunciones.DESCUENTOREAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabeldescuento_realComprobanteFactura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelid_cajaComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelid_clienteComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelnombre_cajaComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelsecuencialComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfechaComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelcodigo_clienteComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelnombre_clienteComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelsubtotalComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelivaComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabeldescuentoComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfinanciamientoComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfleteComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabeliceComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabeltotalComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabelcantidad_formas_pagoComprobanteFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComprobanteFactura.jLabeldescuento_realComprobanteFactura,"");
		
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
		this.iIdNuevoComprobanteFactura--;	
		
		
		this.comprobantefacturaAux=new ComprobanteFactura();
		
		this.comprobantefacturaAux.setId(this.iIdNuevoComprobanteFactura);
		this.comprobantefacturaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comprobantefacturaLogic.getComprobanteFacturas().add(this.comprobantefacturaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comprobantefacturas.add(this.comprobantefacturaAux);
		}
		//ARCHITECTURE
		
		this.comprobantefactura=this.comprobantefacturaAux;
		
		if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComprobanteFactura(this.comprobantefactura);
			this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFactura(this.comprobantefactura);
		}
				
		//this.setDefaultControlesComprobanteFactura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComprobanteFactura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComprobanteFactura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFactura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobanteFactura(this.comprobantefacturaBean,this.comprobantefactura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComprobanteFactura(this.comprobantefacturaReturnGeneral,this.comprobantefacturaBean,false);
		
		if(this.comprobantefacturaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFactura(this.comprobantefacturaReturnGeneral.getComprobanteFactura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComprobanteFactura(this.comprobantefacturaReturnGeneral.getComprobanteFactura());
		}
		
		if(this.comprobantefacturaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComprobanteFactura(this.comprobantefacturaReturnGeneral.getComprobanteFactura(),classes);//this.comprobantefacturaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComprobanteFactura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComprobanteFactura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.RecargarFormComprobanteFactura(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComprobanteFactura(false);
						
			if(comprobantefacturaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFactura();
			}
			
			this.actualizarVisualTableDatosComprobanteFactura();
			
			this.jTableDatosComprobanteFactura.setRowSelectionInterval(this.getIndiceNuevoComprobanteFactura(), this.getIndiceNuevoComprobanteFactura());
			
			this.seleccionarFilaTablaComprobanteFacturaActual();
						
			this.actualizarEstadoCeldasBotonesComprobanteFactura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComprobanteFactura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfecha_inicioComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarfecha_inicioComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfecha_finComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarfecha_finComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_cajaComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarnombre_cajaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsecuencialComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarsecuencialComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfechaComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarfechaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcodigo_clienteComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarcodigo_clienteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_clienteComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarnombre_clienteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsubtotalComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarsubtotalComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldivaComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarivaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuentoComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activardescuentoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfinanciamientoComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarfinanciamientoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfleteComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarfleteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldiceComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activariceComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldtotalComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activartotalComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcantidad_formas_pagoComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarcantidad_formas_pagoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuento_realComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activardescuento_realComprobanteFactura);	
		//
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarid_empresaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarid_vendedorComprobanteFactura);//
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarid_cajaComprobanteFactura);//
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setEnabled(isHabilitar && this.comprobantefacturaConstantesFunciones.activarid_clienteComprobanteFactura);
	};
	
	public void setDefaultControlesComprobanteFactura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComprobanteFactura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comprobantefacturaSessionBean.setConGuardarRelaciones(true);			
			this.comprobantefacturaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.setVisible(true);
			
					
		} else {
			//this.comprobantefacturaSessionBean.setConGuardarRelaciones(false);			
			this.comprobantefacturaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComprobanteFactura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
				if(comprobantefacturaAux.getId().equals(this.iIdNuevoComprobanteFactura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturas) {
				if(comprobantefacturaAux.getId().equals(this.iIdNuevoComprobanteFactura)) {
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
	
	public int getIndiceActualComprobanteFactura(ComprobanteFactura comprobantefactura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
				if(comprobantefacturaAux.getId().equals(comprobantefactura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturas) {
				if(comprobantefacturaAux.getId().equals(comprobantefactura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComprobanteFactura(ComprobanteFactura comprobantefacturaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
				if(comprobantefacturaAux.getComprobanteFacturaOriginal().getId().equals(comprobantefacturaOriginal.getId())) {
					existe=true;
					comprobantefacturaOriginal.setId(comprobantefacturaAux.getId());
					comprobantefacturaOriginal.setVersionRow(comprobantefacturaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturas) {
				if(comprobantefacturaAux.getComprobanteFacturaOriginal().getId().equals(comprobantefacturaOriginal.getId())) {
					existe=true;
					comprobantefacturaOriginal.setId(comprobantefacturaAux.getId());
					comprobantefacturaOriginal.setVersionRow(comprobantefacturaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComprobanteFactura(Boolean esParaCancelar) throws Exception {
		comprobantefacturasAux=new ArrayList<ComprobanteFactura>();
		comprobantefacturaAux=new ComprobanteFactura();
		
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
					if(comprobantefacturaAux.getId()<0) {
						comprobantefacturasAux.add(comprobantefacturaAux);
					}		
				}
				this.iIdNuevoComprobanteFactura=0L;
				this.comprobantefacturaLogic.getComprobanteFacturas().removeAll(comprobantefacturasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturas) {
					if(comprobantefacturaAux.getId()<0) {
						comprobantefacturasAux.add(comprobantefacturaAux);
					}		
				}
				this.iIdNuevoComprobanteFactura=0L;
				this.comprobantefacturas.removeAll(comprobantefacturasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComprobanteFactura 
					&& this.comprobantefacturaLogic.getComprobanteFacturas().size()>0
					) {
					comprobantefacturaAux=this.comprobantefacturaLogic.getComprobanteFacturas().get(this.comprobantefacturaLogic.getComprobanteFacturas().size() - 1);
				
					if(comprobantefacturaAux.getId()<0) {
						this.comprobantefacturaLogic.getComprobanteFacturas().remove(comprobantefacturaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComprobanteFactura && this.comprobantefacturas.size()>0) {
					comprobantefacturaAux=this.comprobantefacturas.get(this.comprobantefacturas.size() - 1);
				
					if(comprobantefacturaAux.getId()<0) {
						this.comprobantefacturas.remove(comprobantefacturaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComprobanteFactura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comprobantefactura.getId()<0) {
				this.comprobantefacturaLogic.getComprobanteFacturas().remove(this.comprobantefactura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comprobantefactura.getId()<0) {
				this.comprobantefacturas.remove(this.comprobantefactura);
			}
		}			
	}
	
	public void setEstadosInicialesComprobanteFactura(List<ComprobanteFactura> comprobantefacturasAux) throws Exception {
		ComprobanteFacturaConstantesFunciones.setEstadosInicialesComprobanteFactura(comprobantefacturasAux);
	}
	
	public void setEstadosInicialesComprobanteFactura(ComprobanteFactura comprobantefacturaAux) throws Exception {
		ComprobanteFacturaConstantesFunciones.setEstadosInicialesComprobanteFactura(comprobantefacturaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComprobanteFacturaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComprobanteFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComprobanteFacturaActual()) {
				if(!this.isEsNuevoComprobanteFactura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComprobanteFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComprobanteFactura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComprobanteFacturaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comprobante Factura ?", "MANTENIMIENTO DE Comprobante Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComprobanteFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComprobanteFactura comprobantefactura) throws Exception {
		ComprobanteFacturaConstantesFunciones.seleccionarAsignar(this.comprobantefactura,comprobantefactura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComprobanteFactura=this.isPermisoActualizarOriginalComprobanteFactura;
			
			
			this.seleccionarAsignar(comprobantefactura);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesComprobanteFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comprobantefacturaSessionBean.setsFuncionBusquedaRapida(this.comprobantefacturaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComprobanteFactura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComprobanteFactura(esParaCancelar);				
				this.cancelarNuevoComprobanteFactura(esParaCancelar);								
			}
			
			this.comprobantefactura=new ComprobanteFactura();
			
			this.inicializarComprobanteFactura();
			
			this.actualizarEstadoCeldasBotonesComprobanteFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComprobanteFactura() throws Exception {
		try {
			ComprobanteFacturaConstantesFunciones.inicializarComprobanteFactura(this.comprobantefactura);
			
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
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comprobantefacturaLogic.getComprobanteFacturas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComprobanteFacturas(String sAccionBusqueda,List<ComprobanteFactura> comprobantefacturasParaReportes) throws Exception {
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
					sPathReporteFinal="ComprobanteFactura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComprobanteFacturaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComprobanteFacturaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComprobanteFactura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comprobante Facturas");		
		parameters.put("busquedapor", ComprobanteFacturaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComprobanteFactura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComprobanteFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComprobanteFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComprobanteFactura=new JRBeanArrayDataSource(ComprobanteFacturaJInternalFrame.TraerComprobanteFacturaBeans(comprobantefacturasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComprobanteFactura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComprobanteFacturaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComprobanteFacturaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComprobanteFacturaBean.TraerComprobanteFacturaBeans(comprobantefacturasParaReportes).toArray()));
							
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
				this.generarExcelReporteComprobanteFacturas(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComprobanteFacturas(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComprobanteFacturaActionPerformed(null);
					//this.generarExcelReporteComprobanteFacturas(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComprobanteFacturas(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComprobanteFacturas(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComprobanteFacturas(sAccionBusqueda,sTipoArchivoReporte,comprobantefacturasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComprobanteFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFactura> comprobantefacturasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefactura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFacturas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobanteFactura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComprobanteFactura comprobantefactura : comprobantefacturasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComprobanteFacturaConstantesFunciones.generarExcelReporteDataComprobanteFactura("NORMAL",row,workbook,comprobantefactura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComprobanteFactura(String sTipo,Row row,Workbook workbook) {
		
		ComprobanteFacturaConstantesFunciones.generarExcelReporteHeaderComprobanteFactura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComprobanteFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFactura> comprobantefacturasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefactura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComprobanteFactura comprobantefactura : comprobantefacturasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComprobanteFacturaConstantesFunciones.getComprobanteFacturaDescripcion(comprobantefactura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getfecha_inicio());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getfecha_fin());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getcaja_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getnombre_caja());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getsecuencial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getcodigo_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getsubtotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_IVA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IVA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getiva());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getdescuento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getfinanciamiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_FLETE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FLETE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getflete());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_ICE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_ICE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getice());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_TOTAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_TOTAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.gettotal());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getcantidad_formas_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comprobantefactura.getdescuento_real());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComprobanteFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<ComprobanteFactura> comprobantefacturasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComprobanteFactura> comprobantefacturasRespaldo=null;
		
		classes=ComprobanteFacturaConstantesFunciones.getClassesRelationshipsOfComprobanteFactura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comprobantefacturaLogic.setDatosCliente(this.datosCliente);
		this.comprobantefacturaLogic.setDatosDeep(this.datosDeep);
		this.comprobantefacturaLogic.setIsConDeep(true);
		
		comprobantefacturasRespaldo=this.comprobantefacturaLogic.getComprobanteFacturas();
		
		this.comprobantefacturaLogic.setComprobanteFacturas(comprobantefacturasParaReportes);	
		this.comprobantefacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comprobantefacturasParaReportes=this.comprobantefacturaLogic.getComprobanteFacturas();
		this.comprobantefacturaLogic.setComprobanteFacturas(comprobantefacturasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefactura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComprobanteFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComprobanteFactura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComprobanteFactura comprobantefactura : comprobantefacturasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComprobanteFactura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComprobanteFacturaConstantesFunciones.generarExcelReporteDataComprobanteFactura("NORMAL",row,workbook,comprobantefactura,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComprobanteFacturaConstantesFunciones.getComprobanteFacturaDescripcion(comprobantefactura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFactura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComprobanteFactura() throws Exception {		
		this.startProcessComprobanteFactura(true);
	}
	
	public void startProcessComprobanteFactura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComprobanteFactura ,this.jPanelParametrosReportesComprobanteFactura, this.jScrollPanelDatosComprobanteFactura,this.jPanelPaginacionComprobanteFactura, this.jScrollPanelDatosEdicionComprobanteFactura, this.jPanelAccionesComprobanteFactura,this.jPanelAccionesFormularioComprobanteFactura,this.jmenuBarComprobanteFactura,this.jmenuBarDetalleComprobanteFactura,this.jTtoolBarComprobanteFactura,this.jTtoolBarDetalleComprobanteFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobanteFactura=this.jTabbedPaneBusquedasComprobanteFactura; 
		
		final JPanel jPanelParametrosReportesComprobanteFactura=this.jPanelParametrosReportesComprobanteFactura;
		//final JScrollPane jScrollPanelDatosComprobanteFactura=this.jScrollPanelDatosComprobanteFactura;
		final JTable jTableDatosComprobanteFactura=this.jTableDatosComprobanteFactura;		
		final JPanel jPanelPaginacionComprobanteFactura=this.jPanelPaginacionComprobanteFactura;
		//final JScrollPane jScrollPanelDatosEdicionComprobanteFactura=this.jScrollPanelDatosEdicionComprobanteFactura;
		final JPanel jPanelAccionesComprobanteFactura=this.jPanelAccionesComprobanteFactura;
		
		JPanel jPanelCamposAuxiliarComprobanteFactura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComprobanteFactura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			jPanelCamposAuxiliarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jPanelCamposComprobanteFactura;
			jPanelAccionesFormularioAuxiliarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jPanelAccionesFormularioComprobanteFactura;
		}
		
		final JPanel jPanelCamposComprobanteFactura=jPanelCamposAuxiliarComprobanteFactura;
		final JPanel jPanelAccionesFormularioComprobanteFactura=jPanelAccionesFormularioAuxiliarComprobanteFactura;
		
		
		final JMenuBar jmenuBarComprobanteFactura=this.jmenuBarComprobanteFactura;
		final JToolBar jTtoolBarComprobanteFactura=this.jTtoolBarComprobanteFactura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComprobanteFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobanteFactura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			jmenuBarDetalleAuxiliarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jmenuBarDetalleComprobanteFactura;
			jTtoolBarDetalleAuxiliarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jTtoolBarDetalleComprobanteFactura;
		}
		
		final JMenuBar jmenuBarDetalleComprobanteFactura=jmenuBarDetalleAuxiliarComprobanteFactura;
		final JToolBar jTtoolBarDetalleComprobanteFactura=jTtoolBarDetalleAuxiliarComprobanteFactura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobanteFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobanteFactura;
			processRunnable.jTableDatos=jTableDatosComprobanteFactura;
			processRunnable.jPanelCampos=jPanelCamposComprobanteFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobanteFactura;
			processRunnable.jPanelAcciones=jPanelAccionesComprobanteFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobanteFactura;
			
			
			processRunnable.jmenuBar=jmenuBarComprobanteFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobanteFactura;
			processRunnable.jTtoolBar=jTtoolBarComprobanteFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobanteFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobanteFactura ,jPanelParametrosReportesComprobanteFactura,jTableDatosComprobanteFactura, /*jScrollPanelDatosComprobanteFactura,*/jPanelCamposComprobanteFactura,jPanelPaginacionComprobanteFactura, /*jScrollPanelDatosEdicionComprobanteFactura,*/ jPanelAccionesComprobanteFactura,jPanelAccionesFormularioComprobanteFactura,jmenuBarComprobanteFactura,jmenuBarDetalleComprobanteFactura,jTtoolBarComprobanteFactura,jTtoolBarDetalleComprobanteFactura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComprobanteFactura ,jPanelParametrosReportesComprobanteFactura, jScrollPanelDatosComprobanteFactura,jPanelPaginacionComprobanteFactura, jScrollPanelDatosEdicionComprobanteFactura, jPanelAccionesComprobanteFactura,jPanelAccionesFormularioComprobanteFactura,jmenuBarComprobanteFactura,jmenuBarDetalleComprobanteFactura,jTtoolBarComprobanteFactura,jTtoolBarDetalleComprobanteFactura);
						
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
	
	public void finishProcessComprobanteFactura() {// throws Exception 
		this.finishProcessComprobanteFactura(true);
	}
	
	public void finishProcessComprobanteFactura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComprobanteFactura ,this.jPanelParametrosReportesComprobanteFactura, this.jScrollPanelDatosComprobanteFactura,this.jPanelPaginacionComprobanteFactura, this.jScrollPanelDatosEdicionComprobanteFactura, this.jPanelAccionesComprobanteFactura,this.jPanelAccionesFormularioComprobanteFactura,this.jmenuBarComprobanteFactura,this.jmenuBarDetalleComprobanteFactura,this.jTtoolBarComprobanteFactura,this.jTtoolBarDetalleComprobanteFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasComprobanteFactura=this.jTabbedPaneBusquedasComprobanteFactura; 
		
		final JPanel jPanelParametrosReportesComprobanteFactura=this.jPanelParametrosReportesComprobanteFactura;
		//final JScrollPane jScrollPanelDatosComprobanteFactura=this.jScrollPanelDatosComprobanteFactura;
		final JTable jTableDatosComprobanteFactura=this.jTableDatosComprobanteFactura;		
		final JPanel jPanelPaginacionComprobanteFactura=this.jPanelPaginacionComprobanteFactura;
		//final JScrollPane jScrollPanelDatosEdicionComprobanteFactura=this.jScrollPanelDatosEdicionComprobanteFactura;
		final JPanel jPanelAccionesComprobanteFactura=this.jPanelAccionesComprobanteFactura;
		
		JPanel jPanelCamposAuxiliarComprobanteFactura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComprobanteFactura=new JPanel();
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			jPanelCamposAuxiliarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jPanelCamposComprobanteFactura;
			jPanelAccionesFormularioAuxiliarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jPanelAccionesFormularioComprobanteFactura;
		}
		
		final JPanel jPanelCamposComprobanteFactura=jPanelCamposAuxiliarComprobanteFactura;
		final JPanel jPanelAccionesFormularioComprobanteFactura=jPanelAccionesFormularioAuxiliarComprobanteFactura;
		
		
		final JMenuBar jmenuBarComprobanteFactura=this.jmenuBarComprobanteFactura;		
		final JToolBar jTtoolBarComprobanteFactura=this.jTtoolBarComprobanteFactura;
				
		JMenuBar jmenuBarDetalleAuxiliarComprobanteFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComprobanteFactura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			jmenuBarDetalleAuxiliarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jmenuBarDetalleComprobanteFactura;
			jTtoolBarDetalleAuxiliarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jTtoolBarDetalleComprobanteFactura;		
		}
		
		final JMenuBar jmenuBarDetalleComprobanteFactura=jmenuBarDetalleAuxiliarComprobanteFactura;
		final JToolBar jTtoolBarDetalleComprobanteFactura=jTtoolBarDetalleAuxiliarComprobanteFactura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComprobanteFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComprobanteFactura;
			processRunnable.jTableDatos=jTableDatosComprobanteFactura;
			processRunnable.jPanelCampos=jPanelCamposComprobanteFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionComprobanteFactura;
			processRunnable.jPanelAcciones=jPanelAccionesComprobanteFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComprobanteFactura;
			
			
			processRunnable.jmenuBar=jmenuBarComprobanteFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComprobanteFactura;
			processRunnable.jTtoolBar=jTtoolBarComprobanteFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComprobanteFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComprobanteFactura ,jPanelParametrosReportesComprobanteFactura, jTableDatosComprobanteFactura,/*jScrollPanelDatosComprobanteFactura,*/jPanelCamposComprobanteFactura,jPanelPaginacionComprobanteFactura, /*jScrollPanelDatosEdicionComprobanteFactura,*/ jPanelAccionesComprobanteFactura,jPanelAccionesFormularioComprobanteFactura,jmenuBarComprobanteFactura,jmenuBarDetalleComprobanteFactura,jTtoolBarComprobanteFactura,jTtoolBarDetalleComprobanteFactura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComprobanteFactura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComprobanteFactura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComprobanteFactura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComprobanteFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComprobanteFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComprobanteFactura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComprobanteFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComprobanteFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComprobanteFactura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comprobantefacturaConstantesFunciones.getsFinalQueryComprobanteFactura();
		String  finalQueryPaginacionTodos=this.comprobantefacturaConstantesFunciones.getsFinalQueryComprobanteFactura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComprobanteFacturaConstantesFunciones.getArrayColumnasGlobalesNoComprobanteFactura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComprobanteFacturaConstantesFunciones.getArrayColumnasGlobalesComprobanteFactura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComprobanteFacturaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comprobantefacturasEliminados= new ArrayList<ComprobanteFactura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComprobanteFactura();
		
				///*ComprobanteFacturaSessionBean*/this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
			
			if(this.comprobantefacturaSessionBean==null) {
				this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
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
					this.iNumeroPaginacion=ComprobanteFacturaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComprobanteFacturaConstantesFunciones.getClassesForeignKeysOfComprobanteFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comprobantefactura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comprobantefacturasAux= new ArrayList<ComprobanteFactura>();
			
				
			comprobantefacturaLogic.setDatosCliente(this.datosCliente);
			comprobantefacturaLogic.setDatosDeep(this.datosDeep);
			comprobantefacturaLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaComprobanteFactura")) {
				this.sDetalleReporte=ComprobanteFacturaConstantesFunciones.getDetalleIndiceBusquedaComprobanteFactura(id_vendedorBusquedaComprobanteFactura,fecha_inicioBusquedaComprobanteFactura,fecha_finBusquedaComprobanteFactura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comprobantefacturaLogic.getComprobanteFacturasBusquedaComprobanteFactura(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_vendedorBusquedaComprobanteFactura,fecha_inicioBusquedaComprobanteFactura,fecha_finBusquedaComprobanteFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobanteFacturaConstantesFunciones.getDetalleIndiceBusquedaComprobanteFactura(id_vendedorBusquedaComprobanteFactura,fecha_inicioBusquedaComprobanteFactura,fecha_finBusquedaComprobanteFactura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobanteFacturaConstantesFunciones.getDetalleIndiceBusquedaComprobanteFactura(id_vendedorBusquedaComprobanteFactura,fecha_inicioBusquedaComprobanteFactura,fecha_finBusquedaComprobanteFactura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comprobantefacturaLogic.getComprobanteFacturas()==null||comprobantefacturaLogic.getComprobanteFacturas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comprobantefacturas==null|| comprobantefacturas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantefacturasAux=new ArrayList<ComprobanteFactura>();
						comprobantefacturasAux.addAll(comprobantefacturaLogic.getComprobanteFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantefacturasAux=new ArrayList<ComprobanteFactura>();
							comprobantefacturasAux.addAll(comprobantefacturas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comprobantefacturaLogic.getComprobanteFacturasBusquedaComprobanteFactura(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_vendedorBusquedaComprobanteFactura,fecha_inicioBusquedaComprobanteFactura,fecha_finBusquedaComprobanteFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComprobanteFacturaConstantesFunciones.getDetalleIndiceBusquedaComprobanteFactura(id_vendedorBusquedaComprobanteFactura,fecha_inicioBusquedaComprobanteFactura,fecha_finBusquedaComprobanteFactura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComprobanteFacturaConstantesFunciones.getDetalleIndiceBusquedaComprobanteFactura(id_vendedorBusquedaComprobanteFactura,fecha_inicioBusquedaComprobanteFactura,fecha_finBusquedaComprobanteFactura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComprobanteFacturas("BusquedaComprobanteFactura",comprobantefacturaLogic.getComprobanteFacturas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComprobanteFacturas("BusquedaComprobanteFactura",comprobantefacturas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantefacturaLogic.setComprobanteFacturas(new ArrayList<ComprobanteFactura>());
						comprobantefacturaLogic.getComprobanteFacturas().addAll(comprobantefacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantefacturas=new ArrayList<ComprobanteFactura>();
							comprobantefacturas.addAll(comprobantefacturasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComprobanteFactura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComprobanteFactura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobantefacturaLogic.getComprobanteFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantefacturas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comprobantefacturaLogic.getComprobanteFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comprobantefacturas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComprobanteFactura comprobantefactura) {
		Boolean permite=true;
		
		if(this.comprobantefactura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComprobanteFacturaConstantesFunciones.getOrderByListaComprobanteFactura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComprobanteFacturaConstantesFunciones.getOrderByListaComprobanteFactura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFactura comprobantefactura:comprobantefacturaLogic.getComprobanteFacturas()) {
				if(comprobantefactura.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantefacturaTotales=comprobantefactura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFactura comprobantefactura:this.comprobantefacturas) {
				if(comprobantefactura.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantefacturaTotales=comprobantefactura;
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
			this.comprobantefacturaAux=new ComprobanteFactura();
			this.comprobantefacturaAux.setsType(Constantes2.S_TOTALES);
			this.comprobantefacturaAux.setIsNew(false);
			this.comprobantefacturaAux.setIsChanged(false);
			this.comprobantefacturaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//ComprobanteFacturaConstantesFunciones.TotalizarValoresFilaComprobanteFactura(this.comprobantefacturaLogic.getComprobanteFacturas(),this.comprobantefacturaAux);
				
				//this.comprobantefacturaLogic.getComprobanteFacturas().add(this.comprobantefacturaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComprobanteFacturaConstantesFunciones.TotalizarValoresFilaComprobanteFactura(this.comprobantefacturas,this.comprobantefacturaAux);
				
				this.comprobantefacturas.add(this.comprobantefacturaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comprobantefacturaTotales=new ComprobanteFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobantefacturaLogic.getComprobanteFacturas().remove(comprobantefacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comprobantefacturas.remove(comprobantefacturaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comprobantefacturaTotales=new ComprobanteFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComprobanteFactura comprobantefactura:comprobantefacturaLogic.getComprobanteFacturas()) {
				if(comprobantefactura.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantefacturaTotales=comprobantefactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobanteFacturaConstantesFunciones.TotalizarValoresFilaComprobanteFactura(this.comprobantefacturaLogic.getComprobanteFacturas(),comprobantefacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComprobanteFactura comprobantefactura:this.comprobantefacturas) {
				if(comprobantefactura.getsType().equals(Constantes2.S_TOTALES)) {
					comprobantefacturaTotales=comprobantefactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComprobanteFacturaConstantesFunciones.TotalizarValoresFilaComprobanteFactura(this.comprobantefacturas,comprobantefacturaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComprobanteFacturasBusquedaComprobanteFactura()throws Exception {
		try {
			sAccionBusqueda="BusquedaComprobanteFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFacturasFK_IdCaja()throws Exception {
		try {
			sAccionBusqueda="FK_IdCaja";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFacturasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFacturasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComprobanteFacturasFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComprobanteFacturasBusquedaComprobanteFactura(String sFinalQuery,Long id_vendedor,Date fecha_inicio,Date fecha_fin)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturaLogic.getComprobanteFacturasBusquedaComprobanteFactura(sFinalQuery,this.pagination,id_vendedor,fecha_inicio,fecha_fin);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFacturasFK_IdCaja(String sFinalQuery,Long id_caja)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturaLogic.getComprobanteFacturasFK_IdCaja(sFinalQuery,this.pagination,id_caja);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFacturasFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturaLogic.getComprobanteFacturasFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFacturasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturaLogic.getComprobanteFacturasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComprobanteFacturasFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//comprobantefacturaLogic.getComprobanteFacturasFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosComprobanteFactura() {
		this.isPermisoTodoComprobanteFactura=false;
		this.isPermisoNuevoComprobanteFactura=false;
		this.isPermisoActualizarComprobanteFactura=false;
		this.isPermisoActualizarOriginalComprobanteFactura=false;
		this.isPermisoEliminarComprobanteFactura=false;
		this.isPermisoGuardarCambiosComprobanteFactura=false;
		this.isPermisoConsultaComprobanteFactura=true;
		this.isPermisoBusquedaComprobanteFactura=true;
		this.isPermisoReporteComprobanteFactura=true;
		this.isPermisoOrdenComprobanteFactura=false;		
		this.isPermisoPaginacionMedioComprobanteFactura=false;		
		this.isPermisoPaginacionAltoComprobanteFactura=false;		
		this.isPermisoPaginacionTodoComprobanteFactura=false;		
		this.isPermisoCopiarComprobanteFactura=false;		
		this.isPermisoVerFormComprobanteFactura=false;		
		this.isPermisoDuplicarComprobanteFactura=false;
		this.isPermisoOrdenComprobanteFactura=false;
	}
	
	public void setPermisosUsuarioComprobanteFactura(Boolean isPermiso) {
		this.isPermisoTodoComprobanteFactura=isPermiso;
		this.isPermisoNuevoComprobanteFactura=isPermiso;
		this.isPermisoActualizarComprobanteFactura=isPermiso;
		this.isPermisoActualizarOriginalComprobanteFactura=isPermiso;
		this.isPermisoEliminarComprobanteFactura=isPermiso;
		this.isPermisoGuardarCambiosComprobanteFactura=isPermiso;
		this.isPermisoConsultaComprobanteFactura=isPermiso;
		this.isPermisoBusquedaComprobanteFactura=isPermiso;
		this.isPermisoReporteComprobanteFactura=isPermiso;
		this.isPermisoOrdenComprobanteFactura=isPermiso;		
		this.isPermisoPaginacionMedioComprobanteFactura=isPermiso;		
		this.isPermisoPaginacionAltoComprobanteFactura=isPermiso;		
		this.isPermisoPaginacionTodoComprobanteFactura=isPermiso;		
		this.isPermisoCopiarComprobanteFactura=isPermiso;		
		this.isPermisoVerFormComprobanteFactura=isPermiso;		
		this.isPermisoDuplicarComprobanteFactura=isPermiso;
		this.isPermisoOrdenComprobanteFactura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComprobanteFactura(Boolean isPermiso) {
		//this.isPermisoTodoComprobanteFactura=isPermiso;
		this.isPermisoNuevoComprobanteFactura=isPermiso;
		this.isPermisoActualizarComprobanteFactura=isPermiso;
		this.isPermisoActualizarOriginalComprobanteFactura=isPermiso;
		this.isPermisoEliminarComprobanteFactura=isPermiso;
		this.isPermisoGuardarCambiosComprobanteFactura=isPermiso;
		//this.isPermisoConsultaComprobanteFactura=isPermiso;
		//this.isPermisoBusquedaComprobanteFactura=isPermiso;
		//this.isPermisoReporteComprobanteFactura=isPermiso;
		//this.isPermisoOrdenComprobanteFactura=isPermiso;		
		//this.isPermisoPaginacionMedioComprobanteFactura=isPermiso;		
		//this.isPermisoPaginacionAltoComprobanteFactura=isPermiso;		
		//this.isPermisoPaginacionTodoComprobanteFactura=isPermiso;		
		//this.isPermisoCopiarComprobanteFactura=isPermiso;		
		//this.isPermisoDuplicarComprobanteFactura=isPermiso;
		//this.isPermisoOrdenComprobanteFactura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComprobanteFacturaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComprobanteFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComprobanteFactura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComprobanteFacturaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComprobanteFacturaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComprobanteFacturaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComprobanteFacturaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComprobanteFactura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComprobanteFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComprobanteFacturaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComprobanteFactura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComprobanteFactura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComprobanteFactura=this.isPermisoActualizarComprobanteFactura;
			this.isPermisoEliminarComprobanteFactura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComprobanteFactura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComprobanteFactura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComprobanteFactura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComprobanteFactura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComprobanteFactura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobanteFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComprobanteFactura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComprobanteFactura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComprobanteFactura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComprobanteFactura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComprobanteFactura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComprobanteFactura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComprobanteFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComprobanteFactura.setToolTipText(this.jTableDatosComprobanteFactura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComprobanteFactura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComprobanteFactura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComprobanteFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComprobanteFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComprobanteFactura() throws Exception {
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
	public void inicializarCombosForeignKeyComprobanteFacturaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.cajasForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComprobanteFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComprobanteFacturaJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyCajaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	
	public void addItemDefectoCombosTodosForeignKeyComprobanteFactura()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyCaja();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comprobantefacturaSessionBean==null) {
				this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean();
			}

			if(!this.comprobantefacturaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.comprobantefacturaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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

	public void addItemDefectoCombosForeignKeyCaja()throws Exception {
		try {

			if(!this.comprobantefacturaSessionBean.getisBusquedaDesdeForeignKeySesionCaja()) {
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

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.comprobantefacturaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
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
	
	public void initActionsCombosTodosForeignKeyComprobanteFactura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComprobanteFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComprobanteFactura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFactura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComprobanteFactura(ComprobanteFactura comprobantefactura)throws Exception {	
		try {
			
			this.setActualCajaForeignKey(comprobantefactura.getid_caja(),false,"Formulario");
			this.setActualClienteForeignKey(comprobantefactura.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComprobanteFactura(ComprobanteFactura comprobantefactura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComprobanteFactura()throws Exception {	
		try {
			
			this.setActualCajaForeignKey(this.comprobantefacturaConstantesFunciones.getid_caja(),false,"Formulario");
			this.setActualClienteForeignKey(this.comprobantefacturaConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComprobanteFactura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComprobanteFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComprobanteFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComprobanteFactura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComprobanteFactura()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameCajasForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComprobanteFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameCajasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComprobanteFactura()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.getItemCount()>0) {
				this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public ComprobanteFacturaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComprobanteFacturaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComprobanteFacturaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comprobantefacturaSessionBean=new ComprobanteFacturaSessionBean(); 
		this.comprobantefacturaConstantesFunciones=new ComprobanteFacturaConstantesFunciones(); 
		this.comprobantefacturaBean=new ComprobanteFactura();//(this.comprobantefacturaConstantesFunciones); 		
		this.comprobantefacturaReturnGeneral=new ComprobanteFacturaParameterReturnGeneral(); 
		
		this.comprobantefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comprobantefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComprobanteFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComprobanteFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComprobanteFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComprobanteFactura(true);
			
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
			
			this.comprobantefacturaConstantesFunciones=new ComprobanteFacturaConstantesFunciones(); 
			this.comprobantefacturaBean=new ComprobanteFactura();//this.comprobantefacturaConstantesFunciones); 			
			this.comprobantefacturaReturnGeneral=new ComprobanteFacturaParameterReturnGeneral(); 
		
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comprobante Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comprobantefactura=new ComprobanteFactura();
			this.comprobantefacturas = new ArrayList<ComprobanteFactura>();
			this.comprobantefacturasAux = new ArrayList<ComprobanteFactura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic=new ComprobanteFacturaLogic();
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.comprobantefacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comprobantefacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComprobanteFactura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobanteFactura);	
					}
					
					if(this.jInternalFrameImportacionComprobanteFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobanteFactura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComprobanteFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComprobanteFactura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobanteFactura);
				this.jInternalFrameDetalleFormComprobanteFactura.setVisible(false);
				this.jInternalFrameDetalleFormComprobanteFactura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobanteFactura);
					this.jInternalFrameReporteDinamicoComprobanteFactura.setVisible(false);
					this.jInternalFrameReporteDinamicoComprobanteFactura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComprobanteFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComprobanteFactura);
					this.jInternalFrameImportacionComprobanteFactura.setVisible(false);
					this.jInternalFrameImportacionComprobanteFactura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComprobanteFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComprobanteFactura);
					this.jInternalFrameOrderByComprobanteFactura.setVisible(false);
					this.jInternalFrameOrderByComprobanteFactura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComprobanteFacturaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComprobanteFacturaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comprobantefacturaReturnGeneral=new ComprobanteFacturaParameterReturnGeneral();
			
			this.comprobantefacturaParameterGeneral=new ComprobanteFacturaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comprobantefacturaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComprobanteFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobanteFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),this.comprobantefacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComprobanteFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),this.comprobantefacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComprobanteFactura=false;
			this.isVisibilidadCeldaDuplicarComprobanteFactura=true;
			this.isVisibilidadCeldaCopiarComprobanteFactura=true;
			this.isVisibilidadCeldaVerFormComprobanteFactura=true;
			this.isVisibilidadCeldaOrdenComprobanteFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
			this.isVisibilidadCeldaModificarComprobanteFactura=false;
			this.isVisibilidadCeldaActualizarComprobanteFactura=false;
			this.isVisibilidadCeldaEliminarComprobanteFactura=false;
			this.isVisibilidadCeldaCancelarComprobanteFactura=false;
			this.isVisibilidadCeldaGuardarComprobanteFactura=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;
			
			
			this.isVisibilidadBusquedaComprobanteFactura=true;
			this.isVisibilidadFK_IdCaja=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComprobanteFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComprobanteFactura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComprobanteFactura(false);
			
			this.setPermisosUsuarioComprobanteFactura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado() 
				|| (this.comprobantefacturaSessionBean.getEsGuardarRelacionado() && this.comprobantefacturaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComprobanteFacturaClasesRelacionadas();
			}
			
			if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComprobanteFacturaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComprobanteFactura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComprobanteFactura();
			}
			
			if(!this.isPermisoBusquedaComprobanteFactura) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComprobanteFacturaConstantesFunciones.getTiposSeleccionarComprobanteFactura());
				
				this.tiposColumnasSelect=ComprobanteFacturaConstantesFunciones.getTiposSeleccionarComprobanteFactura(true);
				
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
			//if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComprobanteFactura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioComprobanteFactura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioComprobanteFactura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFactura() ;
			
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
			this.vendedorLogic=new VendedorLogic();
			this.cajaLogic=new CajaLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comprobantefacturaImplementable= (ComprobanteFacturaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobanteFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comprobantefacturaImplementableHome= (ComprobanteFacturaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComprobanteFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comprobantefacturas= new ArrayList<ComprobanteFactura>();
			this.comprobantefacturasEliminados= new ArrayList<ComprobanteFactura>();
						
			this.isEsNuevoComprobanteFactura=false;
			this.esParaAccionDesdeFormularioComprobanteFactura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			this.cajasForeignKey=new ArrayList<Caja>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComprobanteFactura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComprobanteFactura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComprobanteFacturaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComprobanteFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComprobanteFactura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComprobanteFactura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComprobanteFactura();
			}
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComprobanteFactura.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComprobanteFactura.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComprobanteFactura.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComprobanteFactura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComprobanteFactura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComprobanteFactura() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComprobanteFactura")) {
				iIndex=this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComprobanteFactura();	
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
	
	public void cargarCombosForeignKeyComprobanteFactura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComprobanteFactura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComprobanteFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComprobanteFacturaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComprobanteFactura();
		
		this.cargarCombosFrameForeignKeyComprobanteFactura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComprobanteFactura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComprobanteFactura();
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
	
	public void jButtonNuevoComprobanteFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
			
			if(jTableDatosComprobanteFactura.getRowCount()>=1) {
				jTableDatosComprobanteFactura.removeRowSelectionInterval(0, jTableDatosComprobanteFactura.getRowCount()-1);						
			}
			
			this.isEsNuevoComprobanteFactura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComprobanteFactura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComprobanteFactura(true);			
			//this.comprobantefactura=new ComprobanteFactura();
			//this.comprobantefactura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFactura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFactura() ;
			
			if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFactura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comprobantefactura);	
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);				
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
			if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComprobanteFactura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComprobanteFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComprobanteFactura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComprobanteFactura.getSelectedRows().length;			
			}
			
			comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComprobanteFactura--;			
				//ComprobanteFactura comprobantefacturaAux= new ComprobanteFactura();			
				//comprobantefacturaAux.setId(this.iIdNuevoComprobanteFactura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComprobanteFactura comprobantefacturaOrigen=new ComprobanteFactura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComprobanteFactura comprobantefacturaOrigen : comprobantefacturasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comprobantefacturaOrigen =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comprobantefacturaOrigen =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComprobanteFactura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comprobantefactura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComprobanteFactura(comprobantefacturaOrigen,this.comprobantefactura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobantefacturaLogic.getComprobanteFacturas().add(this.comprobantefacturaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobantefacturas.add(this.comprobantefacturaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComprobanteFactura(false);
				
				this.jTableDatosComprobanteFactura.setRowSelectionInterval(this.getIndiceNuevoComprobanteFactura(), this.getIndiceNuevoComprobanteFactura());
				
				int iLastRow =  this.jTableDatosComprobanteFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobanteFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobanteFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFactura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();									
		
			ComprobanteFactura comprobantefacturaOrigen=new ComprobanteFactura();
			ComprobanteFactura comprobantefacturaDestino=new ComprobanteFactura();
				
			comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComprobanteFactura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comprobantefacturasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComprobanteFactura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantefacturaOrigen =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobantefacturaOrigen =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comprobantefacturaDestino =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comprobantefacturaDestino =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comprobantefacturaOrigen =comprobantefacturasSeleccionados.get(0);
				comprobantefacturaDestino =comprobantefacturasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComprobanteFactura(comprobantefacturaOrigen,comprobantefacturaDestino,true,false);
				
				comprobantefacturaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comprobantefacturaDestino,comprobantefacturaLogic.getComprobanteFacturas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comprobantefacturaDestino,comprobantefacturas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComprobanteFactura(false);
				
				//this.jTableDatosComprobanteFactura.setRowSelectionInterval(this.getIndiceNuevoComprobanteFactura(), this.getIndiceNuevoComprobanteFactura());
				
				int iLastRow =  this.jTableDatosComprobanteFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComprobanteFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComprobanteFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFactura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComprobanteFactura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComprobanteFactura.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComprobanteFactura.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComprobanteFactura.setVisible(!isVisible);
			this.jPanelPaginacionComprobanteFactura.setVisible(!isVisible);
			this.jPanelAccionesComprobanteFactura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComprobanteFactura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComprobanteFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComprobanteFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComprobanteFactura();
			
			this.abrirFrameOrderByComprobanteFactura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComprobanteFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComprobanteFactura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobanteFactura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComprobanteFactura.isMaximum()) {
					this.jInternalFrameDetalleFormComprobanteFactura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComprobanteFactura.setSize(this.jInternalFrameDetalleFormComprobanteFactura.iWidthFormulario,this.jInternalFrameDetalleFormComprobanteFactura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComprobanteFactura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComprobanteFactura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComprobanteFactura.isMaximum()) {
						this.jInternalFrameDetalleFormComprobanteFactura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComprobanteFactura.jContentPaneDetalleComprobanteFactura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFactura.jContentPaneDetalleComprobanteFactura.getWidth(),ComprobanteFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFactura.jContentPaneDetalleComprobanteFactura.getWidth(),ComprobanteFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComprobanteFactura.jContentPaneDetalleComprobanteFactura.getWidth(),ComprobanteFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComprobanteFactura.setVisible(true);
	        this.jInternalFrameDetalleFormComprobanteFactura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComprobanteFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComprobanteFactura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComprobanteFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFactura,false,this);
				} else {
					this.jInternalFrameOrderByComprobanteFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComprobanteFactura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComprobanteFactura);
				this.jInternalFrameOrderByComprobanteFactura.setVisible(false);
				this.jInternalFrameOrderByComprobanteFactura.setSelected(false);
				
				this.jInternalFrameOrderByComprobanteFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobanteFactura"));
				
				this.inicializarActualizarBindingTablaOrderByComprobanteFactura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComprobanteFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComprobanteFactura==null) {
				
				this.jInternalFrameImportacionComprobanteFactura=new ImportacionJInternalFrame(ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComprobanteFactura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComprobanteFactura);
				this.jInternalFrameImportacionComprobanteFactura.setVisible(false);
				this.jInternalFrameImportacionComprobanteFactura.setSelected(false);


				this.jInternalFrameImportacionComprobanteFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobanteFactura"));
				this.jInternalFrameImportacionComprobanteFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobanteFactura"));
				this.jInternalFrameImportacionComprobanteFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobanteFactura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComprobanteFactura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComprobanteFactura==null) {
				this.jInternalFrameReporteDinamicoComprobanteFactura=new ReporteDinamicoJInternalFrame(ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComprobanteFactura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComprobanteFactura);
				this.jInternalFrameReporteDinamicoComprobanteFactura.setVisible(false);
				this.jInternalFrameReporteDinamicoComprobanteFactura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComprobanteFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFactura"));
				this.jInternalFrameReporteDinamicoComprobanteFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFactura"));
				this.jInternalFrameReporteDinamicoComprobanteFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFactura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFactura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComprobanteFactura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComprobanteFactura);
			
	       	this.jInternalFrameDetalleFormComprobanteFactura.setVisible(false);
	        this.jInternalFrameDetalleFormComprobanteFactura.setSelected(false);
			
			//this.jInternalFrameDetalleFormComprobanteFactura.dispose();
			//this.jInternalFrameDetalleFormComprobanteFactura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComprobanteFactura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComprobanteFactura.setVisible(true);
	        this.jInternalFrameReporteDinamicoComprobanteFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComprobanteFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComprobanteFactura.setVisible(true);
	        this.jInternalFrameImportacionComprobanteFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComprobanteFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComprobanteFactura.setVisible(true);
	        this.jInternalFrameOrderByComprobanteFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComprobanteFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComprobanteFactura.setVisible(false);
	        this.jInternalFrameOrderByComprobanteFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComprobanteFactura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComprobanteFactura.setVisible(false);
	        this.jInternalFrameReporteDinamicoComprobanteFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComprobanteFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComprobanteFactura.setVisible(false);
	        this.jInternalFrameImportacionComprobanteFactura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComprobanteFactura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComprobanteFactura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComprobanteFactura(true);
			//this.isEsNuevoComprobanteFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComprobanteFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFactura(false) ;
			
			if(comprobantefacturaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFactura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComprobanteFacturaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComprobanteFactura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComprobanteFactura(true);
			//this.isEsNuevoComprobanteFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comprobantefactura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComprobanteFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComprobanteFactura(false) ;
			
			if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComprobanteFactura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobanteFactura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCaja(List<Caja> cajasForeignKey)throws Exception{
		TableColumn tableColumnCaja=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA));
		TableCellEditor tableCellEditorCaja =tableColumnCaja.getCellEditor();

		CajaTableCell cajaTableCellFk=(CajaTableCell)tableCellEditorCaja;

		if(cajaTableCellFk!=null) {
			cajaTableCellFk.setcajasForeignKey(cajasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobanteFactura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//cajaTableCellFk.setRowActual(intSelectedRow);
			//cajaTableCellFk.setcajasForeignKeyActual(cajasForeignKey);
		//}


		if(cajaTableCellFk!=null) {
			cajaTableCellFk.RecargarCajasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComprobanteFactura.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComprobanteFactura(false);
			
			//if(!this.isEsNuevoComprobanteFactura) {								
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				
			}
			
			if(this.permiteMantenimiento(this.comprobantefactura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComprobanteFactura=true;
					this.inicializarActualizarBindingTablaComprobanteFactura(false);
					this.isEsNuevoComprobanteFactura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComprobanteFactura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComprobanteFactura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobanteFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFactura(false);
				
				this.habilitarDeshabilitarControlesComprobanteFactura(false);
			
												
				
				if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComprobanteFactura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComprobanteFacturaActionPerformed(evt,comprobantefacturaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComprobanteFactura(this.comprobantefactura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComprobanteFactura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comprobantefacturaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comprobantefactura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				this.comprobantefactura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				this.comprobantefactura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comprobantefactura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComprobanteFacturaModel) this.jTableDatosComprobanteFactura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComprobanteFactura=true;
				this.inicializarActualizarBindingTablaComprobanteFactura(false);
				this.isEsNuevoComprobanteFactura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComprobanteFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFactura(false);
				
				this.habilitarDeshabilitarControlesComprobanteFactura(false);
				
				
				
				if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComprobanteFactura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComprobanteFactura.getRowCount()>=1) {
				jTableDatosComprobanteFactura.removeRowSelectionInterval(0, jTableDatosComprobanteFactura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComprobanteFactura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComprobanteFactura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComprobanteFactura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComprobanteFactura(false) ;
			
			this.isEsNuevoComprobanteFactura=false;
			
			if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComprobanteFactura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComprobanteFactura(false);
				
				//SI ES MANUAL
				if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComprobanteFactura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComprobanteFactura--;			
			//ComprobanteFactura comprobantefacturaAux= new ComprobanteFactura();			
			//comprobantefacturaAux.setId(this.iIdNuevoComprobanteFactura);
			
			if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComprobanteFactura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
			
			this.comprobantefactura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comprobantefacturaLogic.getComprobanteFacturas().add(this.comprobantefacturaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comprobantefacturas.add(this.comprobantefacturaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComprobanteFactura(false);
			
			this.jTableDatosComprobanteFactura.setRowSelectionInterval(this.getIndiceNuevoComprobanteFactura(), this.getIndiceNuevoComprobanteFactura());
			
			int iLastRow =  this.jTableDatosComprobanteFactura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComprobanteFactura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComprobanteFactura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComprobanteFactura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComprobanteFactura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFactura(false);
			
			//SI ES MANUAL
			if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFactura();
			}
			
			//this.abrirFrameTreeComprobanteFactura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComprobanteFactura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComprobanteFactura.setFileImportacion(this.jInternalFrameImportacionComprobanteFactura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComprobanteFactura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComprobanteFactura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComprobanteFactura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComprobanteFactura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		

		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComprobanteFacturaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComprobanteFacturaBaseDesign.jrxml";
			
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
			
			this.generarReporteComprobanteFacturas("Todos",comprobantefacturasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Caja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Caja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Caja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Caja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCaja_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCaja_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCaja_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCaja_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cuencial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cuencial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cuencial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cuencial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digoCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digoCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digoCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digoCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_btotal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_btotal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_btotal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_btotal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IVA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_a_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_a_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_a_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_a_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_nanciamiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_nanciamiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_nanciamiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_nanciamiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FLETE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ete_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ete_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ete_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ete_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_ICE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_e_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_e_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_e_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_e_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_TOTAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidadFormasPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidadFormasPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidadFormasPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidadFormasPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scuentoReal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scuentoReal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scuentoReal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scuentoReal_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComprobanteFactura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoria="id_caja";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoria="nombre_caja";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoria="secuencial";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoria="codigo_cliente";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoria="subtotal";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoria="iva";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoria="descuento";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoria="financiamiento";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoria="flete";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoria="ice";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoria="total";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO:
					sNombreCampoCategoria="cantidad_formas_pago";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL:
					sNombreCampoCategoria="descuento_real";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA:
					sNombreCampoCategoriaValor="id_caja";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA:
					sNombreCampoCategoriaValor="nombre_caja";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL:
					sNombreCampoCategoriaValor="secuencial";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE:
					sNombreCampoCategoriaValor="codigo_cliente";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL:
					sNombreCampoCategoriaValor="subtotal";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IVA:
					sNombreCampoCategoriaValor="iva";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO:
					sNombreCampoCategoriaValor="descuento";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO:
					sNombreCampoCategoriaValor="financiamiento";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FLETE:
					sNombreCampoCategoriaValor="flete";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_ICE:
					sNombreCampoCategoriaValor="ice";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_TOTAL:
					sNombreCampoCategoriaValor="total";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO:
					sNombreCampoCategoriaValor="cantidad_formas_pago";
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL:
					sNombreCampoCategoriaValor="descuento_real";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_caja");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Caja",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_caja");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Secuencial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"secuencial");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo_cliente");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Subtotal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"subtotal");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IVA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Iva",sNombreCampoCategoria,sNombreCampoCategoriaValor,"iva");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Financiamiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"financiamiento");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FLETE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Flete",sNombreCampoCategoria,sNombreCampoCategoriaValor,"flete");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_ICE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ice",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ice");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_TOTAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantad Formas Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad_formas_pago");
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descuento Real",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descuento_real");
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
	
	public void jButtonGenerarExcelReporteDinamicoComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefactura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComprobanteFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getfecha_inicio());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getfecha_fin());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getcaja_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getnombre_caja());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getsecuencial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getcodigo_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getsubtotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_IVA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IVA);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getiva());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getdescuento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getfinanciamiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_FLETE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FLETE);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getflete());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_ICE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_ICE);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getice());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_TOTAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_TOTAL);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.gettotal());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getcantidad_formas_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL);
					iRow++;

					for(ComprobanteFactura comprobantefactura:comprobantefacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comprobantefactura.getdescuento_real());
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
			//	this.getFilaCabeceraExportarExcelComprobanteFactura(row);				
			//	iRow++;
			//}				
			
			//for(ComprobanteFactura comprobantefacturaAux:comprobantefacturasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComprobanteFactura(comprobantefacturaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
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
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFactura(false);
			
			//SI ES MANUAL
			if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComprobanteFactura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFactura(false);
			
			//SI ES MANUAL
			if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobanteFactura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComprobanteFactura(false);
			
			//SI ES MANUAL
			if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComprobanteFactura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComprobanteFactura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComprobanteFactura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComprobanteFactura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComprobanteFactura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComprobanteFactura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComprobanteFactura.setMinimumSize(dimensionMinimum);
		this.jTableDatosComprobanteFactura.setMaximumSize(dimensionMaximum);
		this.jTableDatosComprobanteFactura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComprobanteFactura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComprobanteFactura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComprobanteFactura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComprobanteFactura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComprobanteFactura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComprobanteFactura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFactura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComprobanteFactura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComprobanteFactura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComprobanteFactura();
		
		this.inicializarActualizarBindingBotonesManualComprobanteFactura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComprobanteFactura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFactura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFactura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFactura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComprobanteFactura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComprobanteFactura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComprobanteFactura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComprobanteFactura.jCheckBoxPostAccionNuevoComprobanteFactura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComprobanteFactura.jCheckBoxPostAccionSinCerrarComprobanteFactura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComprobanteFactura.jCheckBoxPostAccionSinMensajeComprobanteFactura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComprobanteFactura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComprobanteFactura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComprobanteFactura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
				this.jInternalFrameDetalleFormComprobanteFactura.jCheckBoxPostAccionNuevoComprobanteFactura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComprobanteFactura.jCheckBoxPostAccionSinCerrarComprobanteFactura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComprobanteFactura.jCheckBoxPostAccionSinMensajeComprobanteFactura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComprobanteFactura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComprobanteFactura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComprobanteFactura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComprobanteFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComprobanteFactura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComprobanteFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComprobanteFactura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComprobanteFactura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComprobanteFactura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComprobanteFactura(Boolean esInicializar) throws Exception {
		try	{	
			if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComprobanteFactura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComprobanteFactura() throws Exception {
		try	{
			if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobanteFactura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobanteFactura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComprobanteFactura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComprobanteFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComprobanteFactura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComprobanteFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComprobanteFactura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComprobanteFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComprobanteFactura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComprobanteFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComprobanteFactura.addItem(reporte);
			}
			
			
			if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComprobanteFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComprobanteFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComprobanteFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComprobanteFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComprobanteFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComprobanteFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComprobanteFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComprobanteFactura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComprobanteFactura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFactura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComprobanteFactura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
				
				if(this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComprobanteFactura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComprobanteFacturaConstantesFunciones.getTiposSeleccionarComprobanteFactura(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComprobanteFacturaConstantesFunciones.getTiposSeleccionarComprobanteFactura(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComprobanteFacturaConstantesFunciones.getTiposSeleccionarComprobanteFactura(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComprobanteFactura.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComprobanteFactura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.getSelectedItem()!=null){this.id_vendedorBusquedaComprobanteFactura=((Vendedor)this.jComboBoxid_vendedorBusquedaComprobanteFacturaComprobanteFactura.getSelectedItem()).getId();}
		this.fecha_inicioBusquedaComprobanteFactura=new Date(this.jDateChooserfecha_inicioBusquedaComprobanteFacturaComprobanteFactura.getDate().getTime());
		this.fecha_finBusquedaComprobanteFactura=new Date(this.jDateChooserfecha_finBusquedaComprobanteFacturaComprobanteFactura.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComprobanteFactura(Boolean esInicializar) throws Exception {				
		if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComprobanteFactura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComprobanteFactura() throws Exception {
		this.inicializarActualizarBindingTablaComprobanteFactura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComprobanteFactura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComprobanteFacturaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFacturaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComprobanteFactura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comprobantefacturaLogic.getComprobanteFacturas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comprobantefacturas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComprobanteFactura.setModel(new ComprobanteFacturaModel(this.comprobantefacturaLogic.getComprobanteFacturas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComprobanteFactura.setModel(new ComprobanteFacturaModel(this.comprobantefacturas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComprobanteFactura!=null && this.jInternalFrameOrderByComprobanteFactura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComprobanteFactura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO,comprobantefacturaConstantesFunciones.resaltarSeleccionarComprobanteFactura,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComprobanteFacturaConstantesFunciones.SCLASSWEBTITULO,comprobantefacturaConstantesFunciones.resaltarSeleccionarComprobanteFactura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_ID));

		if(this.comprobantefacturaConstantesFunciones.mostraridComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltaridComprobanteFactura,this.comprobantefacturaConstantesFunciones.activaridComprobanteFactura,iSizeTabla,this,true,"idComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltaridComprobanteFactura,this.comprobantefacturaConstantesFunciones.activaridComprobanteFactura,this,true,"idComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA));

		if(this.comprobantefacturaConstantesFunciones.mostrarnombre_cajaComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturaConstantesFunciones.resaltarnombre_cajaComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarnombre_cajaComprobanteFactura,iSizeTabla,this,true,"nombre_cajaComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarnombre_cajaComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarnombre_cajaComprobanteFactura,this,true,"nombre_cajaComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL));

		if(this.comprobantefacturaConstantesFunciones.mostrarsecuencialComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturaConstantesFunciones.resaltarsecuencialComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarsecuencialComprobanteFactura,iSizeTabla,this,true,"secuencialComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarsecuencialComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarsecuencialComprobanteFactura,this,true,"secuencialComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_FECHA));

		if(this.comprobantefacturaConstantesFunciones.mostrarfechaComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.comprobantefacturaConstantesFunciones.resaltarfechaComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarfechaComprobanteFactura,iSizeTabla,this,true,"fechaComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarfechaComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarfechaComprobanteFactura,this,true,"fechaComprobanteFactura","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE));

		if(this.comprobantefacturaConstantesFunciones.mostrarcodigo_clienteComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturaConstantesFunciones.resaltarcodigo_clienteComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarcodigo_clienteComprobanteFactura,iSizeTabla,this,true,"codigo_clienteComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarcodigo_clienteComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarcodigo_clienteComprobanteFactura,this,true,"codigo_clienteComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.comprobantefacturaConstantesFunciones.mostrarnombre_clienteComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comprobantefacturaConstantesFunciones.resaltarnombre_clienteComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarnombre_clienteComprobanteFactura,iSizeTabla,this,true,"nombre_clienteComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarnombre_clienteComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarnombre_clienteComprobanteFactura,this,true,"nombre_clienteComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL));

		if(this.comprobantefacturaConstantesFunciones.mostrarsubtotalComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltarsubtotalComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarsubtotalComprobanteFactura,iSizeTabla,this,true,"subtotalComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarsubtotalComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarsubtotalComprobanteFactura,this,true,"subtotalComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_IVA));

		if(this.comprobantefacturaConstantesFunciones.mostrarivaComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_IVA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltarivaComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarivaComprobanteFactura,iSizeTabla,this,true,"ivaComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarivaComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarivaComprobanteFactura,this,true,"ivaComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO));

		if(this.comprobantefacturaConstantesFunciones.mostrardescuentoComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltardescuentoComprobanteFactura,this.comprobantefacturaConstantesFunciones.activardescuentoComprobanteFactura,iSizeTabla,this,true,"descuentoComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltardescuentoComprobanteFactura,this.comprobantefacturaConstantesFunciones.activardescuentoComprobanteFactura,this,true,"descuentoComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO));

		if(this.comprobantefacturaConstantesFunciones.mostrarfinanciamientoComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltarfinanciamientoComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarfinanciamientoComprobanteFactura,iSizeTabla,this,true,"financiamientoComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarfinanciamientoComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarfinanciamientoComprobanteFactura,this,true,"financiamientoComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_FLETE));

		if(this.comprobantefacturaConstantesFunciones.mostrarfleteComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_FLETE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltarfleteComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarfleteComprobanteFactura,iSizeTabla,this,true,"fleteComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarfleteComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarfleteComprobanteFactura,this,true,"fleteComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_ICE));

		if(this.comprobantefacturaConstantesFunciones.mostrariceComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_ICE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltariceComprobanteFactura,this.comprobantefacturaConstantesFunciones.activariceComprobanteFactura,iSizeTabla,this,true,"iceComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltariceComprobanteFactura,this.comprobantefacturaConstantesFunciones.activariceComprobanteFactura,this,true,"iceComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_TOTAL));

		if(this.comprobantefacturaConstantesFunciones.mostrartotalComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_TOTAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltartotalComprobanteFactura,this.comprobantefacturaConstantesFunciones.activartotalComprobanteFactura,iSizeTabla,this,true,"totalComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltartotalComprobanteFactura,this.comprobantefacturaConstantesFunciones.activartotalComprobanteFactura,this,true,"totalComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO));

		if(this.comprobantefacturaConstantesFunciones.mostrarcantidad_formas_pagoComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltarcantidad_formas_pagoComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarcantidad_formas_pagoComprobanteFactura,iSizeTabla,this,true,"cantidad_formas_pagoComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltarcantidad_formas_pagoComprobanteFactura,this.comprobantefacturaConstantesFunciones.activarcantidad_formas_pagoComprobanteFactura,this,true,"cantidad_formas_pagoComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL));

		if(this.comprobantefacturaConstantesFunciones.mostrardescuento_realComprobanteFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comprobantefacturaConstantesFunciones.resaltardescuento_realComprobanteFactura,this.comprobantefacturaConstantesFunciones.activardescuento_realComprobanteFactura,iSizeTabla,this,true,"descuento_realComprobanteFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comprobantefacturaConstantesFunciones.resaltardescuento_realComprobanteFactura,this.comprobantefacturaConstantesFunciones.activardescuento_realComprobanteFactura,this,true,"descuento_realComprobanteFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComprobanteFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobanteFactura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComprobanteFactura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComprobanteFactura.addColumn(tableColumn);
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
			
			this.jTableDatosComprobanteFactura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComprobanteFactura.moveColumn(this.jTableDatosComprobanteFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComprobanteFactura.moveColumn(this.jTableDatosComprobanteFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComprobanteFactura.moveColumn(this.jTableDatosComprobanteFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComprobanteFactura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComprobanteFactura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComprobanteFactura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComprobanteFactura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComprobanteFactura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComprobanteFactura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComprobanteFactura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComprobanteFactura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=comprobantefacturaLogic.getComprobanteFacturas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comprobantefacturas.size()-1;
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
		//this.jTableDatosComprobanteFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComprobanteFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComprobanteFactura();
			
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
				
				//this.isEsNuevoComprobanteFactura=false;
					
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
				if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComprobanteFactura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobanteFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobanteFactura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comprobantefactura.getsType().equals("DUPLICADO")
				   || this.comprobantefactura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComprobanteFactura=true;
				
				} else {
					this.isEsNuevoComprobanteFactura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
					if(this.comprobantefactura.getId()>=0 && !this.comprobantefactura.getIsNew()) {						
						this.isEsNuevoComprobanteFactura=false;
						
					} else {
						this.isEsNuevoComprobanteFactura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComprobanteFactura(esRelaciones);						
				
				this.seleccionarComprobanteFactura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comprobantefactura.getId()<0) {
					this.isEsNuevoComprobanteFactura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComprobanteFactura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComprobanteFactura(evt,rowIndex);
				}	
				
				if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComprobanteFactura: " + this.dDif); 
					}
				}								
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComprobanteFactura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comprobantefactura)) {
					if(this.comprobantefactura.getId()>0) {
						this.comprobantefactura.setIsDeleted(true);
						
						this.comprobantefacturasEliminados.add(this.comprobantefactura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comprobantefacturaLogic.getComprobanteFacturas().remove(this.comprobantefactura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comprobantefacturas.remove(this.comprobantefactura);				
					}
					
					
					((ComprobanteFacturaModel) this.jTableDatosComprobanteFactura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComprobanteFactura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComprobanteFactura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComprobanteFactura) {
			
			if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComprobanteFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComprobanteFactura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComprobanteFactura(this.comprobantefactura);
				}
				
				//ARCHITECTURE
				try {
					

					//Caja
					if(!this.comprobantefacturaConstantesFunciones.cargarid_cajaComprobanteFactura || this.comprobantefacturaConstantesFunciones.event_dependid_cajaComprobanteFactura) {
						//this.cargarCombosCajasForeignKeyLista(" where id="+this.comprobantefactura.getid_caja());
									//this.inicializarActualizarBindingComprobanteFactura(false,false);
						this.cajasForeignKey=new ArrayList<Caja>();

						if(comprobantefactura.getCaja()!=null) {
							this.cajasForeignKey.add(comprobantefactura.getCaja());
						}

						this.addItemDefectoCombosForeignKeyCaja();
						this.cargarCombosFrameCajasForeignKey("Todos");
					}
					this.setActualCajaForeignKey(this.comprobantefactura.getid_caja(),false,"Formulario");

					//Cliente
					if(!this.comprobantefacturaConstantesFunciones.cargarid_clienteComprobanteFactura || this.comprobantefacturaConstantesFunciones.event_dependid_clienteComprobanteFactura) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.comprobantefactura.getid_cliente());
									//this.inicializarActualizarBindingComprobanteFactura(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(comprobantefactura.getCliente()!=null) {
							this.clientesForeignKey.add(comprobantefactura.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.comprobantefactura.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComprobanteFactura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComprobanteFactura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComprobanteFactura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobanteFactura(ComprobanteFactura comprobantefactura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComprobanteFactura(comprobantefactura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComprobanteFactura(ComprobanteFactura comprobantefactura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComprobanteFactura(comprobantefactura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComprobanteFactura(comprobantefactura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFactura(comprobantefactura);
	}
	
	public void setVariablesObjetoActualToFormularioComprobanteFactura(ComprobanteFactura comprobantefactura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.setText(comprobantefactura.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_cajaComprobanteFactura.setText(comprobantefactura.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsecuencialComprobanteFactura.setText(comprobantefactura.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfechaComprobanteFactura.setDate(comprobantefactura.getfecha());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcodigo_clienteComprobanteFactura.setText(comprobantefactura.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_clienteComprobanteFactura.setText(comprobantefactura.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsubtotalComprobanteFactura.setText(comprobantefactura.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldivaComprobanteFactura.setText(comprobantefactura.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuentoComprobanteFactura.setText(comprobantefactura.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfinanciamientoComprobanteFactura.setText(comprobantefactura.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfleteComprobanteFactura.setText(comprobantefactura.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldiceComprobanteFactura.setText(comprobantefactura.getice().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldtotalComprobanteFactura.setText(comprobantefactura.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcantidad_formas_pagoComprobanteFactura.setText(comprobantefactura.getcantidad_formas_pago().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuento_realComprobanteFactura.setText(comprobantefactura.getdescuento_real().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComprobanteFactura comprobantefacturaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comprobantefacturaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComprobanteFactura comprobantefacturaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comprobantefacturaLocal=this.comprobantefactura;
			} else {
				comprobantefacturaLocal=this.comprobantefacturaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comprobantefacturaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComprobanteFactura(comprobantefacturaLocal,true);
					
					if(comprobantefacturaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comprobantefacturaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comprobantefacturaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComprobanteFactura(ComprobanteFactura comprobantefactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobanteFactura(comprobantefactura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(comprobantefactura);
	}
	
	public void setVariablesFormularioToObjetoActualComprobanteFactura(ComprobanteFactura comprobantefactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComprobanteFactura(comprobantefactura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComprobanteFactura(ComprobanteFactura comprobantefactura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.getText()==null || this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.getText()=="" || this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.getText()=="Id") {
				this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.setText("0");
			}

			if(conColumnasBase) {comprobantefactura.setId(Long.parseLong(this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelIdComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setnombre_caja(this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_cajaComprobanteFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelnombre_cajaComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setsecuencial(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsecuencialComprobanteFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelsecuencialComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setfecha(this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfechaComprobanteFactura.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfechaComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setcodigo_cliente(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcodigo_clienteComprobanteFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelcodigo_clienteComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setnombre_cliente(this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_clienteComprobanteFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelnombre_clienteComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setsubtotal(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsubtotalComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelsubtotalComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setiva(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldivaComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_IVA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelivaComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setdescuento(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuentoComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabeldescuentoComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setfinanciamiento(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfinanciamientoComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfinanciamientoComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setflete(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfleteComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_FLETE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelfleteComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setice(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldiceComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_ICE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabeliceComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.settotal(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldtotalComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_TOTAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabeltotalComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setcantidad_formas_pago(Integer.parseInt(this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcantidad_formas_pagoComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabelcantidad_formas_pagoComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comprobantefactura.setdescuento_real(Double.parseDouble(this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuento_realComprobanteFactura.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComprobanteFactura.jLabeldescuento_realComprobanteFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComprobanteFactura(ComprobanteFactura comprobantefacturaBean,ComprobanteFactura comprobantefactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComprobanteFactura(ComprobanteFactura comprobantefacturaOrigen,ComprobanteFactura comprobantefactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobantefacturaOrigen.getId()!=null && !comprobantefacturaOrigen.getId().equals(0L))) {comprobantefactura.setId(comprobantefacturaOrigen.getId());}}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getfecha_inicio()!=null && !comprobantefacturaOrigen.getfecha_inicio().equals(new Date()))) {comprobantefactura.setfecha_inicio(comprobantefacturaOrigen.getfecha_inicio());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getfecha_fin()!=null && !comprobantefacturaOrigen.getfecha_fin().equals(new Date()))) {comprobantefactura.setfecha_fin(comprobantefacturaOrigen.getfecha_fin());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getid_caja()!=null && !comprobantefacturaOrigen.getid_caja().equals(-1L))) {comprobantefactura.setid_caja(comprobantefacturaOrigen.getid_caja());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getid_cliente()!=null && !comprobantefacturaOrigen.getid_cliente().equals(-1L))) {comprobantefactura.setid_cliente(comprobantefacturaOrigen.getid_cliente());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getnombre_caja()!=null && !comprobantefacturaOrigen.getnombre_caja().equals(""))) {comprobantefactura.setnombre_caja(comprobantefacturaOrigen.getnombre_caja());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getsecuencial()!=null && !comprobantefacturaOrigen.getsecuencial().equals(""))) {comprobantefactura.setsecuencial(comprobantefacturaOrigen.getsecuencial());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getfecha()!=null && !comprobantefacturaOrigen.getfecha().equals(new Date()))) {comprobantefactura.setfecha(comprobantefacturaOrigen.getfecha());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getcodigo_cliente()!=null && !comprobantefacturaOrigen.getcodigo_cliente().equals(""))) {comprobantefactura.setcodigo_cliente(comprobantefacturaOrigen.getcodigo_cliente());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getnombre_cliente()!=null && !comprobantefacturaOrigen.getnombre_cliente().equals(""))) {comprobantefactura.setnombre_cliente(comprobantefacturaOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getsubtotal()!=null && !comprobantefacturaOrigen.getsubtotal().equals(0.0))) {comprobantefactura.setsubtotal(comprobantefacturaOrigen.getsubtotal());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getiva()!=null && !comprobantefacturaOrigen.getiva().equals(0.0))) {comprobantefactura.setiva(comprobantefacturaOrigen.getiva());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getdescuento()!=null && !comprobantefacturaOrigen.getdescuento().equals(0.0))) {comprobantefactura.setdescuento(comprobantefacturaOrigen.getdescuento());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getfinanciamiento()!=null && !comprobantefacturaOrigen.getfinanciamiento().equals(0.0))) {comprobantefactura.setfinanciamiento(comprobantefacturaOrigen.getfinanciamiento());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getflete()!=null && !comprobantefacturaOrigen.getflete().equals(0.0))) {comprobantefactura.setflete(comprobantefacturaOrigen.getflete());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getice()!=null && !comprobantefacturaOrigen.getice().equals(0.0))) {comprobantefactura.setice(comprobantefacturaOrigen.getice());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.gettotal()!=null && !comprobantefacturaOrigen.gettotal().equals(0.0))) {comprobantefactura.settotal(comprobantefacturaOrigen.gettotal());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getcantidad_formas_pago()!=null && !comprobantefacturaOrigen.getcantidad_formas_pago().equals(0))) {comprobantefactura.setcantidad_formas_pago(comprobantefacturaOrigen.getcantidad_formas_pago());}
			if(conDefault || (!conDefault && comprobantefacturaOrigen.getdescuento_real()!=null && !comprobantefacturaOrigen.getdescuento_real().equals(0.0))) {comprobantefactura.setdescuento_real(comprobantefacturaOrigen.getdescuento_real());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobanteFactura(ComprobanteFactura comprobantefactura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.setText(comprobantefactura.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_cajaComprobanteFactura.setText(comprobantefactura.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsecuencialComprobanteFactura.setText(comprobantefactura.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfechaComprobanteFactura.setDate(comprobantefactura.getfecha());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcodigo_clienteComprobanteFactura.setText(comprobantefactura.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_clienteComprobanteFactura.setText(comprobantefactura.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsubtotalComprobanteFactura.setText(comprobantefactura.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldivaComprobanteFactura.setText(comprobantefactura.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuentoComprobanteFactura.setText(comprobantefactura.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfinanciamientoComprobanteFactura.setText(comprobantefactura.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfleteComprobanteFactura.setText(comprobantefactura.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldiceComprobanteFactura.setText(comprobantefactura.getice().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldtotalComprobanteFactura.setText(comprobantefactura.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcantidad_formas_pagoComprobanteFactura.setText(comprobantefactura.getcantidad_formas_pago().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuento_realComprobanteFactura.setText(comprobantefactura.getdescuento_real().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComprobanteFactura(ComprobanteFacturaBean comprobantefacturaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.setText(comprobantefacturaBean.getId().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_cajaComprobanteFactura.setText(comprobantefacturaBean.getnombre_caja());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsecuencialComprobanteFactura.setText(comprobantefacturaBean.getsecuencial());
			this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfechaComprobanteFactura.setDate(comprobantefacturaBean.getfecha());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcodigo_clienteComprobanteFactura.setText(comprobantefacturaBean.getcodigo_cliente());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_clienteComprobanteFactura.setText(comprobantefacturaBean.getnombre_cliente());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsubtotalComprobanteFactura.setText(comprobantefacturaBean.getsubtotal().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldivaComprobanteFactura.setText(comprobantefacturaBean.getiva().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuentoComprobanteFactura.setText(comprobantefacturaBean.getdescuento().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfinanciamientoComprobanteFactura.setText(comprobantefacturaBean.getfinanciamiento().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfleteComprobanteFactura.setText(comprobantefacturaBean.getflete().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldiceComprobanteFactura.setText(comprobantefacturaBean.getice().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldtotalComprobanteFactura.setText(comprobantefacturaBean.gettotal().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcantidad_formas_pagoComprobanteFactura.setText(comprobantefacturaBean.getcantidad_formas_pago().toString());
			this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuento_realComprobanteFactura.setText(comprobantefacturaBean.getdescuento_real().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComprobanteFactura(ComprobanteFacturaParameterReturnGeneral comprobantefacturaReturnGeneral,ComprobanteFacturaBean comprobantefacturaBean,Boolean conDefault) throws Exception { 
		try {
			ComprobanteFactura comprobantefacturaLocal=new ComprobanteFactura();
			
			comprobantefacturaLocal=comprobantefacturaReturnGeneral.getComprobanteFactura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comprobantefacturaLocal.getId()!=null && !comprobantefacturaLocal.getId().equals(0L))) {comprobantefacturaBean.setId(comprobantefacturaLocal.getId());}}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getnombre_caja()!=null && !comprobantefacturaLocal.getnombre_caja().equals(""))) {comprobantefacturaBean.setnombre_caja(comprobantefacturaLocal.getnombre_caja());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getsecuencial()!=null && !comprobantefacturaLocal.getsecuencial().equals(""))) {comprobantefacturaBean.setsecuencial(comprobantefacturaLocal.getsecuencial());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getfecha()!=null && !comprobantefacturaLocal.getfecha().equals(new Date()))) {comprobantefacturaBean.setfecha(comprobantefacturaLocal.getfecha());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getcodigo_cliente()!=null && !comprobantefacturaLocal.getcodigo_cliente().equals(""))) {comprobantefacturaBean.setcodigo_cliente(comprobantefacturaLocal.getcodigo_cliente());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getnombre_cliente()!=null && !comprobantefacturaLocal.getnombre_cliente().equals(""))) {comprobantefacturaBean.setnombre_cliente(comprobantefacturaLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getsubtotal()!=null && !comprobantefacturaLocal.getsubtotal().equals(0.0))) {comprobantefacturaBean.setsubtotal(comprobantefacturaLocal.getsubtotal());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getiva()!=null && !comprobantefacturaLocal.getiva().equals(0.0))) {comprobantefacturaBean.setiva(comprobantefacturaLocal.getiva());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getdescuento()!=null && !comprobantefacturaLocal.getdescuento().equals(0.0))) {comprobantefacturaBean.setdescuento(comprobantefacturaLocal.getdescuento());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getfinanciamiento()!=null && !comprobantefacturaLocal.getfinanciamiento().equals(0.0))) {comprobantefacturaBean.setfinanciamiento(comprobantefacturaLocal.getfinanciamiento());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getflete()!=null && !comprobantefacturaLocal.getflete().equals(0.0))) {comprobantefacturaBean.setflete(comprobantefacturaLocal.getflete());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getice()!=null && !comprobantefacturaLocal.getice().equals(0.0))) {comprobantefacturaBean.setice(comprobantefacturaLocal.getice());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.gettotal()!=null && !comprobantefacturaLocal.gettotal().equals(0.0))) {comprobantefacturaBean.settotal(comprobantefacturaLocal.gettotal());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getcantidad_formas_pago()!=null && !comprobantefacturaLocal.getcantidad_formas_pago().equals(0))) {comprobantefacturaBean.setcantidad_formas_pago(comprobantefacturaLocal.getcantidad_formas_pago());}
			if(conDefault || (!conDefault && comprobantefacturaLocal.getdescuento_real()!=null && !comprobantefacturaLocal.getdescuento_real().equals(0.0))) {comprobantefacturaBean.setdescuento_real(comprobantefacturaLocal.getdescuento_real());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComprobanteFacturaGenerico(Long idComprobanteFacturaSeleccionado,JComboBox jComboBoxComprobanteFactura,List<ComprobanteFactura> comprobantefacturasLocal)throws Exception {
		try {
			ComprobanteFactura  comprobantefacturaTemp=null;

			for(ComprobanteFactura comprobantefacturaAux:comprobantefacturasLocal) {
				if(comprobantefacturaAux.getId()!=null && comprobantefacturaAux.getId().equals(idComprobanteFacturaSeleccionado)) {
					comprobantefacturaTemp=comprobantefacturaAux;
					break;
				}
			}

			jComboBoxComprobanteFactura.setSelectedItem(comprobantefacturaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComprobanteFacturaGenerico(JComboBox jComboBoxComprobanteFactura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobanteFactura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComprobanteFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComprobanteFactura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComprobanteFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComprobanteFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComprobanteFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantefactura=(ComprobanteFactura) comprobantefacturaLogic.getComprobanteFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobantefactura =(ComprobanteFactura) comprobantefacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comprobantefactura.getIsNew() && !comprobantefactura.getIsChanged() && !comprobantefactura.getIsDeleted()) {
				sDescripcion=comprobantefactura.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantefactura.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!comprobantefactura.getIsNew() && !comprobantefactura.getIsChanged() && !comprobantefactura.getIsDeleted()) {
				sDescripcion=comprobantefactura.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantefactura.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Caja")) {
			//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
			if(!comprobantefactura.getIsNew() && !comprobantefactura.getIsChanged() && !comprobantefactura.getIsDeleted()) {
				sDescripcion=comprobantefactura.getcaja_descripcion();
			} else {
				//sDescripcion=this.getActualCajaForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantefactura.getcaja_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!comprobantefactura.getIsNew() && !comprobantefactura.getIsChanged() && !comprobantefactura.getIsDeleted()) {
				sDescripcion=comprobantefactura.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=comprobantefactura.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComprobanteFactura comprobantefacturaRow=new ComprobanteFactura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantefacturaRow=(ComprobanteFactura) comprobantefacturaLogic.getComprobanteFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comprobantefacturaRow=(ComprobanteFactura) comprobantefacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComprobanteFactura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoComprobanteFactura && this.isPermisoNuevoComprobanteFactura));			
			this.jButtonDuplicarComprobanteFactura.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFactura && this.isPermisoDuplicarComprobanteFactura));			
			this.jButtonCopiarComprobanteFactura.setVisible((this.isVisibilidadCeldaCopiarComprobanteFactura && this.isPermisoCopiarComprobanteFactura));
			this.jButtonVerFormComprobanteFactura.setVisible((this.isVisibilidadCeldaVerFormComprobanteFactura && this.isPermisoVerFormComprobanteFactura));
			
			this.jButtonAbrirOrderByComprobanteFactura.setVisible((this.isVisibilidadCeldaOrdenComprobanteFactura && this.isPermisoOrdenComprobanteFactura));			
			
			this.jButtonNuevoRelacionesComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura && this.isPermisoNuevoComprobanteFactura));			
			this.jButtonNuevoGuardarCambiosComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoComprobanteFactura && this.isPermisoNuevoComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));
			
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarComprobanteFactura.setVisible((this.isVisibilidadCeldaModificarComprobanteFactura && this.isPermisoActualizarComprobanteFactura));	
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarComprobanteFactura.setVisible((this.isVisibilidadCeldaActualizarComprobanteFactura && this.isPermisoActualizarComprobanteFactura));	
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarComprobanteFactura.setVisible((this.isVisibilidadCeldaEliminarComprobanteFactura && this.isPermisoEliminarComprobanteFactura));
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarComprobanteFactura.setVisible(this.isVisibilidadCeldaCancelarComprobanteFactura);							
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosComprobanteFactura.setVisible((this.isVisibilidadCeldaGuardarComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));			
			
			}
						
			this.jButtonGuardarCambiosTablaComprobanteFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoComprobanteFactura && this.isPermisoNuevoComprobanteFactura));						
			this.jButtonDuplicarToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFactura && this.isPermisoDuplicarComprobanteFactura));						
			this.jButtonCopiarToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaCopiarComprobanteFactura && this.isPermisoCopiarComprobanteFactura));			
			this.jButtonVerFormToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaVerFormComprobanteFactura && this.isPermisoVerFormComprobanteFactura));			
			this.jButtonAbrirOrderByToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaOrdenComprobanteFactura && this.isPermisoOrdenComprobanteFactura));
			this.jButtonNuevoRelacionesToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura && this.isPermisoNuevoComprobanteFactura));			
			this.jButtonNuevoGuardarCambiosToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoComprobanteFactura && this.isPermisoNuevoComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));			
			
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaModificarComprobanteFactura && this.isPermisoActualizarComprobanteFactura));	
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaActualizarComprobanteFactura  && this.isPermisoActualizarComprobanteFactura));	
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaEliminarComprobanteFactura && this.isPermisoEliminarComprobanteFactura));
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarToolBarComprobanteFactura.setVisible(this.isVisibilidadCeldaCancelarComprobanteFactura);				
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaGuardarComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComprobanteFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoComprobanteFactura && this.isPermisoNuevoComprobanteFactura));			
			this.jMenuItemDuplicarComprobanteFactura.setVisible((this.isVisibilidadCeldaDuplicarComprobanteFactura && this.isPermisoDuplicarComprobanteFactura));			
			this.jMenuItemCopiarComprobanteFactura.setVisible((this.isVisibilidadCeldaCopiarComprobanteFactura && this.isPermisoCopiarComprobanteFactura));			
			this.jMenuItemVerFormComprobanteFactura.setVisible((this.isVisibilidadCeldaVerFormComprobanteFactura && this.isPermisoVerFormComprobanteFactura));			
			this.jMenuItemAbrirOrderByComprobanteFactura.setVisible((this.isVisibilidadCeldaOrdenComprobanteFactura && this.isPermisoOrdenComprobanteFactura));			
			//this.jMenuItemMostrarOcultarComprobanteFactura.setVisible((this.isVisibilidadCeldaOrdenComprobanteFactura && this.isPermisoOrdenComprobanteFactura));
			this.jMenuItemDetalleAbrirOrderByComprobanteFactura.setVisible((this.isVisibilidadCeldaOrdenComprobanteFactura && this.isPermisoOrdenComprobanteFactura));			
			//this.jMenuItemDetalleMostrarOcultarComprobanteFactura.setVisible((this.isVisibilidadCeldaOrdenComprobanteFactura && this.isPermisoOrdenComprobanteFactura));			
			this.jMenuItemNuevoRelacionesComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura && this.isPermisoNuevoComprobanteFactura));			
			this.jMenuItemNuevoGuardarCambiosComprobanteFactura.setVisible((this.isVisibilidadCeldaNuevoComprobanteFactura && this.isPermisoNuevoComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));									
			
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemModificarComprobanteFactura.setVisible((this.isVisibilidadCeldaModificarComprobanteFactura && this.isPermisoActualizarComprobanteFactura));	
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemActualizarComprobanteFactura.setVisible((this.isVisibilidadCeldaActualizarComprobanteFactura && this.isPermisoActualizarComprobanteFactura));	
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemEliminarComprobanteFactura.setVisible((this.isVisibilidadCeldaEliminarComprobanteFactura && this.isPermisoEliminarComprobanteFactura));
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemCancelarComprobanteFactura.setVisible(this.isVisibilidadCeldaCancelarComprobanteFactura);				
			}
			
			this.jMenuItemGuardarCambiosComprobanteFactura.setVisible((this.isVisibilidadCeldaGuardarComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));						
			this.jMenuItemGuardarCambiosTablaComprobanteFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComprobanteFactura=this.jButtonNuevoComprobanteFactura.isVisible();
			this.isVisibilidadCeldaDuplicarComprobanteFactura=this.jButtonDuplicarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaCopiarComprobanteFactura=this.jButtonCopiarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaVerFormComprobanteFactura=this.jButtonVerFormComprobanteFactura.isVisible();
			
			this.isVisibilidadCeldaOrdenComprobanteFactura=this.jButtonAbrirOrderByComprobanteFactura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=this.jButtonNuevoRelacionesComprobanteFactura.isVisible();
			this.isVisibilidadCeldaModificarComprobanteFactura=this.jButtonModificarComprobanteFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			this.isVisibilidadCeldaActualizarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaGuardarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosComprobanteFactura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=this.jButtonGuardarCambiosTablaComprobanteFactura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComprobanteFactura=this.jButtonNuevoToolBarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=this.jButtonNuevoRelacionesToolBarComprobanteFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			this.isVisibilidadCeldaModificarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarToolBarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaActualizarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarToolBarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarToolBarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarToolBarComprobanteFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobanteFactura=this.jButtonGuardarCambiosToolBarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=this.jButtonGuardarCambiosTablaToolBarComprobanteFactura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComprobanteFactura=this.jMenuItemNuevoComprobanteFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=this.jMenuItemNuevoRelacionesComprobanteFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			this.isVisibilidadCeldaModificarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemModificarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaActualizarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemActualizarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaEliminarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemEliminarComprobanteFactura.isVisible();
			this.isVisibilidadCeldaCancelarComprobanteFactura=this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemCancelarComprobanteFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComprobanteFactura=this.jMenuItemGuardarCambiosComprobanteFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=this.jMenuItemGuardarCambiosTablaComprobanteFactura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComprobanteFactura(Boolean esInicializar) {
		if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {
				//if(this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComprobanteFactura();
			}
			
			this.inicializarActualizarBindingBotonesManualComprobanteFactura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComprobanteFactura() {
		this.jButtonNuevoComprobanteFactura.setVisible(this.isPermisoNuevoComprobanteFactura);			
		this.jButtonDuplicarComprobanteFactura.setVisible(this.isPermisoDuplicarComprobanteFactura);			
		this.jButtonCopiarComprobanteFactura.setVisible(this.isPermisoCopiarComprobanteFactura);			
		this.jButtonVerFormComprobanteFactura.setVisible(this.isPermisoVerFormComprobanteFactura);			
		
		this.jButtonAbrirOrderByComprobanteFactura.setVisible(this.isPermisoOrdenComprobanteFactura);					
		
		this.jButtonNuevoRelacionesComprobanteFactura.setVisible(this.isPermisoNuevoComprobanteFactura);			
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarComprobanteFactura.setVisible(this.isPermisoActualizarComprobanteFactura);	
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarComprobanteFactura.setVisible(this.isPermisoActualizarComprobanteFactura);	
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarComprobanteFactura.setVisible(this.isPermisoEliminarComprobanteFactura);
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarComprobanteFactura.setVisible(this.isVisibilidadCeldaCancelarComprobanteFactura);						
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosComprobanteFactura.setVisible(this.isPermisoGuardarCambiosComprobanteFactura);							
		}
		
		this.jButtonGuardarCambiosTablaComprobanteFactura.setVisible(this.isPermisoActualizarComprobanteFactura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobanteFactura() {
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarComprobanteFactura.setVisible(this.isPermisoActualizarComprobanteFactura);	
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarComprobanteFactura.setVisible(this.isPermisoActualizarComprobanteFactura);	
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarComprobanteFactura.setVisible(this.isPermisoEliminarComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarComprobanteFactura.setVisible(this.isVisibilidadCeldaCancelarComprobanteFactura);							
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosComprobanteFactura.setVisible((this.isVisibilidadCeldaGuardarComprobanteFactura && this.isPermisoGuardarCambiosComprobanteFactura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComprobanteFactura() {
		if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComprobanteFactura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComprobanteFactura() {
	}
	
	public void jTableDatosComprobanteFacturaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComprobanteFactura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comprobantefactura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComprobanteFacturaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComprobanteFactura(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFactura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFactura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comprobantefacturaLogic.getConnexion());

				if(this.comprobantefactura.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comprobantefactura.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFactura=(TitledBorder)this.jScrollPanelDatosComprobanteFactura.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComprobanteFactura.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comprobantefactura.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorComprobanteFacturaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebComprobanteFactura(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFactura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFactura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.comprobantefacturaLogic.getConnexion());

				if(this.comprobantefactura.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.comprobantefactura.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFactura=(TitledBorder)this.jScrollPanelDatosComprobanteFactura.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComprobanteFactura.getTitle() + " -> VENDEDOR");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.comprobantefactura.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_inicioComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getfecha_inicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_inicio = '"+Funciones2.getStringPostgresDate(this.comprobantefactura.getfecha_inicio())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_finComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getfecha_fin()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_fin = '"+Funciones2.getStringPostgresDate(this.comprobantefactura.getfecha_fin())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_cajaComprobanteFacturaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocaja=true;

			idTienePermisocaja=this.tienePermisosUsuarioEnPaginaWebComprobanteFactura(CajaConstantesFunciones.CLASSNAME);

			if(idTienePermisocaja) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFactura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFactura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);

				this.cajaBeanSwingJInternalFrame=new CajaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.cajaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.cajaBeanSwingJInternalFrame.getCajaLogic().setConnexion(this.comprobantefacturaLogic.getConnexion());

				if(this.comprobantefactura.getid_caja()!=null) {
					this.cajaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.cajaBeanSwingJInternalFrame.setIdActual(this.comprobantefactura.getid_caja());
					this.cajaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.cajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaCaja();
				}

				JInternalFrameBase jinternalFrame =this.cajaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFactura=(TitledBorder)this.jScrollPanelDatosComprobanteFactura.getBorder();
				TitledBorder titledBordercaja=(TitledBorder)this.cajaBeanSwingJInternalFrame.jScrollPanelDatosCaja.getBorder();

				titledBordercaja.setTitle(titledBorderComprobanteFactura.getTitle() + " -> Caja");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_cajaComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getid_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_caja = "+this.comprobantefactura.getid_caja().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteComprobanteFacturaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebComprobanteFactura(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComprobanteFactura.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComprobanteFactura.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.comprobantefacturaLogic.getConnexion());

				if(this.comprobantefactura.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.comprobantefactura.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComprobanteFactura=(TitledBorder)this.jScrollPanelDatosComprobanteFactura.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderComprobanteFactura.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.comprobantefactura.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_cajaComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getnombre_caja()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_caja like '%"+this.comprobantefactura.getnombre_caja()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsecuencialComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getsecuencial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where secuencial like '%"+this.comprobantefactura.getsecuencial()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.comprobantefactura.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigo_clienteComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getcodigo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo_cliente like '%"+this.comprobantefactura.getcodigo_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.comprobantefactura.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsubtotalComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getsubtotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where subtotal = "+this.comprobantefactura.getsubtotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonivaComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getiva()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where iva = "+this.comprobantefactura.getiva().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuentoComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getdescuento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento = "+this.comprobantefactura.getdescuento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfinanciamientoComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getfinanciamiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where financiamiento = "+this.comprobantefactura.getfinanciamiento().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfleteComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getflete()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where flete = "+this.comprobantefactura.getflete().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoniceComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getice()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ice = "+this.comprobantefactura.getice().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotalComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.gettotal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total = "+this.comprobantefactura.gettotal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidad_formas_pagoComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getcantidad_formas_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad_formas_pago = "+this.comprobantefactura.getcantidad_formas_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescuento_realComprobanteFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.getcomprobantefactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comprobantefactura==null) {
						this.comprobantefactura = new ComprobanteFactura();
					}

					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);
				}

				if(this.comprobantefactura.getdescuento_real()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descuento_real = "+this.comprobantefactura.getdescuento_real().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComprobanteFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaComprobanteFacturaComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFactura(false,false);

			this.getComprobanteFacturasBusquedaComprobanteFactura();

			this.inicializarActualizarBindingComprobanteFactura(false);

			//if(ComprobanteFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdCajaComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFactura(false,false);

			this.getComprobanteFacturasFK_IdCaja();

			this.inicializarActualizarBindingComprobanteFactura(false);

			//if(ComprobanteFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFactura(false,false);

			this.getComprobanteFacturasFK_IdCliente();

			this.inicializarActualizarBindingComprobanteFactura(false);

			//if(ComprobanteFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFactura(false,false);

			this.getComprobanteFacturasFK_IdEmpresa();

			this.inicializarActualizarBindingComprobanteFactura(false);

			//if(ComprobanteFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorComprobanteFacturaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComprobanteFactura(false,false);

			this.getComprobanteFacturasFK_IdVendedor();

			this.inicializarActualizarBindingComprobanteFactura(false);

			//if(ComprobanteFacturaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComprobanteFactura(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comprobantefacturaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComprobanteFactura() {
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
			this.jInternalFrameDetalleFormComprobanteFactura.setVisible(false);	    			
			this.jInternalFrameDetalleFormComprobanteFactura.dispose();
			this.jInternalFrameDetalleFormComprobanteFactura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
			this.jInternalFrameReporteDinamicoComprobanteFactura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComprobanteFactura.dispose();
			this.jInternalFrameReporteDinamicoComprobanteFactura=null;
		}
		
		if(this.jInternalFrameImportacionComprobanteFactura!=null) {
			this.jInternalFrameImportacionComprobanteFactura.setVisible(false);	    			
			this.jInternalFrameImportacionComprobanteFactura.dispose();
			this.jInternalFrameImportacionComprobanteFactura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComprobanteFactura();
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
			
			if(sTipo.equals("NuevoComprobanteFactura")) {
				jButtonNuevoComprobanteFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComprobanteFactura")) {
				jButtonDuplicarComprobanteFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComprobanteFactura")) {
				jButtonCopiarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormComprobanteFactura")) {
				jButtonVerFormComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComprobanteFactura")) {
				jButtonNuevoComprobanteFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComprobanteFactura")) {
				jButtonDuplicarComprobanteFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComprobanteFactura")) {
				jButtonNuevoComprobanteFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComprobanteFactura")) {
				jButtonDuplicarComprobanteFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComprobanteFactura")) {
				jButtonNuevoComprobanteFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComprobanteFactura")) {
				jButtonNuevoComprobanteFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComprobanteFactura")) {
				jButtonNuevoComprobanteFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComprobanteFactura")) {
				jButtonModificarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComprobanteFactura")) {
				jButtonModificarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComprobanteFactura")) {
				jButtonModificarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComprobanteFactura")) {
				jButtonActualizarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComprobanteFactura")) {
				jButtonActualizarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComprobanteFactura")) {
				jButtonActualizarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarComprobanteFactura")) {
				jButtonEliminarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComprobanteFactura")) {
				jButtonEliminarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComprobanteFactura")) {
				jButtonEliminarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarComprobanteFactura")) {
				jButtonCancelarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComprobanteFactura")) {
				jButtonCancelarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComprobanteFactura")) {
				jButtonCancelarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarComprobanteFactura")) {
				jButtonCerrarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComprobanteFactura")) {
				jButtonCerrarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComprobanteFactura")) {
				jButtonCerrarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComprobanteFactura")) {
				jButtonMostrarOcultarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComprobanteFactura")) {
				jButtonCancelarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComprobanteFactura")) {
				jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComprobanteFactura")) {
				jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComprobanteFactura")) {
				jButtonCopiarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComprobanteFactura")) {
				jButtonVerFormComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComprobanteFactura")) {
				jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComprobanteFactura")) {
				jButtonCopiarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComprobanteFactura")) {
				jButtonVerFormComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComprobanteFactura")) {
				jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComprobanteFactura")) {
				jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComprobanteFactura")) {
				jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComprobanteFactura")) {
				jButtonRecargarInformacionComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComprobanteFactura")) {
				jButtonRecargarInformacionComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComprobanteFactura")) {
				jButtonRecargarInformacionComprobanteFacturaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComprobanteFactura")) {
				jButtonAnterioresComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComprobanteFactura")) {
				jButtonAnterioresComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComprobanteFactura")) {
				jButtonAnterioresComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComprobanteFactura")) {
				jButtonSiguientesComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComprobanteFactura")) {
				jButtonSiguientesComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComprobanteFactura")) {
				jButtonSiguientesComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComprobanteFactura") || sTipo.equals("MenuItemDetalleAbrirOrderByComprobanteFactura")) {
				jButtonAbrirOrderByComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComprobanteFactura") || sTipo.equals("MenuItemDetalleMostrarOcultarComprobanteFactura")) {
				jButtonMostrarOcultarComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComprobanteFactura")) {
				jButtonNuevoGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComprobanteFactura")) {
				jButtonNuevoGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComprobanteFactura")) {
				jButtonNuevoGuardarCambiosComprobanteFacturaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComprobanteFactura")) {
				jButtonCerrarReporteDinamicoComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComprobanteFactura")) {
				jButtonGenerarReporteDinamicoComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComprobanteFactura")) {
				
				jButtonGenerarExcelReporteDinamicoComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComprobanteFactura")) {
				jButtonCerrarImportacionComprobanteFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComprobanteFactura")) {
				
				jButtonGenerarImportacionComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComprobanteFactura")) {
				
				jButtonAbrirImportacionComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComprobanteFactura")) {
				jComboBoxTiposAccionesComprobanteFacturaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComprobanteFactura")) {
				jComboBoxTiposRelacionesComprobanteFacturaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComprobanteFactura")) {
				jComboBoxTiposAccionesComprobanteFacturaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComprobanteFactura")) {
				
				jComboBoxTiposSeleccionarComprobanteFacturaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComprobanteFactura")) {
				jTextFieldValorCampoGeneralComprobanteFacturaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComprobanteFactura")) {
				jButtonAbrirOrderByComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComprobanteFactura")) {
				jButtonAbrirOrderByComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComprobanteFactura")) {
				jButtonCerrarOrderByComprobanteFacturaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobanteFacturaBusqueda")) {
				this.jButtonidComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobanteFacturaUpdate")) {
				this.jButtonid_empresaComprobanteFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobanteFacturaBusqueda")) {
				this.jButtonid_empresaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComprobanteFacturaUpdate")) {
				this.jButtonid_vendedorComprobanteFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComprobanteFacturaBusqueda")) {
				this.jButtonid_vendedorComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioComprobanteFacturaBusqueda")) {
				this.jButtonfecha_inicioComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finComprobanteFacturaBusqueda")) {
				this.jButtonfecha_finComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaComprobanteFacturaUpdate")) {
				this.jButtonid_cajaComprobanteFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaComprobanteFacturaBusqueda")) {
				this.jButtonid_cajaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteComprobanteFacturaUpdate")) {
				this.jButtonid_clienteComprobanteFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteComprobanteFacturaBusqueda")) {
				this.jButtonid_clienteComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaComprobanteFacturaBusqueda")) {
				this.jButtonnombre_cajaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialComprobanteFacturaBusqueda")) {
				this.jButtonsecuencialComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaComprobanteFacturaBusqueda")) {
				this.jButtonfechaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteComprobanteFacturaBusqueda")) {
				this.jButtoncodigo_clienteComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComprobanteFacturaBusqueda")) {
				this.jButtonnombre_clienteComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalComprobanteFacturaBusqueda")) {
				this.jButtonsubtotalComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaComprobanteFacturaBusqueda")) {
				this.jButtonivaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoComprobanteFacturaBusqueda")) {
				this.jButtondescuentoComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoComprobanteFacturaBusqueda")) {
				this.jButtonfinanciamientoComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteComprobanteFacturaBusqueda")) {
				this.jButtonfleteComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceComprobanteFacturaBusqueda")) {
				this.jButtoniceComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalComprobanteFacturaBusqueda")) {
				this.jButtontotalComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_formas_pagoComprobanteFacturaBusqueda")) {
				this.jButtoncantidad_formas_pagoComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_realComprobanteFacturaBusqueda")) {
				this.jButtondescuento_realComprobanteFacturaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaComprobanteFacturaComprobanteFactura")) {
				this.jButtonBusquedaComprobanteFacturaComprobanteFacturaActionPerformed(evt);
			}
			
			;
			
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComprobanteFactura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				


				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComprobanteFactura comprobantefacturaLocal=null;
			
			if(!this.getEsControlTabla()) {
				comprobantefacturaLocal=this.comprobantefactura;
			} else {
				comprobantefacturaLocal=this.comprobantefacturaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
							
				
				


				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
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
			
			


			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
								
						
				


				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
								
				
				


				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
							
				
				


				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
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
			
			


			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
								
				
				


				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComprobanteFactura")) {
					jCheckBoxSeleccionarTodosComprobanteFacturaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComprobanteFactura")) {
					jCheckBoxSeleccionadosComprobanteFacturaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComprobanteFactura")) {
					
				}
				
				


				
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
												
				
				


				
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
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
			
			


			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComprobanteFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comprobantefactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comprobantefactura);
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
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
				
				


				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComprobanteFactura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComprobanteFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComprobanteFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comprobantefacturaAnterior =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComprobanteFactura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComprobanteFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComprobanteFactura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comprobantefactura =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comprobantefactura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComprobanteFactura")) {
				
				}
				
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComprobanteFactura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComprobanteFactura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComprobanteFactura")) {
			
			}
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComprobanteFactura();
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
			if(sTipo.equals("NuevoComprobanteFactura")) {
				jButtonNuevoComprobanteFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComprobanteFactura")) {
				jButtonDuplicarComprobanteFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComprobanteFactura")) {
				jButtonCopiarComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComprobanteFactura")) {
				jButtonVerFormComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComprobanteFactura")) {
				jButtonNuevoComprobanteFacturaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComprobanteFactura")) {
				jButtonModificarComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComprobanteFactura")) {
				jButtonActualizarComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComprobanteFactura")) {
				jButtonEliminarComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComprobanteFactura")) {
				jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComprobanteFactura")) {
				jButtonCancelarComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComprobanteFactura")) {
				jButtonCerrarComprobanteFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComprobanteFactura")) {
				jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComprobanteFactura")) {
				jButtonNuevoGuardarCambiosComprobanteFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComprobanteFactura")) {
				jButtonAbrirOrderByComprobanteFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComprobanteFactura")) {
				jButtonRecargarInformacionComprobanteFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComprobanteFactura")) {
				jButtonAnterioresComprobanteFacturaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComprobanteFactura")) {
				jButtonSiguientesComprobanteFacturaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComprobanteFacturaBusqueda")) {
				this.jButtonidComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComprobanteFacturaUpdate")) {
				this.jButtonid_empresaComprobanteFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComprobanteFacturaBusqueda")) {
				this.jButtonid_empresaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComprobanteFacturaUpdate")) {
				this.jButtonid_vendedorComprobanteFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComprobanteFacturaBusqueda")) {
				this.jButtonid_vendedorComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_inicioComprobanteFacturaBusqueda")) {
				this.jButtonfecha_inicioComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_finComprobanteFacturaBusqueda")) {
				this.jButtonfecha_finComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_cajaComprobanteFacturaUpdate")) {
				this.jButtonid_cajaComprobanteFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_cajaComprobanteFacturaBusqueda")) {
				this.jButtonid_cajaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteComprobanteFacturaUpdate")) {
				this.jButtonid_clienteComprobanteFacturaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteComprobanteFacturaBusqueda")) {
				this.jButtonid_clienteComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_cajaComprobanteFacturaBusqueda")) {
				this.jButtonnombre_cajaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("secuencialComprobanteFacturaBusqueda")) {
				this.jButtonsecuencialComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaComprobanteFacturaBusqueda")) {
				this.jButtonfechaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigo_clienteComprobanteFacturaBusqueda")) {
				this.jButtoncodigo_clienteComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComprobanteFacturaBusqueda")) {
				this.jButtonnombre_clienteComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("subtotalComprobanteFacturaBusqueda")) {
				this.jButtonsubtotalComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ivaComprobanteFacturaBusqueda")) {
				this.jButtonivaComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuentoComprobanteFacturaBusqueda")) {
				this.jButtondescuentoComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("financiamientoComprobanteFacturaBusqueda")) {
				this.jButtonfinanciamientoComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fleteComprobanteFacturaBusqueda")) {
				this.jButtonfleteComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("iceComprobanteFacturaBusqueda")) {
				this.jButtoniceComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("totalComprobanteFacturaBusqueda")) {
				this.jButtontotalComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidad_formas_pagoComprobanteFacturaBusqueda")) {
				this.jButtoncantidad_formas_pagoComprobanteFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descuento_realComprobanteFacturaBusqueda")) {
				this.jButtondescuento_realComprobanteFacturaBusquedaActionPerformed(evt);
			}
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComprobanteFactura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComprobanteFactura")) {
				closingInternalFrameComprobanteFactura();
				
			} else if(sTipo.equals("jButtonCancelarComprobanteFactura")) {
				JInternalFrameBase jInternalFrameDetalleFormComprobanteFactura = (JInternalFrameBase)evt.getSource();
	            	
	            ComprobanteFacturaBeanSwingJInternalFrame jInternalFrameParent=(ComprobanteFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobanteFactura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComprobanteFacturaActionPerformed(null);
			}
			
			ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comprobantefactura,new Object(),this.comprobantefacturaParameterGeneral,this.comprobantefacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComprobanteFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComprobanteFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComprobanteFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comprobantefactura)) {
			if(!esControlTabla) {
				if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);			
				}
				
				if(this.comprobantefacturaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComprobanteFactura(this.comprobantefactura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComprobanteFactura(this.comprobantefacturaReturnGeneral,this.comprobantefacturaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comprobantefacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComprobanteFactura(classes,this.comprobantefacturaReturnGeneral,this.comprobantefacturaBean,false);
					}
						
					if(this.comprobantefacturaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComprobanteFactura(this.comprobantefacturaReturnGeneral.getComprobanteFactura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComprobanteFactura(this.comprobantefacturaReturnGeneral.getComprobanteFactura());	
					}
						
					if(this.comprobantefacturaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComprobanteFactura(this.comprobantefacturaReturnGeneral.getComprobanteFactura(),classes);//this.comprobantefacturaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComprobanteFactura(this.comprobantefactura,classes);//this.comprobantefacturaBean);									
				}
			
				if(ComprobanteFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComprobanteFactura(this.comprobantefactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComprobanteFactura(this.comprobantefactura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comprobantefacturaAnterior!=null) {
						this.comprobantefactura=this.comprobantefacturaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comprobantefacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comprobantefacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comprobantefacturaReturnGeneral.getComprobanteFactura(),comprobantefacturaLogic.getComprobanteFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comprobantefacturaReturnGeneral.getComprobanteFactura(),this.comprobantefacturas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComprobanteFactura.repaint();
				
				//((AbstractTableModel) this.jTableDatosComprobanteFactura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComprobanteFactura();
			}
		}
	}
	
	public void actualizarVisualTableDatosComprobanteFactura() throws Exception {
		
		ComprobanteFacturaModel comprobantefacturaModel=(ComprobanteFacturaModel)this.jTableDatosComprobanteFactura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comprobantefacturaModel.comprobantefacturas=this.comprobantefacturaLogic.getComprobanteFacturas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comprobantefacturaModel.comprobantefacturas=this.comprobantefacturas;
		}
		
		
		((ComprobanteFacturaModel) this.jTableDatosComprobanteFactura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComprobanteFactura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomprobantefacturaAnterior(),this.comprobantefacturaLogic.getComprobanteFacturas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomprobantefacturaAnterior(),this.comprobantefacturas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComprobanteFactura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComprobanteFactura(ComprobanteFactura comprobantefactura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
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
										
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobantefactura,new Object(),generalEntityParameterGeneral,this.comprobantefacturaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comprobantefacturaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComprobanteFacturaConstantesFunciones.getClassesRelationshipsOfComprobanteFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComprobanteFacturaConstantesFunciones.getClassesRelationshipsFromStringsOfComprobanteFactura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComprobanteFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComprobanteFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comprobantefactura,new Object(),generalEntityParameterGeneral,this.comprobantefacturaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComprobanteFactura(ComprobanteFacturaBean comprobantefacturaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComprobanteFactura(ArrayList<Classe> classes,ComprobanteFacturaReturnGeneral comprobantefacturaReturnGeneral,ComprobanteFacturaBean comprobantefacturaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComprobanteFactura(ComprobanteFactura comprobantefactura,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comprobantefactura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComprobanteFactura = new ComprobanteFacturaDetalleFormJInternalFrame(jDesktopPane,this.comprobantefacturaSessionBean.getConGuardarRelaciones(),this.comprobantefacturaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.setVisible(false);
		this.jInternalFrameDetalleFormComprobanteFactura.setSelected(false);						
		
		this.jInternalFrameDetalleFormComprobanteFactura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComprobanteFactura.comprobantefacturaLogic=this.comprobantefacturaLogic;
		
		this.cargarCombosFrameForeignKeyComprobanteFactura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComprobanteFactura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComprobanteFactura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComprobanteFactura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComprobanteFactura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComprobanteFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobanteFactura"));
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarComprobanteFactura.addActionListener(new ButtonActionListener(this,"ModificarComprobanteFactura"));

		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarToolBarComprobanteFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobanteFactura"));
					
		this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemModificarComprobanteFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobanteFactura"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarComprobanteFactura.addActionListener (new ButtonActionListener(this,"ActualizarComprobanteFactura"));
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarToolBarComprobanteFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobanteFactura"));
						
		this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemActualizarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobanteFactura"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarComprobanteFactura.addActionListener (new ButtonActionListener(this,"EliminarComprobanteFactura"));
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobanteFactura"));
								
		this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemEliminarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobanteFactura"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarComprobanteFactura.addActionListener (new ButtonActionListener(this,"CancelarComprobanteFactura"));
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobanteFactura"));
					
		this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemCancelarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobanteFactura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemDetalleCerrarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobanteFactura"));		
		
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFactura"));
		
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFactura"));
		
		
		
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobanteFactura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonidComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_empresaComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_empresaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_vendedorComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_vendedorComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfecha_inicioComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfecha_finComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_cajaComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_cajaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_clienteComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonnombre_cajaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonsecuencialComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfechaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoncodigo_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonnombre_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonsubtotalComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonivaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtondescuentoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfinanciamientoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfleteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoniceComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtontotalComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_formas_pagoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtondescuento_realComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_realComprobanteFacturaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobanteFactura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComprobanteFactura"));
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComprobanteFactura"));
		}
		
		this.jTableDatosComprobanteFactura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComprobanteFactura"));
		
		this.jTableDatosComprobanteFactura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComprobanteFactura"));
		
		this.jButtonNuevoComprobanteFactura.addActionListener(new ButtonActionListener(this,"NuevoComprobanteFactura"));
		
		this.jButtonDuplicarComprobanteFactura.addActionListener(new ButtonActionListener(this,"DuplicarComprobanteFactura"));
		
		this.jButtonCopiarComprobanteFactura.addActionListener(new ButtonActionListener(this,"CopiarComprobanteFactura"));
		
		this.jButtonVerFormComprobanteFactura.addActionListener(new ButtonActionListener(this,"VerFormComprobanteFactura"));
		
		
		this.jButtonNuevoToolBarComprobanteFactura.addActionListener(new ButtonActionListener(this,"NuevoToolBarComprobanteFactura"));
			
		this.jButtonDuplicarToolBarComprobanteFactura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComprobanteFactura"));
			
		this.jMenuItemNuevoComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComprobanteFactura"));
			
		this.jMenuItemDuplicarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComprobanteFactura"));		
		
		
		this.jButtonNuevoRelacionesComprobanteFactura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComprobanteFactura"));
		
		
		this.jButtonNuevoRelacionesToolBarComprobanteFactura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComprobanteFactura"));
			
		this.jMenuItemNuevoRelacionesComprobanteFactura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComprobanteFactura"));		
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarComprobanteFactura.addActionListener(new ButtonActionListener(this,"ModificarComprobanteFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonModificarToolBarComprobanteFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarComprobanteFactura"));
			
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemModificarComprobanteFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarComprobanteFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarComprobanteFactura.addActionListener (new ButtonActionListener(this,"ActualizarComprobanteFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonActualizarToolBarComprobanteFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComprobanteFactura"));
				
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemActualizarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComprobanteFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarComprobanteFactura.addActionListener (new ButtonActionListener(this,"EliminarComprobanteFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonEliminarToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarComprobanteFactura"));
						
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemEliminarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComprobanteFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarComprobanteFactura.addActionListener (new ButtonActionListener(this,"CancelarComprobanteFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonCancelarToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarComprobanteFactura"));
			
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemCancelarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComprobanteFactura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComprobanteFactura"));		
		
		
		this.jButtonCerrarComprobanteFactura.addActionListener (new ButtonActionListener(this,"CerrarComprobanteFactura"));
		
		
		this.jButtonCerrarToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"CerrarToolBarComprobanteFactura"));
			
		this.jMenuItemCerrarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComprobanteFactura"));
			
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jMenuItemDetalleCerrarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComprobanteFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosComprobanteFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosComprobanteFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComprobanteFactura"));
		}
		
		this.jButtonCopiarToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"CopiarToolBarComprobanteFactura"));
			
		this.jButtonVerFormToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"VerFormToolBarComprobanteFactura"));
		
		this.jMenuItemGuardarCambiosComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComprobanteFactura"));
			
		this.jMenuItemCopiarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComprobanteFactura"));		
		
		this.jMenuItemVerFormComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComprobanteFactura"));		
		
		
		this.jButtonGuardarCambiosTablaComprobanteFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobanteFactura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComprobanteFactura"));
			
		this.jMenuItemGuardarCambiosTablaComprobanteFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComprobanteFactura"));		
		
		
		
		this.jButtonRecargarInformacionComprobanteFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionComprobanteFactura"));
					
		this.jButtonRecargarInformacionToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComprobanteFactura"));
		
		this.jMenuItemRecargarInformacionComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComprobanteFactura"));		
		
		
		
		this.jButtonAnterioresComprobanteFactura.addActionListener (new ButtonActionListener(this,"AnterioresComprobanteFactura"));
		
		
		this.jButtonAnterioresToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComprobanteFactura"));
		
		this.jMenuItemAnterioresComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComprobanteFactura"));		
		
		
		this.jButtonSiguientesComprobanteFactura.addActionListener (new ButtonActionListener(this,"SiguientesComprobanteFactura"));
		
		
		this.jButtonSiguientesToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComprobanteFactura"));
			
		this.jMenuItemSiguientesComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComprobanteFactura"));
			
		this.jMenuItemAbrirOrderByComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComprobanteFactura"));
			
		this.jMenuItemMostrarOcultarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComprobanteFactura"));
			
		this.jMenuItemDetalleAbrirOrderByComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComprobanteFactura"));
			
		this.jMenuItemDetalleMostarOcultarComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComprobanteFactura"));		
		
		
		this.jButtonNuevoGuardarCambiosComprobanteFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComprobanteFactura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComprobanteFactura"));
			
		this.jMenuItemNuevoGuardarCambiosComprobanteFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComprobanteFactura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComprobanteFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComprobanteFactura"));

		this.jCheckBoxSeleccionadosComprobanteFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComprobanteFactura"));
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComprobanteFactura"));
		}
		
		
		this.jComboBoxTiposRelacionesComprobanteFactura.addActionListener (new ButtonActionListener(this,"TiposRelacionesComprobanteFactura"));
			
		this.jComboBoxTiposAccionesComprobanteFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesComprobanteFactura"));
					
		this.jComboBoxTiposSeleccionarComprobanteFactura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComprobanteFactura"));
			
		this.jTextFieldValorCampoGeneralComprobanteFactura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComprobanteFactura"));		
		
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonidComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_empresaComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_empresaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_vendedorComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_vendedorComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfecha_inicioComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfecha_finComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_cajaComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_cajaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_clienteComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonnombre_cajaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonsecuencialComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfechaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoncodigo_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonnombre_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonsubtotalComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonivaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtondescuentoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfinanciamientoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfleteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoniceComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtontotalComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_formas_pagoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtondescuento_realComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_realComprobanteFacturaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaComprobanteFacturaComprobanteFactura.addActionListener(new ButtonActionListener(this,"BusquedaComprobanteFacturaComprobanteFactura"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComprobanteFactura!=null) {
				this.jInternalFrameReporteDinamicoComprobanteFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFactura"));
				this.jInternalFrameReporteDinamicoComprobanteFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFactura"));
				this.jInternalFrameReporteDinamicoComprobanteFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFactura"));
			}
			
			//this.jButtonCerrarReporteDinamicoComprobanteFactura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComprobanteFactura"));				
			//this.jButtonGenerarReporteDinamicoComprobanteFactura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComprobanteFactura"));
			//this.jButtonGenerarExcelReporteDinamicoComprobanteFactura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComprobanteFactura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComprobanteFactura!=null) {
				this.jInternalFrameImportacionComprobanteFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComprobanteFactura"));
				this.jInternalFrameImportacionComprobanteFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComprobanteFactura"));
				this.jInternalFrameImportacionComprobanteFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComprobanteFactura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComprobanteFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByComprobanteFactura"));
			
			this.jButtonAbrirOrderByToolBarComprobanteFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComprobanteFactura"));			
			
			if(this.jInternalFrameOrderByComprobanteFactura!=null) {
				this.jInternalFrameOrderByComprobanteFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComprobanteFactura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComprobanteFactura.jTabbedPaneRelacionesComprobanteFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComprobanteFactura"));
		
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
            		closingInternalFrameComprobanteFactura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComprobanteFactura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComprobanteFactura = (JInternalFrameBase)event.getSource();
	            	
	            ComprobanteFacturaBeanSwingJInternalFrame jInternalFrameParent=(ComprobanteFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormComprobanteFactura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComprobanteFacturaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComprobanteFactura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComprobanteFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComprobanteFactura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComprobanteFactura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComprobanteFactura";
		inputMap = this.jButtonNuevoComprobanteFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComprobanteFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobanteFacturaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComprobanteFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComprobanteFactura";
		inputMap = this.jButtonNuevoRelacionesComprobanteFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComprobanteFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComprobanteFacturaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComprobanteFactura";
		inputMap = this.jButtonModificarComprobanteFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComprobanteFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComprobanteFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComprobanteFactura";
		inputMap = this.jButtonActualizarComprobanteFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComprobanteFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComprobanteFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComprobanteFactura";
		inputMap = this.jButtonEliminarComprobanteFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComprobanteFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComprobanteFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComprobanteFactura";
		inputMap = this.jButtonCancelarComprobanteFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComprobanteFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComprobanteFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComprobanteFactura";
		inputMap = this.jButtonCerrarComprobanteFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComprobanteFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComprobanteFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComprobanteFactura";
		inputMap = this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosComprobanteFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonGuardarCambiosComprobanteFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComprobanteFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComprobanteFactura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComprobanteFacturaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComprobanteFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComprobanteFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComprobanteFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComprobanteFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComprobanteFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComprobanteFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonidComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_empresaComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_empresaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_vendedorComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_vendedorComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfecha_inicioComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_inicioComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfecha_finComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_finComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_cajaComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_cajaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_cajaComprobanteFacturaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_clienteComprobanteFacturaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonid_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonnombre_cajaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_cajaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonsecuencialComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"secuencialComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfechaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fechaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoncodigo_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigo_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonnombre_clienteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonsubtotalComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"subtotalComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonivaComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"ivaComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtondescuentoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"descuentoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfinanciamientoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"financiamientoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtonfleteComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"fleteComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoniceComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"iceComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtontotalComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"totalComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtoncantidad_formas_pagoComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"cantidad_formas_pagoComprobanteFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComprobanteFactura.jButtondescuento_realComprobanteFacturaBusqueda.addActionListener(new ButtonActionListener(this,"descuento_realComprobanteFacturaBusqueda"));
		
		
		this.jButtonBusquedaComprobanteFacturaComprobanteFactura.addActionListener(new ButtonActionListener(this,"BusquedaComprobanteFacturaComprobanteFactura"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComprobanteFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComprobanteFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComprobanteFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComprobanteFactura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComprobanteFactura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
					comprobantefacturaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFactura comprobantefacturaAux:comprobantefacturas) {
					comprobantefacturaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComprobanteFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobanteFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
						comprobantefacturaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFactura comprobantefacturaAux:comprobantefacturas) {
						comprobantefacturaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFactura comprobantefacturaAux:comprobantefacturas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobanteFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobanteFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComprobanteFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComprobanteFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComprobanteFactura.getSelectedRows();
			
			ComprobanteFactura comprobantefacturaLocal=new ComprobanteFactura();
			
			//this.seleccionarTodosComprobanteFactura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comprobantefacturaLocal =(ComprobanteFactura) this.comprobantefacturaLogic.getComprobanteFacturas().toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comprobantefacturaLocal =(ComprobanteFactura) this.comprobantefacturas.toArray()[this.jTableDatosComprobanteFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comprobantefacturaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
						comprobantefacturaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComprobanteFactura comprobantefacturaAux:comprobantefacturas) {
						comprobantefacturaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFactura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComprobanteFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComprobanteFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComprobanteFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComprobanteFacturaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComprobanteFacturaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComprobanteFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComprobanteFactura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComprobanteFactura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturaLogic.getComprobanteFacturas()) {
				
						if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							comprobantefacturaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							comprobantefacturaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							comprobantefacturaAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							comprobantefacturaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							comprobantefacturaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							comprobantefacturaAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comprobantefacturaAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							comprobantefacturaAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							comprobantefacturaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							comprobantefacturaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							comprobantefacturaAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							comprobantefacturaAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							comprobantefacturaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							comprobantefacturaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO)) {
							existe=true;
							comprobantefacturaAux.setcantidad_formas_pago(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL)) {
							existe=true;
							comprobantefacturaAux.setdescuento_real(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFactura comprobantefacturaAux:comprobantefacturas) {
					
						if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO)) {
							existe=true;
							comprobantefacturaAux.setfecha_inicio(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN)) {
							existe=true;
							comprobantefacturaAux.setfecha_fin(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA)) {
							existe=true;
							comprobantefacturaAux.setnombre_caja(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL)) {
							existe=true;
							comprobantefacturaAux.setsecuencial(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							comprobantefacturaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
							existe=true;
							comprobantefacturaAux.setcodigo_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comprobantefacturaAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL)) {
							existe=true;
							comprobantefacturaAux.setsubtotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_IVA)) {
							existe=true;
							comprobantefacturaAux.setiva(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO)) {
							existe=true;
							comprobantefacturaAux.setdescuento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO)) {
							existe=true;
							comprobantefacturaAux.setfinanciamiento(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FLETE)) {
							existe=true;
							comprobantefacturaAux.setflete(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_ICE)) {
							existe=true;
							comprobantefacturaAux.setice(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_TOTAL)) {
							existe=true;
							comprobantefacturaAux.settotal(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO)) {
							existe=true;
							comprobantefacturaAux.setcantidad_formas_pago(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL)) {
							existe=true;
							comprobantefacturaAux.setdescuento_real(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComprobanteFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComprobanteFacturaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComprobanteFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComprobanteFactura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComprobanteFactura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComprobanteFactura) {				
					conSplash=true;//false;										
					
					//this.startProcessComprobanteFactura(conSplash);
				
					this.generarReporteComprobanteFacturasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComprobanteFacturasSeleccionados();
				//this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobanteFacturasSeleccionados(false);
				//this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComprobanteFacturasSeleccionados(true);
				//this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobanteFactura();
				
				this.exportarComprobanteFacturasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComprobanteFacturas();
				//this.importarComprobanteFacturas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComprobanteFactura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComprobanteFacturasSeleccionados();
				//this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comprobante Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComprobanteFactura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComprobanteFactura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComprobanteFactura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.setSelectedIndex(0);					
				}	
			} 			
			else if(ComprobanteFacturaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComprobanteFactura) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComprobanteFactura(conSplash);
					
						//this.actualizarParametrosGeneralComprobanteFactura();
						
						this.generarReporteProcesoAccionComprobanteFacturasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComprobanteFacturaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comprobante FacturaS SELECCIONADOS?", "MANTENIMIENTO DE Comprobante Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComprobanteFactura();
				
						this.actualizarParametrosGeneralComprobanteFactura();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comprobantefacturaReturnGeneral=comprobantefacturaLogic.procesarAccionComprobanteFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comprobantefacturaLogic.getComprobanteFacturas(),this.comprobantefacturaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComprobanteFacturaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComprobanteFactura();
					
					ComprobanteFacturaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComprobanteFacturaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComprobanteFactura.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxTiposAccionesFormularioComprobanteFactura.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComprobanteFactura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComprobanteFacturaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComprobanteFactura();
			
			if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		
			ComprobanteFactura comprobantefactura=new ComprobanteFactura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComprobanteFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComprobanteFactura.getSelectedItem();
			
			
			
			
			comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
			//this.sTipoAccion;
			
			if(comprobantefacturasSeleccionados.size()==1) {
				for(ComprobanteFactura comprobantefacturaAux:comprobantefacturasSeleccionados) {
					comprobantefactura=comprobantefacturaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComprobanteFactura();
			
      		//this.finishProcessComprobanteFactura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComprobanteFacturaReturnGeneral() throws Exception {
		if(this.comprobantefacturaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comprobantefacturaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comprobantefacturaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comprobantefacturaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comprobantefacturaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comprobantefacturaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComprobanteFactura(false);
		}
		
		if(this.comprobantefacturaReturnGeneral.getConRetornoLista() || this.comprobantefacturaReturnGeneral.getConRetornoObjeto()) {
			if(this.comprobantefacturaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comprobantefacturaLogic.setComprobanteFacturas(this.comprobantefacturaReturnGeneral.getComprobanteFacturas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingComprobanteFactura(false);
		}
	}
	
	public void actualizarParametrosGeneralComprobanteFactura() throws Exception {
		
		
	}
	
	public ArrayList<ComprobanteFactura> getComprobanteFacturasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComprobanteFactura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComprobanteFactura comprobantefacturaAux:comprobantefacturaLogic.getComprobanteFacturas()) {
					if(comprobantefacturaAux.getIsSelected()) {
						comprobantefacturasSeleccionados.add(comprobantefacturaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComprobanteFactura comprobantefacturaAux:this.comprobantefacturas) {
					if(comprobantefacturaAux.getIsSelected()) {
						comprobantefacturasSeleccionados.add(comprobantefacturaAux);				
					}
				}
			}
			
			if(comprobantefacturasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comprobantefacturasSeleccionados.addAll(this.comprobantefacturaLogic.getComprobanteFacturas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comprobantefacturasSeleccionados.addAll(this.comprobantefacturas);				
					}
				}
			}
		} else {
			comprobantefacturasSeleccionados.add(this.comprobantefactura);
		}
		
		return comprobantefacturasSeleccionados;
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
	
	public void generarReporteComprobanteFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComprobanteFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComprobanteFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobanteFacturasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComprobanteFacturasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comprobante Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComprobanteFacturasSeleccionados() throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComprobanteFacturas("Todos",comprobantefacturasSeleccionados);
		
	}	
	
	public void generarReporteNormalComprobanteFacturasSeleccionados() throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComprobanteFacturas("Todos",comprobantefacturasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComprobanteFacturasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComprobanteFacturas("Todos",comprobantefacturasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComprobanteFacturasSeleccionados() throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComprobanteFactura();
		
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComprobanteFactura();
		
		
		//this.generarReporteComprobanteFacturas("Todos",comprobantefacturasSeleccionados ,comprobantefacturaImplementable,comprobantefacturaImplementableHome);
	}
	
	public void mostrarImportacionComprobanteFacturas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComprobanteFactura();
		
		this.abrirFrameImportacionComprobanteFactura();		
		
			
		//this.generarReporteComprobanteFacturas("Todos",comprobantefacturasSeleccionados ,comprobantefacturaImplementable,comprobantefacturaImplementableHome);
	}
	
	public void importarComprobanteFacturas() throws Exception {		
	
	}
	
	public void exportarComprobanteFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComprobanteFacturasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComprobanteFacturasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComprobanteFacturasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comprobante Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComprobanteFacturasSeleccionados() throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefactura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComprobanteFactura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComprobanteFactura comprobantefacturaAux:comprobantefacturasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComprobanteFactura(comprobantefacturaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comprobantefacturaAux.setsDetalleGeneralEntityReporte(comprobantefacturaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComprobanteFactura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_IVA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_FLETE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_ICE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_TOTAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComprobanteFactura(ComprobanteFactura comprobantefactura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comprobantefactura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getfecha_inicio().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getfecha_fin().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getcaja_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getnombre_caja();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getsecuencial();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getcodigo_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getsubtotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getiva().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getdescuento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getfinanciamiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getflete().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getice().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.gettotal().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getcantidad_formas_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comprobantefactura.getdescuento_real().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComprobanteFacturasSeleccionados() throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefactura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComprobanteFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComprobanteFactura(row);				
				iRow++;
			}				
			
			for(ComprobanteFactura comprobantefacturaAux:comprobantefacturasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComprobanteFactura(comprobantefacturaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComprobanteFacturasSeleccionados() throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();		
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comprobantefactura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comprobantefacturas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comprobantefactura");
			//elementRoot.appendChild(element);
		
			for(ComprobanteFactura comprobantefacturaAux:comprobantefacturasSeleccionados) {
				element = document.createElement("comprobantefactura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComprobanteFactura(comprobantefacturaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comprobante Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComprobanteFactura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_SUBTOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_IVA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FINANCIAMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_FLETE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_ICE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_TOTAL);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComprobanteFacturaConstantesFunciones.LABEL_DESCUENTOREAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComprobanteFactura(ComprobanteFactura comprobantefactura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getfecha_inicio());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getfecha_fin());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getcaja_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getnombre_caja());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getsecuencial());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getcodigo_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getsubtotal());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getiva());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getdescuento());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getfinanciamiento());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getflete());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getice());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.gettotal());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getcantidad_formas_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(comprobantefactura.getdescuento_real());				
	}
	
	public void setFilaDatosExportarXmlComprobanteFactura(ComprobanteFactura comprobantefactura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComprobanteFacturaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comprobantefactura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComprobanteFacturaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comprobantefactura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComprobanteFacturaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comprobantefactura.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementvendedor_descripcion = document.createElement(ComprobanteFacturaConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(comprobantefactura.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementfecha_inicio = document.createElement(ComprobanteFacturaConstantesFunciones.FECHAINICIO);
		elementfecha_inicio.appendChild(document.createTextNode(comprobantefactura.getfecha_inicio().toString().trim()));
		element.appendChild(elementfecha_inicio);

		Element elementfecha_fin = document.createElement(ComprobanteFacturaConstantesFunciones.FECHAFIN);
		elementfecha_fin.appendChild(document.createTextNode(comprobantefactura.getfecha_fin().toString().trim()));
		element.appendChild(elementfecha_fin);

		Element elementcaja_descripcion = document.createElement(ComprobanteFacturaConstantesFunciones.IDCAJA);
		elementcaja_descripcion.appendChild(document.createTextNode(comprobantefactura.getcaja_descripcion()));
		element.appendChild(elementcaja_descripcion);

		Element elementcliente_descripcion = document.createElement(ComprobanteFacturaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(comprobantefactura.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementnombre_caja = document.createElement(ComprobanteFacturaConstantesFunciones.NOMBRECAJA);
		elementnombre_caja.appendChild(document.createTextNode(comprobantefactura.getnombre_caja().trim()));
		element.appendChild(elementnombre_caja);

		Element elementsecuencial = document.createElement(ComprobanteFacturaConstantesFunciones.SECUENCIAL);
		elementsecuencial.appendChild(document.createTextNode(comprobantefactura.getsecuencial().trim()));
		element.appendChild(elementsecuencial);

		Element elementfecha = document.createElement(ComprobanteFacturaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(comprobantefactura.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementcodigo_cliente = document.createElement(ComprobanteFacturaConstantesFunciones.CODIGOCLIENTE);
		elementcodigo_cliente.appendChild(document.createTextNode(comprobantefactura.getcodigo_cliente().trim()));
		element.appendChild(elementcodigo_cliente);

		Element elementnombre_cliente = document.createElement(ComprobanteFacturaConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(comprobantefactura.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementsubtotal = document.createElement(ComprobanteFacturaConstantesFunciones.SUBTOTAL);
		elementsubtotal.appendChild(document.createTextNode(comprobantefactura.getsubtotal().toString().trim()));
		element.appendChild(elementsubtotal);

		Element elementiva = document.createElement(ComprobanteFacturaConstantesFunciones.IVA);
		elementiva.appendChild(document.createTextNode(comprobantefactura.getiva().toString().trim()));
		element.appendChild(elementiva);

		Element elementdescuento = document.createElement(ComprobanteFacturaConstantesFunciones.DESCUENTO);
		elementdescuento.appendChild(document.createTextNode(comprobantefactura.getdescuento().toString().trim()));
		element.appendChild(elementdescuento);

		Element elementfinanciamiento = document.createElement(ComprobanteFacturaConstantesFunciones.FINANCIAMIENTO);
		elementfinanciamiento.appendChild(document.createTextNode(comprobantefactura.getfinanciamiento().toString().trim()));
		element.appendChild(elementfinanciamiento);

		Element elementflete = document.createElement(ComprobanteFacturaConstantesFunciones.FLETE);
		elementflete.appendChild(document.createTextNode(comprobantefactura.getflete().toString().trim()));
		element.appendChild(elementflete);

		Element elementice = document.createElement(ComprobanteFacturaConstantesFunciones.ICE);
		elementice.appendChild(document.createTextNode(comprobantefactura.getice().toString().trim()));
		element.appendChild(elementice);

		Element elementtotal = document.createElement(ComprobanteFacturaConstantesFunciones.TOTAL);
		elementtotal.appendChild(document.createTextNode(comprobantefactura.gettotal().toString().trim()));
		element.appendChild(elementtotal);

		Element elementcantidad_formas_pago = document.createElement(ComprobanteFacturaConstantesFunciones.CANTIDADFORMASPAGO);
		elementcantidad_formas_pago.appendChild(document.createTextNode(comprobantefactura.getcantidad_formas_pago().toString().trim()));
		element.appendChild(elementcantidad_formas_pago);

		Element elementdescuento_real = document.createElement(ComprobanteFacturaConstantesFunciones.DESCUENTOREAL);
		elementdescuento_real.appendChild(document.createTextNode(comprobantefactura.getdescuento_real().toString().trim()));
		element.appendChild(elementdescuento_real);
	}
	
	public void generarReporteGroupGenericoComprobanteFacturasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados=new ArrayList<ComprobanteFactura>();
		
		comprobantefacturasSeleccionados=this.getComprobanteFacturasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComprobanteFactura(comprobantefacturasSeleccionados);
		
		this.generarReporteComprobanteFacturas("Todos",comprobantefacturasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComprobanteFactura(ArrayList<ComprobanteFactura> comprobantefacturasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComprobanteFactura comprobantefacturaAux:comprobantefacturasSeleccionados) {
				comprobantefacturaAux.setsDetalleGeneralEntityReporte(comprobantefacturaAux.toString());
			
				if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHAINICIO)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantefacturaAux.getfecha_inicio()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHAFIN)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantefacturaAux.getfecha_fin()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_IDCAJA)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getcaja_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECAJA)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getnombre_caja());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_SECUENCIAL)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getsecuencial());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comprobantefacturaAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_CODIGOCLIENTE)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getcodigo_cliente());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(ComprobanteFacturaConstantesFunciones.LABEL_CANTIDADFORMASPAGO)) {
					existe=true;
					comprobantefacturaAux.setsDescripcionGeneralEntityReporte1(comprobantefacturaAux.getcantidad_formas_pago().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComprobanteFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComprobanteFactura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComprobanteFactura=true;
				this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=true;
				this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=true;
			}
			
			this.isVisibilidadCeldaModificarComprobanteFactura=false;
			this.isVisibilidadCeldaActualizarComprobanteFactura=false;
			this.isVisibilidadCeldaEliminarComprobanteFactura=false;
			this.isVisibilidadCeldaCancelarComprobanteFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComprobanteFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;
			this.isVisibilidadCeldaModificarComprobanteFactura=false;
			this.isVisibilidadCeldaActualizarComprobanteFactura=true;
			this.isVisibilidadCeldaEliminarComprobanteFactura=false;
			this.isVisibilidadCeldaCancelarComprobanteFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComprobanteFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;
			this.isVisibilidadCeldaModificarComprobanteFactura=false;
			this.isVisibilidadCeldaActualizarComprobanteFactura=true;
			this.isVisibilidadCeldaEliminarComprobanteFactura=true;
			this.isVisibilidadCeldaCancelarComprobanteFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComprobanteFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;
			this.isVisibilidadCeldaModificarComprobanteFactura=false;
			this.isVisibilidadCeldaActualizarComprobanteFactura=true;
			this.isVisibilidadCeldaEliminarComprobanteFactura=false;
			this.isVisibilidadCeldaCancelarComprobanteFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComprobanteFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=true;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=true;
			this.isVisibilidadCeldaModificarComprobanteFactura=false;
			this.isVisibilidadCeldaActualizarComprobanteFactura=false;
			this.isVisibilidadCeldaEliminarComprobanteFactura=false;
			this.isVisibilidadCeldaCancelarComprobanteFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComprobanteFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;
			this.isVisibilidadCeldaActualizarComprobanteFactura=false;
			this.isVisibilidadCeldaEliminarComprobanteFactura=false;
			this.isVisibilidadCeldaCancelarComprobanteFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComprobanteFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;
			this.isVisibilidadCeldaModificarComprobanteFactura=true;
			this.isVisibilidadCeldaActualizarComprobanteFactura=false;
			this.isVisibilidadCeldaEliminarComprobanteFactura=false;
			this.isVisibilidadCeldaCancelarComprobanteFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarComprobanteFactura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComprobanteFacturaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComprobanteFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=true;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=true;
		} else {
			this.actualizarEstadoPanelsComprobanteFactura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComprobanteFactura=false;
			//this.isVisibilidadCeldaVerFormComprobanteFactura=false;
			this.isVisibilidadCeldaDuplicarComprobanteFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comprobantefacturaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
		} else {
			this.isVisibilidadCeldaNuevoComprobanteFactura=false;
			this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			if(!comprobantefacturaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;												
			}
			
			this.jButtonCerrarComprobanteFactura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
		}
		
		if(!this.permiteMantenimiento(this.comprobantefactura)) {
			this.isVisibilidadCeldaActualizarComprobanteFactura=false;
			this.isVisibilidadCeldaEliminarComprobanteFactura=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoComprobanteFactura=false;
		this.isVisibilidadCeldaNuevoRelacionesComprobanteFactura=false;
		this.isVisibilidadCeldaGuardarCambiosComprobanteFactura=false;
		//this.isVisibilidadCeldaModificarComprobanteFactura=true;
		this.isVisibilidadCeldaActualizarComprobanteFactura=false;
		this.isVisibilidadCeldaEliminarComprobanteFactura=false;
		//this.isVisibilidadCeldaCancelarComprobanteFactura=true;			
		this.isVisibilidadCeldaGuardarComprobanteFactura=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComprobanteFactura() {
	}
	
	public void actualizarEstadoPanelsComprobanteFactura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComprobanteFactura!=null) {
				this.jScrollPanelDatosEdicionComprobanteFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFactura!=null) {
				this.jScrollPanelDatosComprobanteFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFactura!=null) {
				this.jPanelPaginacionComprobanteFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComprobanteFactura!=null) {
				this.jScrollPanelDatosEdicionComprobanteFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComprobanteFactura!=null) {
				this.jScrollPanelDatosComprobanteFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFactura!=null) {
				this.jPanelPaginacionComprobanteFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComprobanteFactura!=null) {
				this.jScrollPanelDatosEdicionComprobanteFactura.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFactura!=null) {
				this.jScrollPanelDatosComprobanteFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFactura!=null) {
				this.jPanelPaginacionComprobanteFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComprobanteFactura!=null) {
				this.jScrollPanelDatosEdicionComprobanteFactura.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFactura!=null) {
				this.jScrollPanelDatosComprobanteFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionComprobanteFactura!=null) {
				this.jPanelPaginacionComprobanteFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComprobanteFactura!=null) {
				this.jScrollPanelDatosEdicionComprobanteFactura.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFactura!=null) {
				this.jScrollPanelDatosComprobanteFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFactura!=null) {
				this.jPanelPaginacionComprobanteFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComprobanteFactura!=null) {
				this.jScrollPanelDatosEdicionComprobanteFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFactura!=null) {
				this.jScrollPanelDatosComprobanteFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFactura!=null) {
				this.jPanelPaginacionComprobanteFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComprobanteFactura!=null) {
				this.jScrollPanelDatosEdicionComprobanteFactura.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComprobanteFactura!=null) {
				this.jScrollPanelDatosComprobanteFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionComprobanteFactura!=null) {
				this.jPanelPaginacionComprobanteFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
					this.jTabbedPaneBusquedasComprobanteFactura.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comprobantefacturaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComprobanteFactura!=null) {
				this.jTabbedPaneBusquedasComprobanteFactura.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComprobanteFactura!=null) {
				this.jPanelParametrosReportesComprobanteFactura.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaComprobanteFactura=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaComprobanteFactura) {this.jTabbedPaneBusquedasComprobanteFactura.remove(jPanelBusquedaComprobanteFacturaComprobanteFactura);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadBusquedaComprobanteFactura=isParaVendedor;
			if(!this.isVisibilidadBusquedaComprobanteFactura) {this.jTabbedPaneBusquedasComprobanteFactura.remove(jPanelBusquedaComprobanteFacturaComprobanteFactura);}
		}
		
	}

	public void setVisibilidadBusquedasParaCaja(Boolean isParaCaja){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaCajaNegation=!isParaCaja;

			this.isVisibilidadBusquedaComprobanteFactura=isParaCajaNegation;
			if(!this.isVisibilidadBusquedaComprobanteFactura) {this.jTabbedPaneBusquedasComprobanteFactura.remove(jPanelBusquedaComprobanteFacturaComprobanteFactura);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaComprobanteFactura=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaComprobanteFactura) {this.jTabbedPaneBusquedasComprobanteFactura.remove(jPanelBusquedaComprobanteFacturaComprobanteFactura);}
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
			
			this.inicializarActualizarBindingTablaComprobanteFactura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComprobanteFactura() {
		this.updateBorderResaltarBusquedasFormularioComprobanteFactura();
		this.updateVisibilidadBusquedasFormularioComprobanteFactura();
		this.updateHabilitarBusquedasFormularioComprobanteFactura();
	}
	
	public void updateBorderResaltarBusquedasFormularioComprobanteFactura() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComprobanteFactura.getComponents().length>0) {
	

		if(this.comprobantefacturaConstantesFunciones.resaltarBusquedaComprobanteFacturaComprobanteFactura!=null) {
			index= this.jTabbedPaneBusquedasComprobanteFactura.indexOfComponent(this.jPanelBusquedaComprobanteFacturaComprobanteFactura);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFactura.getComponent(index);
				jPanel.setBorder(this.comprobantefacturaConstantesFunciones.resaltarBusquedaComprobanteFacturaComprobanteFactura);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComprobanteFactura() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComprobanteFactura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobanteFactura.indexOfComponent(this.jPanelBusquedaComprobanteFacturaComprobanteFactura);
			jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFactura.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.comprobantefacturaConstantesFunciones.mostrarBusquedaComprobanteFacturaComprobanteFactura);
			if(!this.comprobantefacturaConstantesFunciones.mostrarBusquedaComprobanteFacturaComprobanteFactura && index>-1) {
				this.jTabbedPaneBusquedasComprobanteFactura.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComprobanteFactura() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComprobanteFactura.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasComprobanteFactura.indexOfComponent(this.jPanelBusquedaComprobanteFacturaComprobanteFactura);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFactura.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.comprobantefacturaConstantesFunciones.activarBusquedaComprobanteFacturaComprobanteFactura);
				this.jTabbedPaneBusquedasComprobanteFactura.setEnabledAt(index,this.comprobantefacturaConstantesFunciones.activarBusquedaComprobanteFacturaComprobanteFactura);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComprobanteFactura(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaComprobanteFactura")) {
			index= this.jTabbedPaneBusquedasComprobanteFactura.indexOfComponent(this.jPanelBusquedaComprobanteFacturaComprobanteFactura);

			this.jTabbedPaneBusquedasComprobanteFactura.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasComprobanteFactura.getComponent(index);

			this.comprobantefacturaConstantesFunciones.setResaltarBusquedaComprobanteFacturaComprobanteFactura(resaltar);

			jPanel.setBorder(this.comprobantefacturaConstantesFunciones.resaltarBusquedaComprobanteFacturaComprobanteFactura);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarComprobanteFactura.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComprobanteFactura() throws Exception {

		if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComprobanteFactura();
		this.updateVisibilidadResaltarControlesFormularioComprobanteFactura();
		this.updateHabilitarResaltarControlesFormularioComprobanteFactura();
		
	}
	
	public void updateBorderResaltarControlesFormularioComprobanteFactura() throws Exception {
		if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comprobantefacturaConstantesFunciones.resaltaridComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltaridComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarid_empresaComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarid_empresaComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarid_vendedorComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarid_vendedorComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarfecha_inicioComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfecha_inicioComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarfecha_inicioComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarfecha_finComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfecha_finComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarfecha_finComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarid_cajaComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarid_cajaComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarid_clienteComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarid_clienteComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarnombre_cajaComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_cajaComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarnombre_cajaComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarsecuencialComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsecuencialComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarsecuencialComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarfechaComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfechaComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarfechaComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarcodigo_clienteComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcodigo_clienteComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarcodigo_clienteComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarnombre_clienteComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_clienteComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarnombre_clienteComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarsubtotalComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsubtotalComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarsubtotalComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarivaComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldivaComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarivaComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltardescuentoComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuentoComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltardescuentoComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarfinanciamientoComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfinanciamientoComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarfinanciamientoComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarfleteComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfleteComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarfleteComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltariceComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldiceComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltariceComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltartotalComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldtotalComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltartotalComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltarcantidad_formas_pagoComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcantidad_formas_pagoComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltarcantidad_formas_pagoComprobanteFactura);}
		if(this.comprobantefacturaConstantesFunciones.resaltardescuento_realComprobanteFactura!=null && this.jInternalFrameDetalleFormComprobanteFactura!=null) {this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuento_realComprobanteFactura.setBorder(this.comprobantefacturaConstantesFunciones.resaltardescuento_realComprobanteFactura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComprobanteFactura() throws Exception {		
		if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
	
		//this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostraridComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelidComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostraridComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarid_empresaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelid_empresaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarid_empresaComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarid_vendedorComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelid_vendedorComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarid_vendedorComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfecha_inicioComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfecha_inicioComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelfecha_inicioComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfecha_inicioComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfecha_finComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfecha_finComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelfecha_finComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfecha_finComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarid_cajaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelid_cajaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarid_cajaComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarid_clienteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelid_clienteComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarid_clienteComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_cajaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarnombre_cajaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelnombre_cajaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarnombre_cajaComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsecuencialComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarsecuencialComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelsecuencialComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarsecuencialComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfechaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfechaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelfechaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfechaComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcodigo_clienteComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarcodigo_clienteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelcodigo_clienteComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarcodigo_clienteComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_clienteComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarnombre_clienteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelnombre_clienteComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarnombre_clienteComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsubtotalComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarsubtotalComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelsubtotalComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarsubtotalComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldivaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarivaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelivaComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarivaComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuentoComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrardescuentoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPaneldescuentoComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrardescuentoComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfinanciamientoComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfinanciamientoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelfinanciamientoComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfinanciamientoComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfleteComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfleteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelfleteComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarfleteComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldiceComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrariceComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPaneliceComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrariceComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldtotalComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrartotalComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPaneltotalComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrartotalComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcantidad_formas_pagoComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarcantidad_formas_pagoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPanelcantidad_formas_pagoComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrarcantidad_formas_pagoComprobanteFactura);
		//this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuento_realComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrardescuento_realComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jPaneldescuento_realComprobanteFactura.setVisible(this.comprobantefacturaConstantesFunciones.mostrardescuento_realComprobanteFactura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComprobanteFactura() throws Exception {
		if(this.jInternalFrameDetalleFormComprobanteFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComprobanteFactura!=null) {
	
		this.jInternalFrameDetalleFormComprobanteFactura.jLabelidComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activaridComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_empresaComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarid_empresaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_vendedorComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarid_vendedorComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfecha_inicioComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarfecha_inicioComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfecha_finComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarfecha_finComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_cajaComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarid_cajaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jComboBoxid_clienteComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarid_clienteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_cajaComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarnombre_cajaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsecuencialComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarsecuencialComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jDateChooserfechaComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarfechaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcodigo_clienteComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarcodigo_clienteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextAreanombre_clienteComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarnombre_clienteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldsubtotalComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarsubtotalComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldivaComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarivaComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuentoComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activardescuentoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfinanciamientoComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarfinanciamientoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldfleteComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarfleteComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldiceComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activariceComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldtotalComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activartotalComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFieldcantidad_formas_pagoComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activarcantidad_formas_pagoComprobanteFactura);
		this.jInternalFrameDetalleFormComprobanteFactura.jTextFielddescuento_realComprobanteFactura.setEnabled(this.comprobantefacturaConstantesFunciones.activardescuento_realComprobanteFactura);
		}
	}
	
		
}